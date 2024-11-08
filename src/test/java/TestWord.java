import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestWord {
    private void assertScoreForLetter(Score score, int position, Letter expected) {
        assertThat(score.letter(position))
                .isEqualTo(expected);
    }
    private void assertScoreForGuess(Score score, Letter... expectedScore){
        for (int position = 0 ; position < expectedScore.length; position++){
            Letter expected = expectedScore[position] ;
            assertScoreForLetter(score, position, expected);
        }
    }
    @Test
    public void should_check_one_incorrect_letter(){
        //Arrange
        Word word = new Word("E") ;

        //Act
        Score score = word.guess("B") ;
        Letter expected = Letter.INCORRECT;
        //Assert
        assertScoreForGuess(score, Letter.INCORRECT) ;

    }

    @Test
    public void should_check_one_correct_letter(){
        //arrange
        Word word = new Word("E") ;
        //act
        Score score = word.guess("E") ;
        //Assert
        assertScoreForGuess(score, Letter.CORRECT) ;

    }

    @Test
    public void should_check_two_correct_letters(){
        //arrange
        Word word = new Word("ET") ;
        //act
        Score score = word.guess("ET") ;

          //assert
        assertScoreForGuess(score,Letter.CORRECT,Letter.CORRECT) ;
    }

    @Test
    public void should_check_word_with_two_caracters_partialy_correct(){
        //arrange
        Word word = new Word("ET") ;
        //act
        Score score = word.guess("BE") ;

        //assert
        assertScoreForGuess(score,Letter.INCORRECT,
                Letter.PART_CORRECT) ;
    }
    @Test
    public void should_check_word_with_two_caracters_incorrect(){
        //arrange
        Word word = new Word("ET") ;
        //act
        Score score = word.guess("BB") ;
        //assert
        assertScoreForGuess(score,Letter.INCORRECT,
                Letter.INCORRECT) ;
    }
    @Test
    public void should_check_word_with_two_caracters_correct_and_incorrect(){
        //arrange
        Word word = new Word("ET") ;
        //act
        Score score = word.guess("EB") ;
        //assert
        assertScoreForGuess(score,Letter.CORRECT,
                Letter.INCORRECT) ;
    }
    @Test
    public void should_check_word_with_three_caracters(){
        //arrange
        Word word = new Word("ETB") ;
        //act
        Score score = word.guess("EBH") ;
        //assert
        assertScoreForGuess(score,Letter.CORRECT,
                Letter.PART_CORRECT,
                Letter.INCORRECT) ;
    }

    @Test
    public void should_check_word_with_four_caracters_incorrect(){
        //arrange
        Word word = new Word("WORD") ;
        //act
        Score score = word.guess("LPMB") ;

        //assert
        assertScoreForGuess(score,Letter.INCORRECT,
                Letter.INCORRECT,
                Letter.INCORRECT,
                Letter.INCORRECT) ;

    }
    @Test
    public void should_check_word_with_five_caracters(){
        //arrange
        Word word = new Word("WORD") ;
        //act
        Score score = word.guess("LORD") ;

        //assert
        assertScoreForGuess(score,Letter.INCORRECT,
                Letter.CORRECT,
                Letter.CORRECT,
                Letter.CORRECT) ;

    }
}
