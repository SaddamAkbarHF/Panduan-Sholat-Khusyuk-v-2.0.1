package com.sahftech.panduansholatkhusyuk;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.sahftech.panduansholatkhusyuk.larangan.Larangan_1;
import com.sahftech.panduansholatkhusyuk.panduanlain.PanduanLain;
import com.sahftech.panduansholatkhusyuk.panduansholatkhusyuk.Psk_1;
import com.sahftech.panduansholatkhusyuk.sunnahsholat.Sunnah_1;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_top);
        TextView mTitle = (TextView) toolbar.findViewById(R.id.toolbar_title);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        GridView gridView = (GridView) findViewById(R.id.gridview);
        gridView.setAdapter(new MyAdapter(this));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView parent, View v, int position, long id) {

                Intent categMain = new Intent(MainActivity.this, Psk_1.class);

                switch (position) {
                    case 0:
                        startActivity(categMain);
                        break;
                    case 1:
                        categMain = new Intent(MainActivity.this, Sunnah_1.class);
                        startActivity(categMain);
                        break;
                    case 2:
                        categMain = new Intent(MainActivity.this, Larangan_1.class);
                        startActivity(categMain);
                        break;
                    case 3:
                        categMain = new Intent(MainActivity.this, PanduanLain.class);
                        startActivity(categMain);
                        break;
                    case 4:
                        categMain = new Intent(MainActivity.this, Tasbih_Digital.class);
                        startActivity(categMain);
                        break;
                    case 5:
                        Intent exit = new Intent(Intent.ACTION_MAIN);
                        exit.addCategory(Intent.CATEGORY_HOME);
                        exit.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(exit);
                        break;
                }
            }
        });

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private class MyAdapter extends BaseAdapter {
        private List<Item> items = new ArrayList<Item>();
        private LayoutInflater inflater;

        public MyAdapter(Context context) {
            inflater = LayoutInflater.from(context);

            items.add(new Item("Panduan Sholat Khusyuk", R.drawable.menu_psk_selector));
            items.add(new Item("Sunnah Sholat", R.drawable.menu_sunnah_selector));
            items.add(new Item("Larangan Dalam Sholat", R.drawable.menu_larangan_selector));
            items.add(new Item("Panduan Lain", R.drawable.menu_panduanlain_selector));
            items.add(new Item("Tasbih Digital", R.drawable.menu_tasdig_selector));
            items.add(new Item("Exit", R.drawable.menu_exit_selector));
        }

        @Override
        public int getCount() {
            return items.size();
        }

        @Override
        public Object getItem(int i) {
            return items.get(i);
        }

        @Override
        public long getItemId(int i) {
            return items.get(i).drawableId;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View v = view;
            ImageView picture;
            TextView name;

            if (v == null) {
                v = inflater.inflate(R.layout.gridview_item, viewGroup, false);
                v.setTag(R.id.picture, v.findViewById(R.id.picture));
                v.setTag(R.id.text, v.findViewById(R.id.text));
            }

            picture = (ImageView) v.getTag(R.id.picture);
            name = (TextView) v.getTag(R.id.text);

            Item item = (Item) getItem(i);

            picture.setImageResource(item.drawableId);
            name.setText(item.name);

            return v;
        }

        private class Item {
            final String name;
            final int drawableId;

            Item(String name, int drawableId) {
                this.name = name;
                this.drawableId = drawableId;
            }
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if (id == R.id.nav_about) {

            Intent about = new Intent(MainActivity.this, About.class);
            startActivity(about);

        } else if (id == R.id.nav_petunjuk_tasdig) {

            Intent petunjuktasdig = new Intent(MainActivity.this, PetunjukTasdig.class);
            startActivity(petunjuktasdig);

        } else if (id == R.id.nav_credit) {
            Intent credit = new Intent(MainActivity.this, Credit.class);
            startActivity(credit);

        } else if (id == R.id.nav_facebook) {

            Intent intent_facebook = null;
            try {
                intent_facebook = new Intent(Intent.ACTION_VIEW);
                intent_facebook.setPackage("com.facebook.android");
                intent_facebook.setData(Uri.parse("https://www.facebook.com/saddamakbarhurisfabanyo"));
                startActivity(intent_facebook);
            } catch (ActivityNotFoundException e) {
                intent_facebook = new Intent(Intent.ACTION_VIEW);
                intent_facebook.setData(Uri.parse("https://www.facebook.com/saddamakbarhurisfabanyo "));
                startActivity(intent_facebook);
            }

        } else if (id == R.id.nav_twitter) {

            Intent intent_twitter = null;
            try {
                // get the Twitter app if possible

                intent_twitter = new Intent(Intent.ACTION_VIEW);
                intent_twitter.setPackage("com.facebook.android");
                intent_twitter.setData(Uri.parse("https://twitter.com/SaddamAkbar"));
                startActivity(intent_twitter);

                /*getPackageManager().getPackageInfo("com.twitter.android", 0);
                intent_twitter = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/SaddamAkbar"));
                intent_twitter.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);*/
            } catch (Exception e) {
                intent_twitter = new Intent(Intent.ACTION_VIEW);
                intent_twitter.setData(Uri.parse("https://twitter.com/SaddamAkbar"));
                startActivity(intent_twitter);            }

        } else if (id == R.id.nav_sendemail) {

            final Intent emailIntent = new Intent(Intent.ACTION_SEND);

            emailIntent.setType("plain/text");
            emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"reesad_phx89@gmail.com"});
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Email Subject : ");
            emailIntent.putExtra(Intent.EXTRA_TEXT, "Kritik dan saran untuk aplikasi Panduan Sholat Khusyuk : ");
            startActivity(Intent.createChooser(emailIntent, "Send mail..."));
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
