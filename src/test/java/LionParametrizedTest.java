import com.example.Feline;
import com.example.IFeline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class LionParametrizedTest {

    private String defaultSex = "Самец";
    private final String sex;
    private final boolean status;
    IFeline ifeline = new Feline();

    public LionParametrizedTest(String sex, boolean status) {
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
}