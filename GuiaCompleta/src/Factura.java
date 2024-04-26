import java.util.Scanner;

public class Factura {
    public void listaCompras(){
        Scanner scanner = new Scanner(System.in);
        Double[][] articulos = new Double[2][3]; //{{precio,cantidad} x3 }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
        System.out.println("\tBienvenido al programa Factura");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
        System.out.println("> Ingrese porfavor el precio y cantidad <");
        System.out.println("\t# Primer Articulo #");
        System.out.println("\tIngrese $ Precio: ");
        articulos[0][0]= scanner.nextDouble();
        scanner.nextLine();

        System.out.println("\tIngrese $ Precio: ");

    }
}
