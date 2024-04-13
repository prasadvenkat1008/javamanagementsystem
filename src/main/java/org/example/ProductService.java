package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    // List<Product> products = new ArrayList<>();
    ProductDb db = new ProductDb();

    public void addProduct(Product p) {
        db.save(p);

    }


    public List<Product> getallProducts() {
        return db.getAll();
    }
}
    /*public Product getProduct(String name){
        for(Product p:products){
            if(p.getName().equals(name)){
                return p;
            }

        }
        return null;
    }
    public List<Product> getProductwithtext(String text) {
        List<Product> prods = new ArrayList<>();
        String str = text.toLowerCase();
        for(Product p: products) {
            String name = p.getName().toLowerCase();
            String type = p.getType().toLowerCase();
            String place = p.getPlace().toLowerCase();

            if(name.contains(str) || type.contains(str) || place.contains(str)) {
                prods.add(p);
            }

        }
        return prods; */


