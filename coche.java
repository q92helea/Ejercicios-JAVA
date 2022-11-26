import java.io.*;

public class Main {

    public static void main(String args[]) throws IOException {

        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));

        String r;

        int sumDoors;

        sumDoors = 0;

        Coche mycar = new Coche(sumDoors);

        do {

            do {

                System.out.print("agregar puerta al coche? (s/n): ");

                r = bufEntrada.readLine();

                r = r.toLowerCase();

            } while (!(r.equals("s") || r.equals("n")));

            if (r.equals("s")) {

                // crear objeto de clase coche

                sumDoors = mycar.doors(sumDoors);

                // Imprimir mensaje

                System.out.println("Numero de puertas que tiene el objeto: " + sumDoors);

            }

        } while (!r.equals("n"));

    }

}

    // clase Coche

class Coche {

    // Operaciones incremento de puertas

    int doors;

    // Constructor para Coche

    Coche(int c) {

        doors = c;

    }
    // Retornando valores

    int doors(int sumDoors) {

        return sumDoors + 1;

    }

}