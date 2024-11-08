import java.util.ArrayList;
import java.util.List;

public class Score {
    private final String word ;
    private List<Letter> scores= new ArrayList<Letter>();
    private int position=0 ;

    public Score(String word) {
        this.word = word ;
    }

    public Letter letter(int i) {
        return this.scores.get(i) ;
    }


    public void assess(String attempt) {
        for ( char c : attempt.toCharArray()) {
            this.scores.add(scoreForLetter(c)) ;
            this.position++ ;
        }
    }

    private Letter scoreForLetter(char current){
        if (isCorrect(current)) return Letter.CORRECT ;
        else if (isPartiallyCorrect(current)) return Letter.PART_CORRECT ;
        else return Letter.INCORRECT ;
    }

    private boolean isPartiallyCorrect(char currentLetter){
        return this.word.contains(String.valueOf(currentLetter)) ;
    }
    private boolean isCorrect(char currentLetter) {
        return this.word.charAt(position) == currentLetter ;
    }
}
