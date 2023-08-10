package com.example.products;

import com.dieselpoint.norm.Database;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DBController {
    static final String DB_URL = "jdbc:h2:~/test";
    static Database db = new Database();

    public DBController(){
        db.setJdbcUrl(DB_URL);
        db.setUser("sa");
    }

    public List<Product> getAllProducts() {
        return db.sql("SELECT * FROM MYTABLE").results(Product.class);
    }
}
