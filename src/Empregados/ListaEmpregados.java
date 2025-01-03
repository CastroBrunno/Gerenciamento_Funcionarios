package Empregados;
import java.util.ArrayList;
import java.util.List;

import Cargos.CargoValidador;


/**
 * <h1>ListaEmpregados</h1>
 * 
 * Classe que representa uma lista de empregados
 * Inicialmente a classe nao ultiliza um banco de dados, mas sim uma lista de objetos. 
 * 
 * Esta classe contem os metodos para adicionar, remover, exibir e contar os empregados cadastrados.
 * 
 * @author Bruno Sousa
 * @version 1.0
 */
public class ListaEmpregados {
    private List<Empregado> empregadosList;
    
    public ListaEmpregados() {
        this.empregadosList = new ArrayList<>();
    }
    
    //Metodo para fazer a contagem e soma dos ID's dos funcionarios(Possivelmente sera transportada para a pasta de utils)
    private int currentId = 0;
    public int getNextID(){
        currentId++;
        return currentId;
    }

    /**
     * <h1>adicionar Empregado</h1>
     * Realiza um cadastro de um novo empregado na lista de empregados (ListaEmpregados).
     * 
     * @param nome Nome do empregado que sera cadastrado
     * @param salario Salario do empregado que sera cadastrado
     * @param cargo Cargo do empregado que sera cadastrado
     * 
     */
    public void adicionarEmpregado(String nome, double salario, String cargo){
        //Verficação se o cargo é valido (Chamada da função), se o cargo existir continua com o cadastro de usuario, se nao, exibir erro
        CargoValidador cargoValidador = new CargoValidador();
        if (cargoValidador.verificarCargo(cargo) == true) {
            empregadosList.add(new Empregado(nome, getNextID(), salario, cargo));
        }
    }

    /**
     * <h1>remover Empregado</h1>
     * Realiza a remoção de um empregado da lista de empregados atravéz do nome (ListaEmpregados).
     * <p>realizar implementação de remover pelo id</p>
     * 
     * @param nome Nome do empregado que sera removido
     * 
     */
    public void removerEmpregado(String nome){
        empregadosList.removeIf(e -> e.getNome().equalsIgnoreCase(nome));
    }

    /**
     * <h1>exibir Empregados</h1>
     * Exibe todos os empregados cadastrados na lista de empregados (ListaEmpregados).
     * 
     */
    public void exibirEmpregados(){
        System.out.println(empregadosList);
    }
    

    /**
     * <h1>numero de Empregados</h1>
     * Retorna a quantidade de empregados cadastrados na lista de empregados (ListaEmpregados).
     * 
     * @return int Quantidade de empregados cadastrados
     * 
     */
    public int numeroDeEmpregados(){
        return empregadosList.size();
    }

}
