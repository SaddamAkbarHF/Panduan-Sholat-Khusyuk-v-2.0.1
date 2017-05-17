package com.sahftech.panduansholatkhusyuk;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final AlertDialog.Builder alertbox = new AlertDialog.Builder(this);
        alertbox.setMessage("Panduan Sholat Khusyu (PSK) adalah aplikasi tuntunan atau panduan tentang berbagai macam sholat baik dari sholat wajib maupun sunnah dan juga tambahan panduan pendukung dalam sholat.\nUntuk Saran dan kritik silahkan kirim email. \n\n Developed by SAHFTECH");
        alertbox.setCancelable(false);
        alertbox.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent intent = new Intent(About.this, MainActivity.class);
                        startActivity(intent);
                    }
                });

        alertbox.show();


    }


}
