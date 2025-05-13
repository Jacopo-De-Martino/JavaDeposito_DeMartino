public class UseArgument {
    public static void main(String[] args) {
        //! inizializazione di una variabile di tipo String chiamata pippo
        String pippo = "Mirko";
        //! stampa di una stringa passata come argomento della funzione println
        System.out.print("Hi, ");
        //!stampa della variabile pippo passata come argomento della funzione println
        System.out.print(pippo);
        
        System.out.println(". How are you?");
        //! utilizzo di printf per formattare la stampa
        System.out.printf("Ciao sono %s e ho %d anni %n",pippo,20);

        //! utilizziamo soltanto println, così facendo crerà automaticamente una riga nel buffer
        System.out.println("TUTTO OK");
        System.out.println("TUTTO SBAGLIATO");

    }
}
