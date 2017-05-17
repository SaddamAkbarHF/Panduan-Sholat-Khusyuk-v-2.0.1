package com.sahftech.panduansholatkhusyuk.sunnahsholat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.MainActivity;
import com.sahftech.panduansholatkhusyuk.R;

public class Sunnah_7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunnah_7);

        Button SunnahPrev7 = (Button) findViewById(R.id.bPrevSunnah7);
        SunnahPrev7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent SunnahPrev7 = new Intent(Sunnah_7.this,
                        Sunnah_6.class);
                startActivity(SunnahPrev7);
                finish();

                /*overridePendingTransition(R.anim.animation_enter,
                        R.anim.animation_leave);*/

            }
        });

        Button SunnahNext7 = (Button) findViewById(R.id.bNextSunnah7);
        SunnahNext7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent SunnahNext7 = new Intent(Sunnah_7.this,
                        Sunnah_8.class);
                startActivity(SunnahNext7);
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
        startActivity(new Intent(Sunnah_7.this, MainActivity.class));
        finish();

    }
}
