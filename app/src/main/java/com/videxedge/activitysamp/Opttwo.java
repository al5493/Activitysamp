package com.videxedge.activitysamp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Opttwo extends AppCompatActivity {

    TextView tV;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opttwo);

        tV = (TextView) findViewById(R.id.tV);

        Intent gi = getIntent();
        count = gi.getIntExtra("count2",0);

        tV.setText("This is the "+count+" activity pass");
    }

    public void back2(View view) {
        Toast.makeText(this, "Return after "+count+" activities passes.", Toast.LENGTH_LONG).show();
        finish();
    }
}
