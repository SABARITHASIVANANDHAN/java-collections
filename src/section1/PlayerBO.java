package section1;

import java.util.ArrayList;

public class PlayerBO {

    public void displayAllPlayerDetails(ArrayList<Player> playerlist) {

        System.out.println("Player Details\n");

        for (Player player : playerlist) {
            System.out.println(player);
        }
    }

}
