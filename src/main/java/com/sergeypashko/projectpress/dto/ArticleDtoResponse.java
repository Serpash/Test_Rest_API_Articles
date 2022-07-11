package com.sergeypashko.projectpress.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
/*Тут мы из внешнего получаем ВСЕ значения в том числе адддату и айди, которых не было в реквесте*/
@Data
@AllArgsConstructor
public class ArticleDtoResponse {
    private Integer id;

    private String article;

    private String name;

    private String surname;

    private String jname;

    private String artname;

    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate adddate;

    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate publdate;
}
