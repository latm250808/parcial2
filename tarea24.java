import javax.swing.JOptionPane;
public class tarea24 {
    public static void main(String[] args) {
        int suma = 0,numero = 1;
        
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero entero (0 para salir): "));
            suma += numero;
        } while ( numero != 0);
        
        JOptionPane.showMessageDialog(null, " la suma de los numeros es:" +suma);
       
    }
}
