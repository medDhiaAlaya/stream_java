package levels;

import models.Subject;
import models.Teacher;
import utils.Data;

import java.util.Comparator;
import java.util.List;

public class Level1 {

    public static void main(String[] args) {
        List<Teacher> employees = Data.employees();

        /*
         * TO DO 1: Afficher tous les enseignants
         */
        System.out.println("to do 1 : ");
        employees.stream().forEach(System.out::println);

        /*
         * TO DO 2: Afficher les enseignants dont le nom commence par la lettre n
         */
        System.out.println("to do 2 : ");

        employees.stream().filter(s->s.getName().startsWith("n")).forEach(System.out::println);

        /*
         * TO DO 3: Afficher les enseignants dont le nom commence par la lettre n et le salaire > 100000
         */
        System.out.println("to do 3 : ");

        employees.stream().filter(n->n.getName().startsWith("n")).filter(n->n.getSalary()>100000).forEach(System.out::println);

        /*
         * TO DO 4: Afficher les enseignants JAVA triés par salaire (éliminer les redondances)
         */
        System.out.println("to do 4 : ");

        employees.stream().filter(n->n.getSubject().equals(Subject.JAVA)).sorted(Comparator.comparing(Teacher::getSalary)).forEach(System.out::println);
        /*
         * TO DO 5: Afficher les noms des enseignants dont le salaire > 60000 avec 2 manières différentes
         */
        /* First Way */
        System.out.println("to do 5 methode 1 : ");

        employees.stream().filter(n->n.getSalary()>6000).forEach(t->System.out.println(t.getName()));
        /* Second Way */
        System.out.println("to do 5 methode 2 : ");

        employees.stream().filter(n->n.getSalary()>6000).map(Teacher::getName).forEach(System.out::println);

        /*
         * TO DO 6:  Ajouter 200 Dt pour les enseignants dont le nom commence par m et afficher celui qui a le salaire le plus élevé
         */
        System.out.println("to do 6 : ");

        employees.stream().filter(n->n.getName().startsWith("m"))
                .peek(t->t.setSalary(t.getSalary()+200))
                .max(Comparator.comparingInt(Teacher::getSalary))
                .orElse(null);

    }
}
