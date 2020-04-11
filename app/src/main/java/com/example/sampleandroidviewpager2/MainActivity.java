package com.example.sampleandroidviewpager2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager2   viewPager2   = findViewById(R.id.vp2_main);
        SlideAdapter slideAdapter = new SlideAdapter(this);
        viewPager2.setAdapter(slideAdapter);
    }
}
