package com.ifa.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class HomeActivity extends AppCompatActivity {

    CardView cvWisata, cvFavorite, cvSetting;
    Locale myLocale;
    TextView tvWisata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        cvWisata = findViewById(R.id.cv_wisata);
        cvFavorite = findViewById(R.id.cv_favorite);
        cvSetting = findViewById(R.id.cv_setting);
        tvWisata = findViewById(R.id.tv_wisata);

        String wisata  = getResources().getString(R.string.txt_wisata);
        tvWisata.setText(wisata);

        cvSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Settings.ACTION_LOCALE_SETTINGS);
                startActivity(mIntent);
            }
        });

        cvFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                setLocal("in");
//                NotificationManager notif=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
//                Notification notify=new Notification.Builder
//                        (getApplicationContext()).setContentTitle("oke").setContentText("oke").
//                        setContentTitle("oke").setSmallIcon(R.drawable.ic_favorite_24dp).build();
//
//                notify.flags |= Notification.FLAG_AUTO_CANCEL;
//                notif.notify(0, notify);
            }

            private void setLocal(String in) {
                myLocale = new Locale(in);
                Resources res = getResources();
                DisplayMetrics dm = res.getDisplayMetrics();
                Configuration conf = res.getConfiguration();
                conf.locale = myLocale;
                res.updateConfiguration(conf, dm);
                Intent intent = new Intent(HomeActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        cvWisata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, ListWisataActivity.class);
                startActivity(i);
            }
        });
    }
}
