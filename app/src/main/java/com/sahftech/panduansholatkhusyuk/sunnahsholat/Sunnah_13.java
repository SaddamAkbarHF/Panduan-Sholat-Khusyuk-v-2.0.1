package com.sahftech.panduansholatkhusyuk.sunnahsholat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.MainActivity;
import com.sahftech.panduansholatkhusyuk.R;

public class Sunnah_13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunnah_13);

        Button SunnahPrev13 = (Button) findViewById(R.id.bPrevSunnah13);
        SunnahPrev13.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent SunnahPrev13 = new Intent(Sunnah_13.this,
                        Sunnah_12.class);
                startActivity(SunnahPrev13);
                finish();

                /*overridePendingTransition(R.anim.animation_enter,
                        R.anim.animation_leave);*/

            }
        });

        Button SunnahNext13 = (Button) findViewById(R.id.bNextSunnah13);
        SunnahNext13.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent SunnahNext13 = new Intent(Sunnah_13.this,
                        MainActivity.class);
                startActivity(SunnahNext13);
                finish();

                /*overridePendingTransition(R.anim.open_scale, R.anim.close_translate);*/


            }
        });

        Button SumberSunnahSholat = (Button) findViewById(R.id.bSumberArtikelSunnahSholat);
        SumberSunnahSholat.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                startActivity(new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("http://adhwaus-salaf.or.id/mengenal-sunnah-sunnah-dalam-shalat/")));
                /*overridePendingTransition(R.anim.open_translate, R.anim.close_scale);*/

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
        startActivity(new Intent(Sunnah_13.this, MainActivity.class));
        finish();

    }
}
