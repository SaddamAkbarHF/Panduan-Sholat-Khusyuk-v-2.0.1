package com.sahftech.panduansholatkhusyuk.panduanlain;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.R;

public class DefinisidanPengertianSholatKhusyu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.panduanlain_definisidan_pengertian_sholat_khusyu);

        Button SumberDefinisidanpengertianSholatKhusyu = (Button) findViewById(R.id.bSumberArtikelDefinisidanpengertianSholatKhusyu);
        SumberDefinisidanpengertianSholatKhusyu
                .setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {

                        startActivity(new Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("http://eidariesky.wordpress.com/2010/06/25/definisi-dan-pengertian-khusyu/")));
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
