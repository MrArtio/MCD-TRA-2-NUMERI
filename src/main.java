import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("***CALCOLO DEL MCD(m,n)***\n");

        System.out.print("m e n?: ");
        int m = in.nextInt();
        int n = in.nextInt();

        // verifica che i numeri siano positivi
        if (m <= 0 || n <= 0)
        {
            if (m <= 0)
                System.out.println("m = " + m + ": ingresso non ammesso");
            if (n <= 0)
                System.out.println("n = " + n + ": ingresso non ammesso");

            return;
        }

        // Ordinamento
        int i = m;
        int j = n;
        if (m > n) // pongo i > j
        {
            i = n;
            j = m;
        }

        // Algoritmo di Euclide
        int tmpInt;
        while ((tmpInt = i % j) != 0)
        {
            i = j;
            j = tmpInt;
        }

        // Stampa su output standard
        System.out.println("MCD(" + m + "," +	n + ") = " + j);
    }
}