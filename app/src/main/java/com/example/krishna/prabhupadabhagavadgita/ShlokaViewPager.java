package com.example.krishna.prabhupadabhagavadgita;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class ShlokaViewPager extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_pager);

     //   ViewPager pager = (ViewPager) findViewById(R.id.pager);
      //  pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public android.support.v4.app.Fragment getItem(int pos) {
            switch (pos) {
                case 0:
                    return FragmentViewPager.newInstance(getString(R.string.title_section1), R.drawable.rock);
                case 1:
                    return FragmentViewPager.newInstance(getString(R.string.title_section2), R.drawable.paper);
                case 2:
                    return FragmentViewPager.newInstance(getString(R.string.title_section3), R.drawable.scissors);
                default:
                    return FragmentViewPager.newInstance(getString(R.string.title_section1), R.drawable.rock);
            }
        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}

