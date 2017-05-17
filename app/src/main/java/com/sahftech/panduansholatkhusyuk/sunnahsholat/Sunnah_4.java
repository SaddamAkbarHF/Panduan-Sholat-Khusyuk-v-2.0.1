package com.sahftech.panduansholatkhusyuk.sunnahsholat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.MainActivity;
import com.sahftech.panduansholatkhusyuk.R;

public class Sunnah_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunnah_4);

        Button SunnahPrev4 = (Button) findViewById(R.id.bPrevSunnah4);
        SunnahPrev4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent SunnahPrev4 = new Intent(Sunnah_4.this,
                        Sunnah_3.class);
                startActivity(SunnahPrev4);
                finish();

                /*overridePendingTransition(R.anim.animation_enter,
                        R.anim.animation_leave);*/
            }
        });

        Button SunnahNext4 = (Button) findViewById(R.id.bNextSunnah4);
        SunnahNext4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent SunnahNext4 = new Intent(Sunnah_4.this,
                        Sunnah_5.class);
                startActivity(SunnahNext4);
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
        startActivity(new Intent(Sunnah_4.this, MainActivity.class));
        finish();

    }
}
