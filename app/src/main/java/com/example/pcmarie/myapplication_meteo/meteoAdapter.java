package com.example.pcmarie.myapplication_meteo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.LinkedList;

public class meteoAdapter extends ArrayAdapter<Hours> {
    private int LAYOUT_RESOURCE_ID = R.layout.item_meteo;
    private LinkedList<Hours> hoursList;

    public meteoAdapter(Context context, LinkedList<Hours> hoursList) {
        super(context,0,hoursList );
        this.hoursList = hoursList;
    }
    public View getView(int position, View convertView , ViewGroup parent)
    {
        if ( convertView == null){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(LAYOUT_RESOURCE_ID,null);
        }

        TextView tv1 = (TextView) convertView.findViewById(R.id.tv1);
        TextView tv2 = (TextView) convertView.findViewById(R.id.tv2);
        TextView tv3 = (TextView) convertView.findViewById(R.id.tv3);
        ImageView image = (ImageView) convertView.findViewById(R.id.image);

        final Hours currentItem = hoursList.get(position);

        tv1.setText((String.valueOf(position).concat("H00")));
        tv2.setText(currentItem.getCONDITION());
        tv3.setText(currentItem.getTMP2m());
        Picasso.with(getContext())
                .load(currentItem.getICON())
                .fit()
                .into(image);
        return convertView;
    }
}
