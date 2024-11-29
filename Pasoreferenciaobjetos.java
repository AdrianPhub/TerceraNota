class Persona {
    String nombre;
}

public class PasoReferenciaobjetos {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Adrian";
        cambiarPersona(persona);
        System.out.println("Después de cambiarPersona: " + persona.nombre); // Imprime Camilo
    }

    public static void cambiarPersona(Persona persona) {
        persona.nombre = "Camilo";
        System.out.println("Dentro de cambiarPersona: " + persona.nombre);  // Imprime Camilo
    }
}