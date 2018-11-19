package com.aquio.icban;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class balOne extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener
        , YouTubePlayer.PlaybackEventListener, YouTubePlayer.PlayerStateChangeListener {

    YouTubePlayerView playerView;
    String API_KEY = "AIzaSyAseKJmJjvmdfEZ4Q5yGqnpD4DSdPv8tws";
    String VIDEO_ID = "6PIVgUe6z3E";

    /*********************************************************************************************/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bal_one);
        Log.d("LIFECYCLE", "onCreate() executed");
        playerView = (YouTubePlayerView)findViewById(R.id.playerview);
        playerView.initialize(API_KEY, this);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

        youTubePlayer.setPlayerStateChangeListener(this);
        youTubePlayer.setPlaybackEventListener(this);

        if (!b) {
            youTubePlayer.cueVideo(VIDEO_ID);
        }
    }


    @Override
    public void onPlaying() {

    }

    @Override
    public void onLoaded(String s) {

    }

    @Override
    public void onLoading() {

    }

    @Override
    public void onVideoStarted() {

    }

    @Override
    public void onVideoEnded() {

    }

    @Override
    public void onError(YouTubePlayer.ErrorReason errorReason) {

    }

    @Override
    public void onAdStarted() {

    }

    @Override
    public void onBuffering(boolean b) {

    }

    @Override
    public void onStopped() {

    }

    @Override
    public void onPaused() {

    }

    @Override
    public void onSeekTo(int i) {

    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }

    /*********************************************************************************************/

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LIFECYCLE", "onStart() executed");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LIFECYCLE", "onResume() executed");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("LIFECYCLE", "onPause() event");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LIFECYCLE", "onStop() executed");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("LIFECYCLE", "onDestroy() executed");
    }

    @Override
    public void onRestart() {
        super.onRestart();
        Log.d("LIFECYCLE", "onRestart() event");
    }

    /*********************************************************************************************/

    public void prevAct(View v){
        Intent i = new Intent(this, homeActivity.class);
        startActivity(i);
    }


}
