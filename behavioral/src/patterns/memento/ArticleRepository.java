package patterns.memento;

public class ArticleRepository {

    private ArticleBox article;

    public void addArticle(ArticleBox articleBox){
        this.article = articleBox;
    }

    public ArticleBox getArticle(){
        return this.article;
    }
}
