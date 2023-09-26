import java.util.ArrayList;

public class Basket{
    ArrayList<Object> basket;

    /**
     *
     */
    public Basket() {
        this.basket = new ArrayList<>();
    }

    /**
     * Функция удаляет товар с указанным названием из множества setStore
     * и добавляет его в корзину покупателя
     * @param category категория товара
     * @param name название товара
     */
    public void buyProduct(Category category, String name) {
        basket.add(category.removeProduct(name));
    }
    @Override
    public String toString() {
        return "В корзине: " + basket;
    }
}
