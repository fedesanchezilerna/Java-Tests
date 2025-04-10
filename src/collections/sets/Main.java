package collections.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Client cl1 = new Client("Anna1", "00001", (byte) 10, 2001);
        Client cl2 = new Client("Anna2", "00002", (byte) 20, 2002);
        Client cl3 = new Client("Anna3", "00003", (byte) 30, 2003);
        Client cl4 = new Client("Anna4", "00004", (byte) 40, 2004);
        Client cl5 = new Client("Anna5", "00005", (byte) 50, 2005);
        Client cl6 = new Client("Anna5", "00006", (byte) 50, 2005);

        Set<Client> clients = new HashSet<>();
        clients.add(cl1);
        clients.add(cl2);
        clients.add(cl3);
        clients.add(cl4);
        clients.add(cl5);
        clients.add(cl6);

        Set<Client> clients2 = new LinkedHashSet<>();
        clients2.add(cl1);
        clients2.add(cl2);
        clients2.add(cl3);
        clients2.add(cl4);
        clients2.add(cl5);
        clients2.add(cl6);

        TreeSet<Client> clients3 = new TreeSet<>();
        clients3.add(cl4);
        clients3.add(cl2);
        clients3.add(cl6);
        clients3.add(cl3);
        clients3.add(cl5);
        clients3.add(cl1);

        System.out.println("HashSet");
        clients.forEach(System.out::println);

        System.out.println("\nLinkedSet");
        clients2.forEach(System.out::println);

        System.out.println("\nTreeSet");
        clients3.forEach(System.out::println);

//        System.out.println("\nEl elemento se ha eliminado");
//        clients.remove(cl6);
//        clients.forEach(System.out::println);
//
//        System.out.println(clients.contains(cl3));
//
//        System.out.println(clients.size());
//        System.out.println(clients.isEmpty());
//        clients.clear();
//        System.out.println(clients.contains(cl3));
//        System.out.println(clients.size());
//        System.out.println(clients.isEmpty());
    }
}
