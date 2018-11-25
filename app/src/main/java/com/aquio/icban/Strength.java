package com.aquio.icban;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class Strength extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strength);
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

    public void goVideoStr(View v){
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=TGI5TFnY8Ck");
        Intent i = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(i);
    }

    public void goVideoStr2 (View v){
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=C0wGIsdaPwQ");
        Intent i = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(i);
    }

    public void goVideoStr3 (View v){
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=m6Ww8re14Uk");
        Intent i = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(i);
    }

    public void goVideoStr4 (View v){
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=dJlFmxiL11s");
        Intent i = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(i);
    }

}
