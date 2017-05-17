package com.sahftech.panduansholatkhusyuk.larangan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.sahftech.panduansholatkhusyuk.MainActivity;
import com.sahftech.panduansholatkhusyuk.R;

public class Larangan_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_larangan_3);

        Button LaranganPrev3 = (Button) findViewById(R.id.bPrevLarangan3);
        LaranganPrev3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent LaranganPrev3 = new Intent(Larangan_3.this, Larangan_2.class);
                startActivity(LaranganPrev3);
                finish();
            }
        });

        Button LaranganNext3 = (Button) findViewById(R.id.bNextLarangan3);
        LaranganNext3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent LaranganNext3 = new Intent(Larangan_3.this, Larangan_4.class);
                startActivity(LaranganNext3);
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
        startActivity(new Intent(com.sahftech.panduansholatkhusyuk.larangan.Larangan_3.this, MainActivity.class));
        finish();
    }
}
