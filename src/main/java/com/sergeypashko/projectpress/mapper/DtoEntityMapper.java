package com.sergeypashko.projectpress.mapper;

import com.sergeypashko.projectpress.dto.ArticleDtoRequest;
import com.sergeypashko.projectpress.dto.ArticleDtoUpdate;
import com.sergeypashko.projectpress.entities.Article;
/*в этом классе мы мапим инфу чтобы вручную не делать это в сервисе*/
public abstract class DtoEntityMapper {
    public static Article map(ArticleDtoRequest dtoRequest) {
        Article article = new Article();
        article.setArticle(dtoRequest.getArticle());
        article.setArtname(dtoRequest.getArtname());
        article.setJname(dtoRequest.getJname());
        article.setPubldate(dtoRequest.getPubldate());
        article.setName(dtoRequest.getName());
        article.setSurname(dtoRequest.getSurname());

        return article;
    }

    public static Article map(ArticleDtoUpdate dtoUpdate) {
        Article article = new Article();
        article.setId(dtoUpdate.getId());
        article.setArticle(dtoUpdate.getArticle());
        article.setArtname(dtoUpdate.getArtname());
        article.setJname(dtoUpdate.getJname());
        article.setPubldate(dtoUpdate.getPubldate());
        article.setName(dtoUpdate.getName());
        article.setSurname(dtoUpdate.getSurname());
        article.setAdddate(dtoUpdate.getAdddate());

        return article;
    }
}