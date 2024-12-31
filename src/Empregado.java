public class Empregado{
    
        //atributos
        private String nome;
        private int id;

        //metodo construtor
        public Empregado(String nome, int id) {
            this.nome = nome;
            this.id = id;
        }

        //metodo get
        public String getNome() {
            return nome;
        }

        public int getId() {
            return id;
        }

        @Override
        public String toString() {
            return "Empregado [id: " + id + ", nome = " + nome + "]"; //refatorar para quando for mandar para a api
        }
        
    

}
