import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

public class LionTest {

    private String defaultSex = "Самец";

    @Test
    public void felineGetKittensDefaultNumberTest() throws Exception {
        Lion lion = new Lion(defaultSex);
        Assert.assertEquals(1, lion.getKittens());
    }

    @Test
    public void lionGetFood() throws Exception {
        Lion lion = new Lion(defaultSex);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expectedFood, lion.getFood());
    }
}