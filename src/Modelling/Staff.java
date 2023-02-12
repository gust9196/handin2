package Modelling;

import java.util.ArrayList;

public interface Staff {
    String employeeName();

    int employeeID();

    String employeeDepartment();

    Double salary();
    ArrayList<String> getFeatures();
}
