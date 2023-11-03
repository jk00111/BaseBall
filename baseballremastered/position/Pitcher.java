package com.example.baseballremastered.position;

import com.example.baseballremastered.Ball;

import java.util.Scanner;

public class Pitcher {

    public Ball throwBall(){
        Scanner scanner = new Scanner(System.in);
        Ball ball = new Ball();
        ball.ball = scanner.next();

        return ball;
    }
}
