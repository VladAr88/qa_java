import com.example.Animal;
import com.example.Feline;
import com.example.IFeline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class LionTest {

    private String defaultSex = "Самец";
    IFeline ifeline = new Feline();

    @Test
    public void felineGetKittensDefaultNumberTest() throws Exception {
        Lion lion = new Lion(ifeline);
        Assert.assertEquals(1, lion.getKittens());
    }

    Animal animal = new Feline();
    @Test
    public void lionGetFood() throws Exception {
        Lion lionAnimal = new Lion(animal);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expectedFood, lionAnimal.getFood());
    }
}