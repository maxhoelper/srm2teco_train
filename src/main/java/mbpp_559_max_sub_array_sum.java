package mbpp_559_max_sub_array_sum;

public class mbpp_559_max_sub_array_sum {

    
    public static int maxSubArraySum_Problem_1_d77401e4_c903_481f_8321_e568689fc103(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_4b14dfa9_bc3d_455f_920b_73e3d45cf3c4(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_e2412779_e297_4d32_819e_f3fa22e4fdda(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_f734f5d6_eda0_4e88_8353_feb0776e5976(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_c052b367_444f_4d20_ac10_7f5b3bd74674(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_497a6a6f_1e18_408b_a7e9_fea3a5618db1(ArrayList<Integer> a, int size) {
        int sum = 0;
        int currentSum = 0;
        int j = 0;
        for (int i = 0; i < a.size(); i++) {
            if (j == i) {
                sum += a.get(j);
            } else {
                currentSum += a.get(j);
                if (currentSum > sum) {
                    sum = currentSum;
                }
                currentSum = 0;
                j++;
            }
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_1_46d4f5da_ab24_4f3d_8de5_fa92d2d2659f(ArrayList<Integer> a, int size) {
        int[] a1 = new int[a.size()];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            a1[i] = a.get(i);
        }

        for (int i = 0; i < size - 1; i++) {
            int temp = a1[i + 1] - a1[i];
            sum += temp;
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_1_2cd4cd56_5fe4_49a8_863e_c7c4ff0f0bdf(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_04614151_526f_4b64_8379_caf2cd459b57(ArrayList<Integer> a, int size) {
        // TODO Write your Java program here.
        // Find sum of all elements in a given subarray
        int sum = 0;
        int maxSum = -999999;
        List<Integer> a1 = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            if (i == size - 1) {
                a1.add(a.get(i));
            }
            else {
                a1.add(a.get(i) + a.get(i + 1));
            }
            sum += a1.get(i);
            if (sum > maxSum) {
                maxSum = sum;
            }
            sum = 0;
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_795fb164_6d04_4d2d_9777_38d8f5acf404(ArrayList<Integer> a, int size) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_6ca9c70c_0323_4ce3_8a71_59a1777ee219(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int currentSum = 0;
        int currentMaxSum = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentMaxSum = currentSum;
            for(int j = i; j < a.size(); j++) {
                currentSum = currentSum + a.get(j);
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_94d8a2e5_d4dc_4ebb_b1e1_dbb45f571448(ArrayList<Integer> a, int size) {
        int maxSum = 0;
        ArrayList<Integer> maxSubArr = new ArrayList<Integer>();
        ArrayList<Integer> subArr = new ArrayList<Integer>();
        int sum = 0;
        int n = a.size();
        int k = 0;
        int sum1 = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a.get(i)>sum1){
                sum1 = sum;
                k = i;
            }
            sum += a.get(i);
        }
        subArr.add(k, sum);
        while(subArr.size()>0){
            int sum2 = subArr.get(subArr.size()-1);
            if(sum2>maxSum){
                maxSum = sum2;
                maxSubArr = new ArrayList<Integer>(subArr);
            }
            subArr.remove(subArr.size()-1);
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_94d8a2e5_d4dc_4ebb_b1e1_dbb45f571448(ArrayList<Integer> a, int size) {
        int maxSum = 0;
        ArrayList<Integer> maxSubArr = new ArrayList<Integer>();
        ArrayList<Integer> subArr = new ArrayList<Integer>();
        int sum = 0;
        int n = a.size();
        int k = 0;
        int sum1 = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a.get(i)>sum1){
                sum1 = sum;
                k = i;
            }
            sum += a.get(i);
        }
        subArr.add(k, sum);
        while(subArr.size()>0){
            int sum2 = subArr.get(subArr.size()-1);
            if(sum2>maxSum){
                maxSum = sum2;
                maxSubArr = new ArrayList<Integer>(subArr);
            }
            subArr.remove(subArr.size()-1);
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_125f1b8e_86fc_4bf3_b372_f611b8fff029(ArrayList<Integer> a, int size) {
        int sum = 0;
        int max = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            sum += a.get(i);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSubArraySum_Problem_2_41bb0c01_c86a_460f_9b59_13c624ddfb92(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_c89f1714_efa9_4859_ae31_4dffa825cd1f(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int currentSum = 0;
        int currentMaxSum = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentMaxSum = currentSum;
            for(int j = i + 1; j < a.size(); j++) {
                currentSum = currentSum + a.get(j);
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                    currentMaxSum = currentSum;
                }
            }
            sum = sum + currentMaxSum;
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_2_61eb3e52_238d_4710_9d21_22064cc997d5(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int maxSumIndex = 0;
        for(int i = 0; i < a.size(); i++) {
            sum = 0;
            for(int j = i; j < a.size(); j++) {
                sum += a.get(j);
                if(sum > maxSum) {
                    maxSum = sum;
                    maxSumIndex = j;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_71c4d7a4_d9aa_49dc_b708_227f5083249a(ArrayList<Integer> a, int size) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_2cd2c18d_d7aa_47ef_8e2e_74e3eb84caac(ArrayList<Integer> a, int size) {
        int sum = 0;
        for (Integer cur : a) {
            sum += cur;
        }
        if (sum > size) {
            return sum;
        }
        int currentSum = sum;
        while (currentSum > size) {
            currentSum -= a.get(0);
            int maxSum = currentSum;
            for (int i = 1; i < a.size(); i++) {
                currentSum -= a.get(i);
                if (currentSum > size) {
                    maxSum = currentSum;
                }
            }
            sum += maxSum;
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_2_72b8ea95_b1fa_4eca_955d_b6849784440f(ArrayList<Integer> a, int size) {
        int sum = 0;
        int i = 0, j = 0, k = 0, lastindex = 0;

        // For every sub-array in the given array
        // For every sub-array in the given array except the last sub-array
        // If the element of the sub-array is greater than the last element
        // Then add the subarray to the sum and remove the last element from the array
        // Else add the last element and add the next element from the array
        for (int r = 0; r < a.size() - 1; r++) {
            for (int c = 0; c < a.size() - 1 - r; c++) {
                if (r != 0) {
                    sum += a.get(lastindex);
                    a.remove(lastindex);
                }
                if (c != 0) {
                    sum += a.get(lastindex);
                    a.remove(lastindex);
                }
                if (a.get(r) > a.get(c)) {
                    sum += a.get(c);
                    a.remove(c);
                }
                if (a.get(r) > a.get(c)) {
                    sum += a.get(c);
                    a.remove(c);
                }
            }
        }

        // After adding the last element add it to the sum and remove it
        sum += a.get(lastindex);
        a.remove(lastindex);

        // If the sum is equal to the size then return it
        if (sum == size) {
            return sum;
        } else {
            return sum;
        }
    }

    
    public static int maxSubArraySum_Problem_2_73d1f5b7_0e54_4b23_8728_e82d6be95070(ArrayList<Integer> a, int size) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i <= a.size() - 1; i++) {
            sum = sum + a.get(i);
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_2_8409a748_6d40_48ca_81bc_9123a17327f2(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_b2750a56_3170_4e64_a09b_9e9ed9f3d480(ArrayList<Integer> a, int size) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_5b95f689_1f26_4431_9d5d_61a724ebf1f0(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_cc3eea9d_0b29_44d4_80af_611ac9e2c1bf(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_381c2689_881f_452d_8038_bc96aca60656(ArrayList<Integer> a, int size) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_c54c17e3_d81e_4100_ba5a_e318055fcbea(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);

        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_2c629c5d_7858_439a_8882_2b4054a4e836(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int maxSumIndex = 0;
        int currentSum = 0;
        int currentSumIndex = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentSumIndex = 0;
            for(int j = i; j < a.size(); j++) {
                currentSum += a.get(j);
                currentSumIndex++;
                if(currentSumIndex == size) {
                    sum += currentSum;
                    if(sum > maxSum) {
                        maxSum = sum;
                        maxSumIndex = currentSumIndex;
                    }
                    currentSum = 0;
                    currentSumIndex = 0;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_89e407d2_fb7c_4b2f_be65_97f9ecb7f4ad(ArrayList<Integer> a, int size) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_872f323f_2993_4c09_9f6a_35d746ae9c71(ArrayList<Integer> a, int size) {
        int sum = 0;
        for(int i = 0; i< size; i++){
            sum = sum + a.get(i);
            if( sum > 0 ){
                break;
            }
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_2_2399cb3c_e13d_4753_8074_158b4e2dcf77(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_c1c74bd2_fcff_4b9c_aa5c_e6e0e228c6d8(ArrayList<Integer> a, int size) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            sum += currentSum;
            if(sum > max) {
                max = sum;
                maxSum = currentSum;
            }
            sum -= currentSum;
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_630d87e3_3fc4_452e_b77b_716cdc31f0dd(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int currentMaxSum = Integer.MIN_VALUE;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentMaxSum = currentSum;
            for(int j = i; j < a.size(); j++) {
                currentSum = a.get(j) + currentSum;
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_02ececd9_e198_4710_9091_56e4f5612c01(ArrayList<Integer> a, int size) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_5d2e2cf9_0122_4c51_b1e2_904c40643719(ArrayList<Integer> a, int size) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < a.size(); i++) {
            int pos = i;
            int maxValue = a.get(i);
            while (pos < size && a.get(pos) <= maxValue)
                maxValue += a.get(pos);
            if (maxValue > maxSum) {
                maxSum = maxValue;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_fd89415b_248f_47a0_afa6_c44236481452(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int maxStart = 0;
        int maxEnd = 0;
        int currentSum = 0;
        int currentStart = 0;
        int currentEnd = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentStart = i;
            currentEnd = i;
            for(int j = i + 1; j < a.size(); j++) {
                currentSum += a.get(j);
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                    maxStart = currentStart;
                    maxEnd = currentEnd;
                }
                currentEnd = j;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_8c040c14_bd2c_478a_97f4_c15f09a61840(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int maxSumIndex = 0;
        int currentSum = 0;
        int currentSumIndex = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentSumIndex = 0;
            for(int j = i; j < a.size(); j++) {
                currentSum += a.get(j);
                currentSumIndex++;
                if(currentSumIndex == size) {
                    sum += currentSum;
                    if(sum > maxSum) {
                        maxSum = sum;
                        maxSumIndex = currentSumIndex;
                    }
                    currentSum = 0;
                    currentSumIndex = 0;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_e54f1b69_b004_4bcc_824e_df2fbc82d540(ArrayList<Integer> a, int size) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_f52e7101_9d6b_46ba_ad31_bc33f74d0f80(ArrayList<Integer> a, int size) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_45e2b2d6_526f_42c0_abd8_3b68b5e6b9e6(ArrayList<Integer> a, int size) {
        // Write your code here.
        int maxSum = 0L;
        int start = -1L;
        int end = 0L;
        Integer sum = null;
        for(int i = 0;i<a.size(); i++) {
            if(i == 0 || i == a.size() - 1) {
                sum += a.get(i);
            } else {
                if((sum + a.get(i)) > sum) {
                    start = i;
                    sum = (sum + a.get(i));
                }
                if((sum + a.get(i)) > sum) {
                    end = i;
                    sum = (sum + a.get(i));
                }
            }
        }
        if(sum != null && end > start && start < size) {
            maxSum = sum;
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_cc3eea9d_0b29_44d4_80af_611ac9e2c1bf(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_8a0f7e20_6825_431f_a029_ffc8c52a1abf(ArrayList<Integer> a, int size) {
        int sum = 0;
        // write your code here
        return sum;
    }

    
    public static int maxSubArraySum_Problem_1_41bb0c01_c86a_460f_9b59_13c624ddfb92(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_bc6b360b_e66b_4fb7_a261_360db21fc492(ArrayList<Integer> a, int size) {
        int sum = 0;
        int max = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            sum += a.get(i);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSubArraySum_Problem_2_08ec3311_2633_49c1_a3bb_d92edbbd50c3(ArrayList<Integer> a, int size) {
        int maxSum = 0;
        int left = 0;
        int right = 0;
        int sum = 0;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum >= size) {
                right++;
                sum += size - a.get(i);
            } else {
                left = i;
                break;
            }
        }
        while(left < right) {
            sum += a.get(left);
            left++;
            sum += a.get(right);
            right++;
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_13c9acd7_86f8_4299_9888_b92e821ab28c(ArrayList<Integer> a, int size) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_99ce8e96_3337_42c9_91d0_634087018ceb(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int currentSum = 0;
        int currentMaxSum = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentMaxSum = currentSum;
            for(int j = i; j < a.size(); j++) {
                currentSum = currentSum + a.get(j);
                if(currentSum > currentMaxSum) {
                    currentMaxSum = currentSum;
                }
            }
            sum += currentMaxSum;
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_646fd715_4c84_4fb7_8bae_f91d9d94e79b(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_8ef1b3cb_aa20_47ef_a7a7_51f8f5f3f6ea(ArrayList<Integer> a, int size) {
        // Write your answer here
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i : a) {
            if(i > max) {
                max = i;
                sum = 0;
            }
            sum += i;
            if(sum == size) {
                return max;
            }
        }
        return -1;
    }

    
    public static int maxSubArraySum_Problem_1_97c94594_09b3_433d_8c66_41746b57b3cd(ArrayList<Integer> a, int size) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_573a4b3a_c69b_4783_b4ff_bdd105578087(ArrayList<Integer> a, int size) {
        int[] ar = new int[a.size()];
        int sum = 0;
        // Write your code here.
        for(int i=0;i<a.size();i++) {
            ar[i] = a.get(i);
        }

        for(int j=0;j<ar.length;j++) {
            for(int i=j+1;i<ar.length;i++) {
                if(ar[j]+ar[i]>sum) {
                    sum = ar[j]+ar[i];
                }
            }
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_2_bc6b360b_e66b_4fb7_a261_360db21fc492(ArrayList<Integer> a, int size) {
        int sum = 0;
        int max = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            sum += a.get(i);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSubArraySum_Problem_2_c7eefa5d_3fcc_4190_a154_081711bf4039(ArrayList<Integer> a, int size) {
        int max_so_far = 0;
        int max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_9c8ba9c5_e75e_47e1_823d_f21eb4eccd16(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_617b675b_68c8_4fc9_bff7_4257ce291cdd(ArrayList<Integer> a, int size) {
        int maxSum = 0;
        int sum = 0;
        for(int i = 0; i < a.size(); i++) {
            sum = a.get(i);
            for(int j = i; j < a.size(); j++) {
                sum -= a.get(j);
                if(sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_03889f9d_fc6d_41e6_9758_ae74646c93ac(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_2cd09767_bd8c_4484_826e_1b1e6742ed05(ArrayList<Integer> a, int size) {
        if (size == 0) return 0;
        // Write your code here.
        ArrayDeque<Integer> left = new ArrayDeque<>(); //Left array deque
        ArrayDeque<Integer> right = new ArrayDeque<>(); //Right array deque
        ArrayDeque<Integer> intest = new ArrayDeque<>(); //intest deque
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        left.offer(0L);
        right.offer(0L);
        while (left.size() != 0 || right.size() != 0) {
            curSum = curSum + left.poll() + right.poll();
            if (curSum > maxSum) {
                maxSum = curSum;
                intest.offer(curSum);
            }
            if (curSum < size) {
                left.offer(curSum);
                right.offer(curSum);
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_39c07b19_5733_4462_b00d_bf1a5ea7da98(ArrayList<Integer> a, int size) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_4910a41e_e770_4093_a56e_b3817c60affd(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int maxStart = 0;
        int maxEnd = 0;
        int maxSumOfSubArray = 0;
        int currentSum = 0;
        int currentStart = 0;
        int currentEnd = 0;
        int currentSumOfSubArray = 0;
        int currentMaxSum = 0;
        int currentMaxStart = 0;
        int currentMaxEnd = 0;
        int currentMaxSumOfSubArray = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentStart = i;
            currentEnd = i + 1;
            currentSumOfSubArray = currentSum;
            currentMaxSum = currentSum;
            currentMaxStart = currentStart;
            currentMaxEnd = currentEnd;
            currentMaxSumOfSubArray = currentSumOfSubArray;
            for(int j = i + 1; j < a.size(); j++) {
                currentSum = a.get(j);
                currentStart = j;
                currentEnd = j + 1;
                currentSumOfSubArray = currentSum;
                currentMaxSum = currentSum;
                currentMaxStart = currentStart;
                currentMaxEnd = currentEnd;
                currentMaxSumOfSubArray = currentSumOfSubArray;
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                    maxStart = currentStart;
                    maxEnd = currentEnd;
                    maxSumOfSubArray = currentSumOfSubArray;
                }
                if(currentSum > maxSumOfSubArray) {
                    maxSumOfSubArray = currentSumOfSubArray;
                    maxStart = currentStart;
                    maxEnd = currentEnd;
                    maxSumOfSubArray = currentSumOfSubArray;
                }
            }
        }
        sum = maxSum;
        maxStart = maxStart;
        maxEnd = maxEnd;
        maxSumOfSubArray = maxSumOfSubArray;
        return sum;
    }

    
    public static int maxSubArraySum_Problem_2_9dc87496_19a9_4b0e_a71f_1dd6cfefea5d(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int currentMaxSum = Integer.MIN_VALUE;
        int currentMaxSumIndex = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentMaxSum = currentSum;
            currentMaxSumIndex = i;
            for(int j = i; j < a.size(); j++) {
                currentSum = currentSum + a.get(j);
                if(currentSum > currentMaxSum) {
                    currentMaxSum = currentSum;
                    currentMaxSumIndex = j;
                }
            }
            sum += currentMaxSum;
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_de601d41_5c3e_4cfb_9634_a6309826c8fe(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        for(int i = 0; i < a.size(); i++) {
            if(i == 0) {
                sum = a.get(i);
                maxSum = sum;
            }
            else if(sum + a.get(i) > maxSum) {
                maxSum = sum + a.get(i);
            }
            sum += a.get(i);
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_bb576f6a_1fbb_4a75_bc08_e0bf94baaac6(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_5026a2f4_632f_4363_8d08_a8ca3b802716(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int maxStart = 0;
        int maxEnd = 0;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
                maxStart = i;
                maxEnd = i;
            }
            else if(sum == maxSum) {
                maxEnd = i;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_9c3985c1_2057_4444_898d_411d195e0bb4(ArrayList<Integer> a, int size) {
        
        int maxSubArraySum_Problem_2_9c3985c1_2057_4444_898d_411d195e0bb4 = Integer.MAX_VALUE;
        
        int leftIndex = 0;
        int rightIndex = a.size()-1;
        int sum = 0;
        
        while(leftIndex <= rightIndex) {
            int currentSum = 0;
            int currentSumIndex = 0;
            for(int i = leftIndex; i <= rightIndex; i++) {
                sum += a.get(i);
                if(sum > currentSum) {
                    currentSum = sum;
                    currentSumIndex = i;
                }
                
            }
            maxSubArraySum_Problem_2_9c3985c1_2057_4444_898d_411d195e0bb4 = Math.max(maxSubArraySum_Problem_2_9c3985c1_2057_4444_898d_411d195e0bb4, currentSum + currentSumIndex);
            leftIndex++;
            rightIndex--;
        }
        
        return maxSubArraySum_Problem_2_9c3985c1_2057_4444_898d_411d195e0bb4;
    }

    
    public static int maxSubArraySum_Problem_2_c9a2e2d9_2352_46b8_8ec4_be1e84eedd7f(ArrayList<Integer> a, int size) {
        int sum = 0;
        int largest = 0;
        int sumOfSubArrays = 0;

        for (int i = 0; i < a.size(); i++) {
            int currentSum = a.get(i);

            // add current sum to sum
            sum += currentSum;

            // check if current sum is greater than largest so far
            if (sum > largest) {
                // reset largest and sum
                largest = sum;
            }
            sumOfSubArrays += currentSum;

            // check if sum is same as largest sum
            if (sum == largest) {
                // reset the sum
                sumOfSubArrays = 0;
            }
        }

        // return sum
        return sumOfSubArrays;
    }

    
    public static int maxSubArraySum_Problem_1_73d1f5b7_0e54_4b23_8728_e82d6be95070(ArrayList<Integer> a, int size) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i <= a.size() - 1; i++) {
            sum = sum + a.get(i);
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_2_83cf41fd_2383_41be_9c05_7afd61e1ea30(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);

        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_00a50f4c_9179_4351_a5c4_14ab58600937(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_96976865_1d03_409d_8eaa_01eb04a3035c(ArrayList<Integer> a, int size) {
        // your code goes here
        int maxSum = -size+1;
        ArrayList<Integer> maxSubArray = new ArrayList<Integer>();
        for(int i = 0; i <= size; i++) {
            maxSubArray.add(i, -size);
        }
        for(int i = 0; i <= size; i++) {
            for(int j = i; j <= size; j++) {
                if(a.get(j) < 0 || a.get(j) > size) {
                    if(j - i >= 1) {
                        maxSubArray.set(j-i, a.get(j));
                        int sum = maxSubArray.get(j-i)+maxSubArray.get(j);
                        maxSum = Math.max(sum, maxSum);
                        if(sum > maxSum) {
                            maxSubArray.set(j, sum);
                        }
                    }
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_159f465f_13d9_499b_97b0_fe1acb53576d(ArrayList<Integer> a, int size) {
        int sum = 0;
        int max = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            sum += a.get(i);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSubArraySum_Problem_2_1f9ec917_b7f4_4354_9c01_4b1f7195d2d8(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int maxSumIndex = 0;
        int currentSum = 0;
        int currentSumIndex = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentSumIndex = a.get(i);
            for(int j = i + 1; j < a.size(); j++) {
                currentSum += a.get(j);
                currentSumIndex += a.get(j);
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                    maxSumIndex = currentSumIndex;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_91257189_69fa_4d92_935a_953cd2bb2f80(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;

        // Loop through the array
        for (int i = 0; i <= a.size(); i++) {

            // If the current index is greater than or equal to the index
            // of subarray then sum will contain the sum of the subarray
            int currentSum = sum;

            if (i >= size && sum >= maxSum) {
                // Stop searching for the sum
                sum = maxSum;
            } else {
                // Loop through the array list
                for (int j = 1; j <= i; j++) {
                    sum += a.get(j);
                    // If the current index is equal to the index
                    // of subarray then the current sum will be the sum
                    // of the subarray
                    if (sum == currentSum) {
                        sum = 0;
                        break;
                    }
                }

                // If sum is greater than the max sum then store the max
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_b4cb0514_a43d_445e_a526_9e763a03edec(ArrayList<Integer> a, int size) {
        return a.stream()
                .mapToInteger(i -> i)
                .sum() 
                + 
                a.stream()
                .mapToInteger(i -> i)
                .skip(size-1)
                .sum();
    }

    
    public static int maxSubArraySum_Problem_1_12a3f72b_9c2d_4e81_822c_cc6f15e35c5b(ArrayList<Integer> a, int size) {
        int i = 0;
        int j = 0;
        int sum = 0;
        while(j < a.size() - 1) {
            sum += a.get(j + 1);
            i = j + 1;
            while(i < size && a.get(i) <= a.get(j + 1)) {
                i++;
            }
            j++;
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_2_994cdae3_af92_4ae9_b1b7_dc1286217bb5(ArrayList<Integer> a, int size) {
        int maxSum = 0;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += a.get(i);
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_3eafc595_a731_4eeb_8ffb_fde8c292b3ca(ArrayList<Integer> a, int size) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_159f465f_13d9_499b_97b0_fe1acb53576d(ArrayList<Integer> a, int size) {
        int sum = 0;
        int max = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            sum += a.get(i);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSubArraySum_Problem_1_ecc20298_61f6_4f43_bc1f_9a2caab54e81(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_1b4a3944_275b_478a_87c8_ea5d04020f20(ArrayList<Integer> a, int size) {
        int sum = 0;
        int max = a.get(0);
        int start = 0;
        int end = 0;
        for(int i = 1; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > max) {
                max = sum;
                start = i;
            }
            else if(sum < max) {
                end = i;
            }
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_1_5141b6ef_27c6_4b75_b091_0edaa647428f(ArrayList<Integer> a, int size) {
        int maxsum = a.get(0); // Set max sum equal to first element of list.
        int maxLength = 0; // Initialize max length to 0
        int start = 0; // Initialize start to 0.
        // Iterate over the array and keep track of the largest sum and the max length of the subarray so far.
        for (int i = 0; i < a.size(); i++) {
            int cursum = a.get(i); // Initialize current sum to current element of array.
            if (cursum > maxsum) { // If current sum is greater than previous sum.
                if (cursum > maxsum) { // Check if current sum is greater than previous max sum.
                    maxLength = i - start; // If it is, then store current length as new max length.
                    maxsum = cursum; // Store new max sum.
                } // Else if current sum is smaller than previous max sum, then it must be equal to previous max sum.
            } else { // Else keep the current sum as current max sum.
                maxsum = cursum; // Update current sum.
            }
            // If current length is greater than 0 then store the current start index.
            if (maxLength > 0) {
                start = i;
            }
        }
        return maxsum;
    }

    
    public static int maxSubArraySum_Problem_2_4a662f28_40d5_474e_87f3_56287f8f12d1(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int currentSum = 0;
        int currentMaxSum = 0;
        int currentStart = 0;
        int currentEnd = 0;
        int currentMaxStart = 0;
        int currentMaxEnd = 0;
        for(int i = 0; i < a.size(); i++) {
            currentStart = i;
            currentEnd = i;
            currentSum = a.get(i);
            currentMaxStart = i;
            currentMaxEnd = i;
            currentMaxSum = a.get(i);
            for(int j = i + 1; j < a.size(); j++) {
                currentEnd = j;
                currentSum = a.get(j);
                if(currentSum > currentMaxSum) {
                    currentMaxStart = currentStart;
                    currentMaxEnd = currentEnd;
                    currentMaxSum = currentSum;
                }
            }
            sum += currentSum;
            if(currentMaxSum > maxSum) {
                maxSum = currentMaxSum;
            }
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_2_f920877b_9054_46bf_9eca_c53345a072fb(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int maxStart = 0;
        int maxEnd = 0;
        int maxSumOfSubArray = 0;
        for(int i = 0; i < a.size(); i++) {
            if(i == 0) {
                sum = a.get(i);
                maxSum = sum;
                maxStart = i;
                maxEnd = i;
                maxSumOfSubArray = sum;
            }
            if(i == a.size() - 1) {
                sum = a.get(i) + sum;
                maxSum = sum;
                maxStart = i;
                maxEnd = i;
                maxSumOfSubArray = sum;
            }
            if(a.get(i) > maxSum) {
                sum = sum + a.get(i);
                maxSum = sum;
                maxStart = i;
                maxEnd = i;
                maxSumOfSubArray = sum;
            }
            if(a.get(i) < maxSum) {
                sum = sum - a.get(i);
                maxSum = sum;
                maxStart = i;
                maxEnd = i;
                maxSumOfSubArray = sum;
            }
        }
        return maxSumOfSubArray;
    }

    
    public static int maxSubArraySum_Problem_1_c81e3c29_06e4_41b7_b4a4_4ef6a9d3444a(ArrayList<Integer> a, int size) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_d1b1e160_5634_45db_b2bf_426279e34dd4(ArrayList<Integer> a, int size) {
        int maxSum = 0;

        // Loop through the array and find the largest subarray sum.
        for (int start = 0; start < a.size() - size; start += size) {
            int curSum = 0;
            for (int i = start; i < start + size; i++) {
                curSum += a.get(i);
            }

            maxSum = Math.max(curSum, maxSum);
        }

        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_cd4d22bd_5523_49d6_83f2_7b5c7618866d(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_72e48a82_8190_4dc5_850d_d4ce1c4070f0(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_a161010a_8393_4adb_bea4_0ad9a970a867(ArrayList<Integer> a, int size) {
        ArrayList<Integer> subArray = new ArrayList<Integer>();
        // write your code here
        return 0;
    }

    
    public static int maxSubArraySum_Problem_2_c327d25d_a7e1_4d58_8273_60c4ec352272(ArrayList<Integer> a, int size) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int sum1 = Integer.MIN_VALUE;
        int sum2 = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if (sum > max && sum <= size) {
                max = sum;
                sum1 = sum;
                sum2 = 0;
            }
            if (sum < sum1) {
                sum1 = sum;
                sum2 = 0;
            }
            sum2 += a.get(i);
        }
        if (sum > max) {
            max = sum;
            sum1 = sum;
            sum2 = 0;
        }
        if (sum1 < sum2) {
            sum1 = sum2;
            sum2 = 0;
        }
        return max;
    }

    
    public static int maxSubArraySum_Problem_2_ac637b20_5c5a_4cfe_825b_f6446d70c044(ArrayList<Integer> a, int size) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_dcdea64f_9a19_4f70_be91_9088f069cb0a(ArrayList<Integer> a, int size) {
        ArrayList <Integer> sumArray = new ArrayList<>(); 
        int maxSum = Integer.MIN_VALUE;
        ArrayList <Integer> sumArray2 = new ArrayList<>();
        
        for(int i=0; i<a.size(); i++){
            sumArray.add(new Integer(a.get(i)));
            sumArray2.add(sumArray.get(i) + a.get(i));
            
            if(maxSum < sumArray2.get(i)){
                maxSum = sumArray2.get(i);
            }
        }
        
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_7f4515c0_a61b_4330_9894_f3b822d75eed(ArrayList<Integer> a, int size) {
        if (size == 0) return 0;
        ArrayList<Integer> subArray = new ArrayList<>();
        int maxSum = a.get(0); // Store the max sum for the first subarray
        for (int i = 0; i < a.size() - 1; i++) {
            int newSum = a.size() - i - 1;
            subArray.add(newSum);
            if (newSum > maxSum) {
                maxSum = newSum;
            }
        }
        int j = 1;
        while (j < a.size()) {
            int newSum = a.get(j);
            if (subArray.contains(newSum)) {
                continue;
            }
            subArray.add(newSum);
            if (newSum > maxSum) {
                maxSum = newSum;
            }
            j++;
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_cb60731e_21c1_461f_9a4d_eacfb6df3f01(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);

        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_c81e3c29_06e4_41b7_b4a4_4ef6a9d3444a(ArrayList<Integer> a, int size) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_09606517_7b98_42bc_8010_478a30078c3d(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_b968d794_6824_4c4f_a335_516348dadaf2(ArrayList<Integer> a, int size) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_872f323f_2993_4c09_9f6a_35d746ae9c71(ArrayList<Integer> a, int size) {
        int sum = 0;
        for(int i = 0; i< size; i++){
            sum = sum + a.get(i);
            if( sum > 0 ){
                break;
            }
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_2_5368d60b_3e56_4014_ad48_574d03f2ae4f(ArrayList<Integer> a, int size) {
        int max = a.get(0), sum = 0;
        for (int i = 1; i < a.size(); i++) {
            sum += a.get(i);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSubArraySum_Problem_2_44f2fb21_1d6d_4fff_8c16_06356ff9e230(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);

        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_f1ad2e2c_6ee3_4b2a_800b_9ca66a5c3f94(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_443cd702_121b_4b06_8e24_8cc3d589578e(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_f52e7101_9d6b_46ba_ad31_bc33f74d0f80(ArrayList<Integer> a, int size) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_010b64aa_fee3_4b00_a4a4_cec805344556(ArrayList<Integer> a, int size) {
        int ans = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            int subsum = 0;
            int j = 0;
            for (int k = 0; k <= i; k++) {
                subsum += a.get(k);
                if (subsum > ans) {
                    ans = subsum;
                }
            }
        }
        return ans;
    }

    
    public static int maxSubArraySum_Problem_2_72e48a82_8190_4dc5_850d_d4ce1c4070f0(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_89e407d2_fb7c_4b2f_be65_97f9ecb7f4ad(ArrayList<Integer> a, int size) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_d1111f74_4694_4ccf_9a9c_507c25c1ac60(ArrayList<Integer> a, int size) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_2d7ceaaa_c0a5_4f02_879b_4f77aa1f3ab7(ArrayList<Integer> a, int size) {
        int maxSum = -1000000000;
        int maxSumOfSubArray = 0;
        int subArraySum = 0;
        int sum = 0;
        int n = a.size();
        
        
        for(int i = 0; i < n; i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        
        for(int i = 0; i < n; i++) {
            sum = 0;
            for(int j = 0; j < i; j++) {
                sum += a.get(j);
            }
            sum += a.get(i);
            if(sum > maxSum) {
                maxSumOfSubArray = sum;
            }
            
        }
        
        
        
        return maxSumOfSubArray;
    }

    
    public static int maxSubArraySum_Problem_2_ff8fd64e_a6ff_404d_bfe8_7671c605cd3c(ArrayList<Integer> a, int size) {
        int max = a.get(0);
        int sum = a.get(0);

        for(int i = 1; i < a.size(); i++) {
            if(a.get(i) > max) {
                sum = a.get(i);
                max = a.get(i);
            }
            else {
                sum += a.get(i);
            }
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_1_bb576f6a_1fbb_4a75_bc08_e0bf94baaac6(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_61e27a72_f4fa_4853_840e_8dbcded7ab39(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        for(int i = 0; i < a.size(); i++) {
            sum -= a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_74bffb82_defd_4ac0_bda4_466d524de48e(ArrayList<Integer> a, int size) {
        int max_sum = 0;
        
        int start = 0;
        
        while (start < size) {
            
            int j = start;
            int sum = 0;
            
            while (j < size && a.get(j) < size) {
                
                sum += a.get(j++);
            }
            
            int current_max = Math.max(sum, max_sum);
            
            if (sum > max_sum) {
                
                max_sum = sum;
                
                start = j;
                
            }
        }
        
        return max_sum;
    }

    
    public static int maxSubArraySum_Problem_2_f4e7c7f2_2beb_4428_b946_4ec0dae33998(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);

        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_fe21dbdc_e14b_4af8_9f3f_834a935b7959(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_ac637b20_5c5a_4cfe_825b_f6446d70c044(ArrayList<Integer> a, int size) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_6f438827_128c_4843_aeed_12140b5f2d71(ArrayList<Integer> a, int size) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int maxSumIndex = 0;
        int currentSum = 0;
        int currentSumIndex = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentSumIndex = 0;
            for(int j = i; j < a.size(); j++) {
                currentSum += a.get(j);
                currentSumIndex++;
                if(currentSumIndex == size) {
                    sum += currentSum;
                    if(sum > maxSum) {
                        maxSum = sum;
                        maxSumIndex = currentSumIndex;
                    }
                    currentSum = 0;
                    currentSumIndex = 0;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_4910a41e_e770_4093_a56e_b3817c60affd(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int maxStart = 0;
        int maxEnd = 0;
        int maxSumOfSubArray = 0;
        int currentSum = 0;
        int currentStart = 0;
        int currentEnd = 0;
        int currentSumOfSubArray = 0;
        int currentMaxSum = 0;
        int currentMaxStart = 0;
        int currentMaxEnd = 0;
        int currentMaxSumOfSubArray = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentStart = i;
            currentEnd = i + 1;
            currentSumOfSubArray = currentSum;
            currentMaxSum = currentSum;
            currentMaxStart = currentStart;
            currentMaxEnd = currentEnd;
            currentMaxSumOfSubArray = currentSumOfSubArray;
            for(int j = i + 1; j < a.size(); j++) {
                currentSum = a.get(j);
                currentStart = j;
                currentEnd = j + 1;
                currentSumOfSubArray = currentSum;
                currentMaxSum = currentSum;
                currentMaxStart = currentStart;
                currentMaxEnd = currentEnd;
                currentMaxSumOfSubArray = currentSumOfSubArray;
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                    maxStart = currentStart;
                    maxEnd = currentEnd;
                    maxSumOfSubArray = currentSumOfSubArray;
                }
                if(currentSum > maxSumOfSubArray) {
                    maxSumOfSubArray = currentSumOfSubArray;
                    maxStart = currentStart;
                    maxEnd = currentEnd;
                    maxSumOfSubArray = currentSumOfSubArray;
                }
            }
        }
        sum = maxSum;
        maxStart = maxStart;
        maxEnd = maxEnd;
        maxSumOfSubArray = maxSumOfSubArray;
        return sum;
    }

    
    public static int maxSubArraySum_Problem_2_eb7528fa_ddd4_463c_ae4e_099e7cfb1493(ArrayList<Integer> a, int size) {
        int maxSum = 0;
        int sum = 0;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_e40d1086_12f9_4986_b61b_7afeff946f0f(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_c052b367_444f_4d20_ac10_7f5b3bd74674(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_76a33f6d_f41f_4693_802d_ec06269b64dc(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_6aa02966_2840_47b2_af33_e29d32cbc489(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_bf3381b0_80fd_49e6_bbd0_249f961e14ee(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int maxSumIndex = 0;
        int maxSumSize = 0;
        for(int i = 0; i < a.size(); i++) {
            sum = 0;
            for(int j = i; j < a.size(); j++) {
                sum += a.get(j);
                if(sum > maxSum) {
                    maxSum = sum;
                    maxSumIndex = i;
                    maxSumSize = j - i;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_50ab38a3_8fcd_4d06_a644_1c99de2fab24(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);

        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_22cf3d75_d908_4061_8f8a_ff0cafb4ecfb(ArrayList<Integer> a, int size) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_c327d25d_a7e1_4d58_8273_60c4ec352272(ArrayList<Integer> a, int size) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int sum1 = Integer.MIN_VALUE;
        int sum2 = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if (sum > max && sum <= size) {
                max = sum;
                sum1 = sum;
                sum2 = 0;
            }
            if (sum < sum1) {
                sum1 = sum;
                sum2 = 0;
            }
            sum2 += a.get(i);
        }
        if (sum > max) {
            max = sum;
            sum1 = sum;
            sum2 = 0;
        }
        if (sum1 < sum2) {
            sum1 = sum2;
            sum2 = 0;
        }
        return max;
    }

    
    public static int maxSubArraySum_Problem_1_8594a440_100e_4639_a806_abae28101da1(ArrayList<Integer> a, int size) {
        int sum = 0, max = 0, temp = 0;
        int N = a.size();
        int last = 0;
        for(int i = 0; i < N; i++) {
            sum = sum + a.get(i);
            if(sum > size) {
                max = temp;
                temp = 0;
            } else {
                if(sum > max) {
                    max = sum;
                }
                temp += a.get(i);
            }
        }
        return max;
    }

    
    public static int maxSubArraySum_Problem_1_c9a2e2d9_2352_46b8_8ec4_be1e84eedd7f(ArrayList<Integer> a, int size) {
        int sum = 0;
        int largest = 0;
        int sumOfSubArrays = 0;

        for (int i = 0; i < a.size(); i++) {
            int currentSum = a.get(i);

            // add current sum to sum
            sum += currentSum;

            // check if current sum is greater than largest so far
            if (sum > largest) {
                // reset largest and sum
                largest = sum;
            }
            sumOfSubArrays += currentSum;

            // check if sum is same as largest sum
            if (sum == largest) {
                // reset the sum
                sumOfSubArrays = 0;
            }
        }

        // return sum
        return sumOfSubArrays;
    }

    
    public static int maxSubArraySum_Problem_1_c70cbc96_ad88_4658_a81f_703151eeb31d(ArrayList<Integer> a, int size) {
        int sum = 0;
        for(int i=0;i<a.size();i++) {
            int left = a.get(i);
            for(int j=i;j<a.size();j++) {
                int right = a.get(j);
                if (left > right) {
                    sum = sum + right - left + 1;
                    i = j;
                } else {
                    sum = sum + right - left + 1;
                }
            }
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_2_4b14dfa9_bc3d_455f_920b_73e3d45cf3c4(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_e40d1086_12f9_4986_b61b_7afeff946f0f(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_5c053a5b_17f0_4b55_99a9_93d1fdb6771a(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_713547b4_9cef_45d9_a84b_fb538a41f0d0(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_9d4b98be_9ebc_4600_853f_3dfc8fa0365e(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int maxSumIndex = 0;
        for(int i = 0; i < a.size(); i++) {
            sum = 0;
            for(int j = i; j < a.size(); j++) {
                sum += a.get(j);
                if(sum > maxSum) {
                    maxSum = sum;
                    maxSumIndex = j;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_2bc073a3_18ec_4689_9f9a_5590018c5029(ArrayList<Integer> a, int size) {
        int sum = 0;
        int max = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            sum += a.get(i);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSubArraySum_Problem_2_4995aa39_7015_499d_9db2_76da0c0dfa47(ArrayList<Integer> a, int size) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_76143100_be18_4b6c_af90_da68b350246b(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0), max_ending_here = a.get(0);
        for (int i = 1; i < size; i++) {
            max_ending_here = Math.max(a.get(i), max_ending_here + a.get(i));
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_b1bd8b8a_a692_468d_9272_efbf8faa5996(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int maxSumIndex = 0;
        int currentSum = 0;
        int currentMaxSum = 0;
        int currentMaxSumIndex = 0;
        int currentIndex = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentMaxSum = currentSum;
            currentMaxSumIndex = i;
            currentIndex = 1;
            for(int j = i + 1; j < a.size(); j++) {
                currentSum = a.get(j);
                if(currentSum > currentMaxSum) {
                    currentMaxSum = currentSum;
                    currentMaxSumIndex = j;
                }
                currentIndex++;
            }
            sum += currentMaxSum;
            if(sum > maxSum) {
                maxSum = sum;
                maxSumIndex = currentMaxSumIndex;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_04614151_526f_4b64_8379_caf2cd459b57(ArrayList<Integer> a, int size) {
        // TODO Write your Java program here.
        // Find sum of all elements in a given subarray
        int sum = 0;
        int maxSum = -999999;
        List<Integer> a1 = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            if (i == size - 1) {
                a1.add(a.get(i));
            }
            else {
                a1.add(a.get(i) + a.get(i + 1));
            }
            sum += a1.get(i);
            if (sum > maxSum) {
                maxSum = sum;
            }
            sum = 0;
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_3193144a_d6d6_4506_bc02_088a8a6af511(ArrayList<Integer> a, int size) {
        int maxSum = 0, currSum = 0;
        int n = a.size();
        for(int i=0; i<n; i++) {
            currSum += a.get(i);
            if(currSum > maxSum) {
                maxSum = currSum;
            } else if(currSum == maxSum) {
                maxSum += a.get(i);
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_d56da683_4fd8_4548_af45_6065b0bd3ecb(ArrayList<Integer> a, int size) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_c7eefa5d_3fcc_4190_a154_081711bf4039(ArrayList<Integer> a, int size) {
        int max_so_far = 0;
        int max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_1d9ed8d7_6931_4f64_bad8_6f919596b3c4(ArrayList<Integer> a, int size) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_d4987a5f_647f_43d1_93f1_219ccf07ddce(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int currentSum = 0;
        int currentMaxSum = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentMaxSum = currentSum;
            for(int j = i; j < a.size(); j++) {
                currentSum = currentSum + a.get(j);
                if(currentSum > currentMaxSum) {
                    currentMaxSum = currentSum;
                }
            }
            sum += currentMaxSum;
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_9794c508_e00e_4ba5_b10b_5bb353481b1e(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_b2750a56_3170_4e64_a09b_9e9ed9f3d480(ArrayList<Integer> a, int size) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_f3f3905f_2978_45a0_9efe_7210f4429aa8(ArrayList<Integer> a, int size) {
        int max_sub_sum = 0;
        
        int i = 0;
        int j = 0;
        int k = 0;
        int n = a.size();
        int sum = 0;
        
        while(i < n && j < n) {
            sum += a.get(j);
            while(i < n && j < n && sum > size) {
                sum -= a.get(i);
                i++;
            }
            if(sum > max_sub_sum) {
                max_sub_sum = sum;
                k = j;
            }
            while(j < n && sum < size) {
                sum += a.get(j);
                j++;
            }
            i++;
        }
        return max_sub_sum;
    }

    
    public static int maxSubArraySum_Problem_1_ff8fd64e_a6ff_404d_bfe8_7671c605cd3c(ArrayList<Integer> a, int size) {
        int max = a.get(0);
        int sum = a.get(0);

        for(int i = 1; i < a.size(); i++) {
            if(a.get(i) > max) {
                sum = a.get(i);
                max = a.get(i);
            }
            else {
                sum += a.get(i);
            }
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_2_9500d0d4_8d15_41e3_9f77_44c97197a24d(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_00a50f4c_9179_4351_a5c4_14ab58600937(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_b4cb0514_a43d_445e_a526_9e763a03edec(ArrayList<Integer> a, int size) {
        return a.stream()
                .mapToInteger(i -> i)
                .sum() 
                + 
                a.stream()
                .mapToInteger(i -> i)
                .skip(size-1)
                .sum();
    }

    
    public static int maxSubArraySum_Problem_1_2c629c5d_7858_439a_8882_2b4054a4e836(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int maxSumIndex = 0;
        int currentSum = 0;
        int currentSumIndex = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentSumIndex = 0;
            for(int j = i; j < a.size(); j++) {
                currentSum += a.get(j);
                currentSumIndex++;
                if(currentSumIndex == size) {
                    sum += currentSum;
                    if(sum > maxSum) {
                        maxSum = sum;
                        maxSumIndex = currentSumIndex;
                    }
                    currentSum = 0;
                    currentSumIndex = 0;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_497a6a6f_1e18_408b_a7e9_fea3a5618db1(ArrayList<Integer> a, int size) {
        int sum = 0;
        int currentSum = 0;
        int j = 0;
        for (int i = 0; i < a.size(); i++) {
            if (j == i) {
                sum += a.get(j);
            } else {
                currentSum += a.get(j);
                if (currentSum > sum) {
                    sum = currentSum;
                }
                currentSum = 0;
                j++;
            }
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_2_ecc20298_61f6_4f43_bc1f_9a2caab54e81(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_e2960d5c_ee99_4452_8711_5ef282746dd5(ArrayList<Integer> a, int size) {
        int max = -Integer.MAX_VALUE;
        int sum = 0;
        int idx = 0, start, end;
        for(int i = 1; i < a.size(); i++) {
            if(a.get(i - 1) > a.get(i)) {
                start = idx;
                end = i - 1;
                while(end <= size && a.get(end) > a.get(end+1)) {
                    end += 1;
                }
                while(start <= end && a.get(start) > a.get(start + 1)) {
                    start += 1;
                }
                sum = sum + a.get(start);
                if(max < sum) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSubArraySum_Problem_1_5b95f689_1f26_4431_9d5d_61a724ebf1f0(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_3824856d_d82e_431d_8d69_9f26db938b32(ArrayList<Integer> a, int size) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_91257189_69fa_4d92_935a_953cd2bb2f80(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;

        // Loop through the array
        for (int i = 0; i <= a.size(); i++) {

            // If the current index is greater than or equal to the index
            // of subarray then sum will contain the sum of the subarray
            int currentSum = sum;

            if (i >= size && sum >= maxSum) {
                // Stop searching for the sum
                sum = maxSum;
            } else {
                // Loop through the array list
                for (int j = 1; j <= i; j++) {
                    sum += a.get(j);
                    // If the current index is equal to the index
                    // of subarray then the current sum will be the sum
                    // of the subarray
                    if (sum == currentSum) {
                        sum = 0;
                        break;
                    }
                }

                // If sum is greater than the max sum then store the max
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_2cd4cd56_5fe4_49a8_863e_c7c4ff0f0bdf(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_53340475_575d_4517_8ff4_b0b177a26c4c(ArrayList<Integer> a, int size) {
        int k = 0;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += a.get(k);
            if (a.get(i + 1) > sum) {
                sum += a.get(i + 1);
            }
            k = i;
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_1_8a80ee54_3cad_40f8_8a32_f1eac3ba7745(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int currentSum = 0;
        int currentMaxSum = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentMaxSum = currentSum;
            for(int j = i; j < a.size(); j++) {
                currentSum = currentSum + a.get(j);
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_22cf3d75_d908_4061_8f8a_ff0cafb4ecfb(ArrayList<Integer> a, int size) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_23cd3655_38e3_4048_b6df_bf01065477df(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_b1bd8b8a_a692_468d_9272_efbf8faa5996(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int maxSumIndex = 0;
        int currentSum = 0;
        int currentMaxSum = 0;
        int currentMaxSumIndex = 0;
        int currentIndex = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentMaxSum = currentSum;
            currentMaxSumIndex = i;
            currentIndex = 1;
            for(int j = i + 1; j < a.size(); j++) {
                currentSum = a.get(j);
                if(currentSum > currentMaxSum) {
                    currentMaxSum = currentSum;
                    currentMaxSumIndex = j;
                }
                currentIndex++;
            }
            sum += currentMaxSum;
            if(sum > maxSum) {
                maxSum = sum;
                maxSumIndex = currentMaxSumIndex;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_1adcaaac_6b80_4377_9790_da001e3154e2(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_a61ee5c3_52a7_4fe4_9d5b_425cba9ecda3(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_0dbc3b6e_7369_4dd1_9b8f_c2491e6f7cd8(ArrayList<Integer> a, int size) {
        int maxSum = 0;
        int sum = 0;
        int currentSum = 0;
        int currentMaxSum = 0;
        int currentMaxSumIndex = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentMaxSum = currentSum;
            currentMaxSumIndex = i;
            for(int j = i + 1; j < a.size(); j++) {
                currentSum = currentSum + a.get(j);
                if(currentSum > currentMaxSum) {
                    currentMaxSum = currentSum;
                    currentMaxSumIndex = j;
                }
            }
            sum += currentMaxSum;
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_371e067f_8ede_4de7_ad00_06383342081a(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_9d4b98be_9ebc_4600_853f_3dfc8fa0365e(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int maxSumIndex = 0;
        for(int i = 0; i < a.size(); i++) {
            sum = 0;
            for(int j = i; j < a.size(); j++) {
                sum += a.get(j);
                if(sum > maxSum) {
                    maxSum = sum;
                    maxSumIndex = j;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_2d7ceaaa_c0a5_4f02_879b_4f77aa1f3ab7(ArrayList<Integer> a, int size) {
        int maxSum = -1000000000;
        int maxSumOfSubArray = 0;
        int subArraySum = 0;
        int sum = 0;
        int n = a.size();
        
        
        for(int i = 0; i < n; i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        
        for(int i = 0; i < n; i++) {
            sum = 0;
            for(int j = 0; j < i; j++) {
                sum += a.get(j);
            }
            sum += a.get(i);
            if(sum > maxSum) {
                maxSumOfSubArray = sum;
            }
            
        }
        
        
        
        return maxSumOfSubArray;
    }

    
    public static int maxSubArraySum_Problem_1_4a662f28_40d5_474e_87f3_56287f8f12d1(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int currentSum = 0;
        int currentMaxSum = 0;
        int currentStart = 0;
        int currentEnd = 0;
        int currentMaxStart = 0;
        int currentMaxEnd = 0;
        for(int i = 0; i < a.size(); i++) {
            currentStart = i;
            currentEnd = i;
            currentSum = a.get(i);
            currentMaxStart = i;
            currentMaxEnd = i;
            currentMaxSum = a.get(i);
            for(int j = i + 1; j < a.size(); j++) {
                currentEnd = j;
                currentSum = a.get(j);
                if(currentSum > currentMaxSum) {
                    currentMaxStart = currentStart;
                    currentMaxEnd = currentEnd;
                    currentMaxSum = currentSum;
                }
            }
            sum += currentSum;
            if(currentMaxSum > maxSum) {
                maxSum = currentMaxSum;
            }
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_2_be27a80c_ac08_46df_84d3_69f6fa7fc13a(ArrayList<Integer> a, int size) {
        ArrayList<Integer> subArrays = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        int subArraySum = 0;
        // Write your code here
        for (int i = 0; i < a.size(); i++) {
            if (subArraySum < a.get(i)) {
                subArraySum = a.get(i);
                subArrays.add(i, a.get(i));
                temp.add(0, a.get(i));
            }
            else {
                subArraySum -= a.get(i);
                temp.add(a.get(i));
            }
        }
        Collections.sort(temp);
        subArrays.add(subArrays.size() - 1, subArraySum);
        Collections.sort(subArrays);
        return subArrays.get((subArrays.size() - 1));
    }

    
    public static int maxSubArraySum_Problem_1_550d3dca_ca33_4716_aea4_556d24892ffe(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int maxSumIndex = 0;
        int maxSumSize = 0;
        int maxSumSizeIndex = 0;
        for(int i = 0; i < a.size(); i++) {
            int currentSum = 0;
            for(int j = i; j < a.size(); j++) {
                currentSum += a.get(j);
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                    maxSumIndex = i;
                    maxSumSize = j - i;
                    maxSumSizeIndex = j;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_eef75969_9bde_4356_9374_de039f2dea7f(ArrayList<Integer> a, int size) {
        if(size == 0)
            return 0;
        int leftSum = 0, rightSum = 0;
        int sum = Integer.MIN_VALUE;
        for(int i = 0; i < size - 1; i++) {
            leftSum += a.get(i);
            rightSum = leftSum + a.get(i + 1);
            sum += Math.max(leftSum, rightSum);
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_1_08ec3311_2633_49c1_a3bb_d92edbbd50c3(ArrayList<Integer> a, int size) {
        int maxSum = 0;
        int left = 0;
        int right = 0;
        int sum = 0;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum >= size) {
                right++;
                sum += size - a.get(i);
            } else {
                left = i;
                break;
            }
        }
        while(left < right) {
            sum += a.get(left);
            left++;
            sum += a.get(right);
            right++;
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_800d4ed8_7bca_4661_ab71_f0ff8c87e60a(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);

        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_e50011de_c9f5_414c_a3d4_870dfb84ef32(ArrayList<Integer> a, int size) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_3d23bdfb_5d74_4288_a3f0_944a9dadcb77(ArrayList<Integer> a, int size) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += a.get(i);
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSubArraySum_Problem_1_4032c2d6_edc1_4de9_9982_2b9def1e726b(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int currentSum = 0;
        int currentMaxSum = 0;
        int currentStart = 0;
        int currentEnd = 0;
        int currentMaxStart = 0;
        int currentMaxEnd = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentMaxSum = currentSum;
            currentStart = i;
            currentEnd = i;
            currentMaxStart = i;
            currentMaxEnd = i;
            for(int j = i + 1; j < a.size(); j++) {
                currentSum = a.get(j);
                currentMaxSum = Math.max(currentMaxSum, currentSum);
                currentStart = Math.min(currentStart, j);
                currentEnd = Math.max(currentEnd, j);
                currentMaxStart = Math.min(currentMaxStart, j);
                currentMaxEnd = Math.max(currentMaxEnd, j);
            }
            sum = sum + currentMaxSum;
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_79f36553_6e99_448d_b4fb_d46ad67c32eb(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int maxSumIndex = 0;
        int maxSumSize = 0;
        for(int i = 0; i < a.size(); i++) {
            sum = 0;
            for(int j = i; j < a.size(); j++) {
                sum += a.get(j);
                if(sum > maxSum) {
                    maxSum = sum;
                    maxSumIndex = j;
                    maxSumSize = a.get(j);
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_9045069d_2010_4d58_8cff_2a26def02c77(ArrayList<Integer> a, int size) {
        // Your Code Here
        int maxSum = 0, sum = 0;
        for(int i = 0; i < size; i++) {
            sum = 0;
            for(int j = i; j < size; j++) {
                if(i == j) {
                    sum += a.get(j);
                    sum -= a.get(j + 1);
                } else {
                    sum += a.get(j);
                }
            }
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_8e00e353_9f91_4543_9eee_6874dbc22a42(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int maxSumIndex = 0;
        int currentSum = 0;
        int currentSumIndex = 0;
        int currentMaxSum = Integer.MIN_VALUE;
        int currentMaxSumIndex = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentSumIndex = 0;
            currentMaxSum = Integer.MIN_VALUE;
            currentMaxSumIndex = 0;
            for(int j = i; j < a.size(); j++) {
                currentSum = a.get(j);
                currentSumIndex++;
                currentMaxSum = Math.max(currentSum, currentMaxSum);
                currentMaxSumIndex = j;
            }
            sum += currentSum;
            if(currentSumIndex == size) {
                if(currentMaxSum == maxSum) {
                    maxSumIndex = i;
                    maxSum = currentSum;
                }
                currentSum = 0;
                currentSumIndex = 0;
                currentMaxSum = Integer.MIN_VALUE;
                currentMaxSumIndex = 0;
            }
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_2_0f419290_dbba_450e_9c01_7f34792cfc48(ArrayList<Integer> a, int size) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_ebc83234_094c_4edd_8793_6ed12e82fe2b(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int currentMaxSum = Integer.MIN_VALUE;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentMaxSum = currentSum;
            for(int j = i; j < a.size(); j++) {
                currentSum += a.get(j);
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_8a80ee54_3cad_40f8_8a32_f1eac3ba7745(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int currentSum = 0;
        int currentMaxSum = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentMaxSum = currentSum;
            for(int j = i; j < a.size(); j++) {
                currentSum = currentSum + a.get(j);
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_8ef1b3cb_aa20_47ef_a7a7_51f8f5f3f6ea(ArrayList<Integer> a, int size) {
        // Write your answer here
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i : a) {
            if(i > max) {
                max = i;
                sum = 0;
            }
            sum += i;
            if(sum == size) {
                return max;
            }
        }
        return -1;
    }

    
    public static int maxSubArraySum_Problem_1_e718c631_64c1_4410_aa7b_050ca51c70b1(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_f3f3905f_2978_45a0_9efe_7210f4429aa8(ArrayList<Integer> a, int size) {
        int max_sub_sum = 0;
        
        int i = 0;
        int j = 0;
        int k = 0;
        int n = a.size();
        int sum = 0;
        
        while(i < n && j < n) {
            sum += a.get(j);
            while(i < n && j < n && sum > size) {
                sum -= a.get(i);
                i++;
            }
            if(sum > max_sub_sum) {
                max_sub_sum = sum;
                k = j;
            }
            while(j < n && sum < size) {
                sum += a.get(j);
                j++;
            }
            i++;
        }
        return max_sub_sum;
    }

    
    public static int maxSubArraySum_Problem_2_24c15fe6_d105_4b79_b850_9b02c2c89b27(ArrayList<Integer> a, int size) {
        // Fill this in.
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                sum = sum + a.get(j);
            }
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_2_796bb559_884e_4864_b04a_dcbc10e63d61(ArrayList<Integer> a, int size) {
        int maxSum = 0;
        // Write your code here.
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_9045069d_2010_4d58_8cff_2a26def02c77(ArrayList<Integer> a, int size) {
        // Your Code Here
        int maxSum = 0, sum = 0;
        for(int i = 0; i < size; i++) {
            sum = 0;
            for(int j = i; j < size; j++) {
                if(i == j) {
                    sum += a.get(j);
                    sum -= a.get(j + 1);
                } else {
                    sum += a.get(j);
                }
            }
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_a3d51d0a_ab17_4d13_9e2c_fd1ffe53b8da(ArrayList<Integer> a, int size) {
        // TODO Auto-generated method stub
        return 0;
    }

    
    public static int maxSubArraySum_Problem_1_314d724e_85c3_4693_a991_49dd2378d417(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_4deac98e_5387_458e_af33_ec5087cf12a7(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_9dc87496_19a9_4b0e_a71f_1dd6cfefea5d(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int currentMaxSum = Integer.MIN_VALUE;
        int currentMaxSumIndex = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentMaxSum = currentSum;
            currentMaxSumIndex = i;
            for(int j = i; j < a.size(); j++) {
                currentSum = currentSum + a.get(j);
                if(currentSum > currentMaxSum) {
                    currentMaxSum = currentSum;
                    currentMaxSumIndex = j;
                }
            }
            sum += currentMaxSum;
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_37184106_fc79_4cd9_8a5f_dbaa1189f0df(ArrayList<Integer> a, int size) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_eb7528fa_ddd4_463c_ae4e_099e7cfb1493(ArrayList<Integer> a, int size) {
        int maxSum = 0;
        int sum = 0;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_569a265a_c004_400f_94c2_c194596fb24f(ArrayList<Integer> a, int size) {
        int maxSum = 0;
        int sum = 0;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_be27a80c_ac08_46df_84d3_69f6fa7fc13a(ArrayList<Integer> a, int size) {
        ArrayList<Integer> subArrays = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        int subArraySum = 0;
        // Write your code here
        for (int i = 0; i < a.size(); i++) {
            if (subArraySum < a.get(i)) {
                subArraySum = a.get(i);
                subArrays.add(i, a.get(i));
                temp.add(0, a.get(i));
            }
            else {
                subArraySum -= a.get(i);
                temp.add(a.get(i));
            }
        }
        Collections.sort(temp);
        subArrays.add(subArrays.size() - 1, subArraySum);
        Collections.sort(subArrays);
        return subArrays.get((subArrays.size() - 1));
    }

    
    public static int maxSubArraySum_Problem_2_424d8ff6_db99_4e3e_8932_9b2d2f3fe5ed(ArrayList<Integer> a, int size) {
        int start = 0,end = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<a.size(); i++){
            if (start==0) {
                start = a.get(i);
                end = a.get(i);
            }
            else if (end + 1 == size) {
                end = a.get(i);
            }
            else if (end + 1 < size) {
                end = a.get(i);
            }
            else{
                end = start + 1;
            }
            if (end == max) {
                max = Math.max(max, start+end);
            }
        }
        return max;
    }

    
    public static int maxSubArraySum_Problem_2_5c053a5b_17f0_4b55_99a9_93d1fdb6771a(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_d77401e4_c903_481f_8321_e568689fc103(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_795fb164_6d04_4d2d_9777_38d8f5acf404(ArrayList<Integer> a, int size) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_c758373f_b074_42ad_96b3_48cd577fdc1e(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_13c9acd7_86f8_4299_9888_b92e821ab28c(ArrayList<Integer> a, int size) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_47ac0bf9_c621_4c77_aa20_d72bb104adc5(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);

        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_2d374da8_a97f_4538_915e_a478d4b491c2(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);

        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_cb3234bb_8439_4343_8209_6649a0defc2a(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_f8370099_3b3c_49fc_b184_b70659d1db65(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_33aaee05_be55_4508_977c_bd2b0f5db451(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_4cfa8558_664b_4072_98ca_fa10b475c58d(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_dcfeec8c_63e0_4167_ab0b_31f4d8dead5d(ArrayList<Integer> a, int size) {
        int n = a.size();
        int i = 0;
        int j = 0;
        int sum = 0;
        int k = 0;
        while (j < n) {
            int count = 0;
            while (j < n && k < n) {
                if (j < n && a.get(j) >= a.get(k)) {
                    count += 1;
                    j++;
                }
                else {
                    count += 1;
                    k++;
                }
            }
            if (count == 2) {
                sum += a.get(j);
                j++;
            }
            else if (count > 2) {
                sum = sum + a.get(j);
                j++;
                k++;
            }
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_2_75039500_edc5_4d2f_ac42_ce466c8b1d35(ArrayList<Integer> a, int size) {
        int maxSum = 0, sum = 0;
        for(int i = 0; i < size; i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_1adcaaac_6b80_4377_9790_da001e3154e2(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_83a3654e_ef01_41e5_a297_bb8183ee1655(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int currentMaxSum = Integer.MIN_VALUE;
        int currentStart = 0;
        int currentEnd = 0;
        for(int i = 0; i < a.size(); i++) {
            currentStart = i;
            currentEnd = i;
            currentSum = a.get(i);
            currentMaxSum = currentSum;
            for(int j = i; j < a.size(); j++) {
                currentEnd = j;
                currentSum = a.get(j);
                currentMaxSum = Math.max(currentMaxSum, currentSum);
                if(currentMaxSum > maxSum) {
                    maxSum = currentMaxSum;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_4ab1ccb5_3863_49f0_9a7a_69bbd587191e(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_d36e3416_0b80_4bc7_b5a9_aeef02c66b7f(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        for(int i = 0; i < a.size(); i++) {
            sum -= a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_b217cd47_3ffa_4ec5_9977_ce03f534ea42(ArrayList<Integer> a, int size) {
        int sum = 0;
        int index = 0;
        while (index < a.size() - 1) {
            sum = sum + a.get(index + 1);
            if (sum > size) {
                return sum;
            }
            index++;
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_1_46aad140_d5d6_42f1_8c90_543e19fcfcb0(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_44f2fb21_1d6d_4fff_8c16_06356ff9e230(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);

        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_5026a2f4_632f_4363_8d08_a8ca3b802716(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int maxStart = 0;
        int maxEnd = 0;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
                maxStart = i;
                maxEnd = i;
            }
            else if(sum == maxSum) {
                maxEnd = i;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_9c8ba9c5_e75e_47e1_823d_f21eb4eccd16(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_448cb0c8_7f93_480e_bf03_1eca6e66e412(ArrayList<Integer> a, int size) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int maxSum = 0;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > max) {
                max = sum;
                maxSum = sum;
            }
            sum -= a.get(i);
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_0f419290_dbba_450e_9c01_7f34792cfc48(ArrayList<Integer> a, int size) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_83a3654e_ef01_41e5_a297_bb8183ee1655(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int currentMaxSum = Integer.MIN_VALUE;
        int currentStart = 0;
        int currentEnd = 0;
        for(int i = 0; i < a.size(); i++) {
            currentStart = i;
            currentEnd = i;
            currentSum = a.get(i);
            currentMaxSum = currentSum;
            for(int j = i; j < a.size(); j++) {
                currentEnd = j;
                currentSum = a.get(j);
                currentMaxSum = Math.max(currentMaxSum, currentSum);
                if(currentMaxSum > maxSum) {
                    maxSum = currentMaxSum;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_57e90b37_8cdb_4958_a160_18e6851281fe(ArrayList<Integer> a, int size) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_2bf79f39_0e69_4ab2_8c97_f19ea28e42c4(ArrayList<Integer> a, int size) {
        if (size == 0) {
            return 0;
        }
        int max = a.get(0);
        int sum = 0;
        for (int i = 1; i < a.size(); i++) {
            sum = a.get(i);
            if (sum > max) {
                max = sum;
            }
        }
        for (int i = 0; i < a.size(); i++) {
            sum = a.get(i);
            if (sum > max) {
                max = sum;
            }
            if (sum > max) {
                sum -= max;
                max = 0;
            }
        }
        sum -= max;
        return sum;
    }

    
    public static int maxSubArraySum_Problem_2_56e5e6d1_7ac2_4f85_9dc7_da83e9fba7dd(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_f2a3e01c_8e45_4771_9c47_e5b62ef6ce7f(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int currentSum = 0;
        int currentMaxSum = 0;
        int currentMaxSumIndex = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentMaxSum = currentSum;
            currentMaxSumIndex = i;
            for(int j = i + 1; j < a.size(); j++) {
                currentSum = a.get(j);
                if(currentSum > currentMaxSum) {
                    currentMaxSum = currentSum;
                    currentMaxSumIndex = j;
                }
            }
            sum += currentMaxSum;
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_53340475_575d_4517_8ff4_b0b177a26c4c(ArrayList<Integer> a, int size) {
        int k = 0;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += a.get(k);
            if (a.get(i + 1) > sum) {
                sum += a.get(i + 1);
            }
            k = i;
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_2_39c07b19_5733_4462_b00d_bf1a5ea7da98(ArrayList<Integer> a, int size) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_6d6b6436_02f8_42c1_a62d_9f167aa754c7(ArrayList<Integer> a, int size) {
        int sum = a.get(0)*a.size(); // initialize the result with first element * number of elements
        for(int i = 1; i < a.size(); i++) {
            if(a.get(i) - a.get(i - 1) == size) {
                sum = sum + a.get(i);
            }
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_1_83cf41fd_2383_41be_9c05_7afd61e1ea30(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);

        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_d4987a5f_647f_43d1_93f1_219ccf07ddce(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int currentSum = 0;
        int currentMaxSum = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentMaxSum = currentSum;
            for(int j = i; j < a.size(); j++) {
                currentSum = currentSum + a.get(j);
                if(currentSum > currentMaxSum) {
                    currentMaxSum = currentSum;
                }
            }
            sum += currentMaxSum;
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_f8370099_3b3c_49fc_b184_b70659d1db65(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_58127a92_c0a0_4ea2_96e0_7cbb24639308(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int maxSumIndex = 0;
        int currentSum = 0;
        int currentSumIndex = 0;
        int currentMaxSum = Integer.MIN_VALUE;
        int currentMaxSumIndex = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentSumIndex = a.get(i);
            currentMaxSum = currentSum;
            currentMaxSumIndex = currentSumIndex;
            for(int j = i; j < a.size(); j++) {
                currentSum = a.get(j);
                currentSumIndex = a.get(j);
                if(currentSum > currentMaxSum) {
                    currentMaxSum = currentSum;
                    currentMaxSumIndex = currentSumIndex;
                }
            }
            sum += currentMaxSum;
            if(sum > maxSum) {
                maxSum = sum;
                maxSumIndex = currentMaxSumIndex;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_8c040c14_bd2c_478a_97f4_c15f09a61840(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int maxSumIndex = 0;
        int currentSum = 0;
        int currentSumIndex = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentSumIndex = 0;
            for(int j = i; j < a.size(); j++) {
                currentSum += a.get(j);
                currentSumIndex++;
                if(currentSumIndex == size) {
                    sum += currentSum;
                    if(sum > maxSum) {
                        maxSum = sum;
                        maxSumIndex = currentSumIndex;
                    }
                    currentSum = 0;
                    currentSumIndex = 0;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_036b0dd9_0eb1_4630_afe8_1d8848c25b9a(ArrayList<Integer> a, int size) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_5d2e2cf9_0122_4c51_b1e2_904c40643719(ArrayList<Integer> a, int size) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < a.size(); i++) {
            int pos = i;
            int maxValue = a.get(i);
            while (pos < size && a.get(pos) <= maxValue)
                maxValue += a.get(pos);
            if (maxValue > maxSum) {
                maxSum = maxValue;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_9e246f3f_eee6_4ef6_afd3_87d221bf76c5(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = -1000000000000L;
        for (int i = 0; i < a.size() - 1; i++) {
            int l = a.get(i);
            int r = a.get(i + 1);
            sum += l;
            if (sum >= size) {
                maxSum = Math.max(maxSum, sum);
            } else {
                sum += r;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_036b0dd9_0eb1_4630_afe8_1d8848c25b9a(ArrayList<Integer> a, int size) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_bf3381b0_80fd_49e6_bbd0_249f961e14ee(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int maxSumIndex = 0;
        int maxSumSize = 0;
        for(int i = 0; i < a.size(); i++) {
            sum = 0;
            for(int j = i; j < a.size(); j++) {
                sum += a.get(j);
                if(sum > maxSum) {
                    maxSum = sum;
                    maxSumIndex = i;
                    maxSumSize = j - i;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_3eafc595_a731_4eeb_8ffb_fde8c292b3ca(ArrayList<Integer> a, int size) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_8e00e353_9f91_4543_9eee_6874dbc22a42(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int maxSumIndex = 0;
        int currentSum = 0;
        int currentSumIndex = 0;
        int currentMaxSum = Integer.MIN_VALUE;
        int currentMaxSumIndex = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentSumIndex = 0;
            currentMaxSum = Integer.MIN_VALUE;
            currentMaxSumIndex = 0;
            for(int j = i; j < a.size(); j++) {
                currentSum = a.get(j);
                currentSumIndex++;
                currentMaxSum = Math.max(currentSum, currentMaxSum);
                currentMaxSumIndex = j;
            }
            sum += currentSum;
            if(currentSumIndex == size) {
                if(currentMaxSum == maxSum) {
                    maxSumIndex = i;
                    maxSum = currentSum;
                }
                currentSum = 0;
                currentSumIndex = 0;
                currentMaxSum = Integer.MIN_VALUE;
                currentMaxSumIndex = 0;
            }
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_2_17e901e8_0bde_4d55_a173_b2e71c18c1f2(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_9e90da8e_7a67_410c_986e_99a4072c8923(ArrayList<Integer> a, int size) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_75039500_edc5_4d2f_ac42_ce466c8b1d35(ArrayList<Integer> a, int size) {
        int maxSum = 0, sum = 0;
        for(int i = 0; i < size; i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_cd4d22bd_5523_49d6_83f2_7b5c7618866d(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_5ba3a59d_af38_4589_a275_22a62386a426(ArrayList<Integer> a, int size) {
        int maxSum = 0;
        int i = 0;
        while(i < a.size()) {
            int curSum = a.get(i);
            while (i < a.size() && curSum == a.get(i)) {
                curSum += a.get(i + 1);
                ++i;
            }
            maxSum = Math.max(maxSum, curSum);
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_fd89415b_248f_47a0_afa6_c44236481452(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int maxStart = 0;
        int maxEnd = 0;
        int currentSum = 0;
        int currentStart = 0;
        int currentEnd = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentStart = i;
            currentEnd = i;
            for(int j = i + 1; j < a.size(); j++) {
                currentSum += a.get(j);
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                    maxStart = currentStart;
                    maxEnd = currentEnd;
                }
                currentEnd = j;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_a60c92b0_7091_4008_b24a_7ca0108e3209(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_9500d0d4_8d15_41e3_9f77_44c97197a24d(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_b71fea2e_5e95_4675_939b_9501a72e20b3(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_3346873b_a8c7_4fad_a0cf_7f1d8e8c3b36(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_314d724e_85c3_4693_a991_49dd2378d417(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_0101a465_7cc8_4844_81ba_ce2ae3f12745(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_448cb0c8_7f93_480e_bf03_1eca6e66e412(ArrayList<Integer> a, int size) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int maxSum = 0;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > max) {
                max = sum;
                maxSum = sum;
            }
            sum -= a.get(i);
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_c348b879_21c0_4f62_93ea_92ba8d610e00(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_ee0df669_55f8_43f0_a2a6_2a13f3bc6d5a(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_4ab1ccb5_3863_49f0_9a7a_69bbd587191e(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_646fd715_4c84_4fb7_8bae_f91d9d94e79b(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_994cdae3_af92_4ae9_b1b7_dc1286217bb5(ArrayList<Integer> a, int size) {
        int maxSum = 0;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += a.get(i);
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_dcdea64f_9a19_4f70_be91_9088f069cb0a(ArrayList<Integer> a, int size) {
        ArrayList <Integer> sumArray = new ArrayList<>(); 
        int maxSum = Integer.MIN_VALUE;
        ArrayList <Integer> sumArray2 = new ArrayList<>();
        
        for(int i=0; i<a.size(); i++){
            sumArray.add(new Integer(a.get(i)));
            sumArray2.add(sumArray.get(i) + a.get(i));
            
            if(maxSum < sumArray2.get(i)){
                maxSum = sumArray2.get(i);
            }
        }
        
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_58127a92_c0a0_4ea2_96e0_7cbb24639308(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int maxSumIndex = 0;
        int currentSum = 0;
        int currentSumIndex = 0;
        int currentMaxSum = Integer.MIN_VALUE;
        int currentMaxSumIndex = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentSumIndex = a.get(i);
            currentMaxSum = currentSum;
            currentMaxSumIndex = currentSumIndex;
            for(int j = i; j < a.size(); j++) {
                currentSum = a.get(j);
                currentSumIndex = a.get(j);
                if(currentSum > currentMaxSum) {
                    currentMaxSum = currentSum;
                    currentMaxSumIndex = currentSumIndex;
                }
            }
            sum += currentMaxSum;
            if(sum > maxSum) {
                maxSum = sum;
                maxSumIndex = currentMaxSumIndex;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_162fb9cb_3bc8_4c62_a975_68af7c6d6a9d(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_79f36553_6e99_448d_b4fb_d46ad67c32eb(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int maxSumIndex = 0;
        int maxSumSize = 0;
        for(int i = 0; i < a.size(); i++) {
            sum = 0;
            for(int j = i; j < a.size(); j++) {
                sum += a.get(j);
                if(sum > maxSum) {
                    maxSum = sum;
                    maxSumIndex = j;
                    maxSumSize = a.get(j);
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_3f25d270_9cb3_46a7_be31_84996741c8cc(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);

        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_8d53228e_b53b_490e_aa26_28532a4b0729(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int maxSumIndex = 0;
        for(int i = 0; i < a.size(); i++) {
            if(i == a.size() - 1) {
                sum += a.get(i);
            } else {
                sum += a.get(i + 1);
            }
            if(sum > maxSum) {
                maxSum = sum;
                maxSumIndex = i;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_9794c508_e00e_4ba5_b10b_5bb353481b1e(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_6f438827_128c_4843_aeed_12140b5f2d71(ArrayList<Integer> a, int size) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int maxSumIndex = 0;
        int currentSum = 0;
        int currentSumIndex = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentSumIndex = 0;
            for(int j = i; j < a.size(); j++) {
                currentSum += a.get(j);
                currentSumIndex++;
                if(currentSumIndex == size) {
                    sum += currentSum;
                    if(sum > maxSum) {
                        maxSum = sum;
                        maxSumIndex = currentSumIndex;
                    }
                    currentSum = 0;
                    currentSumIndex = 0;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_8409a748_6d40_48ca_81bc_9123a17327f2(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_c70cbc96_ad88_4658_a81f_703151eeb31d(ArrayList<Integer> a, int size) {
        int sum = 0;
        for(int i=0;i<a.size();i++) {
            int left = a.get(i);
            for(int j=i;j<a.size();j++) {
                int right = a.get(j);
                if (left > right) {
                    sum = sum + right - left + 1;
                    i = j;
                } else {
                    sum = sum + right - left + 1;
                }
            }
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_2_31def91a_9763_4849_a359_c5975e225500(ArrayList<Integer> a, int size) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_26a4b2d9_430a_4985_9f3b_edce0a57bcf6(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int maxSumIndex = 0;
        int currentSum = 0;
        int currentSumIndex = 0;
        int currentMaxSum = 0;
        int currentMaxSumIndex = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentSumIndex = 0;
            currentMaxSum = a.get(i);
            currentMaxSumIndex = 0;
            for(int j = i; j < a.size(); j++) {
                currentSum = a.get(j);
                currentSumIndex++;
                currentMaxSum = Math.max(currentSum, currentMaxSum);
                currentMaxSumIndex++;
                if(currentSumIndex == size) {
                    sum += currentMaxSum;
                    maxSum = Math.max(maxSum, currentMaxSum);
                    maxSumIndex = currentMaxSumIndex;
                }
            }
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_2_6aa02966_2840_47b2_af33_e29d32cbc489(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_44d448fe_4509_4c2d_9c6a_b46e0008ed16(ArrayList<Integer> a, int size) {
        // find starting point
        int maxSum = 0, start = 0, end = -1;
        for(int i = 0; i < a.size(); i++) {
            if( i == 0 ) {
                start = a.get(i);
            }
            if( i == a.size() -1 ) {
                end = a.get(i);
            }
            if( start == end ) {
                maxSum += a.get(i);
            }
            if( maxSum > size ) {
                start = maxSum = end = 0;
            }
            if( a.get(i) > size ) {
                end = a.get(i);
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_b968d794_6824_4c4f_a335_516348dadaf2(ArrayList<Integer> a, int size) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_897ac834_9219_4573_8eb2_7ea1e4c296e2(ArrayList<Integer> a, int size) {
        int sum = 0L;
        int maxSum = 0L;
        ArrayList<Integer> subArray = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            if (subArray.size() == 0) {
                subArray.add(a.get(i));
            } else if (subArray.get(subArray.size() - 1) > a.get(i)) {
                subArray.add(a.get(i));
            } else {
                sum -= subArray.get(subArray.size() - 1);
                sum += a.get(i);
                subArray.removeAll(subArray);
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_e2412779_e297_4d32_819e_f3fa22e4fdda(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_b8af9a28_18a5_4e52_9e60_b2a73c7c1a75(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_ebc83234_094c_4edd_8793_6ed12e82fe2b(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int currentMaxSum = Integer.MIN_VALUE;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentMaxSum = currentSum;
            for(int j = i; j < a.size(); j++) {
                currentSum += a.get(j);
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_381c2689_881f_452d_8038_bc96aca60656(ArrayList<Integer> a, int size) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_26aca141_0ffc_497e_a96a_e710018b234d(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);

        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_9e246f3f_eee6_4ef6_afd3_87d221bf76c5(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = -1000000000000L;
        for (int i = 0; i < a.size() - 1; i++) {
            int l = a.get(i);
            int r = a.get(i + 1);
            sum += l;
            if (sum >= size) {
                maxSum = Math.max(maxSum, sum);
            } else {
                sum += r;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_97c94594_09b3_433d_8c66_41746b57b3cd(ArrayList<Integer> a, int size) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_44d448fe_4509_4c2d_9c6a_b46e0008ed16(ArrayList<Integer> a, int size) {
        // find starting point
        int maxSum = 0, start = 0, end = -1;
        for(int i = 0; i < a.size(); i++) {
            if( i == 0 ) {
                start = a.get(i);
            }
            if( i == a.size() -1 ) {
                end = a.get(i);
            }
            if( start == end ) {
                maxSum += a.get(i);
            }
            if( maxSum > size ) {
                start = maxSum = end = 0;
            }
            if( a.get(i) > size ) {
                end = a.get(i);
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_cb60731e_21c1_461f_9a4d_eacfb6df3f01(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);

        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_d74f0d5e_afd5_4806_aa4d_15ba01a9eda0(ArrayList<Integer> a, int size) {
        // Your code here
        return 0;
    }

    
    public static int maxSubArraySum_Problem_1_d74f0d5e_afd5_4806_aa4d_15ba01a9eda0(ArrayList<Integer> a, int size) {
        // Your code here
        return 0;
    }

    
    public static int maxSubArraySum_Problem_2_cb3234bb_8439_4343_8209_6649a0defc2a(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_c7ef8a3a_cb12_4f2b_b115_d438e2c3336e(ArrayList<Integer> a, int size) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_60c1e2b7_da70_4899_8a56_57c4c7029174(ArrayList<Integer> a, int size) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_60c1e2b7_da70_4899_8a56_57c4c7029174(ArrayList<Integer> a, int size) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_3193144a_d6d6_4506_bc02_088a8a6af511(ArrayList<Integer> a, int size) {
        int maxSum = 0, currSum = 0;
        int n = a.size();
        for(int i=0; i<n; i++) {
            currSum += a.get(i);
            if(currSum > maxSum) {
                maxSum = currSum;
            } else if(currSum == maxSum) {
                maxSum += a.get(i);
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_180bc1db_7fcd_49d1_b049_4e9cd1261e32(ArrayList<Integer> a, int size) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int maxSum = 0;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > max) {
                max = sum;
                maxSum = sum;
            }
            sum -= a.get(i);
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_76143100_be18_4b6c_af90_da68b350246b(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0), max_ending_here = a.get(0);
        for (int i = 1; i < size; i++) {
            max_ending_here = Math.max(a.get(i), max_ending_here + a.get(i));
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_3bf31d1c_231c_49c6_a7b3_ad2e5ad92b5f(ArrayList<Integer> a, int size) {
        int maxSum = 0;
        int sum = 0;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_76a33f6d_f41f_4693_802d_ec06269b64dc(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_b33a5b9c_4a20_4fa4_938e_d11ffdd7697f(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_7eb1e68e_55ee_46aa_8048_4656d8bb4220(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_660ea8f9_5bee_4746_a1a5_292ac867578b(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int currentSum = 0;
        int currentMaxSum = 0;
        int currentMaxSumIndex = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentMaxSum = a.get(i);
            currentMaxSumIndex = i;
            for(int j = i + 1; j < a.size(); j++) {
                currentSum = a.get(j);
                if(currentSum > currentMaxSum) {
                    currentMaxSum = a.get(j);
                    currentMaxSumIndex = j;
                }
            }
            sum += currentSum;
            if(currentMaxSumIndex == i) {
                maxSum = currentMaxSum;
            }
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_1_bf733cf7_8f00_428b_a0a6_620fae73ed97(ArrayList<Integer> a, int size) {
        int maxSum = 0;
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if (sum > maxSum) {
                maxSum = sum;
            } else if (sum < maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_72b8ea95_b1fa_4eca_955d_b6849784440f(ArrayList<Integer> a, int size) {
        int sum = 0;
        int i = 0, j = 0, k = 0, lastindex = 0;

        // For every sub-array in the given array
        // For every sub-array in the given array except the last sub-array
        // If the element of the sub-array is greater than the last element
        // Then add the subarray to the sum and remove the last element from the array
        // Else add the last element and add the next element from the array
        for (int r = 0; r < a.size() - 1; r++) {
            for (int c = 0; c < a.size() - 1 - r; c++) {
                if (r != 0) {
                    sum += a.get(lastindex);
                    a.remove(lastindex);
                }
                if (c != 0) {
                    sum += a.get(lastindex);
                    a.remove(lastindex);
                }
                if (a.get(r) > a.get(c)) {
                    sum += a.get(c);
                    a.remove(c);
                }
                if (a.get(r) > a.get(c)) {
                    sum += a.get(c);
                    a.remove(c);
                }
            }
        }

        // After adding the last element add it to the sum and remove it
        sum += a.get(lastindex);
        a.remove(lastindex);

        // If the sum is equal to the size then return it
        if (sum == size) {
            return sum;
        } else {
            return sum;
        }
    }

    
    public static int maxSubArraySum_Problem_1_a7f341b0_a74f_4645_b028_7dc588a2b0db(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int maxSumIndex = 0;
        for(int i = 0; i < a.size(); i++) {
            sum = 0;
            for(int j = i; j < a.size(); j++) {
                sum += a.get(j);
                if(sum > maxSum) {
                    maxSum = sum;
                    maxSumIndex = j;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_47ac0bf9_c621_4c77_aa20_d72bb104adc5(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);

        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_2399cb3c_e13d_4753_8074_158b4e2dcf77(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_3f25d270_9cb3_46a7_be31_84996741c8cc(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);

        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_4deac98e_5387_458e_af33_ec5087cf12a7(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_02ececd9_e198_4710_9091_56e4f5612c01(ArrayList<Integer> a, int size) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_4eab9ecc_9c7f_4290_b8ff_1d950c1bca05(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_5368d60b_3e56_4014_ad48_574d03f2ae4f(ArrayList<Integer> a, int size) {
        int max = a.get(0), sum = 0;
        for (int i = 1; i < a.size(); i++) {
            sum += a.get(i);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSubArraySum_Problem_1_c1c74bd2_fcff_4b9c_aa5c_e6e0e228c6d8(ArrayList<Integer> a, int size) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            sum += currentSum;
            if(sum > max) {
                max = sum;
                maxSum = currentSum;
            }
            sum -= currentSum;
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_643aeb03_abb3_415c_bcd8_0e1dc24087ed(ArrayList<Integer> a, int size) {
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> tmp = new ArrayList<>();
        int sum = 0;
        int index = -1;
        for (int l : a) {
            if (tmp.size() > 0) {
                sum = (sum + l) % size;
                if (sum > max) {
                    max = sum;
                    index = tmp.size() - 1;
                }
            } else {
                sum = sum + l;
                if (sum > max) {
                    max = sum;
                    index = tmp.size() - 1;
                }
            }
            tmp.add(sum);
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_1_71c4d7a4_d9aa_49dc_b708_227f5083249a(ArrayList<Integer> a, int size) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_630d87e3_3fc4_452e_b77b_716cdc31f0dd(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int currentMaxSum = Integer.MIN_VALUE;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentMaxSum = currentSum;
            for(int j = i; j < a.size(); j++) {
                currentSum = a.get(j) + currentSum;
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_569a265a_c004_400f_94c2_c194596fb24f(ArrayList<Integer> a, int size) {
        int maxSum = 0;
        int sum = 0;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_2cd2c18d_d7aa_47ef_8e2e_74e3eb84caac(ArrayList<Integer> a, int size) {
        int sum = 0;
        for (Integer cur : a) {
            sum += cur;
        }
        if (sum > size) {
            return sum;
        }
        int currentSum = sum;
        while (currentSum > size) {
            currentSum -= a.get(0);
            int maxSum = currentSum;
            for (int i = 1; i < a.size(); i++) {
                currentSum -= a.get(i);
                if (currentSum > size) {
                    maxSum = currentSum;
                }
            }
            sum += maxSum;
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_1_a1c5c7e9_11a0_4951_9fd3_364d3985ee3f(ArrayList<Integer> a, int size) {
        int sum = Integer.MIN_VALUE;
        int currentSum = 0, maxSum = 0, index = 0;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (currentSum + a.get(i) > maxSum) {
                maxSum = currentSum;
            }
            if (a.get(i) == maxSum) {
                count++;
            }
            currentSum += a.get(i);
            if (index == size - 1 && i == size) {
                sum -= maxSum;
                currentSum = 0;
                maxSum = 0;
                index = 0;
            }
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_1_1d9ed8d7_6931_4f64_bad8_6f919596b3c4(ArrayList<Integer> a, int size) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_f1ad2e2c_6ee3_4b2a_800b_9ca66a5c3f94(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_6ca9c70c_0323_4ce3_8a71_59a1777ee219(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int currentSum = 0;
        int currentMaxSum = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentMaxSum = currentSum;
            for(int j = i; j < a.size(); j++) {
                currentSum = currentSum + a.get(j);
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_125f1b8e_86fc_4bf3_b372_f611b8fff029(ArrayList<Integer> a, int size) {
        int sum = 0;
        int max = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            sum += a.get(i);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSubArraySum_Problem_1_8d5065c3_b904_4bfd_bd73_7eb9b06f17be(ArrayList<Integer> a, int size) {
        int sum = 0;
        ArrayList <Integer> arrlist = new ArrayList<Integer>();
        ArrayList <Integer> result = new ArrayList<Integer>();
        
        for(int i=0; i<a.size(); i++) {
            if(i == (a.size() - 1)) {
                sum = a.get(i);
                arrlist.add(a.get(i));
            }
            else if (a.get(i) > a.get(i+1)) {
                sum = sum + a.get(i+1);
                arrlist.add(a.get(i+1));
            }
            else {
                sum = sum + a.get(i);
                arrlist.add(a.get(i));
            }
        }
        for(int i=0; i< arrlist.size(); i++) {
            sum = sum + arrlist.get(i);
            result.add(sum);
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_1_71594a32_d986_4ff3_9174_bee1f056cf5b(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_46aad140_d5d6_42f1_8c90_543e19fcfcb0(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_de601d41_5c3e_4cfb_9634_a6309826c8fe(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        for(int i = 0; i < a.size(); i++) {
            if(i == 0) {
                sum = a.get(i);
                maxSum = sum;
            }
            else if(sum + a.get(i) > maxSum) {
                maxSum = sum + a.get(i);
            }
            sum += a.get(i);
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_b71fea2e_5e95_4675_939b_9501a72e20b3(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_39b8e6b6_33b9_4367_bd05_b6c54ce224e3(ArrayList<Integer> a, int size) {
        int max = 0, sum = 0;
        for(int i = 0; i<a.size()-1; i++) {
            for(int j = i+1; j<a.size(); j++) {
                sum+=a.get(j);
                if(sum>max) max = sum;
            }
        }
        return max;
    }

    
    public static int maxSubArraySum_Problem_2_c758373f_b074_42ad_96b3_48cd577fdc1e(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_a60c92b0_7091_4008_b24a_7ca0108e3209(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_713547b4_9cef_45d9_a84b_fb538a41f0d0(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_a6c46b51_4fa0_48e2_8837_486ab4d6a18c(ArrayList<Integer> a, int size) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int currentSum = 0;
        int currentMaxSum = Integer.MIN_VALUE;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentMaxSum = currentSum;
            for(int j = i; j < a.size(); j++) {
                currentSum += a.get(j);
                if(currentSum > currentMaxSum) {
                    currentMaxSum = currentSum;
                }
            }
            sum += currentMaxSum;
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_b33a5b9c_4a20_4fa4_938e_d11ffdd7697f(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_0dec9cac_64de_46bb_beb5_a0b64ae64fd8(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int maxSumIndex = 0;
        int currentSum = 0;
        int currentMaxSum = 0;
        int currentMaxSumIndex = 0;
        int currentIndex = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentMaxSum = currentSum;
            currentMaxSumIndex = i;
            for(int j = i; j < a.size(); j++) {
                currentSum = currentSum + a.get(j);
                if(currentSum > currentMaxSum) {
                    currentMaxSum = currentSum;
                    currentMaxSumIndex = j;
                }
            }
            if(currentMaxSumIndex != i) {
                sum += currentMaxSum;
                maxSum = currentMaxSum;
                maxSumIndex = currentMaxSumIndex;
            }
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_2_03889f9d_fc6d_41e6_9758_ae74646c93ac(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_98acbeee_de5f_4779_a461_0dcddfefb45c(ArrayList<Integer> a, int size) {
        if (size == 0)
            return 0;
        if (size == 1) {
            return a.get(0);
        }
        int sum = 0;
        int maxSum = 0;
        for (int i = 1; i < a.size(); i++) {
            sum += a.get(i);
            maxSum = Math.max(maxSum, sum);
            sum -= a.get(i);
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_2cd09767_bd8c_4484_826e_1b1e6742ed05(ArrayList<Integer> a, int size) {
        if (size == 0) return 0;
        // Write your code here.
        ArrayDeque<Integer> left = new ArrayDeque<>(); //Left array deque
        ArrayDeque<Integer> right = new ArrayDeque<>(); //Right array deque
        ArrayDeque<Integer> intest = new ArrayDeque<>(); //intest deque
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        left.offer(0L);
        right.offer(0L);
        while (left.size() != 0 || right.size() != 0) {
            curSum = curSum + left.poll() + right.poll();
            if (curSum > maxSum) {
                maxSum = curSum;
                intest.offer(curSum);
            }
            if (curSum < size) {
                left.offer(curSum);
                right.offer(curSum);
            }
        }
        return maxSum;
    }

}
