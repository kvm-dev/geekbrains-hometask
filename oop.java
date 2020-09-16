package ru.geekbrains.oop;

public class oop {

public static void main(String[] args) {

    //часть 4
   employee e1 = new employee("Вася",47,60000);
   // e1.getFio();
    //e1.getAge();
//отладка
 //   System.out.println(e1.getFio());
   // System.out.println(e1.getAge());

//задание 5 и тут почти все делает идея... надо было дз делать в каком-нить простом редакторе, даже названия к массиву подбирает как надо))
    employee[] employees;

    //создаем массив
    employees = new employee[5];

    //создаем недостающие обекты
    employee e2 = new employee("Дима",30,90000);
    employee e3 = new employee("Константин",52,120000);
    employee e4 = new employee("Маша",25,500000);
    employee e5 = new employee("Светлана",47,99000);

    //закидываю все в массив
    employees[0]=e1;
    employees[1]=e2;
    employees[2]=e3;
    employees[3]=e4;
    employees[4]=e5;

    //циклом проверяем возраст и вызываем методы из класса employee где это надо
    for(int i=0; i<employees.length; i++)
    {
    if(employees[i].getAge()>40)
    {
        //не очень понял, что значит информацию...какую именно? мне кажется имелось ввиду всю...а если нет лишние методы убираем
      //  System.out.println(employees[i].getFio());
      //  System.out.println(employees[i].getAge());
      //  System.out.println(employees[i].getSalary());
    }
    }

//проверка 8
    employee e6 = new employee();
    System.out.println(e6.getUniq());
    employee e7 = new employee();
    System.out.println(e7.getUniq());
    }
    //часть 6 не совсем то наверное что надо, не придумал как сделать перегрузку значений у объектов, разобрался только как в массиве это сделать
public void ups(employee[] emps)
{
employee list[] = emps;

for(int i=0;i<emps.length;i++)
{
      emps[i].setSalary(emps[i]);
      //тут наверное надо как-то перегрузить значения зарплат у объектов у кого значения совпадают со значениями объектов в массиве, но что-то не пойму как это сделать, в задании ведь речь шла не о повышени зарплат в массиве объектов а у объектов....

    }
}
//часть 7 среднее арифметическое возраста
public int saage(employee[] salist)
{
    int sa=0;
    employee listsa[] = salist;
    for (int i=0;i<listsa.length;i++){
sa+=listsa[i].getAge()/listsa.length;
    }
return sa;
}

    //среднее арифметическое зарплаты
    public int sasalary(employee[] salist)
    {
        int sa=0;
        employee listsa[] = salist;
        for (int i=0;i<listsa.length;i++){
            sa+=listsa[i].getSalary()/listsa.length;
        }
        return sa;
    }

}

