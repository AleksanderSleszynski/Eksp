package com.example.julian.eksperymentowo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //BUTTONS DECLARATION

        // DRY ICE
        final Button b_m_1 = (Button) findViewById(R.id.b_m_1);
        final Button b_i_1 = (Button) findViewById(R.id.b_i_1);
        final Button b_i_2 = (Button) findViewById(R.id.b_i_2);
        final Button b_i_3 = (Button) findViewById(R.id.b_i_3);
        final Button b_i_4 = (Button) findViewById(R.id.b_i_4);
        final Button b_i_5 = (Button) findViewById(R.id.b_i_5);

        final boolean[] visible_b_i = {false};

        // BALLOONS
        final Button b_m_2 = (Button) findViewById(R.id.b_m_2);
        final Button b_b_1 = (Button) findViewById(R.id.b_b_1);
        final Button b_b_2 = (Button) findViewById(R.id.b_b_2);

        final boolean[] visible_b_b = {false};

        // POLYMER
        final Button b_m_3 = (Button) findViewById(R.id.b_m_3);
        final Button b_p_1 = (Button) findViewById(R.id.b_p_1);
        final Button b_p_2 = (Button) findViewById(R.id.b_p_2);

        final boolean[] visible_b_p = {false};

        b_m_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(visible_b_i[0] == false) {
                    b_i_1.setVisibility(View.VISIBLE);
                    b_i_2.setVisibility(View.VISIBLE);
                    b_i_3.setVisibility(View.VISIBLE);
                    b_i_4.setVisibility(View.VISIBLE);
                    b_i_5.setVisibility(View.VISIBLE);
                    visible_b_i[0] = true;
                } else {
                    b_i_1.setVisibility(View.GONE);
                    b_i_2.setVisibility(View.GONE);
                    b_i_3.setVisibility(View.GONE);
                    b_i_4.setVisibility(View.GONE);
                    b_i_5.setVisibility(View.GONE);
                    visible_b_i[0] = false;
                }
            }
        });

        b_i_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        b_i_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        b_i_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        b_i_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        b_i_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        b_m_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(visible_b_b[0] == false) {
                    b_b_1.setVisibility(View.VISIBLE);
                    b_b_2.setVisibility(View.VISIBLE);
                    visible_b_b[0] = true;
                } else {
                    b_b_1.setVisibility(View.GONE);
                    b_b_2.setVisibility(View.GONE);
                    visible_b_b[0] = false;
                }
            }
        });

        b_b_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        b_b_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        b_m_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(visible_b_p[0] == false) {
                    b_p_1.setVisibility(View.VISIBLE);
                    b_p_2.setVisibility(View.VISIBLE);
                    visible_b_p[0] = true;
                } else {
                    b_p_1.setVisibility(View.GONE);
                    b_p_2.setVisibility(View.GONE);
                    visible_b_p[0] = false;
                }
            }
        });

        b_p_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        b_p_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
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
