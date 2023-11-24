public class Funcionario extends Pessoa {

    private double salario;
    private String cargo;
    private String departamento;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return String.format("nome: " + getnome() + " \n" +
                "CPF: " + getcpf() + " \n" +
                "RG: " + getrg() + " \n" +
                "Cidade: " + getcidade() + " \n" +
                "Estado Civil: " + getestadoCivil() + " \n" +
                "Data: " + getdata() + " \n" +
                "Salario " + getSalario() + " \n" +
                "Cargo " + getCargo() + " \n" +
                "Departamento " + getDepartamento() + " \n");
    }
}
