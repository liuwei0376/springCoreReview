package com.toturialspoint.c03_Autowired.p01_byName;

/**
 * User: Administrator
 * Date: 2020/3/16
 * Time: 18:16
 * Desc:
 */
public class TextEditor {
    private SpellChecker spellChecker;
    private String name;
    public void setSpellChecker( SpellChecker spellChecker ){
        this.spellChecker = spellChecker;
    }
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
