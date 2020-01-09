package section2;

import java.util.ArrayList;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import java.util.Scanner;

public class CricketTournament {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String playerName = null;
        long runs = 0L;
        HashMap<String, Long> hm = new HashMap<String, Long>();
        System.out.println("Enter the number of players");
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            s.nextLine();
            System.out.println("Enter the details of player" + i);
            playerName = s.nextLine();
            runs = s.nextLong();
            hm.put(playerName, runs);
        }
        ArrayList<String> key = new ArrayList<String>();
        ArrayList<Long> value = new ArrayList<Long>();
        LinkedHashMap<String, Long> lhm = new LinkedHashMap<String, Long>(hm);
        lhm.putAll(hm);
        for (Map.Entry<String, Long> e : lhm.entrySet()) {

            key.add(e.getKey());
            value.add(e.getValue());
        }
        long max = Collections.max(value);
        int index = -1;
        for (int i = 0; 1 < key.size(); i++) {

            if (max == value.get(i)) {
                index = i;
                break;
            }

        }
        System.out.println(key.get(index));

        s.close();

    }
}