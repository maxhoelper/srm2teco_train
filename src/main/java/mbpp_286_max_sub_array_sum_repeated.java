package mbpp_286_max_sub_array_sum_repeated;

public class mbpp_286_max_sub_array_sum_repeated {

    
    public static int maxSubArraySumRepeated_Problem_2_663ba10c_6d51_4125_ae12_ecc91bd2fdb6(ArrayList<Integer> a, int n, int k) {
        int len = a.size();
        if(k < 1 || len < 2){
            return 0;
        }
        int sum = 0, max = Integer.MIN_VALUE;
        for(int i = 0; i < len; i++){
            sum += a.get(i);
            if(sum >= max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        sum = a.get(0);
        for(int i = 1; i < len; i++){
            sum += a.get(i);
            if(sum >= max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_9fca22d5_20c7_46a3_a1ff_89a8c4cebfb8(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i >= k) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_a332ee7e_113f_4626_8ff1_3f188319b7f1(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for (int i = 0; i < a.size(); i++) {
            int sum = 0;
            for (int j = i; j < a.size(); j += k) {
                sum += a.get(j);
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_34fb0372_48ff_4324_b928_acc19bb8689a(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for (int i = 0; i < a.size(); i++) {
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum += a.get(i);
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_6d8d9f91_935e_467f_82e5_3b86770e7712(ArrayList<Integer> a, int n, int k) {
        int maxSum = 0;
        int maxSumEndingHere = 0;
        int maxSumSoFar = 0;
        int maxSumEndingHereReverse = 0;
        int maxSumSoFarReverse = 0;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += a.get(i);
            maxSumEndingHere += a.get(i);
            if(maxSumEndingHere < 0) {
                maxSumEndingHere = 0;
            }
            if(maxSumSoFar < maxSumEndingHere) {
                maxSumSoFar = maxSumEndingHere;
            }
        }
        for(int i = n - 1; i >= 0; i--) {
            maxSumEndingHereReverse += a.get(i);
            if(maxSumEndingHereReverse < 0) {
                maxSumEndingHereReverse = 0;
            }
            if(maxSumSoFarReverse < maxSumEndingHereReverse) {
                maxSumSoFarReverse = maxSumEndingHereReverse;
            }
        }
        if(k == 1) {
            maxSum = maxSumSoFar;
        } else if(k == 2) {
            maxSum = maxSumSoFar + maxSumSoFarReverse;
        } else {
            maxSum = Math.max(maxSumSoFar + maxSumSoFarReverse + (k - 2) * sum, maxSumSoFar + maxSumSoFarReverse);
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_547b1cf3_60d5_4229_85b4_5e53d2bca533(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
            max_wrap = Math.max(max_wrap, curr_wrap);
        }
        max_wrap = Math.max(max_wrap, 0);
        return Math.max(max_sum, max_wrap * (k - 2) + max_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_f05bf737_8651_4df7_a23c_248ebc804641(ArrayList<Integer> a, int n, int k) {
        int maxSum = 0;
        int maxSumEndingHere = 0;
        for (int i = 0; i < n; i++) {
            maxSumEndingHere = maxSumEndingHere + a.get(i);
            if (maxSumEndingHere < 0) {
                maxSumEndingHere = 0;
            }
            if (maxSum < maxSumEndingHere) {
                maxSum = maxSumEndingHere;
            }
        }
        int maxSumSoFar = maxSum;
        for (int i = 0; i < n; i++) {
            maxSumEndingHere = maxSumEndingHere + a.get(i);
            if (maxSumEndingHere < 0) {
                maxSumEndingHere = 0;
            }
            if (maxSum < maxSumEndingHere) {
                maxSum = maxSumEndingHere;
            }
        }
        if (maxSumSoFar < 0) {
            return maxSumSoFar;
        }
        return Math.max(maxSumSoFar, (maxSumSoFar * (k - 2) + maxSum));
    }

    
    public static int maxSubArraySumRepeated_Problem_2_6f3e349e_dff8_47dd_9836_ad7afd0f6ca6(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (k == 1)
            return max_so_far;
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_2_6f3e349e_dff8_47dd_9836_ad7afd0f6ca6(a, n, 1);
        return Math.max(max_so_far, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_9e6409ac_5ebe_44ca_b0e9_28d8e48d7d79(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get( i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get( i);
            a.set( i, a.get( i) * -1);
        }
        max_wrap = max_wrap * k;
        max_so_far = Math.max(max_so_far, max_wrap);
        max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get( i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_10718bed_f4fe_4cc6_bbe9_631c57a9b3e0(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_3515b970_47f0_4987_8ea2_2b9c26a582e3(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
            if (max_ending_here > max_so_far)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        if (max_wrap > 0)
            return Math.max(max_so_far, max_wrap * (k - 2) + max_so_far);
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_1943ff2c_07d7_4afe_8772_5e98275e4cce(ArrayList<Integer> a, int n, int k) {
        int result = 0;
        int sum = 0;
        // write your code here
        for(int i=0;i<a.size()-k;i++){
            for(int j=0;j<k;j++){
                sum+=a.get(i+j);
            }
            result+=sum;
            sum = 0;
        }
        result+=sum;
        return result;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_b4308f4b_59aa_4940_962b_a16d8660619e(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        int max_so_far = 0;
        for (int i = 0; i < k; i++) {
            sum = 0;
            ArrayList<Integer> copy = new ArrayList<Integer>(a);
            copy.add(0L);
            for (int j = i; j < copy.size(); j++)
                sum -= copy.get(j);
            sum += copy.get(i);
            int temp_max = sum;
            if (temp_max > max_so_far) {
                max_so_far = temp_max;
            }
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_f15a44d9_f37b_4e2a_bbc9_60c7b6b4b52e(ArrayList<Integer> a, int n, int k) {
        int sum = 0, max = 0, min = 0;
        for (Integer s : a) {
            sum += s;
            if (sum > max) {
                max = sum;
                min = 0;
            } else if (sum < max) {
                min = sum;
            }
        }
        return sum == 0 ? -1 : Math.max(sum, max - min);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_0c24483e_a894_40c5_b622_34a84cd0d7e0(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get( i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get( i);
            a.set( i, a.get( i) * -1);
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get( i);
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
            max_wrap = Math.max(max_wrap, curr_wrap);
        }
        max_wrap = Math.max(max_wrap, 0);
        return Math.max(max_sum, (max_wrap * (k - 2)) + max_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_229211b1_d3b4_424b_8933_fb2487b16e2f(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
            max_wrap = Math.max(max_wrap, curr_wrap);
        }
        max_wrap = Math.max(max_wrap, 0);
        return Math.max(max_sum, max_wrap + (k - 2) * max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_03b2a9e2_7729_4e79_a66d_e951f9fedcb9(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0;
        int max_ending_here = 0;
        int max_sum = 0;
        for (int i = 0; i < n; i++) {
            max_sum += a.get(i);
        }
        for (int i = 0; i < n; i++) {
            max_ending_here += a.get(i);
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
        }
        if (k == 1) {
            return max_so_far;
        }
        int max_wrap = max_sum - max_so_far;
        return Math.max(max_so_far, max_wrap + max_so_far * (k - 2));
    }

    
    public static int maxSubArraySumRepeated_Problem_0_2c3b7711_867b_42f0_986c_9d28c814cd0e(ArrayList<Integer> a, int n, int k) {
        int maxSum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        maxSum = sum;
        for (int i = 0; i < n; i++) {
            sum -= a.get(i);
            sum += a.get(i) * k;
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_212374fb_3ef7_4231_935a_38ec818ff862(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0;
        int max_ending_here = 0;
        int max_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            max_ending_here = Math.max(a.get(i), max_ending_here + a.get(i));
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        max_sum = Math.max(max_sum, max_so_far);
        if (k == 1) {
            return max_sum;
        }
        int min_so_far = 0;
        int min_ending_here = 0;
        int min_sum = 0;
        for (int i = 0; i < n; i++) {
            min_ending_here = Math.min(a.get(i), min_ending_here + a.get(i));
            min_so_far = Math.min(min_so_far, min_ending_here);
        }
        min_sum = Math.min(min_sum, min_so_far);
        int ans = max_sum + (k - 2) * sum + min_sum;
        return ans;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_4eb65041_e41c_4891_815d_73616b2d1130(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_d5a30aef_e10a_47ca_a5b3_e9fa65f4861a(ArrayList<Integer> a, int n, int k) {
        int maxSum = 0;
        for (int i=0; i<a.size(); i++) {
            int currSum = a.get(i);
            for (int j=i; j<a.size(); j++) {
                currSum += a.get(j);
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_079470ba_f848_40ba_b2ab_e32b921d6ef4(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        max_wrap = max_wrap + max_wrap;
        if (max_wrap > max_sum) {
            max_sum = max_wrap;
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_e6a398b9_a608_432a_bb45_090b833e0ba9(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
        }
        max_sum = curr_sum;
        for (int i = 0; i < n; i++) {
            curr_sum += (k - 1) * a.get(i);
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_ce66c73d_9a15_4602_a5f4_d915176bd34d(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_sum < max_ending_here)
                max_sum = max_ending_here;
        }
        int min_sum = 0;
        int min_ending_here = 0;
        for (int i = 0; i < n; i++) {
            min_ending_here = min_ending_here + a.get(i);
            if (min_ending_here > 0)
                min_ending_here = 0;
            if (min_sum > min_ending_here)
                min_sum = min_ending_here;
        }
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += a.get(i);
        if (k == 1)
            return max_sum;
        else
            return Math.max(max_sum, sum * k - min_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_2867bc73_7e9c_4955_a6b9_14ff48ce2ec2(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int max_ending_here = 0;
        int max_so_far = 0;
        int max_element = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            max_element = Math.max(max_element, a.get(i));
            max_ending_here = Math.max(a.get(i), max_ending_here + a.get(i));
            max_so_far = Math.max(max_so_far, max_ending_here);
            sum += a.get(i);
        }
        if (max_so_far < 0) {
            return max_element;
        }
        max_sum = Math.max(max_so_far, max_so_far + (k - 2) * sum);
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_704cf0d1_36b0_4d25_9ca5_5837b1f86975(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0, max_ending_here = 0;
        for(int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if(max_ending_here < 0)
                max_ending_here = 0;
            if(max_sum < max_ending_here)
                max_sum = max_ending_here;
        }
        int max_wrap = 0;
        for(int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_1_704cf0d1_36b0_4d25_9ca5_5837b1f86975(a, n, 1);
        if(max_wrap > max_sum)
            max_sum = max_wrap;
        return max_sum * k;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_028cb203_acba_4b98_9494_dc6a01c82d4f(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n * k; i++) {
            curr_sum = (curr_sum + a.get((i % n))) % 1000000007;
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_5d1352f7_02b6_4c33_b30b_ef49b385992c(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        int left = 0;
        int right = a.size()-1;
        int maxSum = 0;
        
        while(left <= right) {
            sum += a.get(left);
            if(sum > k) {
                sum -= k;
                left++;
                continue;
            }
            
            sum += a.get(right);
            if(sum > k) {
                sum -= k;
                right--;
                continue;
            }
            
            int thisSum = sum;
            sum += a.get(left);
            if(sum > k) {
                sum -= k;
                left++;
            }
            
            sum += a.get(right);
            if(sum > k) {
                sum -= k;
                right--;
            }
            
            if(maxSum < thisSum) {
                maxSum = thisSum;
            }
        }
        
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_055f5a9a_421d_489a_8f30_3218caba909c(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int current_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            max_sum = Math.max(max_sum, a.get(i));
        }
        if (k == 1) {
            return max_sum;
        }
        if (sum > 0) {
            current_sum = sum * (k - 2);
            current_sum += max_sum;
        } else {
            current_sum = max_sum;
        }
        int max_ending_here = 0;
        int min_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here += a.get(i);
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            if (current_sum < max_ending_here) {
                current_sum = max_ending_here;
            }
            min_ending_here += a.get(i);
            if (min_ending_here > 0) {
                min_ending_here = 0;
            }
            if (min_ending_here < sum) {
                sum = min_ending_here;
            }
        }
        return current_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_1fc55e5d_c560_4b11_9882_ee44ec773dd3(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        int index = 0;
        ArrayList<Integer> subArrays = new ArrayList<Integer>();
        while(index >= 0) {
            sum = sum + a.get(index);
            if(sum > n) {
                subArrays.add(a.get(index));
            } else {
                index = -index-1;
            }
        }
        ArrayList<Integer> subArraysNew = new ArrayList<Integer>();
        subArrays.addAll(a);
        for(int i = 0; i < k; i++) {
            subArraysNew.addAll(subArrays);
        }
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < a.size(); i++) {
            maxSum = Math.max(maxSum, subArrays.get(i));
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_6cefffc8_86df_46df_b137_75cfac6efbe4(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
            max_ending_here = Math.max(max_ending_here, 0);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        max_wrap = max_wrap * k;
        if (max_wrap > 0)
            max_so_far = Math.max(max_so_far, max_wrap);
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_88ccc929_6d08_4cf9_a2f3_6bfc7afecb7e(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap > max_wrap) {
                max_wrap = curr_wrap;
            }
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
        }
        max_wrap = max_wrap * (k - 2);
        return Math.max(max_sum, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_da1cb5a8_edac_4502_b51b_f46a3c667951(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (k == 1)
            return max_so_far;
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        int max_wrap_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_wrap_ending_here += a.get(i);
            if (max_wrap_ending_here < 0)
                max_wrap_ending_here = 0;
            if (max_wrap < max_wrap_ending_here)
                max_wrap = max_wrap_ending_here;
        }
        int ans = max_so_far + (k - 2) * max_wrap;
        return Math.max(ans, max_so_far);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_ab3acf72_f991_4339_8ea6_eed573364140(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0;
        int max_ending_here = 0;
        int max_sum = 0;
        for (int i = 0; i < n; i++) {
            max_sum += a.get(i);
        }
        for (int i = 0; i < n; i++) {
            max_ending_here += a.get(i);
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
        }
        if (k == 1) {
            return max_so_far;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_1_ab3acf72_f991_4339_8ea6_eed573364140(a, n, 1);
        return Math.max(max_wrap, max_sum * (k - 2) + max_so_far);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_eb306d1d_df8f_497a_bb8a_bd7ebe45625e(ArrayList<Integer> a, int n, int k) {
        int sum = 0, start = 0;
        ArrayList<Integer> b = new ArrayList<>();
        for(int i = 0; i < n; i++){
            b.add(a.get(i));
        }
        for(int i = 1; i < k; i++){
            sum = 0;
            for(int j = 0; j < n; j++){
                sum+=b.get(j);
            }
            b.add(sum);
        }
        sum = 0;
        for(int j = 0; j < n; j++){
            sum+=b.get(j);
        }
        return sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_9fca22d5_20c7_46a3_a1ff_89a8c4cebfb8(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i >= k) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_5b9e7b50_ca28_47b7_975a_e3970a2b92c6(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        max_wrap = max_wrap * k;
        max_so_far = Math.max(max_so_far, max_wrap);
        max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_5cdb98a3_47ff_4901_8618_58853b4e2814(ArrayList<Integer> a, int n, int k) {
        int largest = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += a.get(i);
            largest = sum > largest ? sum : largest;
        }
        return largest;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_1b3f4564_176f_4cf0_9f61_b7fd96aae6f1(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        max_wrap = max_wrap * k;
        max_so_far = Math.max(max_so_far, max_wrap);
        max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_f05bf737_8651_4df7_a23c_248ebc804641(ArrayList<Integer> a, int n, int k) {
        int maxSum = 0;
        int maxSumEndingHere = 0;
        for (int i = 0; i < n; i++) {
            maxSumEndingHere = maxSumEndingHere + a.get(i);
            if (maxSumEndingHere < 0) {
                maxSumEndingHere = 0;
            }
            if (maxSum < maxSumEndingHere) {
                maxSum = maxSumEndingHere;
            }
        }
        int maxSumSoFar = maxSum;
        for (int i = 0; i < n; i++) {
            maxSumEndingHere = maxSumEndingHere + a.get(i);
            if (maxSumEndingHere < 0) {
                maxSumEndingHere = 0;
            }
            if (maxSum < maxSumEndingHere) {
                maxSum = maxSumEndingHere;
            }
        }
        if (maxSumSoFar < 0) {
            return maxSumSoFar;
        }
        return Math.max(maxSumSoFar, (maxSumSoFar * (k - 2) + maxSum));
    }

    
    public static int maxSubArraySumRepeated_Problem_0_14fa3545_9ad2_45ba_bf38_0050101823ae(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_sum < max_ending_here)
                max_sum = max_ending_here;
        }
        if (k == 1)
            return max_sum;
        int max_sum_circular = max_sum;
        int curr_max = 0;
        for (int i = 0; i < n; i++) {
            curr_max = curr_max + a.get(i);
            max_ending_here = max_ending_here - a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_sum < max_ending_here)
                max_sum = max_ending_here;
        }
        max_sum_circular = Math.max(max_sum_circular, curr_max + max_sum * (k - 2));
        return max_sum_circular;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_bbd7265e_ae2d_4fa5_9863_899db1ff362e(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_1_bbd7265e_ae2d_4fa5_9863_899db1ff362e(a, n, 1);
        if (max_wrap > max_so_far)
            max_so_far = max_wrap;
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_b0b59154_06d8_477a_b866_b6b29b3f5287(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        int min_wrap = 0;
        curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            min_wrap = Math.min(min_wrap, curr_sum);
        }
        int ans = max_wrap + (k - 2) * min_wrap + max_sum;
        return Math.max(ans, max_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_aaf8152f_8b90_4d32_acd5_d20facc346f3(ArrayList<Integer> a, int n, int k) {
        int maxSum = 0;
        int currSum = 0;
        int maxElement = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            maxElement = Math.max(maxElement, a.get(i));
            sum += a.get(i);
            currSum += a.get(i);
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        if (k == 1) {
            return maxSum;
        }
        if (maxElement < 0) {
            return maxElement;
        }
        int maxSumRepeated = sum * (k - 2);
        maxSumRepeated += maxSum;
        return Math.max(maxSumRepeated, maxSum);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_8bbf53c3_9548_4499_a660_e9e28b8243bc(ArrayList<Integer> a, int n, int k) {
        // write your code here
        ArrayList<Integer> result = new ArrayList<>();
        int maxSoFar = 0;
        int currIdx = 0;
        int currIdx2 = 0;
        for (int i = 0; i < a.size(); i++) {
            currIdx = i;
            maxSoFar = 0;
            while (currIdx < a.size() && k > 0) {
                maxSoFar += a.get(currIdx++);
                k--;
            }
            result.add(maxSoFar);
        }
        int res = 0;
        for (Integer i : result) {
            int curr = i;
            for (int j = 1; j < currIdx; j++) {
                curr += a.get(j);
            }
            res = Math.max(res, curr);
        }
        return res;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_ddf1781e_099c_422e_a7d4_3601b3a6d42f(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for (int i = 0; i < a.size(); i++) {
            int sum = 0;
            for (int j = i; j < a.size(); j += k) {
                sum += a.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_19d1be66_08fc_41b5_ad43_9d0e88d76915(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        if (k == 1)
            return max_so_far;
        int max_val = 0, min_val = 0;
        for (int i = 0; i < n; i++) {
            max_val += a.get(i);
            min_val = Math.min(min_val, max_val);
        }
        int total_sum = max_val * k;
        int max_wrap = total_sum - min_val;
        return Math.max(max_so_far, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_0a320363_acd7_46a0_8ab2_5d63504fb66c(ArrayList<Integer> a, int n, int k) {
        // Write your code here
        int max_so_far = 0;
        int max_ending_here = 0;
        int max_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            max_ending_here += a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        max_sum = max_so_far;
        if (sum > 0)
            max_sum += (k - 2) * sum;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            max_ending_here += a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (max_so_far > max_sum)
            max_sum = max_so_far;
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_b0b59154_06d8_477a_b866_b6b29b3f5287(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        int min_wrap = 0;
        curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            min_wrap = Math.min(min_wrap, curr_sum);
        }
        int ans = max_wrap + (k - 2) * min_wrap + max_sum;
        return Math.max(ans, max_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_d7e3bd93_7ee5_4c2b_9e86_741503256adc(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_27e6f578_63ea_4fde_ae06_faa116998539(ArrayList<Integer> a, int n, int k) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + a.get(i);
        }
        int max_sum = 0;
        int max_sum_i = 0;
        for (int j = 0; j < k; j++) {
            sum = sum + a.get(j);
            if (sum > max_sum) {
                max_sum = sum;
                max_sum_i = j;
            }
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_b87faabd_2b98_48bd_bc63_df300ccc1bde(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int max_ending_here = 0;
        int max_so_far = 0;
        int max_element = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_element < a.get(i))
                max_element = a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (max_so_far == 0)
            return max_element;
        max_sum = max_so_far;
        for (int i = 0; i < n; i++) {
            max_sum = max_sum + a.get(i);
        }
        max_sum = max_sum * (k - 2);
        max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_sum + max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_e8c993a3_f267_4ffe_af9c_1532ae1e9b03(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int max_ending_here = 0;
        int max_so_far = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        max_so_far = sum;
        for (int i = 0; i < n; i++) {
            max_ending_here += a.get(i);
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
        }
        max_sum = Math.max(max_so_far, max_sum);
        if (k == 1) {
            return max_sum;
        }
        max_sum = Math.max(max_sum, sum * (k - 2) + max_so_far);
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_9c6f5345_003f_443d_9eec_e1583382af88(ArrayList<Integer> a, int n, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (k == 0) {
            ans.add(a.get(0));
        }
        for (int i = 0; i < k; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += a.get(j);
                ans.add(sum);
            }
        }
        return Collections.max(ans);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_8da6cdac_9e16_4d17_810a_9fc4c47d128a(ArrayList<Integer> a, int n, int k) {
        // TODO: Add code here
        int largestSum = 0;
        ArrayList <Integer> repeatedArray = new ArrayList<>();
        ArrayList <Integer> modifiedArray = new ArrayList<>();
        for(int i=0;i<k;i++){
            repeatedArray.addAll(a);
            repeatedArray.remove(i+1);
            modifiedArray.addAll(repeatedArray);
            modifiedArray.remove(i);
            modifiedArray.remove(i-1);
        }
        int repeatedCount = 0;
        int modifiedCount = 0;
        int maxIndex = 0;
        for(int i =0;i<modifiedArray.size();i++){
            repeatedCount = modifiedArray.size()-i;
            if(modifiedArray.size()-i == repeatedCount){
                largestSum = modifiedArray.get(i);
            }
        }
        return largestSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_6f3e349e_dff8_47dd_9836_ad7afd0f6ca6(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (k == 1)
            return max_so_far;
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_0_6f3e349e_dff8_47dd_9836_ad7afd0f6ca6(a, n, 1);
        return Math.max(max_so_far, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_2a14690a_4e68_4b9b_8c2d_9fee0b1cdbd8(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (k == 1)
            return max_so_far;
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_0_2a14690a_4e68_4b9b_8c2d_9fee0b1cdbd8(a, n, 1);
        return Math.max(max_so_far, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_8016c8a3_84b8_4d93_924b_6a483462071d(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            sum = sum + a.get(i);
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_a2df5028_626a_4907_94f5_d101d5d5b2f8(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_0_a2df5028_626a_4907_94f5_d101d5d5b2f8(a, n, 1);
        return Math.max(max_sum, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_aaf8152f_8b90_4d32_acd5_d20facc346f3(ArrayList<Integer> a, int n, int k) {
        int maxSum = 0;
        int currSum = 0;
        int maxElement = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            maxElement = Math.max(maxElement, a.get(i));
            sum += a.get(i);
            currSum += a.get(i);
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        if (k == 1) {
            return maxSum;
        }
        if (maxElement < 0) {
            return maxElement;
        }
        int maxSumRepeated = sum * (k - 2);
        maxSumRepeated += maxSum;
        return Math.max(maxSumRepeated, maxSum);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_56707c04_0128_4ae2_8774_4d797e085f28(ArrayList<Integer> a, int n, int k) {
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;
        for (int i = 0; i < n * k; i++) {
            curr_sum += a.get( (i % n));
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_da85718d_4906_4cba_b207_39e27516a476(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get( i);
        }
        max_sum = curr_sum;
        for (int i = n; i < n * k; i++) {
            curr_sum += a.get( i %  n) - a.get( (i - n) %  n);
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_4935d86c_bc4e_4dd2_9045_d2a0eb0814e0(ArrayList<Integer> a, int n, int k) {
        // Write your code here
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        if (k == 1)
            return max_so_far;
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
        }
        if (max_wrap > 0)
            return Math.max(max_so_far, max_wrap * (k - 2) + max_ending_here);
        else
            return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_1d621b18_c81a_4573_be07_58ce31ab0958(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        max_wrap = max_wrap * k;
        max_so_far = Math.max(max_so_far, max_wrap);
        if (max_so_far == 0)
            return Collections.max(a);
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_28c757f3_cbb7_4c2b_9984_3d4d2ffd2aed(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            max_sum = Math.max(max_sum, sum);
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            max_sum = Math.max(max_sum, sum);
        }
        max_sum = Math.max(max_sum, max_wrap * (k - 2) + sum);
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_5d98751e_ae3d_4b89_b07d_c312619e3039(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        int maxSum = 0;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i = 0; i < k; i++) {
            temp.add(a.get(i));
        }
        for(int i = 0; i < k; i++) {
            sum = 0;
            for(int j = 0; j < n; j++) {
                sum += a.get(j);
            }
            sum -= temp.get(i);
            if((sum > maxSum) && (sum > 0)) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_7bdeb18d_506a_4a5e_a322_d2492e15f867(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        max_wrap = max_wrap * k;
        max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        max_so_far = max_so_far + max_wrap;
        if (max_so_far > sum)
            return max_so_far;
        else
            return sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_1b3f4564_176f_4cf0_9f61_b7fd96aae6f1(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        max_wrap = max_wrap * k;
        max_so_far = Math.max(max_so_far, max_wrap);
        max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_5f074b46_2499_48f9_ba64_f881916e616a(ArrayList<Integer> a, int n, int k) {
        // Write your code here
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<a.size(); i++)
        {
            sum += a.get(i);
            if(sum >= max) max = sum;
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_c63ce041_c6f1_41df_9a28_f7f219339775(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < a.size() - k) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_08612910_17e9_493d_96c0_36265c8c6ee8(ArrayList<Integer> a, int n, int k) {
        // Complete this function
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get((i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_cd95a2c8_ea59_4c9a_96dd_b05bfa1b9832(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int window_sum = 0;
        int window_start = 0;
        for (int i = 0; i < n * k; i++) {
            window_sum += a.get( (i % n));
            if (i >= n) {
                window_sum -= a.get( (window_start % n));
                window_start += 1;
            }
            max_sum = Math.max(max_sum, window_sum);
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_375d02dc_0bb2_41cb_82b4_80861bed44bc(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for(int i = 0; i < a.size(); i++) {
            int sum = 0;
            for(int j = i; j < a.size(); j++) {
                sum += a.get(j);
                if(sum < 0) {
                    sum = 0;
                }
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_4262a450_1811_42f2_be7b_275dad18ff98(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
            max_wrap = Math.max(max_wrap, curr_wrap);
        }
        max_wrap = Math.max(max_wrap, 0);
        return Math.max(max_sum, max_wrap + (k - 2) * max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_6d4c206d_cdff_4437_b014_2e33860d8fe1(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_d7e3bd93_7ee5_4c2b_9e86_741503256adc(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_56707c04_0128_4ae2_8774_4d797e085f28(ArrayList<Integer> a, int n, int k) {
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;
        for (int i = 0; i < n * k; i++) {
            curr_sum += a.get( (i % n));
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_ec015b97_e1d1_4a74_9b95_20c61e646b47(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0, curr_sum = 0;
        for(int i=0; i<n; i++) {
            curr_sum += a.get(i);
            if(curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        int max_wrap = 0;
        for(int i=0; i<n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        curr_sum = 0;
        for(int i=0; i<n; i++) {
            curr_sum += a.get(i);
            if(curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        max_sum = Math.max(max_sum, max_wrap);
        if(k == 1) {
            return max_sum;
        }
        return Math.max(max_sum, max_wrap + maxSubArraySumRepeated_Problem_2_ec015b97_e1d1_4a74_9b95_20c61e646b47(a, n, k-2));
    }

    
    public static int maxSubArraySumRepeated_Problem_1_a2df5028_626a_4907_94f5_d101d5d5b2f8(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_1_a2df5028_626a_4907_94f5_d101d5d5b2f8(a, n, 1);
        return Math.max(max_sum, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_467bb2fc_64c9_45b6_96e0_166f21a85c1a(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_0c24483e_a894_40c5_b622_34a84cd0d7e0(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get( i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get( i);
            a.set( i, a.get( i) * -1);
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get( i);
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
            max_wrap = Math.max(max_wrap, curr_wrap);
        }
        max_wrap = Math.max(max_wrap, 0);
        return Math.max(max_sum, (max_wrap * (k - 2)) + max_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_34fb0372_48ff_4324_b928_acc19bb8689a(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for (int i = 0; i < a.size(); i++) {
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum += a.get(i);
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_4eb65041_e41c_4891_815d_73616b2d1130(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_59917f3d_2b4c_4f4b_afe5_10fbf5702a2c(ArrayList<Integer> a, int n, int k) {
        return a.stream().reduce(Integer::sum).orElse(0L);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_88245a2f_b563_49e5_be8a_e6b47ce53ad6(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get( i);
        }
        max_sum = curr_sum;
        for (int i = n; i < n * k; i++) {
            curr_sum += a.get( i %  n) - a.get( (i - n) %  n);
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_84449ab4_e4b5_41bf_8701_c3320bf14e6d(ArrayList<Integer> a, int n, int k) {
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;
        for (int i = 0; i < n * k; i++) {
            curr_sum += a.get( (i % n));
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_5830d948_b92e_4d4a_b08b_3af5b49912d3(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
            if (max_ending_here > max_so_far)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        max_so_far = Math.max(max_so_far, max_wrap * (k - 2));
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_a98f8c44_8a94_41f9_b9bd_42c192f88cf4(ArrayList<Integer> a, int n, int k) {
        // Write your code here
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_0_a98f8c44_8a94_41f9_b9bd_42c192f88cf4(a, n, k);
        return Math.max(max_so_far, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_a1509676_7037_4b97_a8f1_ca5d14def6f3(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_d7b73bf6_1f63_4f10_b3a7_9bc46c24b9e2(ArrayList<Integer> a, int n, int k) {
        // Write your code here
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
            if (max_ending_here > max_so_far)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        if (max_wrap > 0)
            return Math.max(max_so_far, max_wrap * (k - 2) + max_so_far);
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_f7f4eeb8_5633_465f_b690_bb6ba85dae98(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for(int i = 0; i < a.size(); i++) {
            int sum = 0;
            for(int j = 0; j < k; j++) {
                sum += a.get(i);
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_8bbf53c3_9548_4499_a660_e9e28b8243bc(ArrayList<Integer> a, int n, int k) {
        // write your code here
        ArrayList<Integer> result = new ArrayList<>();
        int maxSoFar = 0;
        int currIdx = 0;
        int currIdx2 = 0;
        for (int i = 0; i < a.size(); i++) {
            currIdx = i;
            maxSoFar = 0;
            while (currIdx < a.size() && k > 0) {
                maxSoFar += a.get(currIdx++);
                k--;
            }
            result.add(maxSoFar);
        }
        int res = 0;
        for (Integer i : result) {
            int curr = i;
            for (int j = 1; j < currIdx; j++) {
                curr += a.get(j);
            }
            res = Math.max(res, curr);
        }
        return res;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_f7f4eeb8_5633_465f_b690_bb6ba85dae98(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for(int i = 0; i < a.size(); i++) {
            int sum = 0;
            for(int j = 0; j < k; j++) {
                sum += a.get(i);
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_dfa24aed_8297_462f_ac52_e59a3fa92c9e(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        int max_sum = 0;
        int max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_sum < max_ending_here)
                max_sum = max_ending_here;
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_c63ce041_c6f1_41df_9a28_f7f219339775(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < a.size() - k) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_eb306d1d_df8f_497a_bb8a_bd7ebe45625e(ArrayList<Integer> a, int n, int k) {
        int sum = 0, start = 0;
        ArrayList<Integer> b = new ArrayList<>();
        for(int i = 0; i < n; i++){
            b.add(a.get(i));
        }
        for(int i = 1; i < k; i++){
            sum = 0;
            for(int j = 0; j < n; j++){
                sum+=b.get(j);
            }
            b.add(sum);
        }
        sum = 0;
        for(int j = 0; j < n; j++){
            sum+=b.get(j);
        }
        return sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_76e2772e_fe20_4a7c_9436_61e0e0b8b460(ArrayList<Integer> a, int n, int k) {
        int maxSum = 0;
        int sum = 0;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
            if(i >= k) {
                sum = 0;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_2867bc73_7e9c_4955_a6b9_14ff48ce2ec2(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int max_ending_here = 0;
        int max_so_far = 0;
        int max_element = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            max_element = Math.max(max_element, a.get(i));
            max_ending_here = Math.max(a.get(i), max_ending_here + a.get(i));
            max_so_far = Math.max(max_so_far, max_ending_here);
            sum += a.get(i);
        }
        if (max_so_far < 0) {
            return max_element;
        }
        max_sum = Math.max(max_so_far, max_so_far + (k - 2) * sum);
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_a7a5f0c2_f5fb_4b1c_8695_c1d97f117e3e(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum += a.get(j);
                if (sum > k) {
                    sum = k;
                    break;
                }
            }
        }
        return sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_a98f8c44_8a94_41f9_b9bd_42c192f88cf4(ArrayList<Integer> a, int n, int k) {
        // Write your code here
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_1_a98f8c44_8a94_41f9_b9bd_42c192f88cf4(a, n, k);
        return Math.max(max_so_far, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_5dbffbe4_840e_4dd1_8996_3a3ca7924b40(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        int min_wrap = 0;
        curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum > 0) {
                curr_sum = 0;
            }
            min_wrap = Math.min(min_wrap, curr_sum);
        }
        min_wrap = Math.abs(min_wrap);
        int ans1 = max_wrap + min_wrap * (k - 2);
        int ans2 = max_sum;
        return Math.max(ans1, ans2);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_ef4d34d8_80b3_4f42_a5c4_4fc602d7f8c6(ArrayList<Integer> a, int n, int k) {
        
        // Your code goes here
        
        return -1;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_f15a44d9_f37b_4e2a_bbc9_60c7b6b4b52e(ArrayList<Integer> a, int n, int k) {
        int sum = 0, max = 0, min = 0;
        for (Integer s : a) {
            sum += s;
            if (sum > max) {
                max = sum;
                min = 0;
            } else if (sum < max) {
                min = sum;
            }
        }
        return sum == 0 ? -1 : Math.max(sum, max - min);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_5d98751e_ae3d_4b89_b07d_c312619e3039(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        int maxSum = 0;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i = 0; i < k; i++) {
            temp.add(a.get(i));
        }
        for(int i = 0; i < k; i++) {
            sum = 0;
            for(int j = 0; j < n; j++) {
                sum += a.get(j);
            }
            sum -= temp.get(i);
            if((sum > maxSum) && (sum > 0)) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_6f3ee327_2357_4e08_b898_3e3192ac465c(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            if (max_sum < curr_sum)
                max_sum = curr_sum;
            if (curr_sum < 0)
                curr_sum = 0;
        }
        if (k == 1)
            return max_sum;
        int max_wrap = sum + maxSubArraySumRepeated_Problem_0_6f3ee327_2357_4e08_b898_3e3192ac465c(a, n, k - 1);
        return Math.max(max_wrap, max_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_6f22b65e_1e32_4963_8e8c_47294b59aaf5(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for (int i = 0; i < a.size(); i++) {
            int sum = 0;
            for (int j = i; j < a.size(); j += k) {
                sum += a.get(j);
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_3466af45_7362_449a_aa55_fa0521b3c51d(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        int max_sum = 0;
        int max_ending_here = 0;
        int max_so_far = 0;
        int max_element = Integer.MIN_VALUE;
        int sum_of_all_elements = 0;
        for (int i = 0; i < n; i++) {
            sum_of_all_elements += a.get(i);
            max_element = Math.max(max_element, a.get(i));
        }
        if (k == 1) {
            for (int i = 0; i < n; i++) {
                max_ending_here += a.get(i);
                if (max_ending_here < 0) {
                    max_ending_here = 0;
                }
                if (max_so_far < max_ending_here) {
                    max_so_far = max_ending_here;
                }
            }
            return max_so_far;
        }
        for (int i = 0; i < n; i++) {
            max_ending_here += a.get(i);
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
        }
        if (max_so_far == 0) {
            return max_element;
        }
        max_sum = max_so_far;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            max_sum = Math.max(max_sum, sum);
            max_sum = Math.max(max_sum, sum + max_so_far * (k - 2));
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_44e062b3_8384_44ef_8261_82607103679d(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        for(int i=0;i<n;i++)
            for(int j=0;j<k;j++)
                sum+=a.get(i)*a.get(j);
        return sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_02b68d71_acfb_4db2_a5fc_7731ca8e5b19(ArrayList<Integer> a, int n, int k) {
        // write your code here
        if (n < 2)
            return 0;
        ArrayList<Integer> repeat = new ArrayList<Integer>();
        int max = 0;
        int maxDiff = 0;
        int diff = 0;
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum = 0;
            diff = n;
            repeat.clear();
            for (int j = 0; j < k; j++) {
                if (i == j) {
                    sum += a.get(i);
                    repeat.add(i);
                } else {
                    sum += a.get(i);
                    diff--;
                    if (diff == 0) {
                        repeat.add(j);
                    }
                }
            }
            if (sum > max)
                max = sum;
            diff = n - sum;
            if (diff > maxDiff)
                maxDiff = diff;
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_3515b970_47f0_4987_8ea2_2b9c26a582e3(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
            if (max_ending_here > max_so_far)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        if (max_wrap > 0)
            return Math.max(max_so_far, max_wrap * (k - 2) + max_so_far);
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_857ba88a_3805_4689_9aa2_2ae26511621d(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            if (curr_sum > max_wrap) {
                max_wrap = curr_sum;
            }
        }
        if (sum > 0) {
            return Math.max(max_wrap + (k - 2) * sum, max_sum);
        }
        return Math.max(max_wrap, max_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_0b1182f2_a6f6_42e0_bcb5_643e7964d9d0(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap > max_wrap) {
                max_wrap = curr_wrap;
            }
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
        }
        max_wrap = max_wrap * (k - 2);
        return Math.max(max_sum, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_7bdeb18d_506a_4a5e_a322_d2492e15f867(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        max_wrap = max_wrap * k;
        max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        max_so_far = max_so_far + max_wrap;
        if (max_so_far > sum)
            return max_so_far;
        else
            return sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_be602a5a_ad34_4a8c_be39_038f493ea3b7(ArrayList<Integer> a, int n, int k) {
        // write your code here
        int result = 1;
        int largestSum = 0;
        int count = 0;
        for(int value : a) {
            count += value;
            if(count <= k) {
                result *= value;
                if(result > largestSum) {
                    largestSum = result;
                }
            }
            else {
                count -= k;
            }
        }
        return largestSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_8f634dc1_75f6_4d5d_9470_35a9a88a392d(ArrayList<Integer> a, int n, int k) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < k; j++)
                sum += a.get(j);
            if (sum > ans)
                ans = sum;
        }
        return ans;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_6c6d32ab_b047_4720_9959_353ac73c14b0(ArrayList<Integer> a, int n, int k) {
        int largestSum = 0, curSum = 0;
        int sum = 0;
        for (int i = 0; i <= k; i++) {
            sum = 0;
            for (int j = 0; j < a.size(); j++) {
                sum = sum + a.get(j);
                if (j + 1 < a.size())
                    sum = sum + a.get(j + 1);
            }
            sum += Math.pow(2, i);
            largestSum = largestSum >= sum ? largestSum : sum;
        }
        return largestSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_cd95a2c8_ea59_4c9a_96dd_b05bfa1b9832(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int window_sum = 0;
        int window_start = 0;
        for (int i = 0; i < n * k; i++) {
            window_sum += a.get( (i % n));
            if (i >= n) {
                window_sum -= a.get( (window_start % n));
                window_start += 1;
            }
            max_sum = Math.max(max_sum, window_sum);
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_74ed4f0c_8af0_4a15_9dc2_9cde236e4d69(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0;
        int max_ending_here = 0;
        int max_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            sum += a.get(i);
        }
        if (sum > 0) {
            max_sum = max_so_far + (k - 2) * sum;
        } else {
            max_sum = max_so_far;
        }
        int curr_max = 0;
        for (int i = 0; i < n; i++) {
            curr_max += a.get(i);
            max_sum = Math.max(max_sum, curr_max);
            if (curr_max < 0)
                curr_max = 0;
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_4b602c4d_0f26_46dd_bb48_ade867c09ed1(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            max_sum = Math.max(max_sum, sum);
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            max_sum = Math.max(max_sum, sum);
        }
        max_sum = Math.max(max_sum, max_wrap * (k - 2) + sum);
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_03b2a9e2_7729_4e79_a66d_e951f9fedcb9(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0;
        int max_ending_here = 0;
        int max_sum = 0;
        for (int i = 0; i < n; i++) {
            max_sum += a.get(i);
        }
        for (int i = 0; i < n; i++) {
            max_ending_here += a.get(i);
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
        }
        if (k == 1) {
            return max_so_far;
        }
        int max_wrap = max_sum - max_so_far;
        return Math.max(max_so_far, max_wrap + max_so_far * (k - 2));
    }

    
    public static int maxSubArraySumRepeated_Problem_1_28c757f3_cbb7_4c2b_9984_3d4d2ffd2aed(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            max_sum = Math.max(max_sum, sum);
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            max_sum = Math.max(max_sum, sum);
        }
        max_sum = Math.max(max_sum, max_wrap * (k - 2) + sum);
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_e0d1ef75_e4c9_45d9_b8a7_6b66c55cf747(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum > max_wrap) {
                max_wrap = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        if (max_wrap > 0) {
            return Math.max(max_sum, max_wrap + (k - 2) * max_wrap);
        } else {
            return max_sum;
        }
    }

    
    public static int maxSubArraySumRepeated_Problem_1_d7e3bd93_7ee5_4c2b_9e86_741503256adc(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_bbd7265e_ae2d_4fa5_9863_899db1ff362e(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_2_bbd7265e_ae2d_4fa5_9863_899db1ff362e(a, n, 1);
        if (max_wrap > max_so_far)
            max_so_far = max_wrap;
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_dc36d149_8c96_4473_93eb_7f9757f20f8a(ArrayList<Integer> a, int n, int k) {
        ArrayList<Integer> maxSum = new ArrayList<>();
        int sum = 0, start = 0;
        int max = a.get(0); 
        for( int i=0; i<k; i++) {
            sum = start + a.get(i);
            max = Math.max(max, sum);
            maxSum.add(sum);
            start = sum;
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_dbd81966_b7c2_432f_a39c_db2f6dc82f2e(ArrayList<Integer> a, int n, int k) {
        int maxSum = -1;
        int sum = 0;
        for (int i=0; i<k; i++) {
            sum += a.get(i);
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        a.add(n);
        sum = 0;
        for (int i=0; i<a.size(); i++) {
            sum += a.get(i);
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_028cb203_acba_4b98_9494_dc6a01c82d4f(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n * k; i++) {
            curr_sum = (curr_sum + a.get((i % n))) % 1000000007;
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_ec015b97_e1d1_4a74_9b95_20c61e646b47(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0, curr_sum = 0;
        for(int i=0; i<n; i++) {
            curr_sum += a.get(i);
            if(curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        int max_wrap = 0;
        for(int i=0; i<n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        curr_sum = 0;
        for(int i=0; i<n; i++) {
            curr_sum += a.get(i);
            if(curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        max_sum = Math.max(max_sum, max_wrap);
        if(k == 1) {
            return max_sum;
        }
        return Math.max(max_sum, max_wrap + maxSubArraySumRepeated_Problem_1_ec015b97_e1d1_4a74_9b95_20c61e646b47(a, n, k-2));
    }

    
    public static int maxSubArraySumRepeated_Problem_0_76e2772e_fe20_4a7c_9436_61e0e0b8b460(ArrayList<Integer> a, int n, int k) {
        int maxSum = 0;
        int sum = 0;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
            if(i >= k) {
                sum = 0;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_39dd8a0b_360a_4850_95cd_128444d6ce90(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_02cc070a_195d_4db8_bccb_c51728460eeb(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i >= k) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_5dbffbe4_840e_4dd1_8996_3a3ca7924b40(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        int min_wrap = 0;
        curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum > 0) {
                curr_sum = 0;
            }
            min_wrap = Math.min(min_wrap, curr_sum);
        }
        min_wrap = Math.abs(min_wrap);
        int ans1 = max_wrap + min_wrap * (k - 2);
        int ans2 = max_sum;
        return Math.max(ans1, ans2);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_31f768c2_1088_4ac9_a5a5_2530c5df042d(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for(int i = 0; i < a.size(); i++) {
            int sum = 0;
            for(int j = i; j < a.size(); j += k) {
                sum += a.get(j);
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_e6a398b9_a608_432a_bb45_090b833e0ba9(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
        }
        max_sum = curr_sum;
        for (int i = 0; i < n; i++) {
            curr_sum += (k - 1) * a.get(i);
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_4262a450_1811_42f2_be7b_275dad18ff98(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
            max_wrap = Math.max(max_wrap, curr_wrap);
        }
        max_wrap = Math.max(max_wrap, 0);
        return Math.max(max_sum, max_wrap + (k - 2) * max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_f1ee8bf8_d39f_4b85_b06f_99520eb9ef49(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        int max = 0;
        ArrayList <Integer> arrayList = new ArrayList<Integer>();
        for (int i=0; i<n; i++) {
            arrayList.add(a.get(i));
        }
        ArrayList <Integer> temp = new ArrayList<Integer>();
        for (int i=0; i<k; i++) {
            for(int j=0; j<arrayList.size(); j++) {
                temp.add(arrayList.get(j));
            }
            arrayList.clear();
            arrayList.addAll(temp);
        }
        for (int i=0; i<arrayList.size(); i++) {
            sum+=arrayList.get(i);
            if(sum>max)
                max = sum;
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_375d02dc_0bb2_41cb_82b4_80861bed44bc(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for(int i = 0; i < a.size(); i++) {
            int sum = 0;
            for(int j = i; j < a.size(); j++) {
                sum += a.get(j);
                if(sum < 0) {
                    sum = 0;
                }
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_e0d1ef75_e4c9_45d9_b8a7_6b66c55cf747(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum > max_wrap) {
                max_wrap = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        if (max_wrap > 0) {
            return Math.max(max_sum, max_wrap + (k - 2) * max_wrap);
        } else {
            return max_sum;
        }
    }

    
    public static int maxSubArraySumRepeated_Problem_0_6d8d9f91_935e_467f_82e5_3b86770e7712(ArrayList<Integer> a, int n, int k) {
        int maxSum = 0;
        int maxSumEndingHere = 0;
        int maxSumSoFar = 0;
        int maxSumEndingHereReverse = 0;
        int maxSumSoFarReverse = 0;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += a.get(i);
            maxSumEndingHere += a.get(i);
            if(maxSumEndingHere < 0) {
                maxSumEndingHere = 0;
            }
            if(maxSumSoFar < maxSumEndingHere) {
                maxSumSoFar = maxSumEndingHere;
            }
        }
        for(int i = n - 1; i >= 0; i--) {
            maxSumEndingHereReverse += a.get(i);
            if(maxSumEndingHereReverse < 0) {
                maxSumEndingHereReverse = 0;
            }
            if(maxSumSoFarReverse < maxSumEndingHereReverse) {
                maxSumSoFarReverse = maxSumEndingHereReverse;
            }
        }
        if(k == 1) {
            maxSum = maxSumSoFar;
        } else if(k == 2) {
            maxSum = maxSumSoFar + maxSumSoFarReverse;
        } else {
            maxSum = Math.max(maxSumSoFar + maxSumSoFarReverse + (k - 2) * sum, maxSumSoFar + maxSumSoFarReverse);
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_1943ff2c_07d7_4afe_8772_5e98275e4cce(ArrayList<Integer> a, int n, int k) {
        int result = 0;
        int sum = 0;
        // write your code here
        for(int i=0;i<a.size()-k;i++){
            for(int j=0;j<k;j++){
                sum+=a.get(i+j);
            }
            result+=sum;
            sum = 0;
        }
        result+=sum;
        return result;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_c25d4d12_9af5_43c0_ab69_141f01f62c08(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for (int i = 0; i < a.size(); i++) {
            int sum = 0;
            for (int j = i; j < a.size(); j += k) {
                sum += a.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_547b1cf3_60d5_4229_85b4_5e53d2bca533(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
            max_wrap = Math.max(max_wrap, curr_wrap);
        }
        max_wrap = Math.max(max_wrap, 0);
        return Math.max(max_sum, max_wrap * (k - 2) + max_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_f4c64568_b199_4472_8da0_9d6db2cca5ed(ArrayList<Integer> a, int n, int k) {
        int maxSum = 0;
        int maxSumSoFar = 0;
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxSumSoFar += a.get(i);
            if (maxSumSoFar < 0) {
                maxSumSoFar = 0;
            }
            if (maxSum < maxSumSoFar) {
                maxSum = maxSumSoFar;
            }
            if (maxElement < a.get(i)) {
                maxElement = a.get(i);
            }
        }
        if (maxSum == 0) {
            return maxElement;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        int maxSumRepeated = sum * (k - 2) + maxSum;
        int maxSumCircular = maxSumRepeated > maxSum ? maxSumRepeated : maxSum;
        return maxSumCircular;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_1fc55e5d_c560_4b11_9882_ee44ec773dd3(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        int index = 0;
        ArrayList<Integer> subArrays = new ArrayList<Integer>();
        while(index >= 0) {
            sum = sum + a.get(index);
            if(sum > n) {
                subArrays.add(a.get(index));
            } else {
                index = -index-1;
            }
        }
        ArrayList<Integer> subArraysNew = new ArrayList<Integer>();
        subArrays.addAll(a);
        for(int i = 0; i < k; i++) {
            subArraysNew.addAll(subArrays);
        }
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < a.size(); i++) {
            maxSum = Math.max(maxSum, subArrays.get(i));
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_028cb203_acba_4b98_9494_dc6a01c82d4f(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n * k; i++) {
            curr_sum = (curr_sum + a.get((i % n))) % 1000000007;
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_1943ff2c_07d7_4afe_8772_5e98275e4cce(ArrayList<Integer> a, int n, int k) {
        int result = 0;
        int sum = 0;
        // write your code here
        for(int i=0;i<a.size()-k;i++){
            for(int j=0;j<k;j++){
                sum+=a.get(i+j);
            }
            result+=sum;
            sum = 0;
        }
        result+=sum;
        return result;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_704cf0d1_36b0_4d25_9ca5_5837b1f86975(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0, max_ending_here = 0;
        for(int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if(max_ending_here < 0)
                max_ending_here = 0;
            if(max_sum < max_ending_here)
                max_sum = max_ending_here;
        }
        int max_wrap = 0;
        for(int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_0_704cf0d1_36b0_4d25_9ca5_5837b1f86975(a, n, 1);
        if(max_wrap > max_sum)
            max_sum = max_wrap;
        return max_sum * k;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_5f074b46_2499_48f9_ba64_f881916e616a(ArrayList<Integer> a, int n, int k) {
        // Write your code here
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<a.size(); i++)
        {
            sum += a.get(i);
            if(sum >= max) max = sum;
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_0500dcf2_fc29_4547_a380_0a39b54c6fe4(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_2b2277d5_2c9e_4beb_9824_047c38ed257d(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap > max_wrap) {
                max_wrap = curr_wrap;
            }
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
        }
        max_wrap = max_wrap * (k - 2);
        return Math.max(max_sum, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_88245a2f_b563_49e5_be8a_e6b47ce53ad6(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get( i);
        }
        max_sum = curr_sum;
        for (int i = n; i < n * k; i++) {
            curr_sum += a.get( i %  n) - a.get( (i - n) %  n);
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_efd6606f_68de_4ca7_a5bf_3a4e8c3beecb(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
            if (max_ending_here > max_so_far)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        max_so_far = Math.max(max_so_far, max_wrap * (k - 2));
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_467bb2fc_64c9_45b6_96e0_166f21a85c1a(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_a00105b8_d424_4e2f_91b6_991b323f5825(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0;
        int max_ending_here = 0;
        int max_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        max_sum = sum * k;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
        }
        return Math.max(max_sum, max_so_far);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_f115548f_a2f2_46ef_81a8_c6619b66788f(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (k == 1)
            return max_so_far;
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
            max_ending_here = Math.max(max_ending_here, 0);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        int ans = max_so_far;
        ans = Math.max(ans, max_wrap * (k - 2) + max_so_far);
        return ans;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_b88c9b21_70b9_4955_9fcf_1fe9b18d1bc7(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap > max_wrap) {
                max_wrap = curr_wrap;
            }
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
        }
        int ans = Math.max(max_sum, max_wrap + (k - 2) * max_wrap);
        return ans;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_9e6409ac_5ebe_44ca_b0e9_28d8e48d7d79(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get( i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get( i);
            a.set( i, a.get( i) * -1);
        }
        max_wrap = max_wrap * k;
        max_so_far = Math.max(max_so_far, max_wrap);
        max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get( i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_88c2fac4_02da_439a_9cd5_5d9b0dd06fec(ArrayList<Integer> a, int n, int k) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < n; i++) {
            currSum += a.get(i);
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        int maxPrefixSum = 0;
        int maxSuffixSum = 0;
        currSum = 0;
        for (int i = 0; i < n; i++) {
            currSum += a.get(i);
            maxPrefixSum = Math.max(maxPrefixSum, currSum);
        }
        currSum = 0;
        for (int i =  (n - 1); i >= 0; i--) {
            currSum += a.get(i);
            maxSuffixSum = Math.max(maxSuffixSum, currSum);
        }
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += a.get(i);
        }
        int ans = 0;
        if (k == 1) {
            ans = maxSum;
        } else if (totalSum > 0) {
            ans = Math.max(maxSum, maxPrefixSum + maxSuffixSum + (k - 2) * totalSum);
        } else {
            ans = Math.max(maxSum, maxPrefixSum + maxSuffixSum);
        }
        return ans;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_e7884edf_11fa_4576_a9ed_c52e41b89b9d(ArrayList<Integer> a, int n, int k) {
        // Write your code here
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_1_e7884edf_11fa_4576_a9ed_c52e41b89b9d(a, n, 1);
        if (max_wrap > max_so_far)
            return max_wrap;
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_8aa9dcb4_4214_4f9d_a29d_8c304fb4ff36(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
            max_ending_here = Math.max(max_ending_here, 0);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        max_wrap = max_wrap * k;
        if (max_wrap > 0)
            max_so_far = Math.max(max_so_far, max_wrap);
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_e629903e_eff5_4fa9_a86f_101da5be1d46(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int max_ending_here = 0;
        int max_so_far = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        max_so_far = sum;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        max_sum = max_so_far * k;
        if (max_sum < sum)
            max_sum = sum;
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_dfa24aed_8297_462f_ac52_e59a3fa92c9e(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        int max_sum = 0;
        int max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_sum < max_ending_here)
                max_sum = max_ending_here;
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_5519e66c_d34e_44aa_b078_aa94f2f1764b(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_f115548f_a2f2_46ef_81a8_c6619b66788f(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (k == 1)
            return max_so_far;
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
            max_ending_here = Math.max(max_ending_here, 0);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        int ans = max_so_far;
        ans = Math.max(ans, max_wrap * (k - 2) + max_so_far);
        return ans;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_e8c993a3_f267_4ffe_af9c_1532ae1e9b03(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int max_ending_here = 0;
        int max_so_far = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        max_so_far = sum;
        for (int i = 0; i < n; i++) {
            max_ending_here += a.get(i);
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
        }
        max_sum = Math.max(max_so_far, max_sum);
        if (k == 1) {
            return max_sum;
        }
        max_sum = Math.max(max_sum, sum * (k - 2) + max_so_far);
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_6f1fe79f_0270_4a98_8f76_5cf586607842(ArrayList<Integer> a, int n, int k) {
        int max_sum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + a.get(i);
            if (max_sum < sum) {
                max_sum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap = max_wrap + a.get(i);
            a.set(i, a.get(i) * -1);
        }
        int max_wrap_sum = maxSubArraySumRepeated_Problem_1_6f1fe79f_0270_4a98_8f76_5cf586607842(a, n, 1);
        max_wrap = max_wrap + max_wrap_sum;
        if (max_wrap > max_sum) {
            max_sum = max_wrap;
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_d2c41707_77e4_4a97_896c_70622aa66852(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        int sumOfSubArray = 0;
        
        // Sort the array arrayList in ascending order in O(nlogn)
        Collections.sort(a);
        // Create an empty list which will store all the numbers which will repeat k times
        ArrayList<Integer> list = new ArrayList<>();
        // Store the count for k
        int count = 0;
        
        // For all the k times repeating the array
        for(int i = 0; i < k; i++){
            list.clear();
            
            // For all the i times repeating the array
            for(int j = 0; j < i; j++){
                list.add(a.get(j));
            }
            
            // The current sum will be equal to 
            // sumOfSubArray
            sumOfSubArray = 0;
            
            // For all the k times repeating the array
            for(int j = 0; j < list.size(); j++){
                sumOfSubArray += list.get(j);
            }
            
            sum += sumOfSubArray;
            count++;
        }
        
        return sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_10718bed_f4fe_4cc6_bbe9_631c57a9b3e0(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_d29b6652_5aeb_44a0_80d4_d5139b316621(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        max_sum = sum;
        for (int i = 0; i < n; i++) {
            sum = sum - a.get(i) + a.get( ((i + n) % n));
            max_sum = Math.max(max_sum, sum);
        }
        return max_sum * k;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_8002f859_8448_418f_a023_0b6e18f1e8e2(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for(int i = 0; i < a.size(); i++) {
            int sum = 0;
            for(int j = i; j < a.size(); j++) {
                sum += a.get(j);
                if(sum < 0) {
                    sum = 0;
                }
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_e6a398b9_a608_432a_bb45_090b833e0ba9(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
        }
        max_sum = curr_sum;
        for (int i = 0; i < n; i++) {
            curr_sum += (k - 1) * a.get(i);
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_5d1352f7_02b6_4c33_b30b_ef49b385992c(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        int left = 0;
        int right = a.size()-1;
        int maxSum = 0;
        
        while(left <= right) {
            sum += a.get(left);
            if(sum > k) {
                sum -= k;
                left++;
                continue;
            }
            
            sum += a.get(right);
            if(sum > k) {
                sum -= k;
                right--;
                continue;
            }
            
            int thisSum = sum;
            sum += a.get(left);
            if(sum > k) {
                sum -= k;
                left++;
            }
            
            sum += a.get(right);
            if(sum > k) {
                sum -= k;
                right--;
            }
            
            if(maxSum < thisSum) {
                maxSum = thisSum;
            }
        }
        
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_74ad5b0d_ab0f_4b9a_a7a9_d546d0ecbab3(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
            max_wrap = Math.max(max_wrap, curr_wrap);
        }
        max_wrap = Math.max(max_wrap, 0);
        return Math.max(max_sum, max_wrap * (k - 2) + max_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_f8e08938_2b9f_48c1_8308_8bfb22ea4c00(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
        }
        max_sum = curr_sum;
        for (int i = 0; i < n; i++) {
            curr_sum += (k - 1) * a.get(i);
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_b5c7d1e0_90c9_4ed4_befd_fba607d3c9cf(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0;
        int max_ending_here = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            max_ending_here = Math.max(max_ending_here + a.get(i), 0);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here = Math.max(max_ending_here + a.get(i), 0);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        max_wrap = Math.max(max_wrap, 0);
        if (k == 1) {
            return max_so_far;
        }
        return Math.max(max_so_far, max_wrap * (k - 2) + sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_5a4440ca_af19_4987_9917_881a664b550e(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
            if (max_ending_here > max_wrap)
                max_wrap = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_non_wrap = max_so_far;
        if (max_wrap > max_non_wrap)
            return (max_wrap * k) - max_wrap;
        else
            return (max_non_wrap * k);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_03c93aa3_3533_435d_972d_55c11a01b000(ArrayList<Integer> a, int n, int k) {
        // Write your code here
        int sum = 0;
        int count = 0;
        for(int i = 0; i < a.size(); i++) {
            for(int j = 0; j < a.size() - i; j++) {
                sum = a.get(j) + a.get(j + i);
                if(count >= k && sum > sum) {
                    sum = sum;
                }
                count++;
            }
        }
        return sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_b70796c7_9ade_4838_bedb_2317671f7f80(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get( i);
        }
        for (int i = 0; i < n; i++) {
            curr_sum += a.get( i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get( i);
            a.set( i, a.get( i) * -1);
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_2_b70796c7_9ade_4838_bedb_2317671f7f80(a, n, 1);
        return Math.max(max_sum, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_5010e500_f36c_4d6b_bd3d_e9960585bc4d(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        int max_element = 0;
        for (int i = 0; i < n; i++) {
            max_element = Math.max(max_element, a.get(i));
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (max_element < 0) {
            return max_element;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        int ans = Math.max(max_sum, sum * k);
        int prefix = 0;
        for (int i = 0; i < n; i++) {
            prefix += a.get(i);
            int suffix = sum - prefix;
            ans = Math.max(ans, prefix + suffix * (k - 1));
        }
        return ans;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_326567b5_8342_4635_a391_60384fc5f259(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_e5d96fa3_abb1_498c_9e7e_71d101a959cb(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0;
        int max_ending_here = 0;
        int max_element = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max_element = Math.max(max_element, a.get(i));
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (max_element < 0)
            return max_element;
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += a.get(i);
        int max_wrap = sum * k;
        int max_non_wrap = max_so_far;
        return Math.max(max_wrap, max_non_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_0ccdd1d0_3713_432b_becd_a75f8e935ffe(ArrayList<Integer> a, int n, int k) {
        int maxSum = 0;
        int sum = 0;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i = 0; i < k; i++) {
            for(int j = 0; j < n; j++) {
                temp.add(a.get(j));
            }
            sum = 0;
            for(int j = 0; j < temp.size(); j++) {
                sum += temp.get(j);
            }
            if(sum > maxSum) {
                maxSum = sum;
            }
            temp.remove(0);
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_b15bff6f_5cac_4b0f_b243_c648a182e027(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        int max_sum = Integer.MIN_VALUE;
        int min_sum = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            sum += a.get(i);
            if (min_sum > sum) {
                min_sum = sum;
            }
        }
        if (k == 1) {
            return max_so_far;
        }
        int max_wrap = sum - min_sum;
        if (max_wrap > 0) {
            return Math.max(max_wrap, max_so_far + (k - 2) * sum);
        } else {
            return Math.max(max_wrap, max_so_far);
        }
    }

    
    public static int maxSubArraySumRepeated_Problem_2_d14d4c06_98c8_4d1c_84e8_e0aac6d02713(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for (int i = 0; i < a.size(); i++) {
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum += a.get(i);
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_fbfb4217_9bb3_4b1d_9291_208935ed0bd9(ArrayList<Integer> a, int n, int k) {
        // Write your code here
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_1_fbfb4217_9bb3_4b1d_9291_208935ed0bd9(a, n, k);
        return Math.max(max_so_far, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_a7fa060f_c04f_4c7a_8ef2_e0cecdbda04b(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
            max_wrap = Math.max(max_wrap, curr_wrap);
        }
        max_wrap = Math.max(max_wrap, 0);
        return Math.max(max_sum, max_wrap * (k - 2) + max_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_a98f8c44_8a94_41f9_b9bd_42c192f88cf4(ArrayList<Integer> a, int n, int k) {
        // Write your code here
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_2_a98f8c44_8a94_41f9_b9bd_42c192f88cf4(a, n, k);
        return Math.max(max_so_far, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_5b9e7b50_ca28_47b7_975a_e3970a2b92c6(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        max_wrap = max_wrap * k;
        max_so_far = Math.max(max_so_far, max_wrap);
        max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_a96db8a6_c8ab_446c_b844_8b63dd293210(ArrayList<Integer> a, int n, int k) {
        int largestSum = 0; // initialize largest sum
        int sum = 0; // initialize sum
        ArrayList<Integer> aCopy = new ArrayList<>(a); // copy the array list
        for (int i = 0; i < k; i++) {
            sum = 0; // reset the sum
            for (int j = 0; j < a.size(); j++) {
                sum += aCopy.get(j); // add every number in the array list to the sum
                aCopy.remove(j); // remove the current number from the array
            }
            largestSum = Math.max(largestSum, sum); // find the largest sum
        }
        return largestSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_04ed3aab_cf2c_4a29_90da_4c9d87a67a8d(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
            max_wrap = Math.max(max_wrap, curr_wrap);
        }
        max_wrap = Math.max(max_wrap, 0);
        return Math.max(max_sum, max_wrap * (k - 2) + max_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_e5d96fa3_abb1_498c_9e7e_71d101a959cb(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0;
        int max_ending_here = 0;
        int max_element = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max_element = Math.max(max_element, a.get(i));
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (max_element < 0)
            return max_element;
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += a.get(i);
        int max_wrap = sum * k;
        int max_non_wrap = max_so_far;
        return Math.max(max_wrap, max_non_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_3515b970_47f0_4987_8ea2_2b9c26a582e3(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
            if (max_ending_here > max_so_far)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        if (max_wrap > 0)
            return Math.max(max_so_far, max_wrap * (k - 2) + max_so_far);
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_5cdb98a3_47ff_4901_8618_58853b4e2814(ArrayList<Integer> a, int n, int k) {
        int largest = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += a.get(i);
            largest = sum > largest ? sum : largest;
        }
        return largest;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_670c1420_063b_40a4_9732_d708cd7f51dc(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_857ba88a_3805_4689_9aa2_2ae26511621d(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            if (curr_sum > max_wrap) {
                max_wrap = curr_sum;
            }
        }
        if (sum > 0) {
            return Math.max(max_wrap + (k - 2) * sum, max_sum);
        }
        return Math.max(max_wrap, max_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_4e025298_7066_4bae_a954_eecde695a7eb(ArrayList<Integer> a, int n, int k) {
        int maxSum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get( i);
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        if (k == 1) {
            return maxSum;
        }
        int maxPrefixSum = 0;
        int maxSuffixSum = 0;
        int totalSum = sum;
        for (int i = 0; i < n; i++) {
            maxPrefixSum += a.get( i);
            if (maxPrefixSum > maxSum) {
                maxSum = maxPrefixSum;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            maxSuffixSum += a.get( i);
            if (maxSuffixSum > maxSum) {
                maxSum = maxSuffixSum;
            }
        }
        if (totalSum > 0) {
            maxSum = Math.max(maxSum, totalSum * (k - 2) + maxPrefixSum + maxSuffixSum);
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_bfdca14f_e662_46d0_b734_1599186a77b7(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_sum < max_ending_here)
                max_sum = max_ending_here;
        }
        if (k == 1)
            return max_sum;
        int max_sum_circular = max_sum;
        int curr_max = 0;
        for (int i = 0; i < n; i++) {
            curr_max = curr_max + a.get(i);
            max_sum_circular = max_sum_circular + a.get(i);
        }
        if (max_sum_circular > max_sum)
            max_sum = max_sum_circular;
        for (int i = 0; i < n; i++) {
            curr_max = curr_max - a.get(i);
            if (curr_max > max_sum)
                max_sum = curr_max;
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_d14d4c06_98c8_4d1c_84e8_e0aac6d02713(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for (int i = 0; i < a.size(); i++) {
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum += a.get(i);
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_d99f87fe_4287_4928_9558_58da97b0f446(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int max_ending_here = 0;
        int max_so_far = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        for (int i = 0; i < n; i++) {
            max_ending_here += a.get(i);
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
        }
        max_sum = max_so_far;
        if (k > 1) {
            max_sum = Math.max(max_sum, sum * (k - 2) + max_so_far);
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_aaf8152f_8b90_4d32_acd5_d20facc346f3(ArrayList<Integer> a, int n, int k) {
        int maxSum = 0;
        int currSum = 0;
        int maxElement = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            maxElement = Math.max(maxElement, a.get(i));
            sum += a.get(i);
            currSum += a.get(i);
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        if (k == 1) {
            return maxSum;
        }
        if (maxElement < 0) {
            return maxElement;
        }
        int maxSumRepeated = sum * (k - 2);
        maxSumRepeated += maxSum;
        return Math.max(maxSumRepeated, maxSum);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_ddf1781e_099c_422e_a7d4_3601b3a6d42f(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for (int i = 0; i < a.size(); i++) {
            int sum = 0;
            for (int j = i; j < a.size(); j += k) {
                sum += a.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_6c6b36d0_c332_46a4_a561_60a9d9717555(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
            if (max_ending_here > max_so_far)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        max_so_far = Math.max(max_so_far, max_wrap * (k - 2));
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_19d1be66_08fc_41b5_ad43_9d0e88d76915(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        if (k == 1)
            return max_so_far;
        int max_val = 0, min_val = 0;
        for (int i = 0; i < n; i++) {
            max_val += a.get(i);
            min_val = Math.min(min_val, max_val);
        }
        int total_sum = max_val * k;
        int max_wrap = total_sum - min_val;
        return Math.max(max_so_far, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_5827a413_317b_4b7b_9df6_14572c31303b(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for(int i = 0; i < a.size(); i++) {
            int sum = 0;
            for(int j = i; j < a.size(); j++) {
                sum += a.get(j);
                if(sum > max) {
                    max = sum;
                }
                if(sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_5e9d3dae_dd5c_4822_8244_6daf74e038be(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for (int i = 0; i < a.size(); i++) {
            int sum = 0;
            for (int j = i; j < a.size(); j += k) {
                sum += a.get(j);
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_5a4440ca_af19_4987_9917_881a664b550e(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
            if (max_ending_here > max_wrap)
                max_wrap = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_non_wrap = max_so_far;
        if (max_wrap > max_non_wrap)
            return (max_wrap * k) - max_wrap;
        else
            return (max_non_wrap * k);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_8016c8a3_84b8_4d93_924b_6a483462071d(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            sum = sum + a.get(i);
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_8aa9dcb4_4214_4f9d_a29d_8c304fb4ff36(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
            max_ending_here = Math.max(max_ending_here, 0);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        max_wrap = max_wrap * k;
        if (max_wrap > 0)
            max_so_far = Math.max(max_so_far, max_wrap);
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_01dcc738_e80f_4c6e_a3df_a993d864d4c0(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (k == 1)
            return max_so_far;
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_2_01dcc738_e80f_4c6e_a3df_a993d864d4c0(a, n, 1);
        return Math.max(max_so_far, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_5ada410b_86cd_4d6d_ab8f_e328e8d6ccd5(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        maxSum = sum;
        for (int i = 0; i < n; i++) {
            sum = sum - a.get(i) + a.get( (i + n));
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_b0b59154_06d8_477a_b866_b6b29b3f5287(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        int min_wrap = 0;
        curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            min_wrap = Math.min(min_wrap, curr_sum);
        }
        int ans = max_wrap + (k - 2) * min_wrap + max_sum;
        return Math.max(ans, max_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_ef1caa91_8532_4b28_a4a6_ba62db706756(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for (int i = 0; i < a.size(); i++) {
            int sum = 0;
            for (int j = i; j < a.size(); j += k) {
                sum += a.get(j);
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_d7b73bf6_1f63_4f10_b3a7_9bc46c24b9e2(ArrayList<Integer> a, int n, int k) {
        // Write your code here
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
            if (max_ending_here > max_so_far)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        if (max_wrap > 0)
            return Math.max(max_so_far, max_wrap * (k - 2) + max_so_far);
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_f00bae17_63e3_4593_80e6_898fde0e50f9(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < a.size() - k) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_44e062b3_8384_44ef_8261_82607103679d(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        for(int i=0;i<n;i++)
            for(int j=0;j<k;j++)
                sum+=a.get(i)*a.get(j);
        return sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_670c1420_063b_40a4_9732_d708cd7f51dc(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_efd6606f_68de_4ca7_a5bf_3a4e8c3beecb(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
            if (max_ending_here > max_so_far)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        max_so_far = Math.max(max_so_far, max_wrap * (k - 2));
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_9c6f5345_003f_443d_9eec_e1583382af88(ArrayList<Integer> a, int n, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (k == 0) {
            ans.add(a.get(0));
        }
        for (int i = 0; i < k; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += a.get(j);
                ans.add(sum);
            }
        }
        return Collections.max(ans);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_079470ba_f848_40ba_b2ab_e32b921d6ef4(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        max_wrap = max_wrap + max_wrap;
        if (max_wrap > max_sum) {
            max_sum = max_wrap;
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_9c6f5345_003f_443d_9eec_e1583382af88(ArrayList<Integer> a, int n, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (k == 0) {
            ans.add(a.get(0));
        }
        for (int i = 0; i < k; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += a.get(j);
                ans.add(sum);
            }
        }
        return Collections.max(ans);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_8002f859_8448_418f_a023_0b6e18f1e8e2(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for(int i = 0; i < a.size(); i++) {
            int sum = 0;
            for(int j = i; j < a.size(); j++) {
                sum += a.get(j);
                if(sum < 0) {
                    sum = 0;
                }
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_cd95a2c8_ea59_4c9a_96dd_b05bfa1b9832(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int window_sum = 0;
        int window_start = 0;
        for (int i = 0; i < n * k; i++) {
            window_sum += a.get( (i % n));
            if (i >= n) {
                window_sum -= a.get( (window_start % n));
                window_start += 1;
            }
            max_sum = Math.max(max_sum, window_sum);
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_f4c64568_b199_4472_8da0_9d6db2cca5ed(ArrayList<Integer> a, int n, int k) {
        int maxSum = 0;
        int maxSumSoFar = 0;
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxSumSoFar += a.get(i);
            if (maxSumSoFar < 0) {
                maxSumSoFar = 0;
            }
            if (maxSum < maxSumSoFar) {
                maxSum = maxSumSoFar;
            }
            if (maxElement < a.get(i)) {
                maxElement = a.get(i);
            }
        }
        if (maxSum == 0) {
            return maxElement;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        int maxSumRepeated = sum * (k - 2) + maxSum;
        int maxSumCircular = maxSumRepeated > maxSum ? maxSumRepeated : maxSum;
        return maxSumCircular;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_6c6b36d0_c332_46a4_a561_60a9d9717555(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
            if (max_ending_here > max_so_far)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        max_so_far = Math.max(max_so_far, max_wrap * (k - 2));
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_0ae0d805_12d8_42aa_8674_9b6f2434faff(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int max_so_far = 0;
        int max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        max_sum = max_so_far;
        max_so_far = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        max_sum = Math.max(max_sum, max_so_far);
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_67649de2_4782_4a76_a0f1_d8d49a9a63d9(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        int max_element = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max_element = Math.max(max_element, a.get(i));
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (max_element < 0) {
            return max_element;
        }
        int max_wrap = 0;
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
            max_wrap = Math.max(max_wrap, curr_wrap);
        }
        if (k == 1) {
            return max_sum;
        }
        int ans = max_wrap + (k - 2) * curr_wrap + max_sum;
        return ans;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_c43f3077_b534_4e41_91b6_6ea5d8a09bc5(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (k == 1)
            return max_so_far;
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_0_c43f3077_b534_4e41_91b6_6ea5d8a09bc5(a, n, 1);
        return Math.max(max_so_far, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_88245a2f_b563_49e5_be8a_e6b47ce53ad6(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get( i);
        }
        max_sum = curr_sum;
        for (int i = n; i < n * k; i++) {
            curr_sum += a.get( i %  n) - a.get( (i - n) %  n);
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_2c3b7711_867b_42f0_986c_9d28c814cd0e(ArrayList<Integer> a, int n, int k) {
        int maxSum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        maxSum = sum;
        for (int i = 0; i < n; i++) {
            sum -= a.get(i);
            sum += a.get(i) * k;
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_d9e58a93_ae4e_4a91_bbae_635569deec6b(ArrayList<Integer> a, int n, int k) {
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++)
                sum += a.get(j);
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_408113fb_cc03_4dbb_9c1f_a1c5ee839e43(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_da1cb5a8_edac_4502_b51b_f46a3c667951(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (k == 1)
            return max_so_far;
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        int max_wrap_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_wrap_ending_here += a.get(i);
            if (max_wrap_ending_here < 0)
                max_wrap_ending_here = 0;
            if (max_wrap < max_wrap_ending_here)
                max_wrap = max_wrap_ending_here;
        }
        int ans = max_so_far + (k - 2) * max_wrap;
        return Math.max(ans, max_so_far);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_7122830b_8c4d_4801_8163_5b9103177290(ArrayList<Integer> a, int n, int k) {
        int sum = 0; // Initialize sum to zero

        // Iterate over every element in the array
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i); // Add the element to the sum

            // Repeat the element k times
            for (int j = 0; j < k; j++) {
                a.set(i, sum); // Add the sum to the element
                sum = 0; // Reset the sum
            }
        }

        // Return the sum of the final element
        return sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_0ccdd1d0_3713_432b_becd_a75f8e935ffe(ArrayList<Integer> a, int n, int k) {
        int maxSum = 0;
        int sum = 0;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i = 0; i < k; i++) {
            for(int j = 0; j < n; j++) {
                temp.add(a.get(j));
            }
            sum = 0;
            for(int j = 0; j < temp.size(); j++) {
                sum += temp.get(j);
            }
            if(sum > maxSum) {
                maxSum = sum;
            }
            temp.remove(0);
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_f00bae17_63e3_4593_80e6_898fde0e50f9(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < a.size() - k) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_375d02dc_0bb2_41cb_82b4_80861bed44bc(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for(int i = 0; i < a.size(); i++) {
            int sum = 0;
            for(int j = i; j < a.size(); j++) {
                sum += a.get(j);
                if(sum < 0) {
                    sum = 0;
                }
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_01dcc738_e80f_4c6e_a3df_a993d864d4c0(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (k == 1)
            return max_so_far;
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_0_01dcc738_e80f_4c6e_a3df_a993d864d4c0(a, n, 1);
        return Math.max(max_so_far, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_ab5aebc3_4c40_425d_9d4f_31a835022ace(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            if (sum > max_sum) {
                max_sum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        int max_wrap_sum = maxSubArraySumRepeated_Problem_1_ab5aebc3_4c40_425d_9d4f_31a835022ace(a, n, 1);
        max_wrap = max_wrap + max_wrap_sum;
        if (max_wrap > max_sum) {
            max_sum = max_wrap;
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_739c3e27_f32d_4f21_a53f_05008b0a359d(ArrayList<Integer> a, int n, int k) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum += a.get(i);
                i++;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_16bc86ed_8a1c_4b95_92ce_7293f31772b7(ArrayList<Integer> a, int n, int k) {
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;
        for (int i = 0; i < n * k; i++) {
            curr_sum = curr_sum + a.get( (i % n));
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_fa66c64c_53d8_4f11_a237_06de5e76a984(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_2_fa66c64c_53d8_4f11_a237_06de5e76a984(a, n, 1);
        return Math.max(max_sum, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_69c8dd6a_5595_4a7e_a13c_1badaa0daefa(ArrayList<Integer> a, int n, int k) {
        int sum = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            sum = sum + a.get(i);
            if (sum > max)
                max = sum;
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_d7d1893e_fd72_4847_ad1a_2b94ddea5b96(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
            if (max_ending_here > max_so_far)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        max_so_far = Math.max(max_so_far, max_wrap * (k - 2));
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_7f114fe3_9210_4657_bd5d_04f787faa448(ArrayList<Integer> a, int n, int k) {
        // write your code here
        int max = 0, cur = 0;
        for(int i=0; i < k; i++){
            cur = 0;
            for(int j=a.size()-1; j>=0; j--){
                cur += a.get(j);
                if(cur > max){
                    max = cur;
                }
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_8da6cdac_9e16_4d17_810a_9fc4c47d128a(ArrayList<Integer> a, int n, int k) {
        // TODO: Add code here
        int largestSum = 0;
        ArrayList <Integer> repeatedArray = new ArrayList<>();
        ArrayList <Integer> modifiedArray = new ArrayList<>();
        for(int i=0;i<k;i++){
            repeatedArray.addAll(a);
            repeatedArray.remove(i+1);
            modifiedArray.addAll(repeatedArray);
            modifiedArray.remove(i);
            modifiedArray.remove(i-1);
        }
        int repeatedCount = 0;
        int modifiedCount = 0;
        int maxIndex = 0;
        for(int i =0;i<modifiedArray.size();i++){
            repeatedCount = modifiedArray.size()-i;
            if(modifiedArray.size()-i == repeatedCount){
                largestSum = modifiedArray.get(i);
            }
        }
        return largestSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_a2dd595a_1d3a_43f9_90d8_1719d01e26e1(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for (int i = 0; i < a.size(); i++) {
            int sum = 0;
            for (int j = i; j < a.size(); j += k) {
                sum += a.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_43894cc7_330c_4c0e_b0ee_d06ac985a46c(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0)
                curr_sum = 0;
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1)
            return max_sum;
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0)
                curr_sum = 0;
            max_sum = Math.max(max_sum, curr_sum);
        }
        max_wrap = max_wrap + curr_sum;
        if (max_wrap > max_sum)
            return (k - 2) * max_wrap + max_sum;
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_49657622_888b_493f_8257_fefa1f2e2f3c(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int max_ending_here = 0;
        int max_so_far = 0;
        int max_element = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max_element = Math.max(max_element, a.get(i));
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
        }
        if (max_so_far == 0) {
            return max_element;
        }
        max_sum = max_so_far;
        for (int i = 0; i < n; i++) {
            max_sum = max_sum + a.get(i);
        }
        max_sum = Math.max(max_sum, max_so_far);
        for (int i = 2; i < k; i++) {
            max_so_far = 0;
            max_ending_here = 0;
            for (int j = 0; j < n; j++) {
                max_ending_here = max_ending_here + a.get(j);
                if (max_ending_here < 0) {
                    max_ending_here = 0;
                }
                if (max_so_far < max_ending_here) {
                    max_so_far = max_ending_here;
                }
            }
            max_sum = Math.max(max_sum, max_so_far);
            max_sum = Math.max(max_sum, max_so_far + max_sum);
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_efd6606f_68de_4ca7_a5bf_3a4e8c3beecb(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
            if (max_ending_here > max_so_far)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        max_so_far = Math.max(max_so_far, max_wrap * (k - 2));
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_d7d1893e_fd72_4847_ad1a_2b94ddea5b96(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
            if (max_ending_here > max_so_far)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        max_so_far = Math.max(max_so_far, max_wrap * (k - 2));
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_01dcc738_e80f_4c6e_a3df_a993d864d4c0(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (k == 1)
            return max_so_far;
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_1_01dcc738_e80f_4c6e_a3df_a993d864d4c0(a, n, 1);
        return Math.max(max_so_far, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_6f22b65e_1e32_4963_8e8c_47294b59aaf5(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for (int i = 0; i < a.size(); i++) {
            int sum = 0;
            for (int j = i; j < a.size(); j += k) {
                sum += a.get(j);
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_7aa20cc2_e8f1_4172_9f34_fa7f980b1e2e(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for(int i = 0; i < a.size(); i++) {
            int sum = 0;
            for(int j = i; j < a.size(); j += k) {
                sum += a.get(j);
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_75db17a4_8bac_46db_8ffc_f6e14053af3c(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_1e139638_e491_49ca_bef7_3b27825278f3(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            curr_sum = curr_sum % n;
            max_wrap = Math.max(max_wrap, curr_sum);
        }
        int ans1 = max_wrap + (k - 2) * sum;
        int ans2 = max_sum;
        return Math.max(ans1, ans2);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_c6e764c6_c2e0_4803_b203_7f2667fa56f4(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        int j = 0;
        for (int i = 1; i <= n; i++) {
            int m = k - 1;
            while (m > 0 && j < a.size() - 1) {
                m--;
                j++;
            }
            sum += a.get(j);
            sum -= a.get(j + 1);
            j = i;
        }
        return sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_4935d86c_bc4e_4dd2_9045_d2a0eb0814e0(ArrayList<Integer> a, int n, int k) {
        // Write your code here
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        if (k == 1)
            return max_so_far;
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
        }
        if (max_wrap > 0)
            return Math.max(max_so_far, max_wrap * (k - 2) + max_ending_here);
        else
            return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_857ba88a_3805_4689_9aa2_2ae26511621d(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            if (curr_sum > max_wrap) {
                max_wrap = curr_sum;
            }
        }
        if (sum > 0) {
            return Math.max(max_wrap + (k - 2) * sum, max_sum);
        }
        return Math.max(max_wrap, max_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_5d1352f7_02b6_4c33_b30b_ef49b385992c(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        int left = 0;
        int right = a.size()-1;
        int maxSum = 0;
        
        while(left <= right) {
            sum += a.get(left);
            if(sum > k) {
                sum -= k;
                left++;
                continue;
            }
            
            sum += a.get(right);
            if(sum > k) {
                sum -= k;
                right--;
                continue;
            }
            
            int thisSum = sum;
            sum += a.get(left);
            if(sum > k) {
                sum -= k;
                left++;
            }
            
            sum += a.get(right);
            if(sum > k) {
                sum -= k;
                right--;
            }
            
            if(maxSum < thisSum) {
                maxSum = thisSum;
            }
        }
        
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_3466af45_7362_449a_aa55_fa0521b3c51d(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        int max_sum = 0;
        int max_ending_here = 0;
        int max_so_far = 0;
        int max_element = Integer.MIN_VALUE;
        int sum_of_all_elements = 0;
        for (int i = 0; i < n; i++) {
            sum_of_all_elements += a.get(i);
            max_element = Math.max(max_element, a.get(i));
        }
        if (k == 1) {
            for (int i = 0; i < n; i++) {
                max_ending_here += a.get(i);
                if (max_ending_here < 0) {
                    max_ending_here = 0;
                }
                if (max_so_far < max_ending_here) {
                    max_so_far = max_ending_here;
                }
            }
            return max_so_far;
        }
        for (int i = 0; i < n; i++) {
            max_ending_here += a.get(i);
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
        }
        if (max_so_far == 0) {
            return max_element;
        }
        max_sum = max_so_far;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            max_sum = Math.max(max_sum, sum);
            max_sum = Math.max(max_sum, sum + max_so_far * (k - 2));
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_66c89115_17c3_4a65_869e_4ebc1d57d423(ArrayList<Integer> a, int n, int k) {
        ArrayList<Integer> sum = new ArrayList<Integer>();
        int maxSum = 0;
        // Create a list to store all the sums of the sub-array and store it in the list sum
        for(int i = 0; i < k; i++){
            sum.add(0L);
        }
        for(int i = 0; i < n; i++){
            int index = 0;
            for(int j = 0; j < k; j++){
                if(j >= sum.get(j)) {
                    index++;
                }
                sum.set(j, index+sum.get(j));
            }
            maxSum = Math.max(maxSum, sum.get(0));
            sum.remove(0);
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_ce66c73d_9a15_4602_a5f4_d915176bd34d(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_sum < max_ending_here)
                max_sum = max_ending_here;
        }
        int min_sum = 0;
        int min_ending_here = 0;
        for (int i = 0; i < n; i++) {
            min_ending_here = min_ending_here + a.get(i);
            if (min_ending_here > 0)
                min_ending_here = 0;
            if (min_sum > min_ending_here)
                min_sum = min_ending_here;
        }
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += a.get(i);
        if (k == 1)
            return max_sum;
        else
            return Math.max(max_sum, sum * k - min_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_69c8dd6a_5595_4a7e_a13c_1badaa0daefa(ArrayList<Integer> a, int n, int k) {
        int sum = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            sum = sum + a.get(i);
            if (sum > max)
                max = sum;
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_5827a413_317b_4b7b_9df6_14572c31303b(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for(int i = 0; i < a.size(); i++) {
            int sum = 0;
            for(int j = i; j < a.size(); j++) {
                sum += a.get(j);
                if(sum > max) {
                    max = sum;
                }
                if(sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_cdb1afcf_2595_472e_8440_8f9da1cead62(ArrayList<Integer> a, int n, int k) {
        // Write your code here
        int max_so_far = 0;
        int max_ending_here = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            max_ending_here = Math.max(max_ending_here + a.get(i), a.get(i));
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_1_cdb1afcf_2595_472e_8440_8f9da1cead62(a, n, 1);
        if (max_wrap > max_so_far && max_wrap != 0)
            max_so_far = max_wrap;
        return max_so_far * k;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_eb306d1d_df8f_497a_bb8a_bd7ebe45625e(ArrayList<Integer> a, int n, int k) {
        int sum = 0, start = 0;
        ArrayList<Integer> b = new ArrayList<>();
        for(int i = 0; i < n; i++){
            b.add(a.get(i));
        }
        for(int i = 1; i < k; i++){
            sum = 0;
            for(int j = 0; j < n; j++){
                sum+=b.get(j);
            }
            b.add(sum);
        }
        sum = 0;
        for(int j = 0; j < n; j++){
            sum+=b.get(j);
        }
        return sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_0a320363_acd7_46a0_8ab2_5d63504fb66c(ArrayList<Integer> a, int n, int k) {
        // Write your code here
        int max_so_far = 0;
        int max_ending_here = 0;
        int max_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            max_ending_here += a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        max_sum = max_so_far;
        if (sum > 0)
            max_sum += (k - 2) * sum;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            max_ending_here += a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (max_so_far > max_sum)
            max_sum = max_so_far;
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_fbfb4217_9bb3_4b1d_9291_208935ed0bd9(ArrayList<Integer> a, int n, int k) {
        // Write your code here
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_2_fbfb4217_9bb3_4b1d_9291_208935ed0bd9(a, n, k);
        return Math.max(max_so_far, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_02cc070a_195d_4db8_bccb_c51728460eeb(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i >= k) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_bc74d4d6_22d3_4371_993d_3eed4ab821e9(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get( i);
            if (curr_sum < 0)
                curr_sum = 0;
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1)
            return max_sum;
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get( i);
            a.set( i, -a.get( i));
        }
        int max_wrap_sum = maxSubArraySumRepeated_Problem_1_bc74d4d6_22d3_4371_993d_3eed4ab821e9(a, n, 1);
        max_wrap = max_wrap + max_wrap_sum;
        return Math.max(max_sum, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_cd0b8145_d915_48f7_8984_0e90c7071209(ArrayList<Integer> a, int n, int k) {
        int maxSum = 0;
        int sum = 0;
        ArrayList <Integer> newArr = new ArrayList <Integer> (a.size());
        for( int i = 1 ; i < k ; i++ ) {
            sum = sum + a.get (i) - a.get (0);
            newArr.add (sum);
            sum = 0;
        }
        for( int i = 0 ; i < a.size()-k ; i++ ) {
            sum = a.get(i) + newArr.get(i);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_88c2fac4_02da_439a_9cd5_5d9b0dd06fec(ArrayList<Integer> a, int n, int k) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < n; i++) {
            currSum += a.get(i);
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        int maxPrefixSum = 0;
        int maxSuffixSum = 0;
        currSum = 0;
        for (int i = 0; i < n; i++) {
            currSum += a.get(i);
            maxPrefixSum = Math.max(maxPrefixSum, currSum);
        }
        currSum = 0;
        for (int i =  (n - 1); i >= 0; i--) {
            currSum += a.get(i);
            maxSuffixSum = Math.max(maxSuffixSum, currSum);
        }
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += a.get(i);
        }
        int ans = 0;
        if (k == 1) {
            ans = maxSum;
        } else if (totalSum > 0) {
            ans = Math.max(maxSum, maxPrefixSum + maxSuffixSum + (k - 2) * totalSum);
        } else {
            ans = Math.max(maxSum, maxPrefixSum + maxSuffixSum);
        }
        return ans;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_84449ab4_e4b5_41bf_8701_c3320bf14e6d(ArrayList<Integer> a, int n, int k) {
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;
        for (int i = 0; i < n * k; i++) {
            curr_sum += a.get( (i % n));
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_6d4c206d_cdff_4437_b014_2e33860d8fe1(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_5ada410b_86cd_4d6d_ab8f_e328e8d6ccd5(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        maxSum = sum;
        for (int i = 0; i < n; i++) {
            sum = sum - a.get(i) + a.get( (i + n));
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_c6e764c6_c2e0_4803_b203_7f2667fa56f4(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        int j = 0;
        for (int i = 1; i <= n; i++) {
            int m = k - 1;
            while (m > 0 && j < a.size() - 1) {
                m--;
                j++;
            }
            sum += a.get(j);
            sum -= a.get(j + 1);
            j = i;
        }
        return sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_b5c7d1e0_90c9_4ed4_befd_fba607d3c9cf(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0;
        int max_ending_here = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            max_ending_here = Math.max(max_ending_here + a.get(i), 0);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here = Math.max(max_ending_here + a.get(i), 0);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        max_wrap = Math.max(max_wrap, 0);
        if (k == 1) {
            return max_so_far;
        }
        return Math.max(max_so_far, max_wrap * (k - 2) + sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_40ffb74f_8580_460d_8156_999e69aaa143(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_16bc86ed_8a1c_4b95_92ce_7293f31772b7(ArrayList<Integer> a, int n, int k) {
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;
        for (int i = 0; i < n * k; i++) {
            curr_sum = curr_sum + a.get( (i % n));
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_fa257d72_6c72_4a4c_9f83_26110f6950a9(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0)
                curr_sum = 0;
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1)
            return max_sum;
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        int max_wrap_sum = maxSubArraySumRepeated_Problem_2_fa257d72_6c72_4a4c_9f83_26110f6950a9(a, n, 1);
        max_wrap = max_wrap + max_wrap_sum;
        return Math.max(max_wrap, max_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_5ad767f6_05ed_4bb4_b87f_59ad11b8e883(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum = Math.max(a.get(i), curr_sum + a.get(i));
            max_sum = Math.max(max_sum, curr_sum);
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum = Math.max(a.get(i), curr_sum + a.get(i));
            max_sum = Math.max(max_sum, curr_sum);
        }
        max_wrap = max_wrap * k + max_sum;
        return Math.max(max_wrap, max_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_4fd239b5_5225_4e8d_8ce0_4010b7501397(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int current_sum = 0;
        for (int i = 0; i < n; i++) {
            current_sum += a.get(i);
            if (current_sum < 0) {
                current_sum = 0;
            }
            max_sum = Math.max(max_sum, current_sum);
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        current_sum = 0;
        for (int i = 0; i < n; i++) {
            current_sum += a.get(i);
            if (current_sum < 0) {
                current_sum = 0;
            }
            max_sum = Math.max(max_sum, current_sum);
        }
        max_sum = Math.max(max_sum, max_wrap * (k - 2));
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_d7d1893e_fd72_4847_ad1a_2b94ddea5b96(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
            if (max_ending_here > max_so_far)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        max_so_far = Math.max(max_so_far, max_wrap * (k - 2));
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_39dd8a0b_360a_4850_95cd_128444d6ce90(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_a332ee7e_113f_4626_8ff1_3f188319b7f1(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for (int i = 0; i < a.size(); i++) {
            int sum = 0;
            for (int j = i; j < a.size(); j += k) {
                sum += a.get(j);
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_8e6ed806_6590_4b52_acf8_4715e494e753(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get( i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get( i);
            a.set( i, -a.get( i));
        }
        int min_wrap = 0;
        curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get( i);
            if (curr_sum > 0) {
                curr_sum = 0;
            }
            min_wrap = Math.min(min_wrap, curr_sum);
        }
        max_wrap = max_wrap + min_wrap;
        if (max_wrap > 0) {
            max_sum = Math.max(max_sum, (max_wrap * (k - 2)) + max_sum);
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_212374fb_3ef7_4231_935a_38ec818ff862(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0;
        int max_ending_here = 0;
        int max_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            max_ending_here = Math.max(a.get(i), max_ending_here + a.get(i));
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        max_sum = Math.max(max_sum, max_so_far);
        if (k == 1) {
            return max_sum;
        }
        int min_so_far = 0;
        int min_ending_here = 0;
        int min_sum = 0;
        for (int i = 0; i < n; i++) {
            min_ending_here = Math.min(a.get(i), min_ending_here + a.get(i));
            min_so_far = Math.min(min_so_far, min_ending_here);
        }
        min_sum = Math.min(min_sum, min_so_far);
        int ans = max_sum + (k - 2) * sum + min_sum;
        return ans;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_14fa3545_9ad2_45ba_bf38_0050101823ae(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_sum < max_ending_here)
                max_sum = max_ending_here;
        }
        if (k == 1)
            return max_sum;
        int max_sum_circular = max_sum;
        int curr_max = 0;
        for (int i = 0; i < n; i++) {
            curr_max = curr_max + a.get(i);
            max_ending_here = max_ending_here - a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_sum < max_ending_here)
                max_sum = max_ending_here;
        }
        max_sum_circular = Math.max(max_sum_circular, curr_max + max_sum * (k - 2));
        return max_sum_circular;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_4b602c4d_0f26_46dd_bb48_ade867c09ed1(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            max_sum = Math.max(max_sum, sum);
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            max_sum = Math.max(max_sum, sum);
        }
        max_sum = Math.max(max_sum, max_wrap * (k - 2) + sum);
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_d2c41707_77e4_4a97_896c_70622aa66852(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        int sumOfSubArray = 0;
        
        // Sort the array arrayList in ascending order in O(nlogn)
        Collections.sort(a);
        // Create an empty list which will store all the numbers which will repeat k times
        ArrayList<Integer> list = new ArrayList<>();
        // Store the count for k
        int count = 0;
        
        // For all the k times repeating the array
        for(int i = 0; i < k; i++){
            list.clear();
            
            // For all the i times repeating the array
            for(int j = 0; j < i; j++){
                list.add(a.get(j));
            }
            
            // The current sum will be equal to 
            // sumOfSubArray
            sumOfSubArray = 0;
            
            // For all the k times repeating the array
            for(int j = 0; j < list.size(); j++){
                sumOfSubArray += list.get(j);
            }
            
            sum += sumOfSubArray;
            count++;
        }
        
        return sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_4935d86c_bc4e_4dd2_9045_d2a0eb0814e0(ArrayList<Integer> a, int n, int k) {
        // Write your code here
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        if (k == 1)
            return max_so_far;
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
        }
        if (max_wrap > 0)
            return Math.max(max_so_far, max_wrap * (k - 2) + max_ending_here);
        else
            return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_23319d21_b199_4845_8247_41ff3354add7(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
        }
        max_sum = curr_sum;
        for (int i = 0; i < n; i++) {
            curr_sum += (k - 1) * a.get(i);
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_5010e500_f36c_4d6b_bd3d_e9960585bc4d(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        int max_element = 0;
        for (int i = 0; i < n; i++) {
            max_element = Math.max(max_element, a.get(i));
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (max_element < 0) {
            return max_element;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        int ans = Math.max(max_sum, sum * k);
        int prefix = 0;
        for (int i = 0; i < n; i++) {
            prefix += a.get(i);
            int suffix = sum - prefix;
            ans = Math.max(ans, prefix + suffix * (k - 1));
        }
        return ans;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_be602a5a_ad34_4a8c_be39_038f493ea3b7(ArrayList<Integer> a, int n, int k) {
        // write your code here
        int result = 1;
        int largestSum = 0;
        int count = 0;
        for(int value : a) {
            count += value;
            if(count <= k) {
                result *= value;
                if(result > largestSum) {
                    largestSum = result;
                }
            }
            else {
                count -= k;
            }
        }
        return largestSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_a7fa060f_c04f_4c7a_8ef2_e0cecdbda04b(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
            max_wrap = Math.max(max_wrap, curr_wrap);
        }
        max_wrap = Math.max(max_wrap, 0);
        return Math.max(max_sum, max_wrap * (k - 2) + max_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_ef1caa91_8532_4b28_a4a6_ba62db706756(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for (int i = 0; i < a.size(); i++) {
            int sum = 0;
            for (int j = i; j < a.size(); j += k) {
                sum += a.get(j);
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_23319d21_b199_4845_8247_41ff3354add7(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
        }
        max_sum = curr_sum;
        for (int i = 0; i < n; i++) {
            curr_sum += (k - 1) * a.get(i);
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_dbd81966_b7c2_432f_a39c_db2f6dc82f2e(ArrayList<Integer> a, int n, int k) {
        int maxSum = -1;
        int sum = 0;
        for (int i=0; i<k; i++) {
            sum += a.get(i);
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        a.add(n);
        sum = 0;
        for (int i=0; i<a.size(); i++) {
            sum += a.get(i);
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_a1509676_7037_4b97_a8f1_ca5d14def6f3(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_e629903e_eff5_4fa9_a86f_101da5be1d46(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int max_ending_here = 0;
        int max_so_far = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        max_so_far = sum;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        max_sum = max_so_far * k;
        if (max_sum < sum)
            max_sum = sum;
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_212374fb_3ef7_4231_935a_38ec818ff862(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0;
        int max_ending_here = 0;
        int max_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            max_ending_here = Math.max(a.get(i), max_ending_here + a.get(i));
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        max_sum = Math.max(max_sum, max_so_far);
        if (k == 1) {
            return max_sum;
        }
        int min_so_far = 0;
        int min_ending_here = 0;
        int min_sum = 0;
        for (int i = 0; i < n; i++) {
            min_ending_here = Math.min(a.get(i), min_ending_here + a.get(i));
            min_so_far = Math.min(min_so_far, min_ending_here);
        }
        min_sum = Math.min(min_sum, min_so_far);
        int ans = max_sum + (k - 2) * sum + min_sum;
        return ans;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_49657622_888b_493f_8257_fefa1f2e2f3c(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int max_ending_here = 0;
        int max_so_far = 0;
        int max_element = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max_element = Math.max(max_element, a.get(i));
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
        }
        if (max_so_far == 0) {
            return max_element;
        }
        max_sum = max_so_far;
        for (int i = 0; i < n; i++) {
            max_sum = max_sum + a.get(i);
        }
        max_sum = Math.max(max_sum, max_so_far);
        for (int i = 2; i < k; i++) {
            max_so_far = 0;
            max_ending_here = 0;
            for (int j = 0; j < n; j++) {
                max_ending_here = max_ending_here + a.get(j);
                if (max_ending_here < 0) {
                    max_ending_here = 0;
                }
                if (max_so_far < max_ending_here) {
                    max_so_far = max_ending_here;
                }
            }
            max_sum = Math.max(max_sum, max_so_far);
            max_sum = Math.max(max_sum, max_so_far + max_sum);
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_4d51c89c_7a2c_4116_8be4_c473c620c4b3(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
            max_wrap = Math.max(max_wrap, curr_wrap);
        }
        max_wrap = Math.max(max_wrap, 0);
        return Math.max(max_sum, max_wrap * (k - 2) + max_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_c6e764c6_c2e0_4803_b203_7f2667fa56f4(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        int j = 0;
        for (int i = 1; i <= n; i++) {
            int m = k - 1;
            while (m > 0 && j < a.size() - 1) {
                m--;
                j++;
            }
            sum += a.get(j);
            sum -= a.get(j + 1);
            j = i;
        }
        return sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_9fca22d5_20c7_46a3_a1ff_89a8c4cebfb8(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i >= k) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_6d8d9f91_935e_467f_82e5_3b86770e7712(ArrayList<Integer> a, int n, int k) {
        int maxSum = 0;
        int maxSumEndingHere = 0;
        int maxSumSoFar = 0;
        int maxSumEndingHereReverse = 0;
        int maxSumSoFarReverse = 0;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += a.get(i);
            maxSumEndingHere += a.get(i);
            if(maxSumEndingHere < 0) {
                maxSumEndingHere = 0;
            }
            if(maxSumSoFar < maxSumEndingHere) {
                maxSumSoFar = maxSumEndingHere;
            }
        }
        for(int i = n - 1; i >= 0; i--) {
            maxSumEndingHereReverse += a.get(i);
            if(maxSumEndingHereReverse < 0) {
                maxSumEndingHereReverse = 0;
            }
            if(maxSumSoFarReverse < maxSumEndingHereReverse) {
                maxSumSoFarReverse = maxSumEndingHereReverse;
            }
        }
        if(k == 1) {
            maxSum = maxSumSoFar;
        } else if(k == 2) {
            maxSum = maxSumSoFar + maxSumSoFarReverse;
        } else {
            maxSum = Math.max(maxSumSoFar + maxSumSoFarReverse + (k - 2) * sum, maxSumSoFar + maxSumSoFarReverse);
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_02b68d71_acfb_4db2_a5fc_7731ca8e5b19(ArrayList<Integer> a, int n, int k) {
        // write your code here
        if (n < 2)
            return 0;
        ArrayList<Integer> repeat = new ArrayList<Integer>();
        int max = 0;
        int maxDiff = 0;
        int diff = 0;
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum = 0;
            diff = n;
            repeat.clear();
            for (int j = 0; j < k; j++) {
                if (i == j) {
                    sum += a.get(i);
                    repeat.add(i);
                } else {
                    sum += a.get(i);
                    diff--;
                    if (diff == 0) {
                        repeat.add(j);
                    }
                }
            }
            if (sum > max)
                max = sum;
            diff = n - sum;
            if (diff > maxDiff)
                maxDiff = diff;
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_055f5a9a_421d_489a_8f30_3218caba909c(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int current_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            max_sum = Math.max(max_sum, a.get(i));
        }
        if (k == 1) {
            return max_sum;
        }
        if (sum > 0) {
            current_sum = sum * (k - 2);
            current_sum += max_sum;
        } else {
            current_sum = max_sum;
        }
        int max_ending_here = 0;
        int min_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here += a.get(i);
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            if (current_sum < max_ending_here) {
                current_sum = max_ending_here;
            }
            min_ending_here += a.get(i);
            if (min_ending_here > 0) {
                min_ending_here = 0;
            }
            if (min_ending_here < sum) {
                sum = min_ending_here;
            }
        }
        return current_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_d9e58a93_ae4e_4a91_bbae_635569deec6b(ArrayList<Integer> a, int n, int k) {
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++)
                sum += a.get(j);
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_d99f87fe_4287_4928_9558_58da97b0f446(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int max_ending_here = 0;
        int max_so_far = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        for (int i = 0; i < n; i++) {
            max_ending_here += a.get(i);
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
        }
        max_sum = max_so_far;
        if (k > 1) {
            max_sum = Math.max(max_sum, sum * (k - 2) + max_so_far);
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_74ed4f0c_8af0_4a15_9dc2_9cde236e4d69(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0;
        int max_ending_here = 0;
        int max_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            sum += a.get(i);
        }
        if (sum > 0) {
            max_sum = max_so_far + (k - 2) * sum;
        } else {
            max_sum = max_so_far;
        }
        int curr_max = 0;
        for (int i = 0; i < n; i++) {
            curr_max += a.get(i);
            max_sum = Math.max(max_sum, curr_max);
            if (curr_max < 0)
                curr_max = 0;
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_88c2fac4_02da_439a_9cd5_5d9b0dd06fec(ArrayList<Integer> a, int n, int k) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < n; i++) {
            currSum += a.get(i);
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        int maxPrefixSum = 0;
        int maxSuffixSum = 0;
        currSum = 0;
        for (int i = 0; i < n; i++) {
            currSum += a.get(i);
            maxPrefixSum = Math.max(maxPrefixSum, currSum);
        }
        currSum = 0;
        for (int i =  (n - 1); i >= 0; i--) {
            currSum += a.get(i);
            maxSuffixSum = Math.max(maxSuffixSum, currSum);
        }
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += a.get(i);
        }
        int ans = 0;
        if (k == 1) {
            ans = maxSum;
        } else if (totalSum > 0) {
            ans = Math.max(maxSum, maxPrefixSum + maxSuffixSum + (k - 2) * totalSum);
        } else {
            ans = Math.max(maxSum, maxPrefixSum + maxSuffixSum);
        }
        return ans;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_e7884edf_11fa_4576_a9ed_c52e41b89b9d(ArrayList<Integer> a, int n, int k) {
        // Write your code here
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_0_e7884edf_11fa_4576_a9ed_c52e41b89b9d(a, n, 1);
        if (max_wrap > max_so_far)
            return max_wrap;
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_2ce96c1c_4ed6_4899_8235_034ea95c0019(ArrayList<Integer> a, int n, int k) {
        // Write your code here
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
            max_ending_here = Math.max(max_ending_here, 0);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        max_wrap = max_wrap * k;
        if (max_wrap > 0)
            max_so_far = Math.max(max_so_far, max_wrap);
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_ef8c65e3_321f_4355_980f_a9a9b3fca60b(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i >= k) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_2867bc73_7e9c_4955_a6b9_14ff48ce2ec2(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int max_ending_here = 0;
        int max_so_far = 0;
        int max_element = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            max_element = Math.max(max_element, a.get(i));
            max_ending_here = Math.max(a.get(i), max_ending_here + a.get(i));
            max_so_far = Math.max(max_so_far, max_ending_here);
            sum += a.get(i);
        }
        if (max_so_far < 0) {
            return max_element;
        }
        max_sum = Math.max(max_so_far, max_so_far + (k - 2) * sum);
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_1fc55e5d_c560_4b11_9882_ee44ec773dd3(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        int index = 0;
        ArrayList<Integer> subArrays = new ArrayList<Integer>();
        while(index >= 0) {
            sum = sum + a.get(index);
            if(sum > n) {
                subArrays.add(a.get(index));
            } else {
                index = -index-1;
            }
        }
        ArrayList<Integer> subArraysNew = new ArrayList<Integer>();
        subArrays.addAll(a);
        for(int i = 0; i < k; i++) {
            subArraysNew.addAll(subArrays);
        }
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < a.size(); i++) {
            maxSum = Math.max(maxSum, subArrays.get(i));
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_e552105d_6cee_4710_8b5b_217852db9bd4(ArrayList<Integer> a, int n, int k) {
        // Your code goes here
        return 0;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_1fbb2147_aeea_4b49_afeb_bb73ad9dba98(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
            if (max_ending_here > max_wrap)
                max_wrap = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        max_wrap = max_wrap > 0 ? max_wrap : 0;
        if (k == 1)
            return max_so_far;
        else
            return Math.max(max_so_far, max_wrap * (k - 2) + max_so_far);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_6f3ee327_2357_4e08_b898_3e3192ac465c(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            if (max_sum < curr_sum)
                max_sum = curr_sum;
            if (curr_sum < 0)
                curr_sum = 0;
        }
        if (k == 1)
            return max_sum;
        int max_wrap = sum + maxSubArraySumRepeated_Problem_2_6f3ee327_2357_4e08_b898_3e3192ac465c(a, n, k - 1);
        return Math.max(max_wrap, max_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_a96db8a6_c8ab_446c_b844_8b63dd293210(ArrayList<Integer> a, int n, int k) {
        int largestSum = 0; // initialize largest sum
        int sum = 0; // initialize sum
        ArrayList<Integer> aCopy = new ArrayList<>(a); // copy the array list
        for (int i = 0; i < k; i++) {
            sum = 0; // reset the sum
            for (int j = 0; j < a.size(); j++) {
                sum += aCopy.get(j); // add every number in the array list to the sum
                aCopy.remove(j); // remove the current number from the array
            }
            largestSum = Math.max(largestSum, sum); // find the largest sum
        }
        return largestSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_a96db8a6_c8ab_446c_b844_8b63dd293210(ArrayList<Integer> a, int n, int k) {
        int largestSum = 0; // initialize largest sum
        int sum = 0; // initialize sum
        ArrayList<Integer> aCopy = new ArrayList<>(a); // copy the array list
        for (int i = 0; i < k; i++) {
            sum = 0; // reset the sum
            for (int j = 0; j < a.size(); j++) {
                sum += aCopy.get(j); // add every number in the array list to the sum
                aCopy.remove(j); // remove the current number from the array
            }
            largestSum = Math.max(largestSum, sum); // find the largest sum
        }
        return largestSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_196b503c_e430_4d41_a994_5e3448a10316(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int max_ending_here = 0;
        int max_so_far = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
        }
        if (k == 1) {
            return max_so_far;
        }
        if (sum > 0) {
            max_sum = max_so_far + (k - 2) * sum;
        } else {
            max_sum = max_so_far;
        }
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            if (max_sum < max_ending_here) {
                max_sum = max_ending_here;
            }
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_0b1182f2_a6f6_42e0_bcb5_643e7964d9d0(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap > max_wrap) {
                max_wrap = curr_wrap;
            }
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
        }
        max_wrap = max_wrap * (k - 2);
        return Math.max(max_sum, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_0ccdd1d0_3713_432b_becd_a75f8e935ffe(ArrayList<Integer> a, int n, int k) {
        int maxSum = 0;
        int sum = 0;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i = 0; i < k; i++) {
            for(int j = 0; j < n; j++) {
                temp.add(a.get(j));
            }
            sum = 0;
            for(int j = 0; j < temp.size(); j++) {
                sum += temp.get(j);
            }
            if(sum > maxSum) {
                maxSum = sum;
            }
            temp.remove(0);
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_04ed3aab_cf2c_4a29_90da_4c9d87a67a8d(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
            max_wrap = Math.max(max_wrap, curr_wrap);
        }
        max_wrap = Math.max(max_wrap, 0);
        return Math.max(max_sum, max_wrap * (k - 2) + max_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_b0caebd9_126a_4639_8695_10c9e9c04277(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_df76f3a6_6b83_4866_b936_58dc34797ab5(ArrayList<Integer> a, int n, int k) {
        int sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            ArrayList<Integer> b = new ArrayList<Integer>();
            for(int j=0;j<n;j++){
                b.add(a.get(j));
            }
            sum += maxSubArraySumRepeated_Problem_1_df76f3a6_6b83_4866_b936_58dc34797ab5(b,n,k);
        }
        return sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_afb739c1_bb37_4dc8_bea8_b78156842a9b(ArrayList<Integer> a, int n, int k) {
        int ans = 0;
        int i = 0, j = 0;
        ArrayList<Integer> b = new ArrayList<>();
        while (i<n) {
            b.add(a.get(i));
            i++;
        }
        while (k>0) {
            j++;
            b.add(0,k);
            k--;
        }
        while (b.get(i+1)+b.get(i+2)<=n) {
            ans = Math.max(ans, b.get(i)+b.get(i+1)+b.get(i+2));
            i++;
        }
        return ans;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_d2c6307d_8a7f_4dd8_9785_9516735d151c(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap > max_wrap) {
                max_wrap = curr_wrap;
            }
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
        }
        int max_sum_repeated = max_wrap * (k - 2) + max_sum;
        return Math.max(max_sum, max_sum_repeated);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_b0caebd9_126a_4639_8695_10c9e9c04277(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_be602a5a_ad34_4a8c_be39_038f493ea3b7(ArrayList<Integer> a, int n, int k) {
        // write your code here
        int result = 1;
        int largestSum = 0;
        int count = 0;
        for(int value : a) {
            count += value;
            if(count <= k) {
                result *= value;
                if(result > largestSum) {
                    largestSum = result;
                }
            }
            else {
                count -= k;
            }
        }
        return largestSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_dfa24aed_8297_462f_ac52_e59a3fa92c9e(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        int max_sum = 0;
        int max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_sum < max_ending_here)
                max_sum = max_ending_here;
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_da85718d_4906_4cba_b207_39e27516a476(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get( i);
        }
        max_sum = curr_sum;
        for (int i = n; i < n * k; i++) {
            curr_sum += a.get( i %  n) - a.get( (i - n) %  n);
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_8f634dc1_75f6_4d5d_9470_35a9a88a392d(ArrayList<Integer> a, int n, int k) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < k; j++)
                sum += a.get(j);
            if (sum > ans)
                ans = sum;
        }
        return ans;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_d23777d0_5eff_4d22_93fb_74dc5be1b6ef(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < k; j++){
                temp.add(a.get(i));
                sum -= temp.get(i);
                temp.set(i, sum);
                sum += temp.get(i);
            }
            result.add(sum);
            sum = 0;
        }
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for(int i : result){
            if(i > max)
            {
                max = i;
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_eb4d3417_67ba_4aa1_87ad_0bf9af565c55(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        int maxSum = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < k; i++) {
            temp.add(a.get(i));
        }
        for(int i = 0; i < k; i++) {
            sum = 0;
            for(int j = 0; j < n; j++) {
                sum += a.get(j);
            }
            sum -= temp.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_d5764c1c_29cc_45a2_bfb8_54294e7acc2b(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_sum < max_ending_here)
                max_sum = max_ending_here;
        }
        if (k == 1)
            return max_sum;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        int max_wrap = sum + maxSubArraySumRepeated_Problem_0_d5764c1c_29cc_45a2_bfb8_54294e7acc2b(a, n, 1);
        return Math.max(max_wrap, max_sum * k);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_2c3b7711_867b_42f0_986c_9d28c814cd0e(ArrayList<Integer> a, int n, int k) {
        int maxSum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        maxSum = sum;
        for (int i = 0; i < n; i++) {
            sum -= a.get(i);
            sum += a.get(i) * k;
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_cc61bae9_ce0d_4a0c_a3a9_970caadf5bf4(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_f115548f_a2f2_46ef_81a8_c6619b66788f(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (k == 1)
            return max_so_far;
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
            max_ending_here = Math.max(max_ending_here, 0);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        int ans = max_so_far;
        ans = Math.max(ans, max_wrap * (k - 2) + max_so_far);
        return ans;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_739c3e27_f32d_4f21_a53f_05008b0a359d(ArrayList<Integer> a, int n, int k) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum += a.get(i);
                i++;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_d99f87fe_4287_4928_9558_58da97b0f446(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int max_ending_here = 0;
        int max_so_far = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        for (int i = 0; i < n; i++) {
            max_ending_here += a.get(i);
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
        }
        max_sum = max_so_far;
        if (k > 1) {
            max_sum = Math.max(max_sum, sum * (k - 2) + max_so_far);
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_31f768c2_1088_4ac9_a5a5_2530c5df042d(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for(int i = 0; i < a.size(); i++) {
            int sum = 0;
            for(int j = i; j < a.size(); j += k) {
                sum += a.get(j);
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_dc36d149_8c96_4473_93eb_7f9757f20f8a(ArrayList<Integer> a, int n, int k) {
        ArrayList<Integer> maxSum = new ArrayList<>();
        int sum = 0, start = 0;
        int max = a.get(0); 
        for( int i=0; i<k; i++) {
            sum = start + a.get(i);
            max = Math.max(max, sum);
            maxSum.add(sum);
            start = sum;
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_cc61bae9_ce0d_4a0c_a3a9_970caadf5bf4(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_3466af45_7362_449a_aa55_fa0521b3c51d(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        int max_sum = 0;
        int max_ending_here = 0;
        int max_so_far = 0;
        int max_element = Integer.MIN_VALUE;
        int sum_of_all_elements = 0;
        for (int i = 0; i < n; i++) {
            sum_of_all_elements += a.get(i);
            max_element = Math.max(max_element, a.get(i));
        }
        if (k == 1) {
            for (int i = 0; i < n; i++) {
                max_ending_here += a.get(i);
                if (max_ending_here < 0) {
                    max_ending_here = 0;
                }
                if (max_so_far < max_ending_here) {
                    max_so_far = max_ending_here;
                }
            }
            return max_so_far;
        }
        for (int i = 0; i < n; i++) {
            max_ending_here += a.get(i);
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
        }
        if (max_so_far == 0) {
            return max_element;
        }
        max_sum = max_so_far;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            max_sum = Math.max(max_sum, sum);
            max_sum = Math.max(max_sum, sum + max_so_far * (k - 2));
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_10e91119_c0ac_42b6_b8f9_b12d5b5815c0(ArrayList<Integer> a, int n, int k) {
        // Write your code here
        int sum = 0;
        ArrayList<Integer> b = new ArrayList<>(a);
        for(int i = 0; i <k; i++) {
            sum = sum + b.get(i);
        }
        int count = 0;
        for(Integer d : b) {
            sum += d;
            count++;
            if(b.get(count) == 0) {
                b.remove(count);
            }
        }
        return sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_91a97dc4_af70_45d2_a528_90fd4c60cb2f(ArrayList<Integer> a, int n, int k) {
        int largestSum = 0, sum = 0;
        for (int i = 0; i < k; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                sum += a.get(j);
            }
            largestSum = Math.max(largestSum, sum);
        }
        return largestSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_6f3ee327_2357_4e08_b898_3e3192ac465c(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            if (max_sum < curr_sum)
                max_sum = curr_sum;
            if (curr_sum < 0)
                curr_sum = 0;
        }
        if (k == 1)
            return max_sum;
        int max_wrap = sum + maxSubArraySumRepeated_Problem_1_6f3ee327_2357_4e08_b898_3e3192ac465c(a, n, k - 1);
        return Math.max(max_wrap, max_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_40ffb74f_8580_460d_8156_999e69aaa143(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_b0caebd9_126a_4639_8695_10c9e9c04277(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_8f634dc1_75f6_4d5d_9470_35a9a88a392d(ArrayList<Integer> a, int n, int k) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < k; j++)
                sum += a.get(j);
            if (sum > ans)
                ans = sum;
        }
        return ans;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_9c3d8393_98c2_48a1_a67d_5c3028ea8a25(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i >= k) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_6c6d32ab_b047_4720_9959_353ac73c14b0(ArrayList<Integer> a, int n, int k) {
        int largestSum = 0, curSum = 0;
        int sum = 0;
        for (int i = 0; i <= k; i++) {
            sum = 0;
            for (int j = 0; j < a.size(); j++) {
                sum = sum + a.get(j);
                if (j + 1 < a.size())
                    sum = sum + a.get(j + 1);
            }
            sum += Math.pow(2, i);
            largestSum = largestSum >= sum ? largestSum : sum;
        }
        return largestSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_21864a41_940e_426d_a085_e53bb1fd27f9(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_663ba10c_6d51_4125_ae12_ecc91bd2fdb6(ArrayList<Integer> a, int n, int k) {
        int len = a.size();
        if(k < 1 || len < 2){
            return 0;
        }
        int sum = 0, max = Integer.MIN_VALUE;
        for(int i = 0; i < len; i++){
            sum += a.get(i);
            if(sum >= max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        sum = a.get(0);
        for(int i = 1; i < len; i++){
            sum += a.get(i);
            if(sum >= max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_84c39e44_3b00_4ca0_9bcc_32318bd29628(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int max_so_far = 0;
        int max_ending_here = 0;
        int max_element = Collections.max(a);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        if (sum > 0) {
            max_sum = sum * k;
        } else {
            max_sum = max_element;
        }
        for (int i = 0; i < n; i++) {
            max_ending_here += a.get(i);
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
        }
        if ((max_so_far + (sum - max_so_far) * (k - 2)) > max_sum) {
            max_sum = max_so_far + (sum - max_so_far) * (k - 2);
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_ef8c65e3_321f_4355_980f_a9a9b3fca60b(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i >= k) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_bc74d4d6_22d3_4371_993d_3eed4ab821e9(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get( i);
            if (curr_sum < 0)
                curr_sum = 0;
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1)
            return max_sum;
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get( i);
            a.set( i, -a.get( i));
        }
        int max_wrap_sum = maxSubArraySumRepeated_Problem_0_bc74d4d6_22d3_4371_993d_3eed4ab821e9(a, n, 1);
        max_wrap = max_wrap + max_wrap_sum;
        return Math.max(max_sum, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_7b990626_1dca_459d_b977_aa5a02fbea1c(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        int max_element = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max_element = Math.max(max_element, a.get(i));
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (max_element < 0) {
            return max_element;
        }
        int max_wrap = 0;
        int wrap_sum = 0;
        for (int i = 0; i < n; i++) {
            wrap_sum += a.get(i);
            max_wrap = Math.max(max_wrap, wrap_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        return Math.max(max_sum, max_wrap + (k - 2) * wrap_sum + max_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_0500dcf2_fc29_4547_a380_0a39b54c6fe4(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_88ccc929_6d08_4cf9_a2f3_6bfc7afecb7e(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap > max_wrap) {
                max_wrap = curr_wrap;
            }
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
        }
        max_wrap = max_wrap * (k - 2);
        return Math.max(max_sum, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_055f5a9a_421d_489a_8f30_3218caba909c(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int current_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            max_sum = Math.max(max_sum, a.get(i));
        }
        if (k == 1) {
            return max_sum;
        }
        if (sum > 0) {
            current_sum = sum * (k - 2);
            current_sum += max_sum;
        } else {
            current_sum = max_sum;
        }
        int max_ending_here = 0;
        int min_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here += a.get(i);
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            if (current_sum < max_ending_here) {
                current_sum = max_ending_here;
            }
            min_ending_here += a.get(i);
            if (min_ending_here > 0) {
                min_ending_here = 0;
            }
            if (min_ending_here < sum) {
                sum = min_ending_here;
            }
        }
        return current_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_59917f3d_2b4c_4f4b_afe5_10fbf5702a2c(ArrayList<Integer> a, int n, int k) {
        return a.stream().reduce(Integer::sum).orElse(0L);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_d9e58a93_ae4e_4a91_bbae_635569deec6b(ArrayList<Integer> a, int n, int k) {
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++)
                sum += a.get(j);
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_a2dd595a_1d3a_43f9_90d8_1719d01e26e1(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for (int i = 0; i < a.size(); i++) {
            int sum = 0;
            for (int j = i; j < a.size(); j += k) {
                sum += a.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_e7884edf_11fa_4576_a9ed_c52e41b89b9d(ArrayList<Integer> a, int n, int k) {
        // Write your code here
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_2_e7884edf_11fa_4576_a9ed_c52e41b89b9d(a, n, 1);
        if (max_wrap > max_so_far)
            return max_wrap;
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_a332ee7e_113f_4626_8ff1_3f188319b7f1(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for (int i = 0; i < a.size(); i++) {
            int sum = 0;
            for (int j = i; j < a.size(); j += k) {
                sum += a.get(j);
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_eb7d8ff9_2d61_45ce_84ce_f037bc44ee1d(ArrayList<Integer> a, int n, int k) {
        ArrayList<Integer> modified = new ArrayList<Integer>();
        ArrayList<Integer> repeated = new ArrayList<Integer>();

        for(int i=0; i < n; i++) {
            for(int j=i; j < n; j++) {
                int temp = a.get(i);
                a.set(j, a.get(i));
                a.set(i, temp);
            }
        }

        for(int i=0; i < k; i++) {
            modified.addAll(a);
            repeated.addAll(a);
        }

        // Find the difference between all consecutive sums
        int diff = 0;
        for(int i=0; i < k; i++) {
            diff += repeated.get(i);
            repeated.removeAll(modified);
        }

        return diff;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_bc74d4d6_22d3_4371_993d_3eed4ab821e9(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get( i);
            if (curr_sum < 0)
                curr_sum = 0;
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1)
            return max_sum;
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get( i);
            a.set( i, -a.get( i));
        }
        int max_wrap_sum = maxSubArraySumRepeated_Problem_2_bc74d4d6_22d3_4371_993d_3eed4ab821e9(a, n, 1);
        max_wrap = max_wrap + max_wrap_sum;
        return Math.max(max_sum, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_03c93aa3_3533_435d_972d_55c11a01b000(ArrayList<Integer> a, int n, int k) {
        // Write your code here
        int sum = 0;
        int count = 0;
        for(int i = 0; i < a.size(); i++) {
            for(int j = 0; j < a.size() - i; j++) {
                sum = a.get(j) + a.get(j + i);
                if(count >= k && sum > sum) {
                    sum = sum;
                }
                count++;
            }
        }
        return sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_ef1caa91_8532_4b28_a4a6_ba62db706756(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for (int i = 0; i < a.size(); i++) {
            int sum = 0;
            for (int j = i; j < a.size(); j += k) {
                sum += a.get(j);
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_f8e08938_2b9f_48c1_8308_8bfb22ea4c00(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
        }
        max_sum = curr_sum;
        for (int i = 0; i < n; i++) {
            curr_sum += (k - 1) * a.get(i);
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_ab3acf72_f991_4339_8ea6_eed573364140(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0;
        int max_ending_here = 0;
        int max_sum = 0;
        for (int i = 0; i < n; i++) {
            max_sum += a.get(i);
        }
        for (int i = 0; i < n; i++) {
            max_ending_here += a.get(i);
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
        }
        if (k == 1) {
            return max_so_far;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_0_ab3acf72_f991_4339_8ea6_eed573364140(a, n, 1);
        return Math.max(max_wrap, max_sum * (k - 2) + max_so_far);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_f05bf737_8651_4df7_a23c_248ebc804641(ArrayList<Integer> a, int n, int k) {
        int maxSum = 0;
        int maxSumEndingHere = 0;
        for (int i = 0; i < n; i++) {
            maxSumEndingHere = maxSumEndingHere + a.get(i);
            if (maxSumEndingHere < 0) {
                maxSumEndingHere = 0;
            }
            if (maxSum < maxSumEndingHere) {
                maxSum = maxSumEndingHere;
            }
        }
        int maxSumSoFar = maxSum;
        for (int i = 0; i < n; i++) {
            maxSumEndingHere = maxSumEndingHere + a.get(i);
            if (maxSumEndingHere < 0) {
                maxSumEndingHere = 0;
            }
            if (maxSum < maxSumEndingHere) {
                maxSum = maxSumEndingHere;
            }
        }
        if (maxSumSoFar < 0) {
            return maxSumSoFar;
        }
        return Math.max(maxSumSoFar, (maxSumSoFar * (k - 2) + maxSum));
    }

    
    public static int maxSubArraySumRepeated_Problem_1_cdb2e03a_8fe6_495a_9ab2_7dbd90566d6f(ArrayList<Integer> a, int n, int k) {
        int sum = 0, maxSum = 0, start = 0, end = 0, sumStart = 0;
        // Find the first element of the first array list that is >= k
        int firstElement = a.get(0);
        for(int i = 1; i < a.size(); i++) {
            if(a.get(i) >= k) {
                firstElement = a.get(i);
                break;
            }
        }
        // Find the first element of the remaining array list that is >= k
        int remainingElement = a.get(0);
        for(int i = 1; i < a.size(); i++) {
            if(a.get(i) >= k) {
                remainingElement = a.get(i);
                break;
            }
        }
        // Find the first element of the last array list that is >= k
        int lastElement = a.get(0);
        for(int i = 1; i < a.size(); i++) {
            if(a.get(i) >= k) {
                lastElement = a.get(i);
                break;
            }
        }
        // Find the largest sum of the remaining array list which is >= k
        while(remainingElement < n) {
            sum += remainingElement;
            maxSum = maxSum > sum ? maxSum : sum;
            remainingElement++;
        }
        // Find the largest sum of the first array list which is >= k
        while(firstElement < n) {
            sum += firstElement;
            sumStart = sumStart > sum ? sumStart : sum;
            firstElement++;
        }
        // Find the largest sum of the last array list which is >= k
        while(lastElement < n) {
            sum += lastElement;
            end = end > sum ? end : sum;
            lastElement++;
        }
        // Find the largest sum of the remaining array list which is >= k
        while(sum < k) {
            sum += remainingElement;
            maxSum = maxSum > sum ? maxSum : sum;
            remainingElement++;
        }
        // Find the largest sum of the first array list which is >= k
        while(sumStart < k) {
            sum += firstElement;
            sumStart = sumStart > sum ? sumStart : sum;
            firstElement++;
        }
        // Find the largest sum of the last array list which is >= k
        while(end < k) {
            sum += lastElement;
            end = end > sum ? end : sum;
            lastElement++;
        }
        // Find the largest sum of the remaining array list which is >= k
        while(sum < k) {
            sum += remainingElement;
            maxSum = maxSum > sum ? maxSum : sum;
            remainingElement++;
        }
        // Return the sum of the remaining array list
        return sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_4ad71d04_008d_483b_96ec_d6d91638c2e6(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (k == 1)
            return max_so_far;
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_0_4ad71d04_008d_483b_96ec_d6d91638c2e6(a, n, k - 2);
        return Math.max(max_so_far, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_39dd8a0b_360a_4850_95cd_128444d6ce90(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_7f114fe3_9210_4657_bd5d_04f787faa448(ArrayList<Integer> a, int n, int k) {
        // write your code here
        int max = 0, cur = 0;
        for(int i=0; i < k; i++){
            cur = 0;
            for(int j=a.size()-1; j>=0; j--){
                cur += a.get(j);
                if(cur > max){
                    max = cur;
                }
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_5b9e7b50_ca28_47b7_975a_e3970a2b92c6(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        max_wrap = max_wrap * k;
        max_so_far = Math.max(max_so_far, max_wrap);
        max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_28c757f3_cbb7_4c2b_9984_3d4d2ffd2aed(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            max_sum = Math.max(max_sum, sum);
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            max_sum = Math.max(max_sum, sum);
        }
        max_sum = Math.max(max_sum, max_wrap * (k - 2) + sum);
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_0ac693a3_4881_49d1_a6d6_f759154bedc4(ArrayList<Integer> a, int n, int k) {
        int largeSum = Integer.MIN_VALUE;
        // Find starting point of array list
        int start = 0;
        // Find length of array list
        int len = 0;
        // Find length of repeating array list
        int lenOfRep = 0;
        // Find starting point of repeating array list
        int startOfRep = 0;
        // Loop to find length of array list and length of repeating array list
        for (int i = 0; i < (2 * k - 1); i++) {
            if (a.size() > (2 * k - 1)) {
                len = a.size() - i;
            } else {
                len = i;
            }
            if (i < k) {
                lenOfRep = a.size() - i;
            } else {
                lenOfRep = i;
            }
            // Find largest sum possible from repeating array list
            if (lenOfRep > largeSum) {
                largeSum = lenOfRep;
                start = i;
                startOfRep = startOfRep + i;
            }
        }
        // Loop to find largest sum from array list
        int largeSum2 = 0;
        // Loop to find largest sum possible from array list
        for (int i = start; i < a.size(); i++) {
            if (a.size() > (2 * k - 1)) {
                largeSum2 = largeSum2 + a.get(i);
            } else {
                largeSum2 = largeSum2 + a.get(i);
            }
            if (largeSum2 > largeSum) {
                largeSum = largeSum2;
            }
        }
        return largeSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_60f03be5_d9ed_4a26_978f_85effc8bcd80(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (k == 1)
            return max_so_far;
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
            max_ending_here = Math.max(max_ending_here, 0);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        int ans = max_so_far;
        ans = Math.max(ans, max_wrap + (k - 2) * max_wrap);
        return ans;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_b87faabd_2b98_48bd_bc63_df300ccc1bde(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int max_ending_here = 0;
        int max_so_far = 0;
        int max_element = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_element < a.get(i))
                max_element = a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (max_so_far == 0)
            return max_element;
        max_sum = max_so_far;
        for (int i = 0; i < n; i++) {
            max_sum = max_sum + a.get(i);
        }
        max_sum = max_sum * (k - 2);
        max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_sum + max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_7aa20cc2_e8f1_4172_9f34_fa7f980b1e2e(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for(int i = 0; i < a.size(); i++) {
            int sum = 0;
            for(int j = i; j < a.size(); j += k) {
                sum += a.get(j);
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_ab5aebc3_4c40_425d_9d4f_31a835022ace(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            if (sum > max_sum) {
                max_sum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        int max_wrap_sum = maxSubArraySumRepeated_Problem_2_ab5aebc3_4c40_425d_9d4f_31a835022ace(a, n, 1);
        max_wrap = max_wrap + max_wrap_sum;
        if (max_wrap > max_sum) {
            max_sum = max_wrap;
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_229211b1_d3b4_424b_8933_fb2487b16e2f(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
            max_wrap = Math.max(max_wrap, curr_wrap);
        }
        max_wrap = Math.max(max_wrap, 0);
        return Math.max(max_sum, max_wrap + (k - 2) * max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_ab3acf72_f991_4339_8ea6_eed573364140(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0;
        int max_ending_here = 0;
        int max_sum = 0;
        for (int i = 0; i < n; i++) {
            max_sum += a.get(i);
        }
        for (int i = 0; i < n; i++) {
            max_ending_here += a.get(i);
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
        }
        if (k == 1) {
            return max_so_far;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_2_ab3acf72_f991_4339_8ea6_eed573364140(a, n, 1);
        return Math.max(max_wrap, max_sum * (k - 2) + max_so_far);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_4fd239b5_5225_4e8d_8ce0_4010b7501397(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int current_sum = 0;
        for (int i = 0; i < n; i++) {
            current_sum += a.get(i);
            if (current_sum < 0) {
                current_sum = 0;
            }
            max_sum = Math.max(max_sum, current_sum);
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        current_sum = 0;
        for (int i = 0; i < n; i++) {
            current_sum += a.get(i);
            if (current_sum < 0) {
                current_sum = 0;
            }
            max_sum = Math.max(max_sum, current_sum);
        }
        max_sum = Math.max(max_sum, max_wrap * (k - 2));
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_6c6b36d0_c332_46a4_a561_60a9d9717555(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
            if (max_ending_here > max_so_far)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        max_so_far = Math.max(max_so_far, max_wrap * (k - 2));
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_dc36d149_8c96_4473_93eb_7f9757f20f8a(ArrayList<Integer> a, int n, int k) {
        ArrayList<Integer> maxSum = new ArrayList<>();
        int sum = 0, start = 0;
        int max = a.get(0); 
        for( int i=0; i<k; i++) {
            sum = start + a.get(i);
            max = Math.max(max, sum);
            maxSum.add(sum);
            start = sum;
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_88ccc929_6d08_4cf9_a2f3_6bfc7afecb7e(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap > max_wrap) {
                max_wrap = curr_wrap;
            }
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
        }
        max_wrap = max_wrap * (k - 2);
        return Math.max(max_sum, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_03b2a9e2_7729_4e79_a66d_e951f9fedcb9(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0;
        int max_ending_here = 0;
        int max_sum = 0;
        for (int i = 0; i < n; i++) {
            max_sum += a.get(i);
        }
        for (int i = 0; i < n; i++) {
            max_ending_here += a.get(i);
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
        }
        if (k == 1) {
            return max_so_far;
        }
        int max_wrap = max_sum - max_so_far;
        return Math.max(max_so_far, max_wrap + max_so_far * (k - 2));
    }

    
    public static int maxSubArraySumRepeated_Problem_0_4fd239b5_5225_4e8d_8ce0_4010b7501397(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int current_sum = 0;
        for (int i = 0; i < n; i++) {
            current_sum += a.get(i);
            if (current_sum < 0) {
                current_sum = 0;
            }
            max_sum = Math.max(max_sum, current_sum);
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        current_sum = 0;
        for (int i = 0; i < n; i++) {
            current_sum += a.get(i);
            if (current_sum < 0) {
                current_sum = 0;
            }
            max_sum = Math.max(max_sum, current_sum);
        }
        max_sum = Math.max(max_sum, max_wrap * (k - 2));
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_2ce96c1c_4ed6_4899_8235_034ea95c0019(ArrayList<Integer> a, int n, int k) {
        // Write your code here
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
            max_ending_here = Math.max(max_ending_here, 0);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        max_wrap = max_wrap * k;
        if (max_wrap > 0)
            max_so_far = Math.max(max_so_far, max_wrap);
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_6f3e349e_dff8_47dd_9836_ad7afd0f6ca6(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (k == 1)
            return max_so_far;
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_1_6f3e349e_dff8_47dd_9836_ad7afd0f6ca6(a, n, 1);
        return Math.max(max_so_far, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_0ae0d805_12d8_42aa_8674_9b6f2434faff(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int max_so_far = 0;
        int max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        max_sum = max_so_far;
        max_so_far = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        max_sum = Math.max(max_sum, max_so_far);
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_56707c04_0128_4ae2_8774_4d797e085f28(ArrayList<Integer> a, int n, int k) {
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;
        for (int i = 0; i < n * k; i++) {
            curr_sum += a.get( (i % n));
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_1d621b18_c81a_4573_be07_58ce31ab0958(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        max_wrap = max_wrap * k;
        max_so_far = Math.max(max_so_far, max_wrap);
        if (max_so_far == 0)
            return Collections.max(a);
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_5f074b46_2499_48f9_ba64_f881916e616a(ArrayList<Integer> a, int n, int k) {
        // Write your code here
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<a.size(); i++)
        {
            sum += a.get(i);
            if(sum >= max) max = sum;
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_5519e66c_d34e_44aa_b078_aa94f2f1764b(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_b70796c7_9ade_4838_bedb_2317671f7f80(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get( i);
        }
        for (int i = 0; i < n; i++) {
            curr_sum += a.get( i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get( i);
            a.set( i, a.get( i) * -1);
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_0_b70796c7_9ade_4838_bedb_2317671f7f80(a, n, 1);
        return Math.max(max_sum, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_02284ec3_c33f_4dd0_b373_706548e0d51d(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_9c3d8393_98c2_48a1_a67d_5c3028ea8a25(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i >= k) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_d14d4c06_98c8_4d1c_84e8_e0aac6d02713(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for (int i = 0; i < a.size(); i++) {
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum += a.get(i);
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_10718bed_f4fe_4cc6_bbe9_631c57a9b3e0(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_19d1be66_08fc_41b5_ad43_9d0e88d76915(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        if (k == 1)
            return max_so_far;
        int max_val = 0, min_val = 0;
        for (int i = 0; i < n; i++) {
            max_val += a.get(i);
            min_val = Math.min(min_val, max_val);
        }
        int total_sum = max_val * k;
        int max_wrap = total_sum - min_val;
        return Math.max(max_so_far, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_d23777d0_5eff_4d22_93fb_74dc5be1b6ef(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < k; j++){
                temp.add(a.get(i));
                sum -= temp.get(i);
                temp.set(i, sum);
                sum += temp.get(i);
            }
            result.add(sum);
            sum = 0;
        }
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for(int i : result){
            if(i > max)
            {
                max = i;
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_08612910_17e9_493d_96c0_36265c8c6ee8(ArrayList<Integer> a, int n, int k) {
        // Complete this function
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get((i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_5830d948_b92e_4d4a_b08b_3af5b49912d3(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
            if (max_ending_here > max_so_far)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        max_so_far = Math.max(max_so_far, max_wrap * (k - 2));
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_4e025298_7066_4bae_a954_eecde695a7eb(ArrayList<Integer> a, int n, int k) {
        int maxSum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get( i);
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        if (k == 1) {
            return maxSum;
        }
        int maxPrefixSum = 0;
        int maxSuffixSum = 0;
        int totalSum = sum;
        for (int i = 0; i < n; i++) {
            maxPrefixSum += a.get( i);
            if (maxPrefixSum > maxSum) {
                maxSum = maxPrefixSum;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            maxSuffixSum += a.get( i);
            if (maxSuffixSum > maxSum) {
                maxSum = maxSuffixSum;
            }
        }
        if (totalSum > 0) {
            maxSum = Math.max(maxSum, totalSum * (k - 2) + maxPrefixSum + maxSuffixSum);
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_cdb1afcf_2595_472e_8440_8f9da1cead62(ArrayList<Integer> a, int n, int k) {
        // Write your code here
        int max_so_far = 0;
        int max_ending_here = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            max_ending_here = Math.max(max_ending_here + a.get(i), a.get(i));
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_0_cdb1afcf_2595_472e_8440_8f9da1cead62(a, n, 1);
        if (max_wrap > max_so_far && max_wrap != 0)
            max_so_far = max_wrap;
        return max_so_far * k;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_b4308f4b_59aa_4940_962b_a16d8660619e(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        int max_so_far = 0;
        for (int i = 0; i < k; i++) {
            sum = 0;
            ArrayList<Integer> copy = new ArrayList<Integer>(a);
            copy.add(0L);
            for (int j = i; j < copy.size(); j++)
                sum -= copy.get(j);
            sum += copy.get(i);
            int temp_max = sum;
            if (temp_max > max_so_far) {
                max_so_far = temp_max;
            }
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_5de1210c_90aa_4f85_871c_c4b2517ec3b1(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
        }
        max_sum = curr_sum;
        for (int i = 0; i < n; i++) {
            curr_sum = curr_sum - a.get(i) + a.get( (i + n));
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum * k;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_b4308f4b_59aa_4940_962b_a16d8660619e(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        int max_so_far = 0;
        for (int i = 0; i < k; i++) {
            sum = 0;
            ArrayList<Integer> copy = new ArrayList<Integer>(a);
            copy.add(0L);
            for (int j = i; j < copy.size(); j++)
                sum -= copy.get(j);
            sum += copy.get(i);
            int temp_max = sum;
            if (temp_max > max_so_far) {
                max_so_far = temp_max;
            }
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_1c636457_e34f_4731_8113_d051e69328cd(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_74ad5b0d_ab0f_4b9a_a7a9_d546d0ecbab3(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
            max_wrap = Math.max(max_wrap, curr_wrap);
        }
        max_wrap = Math.max(max_wrap, 0);
        return Math.max(max_sum, max_wrap * (k - 2) + max_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_4ad71d04_008d_483b_96ec_d6d91638c2e6(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (k == 1)
            return max_so_far;
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_2_4ad71d04_008d_483b_96ec_d6d91638c2e6(a, n, k - 2);
        return Math.max(max_so_far, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_04ed3aab_cf2c_4a29_90da_4c9d87a67a8d(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
            max_wrap = Math.max(max_wrap, curr_wrap);
        }
        max_wrap = Math.max(max_wrap, 0);
        return Math.max(max_sum, max_wrap * (k - 2) + max_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_8016c8a3_84b8_4d93_924b_6a483462071d(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            sum = sum + a.get(i);
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_d29b6652_5aeb_44a0_80d4_d5139b316621(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        max_sum = sum;
        for (int i = 0; i < n; i++) {
            sum = sum - a.get(i) + a.get( ((i + n) % n));
            max_sum = Math.max(max_sum, sum);
        }
        return max_sum * k;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_afb739c1_bb37_4dc8_bea8_b78156842a9b(ArrayList<Integer> a, int n, int k) {
        int ans = 0;
        int i = 0, j = 0;
        ArrayList<Integer> b = new ArrayList<>();
        while (i<n) {
            b.add(a.get(i));
            i++;
        }
        while (k>0) {
            j++;
            b.add(0,k);
            k--;
        }
        while (b.get(i+1)+b.get(i+2)<=n) {
            ans = Math.max(ans, b.get(i)+b.get(i+1)+b.get(i+2));
            i++;
        }
        return ans;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_02284ec3_c33f_4dd0_b373_706548e0d51d(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_ce6ff9aa_5b65_4d1e_9f87_96365d6033b3(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0;
        int max_ending_here = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (sum < 0)
            return max_so_far;
        int max_sum = max_so_far;
        int min_sum = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here > max_sum)
                max_sum = max_ending_here;
            if (max_ending_here < min_sum)
                min_sum = max_ending_here;
        }
        int max_wrap = 0;
        max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here > max_wrap)
                max_wrap = max_ending_here;
        }
        if (k == 1)
            return max_sum;
        return Math.max(max_sum, max_wrap + (k - 2) * sum + min_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_d2c6307d_8a7f_4dd8_9785_9516735d151c(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap > max_wrap) {
                max_wrap = curr_wrap;
            }
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
        }
        int max_sum_repeated = max_wrap * (k - 2) + max_sum;
        return Math.max(max_sum, max_sum_repeated);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_229211b1_d3b4_424b_8933_fb2487b16e2f(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
            max_wrap = Math.max(max_wrap, curr_wrap);
        }
        max_wrap = Math.max(max_wrap, 0);
        return Math.max(max_sum, max_wrap + (k - 2) * max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_91a97dc4_af70_45d2_a528_90fd4c60cb2f(ArrayList<Integer> a, int n, int k) {
        int largestSum = 0, sum = 0;
        for (int i = 0; i < k; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                sum += a.get(j);
            }
            largestSum = Math.max(largestSum, sum);
        }
        return largestSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_196b503c_e430_4d41_a994_5e3448a10316(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int max_ending_here = 0;
        int max_so_far = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
        }
        if (k == 1) {
            return max_so_far;
        }
        if (sum > 0) {
            max_sum = max_so_far + (k - 2) * sum;
        } else {
            max_sum = max_so_far;
        }
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            if (max_sum < max_ending_here) {
                max_sum = max_ending_here;
            }
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_b15bff6f_5cac_4b0f_b243_c648a182e027(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        int max_sum = Integer.MIN_VALUE;
        int min_sum = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            sum += a.get(i);
            if (min_sum > sum) {
                min_sum = sum;
            }
        }
        if (k == 1) {
            return max_so_far;
        }
        int max_wrap = sum - min_sum;
        if (max_wrap > 0) {
            return Math.max(max_wrap, max_so_far + (k - 2) * sum);
        } else {
            return Math.max(max_wrap, max_so_far);
        }
    }

    
    public static int maxSubArraySumRepeated_Problem_2_6f1fe79f_0270_4a98_8f76_5cf586607842(ArrayList<Integer> a, int n, int k) {
        int max_sum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + a.get(i);
            if (max_sum < sum) {
                max_sum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap = max_wrap + a.get(i);
            a.set(i, a.get(i) * -1);
        }
        int max_wrap_sum = maxSubArraySumRepeated_Problem_2_6f1fe79f_0270_4a98_8f76_5cf586607842(a, n, 1);
        max_wrap = max_wrap + max_wrap_sum;
        if (max_wrap > max_sum) {
            max_sum = max_wrap;
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_9e6409ac_5ebe_44ca_b0e9_28d8e48d7d79(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get( i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get( i);
            a.set( i, a.get( i) * -1);
        }
        max_wrap = max_wrap * k;
        max_so_far = Math.max(max_so_far, max_wrap);
        max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get( i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_1d621b18_c81a_4573_be07_58ce31ab0958(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        max_wrap = max_wrap * k;
        max_so_far = Math.max(max_so_far, max_wrap);
        if (max_so_far == 0)
            return Collections.max(a);
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_06fe1616_e8e9_4808_94ea_4e06e372d043(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int temp = 0;
        for(int i = 0; i < a.size(); i++) {
            temp = temp + a.get(i);
            if(temp == k) {
                temp = 0;
                for (int j = i + 1; j < a.size(); j++) {
                    temp += a.get(j);
                    if (temp > max_sum) {
                        max_sum = temp;
                    }
                }
            }
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_0ae0d805_12d8_42aa_8674_9b6f2434faff(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int max_so_far = 0;
        int max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        max_sum = max_so_far;
        max_so_far = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        max_sum = Math.max(max_sum, max_so_far);
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_f7f4eeb8_5633_465f_b690_bb6ba85dae98(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for(int i = 0; i < a.size(); i++) {
            int sum = 0;
            for(int j = 0; j < k; j++) {
                sum += a.get(i);
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_49657622_888b_493f_8257_fefa1f2e2f3c(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int max_ending_here = 0;
        int max_so_far = 0;
        int max_element = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max_element = Math.max(max_element, a.get(i));
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
        }
        if (max_so_far == 0) {
            return max_element;
        }
        max_sum = max_so_far;
        for (int i = 0; i < n; i++) {
            max_sum = max_sum + a.get(i);
        }
        max_sum = Math.max(max_sum, max_so_far);
        for (int i = 2; i < k; i++) {
            max_so_far = 0;
            max_ending_here = 0;
            for (int j = 0; j < n; j++) {
                max_ending_here = max_ending_here + a.get(j);
                if (max_ending_here < 0) {
                    max_ending_here = 0;
                }
                if (max_so_far < max_ending_here) {
                    max_so_far = max_ending_here;
                }
            }
            max_sum = Math.max(max_sum, max_so_far);
            max_sum = Math.max(max_sum, max_so_far + max_sum);
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_dbd81966_b7c2_432f_a39c_db2f6dc82f2e(ArrayList<Integer> a, int n, int k) {
        int maxSum = -1;
        int sum = 0;
        for (int i=0; i<k; i++) {
            sum += a.get(i);
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        a.add(n);
        sum = 0;
        for (int i=0; i<a.size(); i++) {
            sum += a.get(i);
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_1e139638_e491_49ca_bef7_3b27825278f3(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            curr_sum = curr_sum % n;
            max_wrap = Math.max(max_wrap, curr_sum);
        }
        int ans1 = max_wrap + (k - 2) * sum;
        int ans2 = max_sum;
        return Math.max(ans1, ans2);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_2ce96c1c_4ed6_4899_8235_034ea95c0019(ArrayList<Integer> a, int n, int k) {
        // Write your code here
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
            max_ending_here = Math.max(max_ending_here, 0);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        max_wrap = max_wrap * k;
        if (max_wrap > 0)
            max_so_far = Math.max(max_so_far, max_wrap);
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_cc61bae9_ce0d_4a0c_a3a9_970caadf5bf4(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_5c1066ce_f271_47d4_8f4d_1a142c4d36ca(ArrayList<Integer> a, int n, int k) {
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (i != 0) {
                curr_sum = Math.max(curr_sum, curr_sum + sum * (k - 1));
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_d9b27fc0_a303_433c_aea0_a34bddf47d63(ArrayList<Integer> a, int n, int k) {
        // Write your code here
        return 0;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_d2c6307d_8a7f_4dd8_9785_9516735d151c(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap > max_wrap) {
                max_wrap = curr_wrap;
            }
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
        }
        int max_sum_repeated = max_wrap * (k - 2) + max_sum;
        return Math.max(max_sum, max_sum_repeated);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_5827a413_317b_4b7b_9df6_14572c31303b(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for(int i = 0; i < a.size(); i++) {
            int sum = 0;
            for(int j = i; j < a.size(); j++) {
                sum += a.get(j);
                if(sum > max) {
                    max = sum;
                }
                if(sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_7aa20cc2_e8f1_4172_9f34_fa7f980b1e2e(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for(int i = 0; i < a.size(); i++) {
            int sum = 0;
            for(int j = i; j < a.size(); j += k) {
                sum += a.get(j);
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_17d138af_9a5d_4af7_8158_3e1a55f38f89(ArrayList<Integer> a, int n, int k) {
        int maxSum = Integer.MIN_VALUE;
        
        // Create array list containing all permutations of k elements
        ArrayList<ArrayList<Integer>> perms = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ArrayList<Integer> list = new ArrayList<Integer>(a);
            Collections.shuffle(list);
            perms.add(list);
        }

        // Iterate through all permutations
        for (ArrayList<Integer> perm : perms) {
            // Get the sum of the permutation, add that sum to maxSum
            int sum = 0;
            for (int x : perm) {
                sum += x;
            }
            int tempMaxSum = sum + maxSum;
            if (tempMaxSum > maxSum) {
                maxSum = tempMaxSum;
            }
        }

        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_17d138af_9a5d_4af7_8158_3e1a55f38f89(ArrayList<Integer> a, int n, int k) {
        int maxSum = Integer.MIN_VALUE;
        
        // Create array list containing all permutations of k elements
        ArrayList<ArrayList<Integer>> perms = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ArrayList<Integer> list = new ArrayList<Integer>(a);
            Collections.shuffle(list);
            perms.add(list);
        }

        // Iterate through all permutations
        for (ArrayList<Integer> perm : perms) {
            // Get the sum of the permutation, add that sum to maxSum
            int sum = 0;
            for (int x : perm) {
                sum += x;
            }
            int tempMaxSum = sum + maxSum;
            if (tempMaxSum > maxSum) {
                maxSum = tempMaxSum;
            }
        }

        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_da85718d_4906_4cba_b207_39e27516a476(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get( i);
        }
        max_sum = curr_sum;
        for (int i = n; i < n * k; i++) {
            curr_sum += a.get( i %  n) - a.get( (i - n) %  n);
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_8bbf53c3_9548_4499_a660_e9e28b8243bc(ArrayList<Integer> a, int n, int k) {
        // write your code here
        ArrayList<Integer> result = new ArrayList<>();
        int maxSoFar = 0;
        int currIdx = 0;
        int currIdx2 = 0;
        for (int i = 0; i < a.size(); i++) {
            currIdx = i;
            maxSoFar = 0;
            while (currIdx < a.size() && k > 0) {
                maxSoFar += a.get(currIdx++);
                k--;
            }
            result.add(maxSoFar);
        }
        int res = 0;
        for (Integer i : result) {
            int curr = i;
            for (int j = 1; j < currIdx; j++) {
                curr += a.get(j);
            }
            res = Math.max(res, curr);
        }
        return res;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_74ed4f0c_8af0_4a15_9dc2_9cde236e4d69(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0;
        int max_ending_here = 0;
        int max_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            sum += a.get(i);
        }
        if (sum > 0) {
            max_sum = max_so_far + (k - 2) * sum;
        } else {
            max_sum = max_so_far;
        }
        int curr_max = 0;
        for (int i = 0; i < n; i++) {
            curr_max += a.get(i);
            max_sum = Math.max(max_sum, curr_max);
            if (curr_max < 0)
                curr_max = 0;
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_4e025298_7066_4bae_a954_eecde695a7eb(ArrayList<Integer> a, int n, int k) {
        int maxSum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get( i);
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        if (k == 1) {
            return maxSum;
        }
        int maxPrefixSum = 0;
        int maxSuffixSum = 0;
        int totalSum = sum;
        for (int i = 0; i < n; i++) {
            maxPrefixSum += a.get( i);
            if (maxPrefixSum > maxSum) {
                maxSum = maxPrefixSum;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            maxSuffixSum += a.get( i);
            if (maxSuffixSum > maxSum) {
                maxSum = maxSuffixSum;
            }
        }
        if (totalSum > 0) {
            maxSum = Math.max(maxSum, totalSum * (k - 2) + maxPrefixSum + maxSuffixSum);
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_704cf0d1_36b0_4d25_9ca5_5837b1f86975(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0, max_ending_here = 0;
        for(int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if(max_ending_here < 0)
                max_ending_here = 0;
            if(max_sum < max_ending_here)
                max_sum = max_ending_here;
        }
        int max_wrap = 0;
        for(int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_2_704cf0d1_36b0_4d25_9ca5_5837b1f86975(a, n, 1);
        if(max_wrap > max_sum)
            max_sum = max_wrap;
        return max_sum * k;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_ab5aebc3_4c40_425d_9d4f_31a835022ace(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            if (sum > max_sum) {
                max_sum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        int max_wrap_sum = maxSubArraySumRepeated_Problem_0_ab5aebc3_4c40_425d_9d4f_31a835022ace(a, n, 1);
        max_wrap = max_wrap + max_wrap_sum;
        if (max_wrap > max_sum) {
            max_sum = max_wrap;
        }
        return max_sum;
    }

}
