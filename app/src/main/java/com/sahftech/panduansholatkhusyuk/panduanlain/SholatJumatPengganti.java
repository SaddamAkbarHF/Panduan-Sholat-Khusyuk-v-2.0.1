package com.sahftech.panduansholatkhusyuk.panduanlain;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.R;

/**
 * Created by SAHFTECH on 5/14/2017.
 */

public class SholatJumatPengganti extends AppCompatActivity {

    @Override
    public void setContentView(View view) {
        super.setContentView(R.layout.panduanlain_sholat_jumat_pengganti);

        Button SumberArtikelSholatJumatPengganti = (Button) findViewById(R.id.bSumberArtikelSholatJumatPengganti);
        SumberArtikelSholatJumatPengganti
                .setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {

                        startActivity(new Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("http://www.konsultasisyariah.com/ketika-tidak-shalat-jumat/")));
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
