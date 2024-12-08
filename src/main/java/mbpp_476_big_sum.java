package mbpp_476_big_sum;

public class mbpp_476_big_sum {

    
    public static int bigSum_Problem_2_49ad7f4f_9d1a_4b4b_8a65_df78039aa5f8(ArrayList<Integer> nums) {
        int sum = nums.stream().mapToInteger(Integer::intValue).sum();
        if (sum % 2 == 0) {
            return Math.pow(sum, 2);
        }
        return Math.pow(sum, 2);
    }

    
    public static int bigSum_Problem_0_6d1fb74d_4091_4c93_ac1c_6eb14c252835(ArrayList<Integer> nums) {
        int sum = 0;
        for(int i = 0; i < nums.size(); i++){
            sum += nums.get(i);
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_fcb0bc9e_ae3a_4a87_abc7_f14ad8f52736(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_19a03a90_fe68_495b_a21f_955f8f946d9d(ArrayList<Integer> nums) {
        if (nums == null || nums.size() == 0)
            return 0;
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            int temp = nums.get(i);
            if (temp < smallest)
                smallest = temp;
            else if (temp > largest)
                largest = temp;
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_7bb4526b_5971_42b4_89b0_e56759ee54e5(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_bd34f825_5c61_4483_9592_e0bad18baaaa(ArrayList<Integer> nums) {
        int largest = nums.get(0), smallest = nums.get(0);
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_bd34f825_5c61_4483_9592_e0bad18baaaa(ArrayList<Integer> nums) {
        int largest = nums.get(0), smallest = nums.get(0);
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_d5fa0a49_effe_4f9d_9c5b_2438f696ee4f(ArrayList<Integer> nums) {
        int sum = 0;
        if (nums.size() > 0) {
            int min = nums.get(0);
            int max = nums.get(0);
            for (int i = 1; i < nums.size(); i++) {
                if (nums.get(i) < min) min = nums.get(i);
                if (nums.get(i) > max) max = nums.get(i);
            }
            sum = max + min;
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_21f56262_f2b0_4637_acc1_6f8ca755ab3b(ArrayList<Integer> nums) {
        if (nums == null || nums.isEmpty())
            return 0L;
        return nums.stream().reduce(Math::max).orElse(0L) + nums.stream().reduce(Math::min).orElse(0L);
    }

    
    public static int bigSum_Problem_0_e3712fe6_b03c_45f2_935b_cdfa799a4b63(ArrayList<Integer> nums) {
        int sum = 0;
        int largest, smallest;
        for(int i = 0; i<nums.size(); i++)
        {
            sum+=nums.get(i);
        }
        if(nums.size()==1)
        {
            return nums.get(0);
        }
        largest = sum;
        smallest = sum;
        for(int i = 0; i<nums.size(); i++)
        {
            if(nums.get(i)>largest)
            {
                largest = nums.get(i);
            }
            if(nums.get(i)<smallest)
            {
                smallest = nums.get(i);
            }
        }
        return (largest + smallest);
    }

    
    public static int bigSum_Problem_0_d73fb415_cc04_459d_9c88_22e8a2fd3fa6(ArrayList<Integer> nums) {
        int largest = nums.get(0), smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_3b5d40e9_5e5d_44b6_b3db_52307ae097bf(ArrayList<Integer> nums) {
        int sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_b212aecb_ab8e_4606_8423_3cbccf37ec28(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_0c8c1f7e_dba0_416a_bfa3_bb6220cd0e58(ArrayList<Integer> nums) {
        // Initialize min and max values to positive infinity
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        // Iterate through the list and compute the sum and max/min values
        for (Integer num : nums) {
            sum = sum + num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        // Return the sum and the max/min values
        return sum;
    }

    
    public static int bigSum_Problem_1_9f21ba53_5d02_4fba_8373_4aecabcb033e(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_015c18cc_232d_4688_b572_8619e6c61850(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_255b450a_4a16_4549_be32_4692cc9fc69f(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_ebef4c77_b07b_4e19_86d1_c0ed99380ede(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) { // loop through all elements in array
            if (num > largest) { // if current element is greater than largest
                largest = num; // update largest to current element
            } else if (num < smallest) { // if current element is smaller than smallest
                smallest = num; // update smallest to current element
            }
        }
        return largest + smallest; // return sum of largest and smallest
    }

    
    public static int bigSum_Problem_1_6fb5ce6b_4087_4c02_8b8e_7c0724c5ecd0(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first number
        int smallest = nums.get(0); // initialize smallest to first number
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_86d7fc65_d7d8_4b25_a113_1da567d59c6e(ArrayList<Integer> nums) {
        int sum = 0;
        for(Integer num : nums) {
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_a819474f_a712_4c04_836f_d4063171a9fc(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_c7e8eb4c_63cc_40fb_b61c_8f9d5bd1afca(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
        int sum = 0;
        for (Integer num : nums)
            sum = sum + num;
        return sum;
    }

    
    public static int bigSum_Problem_1_9ba275dd_7fa0_4d5d_a284_9f7f8ff57c75(ArrayList<Integer> nums) {
        int sum = 0;
        for (Integer num : nums) {
            if (num > sum) {
                sum = num;
            }
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_41534c23_0fe5_46bf_9f97_0465f7215988(ArrayList<Integer> nums) {
        int max = Collections.max(nums);
        int min = Collections.min(nums);
        return max + min;
    }

    
    public static int bigSum_Problem_2_40201173_8ffa_42b1_8eab_31138b8a9e67(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_e2488350_b102_4176_a6d1_a25fcfe28fed(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_a448c37a_d5f6_4275_9631_b7c57902f9f1(ArrayList<Integer> nums) {
        // Your code here...
        int largest = Collections.max(nums);
        int smallest = Collections.min(nums);
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_6e8779c2_5cba_45ba_b109_2617a2bee021(ArrayList<Integer> nums) {
        int result = 0, largest = nums.stream().mapToInteger(Integer::intValue).max().getAsInteger();
        largest = Math.max(largest, 0L);
        for (int i : nums) {
            result += i;
        }
        result = result - largest + largest;
        return result;
    }

    
    public static int bigSum_Problem_0_0dcb92f9_6257_4946_8892_f5f21ebae532(ArrayList<Integer> nums) {
        // write your code here
        int sum = 0; 
        for(int i=0; i<nums.size(); i++){
            if(nums.get(i)>sum){
                sum = nums.get(i);
            }
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_5bbadf6c_8e54_4b3c_afc5_2c93ff14ed14(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_247893ba_d141_42b0_b027_0397b51f0067(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(Integer x : nums) {
            largest = x > largest ? x : largest;
            smallest = x < smallest ? x : smallest;
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_49ad7f4f_9d1a_4b4b_8a65_df78039aa5f8(ArrayList<Integer> nums) {
        int sum = nums.stream().mapToInteger(Integer::intValue).sum();
        if (sum % 2 == 0) {
            return Math.pow(sum, 2);
        }
        return Math.pow(sum, 2);
    }

    
    public static int bigSum_Problem_2_d9e5db7e_2523_4ffd_9733_40fa9a4b1225(ArrayList<Integer> nums) {
        // Write your code here

        if(nums.isEmpty()){
            return 0;
        }
        int sum =0;
        int largest = nums.get(0); 
        int smallest = nums.get(0); 
        for(int i:nums){
            if(i>largest){
                largest = i;
            }
            if(i<smallest){
                smallest = i;
            }
            sum = sum+i;
        }
        System.out.println("The sum of the largest and smallest element in the array is: "+sum);
        return sum;
    }

    
    public static int bigSum_Problem_1_d5fa0a49_effe_4f9d_9c5b_2438f696ee4f(ArrayList<Integer> nums) {
        int sum = 0;
        if (nums.size() > 0) {
            int min = nums.get(0);
            int max = nums.get(0);
            for (int i = 1; i < nums.size(); i++) {
                if (nums.get(i) < min) min = nums.get(i);
                if (nums.get(i) > max) max = nums.get(i);
            }
            sum = max + min;
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_a0a4b2bd_c6a9_413d_815d_76cfcd9a61d2(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_211baae4_a4c2_4fc7_b26c_8872462aee25(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_c502bd9a_ed5e_4e79_8171_7cd19f061ba2(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_40ea5595_3217_4dde_9cb6_ab605f5c80f1(ArrayList<Integer> nums) {
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_2a7c20ae_ab11_4218_ab4c_f3099c8d8dc2(ArrayList<Integer> nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_247893ba_d141_42b0_b027_0397b51f0067(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(Integer x : nums) {
            largest = x > largest ? x : largest;
            smallest = x < smallest ? x : smallest;
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_07003a4f_0228_4756_919b_47714b04b652(ArrayList<Integer> nums) {
        int largest = nums.stream().max(Comparator.naturalOrder()).get();
        int smallest = nums.stream().min(Comparator.naturalOrder()).get();
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_508c73ca_c948_4300_88e0_242235e3724f(ArrayList<Integer> nums) {
        int biggest = Collections.max(nums);
        int smallest = Collections.min(nums);
        int sum = biggest + smallest;
        return sum;
    }

    
    public static int bigSum_Problem_0_a9fbb99f_e956_47e2_a9ee_d5b8f583714a(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_b32b12c3_7f4f_4b97_8225_61e2d2a91840(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_015c18cc_232d_4688_b572_8619e6c61850(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_4f6c8254_b2ab_4d84_bac3_8d365f0a2b96(ArrayList<Integer> nums) {
        // write your solution here
        if (nums.isEmpty()) {
            return 0;
        }
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_e9c5453f_d313_4c4d_8a90_7cbe5242adaf(ArrayList<Integer> nums) {
        int maxSum = nums.stream()
                .mapToInteger(Integer::intValue)
                .max()
                .orElse(0L);
        int minSum = nums.stream()
                .mapToInteger(Integer::intValue)
                .min()
                .orElse(0L);
        return maxSum + minSum;
    }

    
    public static int bigSum_Problem_0_a097f480_ade0_4507_83fd_b2d67d5d5703(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_923f4a3c_7ac2_44c9_9ea7_02a4494d2767(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_a1dee30a_6f1d_430e_9ca9_15a79731997c(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (Integer num: nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_c66b3866_ac1a_4767_a026_ab53cb637401(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_e9c5453f_d313_4c4d_8a90_7cbe5242adaf(ArrayList<Integer> nums) {
        int maxSum = nums.stream()
                .mapToInteger(Integer::intValue)
                .max()
                .orElse(0L);
        int minSum = nums.stream()
                .mapToInteger(Integer::intValue)
                .min()
                .orElse(0L);
        return maxSum + minSum;
    }

    
    public static int bigSum_Problem_1_2cc26bc2_620b_4108_9269_9108297076d7(ArrayList<Integer> nums) {
        int largest = nums.stream().max(Comparator.naturalOrder()).get();
        int smallest = nums.stream().min(Comparator.naturalOrder()).get();
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_cf5f6a0b_375b_4d8e_ad87_5cf5f23dbff4(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_902bad7d_25f4_4ea8_aaec_5df4daa657ef(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_bd6d996c_da96_4202_a473_5e8566b8e3ce(ArrayList<Integer> nums) {
        int maxSum = 0, minSum = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > maxSum) {
                maxSum = nums.get(i);
            }
            if (nums.get(i) < minSum) {
                minSum = nums.get(i);
            }
        }
        return maxSum + minSum;
    }

    
    public static int bigSum_Problem_2_c01d404f_b492_4231_8cee_89463d63a5b4(ArrayList<Integer> nums) {
        int largest = nums.stream().mapToInteger(Integer::intValue).max().getAsInteger();
        int smallest = nums.stream().mapToInteger(Integer::intValue).min().getAsInteger();
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_44dbe357_3ca0_48bb_8a12_edfd50b82197(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first number
        int smallest = nums.get(0); // initialize smallest to first number
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_68ea001a_02c0_4574_bd9f_5b8bd19152fc(ArrayList<Integer> nums) {
        int largestSoFar = Integer.MIN_VALUE;
        int smallestSoFar = Integer.MAX_VALUE;

        for(Integer num : nums) {
            largestSoFar = Math.max(largestSoFar, num);
            smallestSoFar = Math.min(smallestSoFar, num);
        }

        return largestSoFar + smallestSoFar;
    }

    
    public static int bigSum_Problem_0_03b8335e_3887_47c2_86ab_3e7b83e94908(ArrayList<Integer> nums) {
        int sum = 0;
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_6e80983d_24c2_44ae_a62e_f383840ed57f(ArrayList<Integer> nums) {
        int biggest = 0, smallest = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > biggest) {
                biggest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        int biggestSum = biggest;
        int smallestSum = smallest;
        for (int i = 0; i < nums.size(); i++) {
            if (biggest == smallest && biggest != 0) {
                return biggestSum;
            }
            if (nums.get(i) > biggestSum) {
                biggestSum = nums.get(i);
            }
            if (nums.get(i) < smallestSum) {
                smallestSum = nums.get(i);
            }
        }
        return biggestSum;
    }

    
    public static int bigSum_Problem_0_5b3bdb22_be94_4b51_ba78_12f55fe46821(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return min + max;
    }

    
    public static int bigSum_Problem_2_dc3494de_dde0_4709_8076_85e261d32421(ArrayList<Integer> nums) {
        // Write code here
        int largest = nums.get(0); 
        int sum = 0; 
        for(int i = 1; i < nums.size(); i++){
            sum += nums.get(i);
            if(largest < sum)
                largest = sum;
        }
        return largest;
    }

    
    public static int bigSum_Problem_2_f9bd0e4c_6452_4816_b022_e2b97bd3519e(ArrayList<Integer> nums) {
        int sum=0;
        for(Integer n: nums) {
            sum+=n;
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_8bb62bec_fe7e_479e_a9b2_53ede1ab1027(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_74141374_8eb6_46f0_9e55_cc79097139cf(ArrayList<Integer> nums) {
        if (nums.isEmpty())
            return 0L;
        int largest = nums.get(0);
        for (int num : nums) {
            if (num > largest)
                largest = num;
        }
        int smallest = nums.get(0);
        for (int num : nums) {
            if (num < smallest)
                smallest = num;
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_e3f7a4b7_a14e_4da8_96ac_1588d6553f90(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_a470b9ea_4c8c_4458_a678_880fc084a14f(ArrayList<Integer> nums) {
        int largest = nums.stream().reduce(Math::max).get();
        int smallest = nums.stream().reduce(Math::min).get();
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_ab481123_ac49_4477_a1ce_e6866be9ac67(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        return max - min;
    }

    
    public static int bigSum_Problem_1_dbde2f03_94de_4105_909d_ef90990d3102(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_b2a9a9dd_5b33_476e_9dd1_38c35d96f50f(ArrayList<Integer> nums) {
        // Your code here
        int largest = Integer.MAX_VALUE, smallest = Integer.MIN_VALUE;
        for(int num: nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_c4c0736d_5d09_4293_8292_b468cec07563(ArrayList<Integer> nums) {
        // Write your code here
        int sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum = sum + num;
            }
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_3a370492_d423_4282_87f8_109d12747a0d(ArrayList<Integer> nums) {
        return nums.stream().mapToInteger(x -> x).sum();
    }

    
    public static int bigSum_Problem_0_255b450a_4a16_4549_be32_4692cc9fc69f(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_40ea5595_3217_4dde_9cb6_ab605f5c80f1(ArrayList<Integer> nums) {
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_56ef14a4_46ab_4fb1_99f2_0e528b17a805(ArrayList<Integer> nums) {
        int largest = nums.get(0); //smallest is default
        int sum = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (largest < nums.get(i)) {
                largest = nums.get(i);
            } else {
                sum = sum + nums.get(i);
            }
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_bc3f3790_7d93_4367_a6aa_8dd58f65fd28(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Integer num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max + min;
    }

    
    public static int bigSum_Problem_1_9b2a5e23_0a89_47a6_9018_5eb3c2a28670(ArrayList<Integer> nums) {
        int sumLargest = nums.get(0);
        int sumSmallest = nums.get(0);
        for (int num : nums) {
            sumLargest = Math.max(sumLargest, num);
            sumSmallest = Math.min(sumSmallest, num);
        }
        return sumLargest + sumSmallest;
    }

    
    public static int bigSum_Problem_2_a605f59a_111b_41e0_a4db_90c7124b90e8(ArrayList<Integer> nums) {
        int sum=0;
        for (int i = 0; i < nums.size(); i++){
            sum += nums.get(i);
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_dc22f47f_6c42_437f_b0cf_441f302b4cbb(ArrayList<Integer> nums) {
        int sum = 0;
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int i = 1; i < nums.size(); i++) {
            sum += nums.get(i);
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_a1178f4c_17d4_43c2_8b77_9ed0a25dd4bc(ArrayList<Integer> nums) {
        int bigSum_Problem_0_a1178f4c_17d4_43c2_8b77_9ed0a25dd4bc =  0;
        for(int num : nums)
        {
            if (num > bigSum_Problem_0_a1178f4c_17d4_43c2_8b77_9ed0a25dd4bc)
                bigSum_Problem_0_a1178f4c_17d4_43c2_8b77_9ed0a25dd4bc = num;
        }
        return bigSum_Problem_0_a1178f4c_17d4_43c2_8b77_9ed0a25dd4bc;
    }

    
    public static int bigSum_Problem_2_6fb5ce6b_4087_4c02_8b8e_7c0724c5ecd0(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first number
        int smallest = nums.get(0); // initialize smallest to first number
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_756a6136_6421_4b69_bd9c_29faea012ba7(ArrayList<Integer> nums) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            if (num < smallest) {
                smallest = num;
            } else if (num > largest) {
                largest = num;
            }
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_2acfc1c2_82a1_4389_bce6_433c8bedca1c(ArrayList<Integer> nums) {
        int min = Integer.MIN_VALUE, max = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        System.out.println("Smallest is " + min);
        System.out.println("Largest is " + max);
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        System.out.println("Sum is " + sum);
        return sum;
    }

    
    public static int bigSum_Problem_0_0637d3f2_822f_4a81_a1e9_27624961acc2(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_90e86d37_242a_46bd_b621_8700680e5b44(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first number
        int smallest = nums.get(0); // initialize smallest to first number
        for (Integer num : nums) { // loop through all numbers
            if (num > largest) { // if current number is greater than largest
                largest = num; // update largest
            } else if (num < smallest) { // if current number is smaller than smallest
                smallest = num; // update smallest
            }
        }
        return largest + smallest; // return sum of largest and smallest
    }

    
    public static int bigSum_Problem_0_0868d3e0_4f7d_41ae_a8ee_f2a52d90f48b(ArrayList<Integer> nums) {
        // Write your logic here
        int largest = Collections.max(nums);
        int smallest = Collections.min(nums);
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_3a370492_d423_4282_87f8_109d12747a0d(ArrayList<Integer> nums) {
        return nums.stream().mapToInteger(x -> x).sum();
    }

    
    public static int bigSum_Problem_1_03b50f42_ced4_4fbe_8dcf_b2d3aa3da8a9(ArrayList<Integer> nums) {
        int largest = 0L;
        int smallest = 0L;
        int sum = 0L;
        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
            if (largest < nums.get(i)) {
                largest = nums.get(i);
            } else if (smallest > nums.get(i)) {
                smallest = nums.get(i);
            }
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_b6b77ee2_488e_4c30_9c98_79023b809aa5(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_95aa5744_849d_4d65_8604_b53f70872eda(ArrayList<Integer> nums) {
        int largest = nums.get(0); //set largest as first value
        int smallest = nums.get(0);
        for (Integer n : nums) {
            if (n > largest) {
                largest = n;
            }
            if (n < smallest) {
                smallest = n;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_30bdc273_67cc_4b56_9739_e412e950608e(ArrayList<Integer> nums) {
        return nums.stream().mapToInteger(num -> num).max().getAsInteger();
    }

    
    public static int bigSum_Problem_0_3e442f8d_78fc_4e79_a259_390f89b5a8db(ArrayList<Integer> nums) {
        int largest = nums.get(0) + nums.get(nums.size()-1);
        int smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_2a03176b_1b1d_470b_8731_03db5b53a253(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_3f9363ac_3fb1_4c2f_aade_9f067d2f8b47(ArrayList<Integer> nums) {
        // Write your code here
        int sum = 0;
        int min = nums.get(0);
        int max = nums.get(0);
        int largestSum = nums.get(0);
        for (int num : nums) {
            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
            sum += max;
            largestSum = sum;
            sum += min;
        }
        return largestSum;
    }

    
    public static int bigSum_Problem_0_765c4172_ea93_42c1_abf1_be7713318bb3(ArrayList<Integer> nums) {
        int largest = Collections.max(nums);
        int smallest = Collections.min(nums);
        System.out.println("largest " + largest + " smallest " + smallest);
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_403f6ffc_7f32_4785_aa32_448915f2ad59(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) { // loop through all elements in array
            if (num > largest) { // if current element is greater than largest
                largest = num; // update largest to current element
            } else if (num < smallest) { // if current element is smaller than smallest
                smallest = num; // update smallest to current element
            }
        }
        return largest + smallest; // return sum of largest and smallest
    }

    
    public static int bigSum_Problem_0_c991790d_c251_47c6_afd8_87e09413d3e3(ArrayList<Integer> nums) {
        int sum=0;
        int max= Collections.max(nums);
        int min= Collections.min(nums);
        sum= max + min;
        return sum;
    }

    
    public static int bigSum_Problem_0_a2f0fad7_5997_4b64_99e7_cc742d18bb84(ArrayList<Integer> nums) {
        int largest = 0, smallest = 0;
        for (Integer x : nums) {
            if (largest < x) largest = x;
            if (smallest > x) smallest = x;
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_f3d5817d_6377_4395_a0bb_149374d1229e(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_2ced9375_99cb_4501_af88_41f1a194d726(ArrayList<Integer> nums) {
        int largest = nums.stream().max(Integer::compareTo).get();
        int smallest = nums.stream().min(Integer::compareTo).get();
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_10b150ad_defd_483c_a0da_4aa2b4dcd09c(ArrayList<Integer> nums) {
        int biggest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > biggest) {
                biggest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return biggest + smallest;
    }

    
    public static int bigSum_Problem_1_340b3c75_edd9_4f84_a8cf_50ebc0dffcaa(ArrayList<Integer> nums) {
        // Write your code here
        int largest = nums.get(0), smallest = nums.get(0);
        for (Integer num : nums) {
            if (largest < num) largest = num;
            if (smallest > num) smallest = num;
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_9331b3e7_dea5_4622_82a8_ca37d01f4676(ArrayList<Integer> nums) {
        if (nums == null || nums.size() == 0) return 0L;
        int max = nums.stream().max(Integer::compare).get();
        int min = nums.stream().min(Integer::compare).get();
        return max + min;
    }

    
    public static int bigSum_Problem_1_551ebb76_b8a5_4392_a980_83a7fca3e29d(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return min + max;
    }

    
    public static int bigSum_Problem_2_802c3be5_5d9e_4895_8114_e58d8533227d(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_c20fe11b_4f11_4ed4_abb0_5ac16c0e0a7c(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_e844b1c7_e090_4ca3_a2ba_283627d69039(ArrayList<Integer> nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_b3c16d24_b560_4cae_9062_3bc17326abad(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_2fcfe853_ed63_4b68_8eab_4fb6564e53fc(ArrayList<Integer> nums) {
        int largest = nums.get(0), smallest = nums.get(0);
        for (Integer num : nums) {
            if (num > largest)
                largest = num;
            else if (num < smallest)
                smallest = num;
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_62785128_61b5_4e25_94c2_e01319521da2(ArrayList<Integer> nums) {
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_5d133b71_e169_4143_a5e7_bf5b9ad736c5(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_42384ed1_59ef_46a3_b6bc_cc6c6a26fe66(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_50b0d8ef_1f58_49d1_83eb_cdf4e45f87c2(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_54ce9549_86fd_444b_8dd2_0784c4445b00(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_e52977ab_5f35_4573_8179_bbc80fac7142(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_f1cd1014_06ea_4c0b_9941_1779b655ca0a(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_7643e446_133d_4ddf_8a70_5e5e4b131c0f(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_74141374_8eb6_46f0_9e55_cc79097139cf(ArrayList<Integer> nums) {
        if (nums.isEmpty())
            return 0L;
        int largest = nums.get(0);
        for (int num : nums) {
            if (num > largest)
                largest = num;
        }
        int smallest = nums.get(0);
        for (int num : nums) {
            if (num < smallest)
                smallest = num;
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_86d7fc65_d7d8_4b25_a113_1da567d59c6e(ArrayList<Integer> nums) {
        int sum = 0;
        for(Integer num : nums) {
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_ee55cbe3_3aab_41b6_a7d6_66b01305527e(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_e2488350_b102_4176_a6d1_a25fcfe28fed(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_76a93ec9_bdb4_49df_82a9_3e1e258d7cef(ArrayList<Integer> nums) {
        return Collections.max(nums) + Collections.min(nums);
    }

    
    public static int bigSum_Problem_0_a0a4b2bd_c6a9_413d_815d_76cfcd9a61d2(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_f61d9cf9_308a_4d46_8857_8ca7e0541ea9(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_fa897b9d_6e8d_4857_9aa2_fab6c078c4a9(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int i = 1; i < nums.size(); i++) { // loop through all elements in the array
            if (nums.get(i) > largest) { // if current element is greater than largest
                largest = nums.get(i); // update largest to current element
            } else if (nums.get(i) < smallest) { // if current element is smaller than smallest
                smallest = nums.get(i); // update smallest to current element
            }
        }
        return largest + smallest; // return sum of largest and smallest elements
    }

    
    public static int bigSum_Problem_1_a448c37a_d5f6_4275_9631_b7c57902f9f1(ArrayList<Integer> nums) {
        // Your code here...
        int largest = Collections.max(nums);
        int smallest = Collections.min(nums);
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_d02ef345_73b4_475d_beef_5f7a708c5d7f(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_b016f3db_25fb_4af2_85a8_83713c1b6372(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_9bf89e8b_8a33_4eaf_ac8f_76e1255ce17e(ArrayList<Integer> nums) {
        int sum = 0;
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        sum = largest + smallest;
        return sum;
    }

    
    public static int bigSum_Problem_1_d50cfc6c_7c44_4b09_88b2_ab8790abf36b(ArrayList<Integer> nums) {
        // Write code here
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for (int num: nums){
            if (num > largest){
                largest = num;
            }
            if (num < smallest){
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_3c1302c2_2d5a_49e6_bc32_a692ead6a6c5(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_b88e0508_668c_43d9_9ae2_8bbed6d200e5(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_90e86d37_242a_46bd_b621_8700680e5b44(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first number
        int smallest = nums.get(0); // initialize smallest to first number
        for (Integer num : nums) { // loop through all numbers
            if (num > largest) { // if current number is greater than largest
                largest = num; // update largest
            } else if (num < smallest) { // if current number is smaller than smallest
                smallest = num; // update smallest
            }
        }
        return largest + smallest; // return sum of largest and smallest
    }

    
    public static int bigSum_Problem_0_11f02a2e_d976_458b_8b46_adf1787ab731(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            largest = Math.max(largest, num);
            smallest = Math.min(smallest, num);
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_1ce0b2d8_d727_47ee_8566_1edce7bbae42(ArrayList<Integer> nums) {
        int largestSum = nums.get(0), smallestSum = nums.get(0);
        for(int i = 0; i < nums.size(); i++) {
            largestSum = Math.max(largestSum, nums.get(i));
            smallestSum = Math.min(smallestSum, nums.get(i));
        }
        return largestSum + smallestSum;
    }

    
    public static int bigSum_Problem_2_93ca6d05_72ab_49cb_9018_dde2436dadfe(ArrayList<Integer> nums) {
        int sum = 0;
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int i = 0; i < nums.size(); i++) {
            sum = sum + nums.get(i);
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_f2ecfab6_1188_4aa6_9446_38fc8f5caf44(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_53eab373_8fb5_4480_b938_b70e0f68dafe(ArrayList<Integer> nums) {
        int sum = 0;
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_41534c23_0fe5_46bf_9f97_0465f7215988(ArrayList<Integer> nums) {
        int max = Collections.max(nums);
        int min = Collections.min(nums);
        return max + min;
    }

    
    public static int bigSum_Problem_2_44327633_7325_4f9e_8b12_96f7fdfcd8da(ArrayList<Integer> nums) {
        int sum=0;
        for (Integer num : nums) {
            if (num>sum) sum=num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_79e50a25_03e9_4375_b19d_2c24d9cdb9a8(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }

        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_07003a4f_0228_4756_919b_47714b04b652(ArrayList<Integer> nums) {
        int largest = nums.stream().max(Comparator.naturalOrder()).get();
        int smallest = nums.stream().min(Comparator.naturalOrder()).get();
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_e208f0db_4885_4fee_970b_beed0f63f772(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_87746d6f_7520_437a_84ee_fc52a7c47aff(ArrayList<Integer> nums) {
        ArrayList<Integer> largest = new ArrayList<>();
        ArrayList<Integer> smallest = new ArrayList<>();

        // Find the max and min numbers in the list
        for(int i = 0; i<nums.size(); i++){
            if(i==0)
                largest.add(nums.get(i));
            else if(nums.get(i)>largest.get(i)){
                largest.set(i,nums.get(i));
            }
        }

        for(int i = 0; i<nums.size(); i++){
            if(i==0)
                smallest.add(nums.get(i));
            else if(nums.get(i)<smallest.get(i)){
                smallest.set(i,nums.get(i));
            }
        }

        System.out.println("Largest Number: " + largest);
        System.out.println("Smallest Number: " + smallest);

        // Calculate and return the sum of the max and min numbers
        return largest.stream().mapToInteger(Integer::intValue).sum() +  smallest.stream().mapToInteger(Integer::intValue).sum();
    }

    
    public static int bigSum_Problem_0_756a6136_6421_4b69_bd9c_29faea012ba7(ArrayList<Integer> nums) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            if (num < smallest) {
                smallest = num;
            } else if (num > largest) {
                largest = num;
            }
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_5d133b71_e169_4143_a5e7_bf5b9ad736c5(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_987ff8fe_38aa_46a4_b0ab_68d7b313b28e(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) { // loop through all elements in array
            if (num > largest) { // if current element is greater than largest
                largest = num; // update largest to current element
            } else if (num < smallest) { // if current element is smaller than smallest
                smallest = num; // update smallest to current element
            }
        }
        return largest + smallest; // return sum of largest and smallest
    }

    
    public static int bigSum_Problem_0_3d1a36ef_fb47_443d_ae3c_b6800768e136(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_48cb5798_e8a5_4ef6_8293_4a3a4da32c72(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_272c5650_a7c1_46da_81df_f7a15b45f456(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_dc3494de_dde0_4709_8076_85e261d32421(ArrayList<Integer> nums) {
        // Write code here
        int largest = nums.get(0); 
        int sum = 0; 
        for(int i = 1; i < nums.size(); i++){
            sum += nums.get(i);
            if(largest < sum)
                largest = sum;
        }
        return largest;
    }

    
    public static int bigSum_Problem_0_9f72a021_bf29_489f_8f6e_55f82602eb9f(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max + min;
    }

    
    public static int bigSum_Problem_2_7f07df1a_804c_4325_97be_247b16f9e2d2(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_2dbc20ba_4587_4c1a_aeb9_b0849ed084d3(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max + min;
    }

    
    public static int bigSum_Problem_0_1ce0b2d8_d727_47ee_8566_1edce7bbae42(ArrayList<Integer> nums) {
        int largestSum = nums.get(0), smallestSum = nums.get(0);
        for(int i = 0; i < nums.size(); i++) {
            largestSum = Math.max(largestSum, nums.get(i));
            smallestSum = Math.min(smallestSum, nums.get(i));
        }
        return largestSum + smallestSum;
    }

    
    public static int bigSum_Problem_0_6ba810e2_2b0f_4e47_9530_1bc0c05a32f7(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_91808d35_afd2_4aa5_8f48_d41b07373dd5(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_d727d436_8ea7_4809_8a9e_2726c0b8b52a(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int sum = 0;
        for (int n : nums) {
            if (n > largest) {
                largest = n;
            } else if (n < smallest) {
                smallest = n;
            }
            sum += n;
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_751f801e_0ee4_4d68_a87e_1706396b183e(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_c6545efd_a8e3_4d2d_95d4_30f40ebf56b9(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_1caf684f_3242_4c60_95fa_820f63050dc6(ArrayList<Integer> nums) {
        int bigsum = nums.get(0);
        int smallsum = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > bigsum) {
                bigsum = nums.get(i);
            } else if (nums.get(i) < smallsum) {
                smallsum = nums.get(i);
            }
        }
        return bigsum + smallsum;
    }

    
    public static int bigSum_Problem_1_4fd887da_f5ad_44c8_874c_ccfe3dcbec9e(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < nums.size(); i++) {
            max = Math.max(max, nums.get(i));
            min = Math.min(min, nums.get(i));
        }
        return max + min;
    }

    
    public static int bigSum_Problem_0_4ef94c80_6b54_41f7_9390_f9c3f76ebf75(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num < smallest)
                smallest = num;
            if (num > largest)
                largest = num;
        }
        int sum = largest;
        for (Integer num : nums)
            sum += num;
        return sum;
    }

    
    public static int bigSum_Problem_0_4cb6717f_feb9_4390_beae_797c4fc2cd59(ArrayList<Integer> nums) {
        int sum=0;
        for (Integer i : nums) {
            sum+=i;
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_d02ef345_73b4_475d_beef_5f7a708c5d7f(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_8b4ce8b2_41d0_419a_89d4_334dbf692f9f(ArrayList<Integer> nums) {
        int largest = nums.stream().max(Integer::compareTo).get();
        int smallest = nums.stream().min(Integer::compareTo).get();
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_6fb58e37_6374_49a5_a8f0_5421a423b015(ArrayList<Integer> nums) {
        int largest = 0L;
        int smallest = 0L;
        int sum = 0L;
        for (Integer n : nums) {
            if (n > largest) {
                largest = n;
            } else if (n < smallest) {
                smallest = n;
            }
            sum += n;
        }
        return largest + smallest + sum;
    }

    
    public static int bigSum_Problem_0_49ad7f4f_9d1a_4b4b_8a65_df78039aa5f8(ArrayList<Integer> nums) {
        int sum = nums.stream().mapToInteger(Integer::intValue).sum();
        if (sum % 2 == 0) {
            return Math.pow(sum, 2);
        }
        return Math.pow(sum, 2);
    }

    
    public static int bigSum_Problem_2_2d758685_aaa0_40d0_bd33_84b36acb8dda(ArrayList<Integer> nums) {
        int maxSum = 0;
        for (int sum : nums) {
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    
    public static int bigSum_Problem_2_513e064a_d9da_4a24_9d96_6f4a3a45e1b4(ArrayList<Integer> nums) {
        int sum = 0;
        // Write your logic here
        for (int i=0; i<nums.size(); i++)
        {
            sum = sum + nums.get(i);
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_48cb5798_e8a5_4ef6_8293_4a3a4da32c72(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_5772aa21_2f3e_4062_bec3_adda478d3097(ArrayList<Integer> nums) {
        int biggest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            biggest = Math.max(biggest, num);
            smallest = Math.min(smallest, num);
        }
        System.out.println("Smallest number in ArrayList is: " + smallest);
        System.out.println("Biggest number in ArrayList is: " + biggest);
        return biggest + smallest;
    }

    
    public static int bigSum_Problem_0_53fbd7c2_f514_4195_b84c_1716ca1eb9f7(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if(nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_b0bcbf64_2dc7_4eb2_8d5b_5773e56ce7a5(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_4fd887da_f5ad_44c8_874c_ccfe3dcbec9e(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < nums.size(); i++) {
            max = Math.max(max, nums.get(i));
            min = Math.min(min, nums.get(i));
        }
        return max + min;
    }

    
    public static int bigSum_Problem_2_90fce13c_ba84_4ae1_b7c4_c9eab466f40b(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int sum = 0;
        for (Integer num : nums) {
            if (largest < num) {
                largest = num;
            }
            if (smallest > num) {
                smallest = num;
            }
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_eb3051b4_a060_4583_b681_b43865d79a55(ArrayList<Integer> nums) {
        int largest = nums.stream().max(Integer::compareTo).get();
        int smallest = nums.stream().min(Integer::compareTo).get();
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_765c4172_ea93_42c1_abf1_be7713318bb3(ArrayList<Integer> nums) {
        int largest = Collections.max(nums);
        int smallest = Collections.min(nums);
        System.out.println("largest " + largest + " smallest " + smallest);
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_d621ee3b_5a3f_4ae3_8559_4e7ac120ab7c(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first number
        int smallest = nums.get(0); // initialize smallest to first number
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_08cb592e_a94d_42c4_a406_0bb433256e3c(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_dc3494de_dde0_4709_8076_85e261d32421(ArrayList<Integer> nums) {
        // Write code here
        int largest = nums.get(0); 
        int sum = 0; 
        for(int i = 1; i < nums.size(); i++){
            sum += nums.get(i);
            if(largest < sum)
                largest = sum;
        }
        return largest;
    }

    
    public static int bigSum_Problem_2_9e6c231e_71c3_4af7_8719_99a42a489916(ArrayList<Integer> nums) {
        int sum = 0;
        for (Integer i : nums) {
            sum += i;
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_35296a75_ad50_459a_be6a_5bea51a65d02(ArrayList<Integer> nums) {
        int bigSum_Problem_2_35296a75_ad50_459a_be6a_5bea51a65d02 = 0;
        int minVal = Collections.min(nums);
        int maxVal = Collections.max(nums);

        for(int num: nums) {
            if (num >= minVal && num <= maxVal) {
                bigSum_Problem_2_35296a75_ad50_459a_be6a_5bea51a65d02 += num;
            }
        }
        return bigSum_Problem_2_35296a75_ad50_459a_be6a_5bea51a65d02;
    }

    
    public static int bigSum_Problem_2_bdbb86f2_ebf3_4913_8748_0e1cb0c9db51(ArrayList<Integer> nums) {
        // write your code
        int max = nums.stream().max(Integer::compare).get();
        int min = nums.stream().min(Integer::compare).get();
        return max - min;
    }

    
    public static int bigSum_Problem_0_bc3f3790_7d93_4367_a6aa_8dd58f65fd28(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Integer num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max + min;
    }

    
    public static int bigSum_Problem_1_290af230_82a8_468a_bda6_489ae73fddb7(ArrayList<Integer> nums) {
        int max = 0;
        int min = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return (max + min);
    }

    
    public static int bigSum_Problem_2_c0fb9a15_d58c_4a45_b82f_6874f7023729(ArrayList<Integer> nums) {
        int largest = Integer.MAX_VALUE;
        int smallest = Integer.MIN_VALUE;
        for (Integer n : nums) {
            largest = Math.max(largest, n);
            smallest = Math.min(smallest, n);
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_cd862f51_7fd5_45e5_b30e_1bd73cdb9a21(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of list
        int smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_0637d3f2_822f_4a81_a1e9_27624961acc2(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_553d25eb_d9c8_4749_b780_93d614a352e5(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_db692fc8_fcae_4dbb_a0c6_e2634b14e180(ArrayList<Integer> nums) {
        // Write your code here
        int sum = 0;
        for (int i : nums)
            sum += i;
        return sum;
    }

    
    public static int bigSum_Problem_1_0eec1441_4a25_4a31_ad96_31fa24b674bf(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_d8210b92_1ca1_4f11_9797_d906d29d035d(ArrayList<Integer> nums) {
        if (nums.size() == 0)
            return 0L;
        int largestNum = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largestNum) {
                largestNum = nums.get(i);
            }
        }
        int smallestNum = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < smallestNum) {
                smallestNum = nums.get(i);
            }
        }
        return largestNum + smallestNum;
    }

    
    public static int bigSum_Problem_1_5caf4c13_f13f_4455_996c_20db992c3bc9(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_a9fbb99f_e956_47e2_a9ee_d5b8f583714a(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_54ce9549_86fd_444b_8dd2_0784c4445b00(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_03ef2d15_da08_4018_82d6_681b5ba33c74(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_5919a7c5_3075_4d14_b083_13ffebd51ff9(ArrayList<Integer> nums) {
        // Write your code here.
        int largest = nums.get(0); // Get the first item in the list
        int smallest = nums.get(0); // Get the first item in the list
        for (int num: nums) { // For each item in the list
            if (num > largest) { // If the current item is larger than the largest so far
                largest = num; // Update largest to current item
            }
            if (num < smallest) { // If the current item is smaller than the smallest so far
                smallest = num; // Update smallest to current item
            }
        }
        return largest + smallest; // Return the sum of the two values
    }

    
    public static int bigSum_Problem_2_e2488350_b102_4176_a6d1_a25fcfe28fed(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_693817c5_f2b6_4d24_bc00_e9aa3316f0a1(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_643faf3d_0343_416d_b2c8_1d44baf4d2f9(ArrayList<Integer> nums) {
        // Write your code here
        int sum=0;
        for( int i=0; i<nums.size(); i++ ){
            sum = sum + nums.get(i);
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_4f6c8254_b2ab_4d84_bac3_8d365f0a2b96(ArrayList<Integer> nums) {
        // write your solution here
        if (nums.isEmpty()) {
            return 0;
        }
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_4e59b2d5_690a_4f97_bce5_ebda88f73621(ArrayList<Integer> nums) {
        int largest = -100000000000000000L;
        int smallest = 100000000000000000L;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            } else if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        System.out.println("Largest : " + largest + " Smallest : " + smallest);
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_8dba49d4_2313_4760_ab99_371d86021c30(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_2fcfe853_ed63_4b68_8eab_4fb6564e53fc(ArrayList<Integer> nums) {
        int largest = nums.get(0), smallest = nums.get(0);
        for (Integer num : nums) {
            if (num > largest)
                largest = num;
            else if (num < smallest)
                smallest = num;
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_41534c23_0fe5_46bf_9f97_0465f7215988(ArrayList<Integer> nums) {
        int max = Collections.max(nums);
        int min = Collections.min(nums);
        return max + min;
    }

    
    public static int bigSum_Problem_1_db692fc8_fcae_4dbb_a0c6_e2634b14e180(ArrayList<Integer> nums) {
        // Write your code here
        int sum = 0;
        for (int i : nums)
            sum += i;
        return sum;
    }

    
    public static int bigSum_Problem_1_bdbb86f2_ebf3_4913_8748_0e1cb0c9db51(ArrayList<Integer> nums) {
        // write your code
        int max = nums.stream().max(Integer::compare).get();
        int min = nums.stream().min(Integer::compare).get();
        return max - min;
    }

    
    public static int bigSum_Problem_1_f1cd1014_06ea_4c0b_9941_1779b655ca0a(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_a2f0fad7_5997_4b64_99e7_cc742d18bb84(ArrayList<Integer> nums) {
        int largest = 0, smallest = 0;
        for (Integer x : nums) {
            if (largest < x) largest = x;
            if (smallest > x) smallest = x;
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_cb4eab68_dda0_45f3_8481_1460205934e2(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_db87cfc4_5ce0_460b_878d_bcf25a634467(ArrayList<Integer> nums) {
        int largest = nums.stream().max(Integer::compareTo).get();
        int smallest = nums.stream().min(Integer::compareTo).get();
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_f37d514f_d105_472f_8205_334d7f86f9ee(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_3c2de888_ea51_45e0_91a3_078854a4737c(ArrayList<Integer> nums) {
        int result = 0;
        for (Integer num : nums) {
            if (num > result) {
                result = num;
            }
        }
        return result;
    }

    
    public static int bigSum_Problem_1_7bf7994b_6d8a_4e9a_91f2_f15dbc258f2f(ArrayList<Integer> nums) {
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_e51d7b89_cf2c_4818_a752_149dd2277e83(ArrayList<Integer> nums) {
        int sum = 0;
        for (Integer num : nums) {
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_31403cdd_8ad1_41a6_b20e_757cb92426b3(ArrayList<Integer> nums) {
        int largest = nums.stream().max(Integer::compareTo).get();
        int smallest = nums.stream().min(Integer::compareTo).get();
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_1ab86fe2_8bc6_46e6_8d7d_0309c0e4860a(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_b2484bdf_f4ac_460b_9956_4c7bb0408cbc(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_cb4eab68_dda0_45f3_8481_1460205934e2(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_4ef94c80_6b54_41f7_9390_f9c3f76ebf75(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num < smallest)
                smallest = num;
            if (num > largest)
                largest = num;
        }
        int sum = largest;
        for (Integer num : nums)
            sum += num;
        return sum;
    }

    
    public static int bigSum_Problem_1_91808d35_afd2_4aa5_8f48_d41b07373dd5(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_b6b77ee2_488e_4c30_9c98_79023b809aa5(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_254da1bb_8200_47c0_9197_39c12107207e(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_c991790d_c251_47c6_afd8_87e09413d3e3(ArrayList<Integer> nums) {
        int sum=0;
        int max= Collections.max(nums);
        int min= Collections.min(nums);
        sum= max + min;
        return sum;
    }

    
    public static int bigSum_Problem_2_9a10efbc_1574_47df_b09d_a89ee150409f(ArrayList<Integer> nums) {
        return nums.stream().reduce((a, b) -> a + b).get();
    }

    
    public static int bigSum_Problem_1_27e0ce12_4b8a_40ff_a14a_133aa7db2fda(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_d41530d2_07ae_4581_81b5_2502e906e1a2(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        int sum = largest + smallest;
        return sum;
    }

    
    public static int bigSum_Problem_0_3a370492_d423_4282_87f8_109d12747a0d(ArrayList<Integer> nums) {
        return nums.stream().mapToInteger(x -> x).sum();
    }

    
    public static int bigSum_Problem_0_a61e6c5c_bc31_4782_8e2c_faddc7a17014(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) { // loop through all elements
            if (num > largest) { // if current element is greater than largest
                largest = num; // update largest to current element
            } else if (num < smallest) { // if current element is smaller than smallest
                smallest = num; // update smallest to current element
            }
        }
        return largest + smallest; // return sum of largest and smallest
    }

    
    public static int bigSum_Problem_1_765c4172_ea93_42c1_abf1_be7713318bb3(ArrayList<Integer> nums) {
        int largest = Collections.max(nums);
        int smallest = Collections.min(nums);
        System.out.println("largest " + largest + " smallest " + smallest);
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_00403850_5302_49ee_ae13_1ef2a50a7600(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_6cf849f3_eec3_459d_9129_acbd44a7c1f5(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_9896c1b2_9515_42f2_9c61_92ac49300f26(ArrayList<Integer> nums) {
        int sum = 0;
        for (Integer num : nums) {
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_fe5fae3d_c424_4cd0_ac60_4ead7a54eaab(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_a6464fa8_c131_4ade_abd5_70e05a061925(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_583ec78b_bc28_48f4_8053_13e6202f2d3c(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) largest = num;
            if (num < smallest) smallest = num;
        }
        return smallest + largest;
    }

    
    public static int bigSum_Problem_0_441ba183_52f0_4ad7_8e2d_6c1970d72883(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if(nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_5bbadf6c_8e54_4b3c_afc5_2c93ff14ed14(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_a159a8de_7f3d_4486_8fd6_a552100403cc(ArrayList<Integer> nums) {
        return nums.stream().mapToInteger(n -> n).sum();
    }

    
    public static int bigSum_Problem_2_6ba810e2_2b0f_4e47_9530_1bc0c05a32f7(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_babf1923_f3c7_4019_8d67_48a67c17b5ec(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_40ea5595_3217_4dde_9cb6_ab605f5c80f1(ArrayList<Integer> nums) {
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_7b2d531e_37d2_4572_9dcc_f70e26a4fabd(ArrayList<Integer> nums) {
        int big = nums.stream().mapToInteger(Integer::intValue).max().getAsInteger();
        int smal = nums.stream().mapToInteger(Integer::intValue).min().getAsInteger();
        int sum;
        sum = big + smal;
        return sum;
    }

    
    public static int bigSum_Problem_0_cc1e419a_d187_42aa_a7c6_bdc319fbdd0a(ArrayList<Integer> nums) {
        int largest = 0;
        int smallest = 0;
        for (int x : nums) {
            if (x > largest) {
                largest = x;
            }
            if (x < smallest) {
                smallest = x;
            }
        }
        return smallest + largest;
    }

    
    public static int bigSum_Problem_0_c5dc4193_cdf6_4196_9624_5f27bdd9a4fe(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_47dd5cdb_078a_4a0b_b851_c3c854ed7024(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_8429092b_e24d_4567_b048_7ed7376073e4(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_a159a8de_7f3d_4486_8fd6_a552100403cc(ArrayList<Integer> nums) {
        return nums.stream().mapToInteger(n -> n).sum();
    }

    
    public static int bigSum_Problem_2_d01c0220_9805_496c_8186_4cecabb4578b(ArrayList<Integer> nums) {
        if (nums == null || nums.size() == 0) return 0;
        int largest = Collections.max(nums);
        int smallest = Collections.min(nums);
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_852a3b51_ca97_4968_884a_8d9c633dbef2(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (largest < num) largest = num;
            if (smallest > num) smallest = num;
        }
        return (largest + smallest);
    }

    
    public static int bigSum_Problem_0_403f6ffc_7f32_4785_aa32_448915f2ad59(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) { // loop through all elements in array
            if (num > largest) { // if current element is greater than largest
                largest = num; // update largest to current element
            } else if (num < smallest) { // if current element is smaller than smallest
                smallest = num; // update smallest to current element
            }
        }
        return largest + smallest; // return sum of largest and smallest
    }

    
    public static int bigSum_Problem_2_d73fb415_cc04_459d_9c88_22e8a2fd3fa6(ArrayList<Integer> nums) {
        int largest = nums.get(0), smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_bfc009de_0bee_4efc_a607_fcdae102974a(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_41e32589_501b_474c_aa8b_c97f9f688c10(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_4c65c3cb_e6b5_4c90_88bd_4a40de17d3c6(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int sum = 0;
        // iterate over array
        for (Integer number : nums) {
            // add number to sum
            sum += number;
            // set new largest and smallest values
            largest = Math.max(largest, number);
            smallest = Math.min(smallest, number);
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_aba8a6e5_5932_4bab_96e3_a36da512b9ae(ArrayList<Integer> nums) {
        int sum = 0;
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_2a7c20ae_ab11_4218_ab4c_f3099c8d8dc2(ArrayList<Integer> nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_16c1fee4_761d_4802_9cd4_117b2f9fa6d9(ArrayList<Integer> nums) {
        int largest = Collections.max(nums);
        int smallest = Collections.min(nums);
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_8a315024_0976_4ad1_9830_b7666f0e00b4(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_94a933e9_f68c_45d0_9dd2_92254a733554(ArrayList<Integer> nums) {
        int largest = nums.get(0), smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_44dbe357_3ca0_48bb_8a12_edfd50b82197(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first number
        int smallest = nums.get(0); // initialize smallest to first number
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_ab481123_ac49_4477_a1ce_e6866be9ac67(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        return max - min;
    }

    
    public static int bigSum_Problem_2_d23c64df_e4f3_4251_89fb_e5c3153f3715(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int num : nums) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        return max + min;
    }

    
    public static int bigSum_Problem_1_fe9fc7bb_131e_4751_9595_2709fb10037f(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first number
        int smallest = nums.get(0); // initialize smallest to first number
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_cf26af45_d1a9_42f2_a7e8_987ec359fbee(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n >= largest) {
                largest = n;
            }
            if (n <= smallest) {
                smallest = n;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_9571b4f7_8ee4_4d85_b4b5_e03825aba2e1(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_0868d3e0_4f7d_41ae_a8ee_f2a52d90f48b(ArrayList<Integer> nums) {
        // Write your logic here
        int largest = Collections.max(nums);
        int smallest = Collections.min(nums);
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_2cc26bc2_620b_4108_9269_9108297076d7(ArrayList<Integer> nums) {
        int largest = nums.stream().max(Comparator.naturalOrder()).get();
        int smallest = nums.stream().min(Comparator.naturalOrder()).get();
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_11f02a2e_d976_458b_8b46_adf1787ab731(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            largest = Math.max(largest, num);
            smallest = Math.min(smallest, num);
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_971eb93e_6221_439a_8038_c5a1dc5d5dd0(ArrayList<Integer> nums) {
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_ea75f9c5_6398_4b4f_b1db_91c3d0f75fd2(ArrayList<Integer> nums) {
        int largest = Collections.max(nums);
        int smallest = Collections.min(nums);
        int sum = largest + smallest;
        return sum;
    }

    
    public static int bigSum_Problem_2_8d75aefa_0c31_419b_b46e_6d2f531a869a(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to be first element of array
        int smallest = nums.get(0); // initialize smallest to be first element of array
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return smallest + largest;
    }

    
    public static int bigSum_Problem_0_84ef48c2_4fe7_405f_85c5_9d66c17dc82d(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_fc113b28_5266_4a11_a6a0_9599189d1db1(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_5bbadf6c_8e54_4b3c_afc5_2c93ff14ed14(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_7bc9e60e_de43_4a66_b20f_d038404332fa(ArrayList<Integer> nums) {
        // Write your code here
        int smallest =  Double.MAX_VALUE;
        int largest =  Double.MIN_VALUE;
        for (int i: nums) {
            if (i < smallest) {
                smallest = i;
            }
            if (i > largest) {
                largest = i;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_5a4eb43c_8aeb_4a29_aea0_4fa6cffe5acc(ArrayList<Integer> nums) {
        int biggest = nums.stream().mapToInteger(x -> x).max().getAsInteger();
        int smallest = nums.stream().mapToInteger(x -> x).min().getAsInteger();
        return biggest + smallest;
    }

    
    public static int bigSum_Problem_1_4c65c3cb_e6b5_4c90_88bd_4a40de17d3c6(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int sum = 0;
        // iterate over array
        for (Integer number : nums) {
            // add number to sum
            sum += number;
            // set new largest and smallest values
            largest = Math.max(largest, number);
            smallest = Math.min(smallest, number);
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_d9e8468c_f147_4c87_b5be_34bf5b59f0b8(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_eb3051b4_a060_4583_b681_b43865d79a55(ArrayList<Integer> nums) {
        int largest = nums.stream().max(Integer::compareTo).get();
        int smallest = nums.stream().min(Integer::compareTo).get();
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_07003a4f_0228_4756_919b_47714b04b652(ArrayList<Integer> nums) {
        int largest = nums.stream().max(Comparator.naturalOrder()).get();
        int smallest = nums.stream().min(Comparator.naturalOrder()).get();
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_10b150ad_defd_483c_a0da_4aa2b4dcd09c(ArrayList<Integer> nums) {
        int biggest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > biggest) {
                biggest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return biggest + smallest;
    }

    
    public static int bigSum_Problem_2_f1cd1014_06ea_4c0b_9941_1779b655ca0a(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_a819474f_a712_4c04_836f_d4063171a9fc(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_ee55cbe3_3aab_41b6_a7d6_66b01305527e(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_c991790d_c251_47c6_afd8_87e09413d3e3(ArrayList<Integer> nums) {
        int sum=0;
        int max= Collections.max(nums);
        int min= Collections.min(nums);
        sum= max + min;
        return sum;
    }

    
    public static int bigSum_Problem_1_62a17bae_b60f_48bb_85e9_a4a397397d13(ArrayList<Integer> nums) {
        int largest = nums.get(0), smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_23ff99f3_1756_4bda_9aca_6d75f781ec66(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_fa12a535_7e8a_4c23_8ded_f6d53b97404d(ArrayList<Integer> nums) {
        int largest = nums.stream().max(Integer::compareTo).get();
        int smallest = nums.stream().min(Integer::compareTo).get();
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_243e7b94_9d1d_4afb_94d7_508058a22b95(ArrayList<Integer> nums) {
        int result = 0, largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i > largest) {
                largest = i;
            } else if (i < smallest) {
                smallest = i;
            }
        }
        largest = largest + 1;
        smallest = smallest - 1;
        for (int i : nums) {
            if (i > largest) {
                largest = i;
            } else if (i < smallest) {
                smallest = i;
            }
        }
        for (int i : nums) {
            if (i > largest) {
                result = largest - i;
            } else if (i < smallest) {
                result = i - smallest;
            }
        }
        return result;
    }

    
    public static int bigSum_Problem_0_1ab86fe2_8bc6_46e6_8d7d_0309c0e4860a(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_756a6136_6421_4b69_bd9c_29faea012ba7(ArrayList<Integer> nums) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            if (num < smallest) {
                smallest = num;
            } else if (num > largest) {
                largest = num;
            }
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_8f58b122_b919_4e1e_b914_5b16a28f8ffb(ArrayList<Integer> nums) {
        int bigSum_Problem_0_8f58b122_b919_4e1e_b914_5b16a28f8ffb = nums.get(0) + nums.get(nums.size()-1);
        for (int num : nums)
            if (num > bigSum_Problem_0_8f58b122_b919_4e1e_b914_5b16a28f8ffb)
                bigSum_Problem_0_8f58b122_b919_4e1e_b914_5b16a28f8ffb = num;
        return bigSum_Problem_0_8f58b122_b919_4e1e_b914_5b16a28f8ffb;
    }

    
    public static int bigSum_Problem_2_b81be4b9_7a7d_414a_9c7d_994f11fc3501(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_91808d35_afd2_4aa5_8f48_d41b07373dd5(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_79e50a25_03e9_4375_b19d_2c24d9cdb9a8(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }

        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_d2042766_d8c8_4aa2_8b03_ed5f693a458e(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
        // Write your code here
        return largest;
    }

    
    public static int bigSum_Problem_2_340b3c75_edd9_4f84_a8cf_50ebc0dffcaa(ArrayList<Integer> nums) {
        // Write your code here
        int largest = nums.get(0), smallest = nums.get(0);
        for (Integer num : nums) {
            if (largest < num) largest = num;
            if (smallest > num) smallest = num;
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_b016f3db_25fb_4af2_85a8_83713c1b6372(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_3dda17da_aee5_430d_bb20_858b68b473b2(ArrayList<Integer> nums) {
        int biggerSum = Integer.MIN_VALUE;
        int smallerSum = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > biggerSum) {
                biggerSum = num;
            } else if (num < smallerSum) {
                smallerSum = num;
            }
        }
        return biggerSum + smallerSum;
    }

    
    public static int bigSum_Problem_1_e1733a52_2682_4529_8c78_ed755b406569(ArrayList<Integer> nums) {
        int size = nums.size();
        int biggest = nums.get(0);
        int smallest = nums.get(0);
        for (int i = 0; i < size; i++) {
            if (nums.get(i) > biggest) {
                biggest = nums.get(i);
            } else if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return biggest + smallest;
    }

    
    public static int bigSum_Problem_2_adc0ce5c_0e68_447a_97cd_9db2b9e2e9dc(ArrayList<Integer> nums) {
        int largest = nums.get(0); //first number
        int smallest = nums.get(0);
        for(int i =1; i<nums.size(); i++){
            if(nums.get(i) > largest){
                largest = nums.get(i);
            }
            if(nums.get(i) < smallest){
                smallest = nums.get(i);
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_9f21ba53_5d02_4fba_8373_4aecabcb033e(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_8bc803df_0b9e_4b3c_ab5d_ef432b1c0375(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first number
        int smallest = nums.get(0); // initialize smallest to first number
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_095b56e0_6912_4d0c_a2e8_9a7859832c60(ArrayList<Integer> nums) {
        int sumLargest = Integer.MIN_VALUE;
        int sumSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > sumSmallest) {
                sumSmallest = nums.get(i);
            }
            if (nums.get(i) < sumLargest) {
                sumLargest = nums.get(i);
            }
        }

        return sumLargest + sumSmallest;
    }

    
    public static int bigSum_Problem_2_bef91446_65f5_435f_9056_c50fa59351a8(ArrayList<Integer> nums) {
        int big = nums.get(0), small = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > big) {
                big = nums.get(i);
            } else if (nums.get(i) < small) {
                small = nums.get(i);
            }
        }
        return (big + small);
    }

    
    public static int bigSum_Problem_2_e2a2c3b0_82d3_483e_a244_09a7cdecd299(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num: nums){
            if(num > largest)
                largest = num;
            if(num < smallest)
                smallest = num;
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_e1733a52_2682_4529_8c78_ed755b406569(ArrayList<Integer> nums) {
        int size = nums.size();
        int biggest = nums.get(0);
        int smallest = nums.get(0);
        for (int i = 0; i < size; i++) {
            if (nums.get(i) > biggest) {
                biggest = nums.get(i);
            } else if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return biggest + smallest;
    }

    
    public static int bigSum_Problem_0_550f35fa_6eec_46ea_92f2_79912f07f896(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_5b3bdb22_be94_4b51_ba78_12f55fe46821(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return min + max;
    }

    
    public static int bigSum_Problem_1_65c9238d_411d_46ac_9d49_b5c33199ae3d(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_f1c9002d_a1bf_479b_81f2_c6f7990f7f90(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_591a582b_d060_4618_8374_ba4c8895c0e0(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_25415ecf_fe1c_48f9_ba91_6b0f3f95d39a(ArrayList<Integer> nums) {
        int largest = nums.get(0);
        int smallest = nums.get(0);

        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return smallest + largest;
    }

    
    public static int bigSum_Problem_2_a097f480_ade0_4507_83fd_b2d67d5d5703(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_7bb4526b_5971_42b4_89b0_e56759ee54e5(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_14372881_6aca_4932_ab40_f2f1d78f1f88(ArrayList<Integer> nums) {
        int sum = 0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_ed847d0c_4dda_41c7_87c5_f7f4e9646077(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_3b98f90a_cc28_405d_94a7_6a7e11e6695a(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_9b909b21_5395_4a30_ac23_564b0caf1112(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_54ce9549_86fd_444b_8dd2_0784c4445b00(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_115da78e_2b45_402a_abd8_22377c40a217(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_9b3056c6_fae1_47f3_a11b_30e3f974a7b1(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_42dcb1b0_01c6_4f87_bfdb_574343dcd062(ArrayList<Integer> nums) {
        int largest = nums.get(0), smallest = nums.get(0);
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if(nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_97393c3e_d861_4a0f_bef1_cdf1c56a2808(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first number
        int smallest = nums.get(0); // initialize smallest to first number
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_2df715a9_e0e9_4391_831e_fe5b6c4dfd47(ArrayList<Integer> nums) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_adc0ce5c_0e68_447a_97cd_9db2b9e2e9dc(ArrayList<Integer> nums) {
        int largest = nums.get(0); //first number
        int smallest = nums.get(0);
        for(int i =1; i<nums.size(); i++){
            if(nums.get(i) > largest){
                largest = nums.get(i);
            }
            if(nums.get(i) < smallest){
                smallest = nums.get(i);
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_7505ef41_1c6c_4f42_a5b6_0c84d015d721(ArrayList<Integer> nums) {
        // Write your code here
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_bb11731d_dfa4_4126_87e3_b2f811b10e06(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_bb11731d_dfa4_4126_87e3_b2f811b10e06(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_dc22f47f_6c42_437f_b0cf_441f302b4cbb(ArrayList<Integer> nums) {
        int sum = 0;
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int i = 1; i < nums.size(); i++) {
            sum += nums.get(i);
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_a448c37a_d5f6_4275_9631_b7c57902f9f1(ArrayList<Integer> nums) {
        // Your code here...
        int largest = Collections.max(nums);
        int smallest = Collections.min(nums);
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_9571b4f7_8ee4_4d85_b4b5_e03825aba2e1(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_0dcb92f9_6257_4946_8892_f5f21ebae532(ArrayList<Integer> nums) {
        // write your code here
        int sum = 0; 
        for(int i=0; i<nums.size(); i++){
            if(nums.get(i)>sum){
                sum = nums.get(i);
            }
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_7f5d73e6_3dd6_49cc_a0d9_b633e6feef8c(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_efb7c610_9dc5_4218_a88a_e5584623323c(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_d23c64df_e4f3_4251_89fb_e5c3153f3715(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int num : nums) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        return max + min;
    }

    
    public static int bigSum_Problem_1_c01d404f_b492_4231_8cee_89463d63a5b4(ArrayList<Integer> nums) {
        int largest = nums.stream().mapToInteger(Integer::intValue).max().getAsInteger();
        int smallest = nums.stream().mapToInteger(Integer::intValue).min().getAsInteger();
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_00403850_5302_49ee_ae13_1ef2a50a7600(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_b3c16d24_b560_4cae_9062_3bc17326abad(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_41e32589_501b_474c_aa8b_c97f9f688c10(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_03b50f42_ced4_4fbe_8dcf_b2d3aa3da8a9(ArrayList<Integer> nums) {
        int largest = 0L;
        int smallest = 0L;
        int sum = 0L;
        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
            if (largest < nums.get(i)) {
                largest = nums.get(i);
            } else if (smallest > nums.get(i)) {
                smallest = nums.get(i);
            }
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_325b1edf_d68a_4b20_b2f3_89bffc9dcb36(ArrayList<Integer> nums) {
        int biggest = nums.get(0), smallest = nums.get(0);
        for (int num : nums) {
            if (num > biggest) {
                biggest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return biggest + smallest;
    }

    
    public static int bigSum_Problem_0_8d75aefa_0c31_419b_b46e_6d2f531a869a(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to be first element of array
        int smallest = nums.get(0); // initialize smallest to be first element of array
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return smallest + largest;
    }

    
    public static int bigSum_Problem_1_327b660e_0c38_4fe3_a81e_1e578be2e912(ArrayList<Integer> nums) {
        int sum = 0;
        int max = nums.get(0); // Initialize max to first number
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        sum = max + max;
        return sum;
    }

    
    public static int bigSum_Problem_0_8a315024_0976_4ad1_9830_b7666f0e00b4(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_c20fe11b_4f11_4ed4_abb0_5ac16c0e0a7c(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_9f444b84_20cd_4bb3_9fc8_551ea7367c8b(ArrayList<Integer> nums) {
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_5abcce87_d3e3_465a_8992_e31ae7b5d04d(ArrayList<Integer> nums) {
        int sum = 0;
        for(int i = 0; i < nums.size(); i++){
            sum += nums.get(i);
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_583ec78b_bc28_48f4_8053_13e6202f2d3c(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) largest = num;
            if (num < smallest) smallest = num;
        }
        return smallest + largest;
    }

    
    public static int bigSum_Problem_0_40881c3c_74d0_4ffb_85d8_067ec56f7d4d(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_43b0e701_eb83_4a9e_8e81_30bd910cdffb(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_93ca6d05_72ab_49cb_9018_dde2436dadfe(ArrayList<Integer> nums) {
        int sum = 0;
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int i = 0; i < nums.size(); i++) {
            sum = sum + nums.get(i);
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_97393c3e_d861_4a0f_bef1_cdf1c56a2808(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first number
        int smallest = nums.get(0); // initialize smallest to first number
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_53fbd7c2_f514_4195_b84c_1716ca1eb9f7(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if(nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_35296a75_ad50_459a_be6a_5bea51a65d02(ArrayList<Integer> nums) {
        int bigSum_Problem_0_35296a75_ad50_459a_be6a_5bea51a65d02 = 0;
        int minVal = Collections.min(nums);
        int maxVal = Collections.max(nums);

        for(int num: nums) {
            if (num >= minVal && num <= maxVal) {
                bigSum_Problem_0_35296a75_ad50_459a_be6a_5bea51a65d02 += num;
            }
        }
        return bigSum_Problem_0_35296a75_ad50_459a_be6a_5bea51a65d02;
    }

    
    public static int bigSum_Problem_0_290af230_82a8_468a_bda6_489ae73fddb7(ArrayList<Integer> nums) {
        int max = 0;
        int min = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return (max + min);
    }

    
    public static int bigSum_Problem_2_65c9238d_411d_46ac_9d49_b5c33199ae3d(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_0067189c_e3d8_41a5_ab4c_ea8bd79d5fee(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_550f35fa_6eec_46ea_92f2_79912f07f896(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_14372881_6aca_4932_ab40_f2f1d78f1f88(ArrayList<Integer> nums) {
        int sum = 0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_9e6c231e_71c3_4af7_8719_99a42a489916(ArrayList<Integer> nums) {
        int sum = 0;
        for (Integer i : nums) {
            sum += i;
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_3b98f90a_cc28_405d_94a7_6a7e11e6695a(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_e55349be_ae0c_4068_b272_f86fba79917a(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_817ffeb7_6ace_4125_a1b5_b79fdbd26018(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Integer num : nums) {
            if (max < num) {
                max = num;
            } else if (min > num) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigSum_Problem_0_4e59b2d5_690a_4f97_bce5_ebda88f73621(ArrayList<Integer> nums) {
        int largest = -100000000000000000L;
        int smallest = 100000000000000000L;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            } else if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        System.out.println("Largest : " + largest + " Smallest : " + smallest);
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_d50cfc6c_7c44_4b09_88b2_ab8790abf36b(ArrayList<Integer> nums) {
        // Write code here
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for (int num: nums){
            if (num > largest){
                largest = num;
            }
            if (num < smallest){
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_f1c9002d_a1bf_479b_81f2_c6f7990f7f90(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_825b8769_b101_44ca_a50e_1a6d13ff42e3(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_3dc76a91_3e65_43d1_bd19_cac7e9a4e95c(ArrayList<Integer> nums) {
        int max = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        int min = 0;
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max+min;
    }

    
    public static int bigSum_Problem_0_272c5650_a7c1_46da_81df_f7a15b45f456(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_84ef48c2_4fe7_405f_85c5_9d66c17dc82d(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_b7a04a3e_71eb_44be_b23f_a2133aeb1583(ArrayList<Integer> nums) {
        int sumOfLargest = 0;
        int sumOfSmallest = 0;
        for(int num : nums) {
            if(num > sumOfLargest) {
                sumOfLargest = num;
            }
            else if(num < sumOfSmallest) {
                sumOfSmallest = num;
            }
        }
        System.out.println("The sum of the largest and smallest numbers is " + sumOfLargest + " " + sumOfSmallest);
        return sumOfLargest + sumOfSmallest;
    }

    
    public static int bigSum_Problem_2_97af2f47_8300_47d4_88e5_4f153327a2e6(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            if(num < min){
                min = num;
            }
            if(num > max){
                max = num;
            }
        }
        return max+min;
    }

    
    public static int bigSum_Problem_0_c1e6a94e_a526_4cdb_885c_d62b39380a52(ArrayList<Integer> nums) {
        if (nums.size() <= 1) return 0;

        // sort and return the result
        Collections.sort(nums);
        return nums.get(nums.size() - 1);
    }

    
    public static int bigSum_Problem_2_2485bea8_23d0_41a8_8cda_39b51978295b(ArrayList<Integer> nums) {
        int largest = nums.get(0), smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_62785128_61b5_4e25_94c2_e01319521da2(ArrayList<Integer> nums) {
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_3da632af_a84e_4bc3_a711_ae634f616f1b(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_2a03176b_1b1d_470b_8731_03db5b53a253(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_7643e446_133d_4ddf_8a70_5e5e4b131c0f(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_2607a4bf_39c3_403e_972a_d55e766f0f60(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int i = 1; i < nums.size(); i++) { // loop through array
            if (nums.get(i) > largest) { // if current element is greater than largest
                largest = nums.get(i); // update largest to current element
            } else { // if current element is smaller than largest
                smallest = nums.get(i); // update smallest to current element
            }
        }
        return largest + smallest; // return sum of largest and smallest
    }

    
    public static int bigSum_Problem_2_dc22f47f_6c42_437f_b0cf_441f302b4cbb(ArrayList<Integer> nums) {
        int sum = 0;
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int i = 1; i < nums.size(); i++) {
            sum += nums.get(i);
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_d2042766_d8c8_4aa2_8b03_ed5f693a458e(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
        // Write your code here
        return largest;
    }

    
    public static int bigSum_Problem_2_0c8c1f7e_dba0_416a_bfa3_bb6220cd0e58(ArrayList<Integer> nums) {
        // Initialize min and max values to positive infinity
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        // Iterate through the list and compute the sum and max/min values
        for (Integer num : nums) {
            sum = sum + num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        // Return the sum and the max/min values
        return sum;
    }

    
    public static int bigSum_Problem_2_bfb9eae8_70c3_4aa1_9db5_dcfbca60b3ef(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_42dcb1b0_01c6_4f87_bfdb_574343dcd062(ArrayList<Integer> nums) {
        int largest = nums.get(0), smallest = nums.get(0);
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if(nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_b7a04a3e_71eb_44be_b23f_a2133aeb1583(ArrayList<Integer> nums) {
        int sumOfLargest = 0;
        int sumOfSmallest = 0;
        for(int num : nums) {
            if(num > sumOfLargest) {
                sumOfLargest = num;
            }
            else if(num < sumOfSmallest) {
                sumOfSmallest = num;
            }
        }
        System.out.println("The sum of the largest and smallest numbers is " + sumOfLargest + " " + sumOfSmallest);
        return sumOfLargest + sumOfSmallest;
    }

    
    public static int bigSum_Problem_0_a9ccf2fa_782c_45b5_9163_cc95c347755b(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_971eb93e_6221_439a_8038_c5a1dc5d5dd0(ArrayList<Integer> nums) {
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_42b9527e_fa56_4d20_a4ad_aef7a7655722(ArrayList<Integer> nums) {
        int largest = nums.get(0), smallest = nums.get(0);
        for (int num: nums) {
            if (largest < num)
                largest = num;
            if (smallest > num)
                smallest = num;
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_81515a63_ec18_4ece_8067_9db6ee630df2(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_27e0ce12_4b8a_40ff_a14a_133aa7db2fda(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_60876e7d_8372_4e61_b248_afad07ceb4e7(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int i = 1; i < nums.size(); i++) { // loop through rest of array
            if (nums.get(i) > largest) { // if current element is greater than largest
                largest = nums.get(i); // update largest
            } else if (nums.get(i) < smallest) { // if current element is smaller than smallest
                smallest = nums.get(i); // update smallest
            }
        }
        return largest + smallest; // return sum of largest and smallest
    }

    
    public static int bigSum_Problem_2_42384ed1_59ef_46a3_b6bc_cc6c6a26fe66(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_2b744a68_f5f8_403c_8428_13d2a47cbd4f(ArrayList<Integer> nums) {
        int largestNum = 0;
        int smallestNum = 0;
        // Loop through the array list
        for (Integer i : nums) {
            // Calculate the largest and smallest numbers
            if (i < largestNum) largestNum = i;
            if (i > smallestNum) smallestNum = i;
        }
        // Return largest and smallest numbers
        return largestNum + smallestNum;
    }

    
    public static int bigSum_Problem_1_03ef2d15_da08_4018_82d6_681b5ba33c74(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_d794beb0_ff45_43b4_8b9e_df81aae18a16(ArrayList<Integer> nums) {
        int sum = 0;
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_62a17bae_b60f_48bb_85e9_a4a397397d13(ArrayList<Integer> nums) {
        int largest = nums.get(0), smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_f93db486_396f_44d2_94e7_76008aaa943f(ArrayList<Integer> nums) {
        int largest = nums.stream().max(Integer::compareTo).get();
        int smallest = nums.stream().min(Integer::compareTo).get();
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_7013b9d6_7fa8_4bd5_bf1d_e8691404d5fd(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_bfb9eae8_70c3_4aa1_9db5_dcfbca60b3ef(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_3c2de888_ea51_45e0_91a3_078854a4737c(ArrayList<Integer> nums) {
        int result = 0;
        for (Integer num : nums) {
            if (num > result) {
                result = num;
            }
        }
        return result;
    }

    
    public static int bigSum_Problem_1_3a81d117_0657_4fe6_b79f_ecc04df04408(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_06863796_171d_43c6_815f_98e4692da5c5(ArrayList<Integer> nums) {
        // TODO Auto-generated method stub
        int largest = nums.stream()
                .max(Comparator.comparing(Number::intValue))
                .orElseThrow(NoSuchElementException::new);
        int smallest = nums.stream()
                .min(Comparator.comparing(Number::intValue))
                .orElseThrow(NoSuchElementException::new);
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_6d994f76_daa7_4286_84da_91e3f797d744(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_a097f480_ade0_4507_83fd_b2d67d5d5703(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_ea75f9c5_6398_4b4f_b1db_91c3d0f75fd2(ArrayList<Integer> nums) {
        int largest = Collections.max(nums);
        int smallest = Collections.min(nums);
        int sum = largest + smallest;
        return sum;
    }

    
    public static int bigSum_Problem_1_00e890e5_0c5f_4edb_af18_ffef237989e1(ArrayList<Integer> nums) {
        int largestNum = nums.get(0); // initialize with first element of list
        int smallestNum = nums.get(0); // initialize with first element of list
        for (Integer num : nums) {
            if (num > largestNum) {
                largestNum = num;
            } else if (num < smallestNum) {
                smallestNum = num;
            }
        }
        return largestNum + smallestNum;
    }

    
    public static int bigSum_Problem_2_254da1bb_8200_47c0_9197_39c12107207e(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_7bf7994b_6d8a_4e9a_91f2_f15dbc258f2f(ArrayList<Integer> nums) {
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_31b1b4d5_006e_4150_83d9_9e8486a231fa(ArrayList<Integer> nums) {
        int largest = nums.get(0), smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_0bb57d22_d6e3_4d22_8c0f_da620a83d662(ArrayList<Integer> nums) {
        if (nums == null)
            return 0;
        int biggest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i > biggest) {
                biggest = i;
            }
            if (i < smallest) {
                smallest = i;
            }
        }
        return biggest + smallest;
    }

    
    public static int bigSum_Problem_2_b4d97708_b46b_48d7_8122_26c822051f33(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first number
        int smallest = nums.get(0); // initialize smallest to first number
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_d02ef345_73b4_475d_beef_5f7a708c5d7f(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_b016f3db_25fb_4af2_85a8_83713c1b6372(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_7505ef41_1c6c_4f42_a5b6_0c84d015d721(ArrayList<Integer> nums) {
        // Write your code here
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_c66b3866_ac1a_4767_a026_ab53cb637401(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_d9e8468c_f147_4c87_b5be_34bf5b59f0b8(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_6e80983d_24c2_44ae_a62e_f383840ed57f(ArrayList<Integer> nums) {
        int biggest = 0, smallest = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > biggest) {
                biggest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        int biggestSum = biggest;
        int smallestSum = smallest;
        for (int i = 0; i < nums.size(); i++) {
            if (biggest == smallest && biggest != 0) {
                return biggestSum;
            }
            if (nums.get(i) > biggestSum) {
                biggestSum = nums.get(i);
            }
            if (nums.get(i) < smallestSum) {
                smallestSum = nums.get(i);
            }
        }
        return biggestSum;
    }

    
    public static int bigSum_Problem_2_dcece516_dfec_4f41_9bae_6cc4d9f67761(ArrayList<Integer> nums) {
        int largest = nums.stream().mapToInteger(Integer::intValue).max().orElse(0L);
        int smallest = nums.stream().mapToInteger(Integer::intValue).min().orElse(0L);
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_7bc9e60e_de43_4a66_b20f_d038404332fa(ArrayList<Integer> nums) {
        // Write your code here
        int smallest =  Double.MAX_VALUE;
        int largest =  Double.MIN_VALUE;
        for (int i: nums) {
            if (i < smallest) {
                smallest = i;
            }
            if (i > largest) {
                largest = i;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_2a7c20ae_ab11_4218_ab4c_f3099c8d8dc2(ArrayList<Integer> nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_902bad7d_25f4_4ea8_aaec_5df4daa657ef(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_2532daf7_4bdc_4464_8bd6_62f6e7b287d3(ArrayList<Integer> nums) {
        int maxSum = Collections.max(nums);
        int minSum = Collections.min(nums);
        return maxSum + minSum;
    }

    
    public static int bigSum_Problem_0_78705e94_a3dc_4ad4_b3ad_b975f2b25d20(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_b53f7976_f900_40e5_8291_54dda7643cd5(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_16c1fee4_761d_4802_9cd4_117b2f9fa6d9(ArrayList<Integer> nums) {
        int largest = Collections.max(nums);
        int smallest = Collections.min(nums);
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_30e38832_34d3_4181_b90e_6f398b1f0d6a(ArrayList<Integer> nums) {
        int sum=0;
        for(Integer num: nums)
        {
            sum+=num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_bb600afa_8b4f_4ae2_849b_ec137ae6cf1f(ArrayList<Integer> nums) {
        int sum = 0;
        for(int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_449cd487_a08d_44af_8957_46cee2d09162(ArrayList<Integer> nums) {
        int largest = Collections.max(nums);
        int smallest = Collections.min(nums);
        int sum = largest + smallest;
        return sum;
    }

    
    public static int bigSum_Problem_0_9b2a5e23_0a89_47a6_9018_5eb3c2a28670(ArrayList<Integer> nums) {
        int sumLargest = nums.get(0);
        int sumSmallest = nums.get(0);
        for (int num : nums) {
            sumLargest = Math.max(sumLargest, num);
            sumSmallest = Math.min(sumSmallest, num);
        }
        return sumLargest + sumSmallest;
    }

    
    public static int bigSum_Problem_0_bd6d996c_da96_4202_a473_5e8566b8e3ce(ArrayList<Integer> nums) {
        int maxSum = 0, minSum = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > maxSum) {
                maxSum = nums.get(i);
            }
            if (nums.get(i) < minSum) {
                minSum = nums.get(i);
            }
        }
        return maxSum + minSum;
    }

    
    public static int bigSum_Problem_2_9f72a021_bf29_489f_8f6e_55f82602eb9f(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max + min;
    }

    
    public static int bigSum_Problem_0_8429092b_e24d_4567_b048_7ed7376073e4(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_553d25eb_d9c8_4749_b780_93d614a352e5(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_3a660b2c_e476_4a2b_81fe_c483320c354a(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_8372870d_4020_4adc_9a8e_eb54ce7ff29c(ArrayList<Integer> nums) {
        int largest = Collections.max(nums);
        int smallest = Collections.min(nums);
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_095b56e0_6912_4d0c_a2e8_9a7859832c60(ArrayList<Integer> nums) {
        int sumLargest = Integer.MIN_VALUE;
        int sumSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > sumSmallest) {
                sumSmallest = nums.get(i);
            }
            if (nums.get(i) < sumLargest) {
                sumLargest = nums.get(i);
            }
        }

        return sumLargest + sumSmallest;
    }

    
    public static int bigSum_Problem_2_4c65c3cb_e6b5_4c90_88bd_4a40de17d3c6(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int sum = 0;
        // iterate over array
        for (Integer number : nums) {
            // add number to sum
            sum += number;
            // set new largest and smallest values
            largest = Math.max(largest, number);
            smallest = Math.min(smallest, number);
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_a1dee30a_6f1d_430e_9ca9_15a79731997c(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (Integer num: nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_ef84ef22_c230_4e30_812b_52e382c06c5c(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_2532daf7_4bdc_4464_8bd6_62f6e7b287d3(ArrayList<Integer> nums) {
        int maxSum = Collections.max(nums);
        int minSum = Collections.min(nums);
        return maxSum + minSum;
    }

    
    public static int bigSum_Problem_1_90fce13c_ba84_4ae1_b7c4_c9eab466f40b(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int sum = 0;
        for (Integer num : nums) {
            if (largest < num) {
                largest = num;
            }
            if (smallest > num) {
                smallest = num;
            }
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_ca7839d4_042d_4a71_b390_0ece9d6d5009(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_449cd487_a08d_44af_8957_46cee2d09162(ArrayList<Integer> nums) {
        int largest = Collections.max(nums);
        int smallest = Collections.min(nums);
        int sum = largest + smallest;
        return sum;
    }

    
    public static int bigSum_Problem_1_81515a63_ec18_4ece_8067_9db6ee630df2(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_b192540f_f7d0_4498_9348_7aeef1e5058a(ArrayList<Integer> nums) {
        int largest = nums.get(0), smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_8f438ba9_27a8_4543_82c8_822400675b0b(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_bfc009de_0bee_4efc_a607_fcdae102974a(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_3e442f8d_78fc_4e79_a259_390f89b5a8db(ArrayList<Integer> nums) {
        int largest = nums.get(0) + nums.get(nums.size()-1);
        int smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_00e890e5_0c5f_4edb_af18_ffef237989e1(ArrayList<Integer> nums) {
        int largestNum = nums.get(0); // initialize with first element of list
        int smallestNum = nums.get(0); // initialize with first element of list
        for (Integer num : nums) {
            if (num > largestNum) {
                largestNum = num;
            } else if (num < smallestNum) {
                smallestNum = num;
            }
        }
        return largestNum + smallestNum;
    }

    
    public static int bigSum_Problem_0_a762bc0f_1c3b_4b3e_bda8_16f62a29a146(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_babf1923_f3c7_4019_8d67_48a67c17b5ec(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_d23c64df_e4f3_4251_89fb_e5c3153f3715(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int num : nums) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        return max + min;
    }

    
    public static int bigSum_Problem_0_90fce13c_ba84_4ae1_b7c4_c9eab466f40b(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int sum = 0;
        for (Integer num : nums) {
            if (largest < num) {
                largest = num;
            }
            if (smallest > num) {
                smallest = num;
            }
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_25008f44_a440_4e98_8141_02f8b8d713e7(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_3a660b2c_e476_4a2b_81fe_c483320c354a(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_2ced9375_99cb_4501_af88_41f1a194d726(ArrayList<Integer> nums) {
        int largest = nums.stream().max(Integer::compareTo).get();
        int smallest = nums.stream().min(Integer::compareTo).get();
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_06863796_171d_43c6_815f_98e4692da5c5(ArrayList<Integer> nums) {
        // TODO Auto-generated method stub
        int largest = nums.stream()
                .max(Comparator.comparing(Number::intValue))
                .orElseThrow(NoSuchElementException::new);
        int smallest = nums.stream()
                .min(Comparator.comparing(Number::intValue))
                .orElseThrow(NoSuchElementException::new);
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_b32b12c3_7f4f_4b97_8225_61e2d2a91840(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_340b3c75_edd9_4f84_a8cf_50ebc0dffcaa(ArrayList<Integer> nums) {
        // Write your code here
        int largest = nums.get(0), smallest = nums.get(0);
        for (Integer num : nums) {
            if (largest < num) largest = num;
            if (smallest > num) smallest = num;
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_ae4a1aeb_9823_4c83_9bbb_014328cfbf8e(ArrayList<Integer> nums) {
        int sum = 0;
        for(int i : nums) {
            sum += i;
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_44327633_7325_4f9e_8b12_96f7fdfcd8da(ArrayList<Integer> nums) {
        int sum=0;
        for (Integer num : nums) {
            if (num>sum) sum=num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_25415ecf_fe1c_48f9_ba91_6b0f3f95d39a(ArrayList<Integer> nums) {
        int largest = nums.get(0);
        int smallest = nums.get(0);

        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return smallest + largest;
    }

    
    public static int bigSum_Problem_0_359c3ece_7ddd_493e_8cc1_acf1804c1275(ArrayList<Integer> nums) {
        int largest = nums.stream().max(Comparator.naturalOrder()).get();
        int smallest = nums.stream().min(Comparator.naturalOrder()).get();
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_9b31c934_e203_42f2_abba_4866ed2168dd(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_5bd3e453_c516_48ec_926e_5dca1b8feb1d(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) { // loop through all elements in array
            if (num > largest) { // if current element is larger than largest
                largest = num; // update largest to current element
            } else if (num < smallest) { // if current element is smaller than smallest
                smallest = num; // update smallest to current element
            }
        }
        return largest + smallest; // return sum of largest and smallest
    }

    
    public static int bigSum_Problem_0_367743d2_b5bb_4004_9261_bc2ac2030bd2(ArrayList<Integer> nums) {
        Integer result = Integer.MIN_VALUE;
        for (Integer n : nums) {
            result += n;
        }
        return result;
    }

    
    public static int bigSum_Problem_0_25415ecf_fe1c_48f9_ba91_6b0f3f95d39a(ArrayList<Integer> nums) {
        int largest = nums.get(0);
        int smallest = nums.get(0);

        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return smallest + largest;
    }

    
    public static int bigSum_Problem_1_bfb9eae8_70c3_4aa1_9db5_dcfbca60b3ef(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_ca7839d4_042d_4a71_b390_0ece9d6d5009(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_5bd3e453_c516_48ec_926e_5dca1b8feb1d(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) { // loop through all elements in array
            if (num > largest) { // if current element is larger than largest
                largest = num; // update largest to current element
            } else if (num < smallest) { // if current element is smaller than smallest
                smallest = num; // update smallest to current element
            }
        }
        return largest + smallest; // return sum of largest and smallest
    }

    
    public static int bigSum_Problem_1_53eab373_8fb5_4480_b938_b70e0f68dafe(ArrayList<Integer> nums) {
        int sum = 0;
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_3b4da2f5_feb5_4074_ba42_7eb25370d97b(ArrayList<Integer> nums) {
        int largestSum = 0;
        int smallestSum = 0;
        for(int i = 0; i < nums.size(); i++) {
            largestSum = Math.max(nums.get(i), largestSum);
            smallestSum = Math.min(nums.get(i), smallestSum);
        }
        return largestSum + smallestSum;
    }

    
    public static int bigSum_Problem_2_d9e8468c_f147_4c87_b5be_34bf5b59f0b8(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_095b56e0_6912_4d0c_a2e8_9a7859832c60(ArrayList<Integer> nums) {
        int sumLargest = Integer.MIN_VALUE;
        int sumSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > sumSmallest) {
                sumSmallest = nums.get(i);
            }
            if (nums.get(i) < sumLargest) {
                sumLargest = nums.get(i);
            }
        }

        return sumLargest + sumSmallest;
    }

    
    public static int bigSum_Problem_1_65c609e6_5bc9_4746_948a_d8600fd6bded(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_403f6ffc_7f32_4785_aa32_448915f2ad59(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) { // loop through all elements in array
            if (num > largest) { // if current element is greater than largest
                largest = num; // update largest to current element
            } else if (num < smallest) { // if current element is smaller than smallest
                smallest = num; // update smallest to current element
            }
        }
        return largest + smallest; // return sum of largest and smallest
    }

    
    public static int bigSum_Problem_1_d41530d2_07ae_4581_81b5_2502e906e1a2(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        int sum = largest + smallest;
        return sum;
    }

    
    public static int bigSum_Problem_1_42b9527e_fa56_4d20_a4ad_aef7a7655722(ArrayList<Integer> nums) {
        int largest = nums.get(0), smallest = nums.get(0);
        for (int num: nums) {
            if (largest < num)
                largest = num;
            if (smallest > num)
                smallest = num;
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_0eec1441_4a25_4a31_ad96_31fa24b674bf(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_5a4eb43c_8aeb_4a29_aea0_4fa6cffe5acc(ArrayList<Integer> nums) {
        int biggest = nums.stream().mapToInteger(x -> x).max().getAsInteger();
        int smallest = nums.stream().mapToInteger(x -> x).min().getAsInteger();
        return biggest + smallest;
    }

    
    public static int bigSum_Problem_1_663c38c3_66b2_49f1_9190_028e7904376d(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_45c0c25c_c49f_4582_b0d7_9654a933196a(ArrayList<Integer> nums) {
        int largestNum = Integer.MIN_VALUE;
        int smallestNum = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largestNum) {
                largestNum = num;
            } else if (num < smallestNum) {
                smallestNum = num;
            }
        }
        return largestNum + smallestNum;
    }

    
    public static int bigSum_Problem_1_4ef94c80_6b54_41f7_9390_f9c3f76ebf75(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num < smallest)
                smallest = num;
            if (num > largest)
                largest = num;
        }
        int sum = largest;
        for (Integer num : nums)
            sum += num;
        return sum;
    }

    
    public static int bigSum_Problem_0_da07a205_dcab_46f5_af70_3e3bded1deaf(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_441ba183_52f0_4ad7_8e2d_6c1970d72883(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if(nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_3dda17da_aee5_430d_bb20_858b68b473b2(ArrayList<Integer> nums) {
        int biggerSum = Integer.MIN_VALUE;
        int smallerSum = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > biggerSum) {
                biggerSum = num;
            } else if (num < smallerSum) {
                smallerSum = num;
            }
        }
        return biggerSum + smallerSum;
    }

    
    public static int bigSum_Problem_1_6ba810e2_2b0f_4e47_9530_1bc0c05a32f7(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_129d5406_5b8f_443d_b2a3_e7808d45090f(ArrayList<Integer> nums) {
        int max = nums.stream()
                .max(Integer::compareTo)
                .get();
        int min = nums.stream()
                .min(Integer::compareTo)
                .get();
        return max+min;
    }

    
    public static int bigSum_Problem_2_fdd26027_0a07_44c1_a4b9_0ff4032a4bee(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) { // for each element in the array
            if (num > largest) { // if the current element is greater than the largest
                largest = num; // update the largest to the current element
            }
            if (num < smallest) { // if the current element is smaller than the smallest
                smallest = num; // update the smallest to the current element
            }
        }
        return largest + smallest; // return the sum of the largest and smallest elements
    }

    
    public static int bigSum_Problem_0_5772aa21_2f3e_4062_bec3_adda478d3097(ArrayList<Integer> nums) {
        int biggest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            biggest = Math.max(biggest, num);
            smallest = Math.min(smallest, num);
        }
        System.out.println("Smallest number in ArrayList is: " + smallest);
        System.out.println("Biggest number in ArrayList is: " + biggest);
        return biggest + smallest;
    }

    
    public static int bigSum_Problem_1_cc1e419a_d187_42aa_a7c6_bdc319fbdd0a(ArrayList<Integer> nums) {
        int largest = 0;
        int smallest = 0;
        for (int x : nums) {
            if (x > largest) {
                largest = x;
            }
            if (x < smallest) {
                smallest = x;
            }
        }
        return smallest + largest;
    }

    
    public static int bigSum_Problem_2_5919a7c5_3075_4d14_b083_13ffebd51ff9(ArrayList<Integer> nums) {
        // Write your code here.
        int largest = nums.get(0); // Get the first item in the list
        int smallest = nums.get(0); // Get the first item in the list
        for (int num: nums) { // For each item in the list
            if (num > largest) { // If the current item is larger than the largest so far
                largest = num; // Update largest to current item
            }
            if (num < smallest) { // If the current item is smaller than the smallest so far
                smallest = num; // Update smallest to current item
            }
        }
        return largest + smallest; // Return the sum of the two values
    }

    
    public static int bigSum_Problem_0_b88e0508_668c_43d9_9ae2_8bbed6d200e5(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_94a933e9_f68c_45d0_9dd2_92254a733554(ArrayList<Integer> nums) {
        int largest = nums.get(0), smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_f1c9002d_a1bf_479b_81f2_c6f7990f7f90(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_513e064a_d9da_4a24_9d96_6f4a3a45e1b4(ArrayList<Integer> nums) {
        int sum = 0;
        // Write your logic here
        for (int i=0; i<nums.size(); i++)
        {
            sum = sum + nums.get(i);
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_f93db486_396f_44d2_94e7_76008aaa943f(ArrayList<Integer> nums) {
        int largest = nums.stream().max(Integer::compareTo).get();
        int smallest = nums.stream().min(Integer::compareTo).get();
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_9b909b21_5395_4a30_ac23_564b0caf1112(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_63a22bbd_197f_4e26_a71c_f0d044ddc9ca(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_29f2cc37_a5a8_402c_a3f3_a70677b9f3c7(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_a9ccf2fa_782c_45b5_9163_cc95c347755b(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_1b3970a9_359c_4a40_b34e_5d92bf0ed8b0(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            largest += nums.get(i);
            smallest += nums.get(i);
        }
        return largest - smallest;
    }

    
    public static int bigSum_Problem_0_9a10efbc_1574_47df_b09d_a89ee150409f(ArrayList<Integer> nums) {
        return nums.stream().reduce((a, b) -> a + b).get();
    }

    
    public static int bigSum_Problem_0_9978bf1a_aee5_45ad_b1f4_48066fe28172(ArrayList<Integer> nums) {
        int largest = -100000;
        int smallest = 100000;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_3d1b3f9c_a639_4972_9ed2_5dbaff41920e(ArrayList<Integer> nums) {
        int sum = 0;
        int max = 0;
        int min = 0;
        for (Integer l : nums) {
            sum = sum + l;
            if (max < l) {
                max = l;
            }
            if (min > l) {
                min = l;
            }
        }
        System.out.println(sum);
        System.out.println(max);
        System.out.println(min);
        return sum;
    }

    
    public static int bigSum_Problem_0_c6545efd_a8e3_4d2d_95d4_30f40ebf56b9(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_247893ba_d141_42b0_b027_0397b51f0067(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(Integer x : nums) {
            largest = x > largest ? x : largest;
            smallest = x < smallest ? x : smallest;
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_327b660e_0c38_4fe3_a81e_1e578be2e912(ArrayList<Integer> nums) {
        int sum = 0;
        int max = nums.get(0); // Initialize max to first number
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        sum = max + max;
        return sum;
    }

    
    public static int bigSum_Problem_2_2df715a9_e0e9_4391_831e_fe5b6c4dfd47(ArrayList<Integer> nums) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_8b4ce8b2_41d0_419a_89d4_334dbf692f9f(ArrayList<Integer> nums) {
        int largest = nums.stream().max(Integer::compareTo).get();
        int smallest = nums.stream().min(Integer::compareTo).get();
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_60876e7d_8372_4e61_b248_afad07ceb4e7(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int i = 1; i < nums.size(); i++) { // loop through rest of array
            if (nums.get(i) > largest) { // if current element is greater than largest
                largest = nums.get(i); // update largest
            } else if (nums.get(i) < smallest) { // if current element is smaller than smallest
                smallest = nums.get(i); // update smallest
            }
        }
        return largest + smallest; // return sum of largest and smallest
    }

    
    public static int bigSum_Problem_1_8d75aefa_0c31_419b_b46e_6d2f531a869a(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to be first element of array
        int smallest = nums.get(0); // initialize smallest to be first element of array
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return smallest + largest;
    }

    
    public static int bigSum_Problem_0_65991464_83cd_45b3_ae5b_e4ee7e9f02ce(ArrayList<Integer> nums) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            sum = sum + nums.get(i);
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_babf1923_f3c7_4019_8d67_48a67c17b5ec(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_b0bcbf64_2dc7_4eb2_8d5b_5773e56ce7a5(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_a470b9ea_4c8c_4458_a678_880fc084a14f(ArrayList<Integer> nums) {
        int largest = nums.stream().reduce(Math::max).get();
        int smallest = nums.stream().reduce(Math::min).get();
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_621fe5ae_a915_48cc_934f_dfa9868bf7db(ArrayList<Integer> nums) {
        int largest = nums.get(0), smallest = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_774ff8f2_335f_421a_b574_517f5f506e7d(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_ef84ef22_c230_4e30_812b_52e382c06c5c(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_afa52fbe_e471_49fe_b9b0_2746efebf89c(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_3c1302c2_2d5a_49e6_bc32_a692ead6a6c5(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_987ff8fe_38aa_46a4_b0ab_68d7b313b28e(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) { // loop through all elements in array
            if (num > largest) { // if current element is greater than largest
                largest = num; // update largest to current element
            } else if (num < smallest) { // if current element is smaller than smallest
                smallest = num; // update smallest to current element
            }
        }
        return largest + smallest; // return sum of largest and smallest
    }

    
    public static int bigSum_Problem_2_3c135425_c08b_4343_a775_313e24a30219(ArrayList<Integer> nums) {
        // Write your code here
        return 0;
    }

    
    public static int bigSum_Problem_0_d9e5db7e_2523_4ffd_9733_40fa9a4b1225(ArrayList<Integer> nums) {
        // Write your code here

        if(nums.isEmpty()){
            return 0;
        }
        int sum =0;
        int largest = nums.get(0); 
        int smallest = nums.get(0); 
        for(int i:nums){
            if(i>largest){
                largest = i;
            }
            if(i<smallest){
                smallest = i;
            }
            sum = sum+i;
        }
        System.out.println("The sum of the largest and smallest element in the array is: "+sum);
        return sum;
    }

    
    public static int bigSum_Problem_0_327b660e_0c38_4fe3_a81e_1e578be2e912(ArrayList<Integer> nums) {
        int sum = 0;
        int max = nums.get(0); // Initialize max to first number
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        sum = max + max;
        return sum;
    }

    
    public static int bigSum_Problem_0_4fd887da_f5ad_44c8_874c_ccfe3dcbec9e(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < nums.size(); i++) {
            max = Math.max(max, nums.get(i));
            min = Math.min(min, nums.get(i));
        }
        return max + min;
    }

    
    public static int bigSum_Problem_1_23ff99f3_1756_4bda_9aca_6d75f781ec66(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_78705e94_a3dc_4ad4_b3ad_b975f2b25d20(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_290af230_82a8_468a_bda6_489ae73fddb7(ArrayList<Integer> nums) {
        int max = 0;
        int min = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return (max + min);
    }

    
    public static int bigSum_Problem_0_fa7e9b56_22c7_441e_8a89_ec74bf23e64a(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_115da78e_2b45_402a_abd8_22377c40a217(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_56ef14a4_46ab_4fb1_99f2_0e528b17a805(ArrayList<Integer> nums) {
        int largest = nums.get(0); //smallest is default
        int sum = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (largest < nums.get(i)) {
                largest = nums.get(i);
            } else {
                sum = sum + nums.get(i);
            }
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_dcece516_dfec_4f41_9bae_6cc4d9f67761(ArrayList<Integer> nums) {
        int largest = nums.stream().mapToInteger(Integer::intValue).max().orElse(0L);
        int smallest = nums.stream().mapToInteger(Integer::intValue).min().orElse(0L);
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_3a81d117_0657_4fe6_b79f_ecc04df04408(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_1c7c3796_3a67_42ab_8d72_d3a01146915b(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_953c71f6_9f80_4134_8bd5_9255eb56a661(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_b7f8abea_355e_4e86_a3f6_27579befeeaa(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_f93db486_396f_44d2_94e7_76008aaa943f(ArrayList<Integer> nums) {
        int largest = nums.stream().max(Integer::compareTo).get();
        int smallest = nums.stream().min(Integer::compareTo).get();
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_621fe5ae_a915_48cc_934f_dfa9868bf7db(ArrayList<Integer> nums) {
        int largest = nums.get(0), smallest = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_d8210b92_1ca1_4f11_9797_d906d29d035d(ArrayList<Integer> nums) {
        if (nums.size() == 0)
            return 0L;
        int largestNum = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largestNum) {
                largestNum = nums.get(i);
            }
        }
        int smallestNum = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < smallestNum) {
                smallestNum = nums.get(i);
            }
        }
        return largestNum + smallestNum;
    }

    
    public static int bigSum_Problem_0_efb7c610_9dc5_4218_a88a_e5584623323c(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_b7a04a3e_71eb_44be_b23f_a2133aeb1583(ArrayList<Integer> nums) {
        int sumOfLargest = 0;
        int sumOfSmallest = 0;
        for(int num : nums) {
            if(num > sumOfLargest) {
                sumOfLargest = num;
            }
            else if(num < sumOfSmallest) {
                sumOfSmallest = num;
            }
        }
        System.out.println("The sum of the largest and smallest numbers is " + sumOfLargest + " " + sumOfSmallest);
        return sumOfLargest + sumOfSmallest;
    }

    
    public static int bigSum_Problem_0_eb3051b4_a060_4583_b681_b43865d79a55(ArrayList<Integer> nums) {
        int largest = nums.stream().max(Integer::compareTo).get();
        int smallest = nums.stream().min(Integer::compareTo).get();
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_14372881_6aca_4932_ab40_f2f1d78f1f88(ArrayList<Integer> nums) {
        int sum = 0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_d9e5db7e_2523_4ffd_9733_40fa9a4b1225(ArrayList<Integer> nums) {
        // Write your code here

        if(nums.isEmpty()){
            return 0;
        }
        int sum =0;
        int largest = nums.get(0); 
        int smallest = nums.get(0); 
        for(int i:nums){
            if(i>largest){
                largest = i;
            }
            if(i<smallest){
                smallest = i;
            }
            sum = sum+i;
        }
        System.out.println("The sum of the largest and smallest element in the array is: "+sum);
        return sum;
    }

    
    public static int bigSum_Problem_1_c4c0736d_5d09_4293_8292_b468cec07563(ArrayList<Integer> nums) {
        // Write your code here
        int sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum = sum + num;
            }
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_643faf3d_0343_416d_b2c8_1d44baf4d2f9(ArrayList<Integer> nums) {
        // Write your code here
        int sum=0;
        for( int i=0; i<nums.size(); i++ ){
            sum = sum + nums.get(i);
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_3477561c_2a28_4367_8588_6c4644acd129(ArrayList<Integer> nums) {
        int largest = nums.get(0), smallest = nums.get(0);
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_dcece516_dfec_4f41_9bae_6cc4d9f67761(ArrayList<Integer> nums) {
        int largest = nums.stream().mapToInteger(Integer::intValue).max().orElse(0L);
        int smallest = nums.stream().mapToInteger(Integer::intValue).min().orElse(0L);
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_b2484bdf_f4ac_460b_9956_4c7bb0408cbc(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_4f6c8254_b2ab_4d84_bac3_8d365f0a2b96(ArrayList<Integer> nums) {
        // write your solution here
        if (nums.isEmpty()) {
            return 0;
        }
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_59a8e066_0b9c_4c09_b72e_e3753bda5012(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i > largest) largest = i;
            if (i < smallest) smallest = i;
        }
        int sum = 0;
        for (int i : nums) {
            if (largest >= i) sum += i;
            if (smallest <= i) sum += i;
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_7f07df1a_804c_4325_97be_247b16f9e2d2(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_afa52fbe_e471_49fe_b9b0_2746efebf89c(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_ee55cbe3_3aab_41b6_a7d6_66b01305527e(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_8f58b122_b919_4e1e_b914_5b16a28f8ffb(ArrayList<Integer> nums) {
        int bigSum_Problem_2_8f58b122_b919_4e1e_b914_5b16a28f8ffb = nums.get(0) + nums.get(nums.size()-1);
        for (int num : nums)
            if (num > bigSum_Problem_2_8f58b122_b919_4e1e_b914_5b16a28f8ffb)
                bigSum_Problem_2_8f58b122_b919_4e1e_b914_5b16a28f8ffb = num;
        return bigSum_Problem_2_8f58b122_b919_4e1e_b914_5b16a28f8ffb;
    }

    
    public static int bigSum_Problem_1_19a03a90_fe68_495b_a21f_955f8f946d9d(ArrayList<Integer> nums) {
        if (nums == null || nums.size() == 0)
            return 0;
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            int temp = nums.get(i);
            if (temp < smallest)
                smallest = temp;
            else if (temp > largest)
                largest = temp;
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_6b60123a_a150_4da5_9068_276597cc239a(ArrayList<Integer> nums) {
        int sum = 0;
        for (Integer num : nums) {
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_8bc803df_0b9e_4b3c_ab5d_ef432b1c0375(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first number
        int smallest = nums.get(0); // initialize smallest to first number
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_31403cdd_8ad1_41a6_b20e_757cb92426b3(ArrayList<Integer> nums) {
        int largest = nums.stream().max(Integer::compareTo).get();
        int smallest = nums.stream().min(Integer::compareTo).get();
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_0868d3e0_4f7d_41ae_a8ee_f2a52d90f48b(ArrayList<Integer> nums) {
        // Write your logic here
        int largest = Collections.max(nums);
        int smallest = Collections.min(nums);
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_325b1edf_d68a_4b20_b2f3_89bffc9dcb36(ArrayList<Integer> nums) {
        int biggest = nums.get(0), smallest = nums.get(0);
        for (int num : nums) {
            if (num > biggest) {
                biggest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return biggest + smallest;
    }

    
    public static int bigSum_Problem_1_2607a4bf_39c3_403e_972a_d55e766f0f60(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int i = 1; i < nums.size(); i++) { // loop through array
            if (nums.get(i) > largest) { // if current element is greater than largest
                largest = nums.get(i); // update largest to current element
            } else { // if current element is smaller than largest
                smallest = nums.get(i); // update smallest to current element
            }
        }
        return largest + smallest; // return sum of largest and smallest
    }

    
    public static int bigSum_Problem_1_78705e94_a3dc_4ad4_b3ad_b975f2b25d20(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_45c0c25c_c49f_4582_b0d7_9654a933196a(ArrayList<Integer> nums) {
        int largestNum = Integer.MIN_VALUE;
        int smallestNum = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largestNum) {
                largestNum = num;
            } else if (num < smallestNum) {
                smallestNum = num;
            }
        }
        return largestNum + smallestNum;
    }

    
    public static int bigSum_Problem_0_513e064a_d9da_4a24_9d96_6f4a3a45e1b4(ArrayList<Integer> nums) {
        int sum = 0;
        // Write your logic here
        for (int i=0; i<nums.size(); i++)
        {
            sum = sum + nums.get(i);
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_dfc77c07_ae9f_485a_ada3_d33d30e8a668(ArrayList<Integer> nums) {
        int largest = Collections.max(nums);
        int smallest = Collections.min(nums);
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_4f06707d_79d8_4ab3_8954_1504ac810ec4(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_48cb5798_e8a5_4ef6_8293_4a3a4da32c72(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_9b31c934_e203_42f2_abba_4866ed2168dd(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_bdbb86f2_ebf3_4913_8748_0e1cb0c9db51(ArrayList<Integer> nums) {
        // write your code
        int max = nums.stream().max(Integer::compare).get();
        int min = nums.stream().min(Integer::compare).get();
        return max - min;
    }

    
    public static int bigSum_Problem_0_eb8b9ab2_9b73_4a35_a582_eb236ed80dc1(ArrayList<Integer> nums) {
        int bigSum_Problem_0_eb8b9ab2_9b73_4a35_a582_eb236ed80dc1 = 0;
        // TODO Auto-generated method stub
        if(nums.size()<1)
            return 0;
        for(int i=0; i<nums.size(); i++)
        {
            bigSum_Problem_0_eb8b9ab2_9b73_4a35_a582_eb236ed80dc1 = bigSum_Problem_0_eb8b9ab2_9b73_4a35_a582_eb236ed80dc1 + nums.get(i);
        }
        return bigSum_Problem_0_eb8b9ab2_9b73_4a35_a582_eb236ed80dc1;
    }

    
    public static int bigSum_Problem_1_9b31c934_e203_42f2_abba_4866ed2168dd(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_9f20a5df_e5ed_4ba7_92e6_a2f247797028(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_d73fb415_cc04_459d_9c88_22e8a2fd3fa6(ArrayList<Integer> nums) {
        int largest = nums.get(0), smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_65c609e6_5bc9_4746_948a_d8600fd6bded(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_3d1b3f9c_a639_4972_9ed2_5dbaff41920e(ArrayList<Integer> nums) {
        int sum = 0;
        int max = 0;
        int min = 0;
        for (Integer l : nums) {
            sum = sum + l;
            if (max < l) {
                max = l;
            }
            if (min > l) {
                min = l;
            }
        }
        System.out.println(sum);
        System.out.println(max);
        System.out.println(min);
        return sum;
    }

    
    public static int bigSum_Problem_1_41e32589_501b_474c_aa8b_c97f9f688c10(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_9bf89e8b_8a33_4eaf_ac8f_76e1255ce17e(ArrayList<Integer> nums) {
        int sum = 0;
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        sum = largest + smallest;
        return sum;
    }

    
    public static int bigSum_Problem_1_bc3f3790_7d93_4367_a6aa_8dd58f65fd28(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Integer num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max + min;
    }

    
    public static int bigSum_Problem_1_47dd5cdb_078a_4a0b_b851_c3c854ed7024(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_f9da6d5f_a7f6_4630_85e8_6142181abeb3(ArrayList<Integer> nums) {
        // write your solution here
        int biggest = nums.get(0),smallest = nums.get(0);
        for(int i = 1; i<nums.size();i++){
            if(biggest>nums.get(i)){
                biggest = nums.get(i);
            }
            if(smallest<nums.get(i)){
                smallest = nums.get(i);
            }
        }
        int sum = biggest+smallest;
        return sum;
    }

    
    public static int bigSum_Problem_0_53eab373_8fb5_4480_b938_b70e0f68dafe(ArrayList<Integer> nums) {
        int sum = 0;
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_a0a60d58_3692_4b73_93a3_32882d0e6133(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) { // for each element in the array
            if (num > largest) { // if the current element is greater than the largest
                largest = num; // update the largest to the current element
            }
            if (num < smallest) { // if the current element is smaller than the smallest
                smallest = num; // update the smallest to the current element
            }
        }
        return largest + smallest; // return the sum of the largest and smallest elements
    }

    
    public static int bigSum_Problem_1_2b744a68_f5f8_403c_8428_13d2a47cbd4f(ArrayList<Integer> nums) {
        int largestNum = 0;
        int smallestNum = 0;
        // Loop through the array list
        for (Integer i : nums) {
            // Calculate the largest and smallest numbers
            if (i < largestNum) largestNum = i;
            if (i > smallestNum) smallestNum = i;
        }
        // Return largest and smallest numbers
        return largestNum + smallestNum;
    }

    
    public static int bigSum_Problem_0_6fb58e37_6374_49a5_a8f0_5421a423b015(ArrayList<Integer> nums) {
        int largest = 0L;
        int smallest = 0L;
        int sum = 0L;
        for (Integer n : nums) {
            if (n > largest) {
                largest = n;
            } else if (n < smallest) {
                smallest = n;
            }
            sum += n;
        }
        return largest + smallest + sum;
    }

    
    public static int bigSum_Problem_0_c4c0736d_5d09_4293_8292_b468cec07563(ArrayList<Integer> nums) {
        // Write your code here
        int sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum = sum + num;
            }
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_f2ecfab6_1188_4aa6_9446_38fc8f5caf44(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_f19d6815_b3c8_4cf3_919d_6ce781c28dbe(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_e55349be_ae0c_4068_b272_f86fba79917a(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_8b4ce8b2_41d0_419a_89d4_334dbf692f9f(ArrayList<Integer> nums) {
        int largest = nums.stream().max(Integer::compareTo).get();
        int smallest = nums.stream().min(Integer::compareTo).get();
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_070f6148_510d_4dad_a769_919beefc8059(ArrayList<Integer> nums) {
        int sum = 0;
        for(int n: nums){
            sum = sum + n;
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_ab481123_ac49_4477_a1ce_e6866be9ac67(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        return max - min;
    }

    
    public static int bigSum_Problem_1_1caf684f_3242_4c60_95fa_820f63050dc6(ArrayList<Integer> nums) {
        int bigsum = nums.get(0);
        int smallsum = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > bigsum) {
                bigsum = nums.get(i);
            } else if (nums.get(i) < smallsum) {
                smallsum = nums.get(i);
            }
        }
        return bigsum + smallsum;
    }

    
    public static int bigSum_Problem_0_9571b4f7_8ee4_4d85_b4b5_e03825aba2e1(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_65d270c2_7a49_4385_9065_e4cc18815886(ArrayList<Integer> nums) {
        int maxLargest = nums.get(nums.size() - 1);
        int maxSmallest = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > maxSmallest) {
                maxSmallest = nums.get(i);
            }
            if (nums.get(i) < maxLargest) {
                maxLargest = nums.get(i);
            }
        }
        System.out.println("Biggest and Smallest Number : " + maxLargest + " " + maxSmallest);
        return maxLargest + maxSmallest;
    }

    
    public static int bigSum_Problem_1_e844b1c7_e090_4ca3_a2ba_283627d69039(ArrayList<Integer> nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_a0a60d58_3692_4b73_93a3_32882d0e6133(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) { // for each element in the array
            if (num > largest) { // if the current element is greater than the largest
                largest = num; // update the largest to the current element
            }
            if (num < smallest) { // if the current element is smaller than the smallest
                smallest = num; // update the smallest to the current element
            }
        }
        return largest + smallest; // return the sum of the largest and smallest elements
    }

    
    public static int bigSum_Problem_1_4cb6717f_feb9_4390_beae_797c4fc2cd59(ArrayList<Integer> nums) {
        int sum=0;
        for (Integer i : nums) {
            sum+=i;
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_817ffeb7_6ace_4125_a1b5_b79fdbd26018(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Integer num : nums) {
            if (max < num) {
                max = num;
            } else if (min > num) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigSum_Problem_2_fe21cc63_900c_4210_b797_ea1ea85751ad(ArrayList<Integer> nums) {
        int largest = nums.get(0), smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_663c38c3_66b2_49f1_9190_028e7904376d(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_bb600afa_8b4f_4ae2_849b_ec137ae6cf1f(ArrayList<Integer> nums) {
        int sum = 0;
        for(int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_76a93ec9_bdb4_49df_82a9_3e1e258d7cef(ArrayList<Integer> nums) {
        return Collections.max(nums) + Collections.min(nums);
    }

    
    public static int bigSum_Problem_2_a61e6c5c_bc31_4782_8e2c_faddc7a17014(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) { // loop through all elements
            if (num > largest) { // if current element is greater than largest
                largest = num; // update largest to current element
            } else if (num < smallest) { // if current element is smaller than smallest
                smallest = num; // update smallest to current element
            }
        }
        return largest + smallest; // return sum of largest and smallest
    }

    
    public static int bigSum_Problem_2_ed847d0c_4dda_41c7_87c5_f7f4e9646077(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_d2042766_d8c8_4aa2_8b03_ed5f693a458e(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
        // Write your code here
        return largest;
    }

    
    public static int bigSum_Problem_0_76a93ec9_bdb4_49df_82a9_3e1e258d7cef(ArrayList<Integer> nums) {
        return Collections.max(nums) + Collections.min(nums);
    }

    
    public static int bigSum_Problem_1_40e5fb77_0248_4067_adb5_10941c5e205e(ArrayList<Integer> nums) {
        int sum=0;
        for(int i=0;i<nums.size();i++) {
            sum+=nums.get(i);
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_50b7ff72_6353_4891_ad10_ce41db01136a(ArrayList<Integer> nums) {
        int biggest = nums.get(0);
        int smallest = nums.get(0);

        for (int i = 1; i < nums.size(); i++) {
            if (biggest < nums.get(i)) {
                biggest = nums.get(i);
            }

            if (smallest > nums.get(i)) {
                smallest = nums.get(i);
            }
        }

        return biggest + smallest;
    }

    
    public static int bigSum_Problem_2_fc113b28_5266_4a11_a6a0_9599189d1db1(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_43b0e701_eb83_4a9e_8e81_30bd910cdffb(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_5bd3e453_c516_48ec_926e_5dca1b8feb1d(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) { // loop through all elements in array
            if (num > largest) { // if current element is larger than largest
                largest = num; // update largest to current element
            } else if (num < smallest) { // if current element is smaller than smallest
                smallest = num; // update smallest to current element
            }
        }
        return largest + smallest; // return sum of largest and smallest
    }

    
    public static int bigSum_Problem_0_3c135425_c08b_4343_a775_313e24a30219(ArrayList<Integer> nums) {
        // Write your code here
        return 0;
    }

    
    public static int bigSum_Problem_2_8372870d_4020_4adc_9a8e_eb54ce7ff29c(ArrayList<Integer> nums) {
        int largest = Collections.max(nums);
        int smallest = Collections.min(nums);
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_afa52fbe_e471_49fe_b9b0_2746efebf89c(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_4e59b2d5_690a_4f97_bce5_ebda88f73621(ArrayList<Integer> nums) {
        int largest = -100000000000000000L;
        int smallest = 100000000000000000L;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            } else if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        System.out.println("Largest : " + largest + " Smallest : " + smallest);
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_62785128_61b5_4e25_94c2_e01319521da2(ArrayList<Integer> nums) {
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_825b8769_b101_44ca_a50e_1a6d13ff42e3(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_2dbc20ba_4587_4c1a_aeb9_b0849ed084d3(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max + min;
    }

    
    public static int bigSum_Problem_0_e51d7b89_cf2c_4818_a752_149dd2277e83(ArrayList<Integer> nums) {
        int sum = 0;
        for (Integer num : nums) {
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_6e80983d_24c2_44ae_a62e_f383840ed57f(ArrayList<Integer> nums) {
        int biggest = 0, smallest = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > biggest) {
                biggest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        int biggestSum = biggest;
        int smallestSum = smallest;
        for (int i = 0; i < nums.size(); i++) {
            if (biggest == smallest && biggest != 0) {
                return biggestSum;
            }
            if (nums.get(i) > biggestSum) {
                biggestSum = nums.get(i);
            }
            if (nums.get(i) < smallestSum) {
                smallestSum = nums.get(i);
            }
        }
        return biggestSum;
    }

    
    public static int bigSum_Problem_1_fc113b28_5266_4a11_a6a0_9599189d1db1(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_b0bcbf64_2dc7_4eb2_8d5b_5773e56ce7a5(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_4718a289_c549_4030_9b49_0687283db900(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_9b3056c6_fae1_47f3_a11b_30e3f974a7b1(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_3a660b2c_e476_4a2b_81fe_c483320c354a(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_a1dee30a_6f1d_430e_9ca9_15a79731997c(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (Integer num: nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_2532daf7_4bdc_4464_8bd6_62f6e7b287d3(ArrayList<Integer> nums) {
        int maxSum = Collections.max(nums);
        int minSum = Collections.min(nums);
        return maxSum + minSum;
    }

    
    public static int bigSum_Problem_2_21ba4429_3010_482f_b6bd_1ff7cd5c3182(ArrayList<Integer> nums) {
        int sum = 0;
        for (Integer i : nums)
            sum += i;
        return sum;
    }

    
    public static int bigSum_Problem_0_f42f7305_35b0_4c3f_864e_391d0bd762e0(ArrayList<Integer> nums) {
        int sum = 0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num: nums) {
            if(num > largest)
                largest = num;
            else if(num < smallest)
                smallest = num;
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_3ee54f9e_8575_4bb7_8e03_7fd0d9b59196(ArrayList<Integer> nums) {
        int largest = nums.stream().mapToInteger(n -> n).max().getAsInteger();
        int smallest = nums.stream().mapToInteger(n -> n).min().getAsInteger();
        return (largest + smallest);
    }

    
    public static int bigSum_Problem_1_129d5406_5b8f_443d_b2a3_e7808d45090f(ArrayList<Integer> nums) {
        int max = nums.stream()
                .max(Integer::compareTo)
                .get();
        int min = nums.stream()
                .min(Integer::compareTo)
                .get();
        return max+min;
    }

    
    public static int bigSum_Problem_0_bef91446_65f5_435f_9056_c50fa59351a8(ArrayList<Integer> nums) {
        int big = nums.get(0), small = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > big) {
                big = nums.get(i);
            } else if (nums.get(i) < small) {
                small = nums.get(i);
            }
        }
        return (big + small);
    }

    
    public static int bigSum_Problem_1_10b150ad_defd_483c_a0da_4aa2b4dcd09c(ArrayList<Integer> nums) {
        int biggest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > biggest) {
                biggest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return biggest + smallest;
    }

    
    public static int bigSum_Problem_2_db692fc8_fcae_4dbb_a0c6_e2634b14e180(ArrayList<Integer> nums) {
        // Write your code here
        int sum = 0;
        for (int i : nums)
            sum += i;
        return sum;
    }

    
    public static int bigSum_Problem_0_ef84ef22_c230_4e30_812b_52e382c06c5c(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_b212aecb_ab8e_4606_8423_3cbccf37ec28(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_cd862f51_7fd5_45e5_b30e_1bd73cdb9a21(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of list
        int smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_751f801e_0ee4_4d68_a87e_1706396b183e(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_cf26af45_d1a9_42f2_a7e8_987ec359fbee(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n >= largest) {
                largest = n;
            }
            if (n <= smallest) {
                smallest = n;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_9f20a5df_e5ed_4ba7_92e6_a2f247797028(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_5abcce87_d3e3_465a_8992_e31ae7b5d04d(ArrayList<Integer> nums) {
        int sum = 0;
        for(int i = 0; i < nums.size(); i++){
            sum += nums.get(i);
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_fe21cc63_900c_4210_b797_ea1ea85751ad(ArrayList<Integer> nums) {
        int largest = nums.get(0), smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_b53f7976_f900_40e5_8291_54dda7643cd5(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_d50cfc6c_7c44_4b09_88b2_ab8790abf36b(ArrayList<Integer> nums) {
        // Write code here
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for (int num: nums){
            if (num > largest){
                largest = num;
            }
            if (num < smallest){
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_e52977ab_5f35_4573_8179_bbc80fac7142(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_6fb5ce6b_4087_4c02_8b8e_7c0724c5ecd0(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first number
        int smallest = nums.get(0); // initialize smallest to first number
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_11f02a2e_d976_458b_8b46_adf1787ab731(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            largest = Math.max(largest, num);
            smallest = Math.min(smallest, num);
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_cc1e419a_d187_42aa_a7c6_bdc319fbdd0a(ArrayList<Integer> nums) {
        int largest = 0;
        int smallest = 0;
        for (int x : nums) {
            if (x > largest) {
                largest = x;
            }
            if (x < smallest) {
                smallest = x;
            }
        }
        return smallest + largest;
    }

    
    public static int bigSum_Problem_0_cd862f51_7fd5_45e5_b30e_1bd73cdb9a21(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of list
        int smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_da07a205_dcab_46f5_af70_3e3bded1deaf(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_b192540f_f7d0_4498_9348_7aeef1e5058a(ArrayList<Integer> nums) {
        int largest = nums.get(0), smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_53fbd7c2_f514_4195_b84c_1716ca1eb9f7(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if(nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_3b4da2f5_feb5_4074_ba42_7eb25370d97b(ArrayList<Integer> nums) {
        int largestSum = 0;
        int smallestSum = 0;
        for(int i = 0; i < nums.size(); i++) {
            largestSum = Math.max(nums.get(i), largestSum);
            smallestSum = Math.min(nums.get(i), smallestSum);
        }
        return largestSum + smallestSum;
    }

    
    public static int bigSum_Problem_1_29f2cc37_a5a8_402c_a3f3_a70677b9f3c7(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_2485bea8_23d0_41a8_8cda_39b51978295b(ArrayList<Integer> nums) {
        int largest = nums.get(0), smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_852a3b51_ca97_4968_884a_8d9c633dbef2(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (largest < num) largest = num;
            if (smallest > num) smallest = num;
        }
        return (largest + smallest);
    }

    
    public static int bigSum_Problem_1_fcb0bc9e_ae3a_4a87_abc7_f14ad8f52736(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_7873fc2b_d7f9_43c8_a7cb_1cddf6c426ed(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_ad2d827a_2dfa_46e7_8797_731445d24893(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_65c9238d_411d_46ac_9d49_b5c33199ae3d(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_4a96765b_b20f_439b_92b5_7e00eac2779e(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_9da24810_09d7_4286_b2b5_ad74514194db(ArrayList<Integer> nums) {
        // Write your code here
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int num:nums){
            if(num<min) min = num;
            if(num>max) max = num;
        }
        int sum=max+min;
        System.out.println("Big Sum is: "+sum);
        return sum;
    }

    
    public static int bigSum_Problem_2_5a6f31ed_e8f7_49ca_adf6_4e69c80d4a3f(ArrayList<Integer> nums) {
        int sum = 0;
        for(Integer num : nums) {
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_81515a63_ec18_4ece_8067_9db6ee630df2(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_44327633_7325_4f9e_8b12_96f7fdfcd8da(ArrayList<Integer> nums) {
        int sum=0;
        for (Integer num : nums) {
            if (num>sum) sum=num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_9b2a5e23_0a89_47a6_9018_5eb3c2a28670(ArrayList<Integer> nums) {
        int sumLargest = nums.get(0);
        int sumSmallest = nums.get(0);
        for (int num : nums) {
            sumLargest = Math.max(sumLargest, num);
            sumSmallest = Math.min(sumSmallest, num);
        }
        return sumLargest + sumSmallest;
    }

    
    public static int bigSum_Problem_2_101bd9af_cd7f_4ddc_a7a4_9fcdffa9a1b4(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_e2a2c3b0_82d3_483e_a244_09a7cdecd299(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num: nums){
            if(num > largest)
                largest = num;
            if(num < smallest)
                smallest = num;
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_b3c16d24_b560_4cae_9062_3bc17326abad(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_9f72a021_bf29_489f_8f6e_55f82602eb9f(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max + min;
    }

    
    public static int bigSum_Problem_2_01bc5085_c0f8_4afa_9166_725ac9478aac(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_a6464fa8_c131_4ade_abd5_70e05a061925(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_e9c5453f_d313_4c4d_8a90_7cbe5242adaf(ArrayList<Integer> nums) {
        int maxSum = nums.stream()
                .mapToInteger(Integer::intValue)
                .max()
                .orElse(0L);
        int minSum = nums.stream()
                .mapToInteger(Integer::intValue)
                .min()
                .orElse(0L);
        return maxSum + minSum;
    }

    
    public static int bigSum_Problem_0_29f2cc37_a5a8_402c_a3f3_a70677b9f3c7(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_b7f8abea_355e_4e86_a3f6_27579befeeaa(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_fe5fae3d_c424_4cd0_ac60_4ead7a54eaab(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_95aa5744_849d_4d65_8604_b53f70872eda(ArrayList<Integer> nums) {
        int largest = nums.get(0); //set largest as first value
        int smallest = nums.get(0);
        for (Integer n : nums) {
            if (n > largest) {
                largest = n;
            }
            if (n < smallest) {
                smallest = n;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_bd6d996c_da96_4202_a473_5e8566b8e3ce(ArrayList<Integer> nums) {
        int maxSum = 0, minSum = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > maxSum) {
                maxSum = nums.get(i);
            }
            if (nums.get(i) < minSum) {
                minSum = nums.get(i);
            }
        }
        return maxSum + minSum;
    }

    
    public static int bigSum_Problem_0_583ec78b_bc28_48f4_8053_13e6202f2d3c(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) largest = num;
            if (num < smallest) smallest = num;
        }
        return smallest + largest;
    }

    
    public static int bigSum_Problem_2_fa12a535_7e8a_4c23_8ded_f6d53b97404d(ArrayList<Integer> nums) {
        int largest = nums.stream().max(Integer::compareTo).get();
        int smallest = nums.stream().min(Integer::compareTo).get();
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_e3f7a4b7_a14e_4da8_96ac_1588d6553f90(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_aba8a6e5_5932_4bab_96e3_a36da512b9ae(ArrayList<Integer> nums) {
        int sum = 0;
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_508c73ca_c948_4300_88e0_242235e3724f(ArrayList<Integer> nums) {
        int biggest = Collections.max(nums);
        int smallest = Collections.min(nums);
        int sum = biggest + smallest;
        return sum;
    }

    
    public static int bigSum_Problem_1_b4d97708_b46b_48d7_8122_26c822051f33(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first number
        int smallest = nums.get(0); // initialize smallest to first number
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_dd789f24_bc2d_4d28_9977_9969b5db3d89(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_9b3056c6_fae1_47f3_a11b_30e3f974a7b1(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_8a315024_0976_4ad1_9830_b7666f0e00b4(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_3477561c_2a28_4367_8588_6c4644acd129(ArrayList<Integer> nums) {
        int largest = nums.get(0), smallest = nums.get(0);
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_fe21cc63_900c_4210_b797_ea1ea85751ad(ArrayList<Integer> nums) {
        int largest = nums.get(0), smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_fcb0bc9e_ae3a_4a87_abc7_f14ad8f52736(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_953c71f6_9f80_4134_8bd5_9255eb56a661(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_31b1b4d5_006e_4150_83d9_9e8486a231fa(ArrayList<Integer> nums) {
        int largest = nums.get(0), smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_3dc76a91_3e65_43d1_bd19_cac7e9a4e95c(ArrayList<Integer> nums) {
        int max = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        int min = 0;
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max+min;
    }

    
    public static int bigSum_Problem_1_9896c1b2_9515_42f2_9c61_92ac49300f26(ArrayList<Integer> nums) {
        int sum = 0;
        for (Integer num : nums) {
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_9ba275dd_7fa0_4d5d_a284_9f7f8ff57c75(ArrayList<Integer> nums) {
        int sum = 0;
        for (Integer num : nums) {
            if (num > sum) {
                sum = num;
            }
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_211baae4_a4c2_4fc7_b26c_8872462aee25(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_359c3ece_7ddd_493e_8cc1_acf1804c1275(ArrayList<Integer> nums) {
        int largest = nums.stream().max(Comparator.naturalOrder()).get();
        int smallest = nums.stream().min(Comparator.naturalOrder()).get();
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_a762bc0f_1c3b_4b3e_bda8_16f62a29a146(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_01bc5085_c0f8_4afa_9166_725ac9478aac(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_9b35f0ab_5c33_4b31_803b_aeaa66ba6d35(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_7013b9d6_7fa8_4bd5_bf1d_e8691404d5fd(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_65d270c2_7a49_4385_9065_e4cc18815886(ArrayList<Integer> nums) {
        int maxLargest = nums.get(nums.size() - 1);
        int maxSmallest = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > maxSmallest) {
                maxSmallest = nums.get(i);
            }
            if (nums.get(i) < maxLargest) {
                maxLargest = nums.get(i);
            }
        }
        System.out.println("Biggest and Smallest Number : " + maxLargest + " " + maxSmallest);
        return maxLargest + maxSmallest;
    }

    
    public static int bigSum_Problem_1_b32b12c3_7f4f_4b97_8225_61e2d2a91840(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_dc318c30_ebc8_4368_a92c_747fcc22db0c(ArrayList<Integer> nums) {
        int largest = nums.stream().mapToInteger(Integer::intValue).max().getAsInteger();
        int smallest = nums.stream().mapToInteger(Integer::intValue).min().getAsInteger();
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_7da5d642_93c5_4844_a895_192e2a07c7fd(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_fe9fc7bb_131e_4751_9595_2709fb10037f(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first number
        int smallest = nums.get(0); // initialize smallest to first number
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_42e59fdd_f6d1_4889_9425_e9bc226819a5(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_a6464fa8_c131_4ade_abd5_70e05a061925(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_7da5d642_93c5_4844_a895_192e2a07c7fd(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_f37d514f_d105_472f_8205_334d7f86f9ee(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_e2a2c3b0_82d3_483e_a244_09a7cdecd299(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num: nums){
            if(num > largest)
                largest = num;
            if(num < smallest)
                smallest = num;
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_7bb4526b_5971_42b4_89b0_e56759ee54e5(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_b2484bdf_f4ac_460b_9956_4c7bb0408cbc(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_243e7b94_9d1d_4afb_94d7_508058a22b95(ArrayList<Integer> nums) {
        int result = 0, largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i > largest) {
                largest = i;
            } else if (i < smallest) {
                smallest = i;
            }
        }
        largest = largest + 1;
        smallest = smallest - 1;
        for (int i : nums) {
            if (i > largest) {
                largest = i;
            } else if (i < smallest) {
                smallest = i;
            }
        }
        for (int i : nums) {
            if (i > largest) {
                result = largest - i;
            } else if (i < smallest) {
                result = i - smallest;
            }
        }
        return result;
    }

    
    public static int bigSum_Problem_2_8429092b_e24d_4567_b048_7ed7376073e4(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_51e4533c_756c_4668_ac6f_1dc9ddb80ea4(ArrayList<Integer> nums) {
        int largest = nums.stream().reduce(Math::max).orElse(0L);
        int smallest = nums.stream().reduce(Math::min).orElse(0L);
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_2ced9375_99cb_4501_af88_41f1a194d726(ArrayList<Integer> nums) {
        int largest = nums.stream().max(Integer::compareTo).get();
        int smallest = nums.stream().min(Integer::compareTo).get();
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_d41530d2_07ae_4581_81b5_2502e906e1a2(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        int sum = largest + smallest;
        return sum;
    }

    
    public static int bigSum_Problem_2_e3712fe6_b03c_45f2_935b_cdfa799a4b63(ArrayList<Integer> nums) {
        int sum = 0;
        int largest, smallest;
        for(int i = 0; i<nums.size(); i++)
        {
            sum+=nums.get(i);
        }
        if(nums.size()==1)
        {
            return nums.get(0);
        }
        largest = sum;
        smallest = sum;
        for(int i = 0; i<nums.size(); i++)
        {
            if(nums.get(i)>largest)
            {
                largest = nums.get(i);
            }
            if(nums.get(i)<smallest)
            {
                smallest = nums.get(i);
            }
        }
        return (largest + smallest);
    }

    
    public static int bigSum_Problem_0_97af2f47_8300_47d4_88e5_4f153327a2e6(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            if(num < min){
                min = num;
            }
            if(num > max){
                max = num;
            }
        }
        return max+min;
    }

    
    public static int bigSum_Problem_2_129d5406_5b8f_443d_b2a3_e7808d45090f(ArrayList<Integer> nums) {
        int max = nums.stream()
                .max(Integer::compareTo)
                .get();
        int min = nums.stream()
                .min(Integer::compareTo)
                .get();
        return max+min;
    }

    
    public static int bigSum_Problem_1_b192540f_f7d0_4498_9348_7aeef1e5058a(ArrayList<Integer> nums) {
        int largest = nums.get(0), smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_ebef4c77_b07b_4e19_86d1_c0ed99380ede(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) { // loop through all elements in array
            if (num > largest) { // if current element is greater than largest
                largest = num; // update largest to current element
            } else if (num < smallest) { // if current element is smaller than smallest
                smallest = num; // update smallest to current element
            }
        }
        return largest + smallest; // return sum of largest and smallest
    }

    
    public static int bigSum_Problem_0_7013b9d6_7fa8_4bd5_bf1d_e8691404d5fd(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_19a03a90_fe68_495b_a21f_955f8f946d9d(ArrayList<Integer> nums) {
        if (nums == null || nums.size() == 0)
            return 0;
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            int temp = nums.get(i);
            if (temp < smallest)
                smallest = temp;
            else if (temp > largest)
                largest = temp;
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_5caf4c13_f13f_4455_996c_20db992c3bc9(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_35296a75_ad50_459a_be6a_5bea51a65d02(ArrayList<Integer> nums) {
        int bigSum_Problem_1_35296a75_ad50_459a_be6a_5bea51a65d02 = 0;
        int minVal = Collections.min(nums);
        int maxVal = Collections.max(nums);

        for(int num: nums) {
            if (num >= minVal && num <= maxVal) {
                bigSum_Problem_1_35296a75_ad50_459a_be6a_5bea51a65d02 += num;
            }
        }
        return bigSum_Problem_1_35296a75_ad50_459a_be6a_5bea51a65d02;
    }

    
    public static int bigSum_Problem_1_a1178f4c_17d4_43c2_8b77_9ed0a25dd4bc(ArrayList<Integer> nums) {
        int bigSum_Problem_1_a1178f4c_17d4_43c2_8b77_9ed0a25dd4bc =  0;
        for(int num : nums)
        {
            if (num > bigSum_Problem_1_a1178f4c_17d4_43c2_8b77_9ed0a25dd4bc)
                bigSum_Problem_1_a1178f4c_17d4_43c2_8b77_9ed0a25dd4bc = num;
        }
        return bigSum_Problem_1_a1178f4c_17d4_43c2_8b77_9ed0a25dd4bc;
    }

    
    public static int bigSum_Problem_1_a0a4b2bd_c6a9_413d_815d_76cfcd9a61d2(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_63a22bbd_197f_4e26_a71c_f0d044ddc9ca(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_ea75f9c5_6398_4b4f_b1db_91c3d0f75fd2(ArrayList<Integer> nums) {
        int largest = Collections.max(nums);
        int smallest = Collections.min(nums);
        int sum = largest + smallest;
        return sum;
    }

    
    public static int bigSum_Problem_1_50b7ff72_6353_4891_ad10_ce41db01136a(ArrayList<Integer> nums) {
        int biggest = nums.get(0);
        int smallest = nums.get(0);

        for (int i = 1; i < nums.size(); i++) {
            if (biggest < nums.get(i)) {
                biggest = nums.get(i);
            }

            if (smallest > nums.get(i)) {
                smallest = nums.get(i);
            }
        }

        return biggest + smallest;
    }

    
    public static int bigSum_Problem_2_88d2bff4_0574_4686_8c3e_447fff61a352(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_3d1a36ef_fb47_443d_ae3c_b6800768e136(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_3a81d117_0657_4fe6_b79f_ecc04df04408(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_6d1fb74d_4091_4c93_ac1c_6eb14c252835(ArrayList<Integer> nums) {
        int sum = 0;
        for(int i = 0; i < nums.size(); i++){
            sum += nums.get(i);
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_2cc26bc2_620b_4108_9269_9108297076d7(ArrayList<Integer> nums) {
        int largest = nums.stream().max(Comparator.naturalOrder()).get();
        int smallest = nums.stream().min(Comparator.naturalOrder()).get();
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_79e50a25_03e9_4375_b19d_2c24d9cdb9a8(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }

        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_8dba49d4_2313_4760_ab99_371d86021c30(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_2fcfe853_ed63_4b68_8eab_4fb6564e53fc(ArrayList<Integer> nums) {
        int largest = nums.get(0), smallest = nums.get(0);
        for (Integer num : nums) {
            if (num > largest)
                largest = num;
            else if (num < smallest)
                smallest = num;
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_aba8a6e5_5932_4bab_96e3_a36da512b9ae(ArrayList<Integer> nums) {
        int sum = 0;
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_1c7c3796_3a67_42ab_8d72_d3a01146915b(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_efb7c610_9dc5_4218_a88a_e5584623323c(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_3dda17da_aee5_430d_bb20_858b68b473b2(ArrayList<Integer> nums) {
        int biggerSum = Integer.MIN_VALUE;
        int smallerSum = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > biggerSum) {
                biggerSum = num;
            } else if (num < smallerSum) {
                smallerSum = num;
            }
        }
        return biggerSum + smallerSum;
    }

    
    public static int bigSum_Problem_0_054382ce_c91a_4f11_8955_05a31e14b0fa(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of list
        int smallest = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_94a933e9_f68c_45d0_9dd2_92254a733554(ArrayList<Integer> nums) {
        int largest = nums.get(0), smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_9b35f0ab_5c33_4b31_803b_aeaa66ba6d35(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_ebef4c77_b07b_4e19_86d1_c0ed99380ede(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) { // loop through all elements in array
            if (num > largest) { // if current element is greater than largest
                largest = num; // update largest to current element
            } else if (num < smallest) { // if current element is smaller than smallest
                smallest = num; // update smallest to current element
            }
        }
        return largest + smallest; // return sum of largest and smallest
    }

    
    public static int bigSum_Problem_2_97393c3e_d861_4a0f_bef1_cdf1c56a2808(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first number
        int smallest = nums.get(0); // initialize smallest to first number
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_5772aa21_2f3e_4062_bec3_adda478d3097(ArrayList<Integer> nums) {
        int biggest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            biggest = Math.max(biggest, num);
            smallest = Math.min(smallest, num);
        }
        System.out.println("Smallest number in ArrayList is: " + smallest);
        System.out.println("Biggest number in ArrayList is: " + biggest);
        return biggest + smallest;
    }

    
    public static int bigSum_Problem_2_65991464_83cd_45b3_ae5b_e4ee7e9f02ce(ArrayList<Integer> nums) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            sum = sum + nums.get(i);
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_a605f59a_111b_41e0_a4db_90c7124b90e8(ArrayList<Integer> nums) {
        int sum=0;
        for (int i = 0; i < nums.size(); i++){
            sum += nums.get(i);
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_40201173_8ffa_42b1_8eab_31138b8a9e67(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_449cd487_a08d_44af_8957_46cee2d09162(ArrayList<Integer> nums) {
        int largest = Collections.max(nums);
        int smallest = Collections.min(nums);
        int sum = largest + smallest;
        return sum;
    }

    
    public static int bigSum_Problem_2_dfc77c07_ae9f_485a_ada3_d33d30e8a668(ArrayList<Integer> nums) {
        int largest = Collections.max(nums);
        int smallest = Collections.min(nums);
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_255b450a_4a16_4549_be32_4692cc9fc69f(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_03b50f42_ced4_4fbe_8dcf_b2d3aa3da8a9(ArrayList<Integer> nums) {
        int largest = 0L;
        int smallest = 0L;
        int sum = 0L;
        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
            if (largest < nums.get(i)) {
                largest = nums.get(i);
            } else if (smallest > nums.get(i)) {
                smallest = nums.get(i);
            }
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_8725898e_f110_4eb8_87d6_7beafd509438(ArrayList<Integer> nums) {
        // write your code here
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return (max + min);
    }

    
    public static int bigSum_Problem_0_c0fb9a15_d58c_4a45_b82f_6874f7023729(ArrayList<Integer> nums) {
        int largest = Integer.MAX_VALUE;
        int smallest = Integer.MIN_VALUE;
        for (Integer n : nums) {
            largest = Math.max(largest, n);
            smallest = Math.min(smallest, n);
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_31b1b4d5_006e_4150_83d9_9e8486a231fa(ArrayList<Integer> nums) {
        int largest = nums.get(0), smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_ca7839d4_042d_4a71_b390_0ece9d6d5009(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_359c3ece_7ddd_493e_8cc1_acf1804c1275(ArrayList<Integer> nums) {
        int largest = nums.stream().max(Comparator.naturalOrder()).get();
        int smallest = nums.stream().min(Comparator.naturalOrder()).get();
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_97af2f47_8300_47d4_88e5_4f153327a2e6(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            if(num < min){
                min = num;
            }
            if(num > max){
                max = num;
            }
        }
        return max+min;
    }

    
    public static int bigSum_Problem_2_a442415a_ed04_480e_a99b_04e97cf362b7(ArrayList<Integer> nums) {
        int biggest = nums.get(0);
        int smallest = nums.get(0);
        for(int num : nums) {
            if(num > biggest)
                biggest = num;
            else if(num < smallest)
                smallest = num;
        }
        return biggest + smallest;
    }

    
    public static int bigSum_Problem_1_e51d7b89_cf2c_4818_a752_149dd2277e83(ArrayList<Integer> nums) {
        int sum = 0;
        for (Integer num : nums) {
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_367743d2_b5bb_4004_9261_bc2ac2030bd2(ArrayList<Integer> nums) {
        Integer result = Integer.MIN_VALUE;
        for (Integer n : nums) {
            result += n;
        }
        return result;
    }

    
    public static int bigSum_Problem_0_c7e8eb4c_63cc_40fb_b61c_8f9d5bd1afca(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
        int sum = 0;
        for (Integer num : nums)
            sum = sum + num;
        return sum;
    }

    
    public static int bigSum_Problem_1_cd8eb4b2_ed1f_408e_80e7_b595637a2a5b(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_3c135425_c08b_4343_a775_313e24a30219(ArrayList<Integer> nums) {
        // Write your code here
        return 0;
    }

    
    public static int bigSum_Problem_2_fa897b9d_6e8d_4857_9aa2_fab6c078c4a9(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int i = 1; i < nums.size(); i++) { // loop through all elements in the array
            if (nums.get(i) > largest) { // if current element is greater than largest
                largest = nums.get(i); // update largest to current element
            } else if (nums.get(i) < smallest) { // if current element is smaller than smallest
                smallest = nums.get(i); // update smallest to current element
            }
        }
        return largest + smallest; // return sum of largest and smallest elements
    }

    
    public static int bigSum_Problem_0_25008f44_a440_4e98_8141_02f8b8d713e7(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_a34c664c_1373_48b8_9760_f02951d11196(ArrayList<Integer> nums) {
        int largest = nums.get(0),
                smallest = nums.get(0);
        for (int num: nums) {
            if (largest < num)
                largest = num;
            if (smallest > num)
                smallest = num;
        }
        return smallest + largest;
    }

    
    public static int bigSum_Problem_1_dd789f24_bc2d_4d28_9977_9969b5db3d89(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_d14c5b19_7f4c_438e_b6cc_73e4d3f9c2a8(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_f19d6815_b3c8_4cf3_919d_6ce781c28dbe(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_1b3970a9_359c_4a40_b34e_5d92bf0ed8b0(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            largest += nums.get(i);
            smallest += nums.get(i);
        }
        return largest - smallest;
    }

    
    public static int bigSum_Problem_0_551ebb76_b8a5_4392_a980_83a7fca3e29d(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return min + max;
    }

    
    public static int bigSum_Problem_1_6ca5a245_3b61_4303_85d0_c4e4a422dd2e(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_33fe8a0c_532d_4ed2_a87e_ffe0e0b9691f(ArrayList<Integer> nums) {
        // Write your logic here
        int sum = 0;
        for(int num : nums) {
            sum = sum + num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_44dbe357_3ca0_48bb_8a12_edfd50b82197(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first number
        int smallest = nums.get(0); // initialize smallest to first number
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_e3f7a4b7_a14e_4da8_96ac_1588d6553f90(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_ae4a1aeb_9823_4c83_9bbb_014328cfbf8e(ArrayList<Integer> nums) {
        int sum = 0;
        for(int i : nums) {
            sum += i;
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_9978bf1a_aee5_45ad_b1f4_48066fe28172(ArrayList<Integer> nums) {
        int largest = -100000;
        int smallest = 100000;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_1c7c3796_3a67_42ab_8d72_d3a01146915b(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_0067189c_e3d8_41a5_ab4c_ea8bd79d5fee(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_7da5d642_93c5_4844_a895_192e2a07c7fd(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_693817c5_f2b6_4d24_bc00_e9aa3316f0a1(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_6cf849f3_eec3_459d_9129_acbd44a7c1f5(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_51e4533c_756c_4668_ac6f_1dc9ddb80ea4(ArrayList<Integer> nums) {
        int largest = nums.stream().reduce(Math::max).orElse(0L);
        int smallest = nums.stream().reduce(Math::min).orElse(0L);
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_c66b3866_ac1a_4767_a026_ab53cb637401(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_db87cfc4_5ce0_460b_878d_bcf25a634467(ArrayList<Integer> nums) {
        int largest = nums.stream().max(Integer::compareTo).get();
        int smallest = nums.stream().min(Integer::compareTo).get();
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_8f58b122_b919_4e1e_b914_5b16a28f8ffb(ArrayList<Integer> nums) {
        int bigSum_Problem_1_8f58b122_b919_4e1e_b914_5b16a28f8ffb = nums.get(0) + nums.get(nums.size()-1);
        for (int num : nums)
            if (num > bigSum_Problem_1_8f58b122_b919_4e1e_b914_5b16a28f8ffb)
                bigSum_Problem_1_8f58b122_b919_4e1e_b914_5b16a28f8ffb = num;
        return bigSum_Problem_1_8f58b122_b919_4e1e_b914_5b16a28f8ffb;
    }

    
    public static int bigSum_Problem_0_30bdc273_67cc_4b56_9739_e412e950608e(ArrayList<Integer> nums) {
        return nums.stream().mapToInteger(num -> num).max().getAsInteger();
    }

    
    public static int bigSum_Problem_0_06863796_171d_43c6_815f_98e4692da5c5(ArrayList<Integer> nums) {
        // TODO Auto-generated method stub
        int largest = nums.stream()
                .max(Comparator.comparing(Number::intValue))
                .orElseThrow(NoSuchElementException::new);
        int smallest = nums.stream()
                .min(Comparator.comparing(Number::intValue))
                .orElseThrow(NoSuchElementException::new);
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_c1e6a94e_a526_4cdb_885c_d62b39380a52(ArrayList<Integer> nums) {
        if (nums.size() <= 1) return 0;

        // sort and return the result
        Collections.sort(nums);
        return nums.get(nums.size() - 1);
    }

    
    public static int bigSum_Problem_2_1ce0b2d8_d727_47ee_8566_1edce7bbae42(ArrayList<Integer> nums) {
        int largestSum = nums.get(0), smallestSum = nums.get(0);
        for(int i = 0; i < nums.size(); i++) {
            largestSum = Math.max(largestSum, nums.get(i));
            smallestSum = Math.min(smallestSum, nums.get(i));
        }
        return largestSum + smallestSum;
    }

    
    public static int bigSum_Problem_0_2df715a9_e0e9_4391_831e_fe5b6c4dfd47(ArrayList<Integer> nums) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_a605f59a_111b_41e0_a4db_90c7124b90e8(ArrayList<Integer> nums) {
        int sum=0;
        for (int i = 0; i < nums.size(); i++){
            sum += nums.get(i);
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_b2a9a9dd_5b33_476e_9dd1_38c35d96f50f(ArrayList<Integer> nums) {
        // Your code here
        int largest = Integer.MAX_VALUE, smallest = Integer.MIN_VALUE;
        for(int num: nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_fdd26027_0a07_44c1_a4b9_0ff4032a4bee(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) { // for each element in the array
            if (num > largest) { // if the current element is greater than the largest
                largest = num; // update the largest to the current element
            }
            if (num < smallest) { // if the current element is smaller than the smallest
                smallest = num; // update the smallest to the current element
            }
        }
        return largest + smallest; // return the sum of the largest and smallest elements
    }

    
    public static int bigSum_Problem_2_9896c1b2_9515_42f2_9c61_92ac49300f26(ArrayList<Integer> nums) {
        int sum = 0;
        for (Integer num : nums) {
            sum += num;
        }
        return sum;
    }

}
