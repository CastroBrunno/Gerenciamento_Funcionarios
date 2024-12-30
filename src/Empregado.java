public class Empregado{
    
        //atributos
        private String nome;

        //metodo construtor
        public Empregado(String nome) {
            this.nome = nome;
        }

        //metodo get
        public String getNome() {
            return nome;
        }

        @Override
        public String toString() {
            return "Empregado [nome = " + nome + "]"; //refatorar para quando for mandar para a api
        }
        
    

}
