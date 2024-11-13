package task1_a;

class Person {
    
    private String name;
    private int age;

    
    public Person() {
        this.name = "Неизвестно";
        this.age = 0;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Mafuyu",  26);

        person1.displayInfo();
        person2.displayInfo();
    }
}
