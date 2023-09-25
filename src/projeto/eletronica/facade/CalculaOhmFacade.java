package projeto.eletronica.facade;

import projeto.eletronica.calculo.CalculaOhm;

public class CalculaOhmFacade {

	    private CalculaOhm calculadora;

	    public CalculaOhmFacade() {
	        this.calculadora = new CalculaOhm();
	    }

	    public void calcularCorrente(double voltagem, double resistencia) {
	        double corrente = calculadora.calcularCorrente(voltagem, resistencia);
	        System.out.println("Corrente calculada (I): " + corrente);
	    }

	    public void calcularVoltagem(double corrente, double resistencia) {
	        double voltagem = calculadora.calcularVoltagem(corrente, resistencia);
	        System.out.println("Voltagem calculada (V): " + voltagem);
	    }

	    public void calcularResistencia(double voltagem, double corrente) {
	        double resistencia = calculadora.calcularResistencia(voltagem, corrente);
	        System.out.println("Resistência calculada (R): " + resistencia);
	    }
}
