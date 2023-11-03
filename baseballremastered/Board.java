package com.example.baseballremastered;

import java.util.Scanner;

public class Board {

    Scanner scanner = new Scanner(System.in);
    public boolean restartYN(){
        System.out.println("게임을 종료하려면 X, 다시 시작하려면 아무키나 입력해주세요");
        if (scanner.next().equalsIgnoreCase("X")){
            return false;
        }
        return true;
    }
}
