class Solution {
    
    List<List<Integer>> result = new ArrayList<>();
    
    public List<List<Integer>> subsets(int[] nums) {
        backtrack(new ArrayList<>(), nums, 0);
        return result;
    }
    void backtrack(List<Integer> path, int[] nums, int start) {
        result.add(new ArrayList<>(path));    
        for (int i = start; i < nums.length; i++) {            
            path.add(nums[i]);           
            backtrack(path, nums, i + 1);
            path.remove(path.size() - 1);
        }
    }
}
