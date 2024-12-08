package mbpp_223_is_majority;

public class mbpp_223_is_majority {

    
    public static boolean isMajority_Problem_2_64b56b60_5f8b_41d1_873b_cebbbb1019c7(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_707bb5fc_0c32_45e1_a65f_70635eccd8aa(ArrayList<Integer> arr, int n, int x) {
        boolean result = False;

        // Write the code here
        
        return result;
    }

    
    public static boolean isMajority_Problem_2_26b341e2_4598_4e87_ae90_79fcfcdd7fb4(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_0_4317ab3b_67fa_42e2_8272_156a5b0fe7f6(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) count++;
        }
        if (count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_dd8467d2_0bf0_4fe8_860a_c3e5b694a581(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_3274ded1_99cc_41fa_8af5_66eb759aed44(ArrayList<Integer> arr, int n, int x) {
        return arr.stream().distinct().count() < n/2;
    }

    
    public static boolean isMajority_Problem_2_dedcb0a6_01db_4c70_a3f5_4943edd9e377(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        return False; // change to True
    }

    
    public static boolean isMajority_Problem_2_1b903c6e_04c0_4ff6_9a53_ecc48f4f2274(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_1812f420_26fa_4562_b0fe_008e1892624e(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_0_f6565038_eff2_436b_b74a_453775906688(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_780be07b_6ae2_4ffe_a362_79c84bfdcfda(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_3_f049a33e_b5c5_4fcb_9359_8c6e0f56d09e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_b812a1b0_15a2_490a_991d_8b4054ebeb9b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_e5cac708_d7bd_417d_babc_927c5c45b248(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_b3096296_6640_4aef_b3f6_66c4dc9d1226(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_e333533e_966e_4076_833e_f4fb2c7f7b82(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_4317ab3b_67fa_42e2_8272_156a5b0fe7f6(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) count++;
        }
        if (count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_a7bb45d4_79c6_49c0_8a7f_509227d612b5(ArrayList<Integer> arr, int n, int x) {
        return (n/2) >= arr.stream().filter(e -> e == x).count();
    }

    
    public static boolean isMajority_Problem_2_f8b573b0_d9b1_4604_a651_76ed90112829(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_31ee6ee6_bba7_419d_ae8b_eea74c4d23be(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i : arr) {
            if(i == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_ed675725_e1a8_46fd_8710_993fdb2facf2(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_0866a7fe_f7b2_4dfd_8867_632e4cc2b0c9(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_2b938f27_fd7a_48ec_91d3_725a952d5267(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count >= n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_de61900b_b73b_4b5e_beb6_847c76f980d8(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int y: arr) {
            if(y == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_0_1fb835d1_6038_4d12_941e_cd83c27c23ba(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        for(Integer l : arr) {
            if(l == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_ca18cc93_86e2_4d43_bb93_50d6ff5e9e2c(ArrayList<Integer> arr, int n, int x) {
        //write your code in here
        return False;
    }

    
    public static boolean isMajority_Problem_1_4317ab3b_67fa_42e2_8272_156a5b0fe7f6(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) count++;
        }
        if (count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_c8c4b125_2d95_4266_9035_4a2f64ac9408(ArrayList<Integer> arr, int n, int x) {
        if (arr.isEmpty() || n <= 0) {
            return False;
        }
        int prevNum = 0, currNum = 0, flag = 0;
        int len = arr.size();
        if (len == 1) {
            if (arr.get(0) == x) {
                return True;
            }
            return False;
        }
        for (int i = 0; i < len - 1; i++) {
            if (arr.get(i) == x) {
                prevNum = arr.get(i);
                currNum = arr.get(i + 1);
                flag = 0;
            } else if (currNum == x) {
                currNum = arr.get(i + 1);
                flag = 1;
            } else if (prevNum < x && currNum < x) {
                currNum = arr.get(i + 1);
                flag = 1;
            }
            if (prevNum == x && currNum == x && flag == 0) {
                return True;
            } else if (prevNum == x && currNum == x && flag == 1) {
                prevNum = arr.get(i);
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_adf992ef_46d1_49fe_bc26_930187c00920(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i=0; i<arr.size(); i++) {
            if(arr.get(i) == x) count++;
        }
        if(count%2 == 0) return True;
        else return False;
    }

    
    public static boolean isMajority_Problem_3_6bc72cfa_4447_4a6a_a11d_4a4b0520ec2e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_2_2b938f27_fd7a_48ec_91d3_725a952d5267(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count >= n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_67363c89_a5a4_42de_a750_301ecf1be236(ArrayList<Integer> arr, int n, int x) {
        ArrayList<Integer> arrayList = new ArrayList<>(arr);
        Collections.sort(arrayList);
        return arrayList.size() > n/2 && arrayList.contains(x);
    }

    
    public static boolean isMajority_Problem_2_344def4d_18f1_4417_b1a5_9b2299272c2d(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_e5b37cd1_088b_434b_9269_d987e321290e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        int prev = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
                if (count > n/2) {
                    return True;
                }
            }
            else {
                count = 1;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_f8b573b0_d9b1_4604_a651_76ed90112829(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_57dd38fc_4ea8_4d8c_9264_2382c0e25b03(ArrayList<Integer> arr, int n, int x) {
        int j = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                max++;
            } else {
                if (max > arr.size() / 2) {
                    max = arr.size() / 2;
                    j = i;
                }
            }
        }
        return max == arr.size() / 2;
    }

    
    public static boolean isMajority_Problem_1_707bb5fc_0c32_45e1_a65f_70635eccd8aa(ArrayList<Integer> arr, int n, int x) {
        boolean result = False;

        // Write the code here
        
        return result;
    }

    
    public static boolean isMajority_Problem_2_d8b88c84_3f3f_4ce7_90db_064526ba9c97(ArrayList<Integer> arr, int n, int x) {
        boolean isMajority_Problem_2_d8b88c84_3f3f_4ce7_90db_064526ba9c97 = False;
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > (n/2L)) {
            isMajority_Problem_2_d8b88c84_3f3f_4ce7_90db_064526ba9c97 = True;
        }
        return isMajority_Problem_2_d8b88c84_3f3f_4ce7_90db_064526ba9c97;
    }

    
    public static boolean isMajority_Problem_3_513b2c1e_e902_44eb_b3f2_993823b6184f(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else {
                if (i == j) {
                    return False;
                }
                if (arr.get(i) > arr.get(j)) {
                    j--;
                } else {
                    i++;
                }
            }
        }
        return i > n/2;
    }

    
    public static boolean isMajority_Problem_2_3d161bbe_6122_4479_886f_6fc816ff76c1(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_9f1a9176_1430_4b84_b1b3_1978260964aa(ArrayList<Integer> arr, int n, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int mid = (low + high) / 2;
        while (low <= high) {
            if (arr.get(mid) == x) {
                if (mid + n / 2 < arr.size() && arr.get(mid + n / 2) == x) {
                    return True;
                } else {
                    return False;
                }
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            mid = (low + high) / 2;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_d07257ab_9a6e_4278_a1a1_000b5469d129(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i : arr) count += i;
        if(count > n/2)
            return False;
        for(int i : arr) count -= i;
        if(count == n/2) return True;
        return False;
    }

    
    public static boolean isMajority_Problem_2_7709275a_5985_4199_8a60_3913be7ab762(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) == x){
                count++;
            }
        }
        if(count > n/2){
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_51dc0151_8455_46ee_a7ff_628d8ea4ae44(ArrayList<Integer> arr, int n, int x) {
        boolean found = False;
        for (int i : arr) {
            if (i == x) {
                if (n > arr.size() / 2) {
                    found = True;
                    break;
                }
            } else {
                if (i < x) {
                    found = True;
                    break;
                }
            }
        }
        return found;
    }

    
    public static boolean isMajority_Problem_3_41919845_9aae_49b0_9c36_4a449a7d4e2c(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(Integer i: arr) {
            if(i == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_e5cac708_d7bd_417d_babc_927c5c45b248(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_68031b4f_dac6_498c_87c1_bddc31d19f24(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_d13fe193_7705_4559_9fd1_f302abe6625a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_2_4317ab3b_67fa_42e2_8272_156a5b0fe7f6(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) count++;
        }
        if (count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_423729c9_ad5a_4743_ac56_887e53583e93(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_cbac1d2d_f9fc_49cb_9f3b_edce74b7c75a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_ea551cee_aa7c_43d3_964b_7bcfd60abc58(ArrayList<Integer> arr, int n, int x) {
        ArrayList<Integer> majority = new ArrayList<>();
        int currentMajority = 0;
        int count = 0;
        for (int i : arr) {
            if (i == x && count != 0) {
                majority = arr;
                currentMajority = majority.get(majority.size() - 1);
            }
            if (i == x && count == 0) {
                count++;
            }
            if (i == currentMajority) {
                count++;
            } else {
                count--;
            }
        }
        return count%2==1;
    }

    
    public static boolean isMajority_Problem_0_72201da0_80b4_421d_ba02_f0e019fdac48(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i : arr) {
            if(i == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_2_24c797e4_26a6_47e6_8ae0_66c93ca7dae8(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_1c547641_9ce8_44fe_8f2a_dc1edd695614(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count >= n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_f8e70df2_3b8c_462d_81f1_3cd0f15ca12f(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_75fd629c_abf9_49d7_b400_6607008b1a02(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2)
            return True;
        else
            return False;
    }

    
    public static boolean isMajority_Problem_1_3d6e9036_ecaa_4af5_88f9_75e8be080389(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count > n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_3220d15b_7c66_49a6_93e0_819375411d41(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_543ceab6_9ecc_45da_9025_73f1010b0251(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_2ccf13a7_2e49_4ec7_9fd0_b6466d77c438(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        boolean isMajority_Problem_0_2ccf13a7_2e49_4ec7_9fd0_b6466d77c438 = False;

        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            isMajority_Problem_0_2ccf13a7_2e49_4ec7_9fd0_b6466d77c438 = True;
        }
        return isMajority_Problem_0_2ccf13a7_2e49_4ec7_9fd0_b6466d77c438;
    }

    
    public static boolean isMajority_Problem_2_3a65e4b2_893c_474e_b529_45a7db92cada(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_acff57aa_87aa_4acf_a4b4_c458f10fc6a5(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            count++;
            if (count > n) {
                count = 1;
            }
            if (arr.get(i) < x) {
                count = 1;
            }
            if (arr.get(i) == x) {
                count++;
            }
            if (arr.get(i) > x) {
                if (max < arr.get(i)) {
                    max = arr.get(i);
                }
            }
        }
        if (max < n) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_c237d233_fbba_4006_9a91_ea8bdfeabaec(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_e6422a58_8186_4ebd_8dfa_961c89aabdf3(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_ce55f810_d7ee_4839_b300_9eabf45ff278(ArrayList<Integer> arr, int n, int x) {
        boolean isMajority_Problem_1_ce55f810_d7ee_4839_b300_9eabf45ff278 = False;
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if ((count + 1 == (n/2))) {
            isMajority_Problem_1_ce55f810_d7ee_4839_b300_9eabf45ff278 = True;
        }
        return isMajority_Problem_1_ce55f810_d7ee_4839_b300_9eabf45ff278;
    }

    
    public static boolean isMajority_Problem_3_a5232e7d_2d8e_4bee_ab13_b3c03d1af665(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) { count++; }
        }
        if (count == n/2) { return True; }
        return False;
    }

    
    public static boolean isMajority_Problem_0_41b6f1a6_021c_418b_ad68_51307e6fd51c(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else if (arr.get(i) < x && arr.get(j) > x) {
                return True;
            } else {
                i++;
                j--;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_a03f55ac_33a0_4def_86b5_7ec3d1f2fb0c(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int a : arr)
        {
            if(a==x)
            {
                count++;
            }
            else
            {
                break;
            }
        }
        if(count>n/2)
        {
            return True;
        }
        else
        {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_72201da0_80b4_421d_ba02_f0e019fdac48(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i : arr) {
            if(i == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_2_5e8152d3_f9b8_4669_9bab_dfa3f96ec880(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_5d5614c9_9713_42df_9942_1ce069bba982(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count > n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_dfe714b6_adee_4c44_881c_4d3c5573a6ee(ArrayList<Integer> arr, int n, int x) {
        // code here
        int halfLength = arr.size() / 2;
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count == halfLength) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_2_7e0bf209_aca4_41d0_8ab6_1b20019e12dc(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count >= n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_9b63db75_86dc_45d0_986c_89746c8a6f93(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_c9e80326_7676_4924_a852_9570eb3a0131(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_ad747ca1_baea_4abb_b552_c2655937f0ba(ArrayList<Integer> arr, int n, int x) {
        return arr.stream().filter(x1 -> x1 > x / 2L).count() > n/2L;
    }

    
    public static boolean isMajority_Problem_3_40bac3f7_bc03_4e8d_9462_806e38a1817d(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_6bcea7c5_5a0d_473f_83c7_7b13a4266c43(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_2e81376d_0faf_4613_9de6_39d3fb8d592f(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else {
                if (i == j) {
                    return False;
                } else if (arr.get(i) > arr.get(j)) {
                    j--;
                } else {
                    i++;
                }
            }
        }
        return i > n / 2;
    }

    
    public static boolean isMajority_Problem_3_36205631_eab2_4b0a_afdd_bbd5c3806f75(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_22f68ecb_7239_485c_90de_577cd7f2f650(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_2_998b8dde_0e9d_40f5_a7d9_44dec07c05c9(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_21ba7e81_188c_46ee_a814_e73037590a6f(ArrayList<Integer> arr, int n, int x) {
        if (arr.size() == 0 || n == 0) {
            return False;
        }
        
        int count = arr.stream().filter(v -> v == x).count();
        
        if (count == 0) {
            return False;
        }
        
        if (count > n / 2) {
            return True;
        }
        
        return False;
    }

    
    public static boolean isMajority_Problem_1_dfe714b6_adee_4c44_881c_4d3c5573a6ee(ArrayList<Integer> arr, int n, int x) {
        // code here
        int halfLength = arr.size() / 2;
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count == halfLength) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_37143954_5e63_4169_841c_0cdb4621cdbd(ArrayList<Integer> arr, int n, int x) {
        boolean found = False;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x)
                found = True;
        }
        return found;
    }

    
    public static boolean isMajority_Problem_0_6bc72cfa_4447_4a6a_a11d_4a4b0520ec2e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_2_c2158a59_e6e0_4b71_aeb0_68bd0396961b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_c882b1c2_5fa0_4816_bf41_7b91b8fe7ec9(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_e5b37cd1_088b_434b_9269_d987e321290e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        int prev = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
                if (count > n/2) {
                    return True;
                }
            }
            else {
                count = 1;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_2f46a9ee_7710_48e9_b865_ef2765041c7f(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_35c820b8_efba_4eb8_8fd3_d57058f7c695(ArrayList<Integer> arr, int n, int x) {
        if (arr.size() < 2)
            return True;
        int count = 1;
        for (int i = 0; i < arr.size() - 1; i++)
            if (arr.get(i) >= x)
                count++;
        if (count == n/2)
            return True;
        else
            return False;
    }

    
    public static boolean isMajority_Problem_3_e3c07191_01f0_4015_8076_471110f6f3ee(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count >= n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_364f9d0a_6028_4804_b424_ab24b22cf5cd(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_6272167a_5658_484b_944b_ac1550cf311a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_0866a7fe_f7b2_4dfd_8867_632e4cc2b0c9(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_b72b692f_8c81_4c7c_86d3_3dca09650932(ArrayList<Integer> arr, int n, int x) {
        int max1 = -1L;
        int max2 = -1L;
        for(int i = 0; i <= arr.size(); i++) {
            if(i == 0) {
                max1 = arr.get(i);
            } else {
                max2 = arr.get(i);
                if(max1 > max2) {
                    max2 = max1;
                }
            }
        }
        if(max1 != -1) {
            int counter = 0;
            for(int i = arr.size(); i > 0; i--) {
                counter++;
                if(arr.get(i - 1) == max2) {
                    break;
                }
            }
            if(counter > n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_8f7433e2_bd6e_4b6e_973d_5017c75639c1(ArrayList<Integer> arr, int n, int x) {
        // Your code here
        int c = 0;
        boolean b = False;
        for(int i = 0 ; i < arr.size() ; i++) {
            if(arr.get(i) == x) {
                c++;
            }
        }
        if (c == n/2) {
            b = True;
        }
        return b;
    }

    
    public static boolean isMajority_Problem_0_ad6cd81e_907a_486e_a4dd_0007b1e03cff(ArrayList<Integer> arr, int n, int x) {
        int counter = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                counter++;
            }
        }
        return counter > n / 2;
    }

    
    public static boolean isMajority_Problem_1_232a8be0_73bd_4458_9e02_80079f4e65fe(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_849200bb_8378_4472_b897_a0cffc004ce3(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr.get(mid) == x) {
                i = mid + 1;
            } else if (arr.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i > n / 2;
    }

    
    public static boolean isMajority_Problem_3_67363c89_a5a4_42de_a750_301ecf1be236(ArrayList<Integer> arr, int n, int x) {
        ArrayList<Integer> arrayList = new ArrayList<>(arr);
        Collections.sort(arrayList);
        return arrayList.size() > n/2 && arrayList.contains(x);
    }

    
    public static boolean isMajority_Problem_1_05dc35a4_d239_4d41_92ae_21213310f4b8(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_638db077_1be6_45c1_917e_07bdc21f6a62(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_2f46a9ee_7710_48e9_b865_ef2765041c7f(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_9b2b4aef_fa4a_49dc_b6be_fa4278ef73aa(ArrayList<Integer> arr, int n, int x) {
        // Initialize and set counter and count to 0
        int count = 0;
        int counter = 0;

        // Initialize to False, since the first element is not majority element
        boolean result = False;

        // For each element
        for (int element : arr) {
            // Increment counter
            counter++;
            // If counter is equal to n
            if (counter == n) {
                // Set the flag to True
                result = True;
                // Stop the for loop
                break;
            }
            // Increment count
            count++;
        }
        // Return result
        return result;
    }

    
    public static boolean isMajority_Problem_2_73e4d761_83bc_4400_9888_ca8544edd244(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (Integer i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > (n/2);
    }

    
    public static boolean isMajority_Problem_0_05dc35a4_d239_4d41_92ae_21213310f4b8(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_bbbc4097_6f8e_4c2a_afb2_5f9b4e6ce6bc(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            if (arr.get(i) == x) {
                i++;
                continue;
            }
            if (arr.get(j) == x) {
                j--;
                continue;
            }
            if (i == j) {
                return False;
            }
            if (arr.get(i) > arr.get(j)) {
                i++;
            } else {
                j--;
            }
        }
        return i > n / 2;
    }

    
    public static boolean isMajority_Problem_0_8ec56bdb_ed6e_4ed7_b048_3890b41eb0e5(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_a1a48e09_7397_4e16_b9d1_864a304a63e8(ArrayList<Integer> arr, int n, int x) {
        ArrayList<Integer> copy = new ArrayList<>(arr);
        Collections.sort(copy);
        if (copy.size() > n/2) return False;
        int counter = 0;
        for (int item : copy) {
            if (item == x) return True;
            counter++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_fafd0d36_68a7_4dcf_830f_07dfa9b18e2a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_2ccf13a7_2e49_4ec7_9fd0_b6466d77c438(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        boolean isMajority_Problem_2_2ccf13a7_2e49_4ec7_9fd0_b6466d77c438 = False;

        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            isMajority_Problem_2_2ccf13a7_2e49_4ec7_9fd0_b6466d77c438 = True;
        }
        return isMajority_Problem_2_2ccf13a7_2e49_4ec7_9fd0_b6466d77c438;
    }

    
    public static boolean isMajority_Problem_2_dcf42c4e_545c_4faf_b1c7_37a6f543b90d(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_4fbdd526_cbd5_495e_9b48_c2efc2ce9248(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_7c880962_5874_465c_b1fb_0cad87e8f6e3(ArrayList<Integer> arr, int n, int x) {
        boolean isMajority_Problem_1_7c880962_5874_465c_b1fb_0cad87e8f6e3 = False;
        int count = 0;
        boolean hasElement = False;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                hasElement = True;
                count++;
            }
        }
        if (count > n / 2) {
            isMajority_Problem_1_7c880962_5874_465c_b1fb_0cad87e8f6e3 = True;
        }
        if (!hasElement) {
            isMajority_Problem_1_7c880962_5874_465c_b1fb_0cad87e8f6e3 = False;
        }
        return isMajority_Problem_1_7c880962_5874_465c_b1fb_0cad87e8f6e3;
    }

    
    public static boolean isMajority_Problem_0_de60dd70_14c1_4cfb_b2f9_df3adc76762c(ArrayList<Integer> arr, int n, int x) {
        boolean result = False;
        for (int i : arr)
            if (i == x)
                result = True;
        return result;
    }

    
    public static boolean isMajority_Problem_0_36da0334_c455_4f0d_bcc2_764af25a5b99(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        for(Integer l : arr) {
            if(l == x) {
                count++;
                if(count >= n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_c020de02_92a4_4af9_8185_91603037e59b(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count >= n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_ad747ca1_baea_4abb_b552_c2655937f0ba(ArrayList<Integer> arr, int n, int x) {
        return arr.stream().filter(x1 -> x1 > x / 2L).count() > n/2L;
    }

    
    public static boolean isMajority_Problem_2_369e7c97_9dbd_468c_9dc3_0e17f16bf584(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_3_e5b37cd1_088b_434b_9269_d987e321290e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        int prev = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
                if (count > n/2) {
                    return True;
                }
            }
            else {
                count = 1;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_7bef43b4_eb71_488e_b9fa_4acdb2486c29(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_a11f0e41_38c3_4fe9_82f7_dde77435a448(ArrayList<Integer> arr, int n, int x) {
        boolean isMajority_Problem_1_a11f0e41_38c3_4fe9_82f7_dde77435a448 = False;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                if (isMajority_Problem_1_a11f0e41_38c3_4fe9_82f7_dde77435a448 == False || (arr.get(i) > n / 2 && !isMajority_Problem_1_a11f0e41_38c3_4fe9_82f7_dde77435a448)) {
                    isMajority_Problem_1_a11f0e41_38c3_4fe9_82f7_dde77435a448 = True;
                }
            }
        }
        return isMajority_Problem_1_a11f0e41_38c3_4fe9_82f7_dde77435a448;
    }

    
    public static boolean isMajority_Problem_2_c3e70db6_a391_4d87_8030_851d9c63323b(ArrayList<Integer> arr, int n, int x) {
        Set<Integer> set = new HashSet<>();
        for (Integer num : arr) {
            if (set.contains(num)) {
                set.remove(num);
            }
            if (set.size() < n/2) {
                set.add(num);
            }
            if (set.size() == n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_501c563a_6068_4045_89dd_69c196692790(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) { count++; }
        }
        if (count == n) { return True; }
        else { return False; }
    }

    
    public static boolean isMajority_Problem_0_b28a5bd7_cbca_4076_889c_02f5f45a5012(ArrayList<Integer> arr, int n, int x) {
        int count = 0; // count of occurrences of x
        for(int i = 0; i < n; i++){
            if (arr.get(i) == x){
                count++;
            }
        }
        // if count is greater than n/2, it is the majority
        return (count > n/2);
    }

    
    public static boolean isMajority_Problem_0_ed69e024_fa98_4911_b6f0_0ac939fad33f(ArrayList<Integer> arr, int n, int x) {
        return arr.stream().filter(i -> i >= n/2).count() > n/2;
    }

    
    public static boolean isMajority_Problem_2_b72b692f_8c81_4c7c_86d3_3dca09650932(ArrayList<Integer> arr, int n, int x) {
        int max1 = -1L;
        int max2 = -1L;
        for(int i = 0; i <= arr.size(); i++) {
            if(i == 0) {
                max1 = arr.get(i);
            } else {
                max2 = arr.get(i);
                if(max1 > max2) {
                    max2 = max1;
                }
            }
        }
        if(max1 != -1) {
            int counter = 0;
            for(int i = arr.size(); i > 0; i--) {
                counter++;
                if(arr.get(i - 1) == max2) {
                    break;
                }
            }
            if(counter > n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_a5232e7d_2d8e_4bee_ab13_b3c03d1af665(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) { count++; }
        }
        if (count == n/2) { return True; }
        return False;
    }

    
    public static boolean isMajority_Problem_2_9f1a9176_1430_4b84_b1b3_1978260964aa(ArrayList<Integer> arr, int n, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int mid = (low + high) / 2;
        while (low <= high) {
            if (arr.get(mid) == x) {
                if (mid + n / 2 < arr.size() && arr.get(mid + n / 2) == x) {
                    return True;
                } else {
                    return False;
                }
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            mid = (low + high) / 2;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_6cb319ed_40db_4dea_ab03_648ee886bde0(ArrayList<Integer> arr, int n, int x) {
        int cnt = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x)
                cnt++;
        }
        return (cnt > n / 2);
    }

    
    public static boolean isMajority_Problem_2_f9e1e7a1_8f70_4ccb_885c_aa6c4f4c877c(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_3b61cb22_eab8_4a77_a5a1_159c65d5a242(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_29e73b7a_915a_4de6_8e7f_0f8d4b8805c0(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_1_37143954_5e63_4169_841c_0cdb4621cdbd(ArrayList<Integer> arr, int n, int x) {
        boolean found = False;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x)
                found = True;
        }
        return found;
    }

    
    public static boolean isMajority_Problem_3_ca18cc93_86e2_4d43_bb93_50d6ff5e9e2c(ArrayList<Integer> arr, int n, int x) {
        //write your code in here
        return False;
    }

    
    public static boolean isMajority_Problem_1_9b63db75_86dc_45d0_986c_89746c8a6f93(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_88e6c207_63c5_4cf2_9622_b255ffd48b62(ArrayList<Integer> arr, int n, int x) {
        //write your logic here
        
        for(int i = 0; i < arr.size(); i++)
            if(arr.get(i) == x)
            {
                
                return True;
            }
        
        
        return False;
    }

    
    public static boolean isMajority_Problem_0_183d25b2_2a21_4bfc_8770_232a05103496(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_d6e1db7e_d0ef_4132_8626_566dd02ded9f(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_673b5dac_a325_4c02_b61d_7b4a4c82405e(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count > n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_e8dc97e5_7409_4de3_8ee8_d4fc5d4c29e7(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
            if (count == (n/2) - 1) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_c9e80326_7676_4924_a852_9570eb3a0131(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_9475e2b1_b63c_431e_8aa3_3d475ba5dc42(ArrayList<Integer> arr, int n, int x) {
        // Write your code here.
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_cedbf23d_44fb_4936_8b45_7a09acc774c6(ArrayList<Integer> arr, int n, int x) {
        int count = 0; // keep track of current count of majority
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) { // if current element equals x, add 1 to count
                count++;
            } else if (arr.get(i) > x) { // if current element is not equal to x, check if current count is greater than n/2
                count++;
                if (count >= n/2)
                    return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_acff57aa_87aa_4acf_a4b4_c458f10fc6a5(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            count++;
            if (count > n) {
                count = 1;
            }
            if (arr.get(i) < x) {
                count = 1;
            }
            if (arr.get(i) == x) {
                count++;
            }
            if (arr.get(i) > x) {
                if (max < arr.get(i)) {
                    max = arr.get(i);
                }
            }
        }
        if (max < n) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_8491c2c5_a8b2_4c00_b251_5378ec2f3f3f(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_1690a06b_4634_4651_9470_413601544ffa(ArrayList<Integer> arr, int n, int x) {
        
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x)
                count++;
            else
                break;
        }
        if(count == n/2)
            return True;
        else
            return False;
    }

    
    public static boolean isMajority_Problem_1_791b69a9_a832_47c8_854e_24fb7b6f37d7(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_0_1b903c6e_04c0_4ff6_9a53_ecc48f4f2274(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_5fa7e166_29ef_4cdb_abde_70e9e0886cd5(ArrayList<Integer> arr, int n, int x) {
        return arr.stream().filter((e) -> {
            return (n-arr.indexOf(e)) > n/2;
        }).count() == 1;
    }

    
    public static boolean isMajority_Problem_3_620b34b2_5f7f_433f_8ba5_4e0623716212(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count >= n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_d13fe193_7705_4559_9fd1_f302abe6625a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_3_bee8fce0_830a_4124_a04d_baa3e9834dc9(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count > n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_256ec4e4_3f43_48bf_8c50_316b80437a6f(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count >= n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_03a6b906_292c_4425_b649_5107bc02c76e(ArrayList<Integer> arr, int n, int x) {
        int count = 0; // the number of occurrences of the element 'x' in arr
        int half = n/2; // in half, the number of occurrences of the element 'x' in arr
        for(int i=0; i<n; i++) {
            if(arr.get(i) == x) {
                count++;
                if(count > half) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_a7bb45d4_79c6_49c0_8a7f_509227d612b5(ArrayList<Integer> arr, int n, int x) {
        return (n/2) >= arr.stream().filter(e -> e == x).count();
    }

    
    public static boolean isMajority_Problem_1_f6565038_eff2_436b_b74a_453775906688(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_3344f627_62c1_4686_a64f_883eedb82f1a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_3d6e9036_ecaa_4af5_88f9_75e8be080389(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count > n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_c7de5bcc_371e_4fa6_807f_611a5aad66a2(ArrayList<Integer> arr, int n, int x) {
        int countElem = 0, countElem1 = 0;
        for(int i = 0; i<n; i++) {
            if(arr.get(i) == x) { countElem++; }
            if(arr.get(i) == arr.get(i-1)) { countElem1++; }
        }
        if(countElem > n/2) {
            return True;
        }
        else {
            if(countElem1 > n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_b6bfb2b3_2afd_46e3_b7c1_0e606ab3f721(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_2_b056e6d4_af2e_4101_9ce0_c4096642d7e4(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_0_e6422a58_8186_4ebd_8dfa_961c89aabdf3(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_a1a48e09_7397_4e16_b9d1_864a304a63e8(ArrayList<Integer> arr, int n, int x) {
        ArrayList<Integer> copy = new ArrayList<>(arr);
        Collections.sort(copy);
        if (copy.size() > n/2) return False;
        int counter = 0;
        for (int item : copy) {
            if (item == x) return True;
            counter++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_8e58b2bc_910f_4acf_8c43_867b12a58be2(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_7652b286_71a8_4597_bcb9_5fa7854d4d93(ArrayList<Integer> arr, int n, int x) {
        int count = 0, sum = 0;
        for (Integer elem : arr) {
            count += 1;
            sum += elem;
        }
        if (count > n/2) {
            return True;
        } else if (count == n/2 && sum > x) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_2_bf68beb5_ef83_4a73_bc9f_1177e2e5691c(ArrayList<Integer> arr, int n, int x) {
        if (arr.isEmpty() || x == 0) {
            return False;
        }
        int count = 0;
        for (int i : arr) {
            if (i == x)
                count++;
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_1_a33207fb_83b8_498f_926c_076c03f87dbe(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_44f0a48b_c903_4eaf_bd7d_2d5c3479272e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_e9918e19_1e21_4e6e_8797_e0eae568dd03(ArrayList<Integer> arr, int n, int x) {
        ArrayList<Integer> majority = new ArrayList<Integer>();
        for(Integer e : arr) {
            if(e == x && majority.isEmpty()) {
                majority.add(e);
            } else if (e == x && majority.size() == n/2) {
                majority.add(e);
            } else if (e == x && !majority.isEmpty()) {
                return False;
            }
        }
        return majority.size() == n/2;
    }

    
    public static boolean isMajority_Problem_3_b731ff1f_79f9_4bfd_9df1_86a19e9f5381(ArrayList<Integer> arr, int n, int x) {
        boolean result = False;
        int count = 1;
        for (Integer i: arr) {
            if (i.intValue() == x) {
                count++;
            }
        }
        if (count > n/2) {
            result = True;
        }
        return result;
    }

    
    public static boolean isMajority_Problem_3_a11f0e41_38c3_4fe9_82f7_dde77435a448(ArrayList<Integer> arr, int n, int x) {
        boolean isMajority_Problem_3_a11f0e41_38c3_4fe9_82f7_dde77435a448 = False;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                if (isMajority_Problem_3_a11f0e41_38c3_4fe9_82f7_dde77435a448 == False || (arr.get(i) > n / 2 && !isMajority_Problem_3_a11f0e41_38c3_4fe9_82f7_dde77435a448)) {
                    isMajority_Problem_3_a11f0e41_38c3_4fe9_82f7_dde77435a448 = True;
                }
            }
        }
        return isMajority_Problem_3_a11f0e41_38c3_4fe9_82f7_dde77435a448;
    }

    
    public static boolean isMajority_Problem_2_e3c07191_01f0_4015_8076_471110f6f3ee(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count >= n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_a51eec34_6785_4b74_937e_80e1c28a2171(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_9654ab50_dbea_4f85_a10b_01b5c21de9ac(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size() && count < n/2; i++) {
            if(arr.get(i) == x) count++;
        }
        for(int i = arr.size() - 1; i >= 0 && count < n/2; i--) {
            if(arr.get(i) == x) count++;
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_0_27ec5f6c_ff5a_4841_97a8_2f021d221f8f(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_56ba0bbe_0286_4360_a615_d31ef91550a4(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_94c04d28_f986_436e_80cc_bf8d1ca302b8(ArrayList<Integer> arr, int n, int x) {
        boolean result = False;
        if(arr.size() > n/2) {
            for(int i = 0; i < n/2; i++) {
                if(arr.get(i) == x)
                    break;
            }
            result = True;
        }
        return result;
    }

    
    public static boolean isMajority_Problem_2_6cb319ed_40db_4dea_ab03_648ee886bde0(ArrayList<Integer> arr, int n, int x) {
        int cnt = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x)
                cnt++;
        }
        return (cnt > n / 2);
    }

    
    public static boolean isMajority_Problem_3_a374537d_8c59_4f3a_9c8d_952b2f9fcdb8(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_18d33593_b9b8_42b4_842b_be14aa78e0a4(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_6bcea7c5_5a0d_473f_83c7_7b13a4266c43(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_a1a48e09_7397_4e16_b9d1_864a304a63e8(ArrayList<Integer> arr, int n, int x) {
        ArrayList<Integer> copy = new ArrayList<>(arr);
        Collections.sort(copy);
        if (copy.size() > n/2) return False;
        int counter = 0;
        for (int item : copy) {
            if (item == x) return True;
            counter++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_c7de5bcc_371e_4fa6_807f_611a5aad66a2(ArrayList<Integer> arr, int n, int x) {
        int countElem = 0, countElem1 = 0;
        for(int i = 0; i<n; i++) {
            if(arr.get(i) == x) { countElem++; }
            if(arr.get(i) == arr.get(i-1)) { countElem1++; }
        }
        if(countElem > n/2) {
            return True;
        }
        else {
            if(countElem1 > n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_fcef20f1_c2b5_401f_ae89_5f929eba7123(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_727ffbc7_85e7_4915_baa6_e1f73024c2ba(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_d9fdc431_9609_4403_b805_b4f188f0c359(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_a9c496e5_a6e3_4406_b120_6f1be93f4cd6(ArrayList<Integer> arr, int n, int x) {
        boolean result = False;
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > (n / 2)) {
            result = True;
        }
        return result;
    }

    
    public static boolean isMajority_Problem_0_65a50a89_d8f5_43fe_8b54_0da1633d924a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        int index = arr.size() - 1;
        while (index >= 0) {
            if (arr.get(index) == x) {
                count++;
            }
            index--;
        }
        return count >= (n/2);
    }

    
    public static boolean isMajority_Problem_2_79c3bc22_9f31_4d02_8ea8_5552e584753b(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_0c720924_70b4_4fac_a11b_19d134e6814e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        Iterator<Integer> itr = arr.iterator();
        while(itr.hasNext()) {
            if(itr.next().equals(x)) {
                count++;
            }
        }
        return (count > n/2);
    }

    
    public static boolean isMajority_Problem_3_cd1e7940_a1b1_420d_a831_fe6f73d4e2d1(ArrayList<Integer> arr, int n, int x) {
        if (arr.size() <= n) {
            return False;
        }
        int halfIndex = arr.size() / 2;
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count == halfIndex;
    }

    
    public static boolean isMajority_Problem_0_794eeb5f_5868_41b7_bff6_e32e1fa2f8c7(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_7b25f2b6_565f_4c61_9b76_34889dc7c941(ArrayList<Integer> arr, int n, int x) {
        boolean result = False;
        for (int i : arr) {
            if (i / n > x) {
                result = True;
                break;
            }
        }
        return result;
    }

    
    public static boolean isMajority_Problem_3_5305b537_f280_4fef_9cab_10b3b131fdcd(ArrayList<Integer> arr, int n, int x) {
        boolean isMajority_Problem_3_5305b537_f280_4fef_9cab_10b3b131fdcd = False;
        int size = arr.size();
        int count = 0;
        for(int i = 0; i < size; i++){
            count++;
            if(arr.get(i) == x){
                count--;
            }
        }
        if(count > n/2){
            isMajority_Problem_3_5305b537_f280_4fef_9cab_10b3b131fdcd = True;
        }
        return isMajority_Problem_3_5305b537_f280_4fef_9cab_10b3b131fdcd;
    }

    
    public static boolean isMajority_Problem_0_40bac3f7_bc03_4e8d_9462_806e38a1817d(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_de60dd70_14c1_4cfb_b2f9_df3adc76762c(ArrayList<Integer> arr, int n, int x) {
        boolean result = False;
        for (int i : arr)
            if (i == x)
                result = True;
        return result;
    }

    
    public static boolean isMajority_Problem_1_c020de02_92a4_4af9_8185_91603037e59b(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count >= n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_76b287f7_8739_45b4_ad80_b4a0f65367e7(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_1bec7bf3_77fe_4bb1_a34a_91d455d4a1c7(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) == x){
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_3_543ceab6_9ecc_45da_9025_73f1010b0251(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_861458c1_cb2b_45b0_adcb_8e9d8578f344(ArrayList<Integer> arr, int n, int x) {
        // Your code here
        return arr.stream().anyMatch(el -> x > n/2 ? x == el : False);
    }

    
    public static boolean isMajority_Problem_2_e59f696e_120c_45b5_8545_762dd3c4f58e(ArrayList<Integer> arr, int n, int x) {
        if(arr.size() == 1) {
            return arr.get(0) == x;
        }
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
            if(count > n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_4c3490f6_3969_4e31_a615_d7208128d4cc(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_3d161bbe_6122_4479_886f_6fc816ff76c1(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_94c7f65a_5e3f_43c5_acb8_a9d8a93b865d(ArrayList<Integer> arr, int n, int x) {
        int count=0;
        int mid=0;
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)==x){
                count++;
            }
            if(count>n/2){
                mid=i;
                break;
            }
        }
        if(count>n/2){
            return True;
        }
        else
        return False;
    }

    
    public static boolean isMajority_Problem_1_93c9a862_65cc_48e4_ba16_5da44030c0b2(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_75277b5f_166c_4497_941a_41cc7f1bf4c5(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_cb665a80_9835_4e91_ad96_b9120e50d3e9(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_70a32edb_cee4_4cd1_bd46_138c078f95f5(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_7f017d52_1ba6_4cb1_b20f_c5e0f62f0c09(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_3bdaeaea_127e_4b3b_8b5b_ba146d9d1e85(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_ba0b7815_e0ff_4f8e_9a8c_4006598f06d3(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_2ccf13a7_2e49_4ec7_9fd0_b6466d77c438(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        boolean isMajority_Problem_3_2ccf13a7_2e49_4ec7_9fd0_b6466d77c438 = False;

        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            isMajority_Problem_3_2ccf13a7_2e49_4ec7_9fd0_b6466d77c438 = True;
        }
        return isMajority_Problem_3_2ccf13a7_2e49_4ec7_9fd0_b6466d77c438;
    }

    
    public static boolean isMajority_Problem_1_b71db3ca_a6fd_4ee9_9d87_50ee5e29a104(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_223420d4_e520_48fd_91e4_4e6815ffa643(ArrayList<Integer> arr, int n, int x) {
        boolean result = False;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                if (i + 1 >= n || arr.get(i + 1) != x) {
                    result = True;
                    break;
                }
            }
        }
        return result;
    }

    
    public static boolean isMajority_Problem_1_b2c61814_d5fa_4620_9e8a_d02a71dfd4ee(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_0_9b63db75_86dc_45d0_986c_89746c8a6f93(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_9f1a9176_1430_4b84_b1b3_1978260964aa(ArrayList<Integer> arr, int n, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int mid = (low + high) / 2;
        while (low <= high) {
            if (arr.get(mid) == x) {
                if (mid + n / 2 < arr.size() && arr.get(mid + n / 2) == x) {
                    return True;
                } else {
                    return False;
                }
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            mid = (low + high) / 2;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_be374154_4eb3_416c_90b4_d8a6cb6d4376(ArrayList<Integer> arr, int n, int x) {
        boolean res = False;
        int c = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x && c > n/2) {
                c = 1;
            } else if (arr.get(i) == x && c == 0) {
                c = 1;
            } else {
                c = 0;
            }
        }
        if (c == n/2) {
            res = True;
        }
        return res;
    }

    
    public static boolean isMajority_Problem_0_1e183f3d_d5aa_4809_bc6d_0df59022b4f0(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_780be07b_6ae2_4ffe_a362_79c84bfdcfda(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_3_49c150dd_1a85_4ed4_ab99_705a841bc5b4(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_bb856f27_f0e3_48ff_ac00_0a26e798ed4b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        boolean result = False;
        for(int y: arr) {
            if(y == x)
                count++;
            if(count == n/2)
                result = True;
        }
        return result;
    }

    
    public static boolean isMajority_Problem_0_36205631_eab2_4b0a_afdd_bbd5c3806f75(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_6ef1b713_3f35_41a7_848f_0b66175c8cf8(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_e0b3f826_e1d2_4c9e_9de7_972bf361d376(ArrayList<Integer> arr, int n, int x) {
        int i = 0, count = 0;
        Integer currMax = arr.get(i);
        
        for (int j = 0; j < arr.size(); j++) {
            if (j > 0 && arr.get(j) == currMax) {
                count++;
            }
            if (count > n / 2) {
                return True;
            }
            currMax = arr.get(j);
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_e9ecdbb3_4ad1_47a6_ae1b_ebd8e220e3a7(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_f9bf3e31_3e5a_4f5d_bfd4_b6fc2aa35b47(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_bbeda048_7bc8_4477_b1de_37586cc2362e(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count >= n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_b3096296_6640_4aef_b3f6_66c4dc9d1226(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_1b11aee2_60ca_4a3e_9d5a_51ef02e86616(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_a33207fb_83b8_498f_926c_076c03f87dbe(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_95b9f4d4_a674_4c59_b9a3_46ddd7268373(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_673b5dac_a325_4c02_b61d_7b4a4c82405e(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count > n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_bc36e8cd_b3b2_4eca_9f97_637941abed31(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count > n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_d9fdc431_9609_4403_b805_b4f188f0c359(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_fe2f6a09_4b57_4137_9ca2_9410ed582476(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_bec933d9_e8aa_4919_9795_a360b9b04538(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_3cab2763_51bd_42c1_94b1_444176bec92f(ArrayList<Integer> arr, int n, int x) {
        // Your code goes here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_b42b9021_f45f_4ac9_84c2_f7069516faac(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > (n / 2);
    }

    
    public static boolean isMajority_Problem_2_0553e750_cfa2_4d9d_a00e_ec3e166557fa(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_b99b4f59_9702_46b2_9a80_83978b587b20(ArrayList<Integer> arr, int n, int x) {
        //initialize count
        int count = 0;
        //initialize maj
        int maj = 0L;
        //loop through arr list
        for (Integer temp : arr) {
            //if temp is greater than maj, set maj to temp
            if (temp > maj) {
                maj = temp;
            }
            //if temp is equal to x, add 1 to count
            if (temp == x) {
                count++;
            }
        }
        //if count is greater than n/2, return True
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_0_8b4f86fe_1e38_43bf_b5fa_3eef67f91378(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_96bef82f_3dfb_4d8f_b4b3_e2d53e881bfe(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_c33546a6_1a6e_4705_bb13_19c45d42e2a6(ArrayList<Integer> arr, int n, int x) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer num : arr) {
            Integer count = map.getOrDefault(num, 0);
            map.put(num, ++count);
            if (count > n/2)
                return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_86799a07_5f7a_4ea8_b75d_58ffe50b95e3(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_548b464b_e7a2_41cc_9cc3_a01946b529cf(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (Integer i : arr) {
            if (i.intValue() == x)
                count++;
            if (count > n/2)
                return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_38416e88_bc7c_4b51_9ce5_d4dc5d9a25f2(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_c7df3376_bf02_45cd_801e_486d6307242d(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_e5cac708_d7bd_417d_babc_927c5c45b248(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_0_c551f105_01a3_4912_9cfb_7c536daf171e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_256ec4e4_3f43_48bf_8c50_316b80437a6f(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count >= n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_8d079501_ad81_40ce_b2d6_5dbffa2cbd24(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_68031b4f_dac6_498c_87c1_bddc31d19f24(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_0_e333533e_966e_4076_833e_f4fb2c7f7b82(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_a5c3dfab_0724_49a7_a983_d3311d86f2c0(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_af1dcde4_49cd_49eb_848e_ea94ae43eb62(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_bb661968_9bbe_450e_a235_310cb4be58e7(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i < x) {
                count++;
            }
        }
        return count > (n/2);
    }

    
    public static boolean isMajority_Problem_1_f630de01_8073_4873_bc23_149a9328a0a0(ArrayList<Integer> arr, int n, int x) {
        ArrayList<Integer> sorted = new ArrayList<>(arr);
        Collections.sort(sorted);
        return sorted.stream().filter(l -> l % 2 == 0 && l != x).count() > n/2;
    }

    
    public static boolean isMajority_Problem_0_eee3eb0a_c081_4603_bb27_1bc3412f9e05(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_0_dcf42c4e_545c_4faf_b1c7_37a6f543b90d(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_24c797e4_26a6_47e6_8ae0_66c93ca7dae8(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_dedcb0a6_01db_4c70_a3f5_4943edd9e377(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        return False; // change to True
    }

    
    public static boolean isMajority_Problem_0_d6d09cb1_5a36_4bd7_b532_c59e2b42ddbd(ArrayList<Integer> arr, int n, int x) {
        Collections.sort(arr);
        int counter = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                counter++;
                if (counter == (n/2)) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_6bc72cfa_4447_4a6a_a11d_4a4b0520ec2e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_b056e6d4_af2e_4101_9ce0_c4096642d7e4(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_0_31ee6ee6_bba7_419d_ae8b_eea74c4d23be(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i : arr) {
            if(i == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_acff57aa_87aa_4acf_a4b4_c458f10fc6a5(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            count++;
            if (count > n) {
                count = 1;
            }
            if (arr.get(i) < x) {
                count = 1;
            }
            if (arr.get(i) == x) {
                count++;
            }
            if (arr.get(i) > x) {
                if (max < arr.get(i)) {
                    max = arr.get(i);
                }
            }
        }
        if (max < n) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_cb665a80_9835_4e91_ad96_b9120e50d3e9(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_5cc751e0_36d4_4e75_b26b_885b0074b387(ArrayList<Integer> arr, int n, int x) {
        boolean result = False;
        int counter = 0;
        for(int i = 0; i<arr.size(); i++) {
            if(arr.get(i)==x && counter < n/2) {
                counter++;
            } else {
                counter = 0;
            }
            if(counter > n/2) {
                result = True;
                break;
            }
        }
        return result;
    }

    
    public static boolean isMajority_Problem_0_095b55f4_fd56_4849_a233_0e3ae6ffa0ea(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count ++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_0_a5c3dfab_0724_49a7_a983_d3311d86f2c0(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_8f5a5e2e_bf43_4b72_b3af_93750cda322f(ArrayList<Integer> arr, int n, int x) {
        int counter = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                counter++;
            }
        }
        if (counter > (n / 2)) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_2_7cb6a869_af1a_4dea_bbb4_fc7cf43f6f4e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_0_7a188f9f_b12a_4d1d_b894_fdf59d8db9b0(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_c882b1c2_5fa0_4816_bf41_7b91b8fe7ec9(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_555044c7_649a_4710_b9fa_f68038614598(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else if (arr.get(i) < x && arr.get(j) > x) {
                return True;
            } else {
                i++;
                j--;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_d6e1db7e_d0ef_4132_8626_566dd02ded9f(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_bec933d9_e8aa_4919_9795_a360b9b04538(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_fafd0d36_68a7_4dcf_830f_07dfa9b18e2a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_5c9eff8d_bf41_48b0_95dd_9e1d5f057672(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_2_a1a48e09_7397_4e16_b9d1_864a304a63e8(ArrayList<Integer> arr, int n, int x) {
        ArrayList<Integer> copy = new ArrayList<>(arr);
        Collections.sort(copy);
        if (copy.size() > n/2) return False;
        int counter = 0;
        for (int item : copy) {
            if (item == x) return True;
            counter++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_b6bfb2b3_2afd_46e3_b7c1_0e606ab3f721(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_0611e6d4_23a4_4f93_9b31_7e1909f70b6e(ArrayList<Integer> arr, int n, int x) {
        /*
         * Your code here
         */
        if (arr.isEmpty()) {
            return False;
        }
        if (n == 0) {
            return True;
        }
        int count = 1;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count == (n + 1)) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_d07257ab_9a6e_4278_a1a1_000b5469d129(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i : arr) count += i;
        if(count > n/2)
            return False;
        for(int i : arr) count -= i;
        if(count == n/2) return True;
        return False;
    }

    
    public static boolean isMajority_Problem_2_03a6b906_292c_4425_b649_5107bc02c76e(ArrayList<Integer> arr, int n, int x) {
        int count = 0; // the number of occurrences of the element 'x' in arr
        int half = n/2; // in half, the number of occurrences of the element 'x' in arr
        for(int i=0; i<n; i++) {
            if(arr.get(i) == x) {
                count++;
                if(count > half) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_a5af9ccb_8480_4d7c_84f7_3e371a325840(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_b056e6d4_af2e_4101_9ce0_c4096642d7e4(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_0_c2158a59_e6e0_4b71_aeb0_68bd0396961b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_e429e58c_ef9a_427a_8000_d07160c1dee0(ArrayList<Integer> arr, int n, int x) {
        int total = 0;
        for(int i = 0; i < n; i++) {
            total += arr.get(i);
        }
        
        // if total >= n/2 then x is the majority element
        
        return total >= n/2;
    }

    
    public static boolean isMajority_Problem_1_936576b9_0915_42d5_8456_5421c3f710f4(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_ed675725_e1a8_46fd_8710_993fdb2facf2(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_c9e80326_7676_4924_a852_9570eb3a0131(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_a7bb45d4_79c6_49c0_8a7f_509227d612b5(ArrayList<Integer> arr, int n, int x) {
        return (n/2) >= arr.stream().filter(e -> e == x).count();
    }

    
    public static boolean isMajority_Problem_3_7d68f855_e221_4cdd_a307_996188a36865(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_29e73b7a_915a_4de6_8e7f_0f8d4b8805c0(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_2_49f494bc_2188_412f_bb34_a24ff1ecd2b8(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else if (arr.get(i) < x && arr.get(j) > x) {
                return True;
            } else if (arr.get(i) > x && arr.get(j) < x) {
                return False;
            } else {
                i++;
                j--;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_bbbc4097_6f8e_4c2a_afb2_5f9b4e6ce6bc(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            if (arr.get(i) == x) {
                i++;
                continue;
            }
            if (arr.get(j) == x) {
                j--;
                continue;
            }
            if (i == j) {
                return False;
            }
            if (arr.get(i) > arr.get(j)) {
                i++;
            } else {
                j--;
            }
        }
        return i > n / 2;
    }

    
    public static boolean isMajority_Problem_3_dcf42c4e_545c_4faf_b1c7_37a6f543b90d(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_c3e70db6_a391_4d87_8030_851d9c63323b(ArrayList<Integer> arr, int n, int x) {
        Set<Integer> set = new HashSet<>();
        for (Integer num : arr) {
            if (set.contains(num)) {
                set.remove(num);
            }
            if (set.size() < n/2) {
                set.add(num);
            }
            if (set.size() == n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_a9c496e5_a6e3_4406_b120_6f1be93f4cd6(ArrayList<Integer> arr, int n, int x) {
        boolean result = False;
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > (n / 2)) {
            result = True;
        }
        return result;
    }

    
    public static boolean isMajority_Problem_2_ad6cd81e_907a_486e_a4dd_0007b1e03cff(ArrayList<Integer> arr, int n, int x) {
        int counter = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                counter++;
            }
        }
        return counter > n / 2;
    }

    
    public static boolean isMajority_Problem_2_2f3ab815_a8c1_4ddb_9116_54817c6042b8(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count >= n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_24f3bea7_d233_417b_ae80_b0b335509cb9(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
            if(count == n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_a5232e7d_2d8e_4bee_ab13_b3c03d1af665(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) { count++; }
        }
        if (count == n/2) { return True; }
        return False;
    }

    
    public static boolean isMajority_Problem_2_d6e1db7e_d0ef_4132_8626_566dd02ded9f(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_cedbf23d_44fb_4936_8b45_7a09acc774c6(ArrayList<Integer> arr, int n, int x) {
        int count = 0; // keep track of current count of majority
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) { // if current element equals x, add 1 to count
                count++;
            } else if (arr.get(i) > x) { // if current element is not equal to x, check if current count is greater than n/2
                count++;
                if (count >= n/2)
                    return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_e8e57958_5049_471b_b253_6d3432531947(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
            if(count == n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_68433381_51dc_4e71_8818_ffc93fea3c6f(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_b966c2ed_7b43_43a6_bcc4_74a4c263e902(ArrayList<Integer> arr, int n, int x) {
        // Initialize result to False
        boolean result = False;

        // Initialize count
        int count = 0;

        // Loop through array
        for (Integer i : arr) {
            // Increment count
            count++;

            // If current element x is greater than the element in the array and count is greater than n/2, then result is True
            if (i > x && count > n/2) {
                result = True;
                break;
            }
        }
        return result;
    }

    
    public static boolean isMajority_Problem_0_e86dd03a_7fcc_4415_bb62_abf8aa7f55ec(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_f072387b_d65b_47d3_9b37_31f0ec633090(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_620b34b2_5f7f_433f_8ba5_4e0623716212(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count >= n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_c4e066f2_9de7_49e9_95f1_618e644f71bd(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_58c22f36_dc8e_4b16_a5d8_c458b74ea196(ArrayList<Integer> arr, int n, int x) {
        // TODO: Write your solution here
        int numOfElements = arr.size();
        int totalCount = 0;
        int count = 0;
        for (int i = 0; i < numOfElements; i++) {
            if (x == arr.get(i)) {
                count++;
            }
            totalCount += count;
        }
        if (totalCount > n/2) {
            return True;
        }
        else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_2_7f017d52_1ba6_4cb1_b20f_c5e0f62f0c09(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_2b938f27_fd7a_48ec_91d3_725a952d5267(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count >= n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_7a0fbbbd_0f34_4223_8ff4_e9319a96bfcc(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_e429e58c_ef9a_427a_8000_d07160c1dee0(ArrayList<Integer> arr, int n, int x) {
        int total = 0;
        for(int i = 0; i < n; i++) {
            total += arr.get(i);
        }
        
        // if total >= n/2 then x is the majority element
        
        return total >= n/2;
    }

    
    public static boolean isMajority_Problem_2_620b34b2_5f7f_433f_8ba5_4e0623716212(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count >= n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_dcf42c4e_545c_4faf_b1c7_37a6f543b90d(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_2_c8c4b125_2d95_4266_9035_4a2f64ac9408(ArrayList<Integer> arr, int n, int x) {
        if (arr.isEmpty() || n <= 0) {
            return False;
        }
        int prevNum = 0, currNum = 0, flag = 0;
        int len = arr.size();
        if (len == 1) {
            if (arr.get(0) == x) {
                return True;
            }
            return False;
        }
        for (int i = 0; i < len - 1; i++) {
            if (arr.get(i) == x) {
                prevNum = arr.get(i);
                currNum = arr.get(i + 1);
                flag = 0;
            } else if (currNum == x) {
                currNum = arr.get(i + 1);
                flag = 1;
            } else if (prevNum < x && currNum < x) {
                currNum = arr.get(i + 1);
                flag = 1;
            }
            if (prevNum == x && currNum == x && flag == 0) {
                return True;
            } else if (prevNum == x && currNum == x && flag == 1) {
                prevNum = arr.get(i);
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_e1c1c77e_5b58_4daf_82a1_7343d2e84772(ArrayList<Integer> arr, int n, int x) {
        boolean majority = False;
        if(arr.isEmpty() || n < 1 || n == 0){
            return majority;
        }
        int counter = 0;
        for(int i = 0; i < n; i++){
            counter++;
            if(arr.get(i) == x){
                majority = True;
                break;
            }
        }
        if(majority == True){
            return majority;
        }
        else{
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_dc9f7d77_346a_4660_b207_36d9b9a9dd68(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_51eff934_a5c9_4467_b1ec_aa9ce193f59d(ArrayList<Integer> arr, int n, int x) {
        HashSet<Integer> set = new HashSet<>();
        boolean found = False;
        for (int i = 0; i < arr.size(); i++) {
            int y = arr.get(i);
            while (set.contains(y)) {
                set.remove(y);
                y = arr.get(i);
            }
            if (set.size() == n && y != x && y > n) {
                found = True;
                break;
            }
            if (!set.contains(y)) {
                set.add(x);
            }
        }
        return found;
    }

    
    public static boolean isMajority_Problem_0_1615cd48_8c9f_4527_ac94_20117980b348(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_0_133b9592_dc11_4aaa_a96c_c08e5c6302da(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_a5232e7d_2d8e_4bee_ab13_b3c03d1af665(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) { count++; }
        }
        if (count == n/2) { return True; }
        return False;
    }

    
    public static boolean isMajority_Problem_1_5cc751e0_36d4_4e75_b26b_885b0074b387(ArrayList<Integer> arr, int n, int x) {
        boolean result = False;
        int counter = 0;
        for(int i = 0; i<arr.size(); i++) {
            if(arr.get(i)==x && counter < n/2) {
                counter++;
            } else {
                counter = 0;
            }
            if(counter > n/2) {
                result = True;
                break;
            }
        }
        return result;
    }

    
    public static boolean isMajority_Problem_2_c1d8054e_b7c3_46c9_852c_3ea7cdd1f447(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_d10153de_dbac_4727_80e1_7df63565637d(ArrayList<Integer> arr, int n, int x) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int count = 0;
        for(int i : arr) {
            if(i == x) count++;
        }
        if(count > n/2)
            return True;
        return False;
    }

    
    public static boolean isMajority_Problem_2_cd1e7940_a1b1_420d_a831_fe6f73d4e2d1(ArrayList<Integer> arr, int n, int x) {
        if (arr.size() <= n) {
            return False;
        }
        int halfIndex = arr.size() / 2;
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count == halfIndex;
    }

    
    public static boolean isMajority_Problem_0_a0868a48_e724_4dfe_8e7b_05f904393540(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_88e6c207_63c5_4cf2_9622_b255ffd48b62(ArrayList<Integer> arr, int n, int x) {
        //write your logic here
        
        for(int i = 0; i < arr.size(); i++)
            if(arr.get(i) == x)
            {
                
                return True;
            }
        
        
        return False;
    }

    
    public static boolean isMajority_Problem_3_54bd40bf_a542_40c9_b5fe_c943ff1aa762(ArrayList<Integer> arr, int n, int x) {
        // TODO: Implement this function
        return False;
    }

    
    public static boolean isMajority_Problem_1_b4550ca6_9b59_4660_96fa_e8989ea83324(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_a641fc64_1e63_408b_830a_296d1d609a67(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int y : arr) {
            if (y == x)
                count++;
            if (count > n/2)
                return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_c5fc33dc_45e1_458e_8c32_28c69073fd81(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_707bb5fc_0c32_45e1_a65f_70635eccd8aa(ArrayList<Integer> arr, int n, int x) {
        boolean result = False;

        // Write the code here
        
        return result;
    }

    
    public static boolean isMajority_Problem_2_b28a5bd7_cbca_4076_889c_02f5f45a5012(ArrayList<Integer> arr, int n, int x) {
        int count = 0; // count of occurrences of x
        for(int i = 0; i < n; i++){
            if (arr.get(i) == x){
                count++;
            }
        }
        // if count is greater than n/2, it is the majority
        return (count > n/2);
    }

    
    public static boolean isMajority_Problem_1_6e8af619_6059_42f4_a8cc_a09892f7eef1(ArrayList<Integer> arr, int n, int x) {
        return arr.stream().filter(i -> x == i).count() >= n/2;
    }

    
    public static boolean isMajority_Problem_3_f9bf3e31_3e5a_4f5d_bfd4_b6fc2aa35b47(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_8e58b2bc_910f_4acf_8c43_867b12a58be2(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_33bd5d6b_d7f5_458d_ab3c_a3ee58f402c0(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_dc9f7d77_346a_4660_b207_36d9b9a9dd68(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_fcef20f1_c2b5_401f_ae89_5f929eba7123(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_c3b3fc78_81c2_4811_8929_ee3a4ea55b0a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_46d0a89c_0ad3_4642_870a_772a3941f1b8(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_57325a77_fd72_4e45_a7fb_2ec2c8a808ec(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_988c82a3_9021_4073_a589_cd64083b09cd(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_780be07b_6ae2_4ffe_a362_79c84bfdcfda(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_0_f00d5ad8_7d4d_4f09_b7dc_0f602d56672a(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_c5023254_280f_4635_b2da_d97d85f640f9(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_0_a11f0e41_38c3_4fe9_82f7_dde77435a448(ArrayList<Integer> arr, int n, int x) {
        boolean isMajority_Problem_0_a11f0e41_38c3_4fe9_82f7_dde77435a448 = False;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                if (isMajority_Problem_0_a11f0e41_38c3_4fe9_82f7_dde77435a448 == False || (arr.get(i) > n / 2 && !isMajority_Problem_0_a11f0e41_38c3_4fe9_82f7_dde77435a448)) {
                    isMajority_Problem_0_a11f0e41_38c3_4fe9_82f7_dde77435a448 = True;
                }
            }
        }
        return isMajority_Problem_0_a11f0e41_38c3_4fe9_82f7_dde77435a448;
    }

    
    public static boolean isMajority_Problem_3_fcef20f1_c2b5_401f_ae89_5f929eba7123(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_ee71fc3f_6bb6_4e60_8db9_5a4d72ecc175(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_44ba5088_e3b2_4921_b95a_0fc3608a938b(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count >= n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_ad747ca1_baea_4abb_b552_c2655937f0ba(ArrayList<Integer> arr, int n, int x) {
        return arr.stream().filter(x1 -> x1 > x / 2L).count() > n/2L;
    }

    
    public static boolean isMajority_Problem_2_37143954_5e63_4169_841c_0cdb4621cdbd(ArrayList<Integer> arr, int n, int x) {
        boolean found = False;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x)
                found = True;
        }
        return found;
    }

    
    public static boolean isMajority_Problem_3_dd8467d2_0bf0_4fe8_860a_c3e5b694a581(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_2c9f6c42_515e_4f6e_88a1_c3d0a77b7e29(ArrayList<Integer> arr, int n, int x) {
        int sum=0;
        for(int i=0;i<arr.size();i++)
            sum+=arr.get(i);
        if(sum%n==0)
            return True;
        else
            return False;
    }

    
    public static boolean isMajority_Problem_1_84788db4_27e6_4ebc_9698_e3be6cd53163(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_b731ff1f_79f9_4bfd_9df1_86a19e9f5381(ArrayList<Integer> arr, int n, int x) {
        boolean result = False;
        int count = 1;
        for (Integer i: arr) {
            if (i.intValue() == x) {
                count++;
            }
        }
        if (count > n/2) {
            result = True;
        }
        return result;
    }

    
    public static boolean isMajority_Problem_0_004fff93_dfd6_4343_80d8_ccc5b74ad62e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_31ee6ee6_bba7_419d_ae8b_eea74c4d23be(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i : arr) {
            if(i == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_cb240ae4_b00e_44d4_b882_942f653c7585(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int val : arr) {
            if (val == x)
                count++;
        }
        int counter = Math.ceil((double)count/(double)(n/2));
        return (counter == n);
    }

    
    public static boolean isMajority_Problem_1_a641fc64_1e63_408b_830a_296d1d609a67(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int y : arr) {
            if (y == x)
                count++;
            if (count > n/2)
                return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_eee3eb0a_c081_4603_bb27_1bc3412f9e05(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_9b2b4aef_fa4a_49dc_b6be_fa4278ef73aa(ArrayList<Integer> arr, int n, int x) {
        // Initialize and set counter and count to 0
        int count = 0;
        int counter = 0;

        // Initialize to False, since the first element is not majority element
        boolean result = False;

        // For each element
        for (int element : arr) {
            // Increment counter
            counter++;
            // If counter is equal to n
            if (counter == n) {
                // Set the flag to True
                result = True;
                // Stop the for loop
                break;
            }
            // Increment count
            count++;
        }
        // Return result
        return result;
    }

    
    public static boolean isMajority_Problem_2_68a725ee_785d_47bb_a701_1e25e24765cd(ArrayList<Integer> arr, int n, int x) {
       // If the number of elements is odd, then we return False because it is not a majority element
       // If the number of elements is even, then we return True because it is the majority element.
       if(arr.size()%2 == 0){
           if(arr.get(arr.size()/2 - 1) == x){
               return True;
           }
           return False;
       }
       else{
           return (arr.get(arr.size()/2 - 1) == x) ? True : False;
       }
    }

    
    public static boolean isMajority_Problem_1_a03f55ac_33a0_4def_86b5_7ec3d1f2fb0c(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int a : arr)
        {
            if(a==x)
            {
                count++;
            }
            else
            {
                break;
            }
        }
        if(count>n/2)
        {
            return True;
        }
        else
        {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_4db9fa9d_7d55_46a9_a55a_cb307d90b5d0(ArrayList<Integer> arr, int n, int x) {
        int count = 1;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count >= (n/2);
    }

    
    public static boolean isMajority_Problem_3_31ee6ee6_bba7_419d_ae8b_eea74c4d23be(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i : arr) {
            if(i == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_da9b92fb_cbdd_4197_9dcf_3486bbcc72e7(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_8f7d2973_4a11_44a2_b4ed_abc30507109a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_673b5dac_a325_4c02_b61d_7b4a4c82405e(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count > n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_7bef43b4_eb71_488e_b9fa_4acdb2486c29(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_0c79210e_c1db_4b80_843f_bcd3a70a7439(ArrayList<Integer> arr, int n, int x) {
        boolean flag = False;
        if (n > arr.size()) {
            return flag;
        }
        if (n == 1) {
            return flag;
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                return flag;
            }
            if (arr.get(i) > x) {
                break;
            }
        }
        return flag;
    }

    
    public static boolean isMajority_Problem_3_3d161bbe_6122_4479_886f_6fc816ff76c1(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_9e227f46_ad47_4468_98f7_7ce0b0529783(ArrayList<Integer> arr, int n, int x) {
        
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if (arr.get(i) == x)
                arr1.add(x);
        }
        int count = 0;
        for(int i = 0; i < arr1.size(); i++) {
            if(arr1.get(i) == x)
                count++;
            
        }
        if(count > n/2)
            return True;
        return False;
    }

    
    public static boolean isMajority_Problem_1_e9918e19_1e21_4e6e_8797_e0eae568dd03(ArrayList<Integer> arr, int n, int x) {
        ArrayList<Integer> majority = new ArrayList<Integer>();
        for(Integer e : arr) {
            if(e == x && majority.isEmpty()) {
                majority.add(e);
            } else if (e == x && majority.size() == n/2) {
                majority.add(e);
            } else if (e == x && !majority.isEmpty()) {
                return False;
            }
        }
        return majority.size() == n/2;
    }

    
    public static boolean isMajority_Problem_3_e8c9ae5e_9527_410b_8d8b_53661f76c4a0(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr.get(mid) == x) {
                i = mid + 1;
            } else if (arr.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i >= n / 2;
    }

    
    public static boolean isMajority_Problem_0_5cc751e0_36d4_4e75_b26b_885b0074b387(ArrayList<Integer> arr, int n, int x) {
        boolean result = False;
        int counter = 0;
        for(int i = 0; i<arr.size(); i++) {
            if(arr.get(i)==x && counter < n/2) {
                counter++;
            } else {
                counter = 0;
            }
            if(counter > n/2) {
                result = True;
                break;
            }
        }
        return result;
    }

    
    public static boolean isMajority_Problem_1_0c720924_70b4_4fac_a11b_19d134e6814e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        Iterator<Integer> itr = arr.iterator();
        while(itr.hasNext()) {
            if(itr.next().equals(x)) {
                count++;
            }
        }
        return (count > n/2);
    }

    
    public static boolean isMajority_Problem_1_133b9592_dc11_4aaa_a96c_c08e5c6302da(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_40e7074b_c514_49e5_ad84_d9ba6259dff8(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_5e8152d3_f9b8_4669_9bab_dfa3f96ec880(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_adf992ef_46d1_49fe_bc26_930187c00920(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i=0; i<arr.size(); i++) {
            if(arr.get(i) == x) count++;
        }
        if(count%2 == 0) return True;
        else return False;
    }

    
    public static boolean isMajority_Problem_2_debbc9b8_d87f_4a1b_9a7e_0148f4f4b030(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_7cb6a869_af1a_4dea_bbb4_fc7cf43f6f4e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_51821f3c_4aa1_4c91_a50c_dd9582a02049(ArrayList<Integer> arr, int n, int x) {
        return Collections.frequency(arr, x) > n / 2;
    }

    
    public static boolean isMajority_Problem_0_36fa319a_f7af_41d3_a9bf_f4ff37c6429f(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_f9e1e7a1_8f70_4ccb_885c_aa6c4f4c877c(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_d103a43e_aaa8_4b33_bb39_e2de6f8d7cbf(ArrayList<Integer> arr, int n, int x) {
        for(int i = 1; i < n; i++) {
            if(arr.get(i) == x)
                return False;
        }
        return True;
    }

    
    public static boolean isMajority_Problem_1_0553e750_cfa2_4d9d_a00e_ec3e166557fa(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_94c04d28_f986_436e_80cc_bf8d1ca302b8(ArrayList<Integer> arr, int n, int x) {
        boolean result = False;
        if(arr.size() > n/2) {
            for(int i = 0; i < n/2; i++) {
                if(arr.get(i) == x)
                    break;
            }
            result = True;
        }
        return result;
    }

    
    public static boolean isMajority_Problem_2_0611e6d4_23a4_4f93_9b31_7e1909f70b6e(ArrayList<Integer> arr, int n, int x) {
        /*
         * Your code here
         */
        if (arr.isEmpty()) {
            return False;
        }
        if (n == 0) {
            return True;
        }
        int count = 1;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count == (n + 1)) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_e0b3f826_e1d2_4c9e_9de7_972bf361d376(ArrayList<Integer> arr, int n, int x) {
        int i = 0, count = 0;
        Integer currMax = arr.get(i);
        
        for (int j = 0; j < arr.size(); j++) {
            if (j > 0 && arr.get(j) == currMax) {
                count++;
            }
            if (count > n / 2) {
                return True;
            }
            currMax = arr.get(j);
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_18d33593_b9b8_42b4_842b_be14aa78e0a4(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_ed675725_e1a8_46fd_8710_993fdb2facf2(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_2_6ad11aa7_3c81_4790_b32b_05db4dc3cc7a(ArrayList<Integer> arr, int n, int x) {
        if(arr.size()==0) return False;
        if(arr.size() == 1) return True;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) return True;
            else if(arr.get(i) < x) { count++; }
            else if(arr.get(i) > x) { count--; }
            else if(arr.get(i) == x && count != 0) return False;
        }
        return count == n/2;
    }

    
    public static boolean isMajority_Problem_0_f3674a72_16cb_4075_8d2b_cf5d55264869(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_1_4b2aa8f9_0162_455e_bcd3_702fa3327d56(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_44ba5088_e3b2_4921_b95a_0fc3608a938b(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count >= n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_a955e05e_b4c4_487c_b4a1_4fdeaf0d42eb(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_86799a07_5f7a_4ea8_b75d_58ffe50b95e3(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_21ba7e81_188c_46ee_a814_e73037590a6f(ArrayList<Integer> arr, int n, int x) {
        if (arr.size() == 0 || n == 0) {
            return False;
        }
        
        int count = arr.stream().filter(v -> v == x).count();
        
        if (count == 0) {
            return False;
        }
        
        if (count > n / 2) {
            return True;
        }
        
        return False;
    }

    
    public static boolean isMajority_Problem_3_a7bb45d4_79c6_49c0_8a7f_509227d612b5(ArrayList<Integer> arr, int n, int x) {
        return (n/2) >= arr.stream().filter(e -> e == x).count();
    }

    
    public static boolean isMajority_Problem_3_22f68ecb_7239_485c_90de_577cd7f2f650(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_2_a11f0e41_38c3_4fe9_82f7_dde77435a448(ArrayList<Integer> arr, int n, int x) {
        boolean isMajority_Problem_2_a11f0e41_38c3_4fe9_82f7_dde77435a448 = False;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                if (isMajority_Problem_2_a11f0e41_38c3_4fe9_82f7_dde77435a448 == False || (arr.get(i) > n / 2 && !isMajority_Problem_2_a11f0e41_38c3_4fe9_82f7_dde77435a448)) {
                    isMajority_Problem_2_a11f0e41_38c3_4fe9_82f7_dde77435a448 = True;
                }
            }
        }
        return isMajority_Problem_2_a11f0e41_38c3_4fe9_82f7_dde77435a448;
    }

    
    public static boolean isMajority_Problem_2_727ffbc7_85e7_4915_baa6_e1f73024c2ba(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_223420d4_e520_48fd_91e4_4e6815ffa643(ArrayList<Integer> arr, int n, int x) {
        boolean result = False;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                if (i + 1 >= n || arr.get(i + 1) != x) {
                    result = True;
                    break;
                }
            }
        }
        return result;
    }

    
    public static boolean isMajority_Problem_3_acff57aa_87aa_4acf_a4b4_c458f10fc6a5(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            count++;
            if (count > n) {
                count = 1;
            }
            if (arr.get(i) < x) {
                count = 1;
            }
            if (arr.get(i) == x) {
                count++;
            }
            if (arr.get(i) > x) {
                if (max < arr.get(i)) {
                    max = arr.get(i);
                }
            }
        }
        if (max < n) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_183d25b2_2a21_4bfc_8770_232a05103496(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_a38af391_2206_49fe_b738_afd719b0ab99(ArrayList<Integer> arr, int n, int x) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                cnt++;
            }
        }
        if (cnt > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_72201da0_80b4_421d_ba02_f0e019fdac48(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i : arr) {
            if(i == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_3_36da0334_c455_4f0d_bcc2_764af25a5b99(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        for(Integer l : arr) {
            if(l == x) {
                count++;
                if(count >= n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_cb665a80_9835_4e91_ad96_b9120e50d3e9(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_861458c1_cb2b_45b0_adcb_8e9d8578f344(ArrayList<Integer> arr, int n, int x) {
        // Your code here
        return arr.stream().anyMatch(el -> x > n/2 ? x == el : False);
    }

    
    public static boolean isMajority_Problem_0_c5fc33dc_45e1_458e_8c32_28c69073fd81(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_86fb498c_753d_4082_9a98_77164b8a0930(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count >= n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_7a188f9f_b12a_4d1d_b894_fdf59d8db9b0(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_16c06ddf_5622_4748_b5bd_0066d2a50c3a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_4db9fa9d_7d55_46a9_a55a_cb307d90b5d0(ArrayList<Integer> arr, int n, int x) {
        int count = 1;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count >= (n/2);
    }

    
    public static boolean isMajority_Problem_1_1c547641_9ce8_44fe_8f2a_dc1edd695614(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count >= n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_3344f627_62c1_4686_a64f_883eedb82f1a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_2c9f6c42_515e_4f6e_88a1_c3d0a77b7e29(ArrayList<Integer> arr, int n, int x) {
        int sum=0;
        for(int i=0;i<arr.size();i++)
            sum+=arr.get(i);
        if(sum%n==0)
            return True;
        else
            return False;
    }

    
    public static boolean isMajority_Problem_0_b731ff1f_79f9_4bfd_9df1_86a19e9f5381(ArrayList<Integer> arr, int n, int x) {
        boolean result = False;
        int count = 1;
        for (Integer i: arr) {
            if (i.intValue() == x) {
                count++;
            }
        }
        if (count > n/2) {
            result = True;
        }
        return result;
    }

    
    public static boolean isMajority_Problem_3_54b18c3a_b13b_4ade_8c3e_37179dcf0bf9(ArrayList<Integer> arr, int n, int x) {
        boolean isMajority_Problem_3_54b18c3a_b13b_4ade_8c3e_37179dcf0bf9 = False;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
        }
        if (sum == n) {
            for (int i = 0; i < n; i++) {
                if (x == arr.get(i)) {
                    isMajority_Problem_3_54b18c3a_b13b_4ade_8c3e_37179dcf0bf9 = True;
                }
            }
        } else if (sum > n / 2) {
            isMajority_Problem_3_54b18c3a_b13b_4ade_8c3e_37179dcf0bf9 = True;
        }
        return isMajority_Problem_3_54b18c3a_b13b_4ade_8c3e_37179dcf0bf9;
    }

    
    public static boolean isMajority_Problem_1_51821f3c_4aa1_4c91_a50c_dd9582a02049(ArrayList<Integer> arr, int n, int x) {
        return Collections.frequency(arr, x) > n / 2;
    }

    
    public static boolean isMajority_Problem_0_adf992ef_46d1_49fe_bc26_930187c00920(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i=0; i<arr.size(); i++) {
            if(arr.get(i) == x) count++;
        }
        if(count%2 == 0) return True;
        else return False;
    }

    
    public static boolean isMajority_Problem_0_db43d63c_0e14_41d1_90f8_20786dc3f6f8(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_2ebb64de_08c2_44b9_aac6_c5e5089a3b05(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_68433381_51dc_4e71_8818_ffc93fea3c6f(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_0_88e6c207_63c5_4cf2_9622_b255ffd48b62(ArrayList<Integer> arr, int n, int x) {
        //write your logic here
        
        for(int i = 0; i < arr.size(); i++)
            if(arr.get(i) == x)
            {
                
                return True;
            }
        
        
        return False;
    }

    
    public static boolean isMajority_Problem_0_cb240ae4_b00e_44d4_b882_942f653c7585(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int val : arr) {
            if (val == x)
                count++;
        }
        int counter = Math.ceil((double)count/(double)(n/2));
        return (counter == n);
    }

    
    public static boolean isMajority_Problem_0_e8c9ae5e_9527_410b_8d8b_53661f76c4a0(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr.get(mid) == x) {
                i = mid + 1;
            } else if (arr.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i >= n / 2;
    }

    
    public static boolean isMajority_Problem_1_1b11aee2_60ca_4a3e_9d5a_51ef02e86616(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_da9b92fb_cbdd_4197_9dcf_3486bbcc72e7(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_6ad11aa7_3c81_4790_b32b_05db4dc3cc7a(ArrayList<Integer> arr, int n, int x) {
        if(arr.size()==0) return False;
        if(arr.size() == 1) return True;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) return True;
            else if(arr.get(i) < x) { count++; }
            else if(arr.get(i) > x) { count--; }
            else if(arr.get(i) == x && count != 0) return False;
        }
        return count == n/2;
    }

    
    public static boolean isMajority_Problem_1_6cb319ed_40db_4dea_ab03_648ee886bde0(ArrayList<Integer> arr, int n, int x) {
        int cnt = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x)
                cnt++;
        }
        return (cnt > n / 2);
    }

    
    public static boolean isMajority_Problem_0_4650d1bd_c673_413d_8766_3a71f4f412a6(ArrayList<Integer> arr, int n, int x) {
        boolean isMajority_Problem_0_4650d1bd_c673_413d_8766_3a71f4f412a6 = False;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(x == arr.get(i)) {
                count++;
            }
        }
        if(count > n/2) {
            isMajority_Problem_0_4650d1bd_c673_413d_8766_3a71f4f412a6 = True;
        }
        return isMajority_Problem_0_4650d1bd_c673_413d_8766_3a71f4f412a6;
    }

    
    public static boolean isMajority_Problem_1_8d079501_ad81_40ce_b2d6_5dbffa2cbd24(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_81f1d1e7_7b2a_4e5c_b371_8d7d387d6591(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_74b5756c_3472_4537_b7c7_4e6304981d05(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr.get(mid) == x) {
                i = mid + 1;
            } else if (arr.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i >= n / 2;
    }

    
    public static boolean isMajority_Problem_3_e8e57958_5049_471b_b253_6d3432531947(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
            if(count == n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_8af29036_f424_497c_a4ca_5910855122bc(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
                if(count >= n/2) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_6a24bf3b_b0c9_416e_ad20_d610ab5d9b28(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_3bdaeaea_127e_4b3b_8b5b_ba146d9d1e85(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_364f9d0a_6028_4804_b424_ab24b22cf5cd(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_2_6bcea7c5_5a0d_473f_83c7_7b13a4266c43(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_bfd67a4c_6544_499b_bfe2_1926b28ddec2(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i < j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else if (arr.get(i) > x) {
                i++;
            } else if (arr.get(j) > x) {
                j--;
            } else {
                i++;
                j--;
            }
        }
        return i >= n / 2;
    }

    
    public static boolean isMajority_Problem_0_4a5223ba_2514_47a1_a760_d3bec6000f8d(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_849200bb_8378_4472_b897_a0cffc004ce3(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr.get(mid) == x) {
                i = mid + 1;
            } else if (arr.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i > n / 2;
    }

    
    public static boolean isMajority_Problem_0_4a4fc8a2_16c6_4988_9db3_e5caec451324(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_40bac3f7_bc03_4e8d_9462_806e38a1817d(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_dfe714b6_adee_4c44_881c_4d3c5573a6ee(ArrayList<Integer> arr, int n, int x) {
        // code here
        int halfLength = arr.size() / 2;
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count == halfLength) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_56ce9e7d_9931_482d_ada3_2c037a881c37(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
                if (count > n/2) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_fafd0d36_68a7_4dcf_830f_07dfa9b18e2a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_9094de8b_2c8a_422b_8016_7ebc323aa14d(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_26b341e2_4598_4e87_ae90_79fcfcdd7fb4(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_9094de8b_2c8a_422b_8016_7ebc323aa14d(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_c3e70db6_a391_4d87_8030_851d9c63323b(ArrayList<Integer> arr, int n, int x) {
        Set<Integer> set = new HashSet<>();
        for (Integer num : arr) {
            if (set.contains(num)) {
                set.remove(num);
            }
            if (set.size() < n/2) {
                set.add(num);
            }
            if (set.size() == n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_910a1a30_e485_4a3e_8e8a_f522da46d1de(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_663cae9e_b91e_480f_99b5_8a662c6a2669(ArrayList<Integer> arr, int n, int x) {
        int count = 0, maxCount = 0, maxValue = 0, minValue = 0, temp;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                    maxValue = arr.get(i);
                } else if (count < maxCount) {
                    minValue = arr.get(i);
                }
            }
        }
        return (maxCount > n / 2);
    }

    
    public static boolean isMajority_Problem_0_37143954_5e63_4169_841c_0cdb4621cdbd(ArrayList<Integer> arr, int n, int x) {
        boolean found = False;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x)
                found = True;
        }
        return found;
    }

    
    public static boolean isMajority_Problem_0_89e54e22_b053_4dc5_9062_f57a535e8c7c(ArrayList<Integer> arr, int n, int x) {
        Set<Integer> set = new HashSet<Integer>();
        for(int l : arr)
            set.remove(l);
        return set.size() >= n/2;
    }

    
    public static boolean isMajority_Problem_0_253fabb1_0bad_458c_8ad6_2ccd60e11daf(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_2ebb64de_08c2_44b9_aac6_c5e5089a3b05(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_9475e2b1_b63c_431e_8aa3_3d475ba5dc42(ArrayList<Integer> arr, int n, int x) {
        // Write your code here.
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_1bc322a8_7087_4fdb_a7ab_ace668434915(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            count++;
            if(count == n/2)
                break;
            if(arr.get(i) == x) {
                count -= 1;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_1_db43d63c_0e14_41d1_90f8_20786dc3f6f8(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_2_ee71fc3f_6bb6_4e60_8db9_5a4d72ecc175(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_c2158a59_e6e0_4b71_aeb0_68bd0396961b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_3344f627_62c1_4686_a64f_883eedb82f1a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_38416e88_bc7c_4b51_9ce5_d4dc5d9a25f2(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_cb240ae4_b00e_44d4_b882_942f653c7585(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int val : arr) {
            if (val == x)
                count++;
        }
        int counter = Math.ceil((double)count/(double)(n/2));
        return (counter == n);
    }

    
    public static boolean isMajority_Problem_1_c8c4b125_2d95_4266_9035_4a2f64ac9408(ArrayList<Integer> arr, int n, int x) {
        if (arr.isEmpty() || n <= 0) {
            return False;
        }
        int prevNum = 0, currNum = 0, flag = 0;
        int len = arr.size();
        if (len == 1) {
            if (arr.get(0) == x) {
                return True;
            }
            return False;
        }
        for (int i = 0; i < len - 1; i++) {
            if (arr.get(i) == x) {
                prevNum = arr.get(i);
                currNum = arr.get(i + 1);
                flag = 0;
            } else if (currNum == x) {
                currNum = arr.get(i + 1);
                flag = 1;
            } else if (prevNum < x && currNum < x) {
                currNum = arr.get(i + 1);
                flag = 1;
            }
            if (prevNum == x && currNum == x && flag == 0) {
                return True;
            } else if (prevNum == x && currNum == x && flag == 1) {
                prevNum = arr.get(i);
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_1d0824e5_4efa_4410_9700_d64d374cc10b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_253fabb1_0bad_458c_8ad6_2ccd60e11daf(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_77c1129b_a16c_4e77_aa23_bfd9675abfad(ArrayList<Integer> arr, int n, int x) {
        int count = 1;
        for (Integer i : arr) {
            if (i == x) { 
                count++;
            }
        }
        if (count > n/2) {
            return True;
        }
        else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_9b2b4aef_fa4a_49dc_b6be_fa4278ef73aa(ArrayList<Integer> arr, int n, int x) {
        // Initialize and set counter and count to 0
        int count = 0;
        int counter = 0;

        // Initialize to False, since the first element is not majority element
        boolean result = False;

        // For each element
        for (int element : arr) {
            // Increment counter
            counter++;
            // If counter is equal to n
            if (counter == n) {
                // Set the flag to True
                result = True;
                // Stop the for loop
                break;
            }
            // Increment count
            count++;
        }
        // Return result
        return result;
    }

    
    public static boolean isMajority_Problem_0_2ca55343_6b67_4314_906a_3062d42b90da(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_2f3ab815_a8c1_4ddb_9116_54817c6042b8(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count >= n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_9fb81018_c180_49d7_8d26_1b5838eedd9e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_3d6e9036_ecaa_4af5_88f9_75e8be080389(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count > n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_ee04cb2c_b4da_4641_9782_a6fd0ac1bf7e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int e : arr) {
            count += e;
        }
        return ((count+1)/2) < n;
    }

    
    public static boolean isMajority_Problem_2_173c7c3d_bd48_4185_bbe8_32084bf98ffd(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            if (arr.get(i) == x) {
                i++;
                if (i == arr.size()) {
                    return True;
                }
            } else if (arr.get(j) == x) {
                j--;
                if (j == -1) {
                    return True;
                }
            } else if (arr.get(i) > x) {
                i++;
            } else {
                j--;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_f8b573b0_d9b1_4604_a651_76ed90112829(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_b966c2ed_7b43_43a6_bcc4_74a4c263e902(ArrayList<Integer> arr, int n, int x) {
        // Initialize result to False
        boolean result = False;

        // Initialize count
        int count = 0;

        // Loop through array
        for (Integer i : arr) {
            // Increment count
            count++;

            // If current element x is greater than the element in the array and count is greater than n/2, then result is True
            if (i > x && count > n/2) {
                result = True;
                break;
            }
        }
        return result;
    }

    
    public static boolean isMajority_Problem_1_40bac3f7_bc03_4e8d_9462_806e38a1817d(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_707bb5fc_0c32_45e1_a65f_70635eccd8aa(ArrayList<Integer> arr, int n, int x) {
        boolean result = False;

        // Write the code here
        
        return result;
    }

    
    public static boolean isMajority_Problem_3_8b4f86fe_1e38_43bf_b5fa_3eef67f91378(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_38416e88_bc7c_4b51_9ce5_d4dc5d9a25f2(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_7e0bf209_aca4_41d0_8ab6_1b20019e12dc(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count >= n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_56ba0bbe_0286_4360_a615_d31ef91550a4(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_38190ed1_ca9e_4f8d_968a_d0af16702c28(ArrayList<Integer> arr, int n, int x) {
        ArrayList<Integer> copy = new ArrayList<>(arr);
        copy.remove(x);
        int count = 0;
        for (int i = 0; i < copy.size(); i++) {
            if (copy.get(i) == x)
                count++;
        }
        if (copy.size() > (n / 2))
            return False;
        else
            return True;
    }

    
    public static boolean isMajority_Problem_3_89e54e22_b053_4dc5_9062_f57a535e8c7c(ArrayList<Integer> arr, int n, int x) {
        Set<Integer> set = new HashSet<Integer>();
        for(int l : arr)
            set.remove(l);
        return set.size() >= n/2;
    }

    
    public static boolean isMajority_Problem_1_af883098_bdcb_4638_aed0_aff576df049b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_0_fcb145ed_2775_4d6e_b62a_8b9529edbe86(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_1690a06b_4634_4651_9470_413601544ffa(ArrayList<Integer> arr, int n, int x) {
        
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x)
                count++;
            else
                break;
        }
        if(count == n/2)
            return True;
        else
            return False;
    }

    
    public static boolean isMajority_Problem_1_57dd38fc_4ea8_4d8c_9264_2382c0e25b03(ArrayList<Integer> arr, int n, int x) {
        int j = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                max++;
            } else {
                if (max > arr.size() / 2) {
                    max = arr.size() / 2;
                    j = i;
                }
            }
        }
        return max == arr.size() / 2;
    }

    
    public static boolean isMajority_Problem_2_46d0a89c_0ad3_4642_870a_772a3941f1b8(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_5305b537_f280_4fef_9cab_10b3b131fdcd(ArrayList<Integer> arr, int n, int x) {
        boolean isMajority_Problem_0_5305b537_f280_4fef_9cab_10b3b131fdcd = False;
        int size = arr.size();
        int count = 0;
        for(int i = 0; i < size; i++){
            count++;
            if(arr.get(i) == x){
                count--;
            }
        }
        if(count > n/2){
            isMajority_Problem_0_5305b537_f280_4fef_9cab_10b3b131fdcd = True;
        }
        return isMajority_Problem_0_5305b537_f280_4fef_9cab_10b3b131fdcd;
    }

    
    public static boolean isMajority_Problem_0_49f494bc_2188_412f_bb34_a24ff1ecd2b8(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else if (arr.get(i) < x && arr.get(j) > x) {
                return True;
            } else if (arr.get(i) > x && arr.get(j) < x) {
                return False;
            } else {
                i++;
                j--;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_dea0ff3b_6a59_43d1_9c81_3ab30af4f0fd(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        boolean has = False;
        for (Integer val : arr) {
            if (val.equals(x)) {
                count++;
                if (count == n/2) {
                    has = True;
                    break;
                }
            }
        }
        return has;
    }

    
    public static boolean isMajority_Problem_2_77c1129b_a16c_4e77_aa23_bfd9675abfad(ArrayList<Integer> arr, int n, int x) {
        int count = 1;
        for (Integer i : arr) {
            if (i == x) { 
                count++;
            }
        }
        if (count > n/2) {
            return True;
        }
        else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_f2a8e96c_3821_4814_9019_f307bf74e9c0(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_620b34b2_5f7f_433f_8ba5_4e0623716212(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count >= n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_e5b37cd1_088b_434b_9269_d987e321290e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        int prev = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
                if (count > n/2) {
                    return True;
                }
            }
            else {
                count = 1;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_4b2aa8f9_0162_455e_bcd3_702fa3327d56(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_75277b5f_166c_4497_941a_41cc7f1bf4c5(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_3c1754a6_f1b0_4449_af04_0d5b7a8b8104(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_84788db4_27e6_4ebc_9698_e3be6cd53163(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_dedcb0a6_01db_4c70_a3f5_4943edd9e377(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        return False; // change to True
    }

    
    public static boolean isMajority_Problem_0_dd8467d2_0bf0_4fe8_860a_c3e5b694a581(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_1d0824e5_4efa_4410_9700_d64d374cc10b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_e86dd03a_7fcc_4415_bb62_abf8aa7f55ec(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_25272680_bf47_45c8_afbc_18c86c0eb89e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_5d5614c9_9713_42df_9942_1ce069bba982(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count > n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_c7df3376_bf02_45cd_801e_486d6307242d(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_2ca55343_6b67_4314_906a_3062d42b90da(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_1812f420_26fa_4562_b0fe_008e1892624e(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_0_1b11aee2_60ca_4a3e_9d5a_51ef02e86616(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_51dc0151_8455_46ee_a7ff_628d8ea4ae44(ArrayList<Integer> arr, int n, int x) {
        boolean found = False;
        for (int i : arr) {
            if (i == x) {
                if (n > arr.size() / 2) {
                    found = True;
                    break;
                }
            } else {
                if (i < x) {
                    found = True;
                    break;
                }
            }
        }
        return found;
    }

    
    public static boolean isMajority_Problem_3_6c7e10bf_667d_4ed6_864e_c09f00e53663(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(Integer i:arr) {
            if(i == x) count++;
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_1_27ec5f6c_ff5a_4841_97a8_2f021d221f8f(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_16c50a51_8c96_43d2_839b_eb2f638600c8(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_e1b584cb_1fe6_4e61_a5b8_5cdeadf47455(ArrayList<Integer> arr, int n, int x) {
        if (arr == null || n < 2) {
            return False;
        }
        boolean isMajority_Problem_2_e1b584cb_1fe6_4e61_a5b8_5cdeadf47455 = False;
        int i = arr.size() - 1;
        for (; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                if (i == n / 2) {
                    isMajority_Problem_2_e1b584cb_1fe6_4e61_a5b8_5cdeadf47455 = True;
                    break;
                }
                else {
                    return False;
                }
            }
        }
        return isMajority_Problem_2_e1b584cb_1fe6_4e61_a5b8_5cdeadf47455;
    }

    
    public static boolean isMajority_Problem_0_3bdaeaea_127e_4b3b_8b5b_ba146d9d1e85(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_f2eee1bb_8910_4d40_8514_30a1f2435d84(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_e339db5c_41cc_4977_8eba_c65538febeb3(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_0866f275_c5cb_4f49_9117_1bb6ec0292e3(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x)
                count++;
        }
        if (count > n/2)
            return True;
        return False;
    }

    
    public static boolean isMajority_Problem_3_fc1327e2_1b0b_45c2_95ea_ef34ffd6435a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_c3bb5989_67c0_47c2_8093_36163a7e14e1(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_94c04d28_f986_436e_80cc_bf8d1ca302b8(ArrayList<Integer> arr, int n, int x) {
        boolean result = False;
        if(arr.size() > n/2) {
            for(int i = 0; i < n/2; i++) {
                if(arr.get(i) == x)
                    break;
            }
            result = True;
        }
        return result;
    }

    
    public static boolean isMajority_Problem_1_78a880d5_0bdd_4706_8d67_b735ba3daf41(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_ba0b7815_e0ff_4f8e_9a8c_4006598f06d3(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_8a1894bc_bd38_4939_860c_1ed6ab4e8d37(ArrayList<Integer> arr, int n, int x) {
        int count = 0; // count number of times x is repeated
        for (int num : arr)
            if (num == x)
                count++;
        if (count > n / 2)
            return True;
        else
            return False;
    }

    
    public static boolean isMajority_Problem_2_dd60960a_89be_4f1d_af18_034d679fb299(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        for(int j=1;j<arr.size();j++){
            if((arr.get(i)>x)&&(j<arr.size()-1)){
                i++;
            }
            if(i==n){
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_c3fb5b44_c29d_4eea_b4bd_83e9dbf0ebd2(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_22f68ecb_7239_485c_90de_577cd7f2f650(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_2_75277b5f_166c_4497_941a_41cc7f1bf4c5(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_18d33593_b9b8_42b4_842b_be14aa78e0a4(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_4a5223ba_2514_47a1_a760_d3bec6000f8d(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_a769a5ba_3eb4_4e15_ae0a_2990d8c62c6b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_7fe75fa3_0d2f_41a2_8fa7_99c251b386d9(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_8e46b752_b217_4924_885e_b617b725c02f(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i < j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else if (arr.get(i) > x) {
                i++;
            } else if (arr.get(j) > x) {
                j--;
            } else {
                i++;
                j--;
            }
        }
        return i >= n / 2;
    }

    
    public static boolean isMajority_Problem_1_a38af391_2206_49fe_b738_afd719b0ab99(ArrayList<Integer> arr, int n, int x) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                cnt++;
            }
        }
        if (cnt > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_49f494bc_2188_412f_bb34_a24ff1ecd2b8(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else if (arr.get(i) < x && arr.get(j) > x) {
                return True;
            } else if (arr.get(i) > x && arr.get(j) < x) {
                return False;
            } else {
                i++;
                j--;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_c5023254_280f_4635_b2da_d97d85f640f9(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_0_f049a33e_b5c5_4fcb_9359_8c6e0f56d09e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_6a24bf3b_b0c9_416e_ad20_d610ab5d9b28(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_16a2fc9e_1728_48a6_90cf_705571ffe806(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int element : arr) {
            if (element == x) {
                count++;
            }
        }
        // majority element is n
        return count == n / 2;
    }

    
    public static boolean isMajority_Problem_0_d14ab01a_7d4c_4a99_93d0_34376c6d090b(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_fd4e34b5_b449_4fbe_a952_a1bbfef92e9d(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_3274ded1_99cc_41fa_8af5_66eb759aed44(ArrayList<Integer> arr, int n, int x) {
        return arr.stream().distinct().count() < n/2;
    }

    
    public static boolean isMajority_Problem_1_60784034_a3aa_4ab0_beb3_fa751dfd29ac(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_0_bf68beb5_ef83_4a73_bc9f_1177e2e5691c(ArrayList<Integer> arr, int n, int x) {
        if (arr.isEmpty() || x == 0) {
            return False;
        }
        int count = 0;
        for (int i : arr) {
            if (i == x)
                count++;
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_3_86799a07_5f7a_4ea8_b75d_58ffe50b95e3(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_f6565038_eff2_436b_b74a_453775906688(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_da9b92fb_cbdd_4197_9dcf_3486bbcc72e7(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_b6bfb2b3_2afd_46e3_b7c1_0e606ab3f721(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_2_ab9eeb72_ce0c_4534_ae3b_3d48e65e7c35(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
            if(count > n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_23348112_8382_41e5_830e_0c8953bba1a3(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_5fa7e166_29ef_4cdb_abde_70e9e0886cd5(ArrayList<Integer> arr, int n, int x) {
        return arr.stream().filter((e) -> {
            return (n-arr.indexOf(e)) > n/2;
        }).count() == 1;
    }

    
    public static boolean isMajority_Problem_3_16a2fc9e_1728_48a6_90cf_705571ffe806(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int element : arr) {
            if (element == x) {
                count++;
            }
        }
        // majority element is n
        return count == n / 2;
    }

    
    public static boolean isMajority_Problem_1_36da0334_c455_4f0d_bcc2_764af25a5b99(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        for(Integer l : arr) {
            if(l == x) {
                count++;
                if(count >= n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_44ba5088_e3b2_4921_b95a_0fc3608a938b(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count >= n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_ab9eeb72_ce0c_4534_ae3b_3d48e65e7c35(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
            if(count > n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_8a1894bc_bd38_4939_860c_1ed6ab4e8d37(ArrayList<Integer> arr, int n, int x) {
        int count = 0; // count number of times x is repeated
        for (int num : arr)
            if (num == x)
                count++;
        if (count > n / 2)
            return True;
        else
            return False;
    }

    
    public static boolean isMajority_Problem_1_a18c1fac_c26b_4eba_a1d8_3d649b88928f(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr.get(i) == x){
                count++;
            }
        }
        if(count > n/2){
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_5c9eff8d_bf41_48b0_95dd_9e1d5f057672(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_1_d9fdc431_9609_4403_b805_b4f188f0c359(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_4a4fc8a2_16c6_4988_9db3_e5caec451324(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_2e81376d_0faf_4613_9de6_39d3fb8d592f(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else {
                if (i == j) {
                    return False;
                } else if (arr.get(i) > arr.get(j)) {
                    j--;
                } else {
                    i++;
                }
            }
        }
        return i > n / 2;
    }

    
    public static boolean isMajority_Problem_1_513b2c1e_e902_44eb_b3f2_993823b6184f(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else {
                if (i == j) {
                    return False;
                }
                if (arr.get(i) > arr.get(j)) {
                    j--;
                } else {
                    i++;
                }
            }
        }
        return i > n/2;
    }

    
    public static boolean isMajority_Problem_3_dd60960a_89be_4f1d_af18_034d679fb299(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        for(int j=1;j<arr.size();j++){
            if((arr.get(i)>x)&&(j<arr.size()-1)){
                i++;
            }
            if(i==n){
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_423729c9_ad5a_4743_ac56_887e53583e93(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_b72b692f_8c81_4c7c_86d3_3dca09650932(ArrayList<Integer> arr, int n, int x) {
        int max1 = -1L;
        int max2 = -1L;
        for(int i = 0; i <= arr.size(); i++) {
            if(i == 0) {
                max1 = arr.get(i);
            } else {
                max2 = arr.get(i);
                if(max1 > max2) {
                    max2 = max1;
                }
            }
        }
        if(max1 != -1) {
            int counter = 0;
            for(int i = arr.size(); i > 0; i--) {
                counter++;
                if(arr.get(i - 1) == max2) {
                    break;
                }
            }
            if(counter > n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_2e81376d_0faf_4613_9de6_39d3fb8d592f(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else {
                if (i == j) {
                    return False;
                } else if (arr.get(i) > arr.get(j)) {
                    j--;
                } else {
                    i++;
                }
            }
        }
        return i > n / 2;
    }

    
    public static boolean isMajority_Problem_0_c33546a6_1a6e_4705_bb13_19c45d42e2a6(ArrayList<Integer> arr, int n, int x) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer num : arr) {
            Integer count = map.getOrDefault(num, 0);
            map.put(num, ++count);
            if (count > n/2)
                return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_f3674a72_16cb_4075_8d2b_cf5d55264869(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_3_210409c1_dd97_4b74_ac35_8d72d5e3de4e(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else {
                if (i == j) {
                    return False;
                } else if (arr.get(i) > arr.get(j)) {
                    j--;
                } else {
                    i++;
                }
            }
        }
        return i > n / 2;
    }

    
    public static boolean isMajority_Problem_1_9094de8b_2c8a_422b_8016_7ebc323aa14d(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_0e433d6c_6a4e_4688_a7cc_7c4e0b870449(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int tempCount = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                tempCount++;
            }
        }
        if (tempCount > n/2) {
            return True;
        }
        else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_c5fc33dc_45e1_458e_8c32_28c69073fd81(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_d10153de_dbac_4727_80e1_7df63565637d(ArrayList<Integer> arr, int n, int x) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int count = 0;
        for(int i : arr) {
            if(i == x) count++;
        }
        if(count > n/2)
            return True;
        return False;
    }

    
    public static boolean isMajority_Problem_0_638db077_1be6_45c1_917e_07bdc21f6a62(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_2_8f7433e2_bd6e_4b6e_973d_5017c75639c1(ArrayList<Integer> arr, int n, int x) {
        // Your code here
        int c = 0;
        boolean b = False;
        for(int i = 0 ; i < arr.size() ; i++) {
            if(arr.get(i) == x) {
                c++;
            }
        }
        if (c == n/2) {
            b = True;
        }
        return b;
    }

    
    public static boolean isMajority_Problem_0_44f0a48b_c903_4eaf_bd7d_2d5c3479272e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_248b0ba8_c11e_4aa0_9b3f_09dcbb3edb75(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_423729c9_ad5a_4743_ac56_887e53583e93(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_75fd629c_abf9_49d7_b400_6607008b1a02(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2)
            return True;
        else
            return False;
    }

    
    public static boolean isMajority_Problem_2_bb661968_9bbe_450e_a235_310cb4be58e7(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i < x) {
                count++;
            }
        }
        return count > (n/2);
    }

    
    public static boolean isMajority_Problem_2_b96f3570_ada7_4c7d_8954_69c2474fe5dc(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_e333533e_966e_4076_833e_f4fb2c7f7b82(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_364f9d0a_6028_4804_b424_ab24b22cf5cd(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_2_b3c96bf0_4b3f_4b99_a25f_6cd0ec632f69(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_c551f105_01a3_4912_9cfb_7c536daf171e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_e3126653_272d_48fe_abbf_57f5457f9ada(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
            if(count > n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_223420d4_e520_48fd_91e4_4e6815ffa643(ArrayList<Integer> arr, int n, int x) {
        boolean result = False;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                if (i + 1 >= n || arr.get(i + 1) != x) {
                    result = True;
                    break;
                }
            }
        }
        return result;
    }

    
    public static boolean isMajority_Problem_0_69796af9_c213_49ca_b574_facfd8b3c5f0(ArrayList<Integer> arr, int n, int x) {
        int countElement = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                countElement++;
            }
        }
        boolean isMajority_Problem_0_69796af9_c213_49ca_b574_facfd8b3c5f0 = False;
        if (countElement > (n-1)/2) {
            isMajority_Problem_0_69796af9_c213_49ca_b574_facfd8b3c5f0 = True;
        }
        return isMajority_Problem_0_69796af9_c213_49ca_b574_facfd8b3c5f0;
    }

    
    public static boolean isMajority_Problem_1_c551f105_01a3_4912_9cfb_7c536daf171e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_af1dcde4_49cd_49eb_848e_ea94ae43eb62(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_bf68beb5_ef83_4a73_bc9f_1177e2e5691c(ArrayList<Integer> arr, int n, int x) {
        if (arr.isEmpty() || x == 0) {
            return False;
        }
        int count = 0;
        for (int i : arr) {
            if (i == x)
                count++;
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_1_0ec0a661_6eba_4007_be25_ebafa71e34bc(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_5e8152d3_f9b8_4669_9bab_dfa3f96ec880(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_1e183f3d_d5aa_4809_bc6d_0df59022b4f0(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_f5297add_0b98_4007_9e3f_c0de7a68c47b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (Integer i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_004fff93_dfd6_4343_80d8_ccc5b74ad62e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_60499496_b490_47d7_b057_b5f9b91cc082(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_2b44e83c_faa2_436a_83e3_8461c508475b(ArrayList<Integer> arr, int n, int x) {
        // Write your solution here
        if(arr.isEmpty()){
            return True;
        }
        int count = 1;
        int temp = 0;
        for (int i = 0; i < arr.size(); i++) {
            if(arr.contains(x)){
                count++;
            }
        }
        if(arr.contains(x)){
            temp = (n*(n+1)/2);
            if(count/2 == temp){
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_cedbf23d_44fb_4936_8b45_7a09acc774c6(ArrayList<Integer> arr, int n, int x) {
        int count = 0; // keep track of current count of majority
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) { // if current element equals x, add 1 to count
                count++;
            } else if (arr.get(i) > x) { // if current element is not equal to x, check if current count is greater than n/2
                count++;
                if (count >= n/2)
                    return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_6ad11aa7_3c81_4790_b32b_05db4dc3cc7a(ArrayList<Integer> arr, int n, int x) {
        if(arr.size()==0) return False;
        if(arr.size() == 1) return True;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) return True;
            else if(arr.get(i) < x) { count++; }
            else if(arr.get(i) > x) { count--; }
            else if(arr.get(i) == x && count != 0) return False;
        }
        return count == n/2;
    }

    
    public static boolean isMajority_Problem_1_3344f627_62c1_4686_a64f_883eedb82f1a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_6844eaa7_2325_4eda_8435_0f96dff7bf3d(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_e8dc97e5_7409_4de3_8ee8_d4fc5d4c29e7(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
            if (count == (n/2) - 1) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_bec933d9_e8aa_4919_9795_a360b9b04538(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_cc45e604_d688_4bdd_8dd2_1e9a816f4e10(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_68433381_51dc_4e71_8818_ffc93fea3c6f(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_b812a1b0_15a2_490a_991d_8b4054ebeb9b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_0ec0a661_6eba_4007_be25_ebafa71e34bc(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_cb5c5652_067a_4771_bef7_f5e8954cdc1f(ArrayList<Integer> arr, int n, int x) {
        if (arr.isEmpty()) {
            return False;
        }
        ArrayList<Integer> sortedArr = new ArrayList<>();
        sortedArr.addAll(arr);
        Collections.sort(sortedArr);
        int highestCount = 0;
        for (int count : sortedArr) {
            if (count > highestCount) {
                highestCount = count;
            }
        }
        return highestCount == n / 2;
    }

    
    public static boolean isMajority_Problem_1_987ef3c9_659c_4edc_8514_138cb8f10cdc(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_5257ad5a_9709_4d80_bf70_6b366ba13633(ArrayList<Integer> arr, int n, int x) {
        // Write your code here.
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_c33546a6_1a6e_4705_bb13_19c45d42e2a6(ArrayList<Integer> arr, int n, int x) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer num : arr) {
            Integer count = map.getOrDefault(num, 0);
            map.put(num, ++count);
            if (count > n/2)
                return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_c7de5bcc_371e_4fa6_807f_611a5aad66a2(ArrayList<Integer> arr, int n, int x) {
        int countElem = 0, countElem1 = 0;
        for(int i = 0; i<n; i++) {
            if(arr.get(i) == x) { countElem++; }
            if(arr.get(i) == arr.get(i-1)) { countElem1++; }
        }
        if(countElem > n/2) {
            return True;
        }
        else {
            if(countElem1 > n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_7f017d52_1ba6_4cb1_b20f_c5e0f62f0c09(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_7bef43b4_eb71_488e_b9fa_4acdb2486c29(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_8af29036_f424_497c_a4ca_5910855122bc(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
                if(count >= n/2) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_74b5756c_3472_4537_b7c7_4e6304981d05(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr.get(mid) == x) {
                i = mid + 1;
            } else if (arr.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i >= n / 2;
    }

    
    public static boolean isMajority_Problem_2_65a50a89_d8f5_43fe_8b54_0da1633d924a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        int index = arr.size() - 1;
        while (index >= 0) {
            if (arr.get(index) == x) {
                count++;
            }
            index--;
        }
        return count >= (n/2);
    }

    
    public static boolean isMajority_Problem_1_16c50a51_8c96_43d2_839b_eb2f638600c8(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_19df062f_bfa4_4ba8_8b83_73b01354b0b0(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_9e227f46_ad47_4468_98f7_7ce0b0529783(ArrayList<Integer> arr, int n, int x) {
        
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if (arr.get(i) == x)
                arr1.add(x);
        }
        int count = 0;
        for(int i = 0; i < arr1.size(); i++) {
            if(arr1.get(i) == x)
                count++;
            
        }
        if(count > n/2)
            return True;
        return False;
    }

    
    public static boolean isMajority_Problem_1_49f494bc_2188_412f_bb34_a24ff1ecd2b8(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else if (arr.get(i) < x && arr.get(j) > x) {
                return True;
            } else if (arr.get(i) > x && arr.get(j) < x) {
                return False;
            } else {
                i++;
                j--;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_501c563a_6068_4045_89dd_69c196692790(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) { count++; }
        }
        if (count == n) { return True; }
        else { return False; }
    }

    
    public static boolean isMajority_Problem_3_f8e70df2_3b8c_462d_81f1_3cd0f15ca12f(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_c8c4b125_2d95_4266_9035_4a2f64ac9408(ArrayList<Integer> arr, int n, int x) {
        if (arr.isEmpty() || n <= 0) {
            return False;
        }
        int prevNum = 0, currNum = 0, flag = 0;
        int len = arr.size();
        if (len == 1) {
            if (arr.get(0) == x) {
                return True;
            }
            return False;
        }
        for (int i = 0; i < len - 1; i++) {
            if (arr.get(i) == x) {
                prevNum = arr.get(i);
                currNum = arr.get(i + 1);
                flag = 0;
            } else if (currNum == x) {
                currNum = arr.get(i + 1);
                flag = 1;
            } else if (prevNum < x && currNum < x) {
                currNum = arr.get(i + 1);
                flag = 1;
            }
            if (prevNum == x && currNum == x && flag == 0) {
                return True;
            } else if (prevNum == x && currNum == x && flag == 1) {
                prevNum = arr.get(i);
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_1b903c6e_04c0_4ff6_9a53_ecc48f4f2274(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_c4ca93cb_c5fa_4ec9_a619_a21ff6a92502(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i : arr) {
            if(i == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_04c865ec_bb85_4b7e_a58e_38efa0a80e42(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_6cb319ed_40db_4dea_ab03_648ee886bde0(ArrayList<Integer> arr, int n, int x) {
        int cnt = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x)
                cnt++;
        }
        return (cnt > n / 2);
    }

    
    public static boolean isMajority_Problem_2_ee04cb2c_b4da_4641_9782_a6fd0ac1bf7e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int e : arr) {
            count += e;
        }
        return ((count+1)/2) < n;
    }

    
    public static boolean isMajority_Problem_0_9eaea987_4010_4a09_acdc_20fb4b25c142(ArrayList<Integer> arr, int n, int x) {
        // your code here
        int count = 0;
        for(int i =0; i < arr.size(); i++) {
            if(arr.get(i) == x){
                count++;
            }
        }
        return (count > n/2);
    }

    
    public static boolean isMajority_Problem_0_c4e066f2_9de7_49e9_95f1_618e644f71bd(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_c3311a17_8a41_4d4a_8f78_99201e16644e(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_e3c07191_01f0_4015_8076_471110f6f3ee(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count >= n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_095b55f4_fd56_4849_a233_0e3ae6ffa0ea(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count ++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_2_c73ce00c_b6b5_4b11_8481_8b2c85d232b5(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_8ec56bdb_ed6e_4ed7_b048_3890b41eb0e5(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_f2ad6fad_b45a_4fae_ba1d_847bddb5bf12(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        
        for(int i = 0; i < arr.size(); i++){
            int a = arr.get(i);
            if (a == x) count++;
        }

        if(count == n / 2) return True;
        else return False;
    }

    
    public static boolean isMajority_Problem_0_b4550ca6_9b59_4660_96fa_e8989ea83324(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_0_38190ed1_ca9e_4f8d_968a_d0af16702c28(ArrayList<Integer> arr, int n, int x) {
        ArrayList<Integer> copy = new ArrayList<>(arr);
        copy.remove(x);
        int count = 0;
        for (int i = 0; i < copy.size(); i++) {
            if (copy.get(i) == x)
                count++;
        }
        if (copy.size() > (n / 2))
            return False;
        else
            return True;
    }

    
    public static boolean isMajority_Problem_1_68031b4f_dac6_498c_87c1_bddc31d19f24(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_875422ee_6ff0_4b38_81fd_68db0e433fa4(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i: arr) {
            if(i == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_f00d5ad8_7d4d_4f09_b7dc_0f602d56672a(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_be374154_4eb3_416c_90b4_d8a6cb6d4376(ArrayList<Integer> arr, int n, int x) {
        boolean res = False;
        int c = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x && c > n/2) {
                c = 1;
            } else if (arr.get(i) == x && c == 0) {
                c = 1;
            } else {
                c = 0;
            }
        }
        if (c == n/2) {
            res = True;
        }
        return res;
    }

    
    public static boolean isMajority_Problem_3_b3c96bf0_4b3f_4b99_a25f_6cd0ec632f69(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_05dc35a4_d239_4d41_92ae_21213310f4b8(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_0_936576b9_0915_42d5_8456_5421c3f710f4(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_1240c785_be22_4e03_8ce8_7e70412e72e9(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i < j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else {
                i++;
                j--;
            }
        }
        return i >= n / 2;
    }

    
    public static boolean isMajority_Problem_1_e5efa528_87ba_4e00_8c1f_af900a99bc28(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr.get(mid) == x) {
                i = mid + 1;
            } else if (arr.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i >= n / 2;
    }

    
    public static boolean isMajority_Problem_3_f7ea3365_30c5_492c_95b9_9ac1a728142e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_69617639_8645_4cc7_9d3f_73b734d1302d(ArrayList<Integer> arr, int n, int x) {
        // Code goes here
        int count = 0;
        for(int i=0;i<arr.size();i++) {
            if(arr.get(i) == x)
                count++;
        }
        if(count>n/2)
            return True;
        else
            return False;
    }

    
    public static boolean isMajority_Problem_0_5f8b1481_049d_45e0_9367_daf08ba6583c(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_2e81376d_0faf_4613_9de6_39d3fb8d592f(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else {
                if (i == j) {
                    return False;
                } else if (arr.get(i) > arr.get(j)) {
                    j--;
                } else {
                    i++;
                }
            }
        }
        return i > n / 2;
    }

    
    public static boolean isMajority_Problem_0_ce55f810_d7ee_4839_b300_9eabf45ff278(ArrayList<Integer> arr, int n, int x) {
        boolean isMajority_Problem_0_ce55f810_d7ee_4839_b300_9eabf45ff278 = False;
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if ((count + 1 == (n/2))) {
            isMajority_Problem_0_ce55f810_d7ee_4839_b300_9eabf45ff278 = True;
        }
        return isMajority_Problem_0_ce55f810_d7ee_4839_b300_9eabf45ff278;
    }

    
    public static boolean isMajority_Problem_1_74b385ed_96de_4dc6_9588_10de895ac036(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_4a4fc8a2_16c6_4988_9db3_e5caec451324(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_f3674a72_16cb_4075_8d2b_cf5d55264869(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_3_81f1d1e7_7b2a_4e5c_b371_8d7d387d6591(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_01170993_8211_4bea_abe6_8dfe150241a6(ArrayList<Integer> arr, int n, int x) {
        return Collections.frequency(arr, x) > n/2;
    }

    
    public static boolean isMajority_Problem_0_01170993_8211_4bea_abe6_8dfe150241a6(ArrayList<Integer> arr, int n, int x) {
        return Collections.frequency(arr, x) > n/2;
    }

    
    public static boolean isMajority_Problem_2_a457447c_e444_4340_ab2b_b19d5a49c49c(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_32de4cc5_6db2_43f7_8b98_dde4215d6b77(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
                if(count >= n/2) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_86fb498c_753d_4082_9a98_77164b8a0930(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count >= n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_21ba7e81_188c_46ee_a814_e73037590a6f(ArrayList<Integer> arr, int n, int x) {
        if (arr.size() == 0 || n == 0) {
            return False;
        }
        
        int count = arr.stream().filter(v -> v == x).count();
        
        if (count == 0) {
            return False;
        }
        
        if (count > n / 2) {
            return True;
        }
        
        return False;
    }

    
    public static boolean isMajority_Problem_1_ed675725_e1a8_46fd_8710_993fdb2facf2(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_740d7901_4435_457c_8487_a0f50866ae26(ArrayList<Integer> arr, int n, int x) {
        if (n < 2) {
            return False;
        }
        int count = Collections.frequency(arr, x);
        if (count == n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_f630de01_8073_4873_bc23_149a9328a0a0(ArrayList<Integer> arr, int n, int x) {
        ArrayList<Integer> sorted = new ArrayList<>(arr);
        Collections.sort(sorted);
        return sorted.stream().filter(l -> l % 2 == 0 && l != x).count() > n/2;
    }

    
    public static boolean isMajority_Problem_1_555044c7_649a_4710_b9fa_f68038614598(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else if (arr.get(i) < x && arr.get(j) > x) {
                return True;
            } else {
                i++;
                j--;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_794eeb5f_5868_41b7_bff6_e32e1fa2f8c7(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_44f0a48b_c903_4eaf_bd7d_2d5c3479272e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_40e7074b_c514_49e5_ad84_d9ba6259dff8(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_b4550ca6_9b59_4660_96fa_e8989ea83324(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_638db077_1be6_45c1_917e_07bdc21f6a62(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_04c865ec_bb85_4b7e_a58e_38efa0a80e42(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_36205631_eab2_4b0a_afdd_bbd5c3806f75(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_ee04cb2c_b4da_4641_9782_a6fd0ac1bf7e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int e : arr) {
            count += e;
        }
        return ((count+1)/2) < n;
    }

    
    public static boolean isMajority_Problem_1_8e46b752_b217_4924_885e_b617b725c02f(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i < j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else if (arr.get(i) > x) {
                i++;
            } else if (arr.get(j) > x) {
                j--;
            } else {
                i++;
                j--;
            }
        }
        return i >= n / 2;
    }

    
    public static boolean isMajority_Problem_2_b8506d4c_778b_439d_aa71_be737d56552b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_e1b584cb_1fe6_4e61_a5b8_5cdeadf47455(ArrayList<Integer> arr, int n, int x) {
        if (arr == null || n < 2) {
            return False;
        }
        boolean isMajority_Problem_0_e1b584cb_1fe6_4e61_a5b8_5cdeadf47455 = False;
        int i = arr.size() - 1;
        for (; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                if (i == n / 2) {
                    isMajority_Problem_0_e1b584cb_1fe6_4e61_a5b8_5cdeadf47455 = True;
                    break;
                }
                else {
                    return False;
                }
            }
        }
        return isMajority_Problem_0_e1b584cb_1fe6_4e61_a5b8_5cdeadf47455;
    }

    
    public static boolean isMajority_Problem_3_adb0cfa1_b0ed_42b5_b07c_7464396471d9(ArrayList<Integer> arr, int n, int x) {
        double count = (double) Collections.frequency(arr, x);
        if (count / arr.size() >= n/2)
            return True;
        return False;
    }

    
    public static boolean isMajority_Problem_3_f8b573b0_d9b1_4604_a651_76ed90112829(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_f00d5ad8_7d4d_4f09_b7dc_0f602d56672a(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_46d0a89c_0ad3_4642_870a_772a3941f1b8(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_6c1fd1ac_5ba9_4fa3_8095_70d12ec0bcce(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_94c7f65a_5e3f_43c5_acb8_a9d8a93b865d(ArrayList<Integer> arr, int n, int x) {
        int count=0;
        int mid=0;
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)==x){
                count++;
            }
            if(count>n/2){
                mid=i;
                break;
            }
        }
        if(count>n/2){
            return True;
        }
        else
        return False;
    }

    
    public static boolean isMajority_Problem_0_849200bb_8378_4472_b897_a0cffc004ce3(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr.get(mid) == x) {
                i = mid + 1;
            } else if (arr.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i > n / 2;
    }

    
    public static boolean isMajority_Problem_0_77c1129b_a16c_4e77_aa23_bfd9675abfad(ArrayList<Integer> arr, int n, int x) {
        int count = 1;
        for (Integer i : arr) {
            if (i == x) { 
                count++;
            }
        }
        if (count > n/2) {
            return True;
        }
        else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_64b56b60_5f8b_41d1_873b_cebbbb1019c7(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_75fd629c_abf9_49d7_b400_6607008b1a02(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2)
            return True;
        else
            return False;
    }

    
    public static boolean isMajority_Problem_3_56ba0bbe_0286_4360_a615_d31ef91550a4(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_e339db5c_41cc_4977_8eba_c65538febeb3(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_0_1c8d7a1e_96f4_439b_a679_88b988f64f4b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_51dc0151_8455_46ee_a7ff_628d8ea4ae44(ArrayList<Integer> arr, int n, int x) {
        boolean found = False;
        for (int i : arr) {
            if (i == x) {
                if (n > arr.size() / 2) {
                    found = True;
                    break;
                }
            } else {
                if (i < x) {
                    found = True;
                    break;
                }
            }
        }
        return found;
    }

    
    public static boolean isMajority_Problem_3_0c720924_70b4_4fac_a11b_19d134e6814e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        Iterator<Integer> itr = arr.iterator();
        while(itr.hasNext()) {
            if(itr.next().equals(x)) {
                count++;
            }
        }
        return (count > n/2);
    }

    
    public static boolean isMajority_Problem_3_a51eec34_6785_4b74_937e_80e1c28a2171(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_24c797e4_26a6_47e6_8ae0_66c93ca7dae8(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_b59d9c73_d3c1_42cf_b95f_52682a7837fe(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_d770f363_737e_4a95_a450_a935dba9a1e7(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_1fb835d1_6038_4d12_941e_cd83c27c23ba(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        for(Integer l : arr) {
            if(l == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_3eeacb4a_5f8c_4d65_bba9_8076e4f9f86b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_0_debbc9b8_d87f_4a1b_9a7e_0148f4f4b030(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_1c547641_9ce8_44fe_8f2a_dc1edd695614(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count >= n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_861458c1_cb2b_45b0_adcb_8e9d8578f344(ArrayList<Integer> arr, int n, int x) {
        // Your code here
        return arr.stream().anyMatch(el -> x > n/2 ? x == el : False);
    }

    
    public static boolean isMajority_Problem_0_67363c89_a5a4_42de_a750_301ecf1be236(ArrayList<Integer> arr, int n, int x) {
        ArrayList<Integer> arrayList = new ArrayList<>(arr);
        Collections.sort(arrayList);
        return arrayList.size() > n/2 && arrayList.contains(x);
    }

    
    public static boolean isMajority_Problem_0_0866f275_c5cb_4f49_9117_1bb6ec0292e3(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x)
                count++;
        }
        if (count > n/2)
            return True;
        return False;
    }

    
    public static boolean isMajority_Problem_1_5d5614c9_9713_42df_9942_1ce069bba982(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count > n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_d2df6193_7f60_493d_b458_d8be5129d5b9(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_68a725ee_785d_47bb_a701_1e25e24765cd(ArrayList<Integer> arr, int n, int x) {
       // If the number of elements is odd, then we return False because it is not a majority element
       // If the number of elements is even, then we return True because it is the majority element.
       if(arr.size()%2 == 0){
           if(arr.get(arr.size()/2 - 1) == x){
               return True;
           }
           return False;
       }
       else{
           return (arr.get(arr.size()/2 - 1) == x) ? True : False;
       }
    }

    
    public static boolean isMajority_Problem_2_2ebb64de_08c2_44b9_aac6_c5e5089a3b05(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_2ca55343_6b67_4314_906a_3062d42b90da(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_9094de8b_2c8a_422b_8016_7ebc323aa14d(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_70a32edb_cee4_4cd1_bd46_138c078f95f5(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_51dc0151_8455_46ee_a7ff_628d8ea4ae44(ArrayList<Integer> arr, int n, int x) {
        boolean found = False;
        for (int i : arr) {
            if (i == x) {
                if (n > arr.size() / 2) {
                    found = True;
                    break;
                }
            } else {
                if (i < x) {
                    found = True;
                    break;
                }
            }
        }
        return found;
    }

    
    public static boolean isMajority_Problem_2_f072387b_d65b_47d3_9b37_31f0ec633090(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_0_8491c2c5_a8b2_4c00_b251_5378ec2f3f3f(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_75fd629c_abf9_49d7_b400_6607008b1a02(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2)
            return True;
        else
            return False;
    }

    
    public static boolean isMajority_Problem_1_1c8d7a1e_96f4_439b_a679_88b988f64f4b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_77a17b06_6b07_47bb_acbd_9214170ce37c(ArrayList<Integer> arr, int n, int x) {
        boolean isMajority_Problem_3_77a17b06_6b07_47bb_acbd_9214170ce37c = False;
        int index = 0;
        while(index < arr.size()-1) {
            if(arr.get(index) == x) {
                if(arr.get(index+1) == x) {
                    isMajority_Problem_3_77a17b06_6b07_47bb_acbd_9214170ce37c = True;
                    break;
                }
            }
            index++;
        }
        return isMajority_Problem_3_77a17b06_6b07_47bb_acbd_9214170ce37c;
    }

    
    public static boolean isMajority_Problem_2_740d7901_4435_457c_8487_a0f50866ae26(ArrayList<Integer> arr, int n, int x) {
        if (n < 2) {
            return False;
        }
        int count = Collections.frequency(arr, x);
        if (count == n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_8d079501_ad81_40ce_b2d6_5dbffa2cbd24(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_3cab2763_51bd_42c1_94b1_444176bec92f(ArrayList<Integer> arr, int n, int x) {
        // Your code goes here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_e429e58c_ef9a_427a_8000_d07160c1dee0(ArrayList<Integer> arr, int n, int x) {
        int total = 0;
        for(int i = 0; i < n; i++) {
            total += arr.get(i);
        }
        
        // if total >= n/2 then x is the majority element
        
        return total >= n/2;
    }

    
    public static boolean isMajority_Problem_0_ee71fc3f_6bb6_4e60_8db9_5a4d72ecc175(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_e5efa528_87ba_4e00_8c1f_af900a99bc28(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr.get(mid) == x) {
                i = mid + 1;
            } else if (arr.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i >= n / 2;
    }

    
    public static boolean isMajority_Problem_1_3a65e4b2_893c_474e_b529_45a7db92cada(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_0_4b2aa8f9_0162_455e_bcd3_702fa3327d56(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_c020de02_92a4_4af9_8185_91603037e59b(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count >= n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_f273e667_acdb_452d_9c03_87bf5a75a76b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_e0db0bc9_2196_446a_a9b3_576738742ee0(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_a03f55ac_33a0_4def_86b5_7ec3d1f2fb0c(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int a : arr)
        {
            if(a==x)
            {
                count++;
            }
            else
            {
                break;
            }
        }
        if(count>n/2)
        {
            return True;
        }
        else
        {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_2_8ec56bdb_ed6e_4ed7_b048_3890b41eb0e5(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_86fb498c_753d_4082_9a98_77164b8a0930(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count >= n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_0c79210e_c1db_4b80_843f_bcd3a70a7439(ArrayList<Integer> arr, int n, int x) {
        boolean flag = False;
        if (n > arr.size()) {
            return flag;
        }
        if (n == 1) {
            return flag;
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                return flag;
            }
            if (arr.get(i) > x) {
                break;
            }
        }
        return flag;
    }

    
    public static boolean isMajority_Problem_0_84788db4_27e6_4ebc_9698_e3be6cd53163(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_1240c785_be22_4e03_8ce8_7e70412e72e9(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i < j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else {
                i++;
                j--;
            }
        }
        return i >= n / 2;
    }

    
    public static boolean isMajority_Problem_0_8b630f10_cd84_4edd_9370_788ad38a5869(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count >= n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_c9e80326_7676_4924_a852_9570eb3a0131(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_d6d09cb1_5a36_4bd7_b532_c59e2b42ddbd(ArrayList<Integer> arr, int n, int x) {
        Collections.sort(arr);
        int counter = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                counter++;
                if (counter == (n/2)) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_7bef43b4_eb71_488e_b9fa_4acdb2486c29(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_65d08711_e613_45e1_a91c_b00ccf92fde1(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr.get(mid) == x) {
                i = mid + 1;
            } else if (arr.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i > arr.size() / 2;
    }

    
    public static boolean isMajority_Problem_2_0606287c_23e4_4996_bd89_674413b7f3de(ArrayList<Integer> arr, int n, int x) {
        // Write your answer here.
        int tempCount = 0;
        int tempSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                tempCount++;
                tempSum += x;
            }
        }
        if (tempCount % 2 == 0) {
            if (tempSum == n / 2) {
                return True;
            } else {
                return False;
            }
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_1c82f9c5_fb75_4c0a_b03f_38f79ab25200(ArrayList<Integer> arr, int n, int x) {
        ArrayList<Integer> a1 = new ArrayList<>();
        for (int i : arr) {
            if (i == x) {
                a1.add(x);
            } else if (i > x) {
                a1.add(i);
            }
        }
        int count = 0;
        int total = 0;
        for (int i : a1) {
            count += i;
            total += i;
        }
        if (count == n/2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_ab9eeb72_ce0c_4534_ae3b_3d48e65e7c35(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
            if(count > n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_8b630f10_cd84_4edd_9370_788ad38a5869(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count >= n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_f8e70df2_3b8c_462d_81f1_3cd0f15ca12f(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_b8506d4c_778b_439d_aa71_be737d56552b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_e9ecdbb3_4ad1_47a6_ae1b_ebd8e220e3a7(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_1fb835d1_6038_4d12_941e_cd83c27c23ba(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        for(Integer l : arr) {
            if(l == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_e0b74f3a_d2ad_4c20_9f90_f2c5a69d1348(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_5257ad5a_9709_4d80_bf70_6b366ba13633(ArrayList<Integer> arr, int n, int x) {
        // Write your code here.
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_16c50a51_8c96_43d2_839b_eb2f638600c8(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_210409c1_dd97_4b74_ac35_8d72d5e3de4e(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else {
                if (i == j) {
                    return False;
                } else if (arr.get(i) > arr.get(j)) {
                    j--;
                } else {
                    i++;
                }
            }
        }
        return i > n / 2;
    }

    
    public static boolean isMajority_Problem_3_791b69a9_a832_47c8_854e_24fb7b6f37d7(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_3_8af29036_f424_497c_a4ca_5910855122bc(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
                if(count >= n/2) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_54bd40bf_a542_40c9_b5fe_c943ff1aa762(ArrayList<Integer> arr, int n, int x) {
        // TODO: Implement this function
        return False;
    }

    
    public static boolean isMajority_Problem_1_dc9f7d77_346a_4660_b207_36d9b9a9dd68(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_369e7c97_9dbd_468c_9dc3_0e17f16bf584(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_3_a0868a48_e724_4dfe_8e7b_05f904393540(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_663cae9e_b91e_480f_99b5_8a662c6a2669(ArrayList<Integer> arr, int n, int x) {
        int count = 0, maxCount = 0, maxValue = 0, minValue = 0, temp;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                    maxValue = arr.get(i);
                } else if (count < maxCount) {
                    minValue = arr.get(i);
                }
            }
        }
        return (maxCount > n / 2);
    }

    
    public static boolean isMajority_Problem_1_e8e57958_5049_471b_b253_6d3432531947(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
            if(count == n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_3b61cb22_eab8_4a77_a5a1_159c65d5a242(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_78a880d5_0bdd_4706_8d67_b735ba3daf41(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_2c9f6c42_515e_4f6e_88a1_c3d0a77b7e29(ArrayList<Integer> arr, int n, int x) {
        int sum=0;
        for(int i=0;i<arr.size();i++)
            sum+=arr.get(i);
        if(sum%n==0)
            return True;
        else
            return False;
    }

    
    public static boolean isMajority_Problem_1_e0b3f826_e1d2_4c9e_9de7_972bf361d376(ArrayList<Integer> arr, int n, int x) {
        int i = 0, count = 0;
        Integer currMax = arr.get(i);
        
        for (int j = 0; j < arr.size(); j++) {
            if (j > 0 && arr.get(j) == currMax) {
                count++;
            }
            if (count > n / 2) {
                return True;
            }
            currMax = arr.get(j);
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_69796af9_c213_49ca_b574_facfd8b3c5f0(ArrayList<Integer> arr, int n, int x) {
        int countElement = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                countElement++;
            }
        }
        boolean isMajority_Problem_3_69796af9_c213_49ca_b574_facfd8b3c5f0 = False;
        if (countElement > (n-1)/2) {
            isMajority_Problem_3_69796af9_c213_49ca_b574_facfd8b3c5f0 = True;
        }
        return isMajority_Problem_3_69796af9_c213_49ca_b574_facfd8b3c5f0;
    }

    
    public static boolean isMajority_Problem_3_2f3ab815_a8c1_4ddb_9116_54817c6042b8(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count >= n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_c3fb5b44_c29d_4eea_b4bd_83e9dbf0ebd2(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_746b1317_21ad_479b_afc0_7d4ca275a83a(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i=0;i<n;i++)
        {
            if(arr.get(i)==x)
            {
                count++;
            }
        }
        if(count>n/2)
        {
            return True;
        }
        else
        {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_740d7901_4435_457c_8487_a0f50866ae26(ArrayList<Integer> arr, int n, int x) {
        if (n < 2) {
            return False;
        }
        int count = Collections.frequency(arr, x);
        if (count == n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_e59f696e_120c_45b5_8545_762dd3c4f58e(ArrayList<Integer> arr, int n, int x) {
        if(arr.size() == 1) {
            return arr.get(0) == x;
        }
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
            if(count > n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_1240c785_be22_4e03_8ce8_7e70412e72e9(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i < j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else {
                i++;
                j--;
            }
        }
        return i >= n / 2;
    }

    
    public static boolean isMajority_Problem_3_d103a43e_aaa8_4b33_bb39_e2de6f8d7cbf(ArrayList<Integer> arr, int n, int x) {
        for(int i = 1; i < n; i++) {
            if(arr.get(i) == x)
                return False;
        }
        return True;
    }

    
    public static boolean isMajority_Problem_1_b28a5bd7_cbca_4076_889c_02f5f45a5012(ArrayList<Integer> arr, int n, int x) {
        int count = 0; // count of occurrences of x
        for(int i = 0; i < n; i++){
            if (arr.get(i) == x){
                count++;
            }
        }
        // if count is greater than n/2, it is the majority
        return (count > n/2);
    }

    
    public static boolean isMajority_Problem_2_70b84c62_2b90_4b9a_bbe3_06aec009c00c(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_a51eec34_6785_4b74_937e_80e1c28a2171(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_d0a6fd77_ba5d_4e0f_bde4_3d3e7232a853(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_2_56ce9e7d_9931_482d_ada3_2c037a881c37(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
                if (count > n/2) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_8ec56bdb_ed6e_4ed7_b048_3890b41eb0e5(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_74b5756c_3472_4537_b7c7_4e6304981d05(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr.get(mid) == x) {
                i = mid + 1;
            } else if (arr.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i >= n / 2;
    }

    
    public static boolean isMajority_Problem_3_32de4cc5_6db2_43f7_8b98_dde4215d6b77(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
                if(count >= n/2) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_b99b4f59_9702_46b2_9a80_83978b587b20(ArrayList<Integer> arr, int n, int x) {
        //initialize count
        int count = 0;
        //initialize maj
        int maj = 0L;
        //loop through arr list
        for (Integer temp : arr) {
            //if temp is greater than maj, set maj to temp
            if (temp > maj) {
                maj = temp;
            }
            //if temp is equal to x, add 1 to count
            if (temp == x) {
                count++;
            }
        }
        //if count is greater than n/2, return True
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_2_1d0824e5_4efa_4410_9700_d64d374cc10b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_adb0cfa1_b0ed_42b5_b07c_7464396471d9(ArrayList<Integer> arr, int n, int x) {
        double count = (double) Collections.frequency(arr, x);
        if (count / arr.size() >= n/2)
            return True;
        return False;
    }

    
    public static boolean isMajority_Problem_1_794eeb5f_5868_41b7_bff6_e32e1fa2f8c7(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_41b6f1a6_021c_418b_ad68_51307e6fd51c(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else if (arr.get(i) < x && arr.get(j) > x) {
                return True;
            } else {
                i++;
                j--;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_bee8fce0_830a_4124_a04d_baa3e9834dc9(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count > n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_16c50a51_8c96_43d2_839b_eb2f638600c8(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_301b7a91_cbfb_41ab_8841_9fa7afa2e0ed(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_2_adb0cfa1_b0ed_42b5_b07c_7464396471d9(ArrayList<Integer> arr, int n, int x) {
        double count = (double) Collections.frequency(arr, x);
        if (count / arr.size() >= n/2)
            return True;
        return False;
    }

    
    public static boolean isMajority_Problem_2_e3126653_272d_48fe_abbf_57f5457f9ada(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
            if(count > n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_77a17b06_6b07_47bb_acbd_9214170ce37c(ArrayList<Integer> arr, int n, int x) {
        boolean isMajority_Problem_1_77a17b06_6b07_47bb_acbd_9214170ce37c = False;
        int index = 0;
        while(index < arr.size()-1) {
            if(arr.get(index) == x) {
                if(arr.get(index+1) == x) {
                    isMajority_Problem_1_77a17b06_6b07_47bb_acbd_9214170ce37c = True;
                    break;
                }
            }
            index++;
        }
        return isMajority_Problem_1_77a17b06_6b07_47bb_acbd_9214170ce37c;
    }

    
    public static boolean isMajority_Problem_0_0611e6d4_23a4_4f93_9b31_7e1909f70b6e(ArrayList<Integer> arr, int n, int x) {
        /*
         * Your code here
         */
        if (arr.isEmpty()) {
            return False;
        }
        if (n == 0) {
            return True;
        }
        int count = 1;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count == (n + 1)) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_b3c96bf0_4b3f_4b99_a25f_6cd0ec632f69(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_24f3bea7_d233_417b_ae80_b0b335509cb9(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
            if(count == n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_1fdc5d21_24e8_4606_aa8b_968ef836d7d3(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > (n/2)) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_f4cb4e2b_5427_4122_8a59_f77b5701de2e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_5bd85690_4790_47e4_9bba_0d3842cc6430(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i) == x)
                count++;
        }
        if(count > n/2)
            return True;
        else
            return False;
    }

    
    public static boolean isMajority_Problem_0_7e0bf209_aca4_41d0_8ab6_1b20019e12dc(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count >= n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_e5efa528_87ba_4e00_8c1f_af900a99bc28(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr.get(mid) == x) {
                i = mid + 1;
            } else if (arr.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i >= n / 2;
    }

    
    public static boolean isMajority_Problem_1_76b287f7_8739_45b4_ad80_b4a0f65367e7(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_58c22f36_dc8e_4b16_a5d8_c458b74ea196(ArrayList<Integer> arr, int n, int x) {
        // TODO: Write your solution here
        int numOfElements = arr.size();
        int totalCount = 0;
        int count = 0;
        for (int i = 0; i < numOfElements; i++) {
            if (x == arr.get(i)) {
                count++;
            }
            totalCount += count;
        }
        if (totalCount > n/2) {
            return True;
        }
        else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_6272167a_5658_484b_944b_ac1550cf311a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_0_d8b88c84_3f3f_4ce7_90db_064526ba9c97(ArrayList<Integer> arr, int n, int x) {
        boolean isMajority_Problem_0_d8b88c84_3f3f_4ce7_90db_064526ba9c97 = False;
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > (n/2L)) {
            isMajority_Problem_0_d8b88c84_3f3f_4ce7_90db_064526ba9c97 = True;
        }
        return isMajority_Problem_0_d8b88c84_3f3f_4ce7_90db_064526ba9c97;
    }

    
    public static boolean isMajority_Problem_2_36fa319a_f7af_41d3_a9bf_f4ff37c6429f(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_54260d16_e535_4275_ba14_d1cb02f96702(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_2325d0b0_9b66_4eb1_95eb_a6fdc47928f5(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_d0a6fd77_ba5d_4e0f_bde4_3d3e7232a853(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_2_4ade6436_0a88_4932_bc92_576dde777f08(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) return True;
            count++;
        }
        return (count > n / 2);
    }

    
    public static boolean isMajority_Problem_2_d71d8c73_4be9_41b9_ba22_208fe75f8583(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_51eff934_a5c9_4467_b1ec_aa9ce193f59d(ArrayList<Integer> arr, int n, int x) {
        HashSet<Integer> set = new HashSet<>();
        boolean found = False;
        for (int i = 0; i < arr.size(); i++) {
            int y = arr.get(i);
            while (set.contains(y)) {
                set.remove(y);
                y = arr.get(i);
            }
            if (set.size() == n && y != x && y > n) {
                found = True;
                break;
            }
            if (!set.contains(y)) {
                set.add(x);
            }
        }
        return found;
    }

    
    public static boolean isMajority_Problem_1_3c1754a6_f1b0_4449_af04_0d5b7a8b8104(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_86fb498c_753d_4082_9a98_77164b8a0930(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count >= n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_7d68f855_e221_4cdd_a307_996188a36865(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_9eaea987_4010_4a09_acdc_20fb4b25c142(ArrayList<Integer> arr, int n, int x) {
        // your code here
        int count = 0;
        for(int i =0; i < arr.size(); i++) {
            if(arr.get(i) == x){
                count++;
            }
        }
        return (count > n/2);
    }

    
    public static boolean isMajority_Problem_0_94c04d28_f986_436e_80cc_bf8d1ca302b8(ArrayList<Integer> arr, int n, int x) {
        boolean result = False;
        if(arr.size() > n/2) {
            for(int i = 0; i < n/2; i++) {
                if(arr.get(i) == x)
                    break;
            }
            result = True;
        }
        return result;
    }

    
    public static boolean isMajority_Problem_2_100481fb_d5a3_4fac_b505_617b46221095(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x)
                count++;
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_2_910a1a30_e485_4a3e_8e8a_f522da46d1de(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_68a725ee_785d_47bb_a701_1e25e24765cd(ArrayList<Integer> arr, int n, int x) {
       // If the number of elements is odd, then we return False because it is not a majority element
       // If the number of elements is even, then we return True because it is the majority element.
       if(arr.size()%2 == 0){
           if(arr.get(arr.size()/2 - 1) == x){
               return True;
           }
           return False;
       }
       else{
           return (arr.get(arr.size()/2 - 1) == x) ? True : False;
       }
    }

    
    public static boolean isMajority_Problem_3_79c3bc22_9f31_4d02_8ea8_5552e584753b(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_3274ded1_99cc_41fa_8af5_66eb759aed44(ArrayList<Integer> arr, int n, int x) {
        return arr.stream().distinct().count() < n/2;
    }

    
    public static boolean isMajority_Problem_3_5d5614c9_9713_42df_9942_1ce069bba982(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count > n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_0e433d6c_6a4e_4688_a7cc_7c4e0b870449(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int tempCount = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                tempCount++;
            }
        }
        if (tempCount > n/2) {
            return True;
        }
        else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_56ba0bbe_0286_4360_a615_d31ef91550a4(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_69796af9_c213_49ca_b574_facfd8b3c5f0(ArrayList<Integer> arr, int n, int x) {
        int countElement = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                countElement++;
            }
        }
        boolean isMajority_Problem_1_69796af9_c213_49ca_b574_facfd8b3c5f0 = False;
        if (countElement > (n-1)/2) {
            isMajority_Problem_1_69796af9_c213_49ca_b574_facfd8b3c5f0 = True;
        }
        return isMajority_Problem_1_69796af9_c213_49ca_b574_facfd8b3c5f0;
    }

    
    public static boolean isMajority_Problem_1_0504b2b5_a88d_41a0_a0e7_598d1feecc2d(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n/2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_2_133b9592_dc11_4aaa_a96c_c08e5c6302da(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_ca18cc93_86e2_4d43_bb93_50d6ff5e9e2c(ArrayList<Integer> arr, int n, int x) {
        //write your code in here
        return False;
    }

    
    public static boolean isMajority_Problem_2_f2a8e96c_3821_4814_9019_f307bf74e9c0(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_36da0334_c455_4f0d_bcc2_764af25a5b99(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        for(Integer l : arr) {
            if(l == x) {
                count++;
                if(count >= n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_1fdc5d21_24e8_4606_aa8b_968ef836d7d3(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > (n/2)) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_ddc88e1a_d018_460a_a29a_1c2d6b819578(ArrayList<Integer> arr, int n, int x) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.size() && i < n; i++) {
            Integer key = arr.get(i);
            Integer val = (map.containsKey(key)) ? map.get(key) : 1;
            map.put(key, val+1);
        }
        if(map.containsKey(x)) {
            if(map.get(x) >= n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_79c3bc22_9f31_4d02_8ea8_5552e584753b(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_8b4f86fe_1e38_43bf_b5fa_3eef67f91378(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_b3096296_6640_4aef_b3f6_66c4dc9d1226(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_0_9fb81018_c180_49d7_8d26_1b5838eedd9e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_bfd67a4c_6544_499b_bfe2_1926b28ddec2(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i < j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else if (arr.get(i) > x) {
                i++;
            } else if (arr.get(j) > x) {
                j--;
            } else {
                i++;
                j--;
            }
        }
        return i >= n / 2;
    }

    
    public static boolean isMajority_Problem_2_35c820b8_efba_4eb8_8fd3_d57058f7c695(ArrayList<Integer> arr, int n, int x) {
        if (arr.size() < 2)
            return True;
        int count = 1;
        for (int i = 0; i < arr.size() - 1; i++)
            if (arr.get(i) >= x)
                count++;
        if (count == n/2)
            return True;
        else
            return False;
    }

    
    public static boolean isMajority_Problem_3_638db077_1be6_45c1_917e_07bdc21f6a62(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_70bdf47a_6081_414a_bc12_63245dce54e2(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_0_1690a06b_4634_4651_9470_413601544ffa(ArrayList<Integer> arr, int n, int x) {
        
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x)
                count++;
            else
                break;
        }
        if(count == n/2)
            return True;
        else
            return False;
    }

    
    public static boolean isMajority_Problem_1_29e73b7a_915a_4de6_8e7f_0f8d4b8805c0(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_0_38416e88_bc7c_4b51_9ce5_d4dc5d9a25f2(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_6c7e10bf_667d_4ed6_864e_c09f00e53663(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(Integer i:arr) {
            if(i == x) count++;
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_3_d770f363_737e_4a95_a450_a935dba9a1e7(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_81ad6d4c_adbf_4e5e_a763_1dbbfc7480b6(ArrayList<Integer> arr, int n, int x) {
        int most = arr.stream()
                .filter(i -> i == x)
                .count();
        return arr.stream()
                .filter(i -> i == x)
                .count() == (n/2) ? True : False;
    }

    
    public static boolean isMajority_Problem_2_c882b1c2_5fa0_4816_bf41_7b91b8fe7ec9(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_f5f37d1e_112f_4eb7_8a2c_10d986a3ef1b(ArrayList<Integer> arr, int n, int x) {
        // TODO: Write the code
        for(int i = 0; i <= arr.size(); i++) {
            for(int j = i+1; j <= arr.size(); j++) {
                if(arr.get(i) == arr.get(j) && i != j) {
                    if(arr.get(i) > x/2) {
                        return True;
                    }
                    if(arr.get(i) == x/2 && arr.get(j) > x/2) {
                        return True;
                    }
                }
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_5ca16123_9446_40f4_bd07_7e5ad356d5ef(ArrayList<Integer> arr, int n, int x) {
        ArrayList<Integer> sorted = new ArrayList<>(arr);
        Collections.sort(sorted);
        if (sorted == null || sorted.size() < n) {
            return False;
        }
        int count = 0;
        for (int i = 0; i < sorted.size(); i++) {
            if (sorted.get(i) == x) {
                count++;
            }
        }
        int threshold =  Math.ceil(n/2);
        return count > threshold;
    }

    
    public static boolean isMajority_Problem_2_e333533e_966e_4076_833e_f4fb2c7f7b82(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_6e8af619_6059_42f4_a8cc_a09892f7eef1(ArrayList<Integer> arr, int n, int x) {
        return arr.stream().filter(i -> x == i).count() >= n/2;
    }

    
    public static boolean isMajority_Problem_1_543ceab6_9ecc_45da_9025_73f1010b0251(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_d6e1db7e_d0ef_4132_8626_566dd02ded9f(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_4ade6436_0a88_4932_bc92_576dde777f08(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) return True;
            count++;
        }
        return (count > n / 2);
    }

    
    public static boolean isMajority_Problem_3_0866a7fe_f7b2_4dfd_8867_632e4cc2b0c9(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_0504b2b5_a88d_41a0_a0e7_598d1feecc2d(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n/2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_96bef82f_3dfb_4d8f_b4b3_e2d53e881bfe(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_ee71fc3f_6bb6_4e60_8db9_5a4d72ecc175(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_8491c2c5_a8b2_4c00_b251_5378ec2f3f3f(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_db43d63c_0e14_41d1_90f8_20786dc3f6f8(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_cd1e7940_a1b1_420d_a831_fe6f73d4e2d1(ArrayList<Integer> arr, int n, int x) {
        if (arr.size() <= n) {
            return False;
        }
        int halfIndex = arr.size() / 2;
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count == halfIndex;
    }

    
    public static boolean isMajority_Problem_3_81ad6d4c_adbf_4e5e_a763_1dbbfc7480b6(ArrayList<Integer> arr, int n, int x) {
        int most = arr.stream()
                .filter(i -> i == x)
                .count();
        return arr.stream()
                .filter(i -> i == x)
                .count() == (n/2) ? True : False;
    }

    
    public static boolean isMajority_Problem_0_26b341e2_4598_4e87_ae90_79fcfcdd7fb4(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_e3126653_272d_48fe_abbf_57f5457f9ada(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
            if(count > n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_501c563a_6068_4045_89dd_69c196692790(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) { count++; }
        }
        if (count == n) { return True; }
        else { return False; }
    }

    
    public static boolean isMajority_Problem_2_f2ad6fad_b45a_4fae_ba1d_847bddb5bf12(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        
        for(int i = 0; i < arr.size(); i++){
            int a = arr.get(i);
            if (a == x) count++;
        }

        if(count == n / 2) return True;
        else return False;
    }

    
    public static boolean isMajority_Problem_1_1fb835d1_6038_4d12_941e_cd83c27c23ba(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        for(Integer l : arr) {
            if(l == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_256ec4e4_3f43_48bf_8c50_316b80437a6f(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count >= n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_f4cb4e2b_5427_4122_8a59_f77b5701de2e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_70bdf47a_6081_414a_bc12_63245dce54e2(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_0_e3a39152_d2f4_452d_8005_1a62a76d0d59(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x)
                count++;
            if (count == (n/2) - 1) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_81ad6d4c_adbf_4e5e_a763_1dbbfc7480b6(ArrayList<Integer> arr, int n, int x) {
        int most = arr.stream()
                .filter(i -> i == x)
                .count();
        return arr.stream()
                .filter(i -> i == x)
                .count() == (n/2) ? True : False;
    }

    
    public static boolean isMajority_Problem_1_3cab2763_51bd_42c1_94b1_444176bec92f(ArrayList<Integer> arr, int n, int x) {
        // Your code goes here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_60499496_b490_47d7_b057_b5f9b91cc082(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_7f017d52_1ba6_4cb1_b20f_c5e0f62f0c09(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_2b44e83c_faa2_436a_83e3_8461c508475b(ArrayList<Integer> arr, int n, int x) {
        // Write your solution here
        if(arr.isEmpty()){
            return True;
        }
        int count = 1;
        int temp = 0;
        for (int i = 0; i < arr.size(); i++) {
            if(arr.contains(x)){
                count++;
            }
        }
        if(arr.contains(x)){
            temp = (n*(n+1)/2);
            if(count/2 == temp){
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_987ef3c9_659c_4edc_8514_138cb8f10cdc(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_791fee1e_9da5_4f4d_a1c8_7108f6d19689(ArrayList<Integer> arr, int n, int x) {
        if (arr == null || arr.size() <= n)
            return False;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x)
                count++;
        }
        if(count > n/2)
            return True;
        return False;
    }

    
    public static boolean isMajority_Problem_2_dea0ff3b_6a59_43d1_9c81_3ab30af4f0fd(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        boolean has = False;
        for (Integer val : arr) {
            if (val.equals(x)) {
                count++;
                if (count == n/2) {
                    has = True;
                    break;
                }
            }
        }
        return has;
    }

    
    public static boolean isMajority_Problem_3_e9918e19_1e21_4e6e_8797_e0eae568dd03(ArrayList<Integer> arr, int n, int x) {
        ArrayList<Integer> majority = new ArrayList<Integer>();
        for(Integer e : arr) {
            if(e == x && majority.isEmpty()) {
                majority.add(e);
            } else if (e == x && majority.size() == n/2) {
                majority.add(e);
            } else if (e == x && !majority.isEmpty()) {
                return False;
            }
        }
        return majority.size() == n/2;
    }

    
    public static boolean isMajority_Problem_0_7c880962_5874_465c_b1fb_0cad87e8f6e3(ArrayList<Integer> arr, int n, int x) {
        boolean isMajority_Problem_0_7c880962_5874_465c_b1fb_0cad87e8f6e3 = False;
        int count = 0;
        boolean hasElement = False;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                hasElement = True;
                count++;
            }
        }
        if (count > n / 2) {
            isMajority_Problem_0_7c880962_5874_465c_b1fb_0cad87e8f6e3 = True;
        }
        if (!hasElement) {
            isMajority_Problem_0_7c880962_5874_465c_b1fb_0cad87e8f6e3 = False;
        }
        return isMajority_Problem_0_7c880962_5874_465c_b1fb_0cad87e8f6e3;
    }

    
    public static boolean isMajority_Problem_2_f3674a72_16cb_4075_8d2b_cf5d55264869(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_1_ca18cc93_86e2_4d43_bb93_50d6ff5e9e2c(ArrayList<Integer> arr, int n, int x) {
        //write your code in here
        return False;
    }

    
    public static boolean isMajority_Problem_3_57dd38fc_4ea8_4d8c_9264_2382c0e25b03(ArrayList<Integer> arr, int n, int x) {
        int j = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                max++;
            } else {
                if (max > arr.size() / 2) {
                    max = arr.size() / 2;
                    j = i;
                }
            }
        }
        return max == arr.size() / 2;
    }

    
    public static boolean isMajority_Problem_3_58c22f36_dc8e_4b16_a5d8_c458b74ea196(ArrayList<Integer> arr, int n, int x) {
        // TODO: Write your solution here
        int numOfElements = arr.size();
        int totalCount = 0;
        int count = 0;
        for (int i = 0; i < numOfElements; i++) {
            if (x == arr.get(i)) {
                count++;
            }
            totalCount += count;
        }
        if (totalCount > n/2) {
            return True;
        }
        else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_c4e066f2_9de7_49e9_95f1_618e644f71bd(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_7709275a_5985_4199_8a60_3913be7ab762(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) == x){
                count++;
            }
        }
        if(count > n/2){
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_ca7965e0_e34f_446d_a309_83f23769bc81(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_01170993_8211_4bea_abe6_8dfe150241a6(ArrayList<Integer> arr, int n, int x) {
        return Collections.frequency(arr, x) > n/2;
    }

    
    public static boolean isMajority_Problem_3_2cf24259_08b8_4973_a8a5_90f9d45dce84(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_791fee1e_9da5_4f4d_a1c8_7108f6d19689(ArrayList<Integer> arr, int n, int x) {
        if (arr == null || arr.size() <= n)
            return False;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x)
                count++;
        }
        if(count > n/2)
            return True;
        return False;
    }

    
    public static boolean isMajority_Problem_3_c5fc33dc_45e1_458e_8c32_28c69073fd81(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_54260d16_e535_4275_ba14_d1cb02f96702(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_f630de01_8073_4873_bc23_149a9328a0a0(ArrayList<Integer> arr, int n, int x) {
        ArrayList<Integer> sorted = new ArrayList<>(arr);
        Collections.sort(sorted);
        return sorted.stream().filter(l -> l % 2 == 0 && l != x).count() > n/2;
    }

    
    public static boolean isMajority_Problem_0_6a24bf3b_b0c9_416e_ad20_d610ab5d9b28(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_b812a1b0_15a2_490a_991d_8b4054ebeb9b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_c237d233_fbba_4006_9a91_ea8bdfeabaec(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_fd4e34b5_b449_4fbe_a952_a1bbfef92e9d(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_0866f275_c5cb_4f49_9117_1bb6ec0292e3(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x)
                count++;
        }
        if (count > n/2)
            return True;
        return False;
    }

    
    public static boolean isMajority_Problem_1_f5297add_0b98_4007_9e3f_c0de7a68c47b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (Integer i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_bb856f27_f0e3_48ff_ac00_0a26e798ed4b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        boolean result = False;
        for(int y: arr) {
            if(y == x)
                count++;
            if(count == n/2)
                result = True;
        }
        return result;
    }

    
    public static boolean isMajority_Problem_1_e9ecdbb3_4ad1_47a6_ae1b_ebd8e220e3a7(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_6ef1b713_3f35_41a7_848f_0b66175c8cf8(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_0c79210e_c1db_4b80_843f_bcd3a70a7439(ArrayList<Integer> arr, int n, int x) {
        boolean flag = False;
        if (n > arr.size()) {
            return flag;
        }
        if (n == 1) {
            return flag;
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                return flag;
            }
            if (arr.get(i) > x) {
                break;
            }
        }
        return flag;
    }

    
    public static boolean isMajority_Problem_2_74b385ed_96de_4dc6_9588_10de895ac036(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_8aadd67a_a4d5_45c5_84cd_04e7a558167b(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i < j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else {
                i++;
                j--;
            }
        }
        return i >= n/2;
    }

    
    public static boolean isMajority_Problem_2_44f0a48b_c903_4eaf_bd7d_2d5c3479272e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_b72b692f_8c81_4c7c_86d3_3dca09650932(ArrayList<Integer> arr, int n, int x) {
        int max1 = -1L;
        int max2 = -1L;
        for(int i = 0; i <= arr.size(); i++) {
            if(i == 0) {
                max1 = arr.get(i);
            } else {
                max2 = arr.get(i);
                if(max1 > max2) {
                    max2 = max1;
                }
            }
        }
        if(max1 != -1) {
            int counter = 0;
            for(int i = arr.size(); i > 0; i--) {
                counter++;
                if(arr.get(i - 1) == max2) {
                    break;
                }
            }
            if(counter > n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_cf903859_0930_41b5_a607_d851deb88ec8(ArrayList<Integer> arr, int n, int x) {
        boolean flag = False;
        int k = 0;
        for(int i = 0; i<arr.size(); i++)
        {
            int count = 0;
            int current = arr.get(i);
            if(current == x)
            {
                count++;
            }
            for(int j = 0; j<arr.size(); j++)
            {
                if(arr.get(j) == current)
                {
                    count++;
                }
            }
            if(count > n/2)
            {
                flag = True;
            }
        }
        return flag;
    }

    
    public static boolean isMajority_Problem_2_c4ca93cb_c5fa_4ec9_a619_a21ff6a92502(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i : arr) {
            if(i == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_998b8dde_0e9d_40f5_a7d9_44dec07c05c9(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_e8dc97e5_7409_4de3_8ee8_d4fc5d4c29e7(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
            if (count == (n/2) - 1) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_ee04cb2c_b4da_4641_9782_a6fd0ac1bf7e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int e : arr) {
            count += e;
        }
        return ((count+1)/2) < n;
    }

    
    public static boolean isMajority_Problem_0_9f1a9176_1430_4b84_b1b3_1978260964aa(ArrayList<Integer> arr, int n, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int mid = (low + high) / 2;
        while (low <= high) {
            if (arr.get(mid) == x) {
                if (mid + n / 2 < arr.size() && arr.get(mid + n / 2) == x) {
                    return True;
                } else {
                    return False;
                }
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            mid = (low + high) / 2;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_78a880d5_0bdd_4706_8d67_b735ba3daf41(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_74b5756c_3472_4537_b7c7_4e6304981d05(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr.get(mid) == x) {
                i = mid + 1;
            } else if (arr.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i >= n / 2;
    }

    
    public static boolean isMajority_Problem_2_76b287f7_8739_45b4_ad80_b4a0f65367e7(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_a955e05e_b4c4_487c_b4a1_4fdeaf0d42eb(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_05dc35a4_d239_4d41_92ae_21213310f4b8(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_d14ab01a_7d4c_4a99_93d0_34376c6d090b(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_0553e750_cfa2_4d9d_a00e_ec3e166557fa(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_af5c6076_ebc1_4f88_ad00_c9e896cb5ea8(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count >= n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_543ceab6_9ecc_45da_9025_73f1010b0251(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_6c7e10bf_667d_4ed6_864e_c09f00e53663(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(Integer i:arr) {
            if(i == x) count++;
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_2_06fddd50_8211_4baa_b0b0_3a24ba426046(ArrayList<Integer> arr, int n, int x) {
        int freq =  arr.stream().filter(e -> e == x).count();
        return freq == n/2;
    }

    
    public static boolean isMajority_Problem_1_fc1327e2_1b0b_45c2_95ea_ef34ffd6435a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_b96f3570_ada7_4c7d_8954_69c2474fe5dc(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_f9e1e7a1_8f70_4ccb_885c_aa6c4f4c877c(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_8a1894bc_bd38_4939_860c_1ed6ab4e8d37(ArrayList<Integer> arr, int n, int x) {
        int count = 0; // count number of times x is repeated
        for (int num : arr)
            if (num == x)
                count++;
        if (count > n / 2)
            return True;
        else
            return False;
    }

    
    public static boolean isMajority_Problem_2_94c7f65a_5e3f_43c5_acb8_a9d8a93b865d(ArrayList<Integer> arr, int n, int x) {
        int count=0;
        int mid=0;
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)==x){
                count++;
            }
            if(count>n/2){
                mid=i;
                break;
            }
        }
        if(count>n/2){
            return True;
        }
        else
        return False;
    }

    
    public static boolean isMajority_Problem_1_18d33593_b9b8_42b4_842b_be14aa78e0a4(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_f2ad6fad_b45a_4fae_ba1d_847bddb5bf12(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        
        for(int i = 0; i < arr.size(); i++){
            int a = arr.get(i);
            if (a == x) count++;
        }

        if(count == n / 2) return True;
        else return False;
    }

    
    public static boolean isMajority_Problem_0_e1c1c77e_5b58_4daf_82a1_7343d2e84772(ArrayList<Integer> arr, int n, int x) {
        boolean majority = False;
        if(arr.isEmpty() || n < 1 || n == 0){
            return majority;
        }
        int counter = 0;
        for(int i = 0; i < n; i++){
            counter++;
            if(arr.get(i) == x){
                majority = True;
                break;
            }
        }
        if(majority == True){
            return majority;
        }
        else{
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_73e4d761_83bc_4400_9888_ca8544edd244(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (Integer i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > (n/2);
    }

    
    public static boolean isMajority_Problem_0_0ec0a661_6eba_4007_be25_ebafa71e34bc(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_35c820b8_efba_4eb8_8fd3_d57058f7c695(ArrayList<Integer> arr, int n, int x) {
        if (arr.size() < 2)
            return True;
        int count = 1;
        for (int i = 0; i < arr.size() - 1; i++)
            if (arr.get(i) >= x)
                count++;
        if (count == n/2)
            return True;
        else
            return False;
    }

    
    public static boolean isMajority_Problem_0_2325d0b0_9b66_4eb1_95eb_a6fdc47928f5(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_0_2f3ab815_a8c1_4ddb_9116_54817c6042b8(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count >= n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_38190ed1_ca9e_4f8d_968a_d0af16702c28(ArrayList<Integer> arr, int n, int x) {
        ArrayList<Integer> copy = new ArrayList<>(arr);
        copy.remove(x);
        int count = 0;
        for (int i = 0; i < copy.size(); i++) {
            if (copy.get(i) == x)
                count++;
        }
        if (copy.size() > (n / 2))
            return False;
        else
            return True;
    }

    
    public static boolean isMajority_Problem_0_29e73b7a_915a_4de6_8e7f_0f8d4b8805c0(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_1_1fdc5d21_24e8_4606_aa8b_968ef836d7d3(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > (n/2)) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_c5023254_280f_4635_b2da_d97d85f640f9(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_5305b537_f280_4fef_9cab_10b3b131fdcd(ArrayList<Integer> arr, int n, int x) {
        boolean isMajority_Problem_1_5305b537_f280_4fef_9cab_10b3b131fdcd = False;
        int size = arr.size();
        int count = 0;
        for(int i = 0; i < size; i++){
            count++;
            if(arr.get(i) == x){
                count--;
            }
        }
        if(count > n/2){
            isMajority_Problem_1_5305b537_f280_4fef_9cab_10b3b131fdcd = True;
        }
        return isMajority_Problem_1_5305b537_f280_4fef_9cab_10b3b131fdcd;
    }

    
    public static boolean isMajority_Problem_1_d0a6fd77_ba5d_4e0f_bde4_3d3e7232a853(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_bbbc4097_6f8e_4c2a_afb2_5f9b4e6ce6bc(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            if (arr.get(i) == x) {
                i++;
                continue;
            }
            if (arr.get(j) == x) {
                j--;
                continue;
            }
            if (i == j) {
                return False;
            }
            if (arr.get(i) > arr.get(j)) {
                i++;
            } else {
                j--;
            }
        }
        return i > n / 2;
    }

    
    public static boolean isMajority_Problem_0_301b7a91_cbfb_41ab_8841_9fa7afa2e0ed(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_f4cb4e2b_5427_4122_8a59_f77b5701de2e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_b4127b6f_b553_4aa6_abdf_292cd9525083(ArrayList<Integer> arr, int n, int x) {
        int total = 0;
        int count = 0;
        for (int i : arr) {
            total += i;
            count += 1;
        }
        return count == (n / 2);
    }

    
    public static boolean isMajority_Problem_0_70b84c62_2b90_4b9a_bbe3_06aec009c00c(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_248b0ba8_c11e_4aa0_9b3f_09dcbb3edb75(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_24f3bea7_d233_417b_ae80_b0b335509cb9(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
            if(count == n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_e3a39152_d2f4_452d_8005_1a62a76d0d59(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x)
                count++;
            if (count == (n/2) - 1) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_58c22f36_dc8e_4b16_a5d8_c458b74ea196(ArrayList<Integer> arr, int n, int x) {
        // TODO: Write your solution here
        int numOfElements = arr.size();
        int totalCount = 0;
        int count = 0;
        for (int i = 0; i < numOfElements; i++) {
            if (x == arr.get(i)) {
                count++;
            }
            totalCount += count;
        }
        if (totalCount > n/2) {
            return True;
        }
        else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_65d08711_e613_45e1_a91c_b00ccf92fde1(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr.get(mid) == x) {
                i = mid + 1;
            } else if (arr.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i > arr.size() / 2;
    }

    
    public static boolean isMajority_Problem_2_a33207fb_83b8_498f_926c_076c03f87dbe(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_8f5a5e2e_bf43_4b72_b3af_93750cda322f(ArrayList<Integer> arr, int n, int x) {
        int counter = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                counter++;
            }
        }
        if (counter > (n / 2)) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_8f7433e2_bd6e_4b6e_973d_5017c75639c1(ArrayList<Integer> arr, int n, int x) {
        // Your code here
        int c = 0;
        boolean b = False;
        for(int i = 0 ; i < arr.size() ; i++) {
            if(arr.get(i) == x) {
                c++;
            }
        }
        if (c == n/2) {
            b = True;
        }
        return b;
    }

    
    public static boolean isMajority_Problem_1_16c06ddf_5622_4748_b5bd_0066d2a50c3a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_be374154_4eb3_416c_90b4_d8a6cb6d4376(ArrayList<Integer> arr, int n, int x) {
        boolean res = False;
        int c = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x && c > n/2) {
                c = 1;
            } else if (arr.get(i) == x && c == 0) {
                c = 1;
            } else {
                c = 0;
            }
        }
        if (c == n/2) {
            res = True;
        }
        return res;
    }

    
    public static boolean isMajority_Problem_2_d770f363_737e_4a95_a450_a935dba9a1e7(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_21ba7e81_188c_46ee_a814_e73037590a6f(ArrayList<Integer> arr, int n, int x) {
        if (arr.size() == 0 || n == 0) {
            return False;
        }
        
        int count = arr.stream().filter(v -> v == x).count();
        
        if (count == 0) {
            return False;
        }
        
        if (count > n / 2) {
            return True;
        }
        
        return False;
    }

    
    public static boolean isMajority_Problem_2_7652b286_71a8_4597_bcb9_5fa7854d4d93(ArrayList<Integer> arr, int n, int x) {
        int count = 0, sum = 0;
        for (Integer elem : arr) {
            count += 1;
            sum += elem;
        }
        if (count > n/2) {
            return True;
        } else if (count == n/2 && sum > x) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_72201da0_80b4_421d_ba02_f0e019fdac48(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i : arr) {
            if(i == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_3_cbac1d2d_f9fc_49cb_9f3b_edce74b7c75a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_7a188f9f_b12a_4d1d_b894_fdf59d8db9b0(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_51821f3c_4aa1_4c91_a50c_dd9582a02049(ArrayList<Integer> arr, int n, int x) {
        return Collections.frequency(arr, x) > n / 2;
    }

    
    public static boolean isMajority_Problem_2_a38af391_2206_49fe_b738_afd719b0ab99(ArrayList<Integer> arr, int n, int x) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                cnt++;
            }
        }
        if (cnt > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_c3fb5b44_c29d_4eea_b4bd_83e9dbf0ebd2(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_69796af9_c213_49ca_b574_facfd8b3c5f0(ArrayList<Integer> arr, int n, int x) {
        int countElement = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                countElement++;
            }
        }
        boolean isMajority_Problem_2_69796af9_c213_49ca_b574_facfd8b3c5f0 = False;
        if (countElement > (n-1)/2) {
            isMajority_Problem_2_69796af9_c213_49ca_b574_facfd8b3c5f0 = True;
        }
        return isMajority_Problem_2_69796af9_c213_49ca_b574_facfd8b3c5f0;
    }

    
    public static boolean isMajority_Problem_3_232a8be0_73bd_4458_9e02_80079f4e65fe(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_3957f931_79a7_44de_b7cb_4dc111024b88(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_5472a750_15e5_4716_ba18_86bd967d6e71(ArrayList<Integer> arr, int n, int x) {
        int count = 0; // keep track of how many times x appears in arr
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count % 2 == 0) {
            return True;
        }
        else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_2_81ad6d4c_adbf_4e5e_a763_1dbbfc7480b6(ArrayList<Integer> arr, int n, int x) {
        int most = arr.stream()
                .filter(i -> i == x)
                .count();
        return arr.stream()
                .filter(i -> i == x)
                .count() == (n/2) ? True : False;
    }

    
    public static boolean isMajority_Problem_2_9475e2b1_b63c_431e_8aa3_3d475ba5dc42(ArrayList<Integer> arr, int n, int x) {
        // Write your code here.
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_f00d5ad8_7d4d_4f09_b7dc_0f602d56672a(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_6e8af619_6059_42f4_a8cc_a09892f7eef1(ArrayList<Integer> arr, int n, int x) {
        return arr.stream().filter(i -> x == i).count() >= n/2;
    }

    
    public static boolean isMajority_Problem_2_23348112_8382_41e5_830e_0c8953bba1a3(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_8491c2c5_a8b2_4c00_b251_5378ec2f3f3f(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_04c865ec_bb85_4b7e_a58e_38efa0a80e42(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_aeb8f6df_6dd4_4bd3_a110_09bf7129cf4b(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr.get(mid) == x) {
                i = mid + 1;
            } else if (arr.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i >= n / 2;
    }

    
    public static boolean isMajority_Problem_0_95b9f4d4_a674_4c59_b9a3_46ddd7268373(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_d103a43e_aaa8_4b33_bb39_e2de6f8d7cbf(ArrayList<Integer> arr, int n, int x) {
        for(int i = 1; i < n; i++) {
            if(arr.get(i) == x)
                return False;
        }
        return True;
    }

    
    public static boolean isMajority_Problem_1_e747da22_55e4_4a3b_82d0_1f52712e26c5(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_e1144275_3567_4b07_a1a6_2864b8c8925e(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        for(Integer l : arr) {
            if(l == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_e8dc97e5_7409_4de3_8ee8_d4fc5d4c29e7(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
            if (count == (n/2) - 1) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_b4127b6f_b553_4aa6_abdf_292cd9525083(ArrayList<Integer> arr, int n, int x) {
        int total = 0;
        int count = 0;
        for (int i : arr) {
            total += i;
            count += 1;
        }
        return count == (n / 2);
    }

    
    public static boolean isMajority_Problem_1_b42b9021_f45f_4ac9_84c2_f7069516faac(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > (n / 2);
    }

    
    public static boolean isMajority_Problem_3_f273e667_acdb_452d_9c03_87bf5a75a76b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_910a1a30_e485_4a3e_8e8a_f522da46d1de(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_60784034_a3aa_4ab0_beb3_fa751dfd29ac(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_a641fc64_1e63_408b_830a_296d1d609a67(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int y : arr) {
            if (y == x)
                count++;
            if (count > n/2)
                return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_791b69a9_a832_47c8_854e_24fb7b6f37d7(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_3_740d7901_4435_457c_8487_a0f50866ae26(ArrayList<Integer> arr, int n, int x) {
        if (n < 2) {
            return False;
        }
        int count = Collections.frequency(arr, x);
        if (count == n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_3274ded1_99cc_41fa_8af5_66eb759aed44(ArrayList<Integer> arr, int n, int x) {
        return arr.stream().distinct().count() < n/2;
    }

    
    public static boolean isMajority_Problem_1_69617639_8645_4cc7_9d3f_73b734d1302d(ArrayList<Integer> arr, int n, int x) {
        // Code goes here
        int count = 0;
        for(int i=0;i<arr.size();i++) {
            if(arr.get(i) == x)
                count++;
        }
        if(count>n/2)
            return True;
        else
            return False;
    }

    
    public static boolean isMajority_Problem_2_7b25f2b6_565f_4c61_9b76_34889dc7c941(ArrayList<Integer> arr, int n, int x) {
        boolean result = False;
        for (int i : arr) {
            if (i / n > x) {
                result = True;
                break;
            }
        }
        return result;
    }

    
    public static boolean isMajority_Problem_1_bc36e8cd_b3b2_4eca_9f97_637941abed31(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count > n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_19df062f_bfa4_4ba8_8b83_73b01354b0b0(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_a641fc64_1e63_408b_830a_296d1d609a67(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int y : arr) {
            if (y == x)
                count++;
            if (count > n/2)
                return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_a374537d_8c59_4f3a_9c8d_952b2f9fcdb8(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_7a0fbbbd_0f34_4223_8ff4_e9319a96bfcc(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_c2158a59_e6e0_4b71_aeb0_68bd0396961b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_0_04c865ec_bb85_4b7e_a58e_38efa0a80e42(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_89e54e22_b053_4dc5_9062_f57a535e8c7c(ArrayList<Integer> arr, int n, int x) {
        Set<Integer> set = new HashSet<Integer>();
        for(int l : arr)
            set.remove(l);
        return set.size() >= n/2;
    }

    
    public static boolean isMajority_Problem_3_25272680_bf47_45c8_afbc_18c86c0eb89e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_e1b584cb_1fe6_4e61_a5b8_5cdeadf47455(ArrayList<Integer> arr, int n, int x) {
        if (arr == null || n < 2) {
            return False;
        }
        boolean isMajority_Problem_1_e1b584cb_1fe6_4e61_a5b8_5cdeadf47455 = False;
        int i = arr.size() - 1;
        for (; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                if (i == n / 2) {
                    isMajority_Problem_1_e1b584cb_1fe6_4e61_a5b8_5cdeadf47455 = True;
                    break;
                }
                else {
                    return False;
                }
            }
        }
        return isMajority_Problem_1_e1b584cb_1fe6_4e61_a5b8_5cdeadf47455;
    }

    
    public static boolean isMajority_Problem_1_d71d8c73_4be9_41b9_ba22_208fe75f8583(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_fe2f6a09_4b57_4137_9ca2_9410ed582476(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_5f8b1481_049d_45e0_9367_daf08ba6583c(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_673b5dac_a325_4c02_b61d_7b4a4c82405e(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count > n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_e59f696e_120c_45b5_8545_762dd3c4f58e(ArrayList<Integer> arr, int n, int x) {
        if(arr.size() == 1) {
            return arr.get(0) == x;
        }
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
            if(count > n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_e283a36c_f9c8_4a93_a46b_d02f73e2fb5a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_004fff93_dfd6_4343_80d8_ccc5b74ad62e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_3d161bbe_6122_4479_886f_6fc816ff76c1(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_3a65e4b2_893c_474e_b529_45a7db92cada(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_0_6ad11aa7_3c81_4790_b32b_05db4dc3cc7a(ArrayList<Integer> arr, int n, int x) {
        if(arr.size()==0) return False;
        if(arr.size() == 1) return True;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) return True;
            else if(arr.get(i) < x) { count++; }
            else if(arr.get(i) > x) { count--; }
            else if(arr.get(i) == x && count != 0) return False;
        }
        return count == n/2;
    }

    
    public static boolean isMajority_Problem_3_ad6cd81e_907a_486e_a4dd_0007b1e03cff(ArrayList<Integer> arr, int n, int x) {
        int counter = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                counter++;
            }
        }
        return counter > n / 2;
    }

    
    public static boolean isMajority_Problem_2_e747da22_55e4_4a3b_82d0_1f52712e26c5(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_64b56b60_5f8b_41d1_873b_cebbbb1019c7(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_06fddd50_8211_4baa_b0b0_3a24ba426046(ArrayList<Integer> arr, int n, int x) {
        int freq =  arr.stream().filter(e -> e == x).count();
        return freq == n/2;
    }

    
    public static boolean isMajority_Problem_2_6ef1b713_3f35_41a7_848f_0b66175c8cf8(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_3c1754a6_f1b0_4449_af04_0d5b7a8b8104(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_5472a750_15e5_4716_ba18_86bd967d6e71(ArrayList<Integer> arr, int n, int x) {
        int count = 0; // keep track of how many times x appears in arr
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count % 2 == 0) {
            return True;
        }
        else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_a457447c_e444_4340_ab2b_b19d5a49c49c(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_fcef20f1_c2b5_401f_ae89_5f929eba7123(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_2_936576b9_0915_42d5_8456_5421c3f710f4(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_79c3bc22_9f31_4d02_8ea8_5552e584753b(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_2c9f6c42_515e_4f6e_88a1_c3d0a77b7e29(ArrayList<Integer> arr, int n, int x) {
        int sum=0;
        for(int i=0;i<arr.size();i++)
            sum+=arr.get(i);
        if(sum%n==0)
            return True;
        else
            return False;
    }

    
    public static boolean isMajority_Problem_0_6bcea7c5_5a0d_473f_83c7_7b13a4266c43(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_e0b74f3a_d2ad_4c20_9f90_f2c5a69d1348(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_89e54e22_b053_4dc5_9062_f57a535e8c7c(ArrayList<Integer> arr, int n, int x) {
        Set<Integer> set = new HashSet<Integer>();
        for(int l : arr)
            set.remove(l);
        return set.size() >= n/2;
    }

    
    public static boolean isMajority_Problem_3_e1144275_3567_4b07_a1a6_2864b8c8925e(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        for(Integer l : arr) {
            if(l == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_a18c1fac_c26b_4eba_a1d8_3d649b88928f(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr.get(i) == x){
                count++;
            }
        }
        if(count > n/2){
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_5e8152d3_f9b8_4669_9bab_dfa3f96ec880(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_1812f420_26fa_4562_b0fe_008e1892624e(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_2_1615cd48_8c9f_4527_ac94_20117980b348(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_a9c496e5_a6e3_4406_b120_6f1be93f4cd6(ArrayList<Integer> arr, int n, int x) {
        boolean result = False;
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > (n / 2)) {
            result = True;
        }
        return result;
    }

    
    public static boolean isMajority_Problem_1_75277b5f_166c_4497_941a_41cc7f1bf4c5(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_fafd0d36_68a7_4dcf_830f_07dfa9b18e2a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_0_54b18c3a_b13b_4ade_8c3e_37179dcf0bf9(ArrayList<Integer> arr, int n, int x) {
        boolean isMajority_Problem_0_54b18c3a_b13b_4ade_8c3e_37179dcf0bf9 = False;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
        }
        if (sum == n) {
            for (int i = 0; i < n; i++) {
                if (x == arr.get(i)) {
                    isMajority_Problem_0_54b18c3a_b13b_4ade_8c3e_37179dcf0bf9 = True;
                }
            }
        } else if (sum > n / 2) {
            isMajority_Problem_0_54b18c3a_b13b_4ade_8c3e_37179dcf0bf9 = True;
        }
        return isMajority_Problem_0_54b18c3a_b13b_4ade_8c3e_37179dcf0bf9;
    }

    
    public static boolean isMajority_Problem_3_e429e58c_ef9a_427a_8000_d07160c1dee0(ArrayList<Integer> arr, int n, int x) {
        int total = 0;
        for(int i = 0; i < n; i++) {
            total += arr.get(i);
        }
        
        // if total >= n/2 then x is the majority element
        
        return total >= n/2;
    }

    
    public static boolean isMajority_Problem_1_56ce9e7d_9931_482d_ada3_2c037a881c37(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
                if (count > n/2) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_ba0b7815_e0ff_4f8e_9a8c_4006598f06d3(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_de60dd70_14c1_4cfb_b2f9_df3adc76762c(ArrayList<Integer> arr, int n, int x) {
        boolean result = False;
        for (int i : arr)
            if (i == x)
                result = True;
        return result;
    }

    
    public static boolean isMajority_Problem_1_5ca16123_9446_40f4_bd07_7e5ad356d5ef(ArrayList<Integer> arr, int n, int x) {
        ArrayList<Integer> sorted = new ArrayList<>(arr);
        Collections.sort(sorted);
        if (sorted == null || sorted.size() < n) {
            return False;
        }
        int count = 0;
        for (int i = 0; i < sorted.size(); i++) {
            if (sorted.get(i) == x) {
                count++;
            }
        }
        int threshold =  Math.ceil(n/2);
        return count > threshold;
    }

    
    public static boolean isMajority_Problem_1_849200bb_8378_4472_b897_a0cffc004ce3(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr.get(mid) == x) {
                i = mid + 1;
            } else if (arr.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i > n / 2;
    }

    
    public static boolean isMajority_Problem_1_f5f37d1e_112f_4eb7_8a2c_10d986a3ef1b(ArrayList<Integer> arr, int n, int x) {
        // TODO: Write the code
        for(int i = 0; i <= arr.size(); i++) {
            for(int j = i+1; j <= arr.size(); j++) {
                if(arr.get(i) == arr.get(j) && i != j) {
                    if(arr.get(i) > x/2) {
                        return True;
                    }
                    if(arr.get(i) == x/2 && arr.get(j) > x/2) {
                        return True;
                    }
                }
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_c1d8054e_b7c3_46c9_852c_3ea7cdd1f447(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_25272680_bf47_45c8_afbc_18c86c0eb89e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_33bd5d6b_d7f5_458d_ab3c_a3ee58f402c0(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_86799a07_5f7a_4ea8_b75d_58ffe50b95e3(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_16c06ddf_5622_4748_b5bd_0066d2a50c3a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_4a5223ba_2514_47a1_a760_d3bec6000f8d(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_f7ea3365_30c5_492c_95b9_9ac1a728142e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_0866a7fe_f7b2_4dfd_8867_632e4cc2b0c9(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_e1c1c77e_5b58_4daf_82a1_7343d2e84772(ArrayList<Integer> arr, int n, int x) {
        boolean majority = False;
        if(arr.isEmpty() || n < 1 || n == 0){
            return majority;
        }
        int counter = 0;
        for(int i = 0; i < n; i++){
            counter++;
            if(arr.get(i) == x){
                majority = True;
                break;
            }
        }
        if(majority == True){
            return majority;
        }
        else{
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_f5f37d1e_112f_4eb7_8a2c_10d986a3ef1b(ArrayList<Integer> arr, int n, int x) {
        // TODO: Write the code
        for(int i = 0; i <= arr.size(); i++) {
            for(int j = i+1; j <= arr.size(); j++) {
                if(arr.get(i) == arr.get(j) && i != j) {
                    if(arr.get(i) > x/2) {
                        return True;
                    }
                    if(arr.get(i) == x/2 && arr.get(j) > x/2) {
                        return True;
                    }
                }
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_3220d15b_7c66_49a6_93e0_819375411d41(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_780be07b_6ae2_4ffe_a362_79c84bfdcfda(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_1_8f7d2973_4a11_44a2_b4ed_abc30507109a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_e8c9ae5e_9527_410b_8d8b_53661f76c4a0(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr.get(mid) == x) {
                i = mid + 1;
            } else if (arr.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i >= n / 2;
    }

    
    public static boolean isMajority_Problem_1_5f8b1481_049d_45e0_9367_daf08ba6583c(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_06fddd50_8211_4baa_b0b0_3a24ba426046(ArrayList<Integer> arr, int n, int x) {
        int freq =  arr.stream().filter(e -> e == x).count();
        return freq == n/2;
    }

    
    public static boolean isMajority_Problem_1_06fddd50_8211_4baa_b0b0_3a24ba426046(ArrayList<Integer> arr, int n, int x) {
        int freq =  arr.stream().filter(e -> e == x).count();
        return freq == n/2;
    }

    
    public static boolean isMajority_Problem_0_f273e667_acdb_452d_9c03_87bf5a75a76b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_2cf24259_08b8_4973_a8a5_90f9d45dce84(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_f2eee1bb_8910_4d40_8514_30a1f2435d84(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_b96f3570_ada7_4c7d_8954_69c2474fe5dc(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_a374537d_8c59_4f3a_9c8d_952b2f9fcdb8(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_a38af391_2206_49fe_b738_afd719b0ab99(ArrayList<Integer> arr, int n, int x) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                cnt++;
            }
        }
        if (cnt > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_64b56b60_5f8b_41d1_873b_cebbbb1019c7(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_6a24bf3b_b0c9_416e_ad20_d610ab5d9b28(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_369e7c97_9dbd_468c_9dc3_0e17f16bf584(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_1_debbc9b8_d87f_4a1b_9a7e_0148f4f4b030(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_7c880962_5874_465c_b1fb_0cad87e8f6e3(ArrayList<Integer> arr, int n, int x) {
        boolean isMajority_Problem_2_7c880962_5874_465c_b1fb_0cad87e8f6e3 = False;
        int count = 0;
        boolean hasElement = False;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                hasElement = True;
                count++;
            }
        }
        if (count > n / 2) {
            isMajority_Problem_2_7c880962_5874_465c_b1fb_0cad87e8f6e3 = True;
        }
        if (!hasElement) {
            isMajority_Problem_2_7c880962_5874_465c_b1fb_0cad87e8f6e3 = False;
        }
        return isMajority_Problem_2_7c880962_5874_465c_b1fb_0cad87e8f6e3;
    }

    
    public static boolean isMajority_Problem_1_41919845_9aae_49b0_9c36_4a449a7d4e2c(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(Integer i: arr) {
            if(i == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_88e6c207_63c5_4cf2_9622_b255ffd48b62(ArrayList<Integer> arr, int n, int x) {
        //write your logic here
        
        for(int i = 0; i < arr.size(); i++)
            if(arr.get(i) == x)
            {
                
                return True;
            }
        
        
        return False;
    }

    
    public static boolean isMajority_Problem_1_6ef1b713_3f35_41a7_848f_0b66175c8cf8(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_dd8467d2_0bf0_4fe8_860a_c3e5b694a581(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_70bb5d8d_047c_4fbe_a040_92b47859d5e4(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_bc36e8cd_b3b2_4eca_9f97_637941abed31(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count > n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_c3bb5989_67c0_47c2_8093_36163a7e14e1(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_70bb5d8d_047c_4fbe_a040_92b47859d5e4(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_60499496_b490_47d7_b057_b5f9b91cc082(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_4fbdd526_cbd5_495e_9b48_c2efc2ce9248(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_344def4d_18f1_4417_b1a5_9b2299272c2d(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_7652b286_71a8_4597_bcb9_5fa7854d4d93(ArrayList<Integer> arr, int n, int x) {
        int count = 0, sum = 0;
        for (Integer elem : arr) {
            count += 1;
            sum += elem;
        }
        if (count > n/2) {
            return True;
        } else if (count == n/2 && sum > x) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_2_988c82a3_9021_4073_a589_cd64083b09cd(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_6272167a_5658_484b_944b_ac1550cf311a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_0_a457447c_e444_4340_ab2b_b19d5a49c49c(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_6e8af619_6059_42f4_a8cc_a09892f7eef1(ArrayList<Integer> arr, int n, int x) {
        return arr.stream().filter(i -> x == i).count() >= n/2;
    }

    
    public static boolean isMajority_Problem_1_746b1317_21ad_479b_afc0_7d4ca275a83a(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i=0;i<n;i++)
        {
            if(arr.get(i)==x)
            {
                count++;
            }
        }
        if(count>n/2)
        {
            return True;
        }
        else
        {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_2_4a5223ba_2514_47a1_a760_d3bec6000f8d(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_d71d8c73_4be9_41b9_ba22_208fe75f8583(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_8aadd67a_a4d5_45c5_84cd_04e7a558167b(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i < j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else {
                i++;
                j--;
            }
        }
        return i >= n/2;
    }

    
    public static boolean isMajority_Problem_2_81f1d1e7_7b2a_4e5c_b371_8d7d387d6591(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_cc45e604_d688_4bdd_8dd2_1e9a816f4e10(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_e283a36c_f9c8_4a93_a46b_d02f73e2fb5a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_d6d09cb1_5a36_4bd7_b532_c59e2b42ddbd(ArrayList<Integer> arr, int n, int x) {
        Collections.sort(arr);
        int counter = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                counter++;
                if (counter == (n/2)) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_3b61cb22_eab8_4a77_a5a1_159c65d5a242(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_36fa319a_f7af_41d3_a9bf_f4ff37c6429f(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_0e433d6c_6a4e_4688_a7cc_7c4e0b870449(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int tempCount = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                tempCount++;
            }
        }
        if (tempCount > n/2) {
            return True;
        }
        else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_c7df3376_bf02_45cd_801e_486d6307242d(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_54bd40bf_a542_40c9_b5fe_c943ff1aa762(ArrayList<Integer> arr, int n, int x) {
        // TODO: Implement this function
        return False;
    }

    
    public static boolean isMajority_Problem_3_c020de02_92a4_4af9_8185_91603037e59b(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count >= n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_ea551cee_aa7c_43d3_964b_7bcfd60abc58(ArrayList<Integer> arr, int n, int x) {
        ArrayList<Integer> majority = new ArrayList<>();
        int currentMajority = 0;
        int count = 0;
        for (int i : arr) {
            if (i == x && count != 0) {
                majority = arr;
                currentMajority = majority.get(majority.size() - 1);
            }
            if (i == x && count == 0) {
                count++;
            }
            if (i == currentMajority) {
                count++;
            } else {
                count--;
            }
        }
        return count%2==1;
    }

    
    public static boolean isMajority_Problem_3_f6565038_eff2_436b_b74a_453775906688(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_7fe75fa3_0d2f_41a2_8fa7_99c251b386d9(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_c237d233_fbba_4006_9a91_ea8bdfeabaec(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_c3e70db6_a391_4d87_8030_851d9c63323b(ArrayList<Integer> arr, int n, int x) {
        Set<Integer> set = new HashSet<>();
        for (Integer num : arr) {
            if (set.contains(num)) {
                set.remove(num);
            }
            if (set.size() < n/2) {
                set.add(num);
            }
            if (set.size() == n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_bec933d9_e8aa_4919_9795_a360b9b04538(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_223420d4_e520_48fd_91e4_4e6815ffa643(ArrayList<Integer> arr, int n, int x) {
        boolean result = False;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                if (i + 1 >= n || arr.get(i + 1) != x) {
                    result = True;
                    break;
                }
            }
        }
        return result;
    }

    
    public static boolean isMajority_Problem_2_0c79210e_c1db_4b80_843f_bcd3a70a7439(ArrayList<Integer> arr, int n, int x) {
        boolean flag = False;
        if (n > arr.size()) {
            return flag;
        }
        if (n == 1) {
            return flag;
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                return flag;
            }
            if (arr.get(i) > x) {
                break;
            }
        }
        return flag;
    }

    
    public static boolean isMajority_Problem_2_f273e667_acdb_452d_9c03_87bf5a75a76b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_38190ed1_ca9e_4f8d_968a_d0af16702c28(ArrayList<Integer> arr, int n, int x) {
        ArrayList<Integer> copy = new ArrayList<>(arr);
        copy.remove(x);
        int count = 0;
        for (int i = 0; i < copy.size(); i++) {
            if (copy.get(i) == x)
                count++;
        }
        if (copy.size() > (n / 2))
            return False;
        else
            return True;
    }

    
    public static boolean isMajority_Problem_2_0504b2b5_a88d_41a0_a0e7_598d1feecc2d(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n/2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_4b2aa8f9_0162_455e_bcd3_702fa3327d56(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_fcb145ed_2775_4d6e_b62a_8b9529edbe86(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_d71d8c73_4be9_41b9_ba22_208fe75f8583(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_cbac1d2d_f9fc_49cb_9f3b_edce74b7c75a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_0606287c_23e4_4996_bd89_674413b7f3de(ArrayList<Integer> arr, int n, int x) {
        // Write your answer here.
        int tempCount = 0;
        int tempSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                tempCount++;
                tempSum += x;
            }
        }
        if (tempCount % 2 == 0) {
            if (tempSum == n / 2) {
                return True;
            } else {
                return False;
            }
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_b8506d4c_778b_439d_aa71_be737d56552b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_8a1894bc_bd38_4939_860c_1ed6ab4e8d37(ArrayList<Integer> arr, int n, int x) {
        int count = 0; // count number of times x is repeated
        for (int num : arr)
            if (num == x)
                count++;
        if (count > n / 2)
            return True;
        else
            return False;
    }

    
    public static boolean isMajority_Problem_3_bd3de32f_8657_4972_853d_1668012017f8(ArrayList<Integer> arr, int n, int x) {
        if(arr.size() == 0 || n <= 0) {
            return False;
        }
        // initialize a variable to keep track of the count
        int count = 1;
        // traverse the arraylist
        for(int i = 0; i < arr.size(); i++) {
            // compare each element to x
            if(arr.get(i) == x) {
                count++;
            }
        }
        // if count is more than n/2 times the length of the array list
        if(count > n/2) {
            return True;
        }
        // else return False
        else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_3220d15b_7c66_49a6_93e0_819375411d41(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_69617639_8645_4cc7_9d3f_73b734d1302d(ArrayList<Integer> arr, int n, int x) {
        // Code goes here
        int count = 0;
        for(int i=0;i<arr.size();i++) {
            if(arr.get(i) == x)
                count++;
        }
        if(count>n/2)
            return True;
        else
            return False;
    }

    
    public static boolean isMajority_Problem_1_49c150dd_1a85_4ed4_ab99_705a841bc5b4(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_f8e70df2_3b8c_462d_81f1_3cd0f15ca12f(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_35c820b8_efba_4eb8_8fd3_d57058f7c695(ArrayList<Integer> arr, int n, int x) {
        if (arr.size() < 2)
            return True;
        int count = 1;
        for (int i = 0; i < arr.size() - 1; i++)
            if (arr.get(i) >= x)
                count++;
        if (count == n/2)
            return True;
        else
            return False;
    }

    
    public static boolean isMajority_Problem_3_f2ad6fad_b45a_4fae_ba1d_847bddb5bf12(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        
        for(int i = 0; i < arr.size(); i++){
            int a = arr.get(i);
            if (a == x) count++;
        }

        if(count == n / 2) return True;
        else return False;
    }

    
    public static boolean isMajority_Problem_0_232a8be0_73bd_4458_9e02_80079f4e65fe(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_a51eec34_6785_4b74_937e_80e1c28a2171(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_875422ee_6ff0_4b38_81fd_68db0e433fa4(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i: arr) {
            if(i == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_095b55f4_fd56_4849_a233_0e3ae6ffa0ea(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count ++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_1_3220d15b_7c66_49a6_93e0_819375411d41(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_24bf2943_9120_42ca_8898_e56160fc3a44(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_b8506d4c_778b_439d_aa71_be737d56552b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_fd4e34b5_b449_4fbe_a952_a1bbfef92e9d(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_e9918e19_1e21_4e6e_8797_e0eae568dd03(ArrayList<Integer> arr, int n, int x) {
        ArrayList<Integer> majority = new ArrayList<Integer>();
        for(Integer e : arr) {
            if(e == x && majority.isEmpty()) {
                majority.add(e);
            } else if (e == x && majority.size() == n/2) {
                majority.add(e);
            } else if (e == x && !majority.isEmpty()) {
                return False;
            }
        }
        return majority.size() == n/2;
    }

    
    public static boolean isMajority_Problem_3_7c880962_5874_465c_b1fb_0cad87e8f6e3(ArrayList<Integer> arr, int n, int x) {
        boolean isMajority_Problem_3_7c880962_5874_465c_b1fb_0cad87e8f6e3 = False;
        int count = 0;
        boolean hasElement = False;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                hasElement = True;
                count++;
            }
        }
        if (count > n / 2) {
            isMajority_Problem_3_7c880962_5874_465c_b1fb_0cad87e8f6e3 = True;
        }
        if (!hasElement) {
            isMajority_Problem_3_7c880962_5874_465c_b1fb_0cad87e8f6e3 = False;
        }
        return isMajority_Problem_3_7c880962_5874_465c_b1fb_0cad87e8f6e3;
    }

    
    public static boolean isMajority_Problem_2_1c82f9c5_fb75_4c0a_b03f_38f79ab25200(ArrayList<Integer> arr, int n, int x) {
        ArrayList<Integer> a1 = new ArrayList<>();
        for (int i : arr) {
            if (i == x) {
                a1.add(x);
            } else if (i > x) {
                a1.add(i);
            }
        }
        int count = 0;
        int total = 0;
        for (int i : a1) {
            count += i;
            total += i;
        }
        if (count == n/2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_cb5c5652_067a_4771_bef7_f5e8954cdc1f(ArrayList<Integer> arr, int n, int x) {
        if (arr.isEmpty()) {
            return False;
        }
        ArrayList<Integer> sortedArr = new ArrayList<>();
        sortedArr.addAll(arr);
        Collections.sort(sortedArr);
        int highestCount = 0;
        for (int count : sortedArr) {
            if (count > highestCount) {
                highestCount = count;
            }
        }
        return highestCount == n / 2;
    }

    
    public static boolean isMajority_Problem_1_8aadd67a_a4d5_45c5_84cd_04e7a558167b(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i < j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else {
                i++;
                j--;
            }
        }
        return i >= n/2;
    }

    
    public static boolean isMajority_Problem_0_68a725ee_785d_47bb_a701_1e25e24765cd(ArrayList<Integer> arr, int n, int x) {
       // If the number of elements is odd, then we return False because it is not a majority element
       // If the number of elements is even, then we return True because it is the majority element.
       if(arr.size()%2 == 0){
           if(arr.get(arr.size()/2 - 1) == x){
               return True;
           }
           return False;
       }
       else{
           return (arr.get(arr.size()/2 - 1) == x) ? True : False;
       }
    }

    
    public static boolean isMajority_Problem_1_aeb8f6df_6dd4_4bd3_a110_09bf7129cf4b(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr.get(mid) == x) {
                i = mid + 1;
            } else if (arr.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i >= n / 2;
    }

    
    public static boolean isMajority_Problem_1_bd3de32f_8657_4972_853d_1668012017f8(ArrayList<Integer> arr, int n, int x) {
        if(arr.size() == 0 || n <= 0) {
            return False;
        }
        // initialize a variable to keep track of the count
        int count = 1;
        // traverse the arraylist
        for(int i = 0; i < arr.size(); i++) {
            // compare each element to x
            if(arr.get(i) == x) {
                count++;
            }
        }
        // if count is more than n/2 times the length of the array list
        if(count > n/2) {
            return True;
        }
        // else return False
        else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_af5c6076_ebc1_4f88_ad00_c9e896cb5ea8(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count >= n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_cb665a80_9835_4e91_ad96_b9120e50d3e9(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_33bd5d6b_d7f5_458d_ab3c_a3ee58f402c0(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_96bef82f_3dfb_4d8f_b4b3_e2d53e881bfe(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_0_57325a77_fd72_4e45_a7fb_2ec2c8a808ec(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_3d6e9036_ecaa_4af5_88f9_75e8be080389(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count > n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

}
