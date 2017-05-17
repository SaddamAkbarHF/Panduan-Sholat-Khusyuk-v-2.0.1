package com.sahftech.panduansholatkhusyuk.panduanlain;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.R;

public class DoaQunut extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.panduanlain_doa_qunut);

        Button SumberArtikelDoaQunut = (Button) findViewById(R.id.bSumberArtikelDoaQunut);
        SumberArtikelDoaQunut.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                startActivity(new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("http://www.konsultasisyariah.com/doa-qunut-beserta-arti-dan-maknanya/")));
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
