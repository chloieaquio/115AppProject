package com.aquio.icban;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class homeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
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

    /**********************************************************************************************/

    public void aeroAct(View v){
        Intent i = new Intent(this, Aerobics.class);
        startActivity(i);
    }

    public void strengthAct(View v){
        Intent i = new Intent(this, Strength.class);
        startActivity(i);
    }

    public void balAct(View v){
        Intent i = new Intent(this, balanceActivity.class);
        startActivity(i);
    }

    public void flexAct(View v){
        Intent i = new Intent(this, flexibilityActivity.class);
        startActivity(i);
    }

    public void seriesAct(View v){
        Intent i = new Intent(this, seriesActivity.class);
        startActivity(i);
    }

}
