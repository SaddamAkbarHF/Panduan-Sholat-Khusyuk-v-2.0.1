package com.sahftech.panduansholatkhusyuk.sunnahsholat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.MainActivity;
import com.sahftech.panduansholatkhusyuk.R;

public class Sunnah_11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunnah_11);

        Button SunnahPrev11 = (Button) findViewById(R.id.bPrevSunnah11);
        SunnahPrev11.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent SunnahPrev11 = new Intent(Sunnah_11.this,
                        Sunnah_10.class);
                startActivity(SunnahPrev11);
                finish();

                /*overridePendingTransition(R.anim.animation_enter,
                        R.anim.animation_leave);*/

            }
        });

        Button SunnahNext11 = (Button) findViewById(R.id.bNextSunnah11);
        SunnahNext11.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent SunnahNext11 = new Intent(Sunnah_11.this,
                        Sunnah_12.class);
                startActivity(SunnahNext11);
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
        startActivity(new Intent(Sunnah_11.this, MainActivity.class));
        finish();

    }
}
