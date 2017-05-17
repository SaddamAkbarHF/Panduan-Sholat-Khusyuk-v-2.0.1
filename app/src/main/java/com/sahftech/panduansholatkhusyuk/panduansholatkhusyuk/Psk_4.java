package com.sahftech.panduansholatkhusyuk.panduansholatkhusyuk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.MainActivity;
import com.sahftech.panduansholatkhusyuk.R;

public class Psk_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psk_4);

        Button Prev4 = (Button) findViewById(R.id.bPrev4);
        Prev4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent Prev4 = new Intent(Psk_4.this,
                        Psk_3.class);
                startActivity(Prev4);
                finish();
                /*overridePendingTransition(R.anim.animation_enter,
                        R.anim.animation_leave);	*/
            }
        });

        Button Next4 = (Button) findViewById(R.id.bNext4);
        Next4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent Next4 = new Intent(Psk_4.this,
                        Psk_5.class);
                startActivity(Next4);
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
        startActivity(new Intent(Psk_4.this, MainActivity.class));
        finish();
    }
}
