public class Cat  extends Pet {

    protected static final int DEFAULT_PET_AGE = 2;

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat(String name) {
        this(name, DEFAULT_PET_AGE);
    }

    public Cat(int age) {
        this(DEFAULT_PET_NAME, age);
    }

    public Cat() {
        this(DEFAULT_PET_NAME, DEFAULT_PET_AGE);
    }

    @Override
    public void voice() {
        System.out.println("Мяу-мяу");
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException();
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



//    @Override
//    public String toString(){
//        return "Я котик, зовут меня " + name;
//    }


}
