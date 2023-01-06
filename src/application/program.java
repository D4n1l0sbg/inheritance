package application;

import entites.ImportedProduct;
import entites.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        List<Product>list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        Integer n = sc.nextInt();

        for (int i=1; i<=n; i++){
           System.out.println("Product #" + i + " data: ");
           System.out.print("Common, used or imported (c/u/i)? ");
           char type = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
           if(type == 'c' ){
               list.add(new Product(name, price));
           }else if(type == 'u') {
               System.out.print("Manufacture date (dd/MM/yyyy: ");
               Date date = sdf.parse(sc.next());
               list.add(new Product());
           }else if(type == 'i'){
               System.out.print("Customs Fee: ");
               Double customsFee = sc.nextDouble();
               list.add(new ImportedProduct(name, price, customsFee));
           }
           System.out.println("PRICE TAGS: ");
            for (Product prod: list
                 ) {
                System.out.println(prod.tagPrice());
            }
        }
        sc.close();
    }

}