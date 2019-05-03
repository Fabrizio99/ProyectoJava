package tarealp1;

public class Masajista extends Persona{
    private String titulacion;
    private int aniosExperiencia;
    
    public Masajista(int id, String nombre, String apellido, int edad, String titulacion, int aniosExperiencia){
        super(id, nombre, apellido, edad);
        this.titulacion=titulacion;
        this.aniosExperiencia=aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }
    public int getAniosExperiencia() {
        return aniosExperiencia;
    }
    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
    
    public void concentrarse(){
        System.out.print("La masajista ");
        super.concentrarse();
    }
    public void viajar(){
        System.out.print("La masajista ");
        super.viajar();
    }
    public void darMasaje(){
        System.out.println("La masajista "+this.getNombre()+" da masajes.");
    }
}
