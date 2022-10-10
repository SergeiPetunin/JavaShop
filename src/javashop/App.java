/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javashop;

import java.util.Scanner;
import entity.Product;
import entity.Buyer;
import entity.Order;
/**
 *
 * @author spetu
 */
public class App {
    boolean repeat = true;
    public void run() {
        
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("0. Выход");
            System.out.println("1. Сделать заказ.");
            System.out.println("2. Посмотреть товары" );
            
            int task = scanner.nextInt();
            scanner.nextLine();
            switch (task){
                case 0:
                    repeat = false;
                    break;
                case 1:
                    System.out.println("1. Сделать заказ");
                    Order order = new Order();
                    break;
                case 2:
                    System.out.println("2. Добавить читателя");
                    
                    break;
                default:
                    System.out.println("Выберете номер функции из списка");
            }
        }while(repeat);
        System.out.println("Пока");
    }
}
