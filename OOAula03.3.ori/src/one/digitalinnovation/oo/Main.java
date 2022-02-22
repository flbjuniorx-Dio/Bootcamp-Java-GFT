package one.digitalinnovation.oo;

import java.lang.System.Logger;

class Main {
	
    public static void main(String[] args) {

        Carro mercedes = new Carro();

        mercedes.setCor("prata");
        mercedes.setModelo("GLA");
        mercedes.setCapacidadeTanque(60);

        Logger.log(mercedes.getCor());
        Logger.log(mercedes.getModelo());
        Logger.log(mercedes.getCapacidadeTanque());
        Logger.log(mercedes.totalValorTanque(5.49));

        Carro bmw = new Carro("azul", "Serie 3", 55);

        Logger.log(bmw.cor);


    }
}
