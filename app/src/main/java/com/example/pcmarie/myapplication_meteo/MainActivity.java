package com.example.pcmarie.myapplication_meteo;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    Button btn;
    RadioGroup radioGroupe;
    EditText texte;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroupe = (RadioGroup)findViewById(R.id.radioGroupe);
        btn = (Button)findViewById(R.id.btn);
        texte = (EditText)findViewById(R.id.ville);
        image = (ImageView)findViewById(R.id.imageView);

        Picasso.with(getApplicationContext())
                .load("http://www.weatherwhiskers.com/img/animated_cat_960_dot1-3.gif")
                .fit()
                .into(image);

        Bundle extrasc = getIntent().getExtras();
        if (extrasc != null) {
            texte.setText(extrasc.getString("ediText"));
            ((RadioButton)radioGroupe.getChildAt(extrasc.getInt("radioButton"))).setChecked(true);

        }

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioButtonID = radioGroupe.getCheckedRadioButtonId();
                View radioButton = radioGroupe.findViewById(radioButtonID);
                int r1 = radioGroupe.indexOfChild(radioButton);
                String ediText = texte.getText().toString();
                if (!ediText.equals("")) {
                    Intent intent = new Intent(MainActivity.this, Details.class);
                    Bundle b = new Bundle();
                    b.putInt("r1", r1);
                    b.putString("ediText", ediText);
                    intent.putExtras(b);
                    startActivity(intent);
                }
            }
        });
    }

}
