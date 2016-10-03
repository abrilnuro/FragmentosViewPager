package com.example.aimew.fragmentos;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by aimew on 03/10/2016.
 */

public class PagerAdapter extends FragmentPagerAdapter {

    //variable que cuenta el numero de tabs
    int tabCount;

    //constructor
    public PagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                RecyclerFragmentLibro tabLibro = new RecyclerFragmentLibro();
                return tabLibro;
            case 1:
                RecyclerFragmentAutor tabAutor = new RecyclerFragmentAutor();
                return tabAutor;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }


}//class
