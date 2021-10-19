public class Funcionario {
    private String nome;
    private String cpf;
    private String funcao;
    private Double salario;

     public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return this.cpf;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    public String getFuncao() {
        return this.funcao;
    }

    public void setSalario(Double Salario) {
        this.salario= salario;
    }
    public Double getSalario() {
        return this.salario;
    }
}
