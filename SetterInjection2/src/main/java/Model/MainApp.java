package Model;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("1.DELL ");
        System.out.println("2.LENOVO ");
        System.out.println("ENTER YOUR CHOICE ");
        int ch = sc.nextInt();

        Laptop laptop = null;
        if (ch == 1) {
            laptop = context.getBean("dellLaptop", Laptop.class);
        } else if (ch == 2) {
            laptop = context.getBean("lenovoLaptop", Laptop.class);
        } else {
            System.out.println("INVALID CHOICE ");
        }
        if (laptop!=null){
            laptop.laptopInfo();
            laptop.processorInformation();
        }else {
            System.out.println("SOMETHING WENT WRONG ");
        }

    }
}
