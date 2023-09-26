// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.Map.Entry;

class Mycom implements Comparator<Integer>{
    public int compare(Integer o1,Integer o2){
        if(o1<o2) return 1;
        if(o1>o2) return -1;
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        //implements only list
        arrayList();
        //implements list + deque
        linkedList();
        //implements deque
        arrayDeque();
        //implements PriorityQueue
        priorityqueue();
        //hashset
        hashSet();
        //treeset
        treeSet();
        //treemap
        treeMap();
        //hashmap
        hashMap();
        //linkedhashmap
        linkedHashMap();
        //linkedHashset
        linkedHashSet();
    }
    public static void arrayList(){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(4);

        ArrayList<Integer> al2=new ArrayList<>(List.of(1,2,3));
        al.addAll(al2);
        System.out.println("using for");
        for(int i=0; i<al.size();i++){
            System.out.print(al.get(i));
        }
        System.out.println("\nusing for each");
        for(var x:al){
            System.out.print(x);
        }
        System.out.println("\nusing iterator");
        Iterator<Integer> it=al.iterator();
        for(;it.hasNext();){
            System.out.print(it.next());
        }
        System.out.println("\nusing listIterators -> used as double linked list");
        ListIterator<Integer> lit=al.listIterator();
        for(;lit.hasNext();){
            System.out.print(lit.next());
        }
        System.out.println("\ncoming back using listIterators: ");
        for(;lit.hasPrevious();){
            System.out.print(lit.previous());
        }

        System.out.println("\nusing lamda functions");
        al.forEach(x-> System.out.print(x));
    }
    public static void linkedList(){
        System.out.println("\n\n\nLinkedlist:");
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(4);
        ArrayList<Integer> al2=new ArrayList<>(List.of(1,2,3));
        ll.addAll(al2);
        ll.addFirst(7);
        ll.addLast(8);
        System.out.println("using for");
        for(int i=0; i<ll.size();i++){
            System.out.print(ll.get(i));
        }
        System.out.println("\nusing for each");
        for(var x:ll){
            System.out.print(x);
        }
        System.out.println("\nusing iterator");
        Iterator<Integer> it=ll.iterator();
        for(;it.hasNext();){
            System.out.print(it.next());
        }
        System.out.println("\nusing listIterators -> used as double linked list");
        ListIterator<Integer> lit=ll.listIterator();
        for(;lit.hasNext();){
            System.out.print(lit.next());
        }
        System.out.println("\ncoming back using listIterators: ");
        for(;lit.hasPrevious();){
            System.out.print(lit.previous());
        }
        Iterator<Integer> dit=ll.descendingIterator();
        System.out.println("\ncoming back using desendingIterators: ");
        for(;dit.hasNext();){
            System.out.print(dit.next());
        }
        System.out.println("\nusing lamda functions");
        ll.forEach(x-> System.out.print(x));
    }

    static void arrayDeque(){
        ArrayDeque<Integer> dq =new ArrayDeque<>();
        System.out.println("\n\n\ndeque");
        dq.addFirst(1);
        dq.addLast(2);
        dq.offerFirst(3);
        dq.offerLast(4);
        System.out.println("using iteraotr");
        Iterator<Integer> dit=dq.iterator();
        for(;dit.hasNext();){
            System.out.print(dit.next());
        }

        System.out.print("\nfirst:"+dq.peekFirst());
        System.out.print("\nremove last:"+dq.pollLast());
        Iterator<Integer> ddit=dq.descendingIterator();
        System.out.println("\ncoming back using desendingIterators: ");
        for(;ddit.hasNext();){
            System.out.print(ddit.next());
        }
        dq.forEach(x-> System.out.print(x));
        System.out.println("\nremove using pop: "+dq.pop());
    }
    static void priorityqueue(){
        System.out.println("\n\n\npriority queue: ");
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        pq.add(4);
        pq.add(2);
        pq.offer(6);
        pq.add(1);
        pq.add(3);
        pq.forEach(x-> System.out.print(x));
        pq.poll();
        System.out.println();
        pq.forEach(x-> System.out.print(x));
        System.out.println("\nchanging the priority to max");
        PriorityQueue<Integer> pqr=new PriorityQueue<>(new Mycom());
        pqr.add(4);
        pqr.add(2);
        pqr.offer(6);
        pqr.add(1);
        pqr.add(3);
        pqr.forEach(x-> System.out.print(x));
        pqr.poll();
        System.out.println();
        pqr.forEach(x-> System.out.print(x));


    }
    static void hashSet(){
        System.out.println("\n\n\nhashset:");
        HashSet<Integer> hs=new HashSet<>();
        hs.add(5);
        hs.add(4);
        hs.add(3);
        hs.add(6);
        hs.add(9);
        Iterator<Integer> it=hs.iterator();
        for(;it.hasNext();){
            System.out.print(it.next());
        }
        System.out.println("\n"+hs);
    }
    static void treeSet(){
        System.out.println("\n\n\ntreeset:");
        TreeSet<Integer> ts=new TreeSet<>(List.of(2,4,1,3,5));
        ts.add(7);
        System.out.println(ts);
        System.out.println(ts.ceiling(6));
        System.out.println(ts.floor(6));
    }
    static void treeMap(){
        System.out.println("\n\n\ntreemap:");
        TreeMap<Integer,String> tm=new TreeMap<>();
        tm.put(2,"Niteesh");
        tm.put(1,"boddapu");
        tm.put(0,"name: ");
        System.out.println(tm);
        Entry<Integer,String> e=tm.ceilingEntry(2);
        System.out.println(e.getValue());
        tm.put(0,"satya ");
        System.out.println(tm);
        System.out.println(tm.firstEntry());
        System.out.println(tm.subMap(1,2));

    }
    public static void hashMap(){
        System.out.println("\n\n\nhashmap:");
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"Niteesh");
        hm.put(0,"boddapu");
        hm.put(3,"sai");
        hm.put(2,"satya");
        System.out.println(hm);
        
        //hm.forEach((k,v)-> System.out.println(k+" "+v));
        for(Map.Entry<Integer, String>entry: hm.entrySet())
        {
        //getting keys and values using method
            System.out.println(entry.getKey() + " = " +entry.getValue());
        }
    }

    public static void linkedHashMap(){
        System.out.println("\n\n\nlinkedHashMap:");
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>(5,0.75f,true);
        lhm.put(1,"A");
        lhm.put(2,"B");
        lhm.put(3,"E");
        lhm.put(4,"D");
        System.out.println(lhm);
        System.out.println(lhm.get(3));
        System.out.println(lhm);

    }

    public static void linkedHashSet(){
        System.out.println("\n\n\nlinkedHashSet:");
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("A");
        lhs.add("C");
        lhs.add("B");
        lhs.add("E");
        lhs.add("D");

        lhs.forEach(x-> System.out.println(x));
    }
}
