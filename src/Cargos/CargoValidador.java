package Cargos;

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

