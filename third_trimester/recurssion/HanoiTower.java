package DSA.third_trimester.recurssion;

public class HanoiTower
{
    public static void main(String[] args) {
        hanoi(3, 'A', 'B', 'C');
    }

    public static void hanoi(int n, char Source, char Destination, char Helper)
    {
        if(n == 0)
        {
            return;
        }

        hanoi(n-1, Source, Helper, Destination);
        System.out.println("Move " + n + " from " + Source + " to " + Destination);
        hanoi(n-1, Helper, Destination, Source);
    }
}