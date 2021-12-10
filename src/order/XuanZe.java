package order;

public class XuanZe {
    public static void main(String[] args) {
        int[] arr = {6,3,5,45,9,14,28,36,4,19,11,13};
        naturalOrder(arr);
        System.out.println(arr);
    }

    public static void naturalOrder(int[] arr){

        for(int i = 0; i < arr.length; i++){
            int minIndex = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if (minIndex != i){
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
