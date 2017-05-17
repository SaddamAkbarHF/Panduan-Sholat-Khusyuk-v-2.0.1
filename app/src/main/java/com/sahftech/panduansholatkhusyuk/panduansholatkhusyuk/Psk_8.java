package com.sahftech.panduansholatkhusyuk.panduansholatkhusyuk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.MainActivity;
import com.sahftech.panduansholatkhusyuk.R;

public class Psk_8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psk_8);

        Button Prev8 = (Button) findViewById(R.id.bPrev8);
        Prev8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent Prev8 = new Intent(Psk_8.this,
                        Psk_7.class);
                startActivity(Prev8);
                finish();

                /*overridePendingTransition(R.anim.animation_enter,
                        R.anim.animation_leave);*/

            }
        });

        Button Next8 = (Button) findViewById(R.id.bNext8);
        Next8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent Next8 = new Intent(Psk_8.this,
                        Psk_9.class);
                startActivity(Next8);
                finish();

                /*overridePendingTransition(R.anim.open_translate, R.anim.close_scale);*/

            }
        });

    }

    public void clickhome(View view) {
        startActivity(new Intent(Psk_8.this, MainActivity.class));
        finish();

    }
}
