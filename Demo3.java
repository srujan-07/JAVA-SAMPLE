import java.util.*;
public class Demo3 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int nums1[][] = new int[3][3];
        int nums2[][] = new int[3][3];
        int nums3[][] = new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                nums1[i][j] = sc.nextInt();
                nums2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Multiplyting the values");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;k++)
                {
                    nums3[i][j]+=nums1[i][k]*nums2[k][j]; 
                }
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println(nums3[i][j]);
            }
        }
    }
}
