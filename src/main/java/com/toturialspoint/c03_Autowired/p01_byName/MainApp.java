package com.toturialspoint.c03_Autowired.p01_byName;

/**
 * User: Administrator
 * Date: 2020/3/16
 * Time: 18:33
 * Desc:
 * 这种模式由属性名称指定自动装配。Spring 容器看作 beans，在 XML 配置文件中 beans 的
 * auto-wire 属性设置为 byName。然后，它尝试将它的属性与配置文件中定义为相同名称的
 * beans 进行匹配和连接。如果找到匹配项，它将注入这些 beans，否则，它将抛出异常。
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("autowired/Beans_Autowired_byName.xml");
        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();
    }
}
