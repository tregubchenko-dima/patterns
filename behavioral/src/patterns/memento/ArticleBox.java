package patterns.memento;

public class ArticleBox {

    private String article;

    public ArticleBox(String article) {
        this.article = article;
    }

    public String getArticle(){
        return article;
    }
}
