package hangman.model;

public class GameScoreException extends RuntimeException{
    public static String PARAMETRO_INVALIDO = "Alguno de los parametros no es valido";
    
    public GameScoreException(){
        super();        
    }
    
    public GameScoreException(String mensaje){
        super(mensaje);
    }
}
