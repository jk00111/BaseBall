package com.example.baseballremastered.result.impl;

import com.example.baseballremastered.result.Result;

public class ResultNothing implements Result {
    @Override
    public void viewMessage(int strikeCount, int bacllCount) {
        System.out.println("낫싱");
    }

    @Override
    public void doSometing() {

    }
}
