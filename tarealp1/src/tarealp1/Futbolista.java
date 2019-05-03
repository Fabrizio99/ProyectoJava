package tarealp1;

public class Futbolista extends Persona{
    private int dorsal;
    private String demarcacion;
    
    public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion){
        super(id, nombre, apellido, edad);
        this.dorsal      = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    public String getDemarcacion() {
        return demarcacion;
    }
    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    public void concentrarse(){
        System.out.print("El jugador ");
        super.concentrarse();
    }
    public void viajar(){
        System.out.print("El jugador ");
        super.viajar();
    }
    public void jugarPartido(){
        System.out.println("El jugador "+this.getNombre()+" esta jugando partido.");
    }
    public void entrenar(){
        System.out.println("El jugador "+this.getNombre()+" esta entrenando.");
    }
}
