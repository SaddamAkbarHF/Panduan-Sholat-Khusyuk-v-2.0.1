package com.sahftech.panduansholatkhusyuk.panduansholatkhusyuk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.MainActivity;
import com.sahftech.panduansholatkhusyuk.R;

public class Psk_7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psk_7);

        Button Prev7 = (Button) findViewById(R.id.bPrev7);
        Prev7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent Prev7 = new Intent(Psk_7.this,
                        Psk_6.class);
                startActivity(Prev7);
                finish();

                /*overridePendingTransition(R.anim.animation_enter,
                        R.anim.animation_leave);*/
            }
        });

        Button Next7 = (Button) findViewById(R.id.bNext7);
        Next7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent Next7 = new Intent(Psk_7.this,
                        Psk_8.class);
                startActivity(Next7);
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
        startActivity(new Intent(Psk_7.this, MainActivity.class));
        finish();

    }
}
