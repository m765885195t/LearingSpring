package Col;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class testloger {
    final static Logger logger = LoggerFactory.getLogger(testloger.class);
    public static void printLoger(){
        logger.info("testloger 成功了");
        logger.error("testloger 成功了");
        logger.debug("testloger 成功了");
    }
}
