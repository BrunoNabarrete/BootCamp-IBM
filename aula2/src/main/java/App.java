
import com.example.Calculadora;
public class App 
{
    public static void main( String[] args )
    {
        Calculadora calc1 = new Calculadora();
        
        System.out.println(calc1.somar(1, 2));
        System.out.println(calc1.subtrair(1, 2));
        System.out.println(calc1.multiplicar(1, 2));
        System.out.println(calc1.dividir(2, 2));
    }
}
