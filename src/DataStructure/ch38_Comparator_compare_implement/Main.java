package DataStructure.ch38_Comparator_compare_implement;


import java.util.*;

// Write your Checker class here
class Checker implements Comparator<Player>{
    @Override
    public int compare(Player o1, Player o2) {
        if (o2.score - o1.score == 0){
            return o1.name.compareTo(o2.name);
        }
        return o2.score - o1.score;
    }
}



class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

/*Comparators are used to compare two objects.
In this challenge, you'll create a comparator and use it to sort an array.*/


class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}

/*
5
amy 100
david 100
heraldo 50
aakansha 75
aleksa 150


10
ab 6
bcc 0
ade 5
cab 2
dee 0
bda 2
c 5
db 2
a 1
cbb 1

 */