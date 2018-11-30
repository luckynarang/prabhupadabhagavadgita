package com.example.krishna.prabhupadabhagavadgita;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.ActionBar;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
//import android.widget.Toolbar;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.AppCompatActivity;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class ChildFragment extends Fragment {
    TextView tvParent,tvChild;
    Session sess;
    Toolbar toolbar;
    DatabaseReference database;
    DatabaseReference refd;//=database.child("Chapter1").child("ObservingtheArmiesontheBattle").child("TEXT1");
    String shloka;
    String purport;
    String translation;
    public ChildFragment() {
        // Required empty public constructor
    }
    private void getreferencechapter(String fragment_no)
    {
        sess=Session.getSessionObj();

        if(Integer.parseInt(fragment_no) >= 1 && Integer.parseInt(fragment_no)<=46)
        {

        //    sess.getToolBarInstance().setTitle("Chapter 1");
         //   sess.getToolBarInstance().setSubtitle("Shloka"+" "+fragment_no);
          //  MainActivity.getToolbar().setTitle("Chapter 1");
         //   MainActivity.getToolbar().setSubtitle("Shloka"+" "+fragment_no);
              toolbar.setTitle("Chapter 1");
               toolbar.setSubtitle("Shloka"+" "+fragment_no);


            if(database!=null) {
                int frag_no=Integer.parseInt(fragment_no);
                if(frag_no>=0 && frag_no<=15)
                    refd = database.child("Chapter 1").child("Observing the Armies on the Battleﬁeld of Kurukṣetra").child("TEXT" + " " + fragment_no);
                else if(frag_no==16)
                    refd = database.child("Chapter 1").child("Observing the Armies on the Battleﬁeld of Kurukṣetra").child("TEXT"+" "+fragment_no+" - "+"TEXT "+"18");
                else if(frag_no>=19 && frag_no<=20)
                    refd = database.child("Chapter 1").child("Observing the Armies on the Battleﬁeld of Kurukṣetra").child("TEXT" + " " + fragment_no);
                else if(frag_no==21)
                    refd = database.child("Chapter 1").child("Observing the Armies on the Battleﬁeld of Kurukṣetra").child("TEXT"+" "+fragment_no+"- "+"TEXT "+"22");
                if(frag_no>=23 && frag_no<=31)
                    refd = database.child("Chapter 1").child("Observing the Armies on the Battleﬁeld of Kurukṣetra").child("TEXT" + " " + fragment_no);
                else if(frag_no==32)
                    refd = database.child("Chapter 1").child("Observing the Armies on the Battleﬁeld of Kurukṣetra").child("TEXT"+" "+fragment_no+"- "+"TEXT "+"35");
                else if(frag_no==36)
                    refd = database.child("Chapter 1").child("Observing the Armies on the Battleﬁeld of Kurukṣetra").child("TEXT" + " " + fragment_no);
                else if(frag_no==37)
                    refd = database.child("Chapter 1").child("Observing the Armies on the Battleﬁeld of Kurukṣetra").child("TEXT"+" "+fragment_no+" - "+"TEXT "+"38");
                else if(frag_no>=39 && frag_no<=46)
                    refd = database.child("Chapter 1").child("Observing the Armies on the Battleﬁeld of Kurukṣetra").child("TEXT" + " " + fragment_no);



            }
        }
        else if(Integer.parseInt(fragment_no) >= 119 && Integer.parseInt(fragment_no)<=161) {//chapter 3
            sess.getToolBarInstance().setTitle("Chapter 3");

            if (database != null) {
                int frag_no=Integer.parseInt(fragment_no);

                int actual_shloka_no=frag_no-119+1;
                sess.getToolBarInstance().setSubtitle("Shloka"+" "+actual_shloka_no);
                if (frag_no >= 119 && frag_no <=161)
                    refd = database.child("Chapter 3").child("Karma Yoga").child("TEXT" + " " + actual_shloka_no);

            }
        }
        else if(Integer.parseInt(fragment_no) >= 162 && Integer.parseInt(fragment_no)<=203) { //chapter 4
            sess.getToolBarInstance().setTitle("Chapter 4");
            if (database != null) {
                int frag_no=Integer.parseInt(fragment_no);
                int actual_shloka_no=frag_no-162+1;
                sess.getToolBarInstance().setSubtitle("Shloka"+" "+actual_shloka_no);
                if (frag_no >= 162 && frag_no <=203)
                    refd = database.child("Chapter 4").child("Transcendental Knowledge").child("TEXT" + " " + actual_shloka_no);
            }
        }
        else if(Integer.parseInt(fragment_no) >= 204 && Integer.parseInt(fragment_no)<=232) {//chapter 5 ends
            sess.getToolBarInstance().setTitle("Chapter 5");
            if (database != null) {
                int frag_no=Integer.parseInt(fragment_no);
                int actual_shloka_no=frag_no-204+1;
                sess.getToolBarInstance().setSubtitle("Shloka"+" "+actual_shloka_no);
                if (frag_no >= 204 && frag_no <=210)
                    refd = database.child("Chapter 5").child("Karma-yoga – Action in Kṛṣṇa Consciousness").child("TEXT" + " " + actual_shloka_no);
                else if(frag_no==211)
                    refd = database.child("Chapter 5").child("Karma-yoga – Action in Kṛṣṇa Consciousness").child("TEXT"+" "+actual_shloka_no+" - "+"9");
                else if(frag_no>=212 && frag_no <=229)
                    refd = database.child("Chapter 5").child("Karma-yoga – Action in Kṛṣṇa Consciousness").child("TEXT" + " " + actual_shloka_no);
                else if(frag_no==230)
                    refd = database.child("Chapter 5").child("Karma-yoga – Action in Kṛṣṇa Consciousness").child("TEXT"+" "+actual_shloka_no+" - "+"28");
                else if(frag_no>=231 && frag_no <=232)
                    refd = database.child("Chapter 5").child("Karma-yoga – Action in Kṛṣṇa Consciousness").child("TEXT" + " " + actual_shloka_no);

            }
        }
        else if(Integer.parseInt(fragment_no) >= 233 && Integer.parseInt(fragment_no)<=279  ) {//chapter 6 ends
            sess.getToolBarInstance().setTitle("Chapter 6");
            if (database != null) {
                int frag_no=Integer.parseInt(fragment_no);

                int actual_shloka_no=frag_no-233+1;
                sess.getToolBarInstance().setSubtitle("Shloka"+" "+actual_shloka_no);
                if (frag_no >= 233 && frag_no <=242)
                    refd = database.child("Chapter 6").child("Dhyāna-yoga").child("TEXT" + " " + actual_shloka_no);
                else if(frag_no==243)
                    refd = database.child("Chapter 6").child("Dhyāna-yoga").child("TEXT"+" "+actual_shloka_no+" - "+"12");
                else if(frag_no>=244 && frag_no <=244)
                    refd = database.child("Chapter 6").child("Dhyāna-yoga").child("TEXT" + " " + actual_shloka_no);
                else if(frag_no==245)
                    refd = database.child("Chapter 6").child("Dhyāna-yoga").child("TEXT"+" "+actual_shloka_no+" - "+"14");
                else if(frag_no>=246 && frag_no <=251)
                    refd = database.child("Chapter 6").child("Dhyāna-yoga").child("TEXT" + " " + actual_shloka_no);
                else if(frag_no==252)
                    refd = database.child("Chapter 6").child("Dhyāna-yoga").child("TEXT"+" "+actual_shloka_no+" - "+"23");
                else if(frag_no>=254 && frag_no <=279)
                    refd = database.child("Chapter 6").child("Dhyāna-yoga").child("TEXT" + " " + actual_shloka_no);

            }
        }
        else if(Integer.parseInt(fragment_no) >= 280 && Integer.parseInt(fragment_no)<=309) {//chapter 7 ends
            sess.getToolBarInstance().setTitle("Chapter 7");
            if (database != null) {
                int frag_no=Integer.parseInt(fragment_no);

                int actual_shloka_no=frag_no-280+1;
                sess.getToolBarInstance().setSubtitle("Shloka"+" "+actual_shloka_no);
                if (frag_no >= 280 && frag_no <=309)
                    refd = database.child("Chapter 7").child("Knowledge of the Absolute").child("TEXT" + " " + actual_shloka_no);

            }
        }
        else if(Integer.parseInt(fragment_no) >= 310 && Integer.parseInt(fragment_no)<=337) {//chapter 8 ends
            sess.getToolBarInstance().setTitle("Chapter 8");
            if (database != null) {
                int frag_no=Integer.parseInt(fragment_no);

                int actual_shloka_no=frag_no-310+1;
                sess.getToolBarInstance().setSubtitle("Shloka"+" "+actual_shloka_no);
                if (frag_no >= 310 && frag_no <=337)
                    refd = database.child("Chapter 8").child("Attaining the Supreme").child("TEXT" + " " + actual_shloka_no);

            }
        }
        else if(Integer.parseInt(fragment_no) >= 338 && Integer.parseInt(fragment_no)<=371) {//chapter 9 ends
            sess.getToolBarInstance().setTitle("Chapter 9");
            if (database != null) {
                int frag_no=Integer.parseInt(fragment_no);

                int actual_shloka_no=frag_no-338+1;
                sess.getToolBarInstance().setSubtitle("Shloka"+" "+actual_shloka_no);
                if (frag_no >= 338 && frag_no <=371)
                    refd = database.child("Chapter 9").child("The Most Conﬁdential Knowledge").child("TEXT" + " " + actual_shloka_no);

            }
        }
        else if(Integer.parseInt(fragment_no) >= 372 && Integer.parseInt(fragment_no)<=413) {//chapter 10 ends
            sess.getToolBarInstance().setTitle("Chapter 10");
            if (database != null) {
                int frag_no=Integer.parseInt(fragment_no);

                int actual_shloka_no=frag_no-372+1;
                sess.getToolBarInstance().setSubtitle("Shloka"+" "+actual_shloka_no);
                if (frag_no >= 372 && frag_no <=374)
                    refd = database.child("Chapter 10").child("The Opulence of the Absolute").child("TEXT" + " " + actual_shloka_no);
                else if(frag_no==375)
                    refd = database.child("Chapter 10").child("The Opulence of the Absolute").child("TEXT"+" "+actual_shloka_no+" - "+"5");
                else if (frag_no >= 376 && frag_no <=382)
                    refd = database.child("Chapter 10").child("The Opulence of the Absolute").child("TEXT" + " " + actual_shloka_no);
                else if (frag_no == 383)
                    refd = database.child("Chapter 10").child("The Opulence of the Absolute").child("TEXT"+" "+actual_shloka_no+" - "+"13");
                else if (frag_no >= 384 && frag_no <=413)
                    refd = database.child("Chapter 10").child("The Opulence of the Absolute").child("TEXT" + " " + actual_shloka_no);

            }
        }
        else if(Integer.parseInt(fragment_no) >= 414 && Integer.parseInt(fragment_no)<=468) {//chapter 11 ends
            sess.getToolBarInstance().setTitle("Chapter 11");
            if (database != null) {
                int frag_no=Integer.parseInt(fragment_no);

                int actual_shloka_no=frag_no-414+1;
                sess.getToolBarInstance().setSubtitle("Shloka"+" "+actual_shloka_no);
                if (frag_no >= 414 && frag_no <=422)
                    refd = database.child("Chapter 11").child("The Universal Form").child("TEXT" + " " + actual_shloka_no);
                else if(frag_no==423)
                    refd = database.child("Chapter 11").child("The Universal Form").child("TEXT"+" "+actual_shloka_no+" - "+"11");
                else if(frag_no>=424 && frag_no <=438)
                    refd = database.child("Chapter 11").child("The Universal Form").child("TEXT" + " " + actual_shloka_no);
                else if(frag_no==439)
                    refd = database.child("Chapter 11").child("The Universal Form").child("TEXT"+" "+actual_shloka_no+" - "+"27");
                else if(frag_no>=440 && frag_no <=453)
                    refd = database.child("Chapter 11").child("The Universal Form").child("TEXT" + " " + actual_shloka_no);
                else if(frag_no==454)
                    refd = database.child("Chapter 11").child("The Universal Form").child("TEXT"+" "+actual_shloka_no+" - "+"42");
                else if(frag_no>=455 && frag_no <=468)
                    refd = database.child("Chapter 11").child("The Universal Form").child("TEXT" + " " + actual_shloka_no);

            }
        }
        else if(Integer.parseInt(fragment_no) >= 469 && Integer.parseInt(fragment_no)<=488) {//chapter 12 ends
            sess.getToolBarInstance().setTitle("Chapter 12");
            if (database != null) {
                int frag_no=Integer.parseInt(fragment_no);

                int actual_shloka_no=frag_no-469+1;
                sess.getToolBarInstance().setSubtitle("Shloka"+" "+actual_shloka_no);
                if (frag_no >= 469 && frag_no <=470)
                    refd = database.child("Chapter 12").child("Devotional Service").child("TEXT" + " " + actual_shloka_no);
                else if(frag_no==471)
                    refd = database.child("Chapter 12").child("Devotional Service").child("TEXT"+" "+actual_shloka_no+" - "+"4");
                else if(frag_no>=472 && frag_no <=473)
                    refd = database.child("Chapter 12").child("Devotional Service").child("TEXT" + " " + actual_shloka_no);
                else if(frag_no==474)
                    refd = database.child("Chapter 12").child("Devotional Service").child("TEXT"+" "+actual_shloka_no+" - "+"7");
                else if(frag_no>=475 && frag_no <=480)
                    refd = database.child("Chapter 12").child("Devotional Service").child("TEXT" + " " + actual_shloka_no);
                else if(frag_no==481)
                    refd = database.child("Chapter 12").child("Devotional Service").child("TEXT"+" "+actual_shloka_no+" -"+"14");
                else if(frag_no>=482 && frag_no <=485)
                    refd = database.child("Chapter 12").child("Devotional Service").child("TEXT" + " " + actual_shloka_no);
                else if(frag_no==486)
                    refd = database.child("Chapter 12").child("Devotional Service").child("TEXT"+" "+actual_shloka_no+"- "+"19");
                else if(frag_no>=487 && frag_no <=488)
                    refd = database.child("Chapter 12").child("Devotional Service").child("TEXT" + " " + actual_shloka_no);

            }
        }
        else if(Integer.parseInt(fragment_no) >= 489 && Integer.parseInt(fragment_no)<=523) {//chapter 13 ends
            sess.getToolBarInstance().setTitle("Chapter 13");
            if (database != null) {
                int frag_no=Integer.parseInt(fragment_no);

                int actual_shloka_no=frag_no-489+1;
                sess.getToolBarInstance().setSubtitle("Shloka"+" "+actual_shloka_no);
                if (frag_no >= 489 && frag_no <=489)
                    refd = database.child("Chapter 13").child("Nature, the Enjoyer and Consciousness").child("TEXT"+" "+actual_shloka_no+" - "+"2");
                else if(frag_no>=490 && frag_no <=493)
                    refd = database.child("Chapter 13").child("Nature, the Enjoyer and Consciousness").child("TEXT" + " " + actual_shloka_no);
                else if(frag_no==494)
                    refd = database.child("Chapter 13").child("Nature, the Enjoyer and Consciousness").child("TEXT"+" "+actual_shloka_no+" - "+"7");
                else if(frag_no>=495 && frag_no <=495)
                    refd = database.child("Chapter 13").child("Nature, the Enjoyer and Consciousness").child("TEXT" + " " + actual_shloka_no);
                else if(frag_no==496)
                    refd = database.child("Chapter 13").child("Nature, the Enjoyer and Consciousness").child("TEXT"+" "+actual_shloka_no+" - "+"12");
                else if(frag_no>=499 && frag_no <=523)
                    refd = database.child("Chapter 13").child("Nature, the Enjoyer and Consciousness").child("TEXT" + " " + actual_shloka_no);

            }
        }
        else if(Integer.parseInt(fragment_no) >= 524 && Integer.parseInt(fragment_no)<=550) {//chapter 14 ends
            sess.getToolBarInstance().setTitle("Chapter 14");
            if (database != null) {
                int frag_no=Integer.parseInt(fragment_no);

                int actual_shloka_no=frag_no-524+1;
                sess.getToolBarInstance().setSubtitle("Shloka"+" "+actual_shloka_no);
                if (frag_no >= 524 && frag_no <=544)
                    refd = database.child("Chapter 14").child("The Three Modes of Material Nature").child("TEXT" + " " + actual_shloka_no);
                else if(frag_no==545)
                    refd = database.child("Chapter 14").child("The Three Modes of Material Nature").child("TEXT"+" "+actual_shloka_no+" - "+"25");
                else if(frag_no>=548 && frag_no <=550)
                    refd = database.child("Chapter 14").child("The Three Modes of Material Nature").child("TEXT" + " " + actual_shloka_no);


            }
        }
        else if(Integer.parseInt(fragment_no) >= 551 && Integer.parseInt(fragment_no)<=570) {//chapter 15 ends
            sess.getToolBarInstance().setTitle("Chapter 15");
            if (database != null) {
                int frag_no=Integer.parseInt(fragment_no);

                int actual_shloka_no=frag_no-551+1;
                sess.getToolBarInstance().setSubtitle("Shloka"+" "+actual_shloka_no);
                if (frag_no >= 551 && frag_no <=552)
                    refd = database.child("Chapter 15").child("The Yoga of the Supreme Person").child("TEXT" + " " + actual_shloka_no);
                else if(frag_no==553)
                    refd = database.child("Chapter 15").child("The Yoga of the Supreme Person").child("TEXT"+" "+actual_shloka_no+" - "+"4");
                else if(frag_no>=554 && frag_no <=570)
                    refd = database.child("Chapter 15").child("The Yoga of the Supreme Person").child("TEXT" + " " + actual_shloka_no);

            }
        }
        else if(Integer.parseInt(fragment_no) >= 571 && Integer.parseInt(fragment_no)<=594) {//chapter 16 ends
            sess.getToolBarInstance().setTitle("Chapter 16");
            if (database != null) {
                int frag_no=Integer.parseInt(fragment_no);

                int actual_shloka_no=frag_no-571+1;
                sess.getToolBarInstance().setSubtitle("Shloka"+" "+actual_shloka_no);
                if (frag_no >= 571 && frag_no <=571)
                    refd = database.child("Chapter 16").child("The Divine and Demoniac Natures").child("TEXT"+" "+actual_shloka_no+" - "+"3");
                else if(frag_no>=573 && frag_no <=580)
                    refd = database.child("Chapter 16").child("The Divine and Demoniac Natures").child("TEXT" + " " + actual_shloka_no);
                else if(frag_no==581)
                    refd = database.child("Chapter 16").child("The Divine and Demoniac Natures").child("TEXT"+" "+actual_shloka_no+" - "+"12");
                else if(frag_no>=582 && frag_no <=582)
                    refd = database.child("Chapter 16").child("The Divine and Demoniac Natures").child("TEXT" + " " + actual_shloka_no);
                else if(frag_no==583)
                    refd = database.child("Chapter 16").child("The Divine and Demoniac Natures").child("TEXT"+" "+actual_shloka_no+" - "+"15");
                else if(frag_no>=584 && frag_no <=594)
                    refd = database.child("Chapter 16").child("The Divine and Demoniac Natures").child("TEXT" + " " + actual_shloka_no);

            }
        }
        else if(Integer.parseInt(fragment_no) >= 595 && Integer.parseInt(fragment_no)<=622) {//chapter 17 ends
            sess.getToolBarInstance().setTitle("Chapter 17");
            if (database != null) {
                int frag_no=Integer.parseInt(fragment_no);

                int actual_shloka_no=frag_no-595+1;
                sess.getToolBarInstance().setSubtitle("Shloka"+" "+actual_shloka_no);
                if (frag_no >= 595 && frag_no <=598)
                    refd = database.child("Chapter 17").child("The Divisions of Faith").child("TEXT" + " " + actual_shloka_no);
                else if(frag_no==599)
                    refd = database.child("Chapter 17").child("The Divisions of Faith").child("TEXT"+" "+actual_shloka_no+" - "+"6");
                else if (frag_no >= 600 && frag_no <=619)
                    refd = database.child("Chapter 17").child("The Divisions of Faith").child("TEXT" + " " + actual_shloka_no);
                else if (frag_no == 620)
                    refd = database.child("Chapter 17").child("The Divisions of Faith").child("TEXT"+" "+actual_shloka_no+" - "+"27");
                else if (frag_no >= 621 && frag_no <=622)
                    refd = database.child("Chapter 17").child("The Divisions of Faith").child("TEXT" + " " + actual_shloka_no);

            }
        }
        else if(Integer.parseInt(fragment_no) >= 623 && Integer.parseInt(fragment_no)<=700) {//chapter 18 ends
            sess.getToolBarInstance().setTitle("Chapter 18");
            if (database != null) {
                int frag_no=Integer.parseInt(fragment_no);

                int actual_shloka_no=frag_no-623+1;
                sess.getToolBarInstance().setSubtitle("Shloka"+" "+actual_shloka_no);
                if (frag_no >= 623 && frag_no <=672)
                    refd = database.child("Chapter 18").child("Conclusion – The Perfection of Renunciation").child("TEXT" + " " + actual_shloka_no);
                else if(frag_no==673)
                    refd = database.child("Chapter 18").child("Conclusion – The Perfection of Renunciation").child("TEXT"+" "+actual_shloka_no+" - "+"53");
                else if(frag_no>=674 && frag_no <=700)
                    refd = database.child("Chapter 18").child("Conclusion – The Perfection of Renunciation").child("TEXT" + " " + actual_shloka_no);

            }
        }




    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Bundle bundle = getArguments();




        View view = inflater.inflate(R.layout.fragment_child, container, false);


        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            toolbar = (Toolbar) view.findViewById(R.id.toolbar);
         //  toolbar.setBackground(R.color.material_blue_grey_800);
        }

        AppCompatActivity activity = (AppCompatActivity) getActivity();
        activity.setSupportActionBar(toolbar);
        ActionBar actionbar = activity.getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu);
     //   activity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                return false;
            }
        });

