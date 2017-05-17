package com.sahftech.panduansholatkhusyuk.panduanlain;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.R;

/**
 * Created by SAHFTECH on 5/14/2017.
 */

public class SholatJumatSumberLain extends AppCompatActivity {

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(R.layout.panduanlain_sholat_jumat_sumberlain);

        Button SumberArtikelSholatJumatSumberLain = (Button) findViewById(R.id.bSumberArtikelSholatJumatLain);
        SumberArtikelSholatJumatSumberLain
                .setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {

                        startActivity(new Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("http://jaflashnet.blogspot.com/2012/06/tata-cara-shalat-jumat.html")));
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
