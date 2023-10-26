package ua.ucu.edu.flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Flower extends Item{
    private FlowerColor color;
    private double price;
    private double sepalLength;
    // private FlowerType flowerType;

    // copy constructor
    public Flower(Flower flower) {
        this.sepalLength = flower.sepalLength;
        this.price = flower.price;
        this.color = flower.color;
        // this.flowerType = flower.flowerType;

    }

    @Override
    public double price() {
        return this.price;
    }
}
