import java.util.Scanner;

public class EsercizioScanner {
    public static void main(String[] args) {
        //! inizializzo scanner
        Scanner scannerS= new Scanner(System.in);
        Scanner scannerN= new Scanner(System.in);

        //! imput utente e messaggi associati
        System.out.println("inserisci il tuo nome, String");
        String nome = scannerS.nextLine();
         System.out.println("inserisci la tua età, int");
        int eta = scannerN.nextInt();
        
        System.out.println("inserisci il tuo peso, Float");
        float peso = scannerN.nextFloat();
        
        System.out.println("hai un animale domestico? (true/false), boolean");
        boolean animaleDomestico = scannerN.nextBoolean();
        System.out.println("inserisci la tua altezza, double");
        double altezza = scannerN.nextDouble();
        
        System.out.println("inserisci un numero da -128 a 127, byte");
        byte numeroByte = scannerN.nextByte();
        
        System.out.println("inserisci un numero da -32768 a 32767, short");
        short numeroShort = scannerN.nextShort();
        
        System.out.println("inserisci un numero da -9223372036854775808 a 9223372036854775807, long");
        long numeroLong = scannerN.nextLong();

        //! chiusura scanner
        scannerN.close();
        scannerS.close();
        

        //! stampa in colonna degli imput dell'utente
        System.out.printf(" nome(String) : %s%n eta(int) : %d%n peso(float) : %.2f%n animale domestico(boolean) : %b%n altezza(double) : %.2f%n numero byte(byte) : %d%n numero short(short) : %d%n numero long(long) : %d", nome,eta,peso,animaleDomestico,altezza,numeroByte,numeroShort,numeroLong);

    }
}
