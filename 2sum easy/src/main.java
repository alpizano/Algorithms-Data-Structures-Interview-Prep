class main {

    public int[] twoSum(int[] nums, int target) {

        int num1 = 0;
        int num2 = 0;

        for (int p1 = 0; p1 < nums.length; p1++) {
            for (int p2 = 0; p2 < nums.length; p2++) {
                if ((nums[p1] + nums[p2] == target) && (p1 != p2)) {
                    num1 = p1;
                    num2 = p2;
                }
            }
        }
        int[] retIndices = new int[2];
        retIndices[1] = num1;
        retIndices[0] = num2;
        return retIndices;
    }

    public static void main(String args[]) {
        int[] test = {2, 7 , 5 ,11};
        main hey = new main();

        int [] ans = hey.twoSum(test,9);

        for(int i=0; i<ans.length; i++) {
            System.out.println("The indices that add up to target are: " + ans[i] );
        }
    }
}

