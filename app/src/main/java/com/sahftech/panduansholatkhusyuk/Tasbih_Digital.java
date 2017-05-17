package com.sahftech.panduansholatkhusyuk;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AlertDialog;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Tasbih_Digital extends Activity implements View.OnClickListener {
    TextView hasil;
    Button subhanallah, alhamdulillah, allahuakbar;
    int hitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasbih__digital);

        hitung = 0;
        hasil = (TextView) findViewById(R.id.tvHasil);

        subhanallah = (Button) findViewById(R.id.bSubhanallah);
        subhanallah.setOnClickListener(this);

        alhamdulillah = (Button) findViewById(R.id.bAlhamdulillah);
        alhamdulillah.setOnClickListener(this);

        allahuakbar = (Button) findViewById(R.id.bAllahuakbar);
        allahuakbar.setOnClickListener(this);
    }

    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.bSubhanallah:

                hitung++;
                hasil.setText("" + hitung);
                Vibrator vibrateSubhanallah = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrateSubhanallah.vibrate(120);

                if (hitung >= 34) {
                    hitung = 0;
                    hasil.setText("" + hitung);
                    subhanallah.setVisibility(View.GONE);
                    alhamdulillah.setVisibility(View.VISIBLE);

                    MediaPlayer tasdig_selesaisubhanallah = MediaPlayer.create(
                            this, R.raw.tasdig_jeda);
                    tasdig_selesaisubhanallah.start();
                    Vibrator vibrateSubhanallahganti = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                    vibrateSubhanallahganti.vibrate(1211);

                    final AlertDialog.Builder alertbox = new AlertDialog.Builder(
                            this);
                    alertbox.setMessage("Lanjutkan Tasbih Ke ALHAMDULILLAH?");
                    alertbox.setCancelable(false);
                    alertbox.setPositiveButton("Lanjut",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {

                                    LayoutInflater inflater = getLayoutInflater();
                                    View layout = inflater
                                            .inflate(R.layout.custom_toast,
                                                    (ViewGroup) findViewById(R.id.toast_layout_root));
                                    TextView ALHAMDULILLAH = (TextView) layout
                                            .findViewById(R.id.tvtext_custom_toast);
                                    ALHAMDULILLAH.setText("-ALHAMDULILLAH-");

                                    Toast toast1 = new Toast(
                                            getApplicationContext());
                                    toast1.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                                    toast1.setDuration(Toast.LENGTH_SHORT);
                                    toast1.setView(layout);
                                    toast1.show();

                                }
                            });

                    alertbox.setNegativeButton("Tidak",
                            new DialogInterface.OnClickListener() {

                                public void onClick(DialogInterface dialog,
                                                    int which) {
                                    // TODO Auto-generated method stub
                                    Intent BacktoSubhanallah = new Intent(
                                            Tasbih_Digital.this,
                                            MainActivity.class);
                                    startActivity(BacktoSubhanallah);
                                }
                            });

                    alertbox.show();

                }

                break;

            case R.id.bAlhamdulillah:

                hitung++;
                hasil.setText("" + hitung);
                Vibrator vibrateSubhanallahAlhamdulillah = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrateSubhanallahAlhamdulillah.vibrate(120);

                if (hitung >= 34) {
                    hitung = 0;
                    hasil.setText("" + hitung);
                    alhamdulillah.setVisibility(View.GONE);
                    allahuakbar.setVisibility(View.VISIBLE);

                    Vibrator vibrateAlhamdulillahganti = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                    vibrateAlhamdulillahganti.vibrate(1111);
                    MediaPlayer tasdig_selesaialhamdulillah = MediaPlayer.create(
                            this, R.raw.tasdig_jeda);
                    tasdig_selesaialhamdulillah.start();

                    final AlertDialog.Builder alertbox = new AlertDialog.Builder(
                            this);
                    alertbox.setMessage("Lanjutkan Tasbih Ke ALLAHUAKBAR?");
                    alertbox.setCancelable(false);
                    alertbox.setPositiveButton("Lanjut",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {

                                    LayoutInflater inflater = getLayoutInflater();
                                    View layout = inflater
                                            .inflate(
                                                    R.layout.custom_toast,
                                                    (ViewGroup) findViewById(R.id.toast_layout_root));
                                    TextView ALLAHUAKBAR = (TextView) layout
                                            .findViewById(R.id.tvtext_custom_toast);
                                    ALLAHUAKBAR.setText("-ALLAHUAKBAR-");

                                    Toast toast1 = new Toast(
                                            getApplicationContext());
                                    toast1.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                                    toast1.setDuration(Toast.LENGTH_SHORT);
                                    toast1.setView(layout);
                                    toast1.show();

                                }
                            });

                    alertbox.setNegativeButton("Tidak",
                            new DialogInterface.OnClickListener() {

                                public void onClick(DialogInterface dialog,
                                                    int which) {
                                    // TODO Auto-generated method stub
                                    Intent BacktoSubhanallah = new Intent(
                                            Tasbih_Digital.this,
                                            MainActivity.class);
                                    startActivity(BacktoSubhanallah);

                                }
                            });

                    alertbox.show();

                }

                break;
            case R.id.bAllahuakbar:

                hitung++;
                hasil.setText("" + hitung);
                Vibrator vibrateAllahuakbar = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrateAllahuakbar.vibrate(120);

                if (hitung >= 34) {
                    hitung = 0;
                    hasil.setText("" + hitung);
                    allahuakbar.setVisibility(View.GONE);
                    subhanallah.setVisibility(View.VISIBLE);

                    Vibrator vibrateAllahuakbarganti = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                    vibrateAllahuakbarganti.vibrate(1211);

                    MediaPlayer tasdig_selesai = MediaPlayer.create(this,
                            R.raw.tasdig_selesai);
                    tasdig_selesai.start();

                    AlertDialog.Builder alertbox = new AlertDialog.Builder(this);

                    alertbox.setMessage("Alhamdulillah! Zikir Selesai!\nMengingat ALLAH kapanpun dan dimanapun membuat kita Tenang dan Terjaga. \nJangan Lupa Berzikir Setiap Hari, Minimal Setelah Sholat!");
                    alertbox.setCancelable(false);
                    alertbox.setNeutralButton("OK",
                            new DialogInterface.OnClickListener() {

                                public void onClick(DialogInterface arg0, int arg1) {
                                    LayoutInflater inflater = getLayoutInflater();
                                    View layout = inflater
                                            .inflate(
                                                    R.layout.custom_toast,
                                                    (ViewGroup) findViewById(R.id.toast_layout_root));
                                    TextView text = (TextView) layout
                                            .findViewById(R.id.tvtext_custom_toast);
                                    text.setText("Jangan Lupa Selalu Mengingat ALLAH 'Kapanpun dan Dimanapun");

                                    Toast toast = new Toast(getApplicationContext());
                                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                                    toast.setDuration(Toast.LENGTH_SHORT);
                                    toast.setView(layout);
                                    toast.show();
                                    Intent selesaitasdig = new Intent(
                                            Tasbih_Digital.this,
                                            MainActivity.class);
                                    startActivity(selesaitasdig);
                                }
                            });
                    alertbox.show();
                }
                break;
        }

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
