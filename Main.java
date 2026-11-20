import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Vytvoření seznamu knih
        ArrayList<Kniha> knihy = new ArrayList<>();

        // Přidání 50 knih
        knihy.add(new Kniha(1, "Hobit", "Tolkien", 1937));
        knihy.add(new Kniha(2, "Harry Potter", "Rowling", 1997));
        knihy.add(new Kniha(3, "1984", "George Orwell", 1949));
        knihy.add(new Kniha(4, "Farma zvířat", "George Orwell", 1945));
        knihy.add(new Kniha(5, "Malý princ", "Antoine de Saint-Exupéry", 1943));
        knihy.add(new Kniha(6, "Společenstvo Prstenu", "J. R. R. Tolkien", 1954));
        knihy.add(new Kniha(7, "Dvě věže", "J. R. R. Tolkien", 1954));
        knihy.add(new Kniha(8, "Návrat krále", "J. R. R. Tolkien", 1955));
        knihy.add(new Kniha(9, "451 stupňů Fahrenheita", "Ray Bradbury", 1953));
        knihy.add(new Kniha(10, "Jako zabít ptáčka", "Harper Lee", 1960));
        knihy.add(new Kniha(11, "Kdo chytá v žitě", "J. D. Salinger", 1951));
        knihy.add(new Kniha(12, "Konec civilizace", "Aldous Huxley", 1932));
        knihy.add(new Kniha(13, "Velký Gatsby", "F. Scott Fitzgerald", 1925));
        knihy.add(new Kniha(14, "Bílá velryba", "Herman Melville", 1851));
        knihy.add(new Kniha(15, "Pýcha a předsudek", "Jane Austen", 1813));
        knihy.add(new Kniha(16, "Frankenstein", "Mary Shelley", 1818));
        knihy.add(new Kniha(17, "Dracula", "Bram Stoker", 1897));
        knihy.add(new Kniha(18, "Obraz Doriana Graye", "Oscar Wilde", 1890));
        knihy.add(new Kniha(19, "Stařec a moře", "Ernest Hemingway", 1952));
        knihy.add(new Kniha(20, "O myších a lidech", "John Steinbeck", 1937));
        knihy.add(new Kniha(21, "Hrozny hněvu", "John Steinbeck", 1939));
        knihy.add(new Kniha(22, "Duna", "Frank Herbert", 1965));
        knihy.add(new Kniha(23, "Sní androidi o elektrických ovečkách?", "Philip K. Dick", 1968));
        knihy.add(new Kniha(24, "Marťan", "Andy Weir", 2011));
        knihy.add(new Kniha(25, "Ready Player One", "Ernest Cline", 2011));
        knihy.add(new Kniha(26, "Aréna smrti", "Suzanne Collins", 2008));
        knihy.add(new Kniha(27, "Stmívání", "Stephenie Meyer", 2005));
        knihy.add(new Kniha(28, "Labyrint: Útěk", "James Dashner", 2009));
        knihy.add(new Kniha(29, "Zlodějka knih", "Markus Zusak", 2005));
        knihy.add(new Kniha(30, "Šifra mistra Leonarda", "Dan Brown", 2003));
        knihy.add(new Kniha(31, "Andělé a démoni", "Dan Brown", 2000));
        knihy.add(new Kniha(32, "Jméno růže", "Umberto Eco", 1980));
        knihy.add(new Kniha(33, "Stín větru", "Carlos Ruiz Zafón", 2001));
        knihy.add(new Kniha(34, "Alchymista", "Paulo Coelho", 1988));
        knihy.add(new Kniha(35, "Lovec draků", "Khaled Hosseini", 2003));
        knihy.add(new Kniha(36, "Tisíce planoucích sluncí", "Khaled Hosseini", 2007));
        knihy.add(new Kniha(37, "Pí a jeho život", "Yann Martel", 2001));
        knihy.add(new Kniha(38, "Cesta", "Cormac McCarthy", 2006));
        knihy.add(new Kniha(39, "Hvězdy nám nepřály", "John Green", 2012));
        knihy.add(new Kniha(40, "Div světa", "R. J. Palacio", 2012));
        knihy.add(new Kniha(41, "Dárce", "Lois Lowry", 1993));
        knihy.add(new Kniha(42, "Koralina", "Neil Gaiman", 2002));
        knihy.add(new Kniha(43, "Kniha hřbitova", "Neil Gaiman", 2008));
        knihy.add(new Kniha(44, "Matilda", "Roald Dahl", 1988));
        knihy.add(new Kniha(45, "Karlík a továrna na čokoládu", "Roald Dahl", 1964));
        knihy.add(new Kniha(46, "Čarodějnice", "Roald Dahl", 1983));
        knihy.add(new Kniha(47, "Obr Dobr", "Roald Dahl", 1982));
        knihy.add(new Kniha(48, "Vítr ve vrbách", "Kenneth Grahame", 1908));
        knihy.add(new Kniha(49, "Alenka v říši divů", "Lewis Carroll", 1865));
        knihy.add(new Kniha(50, "Dobrodružství Toma Sawyera", "Mark Twain", 1876));



        ArrayList<Ctenar> ctenari = new ArrayList<>();
        ctenari.add(new Ctenar("Jan Novák"));


        // Hlavní menu
        System.out.println("**Vzdycky piš přesný název knih a čtenářů**");

        boolean bezi = true;

        while (bezi) {

            System.out.println("\n=== KNIHOVNA ===\n" +
                    "1) Knihy\n" +
                    "2) Přehled čtenářů a jejich výpůjček\n" +
                    "3) Půjčit / vrátit knihu\n" +
                    "4) Přidat čtenáře\n" +
                    "0) Konec");

            System.out.print("Vyberte možnost: ");
            String volba = scanner.nextLine();


            switch (volba) {

                case "1":
                    System.out.println("\n=== SEZNAM KNIH ===");

                    for (Kniha kniha : knihy) {
                        System.out.println(kniha.getNazev());
                    }

                    break;

                case "2":

                    System.out.println("=== ČTENÁŘI A JEJICH VÝPŮJČKY ===");

                    for (Ctenar ctenar : ctenari) {

                        System.out.println("\nČtenář: " + ctenar.getName());

                        boolean maVypujcene = false;


                        for (Kniha kniha : knihy)  {

                            if (kniha.getVypujcil() == ctenar) {

                                System.out.println("- " + kniha.getNazev());
                                maVypujcene = true;

                            }
                        }

                        if (!maVypujcene) {
                            System.out.println("Nemá vypůjčené žádné knihy.");
                        }
                    }

                    break;



                case "3":

                System.out.println("=== PŮJČOVÁNÍ A VRACENÍ ===\n" +
                        "1) Půjčit knihu\n" +
                        "2) Vrátit knihu\n" +
                        "0) Zpět");

                System.out.print("Vyberte možnost: ");
                String volbaVypujcky = scanner.nextLine();

                switch (volbaVypujcky) {

                    case "1": {

                        System.out.print("Napiš název knihy: ");
                        String nazevKnihy = scanner.nextLine();

                        System.out.print("Napiš jméno čtenáře: ");
                        String jmenoCtenare = scanner.nextLine();

                        Kniha nalezenaKniha = null;

                        for (Kniha kniha : knihy) {
                            if (kniha.getNazev().equalsIgnoreCase(nazevKnihy)) {
                                nalezenaKniha = kniha;
                                break;
                            }
                        }

                        Ctenar nalezenyCtenar = null;

                        for (Ctenar ctenar : ctenari) {
                            if (ctenar.getName().equalsIgnoreCase(jmenoCtenare)) {
                                nalezenyCtenar = ctenar;
                                break;
                            }
                        }

                        if (nalezenaKniha == null) {
                            System.out.println("Kniha nebyla nalezena!");
                        }
                        else if (nalezenyCtenar == null) {
                            System.out.println("Čtenář nebyl nalezen!");
                        }
                        else if (nalezenaKniha.isPujcena()) {
                            System.out.println("Kniha už je vypůjčená!");
                        }
                        else {
                            nalezenaKniha.pujcit(nalezenyCtenar);

                            System.out.println("Kniha " + nazevKnihy +
                                    " byla půjčena čtenáři " + jmenoCtenare + "!");
                        }

                        break;
                    }

                    case "2": {

                        System.out.print("Napiš název knihy: ");
                        String nazevKnihy = scanner.nextLine();

                        Kniha nalezenaKniha = null;

                        for (Kniha kniha : knihy) {
                            if (kniha.getNazev().equalsIgnoreCase(nazevKnihy)) {
                                nalezenaKniha = kniha;
                                break;
                            }
                        }

                        if (nalezenaKniha == null) {
                            System.out.println("Kniha nebyla nalezena!");
                        }
                        else if (!nalezenaKniha.isPujcena()) {
                            System.out.println("Tato kniha není vypůjčená!");
                        }
                        else {
                            System.out.println("Knihu vrací: " +
                                    nalezenaKniha.getVypujcil().getName());

                            nalezenaKniha.Vratit();

                            System.out.println("Kniha byla úspěšně vrácena!");
                        }

                        break;
                    }

                    case "0":
                        System.out.println("Návrat do hlavního menu...");
                        break;

                    default:
                        System.out.println("Neplatná volba!");
                }

                break;


                case "4":

                    System.out.println("Správa čtenářů...");
                    System.out.println("Napiš jméno čtenáře");
                    String jmeno = scanner.nextLine();
                    ctenari.add(new Ctenar(jmeno));
                    System.out.println("Čtenář byl úspěšně přidán!");

                    break;

                case "0":
                    System.out.println("Ukončuji program...");
                    bezi = false;
                    break;

                default:
                    System.out.println("Neplatná volba!");
            }
        }

        scanner.close();
    }
}