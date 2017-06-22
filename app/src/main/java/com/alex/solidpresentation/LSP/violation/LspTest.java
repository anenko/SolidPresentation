package com.alex.solidpresentation.LSP.violation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex
 */

public class LspTest {

    public static void main(String args[]) {
        List<Bird> birdList = LspTest.getBirds();
        for (int i = 0; i < birdList.size(); i++) {
            birdList.get(i).fly();
        }
    }

    private static List<Bird> getBirds() {
        List<Bird> birdList = new ArrayList<>();
        birdList.add(new Pigeon(10, 1.5F, ""));
        birdList.add(new Crow(10, 1.5F, ""));
        birdList.add(new Kiwi(10, 1.5F, ""));
        return birdList;
    }

}