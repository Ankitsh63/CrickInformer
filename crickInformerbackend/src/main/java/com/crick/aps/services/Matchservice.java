package com.crick.aps.services;

import com.crick.aps.entities.Match;

import java.util.List;
import java.util.Map;

public interface Matchservice {
    //get all matches
    List<Match> getAllMatches();
    //get live matches
    List<Match> getLiveMatches();
    //get cwc 2023 point table
    List<Map<String,String>> getPointTable();

}
