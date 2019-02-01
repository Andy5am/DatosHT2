import java.util.Vector;

public class Pila<E> implements Stack<E>{
    //crear el objeto calculadora
    Calculator calculator = new MyCalculator();
   Vector vector = new Vector();

   public boolean verify(String val){
       try{
           Integer.parseInt(val);
           return true;
       }catch (Exception e) {
           return false;
       }
   }

    public void push(E item){
       //agregar
        vector.add(item);
    }

    public E pop(){
       //sacar
       return (E) vector.remove(vector.size()-1);
    }

    public E peek(){
       //no esta vacia, primer elemento de la pila lo devuelve.
        return (E) vector.get(vector.size()-1);
    }

    public boolean empty(){
    //true si la pila esta vacia.
        return vector.isEmpty();
    }

    public int size(){
       //retorna el tamaño de la pila.
        return vector.size();

    }


}
