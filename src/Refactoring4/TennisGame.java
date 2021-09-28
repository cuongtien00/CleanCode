package Refactoring4;

public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int scoreOfPlayer1, int scoreOfPlayer2) {
        String score = "";
        int tempScore=0;
        if (scoreOfPlayer1==scoreOfPlayer2)
        {
            score = getScore(scoreOfPlayer1);
        }
        else {
            int winScore = 4;
            if (scoreOfPlayer1>= winScore || scoreOfPlayer2>= winScore)
            {
                int difference = scoreOfPlayer1-scoreOfPlayer2;
                if (difference==1) score ="Advantage player1";
                else if (difference ==-1) score ="Advantage player2";
                else if (difference>=2) score = "Win for player1";
                else score ="Win for player2";
            }
            else
            {
                score = getTempScore(scoreOfPlayer1, scoreOfPlayer2, score);
            }
        }
        return score;
    }

    private static String getTempScore(int scoreOfPlayer1, int scoreOfPlayer2, String score) {
        int tempScore;
        for (int i = 1; i<3; i++)
        {
            if (i==1) tempScore = scoreOfPlayer1;
            else { score +="-"; tempScore = scoreOfPlayer2;}
            switch(tempScore)
            {
                case 0:
                    score +="Love";
                    break;
                case 1:
                    score +="Fifteen";
                    break;
                case 2:
                    score +="Thirty";
                    break;
                case 3:
                    score +="Forty";
                    break;
            }
        }
        return score;
    }

    private static String getScore(int scoreOfPlayer1) {
        String score;
        switch (scoreOfPlayer1)
        {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }
}
