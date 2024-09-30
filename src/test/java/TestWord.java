import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestWord {
    @Test
    public void should_check_one_incorrect_letter(){
        //Arrange
        Word word = new Word("E") ;

        //Act
        Score score = word.guess("B") ;
        Integer Actual = score.getScore() ;
        Integer Expected = 0 ;
        assertThat(Actual).isEqualTo(Expected) ;
    }

    @Test
    public void should_check_one_correct_letter(){
        Word word = new Word("E") ;
        Score score = word.guess("E") ;
        Integer Actual = score.getScore() ;
        Integer Expected = 1 ;
        //word.score()
        assertThat(Actual).isEqualTo(Expected) ;

    }
}
