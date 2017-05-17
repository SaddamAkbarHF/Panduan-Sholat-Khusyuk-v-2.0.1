package com.sahftech.panduansholatkhusyuk.sunnahsholat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.MainActivity;
import com.sahftech.panduansholatkhusyuk.R;

public class Sunnah_6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunnah_6);

        Button SunnahPrev6 = (Button) findViewById(R.id.bPrevSunnah6);
        SunnahPrev6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent SunnahPrev6 = new Intent(Sunnah_6.this,
                        Sunnah_5.class);
                startActivity(SunnahPrev6);
                finish();

                /*overridePendingTransition(R.anim.animation_enter,
                        R.anim.animation_leave);*/

            }
        });

        Button SunnahNext6 = (Button) findViewById(R.id.bNextSunnah6);
        SunnahNext6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent SunnahNext6 = new Intent(Sunnah_6.this,
                        Sunnah_7.class);
                startActivity(SunnahNext6);
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
        startActivity(new Intent(Sunnah_6.this, MainActivity.class));
        finish();

    }
}
