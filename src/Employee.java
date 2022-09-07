import java.util.Arrays;

public class Employee {
    private String fullName;
    private int id;
    private double salary;
    private int department;
    private static int counter;


    public int getId() {
        return this.id;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }


    public int setDepartment() {
        return this.department;
    }

    public double setZarplata() {
        return this.salary;
    }


    public Employee(String Fullname, int department, int salary) {
        this.fullName = Fullname;
        this.department = department;
        this.salary = salary;
        id = ++counter;
        System.out.println(this.fullName);
    }

    public static int sum(Employee[] empl) {
       double sum = 0;
       for (int i = 0; i < empl.length; i++) {
       sum = sum + empl[i].salary;}
       return (int) sum;}

    public static double max(Employee[] empl) {
       double max = -1;
       for (int i = 0; i < empl.length; i++) {
       if (empl[i].salary > max) {
       max = empl[i].salary;}
       }
       return max;}

    public static double min(Employee[] empl) {
        double min = empl[0].salary + 1;
        for (int i = 0; i < empl.length; i++) {
        if (empl[i].salary < min) {
        min = empl[i].salary;}
        }
        return min;}

    public static double average(Employee[] empl) {
        double average = sum(empl) / empl.length;
        return (int) average;
    }


    @Override
    public String toString() {
        return "Id: " + id + " Fio: " + fullName + " Otdel: " + department + " Zarplata: " + salary;
    }

    public static void main(String[] args) {
        Employee[] empl = new Employee[5];
        empl[0] = new Employee("Иванов Иван Иванович", 1, 10500);
        empl[1] = new Employee("Петров Петр Петрович", 2, 18200);
        empl[2] = new Employee("Дмитриев Дмитрий Дмитриевич", 3, 15000);
        empl[3] = new Employee("Петров Петр Петрович", 4, 30000);
        empl[4] = new Employee("Александров Александр Александрович", 5, 50000);


        for (Employee e : empl) {
            System.out.println(e);

        }
        System.out.println("Общая сумма зарплат " + sum(empl));
        System.out.println("Максимальная зарплата " + max(empl));
        System.out.println("Минимальная зарплата " + min(empl));
        System.out.println("Среднее значение " + average(empl));


    }


}






