package com.julien.openpaceandroidstudiotest;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.math.BigInteger;

import com.julien.openpaceandroidstudiotest.models.eacJNI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickFAB(view);
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


    public void onClickFAB(View view) {
        final byte[] EF_CARDACCESS = new BigInteger("318182300D060804007F00070202020201023012060A04007F000702020302020201020201413012060A04007F0007020204020202010202010D301C060904007F000702020302300C060704007F0007010202010D020141302B060804007F0007020206161F655041202D2042447220476D6248202D20546573746B617274652076322E3004491715411928800A01B421FA07000000000000000000000000000000000000201010291010", 16).toByteArray();
        final byte[] PIN = "123456".getBytes();

        eacJNI.EAC_init();
    }

}
