public class Player {  // Renamed the class to 'Player' to avoid using the reserved word 'Class'

    private int points;
    private int rebounds;
    private int assists;
    private String name;

    // Constructor should have the same name as the class (Player)
    public Player(String name, int points, int rebounds, int assists) {
        this.name = name;
        this.points = points;
        this.rebounds = rebounds;
        this.assists = assists;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public int getRebounds() {
        return rebounds;
    }

    public int getAssists() {
        return assists;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setRebounds(int rebounds) {
        this.rebounds = rebounds;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }
}
