package com.example.android.cookies;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


//    public void doOver(View view) {
//        // TODO: Find a reference to the ImageView in the layout. Change the image.
//        // @+id/android_cookie_image_view
//        ImageView cookieImageView = (ImageView) findViewById(R.id.android_cookie_image_view);
//        cookieImageView.setImageResource(R.drawable.before_cookie);
//
//        // TODO: Find a reference to the TextView in the layout. Change the text.
//        // @+id/status_text_view
//
//        TextView msgTextView = (TextView) findViewById(R.id.status_text_view);
//        msgTextView.setText("I'm so Hungry.");
//
//        Log.i("Cookies.java", "End of doOver()");
//
//    }

    public void doCowSound(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.cow_and_bell);
        mediaPlayer.start(); // no need to call prepare(); create() does that for you
        TextView msgTextView = (TextView) findViewById(R.id.status_text_view);
        msgTextView.setText("COW");
    }

    public void doCatSound(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.cat);
        mediaPlayer.start(); // no need to call prepare(); create() does that for you
        TextView msgTextView = (TextView) findViewById(R.id.status_text_view);
        msgTextView.setText("CAT");
    }

    public void doDogSound(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.dog3);
        mediaPlayer.start(); // no need to call prepare(); create() does that for you
        TextView msgTextView = (TextView) findViewById(R.id.status_text_view);
        msgTextView.setText("DOG");
    }

    public void doRoosterSound(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.rooster);
        mediaPlayer.start(); // no need to call prepare(); create() does that for you
        TextView msgTextView = (TextView) findViewById(R.id.status_text_view);
        msgTextView.setText("ROOSTER");
    }

    public void doDuckSound(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.duck);
        mediaPlayer.start(); // no need to call prepare(); create() does that for you
        TextView msgTextView = (TextView) findViewById(R.id.status_text_view);
        msgTextView.setText("DUCK");
    }

    public void doLambSound(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.lamb2);
        mediaPlayer.start(); // no need to call prepare(); create() does that for you
        TextView msgTextView = (TextView) findViewById(R.id.status_text_view);
        msgTextView.setText("LAMB");
    }
}