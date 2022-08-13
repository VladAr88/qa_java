import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class LionTest {

    private String defaultSex = "Самец";
    private final String sex;
    private final boolean status;

    public LionTest(String sex, boolean status) {
        this.sex = sex;
        this.status = status;
    }


    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getHaveMane() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveManeLionTestParametrized() throws Exception {
        Lion lion = new Lion(sex);
        Assert.assertEquals(status,lion.doesHaveMane());
    }

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