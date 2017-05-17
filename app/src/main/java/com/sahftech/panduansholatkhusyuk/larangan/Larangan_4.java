package com.sahftech.panduansholatkhusyuk.larangan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sahftech.panduansholatkhusyuk.MainActivity;
import com.sahftech.panduansholatkhusyuk.R;

public class Larangan_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_larangan_4);

        Button LaranganPrev4 = (Button) findViewById(R.id.bPrevLarangan4);
        LaranganPrev4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent LaranganPrev4 = new Intent(Larangan_4.this,
                        Larangan_3.class);
                startActivity(LaranganPrev4);
                finish();
            }
        });

        Button LaranganNext4 = (Button) findViewById(R.id.bNextLarangan4);
        LaranganNext4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent LaranganNext4 = new Intent(Larangan_4.this,
                        Larangan_5.class);
                startActivity(LaranganNext4);
                finish();
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

    public void clickhome(View view) {
        startActivity(new Intent(com.sahftech.panduansholatkhusyuk.larangan.Larangan_4.this, MainActivity.class));
        finish();
    }
}
