package Empregados;
public class Empregado{
    
        //atributos
        private String nome;
        private int id;
        private double salario;
        private String cargo;

        //metodo construtor
        public Empregado(String nome, int id, double salario, String cargo) {
            this.nome = nome;
            this.id = id;
            this.salario = salario;
            this.cargo = cargo;
        }

        //metodos get
        public String getNome() {
            return nome;
        }

        public int getId() {
            return id;
        }

        public double getSalario(){
            return salario;
        }

        public String getCargo(){
            return cargo;
        }

        @Override
        public String toString() {
            return "Empregado [id: " + id + ", nome = " + nome + ", cargo: " + cargo + ", Salario: " + String.format("%.3f", salario) + "]"; //refatorar para quando for mandar para a api
        }
        
    

}
