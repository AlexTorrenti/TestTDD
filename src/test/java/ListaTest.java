import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


class ListaTest {
    @Test
    public void testBasico()
    {
        // Arrange
        ArrayList<String> listaStrings = new ArrayList<String>();

        // Act
        listaStrings.add("uno");

        // Assert
        assertEquals(1, listaStrings.size());
    }


    @Test
    public void test()
    {
        Lista lista = mock(Lista.class);

        when(lista.add("1")).thenReturn(true);

        assertEquals(lista.add("1"), true);
    }
}