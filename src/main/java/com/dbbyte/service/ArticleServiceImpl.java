package com.dbbyte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbbyte.dao.ArticleDao;
import com.dbbyte.model.Article;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleDao articleDao;

	@Override
	public Article getArticleById(int articleId) {
		Article obj = articleDao.getArticleById(articleId);
		return obj;
	}

	@Override
	public List<Article> getAllArticles() {
		return articleDao.getAllArticles();
	}

	@Override
	public synchronized boolean addArticle(Article article) {
		if (articleDao.articleExists(article.getTitle(), article.getCategory())) {
			return false;
		} else {
			articleDao.addArticle(article);
			return true;
		}
	}

	@Override
	public void updateArticle(Article article) {
		articleDao.updateArticle(article);
	}

	@Override
	public void deleteArticle(int articleId) {
		articleDao.deleteArticle(articleId);
	}

}
