package com.example.julian.eksperymentowo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyAdapter adapter = new MyAdapter(this, generateData());

        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);

        final Intent i = new Intent(this, ExperimentList.class);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                // Start your Activity according to the item just clicked.
                startActivity(i);
            }
        });

}

    private ArrayList<Model> generateData() {
        ArrayList<Model> models = new ArrayList<Model>();
        models.add(new Model("Suchy lod"));
        models.add(new Model(R.drawable.dry_ice_kolby_i_zlewki_img,"Kolby i Zlewki"));
        models.add(new Model(R.drawable.dry_ice_czarodziejska_kula_img,"Czarodziejka kula"));
        models.add(new Model(R.drawable.dry_ice_generator_piany_img,"Generator Piany"));


        models.add(new Model("Balony"));
        models.add(new Model(R.drawable.balloons_img,"Szaszlyk"));
        models.add(new Model(R.drawable.balloons_img,"Ogien"));

        models.add(new Model("Polimer"));
        models.add(new Model(R.drawable.polymer_img,"Sztuczny snieg"));
        models.add(new Model(R.drawable.polymer_img,"Pampers"));

        return models;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
