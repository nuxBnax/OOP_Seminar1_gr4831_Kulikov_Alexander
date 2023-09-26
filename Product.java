public class Product{

    protected String name;
    protected int price;
    protected int rating;

    /**
     *
     * @param name название товара
     * @param price цена товара
     * @param rating рейтинг товара
     */
    public Product(String name, int price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
    @Override
    public String toString() {
        return name.toUpperCase() + ": цена - " + price + " рейтинг - " + rating;
    }
}
