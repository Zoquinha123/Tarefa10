public class Funcionario {
    protected String nome;
    protected String departamento;
    protected double salario;
    protected String dataDeEntrada;
    protected String rg;
    protected boolean estaNaEmpresa;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getDataDeEntrada() {
        return dataDeEntrada;
    }
    public void setDataDeEntrada(String dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public boolean isEstaNaEmpresa() {
        return estaNaEmpresa;
    }
    public void setEstaNaEmpresa(boolean estaNaEmpresa) {
        this.estaNaEmpresa = estaNaEmpresa;
    }


}