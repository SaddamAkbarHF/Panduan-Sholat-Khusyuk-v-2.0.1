package com.sahftech.panduansholatkhusyuk.panduanlain;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.R;

public class SholatHajat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.panduanlain_sholat_hajat);

        Button SumberArtikelSholatHajat = (Button) findViewById(R.id.bSumberArtikelSholatHajat);
        SumberArtikelSholatHajat.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                startActivity(new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("http://infotercepatku.blogspot.com/2013/07/tata-cara-sholat-hajat-bacaan.html")));
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
