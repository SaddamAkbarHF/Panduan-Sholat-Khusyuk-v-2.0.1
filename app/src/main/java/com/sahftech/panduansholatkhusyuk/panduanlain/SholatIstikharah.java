package com.sahftech.panduansholatkhusyuk.panduanlain;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.R;

public class SholatIstikharah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.panduanlain_sholat_istikharah);

        Button SumberArtikelSholatIstikharah = (Button) findViewById(R.id.bSumberArtikelSholatIstikharah);
        SumberArtikelSholatIstikharah
                .setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {

                        startActivity(new Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("http://www.tuliat.com/tuntunan-dan-tata-cara-shalat-istikharah/")));
                    }
                });

        Button SumberArtikelSholatIstikharah2 = (Button) findViewById(R.id.bSumberArtikelSholatIstikharah2);
        SumberArtikelSholatIstikharah2
                .setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {

                        startActivity(new Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("http://kaahil.wordpress.com/2012/03/27/lengkapcara-waktu-niat-doabacaan-sholat-istikharah-yang-benar-sholat-istikhoroh-untuk-jodoh-maupun-urusan-lain-bolehkan-doa-istikharah-dengan-bahasa-indonesia-bolehkah-doa/#more-4445")));
                    }
                });
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
    }

    @Override
    protected void onStop() {
        // TODO Auto-generated method stub
        super.onStop();
    }
}
