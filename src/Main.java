public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("Exibindo números com FOR: " + i);
        }
        
        System.out.println("------------------------------------------ ---------");

        int i = 11;

        while (i <= 20){
            System.out.println("Exibindo números com WHILE: " + i); i++;
        }

        System.out.println("------------------------------------------ ---------");

        do {
            System.out.println("Exibindo números com DO WHILE: " + i);
            i++;
        } while (i <= 30);

        System.out.println("Finalizou");
    }
}