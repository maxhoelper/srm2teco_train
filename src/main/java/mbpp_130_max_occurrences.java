package mbpp_130_max_occurrences;

public class mbpp_130_max_occurrences {

    
    public static int maxOccurrences_Problem_2_1e526295_aa6f_4e08_8030_2425a33b291f(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(Integer num : nums) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for(Integer freq : map.values()) {
            if(max < freq) {
                max = freq;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_4a0e286c_7d2c_4b38_90e3_626f8b8f46c5(ArrayList<Integer> nums) {
        // Write your code here
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i : nums) {
            if(map.containsKey(i)) {
                map.put(i, map.get(i)+1);
            } else {
                map.put(i, 1);
            }
        }
        Integer key = 0L;
        int max = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > max) {
                key = entry.getKey();
                max = entry.getValue();
            }
        }
        return key;
    }

    
    public static int maxOccurrences_Problem_2_7c964b85_c4fb_4744_bb71_215d8ff1447c(ArrayList<Integer> nums) {
        // Write your code here
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1L);
            }
            max = Math.max(max, map.get(n));
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_3db09979_9038_429b_ad97_c632613dccc8(ArrayList<Integer> nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.size();i++) {
            Integer item = nums.get(i);
            int freq = 0;
            if(map.containsKey(item)) {
                freq = map.get(item);
            }
            map.put(item,freq+1);
        }
        return map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
    }

    
    public static int maxOccurrences_Problem_1_e07b1266_3c90_4ec2_b6f0_b0d2c5c86f1c(ArrayList<Integer> nums) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        int max = 0;
        for(Integer n : nums) {
            Integer o = occurrences.get(n);
            if(o == null) {
                occurrences.put(n, 1);
            } else {
                occurrences.put(n, o + 1);
            }
        }
        for(Map.Entry<Integer, Integer> e : occurrences.entrySet()) {
            int count = e.getValue();
            if(count > max) {
                max = count;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_e671a487_5301_42f7_9a00_310b9c3bacf7(ArrayList<Integer> nums) {
        int max = 0;
        for (int n : nums) {
            if (n > max) {
                max = n;
            }
        }
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == max) {
                return max;
            }
        }
        return 0;
    }

    
    public static int maxOccurrences_Problem_2_7fc6a493_4ec4_440b_bc4b_26a027f35965(ArrayList<Integer> nums) {
        // Write your code here
        int max = nums.get(0);
        int count = 1;
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) != nums.get(i - 1)) {
                max = Math.max(count, max);
                count = 1;
            } else {
                count++;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_5ca00f3e_1494_47cc_8611_168cd6b7ab2c(ArrayList<Integer> nums) {
        if (nums.isEmpty()) return 0;
        int max = nums.stream().map(n -> n).max(Integer::compare).get();
        int count = 0;
        for (Integer num : nums) {
            if (num == max) {
                count++;
            }
        }
        return count;
    }

    
    public static int maxOccurrences_Problem_2_485857af_12a5_4728_ad08_a49a9620896a(ArrayList<Integer> nums) {
        int[] arr = new int[nums.size()];
        for(int i=0; i<nums.size(); i++) {
            arr[i] = nums.get(i);
        }
        Arrays.sort(arr);
        int max = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == arr[i+1]) {
                max += i+1;
            }
            else {
                break;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_3aab921a_8fb6_4789_841b_8183e82bbdeb(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = 0;
        for(int num : nums) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num)+1);
            } else {
                map.put(num, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_a92b4e45_6a7b_4898_9d1e_dd92ea9d15c0(ArrayList<Integer> nums) {
        int max = 0;
        int count = 0;
        for(Integer i : nums) {
            if(count > 0 && nums.contains(i)) {
                count--;
            } else {
                count++;
            }
            max = Math.max(max, count);
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_c9d8b48a_a928_485d_a182_df0f6eddb807(ArrayList<Integer> nums) {
        // Write your code here
        int max = 0;
        int cur = 0;
        for(int i : nums) {
            cur++;
            if(cur > max) {
                max = cur;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_82661e8f_5035_4362_8a91_31bbb0abe087(ArrayList<Integer> nums) {
        int max = 0;
        int count = 0;
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) == count) {
                count++;
            } else {
                count = nums.get(i);
                max = Math.max(max, count);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_1afc9817_9bcd_485b_afc5_d15ea25d792f(ArrayList<Integer> nums) {
        int maxCount = 0;
        int maxNum = nums.get(0);
        for (int num : nums) {
            if (num == maxNum) {
                maxCount++;
            }
            if (maxCount > nums.size()) {
                maxCount = nums.size();
                maxNum = num;
            }
        }
        return maxCount;
    }

    
    public static int maxOccurrences_Problem_1_d60b4fe0_50bc_4791_a1d7_2ed9b8b186cb(ArrayList<Integer> nums) {
        // Create a map for counting frequency of each number
        Map<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        // Fill the map with all the numbers from array list
        for (Integer num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1L);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        // Create an array list to hold the maximum number for each frequency
        List<Integer> result = new ArrayList<>();
        // Populate the list with maximum value for each frequency
        for (int frequency : map.values()) {
            if (frequency > max) {
                max = frequency;
                result.clear();
                result.add(max);
            } else if (frequency == max) {
                result.add(max);
            }
        }
        // Return the first element of the list
        if (result.isEmpty()) {
            return 0;
        } else {
            return result.get(0);
        }
    }

    
    public static int maxOccurrences_Problem_1_2fa4abd4_11cd_49d9_bd66_d2a32fdb4f93(ArrayList<Integer> nums) {
        int maxCount = 0;
        int maxNum = nums.get(0); // initialize max with first element
        for (int num : nums) {
            if (num == maxNum) {
                maxCount++;
            }
            if (maxCount > nums.size()) {
                return maxCount;
            }
            maxNum = num;
        }
        return maxCount;
    }

    
    public static int maxOccurrences_Problem_2_7b9faba9_33b3_406f_bbe6_ba7db4702b98(ArrayList<Integer> nums) {
        int maxCount = 0;
        int max = -1;
        int size = nums.size();
        int current;
        for(int i = 0; i < size; i++){
            current = nums.get(i);
            if(current > max){
                max = current;
            }
            nums.remove(i);
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_b28e9a11_ab81_4365_ab4b_1d6184cc621a(ArrayList<Integer> nums) {
        int max = 0;
        int maxCount = 0;
        int maxIndex = 0;
        for(int i = 0; i < nums.size(); i++) {
            int count = nums.get(i);
            if(count > maxCount) {
                max = count;
                maxCount = count;
                maxIndex = i;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_8c3b2123_191e_465c_93e4_6be19e2cc67b(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = 0;
        for(int n : nums) {
            if(map.containsKey(n)) {
                map.put(n, map.get(n)+1);
            } else {
                map.put(n, 1L);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_4390640e_1c3d_4d20_ae44_192909deb341(ArrayList<Integer> nums) {
        int maxCount = 0;
        int maxNum = 0;
        for (int num : nums) {
            if (num > maxCount) {
                maxCount = num;
                maxNum = num;
            } else if (num == maxCount) {
                if (num > maxNum) {
                    maxCount = num;
                    maxNum = num;
                }
            }
        }
        return maxCount;
    }

    
    public static int maxOccurrences_Problem_2_7a631f4f_323d_4c0c_b3c3_3c70d5b50a69(ArrayList<Integer> nums) {
        int maxCount = 0;
        int maxNum = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num == maxNum) {
                maxCount++;
            } else {
                if (maxCount > nums.size()) {
                    maxCount = nums.size();
                    maxNum = num;
                }
            }
        }
        return maxCount;
    }

    
    public static int maxOccurrences_Problem_0_baa6b373_9389_49eb_9496_cbd2c5f9a2fd(ArrayList<Integer> nums) {
        if(nums.isEmpty()) return 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer i: nums){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }
        }
        return map.values().stream().max(Comparator.comparing(Integer::intValue)).get();
    }

    
    public static int maxOccurrences_Problem_2_35fdb1ce_5937_4833_a41f_3d25d22307fe(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        Integer candidate = nums.get(0);
        for(int i=0; i<nums.size(); i++) {
            if(nums.get(i)==candidate) {
                max++;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_ebb2613f_0194_42c2_a341_c67263949da0(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> occurrences = new HashMap<>();
        int max = 0;
        for (Integer num : nums) {
            if (!occurrences.containsKey(num)) {
                occurrences.put(num, 1);
            } else {
                occurrences.put(num, occurrences.get(num) + 1);
            }
        }
        for (Integer num : occurrences.keySet()) {
            if (occurrences.get(num) > max) {
                max = occurrences.get(num);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_e4f1d41c_d40a_4cc0_91d1_3ff0c557f9ce(ArrayList<Integer> nums) {
        int max = 0;
        for(Integer x : nums) {
            if(nums.contains(x)) {
                if(nums.stream().filter(y -> y == x).count() > nums.stream().filter(y -> y != x).count()) {
                    max = x;
                }
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_30f83efa_1048_4aba_8c58_75c01e1fe508(ArrayList<Integer> nums) {
        int n = nums.size();
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : nums) {
            Integer count = map.get(num);
            map.put(num, count == null ? 1 : ++count);
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            Integer val = nums.get(i);
            if (map.get(val) > max) {
                max = map.get(val);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_caa8a273_5d01_41dd_a8eb_9449bff81633(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int count = Integer.MIN_VALUE;
        for(int num : nums) {
            if(!hm.containsKey(num)) {
                hm.put(num, 1);
            }
            else {
                hm.put(num, hm.get(num) + 1);
            }
            count = count + 1;
        }
        for(int i = 0; i < nums.size(); i++) {
            if(hm.get(nums.get(i)) > max) {
                max = hm.get(nums.get(i));
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_440eeccb_616b_4c43_a5e5_8a82f36cc3a6(ArrayList<Integer> nums) {
        int max_count=0,count=0;
        for(int num: nums) {
            if(count<=0) {
                count++;
                continue;
            }
            if(count>max_count) {
                max_count=count;
            }
            count--;
        }
        return max_count;
    }

    
    public static int maxOccurrences_Problem_1_b6d9da90_ae10_4d17_85b0_f11aa3700626(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int occ = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
                occ = 1;
            } else if (nums.get(i) == max) {
                occ++;
            }
        }
        return occ;
    }

    
    public static int maxOccurrences_Problem_2_0ac50196_ba10_4533_874c_366e89b2ac15(ArrayList<Integer> nums) {
        // your code goes here
        int max = 0;
        int curr = 0;
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) >= curr) {
                curr = nums.get(i);
            } else {
                max = Math.max(max, curr);
                curr = nums.get(i);
            }
        }
        max = Math.max(max, curr);
        return max;
    }

    
    public static int maxOccurrences_Problem_1_542f6078_9275_496a_a64d_029b411af667(ArrayList<Integer> nums) {
        int max = 0;
        int curMax = 0;
        for (int val : nums) {
            if (val == 0) {
                continue;
            }
            if (nums.contains(0)) {
                continue;
            }
            curMax = val;
            max = Math.max(max, curMax);
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_65bd2ddb_36e1_4f7d_8e94_29f919c510b1(ArrayList<Integer> nums) {
        int maxOccur = 0;
        int count = 1;
        int current;
        for(int num : nums) {
            current = num;
            count = 1;
            while(current != num) {
                current = nums.get(nums.indexOf(num) + 1);
                count++;
            }
            if(count > maxOccur)
                maxOccur = count;
        }
        return maxOccur;
    }

    
    public static int maxOccurrences_Problem_2_65bd2ddb_36e1_4f7d_8e94_29f919c510b1(ArrayList<Integer> nums) {
        int maxOccur = 0;
        int count = 1;
        int current;
        for(int num : nums) {
            current = num;
            count = 1;
            while(current != num) {
                current = nums.get(nums.indexOf(num) + 1);
                count++;
            }
            if(count > maxOccur)
                maxOccur = count;
        }
        return maxOccur;
    }

    
    public static int maxOccurrences_Problem_1_62f0ae22_380a_480e_83ac_6635665c92b8(ArrayList<Integer> nums) {
        int max = -1, freq = 0, curr;
        for(Integer num : nums) {
            curr = nums.indexOf(num) + 1;
            if(curr > freq) {
                freq = curr;
                max = num;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_4fcb3bd1_7f8c_4797_96b9_9d084f911fe7(ArrayList<Integer> nums) {
        // create a map to store frequencies
        Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();
        // set the value to 0 for each element
        for (Integer num : nums) {
            Integer count = frequencyMap.get(num);
            if (count == null) {
                frequencyMap.put(num, 0);
            } else {
                count++;
            }
        }
        int max = Integer.MIN_VALUE;
        Integer maxKey = null;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }

    
    public static int maxOccurrences_Problem_2_56605cf2_418c_4dda_94a2_c333b6f577ad(ArrayList<Integer> nums) {
        int max = 0;
        
        for(int i=0;i<nums.size();i++)
        {
            if(max == 0)
            {
                max = nums.get(i);
            }
            else
            {
                max = max + nums.get(i);
            }
        }
        
        return max;
    }

    
    public static int maxOccurrences_Problem_2_3e50fd4e_62a9_4848_827d_9f445c61bf17(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int temp = 0;
        for(int num: nums){
            if(num > temp){
                temp = num;
            }
        }
        for(int num: nums){
            if(num == temp){
                temp++;
            }
        }
        return temp;
    }

    
    public static int maxOccurrences_Problem_2_2f81ffc4_3e96_45b3_a294_69b02c958fc2(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (Integer num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1L);
            }
        }
        int max = 0;
        for (Integer num : map.keySet()) {
            if (map.get(num) > max) {
                max = map.get(num);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_eb4983ed_f239_4ee7_95da_17a7a10b30ab(ArrayList<Integer> nums) {
        int max = 0, count = 0;
        for(int i = 0; i < nums.size(); i++) {
            if(count == 0) {
                count = 1;
                max = nums.get(i);
            }
            else if(nums.get(i) == max) {
                count++;
            }
            else {
                count = 1;
                max = nums.get(i);
            }
        }
        return count;
    }

    
    public static int maxOccurrences_Problem_2_c43d0ac9_1a2d_40a6_a7d7_964ed3cee82d(ArrayList<Integer> nums) {
        Map<Integer, Integer> occurrences = new HashMap<Integer, Integer>();
        for (Integer num : nums) {
            Integer count = occurrences.get(num);
            if (count == null) {
                count = 0L;
            }
            occurrences.put(num, ++count);
        }
        Integer maxValue = 0L;
        for (Integer value : occurrences.values()) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    
    public static int maxOccurrences_Problem_0_58edc921_35a0_4fae_abe3_fafd105a295c(ArrayList<Integer> nums) {
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        int count = 0;
        for (Integer key : map.keySet()) {
            count += map.get(key);
            if (count > max) {
                max = count;
            }
        }

        return max;
    }

    
    public static int maxOccurrences_Problem_0_702117a6_bea9_4616_92ea_926417dac53f(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = 0;
        for (Integer value : nums) {
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
            } else {
                map.put(value, 1);
            }
        }
        for (Integer value : map.keySet()) {
            if (map.get(value) > max) {
                max = map.get(value);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_30f83efa_1048_4aba_8c58_75c01e1fe508(ArrayList<Integer> nums) {
        int n = nums.size();
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : nums) {
            Integer count = map.get(num);
            map.put(num, count == null ? 1 : ++count);
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            Integer val = nums.get(i);
            if (map.get(val) > max) {
                max = map.get(val);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_542f6078_9275_496a_a64d_029b411af667(ArrayList<Integer> nums) {
        int max = 0;
        int curMax = 0;
        for (int val : nums) {
            if (val == 0) {
                continue;
            }
            if (nums.contains(0)) {
                continue;
            }
            curMax = val;
            max = Math.max(max, curMax);
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_423c8be7_6aa6_489e_9a95_ea1d80284bc5(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (Integer i : nums) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }
        Integer max = 0L;
        for (Integer i : map.keySet()) {
            if (max < map.get(i)) {
                max = i;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_9336256a_61f0_4c47_a3a1_63aa593bd9ed(ArrayList<Integer> nums) {
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int n : nums) {
            if (map.containsKey(n)) {
                map.replace(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }
        for (int n : map.keySet()) {
            if (map.get(n) > max) {
                max = map.get(n);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_d4b3b0c2_4d0a_439a_bc90_e480345dd8f3(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int i = 0;
        for (Integer num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
            if (map.get(num) > max) {
                max = map.get(num);
                i = nums.indexOf(num);
            }
        }
        return nums.get(i);
    }

    
    public static int maxOccurrences_Problem_2_a0b9dffa_f1c5_4e86_9da0_4e2170f37ec0(ArrayList<Integer> nums) {
        int max = 0;
        int curr = 0;
        for(int n : nums) {
            curr = (n % 2 == 0) ? n : (n + 1);
            if(max < curr) {
                max = curr;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_754ee771_afa3_4f54_8c5e_b9659ce3da01(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = 0;
        for (Integer num : nums) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
            if(map.get(num) > max) {
                max = map.get(num);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_e13bbf43_87c6_4795_817d_4ed98f10f27c(ArrayList<Integer> nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int max = 0;
        for(int i = 0;i<nums.size();i++){
            if(map.containsKey(nums.get(i))){
                int count = map.get(nums.get(i));
                map.put(nums.get(i),++count);
            }else{
                map.put(nums.get(i),1);
            }
        }
        int maxVal = 0;
        for(int i = 0;i<nums.size();i++){
            if(map.get(nums.get(i)) > maxVal){
                maxVal = map.get(nums.get(i));
                max = nums.get(i);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_f4aa775d_bf45_468e_a3cb_3f0d8eee2ab9(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();
        for (Integer num : nums) {
            int count = 1;
            if (frequencyMap.containsKey(num)) {
                count += frequencyMap.get(num);
            }
            frequencyMap.put(num, count);
        }
        Integer maxValue = nums.get(0);
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > frequencyMap.get(maxValue)) {
                maxValue = entry.getKey();
            }
        }
        return maxValue;
    }

    
    public static int maxOccurrences_Problem_2_f01749ab_ba9a_4eca_b4d8_a2546e6ba346(ArrayList<Integer> nums) {
        int max = 0;
        int maxIndex = 0;
        for(int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);
            int count = 0;
            for(int j = 0; j < nums.size(); j++) {
                if(nums.get(j) == num) {
                    count++;
                }
            }
            if(count > max) {
                max = count;
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    
    public static int maxOccurrences_Problem_2_3d645be9_1434_4b95_a6b3_67f2d198040c(ArrayList<Integer> nums) {
        // Write your code here
        int maxCount = 0;
        int maxNum = 0;
        for(int num : nums) {
            if(num > maxNum) {
                maxNum = num;
                maxCount = 1;
            }
            else if(num == maxNum) {
                maxCount++;
            }
        }
        return maxCount;
    }

    
    public static int maxOccurrences_Problem_2_b6d9da90_ae10_4d17_85b0_f11aa3700626(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int occ = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
                occ = 1;
            } else if (nums.get(i) == max) {
                occ++;
            }
        }
        return occ;
    }

    
    public static int maxOccurrences_Problem_1_5fe1e9cf_f8a4_404c_8872_4073af822e11(ArrayList<Integer> nums) {
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_2f81ffc4_3e96_45b3_a294_69b02c958fc2(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (Integer num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1L);
            }
        }
        int max = 0;
        for (Integer num : map.keySet()) {
            if (map.get(num) > max) {
                max = map.get(num);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_5bd101c8_96cf_43c0_948f_1d25306db583(ArrayList<Integer> nums) {
        int maxCount = 0;
        int maxNum = nums.get(0);
        for (int num : nums) {
            if (num == maxNum) {
                maxCount++;
            }
            if (maxCount > nums.size()) {
                maxCount = nums.size();
                maxNum = num;
            }
        }
        return maxCount;
    }

    
    public static int maxOccurrences_Problem_2_42fd808c_c878_4464_b2b4_dc66e7f6faf1(ArrayList<Integer> nums) {
        int max = 0;
        int count = 0;
        for (int i : nums) {
            if (count == 0) {
                count = 1;
                max = i;
            } else if (i == max) {
                count++;
            } else {
                count--;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_9a350ac1_f97e_4beb_a046_fdf9bd88224c(ArrayList<Integer> nums) {
        int max_occurrences = 0;
        int temp_occurrences = 0;
        int curr_occurrences = 0;

        for(int i = 0; i < nums.size(); i++) {
            temp_occurrences = nums.get(i);
            curr_occurrences = nums.get(i);
            for(int j = i+1; j < nums.size(); j++) {
                if(nums.get(j) == temp_occurrences) {
                    curr_occurrences++;
                }
                else {
                    break;
                }
            }
            if(curr_occurrences > max_occurrences) {
                max_occurrences = curr_occurrences;
            }
        }
        return max_occurrences;
    }

    
    public static int maxOccurrences_Problem_1_e9d87c09_24b9_4e8d_aac2_b2c82d77d4f3(ArrayList<Integer> nums) {
        if (nums == null || nums.size() == 0) return 0;
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (Integer num : nums) {
            count = nums.stream().filter(x -> x == num).count();
            if (count > max) {
                max = count;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_42fd808c_c878_4464_b2b4_dc66e7f6faf1(ArrayList<Integer> nums) {
        int max = 0;
        int count = 0;
        for (int i : nums) {
            if (count == 0) {
                count = 1;
                max = i;
            } else if (i == max) {
                count++;
            } else {
                count--;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_fe7cac84_c1bd_4e35_b250_53f732e35237(ArrayList<Integer> nums) {
        if (nums == null) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0L) + 1);
        }
        return Collections.max(map.entrySet(), Comparator.comparing(Map.Entry::getValue))
                .getKey();
    }

    
    public static int maxOccurrences_Problem_2_bc285f31_dcac_4978_9380_85d711a7d1ba(ArrayList<Integer> nums) {
        int max = 0;
        int max_index = nums.get(0);
        int count = 1;
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) == max_index) {
                count++;
            } else {
                count = 1;
                max_index = nums.get(i);
            }
            if (count > max) {
                max = count;
            }
        }
        return max_index;
    }

    
    public static int maxOccurrences_Problem_2_39faa61c_1b55_4287_8e19_e4100bc64175(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int max_count = 1;
        for (Integer i: nums) {
            if (i == nums.get(0)) {
                max_count++;
            } else {
                max_count = 1;
                max = nums.get(0);
            }
            if (max_count > nums.size()) {
                return max;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_743ae3ee_dad3_4993_b9bf_e1f260966ae8(ArrayList<Integer> nums) {
        int size = nums.size();
        int[] occur = new int[size];
        int max = 0;
        for (int i = 0; i < size; i++) {
            if (nums.get(i) != 0) {
                occur[i]++;
            } else {
                occur[i] = 0;
            }
        }
        int maxi = 0;
        for (int i = 0; i < size; i++) {
            if (occur[i] > max) {
                max = occur[i];
                maxi = i;
            }
        }
        return nums.get(maxi);
    }

    
    public static int maxOccurrences_Problem_0_a235c743_2069_406e_8579_5b52ec2f03e0(ArrayList<Integer> nums) {
        int max = 0;
        Map<Integer, Integer> counts = new HashMap<>();
        for(Integer n : nums) {
            Integer c = counts.getOrDefault(n, 0L);
            counts.put(n, c + 1);
            if(counts.get(n) > max) {
                max = counts.get(n);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_4214ab81_62a0_4417_8fda_bc971b3268d4(ArrayList<Integer> nums) {
        return  nums.stream().collect(
            Collectors.groupingBy(x -> x, Collectors.counting())
        ).entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
    }

    
    public static int maxOccurrences_Problem_2_f1fd24e1_9a3a_4c44_8350_73899643c515(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (Integer num : nums) {
            map.compute(num, (k, v) -> v == null ? 1 : v + 1);
        }
        Integer result = 0L;
        for (Integer num : map.keySet()) {
            if (map.get(num) > result) {
                result = map.get(num);
            }
        }
        return result;
    }

    
    public static int maxOccurrences_Problem_0_485857af_12a5_4728_ad08_a49a9620896a(ArrayList<Integer> nums) {
        int[] arr = new int[nums.size()];
        for(int i=0; i<nums.size(); i++) {
            arr[i] = nums.get(i);
        }
        Arrays.sort(arr);
        int max = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == arr[i+1]) {
                max += i+1;
            }
            else {
                break;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_446403b1_5bce_46c9_b5be_d58a44deff41(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num : nums) {
            Integer count = map.get(num);
            if(count == null) {
                count = 0;
            }
            count++;
            map.put(num, count);
        }
        Integer max = null;
        Integer maxCount = null;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(max == null || entry.getValue() > maxCount) {
                max = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_55d91605_a1ab_42bb_a0ab_662b98d6f037(ArrayList<Integer> nums) {
        // write your code here
        int max = 0;
        int frequency = 0;
        for (Integer l : nums) {
            if (frequency == 0) {
                frequency = 1;
                max = l;
            }
            else if (l == max) {
                frequency++;
            }
            else {
                frequency = 1;
                max = l;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_f809c86b_3559_430b_bdc9_fdd48da1990c(ArrayList<Integer> nums) {
        Integer maxItem = null;
        int maxCount = 0;
        for(Integer item : nums) {
            if(item.equals(maxItem)) {
                maxCount++;
            } else {
                maxItem = item;
                maxCount = 1;
            }
        }
        return maxCount;
    }

    
    public static int maxOccurrences_Problem_2_23e37d9b_596f_476b_aa38_d879c176f3e8(ArrayList<Integer> nums) {
        int max = 0;
        int maxCount = 0;
        int maxIndex = 0;
        for(int i = 0; i < nums.size(); i++) {
            int count = nums.get(i);
            if(count > maxCount) {
                max = count;
                maxCount = count;
                maxIndex = i;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_c32abdba_76e8_4d06_aa3d_2e93e86621ff(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int result = 0;
        int max_count = 0;
        for (Integer num: nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() > max_count) {
                result = entry.getKey();
                max_count = entry.getValue();
            }
        }
        return result;
    }

    
    public static int maxOccurrences_Problem_1_bc160813_9296_4cb3_a3d0_294141b6374e(ArrayList<Integer> nums) {
        int max_count = 0;
        int prev_count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer a: nums) {
            prev_count = map.getOrDefault(a, 0L);
            map.put(a, prev_count + 1);
            if (prev_count > max_count) {
                max_count = prev_count;
            }
        }
        return max_count;
    }

    
    public static int maxOccurrences_Problem_1_b318fbfd_50c6_43c8_9ffe_d0f2b1648972(ArrayList<Integer> nums) {
        int max = 0;
        int current = 0;
        for(Integer num:nums) {
            if (num > current) {
                current = num;
                max = num;
            } else if (num == current) {
                current++;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_e162d465_1af8_4024_95f8_01dcf81ef17c(ArrayList<Integer> nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int max = 0;
        for(int n : nums)
            if(map.containsKey(n))
                map.put(n,map.get(n)+1);
            else
                map.put(n,1);
        int num = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() > num) {
                num = entry.getValue();
            }
        }
        return num;
    }

    
    public static int maxOccurrences_Problem_1_fec9ca40_6528_467d_9aa1_e16c5e25cfae(ArrayList<Integer> nums) {
        int len = nums.size();
        int ans = 0;
        int max = 0;
        int count = 1;
        for(int i=0; i < len; i++) {
            for(int j = i+1; j < len; j++) {
                if(nums.get(i) == nums.get(j)) {
                    count++;
                }
                if(count > max) {
                    max = count;
                    ans = nums.get(i);
                }
                count = 0;
            }
        }
        return ans;
    }

    
    public static int maxOccurrences_Problem_0_2dc6c68f_9a74_4d7f_ae92_9093f910aabc(ArrayList<Integer> nums) {
        //write your code here
        int max = 0;
        int maxCount = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(Integer i: nums){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() > maxCount){
                max = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_d0a4776a_fadc_4ba7_8097_597e9516ee7c(ArrayList<Integer> nums) {
        int max=0;
        for(int num: nums) {
            int occ = Collections.frequency(nums, num);
            if(occ>max) {
                max=occ;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_71add9f5_9c42_431c_9c4d_7577f9848780(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        int max = 0;
        for (Integer num : nums) {
            if (!frequency.containsKey(num)) {
                frequency.put(num, 1L);
            } else {
                frequency.put(num, frequency.get(num) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_2d2d2a9a_0732_428c_a07c_85c023e1d85f(ArrayList<Integer> nums) {
        int maxCount = 0;
        int maxNum = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num == maxNum) {
                maxCount++;
            } else {
                if (maxCount > nums.size()) {
                    maxCount = nums.size();
                    maxNum = num;
                }
            }
        }
        return maxCount;
    }

    
    public static int maxOccurrences_Problem_1_423c8be7_6aa6_489e_9a95_ea1d80284bc5(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (Integer i : nums) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }
        Integer max = 0L;
        for (Integer i : map.keySet()) {
            if (max < map.get(i)) {
                max = i;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_ca5eeb85_9941_416a_baa5_4fa76eb43db7(ArrayList<Integer> nums) {
        int max = 0;
        int maxCount = 0;
        for (int l : nums) {
            int count = 0;
            for (int n : nums) {
                if (n == l) count++;
            }
            if (count > maxCount) {
                max = l;
                maxCount = count;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_fec9ca40_6528_467d_9aa1_e16c5e25cfae(ArrayList<Integer> nums) {
        int len = nums.size();
        int ans = 0;
        int max = 0;
        int count = 1;
        for(int i=0; i < len; i++) {
            for(int j = i+1; j < len; j++) {
                if(nums.get(i) == nums.get(j)) {
                    count++;
                }
                if(count > max) {
                    max = count;
                    ans = nums.get(i);
                }
                count = 0;
            }
        }
        return ans;
    }

    
    public static int maxOccurrences_Problem_0_975e7b38_4634_4f4f_9e08_0b874a0e3e32(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer item : nums) {
            map.put(item, map.getOrDefault(item, 0L) + 1);
        }
        return map.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).findFirst().get().getValue();
    }

    
    public static int maxOccurrences_Problem_0_7b9faba9_33b3_406f_bbe6_ba7db4702b98(ArrayList<Integer> nums) {
        int maxCount = 0;
        int max = -1;
        int size = nums.size();
        int current;
        for(int i = 0; i < size; i++){
            current = nums.get(i);
            if(current > max){
                max = current;
            }
            nums.remove(i);
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_ef871bda_d91d_49c6_8566_b842c7c89d4e(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(int num : nums) {
            if(map.containsKey(num)) {
                int count = map.get(num);
                count++;
                map.put(num, count);
            } else {
                map.put(num, 1L);
            }
        }
        for (int num : map.keySet()) {
            if(max < map.get(num)) {
                max = map.get(num);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_f592235a_4c19_4ad3_85f4_a5787626c661(ArrayList<Integer> nums) {
        int max = 0;
        int maxIndex = 0;
        for(int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);
            int count = 0;
            for(int j = 0; j < nums.size(); j++) {
                if(nums.get(j) == num) {
                    count++;
                }
            }
            if(count > max) {
                max = count;
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    
    public static int maxOccurrences_Problem_1_3aab921a_8fb6_4789_841b_8183e82bbdeb(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = 0;
        for(int num : nums) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num)+1);
            } else {
                map.put(num, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_58edc921_35a0_4fae_abe3_fafd105a295c(ArrayList<Integer> nums) {
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        int count = 0;
        for (Integer key : map.keySet()) {
            count += map.get(key);
            if (count > max) {
                max = count;
            }
        }

        return max;
    }

    
    public static int maxOccurrences_Problem_2_1e1e376d_0817_4996_b636_43c176879b4b(ArrayList<Integer> nums) {
        int[] frequencies = new int[100];
        for (Integer i : nums) {
            int index = i.intValue() / 10;
            frequencies[index] += 1;
        }
        int max = 0;
        for (int i = 0; i < 100; i++) {
            if (frequencies[i] > max) {
                max = frequencies[i];
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_48daf877_76f3_4386_adf1_a9e67879477b(ArrayList<Integer> nums) {
        int max = 0;
        int maxCount = 0;
        int maxIndex = 0;
        for(int num : nums) {
            int count = Collections.frequency(nums, num);
            if(count > maxCount) {
                max = num;
                maxCount = count;
                maxIndex = num;
            }
        }
        return maxIndex;
    }

    
    public static int maxOccurrences_Problem_1_35fdb1ce_5937_4833_a41f_3d25d22307fe(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        Integer candidate = nums.get(0);
        for(int i=0; i<nums.size(); i++) {
            if(nums.get(i)==candidate) {
                max++;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_023ed690_1e7f_4be0_8de9_c9b0736906d0(ArrayList<Integer> nums) {
        int count = 1;
        int max = nums.get(0);
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) > max) {
                max = nums.get(i);
                count = 1;
            } else if(nums.get(i) == max) {
                count++;
            }
        }
        return max * count;
    }

    
    public static int maxOccurrences_Problem_2_f809c86b_3559_430b_bdc9_fdd48da1990c(ArrayList<Integer> nums) {
        Integer maxItem = null;
        int maxCount = 0;
        for(Integer item : nums) {
            if(item.equals(maxItem)) {
                maxCount++;
            } else {
                maxItem = item;
                maxCount = 1;
            }
        }
        return maxCount;
    }

    
    public static int maxOccurrences_Problem_1_702117a6_bea9_4616_92ea_926417dac53f(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = 0;
        for (Integer value : nums) {
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
            } else {
                map.put(value, 1);
            }
        }
        for (Integer value : map.keySet()) {
            if (map.get(value) > max) {
                max = map.get(value);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_c65a1932_41d4_414c_bd33_2981b8c9c83a(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (Integer num : nums) {
            map.put(num, map.getOrDefault(num, 0L) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_5ca00f3e_1494_47cc_8611_168cd6b7ab2c(ArrayList<Integer> nums) {
        if (nums.isEmpty()) return 0;
        int max = nums.stream().map(n -> n).max(Integer::compare).get();
        int count = 0;
        for (Integer num : nums) {
            if (num == max) {
                count++;
            }
        }
        return count;
    }

    
    public static int maxOccurrences_Problem_2_b37f4c40_ad3c_4873_a280_268e6a074d5f(ArrayList<Integer> nums) {
        int max = -1;
        int prev = -1;
        for(int i : nums) {
            if(prev == -1) {
                prev = i;
                continue;
            }
            if(i == prev) {
                prev += 1;
                continue;
            }
            prev = i;
        }
        return prev;
    }

    
    public static int maxOccurrences_Problem_1_7b077344_53e3_4062_9d95_5c8db76b9cec(ArrayList<Integer> nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        for (Integer i : nums) {
            if (frequencyMap.containsKey(i)) {
                frequencyMap.put(i, frequencyMap.get(i) + 1);
            } else {
                frequencyMap.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> e : frequencyMap.entrySet()) {
            if (e.getValue() > maxFrequency) {
                maxFrequency = e.getValue();
            }
        }
        return frequencyMap.get(maxFrequency);
    }

    
    public static int maxOccurrences_Problem_1_2a27a09f_857b_4849_acf4_03ad00535882(ArrayList<Integer> nums) {
        int max=0;
        int max_value=nums.get(0);
        int count=1;
        for(int i=1;i<nums.size();i++) {
            if(nums.get(i)==max_value)
                count++;
            else {
                max=Math.max(count, max);
                max_value=nums.get(i);
                count=1;
            }
        }
        max=Math.max(count, max);
        return max;
    }

    
    public static int maxOccurrences_Problem_1_6d8bc1c0_2e83_46d6_8f30_b75ac95fc95d(ArrayList<Integer> nums) {
        int maxOcc = 0;
        int currentOcc = 0;
        int i = 0;
        while(i < nums.size()) {
            if(nums.get(i) == 0) {
                i++;
                continue;
            }
            currentOcc = 1;
            while(i < nums.size() && nums.get(i) == nums.get(i - 1)) {
                i++;
                currentOcc++;
            }
            if(currentOcc > maxOcc) {
                maxOcc = currentOcc;
            }
            i++;
        }
        return maxOcc;
    }

    
    public static int maxOccurrences_Problem_1_c65a1932_41d4_414c_bd33_2981b8c9c83a(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (Integer num : nums) {
            map.put(num, map.getOrDefault(num, 0L) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_9a350ac1_f97e_4beb_a046_fdf9bd88224c(ArrayList<Integer> nums) {
        int max_occurrences = 0;
        int temp_occurrences = 0;
        int curr_occurrences = 0;

        for(int i = 0; i < nums.size(); i++) {
            temp_occurrences = nums.get(i);
            curr_occurrences = nums.get(i);
            for(int j = i+1; j < nums.size(); j++) {
                if(nums.get(j) == temp_occurrences) {
                    curr_occurrences++;
                }
                else {
                    break;
                }
            }
            if(curr_occurrences > max_occurrences) {
                max_occurrences = curr_occurrences;
            }
        }
        return max_occurrences;
    }

    
    public static int maxOccurrences_Problem_0_ef871bda_d91d_49c6_8566_b842c7c89d4e(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(int num : nums) {
            if(map.containsKey(num)) {
                int count = map.get(num);
                count++;
                map.put(num, count);
            } else {
                map.put(num, 1L);
            }
        }
        for (int num : map.keySet()) {
            if(max < map.get(num)) {
                max = map.get(num);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_2f81ffc4_3e96_45b3_a294_69b02c958fc2(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (Integer num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1L);
            }
        }
        int max = 0;
        for (Integer num : map.keySet()) {
            if (map.get(num) > max) {
                max = map.get(num);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_ec516257_5b41_41a8_94a2_4414258eb4ec(ArrayList<Integer> nums) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) != 0) {
                count++;
            } else {
                count = 0;
            }
        }
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == max) {
                count++;
            }
        }
        return count;
    }

    
    public static int maxOccurrences_Problem_1_663333ce_f566_4dc1_b081_1bf425b6394a(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(Integer n : nums) {
            if(map.containsKey(n)) {
                map.put(n, map.get(n)+1);
            } else {
                map.put(n, 1);
            }
        }
        int max = 0;
        for(int value : map.values()) {
            if(max < value) {
                max = value;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_a31dd9ea_97ed_47f7_80b4_049ba4b9880f(ArrayList<Integer> nums) {
        // Write your code here
        int max = 0;
        int val;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.size(); i++){
            val = nums.get(i);
            if(map.containsKey(val)){
                int count = map.get(val);
                count++;
                map.put(val, count);
            }else{
                map.put(val, 1);
            }
        }
        for(int k : map.keySet()){
            if(map.get(k) > max){
                max = map.get(k);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_1026e7e0_9fa5_43eb_8ab2_1417bfd9ed76(ArrayList<Integer> nums) {
        int max = 0, max_index = -1;
        int temp;
        int[] array = new int[nums.size()];
        
        for (int i = 0; i < nums.size(); i++) {
            array[i] = nums.get(i);
        }
        Arrays.sort(array);
        
        for (int i = 0; i < nums.size(); i++) {
            temp = 0;
            for (int j = i; j < nums.size(); j++) {
                if (array[i] == nums.get(j)) {
                    temp++;
                } else {
                    break;
                }
            }
            if (temp > max) {
                max = temp;
                max_index = i;
            }
        }
        return max_index;
    }

    
    public static int maxOccurrences_Problem_0_f1fd24e1_9a3a_4c44_8350_73899643c515(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (Integer num : nums) {
            map.compute(num, (k, v) -> v == null ? 1 : v + 1);
        }
        Integer result = 0L;
        for (Integer num : map.keySet()) {
            if (map.get(num) > result) {
                result = map.get(num);
            }
        }
        return result;
    }

    
    public static int maxOccurrences_Problem_2_13566a41_df26_4640_8cec_9ecdd54b03c8(ArrayList<Integer> nums) {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (Integer l : nums) {
            int occ = m.getOrDefault(l, 0);
            m.put(l, occ + 1);
        }
        return nums.stream().filter(n -> m.get(n) == 1).count();
    }

    
    public static int maxOccurrences_Problem_2_b28e9a11_ab81_4365_ab4b_1d6184cc621a(ArrayList<Integer> nums) {
        int max = 0;
        int maxCount = 0;
        int maxIndex = 0;
        for(int i = 0; i < nums.size(); i++) {
            int count = nums.get(i);
            if(count > maxCount) {
                max = count;
                maxCount = count;
                maxIndex = i;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_5d67c8d8_0758_4206_a4da_c68efc588998(ArrayList<Integer> nums) {
        int max = 0;
        int maxCount = 0;
        int maxItem = 0;
        for(int num : nums) {
            if(num > max) {
                max = num;
                maxCount = 1;
                maxItem = num;
            }
            else if(num == max) {
                maxCount++;
                if(maxCount > max) {
                    max = maxCount;
                    maxItem = num;
                }
            }
        }
        return maxItem;
    }

    
    public static int maxOccurrences_Problem_2_9d24d97c_c9c4_4771_9777_6bfd68bd35c0(ArrayList<Integer> nums) {
        int max = 0;
        int counter = 0;
        for (int i = 0; i < nums.size(); ++i) {
            for (int j = i+1; j < nums.size(); ++j) {
                if (nums.get(i) == nums.get(j)) {
                    counter++;
                }
            }
        }
        for (int i = 0; i < nums.size(); ++i) {
            if (counter > max) {
                max = counter;
            }
            counter = 0;
            for (int j = i+1; j < nums.size(); ++j) {
                if (nums.get(i) == nums.get(j)) {
                    counter++;
                }
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_49ea05b2_5182_451f_9b67_f9cd153a01d3(ArrayList<Integer> nums) {
        if(nums.size() == 0)
            return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer num : nums) {
            Integer frequency = map.getOrDefault(num, 0);
            map.put(num, frequency + 1);
        }
        Integer max = 0;
        Integer maxnum = 0L;
        for (Integer key : map.keySet()) {
            if (max < map.get(key)) {
                max = map.get(key);
                maxnum = key;
            }
        }
        return maxnum;
    }

    
    public static int maxOccurrences_Problem_2_93047a64_7bc8_40fd_b109_c2859e5f7886(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = 0, max_count = 0;
        for (int n : nums) {
            if (map.containsKey(n)) {
                max_count = Math.max(max_count, map.get(n));
            }
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max_count) {
                max = Math.max(max, entry.getKey());
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_ef871bda_d91d_49c6_8566_b842c7c89d4e(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(int num : nums) {
            if(map.containsKey(num)) {
                int count = map.get(num);
                count++;
                map.put(num, count);
            } else {
                map.put(num, 1L);
            }
        }
        for (int num : map.keySet()) {
            if(max < map.get(num)) {
                max = map.get(num);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_ebb2613f_0194_42c2_a341_c67263949da0(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> occurrences = new HashMap<>();
        int max = 0;
        for (Integer num : nums) {
            if (!occurrences.containsKey(num)) {
                occurrences.put(num, 1);
            } else {
                occurrences.put(num, occurrences.get(num) + 1);
            }
        }
        for (Integer num : occurrences.keySet()) {
            if (occurrences.get(num) > max) {
                max = occurrences.get(num);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_141d7951_287e_47eb_b367_bd68dedec6e1(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = 0;
        for(Integer n : nums) {
            if(map.containsKey(n)) {
                max = Math.max(max, map.get(n));
            }
            map.put(n, 1);
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_a910be4d_3e6a_44ef_a264_ae89aa70f77f(ArrayList<Integer> nums) {
        int max_value = Integer.MIN_VALUE;
        int max_count = 0;
        int current_count = 0;
        for (Integer num: nums) {
            if (num < max_value) {
                max_value = num;
            }
            if (num > max_value) {
                max_count = 0;
                max_value = num;
            }
            current_count = nums.indexOf(num);
            if (current_count > max_count) {
                max_count = current_count;
            }
        }
        return max_count;
    }

    
    public static int maxOccurrences_Problem_2_e9d87c09_24b9_4e8d_aac2_b2c82d77d4f3(ArrayList<Integer> nums) {
        if (nums == null || nums.size() == 0) return 0;
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (Integer num : nums) {
            count = nums.stream().filter(x -> x == num).count();
            if (count > max) {
                max = count;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_2d2d2a9a_0732_428c_a07c_85c023e1d85f(ArrayList<Integer> nums) {
        int maxCount = 0;
        int maxNum = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num == maxNum) {
                maxCount++;
            } else {
                if (maxCount > nums.size()) {
                    maxCount = nums.size();
                    maxNum = num;
                }
            }
        }
        return maxCount;
    }

    
    public static int maxOccurrences_Problem_0_90612b49_8592_4fc3_b64d_34904ada9a8b(ArrayList<Integer> nums) {
        
        return Collections.max(nums, Comparator.comparingInteger(e -> e));
    }

    
    public static int maxOccurrences_Problem_2_0434236e_343e_44e6_8168_feb516e7c5e9(ArrayList<Integer> nums) {
        HashMap<Integer,Integer> occurrences = new HashMap<>();
        for(Integer num:nums){
            if(occurrences.containsKey(num)){
                occurrences.put(num,occurrences.get(num)+1);
            }
            else{
                occurrences.put(num,1);
            }
        }
        int max = 0;
        for(Integer key:occurrences.keySet()){
            int count = occurrences.get(key);
            if(count>max){
                max = count;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_1afc9817_9bcd_485b_afc5_d15ea25d792f(ArrayList<Integer> nums) {
        int maxCount = 0;
        int maxNum = nums.get(0);
        for (int num : nums) {
            if (num == maxNum) {
                maxCount++;
            }
            if (maxCount > nums.size()) {
                maxCount = nums.size();
                maxNum = num;
            }
        }
        return maxCount;
    }

    
    public static int maxOccurrences_Problem_2_47232d99_d511_49ac_9109_f91ecc1dd09f(ArrayList<Integer> nums) {
        if (nums.size() == 0) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : nums) {
            if (map.containsKey(num)) {
                map.replace(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        return map.entrySet().stream().max((e1, e2) -> e2.getValue() - e1.getValue()).get().getKey();
    }

    
    public static int maxOccurrences_Problem_0_62f0ae22_380a_480e_83ac_6635665c92b8(ArrayList<Integer> nums) {
        int max = -1, freq = 0, curr;
        for(Integer num : nums) {
            curr = nums.indexOf(num) + 1;
            if(curr > freq) {
                freq = curr;
                max = num;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_f4da1335_1523_430e_9566_d048571f261a(ArrayList<Integer> nums) {
        
        int max = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_242c5ef4_12fd_4583_bd56_9c74c73b6c56(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0L) + 1L);
        }
        for (int i : map.keySet()) {
            int count = map.get(i);
            max = Math.max(max, count);
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_523d790f_0bf1_46ea_910a_6cfe78f8b9fd(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int freq = 1;
        for(int l : nums) {
            if(l == max) {
                freq++;
            } else {
                max = l;
                freq = 1;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_48a4be11_6cf7_4dce_8f3c_8ddb8e52347e(ArrayList<Integer> nums) {
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        for (Integer num : nums) {
            Integer countVal = count.get(num);
            countVal = countVal == null ? 0 : countVal + 1;
            count.put(num, countVal);
        }
        Integer maxVal = null;
        for (Integer val : count.values()) {
            if (maxVal == null || val > maxVal) {
                maxVal = val;
            }
        }
        return maxVal;
    }

    
    public static int maxOccurrences_Problem_0_fd32640a_be46_4ded_bff3_54a78bddfd0f(ArrayList<Integer> nums) {
        // write your code here
        Integer max = nums.get(0);
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_355ebb61_ddaa_4d44_812b_4fa2ee3adf19(ArrayList<Integer> nums) {
        int max_count = Integer.MIN_VALUE;
        int max_index = 0;
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) > max_count) {
                max_count = nums.get(i);
                max_index = i;
            }
        }
        return max_index;
    }

    
    public static int maxOccurrences_Problem_0_7b077344_53e3_4062_9d95_5c8db76b9cec(ArrayList<Integer> nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        for (Integer i : nums) {
            if (frequencyMap.containsKey(i)) {
                frequencyMap.put(i, frequencyMap.get(i) + 1);
            } else {
                frequencyMap.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> e : frequencyMap.entrySet()) {
            if (e.getValue() > maxFrequency) {
                maxFrequency = e.getValue();
            }
        }
        return frequencyMap.get(maxFrequency);
    }

    
    public static int maxOccurrences_Problem_1_2eef3c6e_6266_4bd2_a6ff_2c57434f5389(ArrayList<Integer> nums) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int max = Integer.MIN_VALUE;
        Integer value = null;
        HashSet<Integer> set = new HashSet<>();
        for(Integer num : nums) {
            set.add(num);
        }
        for (Integer num : set) {
            if(num > max){
                max = num;
                value = num;
            }
        }
        return value;
    }

    
    public static int maxOccurrences_Problem_1_981935db_ce73_4a75_bb02_cbdb034ebf3f(ArrayList<Integer> nums) {
        int res = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max = 0;
        for (int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);
            if (hm.containsKey(num)) {
                hm.put(num, hm.get(num) + 1);
            } else {
                hm.put(num, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                res = entry.getKey();
            }
        }
        return res;
    }

    
    public static int maxOccurrences_Problem_0_d4b3b0c2_4d0a_439a_bc90_e480345dd8f3(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int i = 0;
        for (Integer num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
            if (map.get(num) > max) {
                max = map.get(num);
                i = nums.indexOf(num);
            }
        }
        return nums.get(i);
    }

    
    public static int maxOccurrences_Problem_2_f592235a_4c19_4ad3_85f4_a5787626c661(ArrayList<Integer> nums) {
        int max = 0;
        int maxIndex = 0;
        for(int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);
            int count = 0;
            for(int j = 0; j < nums.size(); j++) {
                if(nums.get(j) == num) {
                    count++;
                }
            }
            if(count > max) {
                max = count;
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    
    public static int maxOccurrences_Problem_2_4fcb3bd1_7f8c_4797_96b9_9d084f911fe7(ArrayList<Integer> nums) {
        // create a map to store frequencies
        Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();
        // set the value to 0 for each element
        for (Integer num : nums) {
            Integer count = frequencyMap.get(num);
            if (count == null) {
                frequencyMap.put(num, 0);
            } else {
                count++;
            }
        }
        int max = Integer.MIN_VALUE;
        Integer maxKey = null;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }

    
    public static int maxOccurrences_Problem_0_894894f2_bca0_4cab_bcbd_8e65cc54efc5(ArrayList<Integer> nums) {
        Map<Integer, Integer> occurrences = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.size(); i++) {
            if (occurrences.containsKey(nums.get(i))) {
                occurrences.put(nums.get(i), occurrences.get(nums.get(i)) + 1);
            } else {
                occurrences.put(nums.get(i), 1);
            }
        }
        Integer max = null;
        for (Integer key : occurrences.keySet()) {
            if (max == null || occurrences.get(key) > occurrences.get(max)) {
                max = key;
            }
        }
        return occurrences.get(max);
    }

    
    public static int maxOccurrences_Problem_1_8aa0d336_3239_4d48_8de4_f7876e83c4b0(ArrayList<Integer> nums) {
        Map<Integer, Integer> m = new HashMap<>();
        for(Integer num : nums) {
            if(m.containsKey(num)) {
                m.put(num, m.get(num)+1);
            }
            else {
                m.put(num, 1);
            }
        }
        return nums.stream().filter(num -> num == nums.stream().mapToInteger(num1 -> num1).max().getAsInteger()).count();
    }

    
    public static int maxOccurrences_Problem_1_00e64e6e_a655_4f8d_834e_8e11f35f7472(ArrayList<Integer> nums) {
        int max = 0;
        int item = 0;
        int count = 0;
        for(Integer n : nums) {
            if(count == 0) {
                item = n;
                count++;
                continue;
            }
            if(item == n) {
                count++;
                continue;
            }
            if(count > max) {
                max = count;
            }
            count = 0;
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_3d645be9_1434_4b95_a6b3_67f2d198040c(ArrayList<Integer> nums) {
        // Write your code here
        int maxCount = 0;
        int maxNum = 0;
        for(int num : nums) {
            if(num > maxNum) {
                maxNum = num;
                maxCount = 1;
            }
            else if(num == maxNum) {
                maxCount++;
            }
        }
        return maxCount;
    }

    
    public static int maxOccurrences_Problem_1_a235c743_2069_406e_8579_5b52ec2f03e0(ArrayList<Integer> nums) {
        int max = 0;
        Map<Integer, Integer> counts = new HashMap<>();
        for(Integer n : nums) {
            Integer c = counts.getOrDefault(n, 0L);
            counts.put(n, c + 1);
            if(counts.get(n) > max) {
                max = counts.get(n);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_417324c2_7b34_4f8d_9dd8_dbd354f279b9(ArrayList<Integer> nums) {
        if(nums.size() == 0) return 0;
        int max = nums.get(0);
        int count = 1;
        for(Integer i: nums){
            if(i == max) count++;
            else count = 1;
            max = count>max?count:max;
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_6d8bc1c0_2e83_46d6_8f30_b75ac95fc95d(ArrayList<Integer> nums) {
        int maxOcc = 0;
        int currentOcc = 0;
        int i = 0;
        while(i < nums.size()) {
            if(nums.get(i) == 0) {
                i++;
                continue;
            }
            currentOcc = 1;
            while(i < nums.size() && nums.get(i) == nums.get(i - 1)) {
                i++;
                currentOcc++;
            }
            if(currentOcc > maxOcc) {
                maxOcc = currentOcc;
            }
            i++;
        }
        return maxOcc;
    }

    
    public static int maxOccurrences_Problem_1_52d87a90_c21b_4a08_9b88_57469a9e5479(ArrayList<Integer> nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer l : nums) {
            if(map.containsKey(l)) {
                map.put(l,map.get(l)+1);
            } else {
                map.put(l,1L);
            }
        }
        int max = 0L;
        for(Integer key : map.keySet()) {
            if(max < map.get(key)) {
                max = map.get(key);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_7bcdaeb7_1b46_49ab_bbb3_e57de85ce81d(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxCount = 0;
        for (int num: nums) {
            int count = map.getOrDefault(num, 0);
            count++;
            map.put(num, count);
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }

    
    public static int maxOccurrences_Problem_2_a778e348_8168_41fd_aef3_28335cee0d68(ArrayList<Integer> nums) {
        int[] a = new int[nums.size()];
        Arrays.fill(a, -1);
        int max = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i; j < nums.size(); j++) {
                if (nums.get(i) == nums.get(j) && a[i] < a[j]) {
                    a[i] = a[j] + 1;
                    max = Math.max(a[i], max);
                }
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_fcc11aca_52dc_4c07_99ae_49ebc49c1c43(ArrayList<Integer> nums) {
        int max = 0;
        Map<Integer, Integer> h = new HashMap<>();
        int maxCount = 0;
        for(Integer num : nums) {
            if(h.containsKey(num)) {
                h.put(num, h.get(num) + 1);
            }
            else {
                h.put(num, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : h.entrySet()) {
            if(entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                max = entry.getKey();
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_83d400e7_6d4d_488e_a669_1274595de443(ArrayList<Integer> nums) {
        int max = 0, count = 0;
        for (Integer num : nums) {
            count++;
            if (count > max) {
                max = count;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_743ae3ee_dad3_4993_b9bf_e1f260966ae8(ArrayList<Integer> nums) {
        int size = nums.size();
        int[] occur = new int[size];
        int max = 0;
        for (int i = 0; i < size; i++) {
            if (nums.get(i) != 0) {
                occur[i]++;
            } else {
                occur[i] = 0;
            }
        }
        int maxi = 0;
        for (int i = 0; i < size; i++) {
            if (occur[i] > max) {
                max = occur[i];
                maxi = i;
            }
        }
        return nums.get(maxi);
    }

    
    public static int maxOccurrences_Problem_2_06a97cd2_9ba4_44df_9fc7_0446664fd7cc(ArrayList<Integer> nums) {
        int max=0,count=0;
        for(Integer num: nums) {
            if(num==null) continue;
            if(count==0) count=1;
            else count++;
            if(count>max) max=count;
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_894894f2_bca0_4cab_bcbd_8e65cc54efc5(ArrayList<Integer> nums) {
        Map<Integer, Integer> occurrences = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.size(); i++) {
            if (occurrences.containsKey(nums.get(i))) {
                occurrences.put(nums.get(i), occurrences.get(nums.get(i)) + 1);
            } else {
                occurrences.put(nums.get(i), 1);
            }
        }
        Integer max = null;
        for (Integer key : occurrences.keySet()) {
            if (max == null || occurrences.get(key) > occurrences.get(max)) {
                max = key;
            }
        }
        return occurrences.get(max);
    }

    
    public static int maxOccurrences_Problem_0_2fa4abd4_11cd_49d9_bd66_d2a32fdb4f93(ArrayList<Integer> nums) {
        int maxCount = 0;
        int maxNum = nums.get(0); // initialize max with first element
        for (int num : nums) {
            if (num == maxNum) {
                maxCount++;
            }
            if (maxCount > nums.size()) {
                return maxCount;
            }
            maxNum = num;
        }
        return maxCount;
    }

    
    public static int maxOccurrences_Problem_0_b5895158_5bc4_47e7_92b1_ee60c240b9e1(ArrayList<Integer> nums) {
        int max = 0;
        int maxCount = 0;
        int maxIndex = 0;
        for(int num : nums) {
            int count = Collections.frequency(nums, num);
            if(count > maxCount) {
                max = num;
                maxCount = count;
                maxIndex = num;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_4fcb3bd1_7f8c_4797_96b9_9d084f911fe7(ArrayList<Integer> nums) {
        // create a map to store frequencies
        Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();
        // set the value to 0 for each element
        for (Integer num : nums) {
            Integer count = frequencyMap.get(num);
            if (count == null) {
                frequencyMap.put(num, 0);
            } else {
                count++;
            }
        }
        int max = Integer.MIN_VALUE;
        Integer maxKey = null;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }

    
    public static int maxOccurrences_Problem_2_a910be4d_3e6a_44ef_a264_ae89aa70f77f(ArrayList<Integer> nums) {
        int max_value = Integer.MIN_VALUE;
        int max_count = 0;
        int current_count = 0;
        for (Integer num: nums) {
            if (num < max_value) {
                max_value = num;
            }
            if (num > max_value) {
                max_count = 0;
                max_value = num;
            }
            current_count = nums.indexOf(num);
            if (current_count > max_count) {
                max_count = current_count;
            }
        }
        return max_count;
    }

    
    public static int maxOccurrences_Problem_1_bc285f31_dcac_4978_9380_85d711a7d1ba(ArrayList<Integer> nums) {
        int max = 0;
        int max_index = nums.get(0);
        int count = 1;
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) == max_index) {
                count++;
            } else {
                count = 1;
                max_index = nums.get(i);
            }
            if (count > max) {
                max = count;
            }
        }
        return max_index;
    }

    
    public static int maxOccurrences_Problem_1_42bcc0b7_ccb4_48f7_b714_9c1f174f7f17(ArrayList<Integer> nums) {
        int n = nums.size();
        Map<Integer,Integer> map = new HashMap<>();
        int max = 0;
        for (int num:nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_5bd101c8_96cf_43c0_948f_1d25306db583(ArrayList<Integer> nums) {
        int maxCount = 0;
        int maxNum = nums.get(0);
        for (int num : nums) {
            if (num == maxNum) {
                maxCount++;
            }
            if (maxCount > nums.size()) {
                maxCount = nums.size();
                maxNum = num;
            }
        }
        return maxCount;
    }

    
    public static int maxOccurrences_Problem_1_f29bd447_74aa_44e3_93ee_9b81028de642(ArrayList<Integer> nums) {
        if (nums.size() == 1) {
            return 1;
        }
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (Integer num : nums) {
            Integer freq = freqMap.getOrDefault(num, 0L);
            freqMap.put(num, freq + 1);
        }
        int maxFreq = Collections.max(freqMap.values());
        Integer max = null;
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == maxFreq) {
                if (max == null || entry.getKey() > max) {
                    max = entry.getKey();
                }
            }
        }
        return max == null ? 0L : max;
    }

    
    public static int maxOccurrences_Problem_2_c65a1932_41d4_414c_bd33_2981b8c9c83a(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (Integer num : nums) {
            map.put(num, map.getOrDefault(num, 0L) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_329ddc62_39da_4864_b54b_c1c0f9a7c06a(ArrayList<Integer> nums) {
        int max_freq = 0;
        int max_val = nums.get(0);
        for(int num : nums){
            int freq = Collections.frequency(nums, num);
            if(freq > max_freq){
                max_val = num;
                max_freq = freq;
            }
        }
        return max_val;
    }

    
    public static int maxOccurrences_Problem_1_417324c2_7b34_4f8d_9dd8_dbd354f279b9(ArrayList<Integer> nums) {
        if(nums.size() == 0) return 0;
        int max = nums.get(0);
        int count = 1;
        for(Integer i: nums){
            if(i == max) count++;
            else count = 1;
            max = count>max?count:max;
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_d60b4fe0_50bc_4791_a1d7_2ed9b8b186cb(ArrayList<Integer> nums) {
        // Create a map for counting frequency of each number
        Map<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        // Fill the map with all the numbers from array list
        for (Integer num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1L);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        // Create an array list to hold the maximum number for each frequency
        List<Integer> result = new ArrayList<>();
        // Populate the list with maximum value for each frequency
        for (int frequency : map.values()) {
            if (frequency > max) {
                max = frequency;
                result.clear();
                result.add(max);
            } else if (frequency == max) {
                result.add(max);
            }
        }
        // Return the first element of the list
        if (result.isEmpty()) {
            return 0;
        } else {
            return result.get(0);
        }
    }

    
    public static int maxOccurrences_Problem_2_4ab8e393_4937_4fd2_be18_83be24551fca(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (Integer num : nums) {
            if (!map.containsKey(num)) {
                count++;
                map.put(num, 1);
            } else {
                count += map.get(num);
                map.put(num, map.get(num) + 1);
            }
        }
        return nums.stream().filter(num -> map.containsKey(num))
            .max(Comparator.comparing(num -> map.get(num))).get();
    }

    
    public static int maxOccurrences_Problem_1_49ea05b2_5182_451f_9b67_f9cd153a01d3(ArrayList<Integer> nums) {
        if(nums.size() == 0)
            return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer num : nums) {
            Integer frequency = map.getOrDefault(num, 0);
            map.put(num, frequency + 1);
        }
        Integer max = 0;
        Integer maxnum = 0L;
        for (Integer key : map.keySet()) {
            if (max < map.get(key)) {
                max = map.get(key);
                maxnum = key;
            }
        }
        return maxnum;
    }

    
    public static int maxOccurrences_Problem_0_6d08b36b_65ba_4a8f_9094_aa21de3af2ba(ArrayList<Integer> nums) {
        
        return 0;
    }

    
    public static int maxOccurrences_Problem_0_fcc11aca_52dc_4c07_99ae_49ebc49c1c43(ArrayList<Integer> nums) {
        int max = 0;
        Map<Integer, Integer> h = new HashMap<>();
        int maxCount = 0;
        for(Integer num : nums) {
            if(h.containsKey(num)) {
                h.put(num, h.get(num) + 1);
            }
            else {
                h.put(num, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : h.entrySet()) {
            if(entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                max = entry.getKey();
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_3e50fd4e_62a9_4848_827d_9f445c61bf17(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int temp = 0;
        for(int num: nums){
            if(num > temp){
                temp = num;
            }
        }
        for(int num: nums){
            if(num == temp){
                temp++;
            }
        }
        return temp;
    }

    
    public static int maxOccurrences_Problem_0_754ee771_afa3_4f54_8c5e_b9659ce3da01(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = 0;
        for (Integer num : nums) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
            if(map.get(num) > max) {
                max = map.get(num);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_e671a487_5301_42f7_9a00_310b9c3bacf7(ArrayList<Integer> nums) {
        int max = 0;
        for (int n : nums) {
            if (n > max) {
                max = n;
            }
        }
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == max) {
                return max;
            }
        }
        return 0;
    }

    
    public static int maxOccurrences_Problem_1_8dc77962_f84e_46c1_83f7_be60ca164d8d(ArrayList<Integer> nums) {
        int max = nums.stream().map(n -> n).collect(Collectors.toList()).stream().distinct().count();
        return max;
    }

    
    public static int maxOccurrences_Problem_1_9ed87abc_756b_42ec_a157_b64c47710479(ArrayList<Integer> nums) {
        // Write your code here
        Integer[] arr = nums.toArray(new Integer[nums.size()]);
        Arrays.sort(arr);
        int maxFreq = 0;
        Integer maxValue = arr[arr.length-1];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == maxValue) {
                maxFreq += 1;
            } else {
                break;
            }
        }
        return maxFreq;
    }

    
    public static int maxOccurrences_Problem_1_e4a354d8_4e78_4d42_b16e_a763bb4ea25e(ArrayList<Integer> nums) {
        if(nums.size()==0){
            return 0;
        }
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.size();i++){
            int occurences=0;
            Integer key=nums.get(i);
            if(map.containsKey(key)){
                occurences=map.get(key)+1;
            }else{
                occurences=1;
            }
            map.put(key,occurences);
        }
        int max=0;
        for(Integer key:map.keySet()){
            if(map.get(key)>max){
                max=map.get(key);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_2dc6c68f_9a74_4d7f_ae92_9093f910aabc(ArrayList<Integer> nums) {
        //write your code here
        int max = 0;
        int maxCount = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(Integer i: nums){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() > maxCount){
                max = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_2fa4abd4_11cd_49d9_bd66_d2a32fdb4f93(ArrayList<Integer> nums) {
        int maxCount = 0;
        int maxNum = nums.get(0); // initialize max with first element
        for (int num : nums) {
            if (num == maxNum) {
                maxCount++;
            }
            if (maxCount > nums.size()) {
                return maxCount;
            }
            maxNum = num;
        }
        return maxCount;
    }

    
    public static int maxOccurrences_Problem_2_468cc36f_3dd2_4655_a5ef_35775eac5ef8(ArrayList<Integer> nums) {
        // Your code goes here
        // Use HashMap to store value and frequency
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(Integer element : nums){
            if(hashMap.containsKey(element)){
                hashMap.put(element, hashMap.get(element) + 1);
            }
            else{
                hashMap.put(element, 1);
            }
        }
        // Use TreeMap to store frequency and value
        TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        for(Integer element : nums){
            map.put(hashMap.get(element), element);
        }
        return map.lastEntry().getValue();
    }

    
    public static int maxOccurrences_Problem_2_ee666b3c_d758_4895_b0db_5936683c95c8(ArrayList<Integer> nums) {
        int max=0,occur=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(Integer num:nums)
            if(map.containsKey(num))
                occur=map.get(num);
            else {
                map.put(num,1);
                occur=1;
            }
        for(Integer num:map.keySet())
            if(map.get(num)>occur) {
                max=num;
                occur=map.get(num);
            }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_2d2d2a9a_0732_428c_a07c_85c023e1d85f(ArrayList<Integer> nums) {
        int maxCount = 0;
        int maxNum = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num == maxNum) {
                maxCount++;
            } else {
                if (maxCount > nums.size()) {
                    maxCount = nums.size();
                    maxNum = num;
                }
            }
        }
        return maxCount;
    }

    
    public static int maxOccurrences_Problem_2_1a0046df_0d63_4ecd_bbc8_f8d89a774b6e(ArrayList<Integer> nums) {
        // Your code here
        //System.out.println(nums.size());
        Map<Integer, Integer> h = new HashMap<>();
        for (int num : nums) {
            if (!h.containsKey(num)) {
                h.put(num, 1L);
            } else {
                h.put(num, h.get(num) + 1L);
            }
        }
        int result = 0;
        for (Integer k : h.keySet()) {
            if (h.get(k) > result) {
                result = h.get(k);
            }
        }
        return result;
    }

    
    public static int maxOccurrences_Problem_0_4214ab81_62a0_4417_8fda_bc971b3268d4(ArrayList<Integer> nums) {
        return  nums.stream().collect(
            Collectors.groupingBy(x -> x, Collectors.counting())
        ).entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
    }

    
    public static int maxOccurrences_Problem_2_83d400e7_6d4d_488e_a669_1274595de443(ArrayList<Integer> nums) {
        int max = 0, count = 0;
        for (Integer num : nums) {
            count++;
            if (count > max) {
                max = count;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_440eeccb_616b_4c43_a5e5_8a82f36cc3a6(ArrayList<Integer> nums) {
        int max_count=0,count=0;
        for(int num: nums) {
            if(count<=0) {
                count++;
                continue;
            }
            if(count>max_count) {
                max_count=count;
            }
            count--;
        }
        return max_count;
    }

    
    public static int maxOccurrences_Problem_1_eb4983ed_f239_4ee7_95da_17a7a10b30ab(ArrayList<Integer> nums) {
        int max = 0, count = 0;
        for(int i = 0; i < nums.size(); i++) {
            if(count == 0) {
                count = 1;
                max = nums.get(i);
            }
            else if(nums.get(i) == max) {
                count++;
            }
            else {
                count = 1;
                max = nums.get(i);
            }
        }
        return count;
    }

    
    public static int maxOccurrences_Problem_2_975e7b38_4634_4f4f_9e08_0b874a0e3e32(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer item : nums) {
            map.put(item, map.getOrDefault(item, 0L) + 1);
        }
        return map.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).findFirst().get().getValue();
    }

    
    public static int maxOccurrences_Problem_1_7a631f4f_323d_4c0c_b3c3_3c70d5b50a69(ArrayList<Integer> nums) {
        int maxCount = 0;
        int maxNum = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num == maxNum) {
                maxCount++;
            } else {
                if (maxCount > nums.size()) {
                    maxCount = nums.size();
                    maxNum = num;
                }
            }
        }
        return maxCount;
    }

    
    public static int maxOccurrences_Problem_2_2970e0db_5d61_4da3_960c_7267305045d4(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = 0;
        for (int i : nums) {
            int freq = 0;
            if (map.containsKey(i)) {
                freq = map.get(i);
            }
            freq++;
            map.put(i, freq);
            max = Math.max(max, freq);
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_7925bf2e_fce0_4939_af8c_e6e1773a8b34(ArrayList<Integer> nums) {
        int max_count = 0;
        int current_count = 0;
        int temp_count = 0;
        
        for(int num : nums) {
            if(current_count == 0) {
                temp_count = 1;
            } else {
                current_count++;
            }
            
            if(temp_count > max_count) {
                max_count = temp_count;
            }
        }
        
        return max_count;
    }

    
    public static int maxOccurrences_Problem_2_ec516257_5b41_41a8_94a2_4414258eb4ec(ArrayList<Integer> nums) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) != 0) {
                count++;
            } else {
                count = 0;
            }
        }
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == max) {
                count++;
            }
        }
        return count;
    }

    
    public static int maxOccurrences_Problem_1_a9e6e331_a0ca_4587_886b_c84a7364ff4e(ArrayList<Integer> nums) {
        // Write your code here
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_3db09979_9038_429b_ad97_c632613dccc8(ArrayList<Integer> nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.size();i++) {
            Integer item = nums.get(i);
            int freq = 0;
            if(map.containsKey(item)) {
                freq = map.get(item);
            }
            map.put(item,freq+1);
        }
        return map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
    }

    
    public static int maxOccurrences_Problem_0_2a27a09f_857b_4849_acf4_03ad00535882(ArrayList<Integer> nums) {
        int max=0;
        int max_value=nums.get(0);
        int count=1;
        for(int i=1;i<nums.size();i++) {
            if(nums.get(i)==max_value)
                count++;
            else {
                max=Math.max(count, max);
                max_value=nums.get(i);
                count=1;
            }
        }
        max=Math.max(count, max);
        return max;
    }

    
    public static int maxOccurrences_Problem_2_5ca00f3e_1494_47cc_8611_168cd6b7ab2c(ArrayList<Integer> nums) {
        if (nums.isEmpty()) return 0;
        int max = nums.stream().map(n -> n).max(Integer::compare).get();
        int count = 0;
        for (Integer num : nums) {
            if (num == max) {
                count++;
            }
        }
        return count;
    }

    
    public static int maxOccurrences_Problem_0_55d91605_a1ab_42bb_a0ab_662b98d6f037(ArrayList<Integer> nums) {
        // write your code here
        int max = 0;
        int frequency = 0;
        for (Integer l : nums) {
            if (frequency == 0) {
                frequency = 1;
                max = l;
            }
            else if (l == max) {
                frequency++;
            }
            else {
                frequency = 1;
                max = l;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_b5895158_5bc4_47e7_92b1_ee60c240b9e1(ArrayList<Integer> nums) {
        int max = 0;
        int maxCount = 0;
        int maxIndex = 0;
        for(int num : nums) {
            int count = Collections.frequency(nums, num);
            if(count > maxCount) {
                max = num;
                maxCount = count;
                maxIndex = num;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_b97d9877_ddaa_4711_8bc2_b546584022fc(ArrayList<Integer> nums) {
        int max = 0;
        int freq = 0;
        for (Integer n : nums) {
            if (n > max) {
                max = n;
                freq = 1;
            }
            else if (n == max) {
                freq++;
            }
        }
        return freq;
    }

    
    public static int maxOccurrences_Problem_2_3aab921a_8fb6_4789_841b_8183e82bbdeb(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = 0;
        for(int num : nums) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num)+1);
            } else {
                map.put(num, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_4214ab81_62a0_4417_8fda_bc971b3268d4(ArrayList<Integer> nums) {
        return  nums.stream().collect(
            Collectors.groupingBy(x -> x, Collectors.counting())
        ).entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
    }

    
    public static int maxOccurrences_Problem_1_23e37d9b_596f_476b_aa38_d879c176f3e8(ArrayList<Integer> nums) {
        int max = 0;
        int maxCount = 0;
        int maxIndex = 0;
        for(int i = 0; i < nums.size(); i++) {
            int count = nums.get(i);
            if(count > maxCount) {
                max = count;
                maxCount = count;
                maxIndex = i;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_3e50fd4e_62a9_4848_827d_9f445c61bf17(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int temp = 0;
        for(int num: nums){
            if(num > temp){
                temp = num;
            }
        }
        for(int num: nums){
            if(num == temp){
                temp++;
            }
        }
        return temp;
    }

    
    public static int maxOccurrences_Problem_1_141d7951_287e_47eb_b367_bd68dedec6e1(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = 0;
        for(Integer n : nums) {
            if(map.containsKey(n)) {
                max = Math.max(max, map.get(n));
            }
            map.put(n, 1);
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_9c1b78c6_d456_4b24_8e4c_cae92f992b08(ArrayList<Integer> nums) {
        int count = 0, maxCount = 0, result = 0;
        for (int i: nums) {
            if (count > 0) {
                count--;
                result = maxCount > result ? maxCount : result;
            }
            maxCount++;
            count++;
        }
        return result;
    }

    
    public static int maxOccurrences_Problem_0_7a631f4f_323d_4c0c_b3c3_3c70d5b50a69(ArrayList<Integer> nums) {
        int maxCount = 0;
        int maxNum = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num == maxNum) {
                maxCount++;
            } else {
                if (maxCount > nums.size()) {
                    maxCount = nums.size();
                    maxNum = num;
                }
            }
        }
        return maxCount;
    }

    
    public static int maxOccurrences_Problem_0_981935db_ce73_4a75_bb02_cbdb034ebf3f(ArrayList<Integer> nums) {
        int res = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max = 0;
        for (int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);
            if (hm.containsKey(num)) {
                hm.put(num, hm.get(num) + 1);
            } else {
                hm.put(num, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                res = entry.getKey();
            }
        }
        return res;
    }

    
    public static int maxOccurrences_Problem_1_1e1e376d_0817_4996_b636_43c176879b4b(ArrayList<Integer> nums) {
        int[] frequencies = new int[100];
        for (Integer i : nums) {
            int index = i.intValue() / 10;
            frequencies[index] += 1;
        }
        int max = 0;
        for (int i = 0; i < 100; i++) {
            if (frequencies[i] > max) {
                max = frequencies[i];
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_90612b49_8592_4fc3_b64d_34904ada9a8b(ArrayList<Integer> nums) {
        
        return Collections.max(nums, Comparator.comparingInteger(e -> e));
    }

    
    public static int maxOccurrences_Problem_0_2970e0db_5d61_4da3_960c_7267305045d4(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = 0;
        for (int i : nums) {
            int freq = 0;
            if (map.containsKey(i)) {
                freq = map.get(i);
            }
            freq++;
            map.put(i, freq);
            max = Math.max(max, freq);
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_f3d32a36_41f5_4c9d_aaef_33d91bc66ef2(ArrayList<Integer> nums) {
        int maxFreq = 0, maxOccur = 0;
        Set<Integer> hashSet = new HashSet<Integer>();
        for (Integer num : nums) {
            if (hashSet.contains(num)) {
                hashSet.remove(num);
                hashSet.add(num);
            } else {
                hashSet.add(num);
            }
        }
        for (Integer num : hashSet) {
            maxOccur = nums.size();
            maxFreq = nums.size();
            for (Integer num2 : nums) {
                if (num2 == num) {
                    maxOccur--;
                    maxFreq--;
                }
            }
            if (maxOccur > 0) {
                maxFreq = nums.size();
            } else {
                maxOccur = nums.size();
            }
        }
        return maxFreq;
    }

    
    public static int maxOccurrences_Problem_2_e13bbf43_87c6_4795_817d_4ed98f10f27c(ArrayList<Integer> nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int max = 0;
        for(int i = 0;i<nums.size();i++){
            if(map.containsKey(nums.get(i))){
                int count = map.get(nums.get(i));
                map.put(nums.get(i),++count);
            }else{
                map.put(nums.get(i),1);
            }
        }
        int maxVal = 0;
        for(int i = 0;i<nums.size();i++){
            if(map.get(nums.get(i)) > maxVal){
                maxVal = map.get(nums.get(i));
                max = nums.get(i);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_42d9e325_3403_43aa_be3d_41171f728d2f(ArrayList<Integer> nums) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        for(Integer num : nums) {
            if(!occurrences.containsKey(num)) {
                occurrences.put(num, 1);
            } else {
                occurrences.put(num, occurrences.get(num) + 1);
            }
        }
        return occurrences.entrySet().stream().max((e1, e2) -> e1.getValue().compareTo(e2.getValue())).get().getKey();
    }

    
    public static int maxOccurrences_Problem_2_1026e7e0_9fa5_43eb_8ab2_1417bfd9ed76(ArrayList<Integer> nums) {
        int max = 0, max_index = -1;
        int temp;
        int[] array = new int[nums.size()];
        
        for (int i = 0; i < nums.size(); i++) {
            array[i] = nums.get(i);
        }
        Arrays.sort(array);
        
        for (int i = 0; i < nums.size(); i++) {
            temp = 0;
            for (int j = i; j < nums.size(); j++) {
                if (array[i] == nums.get(j)) {
                    temp++;
                } else {
                    break;
                }
            }
            if (temp > max) {
                max = temp;
                max_index = i;
            }
        }
        return max_index;
    }

    
    public static int maxOccurrences_Problem_0_0434236e_343e_44e6_8168_feb516e7c5e9(ArrayList<Integer> nums) {
        HashMap<Integer,Integer> occurrences = new HashMap<>();
        for(Integer num:nums){
            if(occurrences.containsKey(num)){
                occurrences.put(num,occurrences.get(num)+1);
            }
            else{
                occurrences.put(num,1);
            }
        }
        int max = 0;
        for(Integer key:occurrences.keySet()){
            int count = occurrences.get(key);
            if(count>max){
                max = count;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_8aa0d336_3239_4d48_8de4_f7876e83c4b0(ArrayList<Integer> nums) {
        Map<Integer, Integer> m = new HashMap<>();
        for(Integer num : nums) {
            if(m.containsKey(num)) {
                m.put(num, m.get(num)+1);
            }
            else {
                m.put(num, 1);
            }
        }
        return nums.stream().filter(num -> num == nums.stream().mapToInteger(num1 -> num1).max().getAsInteger()).count();
    }

    
    public static int maxOccurrences_Problem_0_542f6078_9275_496a_a64d_029b411af667(ArrayList<Integer> nums) {
        int max = 0;
        int curMax = 0;
        for (int val : nums) {
            if (val == 0) {
                continue;
            }
            if (nums.contains(0)) {
                continue;
            }
            curMax = val;
            max = Math.max(max, curMax);
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_e9d87c09_24b9_4e8d_aac2_b2c82d77d4f3(ArrayList<Integer> nums) {
        if (nums == null || nums.size() == 0) return 0;
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (Integer num : nums) {
            count = nums.stream().filter(x -> x == num).count();
            if (count > max) {
                max = count;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_198d4a92_5784_4c52_b8c0_d07fb3b56231(ArrayList<Integer> nums) {
        int max = 0;
        int frequency = 1;
        int count = 0;
        int result = 0;
        for (int value : nums) {
            count++;
            if (count == 1) {
                result = value;
                frequency = 1;
            } else if (count == 2) {
                frequency++;
            } else if (value != result) {
                frequency++;
                count = 1;
            } else {
                frequency++;
            }
            if (frequency > max) {
                max = frequency;
            }
        }
        return result;
    }

    
    public static int maxOccurrences_Problem_1_1a0046df_0d63_4ecd_bbc8_f8d89a774b6e(ArrayList<Integer> nums) {
        // Your code here
        //System.out.println(nums.size());
        Map<Integer, Integer> h = new HashMap<>();
        for (int num : nums) {
            if (!h.containsKey(num)) {
                h.put(num, 1L);
            } else {
                h.put(num, h.get(num) + 1L);
            }
        }
        int result = 0;
        for (Integer k : h.keySet()) {
            if (h.get(k) > result) {
                result = h.get(k);
            }
        }
        return result;
    }

    
    public static int maxOccurrences_Problem_1_ce5984e6_600d_4751_b110_8616a6bc903d(ArrayList<Integer> nums) {
        int max = 0;
        int maxCount = 0;
        int maxIndex = 0;
        for(int i = 0; i < nums.size(); i++) {
            int count = nums.get(i);
            if(count > maxCount) {
                max = count;
                maxCount = count;
                maxIndex = i;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_e4a354d8_4e78_4d42_b16e_a763bb4ea25e(ArrayList<Integer> nums) {
        if(nums.size()==0){
            return 0;
        }
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.size();i++){
            int occurences=0;
            Integer key=nums.get(i);
            if(map.containsKey(key)){
                occurences=map.get(key)+1;
            }else{
                occurences=1;
            }
            map.put(key,occurences);
        }
        int max=0;
        for(Integer key:map.keySet()){
            if(map.get(key)>max){
                max=map.get(key);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_a92b4e45_6a7b_4898_9d1e_dd92ea9d15c0(ArrayList<Integer> nums) {
        int max = 0;
        int count = 0;
        for(Integer i : nums) {
            if(count > 0 && nums.contains(i)) {
                count--;
            } else {
                count++;
            }
            max = Math.max(max, count);
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_0434236e_343e_44e6_8168_feb516e7c5e9(ArrayList<Integer> nums) {
        HashMap<Integer,Integer> occurrences = new HashMap<>();
        for(Integer num:nums){
            if(occurrences.containsKey(num)){
                occurrences.put(num,occurrences.get(num)+1);
            }
            else{
                occurrences.put(num,1);
            }
        }
        int max = 0;
        for(Integer key:occurrences.keySet()){
            int count = occurrences.get(key);
            if(count>max){
                max = count;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_1026e7e0_9fa5_43eb_8ab2_1417bfd9ed76(ArrayList<Integer> nums) {
        int max = 0, max_index = -1;
        int temp;
        int[] array = new int[nums.size()];
        
        for (int i = 0; i < nums.size(); i++) {
            array[i] = nums.get(i);
        }
        Arrays.sort(array);
        
        for (int i = 0; i < nums.size(); i++) {
            temp = 0;
            for (int j = i; j < nums.size(); j++) {
                if (array[i] == nums.get(j)) {
                    temp++;
                } else {
                    break;
                }
            }
            if (temp > max) {
                max = temp;
                max_index = i;
            }
        }
        return max_index;
    }

    
    public static int maxOccurrences_Problem_2_9336256a_61f0_4c47_a3a1_63aa593bd9ed(ArrayList<Integer> nums) {
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int n : nums) {
            if (map.containsKey(n)) {
                map.replace(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }
        for (int n : map.keySet()) {
            if (map.get(n) > max) {
                max = map.get(n);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_9336256a_61f0_4c47_a3a1_63aa593bd9ed(ArrayList<Integer> nums) {
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int n : nums) {
            if (map.containsKey(n)) {
                map.replace(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }
        for (int n : map.keySet()) {
            if (map.get(n) > max) {
                max = map.get(n);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_d4b3b0c2_4d0a_439a_bc90_e480345dd8f3(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int i = 0;
        for (Integer num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
            if (map.get(num) > max) {
                max = map.get(num);
                i = nums.indexOf(num);
            }
        }
        return nums.get(i);
    }

    
    public static int maxOccurrences_Problem_1_9d24d97c_c9c4_4771_9777_6bfd68bd35c0(ArrayList<Integer> nums) {
        int max = 0;
        int counter = 0;
        for (int i = 0; i < nums.size(); ++i) {
            for (int j = i+1; j < nums.size(); ++j) {
                if (nums.get(i) == nums.get(j)) {
                    counter++;
                }
            }
        }
        for (int i = 0; i < nums.size(); ++i) {
            if (counter > max) {
                max = counter;
            }
            counter = 0;
            for (int j = i+1; j < nums.size(); ++j) {
                if (nums.get(i) == nums.get(j)) {
                    counter++;
                }
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_b6d9da90_ae10_4d17_85b0_f11aa3700626(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int occ = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
                occ = 1;
            } else if (nums.get(i) == max) {
                occ++;
            }
        }
        return occ;
    }

    
    public static int maxOccurrences_Problem_2_fe7cac84_c1bd_4e35_b250_53f732e35237(ArrayList<Integer> nums) {
        if (nums == null) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0L) + 1);
        }
        return Collections.max(map.entrySet(), Comparator.comparing(Map.Entry::getValue))
                .getKey();
    }

    
    public static int maxOccurrences_Problem_1_d0a4776a_fadc_4ba7_8097_597e9516ee7c(ArrayList<Integer> nums) {
        int max=0;
        for(int num: nums) {
            int occ = Collections.frequency(nums, num);
            if(occ>max) {
                max=occ;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_b318fbfd_50c6_43c8_9ffe_d0f2b1648972(ArrayList<Integer> nums) {
        int max = 0;
        int current = 0;
        for(Integer num:nums) {
            if (num > current) {
                current = num;
                max = num;
            } else if (num == current) {
                current++;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_1a0046df_0d63_4ecd_bbc8_f8d89a774b6e(ArrayList<Integer> nums) {
        // Your code here
        //System.out.println(nums.size());
        Map<Integer, Integer> h = new HashMap<>();
        for (int num : nums) {
            if (!h.containsKey(num)) {
                h.put(num, 1L);
            } else {
                h.put(num, h.get(num) + 1L);
            }
        }
        int result = 0;
        for (Integer k : h.keySet()) {
            if (h.get(k) > result) {
                result = h.get(k);
            }
        }
        return result;
    }

    
    public static int maxOccurrences_Problem_1_fd32640a_be46_4ded_bff3_54a78bddfd0f(ArrayList<Integer> nums) {
        // write your code here
        Integer max = nums.get(0);
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_a21745ab_7069_47d9_9fcd_61915f2147eb(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1L);
            }
        }
        int max = 0;
        for (int key : map.keySet()) {
            max = Math.max(max, map.get(key));
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_aad1e19e_e4f0_4d9f_a13c_c43dfd0ddb2f(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1L);
            }
        }
        int max = 0;
        for (int key : map.keySet()) {
            max = Math.max(max, map.get(key));
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_a778e348_8168_41fd_aef3_28335cee0d68(ArrayList<Integer> nums) {
        int[] a = new int[nums.size()];
        Arrays.fill(a, -1);
        int max = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i; j < nums.size(); j++) {
                if (nums.get(i) == nums.get(j) && a[i] < a[j]) {
                    a[i] = a[j] + 1;
                    max = Math.max(a[i], max);
                }
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_34a59c88_3aed_45c6_ada6_46db20695092(ArrayList<Integer> nums) {
        int maxVal = nums.stream().map(Integer::valueOf).collect(Collectors.toMap(Integer::valueOf,v -> v,(v1,v2) -> v1)).values().stream().collect(Collectors.maxBy(Comparator.naturalOrder())).get();
        return maxVal;
    }

    
    public static int maxOccurrences_Problem_0_6d8bc1c0_2e83_46d6_8f30_b75ac95fc95d(ArrayList<Integer> nums) {
        int maxOcc = 0;
        int currentOcc = 0;
        int i = 0;
        while(i < nums.size()) {
            if(nums.get(i) == 0) {
                i++;
                continue;
            }
            currentOcc = 1;
            while(i < nums.size() && nums.get(i) == nums.get(i - 1)) {
                i++;
                currentOcc++;
            }
            if(currentOcc > maxOcc) {
                maxOcc = currentOcc;
            }
            i++;
        }
        return maxOcc;
    }

    
    public static int maxOccurrences_Problem_0_96c3669f_be4e_4af2_a615_49217c8eef7e(ArrayList<Integer> nums) {
        int max = 0;
        int result = nums.get(0);
        for (int i = 1; i < nums.size(); ++i) {
            if (nums.get(i) > result) {
                result = nums.get(i);
                max = 1;
            }
            else if (nums.get(i) == result) {
                ++max;
            }
        }
        return result;
    }

    
    public static int maxOccurrences_Problem_0_34a59c88_3aed_45c6_ada6_46db20695092(ArrayList<Integer> nums) {
        int maxVal = nums.stream().map(Integer::valueOf).collect(Collectors.toMap(Integer::valueOf,v -> v,(v1,v2) -> v1)).values().stream().collect(Collectors.maxBy(Comparator.naturalOrder())).get();
        return maxVal;
    }

    
    public static int maxOccurrences_Problem_0_1e526295_aa6f_4e08_8030_2425a33b291f(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(Integer num : nums) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for(Integer freq : map.values()) {
            if(max < freq) {
                max = freq;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_e162d465_1af8_4024_95f8_01dcf81ef17c(ArrayList<Integer> nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int max = 0;
        for(int n : nums)
            if(map.containsKey(n))
                map.put(n,map.get(n)+1);
            else
                map.put(n,1);
        int num = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() > num) {
                num = entry.getValue();
            }
        }
        return num;
    }

    
    public static int maxOccurrences_Problem_1_c9d8b48a_a928_485d_a182_df0f6eddb807(ArrayList<Integer> nums) {
        // Write your code here
        int max = 0;
        int cur = 0;
        for(int i : nums) {
            cur++;
            if(cur > max) {
                max = cur;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_62f0ae22_380a_480e_83ac_6635665c92b8(ArrayList<Integer> nums) {
        int max = -1, freq = 0, curr;
        for(Integer num : nums) {
            curr = nums.indexOf(num) + 1;
            if(curr > freq) {
                freq = curr;
                max = num;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_7925bf2e_fce0_4939_af8c_e6e1773a8b34(ArrayList<Integer> nums) {
        int max_count = 0;
        int current_count = 0;
        int temp_count = 0;
        
        for(int num : nums) {
            if(current_count == 0) {
                temp_count = 1;
            } else {
                current_count++;
            }
            
            if(temp_count > max_count) {
                max_count = temp_count;
            }
        }
        
        return max_count;
    }

    
    public static int maxOccurrences_Problem_1_13566a41_df26_4640_8cec_9ecdd54b03c8(ArrayList<Integer> nums) {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (Integer l : nums) {
            int occ = m.getOrDefault(l, 0);
            m.put(l, occ + 1);
        }
        return nums.stream().filter(n -> m.get(n) == 1).count();
    }

    
    public static int maxOccurrences_Problem_2_ca5eeb85_9941_416a_baa5_4fa76eb43db7(ArrayList<Integer> nums) {
        int max = 0;
        int maxCount = 0;
        for (int l : nums) {
            int count = 0;
            for (int n : nums) {
                if (n == l) count++;
            }
            if (count > maxCount) {
                max = l;
                maxCount = count;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_37f717e6_4e44_42ed_8635_a804175ad007(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Integer max = nums.get(0);
        int count = 0;
        for (Integer num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                int count1 = map.get(num);
                count1++;
                map.put(num, count1);
                if (count1 > count) {
                    count = count1;
                    max = num;
                }
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_1afc9817_9bcd_485b_afc5_d15ea25d792f(ArrayList<Integer> nums) {
        int maxCount = 0;
        int maxNum = nums.get(0);
        for (int num : nums) {
            if (num == maxNum) {
                maxCount++;
            }
            if (maxCount > nums.size()) {
                maxCount = nums.size();
                maxNum = num;
            }
        }
        return maxCount;
    }

    
    public static int maxOccurrences_Problem_2_663333ce_f566_4dc1_b081_1bf425b6394a(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(Integer n : nums) {
            if(map.containsKey(n)) {
                map.put(n, map.get(n)+1);
            } else {
                map.put(n, 1);
            }
        }
        int max = 0;
        for(int value : map.values()) {
            if(max < value) {
                max = value;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_141d7951_287e_47eb_b367_bd68dedec6e1(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = 0;
        for(Integer n : nums) {
            if(map.containsKey(n)) {
                max = Math.max(max, map.get(n));
            }
            map.put(n, 1);
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_49ea05b2_5182_451f_9b67_f9cd153a01d3(ArrayList<Integer> nums) {
        if(nums.size() == 0)
            return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer num : nums) {
            Integer frequency = map.getOrDefault(num, 0);
            map.put(num, frequency + 1);
        }
        Integer max = 0;
        Integer maxnum = 0L;
        for (Integer key : map.keySet()) {
            if (max < map.get(key)) {
                max = map.get(key);
                maxnum = key;
            }
        }
        return maxnum;
    }

    
    public static int maxOccurrences_Problem_2_355ebb61_ddaa_4d44_812b_4fa2ee3adf19(ArrayList<Integer> nums) {
        int max_count = Integer.MIN_VALUE;
        int max_index = 0;
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) > max_count) {
                max_count = nums.get(i);
                max_index = i;
            }
        }
        return max_index;
    }

    
    public static int maxOccurrences_Problem_2_f4da1335_1523_430e_9566_d048571f261a(ArrayList<Integer> nums) {
        
        int max = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_630aa7da_b4e1_450d_8b80_6694cbc45805(ArrayList<Integer> nums) {
        // write your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int counter = 0;
        for (int num : nums) {
            if (map.containsKey(num)) {
                counter = map.get(num);
                counter++;
                map.put(num, counter);
            } else {
                counter = 1;
                map.put(num, counter);
            }
            if (counter > max) {
                max = counter;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_630aa7da_b4e1_450d_8b80_6694cbc45805(ArrayList<Integer> nums) {
        // write your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int counter = 0;
        for (int num : nums) {
            if (map.containsKey(num)) {
                counter = map.get(num);
                counter++;
                map.put(num, counter);
            } else {
                counter = 1;
                map.put(num, counter);
            }
            if (counter > max) {
                max = counter;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_a21745ab_7069_47d9_9fcd_61915f2147eb(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1L);
            }
        }
        int max = 0;
        for (int key : map.keySet()) {
            max = Math.max(max, map.get(key));
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_b97d9877_ddaa_4711_8bc2_b546584022fc(ArrayList<Integer> nums) {
        int max = 0;
        int freq = 0;
        for (Integer n : nums) {
            if (n > max) {
                max = n;
                freq = 1;
            }
            else if (n == max) {
                freq++;
            }
        }
        return freq;
    }

    
    public static int maxOccurrences_Problem_2_35bbb628_b324_4609_b945_3f95e5eba3a1(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for(Integer num : nums) {
            Integer occ = map.get(num);
            if(occ == null) {
                occ = 0L;
            }
            map.put(num, ++occ);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_e07b1266_3c90_4ec2_b6f0_b0d2c5c86f1c(ArrayList<Integer> nums) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        int max = 0;
        for(Integer n : nums) {
            Integer o = occurrences.get(n);
            if(o == null) {
                occurrences.put(n, 1);
            } else {
                occurrences.put(n, o + 1);
            }
        }
        for(Map.Entry<Integer, Integer> e : occurrences.entrySet()) {
            int count = e.getValue();
            if(count > max) {
                max = count;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_9c1b78c6_d456_4b24_8e4c_cae92f992b08(ArrayList<Integer> nums) {
        int count = 0, maxCount = 0, result = 0;
        for (int i: nums) {
            if (count > 0) {
                count--;
                result = maxCount > result ? maxCount : result;
            }
            maxCount++;
            count++;
        }
        return result;
    }

    
    public static int maxOccurrences_Problem_1_975e7b38_4634_4f4f_9e08_0b874a0e3e32(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer item : nums) {
            map.put(item, map.getOrDefault(item, 0L) + 1);
        }
        return map.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).findFirst().get().getValue();
    }

    
    public static int maxOccurrences_Problem_1_446403b1_5bce_46c9_b5be_d58a44deff41(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num : nums) {
            Integer count = map.get(num);
            if(count == null) {
                count = 0;
            }
            count++;
            map.put(num, count);
        }
        Integer max = null;
        Integer maxCount = null;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(max == null || entry.getValue() > maxCount) {
                max = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_2c6a9e75_15df_41f2_a1b3_e4e5c20afd81(ArrayList<Integer> nums) {
        // Return 0 if nums is empty
        if (nums.isEmpty()) {
            return 0;
        }
        
        // Sort the array
        Collections.sort(nums);
        
        // Initialize count as 0 and maxCount as 0
        int count = 0, maxCount = 0;
        
        // For each number in nums
        for (int num : nums) {
            // Get the index of the number in the sorted array
            int index = Collections.binarySearch(nums, num);
            
            // If index is greater than count, then it is the new count and maxCount
            if (index >= count) {
                count = index + 1;
                maxCount = count;
            }
        }
        
        // Return the maximum count
        return maxCount;
    }

    
    public static int maxOccurrences_Problem_1_f3d32a36_41f5_4c9d_aaef_33d91bc66ef2(ArrayList<Integer> nums) {
        int maxFreq = 0, maxOccur = 0;
        Set<Integer> hashSet = new HashSet<Integer>();
        for (Integer num : nums) {
            if (hashSet.contains(num)) {
                hashSet.remove(num);
                hashSet.add(num);
            } else {
                hashSet.add(num);
            }
        }
        for (Integer num : hashSet) {
            maxOccur = nums.size();
            maxFreq = nums.size();
            for (Integer num2 : nums) {
                if (num2 == num) {
                    maxOccur--;
                    maxFreq--;
                }
            }
            if (maxOccur > 0) {
                maxFreq = nums.size();
            } else {
                maxOccur = nums.size();
            }
        }
        return maxFreq;
    }

    
    public static int maxOccurrences_Problem_1_e4f1d41c_d40a_4cc0_91d1_3ff0c557f9ce(ArrayList<Integer> nums) {
        int max = 0;
        for(Integer x : nums) {
            if(nums.contains(x)) {
                if(nums.stream().filter(y -> y == x).count() > nums.stream().filter(y -> y != x).count()) {
                    max = x;
                }
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_485857af_12a5_4728_ad08_a49a9620896a(ArrayList<Integer> nums) {
        int[] arr = new int[nums.size()];
        for(int i=0; i<nums.size(); i++) {
            arr[i] = nums.get(i);
        }
        Arrays.sort(arr);
        int max = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == arr[i+1]) {
                max += i+1;
            }
            else {
                break;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_06a97cd2_9ba4_44df_9fc7_0446664fd7cc(ArrayList<Integer> nums) {
        int max=0,count=0;
        for(Integer num: nums) {
            if(num==null) continue;
            if(count==0) count=1;
            else count++;
            if(count>max) max=count;
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_00e64e6e_a655_4f8d_834e_8e11f35f7472(ArrayList<Integer> nums) {
        int max = 0;
        int item = 0;
        int count = 0;
        for(Integer n : nums) {
            if(count == 0) {
                item = n;
                count++;
                continue;
            }
            if(item == n) {
                count++;
                continue;
            }
            if(count > max) {
                max = count;
            }
            count = 0;
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_aad1e19e_e4f0_4d9f_a13c_c43dfd0ddb2f(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1L);
            }
        }
        int max = 0;
        for (int key : map.keySet()) {
            max = Math.max(max, map.get(key));
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_ffe1f046_01fb_483e_926a_2cb30f5885dd(ArrayList<Integer> nums) {
        int frequency = 0;
        int max = nums.get(0);
        for(int i=0;i<nums.size();i++){
            if(nums.get(i)>max){
                frequency = 1;
                max = nums.get(i);
            }else if(nums.get(i)==max){
                frequency ++;
            }
        }
        return frequency;
    }

    
    public static int maxOccurrences_Problem_2_a9e6e331_a0ca_4587_886b_c84a7364ff4e(ArrayList<Integer> nums) {
        // Write your code here
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_82661e8f_5035_4362_8a91_31bbb0abe087(ArrayList<Integer> nums) {
        int max = 0;
        int count = 0;
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) == count) {
                count++;
            } else {
                count = nums.get(i);
                max = Math.max(max, count);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_5d67c8d8_0758_4206_a4da_c68efc588998(ArrayList<Integer> nums) {
        int max = 0;
        int maxCount = 0;
        int maxItem = 0;
        for(int num : nums) {
            if(num > max) {
                max = num;
                maxCount = 1;
                maxItem = num;
            }
            else if(num == max) {
                maxCount++;
                if(maxCount > max) {
                    max = maxCount;
                    maxItem = num;
                }
            }
        }
        return maxItem;
    }

    
    public static int maxOccurrences_Problem_1_329ddc62_39da_4864_b54b_c1c0f9a7c06a(ArrayList<Integer> nums) {
        int max_freq = 0;
        int max_val = nums.get(0);
        for(int num : nums){
            int freq = Collections.frequency(nums, num);
            if(freq > max_freq){
                max_val = num;
                max_freq = freq;
            }
        }
        return max_val;
    }

    
    public static int maxOccurrences_Problem_0_13566a41_df26_4640_8cec_9ecdd54b03c8(ArrayList<Integer> nums) {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (Integer l : nums) {
            int occ = m.getOrDefault(l, 0);
            m.put(l, occ + 1);
        }
        return nums.stream().filter(n -> m.get(n) == 1).count();
    }

    
    public static int maxOccurrences_Problem_2_c3833d5f_25a9_4362_a67f_ca681b77d5f6(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (Integer num : nums) {
            if (map.containsKey(num)) {
                int count = map.get(num) + 1;
                map.put(num, count);
                max = Math.max(max, count);
            } else {
                map.put(num, 1);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_4ab8e393_4937_4fd2_be18_83be24551fca(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (Integer num : nums) {
            if (!map.containsKey(num)) {
                count++;
                map.put(num, 1);
            } else {
                count += map.get(num);
                map.put(num, map.get(num) + 1);
            }
        }
        return nums.stream().filter(num -> map.containsKey(num))
            .max(Comparator.comparing(num -> map.get(num))).get();
    }

    
    public static int maxOccurrences_Problem_1_4390640e_1c3d_4d20_ae44_192909deb341(ArrayList<Integer> nums) {
        int maxCount = 0;
        int maxNum = 0;
        for (int num : nums) {
            if (num > maxCount) {
                maxCount = num;
                maxNum = num;
            } else if (num == maxCount) {
                if (num > maxNum) {
                    maxCount = num;
                    maxNum = num;
                }
            }
        }
        return maxCount;
    }

    
    public static int maxOccurrences_Problem_1_7fc6a493_4ec4_440b_bc4b_26a027f35965(ArrayList<Integer> nums) {
        // Write your code here
        int max = nums.get(0);
        int count = 1;
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) != nums.get(i - 1)) {
                max = Math.max(count, max);
                count = 1;
            } else {
                count++;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_35bbb628_b324_4609_b945_3f95e5eba3a1(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for(Integer num : nums) {
            Integer occ = map.get(num);
            if(occ == null) {
                occ = 0L;
            }
            map.put(num, ++occ);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_15805e77_773e_46ff_bf12_493217d3d172(ArrayList<Integer> nums) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        int count = 0;
        HashSet<Integer> visited = new HashSet<>();
        for(Integer n : nums) {
            if(visited.contains(n)) {
                count++;
                continue;
            }
            visited.add(n);
            if(count > max) {
                max = count;
            }
            count = 1;
        }
        if(count > max) {
            max = count;
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_feac3c32_d88d_45aa_bf59_8b10de03cfb6(ArrayList<Integer> nums) {
        int maxCount = 0;
        int currCount = 0;
        for (Integer i : nums) {
            if (maxCount < i) {
                maxCount = i;
            }
            if (maxCount == i) {
                currCount++;
            }
        }
        return maxCount;
    }

    
    public static int maxOccurrences_Problem_1_c3833d5f_25a9_4362_a67f_ca681b77d5f6(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (Integer num : nums) {
            if (map.containsKey(num)) {
                int count = map.get(num) + 1;
                map.put(num, count);
                max = Math.max(max, count);
            } else {
                map.put(num, 1);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_48daf877_76f3_4386_adf1_a9e67879477b(ArrayList<Integer> nums) {
        int max = 0;
        int maxCount = 0;
        int maxIndex = 0;
        for(int num : nums) {
            int count = Collections.frequency(nums, num);
            if(count > maxCount) {
                max = num;
                maxCount = count;
                maxIndex = num;
            }
        }
        return maxIndex;
    }

    
    public static int maxOccurrences_Problem_2_7925bf2e_fce0_4939_af8c_e6e1773a8b34(ArrayList<Integer> nums) {
        int max_count = 0;
        int current_count = 0;
        int temp_count = 0;
        
        for(int num : nums) {
            if(current_count == 0) {
                temp_count = 1;
            } else {
                current_count++;
            }
            
            if(temp_count > max_count) {
                max_count = temp_count;
            }
        }
        
        return max_count;
    }

    
    public static int maxOccurrences_Problem_1_55e21097_f4f1_4fd4_84d3_4986be3d9d1d(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int max = -1;
        for(int num: nums) {
            if(count.containsKey(num)) {
                count.put(num, count.get(num) + 1);
            } else {
                count.put(num, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if(entry.getValue() > max) max = entry.getValue();
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_9c1b78c6_d456_4b24_8e4c_cae92f992b08(ArrayList<Integer> nums) {
        int count = 0, maxCount = 0, result = 0;
        for (int i: nums) {
            if (count > 0) {
                count--;
                result = maxCount > result ? maxCount : result;
            }
            maxCount++;
            count++;
        }
        return result;
    }

    
    public static int maxOccurrences_Problem_2_2dc6c68f_9a74_4d7f_ae92_9093f910aabc(ArrayList<Integer> nums) {
        //write your code here
        int max = 0;
        int maxCount = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(Integer i: nums){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() > maxCount){
                max = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_9d24d97c_c9c4_4771_9777_6bfd68bd35c0(ArrayList<Integer> nums) {
        int max = 0;
        int counter = 0;
        for (int i = 0; i < nums.size(); ++i) {
            for (int j = i+1; j < nums.size(); ++j) {
                if (nums.get(i) == nums.get(j)) {
                    counter++;
                }
            }
        }
        for (int i = 0; i < nums.size(); ++i) {
            if (counter > max) {
                max = counter;
            }
            counter = 0;
            for (int j = i+1; j < nums.size(); ++j) {
                if (nums.get(i) == nums.get(j)) {
                    counter++;
                }
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_9192a711_11bd_4a4e_86e5_54856b111f47(ArrayList<Integer> nums) {
        Integer max = Integer.valueOf(0);
        Integer val = Integer.valueOf(0);
        for (Integer num: nums) {
            Integer count = nums.stream().filter(x -> x == num).count();
            if (count > max) {
                max = count;
                val = num;
            }
        }
        return val;
    }

    
    public static int maxOccurrences_Problem_2_9ed87abc_756b_42ec_a157_b64c47710479(ArrayList<Integer> nums) {
        // Write your code here
        Integer[] arr = nums.toArray(new Integer[nums.size()]);
        Arrays.sort(arr);
        int maxFreq = 0;
        Integer maxValue = arr[arr.length-1];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == maxValue) {
                maxFreq += 1;
            } else {
                break;
            }
        }
        return maxFreq;
    }

    
    public static int maxOccurrences_Problem_1_39faa61c_1b55_4287_8e19_e4100bc64175(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int max_count = 1;
        for (Integer i: nums) {
            if (i == nums.get(0)) {
                max_count++;
            } else {
                max_count = 1;
                max = nums.get(0);
            }
            if (max_count > nums.size()) {
                return max;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_8c3b2123_191e_465c_93e4_6be19e2cc67b(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = 0;
        for(int n : nums) {
            if(map.containsKey(n)) {
                map.put(n, map.get(n)+1);
            } else {
                map.put(n, 1L);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_355ebb61_ddaa_4d44_812b_4fa2ee3adf19(ArrayList<Integer> nums) {
        int max_count = Integer.MIN_VALUE;
        int max_index = 0;
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) > max_count) {
                max_count = nums.get(i);
                max_index = i;
            }
        }
        return max_index;
    }

    
    public static int maxOccurrences_Problem_0_dde5c6df_8844_4fda_895d_27ae19ac94fa(ArrayList<Integer> nums) {
        int max = -1;
        int count = 0;
        for (Integer n : nums) {
            count = nums.indexOf(n);
            if (count > max) {
                max = count;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_ca5eeb85_9941_416a_baa5_4fa76eb43db7(ArrayList<Integer> nums) {
        int max = 0;
        int maxCount = 0;
        for (int l : nums) {
            int count = 0;
            for (int n : nums) {
                if (n == l) count++;
            }
            if (count > maxCount) {
                max = l;
                maxCount = count;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_fd6d2d2e_d476_4fdd_801c_1909b7de7835(ArrayList<Integer> nums) {
        
        if(nums == null) return 0;
        Map<Integer,Integer> map = new HashMap<>();
        int max = 0;
        for(Integer i : nums) {
            if(map.containsKey(i)) {
                map.put(i, map.get(i)+1);
            } else {
                map.put(i, 1);
            }
        }
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_e671a487_5301_42f7_9a00_310b9c3bacf7(ArrayList<Integer> nums) {
        int max = 0;
        for (int n : nums) {
            if (n > max) {
                max = n;
            }
        }
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == max) {
                return max;
            }
        }
        return 0;
    }

    
    public static int maxOccurrences_Problem_0_b318fbfd_50c6_43c8_9ffe_d0f2b1648972(ArrayList<Integer> nums) {
        int max = 0;
        int current = 0;
        for(Integer num:nums) {
            if (num > current) {
                current = num;
                max = num;
            } else if (num == current) {
                current++;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_b28e9a11_ab81_4365_ab4b_1d6184cc621a(ArrayList<Integer> nums) {
        int max = 0;
        int maxCount = 0;
        int maxIndex = 0;
        for(int i = 0; i < nums.size(); i++) {
            int count = nums.get(i);
            if(count > maxCount) {
                max = count;
                maxCount = count;
                maxIndex = i;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_a5a272a7_0dfe_46b5_b1e6_e6841a0cefe8(ArrayList<Integer> nums) {
        if (nums.size() <= 1) return 0;
        int result = nums.get(0);
        int max = 0;
        for (int i : nums) {
            int temp = result;
            result = (i == temp) ? ++result : 0;
            max = (max < result) ? result : max;
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_a778e348_8168_41fd_aef3_28335cee0d68(ArrayList<Integer> nums) {
        int[] a = new int[nums.size()];
        Arrays.fill(a, -1);
        int max = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i; j < nums.size(); j++) {
                if (nums.get(i) == nums.get(j) && a[i] < a[j]) {
                    a[i] = a[j] + 1;
                    max = Math.max(a[i], max);
                }
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_e4f1d41c_d40a_4cc0_91d1_3ff0c557f9ce(ArrayList<Integer> nums) {
        int max = 0;
        for(Integer x : nums) {
            if(nums.contains(x)) {
                if(nums.stream().filter(y -> y == x).count() > nums.stream().filter(y -> y != x).count()) {
                    max = x;
                }
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_a235c743_2069_406e_8579_5b52ec2f03e0(ArrayList<Integer> nums) {
        int max = 0;
        Map<Integer, Integer> counts = new HashMap<>();
        for(Integer n : nums) {
            Integer c = counts.getOrDefault(n, 0L);
            counts.put(n, c + 1);
            if(counts.get(n) > max) {
                max = counts.get(n);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_f1fd24e1_9a3a_4c44_8350_73899643c515(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (Integer num : nums) {
            map.compute(num, (k, v) -> v == null ? 1 : v + 1);
        }
        Integer result = 0L;
        for (Integer num : map.keySet()) {
            if (map.get(num) > result) {
                result = map.get(num);
            }
        }
        return result;
    }

    
    public static int maxOccurrences_Problem_0_ee0f973a_73bd_4ada_9860_187b3d39f6a9(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = 0;
        for (Integer num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1L);
            } else {
                map.put(num, map.get(num) + 1L);
            }
        }
        for (Integer num : map.keySet()) {
            if (map.get(num) > max) {
                max = map.get(num);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_5fe1e9cf_f8a4_404c_8872_4073af822e11(ArrayList<Integer> nums) {
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_c32abdba_76e8_4d06_aa3d_2e93e86621ff(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int result = 0;
        int max_count = 0;
        for (Integer num: nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() > max_count) {
                result = entry.getKey();
                max_count = entry.getValue();
            }
        }
        return result;
    }

    
    public static int maxOccurrences_Problem_2_6a222114_b03e_4d36_ba96_8f8f64610a16(ArrayList<Integer> nums) {
        int max = -1;
        int count = 0;
        
        for(Integer num : nums) {
            if(count == 0) {
                count++;
                max = num;
            } else {
                count++;
                max = Math.max(max, num);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_d60b4fe0_50bc_4791_a1d7_2ed9b8b186cb(ArrayList<Integer> nums) {
        // Create a map for counting frequency of each number
        Map<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        // Fill the map with all the numbers from array list
        for (Integer num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1L);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        // Create an array list to hold the maximum number for each frequency
        List<Integer> result = new ArrayList<>();
        // Populate the list with maximum value for each frequency
        for (int frequency : map.values()) {
            if (frequency > max) {
                max = frequency;
                result.clear();
                result.add(max);
            } else if (frequency == max) {
                result.add(max);
            }
        }
        // Return the first element of the list
        if (result.isEmpty()) {
            return 0;
        } else {
            return result.get(0);
        }
    }

    
    public static int maxOccurrences_Problem_2_7b077344_53e3_4062_9d95_5c8db76b9cec(ArrayList<Integer> nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        for (Integer i : nums) {
            if (frequencyMap.containsKey(i)) {
                frequencyMap.put(i, frequencyMap.get(i) + 1);
            } else {
                frequencyMap.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> e : frequencyMap.entrySet()) {
            if (e.getValue() > maxFrequency) {
                maxFrequency = e.getValue();
            }
        }
        return frequencyMap.get(maxFrequency);
    }

    
    public static int maxOccurrences_Problem_2_4e853686_59a5_494d_bc5e_c1894a3b1e5e(ArrayList<Integer> nums) {
        int length = nums.size();
        int maxVal = 0;
        int maxCount = 0;
        for (int item : nums) {
            if (nums.indexOf(item) != 0) {
                nums.add(0, nums.get(nums.indexOf(item)));
                nums.remove(nums.indexOf(item) + 1);
            }
            if (maxCount < nums.size() / 2) {
                maxVal = nums.get(0);
                maxCount = 1;
            } else {
                maxVal = maxCount >= nums.size() / 2 ? nums.get(0) : maxVal;
                maxCount = nums.size() / 2;
            }
        }
        return maxVal;
    }

    
    public static int maxOccurrences_Problem_0_4e853686_59a5_494d_bc5e_c1894a3b1e5e(ArrayList<Integer> nums) {
        int length = nums.size();
        int maxVal = 0;
        int maxCount = 0;
        for (int item : nums) {
            if (nums.indexOf(item) != 0) {
                nums.add(0, nums.get(nums.indexOf(item)));
                nums.remove(nums.indexOf(item) + 1);
            }
            if (maxCount < nums.size() / 2) {
                maxVal = nums.get(0);
                maxCount = 1;
            } else {
                maxVal = maxCount >= nums.size() / 2 ? nums.get(0) : maxVal;
                maxCount = nums.size() / 2;
            }
        }
        return maxVal;
    }

    
    public static int maxOccurrences_Problem_1_8910f4ea_db94_4248_bc33_6c66b354125d(ArrayList<Integer> nums) {
        int max_value = -1;
        int max_count = -1;
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) > max_value) {
                max_value = nums.get(i);
            }
            if(nums.get(i) > max_count) {
                max_count = nums.get(i);
            }
        }
        return max_count;
    }

    
    public static int maxOccurrences_Problem_1_7bcdaeb7_1b46_49ab_bbb3_e57de85ce81d(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxCount = 0;
        for (int num: nums) {
            int count = map.getOrDefault(num, 0);
            count++;
            map.put(num, count);
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }

    
    public static int maxOccurrences_Problem_0_7c964b85_c4fb_4744_bb71_215d8ff1447c(ArrayList<Integer> nums) {
        // Write your code here
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1L);
            }
            max = Math.max(max, map.get(n));
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_7b9faba9_33b3_406f_bbe6_ba7db4702b98(ArrayList<Integer> nums) {
        int maxCount = 0;
        int max = -1;
        int size = nums.size();
        int current;
        for(int i = 0; i < size; i++){
            current = nums.get(i);
            if(current > max){
                max = current;
            }
            nums.remove(i);
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_39faa61c_1b55_4287_8e19_e4100bc64175(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int max_count = 1;
        for (Integer i: nums) {
            if (i == nums.get(0)) {
                max_count++;
            } else {
                max_count = 1;
                max = nums.get(0);
            }
            if (max_count > nums.size()) {
                return max;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_8dc77962_f84e_46c1_83f7_be60ca164d8d(ArrayList<Integer> nums) {
        int max = nums.stream().map(n -> n).collect(Collectors.toList()).stream().distinct().count();
        return max;
    }

    
    public static int maxOccurrences_Problem_1_96c3669f_be4e_4af2_a615_49217c8eef7e(ArrayList<Integer> nums) {
        int max = 0;
        int result = nums.get(0);
        for (int i = 1; i < nums.size(); ++i) {
            if (nums.get(i) > result) {
                result = nums.get(i);
                max = 1;
            }
            else if (nums.get(i) == result) {
                ++max;
            }
        }
        return result;
    }

    
    public static int maxOccurrences_Problem_0_71add9f5_9c42_431c_9c4d_7577f9848780(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        int max = 0;
        for (Integer num : nums) {
            if (!frequency.containsKey(num)) {
                frequency.put(num, 1L);
            } else {
                frequency.put(num, frequency.get(num) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_c43d0ac9_1a2d_40a6_a7d7_964ed3cee82d(ArrayList<Integer> nums) {
        Map<Integer, Integer> occurrences = new HashMap<Integer, Integer>();
        for (Integer num : nums) {
            Integer count = occurrences.get(num);
            if (count == null) {
                count = 0L;
            }
            occurrences.put(num, ++count);
        }
        Integer maxValue = 0L;
        for (Integer value : occurrences.values()) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    
    public static int maxOccurrences_Problem_2_198d4a92_5784_4c52_b8c0_d07fb3b56231(ArrayList<Integer> nums) {
        int max = 0;
        int frequency = 1;
        int count = 0;
        int result = 0;
        for (int value : nums) {
            count++;
            if (count == 1) {
                result = value;
                frequency = 1;
            } else if (count == 2) {
                frequency++;
            } else if (value != result) {
                frequency++;
                count = 1;
            } else {
                frequency++;
            }
            if (frequency > max) {
                max = frequency;
            }
        }
        return result;
    }

    
    public static int maxOccurrences_Problem_0_8dc77962_f84e_46c1_83f7_be60ca164d8d(ArrayList<Integer> nums) {
        int max = nums.stream().map(n -> n).collect(Collectors.toList()).stream().distinct().count();
        return max;
    }

    
    public static int maxOccurrences_Problem_0_5d67c8d8_0758_4206_a4da_c68efc588998(ArrayList<Integer> nums) {
        int max = 0;
        int maxCount = 0;
        int maxItem = 0;
        for(int num : nums) {
            if(num > max) {
                max = num;
                maxCount = 1;
                maxItem = num;
            }
            else if(num == max) {
                maxCount++;
                if(maxCount > max) {
                    max = maxCount;
                    maxItem = num;
                }
            }
        }
        return maxItem;
    }

    
    public static int maxOccurrences_Problem_1_93047a64_7bc8_40fd_b109_c2859e5f7886(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = 0, max_count = 0;
        for (int n : nums) {
            if (map.containsKey(n)) {
                max_count = Math.max(max_count, map.get(n));
            }
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max_count) {
                max = Math.max(max, entry.getKey());
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_fcc11aca_52dc_4c07_99ae_49ebc49c1c43(ArrayList<Integer> nums) {
        int max = 0;
        Map<Integer, Integer> h = new HashMap<>();
        int maxCount = 0;
        for(Integer num : nums) {
            if(h.containsKey(num)) {
                h.put(num, h.get(num) + 1);
            }
            else {
                h.put(num, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : h.entrySet()) {
            if(entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                max = entry.getKey();
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_a0b9dffa_f1c5_4e86_9da0_4e2170f37ec0(ArrayList<Integer> nums) {
        int max = 0;
        int curr = 0;
        for(int n : nums) {
            curr = (n % 2 == 0) ? n : (n + 1);
            if(max < curr) {
                max = curr;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_00e64e6e_a655_4f8d_834e_8e11f35f7472(ArrayList<Integer> nums) {
        int max = 0;
        int item = 0;
        int count = 0;
        for(Integer n : nums) {
            if(count == 0) {
                item = n;
                count++;
                continue;
            }
            if(item == n) {
                count++;
                continue;
            }
            if(count > max) {
                max = count;
            }
            count = 0;
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_56605cf2_418c_4dda_94a2_c333b6f577ad(ArrayList<Integer> nums) {
        int max = 0;
        
        for(int i=0;i<nums.size();i++)
        {
            if(max == 0)
            {
                max = nums.get(i);
            }
            else
            {
                max = max + nums.get(i);
            }
        }
        
        return max;
    }

    
    public static int maxOccurrences_Problem_0_523d790f_0bf1_46ea_910a_6cfe78f8b9fd(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int freq = 1;
        for(int l : nums) {
            if(l == max) {
                freq++;
            } else {
                max = l;
                freq = 1;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_65bd2ddb_36e1_4f7d_8e94_29f919c510b1(ArrayList<Integer> nums) {
        int maxOccur = 0;
        int count = 1;
        int current;
        for(int num : nums) {
            current = num;
            count = 1;
            while(current != num) {
                current = nums.get(nums.indexOf(num) + 1);
                count++;
            }
            if(count > maxOccur)
                maxOccur = count;
        }
        return maxOccur;
    }

    
    public static int maxOccurrences_Problem_2_3bb3f763_69e8_4662_a225_efca1ea2a6a1(ArrayList<Integer> nums) {
        int maxFreq = 0;
        int maxVal = nums.get(0);
        for (int l : nums) {
            if (l != 0) {
                if (l > maxVal) {
                    maxVal = l;
                }
                int count = 0;
                for (int i = 0; i < nums.size(); i++) {
                    if (l == nums.get(i)) {
                        count++;
                        if (count > maxFreq) {
                            maxFreq = count;
                            maxVal = l;
                        }
                    }
                }
            }
        }
        return maxVal;
    }

    
    public static int maxOccurrences_Problem_1_ee0f973a_73bd_4ada_9860_187b3d39f6a9(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = 0;
        for (Integer num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1L);
            } else {
                map.put(num, map.get(num) + 1L);
            }
        }
        for (Integer num : map.keySet()) {
            if (map.get(num) > max) {
                max = map.get(num);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_0ac50196_ba10_4533_874c_366e89b2ac15(ArrayList<Integer> nums) {
        // your code goes here
        int max = 0;
        int curr = 0;
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) >= curr) {
                curr = nums.get(i);
            } else {
                max = Math.max(max, curr);
                curr = nums.get(i);
            }
        }
        max = Math.max(max, curr);
        return max;
    }

    
    public static int maxOccurrences_Problem_2_2eef3c6e_6266_4bd2_a6ff_2c57434f5389(ArrayList<Integer> nums) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int max = Integer.MIN_VALUE;
        Integer value = null;
        HashSet<Integer> set = new HashSet<>();
        for(Integer num : nums) {
            set.add(num);
        }
        for (Integer num : set) {
            if(num > max){
                max = num;
                value = num;
            }
        }
        return value;
    }

    
    public static int maxOccurrences_Problem_0_417324c2_7b34_4f8d_9dd8_dbd354f279b9(ArrayList<Integer> nums) {
        if(nums.size() == 0) return 0;
        int max = nums.get(0);
        int count = 1;
        for(Integer i: nums){
            if(i == max) count++;
            else count = 1;
            max = count>max?count:max;
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_58edc921_35a0_4fae_abe3_fafd105a295c(ArrayList<Integer> nums) {
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        int count = 0;
        for (Integer key : map.keySet()) {
            count += map.get(key);
            if (count > max) {
                max = count;
            }
        }

        return max;
    }

    
    public static int maxOccurrences_Problem_2_754ee771_afa3_4f54_8c5e_b9659ce3da01(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = 0;
        for (Integer num : nums) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
            if(map.get(num) > max) {
                max = map.get(num);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_a5a272a7_0dfe_46b5_b1e6_e6841a0cefe8(ArrayList<Integer> nums) {
        if (nums.size() <= 1) return 0;
        int result = nums.get(0);
        int max = 0;
        for (int i : nums) {
            int temp = result;
            result = (i == temp) ? ++result : 0;
            max = (max < result) ? result : max;
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_5fe1e9cf_f8a4_404c_8872_4073af822e11(ArrayList<Integer> nums) {
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_b512e66b_31ea_41fd_8a76_85a383718a17(ArrayList<Integer> nums) {
        int max=0;
        int count=0;
        for(int i=0;i<nums.size();i++) {
            count=0;
            for(int j=0;j<nums.size();j++) {
                if(nums.get(i)==nums.get(j)) {
                    count++;
                }
            }
            if(max<count) {
                max=count;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_e162d465_1af8_4024_95f8_01dcf81ef17c(ArrayList<Integer> nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int max = 0;
        for(int n : nums)
            if(map.containsKey(n))
                map.put(n,map.get(n)+1);
            else
                map.put(n,1);
        int num = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() > num) {
                num = entry.getValue();
            }
        }
        return num;
    }

    
    public static int maxOccurrences_Problem_2_55d91605_a1ab_42bb_a0ab_662b98d6f037(ArrayList<Integer> nums) {
        // write your code here
        int max = 0;
        int frequency = 0;
        for (Integer l : nums) {
            if (frequency == 0) {
                frequency = 1;
                max = l;
            }
            else if (l == max) {
                frequency++;
            }
            else {
                frequency = 1;
                max = l;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_37f717e6_4e44_42ed_8635_a804175ad007(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Integer max = nums.get(0);
        int count = 0;
        for (Integer num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                int count1 = map.get(num);
                count1++;
                map.put(num, count1);
                if (count1 > count) {
                    count = count1;
                    max = num;
                }
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_52d87a90_c21b_4a08_9b88_57469a9e5479(ArrayList<Integer> nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer l : nums) {
            if(map.containsKey(l)) {
                map.put(l,map.get(l)+1);
            } else {
                map.put(l,1L);
            }
        }
        int max = 0L;
        for(Integer key : map.keySet()) {
            if(max < map.get(key)) {
                max = map.get(key);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_c3833d5f_25a9_4362_a67f_ca681b77d5f6(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (Integer num : nums) {
            if (map.containsKey(num)) {
                int count = map.get(num) + 1;
                map.put(num, count);
                max = Math.max(max, count);
            } else {
                map.put(num, 1);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_702117a6_bea9_4616_92ea_926417dac53f(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = 0;
        for (Integer value : nums) {
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
            } else {
                map.put(value, 1);
            }
        }
        for (Integer value : map.keySet()) {
            if (map.get(value) > max) {
                max = map.get(value);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_2eef3c6e_6266_4bd2_a6ff_2c57434f5389(ArrayList<Integer> nums) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int max = Integer.MIN_VALUE;
        Integer value = null;
        HashSet<Integer> set = new HashSet<>();
        for(Integer num : nums) {
            set.add(num);
        }
        for (Integer num : set) {
            if(num > max){
                max = num;
                value = num;
            }
        }
        return value;
    }

    
    public static int maxOccurrences_Problem_0_663333ce_f566_4dc1_b081_1bf425b6394a(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(Integer n : nums) {
            if(map.containsKey(n)) {
                map.put(n, map.get(n)+1);
            } else {
                map.put(n, 1);
            }
        }
        int max = 0;
        for(int value : map.values()) {
            if(max < value) {
                max = value;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_3bb3f763_69e8_4662_a225_efca1ea2a6a1(ArrayList<Integer> nums) {
        int maxFreq = 0;
        int maxVal = nums.get(0);
        for (int l : nums) {
            if (l != 0) {
                if (l > maxVal) {
                    maxVal = l;
                }
                int count = 0;
                for (int i = 0; i < nums.size(); i++) {
                    if (l == nums.get(i)) {
                        count++;
                        if (count > maxFreq) {
                            maxFreq = count;
                            maxVal = l;
                        }
                    }
                }
            }
        }
        return maxVal;
    }

    
    public static int maxOccurrences_Problem_2_440eeccb_616b_4c43_a5e5_8a82f36cc3a6(ArrayList<Integer> nums) {
        int max_count=0,count=0;
        for(int num: nums) {
            if(count<=0) {
                count++;
                continue;
            }
            if(count>max_count) {
                max_count=count;
            }
            count--;
        }
        return max_count;
    }

    
    public static int maxOccurrences_Problem_1_0ac50196_ba10_4533_874c_366e89b2ac15(ArrayList<Integer> nums) {
        // your code goes here
        int max = 0;
        int curr = 0;
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) >= curr) {
                curr = nums.get(i);
            } else {
                max = Math.max(max, curr);
                curr = nums.get(i);
            }
        }
        max = Math.max(max, curr);
        return max;
    }

    
    public static int maxOccurrences_Problem_2_981935db_ce73_4a75_bb02_cbdb034ebf3f(ArrayList<Integer> nums) {
        int res = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max = 0;
        for (int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);
            if (hm.containsKey(num)) {
                hm.put(num, hm.get(num) + 1);
            } else {
                hm.put(num, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                res = entry.getKey();
            }
        }
        return res;
    }

    
    public static int maxOccurrences_Problem_0_56605cf2_418c_4dda_94a2_c333b6f577ad(ArrayList<Integer> nums) {
        int max = 0;
        
        for(int i=0;i<nums.size();i++)
        {
            if(max == 0)
            {
                max = nums.get(i);
            }
            else
            {
                max = max + nums.get(i);
            }
        }
        
        return max;
    }

    
    public static int maxOccurrences_Problem_0_eb4983ed_f239_4ee7_95da_17a7a10b30ab(ArrayList<Integer> nums) {
        int max = 0, count = 0;
        for(int i = 0; i < nums.size(); i++) {
            if(count == 0) {
                count = 1;
                max = nums.get(i);
            }
            else if(nums.get(i) == max) {
                count++;
            }
            else {
                count = 1;
                max = nums.get(i);
            }
        }
        return count;
    }

    
    public static int maxOccurrences_Problem_0_a0b9dffa_f1c5_4e86_9da0_4e2170f37ec0(ArrayList<Integer> nums) {
        int max = 0;
        int curr = 0;
        for(int n : nums) {
            curr = (n % 2 == 0) ? n : (n + 1);
            if(max < curr) {
                max = curr;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_329ddc62_39da_4864_b54b_c1c0f9a7c06a(ArrayList<Integer> nums) {
        int max_freq = 0;
        int max_val = nums.get(0);
        for(int num : nums){
            int freq = Collections.frequency(nums, num);
            if(freq > max_freq){
                max_val = num;
                max_freq = freq;
            }
        }
        return max_val;
    }

    
    public static int maxOccurrences_Problem_1_35bbb628_b324_4609_b945_3f95e5eba3a1(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for(Integer num : nums) {
            Integer occ = map.get(num);
            if(occ == null) {
                occ = 0L;
            }
            map.put(num, ++occ);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_55e21097_f4f1_4fd4_84d3_4986be3d9d1d(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int max = -1;
        for(int num: nums) {
            if(count.containsKey(num)) {
                count.put(num, count.get(num) + 1);
            } else {
                count.put(num, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if(entry.getValue() > max) max = entry.getValue();
        }
        return max;
    }

}
