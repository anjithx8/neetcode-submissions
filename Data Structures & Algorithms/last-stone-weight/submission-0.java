class Solution {
    PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
    public int lastStoneWeight(int[] stones) {
        for(int stone:stones){
            heap.add(stone);
        }
        while(heap.size()>1){
            int a =heap.poll();
            int b=heap.poll();
            if(a==b) heap.add(0);
            else heap.add(Math.abs(a-b));

        }
        return heap.poll();
    }
}
