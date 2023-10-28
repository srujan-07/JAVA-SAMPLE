import java.util.Scanner;
class C{
    public int checkmin(int arr[])
    {
        
    int length = arr.length;
        int min = arr[0];
        for(int i=0;i<length;i++)
        {
            if(min<arr[i+1])
            {
                min = arr[i];
            }
        }
        return min;
    }
    public int checkmax(int arr[])
    {
        int length = arr.length;
        int max = arr[0];
        for(int i=0;i<length;i++)
        {
            if(max>arr[i+1])
            {
                max = arr[i];
            }
        }
        return max;
    }

}
public class Demo4 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[4];
        for(int i=0;i<nums.length;i++)
        {
            nums[i] = sc.nextInt();
        }
        C obj = new C();
        System.out.println(obj.checkmin(nums));
        System.out.println(obj.checkmax(nums));
    }
}
