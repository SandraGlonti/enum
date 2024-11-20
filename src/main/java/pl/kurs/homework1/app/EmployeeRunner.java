package pl.kurs.homework1.app;

import pl.kurs.homework1.model.Employee;
import pl.kurs.homework1.model.Position;
import pl.kurs.homework1.model.Reward;

public class EmployeeRunner {
    public static void main(String[] args) {

        Employee employee = new Employee("Jan","Nowak", Position.MAJOR);
        employee.addReward(Reward.KASA);
        employee.addReward(Reward.VOUCHER);
        employee.addReward(Reward.KASA);

        System.out.println(employee.toStirng());
    }
}
