package com.sahftech.panduansholatkhusyuk.panduansholatkhusyuk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.MainActivity;
import com.sahftech.panduansholatkhusyuk.R;

public class Psk_6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psk_6);

        Button Prev6 = (Button) findViewById(R.id.bPrev6);
        Prev6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent Prev6 = new Intent(Psk_6.this,
                        Psk_5.class);
                startActivity(Prev6);
                finish();

                /*overridePendingTransition(R.anim.animation_enter,
                        R.anim.animation_leave);*/
            }
        });

        Button Next6 = (Button) findViewById(R.id.bNext6);
        Next6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent Next6 = new Intent(Psk_6.this,
                        Psk_7.class);
                startActivity(Next6);
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
        startActivity(new Intent(Psk_6.this, MainActivity.class));
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
