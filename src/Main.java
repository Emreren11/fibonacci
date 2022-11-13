import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        int fSeries,fElement=1,tempElement=0,result;

        System.out.print("Fibonacci kaç seri olsun: ");
        fSeries=inp.nextInt();
        System.out.print(tempElement+" ");
        System.out.print(fElement+" ");
        for (int i=0; i<fSeries-1; i++)
        {
                result =fElement+tempElement;
                System.out.print(result+" ");
                tempElement=fElement;
                fElement=result;
        }
    }
}