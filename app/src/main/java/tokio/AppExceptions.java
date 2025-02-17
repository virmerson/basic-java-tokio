package tokio;

public class AppExceptions {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0;  //ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
    }
}