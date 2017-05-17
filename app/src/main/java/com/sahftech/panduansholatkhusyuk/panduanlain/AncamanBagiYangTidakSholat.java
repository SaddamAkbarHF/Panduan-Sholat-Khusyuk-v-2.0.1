package com.sahftech.panduansholatkhusyuk.panduanlain;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.R;

public class AncamanBagiYangTidakSholat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.panduanlain_ancaman_bagi_yang_tidak_sholat);

        Button SumberArtikelBagiYangTidakSholat = (Button) findViewById(R.id.bSumberArtikelAncamanBagiYangTidakSholat);
        SumberArtikelBagiYangTidakSholat.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://apakah-islam.blogspot.com/2009/03/15-hal-bila-tinggalkan-sholat.html")));
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
