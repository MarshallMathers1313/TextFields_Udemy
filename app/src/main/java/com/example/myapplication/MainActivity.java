package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void buttonCliked(View view){

        EditText myTextField = (EditText) findViewById(R.id.Username);
        EditText myTextPassword = (EditText) findViewById(R.id.Password);

        Log.i("Info", myTextField.getText().toString());
        Log.i("Info", myTextPassword.getText().toString());

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}