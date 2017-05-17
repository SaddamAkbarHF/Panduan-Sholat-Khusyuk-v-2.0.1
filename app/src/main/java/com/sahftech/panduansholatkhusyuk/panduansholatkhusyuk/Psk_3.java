package com.sahftech.panduansholatkhusyuk.panduansholatkhusyuk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.MainActivity;
import com.sahftech.panduansholatkhusyuk.R;

public class Psk_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psk_3);

        Button Prev3 = (Button) findViewById(R.id.bPrev3);
        Prev3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent Prev3 = new Intent(Psk_3.this,
                        Psk_2.class);
                startActivity(Prev3);
                finish();

                /*overridePendingTransition(R.anim.animation_enter,
                        R.anim.animation_leave);*/
            }
        });

        Button Next3 = (Button) findViewById(R.id.bNext3);
        Next3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent Next3 = new Intent(Psk_3.this,
                        Psk_4.class);
                startActivity(Next3);
                finish();

                /*overridePendingTransition(R.anim.open_translate, R.anim.close_scale);*/

            }
        });
    }

    public void clickhome(View view) {
        startActivity(new Intent(Psk_3.this, MainActivity.class));
        finish();
    }
}
