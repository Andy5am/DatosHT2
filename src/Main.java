import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Clase Main
 * Se encarga de la interacción coon el usuario, coloca el documento txt, lol lee y devuelve el resultado.
 *
 * @author Andy Catillo y Abril Palencia
 * @version 31/01/2019
 */

public class Main {
    /**
     * Método main
     * @param args
     */
    public static void main(String[] args){
        //para leer el archivo
        ArrayList<String> cubilete = new ArrayList<String>();
        try {
            Stream<String> lines = Files.lines(
                    Paths.get(System.getProperty("user.dir")+"\\datos.txt"),
                    StandardCharsets.UTF_8
            );
            lines.forEach(a -> cubilete.add(a));
        }catch (IOException e ){
            System.out.println("Error!");
        }
        //crear el objeto pila
        Pila<Integer> pila = new Pila<>();
        //crear el objeto calculadora
        Calculator calculator = new MyCalculator();


        for (int a=0; a<cubilete.size();a++) {

            //ciclo para separar cada fila de la lista es sus caracteres
            String[] caracteres = cubilete.get(a).split("");
            ArrayList<String> operacion = new ArrayList<>();
            for (int i = 0; i < caracteres.length; i++) {
                operacion.add(caracteres[i]);
            }
            //ciclo para evaluar si es numero u operando
            for (int car = 0; car < operacion.size(); car++) {
                int num;
                String caracter = operacion.get(car);
                try {
                    num = Integer.parseInt(caracter);
                    pila.push(num);
                } catch (Exception e) {
                    //si es operando se calcula el resultado
                    if (!caracter.equals(" ")) {
                        int num1 = pila.pop();
                        int num2 = pila.pop();
                        int resultado = calculator.calculate(num2, num1, caracter);
                        pila.push(resultado);
                    }
                }
            }
            //se muestra resultado
            System.out.println("resultado = " + pila.peek());
        }
    }
}
