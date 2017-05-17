package com.sahftech.panduansholatkhusyuk.sunnahsholat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.MainActivity;
import com.sahftech.panduansholatkhusyuk.R;

public class Sunnah_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunnah_3);

        Button SunnahPrev3 = (Button) findViewById(R.id.bPrevSunnah3);
        SunnahPrev3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent SunnahPrev3 = new Intent(Sunnah_3.this,
                        Sunnah_2.class);
                startActivity(SunnahPrev3);
                finish();

                /*overridePendingTransition(R.anim.animation_enter,
                        R.anim.animation_leave);*/

            }
        });

        Button SunnahNext3 = (Button) findViewById(R.id.bNextSunnah3);
        SunnahNext3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent SunnahNext3 = new Intent(Sunnah_3.this,
                        Sunnah_4.class);
                startActivity(SunnahNext3);
                finish();

                /*overridePendingTransition(R.anim.open_translate, R.anim.close_scale);*/


            }
        });
    }

    public void clickhome(View view) {
        startActivity(new Intent(Sunnah_3.this, MainActivity.class));
        finish();

    }
}
