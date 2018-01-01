package com.example.hp.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getAge(View view) {
        EditText Age=(EditText) findViewById(R.id.age);
        int date =Integer.parseInt(Age.getText().toString());
        int age=2018-date;
        Toast.makeText(this,"age:"+String.valueOf(age),Toast.LENGTH_LONG).show();
    }
}
