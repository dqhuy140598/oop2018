package week11;

public class Task1 {
    public <T extends Comparable<T>> void Sort(T[] Arr){
        for(int i=0;i<Arr.length-1;i++){
            for(int j=i+1;j<Arr.length;j++){
                if(Arr[i].compareTo(Arr[j])>0){
                    T temp = Arr[j];
                    Arr[j]= Arr[i];
                    Arr[i] = temp;
                }
            }
        }
    }
    public <T>void printArr(T[] Arr){
        for(int i=0;i<Arr.length;i++){
            System.out.print(Arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Integer Arr[] = {4,5,6,1,2,3};
        Double Brr[] = {1.3,1.5,6.7,8.9,11.3};
        Task1 task1 = new Task1();
        task1.<Integer>Sort(Arr);
        task1.<Integer>printArr(Arr);
    }
}
