package com.satuonecorporation.telivery.activities;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.satuonecorporation.telivery.R;
import com.satuonecorporation.telivery.activities.home.UserHomeActivity;

/**
 * Created by yurifatul on 15/04/2017.
 */

public class MenuActivity extends AppCompatActivity {

    private Button mBeli;
    private TextView mMakanan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_makanan);

        mMakanan = (TextView)findViewById(R.id.textView);

        mBeli =(Button)findViewById(R.id.beli);
        mBeli.setOnClickListener(new View.OnClickListener() {
            String textEntered = mMakanan.getText().toString();
            //Context context = MenuActivity.this;
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MenuActivity.this, BeliActivity.class);
                intent.putExtra("Makanan", textEntered);
                startActivity(intent);

            }
        });

//        mBeli.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                Context context = MenuActivity.this;
//                Class destinationActivity = BeliActivity.class;
//                Intent intent = new Intent(context, destinationActivity);
//                startActivity(intent);
//            }
//        });
    }

    /**
     * This method is called when the Open Website button is clicked. It will open the website
     * specified by the URL represented by the variable urlAsString using implicit Intents.
     *
     * @param v Button that was clicked.
     */
    public void onClickOpenWebpageButton(View v) {
        String urlAsString = "https://www.google.co.id/maps/place/Angkringan+Terserah/@-6.9751051,107.6326069,19.5z/data=!4m5!3m4!1s0x2e68e9ae22c0f675:0x9f9e04069ef99df4!8m2!3d-6.975045!4d107.632662?hl=id";
        openWebPage(urlAsString);
    }
    public void onClickOpenWebpageButton2(View v) {
        String urlAsString = "https://www.google.co.id/maps/place/Kaminumasa/@-6.976806,107.6319203,18z/data=!3m1!4b1!4m5!3m4!1s0x2e68e9afda4ee435:0x4213fb2a811a452!8m2!3d-6.976806!4d107.632571?hl=id";
        openWebPage(urlAsString);
    }
    public void onClickOpenWebpageButton3(View v) {
        String urlAsString = "https://www.google.co.id/maps/place/Ayam+Madu+Si+Bangkong/@-6.9783736,107.6312482,18z/data=!3m1!4b1!4m5!3m4!1s0x2e68e9aff19f0133:0xe62e74afd953c251!8m2!3d-6.9783736!4d107.6323425?hl=id";
        openWebPage(urlAsString);
    }
    private void openWebPage(String url) {

        Uri webpage = Uri.parse(url);

        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

        if (intent.resolveActivity(getPackageManager()) != null) {

            startActivity(intent);
        }
    }
}
