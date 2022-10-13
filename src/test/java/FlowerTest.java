import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Flower;

class FlowerTest {
    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Flower();
    }

    @Test
    private void testPrice() {
        int price = 20;
        flower.setPrice(price);
        assertEquals(price, flower.getPrice());
    }

    @Test
    private void testColor() {
        FlowerColor price = FlowerColor.RED;
        flower.setColor(price);
        assertEquals("#FF0000", flower.getColor());
    }
}