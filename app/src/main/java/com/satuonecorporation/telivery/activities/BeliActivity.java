package com.satuonecorporation.telivery.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.satuonecorporation.telivery.R;

/**
 * Created by yurifatul on 15/04/2017.
 */

public class BeliActivity extends AppCompatActivity {

    private Button mLanjut;
    private TextView mDisplayText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beli);

        mDisplayText = (TextView)findViewById(R.id.pesanan);
        mLanjut = (Button)findViewById(R.id.lanjut);

        //menerima Intent yang dikirim
        Intent intent = getIntent();
        if (intent.hasExtra("Makanan")) {
            String textEntered = intent.getStringExtra("Makanan");
            mDisplayText.setText(textEntered);
        }
        mLanjut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(BeliActivity.this, "Permintaan Anda Segera Diproses", Toast.LENGTH_LONG).show();

                finish();
            }
        });
    }

}
