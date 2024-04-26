public class Metodos {
    public Metodos(){}
    public void operaciones(int a, int b){
        System.out.println("Suma ----> "+ (a+b));
        System.out.println("\tDiferencia ----> "+(a-b));
        System.out.println("\t\tProducto ----> "+(a*b));
        System.out.println("\t\t\tCociente ----> "+((double)a/(double)b));
        System.out.println("\t\t\t\tResto ----> "+((double)a%(double)b));
    }
    public double agregarIVA(double precio){
        return precio*1.21;
    }
}
