
package conjuntodevacunas;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Vacuna {
    private ArrayList<Tad>vac;

    public Vacuna() {
        vac = new ArrayList<>();
    }

    @Override
    public String toString() {
        String list="";
        for (int i = 0; i < vac.size(); i++) {
            Tad objeto = vac.get(i);
            list+=" "+objeto.toString()+"\n";
        }
        return list;
    }
    
    public void añadir(Tad x){
        vac.add(x);
    }

    public void seleccion() {
        for (int i = 0; i < vac.size(); i++) {
            String nombremayor = vac.get(i).getnombre();
            int imayor = i;
            for (int j = 0; j+1 < vac.size(); j++) {
                Tad objeto = vac.get(j);
                if(objeto.getnombre().compareToIgnoreCase(nombremayor)>0){
                    nombremayor = objeto.getnombre();
                    imayor = j;
                }
            }
            Tad n= vac.get(i);
            vac.set(i, vac.get(imayor));
            vac.set(imayor, n);
        }
    }

    public void burbble() {
        for (int i = 0; i < vac.size(); i++) {
            for (int j = 0; j < vac.size()-1; j++) {
                if(vac.get(j).getreferencia()>vac.get(j+1).getreferencia()){
                    Tad a= vac.get(j);
                    vac.set(j, vac.get(j+1));
                    vac.set(j+1, a);
                }
            }
        }
    }
    
    public String mostrar(int ref){
        String comparacion="";
        for (int i = 0; i < vac.size(); i++) {
            Tad obj = vac.get(i);
            if(ref==obj.getreferencia()){
                System.out.println("Eta es la vacuna de referencia: "+ref+" que desea eliminar");
                comparacion+=""+obj.toString()+"\n";
                vac.remove(i);
            }
        }
        return comparacion; 
    }

    public String listaLaboratorio(String laboratorio) {
        
        String resultado="";
        for (int i = 0; i < vac.size(); i++) {
            Tad obj = vac.get(i);
            if(obj.getlaboratorio().compareToIgnoreCase(laboratorio)==0){
                System.out.println("Esta es la vacuna que busca:");
                resultado+=""+obj.toString()+"\n";
            }
        }
        return resultado;
    }
}
