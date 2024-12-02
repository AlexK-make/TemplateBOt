public class Class {
    
    private int points;
    private int rebounds;
    private int assists;
    private String name;

    public player (String name, int points, int rebounds,int assists){
        this.name = name;
        this.points = points;
        this.rebounds = rebounds;
        this.assists = assists;

    }

public String getName(){
    return name;
}

public int getPoints(){
    return points;
}

public int getRebounds() {
    return rebounds;

}

public int getAssists() {
    return assists;
}

public void setName(String name){
    this.name = name;
}
public void setPoints(int points){
    this.points = points;
}
public void setRebounds(int rebounds){
    this.rebounds = rebounds;
}
public void setAssists(int assists){
    this.assists = assists;
}

    }



