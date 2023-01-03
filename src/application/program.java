package application;

import entites.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product>list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        Integer n = sc.nextInt();

        for (int i=1; i<n; i++){
           System.out.println("Product #" + i + " data: ");
           System.out.print("Common, used or imported (c/u/i)? ");
           char type = sc.nextLine().charAt(0);
           if(type == 'c' ){
               System.out.print("Name: ");
               String name = sc.nextLine();
               Double price = sc.nextDouble();
               list.add(new Product(name, price));

           }else if(type == 'u') {
               System.out.print("Name: ");
               String name = sc.nextLine();
               System.out.print("Price");
               Double price = sc.nextDouble();
               list.add(new Product());
           }else if(type == 'i'){
               System.out.print("Name: ");
               String name = sc.nextLine();
               System.out.print("Price: ");
               Double price = sc.nextDouble();
           }
        }
        sc.close();
    }

}