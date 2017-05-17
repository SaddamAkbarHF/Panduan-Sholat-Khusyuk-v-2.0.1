package com.sahftech.panduansholatkhusyuk.panduanlain;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.R;

public class RukunRukunSholat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.panduanlain_rukun_rukun_sholat);

        Button SumberArtikelRukunRukunSholat = (Button) findViewById(R.id.bSumberArtikelRukunRukunSholat);
        SumberArtikelRukunRukunSholat
                .setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {

                        startActivity(new Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("http://muslim.or.id/fiqh-dan-muamalah/rukun-rukun-shalat.html")));
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
