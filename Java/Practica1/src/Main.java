import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total;
        int n1,n2,n3;
        Scanner datos =new Scanner(System.in);
        System.out.println("Ingrese el primer valor: ");
        n1 = datos.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        n2 = datos.nextInt();
        System.out.println("Ingrese el tercer valor: ");
        n3 = datos.nextInt();
        total = suma(n1,n2,n3);
        System.out.println("El valor de la suma es: " + total);

       coche Micoche = new coche();
        System.out.println("El coche tiene "+Micoche.puertas+" puertas");
        Micoche.quitar_puertas();
        System.out.println("El coche tiene "+Micoche.puertas+" puertas");
        Micoche.add_puertas();
        System.out.println("El coche tiene "+Micoche.puertas+" puertas10");

    }

    public static int suma (int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
}

class coche{
    public int puertas = 4;

    public void add_puertas(){
        ++ this.puertas;
    }
    public void quitar_puertas(){
        this.puertas--;
    }

}