import java.util.Arrays;

public class Employee {
private String fio;
private int id;
private double zarplata;
private int otdel;
private static int counter;


    public int getId() { return this.id; }
    public String getFIO() { return this.fio; }
    public int getOtdel() { return this.otdel; }
    public  double getZarplata() { return this.zarplata; }



    public int setOtdel() {
        return this.otdel;
    }
    public  double setZarplata() {
        return this.zarplata;
    }


    public Employee(String fio, int otdel, int zarplata) {
        this.fio = fio;
        this.otdel= otdel;
        this.zarplata = zarplata;
       id = ++counter;
        System.out.println(this.fio);
    }
    public static int sum(Employee[]empl) {
            double sum = 0;
            for (int i = 0; i < empl.length; i++) {
                sum = sum + empl[i].zarplata;
            }

        return (int) sum;
    }

    public static double max (Employee[]empl) {
        double max = -1;
        for (int i =0;i< empl.length;i++){
            if (empl[i].zarplata>max) {max=empl[i].zarplata;}
        }
        return max;}

    public static double min (Employee[]empl) {
        double min =empl[0].zarplata+1;
        for (int i =0;i< empl.length;i++){
            if (empl[i].zarplata<min) {min=empl[i].zarplata;}
        }
        return min;}
    public static double average (Employee[]empl) {
        double average =sum(empl)/empl.length;
        return (int) average;}



    @Override
    public String toString() {
        return "Id: " + id + " Fio: " + fio + " Otdel: " + otdel + " Zarplata: " + zarplata ;
    }

    public static void main(String[] args) {
        Employee[] empl = new Employee[5];
        empl[0] = new Employee("Иванов Иван Иванович", 1,10500);
        empl[1] = new Employee("Петров Петр Петрович", 2,18200);
        empl[2] = new Employee("Дмитриев Дмитрий Дмитриевич", 3,15000);
        empl[3] = new Employee("Петров Петр Петрович", 4,30000);
        empl[4] = new Employee("Александров Александр Александрович", 5,45000);


        for (Employee e: empl) {
            System.out.println(e);

        }
        System.out.println("Общая сумма зарплат "+sum(empl));
        System.out.println("Максимальная зарплата "+max(empl));
        System.out.println("Минимальная зарплата "+min(empl));
        System.out.println("Среднее значение "+average(empl));


    }


}






