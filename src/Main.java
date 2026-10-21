public class Main {
    public static void main(String[] args) {
        // Opretter et spilsystem med plads til max 5 spil og 5 spillere
        GameSystem system = new GameSystem(5, 5);

        // 1. Opret og tilføj spil
        Game g1 = new Game(101, "Minecraft", "Sandbox", 149.0);
        Game g2 = new Game(102, "Elden Ring", "RPG", 449.0);
        system.addGame(g1);
        system.addGame(g2);

        // 2. Opret og tilføj spillere
        Player p1 = new Player(1, "SpeedrunnerX", 19, 0.0);
        Player p2 = new Player(2, "NoobMaster", 25, 10.5);
        system.addPlayer(p1);
        system.addPlayer(p2);

        // 3. Vis alt i systemet
        system.displayAllGames();
        System.out.println();
        system.displayAllPlayers();

        // 4. Test søgefunktion (findGameById)
        System.out.println("\n--- Søger efter spil med ID 102 ---");
        Game fundetSpil = system.findGameById(102);
        if (fundetSpil != null) {
            System.out.println("Fundet: " + fundetSpil.getTitle());
        }

        // 5. Opdater score via systemet og vis spillere igen
        System.out.println("\n--- Opdaterer score for spiller 1 ---");
        system.updatePlayerScore(1, 999.9);

        System.out.println();
        system.displayAllPlayers();
    }
}
