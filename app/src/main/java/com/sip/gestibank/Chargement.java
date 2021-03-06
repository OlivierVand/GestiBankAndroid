package com.sip.gestibank;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;


public class Chargement extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chargement);

        videoView = (VideoView) findViewById(R.id.videoView);

        String uriPath = "android.resource://"+getPackageName()+"/"+R.raw.gestivid;
        Uri uri = Uri.parse(uriPath);
        videoView.setVideoURI(uri);

    }


    @Override
    protected void onResume() {
        super.onResume();
        videoView.start();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run(){
                Intent i = new Intent(getApplicationContext(), MesComptes.class);
                startActivity(i);
            }
        }, 3000);

    }


    @Override
    protected void onPause() {
        super.onPause();
        videoView.suspend();

    }



}