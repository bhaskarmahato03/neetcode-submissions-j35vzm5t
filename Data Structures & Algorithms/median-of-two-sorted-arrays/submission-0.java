class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> num3= new ArrayList<>();
        for(int i:nums1){ num3.add(i);

        }
        for(int i:nums2){ num3.add(i);

        }
        Collections.sort(num3);

        int l=num3.size();
        if(l%2==0){
            double Solution= num3.get(l/2)+num3.get(l/2-1);
            return Solution/2;
        }
        else{
            return num3.get(l/2);
        }

        
    }
}
