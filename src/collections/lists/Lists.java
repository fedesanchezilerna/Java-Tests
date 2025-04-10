package collections.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Anna",  "Sort",  93456567, (byte)25);
        Employee emp2 = new Employee("Lidia", "Llach", 93456598, (byte)20);
        Employee emp3 = new Employee("Lluis", "Puig",  97777567, (byte)21);
        Employee emp4 = new Employee("Marta", "LLuna", 93456567, (byte)25);
        Employee emp5 = new Employee("Pere",  "Comas", 93456567, (byte)25);

        // Crear una lista VACIA
        List<Employee> listE = new ArrayList<>();
        listE.add(emp1);
        listE.add(emp2);
        listE.add(emp3);
        listE.add(emp4);
        listE.add(emp5);
//        listE.add(3, emp1);
//        listE.add(6, emp1);

//        for (int i = 0; i < listE.size(); i++) {
//            System.out.println(listE.get(i));
//        }
//
//        System.out.println("\nAcceso a posición aleatoria");
//        System.out.println(listE.get(3));
//
//        listE.remove(0); // Can be replaced with .removeFirst();
//
//        System.out.println("\nLista con primer elemento eliminado");
//        for (Employee employee : listE) {
//            System.out.println(employee);
//        }
//
//        List<Employee> toRemove = new ArrayList<>();
//        toRemove.add(emp2);
//        toRemove.add(emp3);
//
//        listE.removeAll(toRemove);
//
//        System.out.println("\nTo Remove employee list");
//        for (Employee employee : toRemove) {
//            System.out.println(employee);
//        }
//
//        System.out.println("\nNew employee list");
//        for (Employee employee : listE) {
//            System.out.println(employee);
//        }
//
//        System.out.println();
//
//        System.out.println(listE.isEmpty());
//        System.out.println(listE.size());
//        listE.clear();
//        System.out.println(listE.isEmpty());
//        System.out.println(listE.contains(emp5));

        List<String> listS = new ArrayList<>();
        listS.add("Bugs Bunny");
        listS.add("Homer Simpson");
        listS.add("SpongeBob SquarePants");
        listS.add("Bugs Bunny");

        Collections.sort(listS);

        listS.forEach(System.out::println);
    }
}
