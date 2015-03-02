package com.zdware.maporganizer;


import junit.framework.TestCase;
import org.junit.Test;

import java.util.*;

public class MapOrganizerTest {


    @Test
    public void testEmailExample() {
        testOrganizeStrings(new String[] {"Apple","Orange","Banana","Attack","Bounce"});
    }

    @Test
    public void testMetalBands() {
        testOrganizeStrings(new String[] {"Gojira","In Flames","The Sword","Strapping Young Lad",
                "At The Gates", "Opeth", "Amon Amarth", "Orange Goblin", "Woods of Ypres", "Blind Guardian",
                "Creed", "Om", "Dark Tranquillity", "3 Inches of Blood", "Torche", "Shadows Fall",
                "Beyond the Embrace", "December Flower", "Nekrogoblikon", "Skeletonwitch", "Immolation",
                "Windhand", "Iron Maiden", "SuidAkrA", "Be'Lakor", "Pelican", "Omnium Gatherum",
                "Between the Buried and Me", "Dethlehem", "Wintersun", "Eluveitie", "Agalloch", "Alcest",
                "After The Burial", "Mastodon", "Killswitch Engage", "Insomnium", "Type O Negative",
                "Ne Obliviscaris", "Unearth", "Trivium", "Arsis", "Carcass", "Into Eternity", "Ludicra"});
    }


    public void testOrganizeStrings(String[] testStringArray){
        System.out.println("----- Map Organizer Begin");
        Collection<String> testStrings = Arrays.asList(testStringArray);
        Map<String, List<String>> organizedStrings = MapOrganizer.organizeStrings(testStrings);
        for(Map.Entry<String, List<String>> entry : organizedStrings.entrySet()) {
            System.out.println("All Strings starting with " + entry.getKey() + ":");
            for(String organizedString : entry.getValue()) {
                System.out.println(organizedString);
                TestCase.assertTrue("First character is " + entry.getKey() + "in String \'" + organizedString + "\'", entry.getKey().equals(organizedString.substring(0, 1).toLowerCase()));
            }
        }
        System.out.println("----- Map Organizer End");
    }
}