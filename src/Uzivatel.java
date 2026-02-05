public class Uzivatel {
    /*private String jmeno;
    private String prijmeni;
    private String uzivatelskeJmeno;
    private String heslo;

    private static final String regJmeno = "^[A-Z]\\p{L}+$";
    private static final String regPrijmeni = "^[A-Z]\\p{L}+$";
    private static final String regUzivatelskeJmeno = "^[a-zA-Z][a-zA-Z0-9]*_?$";
    private static final String regHeslo = "^[a-zA-Z0-9]{10,}$";

    public Uzivatel(String jmeno, String prijmeni, String uzivatelskeJmeno, String heslo) {

        if (!jmeno.matches(regJmeno)) {
            throw new IllegalArgumentException("Neplatné jméno");
        }

        if (!prijmeni.matches(regPrijmeni)) {
            throw new IllegalArgumentException("Neplatné příjmení");
        }

        if (!uzivatelskeJmeno.matches(regUzivatelskeJmeno)) {
            throw new IllegalArgumentException("Neplatné uživatelské jméno");
        }

        if (!heslo.matches(regHeslo)) {
            throw new IllegalArgumentException("Neplatné heslo");
        }

        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.uzivatelskeJmeno = uzivatelskeJmeno;
        this.heslo = heslo;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public String getUzivatelskeJmeno() {
        return uzivatelskeJmeno;
    }

    public String getHeslo() {
        return heslo;
    }*/

    private String datum1;
    private String datum2;
    private String datum3;

    private static final String regDatum1 = "^(([0-2][0-9]|3[0-1])){2}\\.[0-1]{2}\\.[0-9]{4}$";
    private static final String regDatum2 = "^[0-9]{1,2}\\.\\s?[0-9]{1,2}\\.\\s?[0-9]{4}$";
    private static final String regDatum3 = "^[0-9]{4}-[0-9]{2}-[0-9]{2}$";

    public Uzivatel(String datum1, String datum2, String datum3) {
        if (!datum1.matches(regDatum1)) {
            throw new IllegalArgumentException("Neplatný datum1");
        }

        if (!datum2.matches(regDatum2)) {
            throw new IllegalArgumentException("Neplatný datum2");
        }

        if (!datum3.matches(regDatum3)) {
            throw new IllegalArgumentException("Neplatný datum3");
        }

        this.datum1 = datum1;
        this.datum2 = datum2;
        this.datum3 = datum3;
    }

    public String getDatum1() {
        return datum1;
    }

    public String getDatum2() {
        return datum2;
    }

    public String getDatum3() {
        return datum3;
    }
}
