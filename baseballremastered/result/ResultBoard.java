package com.example.baseballremastered.result;

public class ResultBoard {
    private Result result ;

    public ResultBoard(Result result) {
        this.result = result;
    }
    public void viewMessage(int strikeCount, int ballCount){
        result.viewMessage(strikeCount, ballCount);
        result.doSometing();
    }
}
