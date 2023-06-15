import java.io.File;
import java.util.Scanner;
import java.lang.String;

public class main {
    public static int Prog1(String[] Start, String[] Len, String[] obj, String[] table, int StartAdd,String [] Tflag,int counter,int T) {
        int y=2,x=0,prog1=0,tlines=0,temp=0;
        String[] test = new String[20];
//        System.out.println(counter);
        for(int i=2;i< Tflag.length;i++){
            if(Tflag[i].matches("^[1]..*")){
                test[i] = Tflag[i];
                temp++;
//                System.out.println(test[i]);
//                System.out.println(Tflag[i]);
//                System.out.println(i);
            }else{break;}
        }
//        System.out.println(temp);
//        System.out.println(test[temp]);
        tlines = Integer.valueOf(test[temp].substring(2,3));
//        System.out.println(tlines);
        if(T<tlines){
            tlines=tlines-T;
        }
        T=tlines;
//        System.out.println(T);
        int intFlag = Integer.valueOf(Tflag[counter].substring(2,3));
//        System.out.println(intFlag);
//        System.out.println(obj[0].length());
        while (tlines!=0) {
            y=2;
            x=0;
            for (int i = 0; i <= (obj[prog1].length() / 2)-1 ; i++) {
//                System.out.println("x="+x);
//                System.out.println("y="+y);
//              System.out.println(i);
//                System.out.println(obj[z].length());
//                System.out.println(tlines);
//                System.out.println(prog1);
                table[i] = obj[prog1].substring(x, y);
                System.out.println(table[i]);
                x += 2;
                y += 2;
//
            }
//            System.out.println(intFlag);
            prog1++;
            tlines--;
        }
//        System.out.println(intFlag);
        for(int p=0;p<10;p++) {
//            System.out.println(Start[p]);
//            System.out.println(Len[p]);
//            System.out.println(obj[p]);
//            System.out.println(table[p]);
        }
        return 0;
    }
    public static int Prog2(String[] Start, String[] Len, String[] obj, String[] table, int StartAdd,String [] Tflag,int counter,int T) {
        int y=2,x=0,prog1=2,tlines=0,temp=0;
        String[] test = new String[20];
//        System.out.println(counter);
        for(int i=2;i< counter;i++){
//            System.out.println(Tflag[i]);
            if(Tflag[i].matches("^[2]..*")){
                test[temp] = Tflag[i];
                temp++;
//                System.out.println(test[i]);
//                System.out.println(Tflag[i]);
//                System.out.println(i);
            }
        }
//        System.out.println(temp);
//        System.out.println(test[temp-1]);
        tlines = Integer.valueOf(test[temp-1].substring(2,3));
//        System.out.println(T);
        if(T<tlines){
            tlines=tlines-T;
        }
        T=tlines;
//        System.out.println(tlines);
        int intFlag = Integer.valueOf(Tflag[counter].substring(2,3));
//        System.out.println(intFlag);
//        System.out.println(obj[0].length());
        while (tlines!=0) {
            y=2;
            x=0;
            for (int i = 0; i <= (obj[prog1].length() / 2)-1 ; i++) {
//                System.out.println("x="+x);
//                System.out.println("y="+y);
//              System.out.println(i);
//                System.out.println(obj[z].length());
//                System.out.println(tlines);
//                System.out.println(prog1);
                table[i] = obj[prog1].substring(x, y);
                System.out.println(table[i]);
                x += 2;
                y += 2;
//
            }
//            System.out.println(intFlag);
            prog1++;
            tlines--;
        }
//        System.out.println(intFlag);
        for(int p=0;p<10;p++) {
//            System.out.println(Start[p]);
//            System.out.println(Len[p]);
//            System.out.println(obj[p]);
//            System.out.println(table[p]);
        }
        return 0;
    }
    public static int Prog3(String[] Start, String[] Len, String[] obj, String[] table, int StartAdd,String [] Tflag,int counter,int T) {
        int y=2,x=0,prog1=3,tlines=0,temp=0;
        String[] test = new String[20];
//        System.out.println(counter);
        for(int i=2;i< counter;i++){
//            System.out.println(Tflag[i]);
            if(Tflag[i].matches("^[2]..*")){
                test[temp] = Tflag[i];
                temp++;
//                System.out.println(test[i]);
//                System.out.println(Tflag[i]);
//                System.out.println(i);
            }
        }
//        System.out.println(temp);
//        System.out.println(test[temp-1]);
        tlines = Integer.valueOf(test[temp-1].substring(2,3));
//        System.out.println(T);
        if(T<tlines){
            tlines=tlines-T;
        }
        T=tlines;
//        System.out.println(tlines);
        int intFlag = Integer.valueOf(Tflag[counter].substring(2,3));
//        System.out.println(intFlag);
//        System.out.println(obj[0].length());
        while (tlines!=0) {
            y=2;
            x=0;
            for (int i = 0; i <= (obj[prog1].length() / 2)-1 ; i++) {
//                System.out.println("x="+x);
//                System.out.println("y="+y);
//              System.out.println(i);
//                System.out.println(obj[z].length());
//                System.out.println(tlines);
//                System.out.println(prog1);
                table[i] = obj[prog1].substring(x, y);
                System.out.println(table[i]);
                x += 2;
                y += 2;
//
            }
//            System.out.println(intFlag);
            prog1++;
            tlines--;
        }
//        System.out.println(intFlag);
        for(int p=0;p<10;p++) {
//            System.out.println(Start[p]);
//            System.out.println(Len[p]);
//            System.out.println(obj[p]);
//            System.out.println(table[p]);
        }
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
    public static void main(String[] args) throws Exception {
        int T=0;
        int Seq=0,StartAdd=0;
//        Seq=UserSeq(Seq);
//        StartAdd = UserStart(StartAdd);
//            System.out.println(Seq);
//            System.out.println(StartAdd);

        File file = new File("src/in.txt");
        String word = null;
        Scanner scanner = new Scanner(file);
        int i = 0;
        // H record
        String[] arr = new String[100];
        String[] progName = new String[20];
        String[] progStart = new String[20];
        String[] progLen = new String[20];
        // T record
        String[] TrecStart = new String[20];
        String[] TrecLen = new String[20];
        String[] T_ObjCode = new String[100];
        // D record
        String[] DName = new String[20];
        String[] DAddress = new String[20];
        // R record
        String[] RName = new String[30];
        // M record
        String[] MEdit = new String[30];
        String[] MAddress = new String[30];
        String[] MVar = new String[30];

        String[] Flags = new String[30];
        int Tflag=0, Mflag=0, Dflag=0, Rflag=0;
        i=0;
        int counter=0;
        int a=0,b=0,c=0,d=0,e=0;
        while (scanner.hasNextLine()) {
            word = scanner.nextLine();
            String[] temp = word.split("   "); //split by tab
            if (temp[0].matches("^[H]..*")) {
                arr[a] = temp[0];
                //System.out.println(arr[i]);
                progName[a] = arr[a].substring(2, 9);
                progStart[a] = arr[a].substring(10, 16);
                progLen[a] = arr[a].substring(18, 23);
//                System.out.println(progName[i]);
//                System.out.println(progLen[i]);
//                System.out.println(progStart[i]);
                a++;
            }
            if (temp[0].matches("^[T]..*")) {  //Design issue: multiple T records in one prog.
                arr[b] = temp[0];
                int x = 12, y = 14;
                //System.out.println(arr[i]);
                TrecStart[b] = arr[b].substring(2, 8);
                TrecLen[b] = arr[b].substring(9, 11);
                int stringLen = arr[b].length();
                //System.out.println(stringLen);
                    T_ObjCode[b] = arr[b].substring(12, stringLen);
//                    System.out.println(T_ObjCode[b]);
                    // System.out.println("x is" + x);
                Tflag++;
                //System.out.println(i);
//                System.out.println(TrecStart[i]);
//                System.out.println(TrecLen[i]);
//                System.out.println(T_ObjCode[i]);
                b++; //issue here

            }
            if (temp[0].matches("^[D]..*")){
                int x = 2, y = 8,units=0,count =0;
                arr[c] = temp[0];
                int stringLen = arr[c].length();
                //System.out.println(stringLen);
                units=(stringLen -1)/7;
                count = units/2;
                for(int m=1;m<=units/2;m++) {
                    DName[c] = arr[c].substring(x, y);
                    //  System.out.println("x is"+x);
                    x += 7;
                    y += 7;
                    DAddress[c] = arr[c].substring(x, y);
//                    System.out.println("DName :\t" +DName[i] );
//                    System.out.println("DAddress :\t" +DAddress[i] );
                    while(count >= 0){
                        x +=7;
                        y +=7;
                        break;
                    }
                    count--;
                }
                Dflag++;
                c++;
            }
            if (temp[0].matches("^[R]..*")){
                int x = 2, y = 8,units=0;
                arr[d] = temp[0];
                int stringLen = arr[d].length();
                //System.out.println(stringLen);
                units=(stringLen -1)/7;
                //System.out.println(units);
                for(int m=1;m<=units;m++) {
                    RName[i] = arr[i].substring(x, y);
//                    System.out.println("Rname :\t" +RName[i] );
//                    System.out.println("y is" + y);
                    x += 7;
                    y += 7;
                }
                Rflag++;
                d++;
            }
            if (temp[0].matches("^[M]..*")){
                int x = 2, y = 8;
                arr[e] = temp[0];
                int stringLen = arr[e].length();
                MAddress[e] = arr[e].substring(x, y);
                x += 7;
                y += 3;
                MEdit[e] = arr[e].substring(x, y);
                x+=2;
                MVar[e] = arr[e].substring(x, stringLen);
//                System.out.println(MEdit[i]);
//                System.out.println(MVar[i])
                Mflag++;
                e++;
            }
//            System.out.println(counter);
            counter++;
            Flags[counter] = String.valueOf(Dflag);
            Flags[counter] = Flags[counter].concat(String.valueOf(Rflag));
            Flags[counter] = Flags[counter].concat(String.valueOf(Tflag));
            Flags[counter] = Flags[counter].concat(String.valueOf(Mflag));
//          System.out.println(Flags[counter]);

        }
        String[] table = new String[300];
//            String SeqString=String.valueOf(Seq);
//            char Prog1 = SeqString.charAt(0);
//            char Prog2 = SeqString.charAt(1);
//            char Prog3 = SeqString.charAt(2);
        Prog1(TrecStart,TrecLen,T_ObjCode,table,StartAdd,Flags,counter,T);
        Prog2(TrecStart,TrecLen,T_ObjCode,table,StartAdd,Flags,counter,T);
        Prog3(TrecStart,TrecLen,T_ObjCode,table,StartAdd,Flags,counter,T);
        for(int x=0;x<100;x++){
//            System.out.println(T_ObjCode[x]);
//            System.out.println(progName[x]);
//            System.out.println("x="+x);
//            System.out.println(TrecStart[x]);
//            System.out.println(TrecLen[x]);
//            System.out.println(DName[x]);
        }
    }
}
