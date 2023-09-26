import java.util.HashSet;
import java.util.Set;

public class Category {
    protected String categoryName;
    public Set<Product> setStore;

    /**
     * @param categoryName название категории товара
     */
    public Category(String categoryName) {
        this.categoryName = categoryName;
        this.setStore = new HashSet<>();

    }

    /**
     * Функция добавлет товар в множество setStore
     * @param product атрибуты товара
     */
    public void add (Product product) {
        setStore.add(product);
    }

    /**
     * Функция ищет товар по названию в setStore
     *  и возвращает его атрибуты
     * @param name название товара
     */
    public Product findProduct(String name) {
        for (Product product : setStore) {
            if(product.name.equals(name)){
                return product;
            }
        }
        return null;
    }

    /**
     * Функция ищет товар по названию и удаляет его из множества setStore
     * @param name название товара
     */
    public Product removeProduct(String name) {
        Product product = findProduct(name);
        setStore.remove(product);
        return product;
    }
    @Override
    public String toString() {
        return categoryName.toUpperCase() + "\n" + setStore;
    }
}


