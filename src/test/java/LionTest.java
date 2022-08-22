import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;
    @Test
    public void getKittensMethodReturnOneTest() {
        Lion lion = new Lion(feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }

    @Test (expected = Exception.class)
    public void constructorExceptionTest() throws Exception {
        try {
            Lion lion = new Lion("недопустимый пол");
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
            throw e;
        }
    }

    @Test
    public void lionGetsFoodTest() throws Exception {
        Lion lion = new Lion(feline);
        Mockito.when(feline.getFood(Mockito.anyString())).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}