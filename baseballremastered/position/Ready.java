package com.example.baseballremastered.position;

public class Ready {

    private Hitter hitter;
    private Catcher catcher;
    private Referee referee;
    private Pitcher pitcher;

    public Ready(int level) {
        this.hitter = new Hitter(level);
        this.pitcher = new Pitcher();
        this.referee = new Referee(level);
        this.catcher = new Catcher(level);
    }

    public Hitter getHitter(){
        return hitter;
    }
    public Referee getReferee(){
        return referee;
    }
    public Pitcher getpitcher(){
        return pitcher;
    }
    public Catcher getCatcher(){
        return catcher;
    }
}
