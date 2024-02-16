package Ruchita;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.println("Hello and welcome!");
        //Ruchita.OurGenericList<Integer> list = new Ruchita.OurGenericList<>();
        List<Integer> alist = new ArrayList<>();
        alist.add(1);
        alist.add(2);
        alist.add(3);
        alist.add(2);

        Integer[] arr = alist.toArray(new Integer[0]);
//        for(int x: arr)
//            System.out.print(x + ",");
        // <1 2 3 2>
//        System.out.println(alist.indexOf(2));
//        System.out.println(alist.lastIndexOf(2));

        List<Integer> alist3 = alist.subList(1,4); // shallow copy, be careful!
        alist3.set(0, 100);
//        System.out.println(alist3);
//        System.out.println(alist);

//        System.out.println("element that got replaced is " + alist.set(2, 100));

        // Integer is a wrapper class, generic/ reference type
        // int is primitive type
        List<Integer> alist2 = new ArrayList<>(alist);
        alist2.add(4);
        alist2.addAll(alist);

//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext())
//            System.out.println(iterator.next());

        // unboxing where reference type you are storing in primitive type
//        for(int x: alist)
//            System.out.println(x);

//        System.out.println(alist);
//        System.out.println(alist2);

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
        }

//        LinkedList<Integer> lklist = new LinkedList<>();
//        lklist.add(1);
//        lklist.add(2);
//        lklist.add(3);
//
//        ListIterator<Integer> iterator = lklist.listIterator();
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.previous()); // first moves & then returns the element
// next - return item[index++], prev - return item[--index];

        // for queue(FIFO) use linkedlist (concrete class), queue is an interface only
//        Queue<Integer> q = new LinkedList<>();
//        q.offer(1);
//        q.offer(2);
//
//        System.out.println(q.peek());
//
//        System.out.println(q.poll());
//
//        System.out.println(q.peek());
//
//        System.out.println(q.isEmpty());
//
//        Stack<Integer> stack = new Stack<>();
//
//        stack.push(1);
//        stack.push(2);
//
//        while (!stack.isEmpty())
//        {
//            System.out.println(stack.peek());
//            stack.pop();
//        }
//        // arrayDeque to use for double ended queue, 0-1 BFS
        Deque<Integer> dq = new ArrayDeque<>();
//        dq.offerFirst(1);
//        dq.offerFirst(2);
//        System.out.println(dq); // 2 , 1 -> like stack
//
//        dq.peekFirst();
//        dq.pollFirst();
//        System.out.println(dq);
//
//        dq.offerLast(3);
//        dq.offerLast(4);
//
//        while (!dq.isEmpty())
//        {
//            System.out.println(dq.peekFirst());
//            System.out.println(dq.pollFirst());
//        }
//
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        pq.offer(1);
//        pq.offer(2);
//        pq.offer(0);
//        pq.offer(100);
//
//        // top 2 elements
//        List<Integer> bottom2 = new ArrayList<>();
//        int index = 0;
//        while(!pq.isEmpty())
//        {
//            if(index == 2)
//            {
//                break;
//            }
//
//            bottom2.add(pq.poll());
//            index++;
//        }
//
//        System.out.println(bottom2);

        // what if we want top2 integers?

        //PriorityQueue<Integer> pq = new PriorityQueue<>(new MyCustomComparator());

        // use lambda to pass the compare function
//        PriorityQueue<Integer> pq = new PriorityQueue<>( (a, b) -> b - a );
//        pq.offer(1);
//        pq.offer(2);
//        pq.offer(0);
//        pq.offer(100);
//
//        // top 2 elements
//        List<Integer> top2 = new ArrayList<>();
//        int index = 0;
//        while(!pq.isEmpty())
//        {
//            if(index == 2)
//            {
//                break;
//            }
//
//            top2.add(pq.poll());
//            index++;
//        }
//
//        System.out.println(top2);

        // get me the top 3 students according to their maths marks
//
        List<StudentMarks> studentMarks = new ArrayList<>();
        studentMarks.add(new StudentMarks(70, 80));
        studentMarks.add(new StudentMarks(38, 10));
        studentMarks.add(new StudentMarks(100, 38));
        studentMarks.add(new StudentMarks(40, 88));
        studentMarks.add(new StudentMarks(97, 19));

        List<StudentMarks> top3 = new ArrayList<>();
        //PriorityQueue<StudentMarks> studentsPq = new PriorityQueue<>(studentMarks);
        PriorityQueue<StudentMarks> studentsPq = new PriorityQueue<StudentMarks>( (a, b) ->
        {
//            System.out.println("Comparator's compare() is called ");
            return b.getPhysics() - a.getPhysics();
        });

        for(StudentMarks sm: studentMarks)
        {
            studentsPq.add(sm);
        }

        int index = 0;
        while(!studentsPq.isEmpty())
        {
            if(index == 3)
            {
                break;
            }

            top3.add(studentsPq.poll());
            index++;
        }

