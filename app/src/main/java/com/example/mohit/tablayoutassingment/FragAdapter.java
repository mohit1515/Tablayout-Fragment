package com.example.mohit.tablayoutassingment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class FragAdapter extends FragmentStatePagerAdapter {
    private int count;

    public FragAdapter(FragmentManager fm, int count) {
        super(fm);
        this.count = count;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                FragOne fone = new FragOne();
                return fone;
            case 1:
                FragTwo ftwo = new FragTwo();
                return ftwo;

            case 2:
                FragThree fthree = new FragThree();
                return fthree;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return count;
    }
}
