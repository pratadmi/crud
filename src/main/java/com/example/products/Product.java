package com.example.products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="MYTABLE")
public class Product {

    @Id
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

}
