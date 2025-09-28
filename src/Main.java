public class Main {
    public static void main(String[] args) {
        Disciplina futbol = new Disciplina(1, "Futbol", "Juego de equipo con pelota");

        Atleta atleta1 = new Atleta(1, "Carlos López", 23, "Guatemala", "Guatemalteco", futbol);

        Pago pago1 = new Pago(1, "2025-09-27", 50.0, "Efectivo");
        atleta1.agregarPago(pago1);

        Sesion sesion1 = new Sesion(1, "2025-09-28", "Entrenamiento", "2 horas");
        atleta1.agregarSesion(sesion1);

        System.out.println("Atleta: " + atleta1.getNombre());
        System.out.println("Disciplina: " + atleta1.getDisciplina().getNombreDisciplina());
        System.out.println("Pagos realizados: " + atleta1.getPagos().size());
        System.out.println("Sesiones participadas: " + atleta1.getSesiones().size());
    }
}
