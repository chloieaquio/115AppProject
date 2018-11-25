package com.aquio.icban;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class flexibilityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flexibility);
        Log.d("LIFECYCLE", "onCreate() executed");
    }

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

    /*********************************************************************************************/

    public void goVideoFlex(View v){
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=KJaWIBg15n0");
        Intent i = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(i);
    }

    public void goVideoFlex2 (View v){
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=wUXpigOkBfY");
        Intent i = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(i);
    }

    public void goVideoFlex3 (View v){
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=u_YaHaTg5aE");
        Intent i = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(i);
    }

    public void goVideoFlex4 (View v){
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=9jAyRP0bqKA");
        Intent i = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(i);
    }

}
