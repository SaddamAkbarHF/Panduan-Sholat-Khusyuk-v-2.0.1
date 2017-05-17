package com.sahftech.panduansholatkhusyuk.sunnahsholat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.MainActivity;
import com.sahftech.panduansholatkhusyuk.R;

public class Sunnah_10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunnah_10);

        Button SunnahPrev10 = (Button) findViewById(R.id.bPrevSunnah10);
        SunnahPrev10.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent SunnahPrev10 = new Intent(Sunnah_10.this,
                        Sunnah_9.class);
                startActivity(SunnahPrev10);
                finish();

                /*overridePendingTransition(R.anim.animation_enter,
                        R.anim.animation_leave);*/

            }
        });

        Button SunnahNext10 = (Button) findViewById(R.id.bNextSunnah10);
        SunnahNext10.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent SunnahNext10 = new Intent(Sunnah_10.this,
                        Sunnah_11.class);
                startActivity(SunnahNext10);
                finish();

               /* overridePendingTransition(R.anim.open_translate, R.anim.close_scale);*/


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
        startActivity(new Intent(Sunnah_10.this, MainActivity.class));
        finish();

    }
}
