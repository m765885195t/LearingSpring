import ImpServer.Song;
import Model.*;
import Server.songS;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Auto.xml");

      //  Students user = (Students) context.getBean("user");
      //  user.showAge();
        AutoStu autoStu = (AutoStu)context.getBean("autoStu");
        Song a  = (Song)context.getBean("song3");
        a.pring();
//        context.getBean("mo");
        autoStu.show();
    }
}