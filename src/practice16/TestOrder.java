package practice16;

import java.util.Arrays;

public class TestOrder {
    public static void main(String[] args) {
        Order order = new Order();
        Dish dish1 = new Dish(200, "parrot", "dsad");
        Dish dish2 = new Dish(500, "meet", "dsdfsa");
        Dish dish3 = new Dish(200, "parrot", "dsad");
        Drink drink1 = new Drink(100, "water", "adwwqd");
        Drink drink2 = new Drink(100, "water", "adwwqd");
        Drink drink3 = new Drink(200, "juice", "adwwqd");
        order.addDish(dish1);
        order.addDish(dish2);
        order.addDish(dish3);
        order.addDish(drink1);
        order.addDish(drink2);
        order.addDish(drink3);
        System.out.println(order.costTotal());
        System.out.println(order);
        System.out.println(order.dishQuantity());
        System.out.println(order.dishQuantity("parrot"));
        System.out.println(Arrays.toString(order.getDishes()));
        System.out.println(Arrays.toString(order.sortedDishesByCost()));
        System.out.println(Arrays.toString(order.dishNames()));
        order.removeDish("parrot");
        System.out.println(order);
        order.removeAll("water");
        System.out.println(order);

    }
}
