package com.toturialspoint.c04_annotation_config.p02_annoAutowired;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * User: Administrator
 * Date: 2020/3/17
 * Time: 10:49
 * Desc:
 */

public class TextEditor {

    private SpellChecker spellChecker;

    /* @Autowired 注解 使用方式①.
    Setter 方法中的 @Autowired ;
    * 你可以在 XML 文件中的 setter 方法中使用 @Autowired 注释来除去 元素。当 Spring遇到一个在 setter 方法中使用的 @Autowired 注释，它会在方法中视图执行 byType 自动连接。*/
    @Autowired
    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}