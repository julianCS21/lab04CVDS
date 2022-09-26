package hangman.model;

/**
 * clase que realiza la puntacion del juego Hangman, cuando inicia con ceros puntos, cada letra correcta se bonifica
 * con 10 puntos y cada letra incorrecta se penaliza con 5 puntos. 
 *  
 *
 *
 */
public class BonusScore implements GameScore {



	public int calculateScore (int correctCount, int incorrectCount) throws GameScoreException{
		if(correctCount < 0 || incorrectCount < 0) {
			throw new GameScoreException(GameScoreException.PARAMETRO_INVALIDO);
		}
		return Math.max(correctCount*10 - incorrectCount*5,0);
	}
}
