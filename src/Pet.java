public abstract class Pet {

    protected String name;
    protected int age;

    protected static final int DEFAULT_PET_AGE = 1;
    protected static final String DEFAULT_PET_NAME = "Блохастик";

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void voice();

    @Override
    public String toString() {
        return "Я домашний питомец :) Зовут меня " +
                name + ". Мне " + age + " лет.";
    }
}
