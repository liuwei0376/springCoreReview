package com.tutorialspoint.controller;

import com.tutorialspoint.model.SpringException;
import com.tutorialspoint.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

/**
 * User: Administrator
 * Date: 2020/3/17
 * Time: 19:20
 * Desc:
 * <p>
 * Spring MVC 表单处理例子
 * 下面的例子说明了如何编写一个简单的基于 web 的应用程序，它利用了使用 Spring 的 Web MVC 框架的 HTML 表单。为了开始使用它，让我们在恰当的位置使用 Eclipse IDE，然后按照下面的步骤使用 Spring 的 Web 框架来开发一个动态的基于表单的 Web 应用程序：
 * <p>
 * 步骤	描述
 * 1	创建一个名称为 HelloWeb 的动态 Web 项目，并且在已创建的项目的 src 文件夹中创建一个包 com.tutorialspoint。
 * 2	将上面提到的 Spring 和其他库拖拽到文件夹 WebContent/WEB-INF/lib 中。
 * 3	在 com.tutorialspoint 包下创建一个 Java 类 Student 和 StudentController。
 * 4	在 WebContent/WEB-INF 文件夹下创建 Spring 的配置文件 Web.xml 和 HelloWeb-servlet.xml。
 * 5	在 WebContent/WEB-INF 文件夹下创建名称为 jsp 的子文件夹。在这个子文件夹下创建视图文件 student.jsp 和 result.jsp。
 * 6	最后一步是创建所有的源代码和配置文件的内容，并导出该应用程序，正如下面解释的一样。
 */

@Controller
public class StudentController {

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ModelAndView student() {
        return new ModelAndView("student", "command", new Student());
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("HelloWeb") Student student,
                             ModelMap model) {
        //Spring异常处理例子 https://www.w3cschool.cn/wkspring/1hqc1mmr.html
        if (student.getName().length() < 5) {
            throw new SpringException("Given name is too short.");
        } else {
            model.addAttribute("name", student.getName());
        }

        if (student.getAge() < 12) {
            throw new SpringException("Given age is too low.");
        } else {
            model.addAttribute("age", student.getAge());
        }

        model.addAttribute("id", student.getId());
        return "result";
    }

}
