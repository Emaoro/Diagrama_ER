public class Disciplina {
    private int idDisciplina;
    private String nombreDisciplina;
    private String descripcion;

    public Disciplina(int idDisciplina, String nombreDisciplina, String descripcion) {
        this.idDisciplina = idDisciplina;
        this.nombreDisciplina = nombreDisciplina;
        this.descripcion = descripcion;
    }

    // Getters
    public int getIdDisciplina() {
        return idDisciplina;
    }

    public String getNombreDisciplina() {
        return nombreDisciplina;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
