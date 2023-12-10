

package levels;

import models.Subject;
import models.Teacher;
import utils.Data;

import java.util.List;
import java.util.stream.Collectors;

public class Level2 {

    public static void main(String[] args) {
        List<Teacher> teachers = Data.employees();

        /* TO DO 1: Retourner le nombre des enseignants dont le nom commence avec s */
        long nbr = teachers.stream().filter(n->n.getName().startsWith("n")).count();/*TO DO 1 */

        /* TO DO 2: Retourner la somme des salaires de tous les enseignants Flutter (hint: mapToInt) */
        long sum = teachers.stream().filter(n->n.getSubject().equals(Subject.FLUTTER)).mapToInt(Teacher::getSalary).sum();/* TO DO 2 */;

        /* TO DO 3: Retourner la moyenne des salaires des enseignants dont le nom commence avec a */
        double average = teachers.stream().filter(n->n.getName().startsWith("a")).mapToInt(Teacher::getSalary).average().orElse(0.0);/* TO DO 3 */;

        /* TO DO 4: Retourner la liste des enseignants dont le nom commence par f */
        List<Teacher> teachers1 = teachers.stream().filter(n->n.getName().startsWith("f")).toList();/* TO DO 4 */;

        /* TO DO 5: Retourner la liste des enseignants dont le nom commence par s */
        List<Teacher> teachers2 = teachers.stream().filter(n->n.getName().startsWith("s")).toList();/* TO DO 5 */;


        /* TO DO 5: Retourner true si il y a au min un enseignants dont le salaire > 100000, false si non */
        boolean test = teachers.stream().anyMatch(t->t.getSalary() >100000)/* TO DO 6 */;

        /* TO DO 6: Afficher le premier enseignant Unity le nom commence avec g avec 2 manières différentes */
        /*First way*/
        teachers.stream().filter(t->t.getSubject().equals(Subject.UNITY)).filter(t->t.getName().startsWith("g")).findFirst()/* TO DO 7 */;
        ;
        /*Second way*/
        teachers.stream().filter(t->t.getSubject().equals(Subject.UNITY)).filter(t->t.getName().startsWith("g")).limit(1)/* TO DO 7 */;

        /* TO DO 7: Afficher le deuxième enseignant dont le nom commence avec s */
        teachers.stream().filter(t->t.getName().startsWith("s")).limit(2).skip(1);/* TO DO 8 */;

    }
}

