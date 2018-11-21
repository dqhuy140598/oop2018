package week11;

import java.util.ArrayList;

public class Task2 {
    public <T extends Comparable<T>> T MaxElement(ArrayList<T> Arr){
        T Max = Arr.get(0);
        for(int i=0;i<Arr.size();i++){
            if(Arr.get(i).compareTo(Max)>0){
                Max = Arr.get(i);
            }
        }
        return Max;
    }
    public static void main(String Args[]){
        ArrayList<Integer> Arr = new ArrayList<Integer>();
        Arr.add(4);
        Arr.add(6);
        Arr.add(7);
        Task2 task2 = new Task2();
        System.out.println(task2.MaxElement(Arr));
    }

}
