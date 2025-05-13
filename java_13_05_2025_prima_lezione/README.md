# Readme appunti!

## cosa ci serve?

-IDE
-JAVA
-ESTENSIONI

## cos'è un IDE e a cosa serve?

è un ambiente di sviluppo che permette
di EVITARE LA RIDONDANZA DI UN ERRORE
isolomanto della propagazione dell'errore

centralizazione i tool di sviluppo

## OOP

Java è un linguaggio che utilizza la programmazione
orientata a gli oggetti OOP

## cos'è l'OOP

è un paradigma di programmazione che permette di definire
oggetti software in grado di interagire gli uni con gli altri
attraverso lo scambio di messaggi.

## gli oggetti possono essere

- paritario
- subparitario di maggioranza
- subparitario e di minoranza

## la coerenza funzionale

è differente dalla portabilità ma permette
di far funzionare un software su diverse piattaforme
che possiedono le stesse caratteristiche hardware/librerie
è un paradigma della programmazione OOP

## la portabilità in java(JVM)

è il paradigma che permette a lo stesso software di
girare su diverse piattaforme con diverse caratteristiche
ma che possiedono la stessa virtual machine

## i 4 pilastri dell'OOP

- encapsulation ( Incapsulamento ) --> contenimento
- abstraction (Astrazione)
- polymorphism (Polimorfismo) --> uso
- Inheritance (Ereditarietà) -- specializzazione

## vantaggi dell OOP

- essa fornisce un supporto naturale alla modellazione software degli
  oggetti del mondo reale o del modello astratto da riprodurre; --> Gestione oggetti del mondo reale o astratti in un software

- permette una più facile gestione e manutenzione di progetti di
  grandi dimensioni; --> Gestibilita , mantenimento , scalabilità

- l'organizzazione del codice sotto forma di classi favorisce la
  modularità e il riuso di codice. --> Modularità, riutilizzo

## svantaggi dell OOP

- Se un oggetto viene inizializzato in modo sbagliato il programma che lo usa non parte
- Utilizzo elevato di memoria

## Elementi dell OOP

- Classi : ## --> Blueprint dell Oggetto
  --Le classi definiscono dei tipi di dato e
  permettono la creazione degli oggetti
  secondo le caratteristiche definite
  nella classe stessa
  --Grazie alle relazioni di ereditarietà, è
  possibile creare nuove classi a partire
  da quelle esistenti, estendendole con
  caratteristiche aggiuntive
- Oggetti : ## --> risultato della stampa della Classe

## Da cosa è composta una classe?

- Attributi :
  ossia variabili e/o
  costanti che definiscono le
  caratteristiche o proprietà degli
  oggetti instanziabili invocando la
  classe; i valori inizializzati degli
  attributi sono ottenuti attraverso il
  cosiddetto costruttore

- Metodi : --> differnte da una funzione in quanto il metodo è dipendente da una classe
  ossia procedure che operano
  sugli attributi

- Calssi annidate : --> classi presenti in altre classi

## JAVA, cos'è?

-linguaggio compilato -> vedere schema processo
-linguazzio tipizzato
-linguaggio alto livello
-linguaggio robusto
-linguaggio portabile (gira su tutti i sistemi(hardware) che hanno una JVM integrata)

- è una piattaforma software (API application programming interface),
  l'esucazione avviene su ambiente ORACLE tramite il JDK

## cos'è il jdk?

Il **JDK (Java Development Kit)** è un insieme di strumenti usati per **scrivere, compilare ed eseguire programmi in Java**.

Al suo interno contiene:

- **JRE (Java Runtime Environment)**: permette di eseguire i programmi Java.
- **Compilatore `javac`**: converte il codice sorgente in bytecode.
- **Altri strumenti**: per il debug, la documentazione, e la gestione dei programmi Java.

---

## Processo di Conversione: Dal Codice al Codice Macchina

1. **Scrittura del codice sorgente**  
   Il programmatore crea un file con istruzioni scritte in linguaggio Java.

2. **Compilazione**  
   Il compilatore (`javac`) converte il codice sorgente in **bytecode**, un linguaggio intermedio salvato in un file `.class`.

3. **Esecuzione**  
   La **JVM (Java Virtual Machine)** legge il bytecode e lo converte in **codice macchina**, ovvero istruzioni comprensibili dal processore.  
   Questa conversione può avvenire tramite:
   - **Interpretazione** (istruzione per istruzione)
   - **Compilazione Just-In-Time (JIT)** per una maggiore efficienza

---

## Schema del Processo

Codice sorgente (.java)
↓ [compilazione]
Bytecode (.class)
↓ [esecuzione tramite JVM]
Codice macchina (CPU)

## per cosa è usato java?

- Applicazioni mobili (app Android) --> attualmente obsoleto
- Applicazioni desktop --> attualmente obsoleto
- Applicazioni web --> attualmente obsoleto ma ancora utilizzato
- Server Web e server applicativi --> ! principale
- Giochi--> attualmente obsoleto
- Connessione alla banca dati --> ! Principale

## ogni riga del codice che viene eseguita in Java deve trovarsi in un file.class

## che è risultato della compilazione del file.java

## ogni file in java che sia una classe un interfaccia una repository o un service usa il PascalCase

## Il metodo MAIN

il metodo public static void main(String[] args){}

al run del programma verra eseguito tutto il codice presente nel metodo main

ovviamente la classe che conterà il metodo main dovrà chiamarsi come il file.java ma questa regola vale per tutti i file .java che andiamo a creare

## ES

App.java\*
public class App{
static void main(String[] args){}
}

## vediamo i primi metodi usati nei primi statemant di codice

main()-->nome del metodo
String[] args --> argomenti del metodo main

println() --> metodo
out -->classe astratta di System o meglio classe interna
System -->class

## Java essendo ogni linguaggio tipizzato

ogni variabile o attributo deve essere preceduta dal tipo di dato con cui deve essere inizializzata
Si dividono in primitivi,wrapper e reference type (classi che possono essere istanziate o interfacce)

## vediamo i tipi primitivi gia definiti in java

-char singoli caratteri
-int numeri interi
-short numeri interi corti
-long numeri interi molto lunghi L/l finale 9999999999999L
-float numeri con la virgola mobile F/f finale 3.14f
-double numeri con la virgola mobile D/d finale 4.15d
-boolean valori booleani true / false
-byte
-Strign (non proprio primitivo non proprio classe)

## vediamo le reference definiti da noi (Classi,interfacce)

-String
-classi o interfacce che possono essere instaziate

## le wrapper class

-Character
-Integer
-Short
-Long
-Float
-Double
-Boolean
-Byte

## gli identificatori delle variabile

gli identificatori delle variabili rappresentano il nome vero e proprio della variabile

## Regole IMPORTANTEI nomi variabili:

univoco, coerente , descrittivo.

non possono inziare con numeri , trattini alti "-", % ecc

-possono contenere lettere,cifre, caratteri di sottolineatura e simboli di dollaro $
-devono iniziare con la lettera minuscola(NON VALE PER LE COSTANTI)
-sono case sensitive (distizione tra maiuscole e minuscole myVar != Myvar)
-le parole chiave di java non possono essere utilizzate come nomi

## OGGETTO SCANNER E TIPI DI IMPUT

Scanner scanner = new Scanner(System.in);
nextLine() --> char e String
nextBoolean()--> true e false
nextInt()--> numero intero
nextDouble()--> numero con virgola mobile (specifiche del double)
nextFloat()--> numero con virgola mobile (specifiche del float)
nextByte() --> -128 127
nextLong() --> intero molto grande
nextShort() --> numero intero non troppo grande(specifiche dello short)
