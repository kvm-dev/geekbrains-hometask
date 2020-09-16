package ru.geekbrains.oop;

//часть 1
public class employee {
    String fio;
    int age;
    int salary;
    static int uniq=1;

    //часть 2
    employee(String n, int a, int s)
    {
    this.fio = n;
    this.age = a;
    this.salary = s;
    }

    //часть 3, удивлен...после первого метода, все остальные дописала идея...просто Божественно))
    public String getFio()
    {
        return fio;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public int getUniq() {
        return uniq;
    }

    //часть 4 в классе ооп
    //часть 5 там же в ооп

    //вспомогательный метод для 6
    public void setSalary(employee e)
    {
        if(e.age>45) {
            this.salary += 5000;
        }
    }
    //сам метод описанный в 6 части выполнил в ооп
    //8 вообще супер сложное задание))) или на это и рассчет, чтоб мы не мудрили?)
    employee()
    {
     this.uniq++;
    }

}
