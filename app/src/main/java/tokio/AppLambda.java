package tokio;

import java.util.Arrays;
import java.util.List;

public class AppLambda {
    public static void main(String[] args) {
        
        List<String> nomes = Arrays.asList("Ana", "Bruno", "Carlos");
        nomes.forEach(nome -> System.out.println(nome));

    }
}
