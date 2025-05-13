public class ProvaTipi {
    //! classe in cui proviamo i tipi di dato
    /*
     * sono un commento multilinea a scopo teorico/pratico
     * linea 2
     * linea 3
     * ecc..
     */
    public static void main(String[] args) {
        //! prova stampa interi passati direttamente come parametro di println
        System.out.println(3);
        System.out.println(358);
        System.out.println(50000);
        System.out.println(3+3);
        System.out.println(3*2);

        //! inizializziamo le prime variabili
        int provaNumero = 21;
        String provaTesto = "Ciao belli";
        boolean provaBooleano = false;

        System.out.printf("%d , %s , %b",provaNumero,provaTesto,provaBooleano);
        //! dichiarimao le prime variabili
        boolean provaBooleano2; 
        String provaTesto2;
        int provaNumero2;

        //! le variabili "costanti" keyword final
        final int PROVA_COSTANTE = 10;
        /*
        *questo statemant non potrà essere applicato ed andra in errore
        PROVA_COSTANTE = 3;
        */ 

        //! proviamo le stringhe
        String prova = "Prova";
        System.out.println(prova);
        prova = "mondo";
        System.out.println("ciao " + prova);
        //! concateniamo stringhe utilizzando l'operatore +
        String ciao = "Ciao";
        String mondo = " mondo ";
        String fullPart = ciao + mondo;
        System.out.println(fullPart + "infamee!");


    }
    
}
