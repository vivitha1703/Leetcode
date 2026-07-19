class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Count frequencies
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Bucket array
        List<Integer>[] buckets = new ArrayList[nums.length + 1];

        // Place numbers into buckets based on frequency
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();

            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }

            buckets[frequency].add(number);
        }

        int[] result = new int[k];
        int index = 0;

        // Traverse buckets from highest frequency to lowest
        for (int i = buckets.length - 1; i >= 0 && index < k; i--) {
            if (buckets[i] != null) {
                for (int number : buckets[i]) {
                    result[index++] = number;

                    if (index == k) {
                        break;
                    }
                }
            }
        }

        return result;
    }
}