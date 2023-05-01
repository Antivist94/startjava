public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setName("Тигр");
        wolf.setSex("Самец");
        wolf.setWeight(15);
        wolf.setAge(4);
        wolf.setColor("Чёрный");
        System.out.println("Волка зовут: " + wolf.getName() + ". Пол: " + wolf.getSex() + "\n" 
            + "Возраст: " + wolf.getAge() + " Вес: " + wolf.getWeight() + "\n" 
            + "Цвет: " + wolf.getColor());
        System.out.println("Волк " +  wolf.move());
        System.out.println("Волк " +  wolf.seat());
        System.out.println("Волк " +  wolf.run());
        System.out.println("Волк " +  wolf.howl());
        System.out.println("Волк " +  wolf.hunt());
        System.out.println("Но в цирке не выступает...");
    }
}