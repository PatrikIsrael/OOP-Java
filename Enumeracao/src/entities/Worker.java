package entities;

import enties.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel workerLevel;
    private Double baseSalary;
    private Department department;
    private List<HourContract> hourContracts = new ArrayList<>();

    public Worker() {
    }

    public Worker(String name, WorkerLevel workerLevel, Double baseSalary, Department department) {
        this.name = name;
        this.workerLevel = workerLevel;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public WorkerLevel getWorkerLevel() {
        return workerLevel;
    }

    public void setWorkerLevel(WorkerLevel workerLevel) {
        this.workerLevel = workerLevel;
    }

    public List<HourContract> getHourContracts() {
        return hourContracts;
    }

    public void addContract(HourContract contract){
        hourContracts.add(contract);
    }

    public void removeContract(HourContract contract){
        hourContracts.remove(contract);
    }

    public double income (int mount, int year){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract c : hourContracts){
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_mouth = 1+ cal.get(Calendar.MONTH);
            if (year == c_year && mount == c_mouth){
                sum += c.totalValue();
            }
        }
        return sum;
    }

}
