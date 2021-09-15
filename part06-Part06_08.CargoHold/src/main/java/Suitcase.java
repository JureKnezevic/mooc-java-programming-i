/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jurek
 */
import java.util.ArrayList;

public class Suitcase {

    private int maxWeight;
    private ArrayList<Item> Items = new ArrayList<>();
    private int weight = 0;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        int i = 0;
        if (Items.isEmpty()) {
            if (this.weight + item.getWeight() <= this.maxWeight) {
                Items.add(item);
                this.weight = this.weight + Items.get(i).getWeight();
            }
        } else if (this.weight + item.getWeight() <= this.maxWeight) {

            Items.add(item);
            this.weight = this.weight + item.getWeight();
        }
        i++;
    }

    public void printItems() {
        int i = 0;
        while (i < Items.size()) {
            System.out.print(Items.get(i) + "\n");
            i++;
        }
    }

    public int totalWeight() {

        return weight;
    }

    public Item heaviestItem() {
        Item heaviestItem;
        int i = 0;

        if (Items.size() == 0) {
            return null;
        } else {
            heaviestItem = Items.get(0);
            for (Item wgt : Items) {
                if (heaviestItem.getWeight() < wgt.getWeight()) {
                    heaviestItem = Items.get(i);
                }
                i++;
            }
        }
        return heaviestItem;
    }

    @Override
    public String toString() {

        if (Items.isEmpty()) {
            String output = "no items (0 kg)";
            return output;
        }

        if (Items.size() == 1) {
            String output = Items.size() + " item (" + this.weight + " kg)";
            return output;
        }
        String output = Items.size() + " items (" + this.weight + " kg)";
        return output;
    }
}
