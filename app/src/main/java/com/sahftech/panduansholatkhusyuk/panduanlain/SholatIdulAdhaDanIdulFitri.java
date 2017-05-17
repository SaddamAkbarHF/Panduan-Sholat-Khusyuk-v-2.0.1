package com.sahftech.panduansholatkhusyuk.panduanlain;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.R;

public class SholatIdulAdhaDanIdulFitri extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.panduanlain_sholat_idul_adha_dan_idul_fitri);

        Button SumberArtikelSholatIdulAdhaDanIdulFitri = (Button) findViewById(R.id.bSumberArtikelSholatIdulAdhaDanIdulFitri);
        SumberArtikelSholatIdulAdhaDanIdulFitri.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                startActivity(new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("http://linktea.blogspot.com/2012/10/bacaan-shalat-idul-adha-idul-fitri.html")));
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
