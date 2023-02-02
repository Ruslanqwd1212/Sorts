public class Selection {
    public static void selectionSort(int[] sortArr) {
        for (int i = 0; i < sortArr.length; i++) {
            int pos = i;
            int min = sortArr[i];

            for (int j = i + 1; j < sortArr.length; j++) {
                if (sortArr[j] < min) {

                    pos = j;
                    min = sortArr[j];
                }
            }
            sortArr[pos] = sortArr[i];

            sortArr[i] = min;
        }
    }

    public static void main(String args[]) {
        int[] sortArr = {5435124, 87468464, 878468, 8784653, 655852, -4455451};
        selectionSort(sortArr);
        for(int i = 0; i < sortArr.length; i++){
            System.out.print(sortArr[i] + "\n");
        }
    }

}
