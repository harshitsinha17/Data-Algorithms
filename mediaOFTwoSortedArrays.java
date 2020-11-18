class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> ls = new ArrayList<Integer>();
        int i = 0;
        int mednum = 0;
        double med = 0;
        
        while(i < nums1.length){
            ls.add(nums1[i]);
            i++;
        }
        i=0;
        while(i < nums2.length){
            ls.add(nums2[i]);
            i++;
        }
        
        Collections.sort(ls);
        
        if(ls.size() %2 != 0){
            mednum = (int)Math.ceil(ls.size()/2);
            System.out.println("Inside if, size is odd "+mednum);
            med = ls.get(mednum);
        }
        else{
            mednum = ls.size()/2;
            System.out.println("Inside else, size  even "+mednum);
            System.out.println("elements taken :"+ls.get(mednum-1)+"  "+ls.get(mednum));
            med = (double)(ls.get(mednum-1) + ls.get(mednum))/2;
        }
        return med;
        
    }
}
