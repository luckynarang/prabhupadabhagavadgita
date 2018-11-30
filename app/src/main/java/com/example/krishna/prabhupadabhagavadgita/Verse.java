package com.example.krishna.prabhupadabhagavadgita;

public class Verse {
    String shloka;
    String translation;
    String purport;
Verse()
{


}
     Verse(String shloka,String translation,String purport){

         this.shloka=shloka;
         this.translation=translation;
         this.purport=purport;
     }

     String getShloka( )
     {
        return shloka;
     }
    String getTranslation( )
    {
        return translation;
    }

    String getPurport( )
    {
        return purport;
    }

    void setShloka(String shloka )
    {
        this.shloka= shloka;
    }
    void setTranslation(String translation )
    {
        this.translation= translation;
    }

    void setPurport(String purport )
    {
        this.purport= purport;
    }


}
