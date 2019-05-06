package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (var stdin = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Input x: ");
            int x = Integer.valueOf(stdin.readLine());
            System.out.print("Input y: ");
            int y = Integer.valueOf(stdin.readLine());
            System.out.print("Input operation(add/sub/mul/div): ");
            String op = stdin.readLine();

            ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
            MathOp obj = (MathOp) context.getBean(op);
            if (obj == null) {
                throw new IllegalArgumentException(op);
            }
            System.out.println(obj.perform(x, y));
        }
    }
}
