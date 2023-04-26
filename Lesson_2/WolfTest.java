public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        System.out.println("Волк " +  wolf.move());
        System.out.println("Волк " +  wolf.seat());
        System.out.println("Волк " +  wolf.run());
        System.out.println("Волк " +  wolf.howl());
        System.out.println("Волк " +  wolf.hunt());
        System.out.println("Но в цирке не выступает...");
    }
}