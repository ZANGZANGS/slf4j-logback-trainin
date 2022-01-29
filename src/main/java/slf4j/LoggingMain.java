package slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingMain {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(LoggingMain.class);

        for (int count = 1; count <= 5; count++) {
            logger.trace("trace log!!! {}", count); // logback 의 root 설정은 debug로 trace는 나오지 않는다.
            logger.debug("debug log!!! {}", count);
            logger.info("info log!!! {}", count);
            logger.warn("warn log!!! {}", count);
            logger.error("error log!!! {}", count); //logback.xml의 root 설정을 error 레벨로 설정하면 error 레벨만 출력이 된다.
        }
    }
}
