package com.sahftech.panduansholatkhusyuk.panduanlain;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.R;

public class SholatSunnahRawatib extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.panduanlain_sholat_sunnah_rawatib);

        Button SumberArtikelSholatSunnahRawatib = (Button) findViewById(R.id.bSumberArtikelSholatSunnahRawatib);
        SumberArtikelSholatSunnahRawatib
                .setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {

                        startActivity(new Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("http://ceritaislami.net/macam-shalat-sunah-rawatib-niat-shalat-qobliyah-dan-niat-shalat-badiyah/")));
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
