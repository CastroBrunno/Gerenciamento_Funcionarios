import java.util.ArrayList;
import java.util.List;

public class ListaEmpregados {
    private List<Empregado> empregadosList;

    public ListaEmpregados() {
        this.empregadosList = new ArrayList<>();
    }

    //metodo para adicionar empregados
    // Melhorar o metodo adicionando indice de usuario como se fosse um id para melhorar a procura do funcionario, provavelmente ultilizando o map
    public void adicionarEmpregado(String nome){
        empregadosList.add(new Empregado(nome));
    }

    //metodo para remover Empregados
    //melhorar metodo adicionando uma forma de remover o empregado atravez do ID
    public void removerEmpregado(String nome){
        for (Empregado e : empregadosList) {
            if (e.getNome().equalsIgnoreCase(nome)) {
                empregadosList.remove(nome);
            }
        }
    }

    //Metodo para listar/exibir os funcionarios 
    public void exibirEmpregados(){
        System.out.println(empregadosList);
    }
    

    //Metodo para mostrar quantos funcionarios estão cadastrados
    public int numeroDeEmpregados(){
        return empregadosList.size();
    }
}