//        System.out.println(top3);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(1);
        set.add(0);
//        System.out.println(set.contains(1));
//        System.out.println(set.contains(200));

//        for(int x: set)
//            System.out.println(x);
        //set.remove(2);

//        Set<Integer> set2 = new HashSet<>(alist);
//        System.out.println(set);
//        System.out.println(set2);
//
//
//        set.retainAll(set2); // intersection
//        System.out.println("After retaining");
//
//        System.out.println(set);
//        System.out.println(set2);
//
//        set.removeAll(set2);
//        System.out.println(set);
//        set.addAll(set2);
//        System.out.println(set);


//        set.clear(); // removes all

        /* If you want to retain the order of insertion, use linkedHashSet, it used linked list internally */
//        Set<Integer> set3 = new LinkedHashSet<>();
//        set3.add(1);
//        set3.add(2);
//        set3.add(4);
//        set3.add(1);
//        set3.add(0);
//
//        for(int x: set3)
//            System.out.println(x);
        Set<StudentMarks> set3 = new HashSet<>(studentMarks);
//        System.out.println(set3.contains(new StudentMarks(70, 80)));
//        for(StudentMarks x: set3)
//        {
//            System.out.println(x + ",");
//        }

        // TreeSet
//        Set<StudentMarks> treeSet = new TreeSet<>((s1, s2) -> s2.getPhysics() - s1.getPhysics());
//        treeSet.add(new StudentMarks(70, 80));
//        treeSet.add(new StudentMarks(38, 10));
//        treeSet.add(new StudentMarks(100, 38));
//        treeSet.add(new StudentMarks(40, 88));
//        treeSet.add(new StudentMarks(97, 19));
//
//        for(StudentMarks x: treeSet)
//        {
//            System.out.println(x);
//        }

        NavigableSet<Integer> set5 = new TreeSet<>();
        set5.add(8);
        set5.add(3);
        set5.add(1);
        set5.add(0);

//        for(int x: set5)
//        {
//            System.out.println(x + ",");
//        }
//
//        System.out.println(set5.floor(2));
//        System.out.println(set5.lower(1));

        Map<String, Integer> map = new HashMap<>();
        map.put("Ruchita", 1);
        map.put("Riddhi", 2);
        map.put("Alan", 1);
        map.remove("Riddhi");

//        System.out.println(map.get("Ruchita"));
//        System.out.println(map.get("BUYJgb"));

        // use getOrDefault instead to avoid null point exception, when u try to access some property of returned object from map
//        System.out.println(map.getOrDefault("Dhgnz", 0));
//        System.out.println(map.getOrDefault("Riddhi", 0));
//        System.out.println(map.containsKey("Ruchita"));

        // Graph adjacency list
        /*
        * 1 - 2
        * 3 - 5
        * 1 - 3
        *
        * */
        Map<Integer, List<Integer>> adj = new HashMap<>();
        adj.computeIfAbsent(1, k -> new ArrayList<Integer>()).add(2);

        // traverse map
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//        for(Map.Entry<String, Integer> entry: entrySet)
//            System.out.println(entry.getKey() + "," + entry.getValue());
//
//        Set<String> keySets = map.keySet();
//        for(String key: keySets)
//            System.out.println(key + "," + map.get(key));

        NavigableMap<Integer, String> tmap = new TreeMap<>( (a, b) -> b - a );
        // natually sorted in natural order via comparable;s method , else pass comparator methods

        tmap.put(5, "Srinanti");
        tmap.put(1, "Ruchita");
        tmap.put(2, "Papri");
        tmap.put(3, "Pousali");
        tmap.put(4, "Srinika");

//        System.out.println(tmap);

//        Set<Map.Entry<Integer, String>> entrySet1 = tmap.entrySet();
//        for(Map.Entry<Integer, String> entry: entrySet1)
//            System.out.println(entry.getKey() + "," + entry.getValue());

//         System.out.println(tmap.pollFirstEntry());
//        System.out.println(tmap.ceilingKey(2));
//        System.out.println(tmap.ceilingEntry(3).getValue());

        // Sorting
        // Integer is object wrapper class, not primitive type like int
        Integer arr2[] = new Integer[] {1, 2, 3, 0, 1, 7};
        Arrays.sort(arr2);
        for(int i: arr2)
        {
            System.out.println(i);
        }

        List<Integer> arr3 = Arrays.asList(arr2);
        List<Integer> arr4 = Arrays.asList(1, 2, 3, 4);
        System.out.println(arr4);
        Collections.sort(arr3, Collections.reverseOrder());
        for(int i: arr2)
        {
            System.out.println(i);
        }

        System.out.println(Collections.binarySearch(arr4, 3));
    }
}