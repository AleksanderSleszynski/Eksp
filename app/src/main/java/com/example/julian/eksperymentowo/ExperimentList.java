package com.example.julian.eksperymentowo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;


public class ExperimentList extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experiment_list);

        final ListView listView = (ListView)findViewById(R.id.list_view_experiment_list);
        String[] values = new String[] { "Kolby",
                "Zlewki",
                "Gorąca woda",
                "Suchy Lód",
                "Barwniki"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.experiment_list_item,R.id.experiment_list_item, values);
        listView.setAdapter(adapter);

        Button b1 = (Button) findViewById(R.id.button_experiment_list_done);
        Button b2 = (Button) findViewById(R.id.button_experiment_list_lead);

        final Intent i = new Intent(this, Experiment.class);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_dry_ice_1, menu);
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
