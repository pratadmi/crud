package com.example.products;

import com.dieselpoint.norm.Database;

import java.util.HashMap;
import java.util.List;

public class DBtest {

    static final String DB_URL = "jdbc:h2:~/test";
    static Database db = new Database();

    public static void main(String[] args) {
        db.setJdbcUrl(DB_URL);
        db.setUser("sa");

      /*  Product newProd = new Product();
        newProd.setId(5);
        newProd.setDescription("directly prod");
        newProd.setTitle("blablbla");


        db.insert(newProd);*/

        var list = db.sql("SELECT * FROM MYTABLE").results(HashMap.class);
        List lp = db.sql("SELECT * FROM MYTABLE").results(Product.class);
        System.out.println(lp.size());
        //.get(0).getDescription());
        System.out.println(list.get(1));
        System.out.println(list.size());
    }
}
