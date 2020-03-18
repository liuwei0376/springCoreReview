package com.toturialspoint.c04_annotation_config.p02_annoAutowired;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * User: Administrator
 * Date: 2020/3/17
 * Time: 10:49
 * Desc:
 */

public class TextEditorConstructorAutowired {

    private SpellChecker spellChecker;

    @Autowired
    public TextEditorConstructorAutowired(SpellChecker spellChecker) {
        System.out.println("Inside TextEditorConstructorAutowired constructor.");
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}