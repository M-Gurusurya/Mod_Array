import java.util.Scanner;

public class ModArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        int size=scanner.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=scanner.nextInt();
        }
        System.out.println("Enter B");
        int B=scanner.nextInt();
        System.out.println(findModArray(array,size,B));
    }
    public static int findModArray (int array[],int size,int B)
    {
        int result=0;
        int power=1;
        for(int i=size-1;i>=0;i--)
        {
            result= result+((array[i]%B)*power)%B;
            power=(power*10)%B;
        }
        return result;
    }
}
