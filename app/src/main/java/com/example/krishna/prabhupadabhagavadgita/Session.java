package com.example.krishna.prabhupadabhagavadgita;

import android.support.v7.widget.Toolbar;

public class Session {
    static Session sessObj=null;
    Toolbar toolbar;
    Session()
    {

    }
    public static Session getSessionObj()
    {
        if(sessObj==null)
            sessObj=new Session();

            return sessObj;
    }
    public void setToolBarInstance(Toolbar toolbar)
    {
        this.toolbar=toolbar;

    }
    public Toolbar getToolBarInstance()
    {
       return this.toolbar;
    }



}
