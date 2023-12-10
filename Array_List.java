import java.util.ArrayList;
public class Array_List{
 public static void main(String args[]){
    ArrayList<Integer> list = new ArrayList<>();
     list.add(1);
     list.add(2);
     list.add(3);
     list.add(4);

    System.out.println(list);

    list.add(5);
    System.out.println(list);

   list.add(1,50);
    
    System.out.println(list);

List<Integer> newList = new ArrayList<>();
    newList.add(150);
    newList.add(160);

   list.addAll(new List);
   System.out.println(list);
 }
}
