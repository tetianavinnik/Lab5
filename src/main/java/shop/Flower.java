package shop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter@AllArgsConstructor
public class Flower {
    private double sepalLength;
    private String color;
    private double price;

    public String getColor() {
        return color.toString();
    }
}

