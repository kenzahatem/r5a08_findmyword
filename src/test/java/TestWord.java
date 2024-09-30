import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestWord {
    @Test
    public void should_check_one_incorrect_letter(){
        //Arrange
        Word word = new Word("E") ;

        //Act
        Score score = word.guess("B") ;
        Letter Actual = score.getScore() ;
        Letter Expected = Letter.INCORRECT ;
        assertThat(Actual).isEqualTo(Expected) ;
    }

    @Test
    public void should_check_one_correct_letter(){
        Word word = new Word("E") ;
        Score score = word.guess("E") ;
        Letter Actual = score.getScore() ;
        Letter Expected = Letter.CORRECT ;
        //word.score()
        assertThat(Actual).isEqualTo(Expected) ;

    }
}
