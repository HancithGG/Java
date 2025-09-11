public class BubbleS {
    public static void main(String[] args) {
        int numbers[] = {10, 6, 3, 7, 4, 2, 1, 5, 8, 9};
        

        for (int i=0; i < numbers.length-1; i++){
            for (int j=0; j < numbers.length-1-i; j++){
                if(numbers[j] > numbers[j+1]){
                int temp = numbers[j];
                numbers[j] = numbers[j+1];
                numbers[j+1] = temp;
                }
            }
        }

        for(int num:numbers){
            System.out.print(num + "");
        }
    }
}
