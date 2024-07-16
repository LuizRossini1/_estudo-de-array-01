package EstudoArray;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        var pessoa01 = new Pessoa("Luiz", 20);
        var pessoa02 = new Pessoa("Jocasta", 20);
        var pessoa03 = new Pessoa("Lua", 13);

        listaDePessoas.add(pessoa01);
        listaDePessoas.add(pessoa02);
        listaDePessoas.add(pessoa03);
    }
}