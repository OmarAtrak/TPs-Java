package ma.education.tp5.collections;

import java.util.*;

public class TestList {
    public static void main(String[] args) {
        List <Integer> list1 = new ArrayList<Integer>();
        list1.add(12);
        list1.add(23);
        list1.add(23);
        list1.add(12);

        for(int i=0;i<list1.size();i++){
            Integer e = (Integer) list1.get(i);
            System.out.println(" element "+ i +" = "+ e);
        }
        int a = 0;
        for(Integer e :list1){
            a++;
            System.out.println(" element "+ a +" = "+ e);
        }
        Iterator<Integer> iter = list1.iterator();
        while(iter.hasNext()){
            Integer e = iter.next();
            System.out.println("element : "+e);
        }
        list1.forEach(i -> System.out.println(" element "+i));

        List <Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(5);
        list2.add(6);
        list2.add(9);
        list2.add(16);
        list2.stream().map(i->i*i).filter(i->i>37).forEach(i -> System.out.println("la valeur d'element ="+i));

        List <Integer> list3 = new ArrayList<Integer>();
        list3.add(5);
        list3.add(10);
        list3.add(15);
        list3.add(20);
        list3.add(2,10);
        list3.forEach(i->System.out.println(i));

    }
}
