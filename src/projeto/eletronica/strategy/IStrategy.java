package projeto.eletronica.strategy;

public interface IStrategy {
	
	  void execute(double voltagem, double resistencia);
	}
    class StrategyCalculateResistencia implements IStrategy {
		public void execute(double voltagem, double corrente) {
			double resistencia = voltagem / corrente;
			System.out.println("Resistencia calculada (I): " + resistencia);
    }
	class StrategyCalculateCorrente implements IStrategy {
	    public void execute(double voltagem, double resistencia) {
	        double corrente = voltagem / resistencia;
	        System.out.println("Corrente calculada (I): " + corrente);
	    }
	}

	class StrategyCalculateVoltagem implements IStrategy {
	    public void execute(double corrente, double resistencia) {
	        double voltagem = corrente * resistencia;
	        System.out.println("Voltagem calculada (V): " + voltagem);
	    }
	}
	}
	
