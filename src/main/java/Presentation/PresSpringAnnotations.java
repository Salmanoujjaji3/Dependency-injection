package Presentation;

import METIER.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringAnnotations {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("METIER","ext");
        IMetier metier = (IMetier)context.getBean(IMetier.class);
        System.out.println(metier.calcul());
    }
}
