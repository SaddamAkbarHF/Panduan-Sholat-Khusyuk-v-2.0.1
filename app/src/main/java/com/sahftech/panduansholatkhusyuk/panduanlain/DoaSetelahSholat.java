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
import com.sahftech.panduansholatkhusyuk.Tasbih_Digital;

public class DoaSetelahSholat extends AppCompatActivity {

    MediaPlayer doasetelahSholat;
    Button TasDigLangsung, Sholatplay, Sholatstop, sumberArtikelDoaSetelahSholat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.panduanlain_doa_setelah_sholat);

        doasetelahSholat = MediaPlayer.create(DoaSetelahSholat.this,
                R.raw.doa_setelah_sholat_saad_al_homidi);

        Sholatplay = (Button) findViewById(R.id.bDoaSetelahSholatPlay);
        Sholatplay.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                doasetelahSholat.setAudioStreamType(AudioManager.STREAM_MUSIC);

                doasetelahSholat.start();
                if (v.equals(Sholatplay)) {
                    if (doasetelahSholat != null
                            && doasetelahSholat.isPlaying())
                        return;
                    doasetelahSholat = MediaPlayer.create(
                            DoaSetelahSholat.this,
                            R.raw.doa_setelah_sholat_saad_al_homidi);
                    doasetelahSholat.start();
                    new Thread().start();
                }

                if (v.equals(Sholatstop) && doasetelahSholat != null) {
                    doasetelahSholat.stop();
                    doasetelahSholat = null;
                }
            }
        });

        Sholatstop = (Button) findViewById(R.id.bDoaSetelahSholatStop);
        Sholatstop.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                doasetelahSholat.stop();
            }
        });

        sumberArtikelDoaSetelahSholat = (Button) findViewById(R.id.bSumberArtikelDoaSetelahSholat);
        sumberArtikelDoaSetelahSholat
                .setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        startActivity(new Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("http://tarekatqodiriyah.wordpress.com/doa-setelah-sholat-5-waktu/")));
                    }
                });

        TasDigLangsung = (Button) findViewById(R.id.bTasDigFromBacaanSetelahSholat);
        TasDigLangsung.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent tasdiglangsung = new Intent(DoaSetelahSholat.this,
                        Tasbih_Digital.class);
                startActivity(tasdiglangsung);
            }
        });

    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        doasetelahSholat.pause();

    }

    @Override
    protected void onStop() {
        // TODO Auto-generated method stub
        super.onStop();
        doasetelahSholat.stop();
    }
}
