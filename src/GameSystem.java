public class GameSystem {
    // Arrays til at gemme spil og spillere med faste max-størrelser
    private Game[] games;
    private Player[] players;

    // Tællere til at holde styr på, hvor mange elementer der reelt er lagt i arrayet
    private int gameCount;
    private int playerCount;

    // Konstruktør der definerer, hvor store arrays skal være som udgangspunkt
    public GameSystem(int maxGames, int maxPlayers) {
        this.games = new Game[maxGames];
        this.players = new Player[maxPlayers];
        this.gameCount = 0;
        this.playerCount = 0;
    }

    // --- Metoder til at tilføje elementer ---

    // addGame: Tilføjer et spil, hvis der er plads i arrayet
    public void addGame(Game game) {
        if (gameCount < games.length) {
            games[gameCount] = game;
            gameCount++;
        } else {
            System.out.println("Fejl: Kan ikke tilføje spil. Systemet er fuldt!");
        }
    }

    // addPlayer: Tilføjer en spiller, hvis der er plads i arrayet
    public void addPlayer(Player player) {
        if (playerCount < players.length) {
            players[playerCount] = player;
            playerCount++;
        } else {
            System.out.println("Fejl: Kan ikke tilføje spiller. Systemet er fuldt!");
        }
    }

    // --- Visningsmetoder ---

    // displayAllGames: Løber gennem alle tilføjede spil og kalder deres displayDetails()
    public void displayAllGames() {
        System.out.println("--- Alle spil i systemet ---");
        if (gameCount == 0) {
            System.out.println("Ingen spil registreret.");
            return;
        }
        for (int i = 0; i < gameCount; i++) {
            games[i].displayDetails();
        }
    }

    // displayAllPlayers: Løber gennem alle tilføjede spillere og kalder deres displayDetails()
    public void displayAllPlayers() {
        System.out.println("--- Alle spillere i systemet ---");
        if (playerCount == 0) {
            System.out.println("Ingen spillere registreret.");
            return;
        }
        for (int i = 0; i < playerCount; i++) {
            players[i].displayDetails();
        }
    }

    // --- Søgemetoder ---

    // findGameById: Søger efter et spil og returnerer objektet (eller null hvis ikke fundet)
    public Game findGameById(int gameId) {
        for (int i = 0; i < gameCount; i++) {
            if (games[i].getGameId() == gameId) {
                return games[i]; // Returnerer spillet med det samme
            }
        }
        return null; // Returneres hvis spillet ikke findes
    }

    // findPlayerById: Søger efter en spiller og returnerer objektet (eller null hvis ikke fundet)
    public Player findPlayerById(int playerId) {
        for (int i = 0; i < playerCount; i++) {
            if (players[i].getPlayerId() == playerId) {
                return players[i]; // Returnerer spilleren med det samme
            }
        }
        return null; // Returneres hvis spilleren ikke findes
    }

    // --- Opdateringsmetode ---

    // updatePlayerScore: Finder en spiller via ID og opdaterer scoren ved brug af updateScore() fra Opgave 2
    public void updatePlayerScore(int playerId, double newScore) {
        Player player = findPlayerById(playerId); // Genbruger vores søgemetode

        if (player != null) {
            player.updateScore(newScore);
            System.out.println("Score opdateret for spiller ID " + playerId);
        } else {
            System.out.println("Fejl: Spiller med ID " + playerId + " blev ikke fundet.");
        }
    }
}
