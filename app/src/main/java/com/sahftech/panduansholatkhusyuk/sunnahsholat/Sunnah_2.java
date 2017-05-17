package com.sahftech.panduansholatkhusyuk.sunnahsholat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.MainActivity;
import com.sahftech.panduansholatkhusyuk.R;

public class Sunnah_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunnah_2);

        Button SunnahPrev2 = (Button) findViewById(R.id.bPrevSunnah2);
        SunnahPrev2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent SunnahPrev2 = new Intent(Sunnah_2.this,
                        Sunnah_1.class);
                startActivity(SunnahPrev2);
                finish();

                /*overridePendingTransition(R.anim.animation_enter,
                        R.anim.animation_leave);*/

            }
        });

        Button SunnahNext2 = (Button) findViewById(R.id.bNextSunnah2);
        SunnahNext2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent SunnahNext2 = new Intent(Sunnah_2.this,
                        Sunnah_3.class);
                startActivity(SunnahNext2);
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
        startActivity(new Intent(Sunnah_2.this, MainActivity.class));
        finish();
    }
}
