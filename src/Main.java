

//Realizar uma documentação clara para cada função

import Empregados.ListaEmpregados;

public class Main {

    public static void main(String[] args) {
        ListaEmpregados listaEmpregados = new ListaEmpregados();
        listaEmpregados.adicionarEmpregado("Bruno", 3.600, "Desenvolvedor Front-End Jr"); // ("Bruno", 3.600, "Desenvolvedor front-end")
        listaEmpregados.exibirEmpregados();
        System.out.println("O numero de funcionarios é igual a: " + listaEmpregados.numeroDeEmpregados());

        listaEmpregados.adicionarEmpregado("Carlos", 1.500, "Desenvolvedor Back-End PL");
        listaEmpregados.exibirEmpregados();
        System.out.println("O numero de funcionarios é igual a: " + listaEmpregados.numeroDeEmpregados());
        
    }

    
}
