package com.sahftech.panduansholatkhusyuk.panduanlain;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.R;

public class DoaSetelahAdzan extends AppCompatActivity {

    MediaPlayer doasetelahadzan;
    Button adzanplay, adzanstop, sumberArtikelDoaSetelahAdzan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.panduanlain_doa_setelah_adzan);

        doasetelahadzan = MediaPlayer.create(DoaSetelahAdzan.this,
                R.raw.doa_sesudah_adzan);

        adzanplay = (Button) findViewById(R.id.bDoaSetelahAdzanPlay);
        adzanplay.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                doasetelahadzan.setAudioStreamType(AudioManager.STREAM_MUSIC);

                doasetelahadzan.start();
                if (v.equals(adzanplay)) {
                    if (doasetelahadzan != null && doasetelahadzan.isPlaying())
                        return;
                    doasetelahadzan = MediaPlayer.create(DoaSetelahAdzan.this,
                            R.raw.doa_sesudah_adzan);
                    doasetelahadzan.start();
                    new Thread().start();
                }

                if (v.equals(adzanstop) && doasetelahadzan != null) {
                    doasetelahadzan.stop();
                    doasetelahadzan = null;
                }
            }
        });

        adzanstop = (Button) findViewById(R.id.bDoaSetelahAdzanStop);
        adzanstop.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                doasetelahadzan.stop();
            }
        });

        sumberArtikelDoaSetelahAdzan = (Button) findViewById(R.id.bSumberArtikelDoaSetelahAdzan);
        sumberArtikelDoaSetelahAdzan
                .setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        startActivity(new Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("http://www.segalacara.com/doa-setelah-adzan/")));
                    }
                });

    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        doasetelahadzan.pause();

    }

    @Override
    protected void onStop() {
        // TODO Auto-generated method stub
        super.onStop();
        doasetelahadzan.stop();
    }
}
