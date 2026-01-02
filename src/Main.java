import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magnetCounts = scanner.nextInt();
        String currentMagnetOrientation = "";
        String prevMagnetOrientation ="";
        int groupCounts = 0;
        for (int j = 0; j < magnetCounts; j++) {
            currentMagnetOrientation = scanner.next();
            groupCounts = (!currentMagnetOrientation.equals(prevMagnetOrientation) || j ==0)
                    ?groupCounts+1:groupCounts;

            prevMagnetOrientation = currentMagnetOrientation;

        }
        System.out.println(groupCounts);

    }
}