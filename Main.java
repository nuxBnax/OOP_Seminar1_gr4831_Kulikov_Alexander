public class Main {

    public static void main(String[] args) {

        Category categSport = new  Category("Транспорт ");
        Category categWear = new  Category("Одежда ");
        Category categStuff = new  Category("Бытовые приборы ");

        categSport.add(new Product("Велосипед", 150, 10));
        categSport.add(new Product("Самокат", 50, 7));
        categSport.add(new Product("Велобег", 75, 8));
        categSport.add(new Product("Мопед", 250, 6));

        categWear.add(new Product("Шорты", 20, 10));
        categWear.add(new Product("Майка", 16, 9));
        categWear.add(new Product("Футболка", 23, 5));
        categWear.add(new Product("Кепка", 8, 8));
        categWear.add(new Product("Носки", 3, 5));

        categStuff.add(new Product("Утюг", 60, 6));
        categStuff.add(new Product("Овощерезка", 80, 7));
        categStuff.add(new Product("Фен", 70, 10));

        System.out.println(categSport);
        System.out.println(categWear);
        System.out.println(categStuff);
        System.out.println("--------------------------------------------------------------------------------------------");

        Basket basket1 = new Basket();
        Basket basket2 = new Basket();
        User user1 = new User("Вася", "password1", basket1);
        User user2 = new User("Петя", "password2", basket2);

        basket1.buyProduct(categSport,"Мопед");
        basket1.buyProduct(categStuff,"Утюг");
        basket1.buyProduct(categWear,"Кепка");

        System.out.println(user1);
        System.out.println("------------------------------После Васи в магазине осталось -------------------------------");
        System.out.println(categSport);
        System.out.println(categWear);
        System.out.println(categStuff);
        System.out.println("--------------------------------------------------------------------------------------------");
        basket2.buyProduct(categSport,"Велобег");
        basket2.buyProduct(categSport,"Самокат");
        basket2.buyProduct(categStuff,"Фен");
        basket2.buyProduct(categWear,"Майка");
        basket2.buyProduct(categWear,"Футболка");

        System.out.println(user2);
        System.out.println("------------------------------После Пети в магазине осталось -------------------------------");
        System.out.println(categSport);
        System.out.println(categWear);
        System.out.println(categStuff);



    }

}
