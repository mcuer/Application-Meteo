package com.example.pcmarie.myapplication_meteo;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class Details extends Activity {

    Button btnRetour;
    ImageView image;
    TextView ZoneTexteV;
    TextView ZoneTexteJ;
    ListView list;
    String ville;
    Integer r1;

    private meteoAdapter meteoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);
        btnRetour = (Button) findViewById(R.id.retour);
        ZoneTexteV = (TextView) findViewById(R.id.texteV);
        ZoneTexteJ = (TextView) findViewById(R.id.texteJ);

        Bundle extras = getIntent().getExtras();
        String resultat = "";
        if(extras !=null) {
             r1 = extras.getInt("r1");
                switch (r1){
                    case 0:
                        resultat = "Aujourd'hui";
                        break;
                    case 1:
                        resultat = "Demain";
                        break;
                    case 2:
                        resultat = "Jour + 2";
                        break;
                    case 3:
                        resultat = "Jour + 3";
                        break;
                    case 4:
                        resultat = "Jour + 4";
                        break;
                }
            ville = extras.getString("ediText");
            image = findViewById(R.id.image);
            ZoneTexteV.setText("Vous voulez la météo de la ville de : " + ville);
            ZoneTexteJ.setText(" au jour de : " + resultat);
        }

        btnRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                retour();
            }
        });

        //appel API
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(MeteoService.BASEURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        MeteoService meteoService = retrofit.create(MeteoService.class);
        Call<Meteo> meteo = meteoService.getVille(ville);
        meteo.enqueue(new Callback<Meteo>() {
            @Override
            public void onResponse(Call<Meteo> call, Response<Meteo> response) {
                Meteo myMeteo=response.body();
                if (myMeteo.get_fcstDay0() != null) {
                    FcstDay currentDay = new FcstDay();
                    switch (r1) {
                        case 0:
                            currentDay = myMeteo.get_fcstDay0();
                            break;
                        case 1:
                            currentDay = myMeteo.get_fcstDay1();
                            break;
                        case 2:
                            currentDay = myMeteo.get_fcstDay2();
                            break;
                        case 3:
                            currentDay = myMeteo.get_fcstDay3();
                            break;
                        case 4:
                            currentDay = myMeteo.get_fcstDay4();
                            break;
                    }
                    meteoAdapter = new meteoAdapter(Details.this, currentDay.getHourlyData().getAllHours());
                    list = (ListView) findViewById(R.id.list);
                    //header de la listeView dans details
                    LayoutInflater inflater = getLayoutInflater();
                    ViewGroup header = (ViewGroup) inflater.inflate(R.layout.item_meteo_header, list, false);
                    list.addHeaderView(header);
                    list.setAdapter(meteoAdapter);
                }
                else
                {
                    //Message alerte erreur
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Details.this);
                    alertDialogBuilder.setTitle("Erreur");
                    alertDialogBuilder
                            .setMessage("La ville n'existe pas dans l'API, veuillez en saisir une autre")
                            .setCancelable(false)
                            .setPositiveButton("OK",new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {
                                    retour();
                                }
                            });
                    // create alert dialog
                    AlertDialog alertDialog = alertDialogBuilder.create();
                    // show it
                    alertDialog.show();
                }
            }
            @Override
            public void onFailure(Call<Meteo> call, Throwable t) {
                String TAG  = "onFailure: ";
                Log.e(TAG, t.getMessage());
            }
        });
    }
    private void retour()
    {
        Intent intent = new Intent(Details.this, MainActivity.class);
        Bundle c = new Bundle();
        c.putString("ediText", ville);
        c.putInt("radioButton", r1);
        intent.putExtras(c);
        startActivityForResult(intent,361);
    }
}
