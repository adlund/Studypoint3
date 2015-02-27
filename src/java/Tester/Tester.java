/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tester;

import Model.Player;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alex
 */
public class Tester {

    public static void main(String[] args) {
        List<Player> players = new ArrayList();

        players.add(new Player(0, "James Rodriguez", "Columbia"));
        players.add(new Player(1, "Thomas Mueller", "Germany"));
        players.add(new Player(2, "Messi", "Argentina"));
        players.add(new Player(3, "Neymar", "Brazil"));
        players.add(new Player(4, "van Persie", "Netherlands"));

        Gson gson = new Gson();
        //From Java to Json
        String clubsJson = gson.toJson(players);
        System.out.println(clubsJson);
    }

}
