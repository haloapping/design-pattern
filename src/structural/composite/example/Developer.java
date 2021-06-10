package structural.composite.example;

public class Developer extends Employee {
    protected String name;
    protected String[] role;
    protected float salary;

    public Developer(String name, float salary) {
        super(name, salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getRole() {
        return role;
    }

    public void setRole(String[] role) {
        this.role = role;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
