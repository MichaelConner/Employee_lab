package staff;

public abstract class Employee {


    private String name;
    private String nino;
    private double salary;

    public Employee(String name, String nino, double salary) {
        this.name = name;
        this.nino = nino;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        if (!newName.equals("")){
            this.name = newName;
        }
    }

    public String getNino() {
        return nino;
    }

    public void setNino(String nino) {
        this.nino = nino;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double raiseSalary(double increase){
        if (increase >= 0){
        this.salary = getSalary() + increase;}
        return this.salary;
    }

    public double payBonus(){
        return getSalary() / 100;
    }

}
