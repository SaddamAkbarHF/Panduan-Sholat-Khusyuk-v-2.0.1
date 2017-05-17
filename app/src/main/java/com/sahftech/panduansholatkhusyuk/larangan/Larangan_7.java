package com.sahftech.panduansholatkhusyuk.larangan;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.MainActivity;
import com.sahftech.panduansholatkhusyuk.R;

public class Larangan_7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_larangan_7);

        Button LaranganPrev7 = (Button) findViewById(R.id.bPrevLarangan7);
        LaranganPrev7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent LaranganPrev7 = new Intent(Larangan_7.this,
                        Larangan_6.class);
                startActivity(LaranganPrev7);
               /* overridePendingTransition(R.anim.animation_enter,
                        R.anim.animation_leave);*/

            }
        });

        Button LaranganNext7 = (Button) findViewById(R.id.bNextLarangan7);
        LaranganNext7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent LaranganNext7 = new Intent(Larangan_7.this,
                        MainActivity.class);
                startActivity(LaranganNext7);
                /*overridePendingTransition(R.anim.open_scale,
                        R.anim.close_translate);*/

            }
        });

        Button SumberArtikelLaranganSholat = (Button) findViewById(R.id.bSumberArtikelLaranganDalamSholat);
        SumberArtikelLaranganSholat
                .setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {

                        startActivity(new Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("http://aljaami.wordpress.com/2011/03/31/perkara-perkara-yang-dilarang-dalam-shalat/")));
/*
                        overridePendingTransition(R.anim.open_translate, R.anim.close_scale);
*/

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
    public void clickhome(View view) {
        startActivity(new Intent(com.sahftech.panduansholatkhusyuk.larangan.Larangan_7.this, MainActivity.class));
        finish();
    }
}
