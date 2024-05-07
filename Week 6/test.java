public class test {
    public static void main(String[] args) {

        // 2D array

        String[][] car = { { "Camaro", "lamborgini", "Silverado" }, { "Mustang", "Ferrari1", "Bugatti" } };

        car[0][0] = "Camaro";
        car[0][1] = "lamborgini";
        car[0][2] = "Silverado";
        car[1][0] = "Mustang";
        car[1][1] = "Ferrari1";
        car[2][2] = "Bugatti";
        car[2][0] = "Ranger";
        car[2][1] = "BMW";
        car[2][2] = "Tesla";

        for (int i = 0; i < car.length; i++) {
            System.out.println();
            for (int j = 0; j < car[i].length; j++) {
                System.out.print(car[i][j] + "\t\t ");
            }

        }

    }
}
