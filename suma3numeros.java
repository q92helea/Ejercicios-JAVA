import java.util.Scanner;

public class SumaNumeros
{
    public static void main( String[] args )
    {
        int n1, n2, n3, sum;

        Scanner teclado = new Scanner(System.in);

        System.out.print( "Introduzca primer nmero: " );
        n1 = teclado.nextInt();

        System.out.print( "Introduzca segundo numero: " );
        n2 = teclado.nextInt();
        
        System.out.print( "Introduzca segundo numero: " );
        n3 = teclado.nextInt();

        sum = n1 + n2 + n3;

        System.out.println( "La suma de " + n1 + " mas " + n2 + " y mas " + n3 + " es " + sum + "." );