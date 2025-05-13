import java.util.Scanner;

public class EsempioScanner {
    public static void main(String[] args) {
        //! inizzializzo e importo l'ogetto scanner
        Scanner scannerS = new Scanner(System.in);
         Scanner scannerN = new Scanner(System.in);

        System.out.println("enter username");
        //! permette a l'utente di inserire una stringa come linea di comando
        String userName = scannerS.nextLine();
        System.out.println("inserisci la tua eta");
        int eta = scannerN.nextInt();
        scannerS.nextLine(); //! Consuma il newline rimasto dopo nextInt()
        
        //! stampo il risultato finale
        System.out.printf("username : %s%n eta : %d anni",userName,eta);       

        scannerS.close(); //! chiudo lo scanner per la gestione delle stringhe
        scannerN.close(); //! chiudo lo scanner per la gestione dei numeri
    }
}
