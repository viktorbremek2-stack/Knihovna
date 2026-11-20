public class Kniha {

        private int id;
        private String nazev;
        private String autor;
        private int rok;
        private Ctenar vypujcil;
        // Konstruktor
        public Kniha(int id, String nazev, String autor, int rok) {
                this.id = id;
                this.nazev = nazev;
                this.autor = autor;
                this.rok = rok;
                this.vypujcil = null;        }

        // Gettery
        public int getId() {
                return id;
        }

        public String getNazev() {
                return nazev;
        }

        public String getAutor() {
                return autor;
        }

        public int getRok() {
                return rok;
        }

        public boolean isPujcena() {
                return vypujcil != null;
        }

        // Výpis knihy
        @Override
        public String toString() {
                return "ID: " + id +
                        " | Název: " + nazev +
                        " | Autor: " + autor +
                        " | Rok: " + rok +
                        " | Vypůjčena: " + vypujcil;




        }
        public void pujcit(Ctenar ctenar) {
                this.vypujcil = ctenar;

        }
        public void Vratit() {

                this.vypujcil = null;


        }public Ctenar getVypujcil() {
                return vypujcil;
        }
}