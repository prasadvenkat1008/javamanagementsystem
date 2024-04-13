package org.example;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProductService service = new  ProductService();


        /*service.addProduct(new Product("Dell", "Laptop", "Brown Table", 2024));
        service.addProduct(new Product("Dell", "Laptop", "Brown Table", 2024));
        service.addProduct(new Product("HP", "Desktop Computer", "White Chair", 2024));
        service.addProduct(new Product("Apple", "iPad", "Black Stand", 2024));
        service.addProduct(new Product("Samsung", "Galaxy Smartphone", "Wireless Charger", 2024));
        service.addProduct(new Product("Sony", "Bravia TV", "Wall Mount", 2024));
        service.addProduct(new Product("Microsoft", "Surface Laptop", "Blue Bag", 2024));
        service.addProduct(new Product("Lenovo", "Chromebook", "Desk Lamp", 2024));
        service.addProduct(new Product("ASUS", "Gaming PC", "RGB Mousepad", 2024));
        service.addProduct(new Product("Acer", "Monitor", "Adjustable Stand", 2024));
        service.addProduct(new Product("Google", "Pixelbook", "Stylus Pen", 2024));*/

       List<Product> products = service.getallProducts();
       for(Product p:products) {
            System.out.println(p);
       }
        //System.out.println("====================================");
        //Product p = service.getProduct("Acer");
        //System.out.println(p);

        //System.out.println("=============================");

        //List<Product> pr = service.getProductwithtext("brown");
        //for(Product pro: pr){
        //    System.out.println(pro);
        //}

    }
}