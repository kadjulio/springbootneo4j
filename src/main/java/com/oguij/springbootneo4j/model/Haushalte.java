package com.oguij.springbootneo4j.model;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

public class Haushalte  extends Population{

    @Override
    public String getGitter_ID_100m() {
        return Gitter_ID_100m;
    }

    @Override
    public void setGitter_ID_100m(String gitter_ID_100m) {
        Gitter_ID_100m = gitter_ID_100m;
    }

    @Override
    public String getMerkmal() {
        return Merkmal;
    }

    public void setMerkmal(String merkmal) {
        Merkmal = merkmal;
    }

    @Override
    public int getAuspraegung_Code() {
        return Auspraegung_Code;
    }

    public void setAuspraegung_Code(int auspraegung_Code) {
        Auspraegung_Code = auspraegung_Code;
    }

    @Override
    public String getAuspraegung_Text() {
        return Auspraegung_Text;
    }

    public void setAuspraegung_Text(String auspraegung_Text) {
        Auspraegung_Text = auspraegung_Text;
    }

    @Override
    public int getAnzahl() {
        return Anzahl;
    }

    public void setAnzahl(int anzahl) {
        Anzahl = anzahl;
    }

    @Override
    public int getAnzahl_q() {
        return Anzahl_q;
    }

    public void setAnzahl_q(int anzahl_q) {
        Anzahl_q = anzahl_q;
    }

    @Id private String Gitter_ID_100m;
    private String Merkmal;
    private int Auspraegung_Code;
    private String Auspraegung_Text;
    private int Anzahl;
    private int Anzahl_q;

    private Haushalte(String Gitter_ID_100m) {
        super();
    }

    public Haushalte(String Gitter_ID_100m,String Merkmal, String Auspraegung_Text, int Anzahl, int Auspraegung_Code, int Anzahl_q) {

        this.Gitter_ID_100m = Gitter_ID_100m;
        this.Merkmal = Merkmal;
        this.Auspraegung_Code = Auspraegung_Code;
        this.Auspraegung_Text = Auspraegung_Text;
        this.Anzahl = Anzahl;
        this.Anzahl_q = Anzahl_q;

    }

    @Relationship(type = "CONTAINS", direction = Relationship.UNDIRECTED)
    public Set<Haushalte> contains;

    public void contains(Haushalte haushalte) {
        if (contains == null) {
            contains = new HashSet<>();
        }
        contains.add(haushalte);
    }

    public String toString() {
        return this.Auspraegung_Text + "is contained in the Population";
    }
}




