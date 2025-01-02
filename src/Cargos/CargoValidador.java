package Cargos;

/**
     * <h1>Cargo Validador</h1>
     * Verifica se o cargo informado existe na lista de cargos.
     * 
     * @param cargo Cargo que sera verificado
     * @return Retorna true se o cargo existir, e false se o cargo não existir
     */

public class CargoValidador {
    Cargos cargos = new Cargos();
    boolean cargoValido = false;

    public boolean verificarCargo(String cargo){
        try {
            cargos.verificarCargos(cargo);
            System.out.println("Cargo encontrado");
            return true;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}

