package com.example.baseballremastered;

import com.example.baseballremastered.counter.Counter;
import com.example.baseballremastered.counter.impl.BallCounter;
import com.example.baseballremastered.counter.impl.StrikeCounter;
import com.example.baseballremastered.position.Ready;

import java.util.List;

public class Ground {

    private static final int level = 3;

    public void game(){

        Ready ready = new Ready(level);
        List<Character> answerList = ready.getHitter().hitPoint();

        Counter strikeCounter = new StrikeCounter(answerList);
        Counter ballCounter = new BallCounter(answerList);

        while (true){
            Ball ball = ready.getpitcher().throwBall();
            ready.getCatcher().ballValid(ball);
            ready.getReferee().checkAnswer(strikeCounter,ballCounter, ball);
        }
    }

    public static void main(String[] args) {
        Ground ground = new Ground();
        ground.game();
    }
}
