package com.sahftech.panduansholatkhusyuk.larangandalamsholat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.MainActivity;
import com.sahftech.panduansholatkhusyuk.R;
import com.sahftech.panduansholatkhusyuk.larangan.Larangan_7;

public class Larangan_6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_larangan_6);

        Button LaranganPrev6 = (Button) findViewById(R.id.bPrevLarangan6);
        LaranganPrev6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent LaranganPrev6 = new Intent(com.sahftech.panduansholatkhusyuk.larangan.Larangan_6.this,
                        com.sahftech.panduansholatkhusyuk.larangan.Larangan_5.class);
                startActivity(LaranganPrev6);
                finish();

                /*overridePendingTransition(R.anim.animation_enter,
                        R.anim.animation_leave);*/

            }
        });

        Button LaranganNext6 = (Button) findViewById(R.id.bNextLarangan6);
        LaranganNext6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent LaranganNext6 = new Intent(com.sahftech.panduansholatkhusyuk.larangan.Larangan_6.this,
                        Larangan_7.class);
                startActivity(LaranganNext6);
                finish();

/*
                overridePendingTransition(R.anim.open_translate, R.anim.close_scale);
*/


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
        startActivity(new Intent(com.sahftech.panduansholatkhusyuk.larangan.Larangan_6.this, MainActivity.class));
        finish();

    }
}
