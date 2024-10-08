package example.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        example2();

    }
     private static void example1(){
         ApplicationContext context1 = new ClassPathXmlApplicationContext("context_1.xml");
         Car c = context1.getBean("bibika",Car.class);
         System.out.println("c " +c);
         Man m = context1.getBean("vasya", Man.class);
         System.out.println("m " +m);
     }
    private static void example2(){
        ApplicationContext context2 = new ClassPathXmlApplicationContext("context_2.xml");
        Man p1 = context2.getBean("sveta", Man.class);
        System.out.println("person1: " +p1);
        Man p2 = context2.getBean("lena", Man.class);
        System.out.println("person2: " +p2);
        Man p3 = context2.getBean("olya", Man.class);
        System.out.println("person2: " +p3);

    }
}