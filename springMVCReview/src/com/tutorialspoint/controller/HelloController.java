package com.tutorialspoint.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * User: Administrator
 * Date: 2020/3/17
 * Time: 18:34
 * Desc:
 *
 * Spring MVC Hello World 例子
 下面的例子说明了如何使用 Spring MVC 框架来编写一个简单的基于 web 的 Hello World 应用程序。下面让我们使用 Eclipse IDE，然后按照下面的步骤使用 Spring 的 Web 框架来开发一个动态 Web 应用程序：

 步骤	描述
 1	创建一个名称为 HelloWeb 的动态 Web 项目，并且在已创建的项目的 src 文件夹中创建一个包 com.tutorialspoint。
 2	将上面提到的 Spring 和其他库拖拽到文件夹 WebContent/WEB-INF/lib 中。
 3	在 com.tutorialspoint 包下创建一个 Java 类 HelloController。
 4	在 WebContent/WEB-INF 文件夹下创建 Spring 的配置文件 Web.xml 和 HelloWeb-servlet.xml。
 5	在 WebContent/WEB-INF 文件夹下创建名称为 jsp 的子文件夹。在这个子文件夹下创建一个视图文件 hello.jsp。
 6	最后一步是创建所有的源代码和配置文件的内容，并导出该应用程序，正如下面解释的一样。

 */
@Controller
@RequestMapping("/hello")
public class HelloController{
    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "hello";
    }
}
