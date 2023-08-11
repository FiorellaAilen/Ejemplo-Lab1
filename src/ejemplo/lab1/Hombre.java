package ejemplo.lab1;

public class Hombre {
    
    private Robot jugarConRobot;
    private String genero;
    private int edad;
    private String nombre;
    private String apellido;

    public Hombre(Robot jugarConRobot, String genero, int edad, String nombre, String apellido) {
        this.jugarConRobot = jugarConRobot;
        this.genero = genero;
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Robot getJugarConRobot() {
        return jugarConRobot;
    }

    public void setJugarConRobot(Robot jugarConRobot) {
        this.jugarConRobot = jugarConRobot;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void JugarConRobot() {
        System.out.println(" Hacer que el Robot Avance 500 pasos.");
        jugarConRobot.Avanzar(500);
        System.out.println("El robot Retroceda 20 pasos.");
        jugarConRobot.Retroceder(20);
        System.out.println("Informe por pantalla cuanta energÃ­a tiene el robot Actualmente.");
        jugarConRobot.energiaActual();
        System.out.println("Ponga el robot a dormir.");
        jugarConRobot.Dormir();
    }

    @Override
    public String toString() {
        return "Hombre{" + "robot=" + jugarConRobot + '}';
    }
    
}