package com.alex.solidpresentation.LSP.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex
 */

public class LspTest {

    public static void main(String args[]) {
        List<FlightBird> birdList = LspTest.getBirds();
        for (int i = 0; i < birdList.size(); i++) {
            birdList.get(i).fly();
        }
    }

    private static List<FlightBird> getBirds() {
        List<FlightBird> birdList = new ArrayList<>();
        birdList.add(new Pigeon(10, 1.5F, ""));
        birdList.add(new Crow(10, 1.5F, ""));
        // can't be applied
//        birdList.add(new Kiwi(10, 1.5F, ""));
        return birdList;
    }

}