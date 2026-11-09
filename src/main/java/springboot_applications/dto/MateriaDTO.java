
package springboot_applications.dto;

public class MateriaDTO {

    private String nombre;
    private String profesor;
    private int creditos;

    public MateriaDTO() {
    }

    public MateriaDTO(String nombre, String profesor, int creditos) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.creditos = creditos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
}
