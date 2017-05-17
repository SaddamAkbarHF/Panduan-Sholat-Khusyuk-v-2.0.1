package com.sahftech.panduansholatkhusyuk.panduanlain;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class PanduanLain extends ListActivity {

    /**
     * Called when the activity is first created. Method ini akan dipanggil pada
     * saat aplikasi dijalankan
     */
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        // Create an array of Strings, that will be put to our ListActivity
        String[] panduanlain = new String[]{"ALLAH Menjawab Al Fatihah",
                "Ancaman Bagi Yang Tidak Sholat",
                "Cara Berwudhu Sesuai Sunnah Rasulullah", "Cara Mandi Wajib",
                "Cara Sholat Berjamaah", "Definisi Sholat Khusyuk",
                "Doa Masuk Dan Keluar Masjid", "Doa Qunut",
                "Doa Setelah Adzan", "Doa Setelah Iqomah",
                "Doa Setelah Sholat", "HP Berbunyi Ketika Sholat",
                "Kesehatan Gerakan Sholat", "Makmum Masbuk",
                "Manfaat Dan Keutamaan Sholat Tarawih",
                "Menahan Kentut Ketika Sholat", "Rukun - Rukun Sholat",
                "Sholat Aw-Wabin", "Sholat Dhuha", "Sholat Gaib",
                "Sholat Gerhana", "Sholat Hajat",
                "Sholat Idul Adha Dan Idul Fitri", "Sholat Istikharah",
                "Sholat Istisqa", "Sholat Jamak dan Qashar", "Sholat Jenazah",
                "Sholat Jumat", "Sholat Muthlaq", "Sholat Safar",
                "Sholat Sunnah Rawatib", "Sholat Tahajud",
                "Sholat Tahiyatul Masjid", "Sholat Tarawih", "Sholat Tasbih", "Sholat Witir",
                "Sujud Sahwi", "Syarat Menjadi Muadzin", "Syarat Sah Sholat",
                "Syarat Wajib Sholat"};

        this.setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, panduanlain));
        /*overridePendingTransition(R.anim.fadein, R.anim.push_down_out);*/
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();

        tampilkanPilihan(pilihan);
    }

    /**
     * Tampilkan Activity sesuai dengan menu yang dipilih
     */
    protected void tampilkanPilihan(String pilihan) {
        try {

            Intent i = null;
            if (pilihan.equals("ALLAH Menjawab Al Fatihah")) {
                i = new Intent(this, ALLAHMenjawabAlFatihah.class);
            } else if (pilihan.equals("Ancaman Bagi Yang Tidak Sholat")) {
                i = new Intent(this, AncamanBagiYangTidakSholat.class);
            } else if (pilihan.equals("Cara Berwudhu Sesuai Sunnah Rasulullah")) {
                i = new Intent(this, CaraBerwudhu.class);
            } else if (pilihan.equals("Cara Mandi Wajib")) {
                i = new Intent(this, CaraMandiWajib.class);
            } else if (pilihan.equals("Cara Sholat Berjamaah")) {
                i = new Intent(this, CaraSholatBerjamaah.class);
            } else if (pilihan.equals("Definisi Sholat Khusyuk")) {
                i = new Intent(this, DefinisidanPengertianSholatKhusyu.class);
            } else if (pilihan.equals("Doa Masuk Dan Keluar Masjid")) {
                i = new Intent(this, DoaMasukKeluarMasjid.class);
            } else if (pilihan.equals("Doa Setelah Iqomah")) {
                i = new Intent(this, DoaSetelahIqomah.class);
            } else if (pilihan.equals("Doa Setelah Sholat")) {
                i = new Intent(this, DoaSetelahSholat.class);
            } else if (pilihan.equals("Doa Qunut")) {
                i = new Intent(this, DoaQunut.class);
            } else if (pilihan.equals("Doa Setelah Adzan")) {
                i = new Intent(this, DoaSetelahAdzan.class);
            } else if (pilihan.equals("HP Berbunyi Ketika Sholat")) {
                i = new Intent(this, HPBerbunyiKetikaSholat.class);
            } else if (pilihan.equals("Kesehatan Gerakan Sholat")) {
                i = new Intent(this, KesehatanGerakanSholat.class);
            } else if (pilihan.equals("Makmum Masbuk")) {
                i = new Intent(this, MakmumMasbuk.class);
            } else if (pilihan.equals("Manfaat Dan Keutamaan Sholat Tarawih")) {
                i = new Intent(this, ManfaatDanKeutamaanSholatTarawih.class);
            } else if (pilihan.equals("Menahan Kentut Ketika Sholat")) {
                i = new Intent(this, MenahanKentutKetikaSholat.class);
            } else if (pilihan.equals("Rukun - Rukun Sholat")) {
                i = new Intent(this, RukunRukunSholat.class);
            } else if (pilihan.equals("Sholat Aw-Wabin")) {
                i = new Intent(this, SholatAwWabin.class);
            } else if (pilihan.equals("Sholat Dhuha")) {
                i = new Intent(this, SholatDhuha.class);
            } else if (pilihan.equals("Sholat Gaib")) {
                i = new Intent(this, SholatGaib.class);
            } else if (pilihan.equals("Sholat Gerhana")) {
                i = new Intent(this, SholatGerhana.class);
            } else if (pilihan.equals("Sholat Hajat")) {
                i = new Intent(this, SholatHajat.class);
            } else if (pilihan.equals("Sholat Idul Adha Dan Idul Fitri")) {
                i = new Intent(this, SholatIdulAdhaDanIdulFitri.class);
            } else if (pilihan.equals("Sholat Istikharah")) {
                i = new Intent(this, SholatIstikharah.class);
            } else if (pilihan.equals("Sholat Istisqa")) {
                i = new Intent(this, SholatIstisqa.class);
            } else if (pilihan.equals("Sholat Jamak dan Qashar")) {
                i = new Intent(this, SholatJamaDanQashar.class);
            } else if (pilihan.equals("Sholat Jenazah")) {
                i = new Intent(this, SholatJenazah.class);
            } else if (pilihan.equals("Sholat Jumat")) {
                i = new Intent(this, SholatJumat.class);
            } else if (pilihan.equals("Sholat Muthlaq")) {
                i = new Intent(this, SholatMuthlaq.class);
            } else if (pilihan.equals("Sholat Safar")) {
                i = new Intent(this, SholatSafar.class);
            } else if (pilihan.equals("Sholat Sunnah Rawatib")) {
                i = new Intent(this, SholatSunnahRawatib.class);
            } else if (pilihan.equals("Sholat Tahajud")) {
                i = new Intent(this, SholatTahajud.class);
            } else if (pilihan.equals("Sholat Tahiyatul Masjid")) {
                i = new Intent(this, SholatTahiyatulMasjid.class);
            } else if (pilihan.equals("Sholat Tarawih")) {
                i = new Intent(this, SholatTarawih.class);
            } else if (pilihan.equals("Sholat Tasbih")) {
                i = new Intent(this, SholatTasbih.class);
            } else if (pilihan.equals("Sholat Witir")) {
                i = new Intent(this, SholatWitir.class);
            } else if (pilihan.equals("Sujud Sahwi")) {
                i = new Intent(this, SujudSahwi.class);
            } else if (pilihan.equals("Syarat Menjadi Muadzin")) {
                i = new Intent(this, SyaratMuadzin.class);
            } else if (pilihan.equals("Syarat Sah Sholat")) {
                i = new Intent(this, SyaratSahSholat.class);
            } else if (pilihan.equals("Syarat Wajib Sholat")) {
                i = new Intent(this, SyaratWajibSholat.class);
            } else {
                Toast.makeText(
                        this,
                        "Anda Memilih: " + pilihan
                                + " , Tunggu Di Fitur Selanjutnya",
                        Toast.LENGTH_LONG).show();
            }
            startActivity(i);
        } catch (Exception e) {
            e.printStackTrace();
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
