package com.example.krishna.prabhupadabhagavadgita;


import android.os.Bundle;
import android.support.v4.app.BundleCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    final int NO_OF_SHLOKAS = 657;//vertical pages
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return NO_OF_SHLOKAS;
    }

    @Override
    public Fragment getItem(int position) {
        ContentFragment contentFragment = new ContentFragment();
        Bundle bundle = new Bundle();
        if(position >=0 && position <=15)
            bundle.putString("parent",String.valueOf(position+1));
        if(position>=16 && position<=18)
            bundle.putString("parent",String.valueOf(position+3));//chnage parent
        if(position>=19 && position<=28)
            bundle.putString("parent",String.valueOf(position+4));//chnage parent
        if(position>=29 && position <=30)
            bundle.putString("parent",String.valueOf(position+7));//chnage parent
        if(position>=31 && position <=38)
            bundle.putString("parent",String.valueOf(position+8));//chnage parent
        if(position>=39 && position <=80)
            bundle.putString("parent",String.valueOf(position+8));//chnage parent
        if(position>=81 && position <=109)//chapter 2 ends
            bundle.putString("parent",String.valueOf(position+9));//chnage parent
        if(position>=110 && position <=152)
            bundle.putString("parent",String.valueOf(position+9));//chnage parent
        if(position>=153 && position <=194)//chapter 4 ends
            bundle.putString("parent",String.valueOf(position+9));//chnage parent
        if(position>=195 && position <=202)
            bundle.putString("parent",String.valueOf(position+9));//chnage parent
        if(position>=203 && position <=220)
            bundle.putString("parent",String.valueOf(position+10));//chnage parent
        if(position>=221 && position <=221)//chapter 5 ends
            bundle.putString("parent",String.valueOf(position+11));//chnage parent
        if(position>=222 && position <=232)//chapter 6 starts
            bundle.putString("parent",String.valueOf(position+11));//chnage parent
        if(position>=233 && position <=233)
            bundle.putString("parent",String.valueOf(position+12));//chnage parent

        if(position>=234 && position <=239)
            bundle.putString("parent",String.valueOf(position+13));//chnage parent---->
        if(position>=240 && position <=263)//chapter 6 ends
            bundle.putString("parent",String.valueOf(position+16));//chnage parent
        if(position>=264 && position <=293)//chapter 7 ends
            bundle.putString("parent",String.valueOf(position+16));//chnage parent
        if(position>=294 && position <=321)//chapter 8 ends
            bundle.putString("parent",String.valueOf(position+16));//chnage parent
        if(position>=322 && position <=355)//chapter 9 ends
            bundle.putString("parent",String.valueOf(position+16));//chnage parent----->
        if(position>=356 && position <=359)//chapter 9 ends
            bundle.putString("parent",String.valueOf(position+16));//chnage parent
        if(position>=360 && position <=366)//chapter 9 ends
            bundle.putString("parent",String.valueOf(position+17));//chnage parent
        if(position>=367 && position <=395)//chapter 10 ends
            bundle.putString("parent",String.valueOf(position+18));//chnage parent
        if(position>=396 && position <=405)//chapter 9 ends
            bundle.putString("parent",String.valueOf(position+18));//chnage parent
        if(position>=406 && position <=420)//chapter 9 ends
            bundle.putString("parent",String.valueOf(position+19));//chnage parent
        if(position>=421 && position <=434)//chapter 9 ends
            bundle.putString("parent",String.valueOf(position+20));//chnage parent
        if(position>=435 && position <=447)//chapter 11 ends
            bundle.putString("parent",String.valueOf(position+21));//chnage parent---->
        if(position>=448 && position <=450)//chapter 11 ends
            bundle.putString("parent",String.valueOf(position+21));//chnage parent
        if(position>=451 && position <=452)//chapter 9 ends
            bundle.putString("parent",String.valueOf(position+22));//chnage parent
        if(position>=453 && position <=458)//chapter 9 ends
            bundle.putString("parent",String.valueOf(position+23));//chnage parent
        if(position>=459 && position <=462)//chapter 9 ends
            bundle.putString("parent",String.valueOf(position+24));//chnage parent
        if(position>=463 && position <=463)//chapter 9 ends
            bundle.putString("parent",String.valueOf(position+25));//chnage parent
        if(position>=464 && position <=464)//chapter 9 ends
            bundle.putString("parent",String.valueOf(position+25));//chnage parent
        if(position>=465 && position <=468)//chapter 9 ends
            bundle.putString("parent",String.valueOf(position+26));//chnage parent
        if(position>=469 && position <=469)//chapter 9 ends
            bundle.putString("parent",String.valueOf(position+27));//chnage parent
        if(position>=470 && position <=492)//chapter 9 ends
            bundle.putString("parent",String.valueOf(position+31));//chnage parent
        if(position>=493 && position <=514)//chapter 9 ends
            bundle.putString("parent",String.valueOf(position+31));//chnage parent
        if(position>=515 && position <=516)//chapter 9 ends
            bundle.putString("parent",String.valueOf(position+34));//chnage parent
        if(position>=517 && position <=519)//chapter 9 ends
            bundle.putString("parent",String.valueOf(position+34));//chnage parent
        if(position>=520 && position <=535)//chapter 15 ends
            bundle.putString("parent",String.valueOf(position+35));//chnage parent
        if(position>=536 && position <=536)//chapter 9 ends
            bundle.putString("parent",String.valueOf(position+35));//chnage parent
        if(position>=537 && position <=544)//chapter 9 ends
            bundle.putString("parent",String.valueOf(position+37));//chnage parent
        if(position>=545 && position <=545)//chapter 9 ends
            bundle.putString("parent",String.valueOf(position+38));//chnage parent
        if(position>=546 && position <=554)//chapter 16 ends
            bundle.putString("parent",String.valueOf(position+40));//chnage parent
        if(position>=555 && position <=559)//chapter 9 ends
            bundle.putString("parent",String.valueOf(position+40));//chnage parent
        if(position>=560 && position <=579)//chapter 9 ends
            bundle.putString("parent",String.valueOf(position+41));//chnage parent
        if(position>=580 && position <=580)//chapter 9 ends
            bundle.putString("parent",String.valueOf(position+42));//chnage parent
        if(position>=581 && position <=631)//chapter 9 ends
            bundle.putString("parent",String.valueOf(position+42));//chnage parent
        if(position>=632 && position <=656)//chapter 18 ends
            bundle.putString("parent",String.valueOf(position+44));//chnage parent


        contentFragment.setHasOptionsMenu(true);
        contentFragment.setArguments(bundle);
        return contentFragment;
    }
}
