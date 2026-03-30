public class Array {
    public static void main(String[] args) {
        
        int nums[]={1,2,3,4};

        System.out.println(nums[0]);


        nums[1]=6;

        int nums1[][]= new int [3][4];

         for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
               nums1[i][j]=(int)(Math.random()*10);
            }
            System.out.println();
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(" "+nums1[i][j]);
            }
            System.out.println();
        }
        
        
    }
}
