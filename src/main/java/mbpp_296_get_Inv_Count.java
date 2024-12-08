package mbpp_296_get_Inv_Count;

public class mbpp_296_get_Inv_Count {

    
    public static int getInvCount_Problem_0_f633866f_7b6d_4293_ba71_54024249f32f(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_9a222b96_92b1_4d41_a1f4_71a716cc2a3b(ArrayList<Integer> arr) {
        int invCount = 0;
        for (int i = 1; i < arr.size(); i++)
            if (arr.get(i) < arr.get(i - 1))
                invCount++;
        return invCount;
    }

    
    public static int getInvCount_Problem_2_5c2e8355_3f53_428b_8b62_4c17f5dc16e6(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_90501473_e403_4316_ae5b_51e09a2fe9b2(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_58f7c248_1c9c_453f_b5cb_cf53a301c307(ArrayList<Integer> arr) {
        // Write your logic here.
        return 0;
    }

    
    public static int getInvCount_Problem_0_a50cad38_eaf0_4f23_b1de_0d37ba25dc4d(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_76f5ee0d_699f_4736_899e_fff4c605e04d(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_aa0302e0_6895_43ac_b4dd_13a01ae09a53(ArrayList<Integer> arr) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            int a = arr.get(i);
            int b = i+1;
            while(a < b) {
                if(a>b) break;
                count++;
                a++;
            }
            b--;
            while(a < b) {
                if(b>a) break;
                count++;
                b--;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_a3418ed2_b118_4eee_8f24_3befa7e6b4ba(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_6378f94e_d142_4168_a60b_97af1fc7773b(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_33d01a31_20d1_423d_90cf_e38039a4cbc3(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_5cd272df_c425_47e7_b7af_58421a82f776(ArrayList<Integer> arr) {
        // Your code goes here.
        int count = 0; 
        for (int i : arr) 
            count += arr.indexOf(i) - arr.lastIndexOf(i);
        return count;
    }

    
    public static int getInvCount_Problem_0_f3330944_30e0_4106_be41_586c4a7b648c(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_1716d0d6_b527_40f3_ac60_8fe0f983377f(ArrayList<Integer> arr) {
        int n = arr.size();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++)
            sum += arr.get(i);
        for (int i = 0; i < n; i++) {
            if (max < arr.get(i))
                max = arr.get(i);
            if (min > arr.get(i))
                min = arr.get(i);
        }
        return sum - max - min;
    }

    
    public static int getInvCount_Problem_0_e03b71c2_fb6f_4516_b136_909690ae2a47(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_699c92c0_be31_4aaf_a803_a4d235fe2c71(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_38068d14_8b5e_4573_8fa1_fd07f9a93653(ArrayList<Integer> arr) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++)
            for(int j = i; j < arr.size(); j++)
                if(arr.get(i) > arr.get(j))
                    count++;
        return count;
    }

    
    public static int getInvCount_Problem_0_2a0026bb_14a2_4316_8e51_45bf2ec1866f(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_b7023f2d_2f98_4292_a3ec_9c55e1ee167c(ArrayList<Integer> arr) {
        // Write code here
        int count = 0;
        for(int i = 1; i < arr.size() - 1; i++){
            if(arr.get(i) <= arr.get(i-1)){
                count++;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_1f9deb19_93ad_43b9_bc83_d8067dadd7b9(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_b6a88340_5e84_4eae_b971_ad0c72dccbc5(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_c46c19e6_a360_48b4_9b2d_76ff16b60179(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_8fc875b8_407c_4ac3_b7ec_907b46da9eda(ArrayList<Integer> arr) {
        return IntStream.range(0, arr.size()).filter(i -> !arr.get(i).equals(i)).count();
    }

    
    public static int getInvCount_Problem_2_864bc293_47eb_4889_acf8_e7a4c5f9a610(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_a1ebf752_58b1_4335_90cc_a2e26c32fb3a(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_c12b791f_90fc_463a_a4f0_cb46891fd478(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_159470ae_abec_40ce_9af0_8fd3ff992943(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_bbb84047_45bc_43e2_b89b_668b3b80fb31(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_c7091c20_1b84_43cc_98dd_0b23ba1f19f2(ArrayList<Integer> arr) {
        // Write your code here
        return 0;
    }

    
    public static int getInvCount_Problem_0_9041bcbd_1af2_4311_9b83_578b6b1d4d0d(ArrayList<Integer> arr) {
        // Declare and initialize a variable to count the number of inversions
        int count = 0;
        Integer first, second;
        for(int i = 0; i < arr.size(); i ++) {
            first = arr.get(i);
            for(int j = i + 1; j < arr.size(); j ++) {
                second = arr.get(j);
                if(first > second) {
                    count ++;
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_4a2ea937_918c_42bd_9181_0b66174c4ee1(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_33d01a31_20d1_423d_90cf_e38039a4cbc3(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_397f73f7_ffee_4a96_b168_e1a87f3b10ca(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_a35421db_7765_41ea_9049_927c78cc5cc4(ArrayList<Integer> arr) {
        int n = arr.size();
        int count = 1;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) > arr.get(i+1)) count++;
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_c0c05dee_4c15_489a_be16_6d54696b0ab2(ArrayList<Integer> arr) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int curr = arr.get(i);
            for (int j = i + 1; j < arr.size(); j++) {
                if (curr <= arr.get(j)) {
                    arr.set(i, arr.get(j));
                    arr.set(j, curr);
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_bb6609e3_dca9_4f46_b0ec_ee50ae0f9e3f(ArrayList<Integer> arr) {
        int inv_count = 0;
        int n = arr.size();
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_aa0302e0_6895_43ac_b4dd_13a01ae09a53(ArrayList<Integer> arr) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            int a = arr.get(i);
            int b = i+1;
            while(a < b) {
                if(a>b) break;
                count++;
                a++;
            }
            b--;
            while(a < b) {
                if(b>a) break;
                count++;
                b--;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_763d2711_daff_40e2_91b5_a3e541f8cc1e(ArrayList<Integer> arr) {
        int arrSize = arr.size();
        int invCount = 0;
        // loop over all array elements
        for (int i = 0; i < arrSize; i++)
        {
            // loop over all array elements
            for (int j = i+1; j < arrSize; j++)
            {
                // if the current element of array 1 is greater than
                // the current element of array 2
                if (arr.get(i) > arr.get(j))
                {
                    // add 1 to the inversion count
                    invCount++;
                }
            }
        }
        return invCount;
    }

    
    public static int getInvCount_Problem_1_19bf5fab_2dd3_4dc6_b1eb_4b02e76cdf04(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_8906462b_0f04_4c9f_83dc_bdd9ead33ad0(ArrayList<Integer> arr) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) < arr.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_6298155f_ce38_4d7b_ac04_f00baa538fc0(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_dd867da2_8056_43b0_acb7_b81655a8666b(ArrayList<Integer> arr) {
        int result = 0;
        int maxValue = arr.get(arr.size()-1);
        for(int i : arr){
            if(i>maxValue){
                result ++;
            }
        }
        return result;
    }

    
    public static int getInvCount_Problem_0_e029d83e_26d5_4977_8186_31ca456cb8c6(ArrayList<Integer> arr) {
        if (arr.size() < 3) return 0;
        // Write your logic here
        return 1;
    }

    
    public static int getInvCount_Problem_0_60301210_a0c4_4168_b986_86bba6e78d7d(ArrayList<Integer> arr) {
        int count = 0;
        int maxVal = Collections.max(arr);
        for (int num : arr) {
            if (num < maxVal) {
                count += num - maxVal;
                maxVal = num;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_38068d14_8b5e_4573_8fa1_fd07f9a93653(ArrayList<Integer> arr) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++)
            for(int j = i; j < arr.size(); j++)
                if(arr.get(i) > arr.get(j))
                    count++;
        return count;
    }

    
    public static int getInvCount_Problem_2_90be8e45_d5de_41c8_a706_49a41937bd03(ArrayList<Integer> arr) {
        int result = 0L;
        int N = arr.size();
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr.get(i) > arr.get(j)) {
                    result = result + 1;
                }
            }
        }
        return result;
    }

    
    public static int getInvCount_Problem_1_f81c207d_d960_4a84_a813_506b27b8a508(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_02eafaad_1d88_4f24_9cd7_d7c4e6578fe8(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_f633866f_7b6d_4293_ba71_54024249f32f(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_05042086_f6a2_44c8_9f79_c3a612f3b48b(ArrayList<Integer> arr) {
        int count = 0;
        for (int n : arr) {
            int temp;
            temp = n;
            while (temp > 0) {
                if (arr.get(arr.size() - 1) - temp < 0) {
                    temp--;
                } else {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_447c618e_f1eb_4e07_ace6_16ab7d276503(ArrayList<Integer> arr) {
        int count = 0;
        for (Integer i : arr) {
            for (Integer j : arr) {
                if (i != j) {
                    if (j > i) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_cf7986c5_306a_463c_a7eb_f59cdfa514fc(ArrayList<Integer> arr) {
        ArrayList<Integer> reverse = new ArrayList<>(arr);
        Collections.reverse(reverse);
        int count = 0;
        for (int val : arr) {
            if (val != reverse.get(arr.indexOf(val))) {
                count++;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_475b98c8_6de3_4df6_8e90_903401c21fb9(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_caefb933_2469_4732_ae04_49247288572d(ArrayList<Integer> arr) {
        int inv_count = 0;
        int n = arr.size();
        int inv_num = 0;
        for(int i = 1; i < n; i++) {
            if(arr.get(i) > arr.get(i - 1)) {
                inv_num += arr.get(i) - arr.get(i - 1);
                inv_count++;
            }
        }
        return inv_num;
    }

    
    public static int getInvCount_Problem_1_0915114f_a28d_47b8_bf65_9c0e8b4d960f(ArrayList<Integer> arr) {
        // Your code goes here
        // Create a list to store inversions
        ArrayList<Integer> invs = new ArrayList<>();
        for(int i=0;i<arr.size()-1;i++) {
            for(int j=i+1;j<arr.size();j++) {
                if(arr.get(i)>arr.get(j)) {
                    if(invs.contains(j)) {
                        invs.remove(j);
                    } else {
                        invs.add(j);
                    }
                }
            }
        }
        // return the count
        return invs.size();
    }

    
    public static int getInvCount_Problem_1_6853040a_b4e0_462f_afd4_01c1936748dc(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_6853040a_b4e0_462f_afd4_01c1936748dc(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_185c953b_53c3_4d15_8900_7b3877136476(ArrayList<Integer> arr) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j > 0; j--) {
                if (arr.get(j - 1) < arr.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_8e6b36f7_51cf_4c66_a849_592ff4a3579e(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_03d5aad7_62b6_48af_9bff_23355a2013b8(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_de651cea_c205_4efb_a73a_a9a7589759a4(ArrayList<Integer> arr) {
        int count = 0L;
        for(int i=0;i<arr.size()-1;i++) {
            for(int j=i+1;j<arr.size();j++) {
                int a = arr.get(i);
                int b = arr.get(j);
                if(a > b) {
                    count++;
                    arr.set(i, b);
                    arr.set(j, a);
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_3492b826_c583_4c9e_adcd_264851196b92(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_e861948c_ed46_433e_8c36_0db7f4fb5b58(ArrayList<Integer> arr) {
        int count = 0;
        for (int val : arr) {
            if (arr.get(arr.indexOf(val) - 1) == val) {
                count += 1;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_2459b360_dc15_471f_ade0_f74444916507(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_c5d77ab0_ae6e_4e1c_9427_c75c9f4eac02(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_4bdcf058_5f5f_4a39_9624_5507c1a930ea(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    inv_count++;
                }
            }
        }
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_bb5fb170_7b15_4555_9aa3_06fcadf39ab0(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_d0bf2555_a15c_4dab_ad6e_f13686434428(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_6e3d3190_5448_4e7d_979f_bc91875910e4(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_e748f87a_34e3_45ef_b7ae_ed5be6fff5fb(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_ec684fcb_f1f1_4e33_b0fd_0df92578a3e0(ArrayList<Integer> arr) {
        int count = 0;
        int largest = arr.get(arr.size()-1);
        int mid = arr.size()/2;
        for(int i =0; i < arr.size(); i++) {
            if(arr.get(i) > largest) {
                largest = arr.get(i);
                mid = i;
            }
        }
        for(int i =mid; i < arr.size(); i++) {
            if(arr.get(i) < largest) {
                count += 1;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_eacef685_519d_41f6_bc9a_3a184c847476(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_f064c456_c4d7_4a7e_9ac9_466b7772ab1b(ArrayList<Integer> arr) {
        int invCount = 0;
        for (int i = 0; i < arr.size(); i++) {
            int j = (i + 1) % arr.size();
            if (arr.get(i) > arr.get(j)) {
                int tmp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, tmp);
                invCount++;
            }
        }
        return invCount;
    }

    
    public static int getInvCount_Problem_0_bb6609e3_dca9_4f46_b0ec_ee50ae0f9e3f(ArrayList<Integer> arr) {
        int inv_count = 0;
        int n = arr.size();
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_abbc6829_d33c_4682_b063_4ac007ff39eb(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_864bc293_47eb_4889_acf8_e7a4c5f9a610(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_c89f19f9_1ff9_4b21_900b_73d676f6b4e4(ArrayList<Integer> arr) {
        int invCount = 0;
        int left,right;

        if (arr.size() == 0) {
            return invCount;
        }

        for (int i = 1; i < arr.size(); i++) {
            left = arr.get(i - 1);
            right = arr.get(i);
            if (left > right) {
                invCount++;
            }
        }

        return invCount;
    }

    
    public static int getInvCount_Problem_1_a22e0fb0_9e08_4d0a_abf7_ac9893fbdd06(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_37f0b8de_1611_4071_aa3b_1423802d7d6c(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_7ab21217_76c3_4c69_a663_5a72ba47b988(ArrayList<Integer> arr) {
        int inversionCount = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    inversionCount++;
                    break;
                }
            }
        }
        return inversionCount;
    }

    
    public static int getInvCount_Problem_0_f1521c2d_48e8_4813_a0e9_2b1f945785f5(ArrayList<Integer> arr) {
        int count = 0;
        for (int element : arr)
            if (element > 0)
                count++;
        return count;
    }

    
    public static int getInvCount_Problem_2_44b9d390_4e60_4381_a993_8ab1bf07f5e9(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_4309bdb1_4b10_41ed_a3e0_7f41222f4a90(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_a7968787_3d8f_469e_91e0_60b55a909531(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_4fd9060e_55e6_428d_983f_ba4d0840736c(ArrayList<Integer> arr) {
        // Write your code here
        int count = 0;
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) > arr.get(i-1)) count++;
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_b7924f6b_6d89_4fb4_9e60_b320b2a3508c(ArrayList<Integer> arr) {
        // Write code here
        int count = 0L;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < arr.get(i-1)) {
                count++;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_4b8c71b2_6013_406a_accd_caa492312927(ArrayList<Integer> arr) {
        int result = 0, count = 0;
        for (Integer i : arr) {
            for (Integer j : arr) {
                if (i != j && j < i) {
                    result += (i-j)+1;
                    count++;
                }
            }
        }
        return result;
    }

    
    public static int getInvCount_Problem_0_03a65cc0_540c_4e97_9c51_46a03aeebfbd(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_0c6ee4cd_f1c1_4806_98fe_134063be9048(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i : arr) {
            if (i < 0) sum += i;
            else {
                sum += i + 1;
            }
        }
        return sum;
    }

    
    public static int getInvCount_Problem_0_b149015b_7b3e_4593_9749_a2f67ddd5d6e(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_b6a88340_5e84_4eae_b971_ad0c72dccbc5(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_c5ba6448_aa12_4530_8932_9b8c6b0d5364(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_b5fa272a_50ac_4255_84d4_d2ce166e5e3d(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_b514b78c_aa8c_4d56_af70_f020fd33692a(ArrayList<Integer> arr) {
        int count = 0;
        for(int i = arr.size(); i-- > 0;) {
            int j = 0;
            while(j < i) {
                if(arr.get(j) > arr.get(j+1)) {
                    count++;
                }
                j++;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_b68cb691_5d8c_4612_a952_afe478a5f811(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_2fa64175_8397_47a4_8cd6_02b3a6a9f1a7(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_65100397_6c40_47f9_ae97_570dd23c6694(ArrayList<Integer> arr) {
        int count = 0;
        for(int i = 1; i < arr.size() - 1; i++) {
            if(arr.get(i) > arr.get(i+1)) {
                count++;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_280ed0a7_624a_43df_b973_6e16d4c1f114(ArrayList<Integer> arr) {
        int invcount = 0;
        for (Integer x : arr) {
            if (x == (x - 1)) { invcount++; }
        }
        return invcount;
    }

    
    public static int getInvCount_Problem_2_bd9a1fcd_50c2_4610_8bd1_870d6052d9c5(ArrayList<Integer> arr) {
        int count = 0;
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) > arr.get(i-1)) {
                count++;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_cc7f3c22_2fd5_4bec_9b98_4aa5907ec7be(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_a35421db_7765_41ea_9049_927c78cc5cc4(ArrayList<Integer> arr) {
        int n = arr.size();
        int count = 1;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) > arr.get(i+1)) count++;
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_d3c20f8f_aa2b_4691_a129_1ab85152e30f(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_f2cfea35_b01b_4f2d_9973_3bb718330c90(ArrayList<Integer> arr) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int temp = arr.get(i);
            while (--temp >= 0) {
                if (i == arr.indexOf(temp)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_699c92c0_be31_4aaf_a803_a4d235fe2c71(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_e6b2e7de_564b_4e26_97a9_c29f87d52b26(ArrayList<Integer> arr) {
        int count = 0, inversions = 0;
        for(Integer num : arr) {
            if(num == Integer.MIN_VALUE)
                continue;
            count++;
            while(num != 0) {
                if(num % 2 == 0)
                    num =  Math.pow(num, 2);
                else {
                    num = num / 2;
                    inversions++;
                }
            }
        }
        System.out.println("inversions = " + inversions);
        return count * inversions;
    }

    
    public static int getInvCount_Problem_2_c5d77ab0_ae6e_4e1c_9427_c75c9f4eac02(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_68888f21_dae0_49b8_b082_ec631f570f42(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_6c07a625_4745_42e9_83ca_be3f4ccb8dd5(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_10e62b1b_efaa_46e2_a0ec_58e911377bc2(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_2a6e4f95_750a_4256_8303_e1f060a5b1e8(ArrayList<Integer> arr) {
        return Collections.frequency(arr, arr.size()-1);
    }

    
    public static int getInvCount_Problem_2_c03de8c5_58d6_459e_9916_023609478352(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_785c2ff9_6688_4b5a_a331_fbfa7cc28936(ArrayList<Integer> arr) {
        int inv_count = 0;
        int n = arr.size();
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_0c03e62e_5141_4d87_8774_ea35387de45b(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_46b43c4e_a3a1_4ecf_91cc_e2dc076a0254(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_b58df984_b2a8_4d4c_bc49_d872a24b8127(ArrayList<Integer> arr) {
        int invCount = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    invCount = invCount + 1;
                    break;
                }
            }
        }
        return invCount;
    }

    
    public static int getInvCount_Problem_2_735ec4a3_7846_465a_98c9_20fe79b311cb(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_b27f7722_8bbc_4e91_84a9_2848f2887196(ArrayList<Integer> arr) {
        int count = 0L;
        for (int elem : arr) {
            if (elem > 0)
                count += 1;
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_8906462b_0f04_4c9f_83dc_bdd9ead33ad0(ArrayList<Integer> arr) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) < arr.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_cdefbb53_e44a_42fb_b43a_e2e28f82fc13(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_ce1de136_a116_4f06_893a_543ae5e87e7d(ArrayList<Integer> arr) {
        int ans = 0;
        for (int i=1; i<arr.size(); i++) {
            if (arr.get(i) > arr.get(arr.size()-1-i)) {
                ans++;
            }
        }
        return ans;
    }

    
    public static int getInvCount_Problem_1_7ab21217_76c3_4c69_a663_5a72ba47b988(ArrayList<Integer> arr) {
        int inversionCount = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    inversionCount++;
                    break;
                }
            }
        }
        return inversionCount;
    }

    
    public static int getInvCount_Problem_1_2c00e1f4_5acc_41f3_8038_c83e1282b35d(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_5ebd355b_71d8_4757_b7aa_a399f8dc84eb(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_6c07a625_4745_42e9_83ca_be3f4ccb8dd5(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_9858b818_3e8e_4841_93b6_bc7033e8eec1(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_38068d14_8b5e_4573_8fa1_fd07f9a93653(ArrayList<Integer> arr) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++)
            for(int j = i; j < arr.size(); j++)
                if(arr.get(i) > arr.get(j))
                    count++;
        return count;
    }

    
    public static int getInvCount_Problem_1_41a4ad24_3cbf_452c_80e9_5d5e461c7469(ArrayList<Integer> arr) {
        int n = arr.size();
        int inv_count = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_755604d7_148d_4f15_a7bc_31c7c6489a13(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_18663dc2_0682_4641_9c02_1e7edb03be98(ArrayList<Integer> arr) {
        if (arr.size() <= 1) return 0;
        int inv_count = 0;
        int firstInv = arr.get(0); // the minimum value
        int secondInv = arr.get(arr.size() - 1); // the maximum value
        int currentInv = firstInv;
        for (int i = 1; i < arr.size(); i++) {
            if (currentInv > secondInv) {
                inv_count++;
                currentInv = arr.get(i);
            } else {
                break;
            }
        }
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_0c6ee4cd_f1c1_4806_98fe_134063be9048(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i : arr) {
            if (i < 0) sum += i;
            else {
                sum += i + 1;
            }
        }
        return sum;
    }

    
    public static int getInvCount_Problem_1_447c618e_f1eb_4e07_ace6_16ab7d276503(ArrayList<Integer> arr) {
        int count = 0;
        for (Integer i : arr) {
            for (Integer j : arr) {
                if (i != j) {
                    if (j > i) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_dd867da2_8056_43b0_acb7_b81655a8666b(ArrayList<Integer> arr) {
        int result = 0;
        int maxValue = arr.get(arr.size()-1);
        for(int i : arr){
            if(i>maxValue){
                result ++;
            }
        }
        return result;
    }

    
    public static int getInvCount_Problem_1_c6b9605e_45d1_4a33_b469_ae90dd272c63(ArrayList<Integer> arr) {
        int res = 0;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > arr.get(i - 1)) {
                res++;
            }
        }
        return res;
    }

    
    public static int getInvCount_Problem_0_03396777_143c_43e0_8eee_df4a949df49f(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_59419399_f7b2_4be5_973d_bd860bae9fb8(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_36599d40_5180_4758_9105_20c34e01835e(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_db6a9b63_2dd5_4913_9aad_b454200e5d83(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_275fea94_6e89_4c2d_bef8_35138084487d(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_458e150b_fe50_4b61_a66f_c98d65e23aa5(ArrayList<Integer> arr) {
        int count = 0;
        for( int i = 1; i < arr.size(); i++ ) {
            if( arr.get(i) > arr.get(i-1) ) count++;
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_280ed0a7_624a_43df_b973_6e16d4c1f114(ArrayList<Integer> arr) {
        int invcount = 0;
        for (Integer x : arr) {
            if (x == (x - 1)) { invcount++; }
        }
        return invcount;
    }

    
    public static int getInvCount_Problem_2_764fd5de_da5c_490f_8477_9e163d6a21a5(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_95305ac5_6b06_42eb_8438_5dae5f1c8b6d(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_edfbe9d5_5f80_479c_8568_1317756cc33a(ArrayList<Integer> arr) {
        int count = 0;
        for(int i=0; i < arr.size()-1; i++) {
            int a = arr.get(i);
            int b = arr.get(i+1);
            if (b > a) {
                count ++;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_5cb9f497_2116_446d_8e0b_84fdcdeec3d5(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_e7fe483d_db7e_4ef9_8504_d870a2e0754d(ArrayList<Integer> arr) {
        int invCount = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    invCount++;
                }
            }
        }
        return invCount;
    }

    
    public static int getInvCount_Problem_0_c8fe49c8_48ab_44ed_8e5f_20ac2711341a(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_e7f70e51_4a2d_4ad0_bc6f_1ca7fc647524(ArrayList<Integer> arr) {
        int count = 0;
        int temp;
        for (int val : arr) {
            temp = val;
            while (temp != 0) {
                temp = temp / 2;
                count += temp;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_197158d6_90c7_4b20_8f55_c9f1d463a722(ArrayList<Integer> arr) {
        int result = 0L;
        for(int i = 1; i < arr.size(); i++) {
            int leftVal = arr.get(i);
            int rightVal = arr.get(i-1);
            if((leftVal <= rightVal)) {
                ++result;
            }
        }
        return result;
    }

    
    public static int getInvCount_Problem_2_3ad19e46_aaa4_4f60_ac86_1e92ec4ba9c8(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_c4ba5a7b_50f2_4e6e_a69a_43ef4cac8caf(ArrayList<Integer> arr) {
        // Write your code here.
        // Your solution starts here
        return 0;
    }

    
    public static int getInvCount_Problem_1_681f2432_61ee_48ec_bfa5_5912cf80fadc(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_f1681f42_79b1_4026_922b_2ec3dd84b4f4(ArrayList<Integer> arr) {
        int inversions = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i+1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    arr.remove(i);
                    inversions++;
                }
            }
        }
        return inversions;
    }

    
    public static int getInvCount_Problem_0_44251d9c_fcfa_421d_9238_ac2140c290b3(ArrayList<Integer> arr) {
        // Sort the array 
        Collections.sort(arr);
        int count = 0;
        
        // Iterate through the array from largest to smallest
        for (int i = arr.size() - 1; i >= 0; i--) {
            int temp = arr.get(i);
            
            // If current value is smaller than previous value
            if (temp > 0) {
                // Increment count
                count++;
            }
        }
        
        return count;
    }

    
    public static int getInvCount_Problem_2_d01de051_13b0_444c_b9ac_391714c1656b(ArrayList<Integer> arr) {
        int n = arr.size();
        int invCount = 0;

        for(int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && arr.get(j - 1) > arr.get(j)) {
                j--;
            }
            invCount += n - i;
            for(int k = i; k > j; k--) {
                arr.set(k + 1, arr.get(k - 1));
            }
        }
        return invCount;
    }

    
    public static int getInvCount_Problem_2_d276fe7c_3d8f_4b5d_8d96_8bb018b2f753(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_9fb97b15_38cd_499a_8844_ba0221debf18(ArrayList<Integer> arr) {
        // Write your Java code here
        // Your code goes here
        int temp;
        int result=0;
        for(int i=0;i<arr.size();i++)
        {
        temp = arr.get(i);
        for(int j=i+1;j<arr.size();j++)
        {
            if(arr.get(j) > temp)
            {
                temp = arr.get(j);
            }
        }
        result = result + (temp - i);
        }
        return result;
    }

    
    public static int getInvCount_Problem_0_8fc875b8_407c_4ac3_b7ec_907b46da9eda(ArrayList<Integer> arr) {
        return IntStream.range(0, arr.size()).filter(i -> !arr.get(i).equals(i)).count();
    }

    
    public static int getInvCount_Problem_0_1fa3a207_7183_445c_9cfd_f54463892de2(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_9bc29998_56d0_4726_b736_032f5c75be0b(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_a7968787_3d8f_469e_91e0_60b55a909531(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_10b39146_13b5_4eb8_8ee2_de068bf4b1fc(ArrayList<Integer> arr) {
        // Write your code here

        // Use a temp variable for the array list to count the inversions
        int count = 0L;
        // Write a for loop to iterate through all elements in the array list
        for (Integer num : arr) {
            // Iterate through all elements in the array list
            for (int i = arr.size() - 1; i >= 0; i--) {
                // if the element at current index is not equal to the element at current index - 1
                // then increment the count by 1
                if (arr.get(i) != arr.get(i - 1)) {
                    count++;
                    break;
                }
            }
        }
        // Return the count
        return count;
    }

    
    public static int getInvCount_Problem_1_e029d83e_26d5_4977_8186_31ca456cb8c6(ArrayList<Integer> arr) {
        if (arr.size() < 3) return 0;
        // Write your logic here
        return 1;
    }

    
    public static int getInvCount_Problem_0_4fd9060e_55e6_428d_983f_ba4d0840736c(ArrayList<Integer> arr) {
        // Write your code here
        int count = 0;
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) > arr.get(i-1)) count++;
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_831f9edc_525e_4c74_9f97_0dcd33985d51(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_8e6b36f7_51cf_4c66_a849_592ff4a3579e(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_56136a36_4f20_4756_a547_e66df60b4b48(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_a1c29606_d1c4_429d_b1d9_626ddf99af86(ArrayList<Integer> arr) {
        int inv_count = 0;
        int n = arr.size();
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_3b3d30ff_70ed_4c2b_a471_d2a15b540499(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_c1e35c26_690f_4a84_8742_8dd9a43121f4(ArrayList<Integer> arr) {
        int inv_count = 0;
        int n = arr.size();
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_3c19751e_20fc_4af0_9019_b9cffc4a670f(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_5bc3b619_bceb_4c4b_a2a7_a474185221a5(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_dfda92fd_e3d7_4467_aeeb_d0f70cef189c(ArrayList<Integer> arr) {
        int invCount = 0;
        for (int i : arr) {
            if (i < 0) continue;
            if (i > 0) invCount = invCount + 1;
        }
        return invCount;
    }

    
    public static int getInvCount_Problem_1_0aa255e4_569a_4b7d_afbb_44d7d3be9dfc(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_e72550e3_bc44_49a1_b0dd_2ea042193e7c(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_256ace03_f426_4902_9df3_37d14e79ab45(ArrayList<Integer> arr) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int j = 0;
            while (j < arr.size() &&
                    arr.get(j) <= arr.get(i)) {
                j++;
            }
            if (i == j) {
                count++;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_8906462b_0f04_4c9f_83dc_bdd9ead33ad0(ArrayList<Integer> arr) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) < arr.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_e4d1c465_7fd3_4e98_b689_716659c2e1e3(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_a10103cd_128e_42f9_a859_0ecd1ae25f9c(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_3492b826_c583_4c9e_adcd_264851196b92(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_a50cad38_eaf0_4f23_b1de_0d37ba25dc4d(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_31d813fd_e5b4_4503_80bc_d4eb31927c3a(ArrayList<Integer> arr) {
        // Declare a counter variable and initialise it to zero.
        int count = 0;
        // Write a loop to find the number of inversions in a given array of integers
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) < arr.get(i + 1)) {
                count++;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_b68cb691_5d8c_4612_a952_afe478a5f811(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_f8b6ad6e_16d7_4b77_8a5a_195e7f1faaa5(ArrayList<Integer> arr) {
        int count = 0;
        List<Integer> sorted = arr.stream().sorted().collect(Collectors.toList());
        Collections.reverse(sorted);
        for (Integer value : sorted) {
            if (value % 2 == 0) count++;
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_0beaf653_9e78_413d_b686_8fc25415bb33(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_401c5c28_1a4b_48a4_ae1c_f0be6d82c39b(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_c96d0eba_a1a6_4e58_ab78_725feb9defb3(ArrayList<Integer> arr) {
        if (arr.size() <= 1) return 0;
        Integer start = arr.get(0);
        Integer end = arr.get(arr.size() - 1);
        int count = 0;
        for (Integer curr = start; curr <= end; curr++) {
            int diff = arr.get(arr.indexOf(curr)) - curr;
            if (diff < 0)
                diff *= -1;
            if (diff != 0) {
                count += diff;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_32d38156_f371_4ca2_b4ac_6d9a5f74e0b1(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_f48b791c_71d3_4fb8_b5f3_b16245f8c9ba(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_9c3dc9fe_2ead_4c9e_bc75_b8baf95f2149(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_8fd0f733_0d4c_4ca9_9171_b3a287a83acd(ArrayList<Integer> arr) {
        int count = 1;
        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i< arr.size(); i++){
            int j = i;
            while (j > 0) {
                if (arr.get(j) < arr.get(j - 1)) {
                    temp.add(arr.get(j));
                    arr.remove(j);
                } else {
                    break;
                }
                j--;
            }
        }
        for (Integer i : temp) {
            count++;
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_917f88ed_737f_43d1_8cab_bba4fe15e51f(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_6dc11064_4a3b_4e62_89fc_e45edac7c24a(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_ad1f9a77_fda0_4b7d_a241_41a900d1761e(ArrayList<Integer> arr) {
        int count = 0;
        for (Integer i : arr)
            count += i;
        return count;
    }

    
    public static int getInvCount_Problem_0_6b9110e9_0eff_4b19_8428_96ef86529333(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_a10103cd_128e_42f9_a859_0ecd1ae25f9c(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_6c90dc6a_a113_4f94_9207_141ab4892001(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_c21a62e1_ac80_482f_accd_8309adaffab8(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_236ec4e3_4eae_4f14_b8b8_ffb648590d85(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_fedd4da1_599a_4df6_982e_9716ec49aa97(ArrayList<Integer> arr) {
        int count = 0;
        int a = arr.get(0);
        int b = arr.get(1);
        int c = arr.get(2);
        int d = arr.get(3);
        // Write a Java method to find if 2 numbers add up to 0.
        boolean found = False;
        while (found == False) {
            int t1 = (a * b) + (c * d);
            if (t1 == 0) {
                found = True;
                break;
            }
            int t2 = (a * c) - (b * d);
            if (t2 == 0) {
                found = True;
                break;
            }
            a = t1;
            b = t2;
            count++;
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_280ed0a7_624a_43df_b973_6e16d4c1f114(ArrayList<Integer> arr) {
        int invcount = 0;
        for (Integer x : arr) {
            if (x == (x - 1)) { invcount++; }
        }
        return invcount;
    }

    
    public static int getInvCount_Problem_0_0beaf653_9e78_413d_b686_8fc25415bb33(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_0b22de3d_f531_4bf2_95a7_4b37974eb5d5(ArrayList<Integer> arr) {
        int count = 0;
        for (Integer val : arr) {
            if (arr.indexOf(val) > arr.lastIndexOf(val)) {
                count++;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_ce1de136_a116_4f06_893a_543ae5e87e7d(ArrayList<Integer> arr) {
        int ans = 0;
        for (int i=1; i<arr.size(); i++) {
            if (arr.get(i) > arr.get(arr.size()-1-i)) {
                ans++;
            }
        }
        return ans;
    }

    
    public static int getInvCount_Problem_0_790a92b1_e86a_4a45_81b9_8ca67951932e(ArrayList<Integer> arr) {
        int count = 0;
        for(int i=0; i<arr.size(); i++) {
            for(int j=i+1; j<arr.size(); j++) {
                if(arr.get(i)>arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_409da736_71a4_4a19_8972_bfcfa931743b(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_e5c3924c_1f89_493e_b745_4b9f1e923a0f(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_0aa255e4_569a_4b7d_afbb_44d7d3be9dfc(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_78e514dc_c78b_4180_b810_ea7176cda121(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    inv_count++;
                }
            }
        }
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_1028df7b_32ec_4b86_984e_4da8e5d0d3c1(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    sum = sum + 1;
                    Collections.swap(arr, i, j);
                }
            }
        }
        return sum;
    }

    
    public static int getInvCount_Problem_1_3492b826_c583_4c9e_adcd_264851196b92(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_dc6bfd59_5579_45f9_8fb3_d982bc8eced7(ArrayList<Integer> arr) {
        int count = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) > arr.get(i + 1)) {
                count++;
                arr.remove(i + 1);
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_9b69973e_403a_4671_bf70_70ec8eb92b75(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_0c03e62e_5141_4d87_8774_ea35387de45b(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_32ad7cd0_b06a_45b1_840e_0c9336272233(ArrayList<Integer> arr) {
        int size = arr.size();
        if (size == 0)
            return 0;
        if (size == 1)
            return arr.get(0);

        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int x = arr.get(i);
            int j = 0;
            int k = i;
            while (k > 0 && j < size) {
                if (x < (arr.get(k - 1)))
                    res.add(k);
                k--;
                j++;
            }
        }
        return res.stream().mapToInt(x -> x).sum();
    }

    
    public static int getInvCount_Problem_2_807e0e5c_1517_4ce0_8d47_9b5b1eb992c6(ArrayList<Integer> arr) {
        int inversions = 0;
        for (int i = 0; i < arr.size(); i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(j) > arr.get(i)) inversions++;
        return inversions;
    }

    
    public static int getInvCount_Problem_0_1028df7b_32ec_4b86_984e_4da8e5d0d3c1(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    sum = sum + 1;
                    Collections.swap(arr, i, j);
                }
            }
        }
        return sum;
    }

    
    public static int getInvCount_Problem_1_3f71f414_6c3a_42e5_86dd_fba67c9153b3(ArrayList<Integer> arr) {
        int invCount = 0;
        for (int x : arr) {
            for (int y = arr.size(); y > 0; y--) {
                if (arr.get(y) != x && arr.get(y) > x) {
                    invCount = invCount + 1;
                    break;
                }
            }
        }
        return invCount;
    }

    
    public static int getInvCount_Problem_1_e5ff483d_9d77_4fae_8a6a_f030c7086706(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_f03ef006_5892_421a_a690_bf0ce62bbb02(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_f3cf8435_d718_46c0_a8a8_ab2330ac2e1c(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_0aa255e4_569a_4b7d_afbb_44d7d3be9dfc(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_6378f94e_d142_4168_a60b_97af1fc7773b(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_58f7c248_1c9c_453f_b5cb_cf53a301c307(ArrayList<Integer> arr) {
        // Write your logic here.
        return 0;
    }

    
    public static int getInvCount_Problem_0_a22e0fb0_9e08_4d0a_abf7_ac9893fbdd06(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_e861948c_ed46_433e_8c36_0db7f4fb5b58(ArrayList<Integer> arr) {
        int count = 0;
        for (int val : arr) {
            if (arr.get(arr.indexOf(val) - 1) == val) {
                count += 1;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_785c2ff9_6688_4b5a_a331_fbfa7cc28936(ArrayList<Integer> arr) {
        int inv_count = 0;
        int n = arr.size();
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_d6f7010b_78f6_4dba_bfbd_26c7a8a76acd(ArrayList<Integer> arr) {
        int count = 0;
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i) > arr.get(i + 1)) {
                count++;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_2a190df7_13b6_418c_8a00_1dc247aadc67(ArrayList<Integer> arr) {
        int inv_count = 0;
        int n = arr.size();
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_91516c3c_b798_4418_98bb_4ca8b57df812(ArrayList<Integer> arr) {
        int n = arr.size();
        int inv_count = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_401c5c28_1a4b_48a4_ae1c_f0be6d82c39b(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_9e2903eb_8c7d_4c29_96ba_adc17b69ffb0(ArrayList<Integer> arr) {
        // Declare a variable to hold the number of inversions in the array.
        int count = 0;
        // Declare a variable to hold the largest number in the array.
        int largest = arr.get(0);
        // Declare a variable to hold the smallest number in the array.
        int smallest = arr.get(0);
        // Declare a variable for a temp variable.
        int temp;

        // Use a for loop to count the number of inversions in the array.
        for(int i = 0; i < arr.size(); i++) {
            // Use a temporary variable to hold the current number in the array.
            temp = arr.get(i);
            // If the current number is greater than the largest number so far,
            // then update the largest number to the current number.
            if(temp > largest) {
                largest = temp;
            }
            // If the current number is less than the smallest number so far,
            // then update the smallest number to the current number.
            else if(temp < smallest) {
                smallest = temp;
            }
            // If the current number is not equal to the largest number so far
            // or smallest number so far, then increment the count of inversions.
            else {
                count++;
            }
        }
        // Return the number of inversions in the array.
        return count;
    }

    
    public static int getInvCount_Problem_2_458e150b_fe50_4b61_a66f_c98d65e23aa5(ArrayList<Integer> arr) {
        int count = 0;
        for( int i = 1; i < arr.size(); i++ ) {
            if( arr.get(i) > arr.get(i-1) ) count++;
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_831f9edc_525e_4c74_9f97_0dcd33985d51(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_33febc67_31d5_43f8_a59d_2fc6ae6750cf(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_22d1c082_c307_42f7_ae24_06f681294421(ArrayList<Integer> arr) {
        int count = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    int temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                    count += arr.size() - j;
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_e10a2f82_e777_431a_95e0_0389c7a299d2(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_555afc71_32b4_4805_9ea6_63afed610a38(ArrayList<Integer> arr) {
        int invCount = 0;
        List<Integer> copyArr= new ArrayList<>(arr);
        Collections.reverse(copyArr);
        for (int i : copyArr) {
            if (i < 0) {
                invCount++;
            }
        }
        return invCount;
    }

    
    public static int getInvCount_Problem_1_f8b6ad6e_16d7_4b77_8a5a_195e7f1faaa5(ArrayList<Integer> arr) {
        int count = 0;
        List<Integer> sorted = arr.stream().sorted().collect(Collectors.toList());
        Collections.reverse(sorted);
        for (Integer value : sorted) {
            if (value % 2 == 0) count++;
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_68888f21_dae0_49b8_b082_ec631f570f42(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_dd867da2_8056_43b0_acb7_b81655a8666b(ArrayList<Integer> arr) {
        int result = 0;
        int maxValue = arr.get(arr.size()-1);
        for(int i : arr){
            if(i>maxValue){
                result ++;
            }
        }
        return result;
    }

    
    public static int getInvCount_Problem_0_0029a3dd_a331_4e50_a8ee_c8b10a78cc01(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_ef5f1953_2239_4309_a7a8_878da3e4482b(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_a7dd87a7_5517_4dbf_90ad_4e3edc94feef(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_ec684fcb_f1f1_4e33_b0fd_0df92578a3e0(ArrayList<Integer> arr) {
        int count = 0;
        int largest = arr.get(arr.size()-1);
        int mid = arr.size()/2;
        for(int i =0; i < arr.size(); i++) {
            if(arr.get(i) > largest) {
                largest = arr.get(i);
                mid = i;
            }
        }
        for(int i =mid; i < arr.size(); i++) {
            if(arr.get(i) < largest) {
                count += 1;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_c9039314_5fbc_45d1_936a_ce7a46246cfd(ArrayList<Integer> arr) {
        int count = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
                if(arr.get(i) > arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_5ebd355b_71d8_4757_b7aa_a399f8dc84eb(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_36599d40_5180_4758_9105_20c34e01835e(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_32ad7cd0_b06a_45b1_840e_0c9336272233(ArrayList<Integer> arr) {
        int size = arr.size();
        if (size == 0)
            return 0;
        if (size == 1)
            return arr.get(0);

        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int x = arr.get(i);
            int j = 0;
            int k = i;
            while (k > 0 && j < size) {
                if (x < (arr.get(k - 1)))
                    res.add(k);
                k--;
                j++;
            }
        }
        return res.stream().mapToInt(x -> x).sum();
    }

    
    public static int getInvCount_Problem_2_a57e1eba_369a_496a_b132_ded8672c81c9(ArrayList<Integer> arr) {
        // The function should only count inversions and return the count.
        int count = 0;
        // Initialize a variable to hold the value of the first element in the array.
        int a = arr.get(0);
        // Iterate through all the elements in the array and check if the inversion
        // occurred before the first element or after the last element.
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) < a) {
                count++;
            }
            if(arr.get(i) > a) {
                count--;
            }
            a = arr.get(i);
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_7bb4c670_8e48_4e0c_b7c5_39c8e63d4199(ArrayList<Integer> arr) {
        // count number of inversions and sort list
        int count = 0;
        Integer max = arr.get(0);
        for (Integer val : arr) {
            if (val > max) {
                max = val;
            }
        }
        arr.sort(Comparator.naturalOrder());

        // count number of inversions in sorted list
        for (Integer val : arr) {
            if (val > max) {
                count++;
                max = val;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_732bd6ff_2bf0_4c56_8f70_b2772f4766ea(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_0a1d84e6_7f0f_4acd_9865_7f3e800bbbb5(ArrayList<Integer> arr) {
        int count = 0;
        for (int i=0; i<arr.size()-1; i++) {
            for (int j=i+1; j<arr.size(); j++) {
                if (arr.get(i)>arr.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_7320d17c_2948_49a9_b923_3a4b8431d8d8(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_eaac5f1f_8707_4193_a911_8331af345746(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_d56b8108_2944_4c1a_a68d_e14ba6606f4c(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_56136a36_4f20_4756_a547_e66df60b4b48(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_fedd4da1_599a_4df6_982e_9716ec49aa97(ArrayList<Integer> arr) {
        int count = 0;
        int a = arr.get(0);
        int b = arr.get(1);
        int c = arr.get(2);
        int d = arr.get(3);
        // Write a Java method to find if 2 numbers add up to 0.
        boolean found = False;
        while (found == False) {
            int t1 = (a * b) + (c * d);
            if (t1 == 0) {
                found = True;
                break;
            }
            int t2 = (a * c) - (b * d);
            if (t2 == 0) {
                found = True;
                break;
            }
            a = t1;
            b = t2;
            count++;
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_ef5f1953_2239_4309_a7a8_878da3e4482b(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_661dec25_c446_486e_9d26_8bda002133b2(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_db25cf37_8918_42e1_be45_69a268f5d28e(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_5c2e8355_3f53_428b_8b62_4c17f5dc16e6(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_3e46c69d_2fcf_4a23_aa85_25042c68b791(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_c7170404_055c_475c_b435_608d0dad7cf7(ArrayList<Integer> arr) {
        int count = 0;
        int temp;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) > arr.get(j)) {
                    temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_c6b9605e_45d1_4a33_b469_ae90dd272c63(ArrayList<Integer> arr) {
        int res = 0;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > arr.get(i - 1)) {
                res++;
            }
        }
        return res;
    }

    
    public static int getInvCount_Problem_1_0029a3dd_a331_4e50_a8ee_c8b10a78cc01(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_03a6daf8_2c90_41d0_ae6e_f9e9b8f3a0a7(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_de651cea_c205_4efb_a73a_a9a7589759a4(ArrayList<Integer> arr) {
        int count = 0L;
        for(int i=0;i<arr.size()-1;i++) {
            for(int j=i+1;j<arr.size();j++) {
                int a = arr.get(i);
                int b = arr.get(j);
                if(a > b) {
                    count++;
                    arr.set(i, b);
                    arr.set(j, a);
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_89249aa0_13f9_4c47_98bd_d929cc0dee06(ArrayList<Integer> arr) {
        int inv = 0, count = 0;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > arr.get(i - 1)) {
                inv = inv + 1;
                count = count + 1;
            }
        }
        return inv;
    }

    
    public static int getInvCount_Problem_1_6649c264_5433_4dce_9e0d_2000cce614b5(ArrayList<Integer> arr) {
        // Write your code here
        return 0;
    }

    
    public static int getInvCount_Problem_1_9508a6d8_54cd_4ab1_a471_4bf1543c9f23(ArrayList<Integer> arr) {
        int count = 0;
        for(int i=0; i<arr.size(); i++) {
            for(int j=i+1; j<arr.size(); j++) {
                if(arr.get(i) > arr.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_60dc9e26_93a2_4320_81a9_3dcaa74b5e8d(ArrayList<Integer> arr) {
        int result = 0;
        for (int i : arr) {
            if (arr.indexOf(i) > arr.lastIndexOf(i)) {
                result++;
            }
        }
        return result;
    }

    
    public static int getInvCount_Problem_1_185c953b_53c3_4d15_8900_7b3877136476(ArrayList<Integer> arr) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j > 0; j--) {
                if (arr.get(j - 1) < arr.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_78e514dc_c78b_4180_b810_ea7176cda121(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    inv_count++;
                }
            }
        }
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_702fcc0c_5788_4734_80ec_f53dc5f7e133(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_cf7986c5_306a_463c_a7eb_f59cdfa514fc(ArrayList<Integer> arr) {
        ArrayList<Integer> reverse = new ArrayList<>(arr);
        Collections.reverse(reverse);
        int count = 0;
        for (int val : arr) {
            if (val != reverse.get(arr.indexOf(val))) {
                count++;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_f8162f16_73e8_4b65_9a71_dd42c2c312f9(ArrayList<Integer> arr) {
        int n = arr.size();
        int inv_count = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_d0bf2555_a15c_4dab_ad6e_f13686434428(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_6378f94e_d142_4168_a60b_97af1fc7773b(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_44b9d390_4e60_4381_a993_8ab1bf07f5e9(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_d0bf2555_a15c_4dab_ad6e_f13686434428(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_c5ba6448_aa12_4530_8932_9b8c6b0d5364(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_0f4fd70a_303c_4da7_8d85_1a3045ba2093(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_bbb84047_45bc_43e2_b89b_668b3b80fb31(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_5bc3b619_bceb_4c4b_a2a7_a474185221a5(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_6ffd8776_dc98_4a0c_a069_7f429d9cd6dc(ArrayList<Integer> arr) {
        int n = arr.size();
        int inv_count = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_cf1e2949_d97b_4972_abd6_105df12263dc(ArrayList<Integer> arr) {
        int ans = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) > arr.get(i + 1)) {
                int temp = arr.get(i);
                arr.set(i, arr.get(i + 1));
                arr.set(i + 1, temp);
                ans++;
            }
        }
        return ans;
    }

    
    public static int getInvCount_Problem_1_9a2f535b_4399_44b8_9a75_dea0d7b4a128(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_4bdcf058_5f5f_4a39_9624_5507c1a930ea(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    inv_count++;
                }
            }
        }
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_ef5f1953_2239_4309_a7a8_878da3e4482b(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_89249aa0_13f9_4c47_98bd_d929cc0dee06(ArrayList<Integer> arr) {
        int inv = 0, count = 0;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > arr.get(i - 1)) {
                inv = inv + 1;
                count = count + 1;
            }
        }
        return inv;
    }

    
    public static int getInvCount_Problem_1_e9d64fb0_3d3d_4d57_894d_21d5019079a3(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_9a222b96_92b1_4d41_a1f4_71a716cc2a3b(ArrayList<Integer> arr) {
        int invCount = 0;
        for (int i = 1; i < arr.size(); i++)
            if (arr.get(i) < arr.get(i - 1))
                invCount++;
        return invCount;
    }

    
    public static int getInvCount_Problem_0_e861948c_ed46_433e_8c36_0db7f4fb5b58(ArrayList<Integer> arr) {
        int count = 0;
        for (int val : arr) {
            if (arr.get(arr.indexOf(val) - 1) == val) {
                count += 1;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_6dc11064_4a3b_4e62_89fc_e45edac7c24a(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_275fea94_6e89_4c2d_bef8_35138084487d(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_56615145_1be0_463a_b2a6_f9ce9cb273c8(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_9a2f535b_4399_44b8_9a75_dea0d7b4a128(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_318a8857_ca91_4e6f_a1c4_778647c02417(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_b06ed069_5f51_4550_a0b6_cb740f439380(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_03db18a5_b8c7_4d93_816e_7e1b92f68198(ArrayList<Integer> arr) {
        int n = arr.size();
        int count = 0;
        int end = arr.size()-1;
        for (int i = 0; i <= end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if (arr.get(i) > arr.get(j)) {
                    count++;
                    arr.remove(i--);
                    arr.remove(j--);
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_d8305fd3_a26c_47e9_b1fd_da910b52b1de(ArrayList<Integer> arr) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                if(arr.get(i) > arr.get(j)) {
                    int temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_76f5ee0d_699f_4736_899e_fff4c605e04d(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_31d813fd_e5b4_4503_80bc_d4eb31927c3a(ArrayList<Integer> arr) {
        // Declare a counter variable and initialise it to zero.
        int count = 0;
        // Write a loop to find the number of inversions in a given array of integers
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) < arr.get(i + 1)) {
                count++;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_0c6ee4cd_f1c1_4806_98fe_134063be9048(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i : arr) {
            if (i < 0) sum += i;
            else {
                sum += i + 1;
            }
        }
        return sum;
    }

    
    public static int getInvCount_Problem_2_4b8c71b2_6013_406a_accd_caa492312927(ArrayList<Integer> arr) {
        int result = 0, count = 0;
        for (Integer i : arr) {
            for (Integer j : arr) {
                if (i != j && j < i) {
                    result += (i-j)+1;
                    count++;
                }
            }
        }
        return result;
    }

    
    public static int getInvCount_Problem_0_d8305fd3_a26c_47e9_b1fd_da910b52b1de(ArrayList<Integer> arr) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                if(arr.get(i) > arr.get(j)) {
                    int temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_d94b57d5_9d86_40cf_bb18_2b4d098031bd(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_2a6e4f95_750a_4256_8303_e1f060a5b1e8(ArrayList<Integer> arr) {
        return Collections.frequency(arr, arr.size()-1);
    }

    
    public static int getInvCount_Problem_0_6bce3042_9385_4642_a7e8_0745520e4043(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for(int i=0;i<arr.size();i++)
        {
            for(int j=i+1;j<arr.size();j++)
            {
                if(arr.get(i)>arr.get(j))
                {
                    int temp = arr.get(i);
                    arr.set(i,arr.get(j));
                    arr.set(j,temp);
                    i++;
                    j--;
                }
            }
        }
        return sum;
    }

    
    public static int getInvCount_Problem_0_6be9073c_6091_4195_8eed_81eba1ef66fc(ArrayList<Integer> arr) {
        int count = 0; // to keep track of inversions
        for (int i : arr) {
            for (int j : arr) {
                if (i == j) {
                    continue;
                }
                if (i < j) {
                    if (arr.contains(i + 1)) {
                        count++;
                    }
                }
                if (j < i) {
                    if (arr.contains(j + 1)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_44251d9c_fcfa_421d_9238_ac2140c290b3(ArrayList<Integer> arr) {
        // Sort the array 
        Collections.sort(arr);
        int count = 0;
        
        // Iterate through the array from largest to smallest
        for (int i = arr.size() - 1; i >= 0; i--) {
            int temp = arr.get(i);
            
            // If current value is smaller than previous value
            if (temp > 0) {
                // Increment count
                count++;
            }
        }
        
        return count;
    }

    
    public static int getInvCount_Problem_0_eb061cf7_f2ee_45bb_8c92_0f43de8ce78f(ArrayList<Integer> arr) {
        int invCount = 0;
        for(int i=0; i<arr.size(); i++){
            int leftIndex = i;
            for(int j=i; j>0; j--){
                if(arr.get(j) > arr.get(leftIndex)){
                    leftIndex = j;
                }
            }
            invCount += Math.abs(arr.get(i) - arr.get(leftIndex));
            System.out.println("left: " + leftIndex);
            System.out.println("right: " + i);
        }
        System.out.println("inv: " + invCount);
        return invCount;
    }

    
    public static int getInvCount_Problem_1_555afc71_32b4_4805_9ea6_63afed610a38(ArrayList<Integer> arr) {
        int invCount = 0;
        List<Integer> copyArr= new ArrayList<>(arr);
        Collections.reverse(copyArr);
        for (int i : copyArr) {
            if (i < 0) {
                invCount++;
            }
        }
        return invCount;
    }

    
    public static int getInvCount_Problem_1_a1c29606_d1c4_429d_b1d9_626ddf99af86(ArrayList<Integer> arr) {
        int inv_count = 0;
        int n = arr.size();
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_db6a9b63_2dd5_4913_9aad_b454200e5d83(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_ee7fa7aa_59b3_473f_99dc_230d4461b60d(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_197158d6_90c7_4b20_8f55_c9f1d463a722(ArrayList<Integer> arr) {
        int result = 0L;
        for(int i = 1; i < arr.size(); i++) {
            int leftVal = arr.get(i);
            int rightVal = arr.get(i-1);
            if((leftVal <= rightVal)) {
                ++result;
            }
        }
        return result;
    }

    
    public static int getInvCount_Problem_2_6853040a_b4e0_462f_afd4_01c1936748dc(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_6649c264_5433_4dce_9e0d_2000cce614b5(ArrayList<Integer> arr) {
        // Write your code here
        return 0;
    }

    
    public static int getInvCount_Problem_2_699c92c0_be31_4aaf_a803_a4d235fe2c71(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_e5be32b5_02af_47d9_b309_5dcb21199b1e(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_0f4fd70a_303c_4da7_8d85_1a3045ba2093(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_e9d64fb0_3d3d_4d57_894d_21d5019079a3(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_4309bdb1_4b10_41ed_a3e0_7f41222f4a90(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_c9ee5997_3aae_4f51_bbff_447ba5c58e23(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_56615145_1be0_463a_b2a6_f9ce9cb273c8(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_d56b8108_2944_4c1a_a68d_e14ba6606f4c(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_236ec4e3_4eae_4f14_b8b8_ffb648590d85(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_4299fa1f_0576_4c47_ad22_59bf286c465d(ArrayList<Integer> arr) {
        // Write your code here.
        int count = 0;
        for(int i=arr.size()-1;i>0;i--){
            if(arr.get(i)>=arr.get(i-1)&&arr.get(i)!=-1){
                count++;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_38fec224_bad9_411b_9603_9cdef1f6ab1e(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int j = arr.size() - i - 1;
            if (i == j) {
                continue;
            }
            if (arr.get(i) < arr.get(j)) {
                inv_count += 1;
            }
        }
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_b36497e3_6e5d_4de1_899a_e33abfcc4bff(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_c5ba6448_aa12_4530_8932_9b8c6b0d5364(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_caefb933_2469_4732_ae04_49247288572d(ArrayList<Integer> arr) {
        int inv_count = 0;
        int n = arr.size();
        int inv_num = 0;
        for(int i = 1; i < n; i++) {
            if(arr.get(i) > arr.get(i - 1)) {
                inv_num += arr.get(i) - arr.get(i - 1);
                inv_count++;
            }
        }
        return inv_num;
    }

    
    public static int getInvCount_Problem_1_dc6bfd59_5579_45f9_8fb3_d982bc8eced7(ArrayList<Integer> arr) {
        int count = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) > arr.get(i + 1)) {
                count++;
                arr.remove(i + 1);
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_60f34f32_bad4_45af_a505_53c241b2a81a(ArrayList<Integer> arr) {
        int n = arr.size();
        int inv = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j > 0; j--) {
                if (arr.get(j) > arr.get(j - 1)) {
                    inv++;
                }
            }
        }
        return inv;
    }

    
    public static int getInvCount_Problem_0_2c00e1f4_5acc_41f3_8038_c83e1282b35d(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_ff784ba1_15a9_494b_8d51_62c26cfdc383(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_035bfbfb_b936_45eb_b014_45ae5f54a61a(ArrayList<Integer> arr) {
        ArrayList<Integer> temp = new ArrayList<>(arr);
        Collections.sort(temp);
        // return inversion count with reversal of the list
        return temp.size() - 1;
    }

    
    public static int getInvCount_Problem_1_91516c3c_b798_4418_98bb_4ca8b57df812(ArrayList<Integer> arr) {
        int n = arr.size();
        int inv_count = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_966f26b3_bd89_4863_8e66_429e9a680b14(ArrayList<Integer> arr) {
        int inversionCount = 0L;
        int invCount = Integer.MIN_VALUE;
        // Your code goes here
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > invCount) {
                invCount = arr.get(i);
            }
            if (arr.get(i) < invCount) {
                inversionCount++;
            }
        }
        return inversionCount;
    }

    
    public static int getInvCount_Problem_2_b0f37ccb_a1d5_4b0c_ada9_fe4fc8039031(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_cb569211_36f4_4fa6_b9d6_cc45ce8ea6c0(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_d6f7010b_78f6_4dba_bfbd_26c7a8a76acd(ArrayList<Integer> arr) {
        int count = 0;
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i) > arr.get(i + 1)) {
                count++;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_7a5aeaaf_2c2f_44b2_a5cc_037f978b230d(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_0029a3dd_a331_4e50_a8ee_c8b10a78cc01(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_9fc37146_c7e8_4fd8_8fcb_3e4ff4123687(ArrayList<Integer> arr) {
        int invCount = 0;
        for (Integer val : arr) {
            if (val < 0)
                invCount++;
        }
        return invCount;
    }

    
    public static int getInvCount_Problem_0_03db18a5_b8c7_4d93_816e_7e1b92f68198(ArrayList<Integer> arr) {
        int n = arr.size();
        int count = 0;
        int end = arr.size()-1;
        for (int i = 0; i <= end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if (arr.get(i) > arr.get(j)) {
                    count++;
                    arr.remove(i--);
                    arr.remove(j--);
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_b36497e3_6e5d_4de1_899a_e33abfcc4bff(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_348ceae7_45e4_45e0_95b9_229ee78fad91(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_57fcdeda_bed3_41f5_b666_c5b6014cb538(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_16950f86_145e_4170_8220_8286357d1054(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_f1ef5011_805f_4af9_900a_131dc6fc8241(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_83b4f764_71f7_45c4_89b1_29c1bd792c4c(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_197158d6_90c7_4b20_8f55_c9f1d463a722(ArrayList<Integer> arr) {
        int result = 0L;
        for(int i = 1; i < arr.size(); i++) {
            int leftVal = arr.get(i);
            int rightVal = arr.get(i-1);
            if((leftVal <= rightVal)) {
                ++result;
            }
        }
        return result;
    }

    
    public static int getInvCount_Problem_0_f2cfea35_b01b_4f2d_9973_3bb718330c90(ArrayList<Integer> arr) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int temp = arr.get(i);
            while (--temp >= 0) {
                if (i == arr.indexOf(temp)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_58f7c248_1c9c_453f_b5cb_cf53a301c307(ArrayList<Integer> arr) {
        // Write your logic here.
        return 0;
    }

    
    public static int getInvCount_Problem_2_bbb84047_45bc_43e2_b89b_668b3b80fb31(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_8eb8f408_bca1_4c69_908b_ff61057f0aa9(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_799b1733_fdae_4b64_897d_29340a6bebce(ArrayList<Integer> arr) {
        int invCount = 0;
        // loop through the array
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                for (int j = i; j < arr.size(); j++) {
                    if (arr.get(j) > 0) {
                        Integer currentInv = arr.get(j) - arr.get(i);
                        if (currentInv < 0) {
                            invCount += currentInv;
                            // remove the item from array list
                            arr.remove(i);
                            // increment index
                            i--;
                        } else {
                            // remove item from array list
                            arr.remove(j);
                            // increment index
                            j--;
                        }
                    }
                }
            }
        }
        return invCount;
    }

    
    public static int getInvCount_Problem_1_b5fa272a_50ac_4255_84d4_d2ce166e5e3d(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_8e2879bb_641b_4b38_9f76_6bc020e7e7e9(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_785c2ff9_6688_4b5a_a331_fbfa7cc28936(ArrayList<Integer> arr) {
        int inv_count = 0;
        int n = arr.size();
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_0b235271_bd6b_4a2f_b962_8b7866b073e0(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_9858b818_3e8e_4841_93b6_bc7033e8eec1(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_36ec647e_9d98_41db_bca1_c543aecfeedd(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_b7023f2d_2f98_4292_a3ec_9c55e1ee167c(ArrayList<Integer> arr) {
        // Write code here
        int count = 0;
        for(int i = 1; i < arr.size() - 1; i++){
            if(arr.get(i) <= arr.get(i-1)){
                count++;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_36f02e81_12f6_4675_b3c3_6ad21ccec52c(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_4514f380_cf54_416a_9db2_c97cebf3b891(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_41a4ad24_3cbf_452c_80e9_5d5e461c7469(ArrayList<Integer> arr) {
        int n = arr.size();
        int inv_count = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_4a16c93d_95ea_4044_bf35_3402acce76b5(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_e9d64fb0_3d3d_4d57_894d_21d5019079a3(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_5ca7e2ce_f22a_4958_9ca8_c4795ef420b3(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_19bf5fab_2dd3_4dc6_b1eb_4b02e76cdf04(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_9fc37146_c7e8_4fd8_8fcb_3e4ff4123687(ArrayList<Integer> arr) {
        int invCount = 0;
        for (Integer val : arr) {
            if (val < 0)
                invCount++;
        }
        return invCount;
    }

    
    public static int getInvCount_Problem_1_1fa3a207_7183_445c_9cfd_f54463892de2(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_c9ee5997_3aae_4f51_bbff_447ba5c58e23(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_9b62eda4_1fd0_4fe3_8a0a_7998cf630389(ArrayList<Integer> arr) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_cb569211_36f4_4fa6_b9d6_cc45ce8ea6c0(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_7bb4c670_8e48_4e0c_b7c5_39c8e63d4199(ArrayList<Integer> arr) {
        // count number of inversions and sort list
        int count = 0;
        Integer max = arr.get(0);
        for (Integer val : arr) {
            if (val > max) {
                max = val;
            }
        }
        arr.sort(Comparator.naturalOrder());

        // count number of inversions in sorted list
        for (Integer val : arr) {
            if (val > max) {
                count++;
                max = val;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_9c3dc9fe_2ead_4c9e_bc75_b8baf95f2149(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_f3330944_30e0_4106_be41_586c4a7b648c(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_6c90dc6a_a113_4f94_9207_141ab4892001(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_0e9e830a_8b55_474a_bce9_79801d80dcf7(ArrayList<Integer> arr) {
        int n = arr.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr.get(i) > arr.get(j)) {
                    int temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
        return sum;
    }

    
    public static int getInvCount_Problem_0_966f26b3_bd89_4863_8e66_429e9a680b14(ArrayList<Integer> arr) {
        int inversionCount = 0L;
        int invCount = Integer.MIN_VALUE;
        // Your code goes here
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > invCount) {
                invCount = arr.get(i);
            }
            if (arr.get(i) < invCount) {
                inversionCount++;
            }
        }
        return inversionCount;
    }

    
    public static int getInvCount_Problem_2_a3418ed2_b118_4eee_8f24_3befa7e6b4ba(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_6713d115_f00d_4f2f_85f0_e8698186ccb1(ArrayList<Integer> arr) {
        // write your code here
        int n = arr.size();
        int count = 0;
        int arr1 = arr.get(0);
        int arr2 = arr.get(1);
        if (arr1 > arr2)
            count += n - 2;
        else
            count += n - 1;
        int counter = 1;
        while (arr1 < arr2) {
            arr1 = arr.get(counter);
            arr2 = arr.get(counter+1);
            count++;
            counter++;
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_9b69973e_403a_4671_bf70_70ec8eb92b75(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_03a6daf8_2c90_41d0_ae6e_f9e9b8f3a0a7(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_f48b791c_71d3_4fb8_b5f3_b16245f8c9ba(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_0fb55bb2_598d_4780_bf65_500677a79f3d(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    inv_count++;
                }
            }
        }
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_555afc71_32b4_4805_9ea6_63afed610a38(ArrayList<Integer> arr) {
        int invCount = 0;
        List<Integer> copyArr= new ArrayList<>(arr);
        Collections.reverse(copyArr);
        for (int i : copyArr) {
            if (i < 0) {
                invCount++;
            }
        }
        return invCount;
    }

    
    public static int getInvCount_Problem_0_b765e693_6935_4eb7_8923_b7431676d8f7(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_770dac54_b284_4eab_8a2f_8e97dc777588(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_a42ec933_a539_4642_93e4_b92f2945a455(ArrayList<Integer> arr) {
        // Write a java function to get the number of inversions in an array
        // list. Inversion is defined as the number of non-increasing or
        // non-decreasing integers in the list.
        int inversionCount = 0L;
        // Write a java function to get the count of inversions in an array
        // list. Inversion is defined as the number of non-increasing or
        // non-decreasing integers in the list.
        int countOfInversions = arr.stream().filter(x -> {
            if (x == 0 || x == 1) {
                return False;
            }
            int count = 0;
            int lastVal = x;
            while (x != 1) {
                if ((lastVal % 10) != (x % 10)) {
                    lastVal = x;
                } else {
                    lastVal = x;
                }
                count++;
                x = x % 10;
            }
            if (lastVal != 1 && lastVal != 0) {
                count++;
            }
            return count == 3;
        }).count();
        return inversionCount - countOfInversions;
    }

    
    public static int getInvCount_Problem_2_6ffd8776_dc98_4a0c_a069_7f429d9cd6dc(ArrayList<Integer> arr) {
        int n = arr.size();
        int inv_count = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_a7dd87a7_5517_4dbf_90ad_4e3edc94feef(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_75f16c5e_8dd6_4062_917c_d7cd90528ad2(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_9bc29998_56d0_4726_b736_032f5c75be0b(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_201bcd52_942c_40e2_913b_3593f2ee5310(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_66c63681_43ba_448e_a4b0_b6aef3d28c9b(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_3cb42273_aef2_416c_941b_136f1ff4340f(ArrayList<Integer> arr) {
        int invCount = 0;
        // Write a for loop to count inversions.
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > arr.get(i - 1)) {
                invCount += 1;
            }
        }
        return invCount;
    }

    
    public static int getInvCount_Problem_0_35bc02dd_7189_46ee_96d9_3b2cd7c4465f(ArrayList<Integer> arr) {
        int inv = 0, count = 0;
        for(int i = 0; i < arr.size(); i++) {
            int x = arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                if(x > arr.get(j)) {
                    inv = inv + 1;
                }
            }
        }
        System.out.println(inv);
        return inv;
    }

    
    public static int getInvCount_Problem_1_d6383d16_3ade_4d22_a269_7d2a761e38f4(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_a42ec933_a539_4642_93e4_b92f2945a455(ArrayList<Integer> arr) {
        // Write a java function to get the number of inversions in an array
        // list. Inversion is defined as the number of non-increasing or
        // non-decreasing integers in the list.
        int inversionCount = 0L;
        // Write a java function to get the count of inversions in an array
        // list. Inversion is defined as the number of non-increasing or
        // non-decreasing integers in the list.
        int countOfInversions = arr.stream().filter(x -> {
            if (x == 0 || x == 1) {
                return False;
            }
            int count = 0;
            int lastVal = x;
            while (x != 1) {
                if ((lastVal % 10) != (x % 10)) {
                    lastVal = x;
                } else {
                    lastVal = x;
                }
                count++;
                x = x % 10;
            }
            if (lastVal != 1 && lastVal != 0) {
                count++;
            }
            return count == 3;
        }).count();
        return inversionCount - countOfInversions;
    }

    
    public static int getInvCount_Problem_0_318a8857_ca91_4e6f_a1c4_778647c02417(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_f8b6ad6e_16d7_4b77_8a5a_195e7f1faaa5(ArrayList<Integer> arr) {
        int count = 0;
        List<Integer> sorted = arr.stream().sorted().collect(Collectors.toList());
        Collections.reverse(sorted);
        for (Integer value : sorted) {
            if (value % 2 == 0) count++;
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_5c2e8355_3f53_428b_8b62_4c17f5dc16e6(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_2bb0324b_d3cc_49e0_9433_2a9c8f8bde8b(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_b1996f42_97c6_4797_bac6_048369d7388d(ArrayList<Integer> arr) {
        int inversions = 0;
        for (int i = 0; i < arr.size(); ++i) {
            for (int j = i + 1; j < arr.size(); ++j) {
                if (arr.get(i) > arr.get(j)) {
                    inversions += arr.get(j) - arr.get(i);
                }
            }
        }
        return inversions;
    }

    
    public static int getInvCount_Problem_0_5bd60338_ec5c_4561_be07_82eca4d6bb0b(ArrayList<Integer> arr) {
        // Return the length of the array
        return arr.size();
    }

    
    public static int getInvCount_Problem_1_e1e92987_d369_4b93_ad4e_f6c506abd66a(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_a57e1eba_369a_496a_b132_ded8672c81c9(ArrayList<Integer> arr) {
        // The function should only count inversions and return the count.
        int count = 0;
        // Initialize a variable to hold the value of the first element in the array.
        int a = arr.get(0);
        // Iterate through all the elements in the array and check if the inversion
        // occurred before the first element or after the last element.
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) < a) {
                count++;
            }
            if(arr.get(i) > a) {
                count--;
            }
            a = arr.get(i);
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_8d9a7df7_4ef0_4bd8_99f1_7157a480eee2(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_10cdff8a_b736_426f_9c7c_58fc0fe27757(ArrayList<Integer> arr) {
        int count = 0;
        Integer curr = arr.get(0);
        boolean first = True;
        for(int i = 1; i < arr.size(); i++) {
            Integer next = arr.get(i);
            if(curr < next) {
                count++;
            }
            curr = next;
            first = False;
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_475b98c8_6de3_4df6_8e90_903401c21fb9(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_8d9a7df7_4ef0_4bd8_99f1_7157a480eee2(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_e4d1c465_7fd3_4e98_b689_716659c2e1e3(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_3cb42273_aef2_416c_941b_136f1ff4340f(ArrayList<Integer> arr) {
        int invCount = 0;
        // Write a for loop to count inversions.
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > arr.get(i - 1)) {
                invCount += 1;
            }
        }
        return invCount;
    }

    
    public static int getInvCount_Problem_1_d276fe7c_3d8f_4b5d_8d96_8bb018b2f753(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_790a92b1_e86a_4a45_81b9_8ca67951932e(ArrayList<Integer> arr) {
        int count = 0;
        for(int i=0; i<arr.size(); i++) {
            for(int j=i+1; j<arr.size(); j++) {
                if(arr.get(i)>arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_eacef685_519d_41f6_bc9a_3a184c847476(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_dda6b85f_897b_4045_b7b0_363ede7e9196(ArrayList<Integer> arr) {
        int count = 0;
        for (Integer l : arr) {
            count += (l > 0 ? 1 : -1);
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_b404ba86_3234_4488_a665_0679f9854a47(ArrayList<Integer> arr) {
        int invCount = 0;
        for (int i = 0; i < arr.size(); i++) {
            int tempVal = arr.get(i);
            while (i > 0 && arr.get(i-1) > tempVal) {
                invCount++;
                arr.remove(i-1);
                i--;
            }
        }
        return invCount;
    }

    
    public static int getInvCount_Problem_0_f6634256_7750_4b1e_bfc8_0910ae1e403a(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_66c63681_43ba_448e_a4b0_b6aef3d28c9b(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_f81c207d_d960_4a84_a813_506b27b8a508(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_04a6dcbd_e1fe_4056_82e9_5aab3fba08d1(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    inv_count++;
                }
            }
        }
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_cc7f3c22_2fd5_4bec_9b98_4aa5907ec7be(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_4a2ea937_918c_42bd_9181_0b66174c4ee1(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_318a8857_ca91_4e6f_a1c4_778647c02417(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_78e514dc_c78b_4180_b810_ea7176cda121(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    inv_count++;
                }
            }
        }
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_e5be32b5_02af_47d9_b309_5dcb21199b1e(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_d01de051_13b0_444c_b9ac_391714c1656b(ArrayList<Integer> arr) {
        int n = arr.size();
        int invCount = 0;

        for(int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && arr.get(j - 1) > arr.get(j)) {
                j--;
            }
            invCount += n - i;
            for(int k = i; k > j; k--) {
                arr.set(k + 1, arr.get(k - 1));
            }
        }
        return invCount;
    }

    
    public static int getInvCount_Problem_2_4fd9060e_55e6_428d_983f_ba4d0840736c(ArrayList<Integer> arr) {
        // Write your code here
        int count = 0;
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) > arr.get(i-1)) count++;
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_753b1356_9445_4aa8_8096_fc68e5574b6a(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_86c0b205_e9d7_4b52_b09e_908153a85347(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_7ab21217_76c3_4c69_a663_5a72ba47b988(ArrayList<Integer> arr) {
        int inversionCount = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    inversionCount++;
                    break;
                }
            }
        }
        return inversionCount;
    }

    
    public static int getInvCount_Problem_0_d94b57d5_9d86_40cf_bb18_2b4d098031bd(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_ddadb1bf_0371_4405_8c56_6a4183164e85(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    inv_count++;
                }
            }
        }
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_c8fe49c8_48ab_44ed_8e5f_20ac2711341a(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_03d5aad7_62b6_48af_9bff_23355a2013b8(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_068dd061_af2b_4811_b65a_8b28898466ca(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_500d6e69_d7ea_422d_b103_d51bd7d7169f(ArrayList<Integer> arr) {
        int n = arr.size();
        int inv_count = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_38fec224_bad9_411b_9603_9cdef1f6ab1e(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int j = arr.size() - i - 1;
            if (i == j) {
                continue;
            }
            if (arr.get(i) < arr.get(j)) {
                inv_count += 1;
            }
        }
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_409da736_71a4_4a19_8972_bfcfa931743b(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_681f2432_61ee_48ec_bfa5_5912cf80fadc(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_86c0b205_e9d7_4b52_b09e_908153a85347(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_e03b71c2_fb6f_4516_b136_909690ae2a47(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_d01de051_13b0_444c_b9ac_391714c1656b(ArrayList<Integer> arr) {
        int n = arr.size();
        int invCount = 0;

        for(int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && arr.get(j - 1) > arr.get(j)) {
                j--;
            }
            invCount += n - i;
            for(int k = i; k > j; k--) {
                arr.set(k + 1, arr.get(k - 1));
            }
        }
        return invCount;
    }

    
    public static int getInvCount_Problem_0_f81c207d_d960_4a84_a813_506b27b8a508(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_a1c29606_d1c4_429d_b1d9_626ddf99af86(ArrayList<Integer> arr) {
        int inv_count = 0;
        int n = arr.size();
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_46b43c4e_a3a1_4ecf_91cc_e2dc076a0254(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_f1ef5011_805f_4af9_900a_131dc6fc8241(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_db25cf37_8918_42e1_be45_69a268f5d28e(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_850772ee_f1f4_4410_b6de_524f05b548b6(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_5cd272df_c425_47e7_b7af_58421a82f776(ArrayList<Integer> arr) {
        // Your code goes here.
        int count = 0; 
        for (int i : arr) 
            count += arr.indexOf(i) - arr.lastIndexOf(i);
        return count;
    }

    
    public static int getInvCount_Problem_0_ff784ba1_15a9_494b_8d51_62c26cfdc383(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_9e2903eb_8c7d_4c29_96ba_adc17b69ffb0(ArrayList<Integer> arr) {
        // Declare a variable to hold the number of inversions in the array.
        int count = 0;
        // Declare a variable to hold the largest number in the array.
        int largest = arr.get(0);
        // Declare a variable to hold the smallest number in the array.
        int smallest = arr.get(0);
        // Declare a variable for a temp variable.
        int temp;

        // Use a for loop to count the number of inversions in the array.
        for(int i = 0; i < arr.size(); i++) {
            // Use a temporary variable to hold the current number in the array.
            temp = arr.get(i);
            // If the current number is greater than the largest number so far,
            // then update the largest number to the current number.
            if(temp > largest) {
                largest = temp;
            }
            // If the current number is less than the smallest number so far,
            // then update the smallest number to the current number.
            else if(temp < smallest) {
                smallest = temp;
            }
            // If the current number is not equal to the largest number so far
            // or smallest number so far, then increment the count of inversions.
            else {
                count++;
            }
        }
        // Return the number of inversions in the array.
        return count;
    }

    
    public static int getInvCount_Problem_2_a22e0fb0_9e08_4d0a_abf7_ac9893fbdd06(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_5cd272df_c425_47e7_b7af_58421a82f776(ArrayList<Integer> arr) {
        // Your code goes here.
        int count = 0; 
        for (int i : arr) 
            count += arr.indexOf(i) - arr.lastIndexOf(i);
        return count;
    }

    
    public static int getInvCount_Problem_0_0f0574bf_acab_492c_8df5_fb7abdc61c5d(ArrayList<Integer> arr) {
        int leng = arr.size();
        int invCount = 0;
        for(int i = 0; i < leng; i++) {
            for(int j = i+1; j < leng; j++) {
                if(arr.get(i) < arr.get(j)) {
                    invCount++;
                }
            }
        }
        return invCount;
    }

    
    public static int getInvCount_Problem_1_8ccbded5_8614_4cb1_ab35_115ec68b6509(ArrayList<Integer> arr) {
        int count = 0;
        int l1 = arr.get(0);
        int l2 = arr.get(1);
        int i1, i2;
        for(int i = 2; i < arr.size(); i++) {
            i1 = arr.get(i);
            i2 = arr.get(i-1);
            if(i1 < i2) {
                count += (i2 - i1 + 1);
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_9041bcbd_1af2_4311_9b83_578b6b1d4d0d(ArrayList<Integer> arr) {
        // Declare and initialize a variable to count the number of inversions
        int count = 0;
        Integer first, second;
        for(int i = 0; i < arr.size(); i ++) {
            first = arr.get(i);
            for(int j = i + 1; j < arr.size(); j ++) {
                second = arr.get(j);
                if(first > second) {
                    count ++;
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_c12b791f_90fc_463a_a4f0_cb46891fd478(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_d8f20bb4_ceae_4a3b_beb6_53fbf24e267c(ArrayList<Integer> arr) {
        int count = 0;
        for (Integer num : arr) {
            if (num.compareTo(Collections.max(arr)) > -1) {
                count ++;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_b404ba86_3234_4488_a665_0679f9854a47(ArrayList<Integer> arr) {
        int invCount = 0;
        for (int i = 0; i < arr.size(); i++) {
            int tempVal = arr.get(i);
            while (i > 0 && arr.get(i-1) > tempVal) {
                invCount++;
                arr.remove(i-1);
                i--;
            }
        }
        return invCount;
    }

    
    public static int getInvCount_Problem_2_05042086_f6a2_44c8_9f79_c3a612f3b48b(ArrayList<Integer> arr) {
        int count = 0;
        for (int n : arr) {
            int temp;
            temp = n;
            while (temp > 0) {
                if (arr.get(arr.size() - 1) - temp < 0) {
                    temp--;
                } else {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_36599d40_5180_4758_9105_20c34e01835e(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_ff784ba1_15a9_494b_8d51_62c26cfdc383(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_90be8e45_d5de_41c8_a706_49a41937bd03(ArrayList<Integer> arr) {
        int result = 0L;
        int N = arr.size();
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr.get(i) > arr.get(j)) {
                    result = result + 1;
                }
            }
        }
        return result;
    }

    
    public static int getInvCount_Problem_1_b7924f6b_6d89_4fb4_9e60_b320b2a3508c(ArrayList<Integer> arr) {
        // Write code here
        int count = 0L;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < arr.get(i-1)) {
                count++;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_475b98c8_6de3_4df6_8e90_903401c21fb9(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_cf7986c5_306a_463c_a7eb_f59cdfa514fc(ArrayList<Integer> arr) {
        ArrayList<Integer> reverse = new ArrayList<>(arr);
        Collections.reverse(reverse);
        int count = 0;
        for (int val : arr) {
            if (val != reverse.get(arr.indexOf(val))) {
                count++;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_a85ef941_b9e2_4aa2_b639_f6395376da8d(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_36ec647e_9d98_41db_bca1_c543aecfeedd(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_4299fa1f_0576_4c47_ad22_59bf286c465d(ArrayList<Integer> arr) {
        // Write your code here.
        int count = 0;
        for(int i=arr.size()-1;i>0;i--){
            if(arr.get(i)>=arr.get(i-1)&&arr.get(i)!=-1){
                count++;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_60301210_a0c4_4168_b986_86bba6e78d7d(ArrayList<Integer> arr) {
        int count = 0;
        int maxVal = Collections.max(arr);
        for (int num : arr) {
            if (num < maxVal) {
                count += num - maxVal;
                maxVal = num;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_cdefbb53_e44a_42fb_b43a_e2e28f82fc13(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_71a2b533_d8e0_43ce_9089_8b801f1651a4(ArrayList<Integer> arr) {
        // Initialize some variables we will need.
        int count = 0;
        int sum = 0;
        int temp = arr.get(0);
        // Iterate through the arraylist backwards, starting at the end.
        for (int i = arr.size()-1; i >= 0; i--) {
            // If the current number is not greater than the one before it, add one to the count. Otherwise, subtract one from the count.
            if (arr.get(i) < temp) {
                count++;
            } else {
                count--;
            }
            // Add the current number to the sum.
            sum += arr.get(i);
            // Finally, store the current number as the current temporary number for comparison.
            temp = arr.get(i);
        }
        // Return the count
        return count;
    }

    
    public static int getInvCount_Problem_2_5bd60338_ec5c_4561_be07_82eca4d6bb0b(ArrayList<Integer> arr) {
        // Return the length of the array
        return arr.size();
    }

    
    public static int getInvCount_Problem_1_bee5aa1b_e07d_4cdd_aabd_3bde10d48ed2(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_f1681f42_79b1_4026_922b_2ec3dd84b4f4(ArrayList<Integer> arr) {
        int inversions = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i+1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    arr.remove(i);
                    inversions++;
                }
            }
        }
        return inversions;
    }

    
    public static int getInvCount_Problem_0_9a222b96_92b1_4d41_a1f4_71a716cc2a3b(ArrayList<Integer> arr) {
        int invCount = 0;
        for (int i = 1; i < arr.size(); i++)
            if (arr.get(i) < arr.get(i - 1))
                invCount++;
        return invCount;
    }

    
    public static int getInvCount_Problem_1_ddadb1bf_0371_4405_8c56_6a4183164e85(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    inv_count++;
                }
            }
        }
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_c7091c20_1b84_43cc_98dd_0b23ba1f19f2(ArrayList<Integer> arr) {
        // Write your code here
        return 0;
    }

    
    public static int getInvCount_Problem_2_ce1de136_a116_4f06_893a_543ae5e87e7d(ArrayList<Integer> arr) {
        int ans = 0;
        for (int i=1; i<arr.size(); i++) {
            if (arr.get(i) > arr.get(arr.size()-1-i)) {
                ans++;
            }
        }
        return ans;
    }

    
    public static int getInvCount_Problem_0_6ffd8776_dc98_4a0c_a069_7f429d9cd6dc(ArrayList<Integer> arr) {
        int n = arr.size();
        int inv_count = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_a7dd87a7_5517_4dbf_90ad_4e3edc94feef(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_c4ba5a7b_50f2_4e6e_a69a_43ef4cac8caf(ArrayList<Integer> arr) {
        // Write your code here.
        // Your solution starts here
        return 0;
    }

    
    public static int getInvCount_Problem_0_807e0e5c_1517_4ce0_8d47_9b5b1eb992c6(ArrayList<Integer> arr) {
        int inversions = 0;
        for (int i = 0; i < arr.size(); i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(j) > arr.get(i)) inversions++;
        return inversions;
    }

    
    public static int getInvCount_Problem_1_9041bcbd_1af2_4311_9b83_578b6b1d4d0d(ArrayList<Integer> arr) {
        // Declare and initialize a variable to count the number of inversions
        int count = 0;
        Integer first, second;
        for(int i = 0; i < arr.size(); i ++) {
            first = arr.get(i);
            for(int j = i + 1; j < arr.size(); j ++) {
                second = arr.get(j);
                if(first > second) {
                    count ++;
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_e72550e3_bc44_49a1_b0dd_2ea042193e7c(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_56615145_1be0_463a_b2a6_f9ce9cb273c8(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_035bfbfb_b936_45eb_b014_45ae5f54a61a(ArrayList<Integer> arr) {
        ArrayList<Integer> temp = new ArrayList<>(arr);
        Collections.sort(temp);
        // return inversion count with reversal of the list
        return temp.size() - 1;
    }

    
    public static int getInvCount_Problem_1_8d9a7df7_4ef0_4bd8_99f1_7157a480eee2(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_4b8c71b2_6013_406a_accd_caa492312927(ArrayList<Integer> arr) {
        int result = 0, count = 0;
        for (Integer i : arr) {
            for (Integer j : arr) {
                if (i != j && j < i) {
                    result += (i-j)+1;
                    count++;
                }
            }
        }
        return result;
    }

    
    public static int getInvCount_Problem_2_f633866f_7b6d_4293_ba71_54024249f32f(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_44251d9c_fcfa_421d_9238_ac2140c290b3(ArrayList<Integer> arr) {
        // Sort the array 
        Collections.sort(arr);
        int count = 0;
        
        // Iterate through the array from largest to smallest
        for (int i = arr.size() - 1; i >= 0; i--) {
            int temp = arr.get(i);
            
            // If current value is smaller than previous value
            if (temp > 0) {
                // Increment count
                count++;
            }
        }
        
        return count;
    }

    
    public static int getInvCount_Problem_0_f3cf8435_d718_46c0_a8a8_ab2330ac2e1c(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_a7968787_3d8f_469e_91e0_60b55a909531(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_cb3a5965_27dd_4a25_981d_22b9d3479cfe(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_3c19751e_20fc_4af0_9019_b9cffc4a670f(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_9d82355a_d022_4415_8206_2db516cd08de(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_79a48976_7e3e_45cc_abc2_1926d2af567e(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_a7dd5965_1bf8_4060_94da_0feb6a570aab(ArrayList<Integer> arr) {
        // Complete code here
        return 0;
    }

    
    public static int getInvCount_Problem_1_60f34f32_bad4_45af_a505_53c241b2a81a(ArrayList<Integer> arr) {
        int n = arr.size();
        int inv = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j > 0; j--) {
                if (arr.get(j) > arr.get(j - 1)) {
                    inv++;
                }
            }
        }
        return inv;
    }

    
    public static int getInvCount_Problem_1_59d48fc9_549c_4735_b8ce_03d4ec134452(ArrayList<Integer> arr) {
        // Write your code here.
        return 0;
    }

    
    public static int getInvCount_Problem_1_abbc6829_d33c_4682_b063_4ac007ff39eb(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_74953037_293e_4705_ad91_0b81a08feeb2(ArrayList<Integer> arr) {
        // Write a java program to implement this function
        int left = 0L, right = 0L;
        int count = 0L;
        for (Integer value : arr) {
            left += value;
            right -= value;
            if (left < right)
                ++count;
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_c1e77957_6841_4f63_a95a_d5220d4e9fdb(ArrayList<Integer> arr) {
        if(arr.isEmpty()){
            return 0L;
        }
        int cnt=0L;
        Integer firstEl=arr.get(0);
        for(int i=1;i<arr.size();i++){
            if(arr.get(i)>firstEl){
                cnt++;
            }else{
                break;
            }
        }
        return cnt;
    }

    
    public static int getInvCount_Problem_0_c5d77ab0_ae6e_4e1c_9427_c75c9f4eac02(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_3b0b1b9a_0681_4511_9ea9_5717b15bdbdd(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_e10a2f82_e777_431a_95e0_0389c7a299d2(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_6713d115_f00d_4f2f_85f0_e8698186ccb1(ArrayList<Integer> arr) {
        // write your code here
        int n = arr.size();
        int count = 0;
        int arr1 = arr.get(0);
        int arr2 = arr.get(1);
        if (arr1 > arr2)
            count += n - 2;
        else
            count += n - 1;
        int counter = 1;
        while (arr1 < arr2) {
            arr1 = arr.get(counter);
            arr2 = arr.get(counter+1);
            count++;
            counter++;
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_035bfbfb_b936_45eb_b014_45ae5f54a61a(ArrayList<Integer> arr) {
        ArrayList<Integer> temp = new ArrayList<>(arr);
        Collections.sort(temp);
        // return inversion count with reversal of the list
        return temp.size() - 1;
    }

    
    public static int getInvCount_Problem_0_092922e0_73a2_426c_bf6e_f8f50efa90e0(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_59419399_f7b2_4be5_973d_bd860bae9fb8(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_cb23dbdc_4dfc_4ca3_9cd7_9b2c24789f5b(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_24cc1571_6a73_49a3_b2ab_3c734bb005fb(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_2bb0324b_d3cc_49e0_9433_2a9c8f8bde8b(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_735ec4a3_7846_465a_98c9_20fe79b311cb(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_8bb0a1ee_603f_4e2d_81c4_8b46c6549629(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_6713d115_f00d_4f2f_85f0_e8698186ccb1(ArrayList<Integer> arr) {
        // write your code here
        int n = arr.size();
        int count = 0;
        int arr1 = arr.get(0);
        int arr2 = arr.get(1);
        if (arr1 > arr2)
            count += n - 2;
        else
            count += n - 1;
        int counter = 1;
        while (arr1 < arr2) {
            arr1 = arr.get(counter);
            arr2 = arr.get(counter+1);
            count++;
            counter++;
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_b149015b_7b3e_4593_9749_a2f67ddd5d6e(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_e029d83e_26d5_4977_8186_31ca456cb8c6(ArrayList<Integer> arr) {
        if (arr.size() < 3) return 0;
        // Write your logic here
        return 1;
    }

    
    public static int getInvCount_Problem_2_f3cf8435_d718_46c0_a8a8_ab2330ac2e1c(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_fedd4da1_599a_4df6_982e_9716ec49aa97(ArrayList<Integer> arr) {
        int count = 0;
        int a = arr.get(0);
        int b = arr.get(1);
        int c = arr.get(2);
        int d = arr.get(3);
        // Write a Java method to find if 2 numbers add up to 0.
        boolean found = False;
        while (found == False) {
            int t1 = (a * b) + (c * d);
            if (t1 == 0) {
                found = True;
                break;
            }
            int t2 = (a * c) - (b * d);
            if (t2 == 0) {
                found = True;
                break;
            }
            a = t1;
            b = t2;
            count++;
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_401c5c28_1a4b_48a4_ae1c_f0be6d82c39b(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_9508a6d8_54cd_4ab1_a471_4bf1543c9f23(ArrayList<Integer> arr) {
        int count = 0;
        for(int i=0; i<arr.size(); i++) {
            for(int j=i+1; j<arr.size(); j++) {
                if(arr.get(i) > arr.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_c4ba5a7b_50f2_4e6e_a69a_43ef4cac8caf(ArrayList<Integer> arr) {
        // Write your code here.
        // Your solution starts here
        return 0;
    }

    
    public static int getInvCount_Problem_0_7cebf909_f64b_4b56_aad6_fa1f0cc6d9fd(ArrayList<Integer> arr) {
        return arr.stream().collect(Collectors.groupingBy(a -> Math.abs(a)))
                .values().stream().collect(Collectors.counting());
    }

    
    public static int getInvCount_Problem_1_70f95bca_48c4_4c60_a0f9_6bb4bef64e66(ArrayList<Integer> arr) {
        // Write your Java code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_89249aa0_13f9_4c47_98bd_d929cc0dee06(ArrayList<Integer> arr) {
        int inv = 0, count = 0;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > arr.get(i - 1)) {
                inv = inv + 1;
                count = count + 1;
            }
        }
        return inv;
    }

    
    public static int getInvCount_Problem_0_9d5325cd_f76d_4d6f_9e19_cdda6c162a70(ArrayList<Integer> arr) {
        int countInversion = 0;
        for(int i = 1; i < arr.size(); i++) {
            int leftElement = arr.get(i);
            for(int j = i; j > 0; j--) {
                int rightElement = arr.get(j);
                if(leftElement > rightElement) {
                    break;
                }
                countInversion++;
            }
        }
        return countInversion;
    }

    
    public static int getInvCount_Problem_1_db25cf37_8918_42e1_be45_69a268f5d28e(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_a3418ed2_b118_4eee_8f24_3befa7e6b4ba(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_e3323a21_bf16_4d86_b5e6_5309c48d461e(ArrayList<Integer> arr) {
        int inv_count = 0;
        for(int i = 0; i <arr.size(); i++)
        {
            int k = arr.size() - 1 - i;
            if(arr.get(k) > arr.get(k))
            {
                inv_count += 1;
            }
        }
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_c12b791f_90fc_463a_a4f0_cb46891fd478(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_4299fa1f_0576_4c47_ad22_59bf286c465d(ArrayList<Integer> arr) {
        // Write your code here.
        int count = 0;
        for(int i=arr.size()-1;i>0;i--){
            if(arr.get(i)>=arr.get(i-1)&&arr.get(i)!=-1){
                count++;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_cf1e2949_d97b_4972_abd6_105df12263dc(ArrayList<Integer> arr) {
        int ans = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) > arr.get(i + 1)) {
                int temp = arr.get(i);
                arr.set(i, arr.get(i + 1));
                arr.set(i + 1, temp);
                ans++;
            }
        }
        return ans;
    }

    
    public static int getInvCount_Problem_0_b58df984_b2a8_4d4c_bc49_d872a24b8127(ArrayList<Integer> arr) {
        int invCount = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    invCount = invCount + 1;
                    break;
                }
            }
        }
        return invCount;
    }

    
    public static int getInvCount_Problem_1_b1996f42_97c6_4797_bac6_048369d7388d(ArrayList<Integer> arr) {
        int inversions = 0;
        for (int i = 0; i < arr.size(); ++i) {
            for (int j = i + 1; j < arr.size(); ++j) {
                if (arr.get(i) > arr.get(j)) {
                    inversions += arr.get(j) - arr.get(i);
                }
            }
        }
        return inversions;
    }

    
    public static int getInvCount_Problem_1_0e43c6e5_52da_4c45_88e6_a479c8c327da(ArrayList<Integer> arr) {
        // Write your code here
        return 0;
    }

    
    public static int getInvCount_Problem_2_f48b791c_71d3_4fb8_b5f3_b16245f8c9ba(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_489ad2b3_d481_447f_8305_39bf77485e51(ArrayList<Integer> arr) {
        // Your code here
        int count = 0L;
        for(int i = 0; i < arr.size(); i++){
            for(int j = i+1; j < arr.size(); j++){
                if(arr.get(i) > arr.get(j)){
                    count += arr.get(j) - arr.get(i);
                    arr.remove(j);
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_c8fe49c8_48ab_44ed_8e5f_20ac2711341a(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_9c3dc9fe_2ead_4c9e_bc75_b8baf95f2149(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_7320d17c_2948_49a9_b923_3a4b8431d8d8(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_9fb97b15_38cd_499a_8844_ba0221debf18(ArrayList<Integer> arr) {
        // Write your Java code here
        // Your code goes here
        int temp;
        int result=0;
        for(int i=0;i<arr.size();i++)
        {
        temp = arr.get(i);
        for(int j=i+1;j<arr.size();j++)
        {
            if(arr.get(j) > temp)
            {
                temp = arr.get(j);
            }
        }
        result = result + (temp - i);
        }
        return result;
    }

    
    public static int getInvCount_Problem_1_732bd6ff_2bf0_4c56_8f70_b2772f4766ea(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_6b9110e9_0eff_4b19_8428_96ef86529333(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_10b39146_13b5_4eb8_8ee2_de068bf4b1fc(ArrayList<Integer> arr) {
        // Write your code here

        // Use a temp variable for the array list to count the inversions
        int count = 0L;
        // Write a for loop to iterate through all elements in the array list
        for (Integer num : arr) {
            // Iterate through all elements in the array list
            for (int i = arr.size() - 1; i >= 0; i--) {
                // if the element at current index is not equal to the element at current index - 1
                // then increment the count by 1
                if (arr.get(i) != arr.get(i - 1)) {
                    count++;
                    break;
                }
            }
        }
        // Return the count
        return count;
    }

    
    public static int getInvCount_Problem_2_a35421db_7765_41ea_9049_927c78cc5cc4(ArrayList<Integer> arr) {
        int n = arr.size();
        int count = 1;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) > arr.get(i+1)) count++;
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_f03ef006_5892_421a_a690_bf0ce62bbb02(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_c0c05dee_4c15_489a_be16_6d54696b0ab2(ArrayList<Integer> arr) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int curr = arr.get(i);
            for (int j = i + 1; j < arr.size(); j++) {
                if (curr <= arr.get(j)) {
                    arr.set(i, arr.get(j));
                    arr.set(j, curr);
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_5cb9f497_2116_446d_8e0b_84fdcdeec3d5(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_aa0302e0_6895_43ac_b4dd_13a01ae09a53(ArrayList<Integer> arr) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            int a = arr.get(i);
            int b = i+1;
            while(a < b) {
                if(a>b) break;
                count++;
                a++;
            }
            b--;
            while(a < b) {
                if(b>a) break;
                count++;
                b--;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_092922e0_73a2_426c_bf6e_f8f50efa90e0(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_a42ec933_a539_4642_93e4_b92f2945a455(ArrayList<Integer> arr) {
        // Write a java function to get the number of inversions in an array
        // list. Inversion is defined as the number of non-increasing or
        // non-decreasing integers in the list.
        int inversionCount = 0L;
        // Write a java function to get the count of inversions in an array
        // list. Inversion is defined as the number of non-increasing or
        // non-decreasing integers in the list.
        int countOfInversions = arr.stream().filter(x -> {
            if (x == 0 || x == 1) {
                return False;
            }
            int count = 0;
            int lastVal = x;
            while (x != 1) {
                if ((lastVal % 10) != (x % 10)) {
                    lastVal = x;
                } else {
                    lastVal = x;
                }
                count++;
                x = x % 10;
            }
            if (lastVal != 1 && lastVal != 0) {
                count++;
            }
            return count == 3;
        }).count();
        return inversionCount - countOfInversions;
    }

    
    public static int getInvCount_Problem_2_d8305fd3_a26c_47e9_b1fd_da910b52b1de(ArrayList<Integer> arr) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                if(arr.get(i) > arr.get(j)) {
                    int temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_1fa3a207_7183_445c_9cfd_f54463892de2(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_37f0b8de_1611_4071_aa3b_1423802d7d6c(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_917f88ed_737f_43d1_8cab_bba4fe15e51f(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_850772ee_f1f4_4410_b6de_524f05b548b6(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_2a0026bb_14a2_4316_8e51_45bf2ec1866f(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_0f4fd70a_303c_4da7_8d85_1a3045ba2093(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_5ca7e2ce_f22a_4958_9ca8_c4795ef420b3(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_c9039314_5fbc_45d1_936a_ce7a46246cfd(ArrayList<Integer> arr) {
        int count = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
                if(arr.get(i) > arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_24bc0e20_5d9b_40fc_b5fd_30faa8dc339e(ArrayList<Integer> arr) {
        if (arr.isEmpty()){
            return 0;
        }

        int minVal = arr.get(0);
        int invCount = 0;

        // Find minimum
        for(int i = 1; i < arr.size(); i++){
            if(arr.get(i) < minVal){
                minVal = arr.get(i);
            }
        }
        // Find count of each inversion
        for (int inv = minVal; inv <= arr.size(); inv++) {
            invCount += (arr.size() - inv + 1) * Math.log(arr.size() - inv + 1);
        }
        return invCount;
    }

    
    public static int getInvCount_Problem_1_60dc9e26_93a2_4320_81a9_3dcaa74b5e8d(ArrayList<Integer> arr) {
        int result = 0;
        for (int i : arr) {
            if (arr.indexOf(i) > arr.lastIndexOf(i)) {
                result++;
            }
        }
        return result;
    }

    
    public static int getInvCount_Problem_1_0f0574bf_acab_492c_8df5_fb7abdc61c5d(ArrayList<Integer> arr) {
        int leng = arr.size();
        int invCount = 0;
        for(int i = 0; i < leng; i++) {
            for(int j = i+1; j < leng; j++) {
                if(arr.get(i) < arr.get(j)) {
                    invCount++;
                }
            }
        }
        return invCount;
    }

    
    public static int getInvCount_Problem_2_c7170404_055c_475c_b435_608d0dad7cf7(ArrayList<Integer> arr) {
        int count = 0;
        int temp;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) > arr.get(j)) {
                    temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_77f66888_5794_44f5_96b0_5f41ff7731ef(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_03a6daf8_2c90_41d0_ae6e_f9e9b8f3a0a7(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_6e3d3190_5448_4e7d_979f_bc91875910e4(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_489ad2b3_d481_447f_8305_39bf77485e51(ArrayList<Integer> arr) {
        // Your code here
        int count = 0L;
        for(int i = 0; i < arr.size(); i++){
            for(int j = i+1; j < arr.size(); j++){
                if(arr.get(i) > arr.get(j)){
                    count += arr.get(j) - arr.get(i);
                    arr.remove(j);
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_74953037_293e_4705_ad91_0b81a08feeb2(ArrayList<Integer> arr) {
        // Write a java program to implement this function
        int left = 0L, right = 0L;
        int count = 0L;
        for (Integer value : arr) {
            left += value;
            right -= value;
            if (left < right)
                ++count;
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_b149015b_7b3e_4593_9749_a2f67ddd5d6e(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_03db18a5_b8c7_4d93_816e_7e1b92f68198(ArrayList<Integer> arr) {
        int n = arr.size();
        int count = 0;
        int end = arr.size()-1;
        for (int i = 0; i <= end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if (arr.get(i) > arr.get(j)) {
                    count++;
                    arr.remove(i--);
                    arr.remove(j--);
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_77f66888_5794_44f5_96b0_5f41ff7731ef(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_adbfcacb_7a84_4bae_b728_1e32ab9cf907(ArrayList<Integer> arr) {
        int count = arr.get(0); // first number is the count of inversions
        for(int i = 1; i < arr.size(); i++) {
            int temp = arr.get(i);
            while(temp != arr.get(i - 1)) {
                count--;
                temp--;
            }
            count++;
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_0f0574bf_acab_492c_8df5_fb7abdc61c5d(ArrayList<Integer> arr) {
        int leng = arr.size();
        int invCount = 0;
        for(int i = 0; i < leng; i++) {
            for(int j = i+1; j < leng; j++) {
                if(arr.get(i) < arr.get(j)) {
                    invCount++;
                }
            }
        }
        return invCount;
    }

    
    public static int getInvCount_Problem_0_074fae26_0fb9_4a75_9c72_d05ad391ab2e(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_f4dd627c_a5dd_45d4_ab75_d6dff75e2b41(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_732bd6ff_2bf0_4c56_8f70_b2772f4766ea(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_635fdb1e_e8ff_4430_a46b_3b3849bc7b2e(ArrayList<Integer> arr) {
        int low = arr.size()-1;
        int high = arr.size()-1;
        for(int i=low; i>=0; i--){
            for(int j=low; j<high; j++){
                if(arr.get(j) < arr.get(i)){
                    low = j;
                }
                else{
                    high = j;
                }
            }
        }
        return high - low;
    }

    
    public static int getInvCount_Problem_0_938194f0_cde6_4c98_af48_4e6056167a52(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_b36497e3_6e5d_4de1_899a_e33abfcc4bff(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_03396777_143c_43e0_8eee_df4a949df49f(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_8ccbded5_8614_4cb1_ab35_115ec68b6509(ArrayList<Integer> arr) {
        int count = 0;
        int l1 = arr.get(0);
        int l2 = arr.get(1);
        int i1, i2;
        for(int i = 2; i < arr.size(); i++) {
            i1 = arr.get(i);
            i2 = arr.get(i-1);
            if(i1 < i2) {
                count += (i2 - i1 + 1);
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_3b3d30ff_70ed_4c2b_a471_d2a15b540499(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_6298155f_ce38_4d7b_ac04_f00baa538fc0(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_33febc67_31d5_43f8_a59d_2fc6ae6750cf(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_02eafaad_1d88_4f24_9cd7_d7c4e6578fe8(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_e1e92987_d369_4b93_ad4e_f6c506abd66a(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_ef0f4a89_7f55_482a_ba24_b8efeb76a88d(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_e5c3924c_1f89_493e_b745_4b9f1e923a0f(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_44b81345_33d8_479a_b639_ef66611e4cd5(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_0a2f79a5_b4ae_40b0_8db2_3f29b8997725(ArrayList<Integer> arr) {
        // Return the number of inversions.
        int n = 0;
        for (int i = 0; i < arr.size(); i++) {
            int j = i + 1;
            while (j < arr.size() && arr.get(j) > arr.get(i)) {
                j++;
            }
            if (j - i > 1) {
                n = n + j - i;
            }
        }
        return n;
    }

    
    public static int getInvCount_Problem_1_a85ef941_b9e2_4aa2_b639_f6395376da8d(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_76f5ee0d_699f_4736_899e_fff4c605e04d(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_e5be32b5_02af_47d9_b309_5dcb21199b1e(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_cbb7ee57_5746_4946_9683_52169f681e22(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_dc6bfd59_5579_45f9_8fb3_d982bc8eced7(ArrayList<Integer> arr) {
        int count = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) > arr.get(i + 1)) {
                count++;
                arr.remove(i + 1);
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_9b62eda4_1fd0_4fe3_8a0a_7998cf630389(ArrayList<Integer> arr) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_5ca7e2ce_f22a_4958_9ca8_c4795ef420b3(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_8eb8f408_bca1_4c69_908b_ff61057f0aa9(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_26aaf0cf_4150_4420_a7d0_b8a4bff91331(ArrayList<Integer> arr) {
        int count = 0;
        // use java streams to compute result
        return IntStream.range(0, arr.size()).filter(i -> arr.get(i) < 0).count();
    }

    
    public static int getInvCount_Problem_1_2fa64175_8397_47a4_8cd6_02b3a6a9f1a7(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_24cc1571_6a73_49a3_b2ab_3c734bb005fb(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_b27f7722_8bbc_4e91_84a9_2848f2887196(ArrayList<Integer> arr) {
        int count = 0L;
        for (int elem : arr) {
            if (elem > 0)
                count += 1;
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_7cebf909_f64b_4b56_aad6_fa1f0cc6d9fd(ArrayList<Integer> arr) {
        return arr.stream().collect(Collectors.groupingBy(a -> Math.abs(a)))
                .values().stream().collect(Collectors.counting());
    }

    
    public static int getInvCount_Problem_2_ad1f9a77_fda0_4b7d_a241_41a900d1761e(ArrayList<Integer> arr) {
        int count = 0;
        for (Integer i : arr)
            count += i;
        return count;
    }

    
    public static int getInvCount_Problem_2_c9a863de_c6ac_4272_a583_0abb8b4f7b02(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_10e62b1b_efaa_46e2_a0ec_58e911377bc2(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_36ec647e_9d98_41db_bca1_c543aecfeedd(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_90501473_e403_4316_ae5b_51e09a2fe9b2(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_0e9e830a_8b55_474a_bce9_79801d80dcf7(ArrayList<Integer> arr) {
        int n = arr.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr.get(i) > arr.get(j)) {
                    int temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
        return sum;
    }

    
    public static int getInvCount_Problem_1_0a1d84e6_7f0f_4acd_9865_7f3e800bbbb5(ArrayList<Integer> arr) {
        int count = 0;
        for (int i=0; i<arr.size()-1; i++) {
            for (int j=i+1; j<arr.size(); j++) {
                if (arr.get(i)>arr.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_a1ebf752_58b1_4335_90cc_a2e26c32fb3a(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_770dac54_b284_4eab_8a2f_8e97dc777588(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_dda6b85f_897b_4045_b7b0_363ede7e9196(ArrayList<Integer> arr) {
        int count = 0;
        for (Integer l : arr) {
            count += (l > 0 ? 1 : -1);
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_04a6dcbd_e1fe_4056_82e9_5aab3fba08d1(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    inv_count++;
                }
            }
        }
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_d3c20f8f_aa2b_4691_a129_1ab85152e30f(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_3b0b1b9a_0681_4511_9ea9_5717b15bdbdd(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_b6a88340_5e84_4eae_b971_ad0c72dccbc5(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_56136a36_4f20_4756_a547_e66df60b4b48(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_635fdb1e_e8ff_4430_a46b_3b3849bc7b2e(ArrayList<Integer> arr) {
        int low = arr.size()-1;
        int high = arr.size()-1;
        for(int i=low; i>=0; i--){
            for(int j=low; j<high; j++){
                if(arr.get(j) < arr.get(i)){
                    low = j;
                }
                else{
                    high = j;
                }
            }
        }
        return high - low;
    }

    
    public static int getInvCount_Problem_0_0fb55bb2_598d_4780_bf65_500677a79f3d(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    inv_count++;
                }
            }
        }
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_159470ae_abec_40ce_9af0_8fd3ff992943(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_6c90dc6a_a113_4f94_9207_141ab4892001(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_e748f87a_34e3_45ef_b7ae_ed5be6fff5fb(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_10cdff8a_b736_426f_9c7c_58fc0fe27757(ArrayList<Integer> arr) {
        int count = 0;
        Integer curr = arr.get(0);
        boolean first = True;
        for(int i = 1; i < arr.size(); i++) {
            Integer next = arr.get(i);
            if(curr < next) {
                count++;
            }
            curr = next;
            first = False;
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_91516c3c_b798_4418_98bb_4ca8b57df812(ArrayList<Integer> arr) {
        int n = arr.size();
        int inv_count = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_dda6b85f_897b_4045_b7b0_363ede7e9196(ArrayList<Integer> arr) {
        int count = 0;
        for (Integer l : arr) {
            count += (l > 0 ? 1 : -1);
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_de651cea_c205_4efb_a73a_a9a7589759a4(ArrayList<Integer> arr) {
        int count = 0L;
        for(int i=0;i<arr.size()-1;i++) {
            for(int j=i+1;j<arr.size();j++) {
                int a = arr.get(i);
                int b = arr.get(j);
                if(a > b) {
                    count++;
                    arr.set(i, b);
                    arr.set(j, a);
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_c0c05dee_4c15_489a_be16_6d54696b0ab2(ArrayList<Integer> arr) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int curr = arr.get(i);
            for (int j = i + 1; j < arr.size(); j++) {
                if (curr <= arr.get(j)) {
                    arr.set(i, arr.get(j));
                    arr.set(j, curr);
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_cc7f3c22_2fd5_4bec_9b98_4aa5907ec7be(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_9d82355a_d022_4415_8206_2db516cd08de(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_a911abab_9659_4631_b291_0e98a5d4d554(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_bb5fb170_7b15_4555_9aa3_06fcadf39ab0(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_159470ae_abec_40ce_9af0_8fd3ff992943(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_938194f0_cde6_4c98_af48_4e6056167a52(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_864bc293_47eb_4889_acf8_e7a4c5f9a610(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_6be9073c_6091_4195_8eed_81eba1ef66fc(ArrayList<Integer> arr) {
        int count = 0; // to keep track of inversions
        for (int i : arr) {
            for (int j : arr) {
                if (i == j) {
                    continue;
                }
                if (i < j) {
                    if (arr.contains(i + 1)) {
                        count++;
                    }
                }
                if (j < i) {
                    if (arr.contains(j + 1)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_7cebf909_f64b_4b56_aad6_fa1f0cc6d9fd(ArrayList<Integer> arr) {
        return arr.stream().collect(Collectors.groupingBy(a -> Math.abs(a)))
                .values().stream().collect(Collectors.counting());
    }

    
    public static int getInvCount_Problem_0_201bcd52_942c_40e2_913b_3593f2ee5310(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_e10a2f82_e777_431a_95e0_0389c7a299d2(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_0fb55bb2_598d_4780_bf65_500677a79f3d(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    inv_count++;
                }
            }
        }
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_0a2f79a5_b4ae_40b0_8db2_3f29b8997725(ArrayList<Integer> arr) {
        // Return the number of inversions.
        int n = 0;
        for (int i = 0; i < arr.size(); i++) {
            int j = i + 1;
            while (j < arr.size() && arr.get(j) > arr.get(i)) {
                j++;
            }
            if (j - i > 1) {
                n = n + j - i;
            }
        }
        return n;
    }

    
    public static int getInvCount_Problem_1_f4dd627c_a5dd_45d4_ab75_d6dff75e2b41(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_60dc9e26_93a2_4320_81a9_3dcaa74b5e8d(ArrayList<Integer> arr) {
        int result = 0;
        for (int i : arr) {
            if (arr.indexOf(i) > arr.lastIndexOf(i)) {
                result++;
            }
        }
        return result;
    }

    
    public static int getInvCount_Problem_1_1f9deb19_93ad_43b9_bc83_d8067dadd7b9(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_38a0cd26_44cc_433b_9db7_d299da60e239(ArrayList<Integer> arr) {
        int inversions = 0;
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            int a = arr.get(i);
            int j = 0;
            while (j++ < i && a > arr.get(j)) {
                j++;
            }
            int k = j;
            while (k++ < i && a < arr.get(k)) {
                k++;
            }
            inversions += (j - k + 1);
        }
        return inversions;
    }

    
    public static int getInvCount_Problem_2_3f71f414_6c3a_42e5_86dd_fba67c9153b3(ArrayList<Integer> arr) {
        int invCount = 0;
        for (int x : arr) {
            for (int y = arr.size(); y > 0; y--) {
                if (arr.get(y) != x && arr.get(y) > x) {
                    invCount = invCount + 1;
                    break;
                }
            }
        }
        return invCount;
    }

    
    public static int getInvCount_Problem_1_eacef685_519d_41f6_bc9a_3a184c847476(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_3cb42273_aef2_416c_941b_136f1ff4340f(ArrayList<Integer> arr) {
        int invCount = 0;
        // Write a for loop to count inversions.
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > arr.get(i - 1)) {
                invCount += 1;
            }
        }
        return invCount;
    }

    
    public static int getInvCount_Problem_0_043b9a23_85c5_4d47_a9af_3d9192a319fc(ArrayList<Integer> arr) {
        int count = 0;
        for(int i: arr) {
            if( i >= 0) {
                count = count + 1;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_4514f380_cf54_416a_9db2_c97cebf3b891(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_c03de8c5_58d6_459e_9916_023609478352(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_735ec4a3_7846_465a_98c9_20fe79b311cb(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_2459b360_dc15_471f_ade0_f74444916507(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_0a2f79a5_b4ae_40b0_8db2_3f29b8997725(ArrayList<Integer> arr) {
        // Return the number of inversions.
        int n = 0;
        for (int i = 0; i < arr.size(); i++) {
            int j = i + 1;
            while (j < arr.size() && arr.get(j) > arr.get(i)) {
                j++;
            }
            if (j - i > 1) {
                n = n + j - i;
            }
        }
        return n;
    }

    
    public static int getInvCount_Problem_2_a911abab_9659_4631_b291_0e98a5d4d554(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_b765e693_6935_4eb7_8923_b7431676d8f7(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_a1ebf752_58b1_4335_90cc_a2e26c32fb3a(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_44b81345_33d8_479a_b639_ef66611e4cd5(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_1028df7b_32ec_4b86_984e_4da8e5d0d3c1(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    sum = sum + 1;
                    Collections.swap(arr, i, j);
                }
            }
        }
        return sum;
    }

    
    public static int getInvCount_Problem_0_500d6e69_d7ea_422d_b103_d51bd7d7169f(ArrayList<Integer> arr) {
        int n = arr.size();
        int inv_count = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_9e9f49db_8328_4033_b3a3_ee44a40ba5ca(ArrayList<Integer> arr) {
        return arr.stream().filter(x->{
            boolean inv = True;
            for (int i = 0; i<arr.size()-1; i++) {
                if (x<arr.get(i)) {
                    inv = False;
                    break;
                }
            }
            return inv;
        }).count();
    }

    
    public static int getInvCount_Problem_2_38a0cd26_44cc_433b_9db7_d299da60e239(ArrayList<Integer> arr) {
        int inversions = 0;
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            int a = arr.get(i);
            int j = 0;
            while (j++ < i && a > arr.get(j)) {
                j++;
            }
            int k = j;
            while (k++ < i && a < arr.get(k)) {
                k++;
            }
            inversions += (j - k + 1);
        }
        return inversions;
    }

    
    public static int getInvCount_Problem_1_489ad2b3_d481_447f_8305_39bf77485e51(ArrayList<Integer> arr) {
        // Your code here
        int count = 0L;
        for(int i = 0; i < arr.size(); i++){
            for(int j = i+1; j < arr.size(); j++){
                if(arr.get(i) > arr.get(j)){
                    count += arr.get(j) - arr.get(i);
                    arr.remove(j);
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_60f34f32_bad4_45af_a505_53c241b2a81a(ArrayList<Integer> arr) {
        int n = arr.size();
        int inv = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j > 0; j--) {
                if (arr.get(j) > arr.get(j - 1)) {
                    inv++;
                }
            }
        }
        return inv;
    }

    
    public static int getInvCount_Problem_2_59d48fc9_549c_4735_b8ce_03d4ec134452(ArrayList<Integer> arr) {
        // Write your code here.
        return 0;
    }

    
    public static int getInvCount_Problem_1_275fea94_6e89_4c2d_bef8_35138084487d(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_c46c19e6_a360_48b4_9b2d_76ff16b60179(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_ef0f4a89_7f55_482a_ba24_b8efeb76a88d(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_26aaf0cf_4150_4420_a7d0_b8a4bff91331(ArrayList<Integer> arr) {
        int count = 0;
        // use java streams to compute result
        return IntStream.range(0, arr.size()).filter(i -> arr.get(i) < 0).count();
    }

    
    public static int getInvCount_Problem_1_0722a92b_7378_4b56_ac32_206176f083f3(ArrayList<Integer> arr) {
        int n = arr.size();
        int inv_count = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_37f0b8de_1611_4071_aa3b_1423802d7d6c(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_cbb7ee57_5746_4946_9683_52169f681e22(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_c9ee5997_3aae_4f51_bbff_447ba5c58e23(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_348ceae7_45e4_45e0_95b9_229ee78fad91(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_185c953b_53c3_4d15_8900_7b3877136476(ArrayList<Integer> arr) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j > 0; j--) {
                if (arr.get(j - 1) < arr.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_16950f86_145e_4170_8220_8286357d1054(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_eaac5f1f_8707_4193_a911_8331af345746(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_9e9f49db_8328_4033_b3a3_ee44a40ba5ca(ArrayList<Integer> arr) {
        return arr.stream().filter(x->{
            boolean inv = True;
            for (int i = 0; i<arr.size()-1; i++) {
                if (x<arr.get(i)) {
                    inv = False;
                    break;
                }
            }
            return inv;
        }).count();
    }

    
    public static int getInvCount_Problem_2_b5fa272a_50ac_4255_84d4_d2ce166e5e3d(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_b0f37ccb_a1d5_4b0c_ada9_fe4fc8039031(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_661dec25_c446_486e_9d26_8bda002133b2(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_e5ff483d_9d77_4fae_8a6a_f030c7086706(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_6dc11064_4a3b_4e62_89fc_e45edac7c24a(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_f064c456_c4d7_4a7e_9ac9_466b7772ab1b(ArrayList<Integer> arr) {
        int invCount = 0;
        for (int i = 0; i < arr.size(); i++) {
            int j = (i + 1) % arr.size();
            if (arr.get(i) > arr.get(j)) {
                int tmp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, tmp);
                invCount++;
            }
        }
        return invCount;
    }

    
    public static int getInvCount_Problem_2_f8162f16_73e8_4b65_9a71_dd42c2c312f9(ArrayList<Integer> arr) {
        int n = arr.size();
        int inv_count = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_e748f87a_34e3_45ef_b7ae_ed5be6fff5fb(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_8fd0f733_0d4c_4ca9_9171_b3a287a83acd(ArrayList<Integer> arr) {
        int count = 1;
        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i< arr.size(); i++){
            int j = i;
            while (j > 0) {
                if (arr.get(j) < arr.get(j - 1)) {
                    temp.add(arr.get(j));
                    arr.remove(j);
                } else {
                    break;
                }
                j--;
            }
        }
        for (Integer i : temp) {
            count++;
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_7a5aeaaf_2c2f_44b2_a5cc_037f978b230d(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_3b0b1b9a_0681_4511_9ea9_5717b15bdbdd(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_f4dd627c_a5dd_45d4_ab75_d6dff75e2b41(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_661dec25_c446_486e_9d26_8bda002133b2(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_18663dc2_0682_4641_9c02_1e7edb03be98(ArrayList<Integer> arr) {
        if (arr.size() <= 1) return 0;
        int inv_count = 0;
        int firstInv = arr.get(0); // the minimum value
        int secondInv = arr.get(arr.size() - 1); // the maximum value
        int currentInv = firstInv;
        for (int i = 1; i < arr.size(); i++) {
            if (currentInv > secondInv) {
                inv_count++;
                currentInv = arr.get(i);
            } else {
                break;
            }
        }
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_54f5fcb7_b3d4_4a31_a9ce_9117d47b130d(ArrayList<Integer> arr) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) > arr.get(j)) {
                    count += 1;
                    arr.remove(i);
                    arr.remove(j);
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_f1681f42_79b1_4026_922b_2ec3dd84b4f4(ArrayList<Integer> arr) {
        int inversions = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i+1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    arr.remove(i);
                    inversions++;
                }
            }
        }
        return inversions;
    }

    
    public static int getInvCount_Problem_2_a10103cd_128e_42f9_a859_0ecd1ae25f9c(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_71a2b533_d8e0_43ce_9089_8b801f1651a4(ArrayList<Integer> arr) {
        // Initialize some variables we will need.
        int count = 0;
        int sum = 0;
        int temp = arr.get(0);
        // Iterate through the arraylist backwards, starting at the end.
        for (int i = arr.size()-1; i >= 0; i--) {
            // If the current number is not greater than the one before it, add one to the count. Otherwise, subtract one from the count.
            if (arr.get(i) < temp) {
                count++;
            } else {
                count--;
            }
            // Add the current number to the sum.
            sum += arr.get(i);
            // Finally, store the current number as the current temporary number for comparison.
            temp = arr.get(i);
        }
        // Return the count
        return count;
    }

    
    public static int getInvCount_Problem_1_236ec4e3_4eae_4f14_b8b8_ffb648590d85(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_46b43c4e_a3a1_4ecf_91cc_e2dc076a0254(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_0e9e830a_8b55_474a_bce9_79801d80dcf7(ArrayList<Integer> arr) {
        int n = arr.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr.get(i) > arr.get(j)) {
                    int temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
        return sum;
    }

    
    public static int getInvCount_Problem_2_8fd0f733_0d4c_4ca9_9171_b3a287a83acd(ArrayList<Integer> arr) {
        int count = 1;
        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i< arr.size(); i++){
            int j = i;
            while (j > 0) {
                if (arr.get(j) < arr.get(j - 1)) {
                    temp.add(arr.get(j));
                    arr.remove(j);
                } else {
                    break;
                }
                j--;
            }
        }
        for (Integer i : temp) {
            count++;
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_70f95bca_48c4_4c60_a0f9_6bb4bef64e66(ArrayList<Integer> arr) {
        // Write your Java code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_068dd061_af2b_4811_b65a_8b28898466ca(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_c89f19f9_1ff9_4b21_900b_73d676f6b4e4(ArrayList<Integer> arr) {
        int invCount = 0;
        int left,right;

        if (arr.size() == 0) {
            return invCount;
        }

        for (int i = 1; i < arr.size(); i++) {
            left = arr.get(i - 1);
            right = arr.get(i);
            if (left > right) {
                invCount++;
            }
        }

        return invCount;
    }

}
