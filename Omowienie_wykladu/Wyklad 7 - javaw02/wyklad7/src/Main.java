import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void przyklad2(){
        int[] a={2,3,5,7,11,13};
        int[] b = new int[a.length];
        System.arraycopy(a,0,b,0,a.length);
        System.out.println(Arrays.toString(a));
    }
    public static void tabwielowymiarowe(){
        int[][] wielowymiarowe = {
                {16,3,2,13},
                {5,10,11,8},
                {9,6,7,12},
                {4,15,14,1}
        };

    }
    public static void main(String[] args){
        int[] a = {2,3,4,5}; //To samo
        int b[] = {2,3,4,5};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        int[] c;
        c=a;
        System.out.println(Arrays.toString(c));

        //przyklad2();
        tabwielowymiarowe();
    }

}

