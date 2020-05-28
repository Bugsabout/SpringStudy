package wuxl.study;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import wuxl.study.entity.Category;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //！！！IDEA和Eclipse的资源文件叫法不同，IDEA叫resources，eclipse叫做src，防止位置不到会访问不到资源配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" });
        Category c = (Category) context.getBean("c");
        System.out.println(c.getName());
    }
}
