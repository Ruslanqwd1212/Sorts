public class Main {
    public static void main(String[] args) {
        int[] sortArr = {19, 3, 600, 12048, 12345, 14214};
        Bubble bubble = new Bubble();
        bubble.bubbleSort(sortArr);
        int i = 0;
        while (i <= 5) {
                System.out.println(sortArr[i]);
                i++;
        }
    }
}
