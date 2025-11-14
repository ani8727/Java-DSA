package recursion;

import java.util.Scanner;

public class TowerOfHanoi {

    static int towerHanoi(int n, char from, char to, char help){
        if(n==0) return 0;
        if(n==1){
            System.out.println("Move Disk: "+n+" from rod: "+from+" to rod: "+to);
            return 1;
        }
        int count=towerHanoi(n-1,from,help,to);

        System.out.println("Move Disk: "+n+" from rod: "+from+" to rod: "+to);
        count++;

        count+=towerHanoi(n-1,help,to,from);

        return count;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of Disks: ");
        int n=sc.nextInt();

        char from='A';
        char to='B';
        char help='C';

        int TotalMoves=towerHanoi(n,from,to,help);

        System.out.println("Mini Moves to make: "+TotalMoves);
    }
}
