package calculadora;
import calculadora.interfaceCalculadora.Interface;
/**
 *
 * @author Gabriel Artemio
 */
public class Calculadora {
    public static void main(String[] args) {
        Interface app = new Interface();
        app.setVisible(true);
        app.setResizable(false);
        app.setTitle("Calculadora Jframe");
    }
}