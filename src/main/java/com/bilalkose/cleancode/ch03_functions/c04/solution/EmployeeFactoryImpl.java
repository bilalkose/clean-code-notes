package main.java.com.bilalkose.cleancode.ch03_functions.c04.solution;

public class EmployeeFactoryImpl implements EmployeeFactory {
    public Employee makeEmployee(EmployeeRecord r) {
        switch (r) {
//            case COMMISSIONED:
//                return new HourlyEmployee(r) ;
            case HOURLY:
                return new HourlyEmployee(r); //Abstract class tan türeyen metodu return ettik.
//            case SALARIED:
//                return new SalariedEmploye(r);
            default:
                return null;
        }
    }


}
