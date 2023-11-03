package com.example.baseballremastered.position;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Hitter {

    private int level;

    public Hitter(int level) {
        this.level = level;
    }
    public List<Character> hitPoint(){

        List<Character> answerList = new ArrayList<>(Arrays.asList('1','2','3','4','5','6','7','8','9','0'));
        Collections.shuffle(answerList);

        answerList = answerList.subList(0, level);

        return answerList;
    }
}
