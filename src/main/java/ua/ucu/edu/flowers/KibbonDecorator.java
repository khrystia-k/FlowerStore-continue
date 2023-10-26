package ua.ucu.edu.flowers;

public class KibbonDecorator extends ItemDecorator {

    Item item;

    @Override
    public String getDescription() {
        return item.getDescription() + "in Kibbon (I don`t know what is it)";
    }

    @Override
    public double price() {
        return getPrice();
    }

    public double getPrice(){
        return 40 + item.price();
    }

}
