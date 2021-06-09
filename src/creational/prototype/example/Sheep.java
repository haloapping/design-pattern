package creational.prototype.example;

public class Sheep implements Cloneable {
    protected String name;
    protected String category;

    public Sheep(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
