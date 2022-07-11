package com.sergeypashko.projectpress.controllers;

import com.sergeypashko.projectpress.dto.ArticleDtoRequest;
import com.sergeypashko.projectpress.dto.ArticleDtoUpdate;
import com.sergeypashko.projectpress.entities.Article;
import com.sergeypashko.projectpress.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("article")
@RequiredArgsConstructor
public class ArticleController {
    private final ArticleService service;

    @GetMapping("/get/{id}") /*getting id*/
    public Article getArticle(@PathVariable String id) {
        return service.getById(Integer.parseInt(id));
    }

    @PostMapping("/add") /*adding new article with configure parametrs(json)*/
    public Article addArticle(@RequestBody ArticleDtoRequest dtoRequest) {
        return service.save(dtoRequest);
    }

    @PostMapping("/update") /*updating data*/
    public Article updateArticle(@RequestBody ArticleDtoUpdate dtoUpdate) {
        return service.update(dtoUpdate);
    }

    @PostMapping("/delete/{id}") /*delete data from db via id*/
    public void deleteArticle(@PathVariable Integer id) {
        service.deleteById(id);
    }

    @GetMapping("/getAll") /*get all data*/
    public List<Article> getAll() {
        return service.getAll();
    }

    @GetMapping("/getAll/{keyword}")/*get data by keyword*/
    public List<Article> getAll(@PathVariable String keyword) {
        return service.getAll(keyword);
    }
}