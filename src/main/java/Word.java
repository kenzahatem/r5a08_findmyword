public class Word {
    private String word;

    public Word(String correctWord) {
        this.word = correctWord;
    }

    public Score guess(String attempt) {
        Score score = new Score(word);

        /* Calcule le score pour la lettre d'indice 0
           de la tentative
         */
        score.assess(0, attempt);

        return score;
    }
}
