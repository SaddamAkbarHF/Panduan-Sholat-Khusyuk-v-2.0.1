
package com.sahftech.panduansholatkhusyuk.panduansholatkhusyuk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.MainActivity;
import com.sahftech.panduansholatkhusyuk.R;

public class Psk_5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psk_5);

        Button Prev5 = (Button) findViewById(R.id.bPrev5);
        Prev5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent Prev5 = new Intent(Psk_5.this,
                        Psk_4.class);
                startActivity(Prev5);
                finish();

                /*overridePendingTransition(R.anim.animation_enter,
                        R.anim.animation_leave);*/
            }
        });

        Button Next5 = (Button) findViewById(R.id.bNext5);
        Next5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent Next5 = new Intent(Psk_5.this,
                        Psk_6.class);
                startActivity(Next5);
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
        startActivity(new Intent(Psk_5.this, MainActivity.class));
        finish();

    }
}
