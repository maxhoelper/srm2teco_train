package mbpp_723_count_same_pair;

public class mbpp_723_count_same_pair {

    
    public static int countSamePair_Problem_0_0d79d355_bcb3_4680_a1d4_17fe022ddba2(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int size = nums1.size();
        if (nums1.size() != nums2.size()) {
            return 0;
        }
        int i = 0;
        while (i < size) {
            if (nums1.get(i) == nums2.get(i)) {
                i++;
            } else {
                break;
            }
        }
        return i;
    }

    
    public static int countSamePair_Problem_0_1174586c_b5c1_425c_b104_cadf82e5463f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int l1 = nums1.size();
        int l2 = nums2.size();
        
        int i = 0, j = 0;
        
        while (i < l1 && j < l2) {
            if (nums1.get(i) == nums2.get(j)) {
                i++;
                j++;
            } else if (nums1.get(i) < nums2.get(j)) {
                i++;
            } else if (nums1.get(i) > nums2.get(j)) {
                j++;
            }
        }
        
        return i + j;
    }

    
    public static int countSamePair_Problem_2_ffdbe437_2ebb_4c92_b9a5_f10c54a0a999(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your answer here
        int sum = 0;
        for( int i = 0; i < nums1.size(); i++){
            int j = 0;
            for( ; j < nums2.size(); j++){
                if( nums1.get(i) == nums2.get(j) ) sum += 1;
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_3_4cd30a25_cc91_4e46_9eba_312270a5bc39(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int size = nums1.size();
        for (int i = 0; i < size; i++) {
            int a = nums1.get(i);
            int b = nums2.get(i);
            if (a == b) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_1e280603_4027_4e40_aa3e_5f8532545ab2(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count += 1;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_93f0c9a8_4f16_4a41_b9b4_b2fbc29d7c38(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff != minDiff) {
            count = maxDiff - minDiff;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_f8f86c23_3a43_411e_ae3d_df8e0dcd3005(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_8fe5dd5f_e894_4c5a_bb10_a5e1be5a8f72(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0L;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i).equals(nums2.get(j))) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_a51c63c5_033c_4bcc_8129_b7812a266d3e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_60c5a31a_cc45_49c7_829d_6a9833f6dbab(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if(nums1.size() != nums2.size()) {
            return 0;
        }

        int i = 0;
        int j = 0;
        int count = 0;

        while(i < nums1.size()) {
            if(nums1.get(i) == nums2.get(i)) {
                count++;
                i++;
                j++;
            } else if(j >= nums2.size()) {
                break;
            } else {
                i++;
            }
        }

        return count;
    }

    
    public static int countSamePair_Problem_2_79ec09c3_7639_47a6_9344_86dbfce7d7b3(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        int temp;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_1ac70470_7fc1_4b62_984d_7ed55608e5f4(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int len = nums1.size();
        int sum = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    sum++;
                }
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_3_157fdf60_349a_4893_8be6_127bd6f3a9ab(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int[] temp = new int[nums1.size()];
        Arrays.fill(temp, 0);
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    temp[i]++;
                }
            }
        }
        return Arrays.stream(temp).sum();
    }

    
    public static int countSamePair_Problem_2_6d8a5604_d7d0_48a4_9692_298a6ce90215(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_558bde51_77d0_45ac_a57e_eaf373fb5ed7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_ac24e08e_6cc2_4b7d_aaad_148b731308de(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.stream().max(Integer::compareTo).get();
        int max2 = nums2.stream().max(Integer::compareTo).get();
        int min1 = nums1.stream().min(Integer::compareTo).get();
        int min2 = nums2.stream().min(Integer::compareTo).get();
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        int diff = 0;
        if (maxDiff != minDiff) {
            diff = maxDiff - minDiff;
        }
        if (diff > 0) {
            count = diff / 2;
        } else if (diff < 0) {
            count = diff / 2;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_e39e1f85_12a4_4242_9305_2c0aa3808e2b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int samePairs = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if (num1 == num2) {
                samePairs++;
            }
        }
        return samePairs;
    }

    
    public static int countSamePair_Problem_3_ac84da5a_aacd_4f5b_b570_af8f5134ce8e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int count = 0;
        for(Integer a:nums1){
            for(Integer b:nums2){
                if(a==b){
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_8d8d6d4a_f568_412a_a435_fdf40e523162(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_9dbeef83_b934_4e7f_a6cd_efe57ffb205a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size()-1);
        int max2 = nums2.get(nums2.size()-1);
        for(int i = 0; i < nums1.size(); i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if(num1 == num2) {
                count++;
            }
            if(num1 > max1 && num2 > max2) {
                max1 = num1;
                max2 = num2;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_2ce37688_9d18_497f_be43_df2a802a0123(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_48e81983_eb5c_46e8_9dd9_cb9db694ac0a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i).equals(nums2.get(j))) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_ee14686f_f110_4f77_8a98_6d5003bba25e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        Set<Integer> set = new HashSet<Integer>();
        
        for(int i = 0; i < nums1.size(); i++) {
            Integer num1 = nums1.get(i);
            Integer num2 = nums2.get(i);
            
            if(set.contains(num1)) {
                result++;
            }
            
            set.add(num1);
        }
        
        return result;
    }

    
    public static int countSamePair_Problem_3_51c1afed_6695_4b19_8a28_160ac3b4b81b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_77ac9598_8d98_4fc4_ba85_d307f60be6f6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                list.add(nums1.get(i) * nums2.get(j));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_f4f5166c_86a9_427b_97b8_5c858ef118d0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < nums1.size(); ++i) {
            for(int j = 0; j < nums2.size(); ++j) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_a3509190_ec94_45ba_abb8_217785409668(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        return nums1.stream()
                .flatMap(i -> nums2.stream())
                .distinct()
                .count();
    }

    
    public static int countSamePair_Problem_3_4571681c_69ee_4702_a0b6_d0169eb768ea(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        
        return count;
    }

    
    public static int countSamePair_Problem_2_19bac8f3_f4be_4f16_9e07_6ae9c7394ef1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            Integer num1 = nums1.get(i);
            Integer num2 = nums2.get(i);
            if (num1 == num2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_775bf3cc_4100_4fbb_b09e_e8d340062a1b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int n = nums1.size();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if (num1 == num2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_13f295db_43f1_4e00_a41e_22164c823f41(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff == minDiff) {
            count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_ece4ad83_be97_4d76_9b67_8d57da2c9db5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff == minDiff) {
            count++;
        }
        for (int i = 0; i < nums1.size(); i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            int diff = num1 - num2;
            if (maxDiff == minDiff) {
                count++;
            }
            if (diff == maxDiff) {
                count++;
            }
            if (diff == minDiff) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_12608730_59f1_4b58_b833_8a918a9d0aad(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff > minDiff) {
            count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_f6160236_3fb5_41de_93f0_b45118b55806(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // your code here
        int sum = 0;
        for(int i=0; i<nums1.size(); i++){
            for(int j=0; j<nums2.size(); j++){
                if(nums1.get(i) == nums2.get(j)){
                    sum+=1;
                }
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_3_ce155c18_c410_4df0_a13b_c70f9c64c3f2(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int l1 = nums1.size();
        int l2 = nums2.size();
        for(int i = 0; i < l1; i++) {
            if(nums1.get(i).equals(nums2.get(i))) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_65721580_417e_4ea1_ac3e_beeafb021e33(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_2_87ccc802_d991_491d_a434_a5c5d9fc4fae(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int len = Math.min(nums1.size(), nums2.size());
        int num = 0;
        for (int i = 0; i < len; i++) {
            if (nums1.get(i) == nums2.get(i)) {
                num++;
            }
        }
        return num;
    }

    
    public static int countSamePair_Problem_2_a039a1bd_c5e5_451c_bbf8_8e472ebf9e74(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int total = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    total++;
                }
            }
        }
        return total;
    }

    
    public static int countSamePair_Problem_1_f8864eae_26c3_476c_aa98_8aee6889dd03(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(0);
        int max2 = nums2.get(0);
        int min1 = nums1.get(nums1.size()-1);
        int min2 = nums2.get(nums2.size()-1);
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == max1 && nums2.get(i) == max2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_c56ef4bc_323d_4f57_a5a7_51d97319e6c0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int ret = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    ret++;
                }
            }
        }
        return ret;
    }

    
    public static int countSamePair_Problem_0_2ff53841_9f44_443d_b208_cac1eb75e523(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_a7c3580c_e4d9_44f6_a18c_560a26ca2720(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); ++i) {
            for(int j = 0; j < nums2.size(); ++j) {
                if(nums1.get(i) == nums2.get(j)) {
                    ++count;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_f4c721d1_1d63_4b98_9fe9_a44c295150a7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int same = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    same++;
                }
            }
        }
        return same;
    }

    
    public static int countSamePair_Problem_1_c0fc2a72_569e_4968_b2fa_deda65147c11(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int i = 0;
        int j = 0;
        int nums1_size = nums1.size();
        int nums2_size = nums2.size();
        int count = 0;
        while (i < nums1_size && j < nums2_size) {
            if (nums1.get(i) == nums2.get(j)) {
                count++;
                i++;
                j++;
            } else {
                i++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_473773fd_f173_40b8_8ce0_83c8e8983525(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int samePairs = 0;
        int sameValuesIndexes = 0;
        int j = 0;

        for(int i=0; i<nums1.size() && j<nums2.size(); i++) {
            int val1 = nums1.get(i);
            int val2 = nums2.get(j);

            if(val1 == val2) {
                samePairs++;
                sameValuesIndexes++;
            }
            j++;
        }

        return sameValuesIndexes;
    }

    
    public static int countSamePair_Problem_3_5a331477_a72f_40ef_b562_513c52c79455(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int res = 0;
        if (nums1.size() != nums2.size()) {
            return res;
        }
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                res++;
            }
        }
        return res;
    }

    
    public static int countSamePair_Problem_3_d4cb6d24_ad58_4937_b135_99f16d3fdd34(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_cdf3a5ed_06e5_4c27_8a1b_8c0ad8e4d55a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if(nums1.size() != nums2.size()) return 0;
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_ece47310_ce07_4b66_8899_6c98d3cc003e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // write your code here
        // write your code here
        // write your code here
        // write your code here
        // write your code here
        // write your code here
        // write your code here
        return 0;
    }

    
    public static int countSamePair_Problem_2_1ed0efaf_8349_4afb_9ad3_ea101546767f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_1ed0efaf_8349_4afb_9ad3_ea101546767f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_2e055cbb_94c6_4779_ad87_f1838861caa6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for(int i=0;i<nums1.size();i++) {
            for(int j=0;j<nums2.size();j++) {
                if(nums1.get(i).equals(nums2.get(j))) {
                    if(!map.containsKey(nums1.get(i))) {
                        map.put(nums1.get(i), 1);
                    }
                    else {
                        map.put(nums1.get(i), map.get(nums1.get(i)) + 1);
                    }
                }
            }
        }
        for(int i=0;i<nums1.size();i++) {
            for(int j=0;j<nums2.size();j++) {
                if(nums1.get(i).equals(nums2.get(j))) {
                    if(map.get(nums1.get(i)).equals(1)) {
                        result += j;
                    }
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_3_65721580_417e_4ea1_ac3e_beeafb021e33(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_3_c2cdec22_850c_4afb_9eb1_a64ecb9b4954(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_005181b5_a6a2_452d_b64c_c73104f4048e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int samePair = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    samePair++;
                }
            }
        }
        return samePair;
    }

    
    public static int countSamePair_Problem_2_847ccfeb_3513_45df_9aee_3da8ccb24b22(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_e8f9ec08_66ed_4eaa_b1b8_c5b4a5737120(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_0c32bae8_656b_450f_887b_979e434ef05a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_524ace8c_ff8d_4b79_aa47_3a0294f5007c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int tmp = 0;
        for(int i = 0; i < nums1.size(); i++) {
            tmp = nums1.get(i);
            for(int j = 0; j < nums2.size(); j++) {
                if(tmp == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_73af5a18_bd8e_447b_b78c_e4733c49c48e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // TODO: Your code here
        int n1 = nums1.size();
        int n2 = nums2.size();
        if(n1 != n2){
            return 0;
        }
        int result = 0;
        for(int i=0; i<n1; i++){
            if(nums1.get(i) == nums2.get(i)){
                result++;
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_2_c45e3102_11ae_4999_bcbf_5ff5197657b5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int len1 = nums1.size();
        int len2 = nums2.size();
        for(int i = 0; i < len1 - 1; i++) {
            for(int j = 0; j < len2 - 1; j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_c56ef4bc_323d_4f57_a5a7_51d97319e6c0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int ret = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    ret++;
                }
            }
        }
        return ret;
    }

    
    public static int countSamePair_Problem_3_90bc40bd_52f2_4675_8a75_4e8a6e9c0f90(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_1ed0efaf_8349_4afb_9ad3_ea101546767f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_77cc5430_671a_4ca3_9f55_84aaf06f729c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i=0; i<nums1.size(); i++) {
            for(int j=i+1; j<nums1.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_0c24df32_8067_409e_8837_c93d9f8ee360(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_e3d629ab_ed2c_4149_bb3e_2f4ca2a098aa(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_0a16c86c_5411_4e77_b53d_87783eb6602e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_9aba959a_31cd_46bf_8687_3d49336102a6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size()-1);
        int max2 = nums2.get(nums2.size()-1);
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == max1 && nums2.get(i) == max2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_5ffb90aa_255d_4b33_95d3_c631711138d0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_9758c508_49e4_4ace_b5f1_3bb491566deb(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int counter = 0L;
        
        if (nums1 == null || nums2 == null || nums1.size() != nums2.size()) {
            return counter;
        }
        
        for (int i = 0; i < nums1.size(); ++i) {
            if (nums1.get(i) == nums2.get(i)) {
                counter++;
            }
        }
        
        return counter;
    }

    
    public static int countSamePair_Problem_1_4f9bb090_a4b6_4d57_ac5f_e21111dc9bc3(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == max1 && nums2.get(i) == max2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_02d967a3_fd6c_4f0e_a2d4_b337843010d0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        if(nums1.size() != nums2.size()) {
            System.out.println("The lists are not of the same length");
        } else {
            for(int i=0; i<nums1.size(); i++) {
                if(nums1.get(i) == nums2.get(i)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_898ec38f_613f_40fd_95c3_5978bc5a49f7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_960599d8_a9dc_49c9_860c_9b50400ba3e9(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i=0;i<nums1.size();i++) {
            if (nums1.get(i)==nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_d1f9d582_9b33_4b4a_a07a_071f502a3ac2(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_77ac9598_8d98_4fc4_ba85_d307f60be6f6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                list.add(nums1.get(i) * nums2.get(j));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_29abdd1a_eafc_4f70_b13c_def7322a2bf3(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Return the length of the intest list that has the same value as the other
        // If the lists differ in length, return -1
        int length = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    length++;
                }
            }
        }
        return length;
    }

    
    public static int countSamePair_Problem_1_e4fcfc4b_049c_412d_bbb6_c666178a8342(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_0_55a99939_cad7_48ea_ae04_b77537813ad8(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int n = nums1.size();
        int m = nums2.size();
        int[] array = new int[n];
        int[] array2 = new int[m];
        int[] array3 = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = nums1.get(i);
        }
        for (int j = 0; j < m; j++) {
            array2[j] = nums2.get(j);
        }
        // System.out.println("array=" + Arrays.toString(array));
        for (int i = 0; i < n; i++) {
            if (array[i] == array2[i]) {
                for (int j = 0; j < n; j++) {
                    if (array[i] == array3[j]) {
                        count++;
                    }
                }
            }
        }
        // System.out.println("count=" + count);
        return count;
    }

    
    public static int countSamePair_Problem_1_29723c65_ee60_486a_a6c8_97bae4b36093(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_fa0486c5_bf42_48b2_9680_bf1b3133d1b8(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int sum = 0;
        int diff1 = 0;
        int diff2 = 0;
        // System.out.println(nums1);
        // System.out.println(nums2);
        // int size = nums1.size();
        // int size = nums2.size();
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                sum += i;
                diff1 += nums1.get(i);
                diff2 += nums2.get(i);
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_0_7d299ce8_babc_437c_b1a5_7d071725471a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_bbbce57b_a0b3_4fdd_9d3c_f091563af8e0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_a239dfd0_ca57_4f18_86b5_dfac4605f0e7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        return 0;
    }

    
    public static int countSamePair_Problem_2_850819b7_8423_4452_a692_3328eed8604d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int n = nums1.size();
        if(n != nums2.size()) {
            return 0L;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            Integer num1 = nums1.get(i);
            Integer num2 = nums2.get(i);
            if(!map.containsKey(num1)) {
                map.put(num1, 0);
            }
            if(!map.containsKey(num2)) {
                map.put(num2, 0);
            }
            if(map.get(num1).equals(map.get(num2))) {
                map.put(num1, map.get(num1) + 1);
                map.put(num2, map.get(num2) + 1);
            }
        }
        int sum = 0L;
        for(Integer key : map.keySet()) {
            if(map.get(key).equals(2)) {
                sum += map.get(key);
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_3_f3dab9f7_6071_46b2_8eca_325dd5189801(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int size = nums1.size();
        if (size != nums2.size()) return 0;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_43b35184_644b_4b0e_8647_9285c6b66232(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int value1 = nums1.get(i);
            int value2 = nums2.get(i);
            if (value1 == value2) count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_ab089927_932c_4154_96bd_f05518875208(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        return nums1.stream()
            .map(a -> nums2.indexOf(a))
            .filter( e -> e != -1 )
            .count();
    }

    
    public static int countSamePair_Problem_0_7876cb98_abdd_4355_aceb_59a77b44f0c2(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            Integer value = nums1.get(i);
            if(nums2.contains(value)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_3c61f428_8fb7_4d50_a989_c8624d6fbbdd(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_e89be6d5_a503_4287_a787_edf2e3f99eb8(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_7d299ce8_babc_437c_b1a5_7d071725471a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_f53bdc11_ab49_4324_a56c_322807689442(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int numSame = 0;

        // Sort the two lists so we can compare them
        ArrayList<Integer> numsList = nums2;
        Collections.sort(numsList);

        for(int i=0; i<nums2.size(); i++) {
            int index = Collections.binarySearch(numsList, nums2.get(i));
            if (index >= 0) {
                numSame += 1;
                numsList.remove(i);
            }
        }

        return numSame;
    }

    
    public static int countSamePair_Problem_1_fa561206_1218_4fa5_af6f_25e484b97c0c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_2244c13c_7d95_41b2_9e91_1db507f07d1e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int size = nums1.size();
        int nums2index = 0;
        int nums1index = 0;
        int count = 0;
        while(nums2index < size) {
            if(nums1.get(nums1index) == nums2.get(nums2index)) {
                count++;
                nums1index++;
                nums2index++;
            } else if(nums1.get(nums1index) < nums2.get(nums2index)) {
                nums2index++;
            } else if(nums2.get(nums2index) < nums1.get(nums1index)) {
                nums1index++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_40f802c7_4ebc_406f_8bba_ebc21d02c153(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int samePairs = 0;
        int num;
        for(int i = 0; i < nums1.size(); i++){
            num = nums1.get(i);
            if(nums2.contains(num)){
                samePairs++;
            }
        }
        return samePairs;
    }

    
    public static int countSamePair_Problem_1_d7af4d55_77d6_4858_b6b3_06e8aae90f93(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>(nums1);
        HashSet<Integer> set2 = new HashSet<Integer>(nums2);

        int count = 0;
        for(Integer key : set1) {
            if(set2.contains(key)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_e82117f3_f27b_43b5_ae82_0c3964216828(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size()-1);
        int max2 = nums2.get(nums2.size()-1);
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_d535ba10_b992_4cb6_8fcd_d1aa1fd51a94(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size()-1);
        int max2 = nums2.get(nums2.size()-1);
        for(int i = 0; i < nums1.size(); i++) {
            int cur1 = nums1.get(i);
            int cur2 = nums2.get(i);
            if(cur1 == max1 && cur2 == max2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_a8b6955a_9e11_4fd0_aaa9_ceb5e027bf3b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_f6160236_3fb5_41de_93f0_b45118b55806(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // your code here
        int sum = 0;
        for(int i=0; i<nums1.size(); i++){
            for(int j=0; j<nums2.size(); j++){
                if(nums1.get(i) == nums2.get(j)){
                    sum+=1;
                }
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_0_8b2fc8ad_eb53_4307_82d9_b429612f4fce(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int firstIndex = -1;
        int secondIndex = -1;
        int size = nums1.size();
        for(int i = 0; i < size; i++) {
            for(int j = i + 1; j < size; j++) {
                if((nums1.get(i) == nums1.get(j)) && (nums2.get(i) == nums2.get(j))) {
                    count++;
                    firstIndex = i;
                    secondIndex = j;
                }
            }
        }
        
        return count;
    }

    
    public static int countSamePair_Problem_0_1d12c3a4_f313_4891_8553_646171188c92(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_7557985a_1d77_4e22_8431_e67a1ac6fad2(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        if (nums1 == null || nums2 == null || nums1.size() != nums2.size()) {
            return count;
        }
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i).equals(nums2.get(i))) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_a38e76c5_3919_4e92_b0cf_2c0c1bd1eb31(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < nums1.size(); i++) {
            sum += nums1.get(i);
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_9dc1c3c6_3420_45aa_9602_bb5547228cf3(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < nums1.size(); i++) {
            sum += nums1.get(i);
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_00a8dbc6_dc64_4752_b634_f9d5da7cbd04(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        if(nums1.size() != nums2.size())
            throw new IllegalArgumentException();
        Integer[] array1 = nums1.toArray(new Integer[nums1.size()]);
        Integer[] array2 = nums2.toArray(new Integer[nums2.size()]);
        int result = 0;
        for(int i = 0; i < array1.length; ++i){
            if(array1[i] == array2[i])
                result += i;
        }
        return result;
    }

    
    public static int countSamePair_Problem_2_5582ebc7_4b06_411b_8b05_916a59152034(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int numCount = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i))
                numCount++;
        }
        return numCount;
    }

    
    public static int countSamePair_Problem_0_9a433929_387e_4760_b126_c5f47904d1ab(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_f40cac96_2b2a_4b1c_bc8a_9ed093ca113e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++){
            for(int j = 0; j < nums2.size(); j++){
                if(nums1.get(i) == nums2.get(j)){
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_f6cfdaa8_4a00_4012_90e9_323dbb625e0d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_0d79d355_bcb3_4680_a1d4_17fe022ddba2(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int size = nums1.size();
        if (nums1.size() != nums2.size()) {
            return 0;
        }
        int i = 0;
        while (i < size) {
            if (nums1.get(i) == nums2.get(i)) {
                i++;
            } else {
                break;
            }
        }
        return i;
    }

    
    public static int countSamePair_Problem_0_4ff73d50_d7c8_4fb5_9f09_fabf1df63f2c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_d0c6d996_2407_4c1b_aebf_6f5c187e2a24(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_767b858d_40ef_4422_ac1d_352d89febf05(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Your code here
        int count = 0;
        int n1 = nums1.size();
        int n2 = nums2.size();
        for(int i = 0; i < n1; i++){
            for(int j = 0; j < n2; j++){
                if(nums1.get(i) == nums2.get(j)){
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_2e882707_b49d_460d_98d4_e2e60f4d7665(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_2_85ff4fca_a553_4ce4_8e18_87c2c8eacdda(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        int temp = 0;
        int temp2 = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_2ff53841_9f44_443d_b208_cac1eb75e523(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_8fe5dd5f_e894_4c5a_bb10_a5e1be5a8f72(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0L;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i).equals(nums2.get(j))) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_81bad13a_f668_471d_ac39_d5074ef13239(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        ArrayList<Integer> same = new ArrayList<Integer>();
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    same.add(nums1.get(i));
                }
            }
        }
        return same.size();
    }

    
    public static int countSamePair_Problem_2_87ea1eef_907d_4391_bce8_78c1a5c5f187(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_5a331477_a72f_40ef_b562_513c52c79455(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int res = 0;
        if (nums1.size() != nums2.size()) {
            return res;
        }
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                res++;
            }
        }
        return res;
    }

    
    public static int countSamePair_Problem_1_5d956aa5_1f87_497e_bdcc_d2cbbd70732a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int i = 0, j = 0;
        int count = 0;
        for(; i < nums1.size() && j < nums2.size(); i++) {
            if(nums1.get(i) == nums2.get(j)) {
                count++;
                j++;
            } else {
                j = 0;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_08bfb615_e4b3_4b33_a6cc_39db2e78491a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int i = 0;
        int count = 0;
        while (i < nums1.size()) {
            if (nums1.get(i) == nums2.get(i)) {
                count += 1;
            }
            i += 1;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_9a8005da_291c_4cb9_a3fc_1c0580c60d44(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff == minDiff) {
            count++;
        }
        if (maxDiff > minDiff) {
            count += nums1.size() - 1;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_3123ca9b_e8ca_4a8e_abf2_b27921b3ad91(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Your code here
        Integer numsSum = new Integer(0);
        Integer numsDiff = new Integer(0);
        for (int i : nums1) {
            if(i==nums2.get(nums2.size()-1))
                numsSum+=i;
            else
                numsDiff+=i*(nums2.get(nums2.size()-1));
        }
        return Math.abs(numsSum-numsDiff);
    }

    
    public static int countSamePair_Problem_1_a9be8eff_0f23_4892_9633_d42b22cf74ce(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        ArrayList <Integer> temp = new ArrayList<>();
        ArrayList <Integer> newNums1 = new ArrayList<>();
        ArrayList <Integer> newNums2 = new ArrayList<>();
        for(int i=0; i<nums1.size(); i++) {
            int first = nums1.get(i);
            int second = nums2.get(i);
            if(first == second) {
                temp.add(first);
                temp.add(second);
            } else {
                newNums1.add(first);
                newNums2.add(second);
            }
        }
        int count = newNums1.size();
        return count;
    }

    
    public static int countSamePair_Problem_3_bf52c663_1a11_4919_b62f_4b894c45724a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int cnt = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    cnt += 1;
                    // break;
                }
            }
        }
        return cnt;
    }

    
    public static int countSamePair_Problem_0_08bfb615_e4b3_4b33_a6cc_39db2e78491a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int i = 0;
        int count = 0;
        while (i < nums1.size()) {
            if (nums1.get(i) == nums2.get(i)) {
                count += 1;
            }
            i += 1;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_eaeedb82_4727_4040_a515_b2607d0602a3(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if (num1 == num2)
                count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_a287326b_9c28_413e_ab06_615299d70b77(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_2b744f42_9f2e_4e83_a3d3_d9edd5fd693e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_9c6dfb98_75dd_4c16_9552_876c8d1b9859(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        return IntStream.range(0, nums1.size())
                .filter(i -> nums1.get(i) == nums2.get(i))
                .count();
    }

    
    public static int countSamePair_Problem_0_120de35a_d2c8_415c_bd29_e8cdbe858253(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        return nums1.stream().filter(n -> nums2.contains(n)).count();
    }

    
    public static int countSamePair_Problem_2_e82117f3_f27b_43b5_ae82_0c3964216828(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size()-1);
        int max2 = nums2.get(nums2.size()-1);
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_e00942dc_6865_43fb_acb6_f3d322ad0ffc(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_9dbeef83_b934_4e7f_a6cd_efe57ffb205a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size()-1);
        int max2 = nums2.get(nums2.size()-1);
        for(int i = 0; i < nums1.size(); i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if(num1 == num2) {
                count++;
            }
            if(num1 > max1 && num2 > max2) {
                max1 = num1;
                max2 = num2;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_2b744f42_9f2e_4e83_a3d3_d9edd5fd693e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_b0fadd03_e92a_4a27_a02b_c55c3fa4240b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_3_9e7b9f28_6c3a_4c91_9490_71109db42aa1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_25548c37_df39_4b93_b51b_d0a5512c22e1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_30e02e26_9ea8_4a5e_ba1f_49ed4674583c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int len1 = nums1.size();
        int len2 = nums2.size();
        for(int i = 0; i < len1; i++) {
            for(int j = 0; j < len2; j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_ad45f6d4_624d_4cc0_8c74_b1a21ac0e049(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_e231b610_2ccf_423b_b06a_5464325a1479(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        HashSet<Integer> set1 = new HashSet<>(nums1);
        HashSet<Integer> set2 = new HashSet<>(nums2);
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (set1.contains(nums1.get(i))) count++;
        }
        for (int i = 0; i < nums2.size(); i++) {
            if (set2.contains(nums2.get(i))) count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_ab23b2c6_cb2c_43fd_93e6_55e6f1470c2d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int size1 = nums1.size();
        int size2 = nums2.size();

        // Iterate through all combinations
        for (int i1 = 0; i1 < size1; i1++) {
            int num1 = nums1.get(i1);
            for (int i2 = 0; i2 < size2; i2++) {
                int num2 = nums2.get(i2);

                if (num1 == num2)
                    return i1 * size2 + i2;
            }
        }
        return -1; // No pairs found
    }

    
    public static int countSamePair_Problem_2_ab9ca4a4_e160_47c5_813e_a1c3732497ba(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_4570dc50_8b8e_4451_8170_d719078e6462(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = i + 1; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_a47dbf90_5b34_47cb_9829_1d2ef1787a6f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_3ad5c9ee_1455_4ca5_a524_6f1f4c83a177(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < nums1.size(); i++) {
            sum1 += nums1.get(i);
        }
        for (int i = 0; i < nums2.size(); i++) {
            sum2 += nums2.get(i);
        }
        if (sum1 == sum2) {
            for (int i = 0; i < nums1.size(); i++) {
                if (nums1.get(i) == max1 && nums2.get(i) == max2) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_5d4056aa_cca5_4be8_b3e2_5407c11819b7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = nums1.stream().filter(x -> nums2.contains(x)).count();
        return count;
    }

    
    public static int countSamePair_Problem_1_94f16011_c7db_42dc_a2c7_523d4ee4cb14(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                result++;
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_2_b6a5f03a_74fb_481a_84cb_3a9e5ce76001(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int numsSize = nums1.size();
        int nums2Size = nums2.size();
        int count = 0;
        int index = 0;
        if (numsSize < nums2Size) {
            while (index != numsSize - 1) {
                if (nums1.get(index) == nums2.get(index)) {
                    count++;
                    index++;
                } else if (nums2.get(index) == nums1.get(index)) {
                    count++;
                    index++;
                } else {
                    index++;
                }
            }
            return count;
        } else if (numsSize > nums2Size) {
            while (index != nums2Size - 1) {
                if (nums2.get(index) == nums1.get(index)) {
                    count++;
                    index++;
                } else if (nums1.get(index) == nums2.get(index)) {
                    count++;
                    index++;
                } else {
                    index++;
                }
            }
            return count;
        } else {
            return numsSize;
        }

    }

    
    public static int countSamePair_Problem_2_937ec049_4f1e_4ca1_b9f1_f8482a3edb7f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    if (count > max) {
                        max = count;
                    }
                }
            }
        }
        return max;
    }

    
    public static int countSamePair_Problem_3_d89489ad_9457_4ac8_ac9a_4cb460b2b8b5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_29723c65_ee60_486a_a6c8_97bae4b36093(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_3123ca9b_e8ca_4a8e_abf2_b27921b3ad91(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Your code here
        Integer numsSum = new Integer(0);
        Integer numsDiff = new Integer(0);
        for (int i : nums1) {
            if(i==nums2.get(nums2.size()-1))
                numsSum+=i;
            else
                numsDiff+=i*(nums2.get(nums2.size()-1));
        }
        return Math.abs(numsSum-numsDiff);
    }

    
    public static int countSamePair_Problem_2_2b744f42_9f2e_4e83_a3d3_d9edd5fd693e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_2b4db0c7_3320_4f64_a4f0_94aa826e2763(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_9fde907f_3c72_4843_9e46_eaf4f551ebce(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_9a00d206_07c6_4109_8d94_a18650ab6e44(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int pairs = 0;
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                if (num1 == num2) pairs += 1;
            }
        }
        return pairs;
    }

    
    public static int countSamePair_Problem_1_544a8313_1ae4_4ff0_af12_3fb217c4b143(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int N = nums1.size();
        int M = nums2.size();
        if (N == M) {
            int ans = 0;
            int num1 = 0;
            for (int i = 0; i < N; i++) {
                num1 = nums1.get(i);
                int num2 = nums2.get(i);
                if (num1 == num2) {
                    ans++;
                }
            }
            return ans;
        }
        return -1;
    }

    
    public static int countSamePair_Problem_0_8430d407_6e1a_47c3_9e7f_3deff02e6a75(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    i = nums1.size();
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_60c5a31a_cc45_49c7_829d_6a9833f6dbab(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if(nums1.size() != nums2.size()) {
            return 0;
        }

        int i = 0;
        int j = 0;
        int count = 0;

        while(i < nums1.size()) {
            if(nums1.get(i) == nums2.get(i)) {
                count++;
                i++;
                j++;
            } else if(j >= nums2.size()) {
                break;
            } else {
                i++;
            }
        }

        return count;
    }

    
    public static int countSamePair_Problem_2_0ca739de_bb2a_4d97_9aee_518838a10c52(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int countSamePair_Problem_2_0ca739de_bb2a_4d97_9aee_518838a10c52s = 0;
        int num1 = nums1.get(0), num2 = nums2.get(0);
        if (num1 == num2) {
            countSamePair_Problem_2_0ca739de_bb2a_4d97_9aee_518838a10c52s++;
            for (int i = 1; i < nums1.size(); i++) {
                num1 = nums1.get(i);
                num2 = nums2.get(i);
                if (num1 == num2) {
                    countSamePair_Problem_2_0ca739de_bb2a_4d97_9aee_518838a10c52s++;
                }
            }
        }
        return countSamePair_Problem_2_0ca739de_bb2a_4d97_9aee_518838a10c52s;
    }

    
    public static int countSamePair_Problem_3_de9905bf_2581_4855_ace7_c5d476fc99cc(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int count = 0;
        if(nums1.size() != nums2.size())
            return count;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i))
                count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_ff678200_4142_42df_ac5c_ae90cc2b798d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    sum++;
                }
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_1_2a5a23a1_c9d0_4a8b_85b6_3f8c91171f75(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_0c24df32_8067_409e_8837_c93d9f8ee360(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_005181b5_a6a2_452d_b64c_c73104f4048e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int samePair = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    samePair++;
                }
            }
        }
        return samePair;
    }

    
    public static int countSamePair_Problem_0_2d5b9d13_0acb_4826_b22c_628b3cc683f5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size()-1);
        int max2 = nums2.get(nums2.size()-1);
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == max1 && nums2.get(i) == max2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_610cd7cf_dfcc_4ab0_977b_5b2597e7f3c9(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int temp1 = nums1.get(0) - nums1.get(1);
        int temp2 = nums2.get(0) - nums2.get(1);
        if (temp1 == temp2) {
            count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_52074eea_4137_4169_9d7f_6970549321ad(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff > minDiff) {
            count = maxDiff - minDiff;
        } else {
            count = minDiff - maxDiff;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_3b1878c4_3d75_41d0_9773_2d5d4690c714(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_0f1e6dd9_e245_4809_bf3c_4ccfdd3599d7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int len = nums1.size();
        if(len == nums2.size()) {
            for(int i = 0; i < len; i++) {
                if(nums1.get(i) == nums2.get(i)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_a0afce7c_841f_4b11_86bc_2181041d1e91(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_73af5a18_bd8e_447b_b78c_e4733c49c48e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // TODO: Your code here
        int n1 = nums1.size();
        int n2 = nums2.size();
        if(n1 != n2){
            return 0;
        }
        int result = 0;
        for(int i=0; i<n1; i++){
            if(nums1.get(i) == nums2.get(i)){
                result++;
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_0_19bac8f3_f4be_4f16_9e07_6ae9c7394ef1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            Integer num1 = nums1.get(i);
            Integer num2 = nums2.get(i);
            if (num1 == num2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_d24350d7_3e07_4aff_ad5b_33995049da4e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int total = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    total++;
                }
            }
        }
        return total;
    }

    
    public static int countSamePair_Problem_1_a06c4e1c_3922_46fc_a1da_8797e7cf7863(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // TODO: Fill in the blanks
        int indexCount = 0;
        for (int i = 0; i < nums1.size() && i < nums2.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                indexCount++;
            }
        }
        return indexCount;
    }

    
    public static int countSamePair_Problem_3_2d5b9d13_0acb_4826_b22c_628b3cc683f5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size()-1);
        int max2 = nums2.get(nums2.size()-1);
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == max1 && nums2.get(i) == max2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_8d3ff3dc_dea1_427f_b44e_c588aed19220(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_b26d6a33_8957_4e48_aaf7_4eadba56673f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_5d29c9c7_8006_46d0_8b5e_e6f92d84d685(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (Integer num1 : nums1) {
            for (Integer num2 : nums2) {
                if (num1 == num2) {
                    count += 1;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_0c99c2da_c297_4e99_abbc_a7f8a668f7e6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int size = nums1.size();
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(nums1.get(i).equals(nums2.get(j))) {
                    count++;
                    i = size;
                    j = size;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_0b3ea178_6539_48f0_915d_ce5800bf28da(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        boolean isSame = True;

        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) != nums2.get(i)) {
                isSame = False;
            }
        }

        if (isSame) {
            for (int i = 0; i < nums1.size(); i++) {
                if (nums1.get(i) == nums2.get(i)) {
                    count++;
                }
            }
        }

        return count;
    }

    
    public static int countSamePair_Problem_3_267fbad1_dcce_44b2_bab3_a986a7e7ae97(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums2.contains(nums1.get(i))) { 
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_2e055cbb_94c6_4779_ad87_f1838861caa6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for(int i=0;i<nums1.size();i++) {
            for(int j=0;j<nums2.size();j++) {
                if(nums1.get(i).equals(nums2.get(j))) {
                    if(!map.containsKey(nums1.get(i))) {
                        map.put(nums1.get(i), 1);
                    }
                    else {
                        map.put(nums1.get(i), map.get(nums1.get(i)) + 1);
                    }
                }
            }
        }
        for(int i=0;i<nums1.size();i++) {
            for(int j=0;j<nums2.size();j++) {
                if(nums1.get(i).equals(nums2.get(j))) {
                    if(map.get(nums1.get(i)).equals(1)) {
                        result += j;
                    }
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_3_47981d37_f351_4c85_94bf_9a4b5e5a96cd(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_58174803_9a78_4a9d_b40d_df5034120cc5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int num_of_pairs = 0;
        int min_value = Math.min(nums1.size(), nums2.size());
        for (int i = 0; i < min_value; ++i) {
            if (nums1.get(i) == nums2.get(i)) {
                ++num_of_pairs;
            }
        }
        return num_of_pairs;
    }

    
    public static int countSamePair_Problem_2_dd6b4816_d160_46c4_bee9_afb6ed032c96(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < nums1.size(); i++) {
            sum += nums1.get(i);
        }
        for(int i = 0; i < nums2.size(); i++) {
            sum += nums2.get(i);
        }
        for(int i = 0; i < nums1.size(); i++) {
            count += (sum - nums1.get(i)) * (sum - nums2.get(i));
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_ece47310_ce07_4b66_8899_6c98d3cc003e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // write your code here
        // write your code here
        // write your code here
        // write your code here
        // write your code here
        // write your code here
        // write your code here
        return 0;
    }

    
    public static int countSamePair_Problem_0_a039a1bd_c5e5_451c_bbf8_8e472ebf9e74(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int total = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    total++;
                }
            }
        }
        return total;
    }

    
    public static int countSamePair_Problem_3_2b4db0c7_3320_4f64_a4f0_94aa826e2763(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_672a2d76_5b73_4e6b_8abb_aaa68cc9c168(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int[] a1 = new int[nums1.size()];
        int[] a2 = new int[nums2.size()];
        for (int i = 0; i < nums1.size(); i++) {
            a1[i] = nums1.get(i);
        }
        for (int i = 0; i < nums2.size(); i++) {
            a2[i] = nums2.get(i);
        }
        Arrays.sort(a1);
        Arrays.sort(a2);
        int count = 0;
        for (int i = 1; i < a1.length; i++) {
            if (a1[i] == a2[i - 1]) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_c8f602b0_410a_48ea_b8e3_dfcee301e6b6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.stream().max(Integer::compareTo).get();
        int max2 = nums2.stream().max(Integer::compareTo).get();
        int maxDiff = max1 - max2;
        int min1 = nums1.stream().min(Integer::compareTo).get();
        int min2 = nums2.stream().min(Integer::compareTo).get();
        int minDiff = min1 - min2;
        if (maxDiff != minDiff) {
            count = maxDiff - minDiff;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_40f802c7_4ebc_406f_8bba_ebc21d02c153(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int samePairs = 0;
        int num;
        for(int i = 0; i < nums1.size(); i++){
            num = nums1.get(i);
            if(nums2.contains(num)){
                samePairs++;
            }
        }
        return samePairs;
    }

    
    public static int countSamePair_Problem_3_33bc0201_15cc_4b31_9e96_12d86129ba85(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (Integer num1 : nums1){
            for (Integer num2 : nums2){
                if (num1 == num2){
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_1ac70470_7fc1_4b62_984d_7ed55608e5f4(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int len = nums1.size();
        int sum = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    sum++;
                }
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_1_847ccfeb_3513_45df_9aee_3da8ccb24b22(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_e9597d77_dcce_4c69_aa1c_81e81d8562ea(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int current1 = nums1.get(i);
            int current2 = nums2.get(i);
            if (current1 == current2) {
                count++;
            }
            if (current1 > max1) {
                max1 = current1;
            }
            if (current2 > max2) {
                max2 = current2;
            }
            if (current1 < min1) {
                min1 = current1;
            }
            if (current2 < min2) {
                min2 = current2;
            }
            sum += current1;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_353c7d36_cc4f_4620_82a6_1a9e3ed0f3be(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int sum = 0;
        int n = nums1.size();
        for (int i = 0; i < n; i++) {
            if (nums1.get(i) == nums2.get(i)) {
                sum++;
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_3_b05bb83f_072c_4b70_ae23_18f4bcb574df(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_91c0bb15_e165_4206_a5c5_9c44c1a64163(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here.
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int n1 = nums1.get(i);
            int n2 = nums2.get(i);
            if (n1 != n2) {
                if (n1 < n2) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_92812d82_403a_4550_91c3_a22629e287cd(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_0_19395283_49a4_4449_95ca_ebd346235e88(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_560b6b79_b5ca_4381_878c_d2965407b4f5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for(int i=0;i<nums1.size();i++) {
            if(nums1.get(i) == nums2.get(i)) {
                result++;
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_1_473773fd_f173_40b8_8ce0_83c8e8983525(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int samePairs = 0;
        int sameValuesIndexes = 0;
        int j = 0;

        for(int i=0; i<nums1.size() && j<nums2.size(); i++) {
            int val1 = nums1.get(i);
            int val2 = nums2.get(j);

            if(val1 == val2) {
                samePairs++;
                sameValuesIndexes++;
            }
            j++;
        }

        return sameValuesIndexes;
    }

    
    public static int countSamePair_Problem_1_ba3e1b62_3388_4831_8471_695e81ab85ec(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_637450f5_0515_4fcd_8ddb_5c3a4ca5ac96(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff != minDiff) {
            count = maxDiff + minDiff;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_982e0bcc_756f_4d03_a6b5_a431c6eda9d1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_7557985a_1d77_4e22_8431_e67a1ac6fad2(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        if (nums1 == null || nums2 == null || nums1.size() != nums2.size()) {
            return count;
        }
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i).equals(nums2.get(i))) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_2ebcf6ec_a4a7_40cf_86e1_28efcb51b694(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_6282a880_b632_4a44_b4a5_fc1f2f9b7d50(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int mid1 = max1 + (max2 - min1) / 2;
        int mid2 = max2 + (max1 - min2) / 2;
        int diff1 = mid1 - min1;
        int diff2 = mid2 - min2;
        int diff3 = max1 - max2;
        if (diff1 < diff2 && diff1 < diff3) {
            count = count + 1;
        }
        if (diff2 < diff1 && diff2 < diff3) {
            count = count + 1;
        }
        if (diff3 < diff1 && diff3 < diff2) {
            count = count + 1;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_07da9f5f_516f_45f5_9474_78510b3f8a84(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Declare a int variable to hold counter
        int counter = 0;
        // For each value in nums1
        for (Integer num1 : nums1) {
            // If same value in nums2
            if (nums2.contains(num1)) {
                // Add 1 to counter
                counter++;
            }
        }
        // Return counter
        return counter;
    }

    
    public static int countSamePair_Problem_3_d634943e_ce51_4c67_aa3f_2b280d0a4d5a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i).equals(nums2.get(j))) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_aa28c26c_e182_4a19_a76e_4aef445939da(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if (num1 == max1 && num2 == max2) {
                count++;
            } else if (num1 == max1 && num2 == min2) {
                count++;
            } else if (num1 == min1 && num2 == max2) {
                count++;
            } else if (num1 == min1 && num2 == min2) {
                count++;
            } else if (num1 == max2 && num2 == min1) {
                count++;
            } else if (num1 == min2 && num2 == max1) {
                count++;
            } else if (num1 == max2 && num2 == min2) {
                count++;
            } else if (num1 == min2 && num2 == min1) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_12608730_59f1_4b58_b833_8a918a9d0aad(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff > minDiff) {
            count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_d491774b_37f9_4692_a199_fab4706bd23a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        HashSet<Integer> set1 = new HashSet<>(nums1);
        HashSet<Integer> set2 = new HashSet<>(nums2);
        for(Integer i : set1){
            if(set2.contains(i)){
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_5ffb90aa_255d_4b33_95d3_c631711138d0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_84f6b94a_1cb6_4b04_be70_484f950048bb(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        Map<Integer, Integer> counts = new HashMap<>();
        counts.put(0L, 0L);
        for (int i = 0; i < nums1.size(); i++) {
            counts.put(nums1.get(i), counts.getOrDefault(nums1.get(i), 0L) + 1);
        }
        int count = 0L;
        for (int i = 0; i < nums2.size(); i++) {
            if (counts.containsKey(nums2.get(i))) {
                count += counts.get(nums2.get(i));
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_77cc5430_671a_4ca3_9f55_84aaf06f729c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i=0; i<nums1.size(); i++) {
            for(int j=i+1; j<nums1.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_2e882707_b49d_460d_98d4_e2e60f4d7665(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_2_8d8d6d4a_f568_412a_a435_fdf40e523162(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_bbef5eaa_b409_460b_affc_71fae569b3cb(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int counter = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i).equals(nums2.get(i))) {
                counter++;
            }
        }
        return counter;
    }

    
    public static int countSamePair_Problem_1_14201f96_86a1_4c43_b3c1_34a14ba14388(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_5387ec4a_7029_4432_a181_374700cda4f9(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        int size = nums1.size();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    result += 1;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_2_da135745_a753_4779_9bb5_850c739be176(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = i + 1; j < nums1.size(); j++) {
                if (nums1.get(i).equals(nums1.get(j))) {
                    sum++;
                }
            }
        }
        for (int i = 0; i < nums2.size(); i++) {
            for (int j = i + 1; j < nums2.size(); j++) {
                if (nums2.get(i).equals(nums2.get(j))) {
                    sum++;
                }
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_3_4c74bbb3_662a_4ddc_b779_fb951eb50245(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        if(nums1.size() == nums2.size()) {
            for(int i=0; i<nums1.size(); i++) {
                if(nums1.get(i) == nums2.get(i)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_0_cf17457b_400e_4c26_9dda_a0f8a5913664(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int mid1 = max1 + (max2 - min1) / 2;
        int mid2 = max1 + (max2 - min1) / 2;
        int mid = mid1 + (mid2 - min1) / 2;
        int diff1 = max1 - mid1;
        int diff2 = max2 - mid2;
        int diff = mid - min1;
        if (diff1 == diff2 && diff1 == diff) {
            count++;
            sum += max1 - min1;
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_878d09da_9280_499e_9286_873e377b1e11(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int countsame = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j))
                    countsame++;
            }
        }
        return countsame;
    }

    
    public static int countSamePair_Problem_0_6361c4cf_ab07_4ace_bfa6_8db420319269(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for (int i = 0; i < nums1.size(); ++i) {
            if (nums1.get(i) == nums2.get(i)) {
                result++;
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_2_0f076540_a3cc_4f19_bb1e_5fea519488c4(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int size = nums1.size();
        int size2 = nums2.size();
        if (size != size2) {
            throw new IllegalArgumentException("The two arrays must be the same size");
        }
        return nums1.stream().mapToInteger((Integer l) -> l).distinct().count();
    }

    
    public static int countSamePair_Problem_2_4c74bbb3_662a_4ddc_b779_fb951eb50245(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        if(nums1.size() == nums2.size()) {
            for(int i=0; i<nums1.size(); i++) {
                if(nums1.get(i) == nums2.get(i)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_0_b7c6ad9c_2f66_4ed8_a9bb_318e6180f111(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_e59cf106_9b44_4178_9073_17beb35c4c45(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_a287326b_9c28_413e_ab06_615299d70b77(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_b8d8a20e_85dc_4771_a926_ff22acdfa9c0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count=0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_bdb69997_a2bb_49e4_b5cf_be49d2037eb4(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_d8b592f1_a846_4e79_aa0d_653bc9aeb6d5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int countsame = 0;
        int x = nums1.get(0);
        int y = nums2.get(0);
        int count = 0;
        while (x != y) {
            if (x == nums2.get(0)) {
                count++;
            }
            countsame++;
            count++;
            x = nums1.get(0);
            y = nums2.get(0);
        }
        return countsame;
    }

    
    public static int countSamePair_Problem_2_30d8d68c_146b_436a_9c7a_5561ab1d5eb1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // This is the solution to the problem.
        // You can modify the return statement to return the answer you want.
        // You can also add other methods, classes, etc.
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_3ae9bf24_55da_439b_9d13_ecaa81b6ef3e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int samePair = 0;
        int idx = 0;
        for(int i =0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                samePair++;
            }
        }
        return samePair;
    }

    
    public static int countSamePair_Problem_3_21999e3b_66ab_4f44_bbed_e57971017e38(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        ArrayList<Integer> countList = new ArrayList<Integer>();
        int count = 0;
        for (Integer num : nums1) {
            if (nums2.contains(num)) {
                countList.add(num);
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_7876cb98_abdd_4355_aceb_59a77b44f0c2(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            Integer value = nums1.get(i);
            if(nums2.contains(value)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_f77175f5_da6f_4fea_af08_b837a8d3efb8(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_5f6def31_bc2c_4389_9aed_a740a7709129(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_7ddd56b3_251e_4b86_b7fc_8b565b37ca6e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int same = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    same++;
                }
            }
        }
        return same;
    }

    
    public static int countSamePair_Problem_0_dcde38f4_8253_4681_8824_d87ce17fdfbd(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_ac064ae6_84c6_4e15_818a_27528bcb7e08(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // write your code here
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_cacdce31_fc9a_422e_b8d5_8deb2b8e1493(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // The length of the two arrays
        int n1 = nums1.size();
        int n2 = nums2.size();
        // Initialise variables
        int count = 0;
        boolean same = True;
        for (int i = 0; i < n1; i++) {
            if (nums1.get(i) != nums2.get(i)) {
                same = False;
                break;
            }
        }
        if (same) {
            count = 0;
            for (int i = 0; i < n1; i++) {
                if (nums1.get(i) == nums2.get(i)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_85ff4fca_a553_4ce4_8e18_87c2c8eacdda(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        int temp = 0;
        int temp2 = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_75c313b0_9393_4244_b11a_d0c8b65e945a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int size = nums1.size();
        int result = 0;
        int sum = 0;
        for(int i = 0; i < size; i++) {
            sum += nums1.get(i);
            sum += nums2.get(i);
            for(int j = 1; j < size; j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    result += 1;
                }
            }
        }
        return result - sum;
    }

    
    public static int countSamePair_Problem_3_3704af7f_70d8_449f_a79c_00fa1379050d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_f437cd54_5ff6_495d_85c6_2d97de64c924(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_fa561206_1218_4fa5_af6f_25e484b97c0c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_796acd94_7d66_4dcf_8dce_9364440938cf(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer num : nums1) {
            if (map.containsKey(num)) {
                count++;
            }
            map.put(num, 1L);
        }
        for (Integer num : nums2) {
            if (map.containsKey(num)) {
                count++;
            }
            map.put(num, 1L);
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_672a2d76_5b73_4e6b_8abb_aaa68cc9c168(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int[] a1 = new int[nums1.size()];
        int[] a2 = new int[nums2.size()];
        for (int i = 0; i < nums1.size(); i++) {
            a1[i] = nums1.get(i);
        }
        for (int i = 0; i < nums2.size(); i++) {
            a2[i] = nums2.get(i);
        }
        Arrays.sort(a1);
        Arrays.sort(a2);
        int count = 0;
        for (int i = 1; i < a1.length; i++) {
            if (a1[i] == a2[i - 1]) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_9bd62295_2b40_46f9_8fba_f38b8dae10e0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int[] unique1 = new int[nums1.size()];
        int[] unique2 = new int[nums2.size()];

        // copy unique lists to new arrays
        for(int i = 0; i<nums1.size(); i++)
            unique1[i] = nums1.get(i);

        for(int i = 0; i<nums2.size(); i++)
            unique2[i] = nums2.get(i);

        // check if values in unique1 are in unique2
        for(int i = 0; i<unique1.length; i++)
            if(unique2[i] == unique1[i])
                return i;

        // if not, no pair
        return -1;
    }

    
    public static int countSamePair_Problem_2_6efdd30d_c8d5_4853_9d4d_fc49dda9e43d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        Integer[] arr = new Integer[nums1.size()];
        nums1.toArray(arr);
        int ind = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_8b2fc8ad_eb53_4307_82d9_b429612f4fce(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int firstIndex = -1;
        int secondIndex = -1;
        int size = nums1.size();
        for(int i = 0; i < size; i++) {
            for(int j = i + 1; j < size; j++) {
                if((nums1.get(i) == nums1.get(j)) && (nums2.get(i) == nums2.get(j))) {
                    count++;
                    firstIndex = i;
                    secondIndex = j;
                }
            }
        }
        
        return count;
    }

    
    public static int countSamePair_Problem_0_90bc40bd_52f2_4675_8a75_4e8a6e9c0f90(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_c1db34cd_8f4c_4693_b81b_730c2e6d0e47(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_5364da97_8ddb_4a42_bcaf_1c27ae68e111(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int val1 = nums1.get(i);
            int val2 = nums2.get(i);
            if (val1 == val2)
                count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_e82117f3_f27b_43b5_ae82_0c3964216828(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size()-1);
        int max2 = nums2.get(nums2.size()-1);
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_9a00d206_07c6_4109_8d94_a18650ab6e44(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int pairs = 0;
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                if (num1 == num2) pairs += 1;
            }
        }
        return pairs;
    }

    
    public static int countSamePair_Problem_2_b55a3fe7_8c06_47a8_91b0_5f9cae915cb5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_dd786725_836d_438a_8b2d_6019560b419b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        int max1 = nums1.stream().max(Integer::compareTo).get();
        int max2 = nums2.stream().max(Integer::compareTo).get();
        int min1 = nums1.stream().min(Integer::compareTo).get();
        int min2 = nums2.stream().min(Integer::compareTo).get();
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff != minDiff) {
            count = maxDiff - minDiff;
            sum = maxDiff + minDiff;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_b8d55759_8dbd_4183_b46e_299b7b78dd1e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // We should return 0 when nums1 and nums2 are both empty. Otherwise, the answer is equal to the sum of the number of indices in nums1 that have exactly the same value as nums2
        // If there is only one number in nums1, there can be no indices in nums2 that have exactly the same value as nums1. However, if there are two or more numbers in nums1, there can be any number of indices in nums2 that have exactly the same value as nums1.
        int sameCount = 0;
        for (int i = 0; i < nums1.size() && i < nums2.size(); i++) {
            if (nums1.get(i) == nums2.get(i))
                sameCount++;
        }
        if (nums1.size() == 1)
            sameCount = nums2.size() - sameCount;
        return sameCount;
    }

    
    public static int countSamePair_Problem_3_aaca1395_0d65_48b5_988a_9f94717e1253(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0; // Initialize count
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_76b24447_5f3d_4390_987f_b02379c96a02(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int size1 = nums1.size();
        int size2 = nums2.size();
        int count = 0;
        if (size1 > size2) return count;
        for (int i = 0; i < size1; i++) {
            boolean same = True;
            for (int j = 0; j < size2; j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    same = False;
                }
            }
            if (same) count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_94f16011_c7db_42dc_a2c7_523d4ee4cb14(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                result++;
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_1_3f03b48b_ed42_4e73_a495_b3fc4fe6715b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_5ffb90aa_255d_4b33_95d3_c631711138d0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_f6b1b66a_d134_461b_9e1d_09b9dea0b2e1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0L;
        for (int x : nums1) {
            boolean found = False;
            for (int y : nums2) {
                if (x == y) {
                    found = True;
                    break;
                }
            }
            if (found)
                count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_ab23b2c6_cb2c_43fd_93e6_55e6f1470c2d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int size1 = nums1.size();
        int size2 = nums2.size();

        // Iterate through all combinations
        for (int i1 = 0; i1 < size1; i1++) {
            int num1 = nums1.get(i1);
            for (int i2 = 0; i2 < size2; i2++) {
                int num2 = nums2.get(i2);

                if (num1 == num2)
                    return i1 * size2 + i2;
            }
        }
        return -1; // No pairs found
    }

    
    public static int countSamePair_Problem_1_2c5fea74_bad1_4f82_9eb5_7b337178f4e3(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int cnt = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                cnt++;
            }
        }
        return cnt;
    }

    
    public static int countSamePair_Problem_2_3ae9bf24_55da_439b_9d13_ecaa81b6ef3e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int samePair = 0;
        int idx = 0;
        for(int i =0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                samePair++;
            }
        }
        return samePair;
    }

    
    public static int countSamePair_Problem_1_d6ae4036_df05_4ed6_b21a_70308c21bffe(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // The solution only works for two unique array lists
        if(nums1.size() != nums2.size()) {
            return -1L;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums1.size(); i++) {
            set.add(nums1.get(i));
        }
        for(int i = 0; i < nums2.size(); i++) {
            if(set.contains(nums2.get(i))) {
                set.add(nums2.get(i));
            }
        }
        return set.size();
    }

    
    public static int countSamePair_Problem_0_ab089927_932c_4154_96bd_f05518875208(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        return nums1.stream()
            .map(a -> nums2.indexOf(a))
            .filter( e -> e != -1 )
            .count();
    }

    
    public static int countSamePair_Problem_0_4570dc50_8b8e_4451_8170_d719078e6462(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = i + 1; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_04caf1ce_423b_48e3_a2b1_eff323663377(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for(int i = 0; i < nums1.size(); i++) {
            int j = 0;
            while(j < nums2.size() && nums1.get(i) == nums2.get(j)) {
                j++;
            }
            result += nums1.get(i) == nums2.get(j) ? 1 : 0;
        }
        return result;
    }

    
    public static int countSamePair_Problem_2_2b91d320_52d4_4219_b3ad_24894d0011a5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // write your code here
        int count = 0;
        for (int i = 0; i < nums1.size(); ++i) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_984f34bd_77eb_4aae_8172_844dce15ec7f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int total = 0;
        for (int i = 0; i < nums1.size() - 1; i++) {
            if (nums1.get(i) == nums2.get(i)) {
                total += 1;
            }
        }
        return total;
    }

    
    public static int countSamePair_Problem_3_d8b592f1_a846_4e79_aa0d_653bc9aeb6d5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int countsame = 0;
        int x = nums1.get(0);
        int y = nums2.get(0);
        int count = 0;
        while (x != y) {
            if (x == nums2.get(0)) {
                count++;
            }
            countsame++;
            count++;
            x = nums1.get(0);
            y = nums2.get(0);
        }
        return countsame;
    }

    
    public static int countSamePair_Problem_3_a18e80c7_8f9f_49c7_aa7e_756609c66c56(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int num1Index = -1;
        int num2Index = -1;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                num1Index = i;
                num2Index = i;
            }
        }
        for(int i = 0; i < nums2.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                num1Index = i;
                num2Index = i;
            }
        }
        if(num1Index != -1 && num2Index != -1) {
            count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_00a8dbc6_dc64_4752_b634_f9d5da7cbd04(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        if(nums1.size() != nums2.size())
            throw new IllegalArgumentException();
        Integer[] array1 = nums1.toArray(new Integer[nums1.size()]);
        Integer[] array2 = nums2.toArray(new Integer[nums2.size()]);
        int result = 0;
        for(int i = 0; i < array1.length; ++i){
            if(array1[i] == array2[i])
                result += i;
        }
        return result;
    }

    
    public static int countSamePair_Problem_2_f53bdc11_ab49_4324_a56c_322807689442(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int numSame = 0;

        // Sort the two lists so we can compare them
        ArrayList<Integer> numsList = nums2;
        Collections.sort(numsList);

        for(int i=0; i<nums2.size(); i++) {
            int index = Collections.binarySearch(numsList, nums2.get(i));
            if (index >= 0) {
                numSame += 1;
                numsList.remove(i);
            }
        }

        return numSame;
    }

    
    public static int countSamePair_Problem_2_cf8e95b7_07d8_47c0_9975_78ce2ac9e942(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_d8bbd3c6_ed9c_40a5_8cdc_fcda60abf02c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_331ccb65_de0d_4f53_badd_e2c53f8b5da1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Note: The returned count should be a 32-bit unsigned integer.
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_fc6bba91_e60c_43b8_96c0_e38316686772(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i).equals(nums2.get(j))) {
                    count++;
                }
            }
        }
        
        return count;
    }

    
    public static int countSamePair_Problem_3_800247fb_9588_49df_8949_fa981a0d4786(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // TODO: Complete this method
        int totalPairCount = 0;
        int samePairCount = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    samePairCount++;
                }
            }
        }
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) != nums2.get(j)) {
                    totalPairCount++;
                }
            }
        }
        return samePairCount;
    }

    
    public static int countSamePair_Problem_1_55598ab2_81b1_4938_aa67_b069e5a4db34(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        return IntStream.range(0, nums1.size())
            .filter(i -> nums1.get(i) == nums2.get(i))
            .count();
    }

    
    public static int countSamePair_Problem_3_8430d407_6e1a_47c3_9e7f_3deff02e6a75(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    i = nums1.size();
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_1174586c_b5c1_425c_b104_cadf82e5463f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int l1 = nums1.size();
        int l2 = nums2.size();
        
        int i = 0, j = 0;
        
        while (i < l1 && j < l2) {
            if (nums1.get(i) == nums2.get(j)) {
                i++;
                j++;
            } else if (nums1.get(i) < nums2.get(j)) {
                i++;
            } else if (nums1.get(i) > nums2.get(j)) {
                j++;
            }
        }
        
        return i + j;
    }

    
    public static int countSamePair_Problem_0_e669ad81_2b2f_4bb3_bac0_1ed348606454(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_09913ea5_edf4_4434_b010_2fc0f30df03f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_53795a48_407d_4c02_91b8_cae9e5318a3b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_7d2bd4ec_03ef_420b_9866_52cfb8762cc1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int samePairCount = 0L;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i).equals(nums2.get(j))) {
                    samePairCount++;
                }
            }
        }
        return samePairCount;
    }

    
    public static int countSamePair_Problem_0_ab23b2c6_cb2c_43fd_93e6_55e6f1470c2d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int size1 = nums1.size();
        int size2 = nums2.size();

        // Iterate through all combinations
        for (int i1 = 0; i1 < size1; i1++) {
            int num1 = nums1.get(i1);
            for (int i2 = 0; i2 < size2; i2++) {
                int num2 = nums2.get(i2);

                if (num1 == num2)
                    return i1 * size2 + i2;
            }
        }
        return -1; // No pairs found
    }

    
    public static int countSamePair_Problem_0_5b22ffee_ad6d_4584_b9a7_5a3144cc89ae(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        // Loop over the 2 arrays
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                // Compare the 2 numbers 
                if (num1 == num2) {
                    // Increment the count
                    count++;
                }
            }
        }
        // Return the count variable
        return count;
    }

    
    public static int countSamePair_Problem_3_50e46fcf_325d_4f6c_8fa4_34a83d8abaf1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        int temp;
        for (int i = 0; i < nums1.size(); i++) {
            temp = nums1.get(i);
            sum += temp;
            if (nums2.contains(sum)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_999b16ec_1fad_4f53_a1af_9d01e79376bf(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_455a3932_29c0_4086_b2db_47c0426dce89(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_441430a9_2a37_4786_aca1_630502b7ca93(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int n = nums1.size();
        int m = nums2.size();
        int[] samePairs = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    samePairs[i]++;
                    break;
                }
            }
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            cnt += samePairs[i];
        }
        return cnt;
    }

    
    public static int countSamePair_Problem_3_14201f96_86a1_4c43_b3c1_34a14ba14388(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_796acd94_7d66_4dcf_8dce_9364440938cf(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer num : nums1) {
            if (map.containsKey(num)) {
                count++;
            }
            map.put(num, 1L);
        }
        for (Integer num : nums2) {
            if (map.containsKey(num)) {
                count++;
            }
            map.put(num, 1L);
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_c40bebd3_2ea3_407e_9efc_f01d94dbeaea(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0L;
        for (int i = 0; i < nums1.size(); i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if (num1 == num2) count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_d491774b_37f9_4692_a199_fab4706bd23a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        HashSet<Integer> set1 = new HashSet<>(nums1);
        HashSet<Integer> set2 = new HashSet<>(nums2);
        for(Integer i : set1){
            if(set2.contains(i)){
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_aaca1395_0d65_48b5_988a_9f94717e1253(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0; // Initialize count
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_850819b7_8423_4452_a692_3328eed8604d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int n = nums1.size();
        if(n != nums2.size()) {
            return 0L;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            Integer num1 = nums1.get(i);
            Integer num2 = nums2.get(i);
            if(!map.containsKey(num1)) {
                map.put(num1, 0);
            }
            if(!map.containsKey(num2)) {
                map.put(num2, 0);
            }
            if(map.get(num1).equals(map.get(num2))) {
                map.put(num1, map.get(num1) + 1);
                map.put(num2, map.get(num2) + 1);
            }
        }
        int sum = 0L;
        for(Integer key : map.keySet()) {
            if(map.get(key).equals(2)) {
                sum += map.get(key);
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_2_105c3c5c_51da_41de_b076_fa175c98800a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    sum += i;
                }
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_1_51c1afed_6695_4b19_8a28_160ac3b4b81b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_9aba959a_31cd_46bf_8687_3d49336102a6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size()-1);
        int max2 = nums2.get(nums2.size()-1);
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == max1 && nums2.get(i) == max2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_01419d17_58ce_4eb1_8ba2_2895fc96c04f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // write your logic here
        int numOne = 0;
        int numTwo = 0;
        int sum = 0;
        for(int i : nums1) {
            for(int j : nums2) {
                if(j == i) {
                    numOne++;
                }
                sum += j;
            }
        }
        if(numOne == nums2.size()) {
            return sum;
        } else {
            return -1;
        }
    }

    
    public static int countSamePair_Problem_1_5fa715c6_babf_4212_890f_1325619db372(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int size = Math.min(nums1.size(), nums2.size());
        int same = 0;
        for (int i=0; i<size; i++) {
            if (nums1.get(i) == nums2.get(i))
                same++;
        }
        return same;
    }

    
    public static int countSamePair_Problem_2_dd786725_836d_438a_8b2d_6019560b419b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        int max1 = nums1.stream().max(Integer::compareTo).get();
        int max2 = nums2.stream().max(Integer::compareTo).get();
        int min1 = nums1.stream().min(Integer::compareTo).get();
        int min2 = nums2.stream().min(Integer::compareTo).get();
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff != minDiff) {
            count = maxDiff - minDiff;
            sum = maxDiff + minDiff;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_f6801045_986b_4d8b_bbbc_13145045e33e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i).equals(nums2.get(i))) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_aee8664f_17dc_4ee0_8c25_14d1a25af456(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_2b744f42_9f2e_4e83_a3d3_d9edd5fd693e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_6c7c8f79_f1e2_4350_a839_446e9abed859(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int samePairs = 0;

        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                samePairs++;
            }
        }
        return samePairs;
    }

    
    public static int countSamePair_Problem_0_57990b01_82a1_4ef9_9a68_36b16a84e62d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_fd7ef3b7_78dc_4e45_af94_4ed9b7daeabd(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_c40bebd3_2ea3_407e_9efc_f01d94dbeaea(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0L;
        for (int i = 0; i < nums1.size(); i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if (num1 == num2) count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_a8b6955a_9e11_4fd0_aaa9_ceb5e027bf3b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_dca3f40a_720a_4575_9d79_6ff4a9c7b1ae(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_98e6d2e3_0613_4cd2_b2fc_2c0a0c2c57cc(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int countSame = 0;
        for(int i=0; i<nums1.size(); i++) {
            for(int j=0; j<nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    countSame++;
                }
            }
        }
        return countSame;
    }

    
    public static int countSamePair_Problem_2_fe711868_bf83_40c6_80d5_d9b40dd96a60(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i).equals(nums2.get(j))) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_d7849fe2_69bb_43e9_83a9_7d2bb741dc3a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int counter = 0;
        for(int i=0; i<nums1.size(); i++) {
            for(int j=i+1; j<nums1.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    counter++;
                    break;
                }
            }
        }
        return counter;
    }

    
    public static int countSamePair_Problem_1_ffdbe437_2ebb_4c92_b9a5_f10c54a0a999(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your answer here
        int sum = 0;
        for( int i = 0; i < nums1.size(); i++){
            int j = 0;
            for( ; j < nums2.size(); j++){
                if( nums1.get(i) == nums2.get(j) ) sum += 1;
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_2_47981d37_f351_4c85_94bf_9a4b5e5a96cd(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_878d09da_9280_499e_9286_873e377b1e11(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int countsame = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j))
                    countsame++;
            }
        }
        return countsame;
    }

    
    public static int countSamePair_Problem_0_3ad5c9ee_1455_4ca5_a524_6f1f4c83a177(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < nums1.size(); i++) {
            sum1 += nums1.get(i);
        }
        for (int i = 0; i < nums2.size(); i++) {
            sum2 += nums2.get(i);
        }
        if (sum1 == sum2) {
            for (int i = 0; i < nums1.size(); i++) {
                if (nums1.get(i) == max1 && nums2.get(i) == max2) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_c0fc2a72_569e_4968_b2fa_deda65147c11(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int i = 0;
        int j = 0;
        int nums1_size = nums1.size();
        int nums2_size = nums2.size();
        int count = 0;
        while (i < nums1_size && j < nums2_size) {
            if (nums1.get(i) == nums2.get(j)) {
                count++;
                i++;
                j++;
            } else {
                i++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_955c85fa_cc75_4db5_a6bd_b1b91787eb59(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // TODO Auto-generated method stub
        int countSamePair_Problem_3_955c85fa_cc75_4db5_a6bd_b1b91787eb59 = 0;
        for(int i=0; i < nums1.size(); i++) {
            for(int j=0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    countSamePair_Problem_3_955c85fa_cc75_4db5_a6bd_b1b91787eb59++;
                }
            }
        }
        return countSamePair_Problem_3_955c85fa_cc75_4db5_a6bd_b1b91787eb59;
    }

    
    public static int countSamePair_Problem_2_2a5a23a1_c9d0_4a8b_85b6_3f8c91171f75(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_62190d2c_adf6_4a76_a24a_33234abddd34(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); ++i) {
            for(int j = 0; j < nums2.size(); ++j) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_7a2cb560_c8a2_4efd_a679_ba45414656d7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int countSamePair_Problem_3_7a2cb560_c8a2_4efd_a679_ba45414656d7 = 0;
        for(int i = 0; i <= nums1.size(); i++) {
            for(int j=0; j <= nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    countSamePair_Problem_3_7a2cb560_c8a2_4efd_a679_ba45414656d7++;
                }
            }
        }
        return countSamePair_Problem_3_7a2cb560_c8a2_4efd_a679_ba45414656d7;
    }

    
    public static int countSamePair_Problem_0_aaa1ef65_1636_4568_8464_00481de34b18(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        HashSet<Integer> hs1 = new HashSet<Integer>();
        HashSet<Integer> hs2 = new HashSet<Integer>();

        for (Integer e : nums1) {
            hs1.add(e);
        }

        for (Integer e : nums2) {
            hs2.add(e);
        }

        for (Integer e : hs1) {
            if (hs2.contains(e)) {
                count++;
            }
        }

        return count;
    }

    
    public static int countSamePair_Problem_3_4f9fcd48_8562_48fc_bae4_1e362854c442(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0; // Initializing count with zero
        for (int i = 0; i < nums1.size() && i < nums2.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) { // Checks both lists elements match with the current index
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_f6b1b66a_d134_461b_9e1d_09b9dea0b2e1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0L;
        for (int x : nums1) {
            boolean found = False;
            for (int y : nums2) {
                if (x == y) {
                    found = True;
                    break;
                }
            }
            if (found)
                count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_65b20d2c_ea4c_4e86_aebc_6ede1c13ecf9(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        Integer[] num1 = nums1.stream().toArray(Integer[]::new);
        Integer[] num2 = nums2.stream().toArray(Integer[]::new);
        int count = 0;
        for(int i = 0; i < num1.length; i++) {
            if(num1[i] == num2[i]) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_55598ab2_81b1_4938_aa67_b069e5a4db34(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        return IntStream.range(0, nums1.size())
            .filter(i -> nums1.get(i) == nums2.get(i))
            .count();
    }

    
    public static int countSamePair_Problem_2_96905a6d_b8ae_4006_b659_45e73f13e355(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int countSamePair_Problem_2_96905a6d_b8ae_4006_b659_45e73f13e355 = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    countSamePair_Problem_2_96905a6d_b8ae_4006_b659_45e73f13e355++;
                }
            }
        }
        return countSamePair_Problem_2_96905a6d_b8ae_4006_b659_45e73f13e355;
    }

    
    public static int countSamePair_Problem_2_4c76b924_1780_489d_99a6_3ceee9cf3f01(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            sum += nums1.get(i);
        }
        for (int i = 0; i < nums2.size(); i++) {
            sum += nums2.get(i);
        }
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_d6ae4036_df05_4ed6_b21a_70308c21bffe(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // The solution only works for two unique array lists
        if(nums1.size() != nums2.size()) {
            return -1L;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums1.size(); i++) {
            set.add(nums1.get(i));
        }
        for(int i = 0; i < nums2.size(); i++) {
            if(set.contains(nums2.get(i))) {
                set.add(nums2.get(i));
            }
        }
        return set.size();
    }

    
    public static int countSamePair_Problem_2_f8f86c23_3a43_411e_ae3d_df8e0dcd3005(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_eb179196_f4ba_469a_b1bb_cbb42f19f6af(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_57990b01_82a1_4ef9_9a68_36b16a84e62d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_5aa9ef34_d651_4df4_99fb_58b740a4a4af(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if (nums1.size() != nums2.size()) {
            return -1;
        }
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                sum++;
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_0_9e7b9f28_6c3a_4c91_9490_71109db42aa1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_c45e3102_11ae_4999_bcbf_5ff5197657b5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int len1 = nums1.size();
        int len2 = nums2.size();
        for(int i = 0; i < len1 - 1; i++) {
            for(int j = 0; j < len2 - 1; j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_cacdce31_fc9a_422e_b8d5_8deb2b8e1493(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // The length of the two arrays
        int n1 = nums1.size();
        int n2 = nums2.size();
        // Initialise variables
        int count = 0;
        boolean same = True;
        for (int i = 0; i < n1; i++) {
            if (nums1.get(i) != nums2.get(i)) {
                same = False;
                break;
            }
        }
        if (same) {
            count = 0;
            for (int i = 0; i < n1; i++) {
                if (nums1.get(i) == nums2.get(i)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_bff862f1_a584_478d_91c1_30257a5112e0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i=0; i < nums1.size(); i++){
            for(int j=0; j < nums2.size(); j++){
                if(nums1.get(i) == nums2.get(j)){
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_696b79b0_87ab_4771_b09f_1c4553b16e05(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int res = 0;
        int cnt = 0;
        int i = 0, j = 0;
        while (i < nums1.size() && j < nums2.size()) {
            if (nums1.get(i).equals(nums2.get(j))) {
                cnt++;
                i++;
                j++;
            } else {
                i++;
                j++;
            }
        }
        res = cnt;
        return res;
    }

    
    public static int countSamePair_Problem_1_5b9d3358_fde4_4fa4_a266_6c2210a2cce4(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_ffff3c5f_e933_4f20_be11_209288c5f78e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Complete this function
        int count = 0;
        for(int i = 0; i < nums1.size(); i++){
            for(int j = 0; j < nums2.size(); j++){
                if(nums1.get(i) == nums2.get(j)){
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_208adb6d_308d_45ac_91c4_18bfdf89fef1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            sum += nums1.get(i);
        }
        for (int i = 0; i < nums2.size(); i++) {
            sum += nums2.get(i);
        }
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == max1 && nums2.get(i) == max2) {
                count++;
            }
        }
        for (int i = 0; i < nums2.size(); i++) {
            if (nums1.get(i) == max1 && nums2.get(i) == max2) {
                count++;
            }
        }
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == max1 && nums2.get(i) == min2) {
                count++;
            }
        }
        for (int i = 0; i < nums2.size(); i++) {
            if (nums1.get(i) == max1 && nums2.get(i) == min2) {
                count++;
            }
        }
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == min1 && nums2.get(i) == max2) {
                count++;
            }
        }
        for (int i = 0; i < nums2.size(); i++) {
            if (nums1.get(i) == min1 && nums2.get(i) == max2) {
                count++;
            }
        }
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == min1 && nums2.get(i) == min2) {
                count++;
            }
        }
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == min1 && nums2.get(i) == min2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_3ad5c9ee_1455_4ca5_a524_6f1f4c83a177(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < nums1.size(); i++) {
            sum1 += nums1.get(i);
        }
        for (int i = 0; i < nums2.size(); i++) {
            sum2 += nums2.get(i);
        }
        if (sum1 == sum2) {
            for (int i = 0; i < nums1.size(); i++) {
                if (nums1.get(i) == max1 && nums2.get(i) == max2) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_ab089927_932c_4154_96bd_f05518875208(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        return nums1.stream()
            .map(a -> nums2.indexOf(a))
            .filter( e -> e != -1 )
            .count();
    }

    
    public static int countSamePair_Problem_1_7d2bd4ec_03ef_420b_9866_52cfb8762cc1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int samePairCount = 0L;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i).equals(nums2.get(j))) {
                    samePairCount++;
                }
            }
        }
        return samePairCount;
    }

    
    public static int countSamePair_Problem_3_024afd8f_4749_48ee_8f3a_8bd768d66e55(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        Iterator<Integer> itr = nums1.iterator();
        Iterator<Integer> itr2 = nums2.iterator();

        int first = itr.next();
        int second = itr2.next();

        while(itr.hasNext() && itr2.hasNext()) {
            if (itr.next() == itr2.next()) {
                count++;
            }
        }

        return count;
    }

    
    public static int countSamePair_Problem_0_966e43c1_6a2b_4b85_ab67_071ed34bf323(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // The number of pairs of indices where the arrays have a pairwise equal value should be the sum of the sizes of those arrays.
        int sum = 0;
        // A pair is defined as an index pair in either of the two arrays. 
        int[] indices = new int[2];
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                // The indices are defined as the two indices where the corresponding values match.
                if (nums1.get(i) == nums2.get(j)) {
                    indices[0] = i;
                    indices[1] = j;
                    sum = nums1.size() * nums2.size();
                }
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_2_6589e1d5_6290_464c_8ce1_ecc19a51cbd0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_bbbce57b_a0b3_4fdd_9d3c_f091563af8e0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_04caf1ce_423b_48e3_a2b1_eff323663377(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for(int i = 0; i < nums1.size(); i++) {
            int j = 0;
            while(j < nums2.size() && nums1.get(i) == nums2.get(j)) {
                j++;
            }
            result += nums1.get(i) == nums2.get(j) ? 1 : 0;
        }
        return result;
    }

    
    public static int countSamePair_Problem_3_fb87a2bd_28b1_4b77_b1a8_d09c58dcf655(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_fb87a2bd_28b1_4b77_b1a8_d09c58dcf655(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_7f2b645c_4e72_4c2e_b894_7349feb23d62(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int len = nums1.size();
        int ret = 0;
        for (int i = 0; i < len; i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if (num1 == num2) {
                ret++;
            }
        }
        return ret;
    }

    
    public static int countSamePair_Problem_1_2244c13c_7d95_41b2_9e91_1db507f07d1e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int size = nums1.size();
        int nums2index = 0;
        int nums1index = 0;
        int count = 0;
        while(nums2index < size) {
            if(nums1.get(nums1index) == nums2.get(nums2index)) {
                count++;
                nums1index++;
                nums2index++;
            } else if(nums1.get(nums1index) < nums2.get(nums2index)) {
                nums2index++;
            } else if(nums2.get(nums2index) < nums1.get(nums1index)) {
                nums1index++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_524ace8c_ff8d_4b79_aa47_3a0294f5007c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int tmp = 0;
        for(int i = 0; i < nums1.size(); i++) {
            tmp = nums1.get(i);
            for(int j = 0; j < nums2.size(); j++) {
                if(tmp == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_0e95904c_3876_43a1_b88f_29fb75136a10(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.stream().max(Integer::compareTo).get();
        int max2 = nums2.stream().max(Integer::compareTo).get();
        int min1 = nums1.stream().min(Integer::compareTo).get();
        int min2 = nums2.stream().min(Integer::compareTo).get();
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff == minDiff) {
            count = maxDiff + 1;
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_d1f9d582_9b33_4b4a_a07a_071f502a3ac2(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_dd786725_836d_438a_8b2d_6019560b419b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        int max1 = nums1.stream().max(Integer::compareTo).get();
        int max2 = nums2.stream().max(Integer::compareTo).get();
        int min1 = nums1.stream().min(Integer::compareTo).get();
        int min2 = nums2.stream().min(Integer::compareTo).get();
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff != minDiff) {
            count = maxDiff - minDiff;
            sum = maxDiff + minDiff;
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_a9be8eff_0f23_4892_9633_d42b22cf74ce(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        ArrayList <Integer> temp = new ArrayList<>();
        ArrayList <Integer> newNums1 = new ArrayList<>();
        ArrayList <Integer> newNums2 = new ArrayList<>();
        for(int i=0; i<nums1.size(); i++) {
            int first = nums1.get(i);
            int second = nums2.get(i);
            if(first == second) {
                temp.add(first);
                temp.add(second);
            } else {
                newNums1.add(first);
                newNums2.add(second);
            }
        }
        int count = newNums1.size();
        return count;
    }

    
    public static int countSamePair_Problem_0_f4c721d1_1d63_4b98_9fe9_a44c295150a7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int same = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    same++;
                }
            }
        }
        return same;
    }

    
    public static int countSamePair_Problem_1_b8b3b937_0d91_456c_9432_a1642f81755e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        boolean same = True;
        while ((same = True) && (nums1.size() > 0 && nums2.size() > 0)) {
            same = False;
            int smallest = nums1.size() > nums2.size() ? nums1.size() : nums2.size();
            int i = 0;
            int j = 0;
            if (smallest > 0) {
                for (; i <= smallest - 1; i++) {
                    if (nums1.get(i) == nums2.get(j)) {
                        same = True;
                        count++;
                    }
                }
            }
            if (smallest < nums1.size()) {
                for (; i <= nums1.size() - 1; i++) {
                    if (nums1.get(i) == nums2.get(j)) {
                        same = True;
                        count++;
                    }
                }
            }
            if (smallest > nums2.size()) {
                for (; i <= nums2.size() - 1; i++) {
                    if (nums1.get(i) == nums2.get(j)) {
                        same = True;
                        count++;
                    }
                }
            }
            i++;
            j++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_b0fadd03_e92a_4a27_a02b_c55c3fa4240b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_2_989648b6_6966_4e71_8fdf_7581a43338b1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int minValue = Math.min(nums1.get(0), nums2.get(0));
        int maxValue = Math.max(nums1.get(nums1.size()-1), nums2.get(nums2.size()-1));
        for (int value = minValue; value <= maxValue; value++) {
            if (nums1.contains(value) && nums2.contains(value)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_d6ecc4bb_7829_433c_959e_43718107df4f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            ArrayList<Integer> subNums1 = new ArrayList<>(nums1);
            subNums1.remove(i);
            for (int j = 0; j < nums2.size(); j++) {
                ArrayList<Integer> subNums2 = new ArrayList<>(nums2);
                subNums2.remove(j);
                if (subNums1.equals(subNums2)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_955c85fa_cc75_4db5_a6bd_b1b91787eb59(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // TODO Auto-generated method stub
        int countSamePair_Problem_0_955c85fa_cc75_4db5_a6bd_b1b91787eb59 = 0;
        for(int i=0; i < nums1.size(); i++) {
            for(int j=0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    countSamePair_Problem_0_955c85fa_cc75_4db5_a6bd_b1b91787eb59++;
                }
            }
        }
        return countSamePair_Problem_0_955c85fa_cc75_4db5_a6bd_b1b91787eb59;
    }

    
    public static int countSamePair_Problem_1_960599d8_a9dc_49c9_860c_9b50400ba3e9(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i=0;i<nums1.size();i++) {
            if (nums1.get(i)==nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_f67c9c7c_218e_469f_b4f7_b21ce5a5c611(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i).intValue() == nums2.get(j).intValue()) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_7cca4d67_78bf_44fe_ac63_480ea5520a82(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            sum += nums1.get(i);
        }
        for (int i = 0; i < nums2.size(); i++) {
            sum += nums2.get(i);
        }
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_c7547bea_2f56_4def_ace4_2b4114c3c0e5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff == minDiff) {
            count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_9de087fe_23c7_452c_8c8c_3643cdc1eb77(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            sum = sum + Math.abs(nums1.get(i) - nums2.get(i));
        }
        return sum;
    }

    
    public static int countSamePair_Problem_1_72876941_a980_4745_9c47_c1c346bc9234(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); ++i) {
            if(nums1.get(i).equals(nums2.get(i))) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_c40bebd3_2ea3_407e_9efc_f01d94dbeaea(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0L;
        for (int i = 0; i < nums1.size(); i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if (num1 == num2) count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_a82467b1_fd90_4d85_a971_1bb3f3b9bae1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int smallestNum = Collections.min(nums1);
        int largestNum = Collections.max(nums1);
        int smallestNum2 = Collections.min(nums2);
        int largestNum2 = Collections.max(nums2);

        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == smallestNum && nums2.get(i) == largestNum) {
                count++;
            }
        }

        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == smallestNum2 && nums2.get(i) == largestNum2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_1c99f120_d72e_494c_9b0d_0582514cb2f4(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    sum += i;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_bdfe56c2_0020_4704_8ad1_6864129c5357(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if(set.contains(num1)) {
                count++;
            }
            else {
                set.add(num1);
            }
            if(set.contains(num2)) {
                count++;
            }
            else {
                set.add(num2);
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_d6707972_76c6_48f8_8c00_05ced137e08e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // write your code here
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums1.size(); i++) {
            map.put(nums1.get(i), nums2.get(i));
        }
        int count = 0;
        for(Integer num: map.values()){
            if(map.get(num) != null){
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_d89489ad_9457_4ac8_ac9a_4cb460b2b8b5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_7f2b645c_4e72_4c2e_b894_7349feb23d62(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int len = nums1.size();
        int ret = 0;
        for (int i = 0; i < len; i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if (num1 == num2) {
                ret++;
            }
        }
        return ret;
    }

    
    public static int countSamePair_Problem_3_f5808dbe_a9a6_4e3f_9a31_5a5d0477c051(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // The number of pairs of equal values is the length of the intest array.
        int pairCount = 0;

        // Create a sorted list of all the values in the arrays. This list will be used to compare elements with the same values.
        ArrayList<Integer> values = new ArrayList<Integer>(nums1);
        for (int i = 0; i < nums1.size(); i++) {
            values.add(nums1.get(i));
        }

        // Create a sorted list of all the values in the arrays. This list will be used to compare elements with the same values.
        ArrayList<Integer> values2 = new ArrayList<Integer>(nums2);
        for (int i = 0; i < nums2.size(); i++) {
            values2.add(nums2.get(i));
        }

        // Compare the arrays. If two elements with the same values then increment the count for both arrays.
        for (int i = 0; i < values.size(); i++) {
            for (int j = 0; j < values2.size(); j++) {
                if (values.get(i) == values2.get(j)) {
                    pairCount++;
                }
            }
        }

        return pairCount;
    }

    
    public static int countSamePair_Problem_3_5d29c9c7_8006_46d0_8b5e_e6f92d84d685(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (Integer num1 : nums1) {
            for (Integer num2 : nums2) {
                if (num1 == num2) {
                    count += 1;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_f6cfdaa8_4a00_4012_90e9_323dbb625e0d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_0c32bae8_656b_450f_887b_979e434ef05a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_7a2cb560_c8a2_4efd_a679_ba45414656d7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int countSamePair_Problem_0_7a2cb560_c8a2_4efd_a679_ba45414656d7 = 0;
        for(int i = 0; i <= nums1.size(); i++) {
            for(int j=0; j <= nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    countSamePair_Problem_0_7a2cb560_c8a2_4efd_a679_ba45414656d7++;
                }
            }
        }
        return countSamePair_Problem_0_7a2cb560_c8a2_4efd_a679_ba45414656d7;
    }

    
    public static int countSamePair_Problem_2_796acd94_7d66_4dcf_8dce_9364440938cf(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer num : nums1) {
            if (map.containsKey(num)) {
                count++;
            }
            map.put(num, 1L);
        }
        for (Integer num : nums2) {
            if (map.containsKey(num)) {
                count++;
            }
            map.put(num, 1L);
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_37a93f64_8aa3_41d5_a901_fbd31fbe9dd5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int[] counts = new int[nums1.size()];
        // loop through all the numbers in the first list
        for (int i = 0; i < nums1.size(); i++) {
            // initialize a variable for storing the number of times
            // the array list has this number
            int same = 0;
            // loop through the second list to find how many times
            // this number appears
            for (int j = 0; j < nums2.size(); j++) {
                // if the first and second list have the same number
                // then the count++ will happen
                if (nums1.get(i) == nums2.get(j)) {
                    same++;
                }
            }
            // update this array list with the current count for that
            // number
            counts[i] = same;
        }
        // return the total number of times each number appears
        return Arrays.stream(counts).sum();
    }

    
    public static int countSamePair_Problem_1_aaca1395_0d65_48b5_988a_9f94717e1253(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0; // Initialize count
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_57990b01_82a1_4ef9_9a68_36b16a84e62d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_8bd60857_85da_42fc_8c3d_76aeb46dece7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int temp;
        for(int i = 0; i < nums1.size(); i++) {
            temp = nums1.get(i);
            for(int j = 0; j < nums2.size(); j++) {
                if(temp == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_89b2b6e1_c5bb_430f_a808_1b2692bf8ff7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_07da9f5f_516f_45f5_9474_78510b3f8a84(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Declare a int variable to hold counter
        int counter = 0;
        // For each value in nums1
        for (Integer num1 : nums1) {
            // If same value in nums2
            if (nums2.contains(num1)) {
                // Add 1 to counter
                counter++;
            }
        }
        // Return counter
        return counter;
    }

    
    public static int countSamePair_Problem_0_4cbb4271_b582_4c38_b974_ab96c0135382(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_b7c6ad9c_2f66_4ed8_a9bb_318e6180f111(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_7d299ce8_babc_437c_b1a5_7d071725471a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_d29dd7a3_53b4_4b6e_b113_08d59b7345c4(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        return nums1.stream()
                    .filter(n -> nums2.contains(n))
                    .count();
    }

    
    public static int countSamePair_Problem_2_24728fb2_9536_4f8d_8c65_69512c828074(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_21999e3b_66ab_4f44_bbed_e57971017e38(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        ArrayList<Integer> countList = new ArrayList<Integer>();
        int count = 0;
        for (Integer num : nums1) {
            if (nums2.contains(num)) {
                countList.add(num);
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_19395283_49a4_4449_95ca_ebd346235e88(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_d788aa26_d2d4_4105_9887_9030c1d4b17b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int same = 0;
        for(int i = 0; i < nums1.size() && i < nums2.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                same++;
            }
        }
        return same;
    }

    
    public static int countSamePair_Problem_2_5aa9ef34_d651_4df4_99fb_58b740a4a4af(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if (nums1.size() != nums2.size()) {
            return -1;
        }
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                sum++;
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_3_4c76b924_1780_489d_99a6_3ceee9cf3f01(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            sum += nums1.get(i);
        }
        for (int i = 0; i < nums2.size(); i++) {
            sum += nums2.get(i);
        }
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_ab9ca4a4_e160_47c5_813e_a1c3732497ba(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_93f0c9a8_4f16_4a41_b9b4_b2fbc29d7c38(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff != minDiff) {
            count = maxDiff - minDiff;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_800247fb_9588_49df_8949_fa981a0d4786(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // TODO: Complete this method
        int totalPairCount = 0;
        int samePairCount = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    samePairCount++;
                }
            }
        }
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) != nums2.get(j)) {
                    totalPairCount++;
                }
            }
        }
        return samePairCount;
    }

    
    public static int countSamePair_Problem_0_50e46fcf_325d_4f6c_8fa4_34a83d8abaf1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        int temp;
        for (int i = 0; i < nums1.size(); i++) {
            temp = nums1.get(i);
            sum += temp;
            if (nums2.contains(sum)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_d4cb6d24_ad58_4937_b135_99f16d3fdd34(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_6ad61454_4df7_4051_bcf6_8862b0ad9f55(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_ac064ae6_84c6_4e15_818a_27528bcb7e08(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // write your code here
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_e3d629ab_ed2c_4149_bb3e_2f4ca2a098aa(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_5f6def31_bc2c_4389_9aed_a740a7709129(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_a29ebac3_1441_44c6_92d4_9e692b785db8(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int minInd1 = -1, minInd2 = -1;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) < min1) {
                min1 = nums1.get(i);
                minInd1 = i;
            }
            if(nums2.get(i) < min2) {
                min2 = nums2.get(i);
                minInd2 = i;
            }
        }
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == min1 && nums2.get(i) == min2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_fb6046c8_2db1_4341_be8b_a6b68c52f551(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int min1 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        for (Integer value : nums1) {
            if (value < min1) {
                min1 = value;
            }
            if (value > max1) {
                max1 = value;
            }
        }
        int min2 = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (Integer value : nums2) {
            if (value < min2) {
                min2 = value;
            }
            if (value > max2) {
                max2 = value;
            }
        }
        int index1 = 0;
        for (int value : nums1) {
            index1++;
            int index2 = 0;
            for (int value2 : nums2) {
                index2++;
                if (value == value2) {
                    count += (index1 - index2);
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_e59cf106_9b44_4178_9073_17beb35c4c45(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_aac8758e_cfd3_490b_9799_6b554103b141(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            int n1 = nums1.get(i);
            int n2 = nums2.get(i);
            if(n1 == n2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_c64330bb_c32f_415e_9c15_44bfbff79c45(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = i + 1; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_775bf3cc_4100_4fbb_b09e_e8d340062a1b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int n = nums1.size();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if (num1 == num2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_017a8df9_29a2_41a8_a687_e20d05be8ec7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_4ff73d50_d7c8_4fb5_9f09_fabf1df63f2c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_e231b610_2ccf_423b_b06a_5464325a1479(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        HashSet<Integer> set1 = new HashSet<>(nums1);
        HashSet<Integer> set2 = new HashSet<>(nums2);
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (set1.contains(nums1.get(i))) count++;
        }
        for (int i = 0; i < nums2.size(); i++) {
            if (set2.contains(nums2.get(i))) count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_9ac7ceee_47b5_4e9a_ac76_4a0e1b92b619(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i).equals(nums2.get(i))) {
                count++;
                set.add(nums1.get(i));
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_dee772ce_3899_4786_a38f_923eda682533(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int n = nums1.size();
        int[] nums1s = new int[n];
        int[] nums2s = new int[n];
        for(int i = 0; i < n; i++) {
            nums1s[i] = nums1.get(i);
            nums2s[i] = nums2.get(i);
        }
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(nums1s[i] == nums2s[i]) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_52e238ea_4e1e_4bd4_b219_ee56cc768786(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        Integer result = 0L;
        Integer s1 = null, s2 = null;
        for (Integer num : nums1) {
            if (s1 == null) {
                s1 = num;
            } else {
                if (s1 == num) {
                    result++;
                } else {
                    s1 = num;
                }
            }
        }
        for (Integer num : nums2) {
            if (s2 == null) {
                s2 = num;
            } else {
                if (s2 == num) {
                    result++;
                } else {
                    s2 = num;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_3_a51c63c5_033c_4bcc_8129_b7812a266d3e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_fc6bba91_e60c_43b8_96c0_e38316686772(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i).equals(nums2.get(j))) {
                    count++;
                }
            }
        }
        
        return count;
    }

    
    public static int countSamePair_Problem_3_ad45f6d4_624d_4cc0_8c74_b1a21ac0e049(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_72876941_a980_4745_9c47_c1c346bc9234(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); ++i) {
            if(nums1.get(i).equals(nums2.get(i))) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_552f6d5f_7a60_4d0a_bd5a_0a5896e098d4(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_b0fadd03_e92a_4a27_a02b_c55c3fa4240b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_0_5d29c9c7_8006_46d0_8b5e_e6f92d84d685(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (Integer num1 : nums1) {
            for (Integer num2 : nums2) {
                if (num1 == num2) {
                    count += 1;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_5387ec4a_7029_4432_a181_374700cda4f9(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        int size = nums1.size();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    result += 1;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_2_6ad61454_4df7_4051_bcf6_8862b0ad9f55(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_fb87a2bd_28b1_4b77_b1a8_d09c58dcf655(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_b9298177_5084_4f9e_9c23_ce68b9cfcb44(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int i = 0, j = 0, same = 0;
        while (i < nums1.size()) {
            while (j < nums2.size()) {
                if (nums1.get(i) == nums2.get(j)) {
                    same++;
                    i++;
                    j++;
                } else {
                    j++;
                }
            }
            i++;
        }
        return same;
    }

    
    public static int countSamePair_Problem_3_dad26e32_0e21_4d15_995b_b380d61e2cf3(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_6187a30e_7257_4115_9966_192db6e24618(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_54a845e8_3672_4981_9acc_6b25c66b0461(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums1.size(); i++) {
            map.put(nums1.get(i), nums2.get(i));
        }
        for(int i = 0; i < nums1.size(); i++) {
            if(map.get(nums1.get(i)) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_12608730_59f1_4b58_b833_8a918a9d0aad(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff > minDiff) {
            count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_7fe14aad_5a4e_4bae_bd47_41a2e257b468(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int samePairCount = 0;
        for(int i=0; i<nums1.size() && i<nums2.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                samePairCount++;
            }
        }
        return samePairCount;
    }

    
    public static int countSamePair_Problem_3_17e1b432_2443_4e71_85ce_d7aed4b89573(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        return 0;
    }

    
    public static int countSamePair_Problem_3_6187a30e_7257_4115_9966_192db6e24618(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_9576786b_5b18_4d6e_93e3_dfe598464a88(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_005181b5_a6a2_452d_b64c_c73104f4048e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int samePair = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    samePair++;
                }
            }
        }
        return samePair;
    }

    
    public static int countSamePair_Problem_3_25548c37_df39_4b93_b51b_d0a5512c22e1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_a51c63c5_033c_4bcc_8129_b7812a266d3e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_eaeedb82_4727_4040_a515_b2607d0602a3(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if (num1 == num2)
                count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_937b1a26_e17e_4ada_b85d_9949f3348897(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_ac81386a_6e3e_44a2_9fb1_4d17f84dba96(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // your code here
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.size(); i++) {
            if (!set.add(nums1.get(i))) {
                return i;
            }
        }
        for (int i = 0; i < nums2.size(); i++) {
            if (!set.add(nums2.get(i))) {
                return i;
            }
        }
        return nums1.size();
    }

    
    public static int countSamePair_Problem_2_a06c4e1c_3922_46fc_a1da_8797e7cf7863(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // TODO: Fill in the blanks
        int indexCount = 0;
        for (int i = 0; i < nums1.size() && i < nums2.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                indexCount++;
            }
        }
        return indexCount;
    }

    
    public static int countSamePair_Problem_2_66e38f38_b7a3_4ad5_a33a_f0c4fcfd13e3(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff > minDiff) {
            count = maxDiff - minDiff;
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_14499119_a561_4807_bebf_e438ae9c7817(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        
        return count;
    }

    
    public static int countSamePair_Problem_2_314ba713_988b_43ff_afe0_05e928642dc6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        ArrayList<Integer> temp = nums1;
        ArrayList<Integer> temp2 = nums2;
        while(!temp.isEmpty() && !temp2.isEmpty()) {
            Integer l1 = temp.get(0);
            Integer l2 = temp2.get(0);
            if(l1 == l2) count++;
            temp.remove(0);
            temp2.remove(0);
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_8cbe3509_41ae_466a_9ffa_774dae767432(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        if (nums1.size() != nums2.size())
            return -1;

        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i))
                count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_7fe14aad_5a4e_4bae_bd47_41a2e257b468(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int samePairCount = 0;
        for(int i=0; i<nums1.size() && i<nums2.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                samePairCount++;
            }
        }
        return samePairCount;
    }

    
    public static int countSamePair_Problem_2_a2012f0b_6c00_44ce_b7dc_9a70b1acadc6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for(int i = 0; i < nums1.size(); ++i) {
            for(int j = 0; j < nums2.size(); ++j) {
                if(nums1.get(i) == nums2.get(j)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_3_e350a083_9d46_435d_a2d9_d643888acc9b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int len1 = nums1.size();
        int len2 = nums2.size();
        int count = 0;
        
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        
        return count;
    }

    
    public static int countSamePair_Problem_1_5364da97_8ddb_4a42_bcaf_1c27ae68e111(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int val1 = nums1.get(i);
            int val2 = nums2.get(i);
            if (val1 == val2)
                count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_98e6d2e3_0613_4cd2_b2fc_2c0a0c2c57cc(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int countSame = 0;
        for(int i=0; i<nums1.size(); i++) {
            for(int j=0; j<nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    countSame++;
                }
            }
        }
        return countSame;
    }

    
    public static int countSamePair_Problem_2_d89489ad_9457_4ac8_ac9a_4cb460b2b8b5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_3f03b48b_ed42_4e73_a495_b3fc4fe6715b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_9576786b_5b18_4d6e_93e3_dfe598464a88(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_2cb57b91_3b6d_4ac8_8ad9_77012e5e888b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j))
                    count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_aaa1ef65_1636_4568_8464_00481de34b18(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        HashSet<Integer> hs1 = new HashSet<Integer>();
        HashSet<Integer> hs2 = new HashSet<Integer>();

        for (Integer e : nums1) {
            hs1.add(e);
        }

        for (Integer e : nums2) {
            hs2.add(e);
        }

        for (Integer e : hs1) {
            if (hs2.contains(e)) {
                count++;
            }
        }

        return count;
    }

    
    public static int countSamePair_Problem_3_a38e76c5_3919_4e92_b0cf_2c0c1bd1eb31(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < nums1.size(); i++) {
            sum += nums1.get(i);
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_76ff891d_0186_4125_a733_ca21d0491574(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        if(nums1.size() != nums2.size()) {
            return count;
        }
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_df749f94_0be4_4cb8_9a55_84d6bf273cbb(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0L;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_8d977fe5_e560_44e2_bf73_a8d00a14e442(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int num : nums1){
            for(int num2 : nums2){
                if(num == num2)
                    count += 1;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_5bf0cdb8_a374_427d_baa7_acf00dca8297(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // write your code here
        int retval = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int val1 = nums1.get(i);
            for (int j = 0; j < nums2.size(); j++) {
                int val2 = nums2.get(j);
                if (val1 == val2) {
                    retval++;
                    break;
                }
            }
        }
        return retval;
    }

    
    public static int countSamePair_Problem_0_bbef5eaa_b409_460b_affc_71fae569b3cb(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int counter = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i).equals(nums2.get(i))) {
                counter++;
            }
        }
        return counter;
    }

    
    public static int countSamePair_Problem_1_e3d629ab_ed2c_4149_bb3e_2f4ca2a098aa(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_809e9efe_6ae4_44e9_81f1_2ea11bfb5fd1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if (nums1.size() != nums2.size()) return 0;
        
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_f3dab9f7_6071_46b2_8eca_325dd5189801(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int size = nums1.size();
        if (size != nums2.size()) return 0;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_25548c37_df39_4b93_b51b_d0a5512c22e1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_25548c37_df39_4b93_b51b_d0a5512c22e1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_dd6b4816_d160_46c4_bee9_afb6ed032c96(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < nums1.size(); i++) {
            sum += nums1.get(i);
        }
        for(int i = 0; i < nums2.size(); i++) {
            sum += nums2.get(i);
        }
        for(int i = 0; i < nums1.size(); i++) {
            count += (sum - nums1.get(i)) * (sum - nums2.get(i));
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_ac62ca9d_72d5_4cd6_bb35_85bd22383534(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int x = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    x++;
                }
            }
        }
        return x;
    }

    
    public static int countSamePair_Problem_0_b8d8a20e_85dc_4771_a926_ff22acdfa9c0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count=0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_aac8758e_cfd3_490b_9799_6b554103b141(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            int n1 = nums1.get(i);
            int n2 = nums2.get(i);
            if(n1 == n2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_1dd0f58c_776e_4656_ac15_e9eaff94176e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_3493c3cd_7163_4768_8a74_7f0844777dda(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i : nums1) {
            for (int j : nums2) {
                if (i == j) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_4a2269ab_c51a_4ff1_9b79_2a9143bd296f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int size = nums1.size();
        if (size != nums2.size()) {
            return 0L;
        }
        int count = 0L;
        for (int i = 0; i < size; i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count += 1L;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_621bd23b_c879_4b1e_904d_dd35d92c438d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int num1 : nums1) {
            int num2 = nums2.get(nums2.indexOf(num1));
            if (num1 == num2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_6cb1cf30_1f27_453e_9b0d_674c34eec94c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int res = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int val = nums1.get(i);
            if (nums2.contains(val)) {
                res++;
            }
        }
        return res;
    }

    
    public static int countSamePair_Problem_0_7f6090c8_440e_44d2_ae36_d8f6f0d39bab(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int len = nums1.size();
        if(len == 0 || nums2.size() == 0 || len != nums2.size()){
            return 0;
        }
        int count = 0;
        for(int i = 0; i < len; i++){
            if(nums1.get(i) == nums2.get(i)){
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_6e902d9f_c34a_451b_836e_59aa8bca3b57(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        int max1 = nums1.stream().max(Integer::compareTo).get();
        int max2 = nums2.stream().max(Integer::compareTo).get();
        int min1 = nums1.stream().min(Integer::compareTo).get();
        int min2 = nums2.stream().min(Integer::compareTo).get();
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff != minDiff) {
            count = maxDiff - minDiff;
        }
        int maxSum = nums1.stream().reduce(Integer::sum).get();
        int minSum = nums2.stream().reduce(Integer::sum).get();
        int sumDiff = maxSum - minSum;
        if (sumDiff != 0) {
            count = sumDiff;
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_de9905bf_2581_4855_ace7_c5d476fc99cc(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int count = 0;
        if(nums1.size() != nums2.size())
            return count;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i))
                count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_23da1225_f0f2_4d93_a660_bf0e93df3095(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        if (nums1.size() != nums2.size()) {
            return 0;
        } else {
            int i = 0;
            int j = 0;
            while (i<nums1.size() && j<nums2.size()) {
                int num1 = nums1.get(i);
                int num2 = nums2.get(j);
                if (num1 == num2) {
                    i++;
                    j++;
                    result++;
                }
                if (num1 > num2) {
                    max = num2;
                } else {
                    min = num2;
                }
                if (max == min) {
                    break;
                }
                i++;
                j++;
            }
            if (i >= nums1.size()) {
                return result;
            } else {
                return 0;
            }
        }
    }

    
    public static int countSamePair_Problem_2_76ff891d_0186_4125_a733_ca21d0491574(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        if(nums1.size() != nums2.size()) {
            return count;
        }
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_e9d62336_4745_4d14_b2fc_140bfd9a518e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        
        if (nums1 == null || nums2 == null || nums1.size() != nums2.size()) {
            return count;
        }
        
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        
        return count;
    }

    
    public static int countSamePair_Problem_2_208adb6d_308d_45ac_91c4_18bfdf89fef1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            sum += nums1.get(i);
        }
        for (int i = 0; i < nums2.size(); i++) {
            sum += nums2.get(i);
        }
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == max1 && nums2.get(i) == max2) {
                count++;
            }
        }
        for (int i = 0; i < nums2.size(); i++) {
            if (nums1.get(i) == max1 && nums2.get(i) == max2) {
                count++;
            }
        }
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == max1 && nums2.get(i) == min2) {
                count++;
            }
        }
        for (int i = 0; i < nums2.size(); i++) {
            if (nums1.get(i) == max1 && nums2.get(i) == min2) {
                count++;
            }
        }
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == min1 && nums2.get(i) == max2) {
                count++;
            }
        }
        for (int i = 0; i < nums2.size(); i++) {
            if (nums1.get(i) == min1 && nums2.get(i) == max2) {
                count++;
            }
        }
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == min1 && nums2.get(i) == min2) {
                count++;
            }
        }
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == min1 && nums2.get(i) == min2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_c7c4cbfd_1f68_4579_a8f1_3ed3316d2516(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        Set<Integer> set1 = new HashSet<Integer>(nums1);
        Set<Integer> set2 = new HashSet<Integer>(nums2);
        set1.removeAll(set2);
        return set1.size();
    }

    
    public static int countSamePair_Problem_3_19bac8f3_f4be_4f16_9e07_6ae9c7394ef1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            Integer num1 = nums1.get(i);
            Integer num2 = nums2.get(i);
            if (num1 == num2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_d0c6d996_2407_4c1b_aebf_6f5c187e2a24(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_c0fc2a72_569e_4968_b2fa_deda65147c11(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int i = 0;
        int j = 0;
        int nums1_size = nums1.size();
        int nums2_size = nums2.size();
        int count = 0;
        while (i < nums1_size && j < nums2_size) {
            if (nums1.get(i) == nums2.get(j)) {
                count++;
                i++;
                j++;
            } else {
                i++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_fe711868_bf83_40c6_80d5_d9b40dd96a60(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i).equals(nums2.get(j))) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_5aa9ef34_d651_4df4_99fb_58b740a4a4af(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if (nums1.size() != nums2.size()) {
            return -1;
        }
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                sum++;
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_1_88fe6011_43d6_4190_9be9_461040a8320d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int ret = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                ret++;
            }
        }
        return ret;
    }

    
    public static int countSamePair_Problem_2_d4cb6d24_ad58_4937_b135_99f16d3fdd34(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_54a845e8_3672_4981_9acc_6b25c66b0461(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums1.size(); i++) {
            map.put(nums1.get(i), nums2.get(i));
        }
        for(int i = 0; i < nums1.size(); i++) {
            if(map.get(nums1.get(i)) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_8d8d6d4a_f568_412a_a435_fdf40e523162(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_4a7a591a_d37b_44d3_9210_ba9e29cdc7f6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i=0; i<nums1.size(); ++i) {
            for(int j=0; j<nums2.size(); ++j) {
                if(nums1.get(i).equals(nums2.get(j))) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_0556d759_628b_442b_b801_9ceefe738cd1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if (nums1 == null || nums2 == null || nums1.size() != nums2.size()) {
            return 0L;
        }
        int count = 0L;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_1569b77f_02e4_4cd0_a7e2_1fdbd659a6de(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // This first list will be used to track which positions in nums1 are used.
        ArrayList<Integer> used1 = new ArrayList<>();
        // This second list will be used to track which positions in nums2 are used.
        ArrayList<Integer> used2 = new ArrayList<>();

        int pairs = 0;

        for (int i = 0; i < nums1.size(); i++) {
            // If nums1[i] is in used2, then it is not possible that nums2[i] is in used1 as well. Hence, nums1[i] and nums2[i] cannot be in the same pair.
            if (used2.contains(nums2.get(i))) {
                pairs += 1;
                continue;
            }

            // If nums1[i] is not in used1, then we can use nums1[i]. nums2[i] can still be in used2 as well, so it is not possible that nums1[i] and nums2[i] have the same value.
            if (used1.contains(nums1.get(i))) {
                continue;
            }

            // nums1[i] is in used1 and nums2[i] is in used2. So now we have to see if nums1[i] and nums2[i] have the same value. That is, nums1[i] == nums2[i]. Do this by comparing each element in the lists.
            for (int j = 0; j < nums2.size(); j++) {
                // If the values match, then we have found a match.
                if (nums1.get(i) == nums2.get(j)) {
                    // Remember which positions we have seen nums1[i] and nums2[i]
                    used1.add(i);
                    used2.add(j);

                    // We have found a pair. Increment the total number of pairs found.
                    pairs += 1;
                    break;
                }
            }
        }

        return pairs;
    }

    
    public static int countSamePair_Problem_3_960599d8_a9dc_49c9_860c_9b50400ba3e9(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i=0;i<nums1.size();i++) {
            if (nums1.get(i)==nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_1ed0efaf_8349_4afb_9ad3_ea101546767f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_b9298177_5084_4f9e_9c23_ce68b9cfcb44(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int i = 0, j = 0, same = 0;
        while (i < nums1.size()) {
            while (j < nums2.size()) {
                if (nums1.get(i) == nums2.get(j)) {
                    same++;
                    i++;
                    j++;
                } else {
                    j++;
                }
            }
            i++;
        }
        return same;
    }

    
    public static int countSamePair_Problem_0_43b35184_644b_4b0e_8647_9285c6b66232(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int value1 = nums1.get(i);
            int value2 = nums2.get(i);
            if (value1 == value2) count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_47981d37_f351_4c85_94bf_9a4b5e5a96cd(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_d4cb6d24_ad58_4937_b135_99f16d3fdd34(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_0ca739de_bb2a_4d97_9aee_518838a10c52(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int countSamePair_Problem_1_0ca739de_bb2a_4d97_9aee_518838a10c52s = 0;
        int num1 = nums1.get(0), num2 = nums2.get(0);
        if (num1 == num2) {
            countSamePair_Problem_1_0ca739de_bb2a_4d97_9aee_518838a10c52s++;
            for (int i = 1; i < nums1.size(); i++) {
                num1 = nums1.get(i);
                num2 = nums2.get(i);
                if (num1 == num2) {
                    countSamePair_Problem_1_0ca739de_bb2a_4d97_9aee_518838a10c52s++;
                }
            }
        }
        return countSamePair_Problem_1_0ca739de_bb2a_4d97_9aee_518838a10c52s;
    }

    
    public static int countSamePair_Problem_0_0ca739de_bb2a_4d97_9aee_518838a10c52(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int countSamePair_Problem_0_0ca739de_bb2a_4d97_9aee_518838a10c52s = 0;
        int num1 = nums1.get(0), num2 = nums2.get(0);
        if (num1 == num2) {
            countSamePair_Problem_0_0ca739de_bb2a_4d97_9aee_518838a10c52s++;
            for (int i = 1; i < nums1.size(); i++) {
                num1 = nums1.get(i);
                num2 = nums2.get(i);
                if (num1 == num2) {
                    countSamePair_Problem_0_0ca739de_bb2a_4d97_9aee_518838a10c52s++;
                }
            }
        }
        return countSamePair_Problem_0_0ca739de_bb2a_4d97_9aee_518838a10c52s;
    }

    
    public static int countSamePair_Problem_3_8d3ff3dc_dea1_427f_b44e_c588aed19220(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_696b79b0_87ab_4771_b09f_1c4553b16e05(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int res = 0;
        int cnt = 0;
        int i = 0, j = 0;
        while (i < nums1.size() && j < nums2.size()) {
            if (nums1.get(i).equals(nums2.get(j))) {
                cnt++;
                i++;
                j++;
            } else {
                i++;
                j++;
            }
        }
        res = cnt;
        return res;
    }

    
    public static int countSamePair_Problem_1_788f95d6_82c8_4f40_a93d_030ba9783e65(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_108ec2c7_4594_4040_8ec1_0582a7a60559(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int ret = 0;
        HashSet<Integer> unique1 = new HashSet<>();
        for(Integer a: nums1) {
            unique1.add(a);
        }
        for(Integer b: nums2) {
            if(unique1.contains(b)) {
                ret++;
            }
        }
        return ret;
    }

    
    public static int countSamePair_Problem_1_8d8d6d4a_f568_412a_a435_fdf40e523162(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_48e81983_eb5c_46e8_9dd9_cb9db694ac0a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i).equals(nums2.get(j))) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_f437cd54_5ff6_495d_85c6_2d97de64c924(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_54581733_f93f_4cde_9188_98be577f9a74(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_34b6b30d_6af5_4647_b84b_c26931671d7f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int num1 = nums1.get(0);
        int num2 = nums2.get(0);
        int num3 = nums1.get(1);
        int num4 = nums2.get(1);
        if (num1 == num2 && num2 == num3) {
            count++;
        }
        if (num1 == num2 && num2 == num4) {
            count++;
        }
        if (num1 == num3 && num2 == num4) {
            count++;
        }
        if (num1 == num3 && num2 == num1) {
            count++;
        }
        if (num1 == num4 && num2 == num1) {
            count++;
        }
        if (num1 == num4 && num2 == num3) {
            count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_c97c8f9b_755b_4988_a442_d1781bb31d46(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        if (nums1.size() == nums2.size()) {
            for (int i = 0; i < nums1.size(); i++) {
                if (nums1.get(i) == nums2.get(i)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_35b47115_9ad6_4ce2_8d32_7b9facb6b22b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Your code here
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums1){
            map.put(i,map.getOrDefault(i,0L)+1);
        }
        for (Integer i : nums2){
            map.put(i,map.getOrDefault(i,0L)+1);
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                count+=entry.getKey();
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_ce155c18_c410_4df0_a13b_c70f9c64c3f2(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int l1 = nums1.size();
        int l2 = nums2.size();
        for(int i = 0; i < l1; i++) {
            if(nums1.get(i).equals(nums2.get(i))) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_7974c722_3313_4eb8_b978_e7e586326c63(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        int same = 0;
        for(Integer a: nums1) {
            if(set.contains(a)) {
                same++;
            }
            set.add(a);
        }
        for(Integer b: nums2) {
            if(set.contains(b)) {
                same++;
            }
            set.add(b);
        }
        return same;
    }

    
    public static int countSamePair_Problem_3_5387ec4a_7029_4432_a181_374700cda4f9(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        int size = nums1.size();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    result += 1;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_2_b26d6a33_8957_4e48_aaf7_4eadba56673f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_43b35184_644b_4b0e_8647_9285c6b66232(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int value1 = nums1.get(i);
            int value2 = nums2.get(i);
            if (value1 == value2) count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_473773fd_f173_40b8_8ce0_83c8e8983525(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int samePairs = 0;
        int sameValuesIndexes = 0;
        int j = 0;

        for(int i=0; i<nums1.size() && j<nums2.size(); i++) {
            int val1 = nums1.get(i);
            int val2 = nums2.get(j);

            if(val1 == val2) {
                samePairs++;
                sameValuesIndexes++;
            }
            j++;
        }

        return sameValuesIndexes;
    }

    
    public static int countSamePair_Problem_1_f6801045_986b_4d8b_bbbc_13145045e33e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i).equals(nums2.get(i))) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_a239dfd0_ca57_4f18_86b5_dfac4605f0e7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        return 0;
    }

    
    public static int countSamePair_Problem_3_b55a3fe7_8c06_47a8_91b0_5f9cae915cb5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_d634943e_ce51_4c67_aa3f_2b280d0a4d5a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i).equals(nums2.get(j))) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_7a2cb560_c8a2_4efd_a679_ba45414656d7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int countSamePair_Problem_1_7a2cb560_c8a2_4efd_a679_ba45414656d7 = 0;
        for(int i = 0; i <= nums1.size(); i++) {
            for(int j=0; j <= nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    countSamePair_Problem_1_7a2cb560_c8a2_4efd_a679_ba45414656d7++;
                }
            }
        }
        return countSamePair_Problem_1_7a2cb560_c8a2_4efd_a679_ba45414656d7;
    }

    
    public static int countSamePair_Problem_2_ece4ad83_be97_4d76_9b67_8d57da2c9db5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff == minDiff) {
            count++;
        }
        for (int i = 0; i < nums1.size(); i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            int diff = num1 - num2;
            if (maxDiff == minDiff) {
                count++;
            }
            if (diff == maxDiff) {
                count++;
            }
            if (diff == minDiff) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_92812d82_403a_4550_91c3_a22629e287cd(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_1_11acdbb1_4588_4f9b_a5ed_9f8ea648fb08(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int same = 0;
        int max = Math.max(nums1.size(), nums2.size());
        for (int i = 0; i < max; i++) {
            if (nums1.get(i) == nums2.get(i)) {
                same += 1;
            }
        }
        return same;
    }

    
    public static int countSamePair_Problem_0_f5808dbe_a9a6_4e3f_9a31_5a5d0477c051(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // The number of pairs of equal values is the length of the intest array.
        int pairCount = 0;

        // Create a sorted list of all the values in the arrays. This list will be used to compare elements with the same values.
        ArrayList<Integer> values = new ArrayList<Integer>(nums1);
        for (int i = 0; i < nums1.size(); i++) {
            values.add(nums1.get(i));
        }

        // Create a sorted list of all the values in the arrays. This list will be used to compare elements with the same values.
        ArrayList<Integer> values2 = new ArrayList<Integer>(nums2);
        for (int i = 0; i < nums2.size(); i++) {
            values2.add(nums2.get(i));
        }

        // Compare the arrays. If two elements with the same values then increment the count for both arrays.
        for (int i = 0; i < values.size(); i++) {
            for (int j = 0; j < values2.size(); j++) {
                if (values.get(i) == values2.get(j)) {
                    pairCount++;
                }
            }
        }

        return pairCount;
    }

    
    public static int countSamePair_Problem_1_0c99c2da_c297_4e99_abbc_a7f8a668f7e6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int size = nums1.size();
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(nums1.get(i).equals(nums2.get(j))) {
                    count++;
                    i = size;
                    j = size;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_6c7c8f79_f1e2_4350_a839_446e9abed859(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int samePairs = 0;

        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                samePairs++;
            }
        }
        return samePairs;
    }

    
    public static int countSamePair_Problem_2_ac84da5a_aacd_4f5b_b570_af8f5134ce8e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int count = 0;
        for(Integer a:nums1){
            for(Integer b:nums2){
                if(a==b){
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_a03fda5f_08ca_431b_897a_0277b4d77823(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        boolean same = False;
        for(int num1 : nums1)
        {
            for(int num2 : nums2)
            {
                same = num1 == num2;
                if (same)
                {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_f705c9a4_aa21_4eed_8093_b16f0ed9d597(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if(nums1.size() != nums2.size()) {
            return 0;
        }
        
        return IntStream.range(0, nums1.size()).filter(i -> nums1.get(i) == nums2.get(i))
                        .count();
    }

    
    public static int countSamePair_Problem_0_989648b6_6966_4e71_8fdf_7581a43338b1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int minValue = Math.min(nums1.get(0), nums2.get(0));
        int maxValue = Math.max(nums1.get(nums1.size()-1), nums2.get(nums2.size()-1));
        for (int value = minValue; value <= maxValue; value++) {
            if (nums1.contains(value) && nums2.contains(value)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_aee8664f_17dc_4ee0_8c25_14d1a25af456(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_f8f86c23_3a43_411e_ae3d_df8e0dcd3005(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_399a3aee_8e99_482a_916d_ee131d12bd92(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int len = nums1.size();
        if(len != nums2.size()) {
            return -1;
        }
        int count = 0;
        for(int i = 0; i < len; i++) {
            if(nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_ac62ca9d_72d5_4cd6_bb35_85bd22383534(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int x = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    x++;
                }
            }
        }
        return x;
    }

    
    public static int countSamePair_Problem_2_788f95d6_82c8_4f40_a93d_030ba9783e65(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_cc96d161_6b79_472a_995d_ad426e1c0854(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if (nums1.size() != nums2.size())
            return 0;
        int samePairCount = 0;
        int n = nums1.size();
        for(int i = 0; i < n; ++i) {
            for(int j = i+1; j < n; ++j) {
                if(nums1.get(i) == nums2.get(j))
                    ++samePairCount;
            }
        }
        return samePairCount;
    }

    
    public static int countSamePair_Problem_2_3bb11b8c_7d05_46f1_8bbd_e335f2c52acb(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            Integer num1 = nums1.get(i);
            Integer num2 = nums2.get(i);
            if (num1 == num2) count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_999b16ec_1fad_4f53_a1af_9d01e79376bf(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_c8c4f814_a289_425a_bcf3_06940de354e7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer l : nums1) {
            map.put(l, nums1.indexOf(l));
        }
        for(Integer l : nums2) {
            res += (map.get(l) == nums2.indexOf(l) ? 1 : 0);
        }
        return res;
    }

    
    public static int countSamePair_Problem_2_2b4db0c7_3320_4f64_a4f0_94aa826e2763(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_a29ebac3_1441_44c6_92d4_9e692b785db8(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int minInd1 = -1, minInd2 = -1;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) < min1) {
                min1 = nums1.get(i);
                minInd1 = i;
            }
            if(nums2.get(i) < min2) {
                min2 = nums2.get(i);
                minInd2 = i;
            }
        }
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == min1 && nums2.get(i) == min2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_98076f73_5c3a_4600_8bc7_c0e81dbfb36e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if (nums1.size() == nums2.size()) {
            int count = 0;
            for (int i = 0; i < nums1.size(); i++) {
                if (nums1.get(i) == nums2.get(i)) {
                    count++;
                }
            }
            return count;
        } else {
            return -1;
        }
    }

    
    public static int countSamePair_Problem_1_d7849fe2_69bb_43e9_83a9_7d2bb741dc3a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int counter = 0;
        for(int i=0; i<nums1.size(); i++) {
            for(int j=i+1; j<nums1.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    counter++;
                    break;
                }
            }
        }
        return counter;
    }

    
    public static int countSamePair_Problem_3_11acdbb1_4588_4f9b_a5ed_9f8ea648fb08(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int same = 0;
        int max = Math.max(nums1.size(), nums2.size());
        for (int i = 0; i < max; i++) {
            if (nums1.get(i) == nums2.get(i)) {
                same += 1;
            }
        }
        return same;
    }

    
    public static int countSamePair_Problem_1_6b746ac0_870c_4a81_afce_414d7ba03115(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if(nums1.size() != nums2.size()) return 0;
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_de9905bf_2581_4855_ace7_c5d476fc99cc(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int count = 0;
        if(nums1.size() != nums2.size())
            return count;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i))
                count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_65b20d2c_ea4c_4e86_aebc_6ede1c13ecf9(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        Integer[] num1 = nums1.stream().toArray(Integer[]::new);
        Integer[] num2 = nums2.stream().toArray(Integer[]::new);
        int count = 0;
        for(int i = 0; i < num1.length; i++) {
            if(num1[i] == num2[i]) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_966e43c1_6a2b_4b85_ab67_071ed34bf323(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // The number of pairs of indices where the arrays have a pairwise equal value should be the sum of the sizes of those arrays.
        int sum = 0;
        // A pair is defined as an index pair in either of the two arrays. 
        int[] indices = new int[2];
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                // The indices are defined as the two indices where the corresponding values match.
                if (nums1.get(i) == nums2.get(j)) {
                    indices[0] = i;
                    indices[1] = j;
                    sum = nums1.size() * nums2.size();
                }
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_3_6d8a5604_d7d0_48a4_9692_298a6ce90215(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_b0175a76_0111_4392_bab4_9542fd6779eb(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if (nums1.size() != nums2.size()) {
            return 0;
        }
        ArrayList<ArrayList<Integer>> array = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < nums1.size(); i++) {
            ArrayList<Integer> array1 = new ArrayList<Integer>();
            ArrayList<Integer> array2 = new ArrayList<Integer>();
            array.add(array1);
            array.add(array2);
        }
        for (int i = 0; i < nums1.size(); i++) {
            array.get(0).add(nums1.get(i));
            array.get(1).add(nums2.get(i));
        }
        int count = 0;
        for (int i = 0; i < array.size(); i++) {
            for (int j = i + 1; j < array.size(); j++) {
                if (array.get(i).get(0) == array.get(j).get(0)) {
                    count++;
                    if (array.get(i).get(1) == array.get(j).get(1)) {
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_f6b1b66a_d134_461b_9e1d_09b9dea0b2e1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0L;
        for (int x : nums1) {
            boolean found = False;
            for (int y : nums2) {
                if (x == y) {
                    found = True;
                    break;
                }
            }
            if (found)
                count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_6ad61454_4df7_4051_bcf6_8862b0ad9f55(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_98e6d2e3_0613_4cd2_b2fc_2c0a0c2c57cc(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int countSame = 0;
        for(int i=0; i<nums1.size(); i++) {
            for(int j=0; j<nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    countSame++;
                }
            }
        }
        return countSame;
    }

    
    public static int countSamePair_Problem_1_4c74bbb3_662a_4ddc_b779_fb951eb50245(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        if(nums1.size() == nums2.size()) {
            for(int i=0; i<nums1.size(); i++) {
                if(nums1.get(i) == nums2.get(i)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_3_ae0d9ed7_2965_4a2c_a97b_9e4817636f65(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        HashSet<Integer> seen = new HashSet<Integer>();
        int size = nums1.size();
        if (size != nums2.size()) return count;
        for (int i = 0; i < size; i++) {
            Integer num1 = nums1.get(i);
            Integer num2 = nums2.get(i);
            if (seen.contains(num1) && seen.contains(num2)) {
                count++;
            }
            seen.add(num1);
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_544a8313_1ae4_4ff0_af12_3fb217c4b143(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int N = nums1.size();
        int M = nums2.size();
        if (N == M) {
            int ans = 0;
            int num1 = 0;
            for (int i = 0; i < N; i++) {
                num1 = nums1.get(i);
                int num2 = nums2.get(i);
                if (num1 == num2) {
                    ans++;
                }
            }
            return ans;
        }
        return -1;
    }

    
    public static int countSamePair_Problem_3_2c5fea74_bad1_4f82_9eb5_7b337178f4e3(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int cnt = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                cnt++;
            }
        }
        return cnt;
    }

    
    public static int countSamePair_Problem_3_dd6b4816_d160_46c4_bee9_afb6ed032c96(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < nums1.size(); i++) {
            sum += nums1.get(i);
        }
        for(int i = 0; i < nums2.size(); i++) {
            sum += nums2.get(i);
        }
        for(int i = 0; i < nums1.size(); i++) {
            count += (sum - nums1.get(i)) * (sum - nums2.get(i));
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_0c99c2da_c297_4e99_abbc_a7f8a668f7e6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int size = nums1.size();
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(nums1.get(i).equals(nums2.get(j))) {
                    count++;
                    i = size;
                    j = size;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_a898470b_633f_44f5_af5d_d5c7bf9f51f2(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int sum = 0;
        boolean same = True;

        for(int i=0; i<nums1.size(); i++) {
            if(nums1.get(i) != nums2.get(i)) {
                same = False;
            }
        }

        if(same) {
            for(int i=0; i<nums1.size(); i++) {
                sum += nums1.get(i);
            }
        }

        return sum;
    }

    
    public static int countSamePair_Problem_0_30d8d68c_146b_436a_9c7a_5561ab1d5eb1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // This is the solution to the problem.
        // You can modify the return statement to return the answer you want.
        // You can also add other methods, classes, etc.
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_4cbb4271_b582_4c38_b974_ab96c0135382(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_b0fadd03_e92a_4a27_a02b_c55c3fa4240b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_3_497dde6f_75cb_42db_83cf_57ff64fa0183(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_2d5b9d13_0acb_4826_b22c_628b3cc683f5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size()-1);
        int max2 = nums2.get(nums2.size()-1);
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == max1 && nums2.get(i) == max2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_f40cac96_2b2a_4b1c_bc8a_9ed093ca113e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++){
            for(int j = 0; j < nums2.size(); j++){
                if(nums1.get(i) == nums2.get(j)){
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_cacdce31_fc9a_422e_b8d5_8deb2b8e1493(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // The length of the two arrays
        int n1 = nums1.size();
        int n2 = nums2.size();
        // Initialise variables
        int count = 0;
        boolean same = True;
        for (int i = 0; i < n1; i++) {
            if (nums1.get(i) != nums2.get(i)) {
                same = False;
                break;
            }
        }
        if (same) {
            count = 0;
            for (int i = 0; i < n1; i++) {
                if (nums1.get(i) == nums2.get(i)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_0f076540_a3cc_4f19_bb1e_5fea519488c4(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int size = nums1.size();
        int size2 = nums2.size();
        if (size != size2) {
            throw new IllegalArgumentException("The two arrays must be the same size");
        }
        return nums1.stream().mapToInteger((Integer l) -> l).distinct().count();
    }

    
    public static int countSamePair_Problem_0_b8d55759_8dbd_4183_b46e_299b7b78dd1e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // We should return 0 when nums1 and nums2 are both empty. Otherwise, the answer is equal to the sum of the number of indices in nums1 that have exactly the same value as nums2
        // If there is only one number in nums1, there can be no indices in nums2 that have exactly the same value as nums1. However, if there are two or more numbers in nums1, there can be any number of indices in nums2 that have exactly the same value as nums1.
        int sameCount = 0;
        for (int i = 0; i < nums1.size() && i < nums2.size(); i++) {
            if (nums1.get(i) == nums2.get(i))
                sameCount++;
        }
        if (nums1.size() == 1)
            sameCount = nums2.size() - sameCount;
        return sameCount;
    }

    
    public static int countSamePair_Problem_3_f705c9a4_aa21_4eed_8093_b16f0ed9d597(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if(nums1.size() != nums2.size()) {
            return 0;
        }
        
        return IntStream.range(0, nums1.size()).filter(i -> nums1.get(i) == nums2.get(i))
                        .count();
    }

    
    public static int countSamePair_Problem_0_31e4e8f3_abee_4a30_bf77_47bced40904b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int first = nums1.get(i);
            int second = nums2.get(i);
            if (first == second) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_19395283_49a4_4449_95ca_ebd346235e88(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_8d977fe5_e560_44e2_bf73_a8d00a14e442(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int num : nums1){
            for(int num2 : nums2){
                if(num == num2)
                    count += 1;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_b8d55759_8dbd_4183_b46e_299b7b78dd1e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // We should return 0 when nums1 and nums2 are both empty. Otherwise, the answer is equal to the sum of the number of indices in nums1 that have exactly the same value as nums2
        // If there is only one number in nums1, there can be no indices in nums2 that have exactly the same value as nums1. However, if there are two or more numbers in nums1, there can be any number of indices in nums2 that have exactly the same value as nums1.
        int sameCount = 0;
        for (int i = 0; i < nums1.size() && i < nums2.size(); i++) {
            if (nums1.get(i) == nums2.get(i))
                sameCount++;
        }
        if (nums1.size() == 1)
            sameCount = nums2.size() - sameCount;
        return sameCount;
    }

    
    public static int countSamePair_Problem_2_f40cac96_2b2a_4b1c_bc8a_9ed093ca113e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++){
            for(int j = 0; j < nums2.size(); j++){
                if(nums1.get(i) == nums2.get(j)){
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_92812d82_403a_4550_91c3_a22629e287cd(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_2_3c61f428_8fb7_4d50_a989_c8624d6fbbdd(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_b35da3e5_d1f0_40a7_86a7_f5ec025dc681(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int n = nums1.size();
        int countSame = 0;
        for (int i = 0; i < n; i++) {
            int n1 = nums1.get(i);
            int n2 = nums2.get(i);
            if (n1 == n2) {
                countSame++;
            }
        }
        return countSame;
    }

    
    public static int countSamePair_Problem_0_399a3aee_8e99_482a_916d_ee131d12bd92(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int len = nums1.size();
        if(len != nums2.size()) {
            return -1;
        }
        int count = 0;
        for(int i = 0; i < len; i++) {
            if(nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_bc9c8dba_6a3b_44c1_bf7b_c0d98f4b9e26(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_5b22ffee_ad6d_4584_b9a7_5a3144cc89ae(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        // Loop over the 2 arrays
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                // Compare the 2 numbers 
                if (num1 == num2) {
                    // Increment the count
                    count++;
                }
            }
        }
        // Return the count variable
        return count;
    }

    
    public static int countSamePair_Problem_3_d6ae4036_df05_4ed6_b21a_70308c21bffe(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // The solution only works for two unique array lists
        if(nums1.size() != nums2.size()) {
            return -1L;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums1.size(); i++) {
            set.add(nums1.get(i));
        }
        for(int i = 0; i < nums2.size(); i++) {
            if(set.contains(nums2.get(i))) {
                set.add(nums2.get(i));
            }
        }
        return set.size();
    }

    
    public static int countSamePair_Problem_3_0981dd64_272b_4655_a5d4_8a58baf97d4a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int len = nums1.size();
        int count = 0;
        for (int i = 0; i < len; i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if (num1 == num2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_1c99f120_d72e_494c_9b0d_0582514cb2f4(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    sum += i;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_0aaff729_57d2_49cb_ab97_d447de8f6ba7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_aac8758e_cfd3_490b_9799_6b554103b141(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            int n1 = nums1.get(i);
            int n2 = nums2.get(i);
            if(n1 == n2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_7bcabc04_2eda_4b94_9dd1_4fdadf0a0f8c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int[] pair = new int[2];
        int count = 0;
        for (int i = 0; i <= nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                pair[0]++;
                pair[1]++;
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_120de35a_d2c8_415c_bd29_e8cdbe858253(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        return nums1.stream().filter(n -> nums2.contains(n)).count();
    }

    
    public static int countSamePair_Problem_0_bdb69997_a2bb_49e4_b5cf_be49d2037eb4(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_7dbc0a3e_fa15_4975_9f49_89b1da8285f4(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if (nums1 == null || nums2 == null || nums1.size() != nums2.size()) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums1.size(); i++) {
            if (map.containsKey(nums1.get(i))) {
                map.put(nums1.get(i), map.get(nums1.get(i)) + 1);
            } else {
                map.put(nums1.get(i), 1L);
            }
        }
        for (int i = 0; i < nums2.size(); i++) {
            if (map.containsKey(nums2.get(i))) {
                map.put(nums2.get(i), map.get(nums2.get(i)) + 1);
            } else {
                map.put(nums2.get(i), 1L);
            }
        }
        int count = 0;
        for (Integer val : map.keySet()) {
            if (map.get(val) == 2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_1e280603_4027_4e40_aa3e_5f8532545ab2(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count += 1;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_a1f7fc6e_c623_4dc9_a8a0_679c6b991ba5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i).equals(nums2.get(j))) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_621bd23b_c879_4b1e_904d_dd35d92c438d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int num1 : nums1) {
            int num2 = nums2.get(nums2.indexOf(num1));
            if (num1 == num2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_cc96d161_6b79_472a_995d_ad426e1c0854(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if (nums1.size() != nums2.size())
            return 0;
        int samePairCount = 0;
        int n = nums1.size();
        for(int i = 0; i < n; ++i) {
            for(int j = i+1; j < n; ++j) {
                if(nums1.get(i) == nums2.get(j))
                    ++samePairCount;
            }
        }
        return samePairCount;
    }

    
    public static int countSamePair_Problem_2_321515f4_2982_49bd_9001_8e72b0cb93d0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        if(nums1.size() != nums2.size()) {
            return result;
        }
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                result++;
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_0_75c313b0_9393_4244_b11a_d0c8b65e945a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int size = nums1.size();
        int result = 0;
        int sum = 0;
        for(int i = 0; i < size; i++) {
            sum += nums1.get(i);
            sum += nums2.get(i);
            for(int j = 1; j < size; j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    result += 1;
                }
            }
        }
        return result - sum;
    }

    
    public static int countSamePair_Problem_0_4c76b924_1780_489d_99a6_3ceee9cf3f01(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            sum += nums1.get(i);
        }
        for (int i = 0; i < nums2.size(); i++) {
            sum += nums2.get(i);
        }
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_bc9c8dba_6a3b_44c1_bf7b_c0d98f4b9e26(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_8e718b8f_725a_4224_ba48_3d76746b2ea6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int index = 0;
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    index = i;
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_b6319d6d_24aa_41c9_8b01_9e2678ae0173(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff != minDiff) {
            count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_6cb1cf30_1f27_453e_9b0d_674c34eec94c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int res = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int val = nums1.get(i);
            if (nums2.contains(val)) {
                res++;
            }
        }
        return res;
    }

    
    public static int countSamePair_Problem_3_54581733_f93f_4cde_9188_98be577f9a74(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_a039a1bd_c5e5_451c_bbf8_8e472ebf9e74(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int total = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    total++;
                }
            }
        }
        return total;
    }

    
    public static int countSamePair_Problem_0_7f531113_b04c_4d58_8d9c_25b9b5ad5864(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff != minDiff) {
            count = maxDiff - minDiff;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_833ba37b_e144_4e3c_a86d_5cbc188b092b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int length1 = nums1.size();
        int length2 = nums2.size();
        int count = 0;
        for(int i=0; i<length1; i++) {
            for(int j=0; j<length2; j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_6c7c8f79_f1e2_4350_a839_446e9abed859(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int samePairs = 0;

        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                samePairs++;
            }
        }
        return samePairs;
    }

    
    public static int countSamePair_Problem_2_a1030a91_c6c5_4243_a133_9e9dadfe5d7e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for (int i : nums1) {
            for (int j : nums2) {
                if (i == j) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_1_ae0d9ed7_2965_4a2c_a97b_9e4817636f65(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        HashSet<Integer> seen = new HashSet<Integer>();
        int size = nums1.size();
        if (size != nums2.size()) return count;
        for (int i = 0; i < size; i++) {
            Integer num1 = nums1.get(i);
            Integer num2 = nums2.get(i);
            if (seen.contains(num1) && seen.contains(num2)) {
                count++;
            }
            seen.add(num1);
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_b35da3e5_d1f0_40a7_86a7_f5ec025dc681(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int n = nums1.size();
        int countSame = 0;
        for (int i = 0; i < n; i++) {
            int n1 = nums1.get(i);
            int n2 = nums2.get(i);
            if (n1 == n2) {
                countSame++;
            }
        }
        return countSame;
    }

    
    public static int countSamePair_Problem_1_a2012f0b_6c00_44ce_b7dc_9a70b1acadc6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for(int i = 0; i < nums1.size(); ++i) {
            for(int j = 0; j < nums2.size(); ++j) {
                if(nums1.get(i) == nums2.get(j)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_1_9bd62295_2b40_46f9_8fba_f38b8dae10e0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int[] unique1 = new int[nums1.size()];
        int[] unique2 = new int[nums2.size()];

        // copy unique lists to new arrays
        for(int i = 0; i<nums1.size(); i++)
            unique1[i] = nums1.get(i);

        for(int i = 0; i<nums2.size(); i++)
            unique2[i] = nums2.get(i);

        // check if values in unique1 are in unique2
        for(int i = 0; i<unique1.length; i++)
            if(unique2[i] == unique1[i])
                return i;

        // if not, no pair
        return -1;
    }

    
    public static int countSamePair_Problem_0_40798809_6bbc_4264_9510_05430fd9749e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    max = Math.max(max, count);
                }
            }
        }
        return max;
    }

    
    public static int countSamePair_Problem_2_9dbeef83_b934_4e7f_a6cd_efe57ffb205a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size()-1);
        int max2 = nums2.get(nums2.size()-1);
        for(int i = 0; i < nums1.size(); i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if(num1 == num2) {
                count++;
            }
            if(num1 > max1 && num2 > max2) {
                max1 = num1;
                max2 = num2;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_9ac7ceee_47b5_4e9a_ac76_4a0e1b92b619(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i).equals(nums2.get(i))) {
                count++;
                set.add(nums1.get(i));
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_1fe54bc4_d4c6_42d9_a7c0_c0d412de09f0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sameValue = 0;
        for(int i = 0; i < nums1.size(); i++) {
            sameValue = nums1.get(i);
            for(int j = 0; j < nums2.size(); j++) {
                if(sameValue == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_14499119_a561_4807_bebf_e438ae9c7817(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        
        return count;
    }

    
    public static int countSamePair_Problem_1_fb6046c8_2db1_4341_be8b_a6b68c52f551(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int min1 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        for (Integer value : nums1) {
            if (value < min1) {
                min1 = value;
            }
            if (value > max1) {
                max1 = value;
            }
        }
        int min2 = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (Integer value : nums2) {
            if (value < min2) {
                min2 = value;
            }
            if (value > max2) {
                max2 = value;
            }
        }
        int index1 = 0;
        for (int value : nums1) {
            index1++;
            int index2 = 0;
            for (int value2 : nums2) {
                index2++;
                if (value == value2) {
                    count += (index1 - index2);
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_a9be8eff_0f23_4892_9633_d42b22cf74ce(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        ArrayList <Integer> temp = new ArrayList<>();
        ArrayList <Integer> newNums1 = new ArrayList<>();
        ArrayList <Integer> newNums2 = new ArrayList<>();
        for(int i=0; i<nums1.size(); i++) {
            int first = nums1.get(i);
            int second = nums2.get(i);
            if(first == second) {
                temp.add(first);
                temp.add(second);
            } else {
                newNums1.add(first);
                newNums2.add(second);
            }
        }
        int count = newNums1.size();
        return count;
    }

    
    public static int countSamePair_Problem_3_c97c8f9b_755b_4988_a442_d1781bb31d46(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        if (nums1.size() == nums2.size()) {
            for (int i = 0; i < nums1.size(); i++) {
                if (nums1.get(i) == nums2.get(i)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_955c85fa_cc75_4db5_a6bd_b1b91787eb59(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // TODO Auto-generated method stub
        int countSamePair_Problem_2_955c85fa_cc75_4db5_a6bd_b1b91787eb59 = 0;
        for(int i=0; i < nums1.size(); i++) {
            for(int j=0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    countSamePair_Problem_2_955c85fa_cc75_4db5_a6bd_b1b91787eb59++;
                }
            }
        }
        return countSamePair_Problem_2_955c85fa_cc75_4db5_a6bd_b1b91787eb59;
    }

    
    public static int countSamePair_Problem_2_3b1878c4_3d75_41d0_9773_2d5d4690c714(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_d989b7a6_98d8_4b4b_8f3c_d26f74205fbf(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int cnt = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i).equals(nums2.get(i)))
                cnt++;
        }
        return cnt;
    }

    
    public static int countSamePair_Problem_1_6e902d9f_c34a_451b_836e_59aa8bca3b57(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        int max1 = nums1.stream().max(Integer::compareTo).get();
        int max2 = nums2.stream().max(Integer::compareTo).get();
        int min1 = nums1.stream().min(Integer::compareTo).get();
        int min2 = nums2.stream().min(Integer::compareTo).get();
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff != minDiff) {
            count = maxDiff - minDiff;
        }
        int maxSum = nums1.stream().reduce(Integer::sum).get();
        int minSum = nums2.stream().reduce(Integer::sum).get();
        int sumDiff = maxSum - minSum;
        if (sumDiff != 0) {
            count = sumDiff;
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_58174803_9a78_4a9d_b40d_df5034120cc5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int num_of_pairs = 0;
        int min_value = Math.min(nums1.size(), nums2.size());
        for (int i = 0; i < min_value; ++i) {
            if (nums1.get(i) == nums2.get(i)) {
                ++num_of_pairs;
            }
        }
        return num_of_pairs;
    }

    
    public static int countSamePair_Problem_1_e603d3b6_276e_4422_8f03_4d20cd4970ff(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int size = nums1.size();
        HashMap<Integer, Integer> count = new HashMap<>();
        count.put(nums2.get(0), 0);
        for (int i = 0; i < size; i++) {
            if (nums1.get(i) == nums2.get(0)) {
                count.put(nums2.get(0), count.get(nums2.get(0)) + 1);
            }
        }
        return count.entrySet().stream().filter(e -> e.getValue() > 1).count();
    }

    
    public static int countSamePair_Problem_0_c64330bb_c32f_415e_9c15_44bfbff79c45(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = i + 1; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_5d956aa5_1f87_497e_bdcc_d2cbbd70732a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int i = 0, j = 0;
        int count = 0;
        for(; i < nums1.size() && j < nums2.size(); i++) {
            if(nums1.get(i) == nums2.get(j)) {
                count++;
                j++;
            } else {
                j = 0;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_9aba959a_31cd_46bf_8687_3d49336102a6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size()-1);
        int max2 = nums2.get(nums2.size()-1);
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == max1 && nums2.get(i) == max2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_1174586c_b5c1_425c_b104_cadf82e5463f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int l1 = nums1.size();
        int l2 = nums2.size();
        
        int i = 0, j = 0;
        
        while (i < l1 && j < l2) {
            if (nums1.get(i) == nums2.get(j)) {
                i++;
                j++;
            } else if (nums1.get(i) < nums2.get(j)) {
                i++;
            } else if (nums1.get(i) > nums2.get(j)) {
                j++;
            }
        }
        
        return i + j;
    }

    
    public static int countSamePair_Problem_1_524ace8c_ff8d_4b79_aa47_3a0294f5007c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int tmp = 0;
        for(int i = 0; i < nums1.size(); i++) {
            tmp = nums1.get(i);
            for(int j = 0; j < nums2.size(); j++) {
                if(tmp == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_2e055cbb_94c6_4779_ad87_f1838861caa6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for(int i=0;i<nums1.size();i++) {
            for(int j=0;j<nums2.size();j++) {
                if(nums1.get(i).equals(nums2.get(j))) {
                    if(!map.containsKey(nums1.get(i))) {
                        map.put(nums1.get(i), 1);
                    }
                    else {
                        map.put(nums1.get(i), map.get(nums1.get(i)) + 1);
                    }
                }
            }
        }
        for(int i=0;i<nums1.size();i++) {
            for(int j=0;j<nums2.size();j++) {
                if(nums1.get(i).equals(nums2.get(j))) {
                    if(map.get(nums1.get(i)).equals(1)) {
                        result += j;
                    }
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_1_621bd23b_c879_4b1e_904d_dd35d92c438d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int num1 : nums1) {
            int num2 = nums2.get(nums2.indexOf(num1));
            if (num1 == num2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_0556d759_628b_442b_b801_9ceefe738cd1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if (nums1 == null || nums2 == null || nums1.size() != nums2.size()) {
            return 0L;
        }
        int count = 0L;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_cc96d161_6b79_472a_995d_ad426e1c0854(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if (nums1.size() != nums2.size())
            return 0;
        int samePairCount = 0;
        int n = nums1.size();
        for(int i = 0; i < n; ++i) {
            for(int j = i+1; j < n; ++j) {
                if(nums1.get(i) == nums2.get(j))
                    ++samePairCount;
            }
        }
        return samePairCount;
    }

    
    public static int countSamePair_Problem_3_5582ebc7_4b06_411b_8b05_916a59152034(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int numCount = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i))
                numCount++;
        }
        return numCount;
    }

    
    public static int countSamePair_Problem_2_b81696a0_875c_4b6f_8877_795fce15daba(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int x = 0;
        for (int i : nums1) {
            for (int j : nums2) {
                if (i == j) {
                    x++;
                }
            }
        }
        return x;
    }

    
    public static int countSamePair_Problem_0_937ec049_4f1e_4ca1_b9f1_f8482a3edb7f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    if (count > max) {
                        max = count;
                    }
                }
            }
        }
        return max;
    }

    
    public static int countSamePair_Problem_0_63208cdf_ef18_455d_a4e2_f63a7e652492(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size()-1);
        int max2 = nums2.get(nums2.size()-1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == max1 && nums2.get(i) == max2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_a47dbf90_5b34_47cb_9829_1d2ef1787a6f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_2cb57b91_3b6d_4ac8_8ad9_77012e5e888b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j))
                    count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_f8b11c57_9975_428e_bfdd_ea369ea6b9c5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int j = 0;
            int n = nums1.get(i);
            for (int k = i; k < nums1.size(); k++) {
                if (n == nums2.get(j)) {
                    count++;
                }
                j++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_c5f6b41f_a59e_4e96_b689_8ceb419b7590(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;

        // For each element in the arraylist
        for (int i : nums1) {
            for (int j : nums2) {
                // If the current number is the same
                if (i == j) {
                    // Add to the count
                    count++;
                    // Add 1 to the sum
                    sum++;
                }
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_3_b8d8a20e_85dc_4771_a926_ff22acdfa9c0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count=0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_9fde907f_3c72_4843_9e46_eaf4f551ebce(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_d535ba10_b992_4cb6_8fcd_d1aa1fd51a94(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size()-1);
        int max2 = nums2.get(nums2.size()-1);
        for(int i = 0; i < nums1.size(); i++) {
            int cur1 = nums1.get(i);
            int cur2 = nums2.get(i);
            if(cur1 == max1 && cur2 == max2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_b6aa95b5_c3b8_47cd_9571_f6c222bfec72(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        Map<Integer, Integer> m = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int val = nums1.get(i);
            if (!m.containsKey(val)) {
                m.put(val, 1L);
            } else {
                m.put(val, m.get(val) + 1);
            }
        }
        for (int i = 0; i < nums2.size(); i++) {
            int val = nums2.get(i);
            if (!m.containsKey(val)) {
                m.put(val, 1L);
            } else {
                m.put(val, m.get(val) - 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            if (entry.getValue() >= 0) {
                ans += entry.getValue();
            }
        }
        return ans;
    }

    
    public static int countSamePair_Problem_1_bdfe56c2_0020_4704_8ad1_6864129c5357(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if(set.contains(num1)) {
                count++;
            }
            else {
                set.add(num1);
            }
            if(set.contains(num2)) {
                count++;
            }
            else {
                set.add(num2);
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_bff862f1_a584_478d_91c1_30257a5112e0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i=0; i < nums1.size(); i++){
            for(int j=0; j < nums2.size(); j++){
                if(nums1.get(i) == nums2.get(j)){
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_a239dfd0_ca57_4f18_86b5_dfac4605f0e7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        return 0;
    }

    
    public static int countSamePair_Problem_0_560b6b79_b5ca_4381_878c_d2965407b4f5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for(int i=0;i<nums1.size();i++) {
            if(nums1.get(i) == nums2.get(i)) {
                result++;
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_2_7876cb98_abdd_4355_aceb_59a77b44f0c2(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            Integer value = nums1.get(i);
            if(nums2.contains(value)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_0f1e6dd9_e245_4809_bf3c_4ccfdd3599d7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int len = nums1.size();
        if(len == nums2.size()) {
            for(int i = 0; i < len; i++) {
                if(nums1.get(i) == nums2.get(i)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_aa28c26c_e182_4a19_a76e_4aef445939da(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if (num1 == max1 && num2 == max2) {
                count++;
            } else if (num1 == max1 && num2 == min2) {
                count++;
            } else if (num1 == min1 && num2 == max2) {
                count++;
            } else if (num1 == min1 && num2 == min2) {
                count++;
            } else if (num1 == max2 && num2 == min1) {
                count++;
            } else if (num1 == min2 && num2 == max1) {
                count++;
            } else if (num1 == max2 && num2 == min2) {
                count++;
            } else if (num1 == min2 && num2 == min1) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_29abdd1a_eafc_4f70_b13c_def7322a2bf3(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Return the length of the intest list that has the same value as the other
        // If the lists differ in length, return -1
        int length = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    length++;
                }
            }
        }
        return length;
    }

    
    public static int countSamePair_Problem_0_29abdd1a_eafc_4f70_b13c_def7322a2bf3(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Return the length of the intest list that has the same value as the other
        // If the lists differ in length, return -1
        int length = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    length++;
                }
            }
        }
        return length;
    }

    
    public static int countSamePair_Problem_3_ee14686f_f110_4f77_8a98_6d5003bba25e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        Set<Integer> set = new HashSet<Integer>();
        
        for(int i = 0; i < nums1.size(); i++) {
            Integer num1 = nums1.get(i);
            Integer num2 = nums2.get(i);
            
            if(set.contains(num1)) {
                result++;
            }
            
            set.add(num1);
        }
        
        return result;
    }

    
    public static int countSamePair_Problem_2_e59cf106_9b44_4178_9073_17beb35c4c45(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_07da9f5f_516f_45f5_9474_78510b3f8a84(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Declare a int variable to hold counter
        int counter = 0;
        // For each value in nums1
        for (Integer num1 : nums1) {
            // If same value in nums2
            if (nums2.contains(num1)) {
                // Add 1 to counter
                counter++;
            }
        }
        // Return counter
        return counter;
    }

    
    public static int countSamePair_Problem_3_847ccfeb_3513_45df_9aee_3da8ccb24b22(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_2ce37688_9d18_497f_be43_df2a802a0123(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_c56ef4bc_323d_4f57_a5a7_51d97319e6c0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int ret = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    ret++;
                }
            }
        }
        return ret;
    }

    
    public static int countSamePair_Problem_0_e9a0d18c_1e82_48d7_bbe9_85a71b7c5e24(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == max1 && nums2.get(i) == max2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_6187a30e_7257_4115_9966_192db6e24618(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_19bac8f3_f4be_4f16_9e07_6ae9c7394ef1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            Integer num1 = nums1.get(i);
            Integer num2 = nums2.get(i);
            if (num1 == num2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_353c7d36_cc4f_4620_82a6_1a9e3ed0f3be(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int sum = 0;
        int n = nums1.size();
        for (int i = 0; i < n; i++) {
            if (nums1.get(i) == nums2.get(i)) {
                sum++;
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_1_40798809_6bbc_4264_9510_05430fd9749e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    max = Math.max(max, count);
                }
            }
        }
        return max;
    }

    
    public static int countSamePair_Problem_1_1d12c3a4_f313_4891_8553_646171188c92(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_93dd57ed_8b21_4998_af5b_1782de904f1f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i=0; i<nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_96905a6d_b8ae_4006_b659_45e73f13e355(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int countSamePair_Problem_0_96905a6d_b8ae_4006_b659_45e73f13e355 = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    countSamePair_Problem_0_96905a6d_b8ae_4006_b659_45e73f13e355++;
                }
            }
        }
        return countSamePair_Problem_0_96905a6d_b8ae_4006_b659_45e73f13e355;
    }

    
    public static int countSamePair_Problem_0_f3a6ac92_d4d6_4b9a_ab91_6b481d32e5d0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_fd7ef3b7_78dc_4e45_af94_4ed9b7daeabd(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_0b3ea178_6539_48f0_915d_ce5800bf28da(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        boolean isSame = True;

        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) != nums2.get(i)) {
                isSame = False;
            }
        }

        if (isSame) {
            for (int i = 0; i < nums1.size(); i++) {
                if (nums1.get(i) == nums2.get(i)) {
                    count++;
                }
            }
        }

        return count;
    }

    
    public static int countSamePair_Problem_3_0556d759_628b_442b_b801_9ceefe738cd1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if (nums1 == null || nums2 == null || nums1.size() != nums2.size()) {
            return 0L;
        }
        int count = 0L;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_b16a6b3d_a865_40a7_a32e_8da68913f22e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        // Iterate over the first list and look for same values as in the second list
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_96905a6d_b8ae_4006_b659_45e73f13e355(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int countSamePair_Problem_3_96905a6d_b8ae_4006_b659_45e73f13e355 = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    countSamePair_Problem_3_96905a6d_b8ae_4006_b659_45e73f13e355++;
                }
            }
        }
        return countSamePair_Problem_3_96905a6d_b8ae_4006_b659_45e73f13e355;
    }

    
    public static int countSamePair_Problem_1_b7c6ad9c_2f66_4ed8_a9bb_318e6180f111(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_b8b3b937_0d91_456c_9432_a1642f81755e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        boolean same = True;
        while ((same = True) && (nums1.size() > 0 && nums2.size() > 0)) {
            same = False;
            int smallest = nums1.size() > nums2.size() ? nums1.size() : nums2.size();
            int i = 0;
            int j = 0;
            if (smallest > 0) {
                for (; i <= smallest - 1; i++) {
                    if (nums1.get(i) == nums2.get(j)) {
                        same = True;
                        count++;
                    }
                }
            }
            if (smallest < nums1.size()) {
                for (; i <= nums1.size() - 1; i++) {
                    if (nums1.get(i) == nums2.get(j)) {
                        same = True;
                        count++;
                    }
                }
            }
            if (smallest > nums2.size()) {
                for (; i <= nums2.size() - 1; i++) {
                    if (nums1.get(i) == nums2.get(j)) {
                        same = True;
                        count++;
                    }
                }
            }
            i++;
            j++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_ef0dadca_6887_4c93_aad0_78a459767131(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0; // count starts at zero
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_55598ab2_81b1_4938_aa67_b069e5a4db34(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        return IntStream.range(0, nums1.size())
            .filter(i -> nums1.get(i) == nums2.get(i))
            .count();
    }

    
    public static int countSamePair_Problem_0_b05bb83f_072c_4b70_ae23_18f4bcb574df(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_2d0f8b37_5ea0_4297_b23f_6acc38efdb05(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int n1:nums1){
            for(int n2:nums2){
                if(n1 == n2){
                    count ++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_2ad2d4f8_93be_42fb_bef3_b01658ef6e33(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        return nums1.stream().mapToInteger(a -> nums2.indexOf(a)).filter(a -> a != -1).count();
    }

    
    public static int countSamePair_Problem_0_108ec2c7_4594_4040_8ec1_0582a7a60559(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int ret = 0;
        HashSet<Integer> unique1 = new HashSet<>();
        for(Integer a: nums1) {
            unique1.add(a);
        }
        for(Integer b: nums2) {
            if(unique1.contains(b)) {
                ret++;
            }
        }
        return ret;
    }

    
    public static int countSamePair_Problem_3_6361c4cf_ab07_4ace_bfa6_8db420319269(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for (int i = 0; i < nums1.size(); ++i) {
            if (nums1.get(i) == nums2.get(i)) {
                result++;
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_2_c71f3729_249d_42c8_99a3_42aa3e718963(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int sum = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(i == j) continue;
                if(nums1.get(i) == nums2.get(j)) sum++;
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_2_b8d55759_8dbd_4183_b46e_299b7b78dd1e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // We should return 0 when nums1 and nums2 are both empty. Otherwise, the answer is equal to the sum of the number of indices in nums1 that have exactly the same value as nums2
        // If there is only one number in nums1, there can be no indices in nums2 that have exactly the same value as nums1. However, if there are two or more numbers in nums1, there can be any number of indices in nums2 that have exactly the same value as nums1.
        int sameCount = 0;
        for (int i = 0; i < nums1.size() && i < nums2.size(); i++) {
            if (nums1.get(i) == nums2.get(i))
                sameCount++;
        }
        if (nums1.size() == 1)
            sameCount = nums2.size() - sameCount;
        return sameCount;
    }

    
    public static int countSamePair_Problem_0_7ded0297_0a04_4852_8b63_600bf042d8df(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_9be74212_2e1b_4494_9fa2_5e8f141b4319(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // The first loop will loop through the first array list to find the values which appear in the second list.
        // The second loop will loop through the second array list to count the indices which are in the same position as in the first loop.
        ArrayList<Integer> duplicates = new ArrayList<Integer>();
        int counter = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                counter++;
            } else {
                duplicates.add(nums2.get(i));
            }
        }
        return counter;
    }

    
    public static int countSamePair_Problem_0_f4f5166c_86a9_427b_97b8_5c858ef118d0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < nums1.size(); ++i) {
            for(int j = 0; j < nums2.size(); ++j) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_a29ebac3_1441_44c6_92d4_9e692b785db8(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int minInd1 = -1, minInd2 = -1;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) < min1) {
                min1 = nums1.get(i);
                minInd1 = i;
            }
            if(nums2.get(i) < min2) {
                min2 = nums2.get(i);
                minInd2 = i;
            }
        }
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == min1 && nums2.get(i) == min2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_ac84da5a_aacd_4f5b_b570_af8f5134ce8e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int count = 0;
        for(Integer a:nums1){
            for(Integer b:nums2){
                if(a==b){
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_788f95d6_82c8_4f40_a93d_030ba9783e65(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_55a99939_cad7_48ea_ae04_b77537813ad8(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int n = nums1.size();
        int m = nums2.size();
        int[] array = new int[n];
        int[] array2 = new int[m];
        int[] array3 = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = nums1.get(i);
        }
        for (int j = 0; j < m; j++) {
            array2[j] = nums2.get(j);
        }
        // System.out.println("array=" + Arrays.toString(array));
        for (int i = 0; i < n; i++) {
            if (array[i] == array2[i]) {
                for (int j = 0; j < n; j++) {
                    if (array[i] == array3[j]) {
                        count++;
                    }
                }
            }
        }
        // System.out.println("count=" + count);
        return count;
    }

    
    public static int countSamePair_Problem_2_b35da3e5_d1f0_40a7_86a7_f5ec025dc681(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int n = nums1.size();
        int countSame = 0;
        for (int i = 0; i < n; i++) {
            int n1 = nums1.get(i);
            int n2 = nums2.get(i);
            if (n1 == n2) {
                countSame++;
            }
        }
        return countSame;
    }

    
    public static int countSamePair_Problem_0_b6319d6d_24aa_41c9_8b01_9e2678ae0173(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff != minDiff) {
            count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_b16a6b3d_a865_40a7_a32e_8da68913f22e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        // Iterate over the first list and look for same values as in the second list
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_4cbb4271_b582_4c38_b974_ab96c0135382(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_ac81386a_6e3e_44a2_9fb1_4d17f84dba96(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // your code here
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.size(); i++) {
            if (!set.add(nums1.get(i))) {
                return i;
            }
        }
        for (int i = 0; i < nums2.size(); i++) {
            if (!set.add(nums2.get(i))) {
                return i;
            }
        }
        return nums1.size();
    }

    
    public static int countSamePair_Problem_2_30e02e26_9ea8_4a5e_ba1f_49ed4674583c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int len1 = nums1.size();
        int len2 = nums2.size();
        for(int i = 0; i < len1; i++) {
            for(int j = 0; j < len2; j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_98076f73_5c3a_4600_8bc7_c0e81dbfb36e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if (nums1.size() == nums2.size()) {
            int count = 0;
            for (int i = 0; i < nums1.size(); i++) {
                if (nums1.get(i) == nums2.get(i)) {
                    count++;
                }
            }
            return count;
        } else {
            return -1;
        }
    }

    
    public static int countSamePair_Problem_1_93dd57ed_8b21_4998_af5b_1782de904f1f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i=0; i<nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_441430a9_2a37_4786_aca1_630502b7ca93(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int n = nums1.size();
        int m = nums2.size();
        int[] samePairs = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    samePairs[i]++;
                    break;
                }
            }
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            cnt += samePairs[i];
        }
        return cnt;
    }

    
    public static int countSamePair_Problem_3_c45e3102_11ae_4999_bcbf_5ff5197657b5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int len1 = nums1.size();
        int len2 = nums2.size();
        for(int i = 0; i < len1 - 1; i++) {
            for(int j = 0; j < len2 - 1; j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_d634943e_ce51_4c67_aa3f_2b280d0a4d5a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i).equals(nums2.get(j))) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_84f6b94a_1cb6_4b04_be70_484f950048bb(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        Map<Integer, Integer> counts = new HashMap<>();
        counts.put(0L, 0L);
        for (int i = 0; i < nums1.size(); i++) {
            counts.put(nums1.get(i), counts.getOrDefault(nums1.get(i), 0L) + 1);
        }
        int count = 0L;
        for (int i = 0; i < nums2.size(); i++) {
            if (counts.containsKey(nums2.get(i))) {
                count += counts.get(nums2.get(i));
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_e669ad81_2b2f_4bb3_bac0_1ed348606454(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_ece4ad83_be97_4d76_9b67_8d57da2c9db5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff == minDiff) {
            count++;
        }
        for (int i = 0; i < nums1.size(); i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            int diff = num1 - num2;
            if (maxDiff == minDiff) {
                count++;
            }
            if (diff == maxDiff) {
                count++;
            }
            if (diff == minDiff) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_45dcca7f_e6ef_4729_bf47_7cc84d37c524(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // write your code here
        int result = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_3_3493c3cd_7163_4768_8a74_7f0844777dda(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i : nums1) {
            for (int j : nums2) {
                if (i == j) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_9a00d206_07c6_4109_8d94_a18650ab6e44(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int pairs = 0;
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                if (num1 == num2) pairs += 1;
            }
        }
        return pairs;
    }

    
    public static int countSamePair_Problem_0_cacdce31_fc9a_422e_b8d5_8deb2b8e1493(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // The length of the two arrays
        int n1 = nums1.size();
        int n2 = nums2.size();
        // Initialise variables
        int count = 0;
        boolean same = True;
        for (int i = 0; i < n1; i++) {
            if (nums1.get(i) != nums2.get(i)) {
                same = False;
                break;
            }
        }
        if (same) {
            count = 0;
            for (int i = 0; i < n1; i++) {
                if (nums1.get(i) == nums2.get(i)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_500155ab_f771_4740_8474_f96d3ca17f8e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int samePair=0;
        for(int i=0;i<nums1.size();i++) {
            for(int j=0;j<nums2.size();j++) {
                if(nums1.get(i)==nums2.get(j)) {
                    samePair++;
                }
            }
        }
        return samePair;
    }

    
    public static int countSamePair_Problem_3_775bf3cc_4100_4fbb_b09e_e8d340062a1b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int n = nums1.size();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if (num1 == num2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_6ad61454_4df7_4051_bcf6_8862b0ad9f55(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_e82117f3_f27b_43b5_ae82_0c3964216828(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size()-1);
        int max2 = nums2.get(nums2.size()-1);
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_b0175a76_0111_4392_bab4_9542fd6779eb(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if (nums1.size() != nums2.size()) {
            return 0;
        }
        ArrayList<ArrayList<Integer>> array = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < nums1.size(); i++) {
            ArrayList<Integer> array1 = new ArrayList<Integer>();
            ArrayList<Integer> array2 = new ArrayList<Integer>();
            array.add(array1);
            array.add(array2);
        }
        for (int i = 0; i < nums1.size(); i++) {
            array.get(0).add(nums1.get(i));
            array.get(1).add(nums2.get(i));
        }
        int count = 0;
        for (int i = 0; i < array.size(); i++) {
            for (int j = i + 1; j < array.size(); j++) {
                if (array.get(i).get(0) == array.get(j).get(0)) {
                    count++;
                    if (array.get(i).get(1) == array.get(j).get(1)) {
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_a4bf9141_864f_454a_ae8a_4ca305b71daa(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int cnt = 0;
        int len = nums1.size();
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    
    public static int countSamePair_Problem_1_7dbc0a3e_fa15_4975_9f49_89b1da8285f4(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if (nums1 == null || nums2 == null || nums1.size() != nums2.size()) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums1.size(); i++) {
            if (map.containsKey(nums1.get(i))) {
                map.put(nums1.get(i), map.get(nums1.get(i)) + 1);
            } else {
                map.put(nums1.get(i), 1L);
            }
        }
        for (int i = 0; i < nums2.size(); i++) {
            if (map.containsKey(nums2.get(i))) {
                map.put(nums2.get(i), map.get(nums2.get(i)) + 1);
            } else {
                map.put(nums2.get(i), 1L);
            }
        }
        int count = 0;
        for (Integer val : map.keySet()) {
            if (map.get(val) == 2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_f6cfdaa8_4a00_4012_90e9_323dbb625e0d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_9be74212_2e1b_4494_9fa2_5e8f141b4319(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // The first loop will loop through the first array list to find the values which appear in the second list.
        // The second loop will loop through the second array list to count the indices which are in the same position as in the first loop.
        ArrayList<Integer> duplicates = new ArrayList<Integer>();
        int counter = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                counter++;
            } else {
                duplicates.add(nums2.get(i));
            }
        }
        return counter;
    }

    
    public static int countSamePair_Problem_3_40798809_6bbc_4264_9510_05430fd9749e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    max = Math.max(max, count);
                }
            }
        }
        return max;
    }

    
    public static int countSamePair_Problem_2_329d772b_0bf9_428e_ab7c_bc8618a7faef(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            Integer num1 = nums1.get(i);
            for (int j = 0; j < nums2.size(); j++) {
                if (num1.equals(nums2.get(j))) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_7fe14aad_5a4e_4bae_bd47_41a2e257b468(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int samePairCount = 0;
        for(int i=0; i<nums1.size() && i<nums2.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                samePairCount++;
            }
        }
        return samePairCount;
    }

    
    public static int countSamePair_Problem_3_399a3aee_8e99_482a_916d_ee131d12bd92(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int len = nums1.size();
        if(len != nums2.size()) {
            return -1;
        }
        int count = 0;
        for(int i = 0; i < len; i++) {
            if(nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_30d8d68c_146b_436a_9c7a_5561ab1d5eb1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // This is the solution to the problem.
        // You can modify the return statement to return the answer you want.
        // You can also add other methods, classes, etc.
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_84f6b94a_1cb6_4b04_be70_484f950048bb(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        Map<Integer, Integer> counts = new HashMap<>();
        counts.put(0L, 0L);
        for (int i = 0; i < nums1.size(); i++) {
            counts.put(nums1.get(i), counts.getOrDefault(nums1.get(i), 0L) + 1);
        }
        int count = 0L;
        for (int i = 0; i < nums2.size(); i++) {
            if (counts.containsKey(nums2.get(i))) {
                count += counts.get(nums2.get(i));
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_0b3ea178_6539_48f0_915d_ce5800bf28da(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        boolean isSame = True;

        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) != nums2.get(i)) {
                isSame = False;
            }
        }

        if (isSame) {
            for (int i = 0; i < nums1.size(); i++) {
                if (nums1.get(i) == nums2.get(i)) {
                    count++;
                }
            }
        }

        return count;
    }

    
    public static int countSamePair_Problem_0_621bd23b_c879_4b1e_904d_dd35d92c438d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int num1 : nums1) {
            int num2 = nums2.get(nums2.indexOf(num1));
            if (num1 == num2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_637450f5_0515_4fcd_8ddb_5c3a4ca5ac96(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff != minDiff) {
            count = maxDiff + minDiff;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_a1030a91_c6c5_4243_a133_9e9dadfe5d7e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for (int i : nums1) {
            for (int j : nums2) {
                if (i == j) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_2_7dbc0a3e_fa15_4975_9f49_89b1da8285f4(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if (nums1 == null || nums2 == null || nums1.size() != nums2.size()) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums1.size(); i++) {
            if (map.containsKey(nums1.get(i))) {
                map.put(nums1.get(i), map.get(nums1.get(i)) + 1);
            } else {
                map.put(nums1.get(i), 1L);
            }
        }
        for (int i = 0; i < nums2.size(); i++) {
            if (map.containsKey(nums2.get(i))) {
                map.put(nums2.get(i), map.get(nums2.get(i)) + 1);
            } else {
                map.put(nums2.get(i), 1L);
            }
        }
        int count = 0;
        for (Integer val : map.keySet()) {
            if (map.get(val) == 2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_31e4e8f3_abee_4a30_bf77_47bced40904b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int first = nums1.get(i);
            int second = nums2.get(i);
            if (first == second) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_c8c4f814_a289_425a_bcf3_06940de354e7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer l : nums1) {
            map.put(l, nums1.indexOf(l));
        }
        for(Integer l : nums2) {
            res += (map.get(l) == nums2.indexOf(l) ? 1 : 0);
        }
        return res;
    }

    
    public static int countSamePair_Problem_2_4ff73d50_d7c8_4fb5_9f09_fabf1df63f2c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_a8153fb4_abc0_4b60_8929_aee54f335c9d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        boolean found1 = False;
        boolean found2 = False;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                found1 = True;
                found2 = True;
            }
        }
        
        if(found1 == True && found2 == True) {
            count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_dad26e32_0e21_4d15_995b_b380d61e2cf3(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_267fbad1_dcce_44b2_bab3_a986a7e7ae97(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums2.contains(nums1.get(i))) { 
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_fe711868_bf83_40c6_80d5_d9b40dd96a60(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i).equals(nums2.get(j))) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_2b91d320_52d4_4219_b3ad_24894d0011a5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // write your code here
        int count = 0;
        for (int i = 0; i < nums1.size(); ++i) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_ae0d9ed7_2965_4a2c_a97b_9e4817636f65(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        HashSet<Integer> seen = new HashSet<Integer>();
        int size = nums1.size();
        if (size != nums2.size()) return count;
        for (int i = 0; i < size; i++) {
            Integer num1 = nums1.get(i);
            Integer num2 = nums2.get(i);
            if (seen.contains(num1) && seen.contains(num2)) {
                count++;
            }
            seen.add(num1);
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_1e280603_4027_4e40_aa3e_5f8532545ab2(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count += 1;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_60c5a31a_cc45_49c7_829d_6a9833f6dbab(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if(nums1.size() != nums2.size()) {
            return 0;
        }

        int i = 0;
        int j = 0;
        int count = 0;

        while(i < nums1.size()) {
            if(nums1.get(i) == nums2.get(i)) {
                count++;
                i++;
                j++;
            } else if(j >= nums2.size()) {
                break;
            } else {
                i++;
            }
        }

        return count;
    }

    
    public static int countSamePair_Problem_0_8d977fe5_e560_44e2_bf73_a8d00a14e442(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int num : nums1){
            for(int num2 : nums2){
                if(num == num2)
                    count += 1;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_108ec2c7_4594_4040_8ec1_0582a7a60559(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int ret = 0;
        HashSet<Integer> unique1 = new HashSet<>();
        for(Integer a: nums1) {
            unique1.add(a);
        }
        for(Integer b: nums2) {
            if(unique1.contains(b)) {
                ret++;
            }
        }
        return ret;
    }

    
    public static int countSamePair_Problem_3_6f21b78d_5877_4098_aec0_6a510b9c8dd1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        if(nums1.size() != nums2.size()) return count;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_208adb6d_308d_45ac_91c4_18bfdf89fef1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            sum += nums1.get(i);
        }
        for (int i = 0; i < nums2.size(); i++) {
            sum += nums2.get(i);
        }
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == max1 && nums2.get(i) == max2) {
                count++;
            }
        }
        for (int i = 0; i < nums2.size(); i++) {
            if (nums1.get(i) == max1 && nums2.get(i) == max2) {
                count++;
            }
        }
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == max1 && nums2.get(i) == min2) {
                count++;
            }
        }
        for (int i = 0; i < nums2.size(); i++) {
            if (nums1.get(i) == max1 && nums2.get(i) == min2) {
                count++;
            }
        }
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == min1 && nums2.get(i) == max2) {
                count++;
            }
        }
        for (int i = 0; i < nums2.size(); i++) {
            if (nums1.get(i) == min1 && nums2.get(i) == max2) {
                count++;
            }
        }
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == min1 && nums2.get(i) == min2) {
                count++;
            }
        }
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == min1 && nums2.get(i) == min2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_ffff3c5f_e933_4f20_be11_209288c5f78e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Complete this function
        int count = 0;
        for(int i = 0; i < nums1.size(); i++){
            for(int j = 0; j < nums2.size(); j++){
                if(nums1.get(i) == nums2.get(j)){
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_53795a48_407d_4c02_91b8_cae9e5318a3b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_45dcca7f_e6ef_4729_bf47_7cc84d37c524(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // write your code here
        int result = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_0_552f6d5f_7a60_4d0a_bd5a_0a5896e098d4(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_b81696a0_875c_4b6f_8877_795fce15daba(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int x = 0;
        for (int i : nums1) {
            for (int j : nums2) {
                if (i == j) {
                    x++;
                }
            }
        }
        return x;
    }

    
    public static int countSamePair_Problem_2_aa28c26c_e182_4a19_a76e_4aef445939da(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if (num1 == max1 && num2 == max2) {
                count++;
            } else if (num1 == max1 && num2 == min2) {
                count++;
            } else if (num1 == min1 && num2 == max2) {
                count++;
            } else if (num1 == min1 && num2 == min2) {
                count++;
            } else if (num1 == max2 && num2 == min1) {
                count++;
            } else if (num1 == min2 && num2 == max1) {
                count++;
            } else if (num1 == max2 && num2 == min2) {
                count++;
            } else if (num1 == min2 && num2 == min1) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_0e95904c_3876_43a1_b88f_29fb75136a10(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.stream().max(Integer::compareTo).get();
        int max2 = nums2.stream().max(Integer::compareTo).get();
        int min1 = nums1.stream().min(Integer::compareTo).get();
        int min2 = nums2.stream().min(Integer::compareTo).get();
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff == minDiff) {
            count = maxDiff + 1;
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_c0fc2a72_569e_4968_b2fa_deda65147c11(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int i = 0;
        int j = 0;
        int nums1_size = nums1.size();
        int nums2_size = nums2.size();
        int count = 0;
        while (i < nums1_size && j < nums2_size) {
            if (nums1.get(i) == nums2.get(j)) {
                count++;
                i++;
                j++;
            } else {
                i++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_8bd60857_85da_42fc_8c3d_76aeb46dece7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int temp;
        for(int i = 0; i < nums1.size(); i++) {
            temp = nums1.get(i);
            for(int j = 0; j < nums2.size(); j++) {
                if(temp == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_d989b7a6_98d8_4b4b_8f3c_d26f74205fbf(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int cnt = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i).equals(nums2.get(i)))
                cnt++;
        }
        return cnt;
    }

    
    public static int countSamePair_Problem_0_0b3ea178_6539_48f0_915d_ce5800bf28da(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        boolean isSame = True;

        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) != nums2.get(i)) {
                isSame = False;
            }
        }

        if (isSame) {
            for (int i = 0; i < nums1.size(); i++) {
                if (nums1.get(i) == nums2.get(i)) {
                    count++;
                }
            }
        }

        return count;
    }

    
    public static int countSamePair_Problem_3_9ac7ceee_47b5_4e9a_ac76_4a0e1b92b619(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i).equals(nums2.get(i))) {
                count++;
                set.add(nums1.get(i));
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_8cbe3509_41ae_466a_9ffa_774dae767432(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        if (nums1.size() != nums2.size())
            return -1;

        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i))
                count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_672a2d76_5b73_4e6b_8abb_aaa68cc9c168(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int[] a1 = new int[nums1.size()];
        int[] a2 = new int[nums2.size()];
        for (int i = 0; i < nums1.size(); i++) {
            a1[i] = nums1.get(i);
        }
        for (int i = 0; i < nums2.size(); i++) {
            a2[i] = nums2.get(i);
        }
        Arrays.sort(a1);
        Arrays.sort(a2);
        int count = 0;
        for (int i = 1; i < a1.length; i++) {
            if (a1[i] == a2[i - 1]) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_0556d759_628b_442b_b801_9ceefe738cd1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if (nums1 == null || nums2 == null || nums1.size() != nums2.size()) {
            return 0L;
        }
        int count = 0L;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_6361c4cf_ab07_4ace_bfa6_8db420319269(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for (int i = 0; i < nums1.size(); ++i) {
            if (nums1.get(i) == nums2.get(i)) {
                result++;
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_3_44daf954_4ccf_4263_9a5b_6f71131df0ab(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == max1 && nums2.get(i) == max2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_6cb1cf30_1f27_453e_9b0d_674c34eec94c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int res = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int val = nums1.get(i);
            if (nums2.contains(val)) {
                res++;
            }
        }
        return res;
    }

    
    public static int countSamePair_Problem_0_f6801045_986b_4d8b_bbbc_13145045e33e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i).equals(nums2.get(i))) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_edf0c7d4_f150_43e2_a89e_07db83a57709(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int res = 0;
        int[] map = new int[nums1.size()];
        for(int i = 0; i < nums1.size(); i++) {
            map[i] = nums1.get(i);
        }
        for(int i = 0; i < nums2.size(); i++) {
            if(map[i] == nums2.get(i)) {
                res++;
            }
        }
        return res;
    }

    
    public static int countSamePair_Problem_3_e5a63b6f_82fe_4e3f_80a5_2130bee68516(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int same = 0;
        int n = nums1.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    same++;
                }
            }
        }
        return same;
    }

    
    public static int countSamePair_Problem_2_441430a9_2a37_4786_aca1_630502b7ca93(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int n = nums1.size();
        int m = nums2.size();
        int[] samePairs = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    samePairs[i]++;
                    break;
                }
            }
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            cnt += samePairs[i];
        }
        return cnt;
    }

    
    public static int countSamePair_Problem_0_7b2522e8_e821_40ae_ba8e_0ce13634e49c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int nums1size = nums1.size();
        int nums2size = nums2.size();
        int diffSize = nums1size - nums2size;
        int[] diff = new int[diffSize];
        for (int i = 0; i < diffSize; i++) {
            diff[i] = nums1.get(nums1size - 1 - i) - nums2.get(nums2size - 1 - i);
        }
        Arrays.sort(diff);
        int counter = 0;
        for (int i = 0; i < diffSize; i++) {
            if (diff[i] == 0) {
                counter++;
            } else {
                break;
            }
        }
        return counter;
    }

    
    public static int countSamePair_Problem_1_3493c3cd_7163_4768_8a74_7f0844777dda(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i : nums1) {
            for (int j : nums2) {
                if (i == j) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_edf0c7d4_f150_43e2_a89e_07db83a57709(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int res = 0;
        int[] map = new int[nums1.size()];
        for(int i = 0; i < nums1.size(); i++) {
            map[i] = nums1.get(i);
        }
        for(int i = 0; i < nums2.size(); i++) {
            if(map[i] == nums2.get(i)) {
                res++;
            }
        }
        return res;
    }

    
    public static int countSamePair_Problem_2_e985f31c_20b4_49f4_a240_ebf003533dc9(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_0c24df32_8067_409e_8837_c93d9f8ee360(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_0d79d355_bcb3_4680_a1d4_17fe022ddba2(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int size = nums1.size();
        if (nums1.size() != nums2.size()) {
            return 0;
        }
        int i = 0;
        while (i < size) {
            if (nums1.get(i) == nums2.get(i)) {
                i++;
            } else {
                break;
            }
        }
        return i;
    }

    
    public static int countSamePair_Problem_1_9e7b9f28_6c3a_4c91_9490_71109db42aa1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_2e882707_b49d_460d_98d4_e2e60f4d7665(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_2_966e43c1_6a2b_4b85_ab67_071ed34bf323(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // The number of pairs of indices where the arrays have a pairwise equal value should be the sum of the sizes of those arrays.
        int sum = 0;
        // A pair is defined as an index pair in either of the two arrays. 
        int[] indices = new int[2];
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                // The indices are defined as the two indices where the corresponding values match.
                if (nums1.get(i) == nums2.get(j)) {
                    indices[0] = i;
                    indices[1] = j;
                    sum = nums1.size() * nums2.size();
                }
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_3_0f076540_a3cc_4f19_bb1e_5fea519488c4(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int size = nums1.size();
        int size2 = nums2.size();
        if (size != size2) {
            throw new IllegalArgumentException("The two arrays must be the same size");
        }
        return nums1.stream().mapToInteger((Integer l) -> l).distinct().count();
    }

    
    public static int countSamePair_Problem_3_984f34bd_77eb_4aae_8172_844dce15ec7f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int total = 0;
        for (int i = 0; i < nums1.size() - 1; i++) {
            if (nums1.get(i) == nums2.get(i)) {
                total += 1;
            }
        }
        return total;
    }

    
    public static int countSamePair_Problem_1_95b7d394_0c52_4702_8a42_bb12ac06ea39(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        // Iterate through the two lists simultaneously
        for (int element : nums1) {
            for (int element2 : nums2) {
                // If the elements of the two lists are equal
                if (element == element2) {
                    // Increment the count
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_d89489ad_9457_4ac8_ac9a_4cb460b2b8b5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_937ec049_4f1e_4ca1_b9f1_f8482a3edb7f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    if (count > max) {
                        max = count;
                    }
                }
            }
        }
        return max;
    }

    
    public static int countSamePair_Problem_0_9a8005da_291c_4cb9_a3fc_1c0580c60d44(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff == minDiff) {
            count++;
        }
        if (maxDiff > minDiff) {
            count += nums1.size() - 1;
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_5364da97_8ddb_4a42_bcaf_1c27ae68e111(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int val1 = nums1.get(i);
            int val2 = nums2.get(i);
            if (val1 == val2)
                count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_552f6d5f_7a60_4d0a_bd5a_0a5896e098d4(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_02d967a3_fd6c_4f0e_a2d4_b337843010d0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        if(nums1.size() != nums2.size()) {
            System.out.println("The lists are not of the same length");
        } else {
            for(int i=0; i<nums1.size(); i++) {
                if(nums1.get(i) == nums2.get(i)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_c7c4cbfd_1f68_4579_a8f1_3ed3316d2516(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        Set<Integer> set1 = new HashSet<Integer>(nums1);
        Set<Integer> set2 = new HashSet<Integer>(nums2);
        set1.removeAll(set2);
        return set1.size();
    }

    
    public static int countSamePair_Problem_0_ff678200_4142_42df_ac5c_ae90cc2b798d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    sum++;
                }
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_3_e603d3b6_276e_4422_8f03_4d20cd4970ff(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int size = nums1.size();
        HashMap<Integer, Integer> count = new HashMap<>();
        count.put(nums2.get(0), 0);
        for (int i = 0; i < size; i++) {
            if (nums1.get(i) == nums2.get(0)) {
                count.put(nums2.get(0), count.get(nums2.get(0)) + 1);
            }
        }
        return count.entrySet().stream().filter(e -> e.getValue() > 1).count();
    }

    
    public static int countSamePair_Problem_2_9a433929_387e_4760_b126_c5f47904d1ab(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_989648b6_6966_4e71_8fdf_7581a43338b1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int minValue = Math.min(nums1.get(0), nums2.get(0));
        int maxValue = Math.max(nums1.get(nums1.size()-1), nums2.get(nums2.size()-1));
        for (int value = minValue; value <= maxValue; value++) {
            if (nums1.contains(value) && nums2.contains(value)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_b81696a0_875c_4b6f_8877_795fce15daba(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int x = 0;
        for (int i : nums1) {
            for (int j : nums2) {
                if (i == j) {
                    x++;
                }
            }
        }
        return x;
    }

    
    public static int countSamePair_Problem_1_91c0bb15_e165_4206_a5c5_9c44c1a64163(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here.
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int n1 = nums1.get(i);
            int n2 = nums2.get(i);
            if (n1 != n2) {
                if (n1 < n2) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_a3321cf2_55cc_4e16_8d92_0978c1ed56b5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_b05bb83f_072c_4b70_ae23_18f4bcb574df(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_3bb11b8c_7d05_46f1_8bbd_e335f2c52acb(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            Integer num1 = nums1.get(i);
            Integer num2 = nums2.get(i);
            if (num1 == num2) count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_024afd8f_4749_48ee_8f3a_8bd768d66e55(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        Iterator<Integer> itr = nums1.iterator();
        Iterator<Integer> itr2 = nums2.iterator();

        int first = itr.next();
        int second = itr2.next();

        while(itr.hasNext() && itr2.hasNext()) {
            if (itr.next() == itr2.next()) {
                count++;
            }
        }

        return count;
    }

    
    public static int countSamePair_Problem_2_6f21b78d_5877_4098_aec0_6a510b9c8dd1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        if(nums1.size() != nums2.size()) return count;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_9dc1c3c6_3420_45aa_9602_bb5547228cf3(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < nums1.size(); i++) {
            sum += nums1.get(i);
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_455a3932_29c0_4086_b2db_47c0426dce89(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_847ccfeb_3513_45df_9aee_3da8ccb24b22(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_5fa715c6_babf_4212_890f_1325619db372(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int size = Math.min(nums1.size(), nums2.size());
        int same = 0;
        for (int i=0; i<size; i++) {
            if (nums1.get(i) == nums2.get(i))
                same++;
        }
        return same;
    }

    
    public static int countSamePair_Problem_0_8fe5dd5f_e894_4c5a_bb10_a5e1be5a8f72(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0L;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i).equals(nums2.get(j))) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_0ca739de_bb2a_4d97_9aee_518838a10c52(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int countSamePair_Problem_3_0ca739de_bb2a_4d97_9aee_518838a10c52s = 0;
        int num1 = nums1.get(0), num2 = nums2.get(0);
        if (num1 == num2) {
            countSamePair_Problem_3_0ca739de_bb2a_4d97_9aee_518838a10c52s++;
            for (int i = 1; i < nums1.size(); i++) {
                num1 = nums1.get(i);
                num2 = nums2.get(i);
                if (num1 == num2) {
                    countSamePair_Problem_3_0ca739de_bb2a_4d97_9aee_518838a10c52s++;
                }
            }
        }
        return countSamePair_Problem_3_0ca739de_bb2a_4d97_9aee_518838a10c52s;
    }

    
    public static int countSamePair_Problem_1_353c7d36_cc4f_4620_82a6_1a9e3ed0f3be(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int sum = 0;
        int n = nums1.size();
        for (int i = 0; i < n; i++) {
            if (nums1.get(i) == nums2.get(i)) {
                sum++;
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_0_e89be6d5_a503_4287_a787_edf2e3f99eb8(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_3ae9bf24_55da_439b_9d13_ecaa81b6ef3e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int samePair = 0;
        int idx = 0;
        for(int i =0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                samePair++;
            }
        }
        return samePair;
    }

    
    public static int countSamePair_Problem_0_e3668522_7441_456e_8153_198e775abcb1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0L;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_1_c6e46a25_f51f_4d7f_8d6a_3d60c45393dd(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_df749f94_0be4_4cb8_9a55_84d6bf273cbb(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0L;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_833ba37b_e144_4e3c_a86d_5cbc188b092b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int length1 = nums1.size();
        int length2 = nums2.size();
        int count = 0;
        for(int i=0; i<length1; i++) {
            for(int j=0; j<length2; j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_7f6090c8_440e_44d2_ae36_d8f6f0d39bab(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int len = nums1.size();
        if(len == 0 || nums2.size() == 0 || len != nums2.size()){
            return 0;
        }
        int count = 0;
        for(int i = 0; i < len; i++){
            if(nums1.get(i) == nums2.get(i)){
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_9241711d_c7a6_4983_9af1_b5654ff0d370(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size()-1);
        int max2 = nums2.get(nums2.size()-1);
        for(int i = 0; i < nums1.size(); i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if(num1 == num2) {
                count++;
            }
            if(num1 > max1 && num2 > max2) {
                max1 = num1;
                max2 = num2;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_833ba37b_e144_4e3c_a86d_5cbc188b092b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int length1 = nums1.size();
        int length2 = nums2.size();
        int count = 0;
        for(int i=0; i<length1; i++) {
            for(int j=0; j<length2; j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_c1db34cd_8f4c_4693_b81b_730c2e6d0e47(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_f3a6ac92_d4d6_4b9a_ab91_6b481d32e5d0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_3704af7f_70d8_449f_a79c_00fa1379050d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_0c32bae8_656b_450f_887b_979e434ef05a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_9e7b9f28_6c3a_4c91_9490_71109db42aa1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_fd7ef3b7_78dc_4e45_af94_4ed9b7daeabd(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_e4fcfc4b_049c_412d_bbb6_c666178a8342(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_3_b6319d6d_24aa_41c9_8b01_9e2678ae0173(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff != minDiff) {
            count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_321515f4_2982_49bd_9001_8e72b0cb93d0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        if(nums1.size() != nums2.size()) {
            return result;
        }
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                result++;
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_3_13f295db_43f1_4e00_a41e_22164c823f41(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff == minDiff) {
            count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_52e238ea_4e1e_4bd4_b219_ee56cc768786(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        Integer result = 0L;
        Integer s1 = null, s2 = null;
        for (Integer num : nums1) {
            if (s1 == null) {
                s1 = num;
            } else {
                if (s1 == num) {
                    result++;
                } else {
                    s1 = num;
                }
            }
        }
        for (Integer num : nums2) {
            if (s2 == null) {
                s2 = num;
            } else {
                if (s2 == num) {
                    result++;
                } else {
                    s2 = num;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_1_ab23b2c6_cb2c_43fd_93e6_55e6f1470c2d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int size1 = nums1.size();
        int size2 = nums2.size();

        // Iterate through all combinations
        for (int i1 = 0; i1 < size1; i1++) {
            int num1 = nums1.get(i1);
            for (int i2 = 0; i2 < size2; i2++) {
                int num2 = nums2.get(i2);

                if (num1 == num2)
                    return i1 * size2 + i2;
            }
        }
        return -1; // No pairs found
    }

    
    public static int countSamePair_Problem_1_4ff73d50_d7c8_4fb5_9f09_fabf1df63f2c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_d6707972_76c6_48f8_8c00_05ced137e08e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // write your code here
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums1.size(); i++) {
            map.put(nums1.get(i), nums2.get(i));
        }
        int count = 0;
        for(Integer num: map.values()){
            if(map.get(num) != null){
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_4a2269ab_c51a_4ff1_9b79_2a9143bd296f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int size = nums1.size();
        if (size != nums2.size()) {
            return 0L;
        }
        int count = 0L;
        for (int i = 0; i < size; i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count += 1L;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_7ded0297_0a04_4852_8b63_600bf042d8df(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_0981dd64_272b_4655_a5d4_8a58baf97d4a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int len = nums1.size();
        int count = 0;
        for (int i = 0; i < len; i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if (num1 == num2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_01419d17_58ce_4eb1_8ba2_2895fc96c04f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // write your logic here
        int numOne = 0;
        int numTwo = 0;
        int sum = 0;
        for(int i : nums1) {
            for(int j : nums2) {
                if(j == i) {
                    numOne++;
                }
                sum += j;
            }
        }
        if(numOne == nums2.size()) {
            return sum;
        } else {
            return -1;
        }
    }

    
    public static int countSamePair_Problem_2_ba3e1b62_3388_4831_8471_695e81ab85ec(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_30d8d68c_146b_436a_9c7a_5561ab1d5eb1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // This is the solution to the problem.
        // You can modify the return statement to return the answer you want.
        // You can also add other methods, classes, etc.
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_e3668522_7441_456e_8153_198e775abcb1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0L;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_1_f437cd54_5ff6_495d_85c6_2d97de64c924(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_55a99939_cad7_48ea_ae04_b77537813ad8(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int n = nums1.size();
        int m = nums2.size();
        int[] array = new int[n];
        int[] array2 = new int[m];
        int[] array3 = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = nums1.get(i);
        }
        for (int j = 0; j < m; j++) {
            array2[j] = nums2.get(j);
        }
        // System.out.println("array=" + Arrays.toString(array));
        for (int i = 0; i < n; i++) {
            if (array[i] == array2[i]) {
                for (int j = 0; j < n; j++) {
                    if (array[i] == array3[j]) {
                        count++;
                    }
                }
            }
        }
        // System.out.println("count=" + count);
        return count;
    }

    
    public static int countSamePair_Problem_1_52e238ea_4e1e_4bd4_b219_ee56cc768786(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        Integer result = 0L;
        Integer s1 = null, s2 = null;
        for (Integer num : nums1) {
            if (s1 == null) {
                s1 = num;
            } else {
                if (s1 == num) {
                    result++;
                } else {
                    s1 = num;
                }
            }
        }
        for (Integer num : nums2) {
            if (s2 == null) {
                s2 = num;
            } else {
                if (s2 == num) {
                    result++;
                } else {
                    s2 = num;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_0_d7af4d55_77d6_4858_b6b3_06e8aae90f93(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>(nums1);
        HashSet<Integer> set2 = new HashSet<Integer>(nums2);

        int count = 0;
        for(Integer key : set1) {
            if(set2.contains(key)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_2ce37688_9d18_497f_be43_df2a802a0123(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_48e81983_eb5c_46e8_9dd9_cb9db694ac0a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i).equals(nums2.get(j))) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_aaa1ef65_1636_4568_8464_00481de34b18(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        HashSet<Integer> hs1 = new HashSet<Integer>();
        HashSet<Integer> hs2 = new HashSet<Integer>();

        for (Integer e : nums1) {
            hs1.add(e);
        }

        for (Integer e : nums2) {
            hs2.add(e);
        }

        for (Integer e : hs1) {
            if (hs2.contains(e)) {
                count++;
            }
        }

        return count;
    }

    
    public static int countSamePair_Problem_2_98e6d2e3_0613_4cd2_b2fc_2c0a0c2c57cc(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int countSame = 0;
        for(int i=0; i<nums1.size(); i++) {
            for(int j=0; j<nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    countSame++;
                }
            }
        }
        return countSame;
    }

    
    public static int countSamePair_Problem_1_aac8758e_cfd3_490b_9799_6b554103b141(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            int n1 = nums1.get(i);
            int n2 = nums2.get(i);
            if(n1 == n2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_7b2522e8_e821_40ae_ba8e_0ce13634e49c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int nums1size = nums1.size();
        int nums2size = nums2.size();
        int diffSize = nums1size - nums2size;
        int[] diff = new int[diffSize];
        for (int i = 0; i < diffSize; i++) {
            diff[i] = nums1.get(nums1size - 1 - i) - nums2.get(nums2size - 1 - i);
        }
        Arrays.sort(diff);
        int counter = 0;
        for (int i = 0; i < diffSize; i++) {
            if (diff[i] == 0) {
                counter++;
            } else {
                break;
            }
        }
        return counter;
    }

    
    public static int countSamePair_Problem_0_1dd0f58c_776e_4656_ac15_e9eaff94176e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_3a59db8f_2737_498d_8473_f083db2ec182(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_a29ebac3_1441_44c6_92d4_9e692b785db8(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int minInd1 = -1, minInd2 = -1;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) < min1) {
                min1 = nums1.get(i);
                minInd1 = i;
            }
            if(nums2.get(i) < min2) {
                min2 = nums2.get(i);
                minInd2 = i;
            }
        }
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == min1 && nums2.get(i) == min2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_19395283_49a4_4449_95ca_ebd346235e88(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_7b2522e8_e821_40ae_ba8e_0ce13634e49c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int nums1size = nums1.size();
        int nums2size = nums2.size();
        int diffSize = nums1size - nums2size;
        int[] diff = new int[diffSize];
        for (int i = 0; i < diffSize; i++) {
            diff[i] = nums1.get(nums1size - 1 - i) - nums2.get(nums2size - 1 - i);
        }
        Arrays.sort(diff);
        int counter = 0;
        for (int i = 0; i < diffSize; i++) {
            if (diff[i] == 0) {
                counter++;
            } else {
                break;
            }
        }
        return counter;
    }

    
    public static int countSamePair_Problem_3_aa14a5a2_6745_487a_a84e_7f6a20c888e8(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < nums1.size(); i++) {
            sum += nums1.get(i);
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_02d967a3_fd6c_4f0e_a2d4_b337843010d0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        if(nums1.size() != nums2.size()) {
            System.out.println("The lists are not of the same length");
        } else {
            for(int i=0; i<nums1.size(); i++) {
                if(nums1.get(i) == nums2.get(i)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_11d223a1_681c_4d9b_a673_853a7ee689ac(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i=0; i<nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_a1030a91_c6c5_4243_a133_9e9dadfe5d7e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for (int i : nums1) {
            for (int j : nums2) {
                if (i == j) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_3_beb2ee9f_fbd9_44cf_913f_37ad292693b9(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_0c24df32_8067_409e_8837_c93d9f8ee360(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_2b91d320_52d4_4219_b3ad_24894d0011a5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // write your code here
        int count = 0;
        for (int i = 0; i < nums1.size(); ++i) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_0f076540_a3cc_4f19_bb1e_5fea519488c4(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int size = nums1.size();
        int size2 = nums2.size();
        if (size != size2) {
            throw new IllegalArgumentException("The two arrays must be the same size");
        }
        return nums1.stream().mapToInteger((Integer l) -> l).distinct().count();
    }

    
    public static int countSamePair_Problem_0_f705c9a4_aa21_4eed_8093_b16f0ed9d597(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if(nums1.size() != nums2.size()) {
            return 0;
        }
        
        return IntStream.range(0, nums1.size()).filter(i -> nums1.get(i) == nums2.get(i))
                        .count();
    }

    
    public static int countSamePair_Problem_3_455a3932_29c0_4086_b2db_47c0426dce89(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_81bad13a_f668_471d_ac39_d5074ef13239(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        ArrayList<Integer> same = new ArrayList<Integer>();
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    same.add(nums1.get(i));
                }
            }
        }
        return same.size();
    }

    
    public static int countSamePair_Problem_3_f2783087_0a83_4af2_b241_1bcc2d6827c1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int i = 0; i < nums1.size(); i++) {
            counts.put(nums1.get(i), counts.getOrDefault(nums1.get(i), 0L) + 1);
        }
        int ret = 0;
        for (int i = 0; i < nums2.size(); i++) {
            if (counts.get(nums2.get(i)) > 0) {
                ret += counts.get(nums2.get(i));
                counts.put(nums2.get(i), counts.getOrDefault(nums2.get(i), 0L) - 1);
            }
        }
        return ret;
    }

    
    public static int countSamePair_Problem_2_7bcabc04_2eda_4b94_9dd1_4fdadf0a0f8c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int[] pair = new int[2];
        int count = 0;
        for (int i = 0; i <= nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                pair[0]++;
                pair[1]++;
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_f8b11c57_9975_428e_bfdd_ea369ea6b9c5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int j = 0;
            int n = nums1.get(i);
            for (int k = i; k < nums1.size(); k++) {
                if (n == nums2.get(j)) {
                    count++;
                }
                j++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_beb2ee9f_fbd9_44cf_913f_37ad292693b9(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_7f531113_b04c_4d58_8d9c_25b9b5ad5864(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff != minDiff) {
            count = maxDiff - minDiff;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_7bcabc04_2eda_4b94_9dd1_4fdadf0a0f8c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int[] pair = new int[2];
        int count = 0;
        for (int i = 0; i <= nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                pair[0]++;
                pair[1]++;
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_62190d2c_adf6_4a76_a24a_33234abddd34(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); ++i) {
            for(int j = 0; j < nums2.size(); ++j) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_6589e1d5_6290_464c_8ce1_ecc19a51cbd0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_005181b5_a6a2_452d_b64c_c73104f4048e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int samePair = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    samePair++;
                }
            }
        }
        return samePair;
    }

    
    public static int countSamePair_Problem_3_75c313b0_9393_4244_b11a_d0c8b65e945a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int size = nums1.size();
        int result = 0;
        int sum = 0;
        for(int i = 0; i < size; i++) {
            sum += nums1.get(i);
            sum += nums2.get(i);
            for(int j = 1; j < size; j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    result += 1;
                }
            }
        }
        return result - sum;
    }

    
    public static int countSamePair_Problem_0_73be3163_2f21_490d_ab48_7eb38efb2349(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int count = 0;
        for(int i=0;i<nums1.size();i++) {
            int i1 = nums1.get(i);
            int i2 = nums2.get(i);
            if(i1 == i2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_0981dd64_272b_4655_a5d4_8a58baf97d4a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int len = nums1.size();
        int count = 0;
        for (int i = 0; i < len; i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if (num1 == num2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_8d090050_073e_451e_bdb6_72931b056990(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if (nums1.size() != nums2.size()) throw new RuntimeException("Size mismatch");
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_f8678f01_70c5_4bcc_a58f_47361dc2c31f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_62190d2c_adf6_4a76_a24a_33234abddd34(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); ++i) {
            for(int j = 0; j < nums2.size(); ++j) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_a898470b_633f_44f5_af5d_d5c7bf9f51f2(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int sum = 0;
        boolean same = True;

        for(int i=0; i<nums1.size(); i++) {
            if(nums1.get(i) != nums2.get(i)) {
                same = False;
            }
        }

        if(same) {
            for(int i=0; i<nums1.size(); i++) {
                sum += nums1.get(i);
            }
        }

        return sum;
    }

    
    public static int countSamePair_Problem_2_de9905bf_2581_4855_ace7_c5d476fc99cc(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int count = 0;
        if(nums1.size() != nums2.size())
            return count;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i))
                count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_65721580_417e_4ea1_ac3e_beeafb021e33(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_3_63208cdf_ef18_455d_a4e2_f63a7e652492(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size()-1);
        int max2 = nums2.get(nums2.size()-1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == max1 && nums2.get(i) == max2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_4cd30a25_cc91_4e46_9eba_312270a5bc39(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int size = nums1.size();
        for (int i = 0; i < size; i++) {
            int a = nums1.get(i);
            int b = nums2.get(i);
            if (a == b) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_2c5fea74_bad1_4f82_9eb5_7b337178f4e3(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int cnt = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                cnt++;
            }
        }
        return cnt;
    }

    
    public static int countSamePair_Problem_3_73be3163_2f21_490d_ab48_7eb38efb2349(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int count = 0;
        for(int i=0;i<nums1.size();i++) {
            int i1 = nums1.get(i);
            int i2 = nums2.get(i);
            if(i1 == i2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_6282a880_b632_4a44_b4a5_fc1f2f9b7d50(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int mid1 = max1 + (max2 - min1) / 2;
        int mid2 = max2 + (max1 - min2) / 2;
        int diff1 = mid1 - min1;
        int diff2 = mid2 - min2;
        int diff3 = max1 - max2;
        if (diff1 < diff2 && diff1 < diff3) {
            count = count + 1;
        }
        if (diff2 < diff1 && diff2 < diff3) {
            count = count + 1;
        }
        if (diff3 < diff1 && diff3 < diff2) {
            count = count + 1;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_105c3c5c_51da_41de_b076_fa175c98800a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    sum += i;
                }
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_2_ac62ca9d_72d5_4cd6_bb35_85bd22383534(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int x = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    x++;
                }
            }
        }
        return x;
    }

    
    public static int countSamePair_Problem_3_d24350d7_3e07_4aff_ad5b_33995049da4e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int total = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    total++;
                }
            }
        }
        return total;
    }

    
    public static int countSamePair_Problem_1_e9a0d18c_1e82_48d7_bbe9_85a71b7c5e24(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == max1 && nums2.get(i) == max2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_e7c674b3_050a_40ae_ae75_719a21d3bf90(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            int key = nums1.get(i);
            if (map.containsKey(key)) {
                count += map.get(key);
            }
            map.put(nums1.get(i), i);
        }
        for(int i = 0; i < nums2.size(); i++) {
            int key = nums2.get(i);
            if (map.containsKey(key)) {
                count += map.get(key);
            }
            map.put(nums2.get(i), i);
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_b16a6b3d_a865_40a7_a32e_8da68913f22e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        // Iterate over the first list and look for same values as in the second list
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_5f6def31_bc2c_4389_9aed_a740a7709129(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_e350a083_9d46_435d_a2d9_d643888acc9b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int len1 = nums1.size();
        int len2 = nums2.size();
        int count = 0;
        
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        
        return count;
    }

    
    public static int countSamePair_Problem_3_1340862d_bf2f_4719_83aa_0c88030bef8a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < nums1.size(); i++) {
            if(!map.containsKey(nums1.get(i))) {
                map.put(nums1.get(i), new ArrayList<>());
            }
            map.get(nums1.get(i)).add(nums2.get(i));
        }
        return map.entrySet().stream().filter(entry -> entry.getValue().size() > 1).count();
    }

    
    public static int countSamePair_Problem_1_5a331477_a72f_40ef_b562_513c52c79455(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int res = 0;
        if (nums1.size() != nums2.size()) {
            return res;
        }
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                res++;
            }
        }
        return res;
    }

    
    public static int countSamePair_Problem_0_a06c4e1c_3922_46fc_a1da_8797e7cf7863(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // TODO: Fill in the blanks
        int indexCount = 0;
        for (int i = 0; i < nums1.size() && i < nums2.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                indexCount++;
            }
        }
        return indexCount;
    }

    
    public static int countSamePair_Problem_1_cf8e95b7_07d8_47c0_9975_78ce2ac9e942(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_85ff4fca_a553_4ce4_8e18_87c2c8eacdda(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        int temp = 0;
        int temp2 = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_ba3e1b62_3388_4831_8471_695e81ab85ec(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_8b2fc8ad_eb53_4307_82d9_b429612f4fce(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int firstIndex = -1;
        int secondIndex = -1;
        int size = nums1.size();
        for(int i = 0; i < size; i++) {
            for(int j = i + 1; j < size; j++) {
                if((nums1.get(i) == nums1.get(j)) && (nums2.get(i) == nums2.get(j))) {
                    count++;
                    firstIndex = i;
                    secondIndex = j;
                }
            }
        }
        
        return count;
    }

    
    public static int countSamePair_Problem_0_d1f9d582_9b33_4b4a_a07a_071f502a3ac2(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_b35da3e5_d1f0_40a7_86a7_f5ec025dc681(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int n = nums1.size();
        int countSame = 0;
        for (int i = 0; i < n; i++) {
            int n1 = nums1.get(i);
            int n2 = nums2.get(i);
            if (n1 == n2) {
                countSame++;
            }
        }
        return countSame;
    }

    
    public static int countSamePair_Problem_1_5bf0cdb8_a374_427d_baa7_acf00dca8297(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // write your code here
        int retval = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int val1 = nums1.get(i);
            for (int j = 0; j < nums2.size(); j++) {
                int val2 = nums2.get(j);
                if (val1 == val2) {
                    retval++;
                    break;
                }
            }
        }
        return retval;
    }

    
    public static int countSamePair_Problem_0_a82467b1_fd90_4d85_a971_1bb3f3b9bae1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int smallestNum = Collections.min(nums1);
        int largestNum = Collections.max(nums1);
        int smallestNum2 = Collections.min(nums2);
        int largestNum2 = Collections.max(nums2);

        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == smallestNum && nums2.get(i) == largestNum) {
                count++;
            }
        }

        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == smallestNum2 && nums2.get(i) == largestNum2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_147d9870_e1a2_46fe_ae1e_400eaa80cf2b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_8d3ff3dc_dea1_427f_b44e_c588aed19220(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_8d090050_073e_451e_bdb6_72931b056990(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if (nums1.size() != nums2.size()) throw new RuntimeException("Size mismatch");
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_bf0e1ed6_f563_45c4_aa5e_9fc5c43e175d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_5f6def31_bc2c_4389_9aed_a740a7709129(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_ee14686f_f110_4f77_8a98_6d5003bba25e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        Set<Integer> set = new HashSet<Integer>();
        
        for(int i = 0; i < nums1.size(); i++) {
            Integer num1 = nums1.get(i);
            Integer num2 = nums2.get(i);
            
            if(set.contains(num1)) {
                result++;
            }
            
            set.add(num1);
        }
        
        return result;
    }

    
    public static int countSamePair_Problem_3_07da9f5f_516f_45f5_9474_78510b3f8a84(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Declare a int variable to hold counter
        int counter = 0;
        // For each value in nums1
        for (Integer num1 : nums1) {
            // If same value in nums2
            if (nums2.contains(num1)) {
                // Add 1 to counter
                counter++;
            }
        }
        // Return counter
        return counter;
    }

    
    public static int countSamePair_Problem_2_ff678200_4142_42df_ac5c_ae90cc2b798d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    sum++;
                }
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_0_32222bbf_e35a_4f40_8748_d1c2a7027178(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_e350a083_9d46_435d_a2d9_d643888acc9b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int len1 = nums1.size();
        int len2 = nums2.size();
        int count = 0;
        
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        
        return count;
    }

    
    public static int countSamePair_Problem_1_fa0486c5_bf42_48b2_9680_bf1b3133d1b8(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int sum = 0;
        int diff1 = 0;
        int diff2 = 0;
        // System.out.println(nums1);
        // System.out.println(nums2);
        // int size = nums1.size();
        // int size = nums2.size();
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                sum += i;
                diff1 += nums1.get(i);
                diff2 += nums2.get(i);
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_3_937b1a26_e17e_4ada_b85d_9949f3348897(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_f40cac96_2b2a_4b1c_bc8a_9ed093ca113e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++){
            for(int j = 0; j < nums2.size(); j++){
                if(nums1.get(i) == nums2.get(j)){
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_77ac9598_8d98_4fc4_ba85_d307f60be6f6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                list.add(nums1.get(i) * nums2.get(j));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_e00942dc_6865_43fb_acb6_f3d322ad0ffc(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_92812d82_403a_4550_91c3_a22629e287cd(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_0_9a00d206_07c6_4109_8d94_a18650ab6e44(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int pairs = 0;
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                if (num1 == num2) pairs += 1;
            }
        }
        return pairs;
    }

    
    public static int countSamePair_Problem_3_55598ab2_81b1_4938_aa67_b069e5a4db34(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        return IntStream.range(0, nums1.size())
            .filter(i -> nums1.get(i) == nums2.get(i))
            .count();
    }

    
    public static int countSamePair_Problem_2_31e4e8f3_abee_4a30_bf77_47bced40904b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int first = nums1.get(i);
            int second = nums2.get(i);
            if (first == second) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_1dd0f58c_776e_4656_ac15_e9eaff94176e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_fcbe7463_3d9a_4ffa_b7e1_09a2107c6077(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int sum = 0;
        // Iterate through the first list
        for (int i = 0; i < nums1.size(); i++) {
            // Iterate through the second list
            for (int j = 0; j < nums2.size(); j++) {
                // If the current index is the same in the two lists, add 1 to sum
                if (nums1.get(i) == nums2.get(j)) {
                    sum += 1;
                }
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_2_e5a63b6f_82fe_4e3f_80a5_2130bee68516(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int same = 0;
        int n = nums1.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    same++;
                }
            }
        }
        return same;
    }

    
    public static int countSamePair_Problem_0_f77175f5_da6f_4fea_af08_b837a8d3efb8(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_c45e3102_11ae_4999_bcbf_5ff5197657b5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int len1 = nums1.size();
        int len2 = nums2.size();
        for(int i = 0; i < len1 - 1; i++) {
            for(int j = 0; j < len2 - 1; j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_e5a63b6f_82fe_4e3f_80a5_2130bee68516(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int same = 0;
        int n = nums1.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    same++;
                }
            }
        }
        return same;
    }

    
    public static int countSamePair_Problem_3_a47dbf90_5b34_47cb_9829_1d2ef1787a6f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_0aaff729_57d2_49cb_ab97_d447de8f6ba7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_dcde38f4_8253_4681_8824_d87ce17fdfbd(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_4c74bbb3_662a_4ddc_b779_fb951eb50245(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        if(nums1.size() == nums2.size()) {
            for(int i=0; i<nums1.size(); i++) {
                if(nums1.get(i) == nums2.get(i)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_0_79ec09c3_7639_47a6_9344_86dbfce7d7b3(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        int temp;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_099615c3_7269_49d0_8072_0256c2f3fe0f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_850819b7_8423_4452_a692_3328eed8604d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int n = nums1.size();
        if(n != nums2.size()) {
            return 0L;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            Integer num1 = nums1.get(i);
            Integer num2 = nums2.get(i);
            if(!map.containsKey(num1)) {
                map.put(num1, 0);
            }
            if(!map.containsKey(num2)) {
                map.put(num2, 0);
            }
            if(map.get(num1).equals(map.get(num2))) {
                map.put(num1, map.get(num1) + 1);
                map.put(num2, map.get(num2) + 1);
            }
        }
        int sum = 0L;
        for(Integer key : map.keySet()) {
            if(map.get(key).equals(2)) {
                sum += map.get(key);
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_1_157fdf60_349a_4893_8be6_127bd6f3a9ab(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int[] temp = new int[nums1.size()];
        Arrays.fill(temp, 0);
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    temp[i]++;
                }
            }
        }
        return Arrays.stream(temp).sum();
    }

    
    public static int countSamePair_Problem_1_a1030a91_c6c5_4243_a133_9e9dadfe5d7e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for (int i : nums1) {
            for (int j : nums2) {
                if (i == j) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_1_62190d2c_adf6_4a76_a24a_33234abddd34(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); ++i) {
            for(int j = 0; j < nums2.size(); ++j) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_3bb11b8c_7d05_46f1_8bbd_e335f2c52acb(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            Integer num1 = nums1.get(i);
            Integer num2 = nums2.get(i);
            if (num1 == num2) count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_52e238ea_4e1e_4bd4_b219_ee56cc768786(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        Integer result = 0L;
        Integer s1 = null, s2 = null;
        for (Integer num : nums1) {
            if (s1 == null) {
                s1 = num;
            } else {
                if (s1 == num) {
                    result++;
                } else {
                    s1 = num;
                }
            }
        }
        for (Integer num : nums2) {
            if (s2 == null) {
                s2 = num;
            } else {
                if (s2 == num) {
                    result++;
                } else {
                    s2 = num;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_3_0e95904c_3876_43a1_b88f_29fb75136a10(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.stream().max(Integer::compareTo).get();
        int max2 = nums2.stream().max(Integer::compareTo).get();
        int min1 = nums1.stream().min(Integer::compareTo).get();
        int min2 = nums2.stream().min(Integer::compareTo).get();
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff == minDiff) {
            count = maxDiff + 1;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_500155ab_f771_4740_8474_f96d3ca17f8e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int samePair=0;
        for(int i=0;i<nums1.size();i++) {
            for(int j=0;j<nums2.size();j++) {
                if(nums1.get(i)==nums2.get(j)) {
                    samePair++;
                }
            }
        }
        return samePair;
    }

    
    public static int countSamePair_Problem_1_267fbad1_dcce_44b2_bab3_a986a7e7ae97(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums2.contains(nums1.get(i))) { 
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_de41a88a_2423_4452_942c_4ed5332786aa(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int idx1 = 0, idx2 = 0;
        int count = 0;
        while (idx1 < nums1.size() && idx2 < nums2.size()) {
            if (nums1.get(idx1) == nums2.get(idx2)) {
                count++;
                idx1++;
                idx2++;
            } else {
                if (idx1 < nums1.size() - 1) {
                    idx1++;
                } else {
                    idx2++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_017a8df9_29a2_41a8_a687_e20d05be8ec7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_479a865f_d290_45fd_bc62_427f84d45bce(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer num : nums1) set.add(num);
        for (Integer num : nums2) set.add(num);
        return set.stream().filter(i -> {
            return nums1.contains(i) && nums2.contains(i);
        }).count();
    }

    
    public static int countSamePair_Problem_3_b81da558_1ede_4eba_a820_b4cd8660dbfd(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int size = nums1.size();
        for(int i = 0; i < size; i++) {
            for(int j = i + 1; j < size; j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_9bd62295_2b40_46f9_8fba_f38b8dae10e0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int[] unique1 = new int[nums1.size()];
        int[] unique2 = new int[nums2.size()];

        // copy unique lists to new arrays
        for(int i = 0; i<nums1.size(); i++)
            unique1[i] = nums1.get(i);

        for(int i = 0; i<nums2.size(); i++)
            unique2[i] = nums2.get(i);

        // check if values in unique1 are in unique2
        for(int i = 0; i<unique1.length; i++)
            if(unique2[i] == unique1[i])
                return i;

        // if not, no pair
        return -1;
    }

    
    public static int countSamePair_Problem_1_f705c9a4_aa21_4eed_8093_b16f0ed9d597(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if(nums1.size() != nums2.size()) {
            return 0;
        }
        
        return IntStream.range(0, nums1.size()).filter(i -> nums1.get(i) == nums2.get(i))
                        .count();
    }

    
    public static int countSamePair_Problem_2_09913ea5_edf4_4434_b010_2fc0f30df03f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_98076f73_5c3a_4600_8bc7_c0e81dbfb36e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if (nums1.size() == nums2.size()) {
            int count = 0;
            for (int i = 0; i < nums1.size(); i++) {
                if (nums1.get(i) == nums2.get(i)) {
                    count++;
                }
            }
            return count;
        } else {
            return -1;
        }
    }

    
    public static int countSamePair_Problem_1_60c5a31a_cc45_49c7_829d_6a9833f6dbab(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if(nums1.size() != nums2.size()) {
            return 0;
        }

        int i = 0;
        int j = 0;
        int count = 0;

        while(i < nums1.size()) {
            if(nums1.get(i) == nums2.get(i)) {
                count++;
                i++;
                j++;
            } else if(j >= nums2.size()) {
                break;
            } else {
                i++;
            }
        }

        return count;
    }

    
    public static int countSamePair_Problem_1_ce155c18_c410_4df0_a13b_c70f9c64c3f2(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int l1 = nums1.size();
        int l2 = nums2.size();
        for(int i = 0; i < l1; i++) {
            if(nums1.get(i).equals(nums2.get(i))) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_9be74212_2e1b_4494_9fa2_5e8f141b4319(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // The first loop will loop through the first array list to find the values which appear in the second list.
        // The second loop will loop through the second array list to count the indices which are in the same position as in the first loop.
        ArrayList<Integer> duplicates = new ArrayList<Integer>();
        int counter = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                counter++;
            } else {
                duplicates.add(nums2.get(i));
            }
        }
        return counter;
    }

    
    public static int countSamePair_Problem_3_7cca4d67_78bf_44fe_ac63_480ea5520a82(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            sum += nums1.get(i);
        }
        for (int i = 0; i < nums2.size(); i++) {
            sum += nums2.get(i);
        }
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_321515f4_2982_49bd_9001_8e72b0cb93d0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        if(nums1.size() != nums2.size()) {
            return result;
        }
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                result++;
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_3_f8678f01_70c5_4bcc_a58f_47361dc2c31f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_a039a1bd_c5e5_451c_bbf8_8e472ebf9e74(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int total = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    total++;
                }
            }
        }
        return total;
    }

    
    public static int countSamePair_Problem_3_2244c13c_7d95_41b2_9e91_1db507f07d1e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int size = nums1.size();
        int nums2index = 0;
        int nums1index = 0;
        int count = 0;
        while(nums2index < size) {
            if(nums1.get(nums1index) == nums2.get(nums2index)) {
                count++;
                nums1index++;
                nums2index++;
            } else if(nums1.get(nums1index) < nums2.get(nums2index)) {
                nums2index++;
            } else if(nums2.get(nums2index) < nums1.get(nums1index)) {
                nums1index++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_98076f73_5c3a_4600_8bc7_c0e81dbfb36e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if (nums1.size() == nums2.size()) {
            int count = 0;
            for (int i = 0; i < nums1.size(); i++) {
                if (nums1.get(i) == nums2.get(i)) {
                    count++;
                }
            }
            return count;
        } else {
            return -1;
        }
    }

    
    public static int countSamePair_Problem_3_4a7a591a_d37b_44d3_9210_ba9e29cdc7f6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i=0; i<nums1.size(); ++i) {
            for(int j=0; j<nums2.size(); ++j) {
                if(nums1.get(i).equals(nums2.get(j))) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_9c6dfb98_75dd_4c16_9552_876c8d1b9859(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        return IntStream.range(0, nums1.size())
                .filter(i -> nums1.get(i) == nums2.get(i))
                .count();
    }

    
    public static int countSamePair_Problem_0_c40bebd3_2ea3_407e_9efc_f01d94dbeaea(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0L;
        for (int i = 0; i < nums1.size(); i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if (num1 == num2) count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_2d5b9d13_0acb_4826_b22c_628b3cc683f5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size()-1);
        int max2 = nums2.get(nums2.size()-1);
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == max1 && nums2.get(i) == max2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_0a16c86c_5411_4e77_b53d_87783eb6602e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_ac62ca9d_72d5_4cd6_bb35_85bd22383534(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int x = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    x++;
                }
            }
        }
        return x;
    }

    
    public static int countSamePair_Problem_1_a82467b1_fd90_4d85_a971_1bb3f3b9bae1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int smallestNum = Collections.min(nums1);
        int largestNum = Collections.max(nums1);
        int smallestNum2 = Collections.min(nums2);
        int largestNum2 = Collections.max(nums2);

        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == smallestNum && nums2.get(i) == largestNum) {
                count++;
            }
        }

        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == smallestNum2 && nums2.get(i) == largestNum2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_0c8d4fd0_5a0a_43b2_a21b_acc7821941cf(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for(int j = i+1; j < nums1.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_91c0bb15_e165_4206_a5c5_9c44c1a64163(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here.
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int n1 = nums1.get(i);
            int n2 = nums2.get(i);
            if (n1 != n2) {
                if (n1 < n2) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_c0fcaf5e_10e0_4130_bedf_c62c09ffeb35(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        return 0;
    }

    
    public static int countSamePair_Problem_1_017a8df9_29a2_41a8_a687_e20d05be8ec7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_cf17457b_400e_4c26_9dda_a0f8a5913664(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int mid1 = max1 + (max2 - min1) / 2;
        int mid2 = max1 + (max2 - min1) / 2;
        int mid = mid1 + (mid2 - min1) / 2;
        int diff1 = max1 - mid1;
        int diff2 = max2 - mid2;
        int diff = mid - min1;
        if (diff1 == diff2 && diff1 == diff) {
            count++;
            sum += max1 - min1;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_bbef5eaa_b409_460b_affc_71fae569b3cb(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int counter = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i).equals(nums2.get(i))) {
                counter++;
            }
        }
        return counter;
    }

    
    public static int countSamePair_Problem_1_9a8005da_291c_4cb9_a3fc_1c0580c60d44(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff == minDiff) {
            count++;
        }
        if (maxDiff > minDiff) {
            count += nums1.size() - 1;
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_331ccb65_de0d_4f53_badd_e2c53f8b5da1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Note: The returned count should be a 32-bit unsigned integer.
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_9fde907f_3c72_4843_9e46_eaf4f551ebce(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_89d619de_4027_47b9_afab_f04221b043b7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int pairs = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    
    public static int countSamePair_Problem_0_7f9b13f0_bf5c_43c4_844f_03724ca58b7c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int countSame = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int l1 = nums1.get(i);
            int l2 = nums2.get(i);
            if (l1 == l2) countSame++;
        }
        return countSame;
    }

    
    public static int countSamePair_Problem_3_535439ac_50b8_4c50_aab0_39c1ab520175(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        Integer[] nums1Arr = nums1.toArray(new Integer[0]);
        Integer[] nums2Arr = nums2.toArray(new Integer[0]);

        int result = 0;
        Arrays.sort(nums1Arr);
        Arrays.sort(nums2Arr);
        for(int i = 0; i < nums1Arr.length; i++) {
            int temp = nums1Arr[i];
            int index = Arrays.binarySearch(nums2Arr, temp);
            if(index >= 0) {
                result++;
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_3_6c7c8f79_f1e2_4350_a839_446e9abed859(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int samePairs = 0;

        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                samePairs++;
            }
        }
        return samePairs;
    }

    
    public static int countSamePair_Problem_1_50e46fcf_325d_4f6c_8fa4_34a83d8abaf1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        int temp;
        for (int i = 0; i < nums1.size(); i++) {
            temp = nums1.get(i);
            sum += temp;
            if (nums2.contains(sum)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_a03fda5f_08ca_431b_897a_0277b4d77823(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        boolean same = False;
        for(int num1 : nums1)
        {
            for(int num2 : nums2)
            {
                same = num1 == num2;
                if (same)
                {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_93f0c9a8_4f16_4a41_b9b4_b2fbc29d7c38(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff != minDiff) {
            count = maxDiff - minDiff;
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_c0fcaf5e_10e0_4130_bedf_c62c09ffeb35(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        return 0;
    }

    
    public static int countSamePair_Problem_0_5364da97_8ddb_4a42_bcaf_1c27ae68e111(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int val1 = nums1.get(i);
            int val2 = nums2.get(i);
            if (val1 == val2)
                count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_637450f5_0515_4fcd_8ddb_5c3a4ca5ac96(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff != minDiff) {
            count = maxDiff + minDiff;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_d8bbd3c6_ed9c_40a5_8cdc_fcda60abf02c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_e3d629ab_ed2c_4149_bb3e_2f4ca2a098aa(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_4a7a591a_d37b_44d3_9210_ba9e29cdc7f6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i=0; i<nums1.size(); ++i) {
            for(int j=0; j<nums2.size(); ++j) {
                if(nums1.get(i).equals(nums2.get(j))) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_e4fcfc4b_049c_412d_bbb6_c666178a8342(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_2_3123ca9b_e8ca_4a8e_abf2_b27921b3ad91(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Your code here
        Integer numsSum = new Integer(0);
        Integer numsDiff = new Integer(0);
        for (int i : nums1) {
            if(i==nums2.get(nums2.size()-1))
                numsSum+=i;
            else
                numsDiff+=i*(nums2.get(nums2.size()-1));
        }
        return Math.abs(numsSum-numsDiff);
    }

    
    public static int countSamePair_Problem_1_b81da558_1ede_4eba_a820_b4cd8660dbfd(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int size = nums1.size();
        for(int i = 0; i < size; i++) {
            for(int j = i + 1; j < size; j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_d8bbd3c6_ed9c_40a5_8cdc_fcda60abf02c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_7974c722_3313_4eb8_b978_e7e586326c63(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        int same = 0;
        for(Integer a: nums1) {
            if(set.contains(a)) {
                same++;
            }
            set.add(a);
        }
        for(Integer b: nums2) {
            if(set.contains(b)) {
                same++;
            }
            set.add(b);
        }
        return same;
    }

    
    public static int countSamePair_Problem_1_b26d6a33_8957_4e48_aaf7_4eadba56673f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_c7547bea_2f56_4def_ace4_2b4114c3c0e5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff == minDiff) {
            count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_f3dab9f7_6071_46b2_8eca_325dd5189801(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int size = nums1.size();
        if (size != nums2.size()) return 0;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_7fe14aad_5a4e_4bae_bd47_41a2e257b468(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int samePairCount = 0;
        for(int i=0; i<nums1.size() && i<nums2.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                samePairCount++;
            }
        }
        return samePairCount;
    }

    
    public static int countSamePair_Problem_0_a898470b_633f_44f5_af5d_d5c7bf9f51f2(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int sum = 0;
        boolean same = True;

        for(int i=0; i<nums1.size(); i++) {
            if(nums1.get(i) != nums2.get(i)) {
                same = False;
            }
        }

        if(same) {
            for(int i=0; i<nums1.size(); i++) {
                sum += nums1.get(i);
            }
        }

        return sum;
    }

    
    public static int countSamePair_Problem_1_d6ecc4bb_7829_433c_959e_43718107df4f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            ArrayList<Integer> subNums1 = new ArrayList<>(nums1);
            subNums1.remove(i);
            for (int j = 0; j < nums2.size(); j++) {
                ArrayList<Integer> subNums2 = new ArrayList<>(nums2);
                subNums2.remove(j);
                if (subNums1.equals(subNums2)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_535439ac_50b8_4c50_aab0_39c1ab520175(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        Integer[] nums1Arr = nums1.toArray(new Integer[0]);
        Integer[] nums2Arr = nums2.toArray(new Integer[0]);

        int result = 0;
        Arrays.sort(nums1Arr);
        Arrays.sort(nums2Arr);
        for(int i = 0; i < nums1Arr.length; i++) {
            int temp = nums1Arr[i];
            int index = Arrays.binarySearch(nums2Arr, temp);
            if(index >= 0) {
                result++;
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_3_b7c6ad9c_2f66_4ed8_a9bb_318e6180f111(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_14499119_a561_4807_bebf_e438ae9c7817(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        
        return count;
    }

    
    public static int countSamePair_Problem_0_aa14a5a2_6745_487a_a84e_7f6a20c888e8(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < nums1.size(); i++) {
            sum += nums1.get(i);
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_54a845e8_3672_4981_9acc_6b25c66b0461(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums1.size(); i++) {
            map.put(nums1.get(i), nums2.get(i));
        }
        for(int i = 0; i < nums1.size(); i++) {
            if(map.get(nums1.get(i)) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_a4bf9141_864f_454a_ae8a_4ca305b71daa(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int cnt = 0;
        int len = nums1.size();
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    
    public static int countSamePair_Problem_0_2ebcf6ec_a4a7_40cf_86e1_28efcb51b694(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_0e95904c_3876_43a1_b88f_29fb75136a10(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.stream().max(Integer::compareTo).get();
        int max2 = nums2.stream().max(Integer::compareTo).get();
        int min1 = nums1.stream().min(Integer::compareTo).get();
        int min2 = nums2.stream().min(Integer::compareTo).get();
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff == minDiff) {
            count = maxDiff + 1;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_13f295db_43f1_4e00_a41e_22164c823f41(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff == minDiff) {
            count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_524ace8c_ff8d_4b79_aa47_3a0294f5007c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int tmp = 0;
        for(int i = 0; i < nums1.size(); i++) {
            tmp = nums1.get(i);
            for(int j = 0; j < nums2.size(); j++) {
                if(tmp == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_dad26e32_0e21_4d15_995b_b380d61e2cf3(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_e9a0d18c_1e82_48d7_bbe9_85a71b7c5e24(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == max1 && nums2.get(i) == max2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_d29dd7a3_53b4_4b6e_b113_08d59b7345c4(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        return nums1.stream()
                    .filter(n -> nums2.contains(n))
                    .count();
    }

    
    public static int countSamePair_Problem_0_5387ec4a_7029_4432_a181_374700cda4f9(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        int size = nums1.size();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    result += 1;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_3_95b7d394_0c52_4702_8a42_bb12ac06ea39(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        // Iterate through the two lists simultaneously
        for (int element : nums1) {
            for (int element2 : nums2) {
                // If the elements of the two lists are equal
                if (element == element2) {
                    // Increment the count
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_04caf1ce_423b_48e3_a2b1_eff323663377(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for(int i = 0; i < nums1.size(); i++) {
            int j = 0;
            while(j < nums2.size() && nums1.get(i) == nums2.get(j)) {
                j++;
            }
            result += nums1.get(i) == nums2.get(j) ? 1 : 0;
        }
        return result;
    }

    
    public static int countSamePair_Problem_0_cf8e95b7_07d8_47c0_9975_78ce2ac9e942(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_aa14a5a2_6745_487a_a84e_7f6a20c888e8(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < nums1.size(); i++) {
            sum += nums1.get(i);
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_f5808dbe_a9a6_4e3f_9a31_5a5d0477c051(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // The number of pairs of equal values is the length of the intest array.
        int pairCount = 0;

        // Create a sorted list of all the values in the arrays. This list will be used to compare elements with the same values.
        ArrayList<Integer> values = new ArrayList<Integer>(nums1);
        for (int i = 0; i < nums1.size(); i++) {
            values.add(nums1.get(i));
        }

        // Create a sorted list of all the values in the arrays. This list will be used to compare elements with the same values.
        ArrayList<Integer> values2 = new ArrayList<Integer>(nums2);
        for (int i = 0; i < nums2.size(); i++) {
            values2.add(nums2.get(i));
        }

        // Compare the arrays. If two elements with the same values then increment the count for both arrays.
        for (int i = 0; i < values.size(); i++) {
            for (int j = 0; j < values2.size(); j++) {
                if (values.get(i) == values2.get(j)) {
                    pairCount++;
                }
            }
        }

        return pairCount;
    }

    
    public static int countSamePair_Problem_1_c97c8f9b_755b_4988_a442_d1781bb31d46(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        if (nums1.size() == nums2.size()) {
            for (int i = 0; i < nums1.size(); i++) {
                if (nums1.get(i) == nums2.get(i)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_a3321cf2_55cc_4e16_8d92_0978c1ed56b5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_8b2fc8ad_eb53_4307_82d9_b429612f4fce(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int firstIndex = -1;
        int secondIndex = -1;
        int size = nums1.size();
        for(int i = 0; i < size; i++) {
            for(int j = i + 1; j < size; j++) {
                if((nums1.get(i) == nums1.get(j)) && (nums2.get(i) == nums2.get(j))) {
                    count++;
                    firstIndex = i;
                    secondIndex = j;
                }
            }
        }
        
        return count;
    }

    
    public static int countSamePair_Problem_2_775bf3cc_4100_4fbb_b09e_e8d340062a1b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int n = nums1.size();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if (num1 == num2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_2d0f8b37_5ea0_4297_b23f_6acc38efdb05(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int n1:nums1){
            for(int n2:nums2){
                if(n1 == n2){
                    count ++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_2e055cbb_94c6_4779_ad87_f1838861caa6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for(int i=0;i<nums1.size();i++) {
            for(int j=0;j<nums2.size();j++) {
                if(nums1.get(i).equals(nums2.get(j))) {
                    if(!map.containsKey(nums1.get(i))) {
                        map.put(nums1.get(i), 1);
                    }
                    else {
                        map.put(nums1.get(i), map.get(nums1.get(i)) + 1);
                    }
                }
            }
        }
        for(int i=0;i<nums1.size();i++) {
            for(int j=0;j<nums2.size();j++) {
                if(nums1.get(i).equals(nums2.get(j))) {
                    if(map.get(nums1.get(i)).equals(1)) {
                        result += j;
                    }
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_3_277fbc1a_a6a2_435f_968f_957dbb952a2b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); ++i) {
            if(nums1.get(i) == nums2.get(i))
                count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_e7c674b3_050a_40ae_ae75_719a21d3bf90(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            int key = nums1.get(i);
            if (map.containsKey(key)) {
                count += map.get(key);
            }
            map.put(nums1.get(i), i);
        }
        for(int i = 0; i < nums2.size(); i++) {
            int key = nums2.get(i);
            if (map.containsKey(key)) {
                count += map.get(key);
            }
            map.put(nums2.get(i), i);
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_4cbb4271_b582_4c38_b974_ab96c0135382(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_fa561206_1218_4fa5_af6f_25e484b97c0c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_35b47115_9ad6_4ce2_8d32_7b9facb6b22b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Your code here
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums1){
            map.put(i,map.getOrDefault(i,0L)+1);
        }
        for (Integer i : nums2){
            map.put(i,map.getOrDefault(i,0L)+1);
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                count+=entry.getKey();
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_878d09da_9280_499e_9286_873e377b1e11(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int countsame = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j))
                    countsame++;
            }
        }
        return countsame;
    }

    
    public static int countSamePair_Problem_3_a287326b_9c28_413e_ab06_615299d70b77(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_90bc40bd_52f2_4675_8a75_4e8a6e9c0f90(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_5fa715c6_babf_4212_890f_1325619db372(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int size = Math.min(nums1.size(), nums2.size());
        int same = 0;
        for (int i=0; i<size; i++) {
            if (nums1.get(i) == nums2.get(i))
                same++;
        }
        return same;
    }

    
    public static int countSamePair_Problem_2_cc96d161_6b79_472a_995d_ad426e1c0854(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if (nums1.size() != nums2.size())
            return 0;
        int samePairCount = 0;
        int n = nums1.size();
        for(int i = 0; i < n; ++i) {
            for(int j = i+1; j < n; ++j) {
                if(nums1.get(i) == nums2.get(j))
                    ++samePairCount;
            }
        }
        return samePairCount;
    }

    
    public static int countSamePair_Problem_3_aaa1ef65_1636_4568_8464_00481de34b18(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        HashSet<Integer> hs1 = new HashSet<Integer>();
        HashSet<Integer> hs2 = new HashSet<Integer>();

        for (Integer e : nums1) {
            hs1.add(e);
        }

        for (Integer e : nums2) {
            hs2.add(e);
        }

        for (Integer e : hs1) {
            if (hs2.contains(e)) {
                count++;
            }
        }

        return count;
    }

    
    public static int countSamePair_Problem_1_f3a6ac92_d4d6_4b9a_ab91_6b481d32e5d0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_6efdd30d_c8d5_4853_9d4d_fc49dda9e43d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        Integer[] arr = new Integer[nums1.size()];
        nums1.toArray(arr);
        int ind = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_e985f31c_20b4_49f4_a240_ebf003533dc9(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_52074eea_4137_4169_9d7f_6970549321ad(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff > minDiff) {
            count = maxDiff - minDiff;
        } else {
            count = minDiff - maxDiff;
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_cdf3a5ed_06e5_4c27_8a1b_8c0ad8e4d55a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if(nums1.size() != nums2.size()) return 0;
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_66e38f38_b7a3_4ad5_a33a_f0c4fcfd13e3(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff > minDiff) {
            count = maxDiff - minDiff;
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_4f9fcd48_8562_48fc_bae4_1e362854c442(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0; // Initializing count with zero
        for (int i = 0; i < nums1.size() && i < nums2.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) { // Checks both lists elements match with the current index
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_dad26e32_0e21_4d15_995b_b380d61e2cf3(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_cdf3a5ed_06e5_4c27_8a1b_8c0ad8e4d55a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if(nums1.size() != nums2.size()) return 0;
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_147d9870_e1a2_46fe_ae1e_400eaa80cf2b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_399a3aee_8e99_482a_916d_ee131d12bd92(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int len = nums1.size();
        if(len != nums2.size()) {
            return -1;
        }
        int count = 0;
        for(int i = 0; i < len; i++) {
            if(nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_88fe6011_43d6_4190_9be9_461040a8320d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int ret = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                ret++;
            }
        }
        return ret;
    }

    
    public static int countSamePair_Problem_0_a1f7fc6e_c623_4dc9_a8a0_679c6b991ba5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i).equals(nums2.get(j))) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_eaeedb82_4727_4040_a515_b2607d0602a3(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if (num1 == num2)
                count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_2b4db0c7_3320_4f64_a4f0_94aa826e2763(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_b6a5f03a_74fb_481a_84cb_3a9e5ce76001(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int numsSize = nums1.size();
        int nums2Size = nums2.size();
        int count = 0;
        int index = 0;
        if (numsSize < nums2Size) {
            while (index != numsSize - 1) {
                if (nums1.get(index) == nums2.get(index)) {
                    count++;
                    index++;
                } else if (nums2.get(index) == nums1.get(index)) {
                    count++;
                    index++;
                } else {
                    index++;
                }
            }
            return count;
        } else if (numsSize > nums2Size) {
            while (index != nums2Size - 1) {
                if (nums2.get(index) == nums1.get(index)) {
                    count++;
                    index++;
                } else if (nums1.get(index) == nums2.get(index)) {
                    count++;
                    index++;
                } else {
                    index++;
                }
            }
            return count;
        } else {
            return numsSize;
        }

    }

    
    public static int countSamePair_Problem_3_d788aa26_d2d4_4105_9887_9030c1d4b17b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int same = 0;
        for(int i = 0; i < nums1.size() && i < nums2.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                same++;
            }
        }
        return same;
    }

    
    public static int countSamePair_Problem_1_8bd60857_85da_42fc_8c3d_76aeb46dece7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int temp;
        for(int i = 0; i < nums1.size(); i++) {
            temp = nums1.get(i);
            for(int j = 0; j < nums2.size(); j++) {
                if(temp == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_b8b3b937_0d91_456c_9432_a1642f81755e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        boolean same = True;
        while ((same = True) && (nums1.size() > 0 && nums2.size() > 0)) {
            same = False;
            int smallest = nums1.size() > nums2.size() ? nums1.size() : nums2.size();
            int i = 0;
            int j = 0;
            if (smallest > 0) {
                for (; i <= smallest - 1; i++) {
                    if (nums1.get(i) == nums2.get(j)) {
                        same = True;
                        count++;
                    }
                }
            }
            if (smallest < nums1.size()) {
                for (; i <= nums1.size() - 1; i++) {
                    if (nums1.get(i) == nums2.get(j)) {
                        same = True;
                        count++;
                    }
                }
            }
            if (smallest > nums2.size()) {
                for (; i <= nums2.size() - 1; i++) {
                    if (nums1.get(i) == nums2.get(j)) {
                        same = True;
                        count++;
                    }
                }
            }
            i++;
            j++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_984f34bd_77eb_4aae_8172_844dce15ec7f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int total = 0;
        for (int i = 0; i < nums1.size() - 1; i++) {
            if (nums1.get(i) == nums2.get(i)) {
                total += 1;
            }
        }
        return total;
    }

    
    public static int countSamePair_Problem_1_7f9b13f0_bf5c_43c4_844f_03724ca58b7c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int countSame = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int l1 = nums1.get(i);
            int l2 = nums2.get(i);
            if (l1 == l2) countSame++;
        }
        return countSame;
    }

    
    public static int countSamePair_Problem_2_65b20d2c_ea4c_4e86_aebc_6ede1c13ecf9(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        Integer[] num1 = nums1.stream().toArray(Integer[]::new);
        Integer[] num2 = nums2.stream().toArray(Integer[]::new);
        int count = 0;
        for(int i = 0; i < num1.length; i++) {
            if(num1[i] == num2[i]) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_7b2522e8_e821_40ae_ba8e_0ce13634e49c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int nums1size = nums1.size();
        int nums2size = nums2.size();
        int diffSize = nums1size - nums2size;
        int[] diff = new int[diffSize];
        for (int i = 0; i < diffSize; i++) {
            diff[i] = nums1.get(nums1size - 1 - i) - nums2.get(nums2size - 1 - i);
        }
        Arrays.sort(diff);
        int counter = 0;
        for (int i = 0; i < diffSize; i++) {
            if (diff[i] == 0) {
                counter++;
            } else {
                break;
            }
        }
        return counter;
    }

    
    public static int countSamePair_Problem_3_24728fb2_9536_4f8d_8c65_69512c828074(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_ac24e08e_6cc2_4b7d_aaad_148b731308de(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.stream().max(Integer::compareTo).get();
        int max2 = nums2.stream().max(Integer::compareTo).get();
        int min1 = nums1.stream().min(Integer::compareTo).get();
        int min2 = nums2.stream().min(Integer::compareTo).get();
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        int diff = 0;
        if (maxDiff != minDiff) {
            diff = maxDiff - minDiff;
        }
        if (diff > 0) {
            count = diff / 2;
        } else if (diff < 0) {
            count = diff / 2;
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_aae1f94e_68f4_4db8_b399_464d9beb0275(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int count = 0;
        for(int i : nums1){
            for(int j : nums2){
                if (i == j){
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_2b91d320_52d4_4219_b3ad_24894d0011a5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // write your code here
        int count = 0;
        for (int i = 0; i < nums1.size(); ++i) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_a3321cf2_55cc_4e16_8d92_0978c1ed56b5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_e9a0d18c_1e82_48d7_bbe9_85a71b7c5e24(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == max1 && nums2.get(i) == max2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_a4ddc9f2_71e8_43b3_a263_f85434475915(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int mid1 = nums1.get(nums1.size() / 2);
        int mid2 = nums2.get(nums2.size() / 2);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        int midDiff = mid1 - mid2;
        int sumDiff = sum - midDiff;
        int diffDiff = maxDiff - minDiff;
        if (maxDiff == minDiff) {
            count++;
        }
        if (maxDiff == midDiff) {
            count += 2;
        }
        if (maxDiff == sumDiff) {
            count += 3;
        }
        if (maxDiff == diffDiff) {
            count += 4;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_6b746ac0_870c_4a81_afce_414d7ba03115(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if(nums1.size() != nums2.size()) return 0;
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_7cca4d67_78bf_44fe_ac63_480ea5520a82(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            sum += nums1.get(i);
        }
        for (int i = 0; i < nums2.size(); i++) {
            sum += nums2.get(i);
        }
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_2746902a_2703_42d7_a476_b9ea95d424d6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Initialize a boolean to return False for first call
        boolean firstCall = True;
        int sameCount = 0;
        // Iterate through all indices 
        for (int i = 0; i < nums1.size(); i++) {
            if (firstCall) {
                // Initialize first index and flag as True
                firstCall = False;
                sameCount = 1;
            }
            else {
                // Initialize flag to False 
                sameCount = 0;
            }
            // Iterate through all indices to check for same values
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    sameCount++;
                }
            }
            // If all indices are found equal to same value, increment count of pairs
            if (sameCount == nums2.size()) {
                sameCount++;
            }
        }
        return sameCount;
    }

    
    public static int countSamePair_Problem_0_dca3f40a_720a_4575_9d79_6ff4a9c7b1ae(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_1dd0f58c_776e_4656_ac15_e9eaff94176e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_87ea1eef_907d_4391_bce8_78c1a5c5f187(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_a51c63c5_033c_4bcc_8129_b7812a266d3e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_14499119_a561_4807_bebf_e438ae9c7817(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        
        return count;
    }

    
    public static int countSamePair_Problem_0_1569b77f_02e4_4cd0_a7e2_1fdbd659a6de(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // This first list will be used to track which positions in nums1 are used.
        ArrayList<Integer> used1 = new ArrayList<>();
        // This second list will be used to track which positions in nums2 are used.
        ArrayList<Integer> used2 = new ArrayList<>();

        int pairs = 0;

        for (int i = 0; i < nums1.size(); i++) {
            // If nums1[i] is in used2, then it is not possible that nums2[i] is in used1 as well. Hence, nums1[i] and nums2[i] cannot be in the same pair.
            if (used2.contains(nums2.get(i))) {
                pairs += 1;
                continue;
            }

            // If nums1[i] is not in used1, then we can use nums1[i]. nums2[i] can still be in used2 as well, so it is not possible that nums1[i] and nums2[i] have the same value.
            if (used1.contains(nums1.get(i))) {
                continue;
            }

            // nums1[i] is in used1 and nums2[i] is in used2. So now we have to see if nums1[i] and nums2[i] have the same value. That is, nums1[i] == nums2[i]. Do this by comparing each element in the lists.
            for (int j = 0; j < nums2.size(); j++) {
                // If the values match, then we have found a match.
                if (nums1.get(i) == nums2.get(j)) {
                    // Remember which positions we have seen nums1[i] and nums2[i]
                    used1.add(i);
                    used2.add(j);

                    // We have found a pair. Increment the total number of pairs found.
                    pairs += 1;
                    break;
                }
            }
        }

        return pairs;
    }

    
    public static int countSamePair_Problem_3_120de35a_d2c8_415c_bd29_e8cdbe858253(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        return nums1.stream().filter(n -> nums2.contains(n)).count();
    }

    
    public static int countSamePair_Problem_1_7974c722_3313_4eb8_b978_e7e586326c63(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        int same = 0;
        for(Integer a: nums1) {
            if(set.contains(a)) {
                same++;
            }
            set.add(a);
        }
        for(Integer b: nums2) {
            if(set.contains(b)) {
                same++;
            }
            set.add(b);
        }
        return same;
    }

    
    public static int countSamePair_Problem_2_9be74212_2e1b_4494_9fa2_5e8f141b4319(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // The first loop will loop through the first array list to find the values which appear in the second list.
        // The second loop will loop through the second array list to count the indices which are in the same position as in the first loop.
        ArrayList<Integer> duplicates = new ArrayList<Integer>();
        int counter = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                counter++;
            } else {
                duplicates.add(nums2.get(i));
            }
        }
        return counter;
    }

    
    public static int countSamePair_Problem_2_08bfb615_e4b3_4b33_a6cc_39db2e78491a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int i = 0;
        int count = 0;
        while (i < nums1.size()) {
            if (nums1.get(i) == nums2.get(i)) {
                count += 1;
            }
            i += 1;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_45dcca7f_e6ef_4729_bf47_7cc84d37c524(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // write your code here
        int result = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_2_2746902a_2703_42d7_a476_b9ea95d424d6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Initialize a boolean to return False for first call
        boolean firstCall = True;
        int sameCount = 0;
        // Iterate through all indices 
        for (int i = 0; i < nums1.size(); i++) {
            if (firstCall) {
                // Initialize first index and flag as True
                firstCall = False;
                sameCount = 1;
            }
            else {
                // Initialize flag to False 
                sameCount = 0;
            }
            // Iterate through all indices to check for same values
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    sameCount++;
                }
            }
            // If all indices are found equal to same value, increment count of pairs
            if (sameCount == nums2.size()) {
                sameCount++;
            }
        }
        return sameCount;
    }

    
    public static int countSamePair_Problem_1_6dead7d2_d6a5_49d5_ab6e_8047bbf344c8(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_2_f4f5166c_86a9_427b_97b8_5c858ef118d0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < nums1.size(); ++i) {
            for(int j = 0; j < nums2.size(); ++j) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_3a59db8f_2737_498d_8473_f083db2ec182(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_6282a880_b632_4a44_b4a5_fc1f2f9b7d50(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int mid1 = max1 + (max2 - min1) / 2;
        int mid2 = max2 + (max1 - min2) / 2;
        int diff1 = mid1 - min1;
        int diff2 = mid2 - min2;
        int diff3 = max1 - max2;
        if (diff1 < diff2 && diff1 < diff3) {
            count = count + 1;
        }
        if (diff2 < diff1 && diff2 < diff3) {
            count = count + 1;
        }
        if (diff3 < diff1 && diff3 < diff2) {
            count = count + 1;
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_9de087fe_23c7_452c_8c8c_3643cdc1eb77(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            sum = sum + Math.abs(nums1.get(i) - nums2.get(i));
        }
        return sum;
    }

    
    public static int countSamePair_Problem_1_34b6b30d_6af5_4647_b84b_c26931671d7f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int num1 = nums1.get(0);
        int num2 = nums2.get(0);
        int num3 = nums1.get(1);
        int num4 = nums2.get(1);
        if (num1 == num2 && num2 == num3) {
            count++;
        }
        if (num1 == num2 && num2 == num4) {
            count++;
        }
        if (num1 == num3 && num2 == num4) {
            count++;
        }
        if (num1 == num3 && num2 == num1) {
            count++;
        }
        if (num1 == num4 && num2 == num1) {
            count++;
        }
        if (num1 == num4 && num2 == num3) {
            count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_b0175a76_0111_4392_bab4_9542fd6779eb(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if (nums1.size() != nums2.size()) {
            return 0;
        }
        ArrayList<ArrayList<Integer>> array = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < nums1.size(); i++) {
            ArrayList<Integer> array1 = new ArrayList<Integer>();
            ArrayList<Integer> array2 = new ArrayList<Integer>();
            array.add(array1);
            array.add(array2);
        }
        for (int i = 0; i < nums1.size(); i++) {
            array.get(0).add(nums1.get(i));
            array.get(1).add(nums2.get(i));
        }
        int count = 0;
        for (int i = 0; i < array.size(); i++) {
            for (int j = i + 1; j < array.size(); j++) {
                if (array.get(i).get(0) == array.get(j).get(0)) {
                    count++;
                    if (array.get(i).get(1) == array.get(j).get(1)) {
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_8d090050_073e_451e_bdb6_72931b056990(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if (nums1.size() != nums2.size()) throw new RuntimeException("Size mismatch");
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_469cf4b3_9e3c_482f_a200_f9e047d4e555(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int len = nums1.size();
        for(int i = 0; i < len; i++) {
            if(nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_c97c8f9b_755b_4988_a442_d1781bb31d46(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        if (nums1.size() == nums2.size()) {
            for (int i = 0; i < nums1.size(); i++) {
                if (nums1.get(i) == nums2.get(i)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_48e81983_eb5c_46e8_9dd9_cb9db694ac0a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i).equals(nums2.get(j))) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_e4fcfc4b_049c_412d_bbb6_c666178a8342(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_3_87ccc802_d991_491d_a434_a5c5d9fc4fae(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int len = Math.min(nums1.size(), nums2.size());
        int num = 0;
        for (int i = 0; i < len; i++) {
            if (nums1.get(i) == nums2.get(i)) {
                num++;
            }
        }
        return num;
    }

    
    public static int countSamePair_Problem_0_c1db34cd_8f4c_4693_b81b_730c2e6d0e47(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_558bde51_77d0_45ac_a57e_eaf373fb5ed7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_54a845e8_3672_4981_9acc_6b25c66b0461(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums1.size(); i++) {
            map.put(nums1.get(i), nums2.get(i));
        }
        for(int i = 0; i < nums1.size(); i++) {
            if(map.get(nums1.get(i)) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_a4ddc9f2_71e8_43b3_a263_f85434475915(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int mid1 = nums1.get(nums1.size() / 2);
        int mid2 = nums2.get(nums2.size() / 2);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        int midDiff = mid1 - mid2;
        int sumDiff = sum - midDiff;
        int diffDiff = maxDiff - minDiff;
        if (maxDiff == minDiff) {
            count++;
        }
        if (maxDiff == midDiff) {
            count += 2;
        }
        if (maxDiff == sumDiff) {
            count += 3;
        }
        if (maxDiff == diffDiff) {
            count += 4;
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_552f6d5f_7a60_4d0a_bd5a_0a5896e098d4(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_8e718b8f_725a_4224_ba48_3d76746b2ea6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int index = 0;
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    index = i;
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_d0c6d996_2407_4c1b_aebf_6f5c187e2a24(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_e669ad81_2b2f_4bb3_bac0_1ed348606454(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_a0afce7c_841f_4b11_86bc_2181041d1e91(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_fb87a2bd_28b1_4b77_b1a8_d09c58dcf655(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_23da1225_f0f2_4d93_a660_bf0e93df3095(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        if (nums1.size() != nums2.size()) {
            return 0;
        } else {
            int i = 0;
            int j = 0;
            while (i<nums1.size() && j<nums2.size()) {
                int num1 = nums1.get(i);
                int num2 = nums2.get(j);
                if (num1 == num2) {
                    i++;
                    j++;
                    result++;
                }
                if (num1 > num2) {
                    max = num2;
                } else {
                    min = num2;
                }
                if (max == min) {
                    break;
                }
                i++;
                j++;
            }
            if (i >= nums1.size()) {
                return result;
            } else {
                return 0;
            }
        }
    }

    
    public static int countSamePair_Problem_3_f8864eae_26c3_476c_aa98_8aee6889dd03(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(0);
        int max2 = nums2.get(0);
        int min1 = nums1.get(nums1.size()-1);
        int min2 = nums2.get(nums2.size()-1);
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == max1 && nums2.get(i) == max2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_0981dd64_272b_4655_a5d4_8a58baf97d4a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int len = nums1.size();
        int count = 0;
        for (int i = 0; i < len; i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if (num1 == num2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_51c1afed_6695_4b19_8a28_160ac3b4b81b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_04caf1ce_423b_48e3_a2b1_eff323663377(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for(int i = 0; i < nums1.size(); i++) {
            int j = 0;
            while(j < nums2.size() && nums1.get(i) == nums2.get(j)) {
                j++;
            }
            result += nums1.get(i) == nums2.get(j) ? 1 : 0;
        }
        return result;
    }

    
    public static int countSamePair_Problem_2_2135c607_51f6_4df2_97f7_067bafd753db(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_77cc5430_671a_4ca3_9f55_84aaf06f729c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i=0; i<nums1.size(); i++) {
            for(int j=i+1; j<nums1.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_11d223a1_681c_4d9b_a673_853a7ee689ac(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i=0; i<nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_6d8a5604_d7d0_48a4_9692_298a6ce90215(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_33bc0201_15cc_4b31_9e96_12d86129ba85(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (Integer num1 : nums1){
            for (Integer num2 : nums2){
                if (num1 == num2){
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_c2cdec22_850c_4afb_9eb1_a64ecb9b4954(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_88fe6011_43d6_4190_9be9_461040a8320d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int ret = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                ret++;
            }
        }
        return ret;
    }

    
    public static int countSamePair_Problem_2_77ac9598_8d98_4fc4_ba85_d307f60be6f6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                list.add(nums1.get(i) * nums2.get(j));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_91c0bb15_e165_4206_a5c5_9c44c1a64163(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here.
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int n1 = nums1.get(i);
            int n2 = nums2.get(i);
            if (n1 != n2) {
                if (n1 < n2) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_898ec38f_613f_40fd_95c3_5978bc5a49f7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_a06c4e1c_3922_46fc_a1da_8797e7cf7863(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // TODO: Fill in the blanks
        int indexCount = 0;
        for (int i = 0; i < nums1.size() && i < nums2.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                indexCount++;
            }
        }
        return indexCount;
    }

    
    public static int countSamePair_Problem_0_9de087fe_23c7_452c_8c8c_3643cdc1eb77(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            sum = sum + Math.abs(nums1.get(i) - nums2.get(i));
        }
        return sum;
    }

    
    public static int countSamePair_Problem_2_c317d590_1a17_4610_ac0e_b1a28e49d333(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_37a93f64_8aa3_41d5_a901_fbd31fbe9dd5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int[] counts = new int[nums1.size()];
        // loop through all the numbers in the first list
        for (int i = 0; i < nums1.size(); i++) {
            // initialize a variable for storing the number of times
            // the array list has this number
            int same = 0;
            // loop through the second list to find how many times
            // this number appears
            for (int j = 0; j < nums2.size(); j++) {
                // if the first and second list have the same number
                // then the count++ will happen
                if (nums1.get(i) == nums2.get(j)) {
                    same++;
                }
            }
            // update this array list with the current count for that
            // number
            counts[i] = same;
        }
        // return the total number of times each number appears
        return Arrays.stream(counts).sum();
    }

    
    public static int countSamePair_Problem_3_dee772ce_3899_4786_a38f_923eda682533(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int n = nums1.size();
        int[] nums1s = new int[n];
        int[] nums2s = new int[n];
        for(int i = 0; i < n; i++) {
            nums1s[i] = nums1.get(i);
            nums2s[i] = nums2.get(i);
        }
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(nums1s[i] == nums2s[i]) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_565265ac_2757_42b7_80ee_008fee46a715(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_d535ba10_b992_4cb6_8fcd_d1aa1fd51a94(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size()-1);
        int max2 = nums2.get(nums2.size()-1);
        for(int i = 0; i < nums1.size(); i++) {
            int cur1 = nums1.get(i);
            int cur2 = nums2.get(i);
            if(cur1 == max1 && cur2 == max2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_d1f9d582_9b33_4b4a_a07a_071f502a3ac2(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_120de35a_d2c8_415c_bd29_e8cdbe858253(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        return nums1.stream().filter(n -> nums2.contains(n)).count();
    }

    
    public static int countSamePair_Problem_2_8d090050_073e_451e_bdb6_72931b056990(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if (nums1.size() != nums2.size()) throw new RuntimeException("Size mismatch");
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_321515f4_2982_49bd_9001_8e72b0cb93d0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        if(nums1.size() != nums2.size()) {
            return result;
        }
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                result++;
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_2_4f9bb090_a4b6_4d57_ac5f_e21111dc9bc3(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == max1 && nums2.get(i) == max2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_79ec09c3_7639_47a6_9344_86dbfce7d7b3(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        int temp;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_800247fb_9588_49df_8949_fa981a0d4786(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // TODO: Complete this method
        int totalPairCount = 0;
        int samePairCount = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    samePairCount++;
                }
            }
        }
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) != nums2.get(j)) {
                    totalPairCount++;
                }
            }
        }
        return samePairCount;
    }

    
    public static int countSamePair_Problem_3_7ddd56b3_251e_4b86_b7fc_8b565b37ca6e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int same = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    same++;
                }
            }
        }
        return same;
    }

    
    public static int countSamePair_Problem_3_329d772b_0bf9_428e_ab7c_bc8618a7faef(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            Integer num1 = nums1.get(i);
            for (int j = 0; j < nums2.size(); j++) {
                if (num1.equals(nums2.get(j))) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_89b2b6e1_c5bb_430f_a808_1b2692bf8ff7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_d788aa26_d2d4_4105_9887_9030c1d4b17b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int same = 0;
        for(int i = 0; i < nums1.size() && i < nums2.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                same++;
            }
        }
        return same;
    }

    
    public static int countSamePair_Problem_0_de41a88a_2423_4452_942c_4ed5332786aa(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int idx1 = 0, idx2 = 0;
        int count = 0;
        while (idx1 < nums1.size() && idx2 < nums2.size()) {
            if (nums1.get(idx1) == nums2.get(idx2)) {
                count++;
                idx1++;
                idx2++;
            } else {
                if (idx1 < nums1.size() - 1) {
                    idx1++;
                } else {
                    idx2++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_aae1f94e_68f4_4db8_b399_464d9beb0275(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int count = 0;
        for(int i : nums1){
            for(int j : nums2){
                if (i == j){
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_7ddd56b3_251e_4b86_b7fc_8b565b37ca6e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int same = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    same++;
                }
            }
        }
        return same;
    }

    
    public static int countSamePair_Problem_3_bff862f1_a584_478d_91c1_30257a5112e0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i=0; i < nums1.size(); i++){
            for(int j=0; j < nums2.size(); j++){
                if(nums1.get(i) == nums2.get(j)){
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_796acd94_7d66_4dcf_8dce_9364440938cf(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer num : nums1) {
            if (map.containsKey(num)) {
                count++;
            }
            map.put(num, 1L);
        }
        for (Integer num : nums2) {
            if (map.containsKey(num)) {
                count++;
            }
            map.put(num, 1L);
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_5b9d3358_fde4_4fa4_a266_6c2210a2cce4(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_ae0d9ed7_2965_4a2c_a97b_9e4817636f65(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        HashSet<Integer> seen = new HashSet<Integer>();
        int size = nums1.size();
        if (size != nums2.size()) return count;
        for (int i = 0; i < size; i++) {
            Integer num1 = nums1.get(i);
            Integer num2 = nums2.get(i);
            if (seen.contains(num1) && seen.contains(num2)) {
                count++;
            }
            seen.add(num1);
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_f8678f01_70c5_4bcc_a58f_47361dc2c31f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_c2cdec22_850c_4afb_9eb1_a64ecb9b4954(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_e8f9ec08_66ed_4eaa_b1b8_c5b4a5737120(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_35b47115_9ad6_4ce2_8d32_7b9facb6b22b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Your code here
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums1){
            map.put(i,map.getOrDefault(i,0L)+1);
        }
        for (Integer i : nums2){
            map.put(i,map.getOrDefault(i,0L)+1);
        }
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                count+=entry.getKey();
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_7bcabc04_2eda_4b94_9dd1_4fdadf0a0f8c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int[] pair = new int[2];
        int count = 0;
        for (int i = 0; i <= nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                pair[0]++;
                pair[1]++;
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_9a433929_387e_4760_b126_c5f47904d1ab(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_1fe54bc4_d4c6_42d9_a7c0_c0d412de09f0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sameValue = 0;
        for(int i = 0; i < nums1.size(); i++) {
            sameValue = nums1.get(i);
            for(int j = 0; j < nums2.size(); j++) {
                if(sameValue == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_455a3932_29c0_4086_b2db_47c0426dce89(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_0aaff729_57d2_49cb_ab97_d447de8f6ba7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_a3321cf2_55cc_4e16_8d92_0978c1ed56b5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_441430a9_2a37_4786_aca1_630502b7ca93(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int n = nums1.size();
        int m = nums2.size();
        int[] samePairs = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    samePairs[i]++;
                    break;
                }
            }
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            cnt += samePairs[i];
        }
        return cnt;
    }

    
    public static int countSamePair_Problem_0_ac064ae6_84c6_4e15_818a_27528bcb7e08(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // write your code here
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_2746902a_2703_42d7_a476_b9ea95d424d6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Initialize a boolean to return False for first call
        boolean firstCall = True;
        int sameCount = 0;
        // Iterate through all indices 
        for (int i = 0; i < nums1.size(); i++) {
            if (firstCall) {
                // Initialize first index and flag as True
                firstCall = False;
                sameCount = 1;
            }
            else {
                // Initialize flag to False 
                sameCount = 0;
            }
            // Iterate through all indices to check for same values
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    sameCount++;
                }
            }
            // If all indices are found equal to same value, increment count of pairs
            if (sameCount == nums2.size()) {
                sameCount++;
            }
        }
        return sameCount;
    }

    
    public static int countSamePair_Problem_2_a7c3580c_e4d9_44f6_a18c_560a26ca2720(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); ++i) {
            for(int j = 0; j < nums2.size(); ++j) {
                if(nums1.get(i) == nums2.get(j)) {
                    ++count;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_5d4056aa_cca5_4be8_b3e2_5407c11819b7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = nums1.stream().filter(x -> nums2.contains(x)).count();
        return count;
    }

    
    public static int countSamePair_Problem_2_8430d407_6e1a_47c3_9e7f_3deff02e6a75(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    i = nums1.size();
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_89d619de_4027_47b9_afab_f04221b043b7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int pairs = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    
    public static int countSamePair_Problem_0_3c61f428_8fb7_4d50_a989_c8624d6fbbdd(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_4570dc50_8b8e_4451_8170_d719078e6462(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = i + 1; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_b0175a76_0111_4392_bab4_9542fd6779eb(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if (nums1.size() != nums2.size()) {
            return 0;
        }
        ArrayList<ArrayList<Integer>> array = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < nums1.size(); i++) {
            ArrayList<Integer> array1 = new ArrayList<Integer>();
            ArrayList<Integer> array2 = new ArrayList<Integer>();
            array.add(array1);
            array.add(array2);
        }
        for (int i = 0; i < nums1.size(); i++) {
            array.get(0).add(nums1.get(i));
            array.get(1).add(nums2.get(i));
        }
        int count = 0;
        for (int i = 0; i < array.size(); i++) {
            for (int j = i + 1; j < array.size(); j++) {
                if (array.get(i).get(0) == array.get(j).get(0)) {
                    count++;
                    if (array.get(i).get(1) == array.get(j).get(1)) {
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_a4bf9141_864f_454a_ae8a_4ca305b71daa(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int cnt = 0;
        int len = nums1.size();
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    
    public static int countSamePair_Problem_0_3ae9bf24_55da_439b_9d13_ecaa81b6ef3e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int samePair = 0;
        int idx = 0;
        for(int i =0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                samePair++;
            }
        }
        return samePair;
    }

    
    public static int countSamePair_Problem_2_c8f602b0_410a_48ea_b8e3_dfcee301e6b6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.stream().max(Integer::compareTo).get();
        int max2 = nums2.stream().max(Integer::compareTo).get();
        int maxDiff = max1 - max2;
        int min1 = nums1.stream().min(Integer::compareTo).get();
        int min2 = nums2.stream().min(Integer::compareTo).get();
        int minDiff = min1 - min2;
        if (maxDiff != minDiff) {
            count = maxDiff - minDiff;
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_984f34bd_77eb_4aae_8172_844dce15ec7f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int total = 0;
        for (int i = 0; i < nums1.size() - 1; i++) {
            if (nums1.get(i) == nums2.get(i)) {
                total += 1;
            }
        }
        return total;
    }

    
    public static int countSamePair_Problem_3_3123ca9b_e8ca_4a8e_abf2_b27921b3ad91(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Your code here
        Integer numsSum = new Integer(0);
        Integer numsDiff = new Integer(0);
        for (int i : nums1) {
            if(i==nums2.get(nums2.size()-1))
                numsSum+=i;
            else
                numsDiff+=i*(nums2.get(nums2.size()-1));
        }
        return Math.abs(numsSum-numsDiff);
    }

    
    public static int countSamePair_Problem_0_e00942dc_6865_43fb_acb6_f3d322ad0ffc(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_0d79d355_bcb3_4680_a1d4_17fe022ddba2(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int size = nums1.size();
        if (nums1.size() != nums2.size()) {
            return 0;
        }
        int i = 0;
        while (i < size) {
            if (nums1.get(i) == nums2.get(i)) {
                i++;
            } else {
                break;
            }
        }
        return i;
    }

    
    public static int countSamePair_Problem_0_4f9bb090_a4b6_4d57_ac5f_e21111dc9bc3(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == max1 && nums2.get(i) == max2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_bbef5eaa_b409_460b_affc_71fae569b3cb(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int counter = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i).equals(nums2.get(i))) {
                counter++;
            }
        }
        return counter;
    }

    
    public static int countSamePair_Problem_3_fa0486c5_bf42_48b2_9680_bf1b3133d1b8(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int sum = 0;
        int diff1 = 0;
        int diff2 = 0;
        // System.out.println(nums1);
        // System.out.println(nums2);
        // int size = nums1.size();
        // int size = nums2.size();
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                sum += i;
                diff1 += nums1.get(i);
                diff2 += nums2.get(i);
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_2_f6801045_986b_4d8b_bbbc_13145045e33e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i).equals(nums2.get(i))) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_12608730_59f1_4b58_b833_8a918a9d0aad(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff > minDiff) {
            count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_c7c4cbfd_1f68_4579_a8f1_3ed3316d2516(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        Set<Integer> set1 = new HashSet<Integer>(nums1);
        Set<Integer> set2 = new HashSet<Integer>(nums2);
        set1.removeAll(set2);
        return set1.size();
    }

    
    public static int countSamePair_Problem_1_e9d62336_4745_4d14_b2fc_140bfd9a518e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        
        if (nums1 == null || nums2 == null || nums1.size() != nums2.size()) {
            return count;
        }
        
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        
        return count;
    }

    
    public static int countSamePair_Problem_2_157fdf60_349a_4893_8be6_127bd6f3a9ab(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int[] temp = new int[nums1.size()];
        Arrays.fill(temp, 0);
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    temp[i]++;
                }
            }
        }
        return Arrays.stream(temp).sum();
    }

    
    public static int countSamePair_Problem_3_c202f24c_2198_41db_8099_24b00e4bdd17(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size()-1);
        int max2 = nums2.get(nums2.size()-1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        int diff;
        for(int i = 0; i < nums1.size(); i++) {
            diff = nums1.get(i) - nums2.get(i);
            if(diff == maxDiff) {
                count++;
            }
            if(diff == minDiff) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_2ff53841_9f44_443d_b208_cac1eb75e523(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_6589e1d5_6290_464c_8ce1_ecc19a51cbd0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_9241711d_c7a6_4983_9af1_b5654ff0d370(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size()-1);
        int max2 = nums2.get(nums2.size()-1);
        for(int i = 0; i < nums1.size(); i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if(num1 == num2) {
                count++;
            }
            if(num1 > max1 && num2 > max2) {
                max1 = num1;
                max2 = num2;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_1d12c3a4_f313_4891_8553_646171188c92(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_4f9bb090_a4b6_4d57_ac5f_e21111dc9bc3(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == max1 && nums2.get(i) == max2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_0c99c2da_c297_4e99_abbc_a7f8a668f7e6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int size = nums1.size();
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(nums1.get(i).equals(nums2.get(j))) {
                    count++;
                    i = size;
                    j = size;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_77cc5430_671a_4ca3_9f55_84aaf06f729c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i=0; i<nums1.size(); i++) {
            for(int j=i+1; j<nums1.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_32222bbf_e35a_4f40_8748_d1c2a7027178(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_800247fb_9588_49df_8949_fa981a0d4786(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // TODO: Complete this method
        int totalPairCount = 0;
        int samePairCount = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    samePairCount++;
                }
            }
        }
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) != nums2.get(j)) {
                    totalPairCount++;
                }
            }
        }
        return samePairCount;
    }

    
    public static int countSamePair_Problem_3_0aaff729_57d2_49cb_ab97_d447de8f6ba7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_9c6dfb98_75dd_4c16_9552_876c8d1b9859(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        return IntStream.range(0, nums1.size())
                .filter(i -> nums1.get(i) == nums2.get(i))
                .count();
    }

    
    public static int countSamePair_Problem_3_cf8e95b7_07d8_47c0_9975_78ce2ac9e942(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_5b9d3358_fde4_4fa4_a266_6c2210a2cce4(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_17e1b432_2443_4e71_85ce_d7aed4b89573(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        return 0;
    }

    
    public static int countSamePair_Problem_0_b9298177_5084_4f9e_9c23_ce68b9cfcb44(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int i = 0, j = 0, same = 0;
        while (i < nums1.size()) {
            while (j < nums2.size()) {
                if (nums1.get(i) == nums2.get(j)) {
                    same++;
                    i++;
                    j++;
                } else {
                    j++;
                }
            }
            i++;
        }
        return same;
    }

    
    public static int countSamePair_Problem_2_17e1b432_2443_4e71_85ce_d7aed4b89573(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        return 0;
    }

    
    public static int countSamePair_Problem_3_72876941_a980_4745_9c47_c1c346bc9234(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); ++i) {
            if(nums1.get(i).equals(nums2.get(i))) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_b81da558_1ede_4eba_a820_b4cd8660dbfd(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int size = nums1.size();
        for(int i = 0; i < size; i++) {
            for(int j = i + 1; j < size; j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

}
