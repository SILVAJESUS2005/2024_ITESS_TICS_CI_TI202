package practicas.poo;

public class Mtriz2 {

    public static void main(String[] args) {
        String[][] nom = {{"1", "0", "0", "1"},
        {"0", "1", "1", "0"},
        {"0", "1", "1", "0"},
        {"1", "0", "0", "1"}};
        for (int i = 0; i < nom.length; i++) {
            for (int j = 0; j < nom[i].length; j++) {
                System.out.print(nom[i][j] + "\t");
            }
            System.out.println("");
        }
    }

}
