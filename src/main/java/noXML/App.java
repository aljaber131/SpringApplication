package noXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Exam midexam = applicationContext.getBean("getMidexamdate", Exam.class);
        Exam finalexam = applicationContext.getBean("getFinalexamdate", Exam.class);
        System.out.println(midexam.result());
        System.out.println(finalexam.result());
    }
}
