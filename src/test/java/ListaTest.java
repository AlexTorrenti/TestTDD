import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


class ListaTest {

    @Test
    public void dadaListaVacia_cuandoListaVacia_entoncesDevolvemosTrue() {
        Lista lista = new Lista<>();

        assertTrue(lista.isEmpty());
    }

    @Test
    public void dadaListaNoVacia_cuandoEstaVacia_entoncesDevolvemosFalse() {
        Lista lista = new Lista<>();
        lista.add(null);

        assertFalse(lista.isEmpty());
    }

    @Test
    public void dadaListaConUnElemento_cuandoInvocoSize_entoncesDevolvemosUno() {
        Lista lista  = new Lista<>();
        lista.add(1);

        assertEquals(1, lista.size());
    }

    @Test
    public void dadaListaConCeroElementos_cuandoInvocoSize_entoncesDevolvemosCero() {
        Lista lista  = new Lista<>();

        assertEquals(0, lista.size());
    }

    @Test
    public void dadaListaConDosElementos_cuandoInvocoSize_entoncesDevolvemosDos() {
        Lista lista  = new Lista<>();

        lista.add(1);
        lista.add(2);

        assertEquals(2, lista.size());
    }

    @Test
    public void dadaListaConUnElemento_cuandoUsoGet_entoncesSeDevuelveElElemento() {
        List<Object> list = new Lista<>();
        list.add("imagina");
        Object element = list.get(0);

        assertEquals("imagina", element);
    }

    @Test
    public void dadaListaConElementoPepe_cuandoUsoGet_entoncesSeDevuelvePepe() {
        List<Object> list = new Lista<>();
        list.add("pepe");
        Object element = list.get(0);

        assertEquals("pepe", element);
    }

    @Test
    public void dadaListaConDosElemento_cuandoUsoGet1_entoncesSeDevuelveElSegundoElemento() {
        List<Object> list = new Lista<>();
        list.add("pepe");
        list.add("alex");
        Object element = list.get(1);

        assertEquals("alex", element);
    }

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