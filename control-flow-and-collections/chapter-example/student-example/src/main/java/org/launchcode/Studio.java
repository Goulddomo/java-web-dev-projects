package org.launchcode;

import java.util.HashMap;

public class Studio {
   HashMap<Character, Integer> countOfCharacters = new HashMap<>();

   for(Character c : input.toCharArray()){
       if(!countOfCharacters.containsKey(c)){
           countOfCharacters.put(c, 1);
       } else {
           countOfCharacters.put(c, countOfCharacters.get(c) + 1);
       }
        System.out.println(countOfCharacters);
    }
}
