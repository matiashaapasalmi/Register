package com.example.register;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclick (View view){
        TextView txt1 = findViewById(R.id.textView1);
        TextView txt2 = findViewById(R.id.textView2);
        TextView txt3 = findViewById(R.id.textView3);

        EditText edt1 = findViewById(R.id.ed1);
        EditText edt2 = findViewById(R.id.ed2);
        EditText edt3 = findViewById(R.id.ed3);

        txt1.setText("First Name: " + edt1.getText().toString());
        txt2.setText("Last Name: " + edt2.getText().toString());
        txt3.setText("Email: " + edt3.getText().toString());




    }
}