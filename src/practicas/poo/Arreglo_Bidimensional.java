package practicas.poo;

public class Arreglo_Bidimensional {

    public static void main(String[] args) {
        String[][] nom = {{"Nico", "Jesus", "Sandy", "Daniel", "Isabel"},
        {"Nico1", "Jesus 2", "Sandy 3", "Daniel 4", "Isabel 5"},
        {"Nico", "Jesus 6", "Sandy 7", "Daniel 8", "Isabel 9"},};
        for (int i = 0; i < nom.length; i++) {
            for (int j = 0; j < nom[i].length; j++) {
                System.out.print(nom[i][j] + "\t");
                        }
                        System.out.println("");
        }
    }

}
