package com.ticketmastermobilestudio.mediacompatcrash;

import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat.QueueItem;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class CrashActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crash);

        QueueItem queueItem = getIntent().getExtras().getParcelable(MainActivity.EXTRA_DESCRIPTION);
        ((TextView) findViewById(R.id.text_view)).setText("Succeeded in reading from the bundle with list " + queueItem);
    }
}
