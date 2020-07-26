package com.oguij.springbootneo4j.model;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.*;
import java.util.stream.Collectors;

@NodeEntity
public class Population extends Position {
    private String Gitter_ID_100m;
    private String Merkmal;
    private  int Auspraegung_Code;
    private  String Auspraegung_Text;
    private int Anzahl;
    private int Anzahl_q;

    public Population(String Gitter_ID_100m, String Merkmal, String Auspraegung_Text, int Anzahl, int Auspraegung_Code, int Anzahl_q) {
        super();
        this.Gitter_ID_100m = Gitter_ID_100m;
        this.Merkmal = Merkmal;
        this.Auspraegung_Code = Auspraegung_Code;
        this.Auspraegung_Text = Auspraegung_Text;
        this.Anzahl = Anzahl;
        this.Anzahl_q = Anzahl_q;
    }

    public Population() {
        super();
    }


    /**
     * @return Auspraegung_Text
     */

    public String Population(String Merkmal, int Auspraegung_Code) {

        if ((Merkmal.equals("INSGESAMT")) || (Auspraegung_Code == 0)) {                                                 /*Gesamtzahl der Einheiten in der Gitterzelle Kann aufgrund der Geheimhaltung  von der Summe über alle Ausprägungen der anderen Merkmale abweichen */
            return Auspraegung_Text;
        }
        switch (Merkmal) {
            case "ALTER_10JG":
                for (Auspraegung_Code = 1; Auspraegung_Code <= 9; Auspraegung_Code++) {                                 //Alter (10er-Jahresgruppen)
                    return Auspraegung_Text;
                }
            case "ALTER_KURZ":
                for (Auspraegung_Code = 1; Auspraegung_Code <= 5; Auspraegung_Code++) {                                 //Alter (5 Altersklassen)
                    return Auspraegung_Text;
                }
            case "FAMSTND_AUSF":
                for (Auspraegung_Code = 1; Auspraegung_Code <= 8; Auspraegung_Code++) {                                 //Familienstand (ausführlich)
                    return Auspraegung_Text;
                }
            case "GEBURTLAND_GRP":
                for (Auspraegung_Code = 1; Auspraegung_Code <= 24; Auspraegung_Code++) {                                //Geburtsland (Gruppen)
                    return Auspraegung_Text;
                }
            case "GESCHLECHT":
                for (Auspraegung_Code =1; Auspraegung_Code<=2; Auspraegung_Code++) {                                    //Geschlecht
                    return Auspraegung_Text;
                }
            case "RELIGION_KURZ":
                for (Auspraegung_Code = 1; Auspraegung_Code<= 3; Auspraegung_Code++) {                                  //Religion
                    return Auspraegung_Text;
                }
            case "STAATSANGE_GRP":
                for (Auspraegung_Code =1; Auspraegung_Code<= 24; Auspraegung_Code++) {                                  //Staatsangehörigkeitsgruppen
                    return Auspraegung_Text;
                }
            case "STAATSANGE_HLND":
                for (Auspraegung_Code = 1; Auspraegung_Code <= 14; Auspraegung_Code++) {                                //Staatsangehörigkeit nach ausgewählten Ländern
                    return Auspraegung_Text;
                }
            case "STAATSANGE_KURZ":
                for (Auspraegung_Code =1; Auspraegung_Code <= 2; Auspraegung_Code++) {                                  //Staatsangehörigkeit
                    return  Auspraegung_Text;
                }
            case "STAATZHL":
                for (Auspraegung_Code = 1; Auspraegung_Code<= 4; Auspraegung_Code++) {                                  //Zahl der Staatsangehörigkeiten
                    return Auspraegung_Text;
                }
        }
        return null;
    }



    /**
     * Neo4j doesn't REALLY have bi-directional relationships. It just means when querying
     * to ignore the direction of the relationship.
     * https://dzone.com/articles/modelling-data-neo4j
     */

    @Relationship(type = "LOCATED_AT", direction = Relationship.UNDIRECTED)
    public Set<Population> located_at;

    public void located_at(Population population) {
        if (located_at == null) {
            located_at = new HashSet<>();
        }
        located_at.addAll(populationList);
    }


    @Relationship(type = "CONTAINS", direction = Relationship.UNDIRECTED)
    public Set<Population>  contains;

    public void contains(Population population) {
        if (contains == null) {
            contains = new HashSet<>();
        }
        contains.add(population);

    }


    private List<Population> populationList;

    public List<Population> getPopulationList() {
        return populationList;
    }


    public String toString() {
        return this.Auspraegung_Text + "located_at =>" +
                Optional.ofNullable(this.located_at).orElse(
                        Collections.emptySet()).stream().map(Population::getGitter_ID_100m)
                        .collect(Collectors.toList());
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


    @Override
    public void setGitter_ID_100m(String gitter_ID_100m) {
        Gitter_ID_100m = gitter_ID_100m;
    }

    public void setMerkmal(String merkmal) {
        Merkmal = merkmal;
    }

    public void setAuspraegung_Code(int auspraegung_Code) {
        Auspraegung_Code = auspraegung_Code;
    }

    public void setAuspraegung_Text(String auspraegung_Text) {
        Auspraegung_Text = auspraegung_Text;
    }

    public void setAnzahl(int anzahl) {
        Anzahl = anzahl;
    }

    public void setAnzahl_q(int anzahl_q) {
        Anzahl_q = anzahl_q;
    }


}
