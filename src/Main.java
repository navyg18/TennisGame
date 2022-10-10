import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Names N = new Names();
        Match M = new Match();
        int n = 0;
        String winnerSet="";
        try {
            N.readNames();
            if (!Objects.equals(N.gender1, N.gender2)) {
                throw new MyException("The gender of both the players is not same");
            }
        } catch (MyException e) {
            System.out.println("The gender of the both the players need to be same");
            System.out.println(e);
            return;
        }
        N.printNames();
        String serve;
        System.out.println("Who won the toss?" + N.player1 + " or " + N.player2);
        serve = sc.next();
        System.out.println(serve + " won the toss,Congratulations!");
        System.out.println("LET THE MATCH BEGIN!");
        if (N.gender1.equals("f")) {
            n = 3;
        }
        if (N.gender1.equals("m")) {
            n = 5;
        }
        for(int i=1;i<=n;i++){
            int sumGame1 = 0, sumGame2 = 0;
            boolean set = false;
            while (!set) {
                System.out.println("NEW GAME BEGINS!");
                System.out.println("LOVE ALL");
                boolean flag = false;
                int point1 = 0,point2=0;
                while (!flag) {
                    System.out.println("Enter the score for " + N.player1 + " and " + N.player2);
                    point1 = sc.nextInt();
                    point2 = sc.nextInt();
                    if (point1 == point2) {
                        if (point1 > 3) {
                            N.winnerDeuce(point1, point2);
                        } else {
                            M.pointScoredAreEqual(point1, point2);
                        }
                    } else {
                        if (point1 > 3 || point2 > 3) {
                            N.winnerDeuce(point1, point2);
                        } else {
                            M.pointScoredByPlayer1(point1);
                            System.out.print("-");
                            M.pointScoredByPlayer2(point2);
                        }
                    }
                    if ((point1 - point2) >= 2 && point1 >= 4) {
                        flag = true;
                    } else if ((point2 - point1) >= 2 && point2 >= 4) {
                        flag = true;
                    }
                }
                String winnerGame = N.WinnerOfGame(point1, point2);

                if (winnerGame.equalsIgnoreCase(N.player1)) {
                    sumGame1++;
                } else {
                    sumGame2++;
                }

                if (sumGame1 == sumGame2) {
                    if (sumGame1 > 5) {
                        N.winnerDeuceSet(sumGame1, sumGame2);
                        break;
                    } else {
                        System.out.println("--Current score for the set--");
                        System.out.println("--" + N.player1 + " : " + sumGame1 + " - " + N.player2 + " : " + sumGame2 + "--");
                    }
                } else {
                    if ((sumGame1 == 6) && (sumGame1 - sumGame2) == 1) {
                        System.out.println("ADVANTAGE for " + N.player1);
                    }
                    if ((sumGame1 == 6) && ((sumGame2 - sumGame1) == 1)) {
                        System.out.println("ADVANTAGE for " + N.player2);
                    }
                    System.out.println("--Current score for the set--");
                    System.out.println("--" + N.player1 + " : " + sumGame1 + " - " + N.player2 + " : " + sumGame2 + "--");
                }
                if ((sumGame1 - sumGame2) >= 2 && sumGame1 >= 6) {
                    set = true;
                } else if ((sumGame2 - sumGame1) >= 2 && sumGame2 >= 6) {
                    set = true;
                }
                winnerSet = N.WinnerOfSet(sumGame1, sumGame2);
            }
            if(i==1){
                if(winnerSet.equals(N.player1)){
                    System.out.println(N.player1+" is leading the match 1-0");
                }
                else if(winnerSet.equals(N.player2)){
                    System.out.println(N.player2+"is leading the match 0-1");
                }
            }
            if(i==2){
                if(winnerSet.equals(N.player1)){
                    System.out.println(N.player1+" HAS WON THE MATCH.CONGRATULATIONS!!");
                    break;
                }
                else{
                    System.out.println(N.player2+" HAS WON THE MATCH.CONGRATULATIONS!!");
                    break;
                }
            }
    }
}
}


