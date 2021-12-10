package order;

public class MaoPao {
    public static void main(String[] args) {
        int[] arr = {6,3,5,45,9,14,28,36,4,19,11,13};
        //naturalOrder(arr);
        reversedOrder(arr);
        System.out.println(arr);
    }

    public static void naturalOrder(int[] arr){
        boolean alreadyOrdered = true;
        //每次一轮交换把最大的数放右边
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    alreadyOrdered = false;
                }
            }
            if (alreadyOrdered)
                break;
        }
    }

    public static void reversedOrder(int[] arr){
        for(int i = arr.length-1; i >= 0; i--){
            for (int j = arr.length-1; j > arr.length-1-i; j--){
                if(arr[j] > arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
