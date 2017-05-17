package com.sahftech.panduansholatkhusyuk.larangandalamsholat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.MainActivity;
import com.sahftech.panduansholatkhusyuk.R;

public class Larangan_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_larangan_1);

        Button LaranganPrev1 = (Button) findViewById(R.id.bPrevLarangan1);
        LaranganPrev1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent LaranganPrev1 = new Intent(com.sahftech.panduansholatkhusyuk.larangan.Larangan_1.this,
                        MainActivity.class);
                startActivity(LaranganPrev1);
                finish();

               /* overridePendingTransition(R.anim.open_scale, R.anim.close_translate);*/


            }
        });

        Button LaranganNext1 = (Button) findViewById(R.id.bNextLarangan1);
        LaranganNext1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent LaranganNext1 = new Intent(com.sahftech.panduansholatkhusyuk.larangan.Larangan_1.this,
                        com.sahftech.panduansholatkhusyuk.larangan.Larangan_2.class);
                startActivity(LaranganNext1);
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
