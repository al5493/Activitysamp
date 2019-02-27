package com.videxedge.activitysamp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Optthree extends AppCompatActivity {

    TextView tV3;
    int count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optthree);

        tV3 = (TextView) findViewById(R.id.tV3);

        Intent gi3 = getIntent();
        count = gi3.getIntExtra("count3",0);

        tV3.setText("There were "+count+" presses");

    }

    public void addcount(View view) {
        count++;
        tV3.setText("There were "+count+" presses");
    }

    public void back3(View view) {
        Intent gi3 = getIntent();
        gi3.putExtra("count",count);
        setResult(RESULT_OK,gi3);
        finish();
    }
}
