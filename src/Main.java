public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Maximiliano", 21, 8.8);
        Estudiante estudiante2 = new Estudiante("Molly", 19, 9.4);

        System.out.println("Información del estudiante 1:");
        estudiante1.mostrarInformacion();

        System.out.println("\nInformación del estudiante 2:");
        estudiante2.mostrarInformacion();

        // Cambiar la calificación de Maximiliano
        estudiante1.setCalificacion(9.5);
        System.out.println("\nCalificación actualizada de Maximiliano:");
        estudiante1.mostrarInformacion();
    }
}

