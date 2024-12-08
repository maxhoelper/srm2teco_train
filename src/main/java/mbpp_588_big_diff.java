package mbpp_588_big_diff;

public class mbpp_588_big_diff {

    
    public static int bigDiff_Problem_0_d7ba5ff5_5cb7_480a_b56f_3b3ab70f306f(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer l : nums) {
            max = Math.max(max, l);
            min = Math.min(min, l);
        }
        return Math.abs(max - min);
    }

    
    public static int bigDiff_Problem_1_24667c10_5b55_41c0_b2c0_06572e620dfd(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_2_1370c7df_15fb_4f06_810a_a4e2d8b24bb6(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_87fd7aef_7c2a_4c24_9588_0b601bb01bb8(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_239bb431_a51b_4c99_8f50_d810075fd307(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_8a0a1ca5_4b04_403a_bfe7_3e8b1657d02b(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_2306c9e1_aba9_41bd_98a5_f31fb07e93f9(ArrayList<Integer> nums) {
        int biggest = 0;
        int smallest = 0;
        for(Integer n : nums) {
            if(n > biggest) {
                biggest = n;
            }
            if(n < smallest) {
                smallest = n;
            }
        }
        return Math.abs(biggest - smallest);
    }

    
    public static int bigDiff_Problem_2_6aa6e378_d90d_4bec_a4fd_88047eb00753(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_ca2e85e6_3e2d_454d_934f_ecceb1dd1721(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_3f1bdd33_52a4_4bd3_a548_69a8e075fea8(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_6de734e7_2765_4d8b_994a_8385d73b97a0(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_93c7057c_b643_4e6f_ac8a_1d3dadbd5ee6(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_2306c9e1_aba9_41bd_98a5_f31fb07e93f9(ArrayList<Integer> nums) {
        int biggest = 0;
        int smallest = 0;
        for(Integer n : nums) {
            if(n > biggest) {
                biggest = n;
            }
            if(n < smallest) {
                smallest = n;
            }
        }
        return Math.abs(biggest - smallest);
    }

    
    public static int bigDiff_Problem_0_9918668a_375c_4285_9798_97db343bb90b(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_0_4c5a5404_a318_480e_84e5_c9102e785ed0(ArrayList<Integer> nums) {
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
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_bf4b7a5f_2c23_40e9_802f_df866edb2091(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Integer i : nums) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_54cc09d9_d67a_4770_951e_d73d47ce8757(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) > max) max = nums.get(i);
            if(nums.get(i) < min) min = nums.get(i);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_ace030e7_ee3f_4873_841b_5691b2402bb6(ArrayList<Integer> nums) {
        Integer min = nums.get(0), max = nums.get(0);
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_9b8e8919_70fa_44a2_ae18_7476ced764b1(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_ca5d1014_0d1e_4692_b473_edee3483a701(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_f4cd0225_0034_40a3_b695_b61b8a73d9d0(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_aa91f6c3_ed15_4f66_a9e6_da52755b6114(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_73878365_c189_49a7_95c8_9db0d96fd6d0(ArrayList<Integer> nums) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_93c7057c_b643_4e6f_ac8a_1d3dadbd5ee6(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_6d113970_87c1_4c55_bae8_f6eecf776cde(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Integer num : nums) {
            min = num < min ? num : min;
            max = num > max ? num : max;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_b817d747_9718_4d4d_94aa_ce5ddbebdf7c(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_aef2613c_fa09_4e2f_9307_4fbe5045700d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_04bb4a0f_32f4_4bf4_87e7_e01b51e9e58e(ArrayList<Integer> nums) {
        if(nums.size()==0) return -1;
        
        int max = Collections.max(nums);
        int min = Collections.min(nums);
        
        for(Integer n:nums){
            if(n>max) max=n;
            if(n<min) min=n;
        }
        
        return max-min;
    }

    
    public static int bigDiff_Problem_0_db9f5128_32f9_40b6_b8be_157755c51247(ArrayList<Integer> nums) {
        // Find largest and smallest element
        int smallestNum = nums.stream().min(Integer::compareTo).get();
        int largestNum = nums.stream().max(Integer::compareTo).get();
        System.out.println("Smallest number : " + smallestNum);
        System.out.println("Largest number : " + largestNum);
        return largestNum - smallestNum;
    }

    
    public static int bigDiff_Problem_1_25cd7b9a_303e_4e6b_9595_d45bd845de36(ArrayList<Integer> nums) {
        int min = nums.stream().map(n -> n).min(Comparator.naturalOrder()).get();
        int max = nums.stream().map(n -> n).max(Comparator.naturalOrder()).get();
        int diff = Math.abs(max - min);
        return diff;
    }

    
    public static int bigDiff_Problem_2_1bd176b0_f90a_4b7a_87c7_eb979bda7fc5(ArrayList<Integer> nums) {
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
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_42b3699f_523c_4f34_93bd_328c2b2bcc1f(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_824ee85d_009b_407e_9aa3_03a4f937cd8e(ArrayList<Integer> nums) {
        int result = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        result = max - min;
        return result;
    }

    
    public static int bigDiff_Problem_0_04bb4a0f_32f4_4bf4_87e7_e01b51e9e58e(ArrayList<Integer> nums) {
        if(nums.size()==0) return -1;
        
        int max = Collections.max(nums);
        int min = Collections.min(nums);
        
        for(Integer n:nums){
            if(n>max) max=n;
            if(n<min) min=n;
        }
        
        return max-min;
    }

    
    public static int bigDiff_Problem_1_f73f58c4_29b6_4773_8c8c_6082153bd55d(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_3f1bdd33_52a4_4bd3_a548_69a8e075fea8(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_c23b2a4e_78f0_4f07_bd71_a92a1fd1643c(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_f47aaed3_0d0e_40ba_92ca_535912a3a9d2(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (Integer num : nums) {
            if (num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_5188fcf1_05e5_4485_911c_51369ffd77b8(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_d95fa8c5_33d7_42e9_89a8_f2d4cf4d04d7(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int res = 0;
        int temp = 0;
        for(int n: nums) {
            if(n > max) max = n;
            if(n < min) min = n;
        }
        for(int n: nums) {
            temp = Math.abs(n - max);
            res = Math.max(res, temp);
        }
        return res;
    }

    
    public static int bigDiff_Problem_0_ebd57082_76b9_440e_81f2_83f694ab8784(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_efbc029a_da8f_4e16_803e_e2c5864b8743(ArrayList<Integer> nums) {
        if (nums.size() == 1) return nums.get(0);
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) max = nums.get(i);
            if (nums.get(i) < min) min = nums.get(i);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_bff606e5_ac77_4ebc_823c_873dd53966d6(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_569be6da_0014_492f_939d_a8738ccf5c79(ArrayList<Integer> nums) {
        int max = Collections.max(nums);
        int min = Collections.min(nums);
        return max - min;
    }

    
    public static int bigDiff_Problem_2_d4eda451_0247_4f3f_a31f_df2062d860bf(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_57a74662_3c96_40f4_b067_5dd5d6a50a04(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_c5746b5f_4bfd_45cc_ae37_c596cb85335c(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_0_631f48f7_45c5_43ef_8fe5_b716a01464b4(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_d0dafacf_61fa_41c2_b1c4_f0d36a5e23d9(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : nums) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_e83d3d3e_e2dc_4f71_b558_c9a7f9aa27f4(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_2_5bb9b352_af48_4cbd_b463_b61020c39d7e(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_d4a1f86c_8306_4a8a_9072_8c595f45b07b(ArrayList<Integer> nums) {
        int bigNum = nums.get(0);
        int smallNum = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > bigNum)
                bigNum = nums.get(i);
            if (nums.get(i) < smallNum)
                smallNum = nums.get(i);
        }
        int difference = bigNum - smallNum;
        System.out.println("difference is: " + difference);
        return difference;
    }

    
    public static int bigDiff_Problem_2_a6714244_57f2_458f_8152_35c578c195e0(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_754d3056_cc19_4bf7_93bc_d54b7c564dac(ArrayList<Integer> nums) {
        int max = 0;
        int min = 0;
        for (Integer l : nums) {
            if (l > max) {
                max = l;
            }
            if (l < min) {
                min = l;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_d7ba5ff5_5cb7_480a_b56f_3b3ab70f306f(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer l : nums) {
            max = Math.max(max, l);
            min = Math.min(min, l);
        }
        return Math.abs(max - min);
    }

    
    public static int bigDiff_Problem_2_8a0a1ca5_4b04_403a_bfe7_3e8b1657d02b(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_5478832a_dc8e_4926_95a5_dc83169f139e(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_ebddeb8e_4d14_4f2e_8b77_79647684eb27(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_df1b45b0_ab47_47cf_8b69_1b974c1cfd75(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        int diff = max - min;
        for (int i = 1; i < nums.size(); i++) {
            if (max < nums.get(i)) {
                max = nums.get(i);
            }
            if (min > nums.get(i)) {
                min = nums.get(i);
            }
            diff = max - min;
        }
        return diff;
    }

    
    public static int bigDiff_Problem_0_05519d09_1311_4201_87a2_0b84c7773301(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_0_e5d351c0_13c6_4e91_9b65_689b4e26fdb0(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_e5d351c0_13c6_4e91_9b65_689b4e26fdb0(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_311667ed_1221_47e1_81a2_cf76f3589730(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) { // loop through all elements
            if (num > largest) { // if current element is greater than largest
                largest = num; // update largest to current element
            } else if (num < smallest) { // if current element is smaller than smallest
                smallest = num; // update smallest to current element
            }
        }
        return largest - smallest; // return difference between largest and smallest
    }

    
    public static int bigDiff_Problem_2_a6360c46_2ff1_4207_9be3_38eedd986f20(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_ac738001_1fa4_4f1f_966d_b6bdc764a3ad(ArrayList<Integer> nums) {
        return nums.stream().filter(n -> n > 0).map(n -> n).reduce(0, (a, b) -> a - b);
    }

    
    public static int bigDiff_Problem_0_7af5e55a_93e9_4d51_a7c6_ee0b21d7f232(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_0_27187f11_d984_487c_b5fc_4f30c359083b(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_95d4c9dc_b83f_43e8_91e3_567b3d17439f(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_d7da0401_7a39_4d34_86b0_91866d7b87ec(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_b9c137e5_0a5b_4ba0_8f26_a265e3ca3258(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_a18d04c3_6b5c_4f30_bd2c_87ca173a003d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_a2c29cfc_aa1f_4bb1_8d6c_aad21454c848(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_f812ccd7_0666_491b_b9a7_83a87a057ba6(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer i : nums) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_8c68d14a_752a_400e_b48a_5123d7dd103e(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_48e56af4_05bb_4072_8450_bb62e512dd22(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_1_999614f6_b6a5_4761_95be_59f32913800c(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_8fc2543e_f5f7_4315_ac69_c3ce2f73be67(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_5eeb9e9a_a5ad_41b9_b8e3_e23ec4254530(ArrayList<Integer> nums) {
        if(nums.size() == 1) {
            return nums.get(0);
        }
        int max = nums.get(0);
        int min = nums.get(0);
        for(int i = 1; i < nums.size(); i++) {
            max = Math.max(max, nums.get(i));
            min = Math.min(min, nums.get(i));
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_c3bd811a_a25d_4f59_9088_1f3d0c88eb70(ArrayList<Integer> nums) {
        int biggest = nums.stream().map(Integer::valueOf).max(Integer::compareTo).get();
        int smallest = nums.stream().map(Integer::valueOf).min(Integer::compareTo).get();
        return biggest - smallest;
    }

    
    public static int bigDiff_Problem_2_610d14c1_e35f_40ce_984c_f2fc16579677(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_32a930af_0030_4e30_9047_913cf1e4673c(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_40dad8e8_be60_4b3c_8125_4bf460a794e6(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_a5e8cd0f_e0c5_4fc8_b020_22518e89657f(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_28afac1d_97a0_45de_bd8d_e04c83c1c922(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_20c1bf6d_e841_4fd9_aa60_cd5c5aeb5b00(ArrayList<Integer> nums) {
        int max = Collections.max(nums);
        int min = Collections.min(nums);
        int result = max-min;
        return result;
    }

    
    public static int bigDiff_Problem_2_a7528a49_baa7_4124_b612_97a8929caf68(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_87fd7aef_7c2a_4c24_9588_0b601bb01bb8(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_c5a69916_b987_4949_96c8_852507e5f2f8(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_e4bb3f87_7e9e_48d6_85e5_2203efd032c1(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_a1604620_dc8a_48c4_be6c_d05449858cc9(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_b885002b_e632_4624_8b9a_833dbaeaa137(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_f1422f16_b74b_4706_b462_78dfa68b61db(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_a775f277_e52a_4bb5_9afa_9676c523b3af(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_1293de3c_70b4_4ef7_935f_c77e51dfd0cd(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
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

    
    public static int bigDiff_Problem_2_c72d68c2_9546_4845_be79_126d84ff7d1c(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_1_aa625910_e984_4df6_a00f_51d5d3fbbb88(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_287a828a_689e_40ac_b2af_5683a64661e2(ArrayList<Integer> nums) {
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
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_021f883d_6b36_403d_a16f_69b2c0d5f2d0(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            max = Math.max(max, nums.get(i));
            min = Math.min(min, nums.get(i));
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_b2ae12e9_c3da_4f96_b7fd_9fe6c8e5a1eb(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_9523a2d0_26d5_49c1_a051_6d24edb83e60(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_de115472_2502_4ccd_84ee_dc7b8dec3ff2(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_b7bd9a12_0d24_45d7_b1ae_8e3e9ecced33(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_f265816b_f8f7_434e_9bd9_0d9103ff16e5(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
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

    
    public static int bigDiff_Problem_1_52d7f9bd_a0a6_4016_8aa8_7cfad59d494c(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(Integer l : nums) {
            max = Math.max(max,l);
            min = Math.min(min,l);
        }
        return Math.abs(max-min);
    }

    
    public static int bigDiff_Problem_0_cf9593c8_c683_4cb3_9352_37d81b0479df(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_77a17707_d8eb_4976_aab0_3fb19379114e(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_609511b6_e9c3_42a8_8180_c33b300357bf(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_88aeb0a9_c2f4_4167_aa76_5f8f735d0838(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_faad0cd9_1d9d_48b8_a795_f88efd410038(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_577432ed_2065_46c2_acaa_2d0a9209c429(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_a5e8cd0f_e0c5_4fc8_b020_22518e89657f(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_4e76f7fb_c46e_4e8c_97ad_96233d623d24(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_04bb4a0f_32f4_4bf4_87e7_e01b51e9e58e(ArrayList<Integer> nums) {
        if(nums.size()==0) return -1;
        
        int max = Collections.max(nums);
        int min = Collections.min(nums);
        
        for(Integer n:nums){
            if(n>max) max=n;
            if(n<min) min=n;
        }
        
        return max-min;
    }

    
    public static int bigDiff_Problem_1_fc6ee75c_dfac_4ca9_b30c_6d137609e51b(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_f1b5f4a8_da19_4be8_a999_715dd7cba59e(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_3bdf7677_adba_4a9e_bc72_e03c90f1455a(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_42180f98_341e_408d_b8e3_671e9726c92c(ArrayList<Integer> nums) {
        Collections.sort(nums);
        return nums.get(nums.size() - 1) - nums.get(0);
    }

    
    public static int bigDiff_Problem_0_87d39181_26ed_4300_8c41_8ee5f52e62e2(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_9b8e8919_70fa_44a2_ae18_7476ced764b1(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_f7807077_fbb9_41b5_8e61_7c96b2b48163(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n: nums) {
            if (n < min) min = n;
            if (n > max) max = n;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_1e9a41db_b2cb_4908_b89c_e44f7f72f390(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_85215c97_f79e_476e_bc35_7d0f54097a91(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_ab97be88_d12f_4146_9bf2_5ff9fcc1eb79(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_cfb25f91_ab54_4239_8093_239105128787(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_b9c137e5_0a5b_4ba0_8f26_a265e3ca3258(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_70ddb6e8_5361_4854_b0fd_b9d3ad20f8d0(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_19714b02_79e9_49eb_8c7a_257bc3940cb0(ArrayList<Integer> nums) {
        int max_val = Collections.max(nums);
        int min_val = Collections.min(nums);
        return max_val - min_val;
    }

    
    public static int bigDiff_Problem_0_5a246187_8ba3_4aca_a80f_cfd578ccb4d9(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_b885002b_e632_4624_8b9a_833dbaeaa137(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_23d9b51a_d335_45b7_881b_812de58c870f(ArrayList<Integer> nums) {
        int l = nums.get(0);
        int r = nums.get(0);
        for(int i = 0;i<nums.size();i++) {
            if(nums.get(i)>r) r = nums.get(i);
            if(nums.get(i)<l) l = nums.get(i);
        }
        return r-l;
    }

    
    public static int bigDiff_Problem_1_45fb57ac_c6dc_42d2_ad61_fb5b2c5f910b(ArrayList<Integer> nums) {
        int result = nums.stream().map(x -> Math.abs(x)).reduce(Math::max).get();
        return result - nums.stream().map(x -> Math.abs(x)).reduce(Math::min).get();
    }

    
    public static int bigDiff_Problem_2_3a5754d8_75f4_49dd_8dcc_44032b403621(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_322e67dc_4e8a_4fb9_80e8_01de8e94178c(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_ff046637_3ea1_4c8f_8484_a78da02dd3ef(ArrayList<Integer> nums) {
        Collections.sort(nums);
        Integer max = nums.get(0);
        Integer min = nums.get(0);
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            } else if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_66e1f9c8_02d9_47cf_b532_dbe99581a494(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_7400a331_74c1_409f_9111_7db6f7c9ce93(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_57ee18ff_4102_46bd_b32f_f036482e63c9(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_a8f39498_a037_404d_9199_cd550c7d166b(ArrayList<Integer> nums) {
        int max = nums.stream().mapToInteger(i -> i).max().getAsInteger();
        int min = nums.stream().mapToInteger(i -> i).min().getAsInteger();
        int diff = max - min;
        return diff;
    }

    
    public static int bigDiff_Problem_2_7c21f2e7_bc86_4919_9d7f_83068eb7c6fb(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_3071abb6_9e59_4d32_bade_3f865e0c273a(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, sum = 0;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            sum = num + sum;
        }
        return sum - min - max;
    }

    
    public static int bigDiff_Problem_2_8009eb65_84b0_46c1_83c3_235342c638c3(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_2_ed96abc3_6092_40bc_b377_034c0b661cb7(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Integer n: nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_5fa9b4f5_e015_485c_846a_037f1386b077(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            min = Math.min(min, nums.get(i));
            max = Math.max(max, nums.get(i));
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_0065c19b_8a9d_468a_9de4_67f6ffd80bd0(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_bb780049_ff04_454d_be95_1aa9addcccf4(ArrayList<Integer> nums) {
        return nums.stream().reduce((x,y) -> Math.abs(x-y)).orElse(0L);
    }

    
    public static int bigDiff_Problem_0_5713f0e0_ddea_4016_b24c_44dc3fdbf2a7(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_7a37af51_2191_48f9_ba74_3347c7b0fcb6(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_73f24e6b_1c37_45ff_a546_52a1928efc9b(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_1a6c40c5_38ba_42a2_bd8d_7b710cdd120c(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_0477b283_153a_4890_90d1_090b96f29c72(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_5cce7507_2442_425a_9c1d_c8128494bcb6(ArrayList<Integer> nums) {
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
        return Math.abs(max - min);
    }

    
    public static int bigDiff_Problem_2_8906cdbd_fae1_4f78_8ded_5cdcb24f4766(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_c53462cc_1cb7_4c62_b153_15417da333fb(ArrayList<Integer> nums) {
        int length = nums.size();
        int smallest = nums.get(0);
        int largest = nums.get(0);
        for(int i = 1; i<length;i++){
            if(nums.get(i) < smallest) smallest = nums.get(i);
            else if(nums.get(i) > largest) largest = nums.get(i);
        }
        int max = largest - smallest;
        return max;
    }

    
    public static int bigDiff_Problem_1_c72d68c2_9546_4845_be79_126d84ff7d1c(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_0_1623234d_a29e_4a69_99e7_b325bc8b65ba(ArrayList<Integer> nums) {
        int max = Collections.max(nums);
        int min = Collections.min(nums);
        int diff = max - min;
        return diff;
    }

    
    public static int bigDiff_Problem_2_1898f315_c317_45d5_a6b3_2d89981a612a(ArrayList<Integer> nums) {
        int result = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int n : nums) {
            if(n > max) {
                max = n;
            }
            if(n < min) {
                min = n;
            }
        }
        result = max - min;
        return result;
    }

    
    public static int bigDiff_Problem_0_f38a97cd_8bc2_4c96_b885_eb385635e11c(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_c53462cc_1cb7_4c62_b153_15417da333fb(ArrayList<Integer> nums) {
        int length = nums.size();
        int smallest = nums.get(0);
        int largest = nums.get(0);
        for(int i = 1; i<length;i++){
            if(nums.get(i) < smallest) smallest = nums.get(i);
            else if(nums.get(i) > largest) largest = nums.get(i);
        }
        int max = largest - smallest;
        return max;
    }

    
    public static int bigDiff_Problem_0_5434f2e6_271b_44ca_b1dd_765605fcb5ac(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_fb6c6c9c_e850_4401_850f_0f652e54fd05(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_5eeb9e9a_a5ad_41b9_b8e3_e23ec4254530(ArrayList<Integer> nums) {
        if(nums.size() == 1) {
            return nums.get(0);
        }
        int max = nums.get(0);
        int min = nums.get(0);
        for(int i = 1; i < nums.size(); i++) {
            max = Math.max(max, nums.get(i));
            min = Math.min(min, nums.get(i));
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_1ed17f36_23a3_47dc_b8a1_7caf146bd124(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_0_901b9f06_f55b_46bd_b924_59a091f14691(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_fe29a6c5_3ab1_4675_8533_fa2386645399(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_984806b3_7706_4537_8279_44d8ff1c6a64(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (Integer num : nums) {
            if (num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_fd958a1b_a6dd_49e0_bdfc_70e959d2803e(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_2_f265816b_f8f7_434e_9bd9_0d9103ff16e5(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
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

    
    public static int bigDiff_Problem_0_1106629c_ddc5_4bda_8412_82732565b1d4(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_79489941_2e2f_4d6f_be92_37e1555f5121(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_2e22e6e6_8214_43b7_a23a_a8b5f46fdf5a(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_c7f2388e_fa86_4229_80fd_0375b4d205c0(ArrayList<Integer> nums) {
        Integer[] numsArray = nums.stream().toArray(Integer[]::new);
        Arrays.sort(numsArray);
        return numsArray[numsArray.length - 1] - numsArray[0];
    }

    
    public static int bigDiff_Problem_1_0c6507a5_a1ff_4d90_afb5_509a929206cd(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for(int i : nums) {
            if(i < min) {
                min = i;
            }
            if(i > max) {
                max = i;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_b2db4424_3954_4661_be9a_1fa6dd96af8a(ArrayList<Integer> nums) {
        int max = nums.stream().max((a, b) -> Integer.compare(a, b)).get();
        int min = nums.stream().min((a, b) -> Integer.compare(a, b)).get();
        return max - min;
    }

    
    public static int bigDiff_Problem_2_7cf4840e_6070_411a_b531_b07c0e5a873e(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_8da5415e_5853_493a_9106_0f1b0718e2b5(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_c5725442_e94b_484e_9300_1058e51b32a0(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_c66169d8_35be_482a_b97d_fc3e55e42a17(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int n : nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_a90043f7_44ca_42ee_8bc3_13d60881bd12(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_85215c97_f79e_476e_bc35_7d0f54097a91(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_78fb5921_7a52_41a2_8619_af5bf250c4b6(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_0_ccb8d1f5_8681_4adb_8a95_f8ae20338411(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_e1468c0e_4bca_4d84_a4db_44dae4d8f97e(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_16542ad8_1798_41d1_8937_82e1ab6349c6(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_a8f39498_a037_404d_9199_cd550c7d166b(ArrayList<Integer> nums) {
        int max = nums.stream().mapToInteger(i -> i).max().getAsInteger();
        int min = nums.stream().mapToInteger(i -> i).min().getAsInteger();
        int diff = max - min;
        return diff;
    }

    
    public static int bigDiff_Problem_1_ed8541b3_573f_4f27_ac64_e1372a732ed9(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_e1c63a3e_1d38_4062_86c1_724c4357a153(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_15a223c5_c146_48fd_93f3_863c42cf08e0(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_9b8e8919_70fa_44a2_ae18_7476ced764b1(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_7223cea6_a13f_4a46_9730_6b928e676120(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_2733f0f5_3f08_41c1_acbb_d18be7ec601f(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_6c64a129_1167_4817_bcea_a4e3cffbd1ad(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_8a0a1ca5_4b04_403a_bfe7_3e8b1657d02b(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_fcb929bc_b551_469e_bdd4_79389f9bb001(ArrayList<Integer> nums) {
        Collections.sort(nums);
        int max = nums.get(nums.size() - 1);
        int min = nums.get(0);
        return max - min;
    }

    
    public static int bigDiff_Problem_1_f265816b_f8f7_434e_9bd9_0d9103ff16e5(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
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

    
    public static int bigDiff_Problem_1_27187f11_d984_487c_b5fc_4f30c359083b(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_82a3f25f_4706_411e_9f8d_8a9a39319e69(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_75e8383d_819b_4044_ac49_39abcdd785a0(ArrayList<Integer> nums) {
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
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_4a827c20_3a42_4cba_92a9_b708fff73ead(ArrayList<Integer> nums) {
        // write code here
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_11c829b8_3c4c_4094_95c8_9b87dc6a1ef3(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_32a930af_0030_4e30_9047_913cf1e4673c(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_d4409ee8_f8ee_454e_aea8_6203c3d1c968(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_2_2a987f35_0226_467a_b5d9_18c310fc4e2c(ArrayList<Integer> nums) {
        if (nums.size() == 1) {
            return nums.get(0);
        }
        int min = nums.stream().mapToInteger((Integer num) -> num).min().getAsInteger();
        int max = nums.stream().mapToInteger((Integer num) -> num).max().getAsInteger();
        return max - min;
    }

    
    public static int bigDiff_Problem_1_2ea9a4f1_adb4_453a_ba5a_b54e99cacd5e(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_1_1106629c_ddc5_4bda_8412_82732565b1d4(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_cadc7447_a5a5_4dae_9b06_12c062fa308b(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_0_2733f0f5_3f08_41c1_acbb_d18be7ec601f(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_0f51f419_9197_484c_a35f_459c3f0b4269(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_09dac9d1_2eb1_44d6_a589_1b8847cf838d(ArrayList<Integer> nums) {
        int max = Collections.max(nums);
        int min = Collections.min(nums);
        return max - min;
    }

    
    public static int bigDiff_Problem_0_c91df87e_00d6_464f_92e7_78e0f67ab1fd(ArrayList<Integer> nums) {
        if(nums.size()==0) {
            return 0;
        }
        else if(nums.size()==1) {
            return nums.get(0);
        }
        Integer min = nums.get(0), max = nums.get(0);
        for(int i=1; i<nums.size(); i++) {
            if(nums.get(i)>max) {
                max = nums.get(i);
            }
            if(nums.get(i)<min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_e041b161_780e_482e_b8ac_2a0c143a7eaa(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_61431935_02a0_4549_ac4c_2931ccbcb8b4(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_d7da0401_7a39_4d34_86b0_91866d7b87ec(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_e131800e_09c8_4438_bd53_17f36a132f07(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int n: nums) {
            if(n > max)
                max = n;
            else if(n < min)
                min = n;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_5e5c7cfe_9e79_417b_8f6d_be34b32df4de(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_2c237a9d_529c_471e_a380_e08b5acb8bf7(ArrayList<Integer> nums) {
        int minVal = nums.get(0);
        int maxVal = nums.get(0);

        for (int num : nums) {
            if (num > maxVal) {
                maxVal = num;
            } else if (num < minVal) {
                minVal = num;
            }
        }

        int diff = maxVal - minVal;
        return diff;
    }

    
    public static int bigDiff_Problem_0_1fde9f8f_597a_429e_a1be_e81bdd820ee3(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_8a4de2fd_8958_4bbf_ae44_c841980f5bcb(ArrayList<Integer> nums) {
        if(nums.size() == 0) return 0;
        int result = nums.get(0);
        for(int l : nums) {
            result = Math.max(result, l);
        }
        for(int l : nums) {
            result = Math.min(result, l);
        }
        return result;
    }

    
    public static int bigDiff_Problem_0_75c437a6_8690_411f_aa93_965f399f15ac(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (max < num) max = num;
            if (min > num) min = num;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_88dde53c_41ee_4f26_9643_82d8945335ed(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_76573c0c_9304_4353_aea3_aaac34bdd771(ArrayList<Integer> nums) {
        int i = 0;
        int max = 0;
        int min = 0;
        for (Integer num: nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            i++;
        }
        System.out.println("Largest value: " + max + " and smallest value: " + min);
        return max - min;
    }

    
    public static int bigDiff_Problem_0_4c70c506_8b0e_4493_942d_2b19a00e9384(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_ac738001_1fa4_4f1f_966d_b6bdc764a3ad(ArrayList<Integer> nums) {
        return nums.stream().filter(n -> n > 0).map(n -> n).reduce(0, (a, b) -> a - b);
    }

    
    public static int bigDiff_Problem_0_460aca92_bb48_40a4_a0e2_49e596e35df1(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_3071abb6_9e59_4d32_bade_3f865e0c273a(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, sum = 0;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            sum = num + sum;
        }
        return sum - min - max;
    }

    
    public static int bigDiff_Problem_2_56494dfd_dc4c_4e4b_9d16_999e4adc6b7d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_203b3435_0d86_4df7_99d8_f50ee775aa13(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_60f2af68_c953_464b_8748_dad678d5257b(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_0_c82acc85_113c_4b8e_afa9_0b3dd21fde60(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_41751010_e52d_45af_a062_2063e62cf7e3(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_06da4761_dead_46f7_a57a_5a5442f430e6(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.size(); i++) {
            if(max < nums.get(i))
                max = nums.get(i);
            if(min > nums.get(i))
                min = nums.get(i);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_f6363a37_adde_4de2_849a_d3db82d201c9(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_2_e85e6c8b_70ee_4f4d_b2d8_5cb16083f0c3(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_a36936dd_20d0_44de_86cd_ad1573545fc4(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_1ed3e88a_dcc6_47c7_9424_19be2d140d0a(ArrayList<Integer> nums) {
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if(nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_23079c4b_38ab_44fc_b8bb_6d187d079c1b(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int count = 0;
        for (Integer l : nums) {
            count++;
            if (l > max) {
                max = l;
            } else if (l < min) {
                min = l;
            }
        }
        if (max - min == count) {
            return count;
        } else {
            return -1;
        }
    }

    
    public static int bigDiff_Problem_2_2ec3fd03_efc6_4b74_a471_76e783e5947e(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int temp = 0;
        int d = 0;
        for (int i = 0; i < nums.size(); i++) {
            temp = nums.get(i);
            if (max < temp) {
                max = temp;
            }
            if (min > temp) {
                min = temp;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_20c1bf6d_e841_4fd9_aa60_cd5c5aeb5b00(ArrayList<Integer> nums) {
        int max = Collections.max(nums);
        int min = Collections.min(nums);
        int result = max-min;
        return result;
    }

    
    public static int bigDiff_Problem_2_15bfbf31_25f7_4fa8_9f80_07435069eddf(ArrayList<Integer> nums) {
        Collections.sort(nums);
        return nums.get(nums.size() - 1) - nums.get(0);
    }

    
    public static int bigDiff_Problem_2_2093593a_f77d_42ed_9528_66f0848692bb(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num: nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        if(max > min) {
            return max - min;
        } else {
            return 0;
        }
    }

    
    public static int bigDiff_Problem_2_b7f30c38_783f_4025_847a_4b8742dfc49d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_28fe75bc_4e27_42b5_bdd3_4c9359a886b4(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_3a5754d8_75f4_49dd_8dcc_44032b403621(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_285029b6_c687_4775_ba5c_d33b698e73e2(ArrayList<Integer> nums) {
        int maxVal = nums.get(0);
        int minVal = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > maxVal) {
                maxVal = nums.get(i);
            }
            if (nums.get(i) < minVal) {
                minVal = nums.get(i);
            }
        }
        return maxVal - minVal;
    }

    
    public static int bigDiff_Problem_0_eac69f9e_a776_4bc9_a7fb_c1726b6cedb8(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_24a98fad_ff75_4222_96ab_b02a23475b12(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_f1b5f4a8_da19_4be8_a999_715dd7cba59e(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_311667ed_1221_47e1_81a2_cf76f3589730(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) { // loop through all elements
            if (num > largest) { // if current element is greater than largest
                largest = num; // update largest to current element
            } else if (num < smallest) { // if current element is smaller than smallest
                smallest = num; // update smallest to current element
            }
        }
        return largest - smallest; // return difference between largest and smallest
    }

    
    public static int bigDiff_Problem_0_7a6f42c3_d1d4_4d41_b544_d053d185ab05(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_f718d836_a174_4f20_ac34_e24f7488ab5a(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            max = Math.max(max, nums.get(i));
            min = Math.min(min, nums.get(i));
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_07f31056_b5b8_41ea_b9af_cc19c8b53076(ArrayList<Integer> nums) {
        Integer max = Collections.max(nums);
        Integer min = Collections.min(nums);
        return Math.abs(max - min);
    }

    
    public static int bigDiff_Problem_0_dfbab8b5_b4ea_4d55_a641_a89d520d514a(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_baf41e24_1ea9_4761_b3c3_324f2b7e9c53(ArrayList<Integer> nums) {
        Integer[] intArray = new Integer[nums.size()];
        nums.toArray(intArray);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) max = nums.get(i);
            if (nums.get(i) < min) min = nums.get(i);
        }
        int result = max - min;
        return result;
    }

    
    public static int bigDiff_Problem_2_134d1034_2317_42e1_a165_fc17fe64e6dd(ArrayList<Integer> nums) {
        return nums.stream().max(Integer::compare).get() - nums.stream().min(Integer::compare).get();
    }

    
    public static int bigDiff_Problem_2_77f09768_6005_4cfc_830b_a04330c3a9c3(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_87d39181_26ed_4300_8c41_8ee5f52e62e2(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_be95b62a_9ae1_4ee1_b6f9_92fc910248ac(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_c5746b5f_4bfd_45cc_ae37_c596cb85335c(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_1_4bd28907_194d_4578_be57_d1e8694d94ef(ArrayList<Integer> nums) {
        int max = Collections.max(nums);
        int min = Collections.min(nums);
        return max - min;
    }

    
    public static int bigDiff_Problem_0_236df4aa_d48e_469d_8e72_490b2f442b8c(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_88600a4f_65b0_4fb2_b964_aea3c94d19f3(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_9d42e803_170e_4716_8681_1f5720d0eb26(ArrayList<Integer> nums) {
        int result = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > result) {
                result = num;
            }
        }
        return result;
    }

    
    public static int bigDiff_Problem_1_5bb9b352_af48_4cbd_b463_b61020c39d7e(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_30553cc7_93c6_4b92_9b3f_e832342214d1(ArrayList<Integer> nums) {
        int diff = 0;
        if (nums.size() < 2)
            return 0;
        else if (nums.size() == 2) {
            int min = nums.get(0);
            int max = nums.get(1);
            if (min > max)
                diff = min - max;
            else
                diff = max - min;
        } else {
            int index = 0;
            int max = nums.get(0);
            int min = nums.get(1);
            int prevMax = max;
            int prevMin = min;
            for (int i = 2; i < nums.size(); i++) {
                if (nums.get(i) > max) {
                    max = nums.get(i);
                    index = i;
                }
                if (nums.get(i) < min) {
                    min = nums.get(i);
                    index = i;
                }
                if (nums.get(i) > prevMax) {
                    prevMax = nums.get(i);
                }
                if (nums.get(i) < prevMin) {
                    prevMin = nums.get(i);
                }
            }
            diff = max - min;
            if (diff == 0)
                diff = Math.abs(prevMin - prevMax);
            else if (prevMin > prevMax)
                diff = Math.abs(prevMax - min);
            else if (prevMin < prevMax)
                diff = Math.abs(prevMax - max);
        }
        return diff;
    }

    
    public static int bigDiff_Problem_0_fc834724_617e_4bc4_a80a_a953ba036bbb(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0);
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if(nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_4c70c506_8b0e_4493_942d_2b19a00e9384(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_c944ca51_278d_428a_b5d5_cb9b0f5736cc(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_2_8afc9a6e_7736_47cf_8b0f_810491da7931(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_0_7b5a7b0f_d347_43ce_b69c_24f73016399c(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_1f276960_fc1c_457b_b5a7_37ef7c52e872(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_ccc34bb7_873d_4688_937e_5452bdf82c8d(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_5a31eb28_0b11_4f7f_8615_70410cfd4d20(ArrayList<Integer> nums) {
        return nums.stream().reduce((x, y) -> Math.max(x, y) - Math.min(x, y)).get();
    }

    
    public static int bigDiff_Problem_1_bc658861_b573_4380_a1fa_e1056628b801(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int n: nums) {
            if(n > max) {
                max = n;
            }
            if(n < min) {
                min = n;
            }
        }
        int diff = Math.abs(max - min);
        return diff;
    }

    
    public static int bigDiff_Problem_2_8cb8bda5_79e0_4b28_86a8_ec74cdb6a3ec(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_bcbe1eff_15fe_4f4c_abb0_8bdb0de4bdd8(ArrayList<Integer> nums) {
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_c335b374_492f_45ea_8c5b_c75ee6845f38(ArrayList<Integer> nums) {
        int max = nums.stream().mapToInteger(Integer::intValue).max().getAsInteger();
        int min = nums.stream().mapToInteger(Integer::intValue).min().getAsInteger();
        int diff = (max - min);
        return diff;
    }

    
    public static int bigDiff_Problem_1_d0c768b6_df66_4495_85d7_d994a4173855(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_f38a97cd_8bc2_4c96_b885_eb385635e11c(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_95464e24_2e2a_40eb_8ab9_3f1060a162b7(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_5713f0e0_ddea_4016_b24c_44dc3fdbf2a7(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_60c00632_5391_4dc0_a128_0631c75f53c3(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(Integer i : nums) {
            if(i < min)
                min = i;
            else if(i > max)
                max = i;
        }
        if(min == max) {
            return 0L;
        }
        else {
            return max-min;
        }
    }

    
    public static int bigDiff_Problem_2_ccee0ac2_b29b_40d7_8e98_5f0b623f5daf(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for(int i = 1; i < nums.size(); i++) { // loop through all elements
            if(nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if(nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_2b8b5630_be45_4516_a51d_10449eca87b3(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_13d0acfd_bf97_4d3f_ac86_6a0e38109d83(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_0316fe36_7ecc_42be_8a04_f95b822c7dfb(ArrayList<Integer> nums) {
        int largest = nums.get(0); //initialize largest to first element
        int smallest = nums.get(0);
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_7ed71c88_865e_4707_bde2_c859059847a9(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_21c39b38_5bee_4d29_a68d_9e6dabc674ec(ArrayList<Integer> nums) {
        Integer[] array = new Integer[nums.size()];
        nums.toArray(array);
        Arrays.sort(array);
        Integer biggest = array[array.length - 1];
        Integer smallest = array[0];
        Integer diff = biggest - smallest;
        return diff;
    }

    
    public static int bigDiff_Problem_0_0588eabc_533b_43e4_8bae_a70926cfda7e(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_42b3699f_523c_4f34_93bd_328c2b2bcc1f(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_a4c8f389_16ac_4d9d_af60_653b71e23eac(ArrayList<Integer> nums) {
        if (nums.size() == 0) return 0;
        else if (nums.size() == 1) return nums.get(0);
        else {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < nums.size(); i++) {
                if (nums.get(i) > max) max = nums.get(i);
                if (nums.get(i) < min) min = nums.get(i);
            }
            return max - min;
        }
    }

    
    public static int bigDiff_Problem_0_94ecc46c_4e85_4af4_8706_ec6a8d2a1d69(ArrayList<Integer> nums) {
        int largest = Collections.max(nums).intValue();
        int smallest = Collections.min(nums).intValue();
        return (largest - smallest);
    }

    
    public static int bigDiff_Problem_1_82a3f25f_4706_411e_9f8d_8a9a39319e69(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_3bbd9707_9608_4d5a_9f01_ba5f7d121d55(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (Integer num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return max - min;
    }

    
    public static int bigDiff_Problem_1_20bcfd8b_e7ca_4709_9e3c_fe1946046359(ArrayList<Integer> nums) {
        return nums.stream().max(Integer::compare).get() - nums.stream().min(Integer::compare).get();
    }

    
    public static int bigDiff_Problem_0_17bf030b_8528_4513_991f_f2af5a98104e(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_0_3524c659_346a_457c_8360_d2414b6cd528(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_67192402_969c_48e2_8602_984b2a518216(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_27187f11_d984_487c_b5fc_4f30c359083b(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_76b11f49_6832_4e72_9393_469a1e250a7d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num < min) {
                min = num;
            }
            if(num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_2449f544_96f9_4c92_802a_5c3a9b9fa93b(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_2c7f5f27_7e95_46ab_bf4a_2f3c33cef4bc(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_755261bc_1b0c_4312_9a4c_f5588213d2df(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_54a79c57_694b_40ab_ad9b_2831ccceb8f2(ArrayList<Integer> nums) {
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
        return Math.abs(max - min);
    }

    
    public static int bigDiff_Problem_2_5faf3930_5e89_4c07_b87a_bc199f7982fc(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_e8e0cd63_138b_41d9_bf78_0c877c9853e0(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_7e531917_e2e6_4e52_bc6b_f495982eb45f(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_978adba6_70bf_4e77_98a7_c450bbe8532e(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_fe24be79_8b50_4468_af8b_9df26dd0d9d6(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_f5ea2dfc_1cd4_46a3_bdfe_c5440d58dfeb(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_0_139acf37_ae66_4774_9476_1baec81babef(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_73e3eb72_4cea_4b13_a277_468f02db2fe2(ArrayList<Integer> nums) {
        int bigger = 0, smaller = 0;
        for (int num : nums)
            if (num > bigger) bigger = num;
            else if (num < smaller) smaller = num;
        int diff = (bigger - smaller);
        return diff;
    }

    
    public static int bigDiff_Problem_0_0d1d79b6_c2a0_4f28_8889_9a0394146d19(ArrayList<Integer> nums) {
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_5abde4c7_fa4f_43b1_b18f_168c12658f12(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (Integer x : nums) {
            if (x > max) max = x;
            if (x < min) min = x;
        }
        int diff = 0;
        if (min > max) return 0;
        for (Integer x : nums) {
            diff += Math.abs(x - (max + min) / 2);
        }
        return diff;
    }

    
    public static int bigDiff_Problem_1_7a154236_fc24_42d7_a87d_e2a026e6dcbc(ArrayList<Integer> nums) {
        if(nums.isEmpty()){
            return 0;
        }
        Integer diff = nums.get(0);
        Integer min = nums.get(0);
        Integer max = nums.get(0);
        for (Integer value : nums) {
            if (value > max) {
                max = value;
            } else if (value < min) {
                min = value;
            }
            if (diff > Math.abs(max - min)) {
                diff = Math.abs(max - min);
            }
        }
        return diff;
    }

    
    public static int bigDiff_Problem_0_d31b5bae_9f5e_4956_b69a_dce495b91258(ArrayList<Integer> nums) {
        Integer max = Integer.MIN_VALUE;
        Integer min = Integer.MAX_VALUE;
        Integer temp;
        for (Integer num : nums) {
            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_9c334d44_e861_40a7_a53a_787f8e6f931a(ArrayList<Integer> nums) {
        int minVal = nums.stream().mapToInteger(l -> l).min().getAsInteger();
        int maxVal = nums.stream().mapToInteger(l -> l).max().getAsInteger();
        return maxVal - minVal;
    }

    
    public static int bigDiff_Problem_1_9c05c7a6_10fc_4b8c_8533_fcb66ac81770(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_d0374e6b_923e_47e3_bc42_0fa5974ed4a2(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_24ccc2f5_5688_4024_b535_39d26b33fa3a(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_7a9da6d6_b52b_47d7_8b23_a45d097f00e0(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_8dc470a5_0c65_4552_be85_65ea67bcdb9d(ArrayList<Integer> nums) {
        int size = nums.size();
        int min = nums.get(0);
        int max = nums.get(0);
        for(int i=0; i<size; i++) {
            int val = nums.get(i);
            if(val > max) {
                max = val;
            }
            if(val < min) {
                min = val;
            }
        }
        int diff = max - min;
        for(int i=0; i<size; i++) {
            int val = nums.get(i);
            if(val < min) {
                min = val;
            }
            if(val > max) {
                max = val;
            }
        }
        diff = max - min;
        return diff;
    }

    
    public static int bigDiff_Problem_2_d1bbd601_f195_4499_9994_b4d8f3f22a5e(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_50dc2130_d707_468b_81e3_32d6bf576048(ArrayList<Integer> nums) {
        int[] arr = new int[nums.size()];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = nums.get(i);
        }
        Arrays.sort(arr);
        return arr[arr.length - 1] - arr[0];
    }

    
    public static int bigDiff_Problem_1_f422620c_6d27_4184_adcd_86a0de4a39ff(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_2_a70f5fdb_0170_4de4_8a94_ad0a63babe82(ArrayList<Integer> nums) {
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
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_4e8529bd_0aae_42b2_8975_6cce76e5aaa9(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_1fb9aa6d_c8cb_4731_a919_ef22b959afca(ArrayList<Integer> nums) {
        int largest = nums.get(0); // Initialize largest to first element.
        int smallest = nums.get(0); // Initialize smallest to first element.
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_fd870681_de1c_41f5_83b4_85bed2464ba1(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_0_72d47727_e742_4a0b_b6ec_da9223f4d320(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_a6a29fff_56ca_426d_8055_e21410d13c0d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_5a31eb28_0b11_4f7f_8615_70410cfd4d20(ArrayList<Integer> nums) {
        return nums.stream().reduce((x, y) -> Math.max(x, y) - Math.min(x, y)).get();
    }

    
    public static int bigDiff_Problem_2_8dc470a5_0c65_4552_be85_65ea67bcdb9d(ArrayList<Integer> nums) {
        int size = nums.size();
        int min = nums.get(0);
        int max = nums.get(0);
        for(int i=0; i<size; i++) {
            int val = nums.get(i);
            if(val > max) {
                max = val;
            }
            if(val < min) {
                min = val;
            }
        }
        int diff = max - min;
        for(int i=0; i<size; i++) {
            int val = nums.get(i);
            if(val < min) {
                min = val;
            }
            if(val > max) {
                max = val;
            }
        }
        diff = max - min;
        return diff;
    }

    
    public static int bigDiff_Problem_1_bdcf6e7a_284e_4d7a_bbe8_8b60b4b42549(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0);
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_9844d669_38fd_4605_b1a7_17ffcab217a0(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_1370c7df_15fb_4f06_810a_a4e2d8b24bb6(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_552b1846_57e5_4e57_ab1f_8dcf48f83324(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_09c7d9de_9130_49ea_bb87_52cbc40889b3(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer i : nums) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_711e1200_6196_44b0_aa6d_26f565588253(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_d558a35c_b3c7_4545_893b_db1855b200af(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_5d70bbe9_fec6_4d8d_ba8d_825dc6771a45(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_b1e57a2f_6255_4667_b997_02facf2ffea2(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_3670dd4a_82a8_4aff_8afd_32430944fb36(ArrayList<Integer> nums) {
        Integer l = nums.stream().mapToInteger(Integer::intValue).min().getAsInteger();
        Integer h = nums.stream().mapToInteger(Integer::intValue).max().getAsInteger();
        int diff =  Math.abs(h - l);
        return diff;
    }

    
    public static int bigDiff_Problem_0_2c8a9c3a_8faf_4804_b8bc_a6f9aa72bd58(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_e8a19c60_02db_42dd_bfca_8afb50e4ff2e(ArrayList<Integer> nums) {
        int min = Collections.min(nums);
        int max = Collections.max(nums);
        return max - min;
    }

    
    public static int bigDiff_Problem_0_7eb33c33_99fd_41af_aebf_c0f334c34da0(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_1293de3c_70b4_4ef7_935f_c77e51dfd0cd(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
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

    
    public static int bigDiff_Problem_1_39f9cad3_95f8_4af1_bc8f_05862dfe780d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_88175872_92c3_451a_a058_31c5ab076835(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_5fa9b4f5_e015_485c_846a_037f1386b077(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            min = Math.min(min, nums.get(i));
            max = Math.max(max, nums.get(i));
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_134d1034_2317_42e1_a165_fc17fe64e6dd(ArrayList<Integer> nums) {
        return nums.stream().max(Integer::compare).get() - nums.stream().min(Integer::compare).get();
    }

    
    public static int bigDiff_Problem_1_59374d1b_13bf_4e33_840d_3726e5a8eba7(ArrayList<Integer> nums) {
        // write your code here
        Integer max = null;
        Integer min = null;
        for(Integer num : nums) {
            if(max == null || max < num) {
                max = num;
            }
            if(min == null || min > num) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_74846cf6_7135_4fd3_b64f_eeb3b25cb0e4(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_bc3c2579_5f42_4f52_aef6_1670bf58ebea(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_9bda672c_9d25_4548_ad6a_b887ac7149c1(ArrayList<Integer> nums) {
        return nums.get(0).compareTo(nums.get(nums.size() - 1));
    }

    
    public static int bigDiff_Problem_2_c7145b90_2b0c_4b35_a7e9_68a4a6f225b4(ArrayList<Integer> nums) {
        int max1 = Integer.MIN_VALUE, min1 = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max1) {
                max1 = num;
            }
            if (num < min1) {
                min1 = num;
            }
        }
        return Math.abs(max1 - min1);
    }

    
    public static int bigDiff_Problem_1_c82acc85_113c_4b8e_afa9_0b3dd21fde60(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_fb60acc5_a50d_4455_9851_bd1d70270adb(ArrayList<Integer> nums) {
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
        if (max - min > 0) {
            return max - min;
        }
        return max + min;
    }

    
    public static int bigDiff_Problem_1_c6cf6066_b4cb_42a9_8359_935dbdf75f68(ArrayList<Integer> nums) {
        int max_num = Integer.MIN_VALUE;
        int min_num = Integer.MAX_VALUE;
        for (int number : nums) {
            if (number > max_num) {
                max_num = number;
            }
            if (number < min_num) {
                min_num = number;
            }
        }
        return max_num - min_num;
    }

    
    public static int bigDiff_Problem_1_b7ed7bcc_0fbd_4946_b7f2_e5f9987a861f(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_0b87843e_a01a_4084_9b19_52720478fbbd(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_90d77e5b_468a_462d_ba23_f68598858c5d(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_39f9cad3_95f8_4af1_bc8f_05862dfe780d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_76573c0c_9304_4353_aea3_aaac34bdd771(ArrayList<Integer> nums) {
        int i = 0;
        int max = 0;
        int min = 0;
        for (Integer num: nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            i++;
        }
        System.out.println("Largest value: " + max + " and smallest value: " + min);
        return max - min;
    }

    
    public static int bigDiff_Problem_0_5ed9cd70_a63a_4a78_92b3_66e39d3890c2(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_8a4de2fd_8958_4bbf_ae44_c841980f5bcb(ArrayList<Integer> nums) {
        if(nums.size() == 0) return 0;
        int result = nums.get(0);
        for(int l : nums) {
            result = Math.max(result, l);
        }
        for(int l : nums) {
            result = Math.min(result, l);
        }
        return result;
    }

    
    public static int bigDiff_Problem_2_2ea9a4f1_adb4_453a_ba5a_b54e99cacd5e(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_1_c91df87e_00d6_464f_92e7_78e0f67ab1fd(ArrayList<Integer> nums) {
        if(nums.size()==0) {
            return 0;
        }
        else if(nums.size()==1) {
            return nums.get(0);
        }
        Integer min = nums.get(0), max = nums.get(0);
        for(int i=1; i<nums.size(); i++) {
            if(nums.get(i)>max) {
                max = nums.get(i);
            }
            if(nums.get(i)<min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_32e18c40_7c83_416e_8e31_99a66e32f8b6(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_6d4ab201_4e17_4591_9eaf_a570c4ee06fe(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_4aee72c4_48c3_480b_98f0_bfb195ebe542(ArrayList<Integer> nums) {
        int ret = nums.get(0);
        for(int i = 1; i < nums.size(); ++i) {
            ret = Math.max(ret, Math.min(nums.get(i), ret));
        }
        return ret;
    }

    
    public static int bigDiff_Problem_2_845426d8_17ee_4b35_9bd6_1730ee44f3ea(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_bd7b5d70_f8d2_4311_84e5_b3c36347464e(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_a1c91fab_5c30_441c_bef8_dcaf7011cc6c(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_1_e3032d84_9342_4863_957e_d418a126f019(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int n : nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_7e970e27_5188_4c0b_b775_766d226060c2(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_12f951c5_9289_45ed_ac91_75c7b1381ef2(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_fc6ee75c_dfac_4ca9_b30c_6d137609e51b(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_a2c5e373_35a7_432f_b209_08866cba1d0d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_72d47727_e742_4a0b_b6ec_da9223f4d320(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_56494dfd_dc4c_4e4b_9d16_999e4adc6b7d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_cfb25f91_ab54_4239_8093_239105128787(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_4c5a5404_a318_480e_84e5_c9102e785ed0(ArrayList<Integer> nums) {
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
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_45d37c8b_3be8_41bb_afe2_c06ceeaf520c(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_0_a4c8f389_16ac_4d9d_af60_653b71e23eac(ArrayList<Integer> nums) {
        if (nums.size() == 0) return 0;
        else if (nums.size() == 1) return nums.get(0);
        else {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < nums.size(); i++) {
                if (nums.get(i) > max) max = nums.get(i);
                if (nums.get(i) < min) min = nums.get(i);
            }
            return max - min;
        }
    }

    
    public static int bigDiff_Problem_2_6d113970_87c1_4c55_bae8_f6eecf776cde(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Integer num : nums) {
            min = num < min ? num : min;
            max = num > max ? num : max;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_f3e06fdc_be58_4ba3_807b_cb611b8438f4(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_15317d15_05bf_4736_b7fb_278dfb6a60a5(ArrayList<Integer> nums) {
        int max = nums.stream().map(i->i).max(Integer::compare).get();
        int min = nums.stream().map(i->i).min(Integer::compare).get();
        return Math.abs(max - min);
    }

    
    public static int bigDiff_Problem_0_cc4b00ad_188e_49cd_91c0_2ef2ff10ddca(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_0c931ebd_c09d_4afc_bfd4_820cebe4c89f(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_2_ccc34bb7_873d_4688_937e_5452bdf82c8d(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_3c4d7301_3b1a_4d62_8e26_17700f75039a(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_701488b5_457b_422c_9665_20afc842bc5d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_1fde9f8f_597a_429e_a1be_e81bdd820ee3(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_dfbfc6f4_7b7b_44c6_b4b3_42fbdd4e9615(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_d0dafacf_61fa_41c2_b1c4_f0d36a5e23d9(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : nums) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_20f3674c_9cfe_49cd_87de_f552e96a8592(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_acdc7224_2f2b_4807_8847_17d3c9c584bd(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return Math.abs(max - min);
    }

    
    public static int bigDiff_Problem_1_fd7ec511_c6ac_4531_a59e_106be5c41ef8(ArrayList<Integer> nums) {
        int len = nums.size();
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i = 0; i < len; i++) {
            min = Math.min(min, nums.get(i));
            max = Math.max(max, nums.get(i));
        }
        int diff = max - min;
        return diff;
    }

    
    public static int bigDiff_Problem_2_a2b302a5_f612_493f_896f_ed7afe5e7fbf(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_2_aaddf35e_8cdc_462e_8cea_0cacd67d890f(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_af30898c_989a_432a_ab6c_6609ceca56dc(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_ecd1ec90_e745_4ad0_a970_da1eda97cc1d(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_95d4c9dc_b83f_43e8_91e3_567b3d17439f(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_9ee492cf_55c7_4183_8823_e08d125c241a(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_2a987f35_0226_467a_b5d9_18c310fc4e2c(ArrayList<Integer> nums) {
        if (nums.size() == 1) {
            return nums.get(0);
        }
        int min = nums.stream().mapToInteger((Integer num) -> num).min().getAsInteger();
        int max = nums.stream().mapToInteger((Integer num) -> num).max().getAsInteger();
        return max - min;
    }

    
    public static int bigDiff_Problem_1_0f7f9ece_6891_4dcb_83cc_153258ff63d5(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_4814bfb2_7577_4f1a_bac7_deb5506a0e36(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_23462d66_1ea4_47c4_a6fd_50c90a497d41(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_c5a69916_b987_4949_96c8_852507e5f2f8(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_a2c29cfc_aa1f_4bb1_8d6c_aad21454c848(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_0b87843e_a01a_4084_9b19_52720478fbbd(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_711e1200_6196_44b0_aa6d_26f565588253(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_df1b45b0_ab47_47cf_8b69_1b974c1cfd75(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        int diff = max - min;
        for (int i = 1; i < nums.size(); i++) {
            if (max < nums.get(i)) {
                max = nums.get(i);
            }
            if (min > nums.get(i)) {
                min = nums.get(i);
            }
            diff = max - min;
        }
        return diff;
    }

    
    public static int bigDiff_Problem_1_f57ee6bc_f786_437d_9988_07029b6caa0c(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_a36936dd_20d0_44de_86cd_ad1573545fc4(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_48b2b8f4_f38d_4024_87a4_099f5b0645d2(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_51351371_610b_44f0_845d_03244d847c3b(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i) > max) max = nums.get(i);
            if(nums.get(i) < min) min = nums.get(i);
        }

        return max - min;
    }

    
    public static int bigDiff_Problem_1_7e22747c_6e11_4a49_a913_f4778a4f319f(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_e041b161_780e_482e_b8ac_2a0c143a7eaa(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_ffad12e1_da6e_4cbe_9259_24a09ead7ef2(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_0588eabc_533b_43e4_8bae_a70926cfda7e(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_fcb929bc_b551_469e_bdd4_79389f9bb001(ArrayList<Integer> nums) {
        Collections.sort(nums);
        int max = nums.get(nums.size() - 1);
        int min = nums.get(0);
        return max - min;
    }

    
    public static int bigDiff_Problem_1_8a5503c3_ef56_4d19_a4c0_4d7c013c1b74(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_16c5aec8_6092_4ed8_b083_550f3eeafa11(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_2aa78919_d3da_425a_86ac_0d942eaa4d04(ArrayList<Integer> nums) {
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
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_be302d9e_b69e_4a58_ad12_3fa24086602a(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_2aa78919_d3da_425a_86ac_0d942eaa4d04(ArrayList<Integer> nums) {
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
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_d48268ea_f184_454b_8941_b6d75751153d(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_64b25c8e_2cf1_48d3_9aad_06c8f06b6e31(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_c747c829_cfe6_48db_9c92_22c0a4df9fe0(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_0d81f006_628c_4320_8fb1_50ffb868af0c(ArrayList<Integer> nums) {
        int n = nums.size();
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 1; i < n; i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            } else if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        int diff = Math.abs(max - min);
        return diff;
    }

    
    public static int bigDiff_Problem_0_54cc09d9_d67a_4770_951e_d73d47ce8757(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) > max) max = nums.get(i);
            if(nums.get(i) < min) min = nums.get(i);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_a6a29fff_56ca_426d_8055_e21410d13c0d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_54dfcd60_5082_4ef0_b5f9_13b0682966b5(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_f19333b7_264a_4f7e_9e69_2265a3f125ac(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_651dcf52_7ebe_45cf_9926_45dd18186445(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_2_ebdca7ff_1184_4229_bd4b_b4bf5eb6d684(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int n : nums) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_f8b61a87_41be_45f8_a956_b9d7e910a0f4(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_a48b16b8_f6c8_4283_bceb_b643d0a13eef(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_1552876b_6b31_4b9f_b9fe_37e838e048fd(ArrayList<Integer> nums) {
        Collections.sort(nums);
        Integer first = nums.get(0);
        Integer last = nums.get(nums.size() - 1);
        return last - first;
    }

    
    public static int bigDiff_Problem_2_c5746b5f_4bfd_45cc_ae37_c596cb85335c(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_0_a90043f7_44ca_42ee_8bc3_13d60881bd12(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_1fb9aa6d_c8cb_4731_a919_ef22b959afca(ArrayList<Integer> nums) {
        int largest = nums.get(0); // Initialize largest to first element.
        int smallest = nums.get(0); // Initialize smallest to first element.
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_210eeef4_5ac8_47a5_8287_bbd73150b7aa(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i : nums) {
            if(i > max) {
                max = i;
            }
            if(i < min) {
                min = i;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_c632a1f0_bdc9_404f_8393_0b002c10dca9(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num: nums) {
            if(num>max) {
                max = num;
            }
            if(num<min) {
                min = num;
            }
        }
        return Math.abs(max - min);
    }

    
    public static int bigDiff_Problem_1_260ad42a_e2c0_4b93_8bd2_4ba57168e3a1(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_2b8b5630_be45_4516_a51d_10449eca87b3(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_25cd7b9a_303e_4e6b_9595_d45bd845de36(ArrayList<Integer> nums) {
        int min = nums.stream().map(n -> n).min(Comparator.naturalOrder()).get();
        int max = nums.stream().map(n -> n).max(Comparator.naturalOrder()).get();
        int diff = Math.abs(max - min);
        return diff;
    }

    
    public static int bigDiff_Problem_0_c747c829_cfe6_48db_9c92_22c0a4df9fe0(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_11bafd1f_0b38_4b62_9ae2_0d463c350418(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_1bd176b0_f90a_4b7a_87c7_eb979bda7fc5(ArrayList<Integer> nums) {
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
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_6b0fdc06_f1d7_418f_b4a3_1cdcd6a77eb5(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_37cc7255_6091_49c3_acda_6277d9ac4945(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_0_1706cb97_be1a_4466_8b33_c3a68f1b9d6a(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_2_287a828a_689e_40ac_b2af_5683a64661e2(ArrayList<Integer> nums) {
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
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_30553cc7_93c6_4b92_9b3f_e832342214d1(ArrayList<Integer> nums) {
        int diff = 0;
        if (nums.size() < 2)
            return 0;
        else if (nums.size() == 2) {
            int min = nums.get(0);
            int max = nums.get(1);
            if (min > max)
                diff = min - max;
            else
                diff = max - min;
        } else {
            int index = 0;
            int max = nums.get(0);
            int min = nums.get(1);
            int prevMax = max;
            int prevMin = min;
            for (int i = 2; i < nums.size(); i++) {
                if (nums.get(i) > max) {
                    max = nums.get(i);
                    index = i;
                }
                if (nums.get(i) < min) {
                    min = nums.get(i);
                    index = i;
                }
                if (nums.get(i) > prevMax) {
                    prevMax = nums.get(i);
                }
                if (nums.get(i) < prevMin) {
                    prevMin = nums.get(i);
                }
            }
            diff = max - min;
            if (diff == 0)
                diff = Math.abs(prevMin - prevMax);
            else if (prevMin > prevMax)
                diff = Math.abs(prevMax - min);
            else if (prevMin < prevMax)
                diff = Math.abs(prevMax - max);
        }
        return diff;
    }

    
    public static int bigDiff_Problem_2_8508e68b_82e2_45d3_a053_0ad516e8b5db(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_53289539_9dbc_4a7d_8d6b_3a1c3e583f2f(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
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

    
    public static int bigDiff_Problem_0_ca2e85e6_3e2d_454d_934f_ecceb1dd1721(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_5047e32c_160a_42fc_9813_cc5cdcae2f0b(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_f3258123_fb8b_4049_bf09_dfdc40990713(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_c4ac92e3_f7ba_45cc_8fca_40d9dffb2d76(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer n : nums) {
            max = Math.max(n, max);
            min = Math.min(n, min);
        }
        return Math.abs(max - min);
    }

    
    public static int bigDiff_Problem_2_94ecc46c_4e85_4af4_8706_ec6a8d2a1d69(ArrayList<Integer> nums) {
        int largest = Collections.max(nums).intValue();
        int smallest = Collections.min(nums).intValue();
        return (largest - smallest);
    }

    
    public static int bigDiff_Problem_0_ecfc0f34_a77b_45ab_8434_daf669ff663f(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_09cc4f95_6f76_4f3d_a957_029c05731d2b(ArrayList<Integer> nums) {
        int max = 0;
        int min = nums.get(0);
        for(Integer num: nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_ccee0ac2_b29b_40d7_8e98_5f0b623f5daf(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for(int i = 1; i < nums.size(); i++) { // loop through all elements
            if(nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if(nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_33fb813e_e235_4a49_9e10_ce6842aef30b(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_469b22a0_68de_4b62_a137_d3df0aa08bc2(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_583fc34f_655f_4d2f_9eeb_7b771d1dface(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_397ad15f_8e7f_447a_ab13_e99611de965d(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_bf4b7a5f_2c23_40e9_802f_df866edb2091(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Integer i : nums) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_adc0f2c5_d84b_4b9f_9faa_fae78957b0a8(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_754d3056_cc19_4bf7_93bc_d54b7c564dac(ArrayList<Integer> nums) {
        int max = 0;
        int min = 0;
        for (Integer l : nums) {
            if (l > max) {
                max = l;
            }
            if (l < min) {
                min = l;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_bea431d1_acb2_4663_b6ad_ffe82b3da7d2(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_a1c91fab_5c30_441c_bef8_dcaf7011cc6c(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_1_5fa9b4f5_e015_485c_846a_037f1386b077(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            min = Math.min(min, nums.get(i));
            max = Math.max(max, nums.get(i));
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_8952dbe7_4642_4237_98f0_b89ac8192a8a(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_f7e95b7e_1967_4ded_8438_1e35b233f665(ArrayList<Integer> nums) {
        int max = Collections.max(nums);
        int min = Collections.min(nums);
        return (max-min);
    }

    
    public static int bigDiff_Problem_2_5abde4c7_fa4f_43b1_b18f_168c12658f12(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (Integer x : nums) {
            if (x > max) max = x;
            if (x < min) min = x;
        }
        int diff = 0;
        if (min > max) return 0;
        for (Integer x : nums) {
            diff += Math.abs(x - (max + min) / 2);
        }
        return diff;
    }

    
    public static int bigDiff_Problem_0_d0c768b6_df66_4495_85d7_d994a4173855(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_943ad178_2296_4e2d_9606_400241fefc60(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int n : nums) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_2093593a_f77d_42ed_9528_66f0848692bb(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num: nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        if(max > min) {
            return max - min;
        } else {
            return 0;
        }
    }

    
    public static int bigDiff_Problem_2_322e67dc_4e8a_4fb9_80e8_01de8e94178c(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_72a19b54_ba51_41ca_b5e1_bb0dcf968ce6(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_a70f5fdb_0170_4de4_8a94_ad0a63babe82(ArrayList<Integer> nums) {
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
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_e1335d0d_672c_4015_95cb_b5d8835ba514(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_b6a087fb_4e9c_4a39_a648_b27e73cd4920(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_35e1237c_f1f5_438d_9a94_9f6fe674b8cc(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_54fb2cad_433c_4d7d_9fa9_191c86bfd730(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_88aeb0a9_c2f4_4167_aa76_5f8f735d0838(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_48b2b8f4_f38d_4024_87a4_099f5b0645d2(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_e85e6c8b_70ee_4f4d_b2d8_5cb16083f0c3(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_631f48f7_45c5_43ef_8fe5_b716a01464b4(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_5188fcf1_05e5_4485_911c_51369ffd77b8(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_460aca92_bb48_40a4_a0e2_49e596e35df1(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_5188fcf1_05e5_4485_911c_51369ffd77b8(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_e8e0cd63_138b_41d9_bf78_0c877c9853e0(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_651dcf52_7ebe_45cf_9926_45dd18186445(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_0_7fc96a01_6b5c_40a7_b98c_a7b3eb794f7a(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_f4faa544_8979_4a69_ba14_e92eef81e195(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return Math.abs(min - max);
    }

    
    public static int bigDiff_Problem_0_199715c2_f33c_416c_b0bc_2c922625f87b(ArrayList<Integer> nums) {
        int len = nums.size();
        int[] arr = new int[len];
        for (int i = 0; i < nums.size(); i++) {
            arr[i] = nums.get(i);
        }
        Arrays.sort(arr);
        int max = arr[len - 1];
        int min = arr[0];
        int diff = max - min;
        return diff;
    }

    
    public static int bigDiff_Problem_1_7b00f691_01a0_48ed_9518_86298006902a(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) > max) {
                max = nums.get(i);
            }
            else if(nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_c7805acd_897d_44d7_8a9b_6055a97f1a88(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int n : nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_1e08b8ef_9389_4224_980e_1fd190d0e7de(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_4aee72c4_48c3_480b_98f0_bfb195ebe542(ArrayList<Integer> nums) {
        int ret = nums.get(0);
        for(int i = 1; i < nums.size(); ++i) {
            ret = Math.max(ret, Math.min(nums.get(i), ret));
        }
        return ret;
    }

    
    public static int bigDiff_Problem_2_74cdcbbb_f889_424a_a974_7e55ffee3960(ArrayList<Integer> nums) {
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
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_34335840_62f8_4493_8961_b99dd61921ab(ArrayList<Integer> nums) {
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        for(int i : nums) {
            if(i>maxNum) {
                maxNum = i;
            }
            if(i<minNum) {
                minNum = i;
            }
        }
        return maxNum-minNum;
    }

    
    public static int bigDiff_Problem_2_1e9a41db_b2cb_4908_b89c_e44f7f72f390(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_63354e34_309d_4849_a77d_f83afc3733f2(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_00702adf_2491_4d3b_a129_c954c23cb593(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_8906cdbd_fae1_4f78_8ded_5cdcb24f4766(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_610d14c1_e35f_40ce_984c_f2fc16579677(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_9d44aa58_a1d2_463a_96d2_791b505ffffd(ArrayList<Integer> nums) {
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if(nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_e4e1308d_6dbd_48ad_ba0c_15cb51015fe3(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_a9fb45d1_0050_4c87_af40_e9eee105a4bd(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_1_014be8d9_b964_49f9_9642_87a3cc503d67(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_1bd176b0_f90a_4b7a_87c7_eb979bda7fc5(ArrayList<Integer> nums) {
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
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_8387a66f_06ba_4d64_9cd6_cd367921533f(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_d3ce4941_2f6a_482c_a351_31fe72a3d211(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_ad384323_b5f0_4e3a_b911_0951c6df1127(ArrayList<Integer> nums) {
        if(nums.size() == 0)
            return 0;
        int pos = 0;
        Integer min = nums.get(0);
        Integer max = nums.get(0);
        for(Integer num : nums){
            if(num < min){
                min = num;
                pos = nums.indexOf(num);
            }
            if(num > max){
                max = num;
                pos = nums.indexOf(num);
            }
        }
        return nums.get(pos).intValue() - nums.get(nums.size() - 1).intValue();
    }

    
    public static int bigDiff_Problem_0_f30aca14_9253_4570_a403_971133070bf6(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) > max) {
                max = nums.get(i);
            }
            if(nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_c23b2a4e_78f0_4f07_bd71_a92a1fd1643c(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_f3e06fdc_be58_4ba3_807b_cb611b8438f4(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_8acd443a_380c_453f_8371_49b69ee44085(ArrayList<Integer> nums) {
        Integer max = nums.stream().max(Integer::compare).orElse(0L);
        Integer min = nums.stream().min(Integer::compare).orElse(0L);
        return max - min;
    }

    
    public static int bigDiff_Problem_2_ef11987e_3cfe_4ba4_8254_7cde62a2c8a9(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_e96de7d8_49ee_42ff_b2ee_62c7b6804dfe(ArrayList<Integer> nums) {
        Integer[] arr = nums.toArray(new Integer[nums.size()]);
        Arrays.sort(arr);
        if (arr.length == 0) {
            return 0;
        }
        return arr[arr.length - 1] - arr[0];
    }

    
    public static int bigDiff_Problem_0_15bfbf31_25f7_4fa8_9f80_07435069eddf(ArrayList<Integer> nums) {
        Collections.sort(nums);
        return nums.get(nums.size() - 1) - nums.get(0);
    }

    
    public static int bigDiff_Problem_2_fd7ec511_c6ac_4531_a59e_106be5c41ef8(ArrayList<Integer> nums) {
        int len = nums.size();
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i = 0; i < len; i++) {
            min = Math.min(min, nums.get(i));
            max = Math.max(max, nums.get(i));
        }
        int diff = max - min;
        return diff;
    }

    
    public static int bigDiff_Problem_2_16542ad8_1798_41d1_8937_82e1ab6349c6(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_0cca88af_c74a_473e_8865_8f5a62831a5e(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            max = Math.max(max, nums.get(i));
            min = Math.min(min, nums.get(i));
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_ebddeb8e_4d14_4f2e_8b77_79647684eb27(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_09c7d9de_9130_49ea_bb87_52cbc40889b3(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer i : nums) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_05b5d90c_1bd2_4bde_adc7_2054ae9d56a0(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int diff = 0;
        for (Integer x : nums) {
            if (x > max) {
                max = x;
            } else if (x < min) {
                min = x;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_d8f9b0d3_56ca_4d60_85c2_0dcc1e6c049d(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_1_fb60acc5_a50d_4455_9851_bd1d70270adb(ArrayList<Integer> nums) {
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
        if (max - min > 0) {
            return max - min;
        }
        return max + min;
    }

    
    public static int bigDiff_Problem_1_be302d9e_b69e_4a58_ad12_3fa24086602a(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_86e236d5_205a_4cfc_be3e_95bcc93a95ab(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_212dc00f_41b6_4ffc_ae8b_e0ca4cc89587(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_fad85ea5_4582_4cc9_a601_13039f7c31c8(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0);
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_065a7c8c_3bbd_4bc7_8585_76720dfa0f9a(ArrayList<Integer> nums) {
        return nums.stream().map(x ->  x).reduce((x, y) -> Math.max(x, y)).get();
    }

    
    public static int bigDiff_Problem_2_d558a35c_b3c7_4545_893b_db1855b200af(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_ed05724c_1e54_4f0d_87a3_63f17cdcf719(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_c9505f4c_4fb2_4781_a905_20f58c845a6b(ArrayList<Integer> nums) {
        int diff = Integer.MIN_VALUE;
        if (nums.size() < 2) {
            return Integer.MIN_VALUE;
        }
        Integer min = nums.get(0);
        Integer max = nums.get(0);
        for (Integer num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
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

    
    public static int bigDiff_Problem_2_7400a331_74c1_409f_9111_7db6f7c9ce93(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_a8209389_3bec_4f28_a1de_0d9723ecf9ad(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_37cc7255_6091_49c3_acda_6277d9ac4945(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_2_09d8150a_8bfb_403d_9b7e_ac2252d65ddc(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_6b566d4d_1577_4cd9_bd10_71e91da72f78(ArrayList<Integer> nums) {
        // Write your code here
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_77a17707_d8eb_4976_aab0_3fb19379114e(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_04b58911_15ad_4205_bfcc_0506a0b1e5b7(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_6d113970_87c1_4c55_bae8_f6eecf776cde(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Integer num : nums) {
            min = num < min ? num : min;
            max = num > max ? num : max;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_e52fef55_4e62_46c9_b0ee_b82827bef8dc(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(Integer n : nums) {
            min = n < min ? n : min;
            max = n > max ? n : max;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_f73f58c4_29b6_4773_8c8c_6082153bd55d(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_c9ca9c89_f663_4ea0_8ac7_05fdbc7473f6(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_5e5c7cfe_9e79_417b_8f6d_be34b32df4de(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_754d3056_cc19_4bf7_93bc_d54b7c564dac(ArrayList<Integer> nums) {
        int max = 0;
        int min = 0;
        for (Integer l : nums) {
            if (l > max) {
                max = l;
            }
            if (l < min) {
                min = l;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_bc658861_b573_4380_a1fa_e1056628b801(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int n: nums) {
            if(n > max) {
                max = n;
            }
            if(n < min) {
                min = n;
            }
        }
        int diff = Math.abs(max - min);
        return diff;
    }

    
    public static int bigDiff_Problem_2_4e76f7fb_c46e_4e8c_97ad_96233d623d24(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_c9387ee3_68ec_4750_b655_29bc21a8aa97(ArrayList<Integer> nums) {
        int max = 0;
        int min = 0;
        for (Integer i : nums) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_b86fd09c_f016_4ad5_87af_929aebe93c9b(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_addcaa63_9049_4b52_b19a_1430c54bd8a0(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_e3032d84_9342_4863_957e_d418a126f019(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int n : nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_d5b7d37c_a2e1_4da6_93eb_9f1a648d4601(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_0477b283_153a_4890_90d1_090b96f29c72(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_2449f544_96f9_4c92_802a_5c3a9b9fa93b(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_2e22e6e6_8214_43b7_a23a_a8b5f46fdf5a(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_f7fc1cdf_a81a_4817_baab_99aef418dede(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_728220c7_f844_4f5a_99c3_7740436c54be(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_e8a19c60_02db_42dd_bfca_8afb50e4ff2e(ArrayList<Integer> nums) {
        int min = Collections.min(nums);
        int max = Collections.max(nums);
        return max - min;
    }

    
    public static int bigDiff_Problem_0_153661e7_4371_4f09_880e_1fb21789014a(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_1_d9de3d77_1a37_40b2_9bf4_e65fddbc8e4b(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_ad384323_b5f0_4e3a_b911_0951c6df1127(ArrayList<Integer> nums) {
        if(nums.size() == 0)
            return 0;
        int pos = 0;
        Integer min = nums.get(0);
        Integer max = nums.get(0);
        for(Integer num : nums){
            if(num < min){
                min = num;
                pos = nums.indexOf(num);
            }
            if(num > max){
                max = num;
                pos = nums.indexOf(num);
            }
        }
        return nums.get(pos).intValue() - nums.get(nums.size() - 1).intValue();
    }

    
    public static int bigDiff_Problem_0_b6a087fb_4e9c_4a39_a648_b27e73cd4920(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_8cb8bda5_79e0_4b28_86a8_ec74cdb6a3ec(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_ccb35ca9_5712_4a38_a36d_27c659073851(ArrayList<Integer> nums) {
        int max = nums.stream().max((a, b) -> a.compareTo(b)).orElseThrow(IllegalArgumentException::new);
        int min = nums.stream().min((a, b) -> a.compareTo(b)).orElseThrow(IllegalArgumentException::new);
        return max - min;
    }

    
    public static int bigDiff_Problem_2_66e1f9c8_02d9_47cf_b532_dbe99581a494(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_1eec90de_396a_4420_8307_9d183afd8b24(ArrayList<Integer> nums) {
        if (nums.size() == 0) {
            return 0;
        }
        int len = nums.size();
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < len; i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        int diff = Math.abs(max - min);
        for (int i = 0; i < len; i++) {
            int curr = nums.get(i);
            if (diff < Math.abs(max - curr)) {
                diff = Math.abs(max - curr);
            }
            if (diff < Math.abs(curr - min)) {
                diff = Math.abs(curr - min);
            }
        }
        return diff;
    }

    
    public static int bigDiff_Problem_1_962de037_8522_465e_8db8_ec611dd58fdb(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_73d43fc4_0e49_4dd0_aecb_848375343960(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_d1e1bd35_f8e9_410b_ae23_357c699fcc43(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_e6be56af_b064_4651_836b_b24fefdb048e(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_0_29cca0de_8603_4ac1_82c2_a5b014dfcc43(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (Integer num : nums) { // loop through all elements in array
            if (num > largest) { // if current element is greater than largest
                largest = num; // update largest to current element
            } else if (num < smallest) { // if current element is smaller than smallest
                smallest = num; // update smallest to current element
            }
        }
        return largest - smallest; // return difference between largest and smallest
    }

    
    public static int bigDiff_Problem_1_1e9f9329_7c48_4e66_a70c_c510063ca814(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_7af5e55a_93e9_4d51_a7c6_ee0b21d7f232(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_0_be302d9e_b69e_4a58_ad12_3fa24086602a(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_f7fc1cdf_a81a_4817_baab_99aef418dede(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_39dc0b11_d737_4e97_a358_b1b687b70cc0(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, diff = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (min > num) {
                min = num;
            }
            if (max < num) {
                max = num;
            }
            diff = Math.abs(max - min);
        }
        return diff;
    }

    
    public static int bigDiff_Problem_0_eb021ebe_0d22_4db8_adf2_88e913b08e1f(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_aca10976_7bfe_465a_9886_2f7148409530(ArrayList<Integer> nums) {
        Collections.sort(nums);
        return nums.get(nums.size() - 1) - nums.get(0);
    }

    
    public static int bigDiff_Problem_2_b90ce472_bab0_4086_8e6c_5299cfb3367f(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_bdcf6e7a_284e_4d7a_bbe8_8b60b4b42549(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0);
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_fa6feebc_76a0_4f6c_a14f_fcf71bc8b4f3(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_35ffc1f6_287e_4928_85c2_651a66be9b64(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_a2b302a5_f612_493f_896f_ed7afe5e7fbf(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_0_3f588c65_e1db_4c94_8dd7_5c411e430d43(ArrayList<Integer> nums) {
        int maxVal = Collections.max(nums);
        int minVal = Collections.min(nums);
        return (maxVal - minVal);
    }

    
    public static int bigDiff_Problem_2_78c7aea9_c55c_441e_9839_6745bd1aa1fc(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_3524c659_346a_457c_8360_d2414b6cd528(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_417ec6b2_9c7d_4bee_a281_3496d9308c17(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_0_d1bbd601_f195_4499_9994_b4d8f3f22a5e(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_210eeef4_5ac8_47a5_8287_bbd73150b7aa(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i : nums) {
            if(i > max) {
                max = i;
            }
            if(i < min) {
                min = i;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_78c7aea9_c55c_441e_9839_6745bd1aa1fc(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_711e1200_6196_44b0_aa6d_26f565588253(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_7362e1b2_458e_4f21_bf25_2e8f19589b38(ArrayList<Integer> nums) {
        int max = 0, min = 0;
        for(int num : nums) {
            if (num > max)
                max = num;
            if (num < min)
                min = num;
        }
        return Math.abs(max - min);
    }

    
    public static int bigDiff_Problem_0_5bb9b352_af48_4cbd_b463_b61020c39d7e(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_8b8cbd55_dd09_4914_be1b_71b73b71f203(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_11e65bde_c5e8_4c7d_a350_aa9ba9e85837(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_77f09768_6005_4cfc_830b_a04330c3a9c3(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_135a70bc_520c_48a6_aa5d_1288c0b978e8(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_bb3849b3_9031_493e_b516_9c336bf1e5db(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_a99d42d9_61c5_473c_b1b6_30b0cf161558(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        int diff = 0;
        for(int i : nums) {
            if(i > max) max = i;
            if(i < min) min = i;
            if(max - min > diff) diff = max - min;
        }
        return diff;
    }

    
    public static int bigDiff_Problem_2_0b88634d_0e25_413b_9a61_b42ab6f47ea7(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_37cc7255_6091_49c3_acda_6277d9ac4945(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_1_5a31eb28_0b11_4f7f_8615_70410cfd4d20(ArrayList<Integer> nums) {
        return nums.stream().reduce((x, y) -> Math.max(x, y) - Math.min(x, y)).get();
    }

    
    public static int bigDiff_Problem_1_0f9adc92_35f1_426d_8932_1705333578ad(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_45d37c8b_3be8_41bb_afe2_c06ceeaf520c(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_2_1f276960_fc1c_457b_b5a7_37ef7c52e872(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_bea431d1_acb2_4663_b6ad_ffe82b3da7d2(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_1e9a41db_b2cb_4908_b89c_e44f7f72f390(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_70ddb6e8_5361_4854_b0fd_b9d3ad20f8d0(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_78c7aea9_c55c_441e_9839_6745bd1aa1fc(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_6772b26b_36f4_4bbe_bbfe_ef9ed8767a66(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_8acd443a_380c_453f_8371_49b69ee44085(ArrayList<Integer> nums) {
        Integer max = nums.stream().max(Integer::compare).orElse(0L);
        Integer min = nums.stream().min(Integer::compare).orElse(0L);
        return max - min;
    }

    
    public static int bigDiff_Problem_1_a39b077d_e84a_49e6_87a0_bc081a797dbe(ArrayList<Integer> nums) {
        Integer[] temp = nums.toArray(new Integer[nums.size()]);
        Integer[] temp1 = nums.toArray(new Integer[nums.size()]);
        Arrays.sort(temp);
        Arrays.sort(temp1);
        return Math.abs(temp[temp.length - 1] - temp1[0]);
    }

    
    public static int bigDiff_Problem_0_13d0acfd_bf97_4d3f_ac86_6a0e38109d83(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_dcef1694_18cc_4031_8d43_82b6f5557a39(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_260ad42a_e2c0_4b93_8bd2_4ba57168e3a1(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_366dee59_e155_4bf4_9f5b_f3ce7be7aaf4(ArrayList<Integer> nums) {
        if (nums == null || nums.size() == 0) {
            return -1;
        }
        int min = nums.get(0), max = nums.get(0);
        for (Integer i : nums) {
            min = i < min ? i : min;
            max = i > max ? i : max;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_92139994_0c15_42ed_81d9_735e99911879(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_c08554f3_d180_4d77_9f11_8a1e3c4b2cb3(ArrayList<Integer> nums) {
        int result = Integer.MIN_VALUE;
        for (int value : nums) {
            result = Math.max(result, value);
        }
        for (int value : nums) {
            result = Math.min(result, value);
        }
        return result;
    }

    
    public static int bigDiff_Problem_1_57ee18ff_4102_46bd_b32f_f036482e63c9(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_daa2afa9_f547_42c7_b61f_a19fb04d6918(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_c9764ac7_22dc_4217_81e5_ddf33dedeee7(ArrayList<Integer> nums) {
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if(nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_09cc4f95_6f76_4f3d_a957_029c05731d2b(ArrayList<Integer> nums) {
        int max = 0;
        int min = nums.get(0);
        for(Integer num: nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_0f9adc92_35f1_426d_8932_1705333578ad(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_80256116_c7a7_4d1e_899d_a4121231985e(ArrayList<Integer> nums) {
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
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_0fd47723_581f_4b42_a7f3_fb1c9c1cc01b(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_014be8d9_b964_49f9_9642_87a3cc503d67(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_902bf292_27c6_4fe3_abae_f260fb71dc8d(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_a6360c46_2ff1_4207_9be3_38eedd986f20(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_f3258123_fb8b_4049_bf09_dfdc40990713(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_c322e800_b410_46b5_89c7_614ea60fcc42(ArrayList<Integer> nums) {
        int largest = nums.get(0); 
        int smallest = nums.get(0); 
        for(int i = 1; i < nums.size(); i++) {
            int diff = nums.get(i) - nums.get(i - 1);
            if(diff > largest) {
                largest = diff;
            }
            if(diff < smallest) {
                smallest = diff;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_20f3674c_9cfe_49cd_87de_f552e96a8592(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_24ccc2f5_5688_4024_b535_39d26b33fa3a(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_65a38283_3f31_4747_9d87_bb0595863197(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_279d8ad0_5daa_47f0_8eac_de370ddf1b35(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_90d77e5b_468a_462d_ba23_f68598858c5d(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_fe24be79_8b50_4468_af8b_9df26dd0d9d6(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_48e56af4_05bb_4072_8450_bb62e512dd22(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_1_e0c583ad_edc3_4181_82bf_8b061434e490(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_8387a66f_06ba_4d64_9cd6_cd367921533f(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_bea431d1_acb2_4663_b6ad_ffe82b3da7d2(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_322e67dc_4e8a_4fb9_80e8_01de8e94178c(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_a6984dea_8239_4227_b16e_98fa6b23ccd5(ArrayList<Integer> nums) {
        int largest = nums.stream().max(Integer::compareTo).get();
        int smallest = nums.stream().min(Integer::compareTo).get();
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_79489941_2e2f_4d6f_be92_37e1555f5121(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_493f56a7_fe14_4da5_80ea_88ab10c42194(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_2_ab97be88_d12f_4146_9bf2_5ff9fcc1eb79(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_2a987f35_0226_467a_b5d9_18c310fc4e2c(ArrayList<Integer> nums) {
        if (nums.size() == 1) {
            return nums.get(0);
        }
        int min = nums.stream().mapToInteger((Integer num) -> num).min().getAsInteger();
        int max = nums.stream().mapToInteger((Integer num) -> num).max().getAsInteger();
        return max - min;
    }

    
    public static int bigDiff_Problem_1_e1c63a3e_1d38_4062_86c1_724c4357a153(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_c5725442_e94b_484e_9300_1058e51b32a0(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_c72d68c2_9546_4845_be79_126d84ff7d1c(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_2_9e639334_e850_4d97_9013_8d7a19c4d5c7(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min)
                min = num;
            if (num > max)
                max = num;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_4bc50d3c_6f94_4dde_82e0_1676e4cea229(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i : nums) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_5cce7507_2442_425a_9c1d_c8128494bcb6(ArrayList<Integer> nums) {
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
        return Math.abs(max - min);
    }

    
    public static int bigDiff_Problem_2_588faf98_170f_4dcd_97f1_7682542d211b(ArrayList<Integer> nums) {
        int min = nums.get(0), max = nums.get(0);
        for(int num : nums) {
            if(num > max) {
                max = num;
            } else if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_d5b7d37c_a2e1_4da6_93eb_9f1a648d4601(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_1d64d026_6121_436e_8935_8c466131be7a(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_95d4c9dc_b83f_43e8_91e3_567b3d17439f(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_adc0f2c5_d84b_4b9f_9faa_fae78957b0a8(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_7a6f42c3_d1d4_4d41_b544_d053d185ab05(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_fcb929bc_b551_469e_bdd4_79389f9bb001(ArrayList<Integer> nums) {
        Collections.sort(nums);
        int max = nums.get(nums.size() - 1);
        int min = nums.get(0);
        return max - min;
    }

    
    public static int bigDiff_Problem_0_1c00d2ba_d81c_4ec7_8287_bf4fe0e99129(ArrayList<Integer> nums) {
        int max_val = Integer.MIN_VALUE;
        int min_val = Integer.MAX_VALUE;
        int big = Integer.MAX_VALUE;
        int small = Integer.MIN_VALUE;

        for(Integer num : nums) {
            if(num > max_val) {
                max_val = num;
            }

            if(num < min_val) {
                min_val = num;
            }

            if(num > big) {
                big = num;
            }

            if(num < small) {
                small = num;
            }
        }

        return small - max_val;
    }

    
    public static int bigDiff_Problem_0_755261bc_1b0c_4312_9a4c_f5588213d2df(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_c53462cc_1cb7_4c62_b153_15417da333fb(ArrayList<Integer> nums) {
        int length = nums.size();
        int smallest = nums.get(0);
        int largest = nums.get(0);
        for(int i = 1; i<length;i++){
            if(nums.get(i) < smallest) smallest = nums.get(i);
            else if(nums.get(i) > largest) largest = nums.get(i);
        }
        int max = largest - smallest;
        return max;
    }

    
    public static int bigDiff_Problem_2_dfbab8b5_b4ea_4d55_a641_a89d520d514a(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_bc37e580_b7f4_4fad_9d45_514bb48e31a9(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num: nums) {
            max = Math.max(num, max);
            min = Math.min(num, min);
        }
        return max-min;
    }

    
    public static int bigDiff_Problem_1_3862c987_cf19_486b_919f_b69769f7e8be(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_17bf030b_8528_4513_991f_f2af5a98104e(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_1_11caf3e5_cbe3_43e2_aaa0_5513d03332db(ArrayList<Integer> nums) {
        Integer[] arr = nums.stream().sorted().toArray(Integer[]::new);
        return arr[arr.length-1]-arr[0];
    }

    
    public static int bigDiff_Problem_2_9c334d44_e861_40a7_a53a_787f8e6f931a(ArrayList<Integer> nums) {
        int minVal = nums.stream().mapToInteger(l -> l).min().getAsInteger();
        int maxVal = nums.stream().mapToInteger(l -> l).max().getAsInteger();
        return maxVal - minVal;
    }

    
    public static int bigDiff_Problem_1_04b58911_15ad_4205_bfcc_0506a0b1e5b7(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_c3bd811a_a25d_4f59_9088_1f3d0c88eb70(ArrayList<Integer> nums) {
        int biggest = nums.stream().map(Integer::valueOf).max(Integer::compareTo).get();
        int smallest = nums.stream().map(Integer::valueOf).min(Integer::compareTo).get();
        return biggest - smallest;
    }

    
    public static int bigDiff_Problem_1_065a7c8c_3bbd_4bc7_8585_76720dfa0f9a(ArrayList<Integer> nums) {
        return nums.stream().map(x ->  x).reduce((x, y) -> Math.max(x, y)).get();
    }

    
    public static int bigDiff_Problem_1_7f42274a_abd7_4667_8b78_cc24c666d81a(ArrayList<Integer> nums) {
        int small = Collections.min(nums);
        int big = Collections.max(nums);
        return big-small;
    }

    
    public static int bigDiff_Problem_1_5713f0e0_ddea_4016_b24c_44dc3fdbf2a7(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_c45115b5_0848_4ec3_bc6c_13d1dd21fdbb(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_9844d669_38fd_4605_b1a7_17ffcab217a0(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_5ece7ec7_3f5b_405b_ba9e_967e55ec558c(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_fc8ff7ae_34a9_4408_8de5_2cbad0100942(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_da73ab2b_8cec_4b6a_bd23_50639aaa760f(ArrayList<Integer> nums) {
        if(nums.size() == 1) {
            return 0L;
        }
        if(nums.size() == 2) {
            return Math.abs(nums.get(0) - nums.get(1));
        }
        int a = nums.get(0);
        int b = nums.get(1);
        int c = nums.get(2);
        return Math.max(Math.max(a, b), c);
    }

    
    public static int bigDiff_Problem_2_bd96a574_7d6f_44c6_8c41_c9f085d0618c(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_7c0b3b1d_1c61_46ab_8916_defd2ef677bb(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_1706cb97_be1a_4466_8b33_c3a68f1b9d6a(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_2_5047e32c_160a_42fc_9813_cc5cdcae2f0b(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_9f0e3208_4f9c_46d9_9109_ad72c90ff801(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_1fde9f8f_597a_429e_a1be_e81bdd820ee3(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_0f51f419_9197_484c_a35f_459c3f0b4269(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_5cbae0f2_3e7a_4dd5_b45a_3f4e6b4e96b3(ArrayList<Integer> nums) {
        int largest = nums.get(0); // Initialize largest to first element
        int smallest = nums.get(0);
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if(nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_d83cb73d_db82_4654_86a4_3807761e2a0b(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int x : nums){
            if(x < min) min = x;
            if(x > max) max = x;
        }
        return max-min;
    }

    
    public static int bigDiff_Problem_0_366dee59_e155_4bf4_9f5b_f3ce7be7aaf4(ArrayList<Integer> nums) {
        if (nums == null || nums.size() == 0) {
            return -1;
        }
        int min = nums.get(0), max = nums.get(0);
        for (Integer i : nums) {
            min = i < min ? i : min;
            max = i > max ? i : max;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_6c64a129_1167_4817_bcea_a4e3cffbd1ad(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_4814bfb2_7577_4f1a_bac7_deb5506a0e36(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_da73ab2b_8cec_4b6a_bd23_50639aaa760f(ArrayList<Integer> nums) {
        if(nums.size() == 1) {
            return 0L;
        }
        if(nums.size() == 2) {
            return Math.abs(nums.get(0) - nums.get(1));
        }
        int a = nums.get(0);
        int b = nums.get(1);
        int c = nums.get(2);
        return Math.max(Math.max(a, b), c);
    }

    
    public static int bigDiff_Problem_1_bb780049_ff04_454d_be95_1aa9addcccf4(ArrayList<Integer> nums) {
        return nums.stream().reduce((x,y) -> Math.abs(x-y)).orElse(0L);
    }

    
    public static int bigDiff_Problem_0_0b88634d_0e25_413b_9a61_b42ab6f47ea7(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_6dc3343a_e78f_448d_9f9a_63ecb5dd4c33(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_2_09c7d9de_9130_49ea_bb87_52cbc40889b3(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer i : nums) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_0c931ebd_c09d_4afc_bfd4_820cebe4c89f(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_2_9c73802d_c07f_483e_a11f_2d4c50f381e5(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i : nums) {
            if(i > max) {
                max = i;
            }
            if(i < min) {
                min = i;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_a18d04c3_6b5c_4f30_bd2c_87ca173a003d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_0899a4eb_b78f_4ade_94ca_16df055733df(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_6dc3343a_e78f_448d_9f9a_63ecb5dd4c33(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_1_5cbae0f2_3e7a_4dd5_b45a_3f4e6b4e96b3(ArrayList<Integer> nums) {
        int largest = nums.get(0); // Initialize largest to first element
        int smallest = nums.get(0);
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if(nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_11bafd1f_0b38_4b62_9ae2_0d463c350418(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_f57ee6bc_f786_437d_9988_07029b6caa0c(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_f02ca3c7_08f8_4866_9ec3_1d13108c6abf(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_66efe544_bc2f_46db_b911_87fb7c73f5a9(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_ed8541b3_573f_4f27_ac64_e1372a732ed9(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_3071abb6_9e59_4d32_bade_3f865e0c273a(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, sum = 0;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            sum = num + sum;
        }
        return sum - min - max;
    }

    
    public static int bigDiff_Problem_1_b67e175e_9d98_4f10_92f6_7e4f2063e513(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_a0f1f263_c134_4f7f_9112_5eb04b709ac8(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_1d64d026_6121_436e_8935_8c466131be7a(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_c747c829_cfe6_48db_9c92_22c0a4df9fe0(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_cadc7447_a5a5_4dae_9b06_12c062fa308b(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_0_7223cea6_a13f_4a46_9730_6b928e676120(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_8009eb65_84b0_46c1_83c3_235342c638c3(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_0_684309b4_0f31_497d_92ca_ed5802077423(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_0c6507a5_a1ff_4d90_afb5_509a929206cd(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for(int i : nums) {
            if(i < min) {
                min = i;
            }
            if(i > max) {
                max = i;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_5f530433_307f_4539_96e6_77e9071e7b33(ArrayList<Integer> nums) {
        int max1 = 0;
        int max2 = 0;
        int min1 = 0;
        int min2 = 0;
        for(Integer n: nums) {
            if(n > max1) {
                max2 = max1;
                max1 = n;
            }
            if(n > max2) {
                max2 = n;
            }
            if(n < min1) {
                min2 = min1;
                min1 = n;
            }
            if(n < min2) {
                min2 = n;
            }
        }
        return Math.abs(max1 - min1) > Math.abs(max2 - min2)? Math.abs(max1 - min1): Math.abs(max2 - min2);
    }

    
    public static int bigDiff_Problem_2_bd805d9b_16bc_4abd_bd20_1381bd94303f(ArrayList<Integer> nums) {
        int max = 0, min = nums.get(0);
        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i) > max)
                max = nums.get(i);
            if(nums.get(i) < min)
                min = nums.get(i);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_aa667432_590d_4e59_a886_39686399ce4a(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_c632a1f0_bdc9_404f_8393_0b002c10dca9(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num: nums) {
            if(num>max) {
                max = num;
            }
            if(num<min) {
                min = num;
            }
        }
        return Math.abs(max - min);
    }

    
    public static int bigDiff_Problem_2_f82eac55_8f3f_44c2_a0a6_7a5f5ef32b33(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_ca7528d9_8527_4c7e_92b9_a21c310bea75(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_37ff5605_56c0_4a8b_b28f_7017a018e54e(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_fb6c6c9c_e850_4401_850f_0f652e54fd05(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_bff606e5_ac77_4ebc_823c_873dd53966d6(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_1e08b8ef_9389_4224_980e_1fd190d0e7de(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_1ed3e88a_dcc6_47c7_9424_19be2d140d0a(ArrayList<Integer> nums) {
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if(nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_b9c137e5_0a5b_4ba0_8f26_a265e3ca3258(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_0f9adc92_35f1_426d_8932_1705333578ad(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_72a19b54_ba51_41ca_b5e1_bb0dcf968ce6(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_8ef7a39c_3687_4259_9c73_3a05f6d1cfec(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer x : nums) {
            if (x > max) {
                max = x;
            }
            if (x < min) {
                min = x;
            }
        }
        int diff = max - min;
        return diff;
    }

    
    public static int bigDiff_Problem_0_bb3849b3_9031_493e_b516_9c336bf1e5db(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_6a22d508_1e51_4a5b_a9db_a0239f6aa225(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_a3090edc_698d_463b_9d03_a90ea6859680(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_f02ca3c7_08f8_4866_9ec3_1d13108c6abf(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_7f42274a_abd7_4667_8b78_cc24c666d81a(ArrayList<Integer> nums) {
        int small = Collections.min(nums);
        int big = Collections.max(nums);
        return big-small;
    }

    
    public static int bigDiff_Problem_1_c4ac92e3_f7ba_45cc_8fca_40d9dffb2d76(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer n : nums) {
            max = Math.max(n, max);
            min = Math.min(n, min);
        }
        return Math.abs(max - min);
    }

    
    public static int bigDiff_Problem_0_9e11b7af_44db_4f05_a350_14026ae65c85(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_fcef4b05_f6db_4f7f_93a0_e2212837db40(ArrayList<Integer> nums) {
        Integer max = nums.stream().max(Integer::compare).get();
        Integer min = nums.stream().min(Integer::compare).get();
        int diff = max - min;
        return diff;
    }

    
    public static int bigDiff_Problem_1_bdca75cf_c74a_41e9_8b1b_0e7a3e77eb24(ArrayList<Integer> nums) {
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
        int diff = max - min;
        return diff;
    }

    
    public static int bigDiff_Problem_1_76573c0c_9304_4353_aea3_aaac34bdd771(ArrayList<Integer> nums) {
        int i = 0;
        int max = 0;
        int min = 0;
        for (Integer num: nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            i++;
        }
        System.out.println("Largest value: " + max + " and smallest value: " + min);
        return max - min;
    }

    
    public static int bigDiff_Problem_0_1e9f9329_7c48_4e66_a70c_c510063ca814(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_fd870681_de1c_41f5_83b4_85bed2464ba1(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_0_54dfcd60_5082_4ef0_b5f9_13b0682966b5(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_6cd44374_0ba3_4039_a884_ea4c150e140e(ArrayList<Integer> nums) {
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if(nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_62b5689b_077f_449a_b36a_a9ee065adb7f(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer x : nums) {
            max = Math.max(max, x);
            min = Math.min(min, x);
        }
        return max-min;
    }

    
    public static int bigDiff_Problem_0_c5725442_e94b_484e_9300_1058e51b32a0(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_7ed71c88_865e_4707_bde2_c859059847a9(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_569be6da_0014_492f_939d_a8738ccf5c79(ArrayList<Integer> nums) {
        int max = Collections.max(nums);
        int min = Collections.min(nums);
        return max - min;
    }

    
    public static int bigDiff_Problem_0_b86fd09c_f016_4ad5_87af_929aebe93c9b(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_c25950a2_4e07_48c2_9f5e_9c1323fbc01b(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > max)
                max = num;
            if(num < min)
                min = num;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_517a0a08_5ccd_4f88_b802_8a8d092786b1(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_eaba583d_5a6a_4a4f_8d08_4012c1fcefda(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_2c237a9d_529c_471e_a380_e08b5acb8bf7(ArrayList<Integer> nums) {
        int minVal = nums.get(0);
        int maxVal = nums.get(0);

        for (int num : nums) {
            if (num > maxVal) {
                maxVal = num;
            } else if (num < minVal) {
                minVal = num;
            }
        }

        int diff = maxVal - minVal;
        return diff;
    }

    
    public static int bigDiff_Problem_0_0477b283_153a_4890_90d1_090b96f29c72(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_9918668a_375c_4285_9798_97db343bb90b(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_1_c4604e0f_fb32_472c_800e_d5a1ce74149a(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_8b8cbd55_dd09_4914_be1b_71b73b71f203(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_212dc00f_41b6_4ffc_ae8b_e0ca4cc89587(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_73f24e6b_1c37_45ff_a546_52a1928efc9b(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_5d1d4d79_87ed_4ae0_8a14_936dde95e3c6(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_0d81f006_628c_4320_8fb1_50ffb868af0c(ArrayList<Integer> nums) {
        int n = nums.size();
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 1; i < n; i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            } else if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        int diff = Math.abs(max - min);
        return diff;
    }

    
    public static int bigDiff_Problem_0_d48268ea_f184_454b_8941_b6d75751153d(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_c4e0dcf5_1a50_4093_aff3_c9f2c485de48(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int each : nums) {
            largest = Math.max(each, largest);
            smallest = Math.min(each, smallest);
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_c831c9ff_7955_4bae_aa66_6d53e049e5c3(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_78ffffc2_a04d_4c06_864e_d75f943a81f5(ArrayList<Integer> nums) {
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
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_3524c659_346a_457c_8360_d2414b6cd528(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_6e2e207c_2bd2_41fb_901d_65beddf89add(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_26ec624f_408a_4da0_92e5_e9300f597a45(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_de791e13_5645_4f6e_85f9_54e92607e514(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_9fcdd4d2_9442_48bf_9eb9_444594d201ef(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_4643fe83_2ba2_4201_9563_5e047447b242(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer l : nums) {
            if (l > max) {
                max = l;
            }
            if (l < min) {
                min = l;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_e1468c0e_4bca_4d84_a4db_44dae4d8f97e(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_28fe75bc_4e27_42b5_bdd3_4c9359a886b4(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_701488b5_457b_422c_9665_20afc842bc5d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_ca7528d9_8527_4c7e_92b9_a21c310bea75(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_b7ed7bcc_0fbd_4946_b7f2_e5f9987a861f(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_78fb5921_7a52_41a2_8619_af5bf250c4b6(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_0_c26cbe29_223f_4396_b0e7_c6322765d5ec(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_978adba6_70bf_4e77_98a7_c450bbe8532e(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_ecfc0f34_a77b_45ab_8434_daf669ff663f(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_5434f2e6_271b_44ca_b1dd_765605fcb5ac(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_54cc09d9_d67a_4770_951e_d73d47ce8757(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) > max) max = nums.get(i);
            if(nums.get(i) < min) min = nums.get(i);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_999614f6_b6a5_4761_95be_59f32913800c(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_6c64a129_1167_4817_bcea_a4e3cffbd1ad(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_aaddf35e_8cdc_462e_8cea_0cacd67d890f(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_824ee85d_009b_407e_9aa3_03a4f937cd8e(ArrayList<Integer> nums) {
        int result = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        result = max - min;
        return result;
    }

    
    public static int bigDiff_Problem_1_24a98fad_ff75_4222_96ab_b02a23475b12(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_74cdcbbb_f889_424a_a974_7e55ffee3960(ArrayList<Integer> nums) {
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
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_557d7428_b67c_4de5_9511_e1a8da94d399(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_a6a29fff_56ca_426d_8055_e21410d13c0d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_4e6f3155_c6c7_445b_a6be_32bea250778f(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_54a79c57_694b_40ab_ad9b_2831ccceb8f2(ArrayList<Integer> nums) {
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
        return Math.abs(max - min);
    }

    
    public static int bigDiff_Problem_0_bcac2721_1541_41c7_82de_cc7118a66bd0(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_7e531917_e2e6_4e52_bc6b_f495982eb45f(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_3abef8d6_faf3_40d3_8c1e_d935734dd474(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer n : nums) {
            if(n > max) {
                max = n;
            }
            if(n < min) {
                min = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_0b88634d_0e25_413b_9a61_b42ab6f47ea7(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_77983ee4_6863_411d_b1d0_4522e6d78c7a(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_dfbab8b5_b4ea_4d55_a641_a89d520d514a(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_236df4aa_d48e_469d_8e72_490b2f442b8c(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_d7ba5ff5_5cb7_480a_b56f_3b3ab70f306f(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer l : nums) {
            max = Math.max(max, l);
            min = Math.min(min, l);
        }
        return Math.abs(max - min);
    }

    
    public static int bigDiff_Problem_0_e68fcf5a_26b7_4aa6_abe0_e2dfcf2db572(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_c26cbe29_223f_4396_b0e7_c6322765d5ec(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_d0374e6b_923e_47e3_bc42_0fa5974ed4a2(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_de3b9d25_c16b_4f9b_9c9f_b4bb02ddc547(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_a5cdab70_cd2a_4431_9696_b0c2ef58d01c(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_c8fb3d5d_10fd_4b31_95de_157eb4693b77(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_8afc9a6e_7736_47cf_8b0f_810491da7931(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_1_7e0f38e9_5a87_47d2_ac29_7b6583e3270a(ArrayList<Integer> nums) {
        int res = 0;
        Collections.sort(nums);
        res = nums.get(nums.size() - 1) - nums.get(0);
        return res;
    }

    
    public static int bigDiff_Problem_0_7e22747c_6e11_4a49_a913_f4778a4f319f(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_3f24bdbc_5df9_4ad8_bfdc_2e46daf83354(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_bcbe1eff_15fe_4f4c_abb0_8bdb0de4bdd8(ArrayList<Integer> nums) {
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_8a38c207_facb_4eaf_b15a_81a2c539c918(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_4e8529bd_0aae_42b2_8975_6cce76e5aaa9(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_5dcf6798_ab33_472d_86f4_43910ec0a630(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_bd96a574_7d6f_44c6_8c41_c9f085d0618c(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_8387a66f_06ba_4d64_9cd6_cd367921533f(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_9b8f4d6b_541a_47f8_93a1_93d293e13f29(ArrayList<Integer> nums) {
        int max = 0;
        int min = 0;
        for(int value: nums) {
            if(value > max) {
                max = value;
            }
            if(value < min) {
                min = value;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_cf13a4d8_5541_4cb9_b368_aaa2a6628d06(ArrayList<Integer> nums) {
        // your code goes here
        
        return nums.get(0) - nums.get(nums.size()-1);
    }

    
    public static int bigDiff_Problem_1_9fcdd4d2_9442_48bf_9eb9_444594d201ef(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_1ed17f36_23a3_47dc_b8a1_7caf146bd124(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_2_493f56a7_fe14_4da5_80ea_88ab10c42194(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_0_84a4ac7d_308d_4068_b3ca_c7223dc151c5(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_a48b16b8_f6c8_4283_bceb_b643d0a13eef(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_a8209389_3bec_4f28_a1de_0d9723ecf9ad(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_ffad12e1_da6e_4cbe_9259_24a09ead7ef2(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_731f977f_0eec_4a46_9338_cb98ff9bfbfd(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) > max) {
                max = nums.get(i);
            }
            if(nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_7400a331_74c1_409f_9111_7db6f7c9ce93(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_baa1acb6_51da_41e9_be3e_362140813d36(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer l : nums) {
            max = Math.max(max, l);
            min = Math.min(min, l);
        }
        return Math.abs(max - min);
    }

    
    public static int bigDiff_Problem_1_c8167b1b_3bfc_49d2_ae8c_7c7a320989dd(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_1898f315_c317_45d5_a6b3_2d89981a612a(ArrayList<Integer> nums) {
        int result = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int n : nums) {
            if(n > max) {
                max = n;
            }
            if(n < min) {
                min = n;
            }
        }
        result = max - min;
        return result;
    }

    
    public static int bigDiff_Problem_0_c4604e0f_fb32_472c_800e_d5a1ce74149a(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_97dd31c4_a76b_489b_9114_5b7c478c41c7(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_aa667432_590d_4e59_a886_39686399ce4a(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_28fe75bc_4e27_42b5_bdd3_4c9359a886b4(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_86e236d5_205a_4cfc_be3e_95bcc93a95ab(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_5abde4c7_fa4f_43b1_b18f_168c12658f12(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (Integer x : nums) {
            if (x > max) max = x;
            if (x < min) min = x;
        }
        int diff = 0;
        if (min > max) return 0;
        for (Integer x : nums) {
            diff += Math.abs(x - (max + min) / 2);
        }
        return diff;
    }

    
    public static int bigDiff_Problem_1_16c5aec8_6092_4ed8_b083_550f3eeafa11(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_debebea5_a2b6_42a8_a9d5_eb0ad0fb312e(ArrayList<Integer> nums) {
        Integer min = Integer.MAX_VALUE;
        Integer max = Integer.MIN_VALUE;
        for (Integer num: nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        int diff = max - min;
        return diff;
    }

    
    public static int bigDiff_Problem_1_9c73802d_c07f_483e_a11f_2d4c50f381e5(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i : nums) {
            if(i > max) {
                max = i;
            }
            if(i < min) {
                min = i;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_b1e57a2f_6255_4667_b997_02facf2ffea2(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_c632a1f0_bdc9_404f_8393_0b002c10dca9(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num: nums) {
            if(num>max) {
                max = num;
            }
            if(num<min) {
                min = num;
            }
        }
        return Math.abs(max - min);
    }

    
    public static int bigDiff_Problem_2_debebea5_a2b6_42a8_a9d5_eb0ad0fb312e(ArrayList<Integer> nums) {
        Integer min = Integer.MAX_VALUE;
        Integer max = Integer.MIN_VALUE;
        for (Integer num: nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        int diff = max - min;
        return diff;
    }

    
    public static int bigDiff_Problem_0_4644e759_5d81_4673_a434_a6474aaa93e3(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_fa0e002e_8d7f_429e_8030_7516216cab36(ArrayList<Integer> nums) {
        int biggest = nums.stream().mapToInteger(Integer::intValue).max().getAsInteger();
        int smallest = nums.stream().mapToInteger(Integer::intValue).min().getAsInteger();
        return biggest - smallest;
    }

    
    public static int bigDiff_Problem_0_c7145b90_2b0c_4b35_a7e9_68a4a6f225b4(ArrayList<Integer> nums) {
        int max1 = Integer.MIN_VALUE, min1 = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max1) {
                max1 = num;
            }
            if (num < min1) {
                min1 = num;
            }
        }
        return Math.abs(max1 - min1);
    }

    
    public static int bigDiff_Problem_0_04fa97a3_a942_4afb_ad03_5e280e160a7c(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_66efe544_bc2f_46db_b911_87fb7c73f5a9(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_65ef86f4_10ff_42bc_a185_82156985676d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_3c4d7301_3b1a_4d62_8e26_17700f75039a(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_05c22697_4d51_4f84_809e_27753c7af6a2(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, res;
        for(Integer n : nums) {
            if(min > n) {
                min = n;
            }
            if(max < n) {
                max = n;
            }
        }
        res = max - min;
        return res;
    }

    
    public static int bigDiff_Problem_2_e1335d0d_672c_4015_95cb_b5d8835ba514(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_15a223c5_c146_48fd_93f3_863c42cf08e0(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_fad85ea5_4582_4cc9_a601_13039f7c31c8(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0);
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_87fd7aef_7c2a_4c24_9588_0b601bb01bb8(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_c45115b5_0848_4ec3_bc6c_13d1dd21fdbb(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_9c05c7a6_10fc_4b8c_8533_fcb66ac81770(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_e4bb3f87_7e9e_48d6_85e5_2203efd032c1(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_e83d3d3e_e2dc_4f71_b558_c9a7f9aa27f4(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_2_168f5dba_8e0d_4d80_8d36_e863f5461b5a(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_35ffc1f6_287e_4928_85c2_651a66be9b64(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_a67cc449_b6e6_4ce3_bd4f_419b2c89cdfa(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_210eeef4_5ac8_47a5_8287_bbd73150b7aa(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i : nums) {
            if(i > max) {
                max = i;
            }
            if(i < min) {
                min = i;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_d3ce4941_2f6a_482c_a351_31fe72a3d211(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_bf2ee28f_359b_40b2_b65a_8c9fab1ad6c3(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_29cca0de_8603_4ac1_82c2_a5b014dfcc43(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (Integer num : nums) { // loop through all elements in array
            if (num > largest) { // if current element is greater than largest
                largest = num; // update largest to current element
            } else if (num < smallest) { // if current element is smaller than smallest
                smallest = num; // update smallest to current element
            }
        }
        return largest - smallest; // return difference between largest and smallest
    }

    
    public static int bigDiff_Problem_0_fcef4b05_f6db_4f7f_93a0_e2212837db40(ArrayList<Integer> nums) {
        Integer max = nums.stream().max(Integer::compare).get();
        Integer min = nums.stream().min(Integer::compare).get();
        int diff = max - min;
        return diff;
    }

    
    public static int bigDiff_Problem_2_c8781559_6834_465d_a2c0_be5c5049f4fe(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_9c05c7a6_10fc_4b8c_8533_fcb66ac81770(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_7bfb3692_004d_4007_80b5_c7113b71b450(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.size();i++) {
            if(nums.get(i) > max) {
                max = nums.get(i);
            }
            if(nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max-min;
    }

    
    public static int bigDiff_Problem_0_24667c10_5b55_41c0_b2c0_06572e620dfd(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_0_7f4c77ad_5b06_48e1_b6cb_d76a19229895(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_54fb2cad_433c_4d7d_9fa9_191c86bfd730(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_3bbd9707_9608_4d5a_9f01_ba5f7d121d55(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (Integer num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return max - min;
    }

    
    public static int bigDiff_Problem_2_c66169d8_35be_482a_b97d_fc3e55e42a17(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int n : nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_4643fe83_2ba2_4201_9563_5e047447b242(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer l : nums) {
            if (l > max) {
                max = l;
            }
            if (l < min) {
                min = l;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_e0076b7f_8d52_4352_9e55_cb5882794241(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_2_c9ca9c89_f663_4ea0_8ac7_05fdbc7473f6(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_baf41e24_1ea9_4761_b3c3_324f2b7e9c53(ArrayList<Integer> nums) {
        Integer[] intArray = new Integer[nums.size()];
        nums.toArray(intArray);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) max = nums.get(i);
            if (nums.get(i) < min) min = nums.get(i);
        }
        int result = max - min;
        return result;
    }

    
    public static int bigDiff_Problem_1_cc4b00ad_188e_49cd_91c0_2ef2ff10ddca(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_e6be56af_b064_4651_836b_b24fefdb048e(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_1_efbc029a_da8f_4e16_803e_e2c5864b8743(ArrayList<Integer> nums) {
        if (nums.size() == 1) return nums.get(0);
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) max = nums.get(i);
            if (nums.get(i) < min) min = nums.get(i);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_c0794501_0e65_48ad_8b32_8cc922c45dac(ArrayList<Integer> nums) {
        Collections.sort(nums);
        return nums.get(nums.size()-1) - nums.get(0);
    }

    
    public static int bigDiff_Problem_2_953ca899_71dd_4ce9_b619_fac73b7d2caa(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_23462d66_1ea4_47c4_a6fd_50c90a497d41(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_e52fef55_4e62_46c9_b0ee_b82827bef8dc(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(Integer n : nums) {
            min = n < min ? n : min;
            max = n > max ? n : max;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_c4c2a51a_9e6e_4877_a394_62ead7a03c93(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_9fcdd4d2_9442_48bf_9eb9_444594d201ef(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_8952dbe7_4642_4237_98f0_b89ac8192a8a(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_60f2af68_c953_464b_8748_dad678d5257b(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_1_d4a1f86c_8306_4a8a_9072_8c595f45b07b(ArrayList<Integer> nums) {
        int bigNum = nums.get(0);
        int smallNum = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > bigNum)
                bigNum = nums.get(i);
            if (nums.get(i) < smallNum)
                smallNum = nums.get(i);
        }
        int difference = bigNum - smallNum;
        System.out.println("difference is: " + difference);
        return difference;
    }

    
    public static int bigDiff_Problem_0_a99d42d9_61c5_473c_b1b6_30b0cf161558(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        int diff = 0;
        for(int i : nums) {
            if(i > max) max = i;
            if(i < min) min = i;
            if(max - min > diff) diff = max - min;
        }
        return diff;
    }

    
    public static int bigDiff_Problem_0_d7da0401_7a39_4d34_86b0_91866d7b87ec(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_7e970e27_5188_4c0b_b775_766d226060c2(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_e03c20a4_a62d_4bc4_8424_498032718d97(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_1_46344b7e_a54c_41a1_9abf_5d315e9b904e(ArrayList<Integer> nums) {
        int diff = 0;
        for(Integer num: nums){
            diff = Math.max(Math.abs(diff), Math.abs(num));
        }
        return diff;
    }

    
    public static int bigDiff_Problem_2_f72ebdb9_9ad5_4d57_ae79_e910996ece17(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for(Integer l : nums) {
            if(l < min) {
                min = l;
            } else if(l > max) {
                max = l;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_23d9b51a_d335_45b7_881b_812de58c870f(ArrayList<Integer> nums) {
        int l = nums.get(0);
        int r = nums.get(0);
        for(int i = 0;i<nums.size();i++) {
            if(nums.get(i)>r) r = nums.get(i);
            if(nums.get(i)<l) l = nums.get(i);
        }
        return r-l;
    }

    
    public static int bigDiff_Problem_1_aca10976_7bfe_465a_9886_2f7148409530(ArrayList<Integer> nums) {
        Collections.sort(nums);
        return nums.get(nums.size() - 1) - nums.get(0);
    }

    
    public static int bigDiff_Problem_0_a775f277_e52a_4bb5_9afa_9676c523b3af(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_fa0e002e_8d7f_429e_8030_7516216cab36(ArrayList<Integer> nums) {
        int biggest = nums.stream().mapToInteger(Integer::intValue).max().getAsInteger();
        int smallest = nums.stream().mapToInteger(Integer::intValue).min().getAsInteger();
        return biggest - smallest;
    }

    
    public static int bigDiff_Problem_2_f0b405c7_1722_4acd_8948_a78aee249d74(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_ed96abc3_6092_40bc_b377_034c0b661cb7(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Integer n: nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_7b00f691_01a0_48ed_9518_86298006902a(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) > max) {
                max = nums.get(i);
            }
            else if(nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_04f26110_88b8_4b7e_b6a6_701a155e2379(ArrayList<Integer> nums) {
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
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_b90ce472_bab0_4086_8e6c_5299cfb3367f(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_804a44d4_b457_4826_841a_fe49a4c1b337(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_c4c2a51a_9e6e_4877_a394_62ead7a03c93(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_66efe544_bc2f_46db_b911_87fb7c73f5a9(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_48b2b8f4_f38d_4024_87a4_099f5b0645d2(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_460aca92_bb48_40a4_a0e2_49e596e35df1(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_84a4ac7d_308d_4068_b3ca_c7223dc151c5(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_be124fbe_ffef_4d8e_a7ef_886768ec30ed(ArrayList<Integer> nums) {
        if(nums == null || nums.isEmpty())
            return 0;
        int min = nums.stream().min(Integer::compare).get();
        int max = nums.stream().max(Integer::compare).get();
        return max - min;
    }

    
    public static int bigDiff_Problem_1_7666fbb6_ea84_40ba_b510_bec6e462f54d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int n : nums) {
            if (n > max) {
                max = n;
            } else if (n < min) {
                min = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_67192402_969c_48e2_8602_984b2a518216(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_0af863a3_1141_4546_89bb_6208da75d155(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_32273791_9393_40ac_8414_cdbb4239ae68(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_65a38283_3f31_4747_9d87_bb0595863197(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_f2d18be8_23ec_4c85_91f5_1ce58c86bb7b(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_ebdca7ff_1184_4229_bd4b_b4bf5eb6d684(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int n : nums) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_dbf9f226_ec3e_4926_ac1f_d79db5f7e5da(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_e07fe78f_a1cd_47e7_ab9b_7b8ee9dcf76b(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_f7807077_fbb9_41b5_8e61_7c96b2b48163(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n: nums) {
            if (n < min) min = n;
            if (n > max) max = n;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_4947c68d_fafe_4b76_b621_f017a11c89ae(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_1_79489941_2e2f_4d6f_be92_37e1555f5121(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_c9387ee3_68ec_4750_b655_29bc21a8aa97(ArrayList<Integer> nums) {
        int max = 0;
        int min = 0;
        for (Integer i : nums) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_17bf030b_8528_4513_991f_f2af5a98104e(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_1_a7528a49_baa7_4124_b612_97a8929caf68(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_1d71d3d7_9ce4_4220_9cec_f76878bc7dc5(ArrayList<Integer> nums) {
        if(nums.isEmpty()) throw new IllegalArgumentException("array list is empty");
        int maxValue = nums.get(0);
        int minValue = nums.get(0);
        int diff;
        for(Integer num : nums) {
            if(num > maxValue) {
                maxValue = num;
            }
            if(num < minValue) {
                minValue = num;
            }
        }
        diff = maxValue - minValue;
        return diff;
    }

    
    public static int bigDiff_Problem_0_3cc7fa7d_ebac_4329_ab55_74db3e4f221d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_8afc9a6e_7736_47cf_8b0f_810491da7931(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_2_d48268ea_f184_454b_8941_b6d75751153d(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_05519d09_1311_4201_87a2_0b84c7773301(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_2_f7e95b7e_1967_4ded_8438_1e35b233f665(ArrayList<Integer> nums) {
        int max = Collections.max(nums);
        int min = Collections.min(nums);
        return (max-min);
    }

    
    public static int bigDiff_Problem_0_6a22d508_1e51_4a5b_a9db_a0239f6aa225(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_28afac1d_97a0_45de_bd8d_e04c83c1c922(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_aa4dccbd_ea6d_4045_81e3_3d6001f6e915(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_610d14c1_e35f_40ce_984c_f2fc16579677(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_8508e68b_82e2_45d3_a053_0ad516e8b5db(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_a775f277_e52a_4bb5_9afa_9676c523b3af(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_42180f98_341e_408d_b8e3_671e9726c92c(ArrayList<Integer> nums) {
        Collections.sort(nums);
        return nums.get(nums.size() - 1) - nums.get(0);
    }

    
    public static int bigDiff_Problem_2_199715c2_f33c_416c_b0bc_2c922625f87b(ArrayList<Integer> nums) {
        int len = nums.size();
        int[] arr = new int[len];
        for (int i = 0; i < nums.size(); i++) {
            arr[i] = nums.get(i);
        }
        Arrays.sort(arr);
        int max = arr[len - 1];
        int min = arr[0];
        int diff = max - min;
        return diff;
    }

    
    public static int bigDiff_Problem_1_a3090edc_698d_463b_9d03_a90ea6859680(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_cb2acb6d_6f15_4397_a939_18b09c06d07f(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_bf4b7a5f_2c23_40e9_802f_df866edb2091(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Integer i : nums) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_b1e57a2f_6255_4667_b997_02facf2ffea2(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_f47aaed3_0d0e_40ba_92ca_535912a3a9d2(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (Integer num : nums) {
            if (num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_06da4761_dead_46f7_a57a_5a5442f430e6(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.size(); i++) {
            if(max < nums.get(i))
                max = nums.get(i);
            if(min > nums.get(i))
                min = nums.get(i);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_8ef408d7_9c1d_4a51_add0_0874edca27ca(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return Math.abs(max - min);
    }

    
    public static int bigDiff_Problem_1_ecfc0f34_a77b_45ab_8434_daf669ff663f(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_5564406a_b78a_4e7e_86fd_c70ad9575e4f(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_74846cf6_7135_4fd3_b64f_eeb3b25cb0e4(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_1e9f9329_7c48_4e66_a70c_c510063ca814(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_9e639334_e850_4d97_9013_8d7a19c4d5c7(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min)
                min = num;
            if (num > max)
                max = num;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_12f658d3_c317_478b_a95d_e32c67239233(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_21c39b38_5bee_4d29_a68d_9e6dabc674ec(ArrayList<Integer> nums) {
        Integer[] array = new Integer[nums.size()];
        nums.toArray(array);
        Arrays.sort(array);
        Integer biggest = array[array.length - 1];
        Integer smallest = array[0];
        Integer diff = biggest - smallest;
        return diff;
    }

    
    public static int bigDiff_Problem_1_ebdca7ff_1184_4229_bd4b_b4bf5eb6d684(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int n : nums) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_6de734e7_2765_4d8b_994a_8385d73b97a0(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_77f09768_6005_4cfc_830b_a04330c3a9c3(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_139acf37_ae66_4774_9476_1baec81babef(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_7fc96a01_6b5c_40a7_b98c_a7b3eb794f7a(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_a90043f7_44ca_42ee_8bc3_13d60881bd12(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_43f499dc_cb70_4e4c_ade9_e9a4d507c739(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_0df7b0fe_0444_49f7_9a47_f3aaf1b1154a(ArrayList<Integer> nums) {
        int max = Collections.max(nums);
        int min = Collections.min(nums);
        return max - min;
    }

    
    public static int bigDiff_Problem_2_4bc50d3c_6f94_4dde_82e0_1676e4cea229(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i : nums) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_a6360c46_2ff1_4207_9be3_38eedd986f20(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_60c00632_5391_4dc0_a128_0631c75f53c3(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(Integer i : nums) {
            if(i < min)
                min = i;
            else if(i > max)
                max = i;
        }
        if(min == max) {
            return 0L;
        }
        else {
            return max-min;
        }
    }

    
    public static int bigDiff_Problem_1_8acd443a_380c_453f_8371_49b69ee44085(ArrayList<Integer> nums) {
        Integer max = nums.stream().max(Integer::compare).orElse(0L);
        Integer min = nums.stream().min(Integer::compare).orElse(0L);
        return max - min;
    }

    
    public static int bigDiff_Problem_1_ff6c203c_e287_46cd_af6d_1c906fa0fc40(ArrayList<Integer> nums) {
        Integer min = nums.get(0);
        Integer max = nums.get(0);
        for (Integer number : nums) {
            if (number < min) {
                min = number;
            } else if (number > max) {
                max = number;
            }
        }
        return Math.abs(max - min);
    }

    
    public static int bigDiff_Problem_0_41751010_e52d_45af_a062_2063e62cf7e3(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_97dd31c4_a76b_489b_9114_5b7c478c41c7(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_a0f1f263_c134_4f7f_9112_5eb04b709ac8(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_41ce3ef0_af52_4c0a_a100_1c19af79b6cb(ArrayList<Integer> nums) {
        // Find the largest and smallest value in the array.
        int largest = nums.get(0); // Set largest to first element in array.
        int smallest = nums.get(0); // Set smallest to first element in array.
        for (int num : nums) {
            // If current number is smaller than the smallest number, then make it smallest.
            if (num < smallest) {
                smallest = num;
            }
            // Else if current number is greater than the largest number, then make it largest.
            else if (num > largest) {
                largest = num;
            }
        }
        // Return the difference between the largest and smallest numbers in array.
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_0065c19b_8a9d_468a_9de4_67f6ffd80bd0(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_bb797338_2f43_4007_a107_30feccbebf97(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_86e236d5_205a_4cfc_be3e_95bcc93a95ab(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_56494dfd_dc4c_4e4b_9d16_999e4adc6b7d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_6b0fdc06_f1d7_418f_b4a3_1cdcd6a77eb5(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_953ca899_71dd_4ce9_b619_fac73b7d2caa(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_de791e13_5645_4f6e_85f9_54e92607e514(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_ecd1ec90_e745_4ad0_a970_da1eda97cc1d(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_ecd1ec90_e745_4ad0_a970_da1eda97cc1d(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_8ef408d7_9c1d_4a51_add0_0874edca27ca(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return Math.abs(max - min);
    }

    
    public static int bigDiff_Problem_1_0316fe36_7ecc_42be_8a04_f95b822c7dfb(ArrayList<Integer> nums) {
        int largest = nums.get(0); //initialize largest to first element
        int smallest = nums.get(0);
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_374d8464_f70f_4a88_b175_f54491ada803(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_83056ac9_f97d_42b7_8558_af3317acc99b(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_199715c2_f33c_416c_b0bc_2c922625f87b(ArrayList<Integer> nums) {
        int len = nums.size();
        int[] arr = new int[len];
        for (int i = 0; i < nums.size(); i++) {
            arr[i] = nums.get(i);
        }
        Arrays.sort(arr);
        int max = arr[len - 1];
        int min = arr[0];
        int diff = max - min;
        return diff;
    }

    
    public static int bigDiff_Problem_2_61431935_02a0_4549_ac4c_2931ccbcb8b4(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_d4409ee8_f8ee_454e_aea8_6203c3d1c968(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_1_5f827c83_2980_4ed3_a0e4_659c8dccafff(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i : nums) {
            if (max < i) {
                max = i;
            } else if (min > i) {
                min = i;
            }
        }
        int diff = max - min;
        return diff;
    }

    
    public static int bigDiff_Problem_2_a5244f57_6d3c_4468_b2cf_dcfa584bbe6f(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_f7a33737_9c6d_4c5f_8f80_6b7383ee4a48(ArrayList<Integer> nums) {
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
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_0df7b0fe_0444_49f7_9a47_f3aaf1b1154a(ArrayList<Integer> nums) {
        int max = Collections.max(nums);
        int min = Collections.min(nums);
        return max - min;
    }

    
    public static int bigDiff_Problem_0_f5ea2dfc_1cd4_46a3_bdfe_c5440d58dfeb(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_2_95ed0256_8271_444b_a17d_7e1662a49952(ArrayList<Integer> nums) {
        int largest = nums.get(0); // Initialize largest to first element of array.
        int smallest = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_48e56af4_05bb_4072_8450_bb62e512dd22(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_0_88ad88f0_e91e_4757_8ede_555894f0733a(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_2_c3816449_9683_4325_87f9_c4108d848fe4(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_374d8464_f70f_4a88_b175_f54491ada803(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_8c9e36e1_2d8e_49a3_8118_22c34c984c3e(ArrayList<Integer> nums) {
        int max = 0, min = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        int temp = max - min;
        if (temp < 0) {
            return 0;
        }
        return temp;
    }

    
    public static int bigDiff_Problem_2_5564406a_b78a_4e7e_86fd_c70ad9575e4f(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_8c68d14a_752a_400e_b48a_5123d7dd103e(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_c91df87e_00d6_464f_92e7_78e0f67ab1fd(ArrayList<Integer> nums) {
        if(nums.size()==0) {
            return 0;
        }
        else if(nums.size()==1) {
            return nums.get(0);
        }
        Integer min = nums.get(0), max = nums.get(0);
        for(int i=1; i<nums.size(); i++) {
            if(nums.get(i)>max) {
                max = nums.get(i);
            }
            if(nums.get(i)<min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_04f26110_88b8_4b7e_b6a6_701a155e2379(ArrayList<Integer> nums) {
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
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_80256116_c7a7_4d1e_899d_a4121231985e(ArrayList<Integer> nums) {
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
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_701488b5_457b_422c_9665_20afc842bc5d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_88ad88f0_e91e_4757_8ede_555894f0733a(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_0_984806b3_7706_4537_8279_44d8ff1c6a64(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (Integer num : nums) {
            if (num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_26ec624f_408a_4da0_92e5_e9300f597a45(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_bdca75cf_c74a_41e9_8b1b_0e7a3e77eb24(ArrayList<Integer> nums) {
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
        int diff = max - min;
        return diff;
    }

    
    public static int bigDiff_Problem_2_a10bfb70_5dad_40a5_8e04_3dcbe3637031(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_b86fd09c_f016_4ad5_87af_929aebe93c9b(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_32273791_9393_40ac_8414_cdbb4239ae68(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_addcaa63_9049_4b52_b19a_1430c54bd8a0(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_bb780049_ff04_454d_be95_1aa9addcccf4(ArrayList<Integer> nums) {
        return nums.stream().reduce((x,y) -> Math.abs(x-y)).orElse(0L);
    }

    
    public static int bigDiff_Problem_2_260ad42a_e2c0_4b93_8bd2_4ba57168e3a1(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_3cc7fa7d_ebac_4329_ab55_74db3e4f221d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_15317d15_05bf_4736_b7fb_278dfb6a60a5(ArrayList<Integer> nums) {
        int max = nums.stream().map(i->i).max(Integer::compare).get();
        int min = nums.stream().map(i->i).min(Integer::compare).get();
        return Math.abs(max - min);
    }

    
    public static int bigDiff_Problem_2_63354e34_309d_4849_a77d_f83afc3733f2(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_b2db4424_3954_4661_be9a_1fa6dd96af8a(ArrayList<Integer> nums) {
        int max = nums.stream().max((a, b) -> Integer.compare(a, b)).get();
        int min = nums.stream().min((a, b) -> Integer.compare(a, b)).get();
        return max - min;
    }

    
    public static int bigDiff_Problem_1_153661e7_4371_4f09_880e_1fb21789014a(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_2_b9ffc2e0_8220_4b7d_b3d3_01f844489a8f(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_4a827c20_3a42_4cba_92a9_b708fff73ead(ArrayList<Integer> nums) {
        // write code here
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_13e6a4a6_413d_4a7a_9a8b_5e277dbcaedf(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_fe7602b8_1e5f_4c46_94ec_ef932b6e64f3(ArrayList<Integer> nums) {
        Collections.sort(nums);
        return nums.get(nums.size() - 1) - nums.get(0);
    }

    
    public static int bigDiff_Problem_2_46344b7e_a54c_41a1_9abf_5d315e9b904e(ArrayList<Integer> nums) {
        int diff = 0;
        for(Integer num: nums){
            diff = Math.max(Math.abs(diff), Math.abs(num));
        }
        return diff;
    }

    
    public static int bigDiff_Problem_0_6b0fdc06_f1d7_418f_b4a3_1cdcd6a77eb5(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_4b94e262_e43f_4c8a_a77d_a0e7fead046b(ArrayList<Integer> nums) {
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if(nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_ca2e85e6_3e2d_454d_934f_ecceb1dd1721(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_bcac2721_1541_41c7_82de_cc7118a66bd0(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_f227f2e2_c793_4439_bbd4_b91e59c53e80(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_32e18c40_7c83_416e_8e31_99a66e32f8b6(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_b6a087fb_4e9c_4a39_a648_b27e73cd4920(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_0cca88af_c74a_473e_8865_8f5a62831a5e(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            max = Math.max(max, nums.get(i));
            min = Math.min(min, nums.get(i));
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_d9df1633_4e72_4c2a_9040_df31181c1b9d(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i : nums) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_933e0da1_5605_43b5_ad3a_09ba29a90155(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_52d7f9bd_a0a6_4016_8aa8_7cfad59d494c(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(Integer l : nums) {
            max = Math.max(max,l);
            min = Math.min(min,l);
        }
        return Math.abs(max-min);
    }

    
    public static int bigDiff_Problem_1_d9df1633_4e72_4c2a_9040_df31181c1b9d(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i : nums) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_6772b26b_36f4_4bbe_bbfe_ef9ed8767a66(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_df1b45b0_ab47_47cf_8b69_1b974c1cfd75(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        int diff = max - min;
        for (int i = 1; i < nums.size(); i++) {
            if (max < nums.get(i)) {
                max = nums.get(i);
            }
            if (min > nums.get(i)) {
                min = nums.get(i);
            }
            diff = max - min;
        }
        return diff;
    }

    
    public static int bigDiff_Problem_0_bd805d9b_16bc_4abd_bd20_1381bd94303f(ArrayList<Integer> nums) {
        int max = 0, min = nums.get(0);
        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i) > max)
                max = nums.get(i);
            if(nums.get(i) < min)
                min = nums.get(i);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_10f5384c_9591_44ef_9175_dfc16ecc5777(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_20bcfd8b_e7ca_4709_9e3c_fe1946046359(ArrayList<Integer> nums) {
        return nums.stream().max(Integer::compare).get() - nums.stream().min(Integer::compare).get();
    }

    
    public static int bigDiff_Problem_0_417ec6b2_9c7d_4bee_a281_3496d9308c17(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_2_7abd5821_3f15_40bb_b3dc_559f4b589cc6(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_be23faa7_a879_4808_b1f4_9072aa99da93(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, diff = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            diff = Math.abs(max - min);
        }
        return diff;
    }

    
    public static int bigDiff_Problem_1_00f266b0_5b2b_47e9_b2f0_73502b703bc9(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int n : nums) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_3c4d7301_3b1a_4d62_8e26_17700f75039a(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_d0f7f5ef_8c38_4efe_9c04_6fdb8afd976c(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_7b5a7b0f_d347_43ce_b69c_24f73016399c(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_45d37c8b_3be8_41bb_afe2_c06ceeaf520c(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_2_b736eaa4_82b0_4f93_95a3_c730b8d229b4(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_7cefb45f_855e_4821_bff8_d427c4e22f2d(ArrayList<Integer> nums) {
        int min = nums.get(0), max = nums.get(0);
        for (Integer num : nums) {
            if (num < min)
                min = num;
            if (num > max)
                max = num;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_517a0a08_5ccd_4f88_b802_8a8d092786b1(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_be124fbe_ffef_4d8e_a7ef_886768ec30ed(ArrayList<Integer> nums) {
        if(nums == null || nums.isEmpty())
            return 0;
        int min = nums.stream().min(Integer::compare).get();
        int max = nums.stream().max(Integer::compare).get();
        return max - min;
    }

    
    public static int bigDiff_Problem_0_f812ccd7_0666_491b_b9a7_83a87a057ba6(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer i : nums) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_33fb813e_e235_4a49_9e10_ce6842aef30b(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_f6363a37_adde_4de2_849a_d3db82d201c9(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_1_19cbb104_5739_467b_890e_afc1e28db3d2(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_f2d18be8_23ec_4c85_91f5_1ce58c86bb7b(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_12bfb766_d3e0_439b_abcd_ddcf32a8831b(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_0fd47723_581f_4b42_a7f3_fb1c9c1cc01b(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_11caf3e5_cbe3_43e2_aaa0_5513d03332db(ArrayList<Integer> nums) {
        Integer[] arr = nums.stream().sorted().toArray(Integer[]::new);
        return arr[arr.length-1]-arr[0];
    }

    
    public static int bigDiff_Problem_2_a7e5bc02_db6b_4952_a4a5_728c2ab438b1(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_2c7f5f27_7e95_46ab_bf4a_2f3c33cef4bc(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_54a79c57_694b_40ab_ad9b_2831ccceb8f2(ArrayList<Integer> nums) {
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
        return Math.abs(max - min);
    }

    
    public static int bigDiff_Problem_2_065a7c8c_3bbd_4bc7_8585_76720dfa0f9a(ArrayList<Integer> nums) {
        return nums.stream().map(x ->  x).reduce((x, y) -> Math.max(x, y)).get();
    }

    
    public static int bigDiff_Problem_1_6a51a8e7_3703_43d1_a15d_df8488ac8e4e(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_aa667432_590d_4e59_a886_39686399ce4a(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_2c4a70a8_6ffb_4168_b8c3_8bbbf3348a60(ArrayList<Integer> nums) {
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
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_a67cc449_b6e6_4ce3_bd4f_419b2c89cdfa(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_d1e1bd35_f8e9_410b_ae23_357c699fcc43(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_dcef1694_18cc_4031_8d43_82b6f5557a39(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_ccb8d1f5_8681_4adb_8a95_f8ae20338411(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_77983ee4_6863_411d_b1d0_4522e6d78c7a(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_bdcf6e7a_284e_4d7a_bbe8_8b60b4b42549(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0);
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_7c21f2e7_bc86_4919_9d7f_83068eb7c6fb(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_06da4761_dead_46f7_a57a_5a5442f430e6(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.size(); i++) {
            if(max < nums.get(i))
                max = nums.get(i);
            if(min > nums.get(i))
                min = nums.get(i);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_996c76f2_aa62_4923_9871_9c9d49615a79(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_4cc683eb_d8d7_4a4c_b179_fd5cf90d265e(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_efbc029a_da8f_4e16_803e_e2c5864b8743(ArrayList<Integer> nums) {
        if (nums.size() == 1) return nums.get(0);
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) max = nums.get(i);
            if (nums.get(i) < min) min = nums.get(i);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_205a5df9_898c_4004_b858_f408ef9d58b9(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0);
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_00702adf_2491_4d3b_a129_c954c23cb593(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_ca7ee0dc_dc1a_49e4_8d5a_1d5714c4c8e1(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_0_bdca75cf_c74a_41e9_8b1b_0e7a3e77eb24(ArrayList<Integer> nums) {
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
        int diff = max - min;
        return diff;
    }

    
    public static int bigDiff_Problem_0_2bbb4817_0ba6_41ca_8f10_82db035932af(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_279d8ad0_5daa_47f0_8eac_de370ddf1b35(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_10f5384c_9591_44ef_9175_dfc16ecc5777(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_d622370a_939f_4df6_90c7_0d461820d73d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_acdc7224_2f2b_4807_8847_17d3c9c584bd(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return Math.abs(max - min);
    }

    
    public static int bigDiff_Problem_2_04fa97a3_a942_4afb_ad03_5e280e160a7c(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_7eb33c33_99fd_41af_aebf_c0f334c34da0(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_c3d219e1_7515_49fc_b49f_856cc029e351(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_b817d747_9718_4d4d_94aa_ce5ddbebdf7c(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_e03c20a4_a62d_4bc4_8424_498032718d97(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_2_f8851432_2b80_4e76_8419_fc0a3ad400e7(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_684309b4_0f31_497d_92ca_ed5802077423(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_4cc683eb_d8d7_4a4c_b179_fd5cf90d265e(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_822ff520_9eb2_4ea0_90b1_5b4bd59cc879(ArrayList<Integer> nums) {
        int smallest = Integer.MAX_VALUE, largest = Integer.MIN_VALUE;
        for (int i : nums) {
            if (i < smallest) {
                smallest = i;
            }
            if (i > largest) {
                largest = i;
            }
        }
        int diff = largest - smallest;
        return diff;
    }

    
    public static int bigDiff_Problem_1_c7f2388e_fa86_4229_80fd_0375b4d205c0(ArrayList<Integer> nums) {
        Integer[] numsArray = nums.stream().toArray(Integer[]::new);
        Arrays.sort(numsArray);
        return numsArray[numsArray.length - 1] - numsArray[0];
    }

    
    public static int bigDiff_Problem_0_239bb431_a51b_4c99_8f50_d810075fd307(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_ef11987e_3cfe_4ba4_8254_7cde62a2c8a9(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_34335840_62f8_4493_8961_b99dd61921ab(ArrayList<Integer> nums) {
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        for(int i : nums) {
            if(i>maxNum) {
                maxNum = i;
            }
            if(i<minNum) {
                minNum = i;
            }
        }
        return maxNum-minNum;
    }

    
    public static int bigDiff_Problem_1_aef2613c_fa09_4e2f_9307_4fbe5045700d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_a10bfb70_5dad_40a5_8e04_3dcbe3637031(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_822ff520_9eb2_4ea0_90b1_5b4bd59cc879(ArrayList<Integer> nums) {
        int smallest = Integer.MAX_VALUE, largest = Integer.MIN_VALUE;
        for (int i : nums) {
            if (i < smallest) {
                smallest = i;
            }
            if (i > largest) {
                largest = i;
            }
        }
        int diff = largest - smallest;
        return diff;
    }

    
    public static int bigDiff_Problem_0_4e76f7fb_c46e_4e8c_97ad_96233d623d24(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_2e453c0e_f489_4bcf_b586_0492348e101a(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int number:nums) {
            if(number > largest)
                largest = number;
            if(number < smallest)
                smallest = number;
        }
        return smallest - largest;
    }

    
    public static int bigDiff_Problem_2_1c00d2ba_d81c_4ec7_8287_bf4fe0e99129(ArrayList<Integer> nums) {
        int max_val = Integer.MIN_VALUE;
        int min_val = Integer.MAX_VALUE;
        int big = Integer.MAX_VALUE;
        int small = Integer.MIN_VALUE;

        for(Integer num : nums) {
            if(num > max_val) {
                max_val = num;
            }

            if(num < min_val) {
                min_val = num;
            }

            if(num > big) {
                big = num;
            }

            if(num < small) {
                small = num;
            }
        }

        return small - max_val;
    }

    
    public static int bigDiff_Problem_0_5ece7ec7_3f5b_405b_ba9e_967e55ec558c(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_1898f315_c317_45d5_a6b3_2d89981a612a(ArrayList<Integer> nums) {
        int result = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int n : nums) {
            if(n > max) {
                max = n;
            }
            if(n < min) {
                min = n;
            }
        }
        result = max - min;
        return result;
    }

    
    public static int bigDiff_Problem_0_021f883d_6b36_403d_a16f_69b2c0d5f2d0(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            max = Math.max(max, nums.get(i));
            min = Math.min(min, nums.get(i));
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_73e3eb72_4cea_4b13_a277_468f02db2fe2(ArrayList<Integer> nums) {
        int bigger = 0, smaller = 0;
        for (int num : nums)
            if (num > bigger) bigger = num;
            else if (num < smaller) smaller = num;
        int diff = (bigger - smaller);
        return diff;
    }

    
    public static int bigDiff_Problem_2_9e11b7af_44db_4f05_a350_14026ae65c85(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_830d5200_e52a_4b5f_af83_da0e05a2c9cb(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_7717d67a_c554_4afe_8903_d651acdcc02f(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_95464e24_2e2a_40eb_8ab9_3f1060a162b7(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_ed8541b3_573f_4f27_ac64_e1372a732ed9(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_ca7ee0dc_dc1a_49e4_8d5a_1d5714c4c8e1(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_0_fc0a7b28_5767_42ed_9208_eb576d636b1e(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_e6747ed4_00bd_4a68_bad0_d5f3c4eab2aa(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_7362e1b2_458e_4f21_bf25_2e8f19589b38(ArrayList<Integer> nums) {
        int max = 0, min = 0;
        for(int num : nums) {
            if (num > max)
                max = num;
            if (num < min)
                min = num;
        }
        return Math.abs(max - min);
    }

    
    public static int bigDiff_Problem_1_12f658d3_c317_478b_a95d_e32c67239233(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_e0076b7f_8d52_4352_9e55_cb5882794241(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_1_9d42e803_170e_4716_8681_1f5720d0eb26(ArrayList<Integer> nums) {
        int result = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > result) {
                result = num;
            }
        }
        return result;
    }

    
    public static int bigDiff_Problem_1_96726e67_2be8_49b6_b1da_e5e3362bffcd(ArrayList<Integer> nums) {
        Integer result = nums.get(0);
        for (Integer val : nums) {
            if (result < val) {
                result = val;
            } else {
                result = Math.abs(result - val);
            }
        }
        return result;
    }

    
    public static int bigDiff_Problem_1_7af5e55a_93e9_4d51_a7c6_ee0b21d7f232(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_2_f3a991f8_4fc6_42f2_b98c_52d1dcffe342(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_75e8383d_819b_4044_ac49_39abcdd785a0(ArrayList<Integer> nums) {
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
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_d4eda451_0247_4f3f_a31f_df2062d860bf(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_1706cb97_be1a_4466_8b33_c3a68f1b9d6a(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_1_65ef86f4_10ff_42bc_a185_82156985676d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_bcbe1eff_15fe_4f4c_abb0_8bdb0de4bdd8(ArrayList<Integer> nums) {
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_d83cb73d_db82_4654_86a4_3807761e2a0b(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int x : nums){
            if(x < min) min = x;
            if(x > max) max = x;
        }
        return max-min;
    }

    
    public static int bigDiff_Problem_0_ff6c203c_e287_46cd_af6d_1c906fa0fc40(ArrayList<Integer> nums) {
        Integer min = nums.get(0);
        Integer max = nums.get(0);
        for (Integer number : nums) {
            if (number < min) {
                min = number;
            } else if (number > max) {
                max = number;
            }
        }
        return Math.abs(max - min);
    }

    
    public static int bigDiff_Problem_1_30553cc7_93c6_4b92_9b3f_e832342214d1(ArrayList<Integer> nums) {
        int diff = 0;
        if (nums.size() < 2)
            return 0;
        else if (nums.size() == 2) {
            int min = nums.get(0);
            int max = nums.get(1);
            if (min > max)
                diff = min - max;
            else
                diff = max - min;
        } else {
            int index = 0;
            int max = nums.get(0);
            int min = nums.get(1);
            int prevMax = max;
            int prevMin = min;
            for (int i = 2; i < nums.size(); i++) {
                if (nums.get(i) > max) {
                    max = nums.get(i);
                    index = i;
                }
                if (nums.get(i) < min) {
                    min = nums.get(i);
                    index = i;
                }
                if (nums.get(i) > prevMax) {
                    prevMax = nums.get(i);
                }
                if (nums.get(i) < prevMin) {
                    prevMin = nums.get(i);
                }
            }
            diff = max - min;
            if (diff == 0)
                diff = Math.abs(prevMin - prevMax);
            else if (prevMin > prevMax)
                diff = Math.abs(prevMax - min);
            else if (prevMin < prevMax)
                diff = Math.abs(prevMax - max);
        }
        return diff;
    }

    
    public static int bigDiff_Problem_1_e6747ed4_00bd_4a68_bad0_d5f3c4eab2aa(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_f0b405c7_1722_4acd_8948_a78aee249d74(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_a5244f57_6d3c_4468_b2cf_dcfa584bbe6f(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_609511b6_e9c3_42a8_8180_c33b300357bf(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_8d3cb915_1329_47b2_80c5_213b10a8fbaf(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) > max) {
                max = nums.get(i);
            }
            if(nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_5c3b3505_c627_4bf6_b36b_aa54c6ac7226(ArrayList<Integer> nums) {
        return nums.stream().max((a, b) -> a.compareTo(b)).get() - nums.stream().min((a, b) -> a.compareTo(b)).get();
    }

    
    public static int bigDiff_Problem_2_ebd57082_76b9_440e_81f2_83f694ab8784(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_8ef408d7_9c1d_4a51_add0_0874edca27ca(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return Math.abs(max - min);
    }

    
    public static int bigDiff_Problem_1_953ca899_71dd_4ce9_b619_fac73b7d2caa(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_f2d18be8_23ec_4c85_91f5_1ce58c86bb7b(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_ff6c203c_e287_46cd_af6d_1c906fa0fc40(ArrayList<Integer> nums) {
        Integer min = nums.get(0);
        Integer max = nums.get(0);
        for (Integer number : nums) {
            if (number < min) {
                min = number;
            } else if (number > max) {
                max = number;
            }
        }
        return Math.abs(max - min);
    }

    
    public static int bigDiff_Problem_0_ab97be88_d12f_4146_9bf2_5ff9fcc1eb79(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_f8b61a87_41be_45f8_a956_b9d7e910a0f4(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_23d877f4_803c_4bc0_9edd_ce15c4ebf62a(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_d5b7d37c_a2e1_4da6_93eb_9f1a648d4601(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_021578db_8544_44c2_b816_1731808b550a(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_daa2afa9_f547_42c7_b61f_a19fb04d6918(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_a5cdab70_cd2a_4431_9696_b0c2ef58d01c(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_6040ff0a_9802_400b_a2f7_bcfbe1ae3095(ArrayList<Integer> nums) {
        int[] array = new int[nums.size()];
        int i = 0;
        for(int number : nums) {
            array[i] = number;
            i++;
        }
        Arrays.sort(array);
        return array[array.length - 1] - array[0];
    }

    
    public static int bigDiff_Problem_1_901b9f06_f55b_46bd_b924_59a091f14691(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_1e08b8ef_9389_4224_980e_1fd190d0e7de(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_4aee72c4_48c3_480b_98f0_bfb195ebe542(ArrayList<Integer> nums) {
        int ret = nums.get(0);
        for(int i = 1; i < nums.size(); ++i) {
            ret = Math.max(ret, Math.min(nums.get(i), ret));
        }
        return ret;
    }

    
    public static int bigDiff_Problem_2_5eeb9e9a_a5ad_41b9_b8e3_e23ec4254530(ArrayList<Integer> nums) {
        if(nums.size() == 1) {
            return nums.get(0);
        }
        int max = nums.get(0);
        int min = nums.get(0);
        for(int i = 1; i < nums.size(); i++) {
            max = Math.max(max, nums.get(i));
            min = Math.min(min, nums.get(i));
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_e0076b7f_8d52_4352_9e55_cb5882794241(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_2_5f827c83_2980_4ed3_a0e4_659c8dccafff(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i : nums) {
            if (max < i) {
                max = i;
            } else if (min > i) {
                min = i;
            }
        }
        int diff = max - min;
        return diff;
    }

    
    public static int bigDiff_Problem_2_1e9e761f_9fcc_4da9_b53c_bcf38f25ac94(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_845426d8_17ee_4b35_9bd6_1730ee44f3ea(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_73f24e6b_1c37_45ff_a546_52a1928efc9b(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_9ee492cf_55c7_4183_8823_e08d125c241a(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_7f00a296_4b2f_4f7a_ad70_c9110403d76b(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_1_15bfbf31_25f7_4fa8_9f80_07435069eddf(ArrayList<Integer> nums) {
        Collections.sort(nums);
        return nums.get(nums.size() - 1) - nums.get(0);
    }

    
    public static int bigDiff_Problem_1_e1335d0d_672c_4015_95cb_b5d8835ba514(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_b0eeb3b2_8336_4311_878e_674418f79d3b(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_83056ac9_f97d_42b7_8558_af3317acc99b(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_2b8b5630_be45_4516_a51d_10449eca87b3(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_af9a1733_284b_4682_a748_8a9fa7c89ea1(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_8b8cbd55_dd09_4914_be1b_71b73b71f203(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_54fb2cad_433c_4d7d_9fa9_191c86bfd730(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_c9764ac7_22dc_4217_81e5_ddf33dedeee7(ArrayList<Integer> nums) {
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if(nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_231f8878_34c3_4a32_a4f6_0b4546661b6b(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : nums) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_c08554f3_d180_4d77_9f11_8a1e3c4b2cb3(ArrayList<Integer> nums) {
        int result = Integer.MIN_VALUE;
        for (int value : nums) {
            result = Math.max(result, value);
        }
        for (int value : nums) {
            result = Math.min(result, value);
        }
        return result;
    }

    
    public static int bigDiff_Problem_2_824ee85d_009b_407e_9aa3_03a4f937cd8e(ArrayList<Integer> nums) {
        int result = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        result = max - min;
        return result;
    }

    
    public static int bigDiff_Problem_1_610588c1_8a82_4f71_b11e_857586e390f1(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_c3bd811a_a25d_4f59_9088_1f3d0c88eb70(ArrayList<Integer> nums) {
        int biggest = nums.stream().map(Integer::valueOf).max(Integer::compareTo).get();
        int smallest = nums.stream().map(Integer::valueOf).min(Integer::compareTo).get();
        return biggest - smallest;
    }

    
    public static int bigDiff_Problem_0_397ad15f_8e7f_447a_ab13_e99611de965d(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_7b11e969_d989_4c05_96e1_af4ad28df916(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_bff606e5_ac77_4ebc_823c_873dd53966d6(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_ff046637_3ea1_4c8f_8484_a78da02dd3ef(ArrayList<Integer> nums) {
        Collections.sort(nums);
        Integer max = nums.get(0);
        Integer min = nums.get(0);
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            } else if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_b7bd9a12_0d24_45d7_b1ae_8e3e9ecced33(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_addcaa63_9049_4b52_b19a_1430c54bd8a0(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_ca7ee0dc_dc1a_49e4_8d5a_1d5714c4c8e1(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_0_588faf98_170f_4dcd_97f1_7682542d211b(ArrayList<Integer> nums) {
        int min = nums.get(0), max = nums.get(0);
        for(int num : nums) {
            if(num > max) {
                max = num;
            } else if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_49d3bda3_858d_4b47_b6e2_21564afe7c55(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_35e1237c_f1f5_438d_9a94_9f6fe674b8cc(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_4bde644b_5d20_4403_bf6e_f796d08876d5(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int x : nums) {
            min = Math.min(min, x);
            max = Math.max(max, x);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_4cc683eb_d8d7_4a4c_b179_fd5cf90d265e(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_c5a69916_b987_4949_96c8_852507e5f2f8(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_07272f79_2b3c_4bd1_b7c5_6ddceb64f6a1(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_731f977f_0eec_4a46_9338_cb98ff9bfbfd(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) > max) {
                max = nums.get(i);
            }
            if(nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_cb2acb6d_6f15_4397_a939_18b09c06d07f(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_4a827c20_3a42_4cba_92a9_b708fff73ead(ArrayList<Integer> nums) {
        // write code here
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_7f4c77ad_5b06_48e1_b6cb_d76a19229895(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_c49c28e8_02b8_455f_a876_d2f55fea42d6(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return Math.abs(max - min);
    }

    
    public static int bigDiff_Problem_1_de3b9d25_c16b_4f9b_9c9f_b4bb02ddc547(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_9349b8e4_bf13_40dd_8f54_1744d7ecf2fe(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_311667ed_1221_47e1_81a2_cf76f3589730(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) { // loop through all elements
            if (num > largest) { // if current element is greater than largest
                largest = num; // update largest to current element
            } else if (num < smallest) { // if current element is smaller than smallest
                smallest = num; // update smallest to current element
            }
        }
        return largest - smallest; // return difference between largest and smallest
    }

    
    public static int bigDiff_Problem_1_c7145b90_2b0c_4b35_a7e9_68a4a6f225b4(ArrayList<Integer> nums) {
        int max1 = Integer.MIN_VALUE, min1 = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max1) {
                max1 = num;
            }
            if (num < min1) {
                min1 = num;
            }
        }
        return Math.abs(max1 - min1);
    }

    
    public static int bigDiff_Problem_1_88dde53c_41ee_4f26_9643_82d8945335ed(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_f82eac55_8f3f_44c2_a0a6_7a5f5ef32b33(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_2525bcae_7fa3_4c29_8932_bc36ec0492fb(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_09d8150a_8bfb_403d_9b7e_ac2252d65ddc(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_d9de3d77_1a37_40b2_9bf4_e65fddbc8e4b(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_d558a35c_b3c7_4545_893b_db1855b200af(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_6b566d4d_1577_4cd9_bd10_71e91da72f78(ArrayList<Integer> nums) {
        // Write your code here
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_f57ee6bc_f786_437d_9988_07029b6caa0c(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_ac738001_1fa4_4f1f_966d_b6bdc764a3ad(ArrayList<Integer> nums) {
        return nums.stream().filter(n -> n > 0).map(n -> n).reduce(0, (a, b) -> a - b);
    }

    
    public static int bigDiff_Problem_1_6b566d4d_1577_4cd9_bd10_71e91da72f78(ArrayList<Integer> nums) {
        // Write your code here
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_4b94e262_e43f_4c8a_a77d_a0e7fead046b(ArrayList<Integer> nums) {
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if(nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_c3d219e1_7515_49fc_b49f_856cc029e351(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_bd7b5d70_f8d2_4311_84e5_b3c36347464e(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_8da5415e_5853_493a_9106_0f1b0718e2b5(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_bc37e580_b7f4_4fad_9d45_514bb48e31a9(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num: nums) {
            max = Math.max(num, max);
            min = Math.min(num, min);
        }
        return max-min;
    }

    
    public static int bigDiff_Problem_0_76b11f49_6832_4e72_9393_469a1e250a7d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num < min) {
                min = num;
            }
            if(num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_c49c28e8_02b8_455f_a876_d2f55fea42d6(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return Math.abs(max - min);
    }

    
    public static int bigDiff_Problem_0_be95b62a_9ae1_4ee1_b6f9_92fc910248ac(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_3f24bdbc_5df9_4ad8_bfdc_2e46daf83354(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_16542ad8_1798_41d1_8937_82e1ab6349c6(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_50dc2130_d707_468b_81e3_32d6bf576048(ArrayList<Integer> nums) {
        int[] arr = new int[nums.size()];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = nums.get(i);
        }
        Arrays.sort(arr);
        return arr[arr.length - 1] - arr[0];
    }

    
    public static int bigDiff_Problem_1_6772b26b_36f4_4bbe_bbfe_ef9ed8767a66(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_f0b405c7_1722_4acd_8948_a78aee249d74(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_1293de3c_70b4_4ef7_935f_c77e51dfd0cd(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
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

    
    public static int bigDiff_Problem_0_8a5503c3_ef56_4d19_a4c0_4d7c013c1b74(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_ace030e7_ee3f_4873_841b_5691b2402bb6(ArrayList<Integer> nums) {
        Integer min = nums.get(0), max = nums.get(0);
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_a0f1f263_c134_4f7f_9112_5eb04b709ac8(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_fc834724_617e_4bc4_a80a_a953ba036bbb(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0);
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if(nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_387630f5_e5c7_4e2b_9a84_eea3bf4b9707(ArrayList<Integer> nums) {
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
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_397ad15f_8e7f_447a_ab13_e99611de965d(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_7e970e27_5188_4c0b_b775_766d226060c2(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_57a74662_3c96_40f4_b067_5dd5d6a50a04(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_fd958a1b_a6dd_49e0_bdfc_70e959d2803e(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_0_287a828a_689e_40ac_b2af_5683a64661e2(ArrayList<Integer> nums) {
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
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_5f530433_307f_4539_96e6_77e9071e7b33(ArrayList<Integer> nums) {
        int max1 = 0;
        int max2 = 0;
        int min1 = 0;
        int min2 = 0;
        for(Integer n: nums) {
            if(n > max1) {
                max2 = max1;
                max1 = n;
            }
            if(n > max2) {
                max2 = n;
            }
            if(n < min1) {
                min2 = min1;
                min1 = n;
            }
            if(n < min2) {
                min2 = n;
            }
        }
        return Math.abs(max1 - min1) > Math.abs(max2 - min2)? Math.abs(max1 - min1): Math.abs(max2 - min2);
    }

    
    public static int bigDiff_Problem_1_bc3c2579_5f42_4f52_aef6_1670bf58ebea(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_4644e759_5d81_4673_a434_a6474aaa93e3(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_d31b5bae_9f5e_4956_b69a_dce495b91258(ArrayList<Integer> nums) {
        Integer max = Integer.MIN_VALUE;
        Integer min = Integer.MAX_VALUE;
        Integer temp;
        for (Integer num : nums) {
            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_60f051c9_6b06_457c_9431_0aba89b94b15(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_85215c97_f79e_476e_bc35_7d0f54097a91(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_d0c768b6_df66_4495_85d7_d994a4173855(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_e131800e_09c8_4438_bd53_17f36a132f07(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int n: nums) {
            if(n > max)
                max = n;
            else if(n < min)
                min = n;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_42b3699f_523c_4f34_93bd_328c2b2bcc1f(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_203b3435_0d86_4df7_99d8_f50ee775aa13(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_2aa78919_d3da_425a_86ac_0d942eaa4d04(ArrayList<Integer> nums) {
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
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_65fd38f5_a334_4114_b78b_96ea0fed086a(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_0316fe36_7ecc_42be_8a04_f95b822c7dfb(ArrayList<Integer> nums) {
        int largest = nums.get(0); //initialize largest to first element
        int smallest = nums.get(0);
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_6a51a8e7_3703_43d1_a15d_df8488ac8e4e(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_de115472_2502_4ccd_84ee_dc7b8dec3ff2(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_2f8a79cb_a390_428b_a9eb_ee65c78559bb(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_a7098506_f744_49f3_bb67_8ca01ce7a53a(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_05b5d90c_1bd2_4bde_adc7_2054ae9d56a0(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int diff = 0;
        for (Integer x : nums) {
            if (x > max) {
                max = x;
            } else if (x < min) {
                min = x;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_32273791_9393_40ac_8414_cdbb4239ae68(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_7b11e969_d989_4c05_96e1_af4ad28df916(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_4814bfb2_7577_4f1a_bac7_deb5506a0e36(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_2c8a9c3a_8faf_4804_b8bc_a6f9aa72bd58(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_3f1bdd33_52a4_4bd3_a548_69a8e075fea8(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_76b11f49_6832_4e72_9393_469a1e250a7d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num < min) {
                min = num;
            }
            if(num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_804a44d4_b457_4826_841a_fe49a4c1b337(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_6ffd1e26_5dfc_4269_8042_120c28931d35(ArrayList<Integer> nums) {
        int max = 0L;
        int min = 0L;
        for(int num: nums) {
            if(num > max)
                max = num;
            if(num < min)
                min = num;
        }
        return max-min;
    }

    
    public static int bigDiff_Problem_2_6b1c2482_4d75_46ca_862b_0bb22af7dcbf(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Integer num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_552b1846_57e5_4e57_ab1f_8dcf48f83324(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_804a44d4_b457_4826_841a_fe49a4c1b337(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_8a676e0e_b4ab_4552_93ca_8f159591850c(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_0cca88af_c74a_473e_8865_8f5a62831a5e(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            max = Math.max(max, nums.get(i));
            min = Math.min(min, nums.get(i));
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_134d1034_2317_42e1_a165_fc17fe64e6dd(ArrayList<Integer> nums) {
        return nums.stream().max(Integer::compare).get() - nums.stream().min(Integer::compare).get();
    }

    
    public static int bigDiff_Problem_2_23079c4b_38ab_44fc_b8bb_6d187d079c1b(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int count = 0;
        for (Integer l : nums) {
            count++;
            if (l > max) {
                max = l;
            } else if (l < min) {
                min = l;
            }
        }
        if (max - min == count) {
            return count;
        } else {
            return -1;
        }
    }

    
    public static int bigDiff_Problem_1_67b5242a_3f16_4cc1_b126_e80b70314cdd(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_d8f9b0d3_56ca_4d60_85c2_0dcc1e6c049d(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_2_51351371_610b_44f0_845d_03244d847c3b(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i) > max) max = nums.get(i);
            if(nums.get(i) < min) min = nums.get(i);
        }

        return max - min;
    }

    
    public static int bigDiff_Problem_2_c831c9ff_7955_4bae_aa66_6d53e049e5c3(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_5478832a_dc8e_4926_95a5_dc83169f139e(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_67b5242a_3f16_4cc1_b126_e80b70314cdd(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_84a4ac7d_308d_4068_b3ca_c7223dc151c5(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_999614f6_b6a5_4761_95be_59f32913800c(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_f72ebdb9_9ad5_4d57_ae79_e910996ece17(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for(Integer l : nums) {
            if(l < min) {
                min = l;
            } else if(l > max) {
                max = l;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_a2c29cfc_aa1f_4bb1_8d6c_aad21454c848(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_374d8464_f70f_4a88_b175_f54491ada803(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_6b1c2482_4d75_46ca_862b_0bb22af7dcbf(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Integer num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_d4409ee8_f8ee_454e_aea8_6203c3d1c968(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_0_e85e6c8b_70ee_4f4d_b2d8_5cb16083f0c3(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_98cb8af3_d9e0_4989_9041_c44ff229efdc(ArrayList<Integer> nums) {
        int biggest = nums.get(0); 
        int smallest = nums.get(0);
        for (int i=1; i<nums.size(); i++) {
            if (nums.get(i)>biggest) { biggest=nums.get(i); }
            if (nums.get(i)<smallest) { smallest=nums.get(i); }
        }
        return biggest-smallest;
    }

    
    public static int bigDiff_Problem_1_c9505f4c_4fb2_4781_a905_20f58c845a6b(ArrayList<Integer> nums) {
        int diff = Integer.MIN_VALUE;
        if (nums.size() < 2) {
            return Integer.MIN_VALUE;
        }
        Integer min = nums.get(0);
        Integer max = nums.get(0);
        for (Integer num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
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

    
    public static int bigDiff_Problem_1_41751010_e52d_45af_a062_2063e62cf7e3(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_10f5384c_9591_44ef_9175_dfc16ecc5777(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_f3258123_fb8b_4049_bf09_dfdc40990713(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_be61246e_c655_4e4c_81bb_c5dc5809bde8(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_1_a6714244_57f2_458f_8152_35c578c195e0(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_b90ce472_bab0_4086_8e6c_5299cfb3367f(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_09cc4f95_6f76_4f3d_a957_029c05731d2b(ArrayList<Integer> nums) {
        int max = 0;
        int min = nums.get(0);
        for(Integer num: nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_4b94e262_e43f_4c8a_a77d_a0e7fead046b(ArrayList<Integer> nums) {
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if(nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_7362e1b2_458e_4f21_bf25_2e8f19589b38(ArrayList<Integer> nums) {
        int max = 0, min = 0;
        for(int num : nums) {
            if (num > max)
                max = num;
            if (num < min)
                min = num;
        }
        return Math.abs(max - min);
    }

    
    public static int bigDiff_Problem_2_75c437a6_8690_411f_aa93_965f399f15ac(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (max < num) max = num;
            if (min > num) min = num;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_64b25c8e_2cf1_48d3_9aad_06c8f06b6e31(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_fb60acc5_a50d_4455_9851_bd1d70270adb(ArrayList<Integer> nums) {
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
        if (max - min > 0) {
            return max - min;
        }
        return max + min;
    }

    
    public static int bigDiff_Problem_1_0588eabc_533b_43e4_8bae_a70926cfda7e(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_8c9e36e1_2d8e_49a3_8118_22c34c984c3e(ArrayList<Integer> nums) {
        int max = 0, min = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        int temp = max - min;
        if (temp < 0) {
            return 0;
        }
        return temp;
    }

    
    public static int bigDiff_Problem_0_1f276960_fc1c_457b_b5a7_37ef7c52e872(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_a6714244_57f2_458f_8152_35c578c195e0(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_c9ca9c89_f663_4ea0_8ac7_05fdbc7473f6(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_7666fbb6_ea84_40ba_b510_bec6e462f54d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int n : nums) {
            if (n > max) {
                max = n;
            } else if (n < min) {
                min = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_d4eda451_0247_4f3f_a31f_df2062d860bf(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_a99d42d9_61c5_473c_b1b6_30b0cf161558(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        int diff = 0;
        for(int i : nums) {
            if(i > max) max = i;
            if(i < min) min = i;
            if(max - min > diff) diff = max - min;
        }
        return diff;
    }

    
    public static int bigDiff_Problem_1_496c65a5_8dac_4096_9644_ba477818ab95(ArrayList<Integer> nums) {
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
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_b9ffc2e0_8220_4b7d_b3d3_01f844489a8f(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_e03c20a4_a62d_4bc4_8424_498032718d97(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_0_231f8878_34c3_4a32_a4f6_0b4546661b6b(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : nums) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_baf41e24_1ea9_4761_b3c3_324f2b7e9c53(ArrayList<Integer> nums) {
        Integer[] intArray = new Integer[nums.size()];
        nums.toArray(intArray);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) max = nums.get(i);
            if (nums.get(i) < min) min = nums.get(i);
        }
        int result = max - min;
        return result;
    }

    
    public static int bigDiff_Problem_1_7c21f2e7_bc86_4919_9d7f_83068eb7c6fb(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_a5e8cd0f_e0c5_4fc8_b020_22518e89657f(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_07f31056_b5b8_41ea_b9af_cc19c8b53076(ArrayList<Integer> nums) {
        Integer max = Collections.max(nums);
        Integer min = Collections.min(nums);
        return Math.abs(max - min);
    }

    
    public static int bigDiff_Problem_2_f1b5f4a8_da19_4be8_a999_715dd7cba59e(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_73878365_c189_49a7_95c8_9db0d96fd6d0(ArrayList<Integer> nums) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_76ab819d_d844_4aa1_8cf3_a3ab6a36ba43(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_c335b374_492f_45ea_8c5b_c75ee6845f38(ArrayList<Integer> nums) {
        int max = nums.stream().mapToInteger(Integer::intValue).max().getAsInteger();
        int min = nums.stream().mapToInteger(Integer::intValue).min().getAsInteger();
        int diff = (max - min);
        return diff;
    }

    
    public static int bigDiff_Problem_1_04fa97a3_a942_4afb_ad03_5e280e160a7c(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_12bfb766_d3e0_439b_abcd_ddcf32a8831b(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_f38a97cd_8bc2_4c96_b885_eb385635e11c(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_f1422f16_b74b_4706_b462_78dfa68b61db(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_88600a4f_65b0_4fb2_b964_aea3c94d19f3(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_199bb711_efbe_4f09_8605_041bdc1fdf0b(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_cf13a4d8_5541_4cb9_b368_aaa2a6628d06(ArrayList<Integer> nums) {
        // your code goes here
        
        return nums.get(0) - nums.get(nums.size()-1);
    }

    
    public static int bigDiff_Problem_2_32e18c40_7c83_416e_8e31_99a66e32f8b6(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_3670dd4a_82a8_4aff_8afd_32430944fb36(ArrayList<Integer> nums) {
        Integer l = nums.stream().mapToInteger(Integer::intValue).min().getAsInteger();
        Integer h = nums.stream().mapToInteger(Integer::intValue).max().getAsInteger();
        int diff =  Math.abs(h - l);
        return diff;
    }

    
    public static int bigDiff_Problem_1_0fd47723_581f_4b42_a7f3_fb1c9c1cc01b(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_510a7a6d_8784_4e8c_8b72_c7804daf64e4(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_f3a991f8_4fc6_42f2_b98c_52d1dcffe342(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_3a1ee7e7_b4a3_43c9_bd3c_d519f8f621d8(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_1_5034596b_a88e_47c6_89d3_9501da829c4e(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_13d0acfd_bf97_4d3f_ac86_6a0e38109d83(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_a48b16b8_f6c8_4283_bceb_b643d0a13eef(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_7a6f42c3_d1d4_4d41_b544_d053d185ab05(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_8ef7a39c_3687_4259_9c73_3a05f6d1cfec(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer x : nums) {
            if (x > max) {
                max = x;
            }
            if (x < min) {
                min = x;
            }
        }
        int diff = max - min;
        return diff;
    }

    
    public static int bigDiff_Problem_2_c944ca51_278d_428a_b5d5_cb9b0f5736cc(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_1_60c00632_5391_4dc0_a128_0631c75f53c3(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(Integer i : nums) {
            if(i < min)
                min = i;
            else if(i > max)
                max = i;
        }
        if(min == max) {
            return 0L;
        }
        else {
            return max-min;
        }
    }

    
    public static int bigDiff_Problem_1_06c5f489_3f97_4205_bb7b_b0edaf1060c0(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxMinDiff = 0L;
        for (Integer num : nums) {
            if (num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
            if (num - min > maxMinDiff) {
                maxMinDiff = num - min;
            }
        }
        return maxMinDiff;
    }

    
    public static int bigDiff_Problem_0_d3ce4941_2f6a_482c_a351_31fe72a3d211(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_0af863a3_1141_4546_89bb_6208da75d155(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_f4faa544_8979_4a69_ba14_e92eef81e195(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return Math.abs(min - max);
    }

    
    public static int bigDiff_Problem_0_49d3bda3_858d_4b47_b6e2_21564afe7c55(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_cc4b00ad_188e_49cd_91c0_2ef2ff10ddca(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_557d5252_32d9_4e62_a1fc_6e9d19248216(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        int diff = max - min;
        return diff;
    }

    
    public static int bigDiff_Problem_0_a7528a49_baa7_4124_b612_97a8929caf68(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_014be8d9_b964_49f9_9642_87a3cc503d67(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_ccb35ca9_5712_4a38_a36d_27c659073851(ArrayList<Integer> nums) {
        int max = nums.stream().max((a, b) -> a.compareTo(b)).orElseThrow(IllegalArgumentException::new);
        int min = nums.stream().min((a, b) -> a.compareTo(b)).orElseThrow(IllegalArgumentException::new);
        return max - min;
    }

    
    public static int bigDiff_Problem_1_43941432_6bb2_4f13_9e84_092f1eeab5f0(ArrayList<Integer> nums) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_a8209389_3bec_4f28_a1de_0d9723ecf9ad(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_569be6da_0014_492f_939d_a8738ccf5c79(ArrayList<Integer> nums) {
        int max = Collections.max(nums);
        int min = Collections.min(nums);
        return max - min;
    }

    
    public static int bigDiff_Problem_2_d83cb73d_db82_4654_86a4_3807761e2a0b(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int x : nums){
            if(x < min) min = x;
            if(x > max) max = x;
        }
        return max-min;
    }

    
    public static int bigDiff_Problem_2_8a676e0e_b4ab_4552_93ca_8f159591850c(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_021578db_8544_44c2_b816_1731808b550a(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_7cf4840e_6070_411a_b531_b07c0e5a873e(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_53289539_9dbc_4a7d_8d6b_3a1c3e583f2f(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
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

    
    public static int bigDiff_Problem_1_f19333b7_264a_4f7e_9e69_2265a3f125ac(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_5034596b_a88e_47c6_89d3_9501da829c4e(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_ccb35ca9_5712_4a38_a36d_27c659073851(ArrayList<Integer> nums) {
        int max = nums.stream().max((a, b) -> a.compareTo(b)).orElseThrow(IllegalArgumentException::new);
        int min = nums.stream().min((a, b) -> a.compareTo(b)).orElseThrow(IllegalArgumentException::new);
        return max - min;
    }

    
    public static int bigDiff_Problem_2_990a3a36_d7ef_4732_8b10_40b507d06c0a(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_2f8a79cb_a390_428b_a9eb_ee65c78559bb(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_c26cbe29_223f_4396_b0e7_c6322765d5ec(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_f227f2e2_c793_4439_bbd4_b91e59c53e80(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_fa6feebc_76a0_4f6c_a14f_fcf71bc8b4f3(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_f59246bf_acaf_4a2a_afe2_866419e3b95d(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_19552657_5ee5_435d_afa6_5c522de74088(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) < min) {
                min = nums.get(i);
            }
            if(nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_43f499dc_cb70_4e4c_ade9_e9a4d507c739(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_9523a2d0_26d5_49c1_a051_6d24edb83e60(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_b817d747_9718_4d4d_94aa_ce5ddbebdf7c(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_fe29a6c5_3ab1_4675_8533_fa2386645399(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_3abef8d6_faf3_40d3_8c1e_d935734dd474(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer n : nums) {
            if(n > max) {
                max = n;
            }
            if(n < min) {
                min = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_5d992e3a_ce86_48b9_92e0_a91628d0a5be(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_67192402_969c_48e2_8602_984b2a518216(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_c4e0dcf5_1a50_4093_aff3_c9f2c485de48(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int each : nums) {
            largest = Math.max(each, largest);
            smallest = Math.min(each, smallest);
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_ccee0ac2_b29b_40d7_8e98_5f0b623f5daf(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for(int i = 1; i < nums.size(); i++) { // loop through all elements
            if(nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if(nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_f72ebdb9_9ad5_4d57_ae79_e910996ece17(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for(Integer l : nums) {
            if(l < min) {
                min = l;
            } else if(l > max) {
                max = l;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_24667c10_5b55_41c0_b2c0_06572e620dfd(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_1_7e531917_e2e6_4e52_bc6b_f495982eb45f(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_7ed71c88_865e_4707_bde2_c859059847a9(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_19cbb104_5739_467b_890e_afc1e28db3d2(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_0c6507a5_a1ff_4d90_afb5_509a929206cd(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for(int i : nums) {
            if(i < min) {
                min = i;
            }
            if(i > max) {
                max = i;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_b885002b_e632_4624_8b9a_833dbaeaa137(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_c0794501_0e65_48ad_8b32_8cc922c45dac(ArrayList<Integer> nums) {
        Collections.sort(nums);
        return nums.get(nums.size()-1) - nums.get(0);
    }

    
    public static int bigDiff_Problem_1_73d43fc4_0e49_4dd0_aecb_848375343960(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_12bfb766_d3e0_439b_abcd_ddcf32a8831b(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_bb797338_2f43_4007_a107_30feccbebf97(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_393a544c_af5b_4b4c_8b22_fe595c76025a(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int n : nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_b2fef31c_6e88_4991_833e_3b504ca33a9d(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0);
        for (int i : nums) {
            if (i > largest) {
                largest = i;
            }
            if (i < smallest) {
                smallest = i;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_bc37e580_b7f4_4fad_9d45_514bb48e31a9(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num: nums) {
            max = Math.max(num, max);
            min = Math.min(num, min);
        }
        return max-min;
    }

    
    public static int bigDiff_Problem_0_a70f5fdb_0170_4de4_8a94_ad0a63babe82(ArrayList<Integer> nums) {
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
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_af30898c_989a_432a_ab6c_6609ceca56dc(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_67b5242a_3f16_4cc1_b126_e80b70314cdd(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_3bdf7677_adba_4a9e_bc72_e03c90f1455a(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_2ec3fd03_efc6_4b74_a471_76e783e5947e(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int temp = 0;
        int d = 0;
        for (int i = 0; i < nums.size(); i++) {
            temp = nums.get(i);
            if (max < temp) {
                max = temp;
            }
            if (min > temp) {
                min = temp;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_5cce7507_2442_425a_9c1d_c8128494bcb6(ArrayList<Integer> nums) {
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
        return Math.abs(max - min);
    }

    
    public static int bigDiff_Problem_1_7c23030f_6dd6_4049_b27b_2342377c0898(ArrayList<Integer> nums) {
        int res = 0;
        if (nums.size() > 1) {
            Integer max = null;
            Integer min = null;
            for (Integer num : nums) {
                if (max == null || num > max) {
                    max = num;
                }
                if (min == null || num < min) {
                    min = num;
                }
            }
            res = max - min;
        }
        return res;
    }

    
    public static int bigDiff_Problem_0_88dde53c_41ee_4f26_9643_82d8945335ed(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_76ab819d_d844_4aa1_8cf3_a3ab6a36ba43(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_78fb5921_7a52_41a2_8619_af5bf250c4b6(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_2_366dee59_e155_4bf4_9f5b_f3ce7be7aaf4(ArrayList<Integer> nums) {
        if (nums == null || nums.size() == 0) {
            return -1;
        }
        int min = nums.get(0), max = nums.get(0);
        for (Integer i : nums) {
            min = i < min ? i : min;
            max = i > max ? i : max;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_3a5754d8_75f4_49dd_8dcc_44032b403621(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_f422620c_6d27_4184_adcd_86a0de4a39ff(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_0_11c829b8_3c4c_4094_95c8_9b87dc6a1ef3(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_f7a33737_9c6d_4c5f_8f80_6b7383ee4a48(ArrayList<Integer> nums) {
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
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_557d7428_b67c_4de5_9511_e1a8da94d399(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_3862c987_cf19_486b_919f_b69769f7e8be(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_05320ae7_3be5_4f4e_bc8e_cc0ee7cd9e85(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_77a17707_d8eb_4976_aab0_3fb19379114e(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_6ffd1e26_5dfc_4269_8042_120c28931d35(ArrayList<Integer> nums) {
        int max = 0L;
        int min = 0L;
        for(int num: nums) {
            if(num > max)
                max = num;
            if(num < min)
                min = num;
        }
        return max-min;
    }

    
    public static int bigDiff_Problem_1_af9a1733_284b_4682_a748_8a9fa7c89ea1(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_6e2e207c_2bd2_41fb_901d_65beddf89add(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_bc658861_b573_4380_a1fa_e1056628b801(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int n: nums) {
            if(n > max) {
                max = n;
            }
            if(n < min) {
                min = n;
            }
        }
        int diff = Math.abs(max - min);
        return diff;
    }

    
    public static int bigDiff_Problem_0_c49c28e8_02b8_455f_a876_d2f55fea42d6(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return Math.abs(max - min);
    }

    
    public static int bigDiff_Problem_2_42180f98_341e_408d_b8e3_671e9726c92c(ArrayList<Integer> nums) {
        Collections.sort(nums);
        return nums.get(nums.size() - 1) - nums.get(0);
    }

    
    public static int bigDiff_Problem_2_dfbfc6f4_7b7b_44c6_b4b3_42fbdd4e9615(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_fa0e002e_8d7f_429e_8030_7516216cab36(ArrayList<Integer> nums) {
        int biggest = nums.stream().mapToInteger(Integer::intValue).max().getAsInteger();
        int smallest = nums.stream().mapToInteger(Integer::intValue).min().getAsInteger();
        return biggest - smallest;
    }

    
    public static int bigDiff_Problem_0_5e5c7cfe_9e79_417b_8f6d_be34b32df4de(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_0f51f419_9197_484c_a35f_459c3f0b4269(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_a2c5e373_35a7_432f_b209_08866cba1d0d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_19cbb104_5739_467b_890e_afc1e28db3d2(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_72a19b54_ba51_41ca_b5e1_bb0dcf968ce6(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_d6ec2d4f_f613_4870_b7fe_6c10ca97eedc(ArrayList<Integer> nums) {
        return nums.stream().mapToInteger(a -> a - nums.get(0)).max().orElse(0) - nums.get(0) - nums.get(nums.size() - 1);
    }

    
    public static int bigDiff_Problem_1_9f0e3208_4f9c_46d9_9109_ad72c90ff801(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_b7ed7bcc_0fbd_4946_b7f2_e5f9987a861f(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_37ff5605_56c0_4a8b_b28f_7017a018e54e(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_e4e1308d_6dbd_48ad_ba0c_15cb51015fe3(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_990a3a36_d7ef_4732_8b10_40b507d06c0a(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_023b8473_2cf6_4429_91d6_9f4fe75bd0f5(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_139acf37_ae66_4774_9476_1baec81babef(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_65fd38f5_a334_4114_b78b_96ea0fed086a(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_fc0a7b28_5767_42ed_9208_eb576d636b1e(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_d31b5bae_9f5e_4956_b69a_dce495b91258(ArrayList<Integer> nums) {
        Integer max = Integer.MIN_VALUE;
        Integer min = Integer.MAX_VALUE;
        Integer temp;
        for (Integer num : nums) {
            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_285029b6_c687_4775_ba5c_d33b698e73e2(ArrayList<Integer> nums) {
        int maxVal = nums.get(0);
        int minVal = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > maxVal) {
                maxVal = nums.get(i);
            }
            if (nums.get(i) < minVal) {
                minVal = nums.get(i);
            }
        }
        return maxVal - minVal;
    }

    
    public static int bigDiff_Problem_0_5478832a_dc8e_4926_95a5_dc83169f139e(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_39f9cad3_95f8_4af1_bc8f_05862dfe780d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_11c829b8_3c4c_4094_95c8_9b87dc6a1ef3(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_50dc2130_d707_468b_81e3_32d6bf576048(ArrayList<Integer> nums) {
        int[] arr = new int[nums.size()];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = nums.get(i);
        }
        Arrays.sort(arr);
        return arr[arr.length - 1] - arr[0];
    }

    
    public static int bigDiff_Problem_2_51ad7422_dd8c_471e_8d3b_91a2db44dd5c(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_b736eaa4_82b0_4f93_95a3_c730b8d229b4(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_e68fcf5a_26b7_4aa6_abe0_e2dfcf2db572(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_73bcd193_7586_43b6_981c_94dab22f7294(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_0_2ea9a4f1_adb4_453a_ba5a_b54e99cacd5e(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_0_73bcd193_7586_43b6_981c_94dab22f7294(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_2_510a7a6d_8784_4e8c_8b72_c7804daf64e4(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_205a5df9_898c_4004_b858_f408ef9d58b9(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0);
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_199bb711_efbe_4f09_8605_041bdc1fdf0b(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_aaddf35e_8cdc_462e_8cea_0cacd67d890f(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_7e0f38e9_5a87_47d2_ac29_7b6583e3270a(ArrayList<Integer> nums) {
        int res = 0;
        Collections.sort(nums);
        res = nums.get(nums.size() - 1) - nums.get(0);
        return res;
    }

    
    public static int bigDiff_Problem_2_8da5415e_5853_493a_9106_0f1b0718e2b5(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_4bde644b_5d20_4403_bf6e_f796d08876d5(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int x : nums) {
            min = Math.min(min, x);
            max = Math.max(max, x);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_d4a1f86c_8306_4a8a_9072_8c595f45b07b(ArrayList<Integer> nums) {
        int bigNum = nums.get(0);
        int smallNum = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > bigNum)
                bigNum = nums.get(i);
            if (nums.get(i) < smallNum)
                smallNum = nums.get(i);
        }
        int difference = bigNum - smallNum;
        System.out.println("difference is: " + difference);
        return difference;
    }

    
    public static int bigDiff_Problem_2_f30aca14_9253_4570_a403_971133070bf6(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) > max) {
                max = nums.get(i);
            }
            if(nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_a39b077d_e84a_49e6_87a0_bc081a797dbe(ArrayList<Integer> nums) {
        Integer[] temp = nums.toArray(new Integer[nums.size()]);
        Integer[] temp1 = nums.toArray(new Integer[nums.size()]);
        Arrays.sort(temp);
        Arrays.sort(temp1);
        return Math.abs(temp[temp.length - 1] - temp1[0]);
    }

    
    public static int bigDiff_Problem_2_ace030e7_ee3f_4873_841b_5691b2402bb6(ArrayList<Integer> nums) {
        Integer min = nums.get(0), max = nums.get(0);
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_153661e7_4371_4f09_880e_1fb21789014a(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_0_5047e32c_160a_42fc_9813_cc5cdcae2f0b(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_8fc2543e_f5f7_4315_ac69_c3ce2f73be67(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_0c04973c_b02c_447d_b5dc_40bd2b3acc35(ArrayList<Integer> nums) {
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
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_fd870681_de1c_41f5_83b4_85bed2464ba1(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_2_adc0f2c5_d84b_4b9f_9faa_fae78957b0a8(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_05c22697_4d51_4f84_809e_27753c7af6a2(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, res;
        for(Integer n : nums) {
            if(min > n) {
                min = n;
            }
            if(max < n) {
                max = n;
            }
        }
        res = max - min;
        return res;
    }

    
    public static int bigDiff_Problem_2_8d3cb915_1329_47b2_80c5_213b10a8fbaf(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) > max) {
                max = nums.get(i);
            }
            if(nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_0af863a3_1141_4546_89bb_6208da75d155(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_205a5df9_898c_4004_b858_f408ef9d58b9(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0);
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_72d47727_e742_4a0b_b6ec_da9223f4d320(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_f30aca14_9253_4570_a403_971133070bf6(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) > max) {
                max = nums.get(i);
            }
            if(nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_5ed9cd70_a63a_4a78_92b3_66e39d3890c2(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_95ed0256_8271_444b_a17d_7e1662a49952(ArrayList<Integer> nums) {
        int largest = nums.get(0); // Initialize largest to first element of array.
        int smallest = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_43f499dc_cb70_4e4c_ade9_e9a4d507c739(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_bf2ee28f_359b_40b2_b65a_8c9fab1ad6c3(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_15a223c5_c146_48fd_93f3_863c42cf08e0(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_0_a5244f57_6d3c_4468_b2cf_dcfa584bbe6f(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_610588c1_8a82_4f71_b11e_857586e390f1(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_04f26110_88b8_4b7e_b6a6_701a155e2379(ArrayList<Integer> nums) {
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
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_6a22d508_1e51_4a5b_a9db_a0239f6aa225(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_1_6cd44374_0ba3_4039_a884_ea4c150e140e(ArrayList<Integer> nums) {
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if(nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_f718d836_a174_4f20_ac34_e24f7488ab5a(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            max = Math.max(max, nums.get(i));
            min = Math.min(min, nums.get(i));
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_393a544c_af5b_4b4c_8b22_fe595c76025a(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int n : nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_9f0e3208_4f9c_46d9_9109_ad72c90ff801(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_7e35f243_d222_4c14_b667_1c18c5fc352a(ArrayList<Integer> nums) {
        if(nums.isEmpty()) return 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int curr = nums.get(0);
        for(Integer n : nums) {
            if(n > max) max = n;
            if(n < min) min = n;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_24a98fad_ff75_4222_96ab_b02a23475b12(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_83056ac9_f97d_42b7_8558_af3317acc99b(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_a409a3a9_e60f_4429_98aa_b9f4ea626b66(ArrayList<Integer> nums) {
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

    
    public static int bigDiff_Problem_2_c4c2a51a_9e6e_4877_a394_62ead7a03c93(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_35e1237c_f1f5_438d_9a94_9f6fe674b8cc(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_9e11b7af_44db_4f05_a350_14026ae65c85(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_cf13a4d8_5541_4cb9_b368_aaa2a6628d06(ArrayList<Integer> nums) {
        // your code goes here
        
        return nums.get(0) - nums.get(nums.size()-1);
    }

    
    public static int bigDiff_Problem_0_f1e0adf7_1614_4f70_81fc_01371f26dddf(ArrayList<Integer> nums) {
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
        return max - min;
    }

    
    public static int bigDiff_Problem_1_4c5a5404_a318_480e_84e5_c9102e785ed0(ArrayList<Integer> nums) {
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
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_285029b6_c687_4775_ba5c_d33b698e73e2(ArrayList<Integer> nums) {
        int maxVal = nums.get(0);
        int minVal = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > maxVal) {
                maxVal = nums.get(i);
            }
            if (nums.get(i) < minVal) {
                minVal = nums.get(i);
            }
        }
        return maxVal - minVal;
    }

    
    public static int bigDiff_Problem_1_1623234d_a29e_4a69_99e7_b325bc8b65ba(ArrayList<Integer> nums) {
        int max = Collections.max(nums);
        int min = Collections.min(nums);
        int diff = max - min;
        return diff;
    }

    
    public static int bigDiff_Problem_1_49d3bda3_858d_4b47_b6e2_21564afe7c55(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

}
