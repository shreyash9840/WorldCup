package modal;


import java.util.ArrayList;

public class Teams {
    String name;
    String positions;
    String group;
    String colour;
 ArrayList<Players> player;

    public Teams(String name, String positions, String group, String colour, ArrayList<Players> player) {
        this.name = name;
        this.positions = positions;
        this.group = group;
        this.colour = colour;
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPositions() {
        return positions;
    }

    public void setPositions(String positions) {
        this.positions = positions;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public ArrayList<Players> getPlayer() {
        return player;
    }

    public void setPlayer(ArrayList<Players> player) {
        this.player = player;
    }
}
