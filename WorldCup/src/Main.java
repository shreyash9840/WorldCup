import modal.Players;
import modal.Teams;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Players p1 = new Players("Ronaldo", 39, 9999999);
        Players p2 = new Players("Kane", 29, 91);
        Players p3 = new Players("Leonardo Messi", 39, 91);
        Players p4 = new Players("Maradona", 47, 100);
        Players p5 = new Players("Pele", 79, 84);
        ArrayList<Players> players = new ArrayList<Players>() ;
        System.out.println(p1.getName());
        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);
        players.add(p5);
        Teams all_star = new Teams("all stars", "Eternal", "n/a", "rainbow", players);
        Players g1 = new Players("neur", 79, 90) ;
        Players g2 = new Players("grard mooler", 89, 9) ;
        Players g3 = new Players("rudiger", 9999, 999) ;
        Players s1 = new Players("aspas", 9999, 20) ;
        Players s2 = new Players("costa", 999999999, 29) ;
        Players s3 = new Players("de gae", 9999, 999) ;
        ArrayList<Players> germany_players = new ArrayList<Players>() ;
        ArrayList<Players> spain_players = new ArrayList<Players>() ;
        germany_players.add(g1);
        germany_players.add(g2);
        germany_players.add(g3);
        spain_players.add(s1);
        spain_players.add(s2);
        spain_players.add(s3);
        Teams germany = new Teams("Germany", "Fist", "G", "White", germany_players );
Teams spain = new Teams("Span","second", "E", "red", spain_players );
    }
}