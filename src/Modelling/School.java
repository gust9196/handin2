import Modelling.Staff;

import java.util.ArrayList;

public class School implements Staff {

    private String employeeName;
    private int employeeID;
    private String employeeDepartment;
    private Double salary;
    private ArrayList<String> features;
    public String getName() {

        return null;


    }

    @Override
        public String getname() {
        return null;
    }

    public double getPrice() {

        return 1.1;

    }

    public ArrayList<String> getFeatures() {
        return null;
    }


    @Override
    public String toString() {
        return "School{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeID=" + employeeID +
                ", employeeDepartment='" + employeeDepartment + '\'' +
                ", salary=" + salary +
                ", features=" + features +
                '}';
    }

    public employee(String employeeName, int employeeID, String employeeDepartment, double salary, ArrayList<String> features) {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
        this.employeeDepartment = employeeDepartment;
        this.salary = salary;
        this.features = features;

    }

}

