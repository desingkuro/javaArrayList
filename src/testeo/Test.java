
package testeo;

import conjuntodevacunas.Tad;
import conjuntodevacunas.Vacuna;
import javax.swing.JOptionPane;

 

public class Test {
    public static void main(String[] args){
        
        Vacuna li = new Vacuna();
        li.añadir(new Tad("bie", 34,"hge" , 243));
        li.añadir(new Tad("alia", 36, "bas", 153));
        li.añadir(new Tad("compadre", 4, "yue", 858));
        li.añadir(new Tad("jrda", 78, "tie", 222));
        
        String list =li.toString();
        
        System.out.println(""+ list);
        
        li.seleccion();
        System.out.println("El vector esta completemente ordenado por nombre:\n");
        System.out.println(li.toString());
        
        li.burbble();
        System.out.println("El vector esta completemente ordenado por referencia:\n");
        System.out.println(li.toString());
        
        /******el integer.pareint es para convertir string en entero
        y el joption es para abrir la ventana donde meteremos los datos******/
       
       int referencia= Integer.parseInt(JOptionPane.showInputDialog("Digita la referencia"));
       System.out.println(li.mostrar(referencia));
       
       /******se pide el laboratorio******/
       
       String laboratorio=JOptionPane.showInputDialog("Digita el laboratorio");
        System.out.println(li.listaLaboratorio(laboratorio));
    }
}
