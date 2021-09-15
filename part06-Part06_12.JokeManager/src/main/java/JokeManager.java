
import java.util.Random;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jurek
 */
public class JokeManager {


    private ArrayList<String> jokes;

    public JokeManager() {

        jokes = new ArrayList<>();

    }

    public void addJoke(String joke) {

        
        String jokeToAdd = joke;
        jokes.add(jokeToAdd);

    }

    public String drawJoke() {

        if (jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }

        Random draw = new Random();
        int index = draw.nextInt(jokes.size());
        String output = jokes.get(index);

        return output;
    }

    public void printJokes() {

        for (String joke : jokes) {
            System.out.println(joke);

        }

    }
}
