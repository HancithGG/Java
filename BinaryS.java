public class BinaryS {

    public static void main (String args[]){
      
      int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
int target = 6;
int high = num.length - 1;
int low = 0;

while (low <= high) { // Use <= instead of <
    int mid = (low + high) / 2;

    if (num[mid] == target) {
        System.out.println("Gotcha!");
        break;
    } else if (num[mid] < target) { // Only change low if mid is less than target
        low = mid + 1;
    } else { // Only change high if mid is greater than target
        high = mid - 1;
    }
}

// If target is not found, print "nah"
if (low > high) {
    System.out.println("Nah");
}

     
    }
}
