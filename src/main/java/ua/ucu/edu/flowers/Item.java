package ua.ucu.edu.flowers;

import lombok.Getter;

public abstract class Item {
    
    @Getter
    private String description;
    public abstract double price();
}
