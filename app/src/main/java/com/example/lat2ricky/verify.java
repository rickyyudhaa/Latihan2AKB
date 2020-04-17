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
import android.view.View;
import android.widget.Button;

public class verify extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);

        Button btnsend = (Button) findViewById(R.id.btnsend);
        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(verify.this, homeuser.class);
                startActivity(intent);
            }
        });
    }
}
