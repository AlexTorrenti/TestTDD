import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ListaNuevaTest {
    @Test
    public void testGet()
    {

    }

    @Test
    public void testAdd()
    {
        // AAA
        // Arrange
        ListaNueva listaNueva = new ListaNueva();

        // Act
        listaNueva.add("uno");

        // Assert
        assertEquals("uno", listaNueva.get(0));
    }

    @Test
    public void testSize()
    {

    }

    @Test
    public void testIsEmpty()
    {

    }


}
