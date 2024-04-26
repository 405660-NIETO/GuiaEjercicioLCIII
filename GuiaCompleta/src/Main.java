import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Metodos metodos = new Metodos();
        Scanner scanner = new Scanner(System.in);
        boolean choice = true;
        boolean continuar = true;
        System.out.println("\nBievenido a la guia completa de Labo3");
        System.out.println("--------------------------------------");
        int eleccion = 1;
        int num1, num2, num3;
        double d1, d2, d3;
        String a,b,c;


        while(continuar) //Para repetir todo el programa
        {
            while (choice)  //Por si se arrepiente del ejercicio que eligió
            {

                System.out.println("\nElige a qué menu de ejercicio deseas acceder : 1 | 2 | 3\n");
                eleccion = scanner.nextInt();
                System.out.println("\nQuieres acceder a la consola del ejercicio " + eleccion + "?\n");
                System.out.println("Y/N\n");
                scanner.nextLine(); //Ahí limpie el bufer
                a = scanner.nextLine();
                if (a.equals("Y") || a.equals("y"))
                {
                    choice = false; //No reiniciar el bucle
                }
            }
            switch (eleccion) {
                case 1:
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

                    //Bloque de reiniciar: (sin metodo)
                    System.out.println("\nDesea probar otro ejercicio?\n");
                    System.out.println("Y/N\n");
                    scanner.nextLine();
                    a = scanner.nextLine();
                    if (a.equals("N") || a.equals("n"))
                    {
                        continuar = false;
                    }
                    else
                    {
                        choice = true; //Habilitar el inicio del bucle de Eleccion de opcion
                    }
                    break;

                case 2: //Este no tiene reiniciar
                    System.out.println("-----------------------------------");
                    System.out.println("\nEjercicio 2");
                    System.out.println("Ingrese un monto en $$ (double) y se procederá a calcular el IVA del mismo\n");
                    d1 = scanner.nextDouble();
                    System.out.println("El monto $"+d1+ " con el IVA aplicado es de $"+metodos.agregarIVA(d1));
                    System.out.println("-----------------------------------");
                    break;
                case 3:


                    break;
                default:
                    // Acciones a realizar si eleccion no es ni 1, ni 2, ni 3
                    System.out.println("La elección no es válida");
            }
        }
    }
    //Este metodo deberiamos usar para preguntar constantemente si quiere probar otro ejercicio
    private static boolean desea_continuar(boolean reinicio)
    {
        System.out.println("\nDesea probar otro ejercicio?\n");
        System.out.println("Y/N\n");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String a = scanner.nextLine();
        if (a.equals("N") || a.equals("n"))
        {
            reinicio = false;
        }
        else
        {
            reinicio = true;
        }
        return reinicio;
    }

}
