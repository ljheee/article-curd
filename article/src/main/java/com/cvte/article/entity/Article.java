package com.cvte.article.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigInteger;

/**
 * 文章对象
 */
@Entity
public class Article {

    @Id
    @GeneratedValue
    private Integer id;

    private String title;
    private String content;
    private BigInteger createdTime;
    private BigInteger updatedTime;
    private boolean isDel;


    public Article() {
    }


    public Article(Integer id, String title, String content, BigInteger createdTime, BigInteger updatedTime,
                   boolean isDel) {
        super();
        this.id = id;
        this.title = title;
        this.content = content;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
        this.isDel = isDel;
    }

    public Article(String title, String content, BigInteger createdTime, BigInteger updatedTime, boolean isDel) {
        this.title = title;
        this.content = content;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
        this.isDel = isDel;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getContent() {
        return content;
    }


    public void setContent(String content) {
        this.content = content;
    }


    public BigInteger getCreatedTime() {
        return createdTime;
    }


    public void setCreatedTime(BigInteger createdTime) {
        this.createdTime = createdTime;
    }


    public BigInteger getUpdatedTime() {
        return updatedTime;
    }


    public void setUpdatedTime(BigInteger updatedTime) {
        this.updatedTime = updatedTime;
    }


    public boolean isDel() {
        return isDel;
    }


    public void setDel(boolean isDel) {
        this.isDel = isDel;
    }


    @Override
    public String toString() {
        return "Article [id=" + id + ", title=" + title + ", content=" + content + ", createdTime=" + createdTime
                + ", updatedTime=" + updatedTime + ", isDel=" + isDel + "]";
    }

}
