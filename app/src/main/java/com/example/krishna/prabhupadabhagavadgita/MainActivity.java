package com.example.krishna.prabhupadabhagavadgita;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


import com.google.firebase.FirebaseApp;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    public ViewPagerAdapter viewPagerAdapter;
    public static Toolbar toolbar;
    public VerticalViewPager viewPager;
    Session sess;
    private DrawerLayout mDrawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  FirebaseDatabase.getInstance().setPersistenceEnabled(true);
        setContentView(R.layout.view_pager);

     //   Firebase.setAndroidContext(this);
        VerticalViewPager viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(new SlidePageAdapter(this));
      //  toolbar = findViewById(R.id.toolbar);


        //setSupportActionBar(toolbar);
        sess=Session.getSessionObj();
        sess.setToolBarInstance(toolbar);
    //    ActionBar actionbar = getSupportActionBar();
     //   actionbar.setDisplayHomeAsUpEnabled(true);
      //  actionbar.setHomeAsUpIndicator(R.drawable.ic_menu);
        mDrawerLayout = findViewById(R.id.drawer);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        // set item as selected to persist highlight
                        menuItem.setChecked(true);
                        // close drawer when item is tapped
                        mDrawerLayout.closeDrawers();

                        // Add code here to update the UI based on the item selected
                        // For example, swap UI fragments here

                        return true;
                    }
                });

        mDrawerLayout.addDrawerListener(
                new DrawerLayout.DrawerListener() {
                    @Override
                    public void onDrawerSlide(View drawerView, float slideOffset) {
                        // Respond when the drawer's position changes
                    }

                    @Override
                    public void onDrawerOpened(View drawerView) {
                        // Respond when the drawer is opened
                    }

                    @Override
                    public void onDrawerClosed(View drawerView) {
                        // Respond when the drawer is closed
                    }

                    @Override
                    public void onDrawerStateChanged(int newState) {
                        // Respond when the drawer motion state changes
                    }
                }
        );
     //   Firebase myFirebaseRef = new Firebase("https://prabhupadabhagavadgita.firebaseio.com/");


   //     final DatabaseReference database = FirebaseDatabase.getInstance().getReference();


     //   DatabaseReference refd=database.child("Chapter1").child("ObservingtheArmiesontheBattle").child("TEXT1");
      //  refd.keepSynced(true);
    //    final Query query=refd;
//        query.addChildEventListener(new ChildEventListener() {
//            @Override
//            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
//                if (dataSnapshot.getValue() != null) {
//                //   Verse obj= dataSnapshot.getValue(Verse.class);
//                //   System.out.println(obj.getShloka());
//                }
//                    Log.d("Logs", "I got hit !!!");
//            }
//
//            @Override
//            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
//
//            }
//
//            @Override
//            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {
//
//            }
//
//            @Override
//            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
//
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });



        initViewPager();
    }

    public static Toolbar getToolbar() {
        return toolbar;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public static RetainFragment findOrCreateRetainFragment(FragmentManager fm) {
// Check to see if we have retained the worker fragment.
        RetainFragment mRetainFragment = (RetainFragment)fm.findFragmentByTag("Retain");
// If not retained (or first time running), we need to create and add it.
        if (mRetainFragment == null) {
            mRetainFragment = new RetainFragment();
            fm.beginTransaction().add(mRetainFragment, "Retain").commitAllowingStateLoss();
        }
        return mRetainFragment;
    }

    public void initViewPager(){
        viewPager = (VerticalViewPager) findViewById(R.id.viewPager);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        sess=null;
    }
}


