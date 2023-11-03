package com.example.baseballremastered.result.impl;

import com.example.baseballremastered.result.Result;

public class ResultNotcorrect implements Result {
    @Override
    public void viewMessage(int strikeCount, int bacllCount) {
        System.out.println(strikeCount + "스트라이크\n" + bacllCount +  "볼 입니다.");
    }

    @Override
    public void doSometing() {

    }
}
