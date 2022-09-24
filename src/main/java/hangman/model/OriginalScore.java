package hangman.model;

/**
 * Presenta el esquema para realizar la puntacion del juego Hangman, cuando inicia con 100 puntos, las letras correcta no se bonifican 
 * y cada letra incorrecta se penaliza con 10 puntos.
 * 
 *
 *
 */
public class OriginalScore implements GameScore{
	private static int PUNTAJE = 100;



	public int calculateScore (int correctCount, int incorrectCount) throws GameScoreException{
		if(correctCount <0 || incorrectCount <0 || incorrectCount > 10) {
			throw new GameScoreException(GameScoreException.PARAMETRO_INVALIDO);
		}
		return PUNTAJE + correctCount - incorrectCount*10;
	}
}
