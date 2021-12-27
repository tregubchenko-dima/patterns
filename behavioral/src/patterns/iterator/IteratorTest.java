package patterns.iterator;

public class IteratorTest {

    public static void main(String[] args){
        String[] products = {"Potato", "Water", "Bread", "Banana", "Cucumbers"};

        Shop shop = new Shop();
        shop.setProducts(products);

        Iterator iterator = shop.getIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
