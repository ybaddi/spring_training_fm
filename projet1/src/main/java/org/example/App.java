package org.example;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        Personn p = new Personn("baddi", "youssef", 26);
        p.iMiseEnForm.afficherDetails();
        System.out.println(p.iMiseEnForm);
        System.out.println(p.iMiseEnForm_2);
        p.iMiseEnForm.afficherNomComplet();
        p.iCalcul.somme(3,4);
        System.out.println(p.iMiseEnForm.getClass().getSuperclass());

        int i=2;int j=4;
        ICalcule iCalcul = ( x, y) -> {
            int k =i+1;
            return x*k+y*j;
                    };
        System.out.println(iCalcul.somme(3,5));

//         function<T,R> ==> apply
        Function<Personn, String> personToString = (Personn p1) -> p1.getNom() + " " + p1.getPrenom();

        String nomcomplet = personToString.apply(p);
        System.out.println(nomcomplet);

        //         function<T,R> ==> apply
        // BiFunction<T1,T2,R>
        //         function<T,R> ==> apply
        // Binary<T>
        BinaryOperator<Integer> sommeOperator = (x,y) -> x+y;
        System.out.println(sommeOperator.apply(3,4));

        // Consumer <T> ===> accept

        Consumer<Personn> ageIncrement = p2 -> p2.setAge(p2.getAge()+1);
        ageIncrement.accept(p);
        System.out.println(p);

        // Predicate<T>
//        BiPredicate
//                intFunction

        // Supplier<T> ===> get
        Supplier<Double> d1 = ()-> Math.random() * 100;

        System.out.println(d1.get());

//        //?///////////////////////////////
        List<Integer> liste = new ArrayList<>(Arrays.asList(2,5,6,7,9));

       liste.forEach(item -> System.out.println(item));
        liste.forEach(System.out::println);
        liste.removeIf(item -> item>6);
        liste.forEach(System.out::println);
        liste.replaceAll(item -> item+2);
        liste.forEach(System.out::println);


        Map<Integer, String> map1 = new HashMap<>();
        map1.put(7, "CR7");
        map1.put(10, "messi");
        map1.put(1, " bono");
        map1.forEach((k,v) -> System.out.println(k+ " " + v));


        // Stream

        Stream stream = Stream.of(2,7,8,9);
        int[] tab = {2,7,8,9};
        Stream stream1 = Stream.of(tab);

        List<Integer> liste1 = Arrays.asList(2,5,6,7,9);
        Stream stream2 = liste1.parallelStream();

        stream2.forEach(System.out::println);

        System.out.println("+++++++");
        stream.map(elt -> elt.toString()).collect(Collectors.toList());

    }
}
