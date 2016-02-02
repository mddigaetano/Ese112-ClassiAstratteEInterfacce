# Ese112-ClassiAstratteEInterfacce

Consegna un file di testo su Moodle (scrivi nel nome del file il tuo cognome) seguendo le indicazioni seguenti. Scrivi un’analisi completa del problema riportando definizioni e caratteristiche delle classi astratte e delle interfacce e copia/incolla il codice java e i diagrammi UML da Netbeans.

Ognuno deve consegnare un compito diverso.

Si implementi la gerarchia di classi PoligonoRegolare, con specializzazioni in Triangolo, Quadrato, Pentagono, Esagono.  La classe PoligonoRegolare è implementata come classe astratta .

Tutti i poligoni regolari sono caratterizzati da: 

-	il numero e la misura dei lati, che si impostano con il costruttore;

-	un metodo per il calcolo dell’area e un metodo per il calcolo del perimetro.

Specifici poligoni necessitano di altri parametri per il calcolo dell’area:

-	l’altezza nel caso dei triangoli;

-	l’apotema per il pentagono e l’esagono.

Definisci poi l‘interfaccia Figura senza attributi con metodi setNome e getNome. Definisci la classe FiguraPiana che implementa tale interfaccia. Alloca un oggetto della classe FiguraPiana ed invoca su esso i metodi precedenti.

Definisci la classe FiguraQuadrato che implementa l’interfaccia Figura ed estende la classe Quadrato.

Dimostra con degli esempi che le seguenti operazioni determinano un errore in compilazione:

-  compilare una classe che non ridefinisce i metodi astratti della superclasse;

-  compilare una classe che non ridefinisce i metodi dell’interfaccia implementata;

- istanziare una classe astratta;

- istanziare un’interfaccia.
