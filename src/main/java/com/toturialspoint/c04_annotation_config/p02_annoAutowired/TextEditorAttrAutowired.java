package com.toturialspoint.c04_annotation_config.p02_annoAutowired;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * User: Administrator
 * Date: 2020/3/17
 * Time: 10:49
 * Desc:
 */

public class TextEditorAttrAutowired {

    /* @Autowired 注解 使用方式②.
     * 属性中的 @Autowired
     你可以在属性中使用 @Autowired 注释来除去 setter 方法。当时使用 为自动连接属性传递的时候，
     Spring 会将这些传递过来的值或者引用自动分配给那些属性。所以利用在属性中 @Autowired 的用法，
     你的 TextEditor.java 文件将变成如下所示：
     */
    @Autowired
    private SpellChecker spellChecker;

    public TextEditorAttrAutowired() {
        System.out.println("Inside TextEditorAttrAutowired constructor.");
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}