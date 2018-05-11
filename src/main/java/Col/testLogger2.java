package Col;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class testLogger2 {
    final static Logger logger = LoggerFactory.getLogger(testLogger2.class);
    public static void printLoger(){
        logger.info("testLogger2 成功了");
        logger.error("testLogger2 成功了");
        logger.debug("testLogger2 成功了");
    }
}