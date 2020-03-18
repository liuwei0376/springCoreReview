package com.toturialspoint.c02_DI.p01_constructorDI;

/**
 * User: Administrator
 * Date: 2020/3/16
 * Time: 16:36
 * Desc:
 */
public class TextEditor {

    private SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor constructor." );
        this.spellChecker = spellChecker;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }

}

class SpellChecker {
    public SpellChecker(){
        System.out.println("Inside SpellChecker constructor." );
    }
    public void checkSpelling() {
        System.out.println("Inside checkSpelling." );
    }
}