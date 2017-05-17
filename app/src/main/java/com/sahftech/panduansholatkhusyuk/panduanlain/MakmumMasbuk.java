package com.sahftech.panduansholatkhusyuk.panduanlain;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.R;

public class MakmumMasbuk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.panduanlain_makmum_masbuk);

        Button SumberArtikelMakmumMasbuk = (Button) findViewById(R.id.bSumberArtikelMakmumMasbuk);
        SumberArtikelMakmumMasbuk
                .setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {

                        startActivity(new Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("http://bacaansholat5waktu.blogspot.com/2013/04/tata-cara-sholat-makmum-masbuq-terlambat.html")));

                    }
                });
        Button BagaimanaDuduknyaMakmumMasbukKetikaImamTasyahudAkhir = (Button) findViewById(R.id.bBagaimanaDuduknyaMakmumMasbukKetikaImamTasyahudAkhir);
        BagaimanaDuduknyaMakmumMasbukKetikaImamTasyahudAkhir
                .setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {

                        startActivity(new Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("http://muslim.or.id/fatwa-ulama/fatwa-ulama-bagaimana-duduknya-makmum-masbuk-ketika-imam-tasyahud-akhir.html")));

                    }
                });
        Button BagaimanaPosisiMakmumMasbukJikaJamaah2Orang = (Button) findViewById(R.id.bBagaimanaPosisiMakmumMasbukJikaJamaah2Orang);
        BagaimanaPosisiMakmumMasbukJikaJamaah2Orang
                .setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {

                        startActivity(new Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("http://www.majalahislami.com/2008/11/posisi-makmum-masbuk-jika-jamaah-2-orang/")));

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
