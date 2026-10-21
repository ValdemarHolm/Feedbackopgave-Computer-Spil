public class Game {
    // Private felter sikrer indkapsling (Encapsulation)
    private int gameId;
    private String title;
    private String genre;
    private double price;

    // Konstruktør til at initialisere alle attributter
    public Game(int gameId, String title, String genre, double price) {
        this.gameId = gameId;
        this.title = title;
        this.genre = genre;
        setPrice(price); // Bruger setteren for at genbruge pris-valideringen
    }

    // --- Getter og Setter metoder ---

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        // En fordel ved indkapsling: Vi kan forhindre, at spillet får en negativ pris
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Fejl: Prisen på '" + this.title + "' kan ikke være negativ! Sættes til 0.0");
            this.price = 0.0;
        }
    }

    // --- Udskrivningsmetoder ---

    // toString() returnerer en struktureret tekststreng med spillets data
    @Override
    public String toString() {
        return "Spil [ID: " + gameId + " | Titel: " + title + " | Genre: " + genre + " | Pris: " + price + " kr.]";
    }

    // displayDetails() printer spillets detaljer direkte ud i konsollen ved at bruge toString()
    public void displayDetails() {
        System.out.println(this.toString());
    }
}