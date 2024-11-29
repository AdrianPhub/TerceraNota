class Persona {
    String nombre;
}

public class Reasignacionreferencia {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Adrian";
        cambiarPersona(persona);
        System.out.println("Después de cambiarPersona: " + persona.nombre); 
    }

    public static void cambiarPersona(Persona persona) {
        persona = new Persona();  
        persona.nombre = "Camilo";
        System.out.println("Dentro de cambiarPersona: " + persona.nombre);  
    }
}