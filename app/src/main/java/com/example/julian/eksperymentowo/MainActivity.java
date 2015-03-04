package com.example.julian.eksperymentowo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // LAYOUT DECLARATION

        final LinearLayout l_i = (LinearLayout) findViewById(R.id.l_i);
        final LinearLayout l_b = (LinearLayout) findViewById(R.id.l_b);
        final LinearLayout l_p = (LinearLayout) findViewById(R.id.l_p);

        //BUTTONS DECLARATION

        // DRY ICE
        final Button b_m_1 = (Button) findViewById(R.id.b_m_1);
        final Button b_i_1 = (Button) findViewById(R.id.b_i_1);
        final Button b_i_2 = (Button) findViewById(R.id.b_i_2);
        final Button b_i_3 = (Button) findViewById(R.id.b_i_3);
        final Button b_i_4 = (Button) findViewById(R.id.b_i_4);
        final Button b_i_5 = (Button) findViewById(R.id.b_i_5);

        // BALLOONS
        final Button b_m_2 = (Button) findViewById(R.id.b_m_2);
        final Button b_b_1 = (Button) findViewById(R.id.b_b_1);
        final Button b_b_2 = (Button) findViewById(R.id.b_b_2);

        // POLYMER
        final Button b_m_3 = (Button) findViewById(R.id.b_m_3);
        final Button b_p_1 = (Button) findViewById(R.id.b_p_1);
        final Button b_p_2 = (Button) findViewById(R.id.b_p_2);

        //BOOLEAN DECLARATION
        final boolean[] visible_b_i = {false};
        final boolean[] visible_b_b = {false};
        final boolean[] visible_b_p = {false};


        b_m_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(visible_b_i[0] == false) {
                    l_i.setVisibility(View.VISIBLE);
                    visible_b_i[0] = true;
                } else {
                    l_i.setVisibility(View.GONE);
                    visible_b_i[0] = false;
                }
            }
        });

        b_i_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: Intent to new activity
            }
        });

        b_i_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: Intent to new activity
            }
        });

        b_i_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: Intent to new activity
            }
        });

        b_i_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: Intent to new activity
            }
        });

        b_i_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: Intent to new activity
            }
        });


        b_m_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(visible_b_b[0] == false) {
                    l_b.setVisibility(View.VISIBLE);
                    visible_b_b[0] = true;
                } else {
                    l_b.setVisibility(View.GONE);
                    visible_b_b[0] = false;
                }
            }
        });

        b_b_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: Intent to new activity
            }
        });

        b_b_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: Intent to new activity
            }
        });

        b_m_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(visible_b_p[0] == false) {
                    l_p.setVisibility(View.VISIBLE);
                    visible_b_p[0] = true;
                } else {
                    l_p.setVisibility(View.GONE);
                    visible_b_p[0] = false;
                }
            }
        });

        b_p_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: Intent to new activity
            }
        });

        b_p_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: Intent to new activity
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
