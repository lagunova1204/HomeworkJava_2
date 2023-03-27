// 3*дополнительно. К калькулятору из предыдущего дз добавить логирование.
// 1 + 3 = 4
// 4 + 3 = 7

import java.io.FileWriter;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in, "Cp866");
        System.out.println("Введите первое число: ");
        int num1 = iScanner.nextInt();
        System.out.println("Введите оператор: +, -, /, * ");
        char operator = iScanner.next().charAt(0);
        System.out.println("Введите второе число: ");
        int num2 = iScanner.nextInt();
        int result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '*':
                result = num1 * num2;
                break;
        }
        System.out.printf("%s %s %s = %s", num1, operator, num2, result);
        iScanner.close(); 

        StringBuilder newTask = new StringBuilder();
        newTask.append(num1).append(operator).append(num2).append("=").append(result).append("\n");

        try {
            FileWriter fw = new FileWriter("log_task3.txt", true);
            fw.write(newTask.toString());
            fw.close();
        } catch (Exception e) {
            System.out.println("ERROR!");
        }  
    }
}
