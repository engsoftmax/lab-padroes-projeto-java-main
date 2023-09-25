package projeto.eletronica.calculo;

public class CalculaOhm {

	    public static double calcularCorrente(double voltagem, double resistencia) {
	        return voltagem / resistencia;
	    }

	    public static double calcularVoltagem(double corrente, double resistencia) {
	        return corrente * resistencia;
	    }

	    public static double calcularResistencia(double voltagem, double corrente) {
	        return voltagem / corrente;
	    }
}