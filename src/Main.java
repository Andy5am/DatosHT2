import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        //para leer el archivo
        ArrayList<String> cubilete = new ArrayList<String>();
        try {
            Stream<String> lines = Files.lines(
                    Paths.get("C:\\Users\\Andy Castillo\\Documents\\datos.txt"),
                    StandardCharsets.UTF_8
            );
            lines.forEach(a -> cubilete.add(a));
        }catch (IOException e ){
            System.out.println("Error!");
        }
        //crear el objeto pila
        Pila pila = new Pila();
        //crear el objeto calculadora
        Calculator calculator = new MyCalculator();

        String[] caracteres = cubilete.get(0).split("");
        cubilete.remove(0);
        for (int i = 0; i<caracteres.length;i++){
            cubilete.add(caracteres[i]);
        }

        for(int car=0; car<cubilete.size();car++){
            int num;
            String caracter = cubilete.get(car);
            try{
                num = Integer.parseInt(caracter);
                pila.push(num);
            }catch (Exception e) {
                if (!caracter.equals(" ")) {
                    int num1 = (int) pila.pop();
                    int num2 = (int) pila.pop();
                    int resultado = calculator.calculate(num2, num1, caracter);
                    pila.push(resultado);
                }
            }
        }
        System.out.println("resultado = "+pila.peek());

    }
}
