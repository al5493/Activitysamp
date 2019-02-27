package com.videxedge.activitysamp;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tV1;
    int count2, count3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tV1 = (TextView) findViewById(R.id.tV1);
    }

    public void opt1(View view) {
        Intent si = new Intent(this, Optone.class);
        startActivity(si);
    }

    public void opt2(View view) {
        count2++;
        Intent si = new Intent(this, Opttwo.class);
        si.putExtra("count2", count2);
        startActivity(si);
    }

    public void addcount(View view) {
        count3++;
        tV1.setText("There were "+count3+" presses");
    }

    public void opt3(View view) {
        Intent si = new Intent(this, Optthree.class);
        si.putExtra("count3", count3);
        startActivityForResult(si,1);
    }

    @Override
    protected void onActivityResult(int source, int good, @Nullable Intent data_back) {
        if (data_back != null) {
            count3 = data_back.getIntExtra("count",0);
            tV1.setText("There were "+count3+ " presses");
        }
    }
}
