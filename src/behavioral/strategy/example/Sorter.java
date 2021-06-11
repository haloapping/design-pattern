package behavioral.strategy.example;

public class Sorter {
    protected SortStrategy sortStrategy;

    public Sorter(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void sort(String[] dataset) {
        this.sortStrategy.sort(dataset);
    }
}
