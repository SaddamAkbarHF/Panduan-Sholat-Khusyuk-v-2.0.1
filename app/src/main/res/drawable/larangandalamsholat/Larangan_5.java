package com.sahftech.panduansholatkhusyuk.larangandalamsholat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.MainActivity;
import com.sahftech.panduansholatkhusyuk.R;
import com.sahftech.panduansholatkhusyuk.larangan.Larangan_6;

public class Larangan_5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_larangan_5);

        Button LaranganPrev5 = (Button) findViewById(R.id.bPrevLarangan5);
        LaranganPrev5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent LaranganPrev5 = new Intent(com.sahftech.panduansholatkhusyuk.larangan.Larangan_5.this,
                        com.sahftech.panduansholatkhusyuk.larangan.Larangan_4.class);
                startActivity(LaranganPrev5);
                finish();

                /*overridePendingTransition(R.anim.animation_enter,
                        R.anim.animation_leave);
*/
            }
        });

        Button LaranganNext5 = (Button) findViewById(R.id.bNextLarangan5);
        LaranganNext5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent LaranganNext5 = new Intent(com.sahftech.panduansholatkhusyuk.larangan.Larangan_5.this,
                        Larangan_6.class);
                startActivity(LaranganNext5);
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
        startActivity(new Intent(com.sahftech.panduansholatkhusyuk.larangan.Larangan_5.this, MainActivity.class));
        finish();

    }
}
