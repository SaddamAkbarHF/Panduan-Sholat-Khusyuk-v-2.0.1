package com.sahftech.panduansholatkhusyuk.panduansholatkhusyuk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.MainActivity;
import com.sahftech.panduansholatkhusyuk.R;

public class Psk_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psk_2);

        Button Prev2 = (Button) findViewById(R.id.bPrev2);
        Prev2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent Prev1 = new Intent(Psk_2.this,
                        Psk_1.class);
                startActivity(Prev1);
               /* overridePendingTransition(R.anim.animation_enter,
                        R.anim.animation_leave);*/
            }
        });

        Button Next2 = (Button) findViewById(R.id.bNext2);
        Next2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent Next2 = new Intent(Psk_2.this,
                        Psk_3.class);
                startActivity(Next2);
                finish();

                /*overridePendingTransition(R.anim.open_translate, R.anim.close_scale);*/
            }
        });


        Button home = (Button) findViewById(R.id.bNext2);
        Next2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent Next2 = new Intent(Psk_2.this,
                        Psk_3.class);
                startActivity(Next2);
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
        startActivity(new Intent(Psk_2.this, MainActivity.class));
        finish();
    }

}
