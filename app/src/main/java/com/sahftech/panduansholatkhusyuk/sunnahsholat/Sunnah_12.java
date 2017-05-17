package com.sahftech.panduansholatkhusyuk.sunnahsholat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.MainActivity;
import com.sahftech.panduansholatkhusyuk.R;

public class Sunnah_12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunnah_12);

        Button SunnahPrev12 = (Button) findViewById(R.id.bPrevSunnah12);
        SunnahPrev12.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent SunnahPrev12 = new Intent(Sunnah_12.this,
                        Sunnah_11.class);
                startActivity(SunnahPrev12);
                finish();

                /*overridePendingTransition(R.anim.animation_enter,
                        R.anim.animation_leave);*/

            }
        });

        Button SunnahNext12 = (Button) findViewById(R.id.bNextSunnah12);
        SunnahNext12.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent SunnahNext12 = new Intent(Sunnah_12.this,
                        Sunnah_13.class);
                startActivity(SunnahNext12);
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
        startActivity(new Intent(Sunnah_12.this, MainActivity.class));
        finish();

    }
}
