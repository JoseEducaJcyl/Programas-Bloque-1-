import java.util.Scanner;

public class GestorNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] estudiantes = new String[10];
        int[] notas = new int[10];
        estudiantes[0] = "estudiante1";
        estudiantes[1] = "estudiante2";
        estudiantes[2] = "estudiante3";
        estudiantes[3] = "estudiante4";
        estudiantes[4] = "estudiante5";
        notas[0] = 5;
        notas[1] = 7;
        notas[2] = 3;
        notas[3] = 6;
        notas[4] = 10;

        System.out.println("---MENU---");
        System.out.println("[1]-Ingresar nuevo estudiante");
        System.out.println("[2]-Promedio general");
        System.out.println("[3]-Nota mas alta");
        System.out.println("[4]-Nota mas baja");
        System.out.println("[5]-Aprobados");
        System.out.println("[6]-Suspensos");
        System.out.println("[7]-Buscar estudiante");

        System.out.println("Ingrese opcion");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        boolean banderaS = false;
        boolean banderaI = false;
        boolean encontrado = false; 

        switch (opcion) {
            case 1:
                for (int i = 0; i < estudiantes.length; i++) {
                    if(estudiantes[i] == null && !banderaS){
                        System.out.println("Ingrese nombre del estudiante: ");
                        String nuevo_nombre = scanner.nextLine();
                        estudiantes[i] = nuevo_nombre;
                        banderaS = true;
                    }else{
                        System.out.println("Sin espacio");
                        break;
                    }  
                }
                System.out.println("Ingrese nota del estudiante: ");
                for (int i = 0; i < notas.length; i++) {
                    if(notas[i] == 0 && !banderaI) {
                        notas[i] = scanner.nextInt();
                        banderaI = true;
                    }else{
                        System.out.println("Sin espacio");
                        break;
                    }   
                }
                break;
            case 2:
                int nota = 0; 
                for (int i = 0; i < notas.length; i++) {
                    nota += notas[i];
                }
                int promedio = nota / 10;
                if(promedio >= 6){
                    System.out.println("Clasificacion global es aprobado: " 
                    + promedio);
                }else {
                    System.out.println("Clasificacion global es reprobado: " 
                    + promedio);
                }
                break;
            case 3:
                int notaAlta = 0;
                for (int i = 0; i < notas.length; i++) {
                    if(notas[i] > notaAlta){
                        notaAlta = notas[i];
                    }
                }
                System.out.println("La nota mas alta es " + notaAlta);
                break;
            case 4:
                int notaBaja = 99;
                for (int i = 0; i < notas.length; i++) {
                    if(notas[i] < notaBaja && notas[i] != 0){
                        notaBaja = notas[i];
                    }
                }
                System.out.println("La nota mas baja es " + notaBaja);
                break;
            case 5:
                int aprobados = 0;
                for (int i = 0; i < notas.length; i++) {
                    if (notas[i] >= 6) {
                        aprobados++;
                    }
                }                   
                System.out.println("Cantidad de aprobados: " + aprobados);
                break;
            case 6:
                int desaprobados = 0;
                for (int i = 0; i < notas.length; i++) {
                    if (notas[i] <= 1) {
                        desaprobados++;
                    }
                }                   
                System.out.println("Cantidad de suspensos: " + desaprobados);
                break;
            case 7:
                System.out.println("Ingrese estudiante a buscar (nombre):"); 
                String nombre = scanner.nextLine();
                int posicion = 0;
                for (int i = 0; i < estudiantes.length; i++) {
                    if(nombre == estudiantes[i] && !encontrado) {
                        posicion = i;
                        encontrado = true;
                    }
                }
                System.out.println("Estudiante " + 
                nombre + " con nota " + notas[posicion]);
                break;
            default:
                System.out.println("Opcion no disponible");
                break;              
        }
        scanner.close();  
    }
}

