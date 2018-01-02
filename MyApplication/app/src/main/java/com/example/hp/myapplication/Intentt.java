package com.example.hp.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Intentt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intentt);

    }

    public void onClick(View view) {
        EditText txt = (EditText) findViewById(R.id.user);
        EditText pass = (EditText) findViewById(R.id.passe);

      Intent myntent = new Intent(this,MainActivity.class);
        Bundle b = new Bundle();
        b.putString("username",txt.getText().toString());
        b.putString("motdepasse",pass.getText().toString());
        myntent.putExtras(b);
       //myntent.putExtra("user name",txt.getText().toString());
        //myntent.putExtra("mot de passe",pass.getText().toString());
        startActivity(myntent);
    }
}
