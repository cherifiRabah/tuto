package com.example.hp.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView a =(TextView) findViewById(R.id.textView);


        Bundle b =getIntent().getExtras();
        String user=b.getString("username");
        String passe=b.getString("motdepasse");
        a.setText("user:"+user+",      passe:"+passe);

    }
}
