package MapLesson;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Person son = new Person();
        son.setName("Tran Ngoc Son");
        son.setAge(45);
        System.out.println("Hello");
        log.info("This is a person {}", son);
    }
}
