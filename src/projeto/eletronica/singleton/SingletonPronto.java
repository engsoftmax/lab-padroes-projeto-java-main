package projeto.eletronica.singleton;

public class SingletonPronto {
	
	    private static SingletonPronto instance;

	    private SingletonPronto() {
	        
	    }

	    public static SingletonPronto getInstance() {
	        if (instance == null) {
	            instance = new SingletonPronto();
	        }
	        return instance;
	    }

	    public void showMessage() {
	        System.out.println("Exemplo Singleton: Mensagem da instância");
	    }
}
