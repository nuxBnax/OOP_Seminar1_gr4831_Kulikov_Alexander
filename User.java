public class User{
    private String login;
    private String password;
    private Basket basket;

    /**
     * @param basket корзина покупателя
     */
    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    /**
     *
     * @param login логин покупателя
     * @param password пароль покупателя
     * @param basket корзина покупателя
     */
    public User(String login, String password, Basket basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }
    @Override
    public String toString() {
        return "User с логином - " + login +
                ", password - " + password + ", " + basket;
    }
}
