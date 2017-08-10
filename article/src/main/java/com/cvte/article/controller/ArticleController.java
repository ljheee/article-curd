package com.cvte.article.controller;

import com.cvte.article.entity.Article;
import com.cvte.article.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.*;

/**
 * Controller
 * 通过这里配置使下面的映射都在/articles下
 * 返回json（RestController）
 */
@RestController
@RequestMapping(value = "/articles")
public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;


    /**
     * 处理"/articles/"的GET请求，用来获取articles列表
     *
     * @return
     */
    @RequestMapping(value = "/collection", method = RequestMethod.GET)
    public List<Article> getArticleList() {
        return articleRepository.findAll();
    }


    /**
     * 处理POST请求，用来创建插入Article
     *
     * @param title
     * @param content
     * @param createdTime
     * @param updatedTime
     * @param isDel
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Article postArticle(
            @RequestParam("title") String title,
            @RequestParam("content") String content,
            @RequestParam("createdTime") BigInteger createdTime,
            @RequestParam("updatedTime") BigInteger updatedTime,
            @RequestParam("isDel") boolean isDel) {
        // 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数
        Article article = new Article(title, content, createdTime, updatedTime, isDel);

        return articleRepository.save(article);
    }


    /**
     * 处理"/articles/id={id}"的GET请求，用来获取url中id值的Article信息
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/id={id}", method = RequestMethod.GET)
    public Article getArticle(@PathVariable Integer id) {

        return articleRepository.findOne(id);
    }

    /**
     * 处理"/articles/id={id}"的PUT请求，用来更新Article信息
     *
     * @param id
     * @param article
     * @return
     */
    @RequestMapping(value = "/id={id}", method = RequestMethod.PUT)
    public Article putArticle(@PathVariable Integer id, @ModelAttribute Article article) {

        return articleRepository.save(article);
    }

    /**
     * 处理"/articles/id={id}"的DELETE请求，用来删除id值的Article
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/id={id}", method = RequestMethod.DELETE)
    public void deleteArticle(@PathVariable Integer id) {
        articleRepository.delete(id);
    }


}
