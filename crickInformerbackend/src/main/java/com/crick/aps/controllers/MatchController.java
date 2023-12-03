package com.crick.aps.controllers;

import com.crick.aps.entities.Match;
import com.crick.aps.services.Matchservice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")
public class MatchController {
     private Matchservice matchservice;

     public MatchController(Matchservice matchservice){
         this.matchservice=matchservice;
     }

    // get live matches
    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatches(){
        return new ResponseEntity<>(this.matchservice.getLiveMatches(), HttpStatus.OK);
    }
}
