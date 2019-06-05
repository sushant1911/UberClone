package com.example.user.uberclone;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final VideoView videoview = findViewById(R.id.videoView);
        videoview.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                mp.setVolume(0, 0);
                videoview.start();
                videoview.resume();
                //need to make transition seamless.
            }
        });
        Uri uri = Uri.parse("android.resource://" + "com.example.user.uberclone" + "/" + R.raw.test);
        videoview.setVideoURI(uri);
        videoview.start();

        ImageView login = (ImageView) findViewById(R.id.Login);
        ImageView sigin = (ImageView) findViewById(R.id.Sigin);
    login.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent inten=new Intent(MainActivity.this,LoginPage.class);
            startActivity(inten);
            finish();
        }
    });
        sigin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RegistratonActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}
