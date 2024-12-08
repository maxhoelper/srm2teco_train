package mbpp_767_get_pairs_count;

public class mbpp_767_get_pairs_count {

    
    public static int getPairsCount_Problem_2_34038a77_c265_4ae1_a9a7_3a1d76869f87(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int element : arr)
            if (element != 0 && element <= sum)
                count++;
        return count;
    }

    
    public static int getPairsCount_Problem_3_fe161724_555a_476e_bb90_7a3d4060f9d9(ArrayList<Integer> arr, int sum) {
        // Your code goes here
        int ans = 0;
        for (int i = 0; i < arr.size()-1; i++) {
            for (int j = i+1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    ans++;
                }
            }
        }
        return ans;
    }

    
    public static int getPairsCount_Problem_2_97a3b87c_9c4b_4541_bc2e_da700e257e0a(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (Integer i : arr) {
            for (Integer j : arr) {
                if (i != j && i + j == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_55ba9876_5b6a_445d_9d6c_7d290de240ae(ArrayList<Integer> arr, int sum) {
        int count = 0L;
        for (int l : arr) {
            for (int r : arr) {
                if (l == r) {
                    continue;
                }
                if (l > r) {
                    continue;
                }
                if (l >= sum) {
                    continue;
                }
                if (r >= sum) {
                    continue;
                }
                count ++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_a3da53cc_64f1_4276_93e6_9bb5968e16b2(ArrayList<Integer> arr, int sum) {
        // write your code here
        int count = 0;
        int temp = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (num > sum) {
                count += 1;
            } else if (num == sum) {
                temp += 1;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_25bd34f1_be57_4718_9931_413b6e773a00(ArrayList<Integer> arr, int sum) {
        int countPairs = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    countPairs++;
                    break;
                }
            }
        }
        return countPairs;
    }

    
    public static int getPairsCount_Problem_2_93405d33_d58c_4261_87cf_437ceeeef92b(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_ef6b30c9_e37d_4ae7_8d87_f33472b6d355(ArrayList<Integer> arr, int sum) {
        int pairsCount = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == sum) {
                pairsCount++;
            }
        }
        return pairsCount;
    }

    
    public static int getPairsCount_Problem_1_18ee0de8_bc54_4774_8776_321c2c51fab6(ArrayList<Integer> arr, int sum) {
        int pairsCount = 0;
        for(int i = 0; i < arr.size(); i++) {
            int currentPair = arr.get(i);
            int nextPair = arr.get(i+1);
            
            while(currentPair + nextPair != sum) {
                currentPair+=nextPair;
                pairsCount++;
                nextPair+=nextPair;
            }
        }
        return pairsCount;
    }

    
    public static int getPairsCount_Problem_3_ce9aa73b_794b_4c32_b755_0626c11ecfb7(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_93405d33_d58c_4261_87cf_437ceeeef92b(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_f71c56b0_b120_4857_841c_6e71fde29b03(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for(int l : arr) {
            for(int r : arr) {
                if(l != r) {
                    if(l == sum - r) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_24311999_e86d_44a8_a9c0_b25f44a31b60(ArrayList<Integer> arr, int sum) {
        int pairs = 0;
        for (Integer n : arr) {
            if (sum - n == 0) {
                pairs++;
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_3_cd74c722_fea1_47bf_bda0_3c8c822af76f(ArrayList<Integer> arr, int sum) {
        int count = 0L;
        int sumOfArr = sum;
        for (Integer item : arr) {
            if (sumOfArr - item.intValue() > 0) {
                sumOfArr -= item.intValue();
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_2124efb2_f6f7_473a_ac22_a098e6f84034(ArrayList<Integer> arr, int sum) {
        int count = 0L;
        for (Integer l : arr) {
            for (Integer r : arr) {
                if (l != r) {
                    if (sum == sum) {
                        count += 2;
                    } else if (sum < sum) {
                        sum += l;
                        count += 2;
                    }
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_ee157b22_eca7_4165_a67f_be581c58bf1f(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int pairs = 0;
        for (int i = 0; i < arr.size(); i++) {
            int tempSum = arr.get(i);
            for (int j = i; j < arr.size(); j++) {
                if (tempSum == sum) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_0_b2723209_dc07_43f2_987c_727e95309aa6(ArrayList<Integer> arr, int sum) {
        // your code goes here
        int count = 0;
        for(int i = 0; i < arr.size(); i++){
            for(int j = i+1; j < arr.size(); j++){
                if(arr.get(i) + arr.get(j) == sum)
                    count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_d26eae03_a2c9_4ad3_a44a_5b3ef0d4e051(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_628da007_86e7_4d73_a70b_cdc8e985f384(ArrayList<Integer> arr, int sum) {
        int pairs = 0L;
        for (int i : arr) {
            if (sum - i != 0) {
                pairs += arr.indexOf(i + 1);
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_0_180155b1_33cd_4c8a_a28f_ad9d8d2940ae(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_ac214128_c259_4fc5_949f_be4c17d8f674(ArrayList<Integer> arr, int sum) {
        int pairs = 0, sum1 = sum;
        for (Integer i : arr) {
            sum1 -= i;
            if (sum1 == 0) {
                pairs++;
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_0_b87b3f65_a9fa_464d_ad4d_093481ca5f21(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_1964729c_c0da_48d4_a5f0_227e5facdfc4(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int sumOfArray = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            sumOfArray += arr.get(i);
            if(sumOfArray == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_829538b5_7c91_4f4e_9652_0adf895c30dd(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_1278651b_16e7_4407_a151_b7126e056573(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_73f848cd_d752_4789_afc3_8dcf993ee0db(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for(int i = 0; i<arr.size()-1; i++){
            int x = arr.get(i);
            int y = arr.get(i+1);
            if(x+y == sum){
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_1b129f41_202f_4208_9b24_43e20642ecf5(ArrayList<Integer> arr, int sum) {
        int pairsCount = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int sum1 = sum - arr.get(i);
                int sum2 = sum - arr.get(j);
                if (sum1 == sum2) {
                    pairsCount++;
                }
            }
        }
        return pairsCount;
    }

    
    public static int getPairsCount_Problem_3_84aec0ff_5e2d_4fe1_b6e7_00e04277490d(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_c0256a42_7b91_4d28_a243_604c6aeb1a93(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_480dc5d0_5e0c_4ba4_8e18_ed74e24f09fc(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_903e7c64_fa11_4716_b8b9_6c8997dad9ec(ArrayList<Integer> arr, int sum) {
        int count = 0, result = 0;

        for (int n : arr)
            result += (n / 2) * (n / 2);

        if (result == sum)
            count++;

        return count;
    }

    
    public static int getPairsCount_Problem_1_30fb5691_ce28_4450_9bce_3fce17f2b536(ArrayList<Integer> arr, int sum) {
        int pairs = 0;
        int firstElement = arr.get(0);
        int lastElement = arr.get(arr.size() - 1);
        int currentSum = firstElement;

        for (int i = 0; i < arr.size(); i++) {
            int nextElement = arr.get(i);
            if (currentSum == sum) {
                pairs++;
            }
            currentSum += nextElement;
        }

        return pairs;
    }

    
    public static int getPairsCount_Problem_0_e30e88dc_c012_42f4_ac38_eaab09c96c5f(ArrayList<Integer> arr, int sum) {
        int count = 0;
        // iterate through the list to find all the pairs whose sum is equal to sum
        for (int num : arr) {
            for (int i = arr.indexOf(0); i < arr.size(); i++) {
                int temp = 0;
                for (int j = i; j < arr.size(); j++) {
                    temp += arr.get(j);
                    if (temp == sum) {
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_58619927_23b0_4209_9524_f81ad3ae88f2(ArrayList<Integer> arr, int sum) {
        return arr.stream().filter(x -> x == sum).count();
    }

    
    public static int getPairsCount_Problem_0_e4de7784_a4ec_40b1_b302_460c61dc2f6d(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i : arr) {
            count += i;
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_43d91197_d4ca_4d76_aec2_569f7745c5d0(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i : arr) {
            for (int j : arr) {
                if (i != j && i + j == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_25b16e83_72b5_4522_93f2_2531ea8625bd(ArrayList<Integer> arr, int sum) {
        return arr.stream().filter( x -> x % 2 == 1 ).collect(Collectors.toList()).size();
    }

    
    public static int getPairsCount_Problem_2_9958079f_5f75_44b5_b238_2eb5e6062ab1(ArrayList<Integer> arr, int sum) {
        int pairs = 0, lastArrElem = arr.get(arr.size() - 1);
        for (Integer num : arr) {
            if (num != lastArrElem)
                pairs++;
            lastArrElem = num;
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_3_44da26a2_c685_4b5b_9b05_552ca1d3d1b6(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (Integer i : arr) {
            for (Integer j : arr) {
                if (i != j && sum - i + j == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_b138d2b2_81e3_4432_890e_6fe0baf178b6(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_4c43875b_9c19_44fe_82d7_24d9585f7a56(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_eab3c3f7_8c21_4715_bc54_527f72e0b010(ArrayList<Integer> arr, int sum) {
        int res = 0;
        for(int i = 0; i < arr.size(); i++)
        {
            int sumTemp = arr.get(i);
            for(int j = i+1; j < arr.size(); j++)
            {
                if(sumTemp + arr.get(j) == sum)
                {
                    res++;
                    break;
                }
            }
        }
        return res;
    }

    
    public static int getPairsCount_Problem_2_d1e78ee9_2722_4ccd_a103_b0a414447646(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (Integer num : arr) {
            if (sum - num == 0)
                count++;
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_c4f89bb9_c192_4a14_b921_f0dd55338f6f(ArrayList<Integer> arr, int sum) {
        int pairs = 0;
        for (int val : arr) {
            for (int val1 : arr) {
                if (val != val1 && val + val1 == sum) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_0_af8f8587_f885_4ace_a124_592e85c8cbe7(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int pair = (arr.get(i) + arr.get(i + 1))/2;
            if (sum == pair) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_43d91197_d4ca_4d76_aec2_569f7745c5d0(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i : arr) {
            for (int j : arr) {
                if (i != j && i + j == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_399fd699_e425_48a0_b9a4_9d53cfcc3ab8(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int sumOfArray = 0;
        for (int i : arr) {
            sumOfArray += i;
        }
        for (int i : arr) {
            if (sumOfArray == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_829538b5_7c91_4f4e_9652_0adf895c30dd(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_6688d5fe_bb6a_42c4_ac9c_846b1d011f08(ArrayList<Integer> arr, int sum) {
        return arr.stream().filter(x -> x == sum).count() * arr.size();
    }

    
    public static int getPairsCount_Problem_0_4c53e454_27fc_4c6f_bd53_679c7ad1ec3d(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_dfe670c3_7ae1_494e_8f36_c85ce0f92c66(ArrayList<Integer> arr, int sum) {
        int result = 0;
        for (Integer n : arr) {
            if (sum == n) result++;
        }
        return result;
    }

    
    public static int getPairsCount_Problem_2_62878724_ff14_43eb_80bc_ea0c704bef76(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for(int i = 0; i<arr.size()-1; i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_193bddbf_f18c_4cb8_ab8f_662344f61d8e(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int l : arr) {
            for (int r : arr) {
                if (l + r == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_92291222_0804_486c_9217_a18c6ec06dc7(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++){
            for(int j = i+1; j < arr.size(); j++){
                if(arr.get(i) + arr.get(j) == sum){
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_43d91197_d4ca_4d76_aec2_569f7745c5d0(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i : arr) {
            for (int j : arr) {
                if (i != j && i + j == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_c47cc2a5_6658_462a_9ed4_3ef3a478e5b3(ArrayList<Integer> arr, int sum) {
        int pairsCount = 0;
        for(int i = 0; i<arr.size(); i++) {
            int currentNum = arr.get(i);
            int nextNum = arr.get(i+1);
            if(nextNum == sum) {
                pairsCount++;
            }
        }
        return pairsCount;
    }

    
    public static int getPairsCount_Problem_1_542d11a5_db65_45c3_9299_3fb1844d6d73(ArrayList<Integer> arr, int sum) {
        int totalPairs = 0;
        for (int i = 0; i < arr.size(); i++) {
            totalPairs += arr.get(i) * arr.get(i + 1);
        }
        totalPairs = totalPairs % 10000;
        int pairs = totalPairs / 2;
        int pairsRemainder = totalPairs - pairs;

        return totalPairs;
    }

    
    public static int getPairsCount_Problem_2_7c3fab5a_ec65_429a_8d27_a9efa5ced84c(ArrayList<Integer> arr, int sum) {
        int result = 0;
        for (Integer value : arr) {
            result += value % 2 == 0 ? (value % 2 == 1 ? 1 : 0) : 0;
        }
        return result % 2 == 0 ? result / 2 : result / 2 - 1;
    }

    
    public static int getPairsCount_Problem_2_07d9c842_ae8d_4839_a11f_153585ac6a84(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_f560c211_c00e_4094_b90d_b59bec11a0e8(ArrayList<Integer> arr, int sum) {
        int sums = 0;
        int count = 0;
        for (int number : arr) {
            if (sum == number) {
                sums += number;
                count += 1;
            }
        }
        return sums;
    }

    
    public static int getPairsCount_Problem_0_e44e8316_a05f_4b1c_a337_ea03acf9ce72(ArrayList<Integer> arr, int sum) {
        int total = 0;
        for (int i = 0; i < arr.size(); i++) {
            total = total + arr.get(i);
            if (total > sum) {
                return i;
            }
        }
        return arr.size();
    }

    
    public static int getPairsCount_Problem_3_97a3b87c_9c4b_4541_bc2e_da700e257e0a(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (Integer i : arr) {
            for (Integer j : arr) {
                if (i != j && i + j == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_af3bf0b0_b105_4caf_b7ec_ccca0b0ac116(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                if (arr.get(j) + arr.get(i) == sum)
                    count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_45159c81_77c3_471a_95cb_422d360b6f78(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int pairs = 0;
        int size = arr.size();
        int totalSum = 0;
        for(int i = 0; i < size -1 ; i++) {
            totalSum += arr.get(i);
            for(int j = i+1; j < size ; j++) {
                if(totalSum == sum) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_2_7bf78cac_6c12_4060_afb1_3d5a0aebe5b4(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int sumCount = 0;
        for(int i=0; i<arr.size(); i++){
            int temp = (arr.get(i)+arr.get(i+1));
            if(temp == sum){
                sumCount++;
            }
        }
        return sumCount;
    }

    
    public static int getPairsCount_Problem_3_e142d193_970a_41c0_9878_dd3f72583ed6(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_cefd9986_d7c8_4cbd_9e16_f9cc72cf3394(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_1070e8d5_4a59_4112_b6d3_10de37cc03de(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1L);
            }
        }
        for (int i : arr) {
            if (map.containsKey(sum - i)) {
                count += map.get(sum - i);
            }
            if (sum - i == i) {
                count--;
            }
        }
        return count / 2;
    }

    
    public static int getPairsCount_Problem_1_44ff4dae_21fd_4a5c_85aa_2175c09169d8(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_eab3c3f7_8c21_4715_bc54_527f72e0b010(ArrayList<Integer> arr, int sum) {
        int res = 0;
        for(int i = 0; i < arr.size(); i++)
        {
            int sumTemp = arr.get(i);
            for(int j = i+1; j < arr.size(); j++)
            {
                if(sumTemp + arr.get(j) == sum)
                {
                    res++;
                    break;
                }
            }
        }
        return res;
    }

    
    public static int getPairsCount_Problem_1_ceed6d88_1e04_477b_abb3_c1f14edca3e4(ArrayList<Integer> arr, int sum) {
        int totalPairCount = 0L;

        // Write your code here
        for (int n : arr) {
            totalPairCount += (n * (n + 1L) / 2);
        }
        return totalPairCount;
    }

    
    public static int getPairsCount_Problem_0_7f5fe650_8710_47a4_885c_65ae0359132d(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int sumOfArray = arr.stream().mapToInteger(Integer::intValue).sum();
        if (sumOfArray == sum) {
            count = arr.stream().filter(x -> x == sum).count();
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_c5dbcf74_871d_45fc_8fea_62f344d5fcec(ArrayList<Integer> arr, int sum) {
        int count = 0; // initialize count = 0
        for (Integer i: arr) {
            count += i;
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_1434279b_aa51_4fd5_8805_e718ae18c643(ArrayList<Integer> arr, int sum) {
        int count = 0L;
        for(int i=0; i<arr.size(); i++){
            for(int j=i+1; j<arr.size(); j++){
                if(arr.get(i) + arr.get(j) == sum)
                    count ++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_abee755e_8562_44d0_9f59_611e98361cfd(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int total = 0;
        for (int num: arr) {
            total += num;
        }
        for (int num: arr) {
            if (num == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_09190476_5911_4164_9ba7_df31573d6c3a(ArrayList<Integer> arr, int sum) {
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    result = result + 1;
                    break;
                }
            }
        }
        return result;
    }

    
    public static int getPairsCount_Problem_1_cefd9986_d7c8_4cbd_9e16_f9cc72cf3394(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_4ad77bc3_e932_4a37_aff6_a7e6d3d9471a(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_c910f71a_e5cf_4e9e_ac20_b7f63034f4ee(ArrayList<Integer> arr, int sum) {
        if (arr.size() > 2) {
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < arr.size() - 1; i++) {
                sum1 += arr.get(i);
                sum2 += arr.get(i + 1);
            }
            if (sum1 == sum) {
                return sum2;
            } else if (sum2 != sum) {
                return sum1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    
    public static int getPairsCount_Problem_1_c0256a42_7b91_4d28_a243_604c6aeb1a93(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_f179b0c2_8303_4c58_911c_2d6a17ab9aa7(ArrayList<Integer> arr, int sum) {
        return IntStream.range(0, arr.size())
            .filter(i -> i + 1 < arr.size())
            .filter(i -> arr.get(i) == arr.get(i + 1))
            .filter(i -> arr.get(i).intValue() == sum)
            .count();
    }

    
    public static int getPairsCount_Problem_2_b3ee56b5_d45b_4a68_8212_60411df3f96f(ArrayList<Integer> arr, int sum) {
        return  IntStream.range(0, arr.size() - 1)
                .filter(i -> arr.get(i) == i + 1)
                .filter(i -> arr.get(i+1) == sum)
                .count();
    }

    
    public static int getPairsCount_Problem_0_18fc81e7_a31a_4cc1_ab8c_c9a49dd2fe56(ArrayList<Integer> arr, int sum) {
        return  Math.ceil( arr.stream().filter(x->(x+sum)==sum).count()*1.0/2 );
    }

    
    public static int getPairsCount_Problem_2_6d3bbab1_7681_4261_9784_76266a8512cb(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_30025980_552a_4adc_9c81_c94ac472463d(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_b2723209_dc07_43f2_987c_727e95309aa6(ArrayList<Integer> arr, int sum) {
        // your code goes here
        int count = 0;
        for(int i = 0; i < arr.size(); i++){
            for(int j = i+1; j < arr.size(); j++){
                if(arr.get(i) + arr.get(j) == sum)
                    count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_25bd34f1_be57_4718_9931_413b6e773a00(ArrayList<Integer> arr, int sum) {
        int countPairs = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    countPairs++;
                    break;
                }
            }
        }
        return countPairs;
    }

    
    public static int getPairsCount_Problem_2_ac214128_c259_4fc5_949f_be4c17d8f674(ArrayList<Integer> arr, int sum) {
        int pairs = 0, sum1 = sum;
        for (Integer i : arr) {
            sum1 -= i;
            if (sum1 == 0) {
                pairs++;
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_3_6920f4d1_6a3e_4a1f_8e30_ecb2d9251ba8(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_73f848cd_d752_4789_afc3_8dcf993ee0db(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for(int i = 0; i<arr.size()-1; i++){
            int x = arr.get(i);
            int y = arr.get(i+1);
            if(x+y == sum){
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_45159c81_77c3_471a_95cb_422d360b6f78(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int pairs = 0;
        int size = arr.size();
        int totalSum = 0;
        for(int i = 0; i < size -1 ; i++) {
            totalSum += arr.get(i);
            for(int j = i+1; j < size ; j++) {
                if(totalSum == sum) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_0_cd74c722_fea1_47bf_bda0_3c8c822af76f(ArrayList<Integer> arr, int sum) {
        int count = 0L;
        int sumOfArr = sum;
        for (Integer item : arr) {
            if (sumOfArr - item.intValue() > 0) {
                sumOfArr -= item.intValue();
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_17acc1b6_32e6_44b2_992f_d6abf4678a9f(ArrayList<Integer> arr, int sum) {
        int counter = 0;
        int n = arr.size();

        for (int i = 0; i < n; i++) {
            int x = arr.get(i);
            int y = x + arr.get(i + 1);
            counter++;

            if (y == sum) {
                counter++;
            }
        }
        return counter;
    }

    
    public static int getPairsCount_Problem_0_399fd699_e425_48a0_b9a4_9d53cfcc3ab8(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int sumOfArray = 0;
        for (int i : arr) {
            sumOfArray += i;
        }
        for (int i : arr) {
            if (sumOfArray == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_30fb5691_ce28_4450_9bce_3fce17f2b536(ArrayList<Integer> arr, int sum) {
        int pairs = 0;
        int firstElement = arr.get(0);
        int lastElement = arr.get(arr.size() - 1);
        int currentSum = firstElement;

        for (int i = 0; i < arr.size(); i++) {
            int nextElement = arr.get(i);
            if (currentSum == sum) {
                pairs++;
            }
            currentSum += nextElement;
        }

        return pairs;
    }

    
    public static int getPairsCount_Problem_1_7b9391b3_e63e_4cf1_a45a_574857db986e(ArrayList<Integer> arr, int sum) {
        // your code goes here
        int count = 0;
        for(int i=0;i<arr.size();i++) {
            for(int j=i+1;j<arr.size();j++) {
                if(arr.get(i) + arr.get(j) == sum){
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_d1e78ee9_2722_4ccd_a103_b0a414447646(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (Integer num : arr) {
            if (sum - num == 0)
                count++;
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_d26e16e7_9c49_449b_a201_978c517cef13(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_c4ef7a0a_264a_4c17_94da_1926208f1d1f(ArrayList<Integer> arr, int sum) {
        int count = 1;
        int len = arr.size();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                count += arr.get(i) * arr.get(j);
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_b8d1bec3_390a_4797_97be_ed014723a7c0(ArrayList<Integer> arr, int sum) {
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == sum) {
                result ++;
            }
        }
        return result;
    }

    
    public static int getPairsCount_Problem_1_932f8108_646c_45d2_a317_db6e75e15f97(ArrayList<Integer> arr, int sum) {
        int ans = 0;
        int i = 0;
        for (int j = 0; j < arr.size(); j++) {
            if (arr.get(i) + arr.get(j) == sum) {
                ans++;
            }
            i++;
        }
        return ans;
    }

    
    public static int getPairsCount_Problem_2_58619927_23b0_4209_9524_f81ad3ae88f2(ArrayList<Integer> arr, int sum) {
        return arr.stream().filter(x -> x == sum).count();
    }

    
    public static int getPairsCount_Problem_0_51914fc2_46c0_4136_9662_94896c9cd6ef(ArrayList<Integer> arr, int sum) {
        return arr
                .stream()
                .filter(x -> x.equals(sum))
                .count();
    }

    
    public static int getPairsCount_Problem_0_0a9c1360_4bcf_49ac_99ac_4c647b6ed9ab(ArrayList<Integer> arr, int sum) {
        return arr.stream().filter(p -> sum - p > 0)
                .filter(p -> sum - p < arr.size()).collect(Collectors.toList()).size();
    }

    
    public static int getPairsCount_Problem_1_0a9c1360_4bcf_49ac_99ac_4c647b6ed9ab(ArrayList<Integer> arr, int sum) {
        return arr.stream().filter(p -> sum - p > 0)
                .filter(p -> sum - p < arr.size()).collect(Collectors.toList()).size();
    }

    
    public static int getPairsCount_Problem_3_bb69389e_bd00_41e0_b18d_434b9c5e458b(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_a21acf3c_0358_411e_8149_4c210ccb1348(ArrayList<Integer> arr, int sum) {
        int numPairs = 0;
        for(int i : arr){
            int temp = i - sum;
            if(temp>=0) {
                numPairs += 1;
            }
        }
        return numPairs;
    }

    
    public static int getPairsCount_Problem_0_3f302be8_53e5_4695_924b_c98e398c0f26(ArrayList<Integer> arr, int sum) {
        // write your code here
        return sum;
    }

    
    public static int getPairsCount_Problem_2_90799114_7c93_4c41_abe1_1ef3c806222f(ArrayList<Integer> arr, int sum) {
        if (arr.isEmpty() || sum < 0)
            return 0;

        // Use a map to count the number of pairs whose sum is equal to sum. 
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer l : arr) {
            map.put(l, map.containsKey(sum - l) ? map.get(sum - l) + 1 : 1);
        }

        return map.values().stream().distinct().count();
    }

    
    public static int getPairsCount_Problem_2_a81141a8_35a1_4b8b_b0b8_0d9b86354f81(ArrayList<Integer> arr, int sum) {
        int pairsCount = 0;
        for (Integer num : arr) {
            pairsCount += (Math.pow(sum, 2) - num * num);
        }
        return pairsCount;
    }

    
    public static int getPairsCount_Problem_1_3f508ddd_b26d_4815_8a7f_cd28bbdeef0c(ArrayList<Integer> arr, int sum) {
        int countPairs = arr.stream().filter(i -> sum - i > 0).collect(Collectors.toList()).size();
        return countPairs;
    }

    
    public static int getPairsCount_Problem_0_74b48fb1_f5a4_468a_89b2_8820d5e902af(ArrayList<Integer> arr, int sum) {
        int pairCount = 0;
        int sumOfArray = arr.stream().mapToInteger(a -> a).sum();

        for (int i : arr) {
            if (sum == sumOfArray) {
                pairCount++;
            }
        }
        return pairCount;
    }

    
    public static int getPairsCount_Problem_3_58619927_23b0_4209_9524_f81ad3ae88f2(ArrayList<Integer> arr, int sum) {
        return arr.stream().filter(x -> x == sum).count();
    }

    
    public static int getPairsCount_Problem_2_ef53fe51_28ab_4a0b_bfad_64181237494c(ArrayList<Integer> arr, int sum) {
        return arr.stream()
                .map(num -> Math.abs(num - sum))
                .filter(i -> i >= 0)
                .count();
    }

    
    public static int getPairsCount_Problem_1_ee157b22_eca7_4165_a67f_be581c58bf1f(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int pairs = 0;
        for (int i = 0; i < arr.size(); i++) {
            int tempSum = arr.get(i);
            for (int j = i; j < arr.size(); j++) {
                if (tempSum == sum) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_2_b46ab0b7_d5f8_462e_a8ee_5aab1af172bb(ArrayList<Integer> arr, int sum) {
        int count = 0L;
        for (Integer i : arr) {
            count += i;
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_7c3fab5a_ec65_429a_8d27_a9efa5ced84c(ArrayList<Integer> arr, int sum) {
        int result = 0;
        for (Integer value : arr) {
            result += value % 2 == 0 ? (value % 2 == 1 ? 1 : 0) : 0;
        }
        return result % 2 == 0 ? result / 2 : result / 2 - 1;
    }

    
    public static int getPairsCount_Problem_2_bae280ad_961b_4778_bb34_c1e5df9f2958(ArrayList<Integer> arr, int sum) {
        int pairs = 0;
        for (int i = 0; i < arr.size(); i++) {
            int newSum = sum - arr.get(i);
            if (newSum == 0)
                continue;
            pairs += (arr.size() - i) * newSum;
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_1_6d3bbab1_7681_4261_9784_76266a8512cb(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_f3c04ce8_015a_4b16_9b35_1a65315c1a47(ArrayList<Integer> arr, int sum) {
        int size = arr.size();
        int pairs = 0;
        for (int i = 0; i < size; i++) {
            int leftSum = arr.get(i);
            for (int j = i + 1; j < size; j++) {
                int rightSum = arr.get(j);
                if (leftSum + rightSum == sum) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_3_3f811f28_02ab_46c0_bf5b_44185fc5cf12(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_f4bcf8c8_fc73_4a87_bf4d_6decc5636f31(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_44ff4dae_21fd_4a5c_85aa_2175c09169d8(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_f4bcf8c8_fc73_4a87_bf4d_6decc5636f31(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_b87b3f65_a9fa_464d_ad4d_093481ca5f21(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_1964729c_c0da_48d4_a5f0_227e5facdfc4(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int sumOfArray = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            sumOfArray += arr.get(i);
            if(sumOfArray == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_3f811f28_02ab_46c0_bf5b_44185fc5cf12(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_963963aa_aa8f_430a_a19f_b6286f06217e(ArrayList<Integer> arr, int sum) {
        // Create a Java stream on the array of numbers.
        int count = arr.stream().filter(num -> num % 2 == 0).count();
        // Return the number of pairs.
        return count;
    }

    
    public static int getPairsCount_Problem_1_bae280ad_961b_4778_bb34_c1e5df9f2958(ArrayList<Integer> arr, int sum) {
        int pairs = 0;
        for (int i = 0; i < arr.size(); i++) {
            int newSum = sum - arr.get(i);
            if (newSum == 0)
                continue;
            pairs += (arr.size() - i) * newSum;
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_0_f560c211_c00e_4094_b90d_b59bec11a0e8(ArrayList<Integer> arr, int sum) {
        int sums = 0;
        int count = 0;
        for (int number : arr) {
            if (sum == number) {
                sums += number;
                count += 1;
            }
        }
        return sums;
    }

    
    public static int getPairsCount_Problem_1_8db6232d_7789_4b13_8bc7_88fb36a3ebc8(ArrayList<Integer> arr, int sum) {
        int pairsCount = 0;

        // loop the array list to count the pairs whose sum is equal to sum
        for (Integer i : arr) {
            int tempSum = sum;
            tempSum += i;
            for (Integer j : arr) {
                tempSum -= j;
                if (tempSum == sum) {
                    pairsCount++;
                }
            }
        }
        return pairsCount;
    }

    
    public static int getPairsCount_Problem_1_d26e16e7_9c49_449b_a201_978c517cef13(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_f24360b3_62fe_4bf6_9660_51c862abec6c(ArrayList<Integer> arr, int sum) {
        int pairs = 0L;
        for (Integer x : arr) {
            pairs += arr.stream().filter((y) -> y == x).count();
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_2_4a074d8e_bf0d_4f55_8225_27c26bd7b0dd(ArrayList<Integer> arr, int sum) {
        int n = arr.size();
        int count = 0;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if((arr.get(i)*(j-1)) == sum) {
                    count += 1;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_46c8daa4_3e46_4ea1_89c2_d6d7f7f43859(ArrayList<Integer> arr, int sum) {
        // sort the array
        Collections.sort(arr);
        // set the two pointers
        int left = 0;
        int right = arr.size() - 1;
        int count = 0;
        while (left < right) {
            int s = arr.get(left) + arr.get(right);
            if (s == sum) {
                count++;
                left++;
                right--;
            } else if (s < sum) {
                left++;
            } else {
                right--;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_1278651b_16e7_4407_a151_b7126e056573(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_90799114_7c93_4c41_abe1_1ef3c806222f(ArrayList<Integer> arr, int sum) {
        if (arr.isEmpty() || sum < 0)
            return 0;

        // Use a map to count the number of pairs whose sum is equal to sum. 
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer l : arr) {
            map.put(l, map.containsKey(sum - l) ? map.get(sum - l) + 1 : 1);
        }

        return map.values().stream().distinct().count();
    }

    
    public static int getPairsCount_Problem_2_30fad1e5_5e47_4784_83bf_b789c9c5e318(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int sumOfArray = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            sumOfArray = sumOfArray + arr.get(i);
            if (sumOfArray == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_d5a9c2cb_409e_49ba_96b8_73c73a773638(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for(int i = 0; i<arr.size();i++) {
            for(int j = i+1; j<arr.size();j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_ca6d972e_7309_4fa6_8c3d_419050a7bbcc(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_b6403572_72aa_4e1f_8705_2e3d284d1eee(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_ebe3d30a_ea93_4ac6_9ceb_62ce8897f2c6(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int element : arr) {
            count += element % 2 == 0 ? 1 : 0;
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_5d5cb827_41dd_4be8_b8fd_fd7abcf53a20(ArrayList<Integer> arr, int sum) {
        if (arr.size() == 0) {
            return 0;
        }
        int countPairs = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            int firstNum = arr.get(i);
            int secondNum = arr.get(i + 1);
            if (firstNum + secondNum == sum) {
                countPairs++;
            }
        }
        return countPairs;
    }

    
    public static int getPairsCount_Problem_0_e4f0fa0b_b9d5_4c58_b398_a19b2706a265(ArrayList<Integer> arr, int sum) {
        int total = 0;
        int count = 0;
        for (int i : arr) {
            if (total + i == sum) {
                total++;
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_da68c33a_d916_4c5a_9419_04f0b9a27523(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_6d6563b6_87d6_4403_9c3e_bb5e2378e8e5(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_7bf78cac_6c12_4060_afb1_3d5a0aebe5b4(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int sumCount = 0;
        for(int i=0; i<arr.size(); i++){
            int temp = (arr.get(i)+arr.get(i+1));
            if(temp == sum){
                sumCount++;
            }
        }
        return sumCount;
    }

    
    public static int getPairsCount_Problem_3_93405d33_d58c_4261_87cf_437ceeeef92b(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_bc9a3e97_04f4_4df2_9395_08268ab34907(ArrayList<Integer> arr, int sum) {
        int pairCount = 0;
        int currentSum = 0;
        for(int currentNum : arr) {
            currentSum += currentNum;
            if(currentSum == sum) {
                pairCount++;
            }
        }
        return pairCount;
    }

    
    public static int getPairsCount_Problem_3_fb57027c_71d9_4e91_b321_dc03fa96d6e1(ArrayList<Integer> arr, int sum) {
        // initialize counter to zero
        int count = 0;
        // loop through all elements of the input array
        for (Integer num : arr) {
            // add 1 to the counter for elements that satisfy the condition
            if (sum == num) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_a585aeb3_cdd3_4f0e_afbb_189fc23851d1(ArrayList<Integer> arr, int sum) {
        int countPairs = 0;
        for (int i = 0; i < arr.size(); i++) {
            int first = arr.get(i);
            for (int j = i + 1; j < arr.size(); j++) {
                int second = arr.get(j);
                if (first + second == sum) {
                    countPairs++;
                }
            }
        }
        return countPairs;
    }

    
    public static int getPairsCount_Problem_0_5d5cb827_41dd_4be8_b8fd_fd7abcf53a20(ArrayList<Integer> arr, int sum) {
        if (arr.size() == 0) {
            return 0;
        }
        int countPairs = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            int firstNum = arr.get(i);
            int secondNum = arr.get(i + 1);
            if (firstNum + secondNum == sum) {
                countPairs++;
            }
        }
        return countPairs;
    }

    
    public static int getPairsCount_Problem_0_3f811f28_02ab_46c0_bf5b_44185fc5cf12(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_3f508ddd_b26d_4815_8a7f_cd28bbdeef0c(ArrayList<Integer> arr, int sum) {
        int countPairs = arr.stream().filter(i -> sum - i > 0).collect(Collectors.toList()).size();
        return countPairs;
    }

    
    public static int getPairsCount_Problem_3_cefd9986_d7c8_4cbd_9e16_f9cc72cf3394(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_ea2bc567_97a9_48f9_8f75_b93183034058(ArrayList<Integer> arr, int sum) {
        int count = 0;
        // write your code here
        for(int i = 0; i < arr.size(); i++){
            for(int j = 0; j < arr.size(); j++){
                if(i != j){
                    if(arr.get(i) == (arr.get(j) + sum)){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_ac214128_c259_4fc5_949f_be4c17d8f674(ArrayList<Integer> arr, int sum) {
        int pairs = 0, sum1 = sum;
        for (Integer i : arr) {
            sum1 -= i;
            if (sum1 == 0) {
                pairs++;
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_1_f4bcf8c8_fc73_4a87_bf4d_6decc5636f31(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_ab8da46c_3928_46dc_b449_a8f7407d09c4(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_f179b0c2_8303_4c58_911c_2d6a17ab9aa7(ArrayList<Integer> arr, int sum) {
        return IntStream.range(0, arr.size())
            .filter(i -> i + 1 < arr.size())
            .filter(i -> arr.get(i) == arr.get(i + 1))
            .filter(i -> arr.get(i).intValue() == sum)
            .count();
    }

    
    public static int getPairsCount_Problem_0_5ded4291_d2f9_43d8_842d_a0e4d8e466d6(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i : arr) {
            for (int j : arr) {
                if (i == j) continue;
                if (i + j == sum) {
                    count += 1;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_dfe670c3_7ae1_494e_8f36_c85ce0f92c66(ArrayList<Integer> arr, int sum) {
        int result = 0;
        for (Integer n : arr) {
            if (sum == n) result++;
        }
        return result;
    }

    
    public static int getPairsCount_Problem_3_dab0f995_c968_4dba_8312_9431e27e712c(ArrayList<Integer> arr, int sum) {
        int len = arr.size();
        // write code here
        return 0;
    }

    
    public static int getPairsCount_Problem_3_1c68ad62_0d63_43f0_8d9f_caab49eb0f52(ArrayList<Integer> arr, int sum) {
        return arr.stream().filter((e) -> e % 2 == 0).mapToInteger(x -> x * x).sum();
    }

    
    public static int getPairsCount_Problem_1_d26eae03_a2c9_4ad3_a44a_5b3ef0d4e051(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_5848dab1_ad58_45a4_8063_140dc451e5b0(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int sum1 = sum - arr.get(i);
            int sum2 = sum - arr.get(i + 1);
            if (sum1 >= 0 && sum2 >= 0) {
                if (sum1 < sum2) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_6d3bbab1_7681_4261_9784_76266a8512cb(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_da68c33a_d916_4c5a_9419_04f0b9a27523(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_c8477b7e_2a09_48c2_8144_d6d1e0625ead(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_b6403572_72aa_4e1f_8705_2e3d284d1eee(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_3952898e_606b_490b_8f81_ea092ef4b72a(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_6a60ed38_3385_4dfc_a618_d19cf095bfd6(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int e : arr) {
            if (sum - e == 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_d45a0b6b_5a2c_4f67_881d_aa5a3136b79a(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_b6403572_72aa_4e1f_8705_2e3d284d1eee(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_1f4f5249_3fe2_4fcb_b3fb_c843d93bc938(ArrayList<Integer> arr, int sum) {
        int totalPairsCount = 0;
        for (int l : arr) {
            for (int r : arr) {
                if (l == r) {
                    continue;
                }
                if (l + r == sum) {
                    totalPairsCount++;
                }
            }
        }
        return totalPairsCount;
    }

    
    public static int getPairsCount_Problem_1_4a074d8e_bf0d_4f55_8225_27c26bd7b0dd(ArrayList<Integer> arr, int sum) {
        int n = arr.size();
        int count = 0;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if((arr.get(i)*(j-1)) == sum) {
                    count += 1;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_34f5d18a_c298_46cf_af7a_b8e0e12a75ae(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_6920f4d1_6a3e_4a1f_8e30_ecb2d9251ba8(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_932f8108_646c_45d2_a317_db6e75e15f97(ArrayList<Integer> arr, int sum) {
        int ans = 0;
        int i = 0;
        for (int j = 0; j < arr.size(); j++) {
            if (arr.get(i) + arr.get(j) == sum) {
                ans++;
            }
            i++;
        }
        return ans;
    }

    
    public static int getPairsCount_Problem_3_6688d5fe_bb6a_42c4_ac9c_846b1d011f08(ArrayList<Integer> arr, int sum) {
        return arr.stream().filter(x -> x == sum).count() * arr.size();
    }

    
    public static int getPairsCount_Problem_2_ac28353f_73a5_4936_9422_27e5948ab46d(ArrayList<Integer> arr, int sum) {
        return  Math.pow(arr.size(), 2);
    }

    
    public static int getPairsCount_Problem_2_af8f8587_f885_4ace_a124_592e85c8cbe7(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int pair = (arr.get(i) + arr.get(i + 1))/2;
            if (sum == pair) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_542d11a5_db65_45c3_9299_3fb1844d6d73(ArrayList<Integer> arr, int sum) {
        int totalPairs = 0;
        for (int i = 0; i < arr.size(); i++) {
            totalPairs += arr.get(i) * arr.get(i + 1);
        }
        totalPairs = totalPairs % 10000;
        int pairs = totalPairs / 2;
        int pairsRemainder = totalPairs - pairs;

        return totalPairs;
    }

    
    public static int getPairsCount_Problem_3_bc9a3e97_04f4_4df2_9395_08268ab34907(ArrayList<Integer> arr, int sum) {
        int pairCount = 0;
        int currentSum = 0;
        for(int currentNum : arr) {
            currentSum += currentNum;
            if(currentSum == sum) {
                pairCount++;
            }
        }
        return pairCount;
    }

    
    public static int getPairsCount_Problem_3_f560c211_c00e_4094_b90d_b59bec11a0e8(ArrayList<Integer> arr, int sum) {
        int sums = 0;
        int count = 0;
        for (int number : arr) {
            if (sum == number) {
                sums += number;
                count += 1;
            }
        }
        return sums;
    }

    
    public static int getPairsCount_Problem_3_fb36cdf4_d211_40d3_aea5_d66661184a70(ArrayList<Integer> arr, int sum) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_34ec04b7_85dd_40c7_84a6_63ac8820f400(ArrayList<Integer> arr, int sum) {
        return  arr.stream()
                .filter(x -> (x%2 == 0) || (x%2 == 1))
                .map(x -> x * x)
                .distinct()
                .filter(x -> x == sum)
                .count();
    }

    
    public static int getPairsCount_Problem_1_ea2bc567_97a9_48f9_8f75_b93183034058(ArrayList<Integer> arr, int sum) {
        int count = 0;
        // write your code here
        for(int i = 0; i < arr.size(); i++){
            for(int j = 0; j < arr.size(); j++){
                if(i != j){
                    if(arr.get(i) == (arr.get(j) + sum)){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_cfba60ec_c9c9_47e2_be0d_567978ad410a(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int sumPairs = 0;
        for(Integer l : arr) {
            for(Integer r : arr) {
                if (sum == l+r) {
                    sumPairs++;
                }
            }
        }
        return sumPairs;
    }

    
    public static int getPairsCount_Problem_0_bbe71541_bf5f_493f_b672_40de2df7e4f8(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_a78a09f3_50a4_4df5_98b2_32b11f2d336e(ArrayList<Integer> arr, int sum) {
        int pairs = 0;
        
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i+1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    pairs++;
                }
            }
        }
        
        return pairs;
    }

    
    public static int getPairsCount_Problem_1_18fc81e7_a31a_4cc1_ab8c_c9a49dd2fe56(ArrayList<Integer> arr, int sum) {
        return  Math.ceil( arr.stream().filter(x->(x+sum)==sum).count()*1.0/2 );
    }

    
    public static int getPairsCount_Problem_3_84fad189_0a20_4383_919f_f7ce73b245be(ArrayList<Integer> arr, int sum) {
        // your code goes here
        int total = 0;
        for (Integer num : arr) {
            if (sum - num < 0) continue;
            total += num;
        }
        return total;
    }

    
    public static int getPairsCount_Problem_3_2e1846e8_84c1_4dce_ab88_ea8aac664373(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_7103d668_300c_4123_b1c4_9a30b913bfbb(ArrayList<Integer> arr, int sum) {
        return arr.stream().filter(i -> i + sum < sum).collect(Collectors.toList()).size();
    }

    
    public static int getPairsCount_Problem_1_bbe71541_bf5f_493f_b672_40de2df7e4f8(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_9f640c35_9d47_4db0_827b_c86055f3a7cd(ArrayList<Integer> arr, int sum) {
        int count = 0, pairsCount = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == sum) {
                pairsCount++;
            }
            else
                count++;
        }
        return pairsCount;
    }

    
    public static int getPairsCount_Problem_1_4c53e454_27fc_4c6f_bd53_679c7ad1ec3d(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_1b129f41_202f_4208_9b24_43e20642ecf5(ArrayList<Integer> arr, int sum) {
        int pairsCount = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int sum1 = sum - arr.get(i);
                int sum2 = sum - arr.get(j);
                if (sum1 == sum2) {
                    pairsCount++;
                }
            }
        }
        return pairsCount;
    }

    
    public static int getPairsCount_Problem_1_6a60ed38_3385_4dfc_a618_d19cf095bfd6(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int e : arr) {
            if (sum - e == 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_a92905f7_b5c4_4642_8eb8_4d19e41c667f(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for(int i : arr) {
            for(int j : arr) {
                if(i == j) {
                    continue;
                }
                if(sum - i == j - sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_ebe3d30a_ea93_4ac6_9ceb_62ce8897f2c6(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int element : arr) {
            count += element % 2 == 0 ? 1 : 0;
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_eb48b50e_880b_4a97_b8d0_040966a37bce(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (Integer num : arr) {
            if (num % 2 == 0 && num > 0 && sum % num == 0) {
                count += 1;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_f3d8d0da_8520_43f9_9053_6706904c1c64(ArrayList<Integer> arr, int sum) {
        // Your code here
        int count=0;
        for(int i=0;i<arr.size()-1;i++){
            for(int j=i+1;j<arr.size();j++){
                if(arr.get(i)<arr.get(j)){
                    count+=arr.get(i);
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_51914fc2_46c0_4136_9662_94896c9cd6ef(ArrayList<Integer> arr, int sum) {
        return arr
                .stream()
                .filter(x -> x.equals(sum))
                .count();
    }

    
    public static int getPairsCount_Problem_0_7bf78cac_6c12_4060_afb1_3d5a0aebe5b4(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int sumCount = 0;
        for(int i=0; i<arr.size(); i++){
            int temp = (arr.get(i)+arr.get(i+1));
            if(temp == sum){
                sumCount++;
            }
        }
        return sumCount;
    }

    
    public static int getPairsCount_Problem_1_c8477b7e_2a09_48c2_8144_d6d1e0625ead(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_d23a341c_a643_4abf_8115_8200c796d8be(ArrayList<Integer> arr, int sum) {
        // Write your code here.
        return 0;
    }

    
    public static int getPairsCount_Problem_0_83281166_a5ee_4940_9fc4_1356eb376122(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_4c53e454_27fc_4c6f_bd53_679c7ad1ec3d(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_60c8620c_dda7_4d1d_82f2_04b3097b2f24(ArrayList<Integer> arr, int sum) {
        // Write your code here
        return 0;
    }

    
    public static int getPairsCount_Problem_0_0e386f84_706d_4e91_a892_cffa23b945f3(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int left = arr.get(i);
            int right = arr.get(i + 1);
            while (left >= right) {
                left -= right;
                count += 1;
            }
            if (i == arr.size() - 1) {
                break;
            }
            int temp = arr.get(i);
            arr.set(i, arr.get(i + 1));
            arr.set(i + 1, temp);
            sum = sum - left;
            count = count + getPairsCount_Problem_0_0e386f84_706d_4e91_a892_cffa23b945f3(arr, sum);
            arr.set(i, arr.get(i + 1));
            arr.set(i + 1, temp);
            sum = sum - right;
            count = count + getPairsCount_Problem_0_0e386f84_706d_4e91_a892_cffa23b945f3(arr, sum);
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_6393d037_caf1_49ec_8d1f_6e8af2730553(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_84fad189_0a20_4383_919f_f7ce73b245be(ArrayList<Integer> arr, int sum) {
        // your code goes here
        int total = 0;
        for (Integer num : arr) {
            if (sum - num < 0) continue;
            total += num;
        }
        return total;
    }

    
    public static int getPairsCount_Problem_2_58153cf3_8fa3_41ee_a79d_5eda914800fd(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_18ee0de8_bc54_4774_8776_321c2c51fab6(ArrayList<Integer> arr, int sum) {
        int pairsCount = 0;
        for(int i = 0; i < arr.size(); i++) {
            int currentPair = arr.get(i);
            int nextPair = arr.get(i+1);
            
            while(currentPair + nextPair != sum) {
                currentPair+=nextPair;
                pairsCount++;
                nextPair+=nextPair;
            }
        }
        return pairsCount;
    }

    
    public static int getPairsCount_Problem_0_cb837d38_ab98_483e_beaf_58855590e01f(ArrayList<Integer> arr, int sum) {
        // Your code goes here
        int counter = 0;
        for (int i = 0; i < arr.size(); i++) {
            counter++;
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    counter++;
                }
            }
        }
        return counter;
    }

    
    public static int getPairsCount_Problem_0_90bfd318_c99c_45d2_a798_cb2085313520(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (Integer i : arr) {
            count += i;
        }
        count = count - sum;
        count = count + 1;
        return count;
    }

    
    public static int getPairsCount_Problem_0_9f7b6fc3_f70a_4e9e_9f24_47dfd34ace0c(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_d23a341c_a643_4abf_8115_8200c796d8be(ArrayList<Integer> arr, int sum) {
        // Write your code here.
        return 0;
    }

    
    public static int getPairsCount_Problem_0_62878724_ff14_43eb_80bc_ea0c704bef76(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for(int i = 0; i<arr.size()-1; i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_f179b0c2_8303_4c58_911c_2d6a17ab9aa7(ArrayList<Integer> arr, int sum) {
        return IntStream.range(0, arr.size())
            .filter(i -> i + 1 < arr.size())
            .filter(i -> arr.get(i) == arr.get(i + 1))
            .filter(i -> arr.get(i).intValue() == sum)
            .count();
    }

    
    public static int getPairsCount_Problem_1_d6bf8b18_5514_44ce_a51b_01e7fb32069b(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int sumOfArray = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            sumOfArray += arr.get(i);
            if(sumOfArray == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_f0a6869f_f4bc_4592_84c6_0a6702a36e48(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int leftSum = arr.get(i);
            int rightSum = sum - leftSum;
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j) == rightSum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_6d3bbab1_7681_4261_9784_76266a8512cb(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_193bddbf_f18c_4cb8_ab8f_662344f61d8e(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int l : arr) {
            for (int r : arr) {
                if (l + r == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_fb229b93_81b5_4511_a898_8a085c1f2d74(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_a27dd3d5_4d5a_49fa_99ff_99cbf4e12757(ArrayList<Integer> arr, int sum) {
        // code here
        return 0;
    }

    
    public static int getPairsCount_Problem_1_c47cc2a5_6658_462a_9ed4_3ef3a478e5b3(ArrayList<Integer> arr, int sum) {
        int pairsCount = 0;
        for(int i = 0; i<arr.size(); i++) {
            int currentNum = arr.get(i);
            int nextNum = arr.get(i+1);
            if(nextNum == sum) {
                pairsCount++;
            }
        }
        return pairsCount;
    }

    
    public static int getPairsCount_Problem_0_c8477b7e_2a09_48c2_8144_d6d1e0625ead(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_b138d2b2_81e3_4432_890e_6fe0baf178b6(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_3f811f28_02ab_46c0_bf5b_44185fc5cf12(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_e383d20c_f4ee_4f97_a308_07ab03c220a7(ArrayList<Integer> arr, int sum) {
        return IntStream.range(0, arr.size() - 1).filter(i -> arr.get(i) + arr.get(i + 1) == sum)
                .count();
    }

    
    public static int getPairsCount_Problem_2_c8477b7e_2a09_48c2_8144_d6d1e0625ead(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_d26e16e7_9c49_449b_a201_978c517cef13(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_932f8108_646c_45d2_a317_db6e75e15f97(ArrayList<Integer> arr, int sum) {
        int ans = 0;
        int i = 0;
        for (int j = 0; j < arr.size(); j++) {
            if (arr.get(i) + arr.get(j) == sum) {
                ans++;
            }
            i++;
        }
        return ans;
    }

    
    public static int getPairsCount_Problem_0_e7cafe5a_aea6_460b_b02d_5f12bae12104(ArrayList<Integer> arr, int sum) {
        // write your code here
        return 0;
    }

    
    public static int getPairsCount_Problem_3_22e41848_69bb_462a_abfc_3024f58ab683(ArrayList<Integer> arr, int sum) {
        int size = arr.size();
        int total = 0;
        int count = 0;
        // write your logic here
        for(int i=0; i<size; i++){
            total += arr.get(i);
            if(total == sum){
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_25bd34f1_be57_4718_9931_413b6e773a00(ArrayList<Integer> arr, int sum) {
        int countPairs = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    countPairs++;
                    break;
                }
            }
        }
        return countPairs;
    }

    
    public static int getPairsCount_Problem_1_43d91197_d4ca_4d76_aec2_569f7745c5d0(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i : arr) {
            for (int j : arr) {
                if (i != j && i + j == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_ceed6d88_1e04_477b_abb3_c1f14edca3e4(ArrayList<Integer> arr, int sum) {
        int totalPairCount = 0L;

        // Write your code here
        for (int n : arr) {
            totalPairCount += (n * (n + 1L) / 2);
        }
        return totalPairCount;
    }

    
    public static int getPairsCount_Problem_2_c4ef7a0a_264a_4c17_94da_1926208f1d1f(ArrayList<Integer> arr, int sum) {
        int count = 1;
        int len = arr.size();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                count += arr.get(i) * arr.get(j);
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_28775493_ead2_43ce_8a69_8b93a306de4b(ArrayList<Integer> arr, int sum) {
        int result = 0;
        int n = arr.size();
        for(int i: arr){
            for(int j: arr){
                if(i != j){
                    if(Math.abs(sum - i) + Math.abs(sum - j) == sum){
                        result++;
                    }
                }
            }
        }
        return result;
    }

    
    public static int getPairsCount_Problem_1_b1dc579f_eb6d_44a1_95f6_a459d4bb050f(ArrayList<Integer> arr, int sum) {
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (num != 0) {
                if (sum - num == 0) {
                    result += 1;
                }
            }
        }
        return result;
    }

    
    public static int getPairsCount_Problem_1_ac28353f_73a5_4936_9422_27e5948ab46d(ArrayList<Integer> arr, int sum) {
        return  Math.pow(arr.size(), 2);
    }

    
    public static int getPairsCount_Problem_1_6847cfd6_8cf9_4a2b_a427_845dec99a757(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_e30e88dc_c012_42f4_ac38_eaab09c96c5f(ArrayList<Integer> arr, int sum) {
        int count = 0;
        // iterate through the list to find all the pairs whose sum is equal to sum
        for (int num : arr) {
            for (int i = arr.indexOf(0); i < arr.size(); i++) {
                int temp = 0;
                for (int j = i; j < arr.size(); j++) {
                    temp += arr.get(j);
                    if (temp == sum) {
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_e7cafe5a_aea6_460b_b02d_5f12bae12104(ArrayList<Integer> arr, int sum) {
        // write your code here
        return 0;
    }

    
    public static int getPairsCount_Problem_1_c4f89bb9_c192_4a14_b921_f0dd55338f6f(ArrayList<Integer> arr, int sum) {
        int pairs = 0;
        for (int val : arr) {
            for (int val1 : arr) {
                if (val != val1 && val + val1 == sum) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_0_480dc5d0_5e0c_4ba4_8e18_ed74e24f09fc(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_30fb5691_ce28_4450_9bce_3fce17f2b536(ArrayList<Integer> arr, int sum) {
        int pairs = 0;
        int firstElement = arr.get(0);
        int lastElement = arr.get(arr.size() - 1);
        int currentSum = firstElement;

        for (int i = 0; i < arr.size(); i++) {
            int nextElement = arr.get(i);
            if (currentSum == sum) {
                pairs++;
            }
            currentSum += nextElement;
        }

        return pairs;
    }

    
    public static int getPairsCount_Problem_1_f0a6869f_f4bc_4592_84c6_0a6702a36e48(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int leftSum = arr.get(i);
            int rightSum = sum - leftSum;
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j) == rightSum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_b46ab0b7_d5f8_462e_a8ee_5aab1af172bb(ArrayList<Integer> arr, int sum) {
        int count = 0L;
        for (Integer i : arr) {
            count += i;
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_22e41848_69bb_462a_abfc_3024f58ab683(ArrayList<Integer> arr, int sum) {
        int size = arr.size();
        int total = 0;
        int count = 0;
        // write your logic here
        for(int i=0; i<size; i++){
            total += arr.get(i);
            if(total == sum){
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_44da26a2_c685_4b5b_9b05_552ca1d3d1b6(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (Integer i : arr) {
            for (Integer j : arr) {
                if (i != j && sum - i + j == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_30025980_552a_4adc_9c81_c94ac472463d(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_364be8d6_00b6_47b5_b3d0_7ef4089caa26(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_542d11a5_db65_45c3_9299_3fb1844d6d73(ArrayList<Integer> arr, int sum) {
        int totalPairs = 0;
        for (int i = 0; i < arr.size(); i++) {
            totalPairs += arr.get(i) * arr.get(i + 1);
        }
        totalPairs = totalPairs % 10000;
        int pairs = totalPairs / 2;
        int pairsRemainder = totalPairs - pairs;

        return totalPairs;
    }

    
    public static int getPairsCount_Problem_0_6847cfd6_8cf9_4a2b_a427_845dec99a757(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_84fad189_0a20_4383_919f_f7ce73b245be(ArrayList<Integer> arr, int sum) {
        // your code goes here
        int total = 0;
        for (Integer num : arr) {
            if (sum - num < 0) continue;
            total += num;
        }
        return total;
    }

    
    public static int getPairsCount_Problem_3_b2723209_dc07_43f2_987c_727e95309aa6(ArrayList<Integer> arr, int sum) {
        // your code goes here
        int count = 0;
        for(int i = 0; i < arr.size(); i++){
            for(int j = i+1; j < arr.size(); j++){
                if(arr.get(i) + arr.get(j) == sum)
                    count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_ca6d972e_7309_4fa6_8c3d_419050a7bbcc(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_1b129f41_202f_4208_9b24_43e20642ecf5(ArrayList<Integer> arr, int sum) {
        int pairsCount = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int sum1 = sum - arr.get(i);
                int sum2 = sum - arr.get(j);
                if (sum1 == sum2) {
                    pairsCount++;
                }
            }
        }
        return pairsCount;
    }

    
    public static int getPairsCount_Problem_2_7b9391b3_e63e_4cf1_a45a_574857db986e(ArrayList<Integer> arr, int sum) {
        // your code goes here
        int count = 0;
        for(int i=0;i<arr.size();i++) {
            for(int j=i+1;j<arr.size();j++) {
                if(arr.get(i) + arr.get(j) == sum){
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_a9870aea_5fcb_4fef_9e68_8de4feb0b1e2(ArrayList<Integer> arr, int sum) {
        int countPairs=0;
        int first=arr.get(0), second=arr.get(1);
        for(int i=0;i<arr.size();i++) {
            countPairs=countPairs+((arr.get(i)-first)*(arr.get(i)-second))==sum ? (countPairs+1):0;
            first=arr.get(i);
            second=arr.get(i);
        }
        return countPairs;
    }

    
    public static int getPairsCount_Problem_1_e1935dc1_70d8_4856_9854_1994248f5fcb(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int num : arr)
            if (sum - num >= 0)
                count++;
        return count;
    }

    
    public static int getPairsCount_Problem_0_58153cf3_8fa3_41ee_a79d_5eda914800fd(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_09190476_5911_4164_9ba7_df31573d6c3a(ArrayList<Integer> arr, int sum) {
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    result = result + 1;
                    break;
                }
            }
        }
        return result;
    }

    
    public static int getPairsCount_Problem_0_ce9aa73b_794b_4c32_b755_0626c11ecfb7(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_58153cf3_8fa3_41ee_a79d_5eda914800fd(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_b3ee56b5_d45b_4a68_8212_60411df3f96f(ArrayList<Integer> arr, int sum) {
        return  IntStream.range(0, arr.size() - 1)
                .filter(i -> arr.get(i) == i + 1)
                .filter(i -> arr.get(i+1) == sum)
                .count();
    }

    
    public static int getPairsCount_Problem_0_d6bf8b18_5514_44ce_a51b_01e7fb32069b(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int sumOfArray = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            sumOfArray += arr.get(i);
            if(sumOfArray == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_cd74c722_fea1_47bf_bda0_3c8c822af76f(ArrayList<Integer> arr, int sum) {
        int count = 0L;
        int sumOfArr = sum;
        for (Integer item : arr) {
            if (sumOfArr - item.intValue() > 0) {
                sumOfArr -= item.intValue();
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_ef6b30c9_e37d_4ae7_8d87_f33472b6d355(ArrayList<Integer> arr, int sum) {
        int pairsCount = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == sum) {
                pairsCount++;
            }
        }
        return pairsCount;
    }

    
    public static int getPairsCount_Problem_3_e7cafe5a_aea6_460b_b02d_5f12bae12104(ArrayList<Integer> arr, int sum) {
        // write your code here
        return 0;
    }

    
    public static int getPairsCount_Problem_0_7103d668_300c_4123_b1c4_9a30b913bfbb(ArrayList<Integer> arr, int sum) {
        return arr.stream().filter(i -> i + sum < sum).collect(Collectors.toList()).size();
    }

    
    public static int getPairsCount_Problem_2_54f84083_ae04_4eee_92c1_3ccaafd9f632(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_fb57027c_71d9_4e91_b321_dc03fa96d6e1(ArrayList<Integer> arr, int sum) {
        // initialize counter to zero
        int count = 0;
        // loop through all elements of the input array
        for (Integer num : arr) {
            // add 1 to the counter for elements that satisfy the condition
            if (sum == num) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_4ad77bc3_e932_4a37_aff6_a7e6d3d9471a(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_b66fa464_ca18_470d_b329_4fd47ccff495(ArrayList<Integer> arr, int sum) {
        // Return the result in a int.
        int result = 0;
        // Write your code here
        for(int i=0; i<arr.size(); i++){
            for(int j=i+1; j<arr.size(); j++){
                if(arr.get(i)+arr.get(j) == sum){
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int getPairsCount_Problem_0_58619927_23b0_4209_9524_f81ad3ae88f2(ArrayList<Integer> arr, int sum) {
        return arr.stream().filter(x -> x == sum).count();
    }

    
    public static int getPairsCount_Problem_0_903e7c64_fa11_4716_b8b9_6c8997dad9ec(ArrayList<Integer> arr, int sum) {
        int count = 0, result = 0;

        for (int n : arr)
            result += (n / 2) * (n / 2);

        if (result == sum)
            count++;

        return count;
    }

    
    public static int getPairsCount_Problem_1_a81141a8_35a1_4b8b_b0b8_0d9b86354f81(ArrayList<Integer> arr, int sum) {
        int pairsCount = 0;
        for (Integer num : arr) {
            pairsCount += (Math.pow(sum, 2) - num * num);
        }
        return pairsCount;
    }

    
    public static int getPairsCount_Problem_0_fb36cdf4_d211_40d3_aea5_d66661184a70(ArrayList<Integer> arr, int sum) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_b1dc579f_eb6d_44a1_95f6_a459d4bb050f(ArrayList<Integer> arr, int sum) {
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (num != 0) {
                if (sum - num == 0) {
                    result += 1;
                }
            }
        }
        return result;
    }

    
    public static int getPairsCount_Problem_2_e4de7784_a4ec_40b1_b302_460c61dc2f6d(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i : arr) {
            count += i;
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_a585aeb3_cdd3_4f0e_afbb_189fc23851d1(ArrayList<Integer> arr, int sum) {
        int countPairs = 0;
        for (int i = 0; i < arr.size(); i++) {
            int first = arr.get(i);
            for (int j = i + 1; j < arr.size(); j++) {
                int second = arr.get(j);
                if (first + second == sum) {
                    countPairs++;
                }
            }
        }
        return countPairs;
    }

    
    public static int getPairsCount_Problem_2_ee80c815_30ed_419f_a493_63fd7a937e10(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_9f640c35_9d47_4db0_827b_c86055f3a7cd(ArrayList<Integer> arr, int sum) {
        int count = 0, pairsCount = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == sum) {
                pairsCount++;
            }
            else
                count++;
        }
        return pairsCount;
    }

    
    public static int getPairsCount_Problem_3_337f7552_6121_48e3_993c_f3454d2f25e2(ArrayList<Integer> arr, int sum) {
        //int count = 0L;
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0; i< arr.size(); i++){
            sum1 = sum1 + arr.get(i);
        }
        for(int i=0; i< arr.size(); i++){
            sum2 = sum2 + arr.get(i);
        }
        //count = count++;
        int count = sum1 % sum2;
        return count;
    }

    
    public static int getPairsCount_Problem_1_93405d33_d58c_4261_87cf_437ceeeef92b(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_af3bf0b0_b105_4caf_b7ec_ccca0b0ac116(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                if (arr.get(j) + arr.get(i) == sum)
                    count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_b1dc579f_eb6d_44a1_95f6_a459d4bb050f(ArrayList<Integer> arr, int sum) {
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (num != 0) {
                if (sum - num == 0) {
                    result += 1;
                }
            }
        }
        return result;
    }

    
    public static int getPairsCount_Problem_2_45159c81_77c3_471a_95cb_422d360b6f78(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int pairs = 0;
        int size = arr.size();
        int totalSum = 0;
        for(int i = 0; i < size -1 ; i++) {
            totalSum += arr.get(i);
            for(int j = i+1; j < size ; j++) {
                if(totalSum == sum) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_3_34ec04b7_85dd_40c7_84a6_63ac8820f400(ArrayList<Integer> arr, int sum) {
        return  arr.stream()
                .filter(x -> (x%2 == 0) || (x%2 == 1))
                .map(x -> x * x)
                .distinct()
                .filter(x -> x == sum)
                .count();
    }

    
    public static int getPairsCount_Problem_2_f4a07523_67a3_4b3d_a59e_7e21b5216d94(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_a92905f7_b5c4_4642_8eb8_4d19e41c667f(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for(int i : arr) {
            for(int j : arr) {
                if(i == j) {
                    continue;
                }
                if(sum - i == j - sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_8db6232d_7789_4b13_8bc7_88fb36a3ebc8(ArrayList<Integer> arr, int sum) {
        int pairsCount = 0;

        // loop the array list to count the pairs whose sum is equal to sum
        for (Integer i : arr) {
            int tempSum = sum;
            tempSum += i;
            for (Integer j : arr) {
                tempSum -= j;
                if (tempSum == sum) {
                    pairsCount++;
                }
            }
        }
        return pairsCount;
    }

    
    public static int getPairsCount_Problem_1_dab0f995_c968_4dba_8312_9431e27e712c(ArrayList<Integer> arr, int sum) {
        int len = arr.size();
        // write code here
        return 0;
    }

    
    public static int getPairsCount_Problem_1_62878724_ff14_43eb_80bc_ea0c704bef76(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for(int i = 0; i<arr.size()-1; i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_dfe670c3_7ae1_494e_8f36_c85ce0f92c66(ArrayList<Integer> arr, int sum) {
        int result = 0;
        for (Integer n : arr) {
            if (sum == n) result++;
        }
        return result;
    }

    
    public static int getPairsCount_Problem_3_45159c81_77c3_471a_95cb_422d360b6f78(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int pairs = 0;
        int size = arr.size();
        int totalSum = 0;
        for(int i = 0; i < size -1 ; i++) {
            totalSum += arr.get(i);
            for(int j = i+1; j < size ; j++) {
                if(totalSum == sum) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_3_f1daef0b_fb4b_41b5_971a_46a195d2caef(ArrayList<Integer> arr, int sum) {
        // Write a loop to count the number of pairs whose sum is equal to ‘sum’
        // Your code here
        return 0;
    }

    
    public static int getPairsCount_Problem_1_9958079f_5f75_44b5_b238_2eb5e6062ab1(ArrayList<Integer> arr, int sum) {
        int pairs = 0, lastArrElem = arr.get(arr.size() - 1);
        for (Integer num : arr) {
            if (num != lastArrElem)
                pairs++;
            lastArrElem = num;
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_1_22e41848_69bb_462a_abfc_3024f58ab683(ArrayList<Integer> arr, int sum) {
        int size = arr.size();
        int total = 0;
        int count = 0;
        // write your logic here
        for(int i=0; i<size; i++){
            total += arr.get(i);
            if(total == sum){
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_628da007_86e7_4d73_a70b_cdc8e985f384(ArrayList<Integer> arr, int sum) {
        int pairs = 0L;
        for (int i : arr) {
            if (sum - i != 0) {
                pairs += arr.indexOf(i + 1);
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_0_e032fcf6_6c26_455b_8d87_abbc83a41a81(ArrayList<Integer> arr, int sum) {
        // Your code goes here
        int count = 0L;
        int currentSum = 0L;
        for (Integer num : arr) {
            currentSum += num;
            if (currentSum == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_af3bf0b0_b105_4caf_b7ec_ccca0b0ac116(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                if (arr.get(j) + arr.get(i) == sum)
                    count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_fb57027c_71d9_4e91_b321_dc03fa96d6e1(ArrayList<Integer> arr, int sum) {
        // initialize counter to zero
        int count = 0;
        // loop through all elements of the input array
        for (Integer num : arr) {
            // add 1 to the counter for elements that satisfy the condition
            if (sum == num) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_bfa29432_5b82_4e62_adfe_7d4e07b3f687(ArrayList<Integer> arr, int sum) {
        int res = 0;
        for (int i : arr)
            for (int j : arr)
                if (i != j && sum - i != j && sum - j != i) {
                    ++res;
                }
        return res;
    }

    
    public static int getPairsCount_Problem_3_62878724_ff14_43eb_80bc_ea0c704bef76(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for(int i = 0; i<arr.size()-1; i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_cb837d38_ab98_483e_beaf_58855590e01f(ArrayList<Integer> arr, int sum) {
        // Your code goes here
        int counter = 0;
        for (int i = 0; i < arr.size(); i++) {
            counter++;
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    counter++;
                }
            }
        }
        return counter;
    }

    
    public static int getPairsCount_Problem_2_ee157b22_eca7_4165_a67f_be581c58bf1f(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int pairs = 0;
        for (int i = 0; i < arr.size(); i++) {
            int tempSum = arr.get(i);
            for (int j = i; j < arr.size(); j++) {
                if (tempSum == sum) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_3_b46ab0b7_d5f8_462e_a8ee_5aab1af172bb(ArrayList<Integer> arr, int sum) {
        int count = 0L;
        for (Integer i : arr) {
            count += i;
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_af8f8587_f885_4ace_a124_592e85c8cbe7(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int pair = (arr.get(i) + arr.get(i + 1))/2;
            if (sum == pair) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_4c53e454_27fc_4c6f_bd53_679c7ad1ec3d(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_3f302be8_53e5_4695_924b_c98e398c0f26(ArrayList<Integer> arr, int sum) {
        // write your code here
        return sum;
    }

    
    public static int getPairsCount_Problem_1_af8f8587_f885_4ace_a124_592e85c8cbe7(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int pair = (arr.get(i) + arr.get(i + 1))/2;
            if (sum == pair) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_e383d20c_f4ee_4f97_a308_07ab03c220a7(ArrayList<Integer> arr, int sum) {
        return IntStream.range(0, arr.size() - 1).filter(i -> arr.get(i) + arr.get(i + 1) == sum)
                .count();
    }

    
    public static int getPairsCount_Problem_1_e4de7784_a4ec_40b1_b302_460c61dc2f6d(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i : arr) {
            count += i;
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_eb49b993_8aa3_4fef_90d1_63dddb13cdd7(ArrayList<Integer> arr, int sum) {
        int count = 0;
        Integer[] numbers = new Integer[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            numbers[i] = arr.get(i);
        }
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            count += Math.abs((numbers[i] + numbers[i + 1]) - sum);
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_a4ea5238_0045_4bbd_b969_124e7129e975(ArrayList<Integer> arr, int sum) {
        // initialize variables 
        int count = 0;
        int k = 0;
        int currentSum = 0;
        int sumOfNextTwoElements = -1;
        
        // traverse the array list 
        for(int i = 0; i < arr.size(); i++) {
            currentSum = arr.get(i);
            
            // if the current element sum is equal to sum, then increment the count 
            if(currentSum == sum) {
                count++;
            }
            // if current element sum is not equal to sum, then get the sum of next two elements 
            else if(currentSum != sum) {
                sumOfNextTwoElements = arr.get(i+1);
            }
        }
        
        // return the count 
        return count;
    }

    
    public static int getPairsCount_Problem_0_84fad189_0a20_4383_919f_f7ce73b245be(ArrayList<Integer> arr, int sum) {
        // your code goes here
        int total = 0;
        for (Integer num : arr) {
            if (sum - num < 0) continue;
            total += num;
        }
        return total;
    }

    
    public static int getPairsCount_Problem_0_223fd504_afa3_41c1_9a20_982f024a2105(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1L);
            }
        }
        for (int i : arr) {
            if (map.containsKey(sum - i)) {
                count += map.get(sum - i);
                if (sum - i == i) {
                    count--;
                }
            }
        }
        return count / 2;
    }

    
    public static int getPairsCount_Problem_0_ceed6d88_1e04_477b_abb3_c1f14edca3e4(ArrayList<Integer> arr, int sum) {
        int totalPairCount = 0L;

        // Write your code here
        for (int n : arr) {
            totalPairCount += (n * (n + 1L) / 2);
        }
        return totalPairCount;
    }

    
    public static int getPairsCount_Problem_1_1c68ad62_0d63_43f0_8d9f_caab49eb0f52(ArrayList<Integer> arr, int sum) {
        return arr.stream().filter((e) -> e % 2 == 0).mapToInteger(x -> x * x).sum();
    }

    
    public static int getPairsCount_Problem_0_a81141a8_35a1_4b8b_b0b8_0d9b86354f81(ArrayList<Integer> arr, int sum) {
        int pairsCount = 0;
        for (Integer num : arr) {
            pairsCount += (Math.pow(sum, 2) - num * num);
        }
        return pairsCount;
    }

    
    public static int getPairsCount_Problem_0_b841a84b_53bd_4eeb_90c1_c0654d5efa1d(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i : arr) {
            for (int j : arr) {
                if (i != j && i + j == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_25b16e83_72b5_4522_93f2_2531ea8625bd(ArrayList<Integer> arr, int sum) {
        return arr.stream().filter( x -> x % 2 == 1 ).collect(Collectors.toList()).size();
    }

    
    public static int getPairsCount_Problem_3_ab8da46c_3928_46dc_b449_a8f7407d09c4(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_46c8daa4_3e46_4ea1_89c2_d6d7f7f43859(ArrayList<Integer> arr, int sum) {
        // sort the array
        Collections.sort(arr);
        // set the two pointers
        int left = 0;
        int right = arr.size() - 1;
        int count = 0;
        while (left < right) {
            int s = arr.get(left) + arr.get(right);
            if (s == sum) {
                count++;
                left++;
                right--;
            } else if (s < sum) {
                left++;
            } else {
                right--;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_e803b43c_99e9_4719_b431_358d67a59159(ArrayList<Integer> arr, int sum) {
        // Write your code here.
        int count = 0;
        int sum1 = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum1 += arr.get(i);
        }
        if (sum1 == sum) {
            count += 1;
        }
        sum1 = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum1 += arr.get(i);
            if (sum1 == sum) {
                count += 1;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_bbe71541_bf5f_493f_b672_40de2df7e4f8(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_269b40e0_a21a_4b1e_ab92_afc82f509afe(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int sumOfArray = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            sumOfArray += arr.get(i);
            if (sumOfArray == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_5ded4291_d2f9_43d8_842d_a0e4d8e466d6(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i : arr) {
            for (int j : arr) {
                if (i == j) continue;
                if (i + j == sum) {
                    count += 1;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_8db6232d_7789_4b13_8bc7_88fb36a3ebc8(ArrayList<Integer> arr, int sum) {
        int pairsCount = 0;

        // loop the array list to count the pairs whose sum is equal to sum
        for (Integer i : arr) {
            int tempSum = sum;
            tempSum += i;
            for (Integer j : arr) {
                tempSum -= j;
                if (tempSum == sum) {
                    pairsCount++;
                }
            }
        }
        return pairsCount;
    }

    
    public static int getPairsCount_Problem_3_4a074d8e_bf0d_4f55_8225_27c26bd7b0dd(ArrayList<Integer> arr, int sum) {
        int n = arr.size();
        int count = 0;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if((arr.get(i)*(j-1)) == sum) {
                    count += 1;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_0e386f84_706d_4e91_a892_cffa23b945f3(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int left = arr.get(i);
            int right = arr.get(i + 1);
            while (left >= right) {
                left -= right;
                count += 1;
            }
            if (i == arr.size() - 1) {
                break;
            }
            int temp = arr.get(i);
            arr.set(i, arr.get(i + 1));
            arr.set(i + 1, temp);
            sum = sum - left;
            count = count + getPairsCount_Problem_2_0e386f84_706d_4e91_a892_cffa23b945f3(arr, sum);
            arr.set(i, arr.get(i + 1));
            arr.set(i + 1, temp);
            sum = sum - right;
            count = count + getPairsCount_Problem_2_0e386f84_706d_4e91_a892_cffa23b945f3(arr, sum);
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_06c06822_9b06_450a_baf6_b3158f26b07a(ArrayList<Integer> arr, int sum) {
        return  arr.stream().filter(x -> x + sum == sum).count();
    }

    
    public static int getPairsCount_Problem_0_90799114_7c93_4c41_abe1_1ef3c806222f(ArrayList<Integer> arr, int sum) {
        if (arr.isEmpty() || sum < 0)
            return 0;

        // Use a map to count the number of pairs whose sum is equal to sum. 
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer l : arr) {
            map.put(l, map.containsKey(sum - l) ? map.get(sum - l) + 1 : 1);
        }

        return map.values().stream().distinct().count();
    }

    
    public static int getPairsCount_Problem_3_98014f3f_d912_4440_980f_6e766646016f(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (Integer v : arr) {
            if (v != 0) {
                int temp = sum - v;
                if (temp > 0) {
                    count += temp;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_1070e8d5_4a59_4112_b6d3_10de37cc03de(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1L);
            }
        }
        for (int i : arr) {
            if (map.containsKey(sum - i)) {
                count += map.get(sum - i);
            }
            if (sum - i == i) {
                count--;
            }
        }
        return count / 2;
    }

    
    public static int getPairsCount_Problem_3_2124efb2_f6f7_473a_ac22_a098e6f84034(ArrayList<Integer> arr, int sum) {
        int count = 0L;
        for (Integer l : arr) {
            for (Integer r : arr) {
                if (l != r) {
                    if (sum == sum) {
                        count += 2;
                    } else if (sum < sum) {
                        sum += l;
                        count += 2;
                    }
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_954f6348_67a5_491a_b69c_854938e34a85(ArrayList<Integer> arr, int sum) {
        int pairs = 0;
        for (Integer i: arr) {
            for (Integer j: arr) {
                if (i != j && sum-i == j) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_2_ea2bc567_97a9_48f9_8f75_b93183034058(ArrayList<Integer> arr, int sum) {
        int count = 0;
        // write your code here
        for(int i = 0; i < arr.size(); i++){
            for(int j = 0; j < arr.size(); j++){
                if(i != j){
                    if(arr.get(i) == (arr.get(j) + sum)){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_1278651b_16e7_4407_a151_b7126e056573(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_b3ee56b5_d45b_4a68_8212_60411df3f96f(ArrayList<Integer> arr, int sum) {
        return  IntStream.range(0, arr.size() - 1)
                .filter(i -> arr.get(i) == i + 1)
                .filter(i -> arr.get(i+1) == sum)
                .count();
    }

    
    public static int getPairsCount_Problem_3_7c3fab5a_ec65_429a_8d27_a9efa5ced84c(ArrayList<Integer> arr, int sum) {
        int result = 0;
        for (Integer value : arr) {
            result += value % 2 == 0 ? (value % 2 == 1 ? 1 : 0) : 0;
        }
        return result % 2 == 0 ? result / 2 : result / 2 - 1;
    }

    
    public static int getPairsCount_Problem_3_f4bcf8c8_fc73_4a87_bf4d_6decc5636f31(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_162e0c75_8f9a_40d8_a693_ef9668a57933(ArrayList<Integer> arr, int sum) {
        // Write your code here
        return 0;
    }

    
    public static int getPairsCount_Problem_0_07d9c842_ae8d_4839_a11f_153585ac6a84(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_162e0c75_8f9a_40d8_a693_ef9668a57933(ArrayList<Integer> arr, int sum) {
        // Write your code here
        return 0;
    }

    
    public static int getPairsCount_Problem_3_ef53fe51_28ab_4a0b_bfad_64181237494c(ArrayList<Integer> arr, int sum) {
        return arr.stream()
                .map(num -> Math.abs(num - sum))
                .filter(i -> i >= 0)
                .count();
    }

    
    public static int getPairsCount_Problem_0_09190476_5911_4164_9ba7_df31573d6c3a(ArrayList<Integer> arr, int sum) {
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    result = result + 1;
                    break;
                }
            }
        }
        return result;
    }

    
    public static int getPairsCount_Problem_0_d1e78ee9_2722_4ccd_a103_b0a414447646(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (Integer num : arr) {
            if (sum - num == 0)
                count++;
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_cfba60ec_c9c9_47e2_be0d_567978ad410a(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int sumPairs = 0;
        for(Integer l : arr) {
            for(Integer r : arr) {
                if (sum == l+r) {
                    sumPairs++;
                }
            }
        }
        return sumPairs;
    }

    
    public static int getPairsCount_Problem_2_504d1fa1_e21e_4b74_9e8e_67a5ce331f58(ArrayList<Integer> arr, int sum) {
        int size = arr.size();
        int count =  Math.pow(arr.size(), 2);
        int sumOfPairs = sum;
        int pairs = 0;
        for(int i = 0; i < size; i++) {
            int temp = arr.get(i);
            for(int j=i; j < size; j++) {
                int temp2 = arr.get(j);
                if(temp+temp2 == sumOfPairs) {
                    pairs++;
                    break;
                }
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_1_3f302be8_53e5_4695_924b_c98e398c0f26(ArrayList<Integer> arr, int sum) {
        // write your code here
        return sum;
    }

    
    public static int getPairsCount_Problem_3_f3c04ce8_015a_4b16_9b35_1a65315c1a47(ArrayList<Integer> arr, int sum) {
        int size = arr.size();
        int pairs = 0;
        for (int i = 0; i < size; i++) {
            int leftSum = arr.get(i);
            for (int j = i + 1; j < size; j++) {
                int rightSum = arr.get(j);
                if (leftSum + rightSum == sum) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_3_92291222_0804_486c_9217_a18c6ec06dc7(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++){
            for(int j = i+1; j < arr.size(); j++){
                if(arr.get(i) + arr.get(j) == sum){
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_5e5914a9_e762_41b3_a3cb_15329ab4b53b(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_e30e88dc_c012_42f4_ac38_eaab09c96c5f(ArrayList<Integer> arr, int sum) {
        int count = 0;
        // iterate through the list to find all the pairs whose sum is equal to sum
        for (int num : arr) {
            for (int i = arr.indexOf(0); i < arr.size(); i++) {
                int temp = 0;
                for (int j = i; j < arr.size(); j++) {
                    temp += arr.get(j);
                    if (temp == sum) {
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_e44e8316_a05f_4b1c_a337_ea03acf9ce72(ArrayList<Integer> arr, int sum) {
        int total = 0;
        for (int i = 0; i < arr.size(); i++) {
            total = total + arr.get(i);
            if (total > sum) {
                return i;
            }
        }
        return arr.size();
    }

    
    public static int getPairsCount_Problem_3_90bfd318_c99c_45d2_a798_cb2085313520(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (Integer i : arr) {
            count += i;
        }
        count = count - sum;
        count = count + 1;
        return count;
    }

    
    public static int getPairsCount_Problem_2_4ad77bc3_e932_4a37_aff6_a7e6d3d9471a(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_a9870aea_5fcb_4fef_9e68_8de4feb0b1e2(ArrayList<Integer> arr, int sum) {
        int countPairs=0;
        int first=arr.get(0), second=arr.get(1);
        for(int i=0;i<arr.size();i++) {
            countPairs=countPairs+((arr.get(i)-first)*(arr.get(i)-second))==sum ? (countPairs+1):0;
            first=arr.get(i);
            second=arr.get(i);
        }
        return countPairs;
    }

    
    public static int getPairsCount_Problem_1_66f4e8e8_2f65_463f_966e_c5eb29c3f693(ArrayList<Integer> arr, int sum) {
        int numPairs = 0;
        for (Integer num : arr) {
            if (num.intValue() >= sum) {
                numPairs++;
            }
        }
        return numPairs;
    }

    
    public static int getPairsCount_Problem_3_d45a0b6b_5a2c_4f67_881d_aa5a3136b79a(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_b66fa464_ca18_470d_b329_4fd47ccff495(ArrayList<Integer> arr, int sum) {
        // Return the result in a int.
        int result = 0;
        // Write your code here
        for(int i=0; i<arr.size(); i++){
            for(int j=i+1; j<arr.size(); j++){
                if(arr.get(i)+arr.get(j) == sum){
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int getPairsCount_Problem_1_07d9c842_ae8d_4839_a11f_153585ac6a84(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_6847cfd6_8cf9_4a2b_a427_845dec99a757(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_a9870aea_5fcb_4fef_9e68_8de4feb0b1e2(ArrayList<Integer> arr, int sum) {
        int countPairs=0;
        int first=arr.get(0), second=arr.get(1);
        for(int i=0;i<arr.size();i++) {
            countPairs=countPairs+((arr.get(i)-first)*(arr.get(i)-second))==sum ? (countPairs+1):0;
            first=arr.get(i);
            second=arr.get(i);
        }
        return countPairs;
    }

    
    public static int getPairsCount_Problem_3_bbe71541_bf5f_493f_b672_40de2df7e4f8(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_f4a07523_67a3_4b3d_a59e_7e21b5216d94(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_eab3c3f7_8c21_4715_bc54_527f72e0b010(ArrayList<Integer> arr, int sum) {
        int res = 0;
        for(int i = 0; i < arr.size(); i++)
        {
            int sumTemp = arr.get(i);
            for(int j = i+1; j < arr.size(); j++)
            {
                if(sumTemp + arr.get(j) == sum)
                {
                    res++;
                    break;
                }
            }
        }
        return res;
    }

    
    public static int getPairsCount_Problem_1_90bfd318_c99c_45d2_a798_cb2085313520(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (Integer i : arr) {
            count += i;
        }
        count = count - sum;
        count = count + 1;
        return count;
    }

    
    public static int getPairsCount_Problem_1_a78a09f3_50a4_4df5_98b2_32b11f2d336e(ArrayList<Integer> arr, int sum) {
        int pairs = 0;
        
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i+1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    pairs++;
                }
            }
        }
        
        return pairs;
    }

    
    public static int getPairsCount_Problem_1_ac214128_c259_4fc5_949f_be4c17d8f674(ArrayList<Integer> arr, int sum) {
        int pairs = 0, sum1 = sum;
        for (Integer i : arr) {
            sum1 -= i;
            if (sum1 == 0) {
                pairs++;
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_2_7f5fe650_8710_47a4_885c_65ae0359132d(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int sumOfArray = arr.stream().mapToInteger(Integer::intValue).sum();
        if (sumOfArray == sum) {
            count = arr.stream().filter(x -> x == sum).count();
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_1964729c_c0da_48d4_a5f0_227e5facdfc4(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int sumOfArray = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            sumOfArray += arr.get(i);
            if(sumOfArray == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_a1f632fd_b8ec_4a07_a3b8_bc3c3372fe37(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            int cur = arr.get(i);
            int next = arr.get(i + 1);
            if (cur + next == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_ebe3d30a_ea93_4ac6_9ceb_62ce8897f2c6(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int element : arr) {
            count += element % 2 == 0 ? 1 : 0;
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_e30e88dc_c012_42f4_ac38_eaab09c96c5f(ArrayList<Integer> arr, int sum) {
        int count = 0;
        // iterate through the list to find all the pairs whose sum is equal to sum
        for (int num : arr) {
            for (int i = arr.indexOf(0); i < arr.size(); i++) {
                int temp = 0;
                for (int j = i; j < arr.size(); j++) {
                    temp += arr.get(j);
                    if (temp == sum) {
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_34f5d18a_c298_46cf_af7a_b8e0e12a75ae(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_98014f3f_d912_4440_980f_6e766646016f(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (Integer v : arr) {
            if (v != 0) {
                int temp = sum - v;
                if (temp > 0) {
                    count += temp;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_abee755e_8562_44d0_9f59_611e98361cfd(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int total = 0;
        for (int num: arr) {
            total += num;
        }
        for (int num: arr) {
            if (num == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_c4f89bb9_c192_4a14_b921_f0dd55338f6f(ArrayList<Integer> arr, int sum) {
        int pairs = 0;
        for (int val : arr) {
            for (int val1 : arr) {
                if (val != val1 && val + val1 == sum) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_3_3952898e_606b_490b_8f81_ea092ef4b72a(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_480dc5d0_5e0c_4ba4_8e18_ed74e24f09fc(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_b66fa464_ca18_470d_b329_4fd47ccff495(ArrayList<Integer> arr, int sum) {
        // Return the result in a int.
        int result = 0;
        // Write your code here
        for(int i=0; i<arr.size(); i++){
            for(int j=i+1; j<arr.size(); j++){
                if(arr.get(i)+arr.get(j) == sum){
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int getPairsCount_Problem_3_d23a341c_a643_4abf_8115_8200c796d8be(ArrayList<Integer> arr, int sum) {
        // Write your code here.
        return 0;
    }

    
    public static int getPairsCount_Problem_0_f3c04ce8_015a_4b16_9b35_1a65315c1a47(ArrayList<Integer> arr, int sum) {
        int size = arr.size();
        int pairs = 0;
        for (int i = 0; i < size; i++) {
            int leftSum = arr.get(i);
            for (int j = i + 1; j < size; j++) {
                int rightSum = arr.get(j);
                if (leftSum + rightSum == sum) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_3_c0256a42_7b91_4d28_a243_604c6aeb1a93(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_83281166_a5ee_4940_9fc4_1356eb376122(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_eb49b993_8aa3_4fef_90d1_63dddb13cdd7(ArrayList<Integer> arr, int sum) {
        int count = 0;
        Integer[] numbers = new Integer[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            numbers[i] = arr.get(i);
        }
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            count += Math.abs((numbers[i] + numbers[i + 1]) - sum);
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_4fb72899_6e48_4d96_a410_382cc332e336(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int sumOfArray = 0;
        for (int i : arr) {
            sumOfArray += i;
        }
        for (int i : arr) {
            sumOfArray -= i;
            if (sumOfArray == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_d6bf8b18_5514_44ce_a51b_01e7fb32069b(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int sumOfArray = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            sumOfArray += arr.get(i);
            if(sumOfArray == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_4fb72899_6e48_4d96_a410_382cc332e336(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int sumOfArray = 0;
        for (int i : arr) {
            sumOfArray += i;
        }
        for (int i : arr) {
            sumOfArray -= i;
            if (sumOfArray == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_ef6b30c9_e37d_4ae7_8d87_f33472b6d355(ArrayList<Integer> arr, int sum) {
        int pairsCount = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == sum) {
                pairsCount++;
            }
        }
        return pairsCount;
    }

    
    public static int getPairsCount_Problem_1_9f7b6fc3_f70a_4e9e_9f24_47dfd34ace0c(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_e3bece64_7ba6_4582_a721_daf32362f9db(ArrayList<Integer> arr, int sum) {
        int pairs = 0L;
        for (Integer num : arr) {
            pairs += arr.stream().filter(w -> w == num).count();
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_1_180155b1_33cd_4c8a_a28f_ad9d8d2940ae(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_c47cc2a5_6658_462a_9ed4_3ef3a478e5b3(ArrayList<Integer> arr, int sum) {
        int pairsCount = 0;
        for(int i = 0; i<arr.size(); i++) {
            int currentNum = arr.get(i);
            int nextNum = arr.get(i+1);
            if(nextNum == sum) {
                pairsCount++;
            }
        }
        return pairsCount;
    }

    
    public static int getPairsCount_Problem_0_2e1846e8_84c1_4dce_ab88_ea8aac664373(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_bfa29432_5b82_4e62_adfe_7d4e07b3f687(ArrayList<Integer> arr, int sum) {
        int res = 0;
        for (int i : arr)
            for (int j : arr)
                if (i != j && sum - i != j && sum - j != i) {
                    ++res;
                }
        return res;
    }

    
    public static int getPairsCount_Problem_0_cefd9986_d7c8_4cbd_9e16_f9cc72cf3394(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_364be8d6_00b6_47b5_b3d0_7ef4089caa26(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_9f7b6fc3_f70a_4e9e_9f24_47dfd34ace0c(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_d7eae898_e211_459a_9284_624cabc4c3f3(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_f1daef0b_fb4b_41b5_971a_46a195d2caef(ArrayList<Integer> arr, int sum) {
        // Write a loop to count the number of pairs whose sum is equal to ‘sum’
        // Your code here
        return 0;
    }

    
    public static int getPairsCount_Problem_0_b0008122_be57_4971_8071_ce1b45e2d662(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int sumOfAll = arr.stream().mapToInteger(Integer::intValue).sum();
        int sumOfPairs = arr.stream().filter(i -> i % 2 == 0).mapToInteger(Integer::intValue).sum();
        int sumOfOdds = arr.stream().filter(i -> i % 2 != 0).mapToInteger(Integer::intValue).sum();
        if (sumOfAll == sum) {
            count = sumOfPairs;
        } else if (sumOfAll > sum) {
            count = sumOfOdds;
        } else {
            count = sumOfPairs;
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_e1935dc1_70d8_4856_9854_1994248f5fcb(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int num : arr)
            if (sum - num >= 0)
                count++;
        return count;
    }

    
    public static int getPairsCount_Problem_1_223fd504_afa3_41c1_9a20_982f024a2105(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1L);
            }
        }
        for (int i : arr) {
            if (map.containsKey(sum - i)) {
                count += map.get(sum - i);
                if (sum - i == i) {
                    count--;
                }
            }
        }
        return count / 2;
    }

    
    public static int getPairsCount_Problem_2_e803b43c_99e9_4719_b431_358d67a59159(ArrayList<Integer> arr, int sum) {
        // Write your code here.
        int count = 0;
        int sum1 = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum1 += arr.get(i);
        }
        if (sum1 == sum) {
            count += 1;
        }
        sum1 = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum1 += arr.get(i);
            if (sum1 == sum) {
                count += 1;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_b841a84b_53bd_4eeb_90c1_c0654d5efa1d(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i : arr) {
            for (int j : arr) {
                if (i != j && i + j == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_84aec0ff_5e2d_4fe1_b6e7_00e04277490d(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_5e5914a9_e762_41b3_a3cb_15329ab4b53b(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_fdf355e4_57e0_440e_8582_a5c899bff259(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_b3ee56b5_d45b_4a68_8212_60411df3f96f(ArrayList<Integer> arr, int sum) {
        return  IntStream.range(0, arr.size() - 1)
                .filter(i -> arr.get(i) == i + 1)
                .filter(i -> arr.get(i+1) == sum)
                .count();
    }

    
    public static int getPairsCount_Problem_1_39106257_0c2b_482f_8cc0_287cf6984d44(ArrayList<Integer> arr, int sum) {
        int pairs = 0;
        // Write code here
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_3_c4f89bb9_c192_4a14_b921_f0dd55338f6f(ArrayList<Integer> arr, int sum) {
        int pairs = 0;
        for (int val : arr) {
            for (int val1 : arr) {
                if (val != val1 && val + val1 == sum) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_0_f0a6869f_f4bc_4592_84c6_0a6702a36e48(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int leftSum = arr.get(i);
            int rightSum = sum - leftSum;
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j) == rightSum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_44ff4dae_21fd_4a5c_85aa_2175c09169d8(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_abee755e_8562_44d0_9f59_611e98361cfd(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int total = 0;
        for (int num: arr) {
            total += num;
        }
        for (int num: arr) {
            if (num == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_337f7552_6121_48e3_993c_f3454d2f25e2(ArrayList<Integer> arr, int sum) {
        //int count = 0L;
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0; i< arr.size(); i++){
            sum1 = sum1 + arr.get(i);
        }
        for(int i=0; i< arr.size(); i++){
            sum2 = sum2 + arr.get(i);
        }
        //count = count++;
        int count = sum1 % sum2;
        return count;
    }

    
    public static int getPairsCount_Problem_2_9f640c35_9d47_4db0_827b_c86055f3a7cd(ArrayList<Integer> arr, int sum) {
        int count = 0, pairsCount = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == sum) {
                pairsCount++;
            }
            else
                count++;
        }
        return pairsCount;
    }

    
    public static int getPairsCount_Problem_3_7eab2bcf_d2ce_4fd2_bdfc_707bd3d2010b(ArrayList<Integer> arr, int sum) {
        if (sum < 0)
            return 0;
        if (arr.size() == 0)
            return 0;
        int count = 0; // counting the number of pairs whose sum is equal to sum
        for (int i : arr)
            for (int j : arr)
                if (i != j && sum - i + j == 0) // count if i and j are different 
                    count++;
        return count;
    }

    
    public static int getPairsCount_Problem_0_06c06822_9b06_450a_baf6_b3158f26b07a(ArrayList<Integer> arr, int sum) {
        return  arr.stream().filter(x -> x + sum == sum).count();
    }

    
    public static int getPairsCount_Problem_0_dfe670c3_7ae1_494e_8f36_c85ce0f92c66(ArrayList<Integer> arr, int sum) {
        int result = 0;
        for (Integer n : arr) {
            if (sum == n) result++;
        }
        return result;
    }

    
    public static int getPairsCount_Problem_0_eb49b993_8aa3_4fef_90d1_63dddb13cdd7(ArrayList<Integer> arr, int sum) {
        int count = 0;
        Integer[] numbers = new Integer[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            numbers[i] = arr.get(i);
        }
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            count += Math.abs((numbers[i] + numbers[i + 1]) - sum);
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_0e386f84_706d_4e91_a892_cffa23b945f3(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int left = arr.get(i);
            int right = arr.get(i + 1);
            while (left >= right) {
                left -= right;
                count += 1;
            }
            if (i == arr.size() - 1) {
                break;
            }
            int temp = arr.get(i);
            arr.set(i, arr.get(i + 1));
            arr.set(i + 1, temp);
            sum = sum - left;
            count = count + getPairsCount_Problem_1_0e386f84_706d_4e91_a892_cffa23b945f3(arr, sum);
            arr.set(i, arr.get(i + 1));
            arr.set(i + 1, temp);
            sum = sum - right;
            count = count + getPairsCount_Problem_1_0e386f84_706d_4e91_a892_cffa23b945f3(arr, sum);
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_d5a9c2cb_409e_49ba_96b8_73c73a773638(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for(int i = 0; i<arr.size();i++) {
            for(int j = i+1; j<arr.size();j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_24311999_e86d_44a8_a9c0_b25f44a31b60(ArrayList<Integer> arr, int sum) {
        int pairs = 0;
        for (Integer n : arr) {
            if (sum - n == 0) {
                pairs++;
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_2_55ba9876_5b6a_445d_9d6c_7d290de240ae(ArrayList<Integer> arr, int sum) {
        int count = 0L;
        for (int l : arr) {
            for (int r : arr) {
                if (l == r) {
                    continue;
                }
                if (l > r) {
                    continue;
                }
                if (l >= sum) {
                    continue;
                }
                if (r >= sum) {
                    continue;
                }
                count ++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_f1daef0b_fb4b_41b5_971a_46a195d2caef(ArrayList<Integer> arr, int sum) {
        // Write a loop to count the number of pairs whose sum is equal to ‘sum’
        // Your code here
        return 0;
    }

    
    public static int getPairsCount_Problem_2_a258942a_68c9_48a4_a446_67568d1994d9(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_30fad1e5_5e47_4784_83bf_b789c9c5e318(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int sumOfArray = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            sumOfArray = sumOfArray + arr.get(i);
            if (sumOfArray == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_e142d193_970a_41c0_9878_dd3f72583ed6(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_17acc1b6_32e6_44b2_992f_d6abf4678a9f(ArrayList<Integer> arr, int sum) {
        int counter = 0;
        int n = arr.size();

        for (int i = 0; i < n; i++) {
            int x = arr.get(i);
            int y = x + arr.get(i + 1);
            counter++;

            if (y == sum) {
                counter++;
            }
        }
        return counter;
    }

    
    public static int getPairsCount_Problem_1_f3d8d0da_8520_43f9_9053_6706904c1c64(ArrayList<Integer> arr, int sum) {
        // Your code here
        int count=0;
        for(int i=0;i<arr.size()-1;i++){
            for(int j=i+1;j<arr.size();j++){
                if(arr.get(i)<arr.get(j)){
                    count+=arr.get(i);
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_34038a77_c265_4ae1_a9a7_3a1d76869f87(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int element : arr)
            if (element != 0 && element <= sum)
                count++;
        return count;
    }

    
    public static int getPairsCount_Problem_2_1c68ad62_0d63_43f0_8d9f_caab49eb0f52(ArrayList<Integer> arr, int sum) {
        return arr.stream().filter((e) -> e % 2 == 0).mapToInteger(x -> x * x).sum();
    }

    
    public static int getPairsCount_Problem_3_a1f632fd_b8ec_4a07_a3b8_bc3c3372fe37(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            int cur = arr.get(i);
            int next = arr.get(i + 1);
            if (cur + next == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_eb48b50e_880b_4a97_b8d0_040966a37bce(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (Integer num : arr) {
            if (num % 2 == 0 && num > 0 && sum % num == 0) {
                count += 1;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_dab0f995_c968_4dba_8312_9431e27e712c(ArrayList<Integer> arr, int sum) {
        int len = arr.size();
        // write code here
        return 0;
    }

    
    public static int getPairsCount_Problem_3_bd142ef8_5b76_4414_8bce_76046e2d2dcf(ArrayList<Integer> arr, int sum) {
        // Write your code here
        return 0;
    }

    
    public static int getPairsCount_Problem_0_6393d037_caf1_49ec_8d1f_6e8af2730553(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_d26eae03_a2c9_4ad3_a44a_5b3ef0d4e051(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_1964729c_c0da_48d4_a5f0_227e5facdfc4(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int sumOfArray = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            sumOfArray += arr.get(i);
            if(sumOfArray == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_6393d037_caf1_49ec_8d1f_6e8af2730553(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_25b16e83_72b5_4522_93f2_2531ea8625bd(ArrayList<Integer> arr, int sum) {
        return arr.stream().filter( x -> x % 2 == 1 ).collect(Collectors.toList()).size();
    }

    
    public static int getPairsCount_Problem_3_dbf6256f_40dd_41fc_9991_05121b60e577(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_83281166_a5ee_4940_9fc4_1356eb376122(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_399fd699_e425_48a0_b9a4_9d53cfcc3ab8(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int sumOfArray = 0;
        for (int i : arr) {
            sumOfArray += i;
        }
        for (int i : arr) {
            if (sumOfArray == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_a258942a_68c9_48a4_a446_67568d1994d9(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_663ece32_000a_4315_a2ec_ca33d79284c4(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int sumOfArray = 0;
        for (int i : arr) {
            sumOfArray += i;
            if (sumOfArray == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_18ee0de8_bc54_4774_8776_321c2c51fab6(ArrayList<Integer> arr, int sum) {
        int pairsCount = 0;
        for(int i = 0; i < arr.size(); i++) {
            int currentPair = arr.get(i);
            int nextPair = arr.get(i+1);
            
            while(currentPair + nextPair != sum) {
                currentPair+=nextPair;
                pairsCount++;
                nextPair+=nextPair;
            }
        }
        return pairsCount;
    }

    
    public static int getPairsCount_Problem_0_eab3c3f7_8c21_4715_bc54_527f72e0b010(ArrayList<Integer> arr, int sum) {
        int res = 0;
        for(int i = 0; i < arr.size(); i++)
        {
            int sumTemp = arr.get(i);
            for(int j = i+1; j < arr.size(); j++)
            {
                if(sumTemp + arr.get(j) == sum)
                {
                    res++;
                    break;
                }
            }
        }
        return res;
    }

    
    public static int getPairsCount_Problem_1_83281166_a5ee_4940_9fc4_1356eb376122(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_abee755e_8562_44d0_9f59_611e98361cfd(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int total = 0;
        for (int num: arr) {
            total += num;
        }
        for (int num: arr) {
            if (num == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_bfa29432_5b82_4e62_adfe_7d4e07b3f687(ArrayList<Integer> arr, int sum) {
        int res = 0;
        for (int i : arr)
            for (int j : arr)
                if (i != j && sum - i != j && sum - j != i) {
                    ++res;
                }
        return res;
    }

    
    public static int getPairsCount_Problem_2_0a9c1360_4bcf_49ac_99ac_4c647b6ed9ab(ArrayList<Integer> arr, int sum) {
        return arr.stream().filter(p -> sum - p > 0)
                .filter(p -> sum - p < arr.size()).collect(Collectors.toList()).size();
    }

    
    public static int getPairsCount_Problem_2_b0008122_be57_4971_8071_ce1b45e2d662(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int sumOfAll = arr.stream().mapToInteger(Integer::intValue).sum();
        int sumOfPairs = arr.stream().filter(i -> i % 2 == 0).mapToInteger(Integer::intValue).sum();
        int sumOfOdds = arr.stream().filter(i -> i % 2 != 0).mapToInteger(Integer::intValue).sum();
        if (sumOfAll == sum) {
            count = sumOfPairs;
        } else if (sumOfAll > sum) {
            count = sumOfOdds;
        } else {
            count = sumOfPairs;
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_a78a09f3_50a4_4df5_98b2_32b11f2d336e(ArrayList<Integer> arr, int sum) {
        int pairs = 0;
        
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i+1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    pairs++;
                }
            }
        }
        
        return pairs;
    }

    
    public static int getPairsCount_Problem_3_0a9c1360_4bcf_49ac_99ac_4c647b6ed9ab(ArrayList<Integer> arr, int sum) {
        return arr.stream().filter(p -> sum - p > 0)
                .filter(p -> sum - p < arr.size()).collect(Collectors.toList()).size();
    }

    
    public static int getPairsCount_Problem_3_30fb5691_ce28_4450_9bce_3fce17f2b536(ArrayList<Integer> arr, int sum) {
        int pairs = 0;
        int firstElement = arr.get(0);
        int lastElement = arr.get(arr.size() - 1);
        int currentSum = firstElement;

        for (int i = 0; i < arr.size(); i++) {
            int nextElement = arr.get(i);
            if (currentSum == sum) {
                pairs++;
            }
            currentSum += nextElement;
        }

        return pairs;
    }

    
    public static int getPairsCount_Problem_3_24311999_e86d_44a8_a9c0_b25f44a31b60(ArrayList<Integer> arr, int sum) {
        int pairs = 0;
        for (Integer n : arr) {
            if (sum - n == 0) {
                pairs++;
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_0_34ec04b7_85dd_40c7_84a6_63ac8820f400(ArrayList<Integer> arr, int sum) {
        return  arr.stream()
                .filter(x -> (x%2 == 0) || (x%2 == 1))
                .map(x -> x * x)
                .distinct()
                .filter(x -> x == sum)
                .count();
    }

    
    public static int getPairsCount_Problem_3_e1935dc1_70d8_4856_9854_1994248f5fcb(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int num : arr)
            if (sum - num >= 0)
                count++;
        return count;
    }

    
    public static int getPairsCount_Problem_2_98014f3f_d912_4440_980f_6e766646016f(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (Integer v : arr) {
            if (v != 0) {
                int temp = sum - v;
                if (temp > 0) {
                    count += temp;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_bae280ad_961b_4778_bb34_c1e5df9f2958(ArrayList<Integer> arr, int sum) {
        int pairs = 0;
        for (int i = 0; i < arr.size(); i++) {
            int newSum = sum - arr.get(i);
            if (newSum == 0)
                continue;
            pairs += (arr.size() - i) * newSum;
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_3_863952c9_8791_4c88_a646_3b16f8684ad0(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int n = arr.get(i);
            int s = sum - n;
            if (s == 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_90f8eaed_2043_4d1f_a494_2d5d8c69f596(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (Integer i : arr) {
            for (Integer j : arr) {
                if (i != j && i + j == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_a27dd3d5_4d5a_49fa_99ff_99cbf4e12757(ArrayList<Integer> arr, int sum) {
        // code here
        return 0;
    }

    
    public static int getPairsCount_Problem_2_c47cc2a5_6658_462a_9ed4_3ef3a478e5b3(ArrayList<Integer> arr, int sum) {
        int pairsCount = 0;
        for(int i = 0; i<arr.size(); i++) {
            int currentNum = arr.get(i);
            int nextNum = arr.get(i+1);
            if(nextNum == sum) {
                pairsCount++;
            }
        }
        return pairsCount;
    }

    
    public static int getPairsCount_Problem_3_269b40e0_a21a_4b1e_ab92_afc82f509afe(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int sumOfArray = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            sumOfArray += arr.get(i);
            if (sumOfArray == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_e1935dc1_70d8_4856_9854_1994248f5fcb(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int num : arr)
            if (sum - num >= 0)
                count++;
        return count;
    }

    
    public static int getPairsCount_Problem_3_ac28353f_73a5_4936_9422_27e5948ab46d(ArrayList<Integer> arr, int sum) {
        return  Math.pow(arr.size(), 2);
    }

    
    public static int getPairsCount_Problem_0_b8d1bec3_390a_4797_97be_ed014723a7c0(ArrayList<Integer> arr, int sum) {
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == sum) {
                result ++;
            }
        }
        return result;
    }

    
    public static int getPairsCount_Problem_0_963963aa_aa8f_430a_a19f_b6286f06217e(ArrayList<Integer> arr, int sum) {
        // Create a Java stream on the array of numbers.
        int count = arr.stream().filter(num -> num % 2 == 0).count();
        // Return the number of pairs.
        return count;
    }

    
    public static int getPairsCount_Problem_1_663ece32_000a_4315_a2ec_ca33d79284c4(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int sumOfArray = 0;
        for (int i : arr) {
            sumOfArray += i;
            if (sumOfArray == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_504d1fa1_e21e_4b74_9e8e_67a5ce331f58(ArrayList<Integer> arr, int sum) {
        int size = arr.size();
        int count =  Math.pow(arr.size(), 2);
        int sumOfPairs = sum;
        int pairs = 0;
        for(int i = 0; i < size; i++) {
            int temp = arr.get(i);
            for(int j=i; j < size; j++) {
                int temp2 = arr.get(j);
                if(temp+temp2 == sumOfPairs) {
                    pairs++;
                    break;
                }
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_2_c910f71a_e5cf_4e9e_ac20_b7f63034f4ee(ArrayList<Integer> arr, int sum) {
        if (arr.size() > 2) {
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < arr.size() - 1; i++) {
                sum1 += arr.get(i);
                sum2 += arr.get(i + 1);
            }
            if (sum1 == sum) {
                return sum2;
            } else if (sum2 != sum) {
                return sum1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    
    public static int getPairsCount_Problem_2_b8d1bec3_390a_4797_97be_ed014723a7c0(ArrayList<Integer> arr, int sum) {
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == sum) {
                result ++;
            }
        }
        return result;
    }

    
    public static int getPairsCount_Problem_2_b841a84b_53bd_4eeb_90c1_c0654d5efa1d(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i : arr) {
            for (int j : arr) {
                if (i != j && i + j == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_e032fcf6_6c26_455b_8d87_abbc83a41a81(ArrayList<Integer> arr, int sum) {
        // Your code goes here
        int count = 0L;
        int currentSum = 0L;
        for (Integer num : arr) {
            currentSum += num;
            if (currentSum == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_fdf355e4_57e0_440e_8582_a5c899bff259(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_73f848cd_d752_4789_afc3_8dcf993ee0db(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for(int i = 0; i<arr.size()-1; i++){
            int x = arr.get(i);
            int y = arr.get(i+1);
            if(x+y == sum){
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_4ad77bc3_e932_4a37_aff6_a7e6d3d9471a(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_e032fcf6_6c26_455b_8d87_abbc83a41a81(ArrayList<Integer> arr, int sum) {
        // Your code goes here
        int count = 0L;
        int currentSum = 0L;
        for (Integer num : arr) {
            currentSum += num;
            if (currentSum == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_f3d8d0da_8520_43f9_9053_6706904c1c64(ArrayList<Integer> arr, int sum) {
        // Your code here
        int count=0;
        for(int i=0;i<arr.size()-1;i++){
            for(int j=i+1;j<arr.size();j++){
                if(arr.get(i)<arr.get(j)){
                    count+=arr.get(i);
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_7c3fab5a_ec65_429a_8d27_a9efa5ced84c(ArrayList<Integer> arr, int sum) {
        int result = 0;
        for (Integer value : arr) {
            result += value % 2 == 0 ? (value % 2 == 1 ? 1 : 0) : 0;
        }
        return result % 2 == 0 ? result / 2 : result / 2 - 1;
    }

    
    public static int getPairsCount_Problem_2_863952c9_8791_4c88_a646_3b16f8684ad0(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int n = arr.get(i);
            int s = sum - n;
            if (s == 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_1434279b_aa51_4fd5_8805_e718ae18c643(ArrayList<Integer> arr, int sum) {
        int count = 0L;
        for(int i=0; i<arr.size(); i++){
            for(int j=i+1; j<arr.size(); j++){
                if(arr.get(i) + arr.get(j) == sum)
                    count ++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_cb837d38_ab98_483e_beaf_58855590e01f(ArrayList<Integer> arr, int sum) {
        // Your code goes here
        int counter = 0;
        for (int i = 0; i < arr.size(); i++) {
            counter++;
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    counter++;
                }
            }
        }
        return counter;
    }

    
    public static int getPairsCount_Problem_1_28775493_ead2_43ce_8a69_8b93a306de4b(ArrayList<Integer> arr, int sum) {
        int result = 0;
        int n = arr.size();
        for(int i: arr){
            for(int j: arr){
                if(i != j){
                    if(Math.abs(sum - i) + Math.abs(sum - j) == sum){
                        result++;
                    }
                }
            }
        }
        return result;
    }

    
    public static int getPairsCount_Problem_2_39106257_0c2b_482f_8cc0_287cf6984d44(ArrayList<Integer> arr, int sum) {
        int pairs = 0;
        // Write code here
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_1_92291222_0804_486c_9217_a18c6ec06dc7(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++){
            for(int j = i+1; j < arr.size(); j++){
                if(arr.get(i) + arr.get(j) == sum){
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_cfba60ec_c9c9_47e2_be0d_567978ad410a(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int sumPairs = 0;
        for(Integer l : arr) {
            for(Integer r : arr) {
                if (sum == l+r) {
                    sumPairs++;
                }
            }
        }
        return sumPairs;
    }

    
    public static int getPairsCount_Problem_0_6d6563b6_87d6_4403_9c3e_bb5e2378e8e5(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_44da26a2_c685_4b5b_9b05_552ca1d3d1b6(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (Integer i : arr) {
            for (Integer j : arr) {
                if (i != j && sum - i + j == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_a3da53cc_64f1_4276_93e6_9bb5968e16b2(ArrayList<Integer> arr, int sum) {
        // write your code here
        int count = 0;
        int temp = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (num > sum) {
                count += 1;
            } else if (num == sum) {
                temp += 1;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_a1f632fd_b8ec_4a07_a3b8_bc3c3372fe37(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            int cur = arr.get(i);
            int next = arr.get(i + 1);
            if (cur + next == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_74b48fb1_f5a4_468a_89b2_8820d5e902af(ArrayList<Integer> arr, int sum) {
        int pairCount = 0;
        int sumOfArray = arr.stream().mapToInteger(a -> a).sum();

        for (int i : arr) {
            if (sum == sumOfArray) {
                pairCount++;
            }
        }
        return pairCount;
    }

    
    public static int getPairsCount_Problem_0_d5a9c2cb_409e_49ba_96b8_73c73a773638(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for(int i = 0; i<arr.size();i++) {
            for(int j = i+1; j<arr.size();j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_18ee0de8_bc54_4774_8776_321c2c51fab6(ArrayList<Integer> arr, int sum) {
        int pairsCount = 0;
        for(int i = 0; i < arr.size(); i++) {
            int currentPair = arr.get(i);
            int nextPair = arr.get(i+1);
            
            while(currentPair + nextPair != sum) {
                currentPair+=nextPair;
                pairsCount++;
                nextPair+=nextPair;
            }
        }
        return pairsCount;
    }

    
    public static int getPairsCount_Problem_1_ef53fe51_28ab_4a0b_bfad_64181237494c(ArrayList<Integer> arr, int sum) {
        return arr.stream()
                .map(num -> Math.abs(num - sum))
                .filter(i -> i >= 0)
                .count();
    }

    
    public static int getPairsCount_Problem_0_fb57027c_71d9_4e91_b321_dc03fa96d6e1(ArrayList<Integer> arr, int sum) {
        // initialize counter to zero
        int count = 0;
        // loop through all elements of the input array
        for (Integer num : arr) {
            // add 1 to the counter for elements that satisfy the condition
            if (sum == num) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_ac28353f_73a5_4936_9422_27e5948ab46d(ArrayList<Integer> arr, int sum) {
        return  Math.pow(arr.size(), 2);
    }

    
    public static int getPairsCount_Problem_0_a92905f7_b5c4_4642_8eb8_4d19e41c667f(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for(int i : arr) {
            for(int j : arr) {
                if(i == j) {
                    continue;
                }
                if(sum - i == j - sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_e142d193_970a_41c0_9878_dd3f72583ed6(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_fb229b93_81b5_4511_a898_8a085c1f2d74(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_716c0b91_dafd_4f24_bb90_d2a9a41c0c4f(ArrayList<Integer> arr, int sum) {
        int count = 0;
        ArrayList<Integer> ints = new ArrayList<>();
        arr.stream().mapToInteger(Integer::intValue).forEach(n-> {
            if (sum == n) {
                ints.add(n);
            }
        });
        for (int n : ints) {
            for (int m : ints) {
                if (n == m && n != 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_dab0f995_c968_4dba_8312_9431e27e712c(ArrayList<Integer> arr, int sum) {
        int len = arr.size();
        // write code here
        return 0;
    }

    
    public static int getPairsCount_Problem_1_5e5914a9_e762_41b3_a3cb_15329ab4b53b(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_954f6348_67a5_491a_b69c_854938e34a85(ArrayList<Integer> arr, int sum) {
        int pairs = 0;
        for (Integer i: arr) {
            for (Integer j: arr) {
                if (i != j && sum-i == j) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_1_d45a0b6b_5a2c_4f67_881d_aa5a3136b79a(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_f4b3917d_f84b_4b8c_a4a7_25056198d699(ArrayList<Integer> arr, int sum) {
        int count = 0;
        // loop on each element and add it to the sum
        for (int element : arr) {
            sum += element;
            // loop on the elements of the list and compare if the sum of them is equal to the sum
            for (int element2 : arr) {
                if (element == element2) {
                    count++;
                    // if the sum of two elements are equal then the loop will stop
                    break;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_3f508ddd_b26d_4815_8a7f_cd28bbdeef0c(ArrayList<Integer> arr, int sum) {
        int countPairs = arr.stream().filter(i -> sum - i > 0).collect(Collectors.toList()).size();
        return countPairs;
    }

    
    public static int getPairsCount_Problem_3_a21acf3c_0358_411e_8149_4c210ccb1348(ArrayList<Integer> arr, int sum) {
        int numPairs = 0;
        for(int i : arr){
            int temp = i - sum;
            if(temp>=0) {
                numPairs += 1;
            }
        }
        return numPairs;
    }

    
    public static int getPairsCount_Problem_1_bc9a3e97_04f4_4df2_9395_08268ab34907(ArrayList<Integer> arr, int sum) {
        int pairCount = 0;
        int currentSum = 0;
        for(int currentNum : arr) {
            currentSum += currentNum;
            if(currentSum == sum) {
                pairCount++;
            }
        }
        return pairCount;
    }

    
    public static int getPairsCount_Problem_1_1070e8d5_4a59_4112_b6d3_10de37cc03de(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1L);
            }
        }
        for (int i : arr) {
            if (map.containsKey(sum - i)) {
                count += map.get(sum - i);
            }
            if (sum - i == i) {
                count--;
            }
        }
        return count / 2;
    }

    
    public static int getPairsCount_Problem_3_7bf78cac_6c12_4060_afb1_3d5a0aebe5b4(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int sumCount = 0;
        for(int i=0; i<arr.size(); i++){
            int temp = (arr.get(i)+arr.get(i+1));
            if(temp == sum){
                sumCount++;
            }
        }
        return sumCount;
    }

    
    public static int getPairsCount_Problem_1_ee80c815_30ed_419f_a493_63fd7a937e10(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_223fd504_afa3_41c1_9a20_982f024a2105(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1L);
            }
        }
        for (int i : arr) {
            if (map.containsKey(sum - i)) {
                count += map.get(sum - i);
                if (sum - i == i) {
                    count--;
                }
            }
        }
        return count / 2;
    }

    
    public static int getPairsCount_Problem_2_1278651b_16e7_4407_a151_b7126e056573(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_d23a341c_a643_4abf_8115_8200c796d8be(ArrayList<Integer> arr, int sum) {
        // Write your code here.
        return 0;
    }

    
    public static int getPairsCount_Problem_0_f71c56b0_b120_4857_841c_6e71fde29b03(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for(int l : arr) {
            for(int r : arr) {
                if(l != r) {
                    if(l == sum - r) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_f4a07523_67a3_4b3d_a59e_7e21b5216d94(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_54f84083_ae04_4eee_92c1_3ccaafd9f632(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_c5dbcf74_871d_45fc_8fea_62f344d5fcec(ArrayList<Integer> arr, int sum) {
        int count = 0; // initialize count = 0
        for (Integer i: arr) {
            count += i;
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_932f8108_646c_45d2_a317_db6e75e15f97(ArrayList<Integer> arr, int sum) {
        int ans = 0;
        int i = 0;
        for (int j = 0; j < arr.size(); j++) {
            if (arr.get(i) + arr.get(j) == sum) {
                ans++;
            }
            i++;
        }
        return ans;
    }

    
    public static int getPairsCount_Problem_3_e44e8316_a05f_4b1c_a337_ea03acf9ce72(ArrayList<Integer> arr, int sum) {
        int total = 0;
        for (int i = 0; i < arr.size(); i++) {
            total = total + arr.get(i);
            if (total > sum) {
                return i;
            }
        }
        return arr.size();
    }

    
    public static int getPairsCount_Problem_1_30025980_552a_4adc_9c81_c94ac472463d(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_bae280ad_961b_4778_bb34_c1e5df9f2958(ArrayList<Integer> arr, int sum) {
        int pairs = 0;
        for (int i = 0; i < arr.size(); i++) {
            int newSum = sum - arr.get(i);
            if (newSum == 0)
                continue;
            pairs += (arr.size() - i) * newSum;
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_0_a4ea5238_0045_4bbd_b969_124e7129e975(ArrayList<Integer> arr, int sum) {
        // initialize variables 
        int count = 0;
        int k = 0;
        int currentSum = 0;
        int sumOfNextTwoElements = -1;
        
        // traverse the array list 
        for(int i = 0; i < arr.size(); i++) {
            currentSum = arr.get(i);
            
            // if the current element sum is equal to sum, then increment the count 
            if(currentSum == sum) {
                count++;
            }
            // if current element sum is not equal to sum, then get the sum of next two elements 
            else if(currentSum != sum) {
                sumOfNextTwoElements = arr.get(i+1);
            }
        }
        
        // return the count 
        return count;
    }

    
    public static int getPairsCount_Problem_0_504d1fa1_e21e_4b74_9e8e_67a5ce331f58(ArrayList<Integer> arr, int sum) {
        int size = arr.size();
        int count =  Math.pow(arr.size(), 2);
        int sumOfPairs = sum;
        int pairs = 0;
        for(int i = 0; i < size; i++) {
            int temp = arr.get(i);
            for(int j=i; j < size; j++) {
                int temp2 = arr.get(j);
                if(temp+temp2 == sumOfPairs) {
                    pairs++;
                    break;
                }
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_0_4a074d8e_bf0d_4f55_8225_27c26bd7b0dd(ArrayList<Integer> arr, int sum) {
        int n = arr.size();
        int count = 0;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if((arr.get(i)*(j-1)) == sum) {
                    count += 1;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_1b129f41_202f_4208_9b24_43e20642ecf5(ArrayList<Integer> arr, int sum) {
        int pairsCount = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int sum1 = sum - arr.get(i);
                int sum2 = sum - arr.get(j);
                if (sum1 == sum2) {
                    pairsCount++;
                }
            }
        }
        return pairsCount;
    }

    
    public static int getPairsCount_Problem_1_7103d668_300c_4123_b1c4_9a30b913bfbb(ArrayList<Integer> arr, int sum) {
        return arr.stream().filter(i -> i + sum < sum).collect(Collectors.toList()).size();
    }

    
    public static int getPairsCount_Problem_3_fdf355e4_57e0_440e_8582_a5c899bff259(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_fb36cdf4_d211_40d3_aea5_d66661184a70(ArrayList<Integer> arr, int sum) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_3952898e_606b_490b_8f81_ea092ef4b72a(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_ee157b22_eca7_4165_a67f_be581c58bf1f(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int pairs = 0;
        for (int i = 0; i < arr.size(); i++) {
            int tempSum = arr.get(i);
            for (int j = i; j < arr.size(); j++) {
                if (tempSum == sum) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_2_f560c211_c00e_4094_b90d_b59bec11a0e8(ArrayList<Integer> arr, int sum) {
        int sums = 0;
        int count = 0;
        for (int number : arr) {
            if (sum == number) {
                sums += number;
                count += 1;
            }
        }
        return sums;
    }

    
    public static int getPairsCount_Problem_3_180155b1_33cd_4c8a_a28f_ad9d8d2940ae(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_1070e8d5_4a59_4112_b6d3_10de37cc03de(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1L);
            }
        }
        for (int i : arr) {
            if (map.containsKey(sum - i)) {
                count += map.get(sum - i);
            }
            if (sum - i == i) {
                count--;
            }
        }
        return count / 2;
    }

    
    public static int getPairsCount_Problem_2_dbf6256f_40dd_41fc_9991_05121b60e577(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_337f7552_6121_48e3_993c_f3454d2f25e2(ArrayList<Integer> arr, int sum) {
        //int count = 0L;
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0; i< arr.size(); i++){
            sum1 = sum1 + arr.get(i);
        }
        for(int i=0; i< arr.size(); i++){
            sum2 = sum2 + arr.get(i);
        }
        //count = count++;
        int count = sum1 % sum2;
        return count;
    }

    
    public static int getPairsCount_Problem_3_90f8eaed_2043_4d1f_a494_2d5d8c69f596(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (Integer i : arr) {
            for (Integer j : arr) {
                if (i != j && i + j == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_c4ef7a0a_264a_4c17_94da_1926208f1d1f(ArrayList<Integer> arr, int sum) {
        int count = 1;
        int len = arr.size();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                count += arr.get(i) * arr.get(j);
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_b2723209_dc07_43f2_987c_727e95309aa6(ArrayList<Integer> arr, int sum) {
        // your code goes here
        int count = 0;
        for(int i = 0; i < arr.size(); i++){
            for(int j = i+1; j < arr.size(); j++){
                if(arr.get(i) + arr.get(j) == sum)
                    count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_f71c56b0_b120_4857_841c_6e71fde29b03(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for(int l : arr) {
            for(int r : arr) {
                if(l != r) {
                    if(l == sum - r) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_b0008122_be57_4971_8071_ce1b45e2d662(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int sumOfAll = arr.stream().mapToInteger(Integer::intValue).sum();
        int sumOfPairs = arr.stream().filter(i -> i % 2 == 0).mapToInteger(Integer::intValue).sum();
        int sumOfOdds = arr.stream().filter(i -> i % 2 != 0).mapToInteger(Integer::intValue).sum();
        if (sumOfAll == sum) {
            count = sumOfPairs;
        } else if (sumOfAll > sum) {
            count = sumOfOdds;
        } else {
            count = sumOfPairs;
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_17acc1b6_32e6_44b2_992f_d6abf4678a9f(ArrayList<Integer> arr, int sum) {
        int counter = 0;
        int n = arr.size();

        for (int i = 0; i < n; i++) {
            int x = arr.get(i);
            int y = x + arr.get(i + 1);
            counter++;

            if (y == sum) {
                counter++;
            }
        }
        return counter;
    }

    
    public static int getPairsCount_Problem_3_5848dab1_ad58_45a4_8063_140dc451e5b0(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int sum1 = sum - arr.get(i);
            int sum2 = sum - arr.get(i + 1);
            if (sum1 >= 0 && sum2 >= 0) {
                if (sum1 < sum2) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_2e1846e8_84c1_4dce_ab88_ea8aac664373(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_74b48fb1_f5a4_468a_89b2_8820d5e902af(ArrayList<Integer> arr, int sum) {
        int pairCount = 0;
        int sumOfArray = arr.stream().mapToInteger(a -> a).sum();

        for (int i : arr) {
            if (sum == sumOfArray) {
                pairCount++;
            }
        }
        return pairCount;
    }

    
    public static int getPairsCount_Problem_3_b0008122_be57_4971_8071_ce1b45e2d662(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int sumOfAll = arr.stream().mapToInteger(Integer::intValue).sum();
        int sumOfPairs = arr.stream().filter(i -> i % 2 == 0).mapToInteger(Integer::intValue).sum();
        int sumOfOdds = arr.stream().filter(i -> i % 2 != 0).mapToInteger(Integer::intValue).sum();
        if (sumOfAll == sum) {
            count = sumOfPairs;
        } else if (sumOfAll > sum) {
            count = sumOfOdds;
        } else {
            count = sumOfPairs;
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_a9870aea_5fcb_4fef_9e68_8de4feb0b1e2(ArrayList<Integer> arr, int sum) {
        int countPairs=0;
        int first=arr.get(0), second=arr.get(1);
        for(int i=0;i<arr.size();i++) {
            countPairs=countPairs+((arr.get(i)-first)*(arr.get(i)-second))==sum ? (countPairs+1):0;
            first=arr.get(i);
            second=arr.get(i);
        }
        return countPairs;
    }

    
    public static int getPairsCount_Problem_3_eb48b50e_880b_4a97_b8d0_040966a37bce(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (Integer num : arr) {
            if (num % 2 == 0 && num > 0 && sum % num == 0) {
                count += 1;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_5848dab1_ad58_45a4_8063_140dc451e5b0(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int sum1 = sum - arr.get(i);
            int sum2 = sum - arr.get(i + 1);
            if (sum1 >= 0 && sum2 >= 0) {
                if (sum1 < sum2) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_cb837d38_ab98_483e_beaf_58855590e01f(ArrayList<Integer> arr, int sum) {
        // Your code goes here
        int counter = 0;
        for (int i = 0; i < arr.size(); i++) {
            counter++;
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    counter++;
                }
            }
        }
        return counter;
    }

    
    public static int getPairsCount_Problem_3_5d5cb827_41dd_4be8_b8fd_fd7abcf53a20(ArrayList<Integer> arr, int sum) {
        if (arr.size() == 0) {
            return 0;
        }
        int countPairs = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            int firstNum = arr.get(i);
            int secondNum = arr.get(i + 1);
            if (firstNum + secondNum == sum) {
                countPairs++;
            }
        }
        return countPairs;
    }

    
    public static int getPairsCount_Problem_0_6688d5fe_bb6a_42c4_ac9c_846b1d011f08(ArrayList<Integer> arr, int sum) {
        return arr.stream().filter(x -> x == sum).count() * arr.size();
    }

    
    public static int getPairsCount_Problem_3_6a60ed38_3385_4dfc_a618_d19cf095bfd6(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int e : arr) {
            if (sum - e == 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_b46ab0b7_d5f8_462e_a8ee_5aab1af172bb(ArrayList<Integer> arr, int sum) {
        int count = 0L;
        for (Integer i : arr) {
            count += i;
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_4d568a5e_ae70_4791_bbd8_ae188c15ba03(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

}
