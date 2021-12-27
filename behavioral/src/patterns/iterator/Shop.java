package patterns.iterator;

public class Shop implements Collection{

    private String[] products;

    @Override
    public Iterator getIterator() {
        return new ProductIterator(this);
    }

    public String[] getProducts() {
        return products;
    }

    public void setProducts(String[] products) {
        this.products = products;
    }
}
