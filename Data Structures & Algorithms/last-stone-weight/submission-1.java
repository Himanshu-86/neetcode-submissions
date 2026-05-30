class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones) {
            maxHeap.offer(stone);
        }
        while (maxHeap.size() > 1) {
            int largest = maxHeap.poll();
            int second_largest = maxHeap.poll();
            if (largest != second_largest) {
                maxHeap.offer(largest - second_largest);
            }
        }
        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }
}