//        RetainFragment rf = MainActivity.findOrCreateRetainFragment(getSupportFragmentManager());
//        rf.setObject(getSupportActionBar());
//maintain array for firing the query
        database = FirebaseDatabase.getInstance().getReference();

        String parentno=bundle.getString("parent");
        if(parentno!=null)
            getreferencechapter(parentno);
      //  refd = database.child("Chapter 1").child("Observing the Armies on the Battleﬁeld of Kurukṣetra").child("TEXT" + " " + bundle.getString("parent"));
        //toolbar.setLogo(R.drawable.logo);



        // Inflate the layout for this fragment
        tvParent = (TextView) view.findViewById(R.id.tvParent);
        tvChild = (TextView) view.findViewById(R.id.tvChild);

//        tvChild.setOnTouchListener(new View.OnTouchListener(){
//
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                tvChild.getParent().requestDisallowInterceptTouchEvent(true);
//                return false;
//            }
//
//        });
 //       tvChild.setMovementMethod(new ScrollingMovementMethod());
     //   tvParent.setText("Parent: " + bundle.getString("parent"));
      //  tvChild.setText("Child: " + bundle.getString("child"));

        final String  childno=bundle.getString("child");
        if(refd!=null)
        {
        refd.addListenerForSingleValueEvent(new ValueEventListener() {
            //            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                {
                    if(dataSnapshot.child("Shloka").getValue() != null)
                        shloka=dataSnapshot.child("Shloka").getValue().toString();
                    if(dataSnapshot.child("Translation").getValue() != null)
                        translation=dataSnapshot.child("Translation").getValue().toString();
                    if(dataSnapshot.child("Purport").getValue() != null)
                        purport=dataSnapshot.child("Purport").getValue().toString();
                    if(childno.equals("0")) {
                        tvChild.setText(shloka);
                        tvParent.setText(translation);
                    }
                    else if(childno.equals("1"))
                        tvChild.setText(purport);

                    boolean ret=dataSnapshot.exists();
                    if(ret==false)
                    {
                        System.out.println("Hurray");

                    }
                    if (dataSnapshot.hasChild("TEXT1")) {
                        System.out.println("Hurray");
                    }
                  //  Verse ver1=dataSnapshot.getValue(Verse.class);
                    //
                    //                    //System.out.println(ver1.getShloka());
                    ////                     for (DataSnapshot childSnapshot: dataSnapshot.getChildren())
                    ////                     {
                    ////
                    ////                         Verse ver= (Verse)childSnapshot.getValue();
                    ////                         System.out.println(""+ver.getShloka());
                    ////                     }
                    //                    // database.setValue("Chapter 3");
                    //                    //String obj=dataSnapshot.child("TEXT1").child("Shloka").getValue(String.class);
                    //                    //System.out.println(""+obj);
                    //                   // String temp=dataSnapshot.toString();
                    //                   // Log.d("Logs", temp);
                    //                 //   Long count=dataSnapshot.getChildrenCount();
                    //                  //s  Log.d("GetCount[]",count.toString());
                    for (com.google.firebase.database.DataSnapshot childSnapshot: dataSnapshot.getChildren()) {
//                        System.out.println(""+childSnapshot.getKey());
                        Log.d("Logs", childSnapshot.getKey()+""+childSnapshot.getValue());
                        //    Toast toa = Toast.makeText(getApplicationContext(),childSnapshot.getKey(), Toast.LENGTH_LONG);
                        // toa.show();

                    }
                }
            }




            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.d("Logs", databaseError.getMessage());
            }


        });
        }

        return view;
    }

}

