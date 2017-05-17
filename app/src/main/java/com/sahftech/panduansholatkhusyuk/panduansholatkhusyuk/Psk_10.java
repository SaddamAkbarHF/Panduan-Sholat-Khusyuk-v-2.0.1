package com.sahftech.panduansholatkhusyuk.panduansholatkhusyuk;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.MainActivity;
import com.sahftech.panduansholatkhusyuk.R;

public class Psk_10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psk_10);

        Button Prev10 = (Button) findViewById(R.id.bPrev10);
        Prev10.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent Prev10 = new Intent(Psk_10.this,
                        Psk_9.class);
                startActivity(Prev10);
                finish();

                /*overridePendingTransition(R.anim.animation_enter,
                        R.anim.animation_leave);*/
            }
        });

        Button Next10 = (Button) findViewById(R.id.bNext10);
        Next10.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent Next10 = new Intent(Psk_10.this,
                        MainActivity.class);
                startActivity(Next10);
                finish();

                /*overridePendingTransition(R.anim.open_scale, R.anim.close_translate);*/

            }
        });

        Button SumberPanduanSholatKhusyu = (Button) findViewById(R.id.bSumberArtikelPanduanSholatKhusyu);
        SumberPanduanSholatKhusyu
                .setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {

                        startActivity(new Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("http://isidunia.blogspot.com/2011/11/cara-agar-shalat-khusyu.html")));
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
        startActivity(new Intent(Psk_10.this, MainActivity.class));
        finish();

    }
}
