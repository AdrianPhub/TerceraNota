import java.util.Scanner;


public class SistemaDeNotas {
        
        static int NUM_ESTUDIANTES;
        static final int NUM_MATERIAS = 3;
        //El numero 2 Se refiere a las dos primeras columnas que representa el nombre y codigo
        static final int COLUMNAS = 2 + NUM_MATERIAS; 
        static Object[][] datosEstudiante;


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        // se pide el numero de estudiantes
        System.out.println("Por favor ingrese el numero de estudiantes:");
        NUM_ESTUDIANTES = scanner.nextInt();
        // se inicializa la matriz con el numero de estudiantes y las materias
        datosEstudiante = new Object[NUM_ESTUDIANTES][COLUMNAS];
        //llamar metodo para registrar a los estudiantes
        registrarEstudiantes(scanner);
        //llamar metodo para generar el reporte final
        generarReporteFinal();
        
    }

    public static void registrarEstudiantes(Scanner scanner){


        //Se recorre la matriz para registrar los datos de los estudiantes(nombre,codigo,notas)

        for(int i= 0; i < NUM_ESTUDIANTES;i++){
            scanner.nextLine();   
            System.out.println("Por favor ingrese el nombre del Estudiante:");
            datosEstudiante[i][0] = scanner.nextLine();
            

            System.out.println("Por favor ingrese el codigo identificador del Estudiante:");
            datosEstudiante[i][1] = scanner.nextInt();

            for(int j = 0; j < NUM_MATERIAS; j++){

                System.out.println("Por favor ingrese la nota de la materia" + (j+1) + ":");

                datosEstudiante[i][2+j] = scanner.nextDouble();
            }
            scanner.nextLine();
        }
        scanner.close();
        
    }

    public static void generarReporteFinal(){
        //recorrer matriz de datosEstudiante y calcular promedio de cada estudiante haciendo uso de un 
        //contador de materias y sumatoria de notas para generar el reporte final
        
        for(int i = 0; i < NUM_ESTUDIANTES; i++){
            double promedio = 0;
            for(int j = 0; j < NUM_MATERIAS; j++){
                promedio += (double) datosEstudiante[i][2+j];
            }
            promedio = promedio / NUM_MATERIAS;
            //se usa un operador ternario que es una forma abreviada de escribir una declaración if-else
            String estado = promedio >= 3.0 ? "Aprobado" : "Reprobado";
            System.out.println(datosEstudiante[i][0] + " ID: " + datosEstudiante[i][1] + " " +
            "Promedio: " + promedio + " " + "-" + estado);
        }
    }
        
}



























































