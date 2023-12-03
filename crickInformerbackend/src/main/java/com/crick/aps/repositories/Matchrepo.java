package com.crick.aps.repositories;
import com.crick.aps.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Matchrepo extends JpaRepository<Match,Integer> {
    //match fetch karna chahta hoon -->
    //provide kar de --> teamheading
    Optional<Match> findByTeamHeading(String teamHeading);
}
