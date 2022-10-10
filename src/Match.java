import java.util.*;
public class Match {
    Scanner sc = new Scanner(System.in);

    void pointScoredByPlayer1(int point1) {
        switch (point1) {
            case (0):
                System.out.print("LOVE");
                break;
            case (1):
                System.out.print("15");
                break;
            case (2):
                System.out.print("30");
                break;
            case (3):
                System.out.print("40");
                break;
            case (4):
                System.out.print("GAME");
                break;
            default:
                System.out.println("Enter a valid point");
        }
    }

    void pointScoredByPlayer2(int point2) {
        switch (point2) {
            case (0):
                System.out.println("LOVE");
                break;
            case (1):
                System.out.println("15");
                break;
            case (2):
                System.out.println("30");
                break;
            case (3):
                System.out.println("40");
                break;
            case (4):
                System.out.println("GAME");
                break;
            default:
                System.out.println("Enter a valid point");
        }
    }

    void pointScoredAreEqual(int firstP, int secondP) {
        switch (firstP) {
            case (0):
                System.out.println("LOVE ALL");
                break;
            case (1):
                System.out.println("15 ALL");
                break;
            case (2):
                System.out.println("30 ALL");
                break;
            case (3):
                System.out.println("DEUCE");
                break;
            default:
                System.out.println("Enter a valid point");
        }
    }

    void tieplayer1(int point1) {
        switch (point1) {
            case(0):
                System.out.println("0");
                break;
            case (1):
                System.out.print("1");
                break;
            case (2):
                System.out.print("2");
                break;
            case (3):
                System.out.print("3");
                break;
            case (4):
                System.out.print("4");
                break;
            case (5):
                System.out.print("5");
                break;
            default:
                System.out.println("Enter a valid point");
        }
    }

    void tieplayer2(int point2) {
        switch (point2) {
            case(0):
                System.out.println("0");
                break;
            case (1):
                System.out.println("1");
                break;
            case (2):
                System.out.println("2");
                break;
            case (3):
                System.out.println("3");
                break;
            case (4):
                System.out.println("4");
                break;
            case (5):
                System.out.println("5");
                break;
            default:
                System.out.println("Enter a valid point");
        }
    }
}






