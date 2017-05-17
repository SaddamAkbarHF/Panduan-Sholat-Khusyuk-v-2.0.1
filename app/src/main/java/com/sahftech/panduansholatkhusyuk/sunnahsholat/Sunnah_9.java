package com.sahftech.panduansholatkhusyuk.sunnahsholat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.MainActivity;
import com.sahftech.panduansholatkhusyuk.R;

public class Sunnah_9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunnah_9);

        Button SunnahPrev9 = (Button) findViewById(R.id.bPrevSunnah9);
        SunnahPrev9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent SunnahPrev9 = new Intent(Sunnah_9.this,
                        Sunnah_8.class);
                startActivity(SunnahPrev9);
                finish();

                /*overridePendingTransition(R.anim.animation_enter,
                        R.anim.animation_leave);*/

            }
        });

        Button SunnahNext9 = (Button) findViewById(R.id.bNextSunnah9);
        SunnahNext9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent SunnahNext9 = new Intent(Sunnah_9.this,
                        Sunnah_10.class);
                startActivity(SunnahNext9);
                finish();

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
        startActivity(new Intent(Sunnah_9.this, MainActivity.class));
        finish();

    }
}
