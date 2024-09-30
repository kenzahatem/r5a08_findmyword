public class Score {
    private String word ;
    private int score ;

    public Score(String word) {
        this.word = word ;
    }


    public Letter letter(int i) {
        return Letter.INCORRECT ;
    }

    public void assess(int i, String attempt) {
        if (word.equals(attempt)) this.score += 1;
        else {
            this.score += 0;
        }
    }

    public Integer getScore() {
        return this.score;
    }
}
