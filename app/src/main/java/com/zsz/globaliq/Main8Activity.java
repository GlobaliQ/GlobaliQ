package com.zsz.globaliq;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button b = (Button) findViewById(R.id.a);
        OnClickListener l = new OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.rainforesttrust.org/get-involved/?gclid=CjwKCAjw9L_tBRBXEiwAOWVVCeeV_U5BjsEIaVFG6o2AYk3chaUN7DM0Qv__uOaBR6yz0vVVTF0fARoCEDcQAvD_BwE");
                Intent i = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);
            }
        };
        b.setOnClickListener(l);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


}