package com.example.julian.eksperymentowo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

//    private GridView gridView;
//    private GridViewAdapter mAdapter;
//
//    public static int[] mainListName={R.string.dry_ice, R.string.balloons, R.string.polymer, R.string.polymer, R.string.polymer, R.string.polymer, R.string.polymer,
//            R.string.polymer, R.string.polymer, R.string.polymer, R.string.polymer};
//    public static int [] mainListImg={R.drawable.dry_ice_1_img, R.drawable.balloons_img, R.drawable.polymer_img, R.drawable.polymer_img, R.drawable.polymer_img,
//            R.drawable.polymer_img, R.drawable.polymer_img, R.drawable.polymer_img, R.drawable.polymer_img, R.drawable.polymer_img, R.drawable.polymer_img};
//    private Integer[] mHeaderPosition = {1,5};
//    private String[] mHeaderNames = {"suchy lód", "Polimer"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyAdapter adapter = new MyAdapter(this, generateData());

        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);
}

    private ArrayList<Model> generateData() {
        ArrayList<Model> models = new ArrayList<Model>();
        models.add(new Model("Suchy lod"));
        models.add(new Model(R.drawable.dry_ice_1_img,"Banki"));
        models.add(new Model(R.drawable.dry_ice_1_img,"Kalafior"));
        models.add(new Model(R.drawable.dry_ice_1_img,"Pilka"));
        models.add(new Model(R.drawable.dry_ice_1_img,"Kolby"));

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
