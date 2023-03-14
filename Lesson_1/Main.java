public class VariablesTheme {
    public static void main(String[] args) {
        
        System.out.println("1. Вывод значений переменных на консоль");
            byte cores = 8;
            short ram = 8128;
            int hdd = 1024;
            long cost = 120L;
            float cpu = 2.48F;
            double ratio = 0.25;
            char oSys = 'W';
            boolean cheapPirce = true;

        System.out.println("Компьютер на базе ОС" + oSys + "indows.\n" + 
            "C мощным " + cores + "-ядерным процессором и тактовой частой " + cpu + " Ггц.\n" +
             );
    }
}