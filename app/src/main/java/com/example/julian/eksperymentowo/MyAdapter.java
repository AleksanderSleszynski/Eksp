package com.example.julian.eksperymentowo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by julian on 19.03.15.
 */
public class MyAdapter extends ArrayAdapter<Model> {

    private final Context context;
    private final ArrayList<Model> modelsArrayList;

    public MyAdapter(Context context, ArrayList<Model> modelsArrayList) {

        super(context, R.layout.target_item, modelsArrayList);

        this.context = context;
        this.modelsArrayList = modelsArrayList;
    }

    @Override
    public View getView(int postion, View convertView, ViewGroup parent){

        //Create Inflater TODO: Co to jest ?
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // Get rowView from inflater TODO: Co to jest rowView ?
        View rowView = null;
        if(!modelsArrayList.get(postion).isGroupHeader()){
            rowView = inflater.inflate(R.layout.target_item, parent, false);

            //Get icon, title view form the rowView
            ImageView imgView = (ImageView) rowView.findViewById(R.id.item_icon);
            TextView titleView = (TextView) rowView.findViewById(R.id.item_title);

            //Set the text for textView
            imgView.setImageResource(modelsArrayList.get(postion).getIcon());
            titleView.setText(modelsArrayList.get(postion).getTitle());
        } else {

            rowView = inflater.inflate(R.layout.group_header_item, parent, false);
            TextView titleView = (TextView) rowView.findViewById(R.id.header);
            titleView.setText(modelsArrayList.get(postion).getTitle());
        }

        return rowView;
    }
}
