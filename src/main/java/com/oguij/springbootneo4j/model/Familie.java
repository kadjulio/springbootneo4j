package com.oguij.springbootneo4j.model;

import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Familie {

    private String Gitter_ID_100m;
    private String Merkmal;
    private  int Auspraegung_Code;
    private  String Auspraegung_Text;
    private int Anzahl;
    private int Anzahl_q;

    public String getGitter_ID_100m() {
        return Gitter_ID_100m;
    }

    public void setGitter_ID_100m(String gitter_ID_100m) {
        Gitter_ID_100m = gitter_ID_100m;
    }

    public String getMerkmal() {
        return Merkmal;
    }

    public void setMerkmal(String merkmal) {
        Merkmal = merkmal;
    }

    public int getAuspraegung_Code() {
        return Auspraegung_Code;
    }

    public void setAuspraegung_Code(int auspraegung_Code) {
        Auspraegung_Code = auspraegung_Code;
    }

    public String getAuspraegung_Text() {
        return Auspraegung_Text;
    }

    public void setAuspraegung_Text(String auspraegung_Text) {
        Auspraegung_Text = auspraegung_Text;
    }

    public int getAnzahl() {
        return Anzahl;
    }

    public void setAnzahl(int anzahl) {
        Anzahl = anzahl;
    }

    public int getAnzahl_q() {
        return Anzahl_q;
    }

    public void setAnzahl_q(int anzahl_q) {
        Anzahl_q = anzahl_q;
    }
}
