import javax.swing.JOptionPane;
public class tarea22{
    
    public static void main(String [] args) {
        int i,ini,fin;
        String par = "";
        ini = Integer.parseInt(JOptionPane.showInputDialog("valor inicial: "));
        fin = Integer.parseInt(JOptionPane.showInputDialog("valor final: "));
        
        if (ini<fin){
            for(i = ini; i<= fin; i+=1){
                if(i%2==0){
                    par = par + i + " ";
                }
            }
            JOptionPane.showMessageDialog(null," valores pares: " +par);
        }else {
            JOptionPane.showMessageDialog(null," valor final menor o igual al inicial");
        }
        
    }
}
