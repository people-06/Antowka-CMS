package ru.antowka.entity;

/**
 * Created by anton on 03.08.15.
 */
public class Article {

    private int articleId;
    private String title;
    private String shortDescripion;
    private String description;

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortDescripion() {
        return shortDescripion;
    }

    public void setShortDescripion(String shortDescripion) {
        this.shortDescripion = shortDescripion;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isSystem() {
        return isSystem;
    }

    public void setIsSystem(boolean isSystem) {
        this.isSystem = isSystem;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setIsDelete(boolean isDelete) {
        this.isDelete = isDelete;
    }

    private boolean isSystem;
    private boolean isDelete;


}
