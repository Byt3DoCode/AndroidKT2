package com.example.poger;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tab;
    ViewPager pager;
    AdapterViewPager adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tab=findViewById(R.id.tab);
        pager=findViewById(R.id.pager);
        adapter = new AdapterViewPager(getSupportFragmentManager(), 3);
        //pager.setPageTransformer(true,);
        pager.setAdapter(adapter);
        tab.setupWithViewPager(pager);
    }

    @Override
    public void onBackPressed() {
        if(pager.getCurrentItem()>0){
            pager.setCurrentItem(pager.getCurrentItem()-1);
        }else{
            super.onBackPressed();
        }
    }
}