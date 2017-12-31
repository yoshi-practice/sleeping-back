package com.example.owner.voicetalk;


import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void movejp(View v){
        Intent intent = new Intent(this,JapaneseActivity.class);
        startActivity(intent);
    }
    public void moveen(View v){
        Intent intent = new Intent(this,EnglishActivity.class);
        startActivity(intent);
    }
    public void movechn(View v){
        Intent intent = new Intent(this,ChineseActivity.class);
        startActivity(intent);
    }
    public void movekor(View v){
        Intent intent = new Intent(this,KoreanActivity.class);
        startActivity(intent);
    }
    public void movefre(View v){
        Intent intent = new Intent(this,FranceActivity.class);
        startActivity(intent);
    }
    public void movegerman(View v){
        Intent intent = new Intent(this,GermanActivity.class);
        startActivity(intent);
    }
}

