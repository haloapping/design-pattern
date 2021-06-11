package behavioral.strategy.example;

public class Main {
    public static void main(String[] args) {
        String[] dataset = new String[]{"1", "2", "3", "4", "5"};

        Sorter bubbleSorter = new Sorter(new BubbleSort());
        bubbleSorter.sort(dataset);

        Sorter quickSorter = new Sorter(new QuickSort());
        quickSorter.sort(dataset);
    }
}
