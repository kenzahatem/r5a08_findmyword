public class Score {
    private String word ;
    private Letter score ;

    public Score(String word) {
        this.word = word ;
    }


    public Letter letter(int i) {
        return Letter.INCORRECT ;
    }

    public void assess(int i, String attempt) {
        if (word.equals(attempt)) this.score = Letter.CORRECT;
        else {
            this.score =Letter.INCORRECT;
        }
    }

    public Letter getScore() {
        return this.score;
    }
}
