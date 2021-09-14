package patterns.memento;

public class ArticleWriter {

    private String article;

    public void writeArticle(String article){
        this.article = article;
    }

    public ArticleBox saveArticle(){
        return new ArticleBox(article);
    }

    public void restoreArticle(ArticleBox articleBox){
        this.article = articleBox.getArticle();
    }

    @Override
    public String toString() {
        return "ArticleWriter{" +
                "article='" + article + '\'' +
                '}';
    }
}
