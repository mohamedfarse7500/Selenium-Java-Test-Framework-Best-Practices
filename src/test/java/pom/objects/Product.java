package pom.objects;

import pom.utils.JacksonUtils;

import java.io.IOException;

public class Product {
    private int id;
    private String name;
    public  Product(){}
    public Product(int id) throws IOException {
        Product [] products = JacksonUtils.deserializeJson("Product.json", Product[].class);
        for (Product product : products) {
            if (product.getId() == id) {
                this.id = product.getId();
                this.name = product.getName();
            }
        }
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

