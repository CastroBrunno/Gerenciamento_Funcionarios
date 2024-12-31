package Cargos;

public class Cargos {
    //atributos
    private String[] cargosCadastrados;

    public Cargos() {
        this.cargosCadastrados = new String[]{
            "Desenvolvedor Front-End Jr",
            "Desenvolvedor Back-End PL",
            "Desenvolvedor Fullstack Sr",
            "Analista de Dados Jr"
        };
    }

    public Cargos(String[] cargos){
        this.cargosCadastrados = cargos;
    }

    public String[] getCargosCadastrados() {
        return cargosCadastrados;
    }
    
    public boolean verificarCargos(String cargo) throws Exception{

        for (String c : cargosCadastrados) {
            if (c.equalsIgnoreCase(cargo)){
                return true;
            }
        }
            throw new Exception("Cargo não encontrado");
    }

}

