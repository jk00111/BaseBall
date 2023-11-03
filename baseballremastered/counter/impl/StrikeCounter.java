package com.example.baseballremastered.counter.impl;

import com.example.baseballremastered.Ball;
import com.example.baseballremastered.counter.Counter;

import java.util.List;

public class StrikeCounter implements Counter {

    List<Character> answerList;

    public StrikeCounter(List<Character> answerList) {
        this.answerList = answerList;
    }
    @Override
    public int count(Ball ball) {
        int sCnt = 0;

        for(int i=0; i < answerList.size(); i++){
            if(answerList.indexOf(ball.ball.charAt(i)) == i){
                sCnt++;
            }
        }
        return sCnt;
    }
}
