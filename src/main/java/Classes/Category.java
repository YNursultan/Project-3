package Classes;

import java.util.*;

public class Category {
    private HashSet<Sport> sport;
    private Queue<Gadgets> gadgets;
    private LinkedList<Furniture> furniture;
    private ArrayList<Clothes> clothes;

    public Category() {
        this.sport = new HashSet<>();
        this.gadgets = new ArrayDeque<>();
        this.furniture = new LinkedList<>();
        this.clothes = new ArrayList<>();

        Product f1 = new Furniture("Chair",500);
        Product f2 = new Furniture("Table",300);
        Product f3 = new Furniture("Lamp",200);
        Product f4 = new Furniture("Shelf",700);
        Product f5 = new Furniture("Mirror",400);

        Product g1 = new Gadgets("Phone",800);
        Product g2 = new Gadgets("PC",1000);
        Product g3 = new Gadgets("Watch",200);
        Product g4 = new Gadgets("Laptop",600);
        Product g5 = new Gadgets("Earphone",300);

        Product c1 = new Clothes("T-shirt",200);
        Product c2 = new Clothes("Tie",100);
        Product c3 = new Clothes("Socks",100);
        Product c4 = new Clothes("Pants",300);
        Product c5 = new Clothes("Sneakers",500);

        Product s1 = new Sport("Ball",100);
        Product s2 = new Sport("Gloves",300);
        Product s3 = new Sport("Boots",500);
        Product s4 = new Sport("Timer",200);
        Product s5 = new Sport("Helmet",400);

        furniture.add((Furniture) f1);
        furniture.add((Furniture) f2);
        furniture.add((Furniture) f3);
        furniture.add((Furniture) f4);
        furniture.add((Furniture) f5);

        gadgets.add((Gadgets) g1);
        gadgets.add((Gadgets) g2);
        gadgets.add((Gadgets) g3);
        gadgets.add((Gadgets) g4);
        gadgets.add((Gadgets) g5);

        clothes.add((Clothes) c1);
        clothes.add((Clothes) c2);
        clothes.add((Clothes) c3);
        clothes.add((Clothes) c4);
        clothes.add((Clothes) c5);

        sport.add((Sport) s1);
        sport.add((Sport) s2);
        sport.add((Sport) s3);
        sport.add((Sport) s4);
        sport.add((Sport) s5);
    }

    public HashSet<Sport> getSport() {
        return sport;
    }

    public Queue<Gadgets> getGadgets() {
        return gadgets;
    }

    public LinkedList<Furniture> getFurniture() {
        return furniture;
    }

    public ArrayList<Clothes> getClothes() {
        return clothes;
    }
}
