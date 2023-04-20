package com.example.poger;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.poger.fragments.Fragment1;
import com.example.poger.fragments.Fragment2;
import com.example.poger.fragments.Fragment3;

public class AdapterViewPager extends FragmentPagerAdapter {
    private int numPage;
    public AdapterViewPager(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        numPage = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:return new Fragment1();
            case 1:return new Fragment2();
            case 2:return new Fragment3();
        }
        return new Fragment1();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:return "Food";
            case 1:return "Movie";
            case 2:return "Travel";
        }
        return "Food";
    }

    @Override
    public int getCount() {
        return numPage;
    }
}
