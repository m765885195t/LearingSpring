import Model.Coder;
import Model.Stu2;
import Model.Students;
import Model.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;

public class Main{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("TT.xml");

      //  Students user = (Students) context.getBean("user");
      //  user.showAge();
//        Teacher teacher = (Teacher)context.getBean("teacher1");
        //teacher.Show();

  //      Coder coder = (Coder)context.getBean("coder");
      //  coder.Show();
        Stu2 stu = (Stu2)context.getBean("stu2");
        stu.showAge();

    }
}