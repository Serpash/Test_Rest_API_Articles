package com.sergeypashko.projectpress.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@AllArgsConstructor
public class ArticleDtoUpdate {
    @NotNull
    private Integer id;

    @NotNull(message = "Should be not null")
    private String article;

    @Size(min = 1, max = 21, message = "Length can't be =>1 or =<21")
    private String name;

    @Size(min = 1, max = 21, message = "Length can't be =>1 or =<21")
    private String surname;

    @Size(min = 1, max = 21, message = "Length can't be =>1 or =<21")
    private String jname;

    @Size(min = 1, max = 21, message = "Length can't be =>1 or =<21")
    private String artname;

    @NotNull(message = "Should be not null")
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate adddate;

    @NotNull(message = "Should be not null")
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate publdate;
}
