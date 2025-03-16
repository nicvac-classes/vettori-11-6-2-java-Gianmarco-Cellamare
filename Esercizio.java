
import java.util.Scanner;
import java.is.FileReader;
import java.is.FileWriter;

public static int eliminaVettore(int[] v, int n, int ie) {
    int i, n2;

    n2 = n - 1;
    i = ie;
    while (i <= n - 2) {
        v[i] = v[i + 1];
        i = i + 1;
    }

    public static int inserisciVettore(int[] v, int n, int e, int ie) {
        int i, n2;

        n2 = n + 1;
        i = n2 - 1;
        while (i >= ie + 1) {
            v[i] = v[i - 1];
            i = i - 1;
        }
        v[ie] = e;
        
        return n2;
    }

    public static String leggiComando() {
        String c;

        do {
            System.out.println("1. [I]nserisci elemento " + (char) 10 + "2. [E]limina elemento " + (char) 10 + "3. [R]icerca valore " + (char) 10 +  "4. [V]isualizza vettore " + (char) 10 + "5. [X] Esci");
            c = input.nextLine();
        } while (!c.equals("I") && !c.equals("E") && !c.equals("R") &&  !c.equals("V") && !c.equals("X"));
        
        return c;
    }

    public static int ricercaNelVettore(int[] v, int n, int valore) {
        int i, iTrovato;

        i = 0;
        iTrovato = -1;
        while (i < n && iTrovato == -1) {
            if (v[i] == valore) {
                iTrovato = i;
            }
            i = i + 1;
        }
        
        return iTrovato;
    }
    public static int LeggiVettore(int[] v, string nFile) {
        int n,i;
        n=integer.parseint(import_nextline());
        i=0;
        while (i<N) {
            V[i]=import.file.nextline();
            ++i;
        }
        inputfile.close();

    }

    public static int SalvaVettore(int[] v, string nFile) {
        int n,i;
        n=integer.parseint(import_nextline());
        i=0;
        while (i<N) {
            V[i]=import.file.nextline();
            ++i;
        }
        inputfile.close();

    }

    }



class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[])
    {
        Scanner in = new Scanner( System.in );
        Scanner file = new Scanner( System.file);
        Scanner import file=new Scanner(file);

        int N, i, Y, e;
        Np=leggiVettore(P,Np,"Prestiti.txt");
        Nv=LeggiVettore(V,Nv,"Libri.txt");
        do {
            System.out.println("Inserisci il numero dei libri");
            N = input.nextLine();


        }while (N>5);
        string c;
        Y=0
        int [] biblioteca = int [N];
        int [] prestiti = int [Y];
        i=0;

        while (i<N-1){
            System.out.println("Inserisci titolo del "+i+ " libro")
            biblioteca =input.nextline();
            i=i+1;

        }

        do {
            c = leggiComando();
            if (c.equals("I")) {
                System.out.println("Inserisci libro");
                e = Integer.parseInt( input.nextLine() );
                do {
                    System.out.println("Inserisci posizione dove inserire il libro");
                    i = Integer.parseInt( input.nextLine() );
                } while (i < 0 || i > n);
                n = inserisciVettore(biblioteca, N, libro, i);
            }
            if ( c.equals("E") ) {
                if (n > 1) {
                    do {
                        System.out.println("Inserisci la posizione del libro da eliminare");
                        i = Integer.parseInt( input.nextLine() );
                    } while (i < 0 || i >= n);

                    n = eliminaVettore(biblibiblioteca, N, i);
                } 
            }
            if (c.equals("R")) {
                System.out.println("Inserisci il libro da cercare");
                e = Integer.parseInt(input.nextLine());
                i = ricercaNelVettore(biblioteca, N, libro);
            }
            }
            if (c.equals("V")) {
                visualizzaVettore(biblioteca, n);
                visualizzaVettore(prestiti, n);
            }
        } while (!c.equals("X"));

        input.close();
        salvaVettore(V,Nv,"Libri.txt");
        salvaVettore(P,Np,"Prestiti.txt");
    }


    }
}