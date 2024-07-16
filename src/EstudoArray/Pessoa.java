/*
1 - Crie uma classe Pessoa com atributos como nome, idade, e um método toString que represente esses atributos.
2 - No método main da classe Principal, crie um ArrayList de Pessoa chamado listaDePessoas.
3 - Adicione pelo menos três pessoas à lista utilizando o método add.
4 - Imprima o tamanho da lista utilizando o método size.
5 - Imprima a primeira pessoa da lista utilizando o método get.
6 - Imprima a lista completa.
*/

package EstudoArray;

public class Pessoa {
    private String nome;
    private int idade;

    //Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}