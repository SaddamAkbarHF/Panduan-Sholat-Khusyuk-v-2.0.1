package com.sahftech.panduansholatkhusyuk.panduanlain;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.R;

public class SholatJumat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.panduanlain_sholat_jumat);

        Button SumberArtikelSholatJumat = (Button) findViewById(R.id.bSumberArtikelSholatJumat);
        SumberArtikelSholatJumat.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                startActivity(new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("http://www.solusiislam.com/2012/12/tata-cara-pelaksanaan-khutbah-jumat.html")));
            }
        });

        Button SholatJumatSumberLain = (Button) findViewById(R.id.bSholatJumatSumberLain);
        SholatJumatSumberLain.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent SholatJumatSumberLain = new Intent(SholatJumat.this,
                        SholatJumatSumberLain.class);
                startActivity(SholatJumatSumberLain);

            }
        });

        Button PenggantiSholatJumat = (Button) findViewById(R.id.bPenggantiSholatJumat);
        PenggantiSholatJumat.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent PenggantiSholatJumat = new Intent(SholatJumat.this,
                        SholatJumatPengganti.class);
                startActivity(PenggantiSholatJumat);

            }
        });


    }
}
