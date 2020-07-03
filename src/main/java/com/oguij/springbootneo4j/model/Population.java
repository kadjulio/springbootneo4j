package com.oguij.springbootneo4j.model;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

@NodeEntity
public class Population {

    private String Gitter_ID_100m;
    private String Merkmal;
    private  int Auspraegung_Code;
    private  String Auspraegung_Text;
    private int Anzahl;
    private int Anzahl_q;



    //@Relationship(type = "LOCATED_AT", direction = Relationship.OUTGOING)
    private List<Population> populationList;

    public List<Population> getPopulationList() {
        return populationList;
    }

    public String getGitter_ID_100m() {
        return Gitter_ID_100m;
    }

    public String getMerkmal() {
        return Merkmal;
    }

    public int getAuspraegung_Code() {
        return Auspraegung_Code;
    }

    public String getAuspraegung_Text() {
        return Auspraegung_Text;
    }

    public int getAnzahl() {
        return Anzahl;
    }

    public int getAnzahl_q() {
        return Anzahl_q;
    }




}
