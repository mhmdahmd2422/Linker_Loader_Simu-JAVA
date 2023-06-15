import java.util.Scanner;

public class Input {
    int Seq=0,StartAdd=0;
    public static void main(String[] args) throws Exception {
        int Seq=0,StartAdd=0;
        Seq=UserSeq(Seq);
        StartAdd = UserStart(StartAdd);
        System.out.println(Seq);
        System.out.println(StartAdd);
        String[] arr = new String[300];
        Input inp = new Input();
        int var=0;
    }
    public static int Absolute(int Seq, int StartAdd){
        return 0;
    }
    public static int UserSeq(int Seq) {
        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter Program Sequence\n ");
        Seq = sc.nextInt();
        return Seq;
    }
    public static int UserStart(int StartAdd) {
        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter Program Start\n ");
        StartAdd = sc.nextInt();
        return StartAdd;
    }

}
