package com.sergeypashko.projectpress.service;

import com.sergeypashko.projectpress.dto.ArticleDtoRequest;
import com.sergeypashko.projectpress.dto.ArticleDtoUpdate;
import com.sergeypashko.projectpress.entities.Article;
import com.sergeypashko.projectpress.mapper.DtoEntityMapper;
import com.sergeypashko.projectpress.repos.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

/*класс для методов*/
@Component
@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    @Transactional
    public Article save(ArticleDtoRequest dtoRequest) {
        Article article = DtoEntityMapper.map(dtoRequest);
        article.setAdddate(LocalDate.now());

        return articleRepository.save(article);
    }

    @Transactional
    public Article update(ArticleDtoUpdate dtoUpdate) {
        Article article = DtoEntityMapper.map(dtoUpdate);

        return articleRepository.save(article);
    }

    @Transactional
    public void deleteById(Integer id) {
        articleRepository.deleteById(id);
    }

    public Article getById(Integer id) {
        return articleRepository.getReferenceById(id);
    }

    public List<Article> getAll() {
        return articleRepository.findAll(Sort.by(Sort.Direction.DESC, "publdate"));
    }

    public List<Article> getAll(String keyword) {
        return articleRepository.findArticlesByArticleContaining(keyword);
    }
}