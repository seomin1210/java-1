public class ReturnArray {
    static int[] makeArray() {
        int temp[] = new int[4];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = i;
        }
        return temp;
    }

    public static void main(String[] args) {
        int array[];
        array = makeArray();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    
}
