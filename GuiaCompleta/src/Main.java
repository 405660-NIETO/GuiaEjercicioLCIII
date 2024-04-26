import java.util.Locale;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Metodos metodos = new Metodos();
        Scanner scanner = new Scanner(System.in);
        boolean choice = true;
        boolean continuar = true;
        System.out.println("\nBievenido a la guia completa de LC-III");
        System.out.println("--------------------------------------");
        int eleccion = 1;

        while(continuar) //Para repetir el programa completo
        {
            while (choice)  //Por si se arrepiente del ejercicio que eligió
            {
                System.out.println("\nElige a qué menu de ejercicio deseas acceder : 1 | 2 | 3\n");
                eleccion = scanner.nextInt();
                scanner.nextLine(); // limpiar por el int de arriba
                choice = menuEjercicio(scanner,eleccion);
            }
            switch (eleccion) {
                case 1:
                    ejercicio1(scanner, metodos); //ejercicio 1
                    continuar = volverMenu(); //Metodo que pregunta si quiere otro ejercicio
                    if (continuar){
                        choice = true; //Habilita el bucle de opcion de ejercicio
                    }
                    break;

                case 2: //Este no tiene reiniciar
                    ejercicio2(scanner, metodos);

                    continuar = volverMenu(); //Metodo que pregunta si quiere otro ejercicio
                    if (continuar){
                        choice = true; //Habilita el bucle de opcion de ejercicio
                    }
                    break;
                case 3:
                    System.out.println("Este ejercicio se queda pa luego");
                    continuar = volverMenu(); //Metodo que pregunta si quiere otro ejercicio
                    if (continuar){
                        choice = true; //Habilita el bucle de opcion de ejercicio
                    }

                    break;
                default:
                    // Acciones a realizar si eleccion no es ni 1, ni 2, ni 3
                    System.out.println("La elección no es válida");
            }
        }
    }

    private static void ejercicio2(Scanner scanner, Metodos metodos) {
        double monto;
        System.out.println("-----------------------------------");
        System.out.println("\nEjercicio 2");
        System.out.println("Ingrese un monto en $$ (double) y se procederá a calcular el IVA del mismo\n");
        monto = scanner.nextDouble();
        System.out.println("El monto $"+monto+ " con el IVA aplicado es de $"+ metodos.agregarIVA(monto));
        System.out.println("-----------------------------------");
    }

    private static void ejercicio1(Scanner scanner, Metodos metodos) {
        int num1;
        int num2;
        System.out.println("-----------------------------------");
        System.out.println("\nEjercicio 1");
        System.out.println("\nIngrese 2 numeros. Se procederá a calcular la respectiva Suma, Resta," +
                " Multiplicacion, Division y Resto de ambos numeros\n");
        System.out.println("Primer numero: ");
        num1 = scanner.nextInt();
        System.out.println("Segundo numero: ");
        num2 = scanner.nextInt();

        System.out.println("< Resultados >");
        metodos.operaciones(num1, num2);
        System.out.println("-----------------------------------");
    }

    private static boolean menuEjercicio(Scanner scanner, int eleccion){
        System.out.println("\nQuieres acceder a la consola del ejercicio " + eleccion + "?\n");
        System.out.println("Y/N\n");
        String a = scanner.nextLine();
        a = a.toLowerCase();
        if (a.equals("y"))
        {
            return false; //No reiniciar el bucle
        }
        return true;
    }
    //Este metodo deberiamos usar para preguntar constantemente si quiere probar otro ejercicio
    private static boolean volverMenu()
    {
        System.out.println("\nDesea probar otro ejercicio ?\n");
        System.out.println("Y/N\n");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        a = a.toLowerCase(); // N => n
        if (a.equals("n"))
        {
            return false;
        }
        return true;
    }
}
