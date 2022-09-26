package hangman.Test;



import hangman.model.*;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class ScoreTest {
    private GameScore Score ;


    @Test(expected = GameScoreException.class)
    public void DadoUnConteoCorrectoYUnConteoIncorrectoNegativoConUnModeloOriginalEntoncesDeberiaArrojarExcepcion() throws IllegalAccessException {
        //arrange
        Score = new OriginalScore();


        //act
        int result = Score.calculateScore(100,-100);

        //assert
        //esta esperando una excepcion

    }

    @Test
    public void DadoUnConteoCorrectoYUnConteoIncorrectoConUnModeloOriginalEntoncesDeberiaCalcular() throws IllegalAccessException {
        //arrange
        Score = new OriginalScore();


        //act
        int result = Score.calculateScore(100,1);

        //assert
        assertEquals(result,190);

    }


    @Test(expected = GameScoreException.class)
    public void DadoUnConteoCorrectoYUnConteoIncorrectoNegativoConUnModeloBonusEntoncesDeberiaArrojarExcepcion() throws IllegalAccessException {
        //arrange
        Score = new BonusScore();


        //act
        int resultado = Score.calculateScore(100,-100);

        //assert
        //esta esperando una excepcion

    }


    @Test
    public void DadoUnConteoCorrectoYUnConteoIncorrectoNegativoConUnModeloBonusEntoncesDeberiaCalcular() throws IllegalAccessException {
        //arrange
        Score = new BonusScore();


        //act
        int result = Score.calculateScore(10,10);

        //assert
        assertEquals(result,50);


    }


    @Test(expected = GameScoreException.class)
    public void DadoUnConteoCorrectoYUnConteoIncorrectoNegativoConUnModeloPowerEntoncesDeberiaArrojarExcepcion() throws IllegalAccessException {
        //arrange
        Score = new PowerScore();


        //act
        Score.calculateScore(100,-100);

        //assert
        //esta esperando una excepcion

    }



    public void DadoUnConteoCorrectoYUnConteoIncorrectoNegativoConUnModeloPowerEntoncesDeberiaCalcular() throws IllegalAccessException {
        //arrange
        Score = new PowerScore();


        //act
        int result = Score.calculateScore(3,2);

        //assert
        assertEquals(result,139);

    }


}