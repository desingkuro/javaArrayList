
package conjuntodevacunas;


public class Tad{ 

    private String nombre;
    private float precio;
    private String laboratorio;
    private int referencia;

    @Override
    public String toString() {
        return "Conjuntodevacunas{" + "nombre=" + nombre + ", precio=" + precio + ", laboratorio=" + laboratorio + ", referencia=" + referencia + '}';
    }

    public Tad(String nombre, float precio, String laboratorio, int referencia) {
        this.nombre = nombre;
        this.precio = precio;
        this.laboratorio = laboratorio;
        this.referencia = referencia;
    }
    
    public String getnombre(){
        return nombre;
    }
    public float getprecio(){
        return precio;
    }
    public String getlaboratorio(){
        return laboratorio;
    }
    public int getreferencia(){
        return referencia;
    }
    /**
     * @param nombre************/
    public void setnombre(String nombre){
        this.nombre =nombre;
    }
    public void setprecio(float precio){
        this.precio=precio;
    }
    public void setreferencia(int referencia){
        this.referencia=referencia;
    }
    public void setlaboratorio(String laboratorio){
        this.laboratorio=laboratorio;
    }
}