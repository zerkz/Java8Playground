package com.zdware.maporganizer;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapOrganizer {

    /**
     * Organizes/sorts out strings with the same first character into their own collection, organized by character with a map.
     * I tried to use Map<String,Collection<String>> as the return type, but I had some issues getting the collector to work correctly.
     * @param strings - Collection of strings to organize.
     * @return A Map whose key consists of one character, and a List (Collection) of all words beginning with the key.
     */
    public static Map<String,List<String>> organizeStrings(Collection<String> strings) {
        Map<String,List<String>> organizedStrings =
                strings.stream().sorted()
                    .collect(Collectors.groupingBy(ch -> ch.substring(0,1).toLowerCase()));
        return organizedStrings;
    }
}
