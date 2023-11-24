public class Konte22Oppgave2 {
    class Valuta{
        private String valuta;
        private double kurs;

        public Valuta(String valuta, double kurs) {
            this.valuta = valuta;
            this.kurs = kurs;
        }

        public String getValuta() {
            return valuta;
        }
        public double getKurs() {
            return kurs;
        }
    }

    class ValutaKalkulator {

        private ArrayList<Valuta> valutakurser = new ArrayList<>();
        Valuta SEK = new Valuta();
        SEK.valuta = "SKK";
        SEK.kurs = 2;

        Valuta USD = new Valuta();
        USD.valuta = "USD";
        USD.kurs = 10;

        valutakurser.add(USD);
        valutakurser.add(SEK);

        public ValutaKalkulator(double sumTilKonvertering, String valutaKode){
            return sumTilKonvertering*beregnKurs(valutaKode);
        }
        public double beregnKurs(String "SKK") {
            //NOK, SEK, DKK
            double kurs; //Ny variabel av type double
            //Finne kurs til valutaen
            for(valutaNavn : valutakurser){
                if (valutaNavn.valuta == valuta ){
                    kurs = valutaNavn.kurs;
                    return kurs;
                }
            }
            //Returner kursen til denne valutaen
            return 0;
        }
    }
}
