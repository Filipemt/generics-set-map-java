package application;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

    Map<String, String> cookies = new TreeMap<>();

    cookies.put("username", "Filipe Mota");
    cookies.put("email", "filipe@gmail.com");
    cookies.put("phone", "993679805");

    cookies.remove("email");
    cookies.put("phone", "992691019");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());

    System.out.println("All Cookies: ");

    for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key) );
    }

    }
}