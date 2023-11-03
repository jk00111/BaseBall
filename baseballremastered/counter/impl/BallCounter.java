package com.example.baseballremastered.counter.impl;

import com.example.baseballremastered.Ball;
import com.example.baseballremastered.counter.Counter;

import java.util.List;

public class BallCounter extends StrikeCounter {

    List<Character> answerList;

    public BallCounter(List<Character> answerList) {
        super(answerList);
        this.answerList = answerList;
    }

    @Override
    public int count(Ball ball) {
        int bCnt = 0;

        for(int i=0; i<answerList.size(); i++){
            if(answerList.contains(ball.ball.charAt(i))){
                bCnt++;
            }
        }
        return bCnt - super.count(ball);
    }
}
