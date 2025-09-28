import java.util.ArrayList;
import java.util.List;

public class Atleta {
    private int idAtleta;
    private String nombre;
    private int edad;
    private String departamento;
    private String nacionalidad;
    private Disciplina disciplina;

    private List<Pago> pagos;
    private List<Sesion> sesiones;

    public Atleta(int idAtleta, String nombre, int edad, String departamento, String nacionalidad, Disciplina disciplina) {
        this.idAtleta = idAtleta;
        this.nombre = nombre;
        this.edad = edad;
        this.departamento = departamento;
        this.nacionalidad = nacionalidad;
        this.disciplina = disciplina;
        this.pagos = new ArrayList<>();
        this.sesiones = new ArrayList<>();
    }

    public void agregarPago(Pago pago) {
        pagos.add(pago);
    }

    public void agregarSesion(Sesion sesion) {
        sesiones.add(sesion);
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public List<Pago> getPagos() {
        return pagos;
    }

    public List<Sesion> getSesiones() {
        return sesiones;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }
}
