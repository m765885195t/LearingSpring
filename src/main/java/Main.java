import ImpServer.Song;
import Model.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Auto.xml");

      //  Students user = (Students) context.getBean("user");
      //  user.showAge();
        AutoStu autoStu = (AutoStu)context.getBean("autoStu");
        ((Song)context.getBean("song2")).pring();
       // ((Song)context.getBean("song3")).pring();

        autoStu.show();


    }
}