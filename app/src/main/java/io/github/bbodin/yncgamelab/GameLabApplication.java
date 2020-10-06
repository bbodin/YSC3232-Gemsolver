package io.github.bbodin.yncgamelab;

import android.app.Application;

public class GameLabApplication extends Application {
    private int last_score = 0;
    private int last_score1 = 0;
    private int last_score2 = 0;
    private int last_score3 = 0;
    private int last_score4 = 0;


    public int getLast_score() {
        return last_score;
    }

    public void setLast_score(int last_score) {
        this.last_score = last_score;
    }

    public int getLast_score1() {
        return last_score1;
    }

    public void setLast_score1(int last_score1) {
        this.last_score1 = last_score1;
    }
}
