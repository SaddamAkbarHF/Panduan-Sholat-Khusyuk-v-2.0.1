package com.sahftech.panduansholatkhusyuk.sunnahsholat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.MainActivity;
import com.sahftech.panduansholatkhusyuk.R;

public class Sunnah_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunnah_1);

        Button SunnahPrev1 = (Button) findViewById(R.id.bPrevSunnah1);
        SunnahPrev1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent SunnahPrev1 = new Intent(Sunnah_1.this,
                        MainActivity.class);
                startActivity(SunnahPrev1);
                finish();

               /* overridePendingTransition(R.anim.open_scale, R.anim.close_translate);*/
            }
        });

        Button SunnahNext1 = (Button) findViewById(R.id.bNextSunnah1);
        SunnahNext1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent SunnahNext1 = new Intent(Sunnah_1.this,
                        Sunnah_2.class);
                startActivity(SunnahNext1);
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

}
