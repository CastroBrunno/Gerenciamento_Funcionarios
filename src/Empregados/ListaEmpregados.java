package Empregados;
import java.util.ArrayList;
import java.util.List;

import Cargos.CargoValidador;

public class ListaEmpregados {
    private List<Empregado> empregadosList;
    
    public ListaEmpregados() {
        this.empregadosList = new ArrayList<>();
    }
    
    //Metodo para fazer a contagem e soma dos ID's dos funcionarios
    private int currentId = 0;
    public int getNextID(){
        currentId++;
        return currentId;
    }
    
    //metodo para adicionar empregados
    // Melhorar o metodo adicionando indice de usuario como se fosse um id para melhorar a procura do funcionario, provavelmente ultilizando o map
    public void adicionarEmpregado(String nome, double salario, String cargo){
        //Verficação se o cargo é valido (Chamada da função), se o cargo existir continua com o cadastro de usuario, se nao, exibir erro
        CargoValidador cargoValidador = new CargoValidador();
        if (cargoValidador.verificarCargo(cargo) == true) {
            empregadosList.add(new Empregado(nome, getNextID(), salario, cargo)); // o id dentro dos parenteses vai receber o valor de uma fução getNextID, que será criada
        }
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
