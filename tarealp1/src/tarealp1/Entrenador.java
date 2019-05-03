package tarealp1;
public class Entrenador extends Persona{
    private String idFederacion;
    
    public Entrenador(int id, String nombre, String apellido, int edad,String idFederacion){
        super(id, nombre, apellido, edad);
        this.idFederacion=idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }
    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    public void concentrarse(){
        System.out.print("El entrenador ");
        super.concentrarse();
    }
    public void viajar(){
        System.out.print("El entrenador ");
        super.viajar();
    }
    public void dirigirPartido(){
        System.out.println("El entrenador "+this.getNombre()+" dirige el partido");
    }
    public void dirigirEnrenamiento(){
        System.out.println("El entrenador "+this.getNombre()+" dirige el entrenamiento");
    }
}
