# Case-opgave: Computerspil System 🎮

Dette projekt er en studieopgave i **Objektorienteret Programmering (OOP)** baseret på principperne i kapitel 9. Projektet modellerer et simpelt spilsystem (i stil med en mindre udgave af Steam), som kan administrere spil, spillere og highscores.

Projektet er udviklet som et gruppearbejde i studiegruppen.

## 🚀 Formål og Læringsmål
Formålet med projektet er at tænke som en softwarearkitekt og omsætte virkelige koncepter til struktureret kode. Opgaven dækker følgende OOP-koncepter:
* **Klasser og Objekter:** Modellering af `Game`, `Player` og `GameSystem`.
* **Indkapsling (Encapsulation):** Sikring af data ved brug af `private` attributter samt `getters` og `setters` med indbygget validering.
* **Arrays af Objekter:** Håndtering af datastrukturer med fastlåste størrelser uden brug af eksterne biblioteker.
* **Metode-genbrug:** Minimering af redundant kode ved at lade metoder kalde hinanden internt.

---

## 🛠️ Systemarkitektur og Klasser

Systemet er opdelt i tre primære klasser samt en `Main`-klasse til test:

### 1. Game 🕹️
Repræsentere et computerspil på platformen.
* **Attributter:** `gameId` (int), `title` (String), `genre` (String), `price` (double).
* **Funktionalitet:** Indeholder fuld indkapsling. Pris-setteren sikrer logisk validering, så et spil ikke kan få en negativ pris. Detaljer udskrives effektivt via en overskrevet `toString()`-metode.

### 2. Player 👥
Repræsentere en registreret spiller i systemet.
* **Attributter:** `playerId` (int), `name` (String), `age` (int), `score` (double).
* **Funktionalitet:** Gør brug af explicit `this.`-reference i konstruktøren for høj kode-tydelighed. Indeholder en dedikeret `updateScore()`-metode til løbende opdatering af spillerens præstationer.

### 3. GameSystem 🖥️
Fungerer som spillets motor/database, der binder det hele sammen.
* **Datastruktur:** Bruger to faste arrays (`Game[]` og `Player[]`) samt tællere (`gameCount`, `playerCount`) for at undgå `NullPointerException`.
* **Kernefunktioner:**
  * `addGame(Game game)` & `addPlayer(Player player)` - Tilføjer elementer hvis der er plads.
  * `displayAllGames()` & `displayAllPlayers()` - Gennemløber arrays og printer data i et klart format.
  * `findGameById(int id)` & `findPlayerById(int id)` - Søger efter specifikke objekter vha. loops.
  * `updatePlayerScore(int id, double score)` - Finder en spiller og opdaterer dennes score ved at genbruge søge-funktionaliteten.

---

## 💻 Sådan køres projektet

1. Kopier kildekoden for klasserne `Game`, `Player`, `GameSystem` og `Main` ind i dit Java-udviklingsmiljø (f.eks. IntelliJ, Eclipse eller VS Code).
2. Sørg for, at alle filer ligger i samme package/mappe.
3. Kør `Main.java` for at se systemet demonstrere oprettelse, søgning og score-opdatering i konsollen.

### Forventet Output i Konsollen:
Når programmet køres, vil test-scenariet i `Main` udskrive følgende:
* En oversigt over alle oprettede spil og spillere.
* En demonstration af fejlhåndtering, hvis en pris forsøges sat til en negativ værdi.
* Bekræftelse på en succesfuld søgning samt en opdateret highscore.

---

## 👥 Studiegruppe
Opgaven er udarbejdet i fællesskab af studiegruppen. Alle medlemmer har bidraget til arkitekturdesign, kodning og test af valideringslogikken.
