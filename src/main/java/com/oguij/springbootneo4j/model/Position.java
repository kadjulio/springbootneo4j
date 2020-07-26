package com.oguij.springbootneo4j.model;


import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.Relationship;

import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Position {
    @Id private String longitude;
    @Id private String latitude;
    private String Gitter_ID_100m;


    public Position(String Gitter_ID_100m, String latitude, String longitude) {
        this.Gitter_ID_100m = Gitter_ID_100m;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    /**
     * Neo4j doesn't REALLY have bi-directional relationships. It just means when querying
     * to ignore the direction of the relationship.
     * https://dzone.com/articles/modelling-data-neo4j
     */

    @Relationship(type = "LOCATED_AT", direction = Relationship.UNDIRECTED)
    public Set<Position> located_at;

    public Position() {
        // Empty constructor required as of Neo4j API 2.0.5
    }


    public void located_at(Position position) {
        if (located_at == null) {
            located_at =new HashSet<>();
        }
        located_at.add(position);
    }

    public String toString() {
        return this.Gitter_ID_100m + "is the location of =>" +
                Optional.ofNullable(this.located_at).orElse(Collections.emptySet()).stream()
                        .map(Position::getGitter_ID_100m).collect(Collectors.joining());

    }

    public String getLongitude() {
        return longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getGitter_ID_100m() {
        return Gitter_ID_100m;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setGitter_ID_100m(String gitter_ID_100m) {
        Gitter_ID_100m = gitter_ID_100m;
    }
}
