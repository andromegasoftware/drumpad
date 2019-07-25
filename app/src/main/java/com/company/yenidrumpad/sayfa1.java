package com.company.yenidrumpad;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class sayfa1 extends AppCompatActivity {
    private MediaPlayer sesa1;
    private ImageButton a1;
    private ImageButton a2;
    private ImageButton a3;
    private ImageButton a4;
    private ImageButton a5;
    private ImageButton a6;
    private ImageButton a7;
    private ImageButton a8;
    private ImageButton a9;
    private ImageButton a10;
    private ImageButton a11;
    private ImageButton a12;

    private AdView madview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);//UYUMA ENGELLEME KODU
        setContentView(R.layout.activity_sayfa1);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        MobileAds.initialize(this, "ca-app-pub-3206398076180977~5758879718");
        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-3206398076180977/5571177453");

        madview = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        madview.loadAd(adRequest);

        sesa1 = MediaPlayer.create(sayfa1.this, R.raw.a1);



        ///////////// SES CALMALAR BURADA OLACAK //////////////////

        a1 = (ImageButton) findViewById(R.id.a1);

        a1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                   /* if (sesa1 != null) {
                        sesa1.stop();
                        sesa1.release();
                    }*/
                    sesa1 = MediaPlayer.create(sayfa1.this, R.raw.a1);
                    sesa1.start();
                }
                return true;
            }
        });

        a2 = (ImageButton) findViewById(R.id.a2);
        a2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                    /* if (sesa1 != null) {
                        sesa1.stop();
                        sesa1.release();
                    }*/
                    sesa1 = MediaPlayer.create(sayfa1.this, R.raw.a2);
                    sesa1.start();
                }
                return true;
            }
        });

        a3 = (ImageButton) findViewById(R.id.a3);
        a3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                   /* if (sesa1 != null) {
                        sesa1.stop();
                        sesa1.release();
                    }*/
                    sesa1 = MediaPlayer.create(sayfa1.this, R.raw.a3);
                    sesa1.start();
                }
                return true;
            }
        });

        a4 = (ImageButton) findViewById(R.id.a4);
        a4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                   /* if (sesa1 != null) {
                        sesa1.stop();
                        sesa1.release();
                    }*/
                    sesa1 = MediaPlayer.create(sayfa1.this, R.raw.a4);
                    sesa1.start();
                }
                return true;
            }
        });

        a5 = (ImageButton) findViewById(R.id.a5);
        a5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                   /* if (sesa1 != null) {
                        sesa1.stop();
                        sesa1.release();
                    }*/
                    sesa1 = MediaPlayer.create(sayfa1.this, R.raw.b1);
                    sesa1.start();
                }
                return true;
            }
        });

        a6 = (ImageButton) findViewById(R.id.a6);
        a6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                    /* if (sesa1 != null) {
                        sesa1.stop();
                        sesa1.release();
                    }*/
                    sesa1 = MediaPlayer.create(sayfa1.this, R.raw.b2);
                    sesa1.start();
                }
                return true;
            }
        });

        a7 = (ImageButton) findViewById(R.id.a7);
        a7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                   /* if (sesa1 != null) {
                        sesa1.stop();
                        sesa1.release();
                    }*/
                    sesa1 = MediaPlayer.create(sayfa1.this, R.raw.b3);
                    sesa1.start();
                }
                return true;
            }
        });

        a8 = (ImageButton) findViewById(R.id.a8);
        a8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                  /* if (sesa1 != null) {
                        sesa1.stop();
                        sesa1.release();
                    }*/
                    sesa1 = MediaPlayer.create(sayfa1.this, R.raw.b4);
                    sesa1.start();
                }
                return true;
            }
        });

        a9 = (ImageButton) findViewById(R.id.a9);
        a9.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                    /* if (sesa1 != null) {
                        sesa1.stop();
                        sesa1.release();
                    }*/
                    sesa1 = MediaPlayer.create(sayfa1.this, R.raw.fx);
                    sesa1.start();
                }
                return true;
            }
        });

        a10 = (ImageButton) findViewById(R.id.a10);
        a10.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                   /* if (sesa1 != null) {
                        sesa1.stop();
                        sesa1.release();
                    }*/
                    sesa1 = MediaPlayer.create(sayfa1.this, R.raw.hihat);
                    sesa1.start();
                }
                return true;
            }
        });

        a11 = (ImageButton) findViewById(R.id.a11);
        a11.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                    /* if (sesa1 != null) {
                        sesa1.stop();
                        sesa1.release();
                    }*/
                    sesa1 = MediaPlayer.create(sayfa1.this, R.raw.kick);
                    sesa1.start();
                }
                return true;
            }
        });

        a12 = (ImageButton) findViewById(R.id.a12);
        a12.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                    /* if (sesa1 != null) {
                        sesa1.stop();
                        sesa1.release();
                    }*/
                    sesa1 = MediaPlayer.create(sayfa1.this, R.raw.snare);
                    sesa1.start();
                }
                return true;
            }
        });

        ///////////// SES CALMALAR BURADA OLACAK //////////////////
    }
}
