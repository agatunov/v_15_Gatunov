package com.example.gatunov_v_15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String field1;
    String field2;
    String field3;
    String field4;
    EditText fieldET1;
    EditText fieldET2;
    EditText fieldET3;
    EditText fieldET4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        field1 = "";
        field2 = "";
        field3 = "";
        field4 = "";
        fieldET1 = (EditText) findViewById(R.id.editTextPassword1);
        fieldET2 = (EditText) findViewById(R.id.editTextPassword2);
        fieldET3 = (EditText) findViewById(R.id.editTextPassword3);
        fieldET4 = (EditText) findViewById(R.id.editTextPassword4);
    }
    public void onClickOk(View view) {
        Intent i = new Intent(MainActivity.this, ComentActivity.class);
        startActivity(i);
    }
    public void onClick1 (View view) {
       String number = "1";
       setPassword(number);
    }
    public void onClick2 (View view) {
        String number = "2";
        setPassword(number);
    }
    public void onClick3 (View view) {
        String number = "3";
        setPassword(number);
    }
    public void onClick4 (View view) {
        String number = "4";
        setPassword(number);
    }
    public void onClick5 (View view) {
        String number = "5";
        setPassword(number);
    }
    public void onClick6 (View view) {
        String number = "6";
        setPassword(number);
    }
    public void onClick7 (View view) {
        String number = "7";
        setPassword(number);
    }
    public void onClick8 (View view) {
        String number = "8";
        setPassword(number);
    }
    public void onClick9 (View view) {
        String number = "9";
        setPassword(number);
    }
    public void onClick0 (View view) {
        String number = "0";
        setPassword(number);
    }

    public void setPassword(String number) {
        if (field1.equals("")) {
            field1 = number;
            fieldET1.setText(field1);
        }
        else if (field2.equals("")) {
            field2 = number;
            fieldET2.setText(field2);
        }
        else if (field3.equals("")) {
            field3 = number;
            fieldET3.setText(field3);
        }
        else if (field4.equals("")) {
            field4 = number;
            fieldET4.setText(field4);
        }
        else {
            Toast toast = Toast.makeText(getApplicationContext(), "Вы ввели максимальное количество символов", Toast.LENGTH_LONG);
            toast.show();
        }
    }
    public void onClickClear(View view) {
        fieldET1.setText("");
        fieldET2.setText("");
        fieldET3.setText("");
        fieldET4.setText("");
        field1 = "";
        field2 = "";
        field3 = "";
        field4 = "";
    }
}