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

public class Sayfa3 extends AppCompatActivity {

    private MediaPlayer sesc1;
    private ImageButton c1;
    private ImageButton c2;
    private ImageButton c3;
    private ImageButton c4;
    private ImageButton c5;
    private ImageButton c6;
    private ImageButton c7;
    private ImageButton c8;
    private ImageButton c9;
    private ImageButton c10;
    private ImageButton c11;
    private ImageButton c12;

    private AdView madview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);//UYUMA ENGELLEME KODU
        setContentView(R.layout.activity_sayfa3);

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

        sesc1 = MediaPlayer.create(Sayfa3.this, R.raw.a1);



        ///////////// SES CALMALAR BURADA OLACAK //////////////////


        c1 = (ImageButton) findViewById(R.id.c1);
        c1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                    /*if (sesc1 != null) {
                        sesc1.stop();
                        sesc1.release();
                    }*/
                    sesc1 = MediaPlayer.create(Sayfa3.this, R.raw.a1);
                    sesc1.start();
                }
                return true;
            }
        });

        c2 = (ImageButton) findViewById(R.id.c2);
        c2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                  /*if (sesc1 != null) {
                        sesc1.stop();
                        sesc1.release();
                    }*/
                    sesc1 = MediaPlayer.create(Sayfa3.this, R.raw.a2);
                    sesc1.start();
                }
                return true;
            }
        });

        c3 = (ImageButton) findViewById(R.id.c3);
        c3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                   /*if (sesc1 != null) {
                        sesc1.stop();
                        sesc1.release();
                    }*/
                    sesc1 = MediaPlayer.create(Sayfa3.this, R.raw.a3);
                    sesc1.start();
                }
                return true;
            }
        });

        c4 = (ImageButton) findViewById(R.id.c4);
        c4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                    /*if (sesc1 != null) {
                        sesc1.stop();
                        sesc1.release();
                    }*/
                    sesc1 = MediaPlayer.create(Sayfa3.this, R.raw.a4);
                    sesc1.start();
                }
                return true;
            }
        });

        c5 = (ImageButton) findViewById(R.id.c5);
        c5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                    /*if (sesc1 != null) {
                        sesc1.stop();
                        sesc1.release();
                    }*/
                    sesc1 = MediaPlayer.create(Sayfa3.this, R.raw.b1);
                    sesc1.start();
                }
                return true;
            }
        });

        c6 = (ImageButton) findViewById(R.id.c6);
        c6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                   /*if (sesc1 != null) {
                        sesc1.stop();
                        sesc1.release();
                    }*/
                    sesc1 = MediaPlayer.create(Sayfa3.this, R.raw.b2);
                    sesc1.start();
                }
                return true;
            }
        });

        c7 = (ImageButton) findViewById(R.id.c7);
        c7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                     /*if (sesc1 != null) {
                        sesc1.stop();
                        sesc1.release();
                    }*/
                    sesc1 = MediaPlayer.create(Sayfa3.this, R.raw.b3);
                    sesc1.start();
                }
                return true;
            }
        });

        c8 = (ImageButton) findViewById(R.id.c8);
        c8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                      /*if (sesc1 != null) {
                        sesc1.stop();
                        sesc1.release();
                    }*/
                    sesc1 = MediaPlayer.create(Sayfa3.this, R.raw.b4);
                    sesc1.start();
                }
                return true;
            }
        });

        c9 = (ImageButton) findViewById(R.id.c9);
        c9.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                     /*if (sesc1 != null) {
                        sesc1.stop();
                        sesc1.release();
                    }*/
                    sesc1 = MediaPlayer.create(Sayfa3.this, R.raw.fx);
                    sesc1.start();
                }
                return true;
            }
        });

        c10 = (ImageButton) findViewById(R.id.c10);
        c10.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                      /*if (sesc1 != null) {
                        sesc1.stop();
                        sesc1.release();
                    }*/
                    sesc1 = MediaPlayer.create(Sayfa3.this, R.raw.hihat);
                    sesc1.start();
                }
                return true;
            }
        });

        c11 = (ImageButton) findViewById(R.id.c11);
        c11.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                     /*if (sesc1 != null) {
                        sesc1.stop();
                        sesc1.release();
                    }*/
                    sesc1 = MediaPlayer.create(Sayfa3.this, R.raw.kick);
                    sesc1.start();
                }
                return true;
            }
        });

        c12 = (ImageButton) findViewById(R.id.c12);
        c12.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                     /*if (sesc1 != null) {
                        sesc1.stop();
                        sesc1.release();
                    }*/
                    sesc1 = MediaPlayer.create(Sayfa3.this, R.raw.snare);
                    sesc1.start();
                }
                return true;
            }
        });


    }
}
