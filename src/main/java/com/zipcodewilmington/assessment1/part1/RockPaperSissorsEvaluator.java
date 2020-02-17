package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        String ans = "";
        if(handSign.equals("rock")){
            ans="paper";
        } else if(handSign.equals("scissor")) {
            ans="rock";
        } else if(handSign.equals("paper")){
            ans="scissor";
        }
        return ans;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        String ans = "";
        if(handSign.equals("rock")){
            ans="scissor";
        } else if(handSign.equals("scissor")) {
            ans="paper";
        } else if(handSign.equals("paper")){
            ans="rock";
        }
        return ans;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {

        String ans = "";
        if(handSignOfPlayer1.equals("rock") && handSignOfPlayer2.equals("scissor")){
            ans="rock";
        } else if(handSignOfPlayer1.equals("scissor") && handSignOfPlayer2.equals("paper")) {
            ans="scissor";
        } else if(handSignOfPlayer1.equals("paper") && handSignOfPlayer2.equals("rock")){
            ans="paper";
        }
        return ans;
    }
}
