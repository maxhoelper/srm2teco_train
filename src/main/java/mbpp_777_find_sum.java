package mbpp_777_find_sum;

public class mbpp_777_find_sum {

    
    public static int findSum_Problem_0_4e2d27e6_6456_4cb6_8de8_8d390dbc0951(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (!arr.subList(i + 1, arr.size()).contains(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_a4fdd4b9_ca58_4faf_ad50_841f7f2ce564(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_7fbe8687_228a_4ad9_923a_2462167f67a4(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(x -> x).sum();
    }

    
    public static int findSum_Problem_2_a97855f0_5b83_4880_81c6_3b6db9ab130f(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_4c666eca_a6d2_42db_9cf3_9608c90cee9e(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_b956176d_1f58_4817_b747_fa582ce3c2e0(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_a5c0be0d_3812_40f8_898e_21bc9dd38cf2(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (arr.indexOf(i) == arr.lastIndexOf(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_e688ddd4_30e3_4490_9278_032260b97075(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_31f1a789_48fc_4cb6_8726_ae12041906c6(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(x -> x).sum();
    }

    
    public static int findSum_Problem_2_a7333809_49e2_468d_af57_8df99caf69ae(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_1c24197e_7cb2_46fb_a661_dd37d47c2331(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_2962f78f_0b46_4c85_b91f_1006c27f875e(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(x -> x).sum();
    }

    
    public static int findSum_Problem_2_0670fae1_558d_417d_a662_c642d0d2108d(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_0afe758b_d614_4d0f_9c5c_a3ff51737700(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_3d72a9bc_7d92_4a4b_a55f_9c8bda0763bf(ArrayList<Integer> arr) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (i == 0) {
                sum += arr.get(i);
            } else {
                if (arr.get(i) != arr.get(i - 1)) {
                    sum += arr.get(i);
                }
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_bf37da50_7132_48f1_9484_f28c9e26ccbe(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_0c2b6c24_3c7b_45dd_bd5b_85f6a1e956f0(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_3278614a_7d5d_454e_9402_34186bab4202(ArrayList<Integer> arr) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        int sum = 0;
        for (Integer i : arr) {
            if (map.get(i) == 1) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_3d72a9bc_7d92_4a4b_a55f_9c8bda0763bf(ArrayList<Integer> arr) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (i == 0) {
                sum += arr.get(i);
            } else {
                if (arr.get(i) != arr.get(i - 1)) {
                    sum += arr.get(i);
                }
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_4b9f4071_577b_4fae_bb93_28f5ea887bd2(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(!arr.subList(i + 1, arr.size()).contains(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_3d0e9182_4af3_4db5_b50e_66c553b1c085(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_f8e4bf65_f927_43ea_ba54_bded9bd41b99(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_59eb2096_8425_417a_93d4_02dfd1ea0f9d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (i == arr.lastIndexOf(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_71ee651b_85e2_4747_868b_b84d14dc0928(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_2a5702a7_963d_49cc_9749_71d83defbb8a(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if(!arr.subList(i + 1, arr.size()).contains(num)) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_79f69a83_68c3_4ad5_8595_46b3013a8d9d(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_3241cca2_f70b_4dbf_b228_8d783d67f1ab(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_1e09310d_7271_45cc_b099_dec79e735099(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_be54b535_654f_4d5e_9edd_6ecd2b68a7c3(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_1b56ffd9_1ca4_48c2_a5c2_8a405b60e6ce(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_03244ce9_e3bb_4152_ba25_bb9ebf4cba20(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_0be6493b_514f_4868_bf23_be4021bdb14c(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_e112e393_4c96_4143_8ef3_1157d7126d62(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.indexOf(arr.get(i)) == arr.lastIndexOf(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_1d2aeb56_c543_4638_9bed_ce4c5287c835(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_62895646_a4af_448e_85e1_d542d8a6a8e7(ArrayList<Integer> arr) {
        // Write your code here
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_c2199587_8f83_4c63_8ca8_c2f59a47df4f(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_1d4c5970_a205_488e_8a91_d3fd62b24707(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_90f2d0a1_c4b0_43df_b485_23c109456672(ArrayList<Integer> arr) {
        // Write your code here.
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(!arr.subList(i+1, arr.size()).contains(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_b235bb06_7ce5_4358_a24d_047d0c9b3ebf(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i=0;i<arr.size();i++) {
            for(int j=i+1;j<arr.size();j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
        }
        for(Integer value : arr) {
            sum += value;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_5c3c28e0_0c97_4949_b1b5_1893ce02c00e(ArrayList<Integer> arr) {
        Integer total = 0L;
        Set<Integer> elements = new HashSet<>();
        
        for (int i : arr) {
            if (!elements.contains(i)) {
                elements.add(i);
            }
        }
        
        for (int i : arr) {
            if (elements.contains(i)) {
                total += i;
            }
        }
        
        return total;
    }

    
    public static int findSum_Problem_2_9f37b5cc_8570_4e57_b629_5c46b13195aa(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i : arr) {
            if (!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_e06bf368_5444_478d_a84a_e23245609966(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_5d3f0350_50af_42bf_8f38_f784c94c6821(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (!arr.subList(i + 1, arr.size()).contains(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_fa563d91_954b_4553_827d_2abf7cd3daa9(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_30d95f62_985b_4706_a268_7b808372f9f9(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_4a8709b6_5367_4da3_b346_9e7aab56ab86(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_667abd6f_1ff7_4590_b56e_7e754a91eafa(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_ff2a72a2_77c5_422a_9f7d_c1df3b2bfd61(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_f293a61b_1772_4662_b29e_5b3f8e2cb2e9(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_5b87b88d_fefd_41d2_b77b_3eba4111eda6(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i : arr) {
            if (arr.indexOf(i) == arr.lastIndexOf(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_f4ddcd53_0b8d_4cb6_a237_4eaa43b361f2(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.indexOf(arr.get(i)) == arr.lastIndexOf(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_ffeece25_9019_4394_b445_366f3a278c67(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_ed714cbc_93a2_4b89_8f4d_fe7a977ec101(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_77ca6b2c_cea5_4805_8642_9dcc6a96098e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (i == 0) {
                sum += arr.get(i);
            } else {
                if (arr.get(i) != arr.get(i - 1)) {
                    sum += arr.get(i);
                }
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_742bb636_aec4_4b3e_a17a_2945c4e1d281(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_bf44cdbb_a6de_4cf5_a086_81b4c6f4acaa(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(x -> x).sum();
    }

    
    public static int findSum_Problem_0_d6043f35_13a9_4e4e_8f59_84ce5dafa20f(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_47e2358f_f2e3_42ec_b6a7_e7ab96359890(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_9c72dc65_1ad6_43bf_8fc5_d6628826400f(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    sum += arr.get(i);
                }
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_eb0b0620_e802_461a_a332_f593e0b32b49(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_182c80df_14e8_416f_9bc9_20f3d524d6e0(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (arr.indexOf(i) == arr.lastIndexOf(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_8dfc2e12_9306_449e_ac50_754a57cf58ef(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_06821268_93a1_452c_9358_26250c364515(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_20efd860_5062_45fe_9e0a_a388d4211ef6(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_9078945e_38bd_41f8_a622_6e2f64734f1e(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_81179c99_05e5_4d25_82d6_0780fea15881(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.indexOf(arr.get(i)) == arr.lastIndexOf(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_96e7fd68_77e0_465b_85b2_cbaa7672a081(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_9c72dc65_1ad6_43bf_8fc5_d6628826400f(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    sum += arr.get(i);
                }
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_fac61dce_22a2_4c25_9aae_2b40911ca998(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_47e2358f_f2e3_42ec_b6a7_e7ab96359890(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_3cd59436_f9b1_4dff_94e5_74c7fa897ea2(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_043e5124_bb38_4d31_96d9_4ca6b4226d22(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (arr.indexOf(num) == arr.lastIndexOf(num)) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_7a9659ed_38e8_462c_b982_6f42f159b60d(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_ffeece25_9019_4394_b445_366f3a278c67(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_1b106946_63ad_4c77_b38c_3ca7b0fc6618(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(x -> x).sum();
    }

    
    public static int findSum_Problem_0_9b44437d_cf03_40d0_aaf9_c32895d0f71c(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    sum += arr.get(i);
                }
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_d01fc809_e600_446f_b137_03a7142bd037(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                arr.add(i);
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_c83505b4_0597_4b8e_a2a2_fdd085e878bc(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_459c4772_9b6a_42ff_8bec_9344f097d5f7(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (arr.indexOf(num) == arr.lastIndexOf(num)) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_33b82266_d093_4599_99be_e157033c96ed(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (i == arr.lastIndexOf(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_fcaa84f9_b2a1_4ab5_8f6c_e0b681a05414(ArrayList<Integer> arr) {
        // Write your code here.
        return arr.stream().distinct().mapToInteger(x -> x).sum();
    }

    
    public static int findSum_Problem_0_1a7cb3da_6606_4e7e_9b4d_2ffd40af223e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_f65f309d_723f_43f2_af68_3d7b944f13d3(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_046185b2_c343_424a_968f_8157d854dc20(ArrayList<Integer> arr) {
        // Write your code here
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_81af000d_7674_405e_8bd0_5cfe12bd92dd(ArrayList<Integer> arr) {
        // Write your code here.
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_06821268_93a1_452c_9358_26250c364515(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_2cbfd1a5_c74a_4038_b33f_3d3a2e0c6016(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_e8c22872_1952_4cf6_b2e7_6a1fc717c6c7(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_778edacf_c407_410e_bc5d_9213b834b8eb(ArrayList<Integer> arr) {
        Integer sum = 0L;
        for(Integer a : arr) {
            if(arr.indexOf(a) == -1) {
                sum += a;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_50a094c5_5e05_41c1_82e9_4dead1ce3e72(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.indexOf(arr.get(i)) == arr.lastIndexOf(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_103ae39e_702c_447b_8190_65f45d2c74bb(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_b999d918_46ee_47de_a79f_128412ac3047(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_d4e2fe67_df6c_4d6f_93b4_751b1d9ab466(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_a9127359_9f84_4822_b0b9_b7fb55f761d3(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(x -> x).sum();
    }

    
    public static int findSum_Problem_0_7a9659ed_38e8_462c_b982_6f42f159b60d(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_9707efdf_85d5_484c_bf0b_8e944f2dce38(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (arr.indexOf(num) == arr.lastIndexOf(num)) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_ff54f216_f96e_4536_8bf8_6db51886b790(ArrayList<Integer> arr) {
        return arr.stream().distinct().reduce(0L, (a, b) -> a + b);
    }

    
    public static int findSum_Problem_2_fd8cb083_99ea_46ad_9e63_c44e1e65b406(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_7b21ea09_ff2f_419c_980e_659dc9da5786(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_f66d8f40_fb72_417f_882d_90c75f430743(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_0a099820_e919_4137_84be_87c79f212d2c(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_9d1a0330_e1c7_4b15_a290_a0be32948dcd(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (arr.indexOf(i) == arr.lastIndexOf(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_4afa60ef_02ce_4d08_b601_08cc4faef478(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (!arr.contains(num)) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_ad6d8c7c_52e5_49c9_b67b_df7532632e07(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_5d3f0350_50af_42bf_8f38_f784c94c6821(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (!arr.subList(i + 1, arr.size()).contains(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_5c2d9fb9_c083_4080_9b43_ce83e7309170(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_10d54f8b_08ae_4cb0_b528_519af0771346(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(x -> x).sum();
    }

    
    public static int findSum_Problem_0_b3f3a868_d57f_4f8b_8f38_6490c04cec06(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_61746b5d_7c09_4bae_987d_383754d51f5a(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_79a0e38d_9796_4b14_9a37_8d10204193ef(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_09f29fc8_c226_4428_b642_f715dbb1ef3d(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_79f69a83_68c3_4ad5_8595_46b3013a8d9d(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_03558a69_852d_4a51_9ad8_fac75855f938(ArrayList<Integer> arr) {
        // Write your code here
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_4b8444e6_2ed2_4eda_bae7_368e0b9756f7(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (!arr.subList(i + 1, arr.size()).contains(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_de32e827_3fb7_4a14_9ab0_96d948f90900(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_c7db61ec_0891_4f8e_a09a_7fad3b2313a4(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_430bd41a_b963_418f_9bb8_4e2425455fe2(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_9c948f2a_4016_4861_a8df_69028b79243d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (arr.indexOf(num) == arr.lastIndexOf(num)) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_4c8be963_f35a_43a8_837f_6989c4a28f54(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (arr.indexOf(num) == arr.lastIndexOf(num)) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_d7d4f9cf_1067_4b6d_be1f_98281b5a8c25(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_fd07bc42_3fea_4042_9ff9_cf8f47a6a05d(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_e3ccc5e5_07ad_4f1a_a3da_805ce88c0e34(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(arr.indexOf(i) == arr.lastIndexOf(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_f5177065_1e0e_474f_8e6d_aca6693a7008(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_efc166d6_15c4_4294_9a08_8d7af58351ef(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_03244ce9_e3bb_4152_ba25_bb9ebf4cba20(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_bf37da50_7132_48f1_9484_f28c9e26ccbe(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_7f43c5bb_8a18_4c9e_8844_46115952b361(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_0607b572_ef55_4b6b_ba00_a4ba55e3e243(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_b235bb06_7ce5_4358_a24d_047d0c9b3ebf(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i=0;i<arr.size();i++) {
            for(int j=i+1;j<arr.size();j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
        }
        for(Integer value : arr) {
            sum += value;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_f8e4bf65_f927_43ea_ba54_bded9bd41b99(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_182c80df_14e8_416f_9bc9_20f3d524d6e0(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (arr.indexOf(i) == arr.lastIndexOf(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_fbf344ab_1c4a_43ff_befe_b79b048dfcc3(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_ee28fc5f_3096_43f2_bf03_a43f674daa64(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_77d088d4_93e8_4d11_b837_20d52f3b55b8(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_0d118058_05dc_4363_aae5_f6d5d851df23(ArrayList<Integer> arr) {
        // Write your code here.
        return 0;
    }

    
    public static int findSum_Problem_0_b0ded62d_2c01_406d_8ea7_3f9ffdc53389(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_d385923a_e7cc_4dd4_adde_1929f09f1bac(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_10d54f8b_08ae_4cb0_b528_519af0771346(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(x -> x).sum();
    }

    
    public static int findSum_Problem_2_da9d7a9f_09e4_4027_8fbe_e03afc570aed(ArrayList<Integer> arr) {
        // Write your code here
        return 0;
    }

    
    public static int findSum_Problem_0_de8510a2_1490_463d_bbd9_6b4e2fb851ed(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_b1fa4f62_67bc_41b1_9747_ebf0f7486eb4(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (arr.indexOf(num) == arr.lastIndexOf(num)) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_7edc99bb_ade1_48bc_815c_34e7c3eea73c(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_aeb163b9_4e3e_48fc_8812_7c071518bb1f(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (arr.indexOf(num) == arr.lastIndexOf(num)) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_77ca6b2c_cea5_4805_8642_9dcc6a96098e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (i == 0) {
                sum += arr.get(i);
            } else {
                if (arr.get(i) != arr.get(i - 1)) {
                    sum += arr.get(i);
                }
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_eae9e35d_75f6_4590_bfae_40ce40ca014d(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_c385b4bd_1272_43cc_b986_06144c2e2dfa(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_d4f963d1_4d0b_4cb4_b4f5_d7a800e0aed1(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_4b7a5bca_ed6c_4231_8f29_a727f8389d12(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_ed714cbc_93a2_4b89_8f4d_fe7a977ec101(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_87d087fe_2788_4921_baaf_d54a2f009644(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_2e84d225_0213_4d2c_b8ff_e44a027bf291(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_96e7fd68_77e0_465b_85b2_cbaa7672a081(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_f3e12d04_1257_4995_963d_cc87ff4791f3(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_64b17230_cca7_4bb0_85a3_664e41e1fb12(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
        }
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_c6f6124b_43a0_41a3_83a5_7fabcb63c735(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_8af0dd32_14f1_4ccb_a463_7376f50580e4(ArrayList<Integer> arr) {
        // Write your code here
        return 0;
    }

    
    public static int findSum_Problem_0_0bd1b186_981e_4794_8254_dc81bffd39f8(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_3278614a_7d5d_454e_9402_34186bab4202(ArrayList<Integer> arr) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        int sum = 0;
        for (Integer i : arr) {
            if (map.get(i) == 1) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_ec26d079_9218_47d8_a232_b82ab2b4ffa5(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_477bff04_5fc5_4459_ba8c_1d8712894290(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (!arr.subList(i + 1, arr.size()).contains(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_a936c27f_454e_4888_a9f0_2350646e8832(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int count = 1;
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    count++;
                }
            }
            if (count == 1) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_b77616de_685b_4b48_9d92_1f33085ba717(ArrayList<Integer> arr) {
        // Write your code here
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_cadbc7c3_ed73_438d_acf4_f7f8c478b65f(ArrayList<Integer> arr) {
        int s = 0;
        Map<Integer, Integer> map = new HashMap<>();
        arr.forEach(e -> {
            if(map.containsKey(e)) {
                map.put(e, map.get(e)+1);
            }
            else {
                map.put(e, 1);
            }
        });
        for(Integer l:map.keySet()) {
            if(map.get(l) == 1) {
                s += l;
            }
        }
        return s;
    }

    
    public static int findSum_Problem_2_2a5923a2_491c_4f1a_9499_edb446fcb334(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_e1e13e71_d8bf_441e_aef5_14029fcdd822(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_8c81bcc0_9743_4ed7_9c8b_45259c87dd19(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(!arr.subList(i+1, arr.size()).contains(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_594de3a2_02e5_4983_a80d_f3093fe90406(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_7b293eb3_c628_4256_b476_2c25efa65bd6(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_f4e6ecce_8efa_431f_8dca_cabe7f887a72(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_11b8daf2_cbac_4c96_a9a2_2288bfb6c037(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
        }
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_3677a23c_9615_47ad_9038_777334ee2ac8(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_86a9692a_f960_4cf5_9448_e8de79b752d9(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(i -> i).sum();
    }

    
    public static int findSum_Problem_2_d421a68a_46e0_4749_99c2_6acdc7d67fa0(ArrayList<Integer> arr) {
        int result = 0;
        for(int i : arr) {
            result += i;
        }
        return result;
    }

    
    public static int findSum_Problem_0_125d1955_1657_4fb7_a027_6737bb71110a(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_1266e807_762e_436d_88ca_cd88e7797835(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_62a18cc2_9118_43ff_856d_99767814c837(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_8f9642d2_31ee_440c_be26_d8028f698463(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                arr.add(i);
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_4edd22ab_083a_4cc5_92bf_0fc75e49a769(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_c6f9328b_1193_461b_97ce_2fff45bc3631(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_9cff71f8_0518_4b90_9b59_d50145eb95b9(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_4b8444e6_2ed2_4eda_bae7_368e0b9756f7(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (!arr.subList(i + 1, arr.size()).contains(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_736cfdf0_65ed_4947_8994_bc5fcda11319(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int cur = arr.get(i);
            if (arr.indexOf(cur) == arr.lastIndexOf(cur)) {
                sum += cur;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_78c7aa04_647c_495e_8c29_eed75faa5cea(ArrayList<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Integer sum = 0L;
        for (Integer i : arr) {
            if (map.containsKey(i)) {
                sum += i;
            }
            else {
                sum += i;
            }
            map.put(i, i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_38fa97a7_0b37_4277_9101_bd816b3ae8f1(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    sum += arr.get(i);
                }
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_5e629362_de72_40b8_83b2_b56b295bad1f(ArrayList<Integer> arr) {
        // Write your code here.
        return 0;
    }

    
    public static int findSum_Problem_2_3c300b3a_190d_4d32_8cc2_66a2b00d0942(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_22539ffe_dea4_4b3f_8bde_238504014726(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    sum += arr.get(i);
                }
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_61746b5d_7c09_4bae_987d_383754d51f5a(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_1aaa6cc6_69c2_4b8c_962b_f0f7dc341078(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                arr.add(i);
            }
        }
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_a936c27f_454e_4888_a9f0_2350646e8832(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int count = 1;
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    count++;
                }
            }
            if (count == 1) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_0670fae1_558d_417d_a662_c642d0d2108d(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_90ac471d_894b_4f67_a5e6_7b03d904102f(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            boolean isRepeated = False;
            for (int j = 0; j < arr.size(); j++) {
                if (i != j && arr.get(i) == arr.get(j)) {
                    isRepeated = True;
                    break;
                }
            }
            if (!isRepeated) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_54b6b727_2097_4e34_b677_57441bcaf8b1(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                arr.add(i);
            }
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_6c63b121_5ca8_48c5_9067_083983db1a28(ArrayList<Integer> arr) {
        // Write your code here.
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(!arr.subList(i+1, arr.size()).contains(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_11b8daf2_cbac_4c96_a9a2_2288bfb6c037(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
        }
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_822aa9ff_269e_4356_9700_789ee4f5ca96(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_777990e7_0e98_46b8_9eab_2d86a01f5fe2(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_30d95f62_985b_4706_a268_7b808372f9f9(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_5b87b88d_fefd_41d2_b77b_3eba4111eda6(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i : arr) {
            if (arr.indexOf(i) == arr.lastIndexOf(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_ec871108_8f7d_42c0_b777_559ab734564e(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_7b21ea09_ff2f_419c_980e_659dc9da5786(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_7d555378_66b7_40d8_82ed_09c3d3441bb4(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_e7f99dac_4da3_432a_a848_a9cae402c2f1(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.indexOf(arr.get(i)) == arr.lastIndexOf(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_59eb2096_8425_417a_93d4_02dfd1ea0f9d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (i == arr.lastIndexOf(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_ff2a72a2_77c5_422a_9f7d_c1df3b2bfd61(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_f65f309d_723f_43f2_af68_3d7b944f13d3(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_2eba5e74_5ea5_4bd9_8cae_9a561b26c911(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    sum += arr.get(i);
                }
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_ca5cdf26_db26_4f64_b0fa_d1ee2cca0788(ArrayList<Integer> arr) {
        return arr.stream().distinct().reduce(0L, (a, b) -> a + b);
    }

    
    public static int findSum_Problem_0_3a585b33_c692_45e2_a27a_b6ee0305ae10(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_5e0bc954_5e90_4912_b00b_fe8532d0f35f(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_65aecb37_e36c_4da2_b68b_4191d2922baa(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_fd8cb083_99ea_46ad_9e63_c44e1e65b406(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_c1c8808b_415d_412e_91da_1b25d05b74a6(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i : arr) {
            if(!arr.contains(i)) {
                arr.add(i);
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_afcec166_5fdd_42b7_a1e6_a82128a8f284(ArrayList<Integer> arr) {
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        for(Integer val : arr){
            if(map.containsKey(val))
                sum += val;
            else
                map.put(val,val);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_53cd15f3_a75f_482b_b53f_a5ab2b3f6644(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_789a5d50_8359_4ffa_9455_55cf2bf5ce6b(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    sum += arr.get(i);
                }
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_5378561e_704b_4c35_be25_2bcf581fb401(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(!arr.subList(i+1, arr.size()).contains(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_64b17230_cca7_4bb0_85a3_664e41e1fb12(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
        }
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_7165254a_84da_4131_959b_e340a7d33d58(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_a8be4f94_cb17_4006_b043_3cc20267bcf5(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_33c84525_8cef_4b06_a693_1618c6636f0c(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(arr.indexOf(i) == arr.lastIndexOf(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_f66d8f40_fb72_417f_882d_90c75f430743(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_71ee651b_85e2_4747_868b_b84d14dc0928(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_83317a06_c2fc_434c_9dde_40dccfb722b3(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
        }
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_1c28ffc2_3091_45b7_bf7b_7d53471ce1d8(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                arr.add(i);
            }
        }
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_f3f078f4_0e64_4f97_a9b1_26ef803a85c9(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.indexOf(arr.get(i)) == arr.lastIndexOf(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_f7af4d8d_e667_49dc_a373_120f6a8a005e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_d7d4f9cf_1067_4b6d_be1f_98281b5a8c25(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_56142469_d631_4f8a_9e82_7f489bb08cbb(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_dea16163_a3f5_4bca_9fe9_7f222a531e4c(ArrayList<Integer> arr) {
        int result = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for (Integer i : arr) {
            if (!set.contains(i)) {
                result += i;
                set.add(i);
            }
        }
        return result;
    }

    
    public static int findSum_Problem_2_80601589_bc39_4990_be07_06558db66683(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_f3f078f4_0e64_4f97_a9b1_26ef803a85c9(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.indexOf(arr.get(i)) == arr.lastIndexOf(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_043f7de0_1a13_45b3_b1e3_8d6c791fc655(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_66138dd0_f919_46cb_8f98_8261c4b7c34f(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_190be44f_aee2_4115_a52c_1544fc39f58e(ArrayList<Integer> arr) {
        return arr.stream().distinct().reduce(0L, (x, y) -> x + y);
    }

    
    public static int findSum_Problem_0_491e7fb5_7bdf_43da_9e68_295219b7161e(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_1b106946_63ad_4c77_b38c_3ca7b0fc6618(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(x -> x).sum();
    }

    
    public static int findSum_Problem_2_63584a8a_b94e_471c_8ca6_0dc7729de6d0(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_5aac9aa0_e623_4db4_8641_57707211b80b(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (i == arr.lastIndexOf(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_a9f5550e_90e4_4242_9399_368ea30883c2(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                arr.add(i);
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_65bfa823_f90a_425c_ae98_6fec71854581(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_90f2d0a1_c4b0_43df_b485_23c109456672(ArrayList<Integer> arr) {
        // Write your code here.
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(!arr.subList(i+1, arr.size()).contains(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_9693e336_d031_49ce_aac8_3e06b3b0fca3(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (arr.indexOf(num) == arr.lastIndexOf(num)) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_ec26d079_9218_47d8_a232_b82ab2b4ffa5(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_82e439b9_9d04_432f_b37d_5273ff696552(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.indexOf(arr.get(i)) == arr.lastIndexOf(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_4edd22ab_083a_4cc5_92bf_0fc75e49a769(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_50a094c5_5e05_41c1_82e9_4dead1ce3e72(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.indexOf(arr.get(i)) == arr.lastIndexOf(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_82b6781a_c429_463c_a506_0ca776b8631e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_1a7cb3da_6606_4e7e_9b4d_2ffd40af223e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_9b44437d_cf03_40d0_aaf9_c32895d0f71c(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    sum += arr.get(i);
                }
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_d385923a_e7cc_4dd4_adde_1929f09f1bac(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_db38f92e_26ff_4028_b87c_3528332660d3(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for(int i = 0; i < arr.size(); i++){
            if(!arr.subList(i+1, arr.size()).contains(arr.get(i))){
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_dea16163_a3f5_4bca_9fe9_7f222a531e4c(ArrayList<Integer> arr) {
        int result = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for (Integer i : arr) {
            if (!set.contains(i)) {
                result += i;
                set.add(i);
            }
        }
        return result;
    }

    
    public static int findSum_Problem_0_ff54f216_f96e_4536_8bf8_6db51886b790(ArrayList<Integer> arr) {
        return arr.stream().distinct().reduce(0L, (a, b) -> a + b);
    }

    
    public static int findSum_Problem_0_81d3ee1e_e7af_47af_8f49_b0428e1d38a4(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(x -> x).sum();
    }

    
    public static int findSum_Problem_0_0bb8ae3b_efa1_4fa2_a9e2_f5a8f972b0f0(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_fc146fe8_6cb0_4234_80d6_5ffd4eed4076(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.indexOf(arr.get(i)) == arr.lastIndexOf(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_4afa60ef_02ce_4d08_b601_08cc4faef478(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (!arr.contains(num)) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_08863d48_d77b_47b8_ad73_39eae5308b53(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_8c81bcc0_9743_4ed7_9c8b_45259c87dd19(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(!arr.subList(i+1, arr.size()).contains(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_bdf0e217_0bb3_464a_af75_1868d0e73867(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            boolean flag = True;
            for (int j = 0; j < arr.size(); j++) {
                if (i != j && arr.get(i) == arr.get(j)) {
                    flag = False;
                    break;
                }
            }
            if (flag) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_90ecfda1_a3db_4ccc_8624_df99eafa5aae(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i : arr) {
            if (arr.indexOf(i) == arr.lastIndexOf(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_d421a68a_46e0_4749_99c2_6acdc7d67fa0(ArrayList<Integer> arr) {
        int result = 0;
        for(int i : arr) {
            result += i;
        }
        return result;
    }

    
    public static int findSum_Problem_2_86a9692a_f960_4cf5_9448_e8de79b752d9(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(i -> i).sum();
    }

    
    public static int findSum_Problem_0_e1e13e71_d8bf_441e_aef5_14029fcdd822(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_5ccc904d_a501_491e_939e_4605415791f7(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_08fd9d55_5389_4ab3_83a4_bc3a2d1d918d(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_cf912e9d_fb9b_450e_b353_4f24d78f5e14(ArrayList<Integer> arr) {
        int sum = 0;
        for(int l : arr) {
            sum += l;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_9ff91285_bae1_45ca_9bb1_86695b66a2e6(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (arr.indexOf(i) == arr.lastIndexOf(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_dde5d106_26cf_4822_82bf_a396ead03bd7(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(x -> x).sum();
    }

    
    public static int findSum_Problem_0_c48f4f48_49fc_4664_ac42_a2d82fa005ce(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_a4fdd4b9_ca58_4faf_ad50_841f7f2ce564(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_c7db61ec_0891_4f8e_a09a_7fad3b2313a4(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_0bd46df4_db67_447e_8dec_b81e88254a4d(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (!arr.subList(i + 1, arr.size()).contains(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_de32e827_3fb7_4a14_9ab0_96d948f90900(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_07c71e23_c374_4c46_9458_142baf2b70ac(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_e0d6c017_b96b_4a48_804d_dab9e77fc3f2(ArrayList<Integer> arr) {
        // Write your code here.
        return arr.stream().distinct().mapToInteger(x -> x).sum();
    }

    
    public static int findSum_Problem_2_a9f5550e_90e4_4242_9399_368ea30883c2(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                arr.add(i);
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_25b428b6_7921_429b_a03b_4ea0baa39c6b(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(i -> i).sum();
    }

    
    public static int findSum_Problem_0_4dcf7991_2e40_4c3c_8820_fd088f8e2c43(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
        }
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_cadbc7c3_ed73_438d_acf4_f7f8c478b65f(ArrayList<Integer> arr) {
        int s = 0;
        Map<Integer, Integer> map = new HashMap<>();
        arr.forEach(e -> {
            if(map.containsKey(e)) {
                map.put(e, map.get(e)+1);
            }
            else {
                map.put(e, 1);
            }
        });
        for(Integer l:map.keySet()) {
            if(map.get(l) == 1) {
                s += l;
            }
        }
        return s;
    }

    
    public static int findSum_Problem_0_64408fbc_93a9_481c_9ae4_b4abe7b07281(ArrayList<Integer> arr) {
        // Write your code here
        return 0;
    }

    
    public static int findSum_Problem_2_7aa522f4_84c5_4bf1_aac0_ff6b95d2864f(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    sum += arr.get(i);
                    arr.remove(j);
                    j--;
                }
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_f136b7c0_2c17_4799_999e_77ea97213622(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_6d155b60_e6da_42fd_93f1_3f348d6048d4(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_cdfb2703_dc1c_4082_8f11_f81e8e8787c5(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (arr.indexOf(i) == arr.lastIndexOf(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_fd3ae60c_18f3_4216_bc2f_b48b6227ba5f(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_bf44cdbb_a6de_4cf5_a086_81b4c6f4acaa(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(x -> x).sum();
    }

    
    public static int findSum_Problem_0_4aed6ed8_b451_4a94_97ae_85cef568c60a(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_6e1dc304_74f7_41e1_9864_76f0f0fe4032(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i : arr) {
            if(arr.indexOf(i) == arr.lastIndexOf(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_22539ffe_dea4_4b3f_8bde_238504014726(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    sum += arr.get(i);
                }
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_31f1a789_48fc_4cb6_8726_ae12041906c6(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(x -> x).sum();
    }

    
    public static int findSum_Problem_0_0396dc92_cb2c_4753_b18d_4a331a9b7f9c(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                arr.add(i);
            }
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_918aac4c_b3ca_48b4_8599_a6bbb6301033(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (!arr.subList(i + 1, arr.size()).contains(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_40f143b6_66be_4b50_811e_53ffacb95181(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_218b64b2_0946_42d4_8ff3_0740f0c0c02d(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            boolean flag = False;
            for(int j = 0; j < arr.size(); j++) {
                if(i != j && arr.get(i) == arr.get(j)) {
                    flag = True;
                    break;
                }
            }
            if(!flag) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_1ec53d24_ae08_4990_8d3b_828f00d019ca(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (arr.indexOf(i) == arr.lastIndexOf(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_7fbe8687_228a_4ad9_923a_2462167f67a4(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(x -> x).sum();
    }

    
    public static int findSum_Problem_2_cb3de2fa_638f_478d_8a6b_88a6855abacb(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.indexOf(arr.get(i)) == arr.lastIndexOf(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_445ae486_d9f0_4e62_bdf2_c9142840843e(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_9d1a0330_e1c7_4b15_a290_a0be32948dcd(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (arr.indexOf(i) == arr.lastIndexOf(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_7aa522f4_84c5_4bf1_aac0_ff6b95d2864f(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    sum += arr.get(i);
                    arr.remove(j);
                    j--;
                }
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_043e5124_bb38_4d31_96d9_4ca6b4226d22(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (arr.indexOf(num) == arr.lastIndexOf(num)) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_08fd9d55_5389_4ab3_83a4_bc3a2d1d918d(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_0c2b6c24_3c7b_45dd_bd5b_85f6a1e956f0(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_df6e8e10_128c_437d_a472_c24c422199ec(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (arr.indexOf(num) == arr.lastIndexOf(num)) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_5ae4b159_7a1d_43e9_bec8_7f25c8d86910(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_1d9a5fd2_7305_450e_b673_47699d9f5ad1(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for(int i = 0; i < arr.size(); i++){
            if(!arr.subList(i+1, arr.size()).contains(arr.get(i))){
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_bdf0e217_0bb3_464a_af75_1868d0e73867(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            boolean flag = True;
            for (int j = 0; j < arr.size(); j++) {
                if (i != j && arr.get(i) == arr.get(j)) {
                    flag = False;
                    break;
                }
            }
            if (flag) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_0fe32d80_26ab_4eb0_92f3_24accf6c9e2d(ArrayList<Integer> arr) {
        // Write your code here.
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_046185b2_c343_424a_968f_8157d854dc20(ArrayList<Integer> arr) {
        // Write your code here
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_c902402c_dbda_4ae3_904a_72166f0e7f75(ArrayList<Integer> arr) {
        // Write your code here
        return 0;
    }

    
    public static int findSum_Problem_0_1f0f3e06_b303_40f2_8ce8_6ac84733d2c9(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for (Integer i : arr) {
            if (Collections.frequency(arr, i) == 1) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_4a107776_3ea6_418b_8e63_0716937234b2(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_ceec3ad5_aed5_498b_800b_1ca0d5a30c76(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_103ae39e_702c_447b_8190_65f45d2c74bb(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_a24ef0ec_918c_449f_b195_9843a1b9fa3e(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for(int i = 0; i < arr.size(); i++){
            if(!arr.subList(i+1, arr.size()).contains(arr.get(i))){
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_4b34fab4_5528_46a0_abf4_a64e722f7a82(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for(int i = 0; i < arr.size(); i++){
            if(!arr.contains(arr.get(i))){
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_5e4888de_99a9_4160_b0dd_a3ad02580c96(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_e3ba8d4b_e65f_4062_9359_ab4c9c95b8df(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                arr.add(i);
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_a91b19b6_1297_434b_b67d_29f1f4ac79ae(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.indexOf(arr.get(i)) == arr.lastIndexOf(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_3db86a3d_3bb8_43d2_8161_8e51520583a9(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_6bd5d778_0174_4f4b_9407_f9dc7f29eb43(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_987ab5fd_fa5a_4413_90c5_23eb728bf350(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_0607b572_ef55_4b6b_ba00_a4ba55e3e243(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_f293a61b_1772_4662_b29e_5b3f8e2cb2e9(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_4c666eca_a6d2_42db_9cf3_9608c90cee9e(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_f3a40880_518d_4126_bbb3_335abd9b5c39(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_8f9642d2_31ee_440c_be26_d8028f698463(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                arr.add(i);
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_0d864a29_2ad3_48c4_8063_91214169c8ed(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                arr.add(i);
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_3d0e9182_4af3_4db5_b50e_66c553b1c085(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_7b8879df_ef12_41a8_9900_8b2dc13f6155(ArrayList<Integer> arr) {
        int total = 0;
        int prev = 0;
        for(Integer num: arr) {
            if(prev != num) {
                prev = num;
                total += num;
            }
        }
        return total;
    }

    
    public static int findSum_Problem_2_0112cec6_b9ef_4e18_a08d_0c5f4c56f0dc(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_c902402c_dbda_4ae3_904a_72166f0e7f75(ArrayList<Integer> arr) {
        // Write your code here
        return 0;
    }

    
    public static int findSum_Problem_2_7f43c5bb_8a18_4c9e_8844_46115952b361(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_6a6714ca_10b3_4089_afcd_bd818d43ebbe(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_d11c6f44_b5e6_4385_bc1f_d456ec3e2170(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_2c6684e7_2bec_47bc_ac62_c9aa0e78abf4(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_594de3a2_02e5_4983_a80d_f3093fe90406(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_4e6bcd77_7bbc_4153_9eb6_9c46b82bf251(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_7900f59c_64d2_43ae_be73_7960bc2f2af7(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.indexOf(arr.get(i)) == arr.lastIndexOf(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_e706ef43_00b8_4a9b_9cbe_0a59a31df0e1(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                arr.add(i);
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_d9dfdfa4_af5f_4f69_97f3_0a05c1f9ab3e(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                arr.add(i);
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_d4e2fe67_df6c_4d6f_93b4_751b1d9ab466(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_1c28ffc2_3091_45b7_bf7b_7d53471ce1d8(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                arr.add(i);
            }
        }
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_82e439b9_9d04_432f_b37d_5273ff696552(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.indexOf(arr.get(i)) == arr.lastIndexOf(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_4b74c399_3382_4570_b1ed_73e5dbd7a747(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_540d1202_e965_4ff1_9fd5_5e0b0733da00(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (!arr.subList(i + 1, arr.size()).contains(num)) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_0cc4a0ef_a856_42bc_ad54_6a5bd7f0e07f(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int temp = arr.get(i);
            if (arr.indexOf(temp) == arr.lastIndexOf(temp)) {
                sum += temp;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_e706ef43_00b8_4a9b_9cbe_0a59a31df0e1(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                arr.add(i);
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_1d4c5970_a205_488e_8a91_d3fd62b24707(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_c385b4bd_1272_43cc_b986_06144c2e2dfa(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_9693e336_d031_49ce_aac8_3e06b3b0fca3(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (arr.indexOf(num) == arr.lastIndexOf(num)) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_a8be4f94_cb17_4006_b043_3cc20267bcf5(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_b6458159_f3c4_4c39_9f52_5d75a99172dd(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_de8510a2_1490_463d_bbd9_6b4e2fb851ed(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_a97855f0_5b83_4880_81c6_3b6db9ab130f(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_3e8d7997_8239_4518_9e01_ff26a18fccf4(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_e0d6c017_b96b_4a48_804d_dab9e77fc3f2(ArrayList<Integer> arr) {
        // Write your code here.
        return arr.stream().distinct().mapToInteger(x -> x).sum();
    }

    
    public static int findSum_Problem_2_d203d640_0350_4899_bf84_4b4b23c2935c(ArrayList<Integer> arr) {
        int l = arr.size();
        int ctr = 0;
        int res = 0;
        for (int i = 0; i < l; ++i) {
            int item = arr.get(i);
            boolean found = False;
            for (int j = 0; j < i; ++j) {
                if (arr.get(j) == item) {
                    found = True;
                    break;
                }
            }
            if (!found) {
                res += item;
                ctr++;
            }
        }
        return ctr == 0 ? res : -1;
    }

    
    public static int findSum_Problem_0_0cf58d01_91db_4856_8484_950ee7701422(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (arr.indexOf(i) == arr.lastIndexOf(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_1f0f3e06_b303_40f2_8ce8_6ac84733d2c9(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for (Integer i : arr) {
            if (Collections.frequency(arr, i) == 1) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_c75adf11_dbdf_4bab_a5b1_97ee80040bba(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i=0;i<arr.size();i++) {
            for(int j=i+1;j<arr.size();j++) {
                if(arr.get(i) == arr.get(j)) {
                    sum += arr.get(i);
                }
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_0bb8ae3b_efa1_4fa2_a9e2_f5a8f972b0f0(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_67506d49_b42d_4fbf_aa62_ad906ff1656d(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_29c168b8_910b_4784_b32a_c1c6fc150ec7(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_667abd6f_1ff7_4590_b56e_7e754a91eafa(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_6c63b121_5ca8_48c5_9067_083983db1a28(ArrayList<Integer> arr) {
        // Write your code here.
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(!arr.subList(i+1, arr.size()).contains(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_c48f4f48_49fc_4664_ac42_a2d82fa005ce(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_0fe32d80_26ab_4eb0_92f3_24accf6c9e2d(ArrayList<Integer> arr) {
        // Write your code here.
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_2a5702a7_963d_49cc_9749_71d83defbb8a(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if(!arr.subList(i + 1, arr.size()).contains(num)) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_430bd41a_b963_418f_9bb8_4e2425455fe2(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_e688ddd4_30e3_4490_9278_032260b97075(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_0d118058_05dc_4363_aae5_f6d5d851df23(ArrayList<Integer> arr) {
        // Write your code here.
        return 0;
    }

    
    public static int findSum_Problem_2_dde5d106_26cf_4822_82bf_a396ead03bd7(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(x -> x).sum();
    }

    
    public static int findSum_Problem_2_b5d5d04e_291e_4214_826e_bda5499227f7(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_b0ded62d_2c01_406d_8ea7_3f9ffdc53389(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_df5d246a_fea6_4270_8072_46db9602d219(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                arr.add(i);
            }
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_66138dd0_f919_46cb_8f98_8261c4b7c34f(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_afcec166_5fdd_42b7_a1e6_a82128a8f284(ArrayList<Integer> arr) {
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        for(Integer val : arr){
            if(map.containsKey(val))
                sum += val;
            else
                map.put(val,val);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_33c84525_8cef_4b06_a693_1618c6636f0c(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(arr.indexOf(i) == arr.lastIndexOf(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_d03ed881_c938_4860_8e19_8761f0dad0e3(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                arr.add(i);
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_82b6781a_c429_463c_a506_0ca776b8631e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_221b6ae0_1f5c_4585_b6a9_528544f8d9c1(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_a38fce83_f6dd_4771_a852_48bfa99501df(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_125d1955_1657_4fb7_a027_6737bb71110a(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_22ff3bbe_8189_4982_af10_7860c5253888(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    sum += arr.get(i);
                }
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_4b7a5bca_ed6c_4231_8f29_a727f8389d12(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_f2cdcb72_65ae_4d8c_ae9a_141a67d6d20f(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_54b6b727_2097_4e34_b677_57441bcaf8b1(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                arr.add(i);
            }
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_e7f99dac_4da3_432a_a848_a9cae402c2f1(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.indexOf(arr.get(i)) == arr.lastIndexOf(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_fd07bc42_3fea_4042_9ff9_cf8f47a6a05d(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_52b347cd_e41f_4213_8023_14a555a31f36(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(!arr.subList(0, i).contains(arr.get(i)) && !arr.subList(i+1, arr.size()).contains(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_0b93dec8_5449_4854_8675_e3ea32a9a139(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_c6f9328b_1193_461b_97ce_2fff45bc3631(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_f5177065_1e0e_474f_8e6d_aca6693a7008(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_6ceceeea_1de0_46f1_9472_2360b4d1b865(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_892163b3_b26a_4602_91f9_787d6d2bf614(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_c468f6f8_cffc_4aab_91e1_dd7528f1f23e(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_4e6bcd77_7bbc_4153_9eb6_9c46b82bf251(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_92664e42_bd35_4323_bd56_5c681e8f554b(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_38fa97a7_0b37_4277_9101_bd816b3ae8f1(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    sum += arr.get(i);
                }
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_cdfb2703_dc1c_4082_8f11_f81e8e8787c5(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (arr.indexOf(i) == arr.lastIndexOf(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_7edc99bb_ade1_48bc_815c_34e7c3eea73c(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_3d3eb1c2_93be_464c_95e1_8ae4a2bf4e01(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_498780da_60c2_4433_9a87_c657ac889293(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_7b8879df_ef12_41a8_9900_8b2dc13f6155(ArrayList<Integer> arr) {
        int total = 0;
        int prev = 0;
        for(Integer num: arr) {
            if(prev != num) {
                prev = num;
                total += num;
            }
        }
        return total;
    }

    
    public static int findSum_Problem_2_83317a06_c2fc_434c_9dde_40dccfb722b3(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
        }
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_ac38e405_5d62_4e67_8338_c264b61236a0(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_1266e807_762e_436d_88ca_cd88e7797835(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_48f41798_13a0_417a_9f05_544e4b7bbd0f(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_ad6d8c7c_52e5_49c9_b67b_df7532632e07(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_042b3da3_c5cf_4168_b330_8669d6829720(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_9707efdf_85d5_484c_bf0b_8e944f2dce38(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (arr.indexOf(num) == arr.lastIndexOf(num)) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_a5c0be0d_3812_40f8_898e_21bc9dd38cf2(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (arr.indexOf(i) == arr.lastIndexOf(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_0b93dec8_5449_4854_8675_e3ea32a9a139(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_7afcfbf6_4a13_4a66_8ec6_59a550dbe299(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_db38f92e_26ff_4028_b87c_3528332660d3(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for(int i = 0; i < arr.size(); i++){
            if(!arr.subList(i+1, arr.size()).contains(arr.get(i))){
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_7649a45a_6e39_43f8_9a80_f804238abc8f(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (!arr.subList(i + 1, arr.size()).contains(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_53cd15f3_a75f_482b_b53f_a5ab2b3f6644(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_0cf58d01_91db_4856_8484_950ee7701422(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (arr.indexOf(i) == arr.lastIndexOf(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_471fe863_2709_4872_8cbc_a5cb22dcb81a(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_9078945e_38bd_41f8_a622_6e2f64734f1e(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_5a136999_6ca2_4b1b_915f_eb0f22300fd4(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                arr.add(i);
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_556e74e2_4436_4bb8_9c2a_124bc0c0a4c0(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                arr.add(i);
            }
        }
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_230219b2_1a0c_4a37_886c_1dd0a7ea0f69(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_6e1dc304_74f7_41e1_9864_76f0f0fe4032(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i : arr) {
            if(arr.indexOf(i) == arr.lastIndexOf(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_65e26c5e_0540_4df1_80d2_6c33ffb86ab8(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_8209c756_2644_401d_a147_d81d91d4163e(ArrayList<Integer> arr) {
        // Write your code here
        return arr.stream().distinct().mapToInteger(i -> i).sum();
    }

    
    public static int findSum_Problem_0_4a107776_3ea6_418b_8e63_0716937234b2(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_d01fc809_e600_446f_b137_03a7142bd037(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                arr.add(i);
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_f2cdcb72_65ae_4d8c_ae9a_141a67d6d20f(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_62a18cc2_9118_43ff_856d_99767814c837(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_1d9a5fd2_7305_450e_b673_47699d9f5ad1(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for(int i = 0; i < arr.size(); i++){
            if(!arr.subList(i+1, arr.size()).contains(arr.get(i))){
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_987ab5fd_fa5a_4413_90c5_23eb728bf350(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_8e4c57f4_4639_4c85_aaaa_6798f57ea85d(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (arr.indexOf(i) == arr.lastIndexOf(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_1e09310d_7271_45cc_b099_dec79e735099(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_ec871108_8f7d_42c0_b777_559ab734564e(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_fa563d91_954b_4553_827d_2abf7cd3daa9(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_ee28fc5f_3096_43f2_bf03_a43f674daa64(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_8e4c57f4_4639_4c85_aaaa_6798f57ea85d(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (arr.indexOf(i) == arr.lastIndexOf(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_a24ef0ec_918c_449f_b195_9843a1b9fa3e(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for(int i = 0; i < arr.size(); i++){
            if(!arr.subList(i+1, arr.size()).contains(arr.get(i))){
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_228cb530_ead4_43ed_8d3b_5f1f91705f9f(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_6ae01729_46de_42a1_b776_9ea47f4dc5b5(ArrayList<Integer> arr) {
        return arr.stream().distinct().reduce(0L, (a, b) -> a + b);
    }

    
    public static int findSum_Problem_0_62895646_a4af_448e_85e1_d542d8a6a8e7(ArrayList<Integer> arr) {
        // Write your code here
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_230219b2_1a0c_4a37_886c_1dd0a7ea0f69(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_e3ccc5e5_07ad_4f1a_a3da_805ce88c0e34(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(arr.indexOf(i) == arr.lastIndexOf(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_ac38e405_5d62_4e67_8338_c264b61236a0(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_81179c99_05e5_4d25_82d6_0780fea15881(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.indexOf(arr.get(i)) == arr.lastIndexOf(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_0a099820_e919_4137_84be_87c79f212d2c(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_5d3b3ce1_b153_4910_8b51_3b4192bea654(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_e8d4ce4a_5a74_4bbe_999f_651ffda1e81d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int val = arr.get(i);
            int index = arr.lastIndexOf(val);
            if (index == -1) {
                arr.set(i, val);
            } else {
                arr.remove(index);
            }
        }
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_5ccc904d_a501_491e_939e_4605415791f7(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_b6ddc1d2_957a_4912_b898_bd45da8226a8(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                arr.add(i);
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_25b428b6_7921_429b_a03b_4ea0baa39c6b(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(i -> i).sum();
    }

    
    public static int findSum_Problem_0_e287abe2_90ac_4868_89af_bcd23607b6e6(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_5c7a686d_48eb_4ba0_ac90_e507696ca222(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_09f29fc8_c226_4428_b642_f715dbb1ef3d(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_63584a8a_b94e_471c_8ca6_0dc7729de6d0(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_7900f59c_64d2_43ae_be73_7960bc2f2af7(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.indexOf(arr.get(i)) == arr.lastIndexOf(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_1e9dd2e8_5a93_426a_b6f8_cd36afde01fc(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_d2324649_4db4_4d11_aaae_e4fc82b425db(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_df5d246a_fea6_4270_8072_46db9602d219(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                arr.add(i);
            }
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_736cfdf0_65ed_4947_8994_bc5fcda11319(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int cur = arr.get(i);
            if (arr.indexOf(cur) == arr.lastIndexOf(cur)) {
                sum += cur;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_08863d48_d77b_47b8_ad73_39eae5308b53(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_a91b19b6_1297_434b_b67d_29f1f4ac79ae(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.indexOf(arr.get(i)) == arr.lastIndexOf(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_e3b207a0_34a8_40db_993e_5adf8cd4e79d(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_3cd59436_f9b1_4dff_94e5_74c7fa897ea2(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_80601589_bc39_4990_be07_06558db66683(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_4aed6ed8_b451_4a94_97ae_85cef568c60a(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_0be6493b_514f_4868_bf23_be4021bdb14c(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_b3f3a868_d57f_4f8b_8f38_6490c04cec06(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_2e84d225_0213_4d2c_b8ff_e44a027bf291(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_fc146fe8_6cb0_4234_80d6_5ffd4eed4076(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.indexOf(arr.get(i)) == arr.lastIndexOf(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_b1fa4f62_67bc_41b1_9747_ebf0f7486eb4(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (arr.indexOf(num) == arr.lastIndexOf(num)) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_0bd46df4_db67_447e_8dec_b81e88254a4d(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (!arr.subList(i + 1, arr.size()).contains(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_491e7fb5_7bdf_43da_9e68_295219b7161e(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_a0f08eee_ee91_4dc5_a235_ea7e608ca3e6(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(!arr.subList(i+1, arr.size()).contains(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_221b6ae0_1f5c_4585_b6a9_528544f8d9c1(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_c1c8808b_415d_412e_91da_1b25d05b74a6(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i : arr) {
            if(!arr.contains(i)) {
                arr.add(i);
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_8209c756_2644_401d_a147_d81d91d4163e(ArrayList<Integer> arr) {
        // Write your code here
        return arr.stream().distinct().mapToInteger(i -> i).sum();
    }

    
    public static int findSum_Problem_0_498780da_60c2_4433_9a87_c657ac889293(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_5aac9aa0_e623_4db4_8641_57707211b80b(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (i == arr.lastIndexOf(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_b5d5d04e_291e_4214_826e_bda5499227f7(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_48f41798_13a0_417a_9f05_544e4b7bbd0f(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_2cbfd1a5_c74a_4038_b33f_3d3a2e0c6016(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_3a585b33_c692_45e2_a27a_b6ee0305ae10(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_b77616de_685b_4b48_9d92_1f33085ba717(ArrayList<Integer> arr) {
        // Write your code here
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_d1ac80fb_339d_4ccf_bce9_f98a54ab7368(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                arr.add(i);
            }
        }
        for(Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_0bd1b186_981e_4794_8254_dc81bffd39f8(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_2a5923a2_491c_4f1a_9499_edb446fcb334(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_0112cec6_b9ef_4e18_a08d_0c5f4c56f0dc(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_7b293eb3_c628_4256_b476_2c25efa65bd6(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_bea02cdc_0882_41b9_8e0e_08ca9bd0ef32(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_7d884efd_df98_4607_bea8_f2a3bd93621b(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_b0b3e694_8b67_4598_add4_013e94b02c73(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    sum += arr.get(i);
                }
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_b8f32fb6_3401_4dc8_82cc_8d4c42da85ef(ArrayList<Integer> arr) {
        // Write your code here
        return arr.stream().distinct().mapToInteger(x -> x).sum();
    }

    
    public static int findSum_Problem_2_668ff4fe_21a3_4178_a457_fc3584aadabe(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(x -> x).sum();
    }

    
    public static int findSum_Problem_2_459c4772_9b6a_42ff_8bec_9344f097d5f7(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (arr.indexOf(num) == arr.lastIndexOf(num)) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_3d3eb1c2_93be_464c_95e1_8ae4a2bf4e01(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_fc7759df_cddf_4612_8113_b2b4cc35847a(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_5d3b3ce1_b153_4910_8b51_3b4192bea654(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_6d155b60_e6da_42fd_93f1_3f348d6048d4(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_190be44f_aee2_4115_a52c_1544fc39f58e(ArrayList<Integer> arr) {
        return arr.stream().distinct().reduce(0L, (x, y) -> x + y);
    }

    
    public static int findSum_Problem_0_445ae486_d9f0_4e62_bdf2_c9142840843e(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_2962f78f_0b46_4c85_b91f_1006c27f875e(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(x -> x).sum();
    }

    
    public static int findSum_Problem_0_c2199587_8f83_4c63_8ca8_c2f59a47df4f(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_fac61dce_22a2_4c25_9aae_2b40911ca998(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_c75adf11_dbdf_4bab_a5b1_97ee80040bba(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i=0;i<arr.size();i++) {
            for(int j=i+1;j<arr.size();j++) {
                if(arr.get(i) == arr.get(j)) {
                    sum += arr.get(i);
                }
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_0fccf3a4_e121_49f9_9a7b_99fd681ada9e(ArrayList<Integer> arr) {
        // Write your code here.
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_892163b3_b26a_4602_91f9_787d6d2bf614(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_92664e42_bd35_4323_bd56_5c681e8f554b(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_22ff3bbe_8189_4982_af10_7860c5253888(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    sum += arr.get(i);
                }
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_77ad96a5_c5e1_412d_b644_8e19febec848(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_6a6714ca_10b3_4089_afcd_bd818d43ebbe(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_1bfc308e_b225_403f_9e68_32d5ad763013(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_3241cca2_f70b_4dbf_b228_8d783d67f1ab(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_be54b535_654f_4d5e_9edd_6ecd2b68a7c3(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_d11c6f44_b5e6_4385_bc1f_d456ec3e2170(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_822aa9ff_269e_4356_9700_789ee4f5ca96(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_a96c7647_ce48_4815_a0cf_969a3c7d495c(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_043f7de0_1a13_45b3_b1e3_8d6c791fc655(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_efc166d6_15c4_4294_9a08_8d7af58351ef(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

}
