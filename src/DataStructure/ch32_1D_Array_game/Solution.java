package DataStructure.ch32_1D_Array_game;import java.util.*;

public class Solution {
    public static int standingAt = 0;
    public static int n;
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        standingAt = 0;
        n = game.length;
        int j = 1;
        while (true){
            j++;
            //System.out.printf("%d ",j);
            if (standingAt<n-1){
                //System.out.printf("1,stan: %d - %d \n",standingAt,j);
                if (moveForwardPossible(game)){
                    standingAt ++;
                    //System.out.printf("2,stan: %d - %d \n",standingAt,j);
                }
                else if (moveLeapForwardPossible(leap,game)){
                    //System.out.printf("lep- ");
                        standingAt += leap;
                } else if (standingAt+leap>=n) {
                    //System.out.printf("3,stan: %d - %d \n",standingAt,j);
                    return true;
                } else if (moveBackWardPossible(game)){
                    //System.out.printf("4,stan: %d - %d \n",standingAt,j);
                    int entranceStandingAt = standingAt;
                    int flag = 0;
                    while (moveBackWardPossible(game)){
                        standingAt--;
                        if (moveLeapForwardPossible(leap,game)){
                            //System.out.printf("5,stan: %d - %d \n",standingAt,j);
                            standingAt+=leap;
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 0) return false;
                    if (flag==1 && entranceStandingAt==standingAt) return false;
                }
                else if (!moveBackWardPossible(game) && !moveForwardPossible(game) && !moveLeapForwardPossible(leap,game)){
                    //System.out.printf("6,stan: %d - %d \n",standingAt,j);
                    return false;
                }
            }
            else {
                //System.out.print("- ");
                return true;
            }

//            if (j>50) {
//                System.out.print("force stop:- ");
//                return false;
//            }

        }

    }

    public static boolean moveForwardPossible(int[] game){
        if (standingAt+1<n){
            //System.out.printf("moveLeapForwardPossible");
            if (game[standingAt+1]==0){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean moveLeapForwardPossible(int leap, int[] game){
        if (standingAt+leap<n){
            if (game[standingAt+leap]==0){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean moveBackWardPossible(int[] game){
        if (standingAt-1>=0){
            if (game[standingAt-1]==0){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    //public static boolean check




    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            //System.out.print(q+"- ");
            int nn = scan.nextInt();
            int leap = scan.nextInt();

            int[] g = new int[nn];
            for (int i = 0; i < nn; i++) {
                g[i] = scan.nextInt();
            }

            for (int i = 0; i < nn; i++) {
                System.out.print(i+" ");;
            }
            System.out.println();

            System.out.println( (canWin(leap, g)) ? "YES" : "NO" );
        }
        scan.close();
    }
}

/*
4
5 3
0 0 0 0 0
6 5
0 0 0 1 1 1
6 3
0 0 1 1 1 0
3 1
0 1 0

 */