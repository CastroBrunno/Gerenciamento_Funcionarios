
import Empregados.ListaEmpregados;

public class Main {

    public static void main(String[] args) {
        //Dados ilustrativos, usados apenas para exemplo.
        
        ListaEmpregados listaEmpregados = new ListaEmpregados();
        listaEmpregados.adicionarEmpregado("Bruno", 3.600, "Desenvolvedor Front-End Jr"); 
        listaEmpregados.exibirEmpregados();
        System.out.println("O numero de funcionarios é igual a: " + listaEmpregados.numeroDeEmpregados());

        listaEmpregados.adicionarEmpregado("Carlos", 1.500, "Desenvolvedor Back-End PL");
        listaEmpregados.adicionarEmpregado("joao", 1.600, "Desenvolvedor Fullstack Sr");
        listaEmpregados.adicionarEmpregado("Roberto", 1.400, "Analista de Dados Jr");
        listaEmpregados.exibirEmpregados();
        System.out.println("O numero de funcionarios é igual a: " + listaEmpregados.numeroDeEmpregados());

        listaEmpregados.removerEmpregado("Carlos");
        listaEmpregados.exibirEmpregados();
        System.out.println("O numero de funcionarios é igual a: " + listaEmpregados.numeroDeEmpregados());
        
    }
    
    
}
