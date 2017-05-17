package com.sahftech.panduansholatkhusyuk.panduansholatkhusyuk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.MainActivity;
import com.sahftech.panduansholatkhusyuk.R;

public class Psk_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psk_1);


        Button Prev1 = (Button) findViewById(R.id.bPrev1);
        Prev1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent Prev1 = new Intent(Psk_1.this,
                        MainActivity.class);
                startActivity(Prev1);
                finish();

               /* overridePendingTransition(R.anim.open_scale, R.anim.close_translate);*/
            }
        });

        Button Next1 = (Button) findViewById(R.id.bNext1);
        Next1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent Next1 = new Intent(Psk_1.this,
                        Psk_2.class);
                startActivity(Next1);
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
