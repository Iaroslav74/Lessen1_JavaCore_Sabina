package Lessen1_JavaCore_Sabina;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", "Белый", 1);


        System.out.println(cat);

        Cat cat1 = new Cat("Морис", "черный", 1);
        Cat cat2 = new Cat("Морис", "черный", 1);

        System.out.println(cat1.equals(cat2));

        Cat cat3 = new Cat("Морис", "черный", 4);

        System.out.println(cat2.hashCode());
        System.out.println(cat3.hashCode());

        Wolf wolf = new Wolf("Бобик", "Чёрный", 5);

        Animal cat4 = new Cat("Вася", "Рыжий", 3);

        if(cat4 instanceof Wolf) {
            Wolf wolf5 = (Wolf) cat4;

        }
        else System.out.println("Не является волком!!!");

        System.out.println(wolf);

        Cat cat5 = new Cat("Васька", "Коричневый", 6);
        cat5.setAge(7);
        System.out.println(cat5);

        cat5.setAge(-1);
        System.out.println(cat5);
    }
}
