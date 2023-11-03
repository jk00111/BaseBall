package com.example.baseballremastered.position;
import com.example.baseballremastered.Ball;
import com.example.baseballremastered.counter.Counter;
import com.example.baseballremastered.result.ResultBoard;
import com.example.baseballremastered.result.impl.ResultCorrect;
import com.example.baseballremastered.result.impl.ResultNotcorrect;
import com.example.baseballremastered.result.impl.ResultNothing;

public class Referee {
    private int level;

    public Referee(int level) {
        this.level = level;
    }

    public void checkAnswer(Counter strikeCounter, Counter ballCounter, Ball ball){
        int strikeCount = strikeCounter.count(ball);
        int ballCount = ballCounter.count(ball);

        if (strikeCount == level){
            new ResultBoard(new ResultCorrect()).viewMessage(strikeCount, ballCount);
        }else if(strikeCount == 0 && ballCount == 0){
            new ResultBoard(new ResultNothing()).viewMessage(strikeCount, ballCount);
        }else{
            new ResultBoard(new ResultNotcorrect()).viewMessage(strikeCount, ballCount);
        }
    }
}
