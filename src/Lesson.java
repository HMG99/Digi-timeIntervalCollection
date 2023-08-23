import java.util.*;

public class Lesson {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        ArrayList<Integer> array = new ArrayList<>();
        Random random = new Random();

        for(int i = 0; i < 500_000; i++) {
            int numb = random.nextInt(100);
            list.add(numb);
            array.add(numb);
        }

        System.out.println("---------start--list----------");
        double linkedListTimeInterval = timeInterval(list);
        System.out.println(linkedListTimeInterval);
        System.out.println("-----------end--list------------");

        System.out.println("---------start---array-------");
        double arrayListTimeInterval = timeInterval(array);
        System.out.println(arrayListTimeInterval);
        System.out.println("-----------end---array---------");


    }

    private static double timeInterval(Collection<Integer> col) {
        Iterator<Integer> iterator = col.iterator();
        long start = System.currentTimeMillis();
        while(iterator.hasNext()) {
            int listElement = iterator.next();
            if(listElement % 2 == 0) {
                iterator.remove();
            }
        }
        long end = System.currentTimeMillis();
        return (end - start) / 1000.0;
    }



}