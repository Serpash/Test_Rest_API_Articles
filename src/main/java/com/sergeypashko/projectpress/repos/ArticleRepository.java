package com.sergeypashko.projectpress.repos;

import com.sergeypashko.projectpress.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {
    public List<Article> findArticlesByArticleContaining(String keyword);
}