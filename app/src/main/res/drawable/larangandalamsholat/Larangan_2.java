package com.sahftech.panduansholatkhusyuk.larangandalamsholat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.MainActivity;
import com.sahftech.panduansholatkhusyuk.R;
import com.sahftech.panduansholatkhusyuk.larangan.Larangan_3;

public class Larangan_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_larangan_2);

        Button LaranganPrev2 = (Button) findViewById(R.id.bPrevLarangan2);
        LaranganPrev2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent LaranganPrev2 = new Intent(com.sahftech.panduansholatkhusyuk.larangan.Larangan_2.this,
                        com.sahftech.panduansholatkhusyuk.larangan.Larangan_1.class);
                startActivity(LaranganPrev2);
                finish();

                /*overridePendingTransition(R.anim.animation_enter,
                        R.anim.animation_leave);*/

            }
        });

        Button LaranganNext2 = (Button) findViewById(R.id.bNextLarangan2);
        LaranganNext2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent LaranganNext2 = new Intent(com.sahftech.panduansholatkhusyuk.larangan.Larangan_2.this,
                        Larangan_3.class);
                startActivity(LaranganNext2);
                finish();

              /*  overridePendingTransition(R.anim.open_translate, R.anim.close_scale);*/


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
        startActivity(new Intent(com.sahftech.panduansholatkhusyuk.larangan.Larangan_2.this, MainActivity.class));
        finish();

    }
}
