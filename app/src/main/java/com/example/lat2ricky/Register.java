package com.example.lat2ricky;
/*
Nama    :Ricky Yudha P K
Nim     :10117910
Kelas   : AKB IF6K
Tanggal Pengerjaan : 17/4/2020
* */
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Register extends AppCompatActivity {

    private Spinner spinner;
    private static final String[] paths = {"Blood Type","A", "B", "AB", "O"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button btnregist = (Button) findViewById(R.id.btnregist);
        btnregist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Register.this, almostthere.class);
                startActivity(intent);
            }
        });
    }


}
