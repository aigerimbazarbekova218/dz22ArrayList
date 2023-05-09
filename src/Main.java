import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer>arrayList1=new ArrayList<>();
        ArrayList<Integer>arrayList2=new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            arrayList.add(random.nextInt(100));
        }
              for (int a : arrayList){
                  if (a % 2 == 0){
                    arrayList1.add(a);
                  }else{
                      arrayList2.add(a);
                  }
              }
        System.out.println(arrayList);
        System.out.println("Жуп сандар:"+ arrayList1);
        System.out.println("Так сандар:"+ arrayList2);



    }
}