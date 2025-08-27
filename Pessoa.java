public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public int idadeEmMeses() {
        return idade * 12;
    }

    public int idadeEm2050() {
        int anoAtual = 2025;
        int anoFuturo = 2050;
        int anosPara2050 = anoFuturo - anoAtual;
        return idade + anosPara2050;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
