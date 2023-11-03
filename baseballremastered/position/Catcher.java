package com.example.baseballremastered.position;

import com.example.baseballremastered.Ball;

import java.util.ArrayList;
import java.util.List;

public class Catcher {

    private int level;

    public Catcher(int level) {
        this.level = level;
    }

    public void ballValid(Ball ball){
        String ballString = ball.ball;

        if (!lengthValid(ballString, level) || !numValid(ballString)){
            throw new IllegalArgumentException(String.format("%d자리 숫자를 입력해주세요", level));
        }
        if (!dupValid(ballString, level)) {
            throw new IllegalArgumentException("중복되지 않는 숫자 0 ~ 9 로 이루어져야합니다");
        }
    }

    private boolean lengthValid(String ballString, int level){
        return ballString.length() == level;
    }

    private boolean numValid(String ballString){
        for (int i=0; i < ballString.length(); i++){
            if (ballString.charAt(i) - 48 < 0 || ballString.charAt(i) - 48 > 9){
                return false;
            }
        }
        return true;
    }

    private boolean dupValid(String ballString, int level){
        List<Character> stringList = new ArrayList<>();
        for (int i=0; i<ballString.length(); i++){
            stringList.add(ballString.charAt(i));
        }
        return stringList.stream().distinct().toList().size() == level;
    }
}
