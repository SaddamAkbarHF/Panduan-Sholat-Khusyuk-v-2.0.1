package com.sahftech.panduansholatkhusyuk.sunnahsholat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.MainActivity;
import com.sahftech.panduansholatkhusyuk.R;

public class Sunnah_8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunnah_8);


        Button SunnahPrev8 = (Button) findViewById(R.id.bPrevSunnah8);
        SunnahPrev8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent SunnahPrev8 = new Intent(Sunnah_8.this,
                        Sunnah_7.class);
                startActivity(SunnahPrev8);
                finish();

                        /*overridePendingTransition(R.anim.animation_enter,
                                R.anim.animation_leave);*/

            }
        });

        Button SunnahNext8 = (Button) findViewById(R.id.bNextSunnah8);
        SunnahNext8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent SunnahNext8 = new Intent(Sunnah_8.this,
                        Sunnah_9.class);
                startActivity(SunnahNext8);
                finish();

                     /*   overridePendingTransition(R.anim.open_translate, R.anim.close_scale);*/


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
        startActivity(new Intent(Sunnah_8.this, MainActivity.class));
        finish();

    }
}
