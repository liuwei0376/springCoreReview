package com.toturialspoint.c04_annotation_config.p02_annoAutowired;

/**
 * User: Administrator
 * Date: 2020/3/17
 * Time: 10:52
 * Desc:
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        /*ApplicationContext ctx1 = new ClassPathXmlApplicationContext("annotation/Beans_Annotation_@Autowired_settermethod.xml");
        //①. Setter 方法中的 @Autowired ;
        TextEditor te = (TextEditor) ctx1.getBean("textEditor");
        te.spellCheck();

        System.out.println("\n\n-------------华丽的分割线--------------\n\n");

        ApplicationContext ctx2 = new ClassPathXmlApplicationContext("annotation/Beans_Annotation_@Autowired_attribute.xml");
        //②. 属性上的 @Autowired ;
        TextEditorAttrAutowired teaa = (TextEditorAttrAutowired) ctx2.getBean("textEditorAttrAutowired");
        teaa.spellCheck();
*/
        System.out.println("\n\n-------------华丽的分割线--------------\n\n");

        ApplicationContext ctx3 = new ClassPathXmlApplicationContext("annotation/Beans_Annotation_@Autowired_constructor.xml");
        //③. 构造器上的 @Autowired ;
        TextEditorConstructorAutowired teaa2 = (TextEditorConstructorAutowired) ctx3.getBean("textEditorConstructorAutowired");
        teaa2.spellCheck();
    }
}
