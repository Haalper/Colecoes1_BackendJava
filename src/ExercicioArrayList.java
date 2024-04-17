

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioArrayList {

    public static void main(String args[]) {
        exemploListaSimples();
    }

    private static void exemploListaSimples() {
        List<String> lista = new ArrayList<String>();
        lista.add("Daniel Queiroz");
        lista.add("André Silva");
        lista.add("Eliana Lima");
        lista.add("Bruna Oliveira");
        lista.add("Célio Miranda");
        Collections.sort(lista);
        System.out.println(lista);
    }
}