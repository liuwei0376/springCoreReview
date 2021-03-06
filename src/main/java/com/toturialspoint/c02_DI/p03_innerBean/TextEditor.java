package com.toturialspoint.c02_DI.p03_innerBean;

/**
 * User: Administrator
 * Date: 2020/3/16
 * Time: 16:36
 * Desc:
 */
public class TextEditor {

    private SpellChecker spellChecker;

    //a setter method to inject the dependency
    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Inside setSpellChecker");
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void spellCheck(){
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