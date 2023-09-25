package projeto.eletronica.principal;

import java.util.Scanner;

import projeto.eletronica.calculo.CalculaOhm;
import projeto.eletronica.facade.CalculaOhmFacade;
import projeto.eletronica.singleton.SingletonPronto;
import projeto.eletronica.strategy.IStrategy;
import projeto.eletronica.strategy.StrategyCalculateResistencia;


public class Main {

	public static void main(String[] args) {
        
		
		Scanner scanner = new Scanner(System.in);
        // Solicita e obtém os valores da corrente, voltagem e resistência
        System.out.print("Digite o valor da corrente (I): ");
        double corrente = scanner.nextDouble();

        System.out.print("Digite o valor da voltagem (V): ");
        double voltagem = scanner.nextDouble();

        System.out.print("Digite o valor da resistência (R): ");
        double resistencia = scanner.nextDouble();
        scanner.close();

        // Calcula as grandezas elétricas
        double correnteCalculada = CalculaOhm.calcularCorrente(voltagem, resistencia);
        double voltagemCalculada = CalculaOhm.calcularVoltagem(corrente, resistencia);
        double resistenciaCalculada = CalculaOhm.calcularResistencia(voltagem, corrente);

        // Exibe os resultados
        System.out.println("Corrente calculada (I): " + correnteCalculada);
        System.out.println("Voltagem calculada (V): " + voltagemCalculada);
        System.out.println("Resistência calculada (R): " + resistenciaCalculada);
        
        //Singleton
        SingletonPronto singletonPronto = SingletonPronto.getInstance();
        singletonPronto.showMessage();
        
        //Facade
        CalculaOhmFacade facade = new CalculaOhmFacade();
        // Usando a Facade para calcular a corrente, voltagem e resistência
        facade.calcularCorrente(voltagem, resistencia);
        facade.calcularVoltagem(3.0, resistencia);  // Exemplo usando uma corrente de 3.0
        facade.calcularResistencia(9.0, 3.0);  // Exemplo usando uma voltagem de 9.0
        
        //Strategy
        IStrategy strategyCalculateCorrente = new StrategyCalculateCorrente();
        strategyCalculateCorrente.execute(voltagem, resistencia);

        // Estratégia para calcular a voltagem
        IStrategy strategyCalculateVoltagem = new StrategyCalculateVoltagem();
        strategyCalculateVoltagem.execute(corrente, resistencia);

        // Estratégia para calcular a resistência
        IStrategy strategyCalculateResistencia = new StrategyCalculateResistencia();
        strategyCalculateResistencia.execute(voltagem, corrente);
        
        
    }
}