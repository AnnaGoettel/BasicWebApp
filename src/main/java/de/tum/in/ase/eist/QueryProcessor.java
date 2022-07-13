package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class QueryProcessor {

    public String process(String query) {
        query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "anna";
        } else if (query.contains("plus")) {
            String[] tokens = query.split(" ");
            String token1 = tokens[3];
            String token2 = tokens[5];
            return String.valueOf(Integer.parseInt(token1)+Integer.parseInt(token2));
        } else if (query.contains("following")) {
            String[] interim = query.split(":");
            String numbers = interim[2];
            String[] number = numbers.split(",");
            List ints = new ArrayList<Integer>();
            for(String s : number){
                String t= s.trim();
                Integer inttest = Integer.parseInt(t);
                ints.add(inttest);
            }
            return String.valueOf(Collections.max(ints));

        } else{
            return "";
        }
    }
    //which of the following numbers is the largest: 984, 54, 11, 940"
}
