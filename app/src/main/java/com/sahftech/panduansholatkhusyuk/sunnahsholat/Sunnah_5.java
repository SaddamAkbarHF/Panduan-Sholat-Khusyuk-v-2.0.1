package com.sahftech.panduansholatkhusyuk.sunnahsholat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.MainActivity;
import com.sahftech.panduansholatkhusyuk.R;

public class Sunnah_5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunnah_5);

        Button SunnahPrev5 = (Button) findViewById(R.id.bPrevSunnah5);
        SunnahPrev5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent SunnahPrev5 = new Intent(Sunnah_5.this,
                        Sunnah_4.class);
                startActivity(SunnahPrev5);
                finish();

               /* overridePendingTransition(R.anim.animation_enter,
                        R.anim.animation_leave);*/

            }
        });

        Button SunnahNext5 = (Button) findViewById(R.id.bNextSunnah5);
        SunnahNext5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent SunnahNext5 = new Intent(Sunnah_5.this,
                        Sunnah_6.class);
                startActivity(SunnahNext5);
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
        startActivity(new Intent(Sunnah_5.this, MainActivity.class));
        finish();

    }
}
