package com.example.baseballremastered.result.impl;

import com.example.baseballremastered.Board;
import com.example.baseballremastered.Ground;
import com.example.baseballremastered.result.Result;
public class ResultCorrect implements Result {

    @Override
    public void viewMessage(int strikeCount, int bacllCount) {
        System.out.println(strikeCount + "스트라이크!!!! \n정답입니다");
    }

    @Override
    public void doSometing() {
        Ground ground = new Ground();
        Board board = new Board();

        if (board.restartYN()){
            ground.game();
        }
        System.exit(0);
    }
}
