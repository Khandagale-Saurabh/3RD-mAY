class Solution
{
    public int[] shuffle(int[] nums, int n)
    {
       int new_arr[]=new int[nums.length];
        
        int n1=n;
        int j=0;
        int l=1;
        for(int i=0;i<nums.length-1;i=i+1)
        {
              if(i<n)
              {
                  new_arr[j]=nums[i];
              }
            j=j+2;
           
        }
        
       for(int i=n;i<nums.length;i=i+1)
        {
             
           if(i>=n)
           {
        new_arr[l]=nums[i];
               l=l+2;
           }
       }
        return new_arr;
    }
}
