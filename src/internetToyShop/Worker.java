package internetToyShop;

public abstract class Worker implements IDelivery {
    protected String name;
    protected String surname;
    protected float salary;
    protected int category;
    protected String address;

    public Worker() {
        this.name = "Юлия";
        this.surname = "Тимчук";
        this.salary = 300;
        this.category = 2;
        this.address = address("Казимировская");
    }

    public Worker(Worker obj) {
        this.name = obj.name;
        this.surname = obj.surname;
        this.salary = obj.salary;
        this.category = obj.category;
        this.address = obj.address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }


    abstract protected void generateSalary();

    @Override
    public String address(String a) {
        String addr = new String();
        addr = a;
        
        return addr;

    }

    @Override
    public void departmentOfDelivery() {
        System.out.println(" Отдел персонала по работе с доставкой.");
    }

    @Override
    public String toString()
    {
        String str = new String();
        str = "Имя: " + name + " Фамилия: " + surname + " Зарплата: " + salary + " руб. Категория: " + category + " Адрес обслуживания: " + address;
        return str;

    }

}
