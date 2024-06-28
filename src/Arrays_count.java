class Arrays_count {
    public static void main(String args[]) {
        int arr[]={7,9,1,5,6,7,8,85,2,6};
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(i == j) {
                    continue;
                }
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
