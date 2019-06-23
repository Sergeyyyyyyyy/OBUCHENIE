import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

public class Lekcia23062019 {
    public static void main(String[] a) {
        String[] st = {"abc", "def',", "sss", "sss"};
        Collector<String, ?, TreeSet<String>> infoSet =
                Collector.of(TreeSet::new, TreeSet::add, (left, right) -> {
                    left.addAll(right);
                    return left;
                });
        Arrays.stream(st).collect(infoSet).forEach(System.out::println);
        // String s25 = st17.collect(Collector.joining(","));
        Person p = new Person("Samara", "Volkov");
        List<Person> people = Arrays.asList(new Person("", ""),
                new Person("Samara", "Volkov"),
                new Person("Samara", "Volkov"),
                p, p,
                new Person("Samara", "Popov"),
                new Person("Tomsk", "Romanov"),
                new Person("Ekaterinburg", "Romanov"));

        Map<String, Set<String>> namesByCity = people.stream().collect(
                Collectors.groupingBy(Person::getCity, TreeMap::new,
                        Collectors.mapping(Person::getLastName, toSet())));
        System.out.println(namesByCity);

    }
//    .reduce ()
//    .collect (R,A) R collect (Collector <?super T,A,R> collector )
//    <R> R collect (Supplier <R> supplier , BiConsumer <R,? super T > accumulator, BiConsumer  <R,R> combiner)


/*
Collector <T, A, R>
t1,t2
A  a1 = supplier get ();
accumulator  accept (t1, t2);
R r1 = Linsher apply )(a1)
r1 equals r2

A a2 = supplier get ();
accumulator accept (a2,a1);

A a3 = -//- (a3, a2)
R r2 = fin: sher. apply () combine.apply (a2, a3)

CONCURRENT
IDENTITI_FINISH
UNORDERED

Collector <String, ? , TreeSet <String> > infoSet
Collector.of (TreSet :: , new , TreeSet :: add, (left, right) -> {
    left.addofall (right);
    return left; } );*/

    static class Person {
        String city;
        String lastName;

        public Person(String city, String lastName) {
            this.city = city;
            this.lastName = lastName;
        }

        public String getCity() {
            return city;
        }

        public String getLastName() {
            return lastName;
        }


    }


}


















