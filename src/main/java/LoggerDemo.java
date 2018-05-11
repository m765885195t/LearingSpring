import Col.testLogger2;
import Col.testloger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LoggerDemo {
    final static Logger logger = LoggerFactory.getLogger(LoggerDemo.class);
    public static void main(String[] args) {
       new Thread(new Runnable() {
           @Override
           public void run() {
               while (true) {
                   try {
                       Thread.sleep(1000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   testloger.printLoger();
                   testLogger2.printLoger();

                   logger.info("LoggerDemo 成功了");
                   logger.error("LoggerDemo 成功了");
                   logger.debug("LoggerDemo 成功了");
               }
           }
       }).start();

    }
}
