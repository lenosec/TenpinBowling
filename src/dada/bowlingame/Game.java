package dada.bowlingame;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("For frame 1");
        Frames();
        System.out.println("For frame 2");
        Frames();
        System.out.println("For frame 3");
        Frames();
        System.out.println("For frame 4");
        Frames();
        System.out.println("For frame 5");
        Frames();
        System.out.println("For frame 6");
        Frames();
        System.out.println("For frame 7");
        Frames();
        System.out.println("For frame 8");
        Frames();
        System.out.println("For frame 9");
        Frames();
        System.out.println("For frame 310");
        Frames();

    }

    public static class Score {
        int roll1score;
        int roll2score;
        int roll3score;

        public Score(int roll1score, int roll2score) {
            this.roll1score = roll1score;
            this.roll2score = roll2score;
            int totalscore = roll1score + roll2score;
            System.out.println("So your total score was " + totalscore);
        }
        public Score(int roll1sparescore,int roll2sparescore,int roll3sparescore){
            this.roll1score = roll1sparescore;
            this.roll2score = roll2sparescore;
            this.roll3score = roll3sparescore;
            int totalscore = roll1sparescore + roll2sparescore+roll3sparescore;
            System.out.println("So your total score was " + totalscore);
        }

    }

    public static void Frames() {
        int rollscored1 = getscore();
        int rollscored2 = getscore();

        if (rollscored1==10 || rollscored2==10){
            int rollscored3 = getscore();
            Game.Score totalscore = new Game.Score(rollscored1,rollscored2,rollscored3);
        }else{
        Game.Score totalscore = new Game.Score(rollscored1, rollscored2);}

    }

    public static int getscore() {
        Scanner getroll1score = new Scanner(System.in);
        System.out.println("Please enter you roll score");
        int rollscore = getroll1score.nextInt();
        if (rollscore > 10) System.out.println("Sorry value cannot be greater than 10");
        return rollscore;
    }
}


