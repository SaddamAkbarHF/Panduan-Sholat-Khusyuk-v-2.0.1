package com.sahftech.panduansholatkhusyuk.panduansholatkhusyuk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.MainActivity;
import com.sahftech.panduansholatkhusyuk.R;

public class Psk_9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psk_9);

        Button Prev9 = (Button) findViewById(R.id.bPrev9);
        Prev9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent Prev9 = new Intent(Psk_9.this,
                        Psk_8.class);
                startActivity(Prev9);
                finish();

                /*overridePendingTransition(R.anim.animation_enter,
                        R.anim.animation_leave);*/
            }
        });

        Button Next9 = (Button) findViewById(R.id.bNext9);
        Next9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent Next9 = new Intent(Psk_9.this,
                        Psk_10.class);
                startActivity(Next9);
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
        startActivity(new Intent(Psk_9.this, MainActivity.class));
        finish();

    }
}
