package hangman.model;

/**
 * Presenta el esquema para realizar la puntacion del juego Hangman, cuando inicia con 0 puntos, la i-esima letra correcta se bonifica  
 * con 5^i , cada letra incorrecta se penaliza con 8 puntos y si con las reglas anterios sobrepasa 500 puntos, el puntaje es 500.
 * 
 *
 */
public class PowerScore implements GameScore{
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int calculateScore (int correctCount, int incorrectCount) throws GameScoreException{
		if(correctCount < 0 || incorrectCount < 0) throw new GameScoreException(GameScoreException.PARAMETRO_INVALIDO);
		int letraPotencia = 0 ;
		for (int i = 1; i <= correctCount; i++){
			letraPotencia += (int) Math.pow(5,i);
		}
		letraPotencia -= incorrectCount*8;
		if(letraPotencia < 0){
			return 0;
		}else{
			return Math.min(letraPotencia, 500);
		}	
	}
}
