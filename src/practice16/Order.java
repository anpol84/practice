package practice16;



public class Order {
    private int size;
    Queue dishes;

    public Order(Item[] order) {
        for (Item item : order){
            dishes.add(item);
        }
    }

    public Order() {
        size = 0;
        dishes = new Queue();
    }
    boolean addDish(Item dish){
        dishes.add(dish);
        size++;
        return true;
    }
    boolean removeDish(String dish){
        if (dishes.removeElement(dish)){
            size--;
            return true;
        }else return false;
    }
    int removeAll(String dish){
        int ans = 0;
        while(dishes.removeElement(dish)) ans++;
        size -= ans;
        return ans;
    }
    int dishQuantity(){
        return size;
    }
    int dishQuantity(String name){
        return dishes.countItem(name);
    }
    Item[] getDishes(){
        return dishes.getItems();
    }
    double costTotal(){
        return dishes.getPrice();
    }
    String[] dishNames(){
        return dishes.getNames();
    }
    Item[] sortedDishesByCost(){
        return dishes.sort();
    }

    @Override
    public String toString() {
        return "Order{" +
                "size=" + size +
                ", dishes=" + dishes +
                '}';
    }
}
