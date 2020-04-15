import java.util.ArrayList;

public class ListaNueva {
    ArrayList<String> lista;

    public ListaNueva()
    {
        lista = new ArrayList<String>();
    }


    public boolean add(String elemento) {
        boolean anyadido = false;
        if(lista != null){
            lista.add(elemento);
            anyadido = true;
        }

        return anyadido;

    }

    public String get(int index){
        return lista.get(index);
    }

    public int size() {
        return lista.size();
    }

    public boolean isEmpty() {
        return lista.isEmpty();
    }
}
