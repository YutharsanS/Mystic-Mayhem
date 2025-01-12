import java.util.*;

import characters.CharacterMaker;
import core.*;
import core.HomeGrounds.HomeGround;
import gameutils.Console;

public class Main {
    public static void main (String[] args) {

        PlayerManager PM = PlayerManager.getInstance();

        Player player1 = PM.newPlayer("whitewolf", "Geralt of Rivia");
        Player player2 = PM.newPlayer("evilwizard", "Stregobor");
        // player1.buyCharacter("Archer", 1);
        // player1.battleSomeone();
        player1.buyCharacter("Archer", 1);
        player1.buyCharacter("Healer", 1);
        player2.buyCharacter("Knight", 2);
        player1.setHomeGround(HomeGround.HILLCREST);
        player2.setHomeGround(HomeGround.MARSHLAND);
        player1.printArmySimpleInfo();
        player2.printArmySimpleInfo();
        System.out.println(Combat.battle(player1, player2));
        //GameItem legolas = CharacterMaker.newCharacter("Archer",1);
        //Console.printState(player1);
        //legolas.printInfo();
    }
}