

//Realizar uma documentação clara para cada função
public class Main {

    public static void main(String[] args) {
        ListaEmpregados listaEmpregados = new ListaEmpregados();
        listaEmpregados.adicionarEmpregado("Bruno");
        listaEmpregados.exibirEmpregados();
        System.out.println("O numero de funcionarios é igual a: " + listaEmpregados.numeroDeEmpregados());

        listaEmpregados.adicionarEmpregado("Carlos");
        listaEmpregados.exibirEmpregados();
        System.out.println("O numero de funcionarios é igual a: " + listaEmpregados.numeroDeEmpregados());
        
    }

    
}
