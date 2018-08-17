package szp.com.auttoshowmediaplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import szp.com.auttoshowmediaplay.media.IjkVideoView;
import szp.com.auttoshowmediaplay.media.PlayerManager;

public class MainActivity extends AppCompatActivity {

    private IjkVideoView mVideoView;
    private PlayerManager player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mVideoView = (IjkVideoView) findViewById(R.id.video_view);
        mVideoView = this.<IjkVideoView>findViewById(R.id.video_view);

    }
}
