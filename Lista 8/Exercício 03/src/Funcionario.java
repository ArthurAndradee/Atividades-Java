public abstract class Funcionario {
    private String nome;
    private String cpf;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public abstract double calcularRendimentos();

    @Override
    public String toString() {
        return  "\n Nome: " + getNome() +
                "\n CPF: " + getCpf() +
                "\n Rendimento Mensal: " +  
                calcularRendimentos();
    }
}
