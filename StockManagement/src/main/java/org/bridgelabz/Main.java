package org.bridgelabz;

import java.util.Scanner;

import static org.bridgelabz.StockPortfolio.getTotalValues;
import static org.bridgelabz.StockPortfolio.retrieve;
import static org.bridgelabz.StockPortfolio.print;
import static  org.bridgelabz.StockPortfolio.add;



public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Stock Management Program ");
        boolean running= true;
        Scanner sc= new Scanner(System.in);
        while(running){
            System.out.println("Press 1 to set new stock");
            System.out.println("Press 2 to retrieve stock data");
            System.out.println("Press 3 to Print Stock Report");
            System.out.println("Press 4 to print total values of shares");
            System.out.println("Press 5 to end Program");
            System.out.println("Press your Option");
            int option= sc.nextInt();
            switch(option){
                case 1:
                    setNewStock();
                    break;
                case 2:
                    retrieveStock();
                    break;
                case 3:
                    print();
                    break;
                case 4:
                    System.out.println(getTotalValues());
                    break;
                case 5 :
                    running=false;
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        }
    }

    public static void setNewStock(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter  the name of stock");
        String name=sc.nextLine();
        System.out.println("Enter the number of stock ");
        int n= sc.nextInt();
        System.out.println("Enter the share price");
        int price= sc.nextInt();
        Stock st= new Stock(name,n,price);
        add(st);
    }

    public static void retrieveStock(){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the share name: ");
        String name= sc.nextLine();
        retrieve(name);
    }


}