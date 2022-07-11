package com.sergeypashko.projectpress.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "\"articles\"")
public class Article {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)/*хибернейт будет генерировать айди с итерацией +1*/
    private Integer id;

    @Column(name = "article")
    private String article;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "jname")
    private String jname;

    @Column(name = "artname")
    private String artname;

    @Column(name = "adddate")
    private LocalDate adddate;

    @Column(name = "publdate")
    private LocalDate publdate;

    public Article(String article, String name, String surname, String jname, String artname, LocalDate adddate, LocalDate publdate) {
        this.article = article;
        this.name = name;
        this.surname = surname;
        this.jname = jname;
        this.artname = artname;
        this.adddate = adddate;
        this.publdate = publdate;
    }
}