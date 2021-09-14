package patterns.memento;

public class MementoTest {

    public static void main(String[] args){

        ArticleRepository articleRepository = new ArticleRepository();
        ArticleWriter articleWriter = new ArticleWriter();
        articleWriter.writeArticle("My first article!\n");
        System.out.println(articleWriter.toString());

        ArticleBox article = articleWriter.saveArticle();
        articleRepository.addArticle(article);
        System.out.println("The article has been written!\n");


        articleWriter.writeArticle("My second article!");
        System.out.println("The second article has been written!");
        System.out.println(articleWriter.toString());
        System.out.println("That's definitely my worst article. " +
                "I don't wanna people read it. Before they do it, " +
                "I get it away and remind them about my first nice article\n");

        articleWriter.restoreArticle(articleRepository.getArticle());
        System.out.println(articleWriter.toString());
        System.out.println("That's better!");
    }
}
