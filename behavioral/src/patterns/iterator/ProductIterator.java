package patterns.iterator;

import java.util.NoSuchElementException;

public class ProductIterator implements Iterator{

    private Shop collection;
    private int position;

    public ProductIterator(Shop collection) {
        this.collection = collection;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return collection.getProducts().length - position > 0;
    }

    @Override
    public Object next() {
        if(collection.getProducts().length <= 0){
            throw new NoSuchElementException("There is no elements!");
        }

        String res = collection.getProducts()[position] + "   from The Best Shop Ever!";
        position++;

        return res;
    }
}
