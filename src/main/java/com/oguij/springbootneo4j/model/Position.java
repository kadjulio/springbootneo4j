package com.oguij.springbootneo4j.model;

import org.neo4j.ogm.annotation.Relationship;

public class Position {
    private float longitude;
    private float latitude;
    private String Gitter_ID_100m;

    private Position() {
        // Empty constructor required as of Neo4j API 2.0.5
    };

    public Position(String Gitter_ID_100m) {
        this.Gitter_ID_100m = Gitter_ID_100m;
    }

    public float getLongitude() {
        return longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public String getGitter_ID_100m() {
        return Gitter_ID_100m;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public void setGitter_ID_100m(String gitter_ID_100m) {
        Gitter_ID_100m = gitter_ID_100m;
    }
}
