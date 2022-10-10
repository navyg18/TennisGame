import java.util.*;
public class Names {
    public String player1="",player2="";
    String gender1="",gender2="";
    int tie1=0,tie2=0;
    Match m=new Match();
    void readNames() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name and gender of first player:");
        this.player1=sc.next();
        this.gender1=sc.next();
        System.out.println("Enter the name and gender of second player:");
        this.player2=sc.next();
        this.gender2=sc.next();
    }
    void printNames(){
        System.out.println("The name and gender of the first player is:"+player1+" "+gender1);
        System.out.println("The name and gender of the second player is:"+player2+" "+gender2);
    }
    String WinnerOfGame(int sum1,int sum2){
        if(sum1>4 ||sum2>4) {
            if ((sum1 - sum2) >= 2 && sum1 >= 4) {
                System.out.println(player1 + " is the winner of the game");
                return(player1);
            } else if ((sum2 - sum1) >= 2 && sum2 >= 4) {
                System.out.println(player2 + " is the winner of the game");
                return(player2);
            }
        }
        else {
            if ((sum1 - sum2) >= 2 && sum1 == 4) {
                System.out.println(player1 + " is the winner of the game");
                return(player1);
            } else if ((sum2 - sum1) >= 2 && sum2 == 4) {
                System.out.println(player2 + " is the winner of the game");
                return(player2);
            }
        }
        return("");
    }
    void winnerDeuce(int firstP,int secondP){
        if(firstP>=4 && (firstP-secondP)==1){
            System.out.println("ADVANTAGE for "+player1);
        }
        if(secondP>=4 && (secondP-firstP)==1){
            System.out.println("ADVANTAGE for "+player2);
        }
        else if(firstP==secondP){
            System.out.println("DEUCE AGAIN");
        }
    }
    String WinnerOfSet(int sum1,int sum2){
        if(sum1>6 ||sum2>6) {
            if ((sum1 - sum2) >= 2 && sum1 >= 6) {
                System.out.println(player1 + " is the winner of the set");
                return(player1);
            } else if ((sum2 - sum1) >= 2 && sum2 >= 6) {
                System.out.println(player2 + " is the winner of the set");
                return(player2);
            }
            else if((sum1-sum2)==1){
                System.out.println(player1+" is the winner of the set");
            }
            else if((sum2-sum1)==1){
                System.out.println(player2+" is the winner of the set");
            }
        }
        else {
            if ((sum1 - sum2) >= 2 && sum1 == 6) {
                System.out.println(player1 + " is the winner of the set");
                return(player1);
            } else if ((sum2 - sum1) >= 2 && sum2 == 6) {
                System.out.println(player2 + " is the winner of the set");
                return(player2);
            }
        }
        return("");
    }
    void deuceTie(int tieGame1,int tieGame2){
        if(tieGame1>=7 && (tieGame1-tieGame2)==1){
            System.out.println("ADVANTAGE for "+player1);
        }
        if(tieGame2>=7 && (tieGame2-tieGame1)==1){
            System.out.println("ADVANTAGE for "+player2);
        }
        else if(tieGame1==tieGame2){
            System.out.println("DEUCE");
        }
    }
    void tiebreaker() {
        Scanner sc = new Scanner(System.in);
        boolean tie = false;
        while (!tie) {
            System.out.println("Enter points for tiebreaker between:" + player1 + " and " + player2);
            tie1 = sc.nextInt();
            tie2 = sc.nextInt();
            if (tie1 == tie2) {
                if (tie1 > 6) {
                    deuceTie(tie1, tie2);
                } else {
                    switch (tie1) {
                        case (1):
                            System.out.println("1 ALL");
                            break;
                        case (2):
                            System.out.println("2 ALL");
                            break;
                        case (3):
                            System.out.println("3 ALL");
                            break;
                        case (4):
                            System.out.println("4 ALL");
                            break;
                        case (5):
                            System.out.println("5 ALL");
                            break;
                        default:
                            System.out.println("Enter a valid point");
                    }
                }
            } else {
                if (tie1 > 6 || tie2 > 6) {
                    deuceTie(tie1, tie2);
                } else {
                    m.tieplayer1(tie1);
                    System.out.print("-");
                    m.tieplayer2(tie2);
                }
            }
            if ((tie1 - tie2) >= 2 && tie1 >= 7) {
                tie = true;
                WinnerOfSet(7,6);
            }
            if ((tie2 - tie1) >= 2 && tie2 >= 7) {
                tie = true;
                WinnerOfSet(6,7);
            }
        }
    }
    void winnerDeuceSet(int firstP,int secondP ){
        if(firstP==secondP && firstP==6){
            System.out.println("--TIEBREAKER--");
            tiebreaker();
        }
        else{
            System.out.println("DEUCE SET");
        }
    }
}






