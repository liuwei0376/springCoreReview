package com.toturialspoint.c03_Autowired.p02_byType;

/**
 * User: Administrator
 * Date: 2020/3/16
 * Time: 18:33
 * Desc:
 *
 * 这种模式由属性类型指定自动装配。Spring 容器看作 beans，在 XML 配置文件中 beans 的
 * autowire 属性设置为 byType。然后，如果它的 type 恰好与配置文件中 beans 名称中的
 * 一个相匹配，它将尝试匹配和连接它的属性。如果找到匹配项，它将注入这些 beans，否则，它将抛出异常
 *
 * 异常栈信息如下:
 * 信息: Loading XML bean definitions from class path resource [Beans_Autowired_byType.xml]
 Exception in thread "main" java.lang.NullPointerException
 at com.toturialspoint.c03_Autowired.p02_byType.TextEditor.spellCheck(TextEditor.java:25)
 at com.toturialspoint.c03_Autowired.p02_byType.MainApp.main(MainApp.java:17)
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("autowired/Beans_Autowired_byType.xml");
        TextEditor te = (TextEditor) context.getBean("textEditorByType");
        te.spellCheck();
    }
}
