package com.ticketmastermobilestudio.mediacompatcrash;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaDescriptionCompat.Builder;
import android.support.v4.media.session.MediaSessionCompat.QueueItem;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_DESCRIPTION = "description";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.buttonLaunchActivity).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, CrashActivity.class);
                intent.putExtra(EXTRA_DESCRIPTION, getQueueItem());
                startActivity(intent);
            }
        });
    }

    private QueueItem getQueueItem() {
        MediaDescriptionCompat description = new Builder()
                .setDescription("It's me, Mario")
                .setMediaUri(Uri.parse("http://google.com"))
                .setMediaId(Integer.toString(10))
                .setTitle("title")
                .setSubtitle("subtitle")
                .setIconUri(Uri.parse("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png"))
                .setExtras(new Bundle())
                .build();

        return new QueueItem(description, 1);
    }
}
