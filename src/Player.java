public class Player {
    // Private felter sikrer indkapsling
    private int playerId;
    private String name;
    private int age;
    private double score;

    // Konstruktør til at initialisere alle attributter ved brug af 'this.'
    public Player(int playerId, String name, int age, double score) {
        this.playerId = playerId;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    // --- Metoder til at opdatere data ---

    // Opdaterer spillerens score med en helt ny værdi
    public void updateScore(double newScore) {
        this.score = newScore;
    }

    // --- Getter og Setter metoder ---

    public int getPlayerId() {
        return this.playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Fejl: Alder kan ikke være negativ.");
        }
    }

    public double getScore() {
        return this.score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    // --- Udskrivningsmetoder ---

    // Gør det nemt at omdanne et Player-objekt til en ren tekststreng
    @Override
    public String toString() {
        return "Spiller [ID: " + this.playerId + " | Navn: " + this.name + " | Alder: " + this.age + " år | Score: " + this.score + "]";
    }

    // Viser spillerens detaljer med et klart og tydeligt output i konsollen
    public void displayDetails() {
        System.out.println(this.toString());
    }
}