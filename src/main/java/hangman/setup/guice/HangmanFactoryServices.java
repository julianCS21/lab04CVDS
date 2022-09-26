/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.setup.guice;

/**
 *
 * @author 2106913
 */

import hangman.model.*;
import hangman.model.dictionary.HangmanDictionary;
import hangman.model.dictionary.FrenchDictionaryDataSource;
import hangman.view.HangmanNoviolentoPanel;
import hangman.view.HangmanPanel;

import java.util.Dictionary;

public class HangmanFactoryServices extends com.google.inject.AbstractModule {

    @Override
    protected void configure() {
        bind(GameScore.class).to(OriginalScore.class);
        bind(HangmanDictionary.class).to(FrenchDictionaryDataSource.class);
        bind(Language.class).to(French.class);
        bind(GameScore.class).to(BonusScore.class);

    }

}
