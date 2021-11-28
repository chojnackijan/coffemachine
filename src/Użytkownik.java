public class Użytkownik {
    String name;
    int wiek;

    public Użytkownik(String name, int wiek) {
        this.name = name;
        this.wiek = wiek;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWiek() {
        if (getWiek() > 18) {
            System.out.println("wiek większy od 18");
        } else if (getWiek() < 18) ;
        System.out.println("wiek mniejszy od 18");
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public boolean czyMożeLegalnieKupićAlkochol() {
        if (wiek >= 18){
            return true;
        } else {
            return false;
        }
    }

}


