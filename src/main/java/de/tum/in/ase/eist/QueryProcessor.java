package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

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
            String token1 = tokens[2];
            String token2 = tokens[4];
            return String.valueOf(Integer.parseInt(token1)+Integer.parseInt(token2));
       /* } else if (query.contains("following")) {
            String[] interim = query.split(":");
            String numbers = interim[1];
            String[] number = query.split(",");
            for(String s : number){
                Integer.parseInt(s);

            }
            return tokens[2]+tokens[4];

        */
        } else{
            return "";
        }
    }
    //which of the following numbers is the largest: 984, 54, 11, 940"
}
