public class Uzivatel {
    private String jmeno;
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
    }
}
