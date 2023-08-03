package com.workintech.abstraction.main;

import com.workintech.abstraction.product.Bread;
import com.workintech.abstraction.product.Chocolate;
import com.workintech.abstraction.product.Coke;
import com.workintech.abstraction.product.ProductForSale;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[5];
        products[0] = new Chocolate("Sweets", 10, "mammamiaa" ,"brown", true);
        products[1] = new Bread("Bakery", 5, "Çıtır ekmek","white","einkorn");
        products[2] = new Coke("drink", 8, "pıss", false);
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        if (products != null){
            for (ProductForSale product: products){
                if (product != null){
                    product.showDetails();
                }
            }
        }
    }
}