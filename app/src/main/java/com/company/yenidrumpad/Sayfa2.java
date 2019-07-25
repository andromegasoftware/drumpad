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

public class Sayfa2 extends AppCompatActivity {
    private MediaPlayer sesb1;
    private ImageButton b1;
    private ImageButton b2;
    private ImageButton b3;
    private ImageButton b4;
    private ImageButton b5;
    private ImageButton b6;
    private ImageButton b7;
    private ImageButton b8;
    private ImageButton b9;
    private ImageButton b10;
    private ImageButton b11;
    private ImageButton b12;

    private AdView madview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);//UYUMA ENGELLEME KODU
        setContentView(R.layout.activity_sayfa2);

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

        sesb1 = MediaPlayer.create(Sayfa2.this, R.raw.a1);



        b1 = (ImageButton) findViewById(R.id.b1);
        b1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                   /* if (sesb1 != null) {
                        sesb1.stop();
                        sesb1.release();
                    }*/
                    sesb1 = MediaPlayer.create(Sayfa2.this, R.raw.a11);
                    sesb1.start();
                }
                return true;
            }
        });

        b2 = (ImageButton) findViewById(R.id.b2);
        b2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                    /*if (sesb1 != null) {
                        sesb1.stop();
                        sesb1.release();
                    }*/
                    sesb1 = MediaPlayer.create(Sayfa2.this, R.raw.a21);
                    sesb1.start();
                }
                return true;
            }
        });

        b3 = (ImageButton) findViewById(R.id.b3);
        b3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                   /* if (sesb1 != null) {
                        sesb1.stop();
                        sesb1.release();
                    }*/
                    sesb1 = MediaPlayer.create(Sayfa2.this, R.raw.a31);
                    sesb1.start();
                }
                return true;
            }
        });

        b4 = (ImageButton) findViewById(R.id.b4);
        b4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                   /* if (sesb1 != null) {
                        sesb1.stop();
                        sesb1.release();
                    }*/
                    sesb1 = MediaPlayer.create(Sayfa2.this, R.raw.a41);
                    sesb1.start();
                }
                return true;
            }
        });

        b5 = (ImageButton) findViewById(R.id.b5);
        b5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                   /* if (sesb1 != null) {
                        sesb1.stop();
                        sesb1.release();
                    }*/
                    sesb1 = MediaPlayer.create(Sayfa2.this, R.raw.b11);
                    sesb1.start();
                }
                return true;
            }
        });

        b6 = (ImageButton) findViewById(R.id.b6);
        b6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                    /* if (sesb1 != null) {
                        sesb1.stop();
                        sesb1.release();
                    }*/
                    sesb1 = MediaPlayer.create(Sayfa2.this, R.raw.b21);
                    sesb1.start();
                }
                return true;
            }
        });

        b7 = (ImageButton) findViewById(R.id.b7);
        b7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                    /* if (sesb1 != null) {
                        sesb1.stop();
                        sesb1.release();
                    }*/
                    sesb1 = MediaPlayer.create(Sayfa2.this, R.raw.b31);
                    sesb1.start();
                }
                return true;
            }
        });

        b8 = (ImageButton) findViewById(R.id.b8);
        b8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                    /* if (sesb1 != null) {
                        sesb1.stop();
                        sesb1.release();
                    }*/
                    sesb1 = MediaPlayer.create(Sayfa2.this, R.raw.b41);
                    sesb1.start();
                }
                return true;
            }
        });

        b9 = (ImageButton) findViewById(R.id.b9);
        b9.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                 /* if (sesb1 != null) {
                        sesb1.stop();
                        sesb1.release();
                    }*/
                    sesb1 = MediaPlayer.create(Sayfa2.this, R.raw.fx1);
                    sesb1.start();
                }
                return true;
            }
        });

        b10 = (ImageButton) findViewById(R.id.b10);
        b10.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                    /* if (sesb1 != null) {
                        sesb1.stop();
                        sesb1.release();
                    }*/
                    sesb1 = MediaPlayer.create(Sayfa2.this, R.raw.hihat1);
                    sesb1.start();
                }
                return true;
            }
        });

        b11 = (ImageButton) findViewById(R.id.b11);
        b11.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                   /* if (sesb1 != null) {
                        sesb1.stop();
                        sesb1.release();
                    }*/
                    sesb1 = MediaPlayer.create(Sayfa2.this, R.raw.kick1);
                    sesb1.start();
                }
                return true;
            }
        });

        b12 = (ImageButton) findViewById(R.id.b12);
        b12.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {

                    /* if (sesb1 != null) {
                        sesb1.stop();
                        sesb1.release();
                    }*/
                    sesb1 = MediaPlayer.create(Sayfa2.this, R.raw.snare1);
                    sesb1.start();
                }
                return true;
            }
        });

        ///////////// SES CALMALAR BURADA OLACAK //////////////////

    }
}
