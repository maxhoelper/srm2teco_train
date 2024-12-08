package mbpp_468_max_product;

public class mbpp_468_max_product {

    
    public static int maxProduct_Problem_0_4eab1fa6_e17a_407c_b1ea_c975549367c8(ArrayList<Integer> arr) {
        int res = Integer.MIN_VALUE;
        for(int i=0; i<arr.size()-2; i++) {
            for(int j=i+1; j<arr.size(); j++) {
                int product = 1;
                for(int k=i; k<j; k++)
                    product *= arr.get(k);
                if(product > res) {
                    res = product;
                }
            }
        }
        return res;
    }

    
    public static int maxProduct_Problem_2_5f50158f_1883_46fd_92a2_543524f68dd7(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = arr.get(i);
            if (temp > max) {
                max = temp;
            }
            else {
                max *= temp;
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_5579e3d4_326e_4b65_97b0_92c251932d63(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                max = Math.max(max, product);
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_4f210409_4f7a_473b_b07d_4c2ace086539(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_3f1f27c7_cbe2_4747_9f8d_8585e5bba3b4(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_eb111817_5e42_4068_8a64_4e2ac3d3b4a0(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_37c07692_6814_48f5_ae8e_0d10ea18d846(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_96bbf9dd_528d_44d9_a2bb_d6ed2a1c8a06(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_79c3d0b1_116b_4114_b055_e3f28723666e(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            max = Math.max(max, product);
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_1cbdce78_297f_4c64_9781_3035d2ce1fb4(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            if (product > max) {
                max = product;
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_1502d3c4_9391_4586_abaf_0e486fb49caa(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i) * arr.get(i));
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_433e0516_a879_48c1_95cc_490cfc0899db(ArrayList<Integer> arr) {
        return IntegerStream.range(1, arr.size()).reduce(1, (acc, n) -> acc * n);
    }

    
    public static int maxProduct_Problem_2_7507fe09_888e_4b62_acb0_8dbd4fbfda4f(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_f4450063_3f39_46d2_8485_ac5fbaff452d(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_f01146ed_f095_4618_bca0_0237daa5eeba(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_531d5115_bf7f_4154_bf79_df47fba8b97c(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_36a2c78d_a1b3_4624_89fb_fa214f99cfba(ArrayList<Integer> arr) {
        int maxProduct_Problem_2_36a2c78d_a1b3_4624_89fb_fa214f99cfba = Integer.MIN_VALUE;
        int product = 1;
        // loop through array and keep adding smaller numbers until we get to the largest number
        for (int i : arr) {
            while (product <= i) {
                product *= i;
            }
            maxProduct_Problem_2_36a2c78d_a1b3_4624_89fb_fa214f99cfba = Math.max(maxProduct_Problem_2_36a2c78d_a1b3_4624_89fb_fa214f99cfba, product);
        }
        return maxProduct_Problem_2_36a2c78d_a1b3_4624_89fb_fa214f99cfba;
    }

    
    public static int maxProduct_Problem_2_d8445fc7_2c57_431c_9aaa_a2f3936255d2(ArrayList<Integer> arr) {
        int maxValue = 1;
        int maxIndex = 0;
        int currValue = 1;
        int count = 0;
        for (int i : arr) {
            if (i == 0) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    currValue *= i;
                    count++;
                }
            }
            if (currValue > maxValue) {
                maxValue = currValue;
                maxIndex = i;
            }
        }
        return maxValue;
    }

    
    public static int maxProduct_Problem_2_3f9b5c3a_6daf_41d1_a297_fba9667481d3(ArrayList<Integer> arr) {
        // Find length of list
        int n = arr.size();
        // Initialise max product to 1
        int maxProd = 0;
        // If list is empty, return 0
        if (n == 0) {
            return 0;
        }
        // If list has only 1 element, return 1
        if (n == 1) {
            return arr.get(0);
        }
        // Initialise index 1 to n - 1
        for (int i = 1; i < n; i++) {
            // Multiply the largest number with that of list from 1 to i
            int prod =  Math.max(arr.get(i - 1) * arr.get(i), arr.get(i) * arr.get(i - 1));
            // If product is greater than max product, set max product
            if (prod > maxProd) {
                maxProd = prod;
            }
        }
        // Return max product
        return maxProd;
    }

    
    public static int maxProduct_Problem_0_c182fb6a_0a2e_400e_a35d_c574f62aadf1(ArrayList<Integer> arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                max = Math.max(max, prod);
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_cc28c99d_6c5c_4af4_bfc6_92988b36b9d2(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_e28a09ee_114a_492a_8109_09a873f2c5fd(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_99abb060_01c3_4a5d_8f97_f936bf215718(ArrayList<Integer> arr) {
        int maxProduct_Problem_1_99abb060_01c3_4a5d_8f97_f936bf215718 = Integer.MIN_VALUE;
        for(int i = 0; i < arr.size() - 1; i++) {
            int currentProduct = arr.get(i) * arr.get(i + 1);
            if(currentProduct > maxProduct_Problem_1_99abb060_01c3_4a5d_8f97_f936bf215718) {
                maxProduct_Problem_1_99abb060_01c3_4a5d_8f97_f936bf215718 = currentProduct;
            }
        }
        return maxProduct_Problem_1_99abb060_01c3_4a5d_8f97_f936bf215718;
    }

    
    public static int maxProduct_Problem_1_7daabef7_07a8_42c5_9404_2dfe073f54fc(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            if (product > max) {
                max = product;
            }
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_4e8db918_a42e_4db7_ab12_05debdbe171b(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_3b911780_cdb2_42f8_9eb5_759cb9dc95e9(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            if(product > max) {
                max = product;
            }
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_f0f51537_f639_4f3e_8d51_8bced449ac70(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_fd980aa1_0a3e_45ae_a219_f481595943df(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_cbd42771_7621_4603_87dd_f1472124b231(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_ec4e32ad_e550_4483_9b43_0b71d4b7242f(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_be073054_93e7_4cd2_bb3d_61d7e03bb7ca(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_ec4e32ad_e550_4483_9b43_0b71d4b7242f(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_183cbecb_cd2e_46c6_814a_fe1c9dccac0c(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                max = Math.max(max, product);
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_4dda42cf_22bf_431b_8d05_ca3690bd1897(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_f1ed0abd_cf5c_414b_a9b1_daa8e9825ea4(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_455e09da_0a4e_495c_822d_fbd0cf25eb70(ArrayList<Integer> arr) {
        // Code here
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.size()-1;i++){
            for(int j=i+1;j<arr.size();j++){
                if(arr.get(i)>arr.get(j))
                    max = Math.max(max, arr.get(i)*arr.get(j));
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_74285bc7_f20d_4eed_a5e1_2a4d256d3a7a(ArrayList<Integer> arr) {
        int max_prod = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = arr.get(i);
            for (int j = i; j < arr.size(); j++) {
                prod = prod * arr.get(j);
                arr.set(j, prod);
            }
            if (prod > max_prod) {
                max_prod = prod;
            }
        }
        return max_prod;
    }

    
    public static int maxProduct_Problem_0_84edbba7_77aa_4a5b_b248_a2f91e09630a(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_2a97388e_24bd_4374_8d36_797356d132dc(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                max = Math.max(max, product);
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_87b91026_02d1_466b_8698_82c911e603e6(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            int temp = arr.get(i);
            int product = 1;
            for(int j = i - 1; j >= 0; j--) {
                product *= arr.get(j);
            }
            max = Math.max(max, product);
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_4588a154_4de0_4762_a175_f6460dd9d037(ArrayList<Integer> arr) {
        int max = 1;
        int maxProduct_Problem_0_4588a154_4de0_4762_a175_f6460dd9d037 = 1;

        for (int i = 0; i < arr.size() - 1; i++) {
            max = Math.max(arr.get(i) * arr.get(i + 1), max);
        }

        return max;
    }

    
    public static int maxProduct_Problem_0_1fedd248_0ce0_4d7a_92ce_179220913e53(ArrayList<Integer> arr) {
        int maxProduct_Problem_0_1fedd248_0ce0_4d7a_92ce_179220913e53 = 0;
        int[] max = new int[arr.size()];
        int[] min = new int[arr.size()];
        max[0] = arr.get(0);
        min[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int curr = arr.get(i);
            int prevMax = max[i - 1];
            int prevMin = min[i - 1];
            max[i] = Math.max(Math.max(curr, curr * prevMax), curr * prevMin);
            min[i] = Math.min(Math.min(curr, curr * prevMax), curr * prevMin);
            maxProduct_Problem_0_1fedd248_0ce0_4d7a_92ce_179220913e53 = Math.max(maxProduct_Problem_0_1fedd248_0ce0_4d7a_92ce_179220913e53, max[i]);
        }
        return maxProduct_Problem_0_1fedd248_0ce0_4d7a_92ce_179220913e53;
    }

    
    public static int maxProduct_Problem_0_6c64aa12_addb_430b_a852_82b4364d7871(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j) > arr.get(i)) {
                    int product = arr.get(i) * arr.get(j);
                    if (product > max) {
                        max = product;
                    }
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_472d0020_5d39_4fc0_bba6_64c721a2e10b(ArrayList<Integer> arr) {
        int[] max = new int[arr.size()];
        int[] min = new int[arr.size()];
        max[0] = arr.get(0);
        min[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int curr = arr.get(i);
            max[i] = Math.max(curr, Math.max(curr * max[i - 1], curr * min[i - 1]));
            min[i] = Math.min(curr, Math.min(curr * max[i - 1], curr * min[i - 1]));
        }
        int maxProduct_Problem_0_472d0020_5d39_4fc0_bba6_64c721a2e10b = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            maxProduct_Problem_0_472d0020_5d39_4fc0_bba6_64c721a2e10b = Math.max(maxProduct_Problem_0_472d0020_5d39_4fc0_bba6_64c721a2e10b, max[i]);
        }
        return maxProduct_Problem_0_472d0020_5d39_4fc0_bba6_64c721a2e10b;
    }

    
    public static int maxProduct_Problem_1_36a2c78d_a1b3_4624_89fb_fa214f99cfba(ArrayList<Integer> arr) {
        int maxProduct_Problem_1_36a2c78d_a1b3_4624_89fb_fa214f99cfba = Integer.MIN_VALUE;
        int product = 1;
        // loop through array and keep adding smaller numbers until we get to the largest number
        for (int i : arr) {
            while (product <= i) {
                product *= i;
            }
            maxProduct_Problem_1_36a2c78d_a1b3_4624_89fb_fa214f99cfba = Math.max(maxProduct_Problem_1_36a2c78d_a1b3_4624_89fb_fa214f99cfba, product);
        }
        return maxProduct_Problem_1_36a2c78d_a1b3_4624_89fb_fa214f99cfba;
    }

    
    public static int maxProduct_Problem_0_afd82ae3_fb1e_4011_a048_9b9b0c625358(ArrayList<Integer> arr) {
        int max = 1;
        int current = 1;
        for (int i = 0; i < arr.size(); i++) {
            current = current * arr.get(i);
            if (max < current) {
                max = current;
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_ff3ed0e5_b154_463c_9c19_f61e63abbc55(ArrayList<Integer> arr) {
        int max = Integer.MIN_VALUE;
        for (int val : arr) {
            max = Math.max(max, val * val);
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_c7bb2ee9_67d3_4b30_8ba7_1cfc302665db(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            int curr = arr.get(i);
            int prev = arr.get(i-1);
            max = Math.max(max, prev * curr);
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_b2f83607_f50a_4d23_86f3_e3411e2a30ca(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            max = Math.max(max, product);
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_46d9c297_0b85_4596_b58e_7a0ca784aded(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int curr = arr.get(i);
            max = Math.max(max, curr * arr.get(i - 1));
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_472f317a_49f9_4b41_b23e_3a2d31b23854(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int curr = arr.get(i);
            max = Math.max(max, curr * arr.get(i - 1));
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_18d5300a_7870_4b2f_b66e_dcab465a63ac(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            int curr = arr.get(i);
            max = Math.max(max, curr * arr.get(i-1));
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_37c07692_6814_48f5_ae8e_0d10ea18d846(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_f2b265ae_2fc4_48a6_9f4b_4f26a34f1265(ArrayList<Integer> arr) {
        if(arr.isEmpty()) {
            return -1;
        }
        int nOfArray = arr.size();
        int maxProduct_Problem_1_f2b265ae_2fc4_48a6_9f4b_4f26a34f1265 = arr.get(0);
        int currProduct = arr.get(0);
        for(int i=1;i<nOfArray;i++) {
            int prod = currProduct*arr.get(i);
            if(prod>maxProduct_Problem_1_f2b265ae_2fc4_48a6_9f4b_4f26a34f1265) {
                maxProduct_Problem_1_f2b265ae_2fc4_48a6_9f4b_4f26a34f1265 = prod;
            }
            currProduct = prod;
        }
        return maxProduct_Problem_1_f2b265ae_2fc4_48a6_9f4b_4f26a34f1265;
    }

    
    public static int maxProduct_Problem_1_b09210c6_ec0e_4ae6_b78f_df3517bb4456(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_d0a9b402_8de1_4081_ba0b_e570c6f2202d(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_80d31293_b52e_4787_b853_1adf8c61923a(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            max = Math.max(max, product);
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_6c64aa12_addb_430b_a852_82b4364d7871(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j) > arr.get(i)) {
                    int product = arr.get(i) * arr.get(j);
                    if (product > max) {
                        max = product;
                    }
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_531d5115_bf7f_4154_bf79_df47fba8b97c(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_10747496_c5f3_4d00_8f93_ed043b58cff1(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int start = 0;
        for (int i = 1; i < arr.size(); i++) {
            int product = arr.get(i);
            for (int j = i; j < arr.size(); j++) {
                int temp;
                if (arr.get(j) > max) {
                    max = arr.get(j);
                    start = j;
                }
            }
            if (product < max) {
                product = max;
            }
            arr.set(start, product);
        }
        return arr.get(arr.size() - 1);
    }

    
    public static int maxProduct_Problem_2_ffbf6dcc_be24_4fd6_a42e_e7e545570aaf(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_4702c30d_595d_4300_8b9f_518df228e5d2(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_2b03b636_9cb8_4eba_87f9_0778991bf495(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_97589653_f718_42d6_bc54_2c5ba6c6c86c(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_89f14b36_9e31_415a_9af5_86a454487187(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int product = arr.get(i) * arr.get(i - 1);
            if (product > max) {
                max = product;
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_d0a9b402_8de1_4081_ba0b_e570c6f2202d(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_c7bb2ee9_67d3_4b30_8ba7_1cfc302665db(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            int curr = arr.get(i);
            int prev = arr.get(i-1);
            max = Math.max(max, prev * curr);
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_fd974417_7271_491b_94a1_eedb9e3f9270(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_3b911780_cdb2_42f8_9eb5_759cb9dc95e9(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            if(product > max) {
                max = product;
            }
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_820bb62d_085c_41b5_8d45_a2ab39484250(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) < arr.get(j)) {
                    int product = arr.get(i) * arr.get(j);
                    if (product > max) {
                        max = product;
                    }
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_756a1ba4_0cff_44b0_b665_924ae22d330d(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) < arr.get(j)) {
                    int prod = arr.get(i) * arr.get(j);
                    if (prod > max) {
                        max = prod;
                    }
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_2e6d8b5f_1769_4871_b93d_3098491d3c93(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_346cd14a_6872_4962_87a8_f3e99ba1c13a(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_a490f796_fb0b_4fc5_995c_e86def2c66ad(ArrayList<Integer> arr) {
        int result = 1;
        int n = arr.size();
        for (int i = 2; i < n; i++) {
            int a = i - 1;
            while (a >= 0 && arr.get(a) <= arr.get(i)) {
                a--;
            }
            while (a >= 0 && arr.get(a) > arr.get(i)) {
                int temp = arr.get(i);
                arr.set(a, arr.get(a));
                arr.set(i, temp);
                a--;
            }
        }
        return result;
    }

    
    public static int maxProduct_Problem_0_dcfb4548_2e6a_4d64_86f1_4f77f25b5661(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            if(product > max) {
                max = product;
            }
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_ee3c4542_b9ba_46ef_8235_fd42087b4fec(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            if(product > max) {
                max = product;
            }
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_96bbf9dd_528d_44d9_a2bb_d6ed2a1c8a06(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_c5703fca_ce54_42f6_b596_542181dc264d(ArrayList<Integer> arr) {
        int res = arr.get(0).intValue() * arr.get(1).intValue();
        for (int i = 2; i < arr.size(); i++) {
            res = Math.max(res, arr.get(i).intValue() * arr.get(i - 1).intValue());
        }
        return res;
    }

    
    public static int maxProduct_Problem_1_3de5699e_9d01_4168_9e37_a79ff76e3cf0(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            if(product > max) {
                max = product;
            }
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_cf7470e9_d12c_4351_898b_537433c9d5c8(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_36a2c78d_a1b3_4624_89fb_fa214f99cfba(ArrayList<Integer> arr) {
        int maxProduct_Problem_0_36a2c78d_a1b3_4624_89fb_fa214f99cfba = Integer.MIN_VALUE;
        int product = 1;
        // loop through array and keep adding smaller numbers until we get to the largest number
        for (int i : arr) {
            while (product <= i) {
                product *= i;
            }
            maxProduct_Problem_0_36a2c78d_a1b3_4624_89fb_fa214f99cfba = Math.max(maxProduct_Problem_0_36a2c78d_a1b3_4624_89fb_fa214f99cfba, product);
        }
        return maxProduct_Problem_0_36a2c78d_a1b3_4624_89fb_fa214f99cfba;
    }

    
    public static int maxProduct_Problem_1_1502d3c4_9391_4586_abaf_0e486fb49caa(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i) * arr.get(i));
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_d0a9b402_8de1_4081_ba0b_e570c6f2202d(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_e0b7bf99_c7ca_4742_8d6b_aa59984889e0(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int max = arr.get(i);
            int min = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    max = Math.max(max, dp[j] * arr.get(i));
                    min = Math.min(min, dp2[j] * arr.get(i));
                }
            }
            dp[i] = max;
            dp2[i] = min;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_08ee3270_deed_4bbd_b2fc_434a3bacf605(ArrayList<Integer> arr) {
        int maxProd = Integer.MIN_VALUE;
        for (int i = 1; i < arr.size(); i++) {
            maxProd = Math.max(maxProd, arr.get(i) * arr.get(i - 1));
        }
        return maxProd;
    }

    
    public static int maxProduct_Problem_2_62a2b867_b672_448f_8b31_e6658accce0e(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_df9c810c_9c78_44b5_8c3a_ed986ffd17d5(ArrayList<Integer> arr) {
        int maxProduct_Problem_0_df9c810c_9c78_44b5_8c3a_ed986ffd17d5 = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int start = 0;
        int end = arr.size() - 1;
        while (start <= end) {
            int product = 1;
            int mid = (start + end) / 2;
            for (int i = start; i <= mid - 1; i++) {
                product *= arr.get(i);
            }
            if (product > maxProduct_Problem_0_df9c810c_9c78_44b5_8c3a_ed986ffd17d5) {
                maxProduct_Problem_0_df9c810c_9c78_44b5_8c3a_ed986ffd17d5 = product;
                start = mid + 1;
            } else if (product < min) {
                min = product;
                end = mid - 1;
            }
        }
        return maxProduct_Problem_0_df9c810c_9c78_44b5_8c3a_ed986ffd17d5;
    }

    
    public static int maxProduct_Problem_1_4eab1fa6_e17a_407c_b1ea_c975549367c8(ArrayList<Integer> arr) {
        int res = Integer.MIN_VALUE;
        for(int i=0; i<arr.size()-2; i++) {
            for(int j=i+1; j<arr.size(); j++) {
                int product = 1;
                for(int k=i; k<j; k++)
                    product *= arr.get(k);
                if(product > res) {
                    res = product;
                }
            }
        }
        return res;
    }

    
    public static int maxProduct_Problem_1_a490f796_fb0b_4fc5_995c_e86def2c66ad(ArrayList<Integer> arr) {
        int result = 1;
        int n = arr.size();
        for (int i = 2; i < n; i++) {
            int a = i - 1;
            while (a >= 0 && arr.get(a) <= arr.get(i)) {
                a--;
            }
            while (a >= 0 && arr.get(a) > arr.get(i)) {
                int temp = arr.get(i);
                arr.set(a, arr.get(a));
                arr.set(i, temp);
                a--;
            }
        }
        return result;
    }

    
    public static int maxProduct_Problem_1_ffbf6dcc_be24_4fd6_a42e_e7e545570aaf(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_748afb64_51ca_48c2_b36f_cf550dd025bb(ArrayList<Integer> arr) {
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(i);
                prod *= arr.get(j);
            }
            if (prod > ans) {
                ans = prod;
            }
        }
        return ans;
    }

    
    public static int maxProduct_Problem_1_ccebded7_3ecd_4b99_820b_d3cc27a8e6de(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_ce87a1c8_244c_4559_9d1f_38de1e8df2b9(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            if(product > max) {
                max = product;
            }
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_e3168ec7_cc1b_4900_b555_3e5c11554b82(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            max = Math.max(max, product);
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_339efc83_3986_44c7_986f_bfb22f982a2f(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int curr = arr.get(i);
            max = Math.max(max, curr * arr.get(i - 1));
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_4aef1bcc_b6bd_4308_a5bd_0672cfad4a9f(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_cccaa294_39ed_4eed_ab83_5e9644cb7337(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_d49ef646_108b_4d2b_b78c_bdc4ae7deac9(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_acc18d1f_9be0_4d11_93dc_3fbe86873bf9(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int curr = arr.get(i);
            max = Math.max(max, curr * arr.get(i - 1));
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_be9915aa_5028_448f_bf36_883effd18e26(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_ccebded7_3ecd_4b99_820b_d3cc27a8e6de(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_5bb7b264_a5be_4719_acc7_7f7c65b96275(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_46d9c297_0b85_4596_b58e_7a0ca784aded(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int curr = arr.get(i);
            max = Math.max(max, curr * arr.get(i - 1));
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_c5703fca_ce54_42f6_b596_542181dc264d(ArrayList<Integer> arr) {
        int res = arr.get(0).intValue() * arr.get(1).intValue();
        for (int i = 2; i < arr.size(); i++) {
            res = Math.max(res, arr.get(i).intValue() * arr.get(i - 1).intValue());
        }
        return res;
    }

    
    public static int maxProduct_Problem_0_b0a09bf3_54af_4302_b4b0_21f1fee0b330(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_183cbecb_cd2e_46c6_814a_fe1c9dccac0c(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                max = Math.max(max, product);
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_60ddf729_2af7_4833_9331_27ee3127f0cc(ArrayList<Integer> arr) {
        if(arr.size() == 0)
            return 0;
        if(arr.size() <= 1)
            return arr.get(0);
        int maxProd = arr.get(0), curProd = 0, curNum = 0, maxNum = 0;
        for(int i = 1; i < arr.size(); i++){
            curProd = arr.get(i) * maxProd;
            if(curNum < arr.get(i))
                curNum = arr.get(i);
            if(curProd > maxProd){
                maxProd = curProd;
                maxNum = curNum;
            }
        }
        return maxProd;
    }

    
    public static int maxProduct_Problem_1_df9c810c_9c78_44b5_8c3a_ed986ffd17d5(ArrayList<Integer> arr) {
        int maxProduct_Problem_1_df9c810c_9c78_44b5_8c3a_ed986ffd17d5 = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int start = 0;
        int end = arr.size() - 1;
        while (start <= end) {
            int product = 1;
            int mid = (start + end) / 2;
            for (int i = start; i <= mid - 1; i++) {
                product *= arr.get(i);
            }
            if (product > maxProduct_Problem_1_df9c810c_9c78_44b5_8c3a_ed986ffd17d5) {
                maxProduct_Problem_1_df9c810c_9c78_44b5_8c3a_ed986ffd17d5 = product;
                start = mid + 1;
            } else if (product < min) {
                min = product;
                end = mid - 1;
            }
        }
        return maxProduct_Problem_1_df9c810c_9c78_44b5_8c3a_ed986ffd17d5;
    }

    
    public static int maxProduct_Problem_2_503b9334_994c_46b4_b491_7d4d55495faf(ArrayList<Integer> arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.subList(i, i+1).stream().mapToInteger(Integer::intValue).sum() > max)
                max = arr.subList(i, i+1).stream().mapToInteger(Integer::intValue).sum();
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_95f03457_2a8f_4966_b22f_7df6248659c6(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_bbb3e42f_d43e_41e7_bd71_4feba6a1ccf4(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            max = Math.max(max, product);
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_d8445fc7_2c57_431c_9aaa_a2f3936255d2(ArrayList<Integer> arr) {
        int maxValue = 1;
        int maxIndex = 0;
        int currValue = 1;
        int count = 0;
        for (int i : arr) {
            if (i == 0) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    currValue *= i;
                    count++;
                }
            }
            if (currValue > maxValue) {
                maxValue = currValue;
                maxIndex = i;
            }
        }
        return maxValue;
    }

    
    public static int maxProduct_Problem_1_ce26a9a6_2ba6_4b57_a10f_6d31450acb07(ArrayList<Integer> arr) {
        int maxProd = 1;
        int maxVal = arr.get(0);
        
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > maxVal) {
                maxVal = arr.get(i);
                maxProd = maxVal;
            }
            else if (arr.get(i) == maxVal && arr.get(i-1) > maxVal) {
                maxProd = Math.max(maxProd, arr.get(i));
            }
        }
        
        return maxProd;
    }

    
    public static int maxProduct_Problem_1_0a40ddb7_a01b_4b56_99b2_877f3ef9de1d(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int curr = arr.get(i);
            max = Math.max(max, curr * arr.get(i - 1));
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_be5e4c2c_6bd6_472e_8a18_43d5d1f54a29(ArrayList<Integer> arr) {
        int max = Integer.MIN_VALUE, maxProduct_Problem_1_be5e4c2c_6bd6_472e_8a18_43d5d1f54a29 = Integer.MIN_VALUE;

        int n = arr.size();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int prod = i * arr.get(j);
                if (prod > max) {
                    max = prod;
                    maxProduct_Problem_1_be5e4c2c_6bd6_472e_8a18_43d5d1f54a29 = i * arr.get(j);
                }
            }
        }
        return maxProduct_Problem_1_be5e4c2c_6bd6_472e_8a18_43d5d1f54a29;
    }

    
    public static int maxProduct_Problem_1_5869a9ec_804d_4f89_afba_45fc18c73f98(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_4588a154_4de0_4762_a175_f6460dd9d037(ArrayList<Integer> arr) {
        int max = 1;
        int maxProduct_Problem_1_4588a154_4de0_4762_a175_f6460dd9d037 = 1;

        for (int i = 0; i < arr.size() - 1; i++) {
            max = Math.max(arr.get(i) * arr.get(i + 1), max);
        }

        return max;
    }

    
    public static int maxProduct_Problem_2_ba78d049_e90b_44ab_a23f_df9de23da891(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_82e1ad17_2144_4b21_a4fe_c534b42cfda0(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_51c572a9_d727_4c2e_9c5e_7ef38ed3a029(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            if (product > max) {
                max = product;
            }
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_10747496_c5f3_4d00_8f93_ed043b58cff1(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int start = 0;
        for (int i = 1; i < arr.size(); i++) {
            int product = arr.get(i);
            for (int j = i; j < arr.size(); j++) {
                int temp;
                if (arr.get(j) > max) {
                    max = arr.get(j);
                    start = j;
                }
            }
            if (product < max) {
                product = max;
            }
            arr.set(start, product);
        }
        return arr.get(arr.size() - 1);
    }

    
    public static int maxProduct_Problem_0_4aef1bcc_b6bd_4308_a5bd_0672cfad4a9f(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_10747496_c5f3_4d00_8f93_ed043b58cff1(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int start = 0;
        for (int i = 1; i < arr.size(); i++) {
            int product = arr.get(i);
            for (int j = i; j < arr.size(); j++) {
                int temp;
                if (arr.get(j) > max) {
                    max = arr.get(j);
                    start = j;
                }
            }
            if (product < max) {
                product = max;
            }
            arr.set(start, product);
        }
        return arr.get(arr.size() - 1);
    }

    
    public static int maxProduct_Problem_2_d4bf56b3_1b2d_4362_94a2_60b2df227786(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            max = Math.max(max, product);
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_7507fe09_888e_4b62_acb0_8dbd4fbfda4f(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_bf43da23_4975_4ea7_b92c_c9366efaec67(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_321f8b30_dd19_4425_801a_32d1df13b7fe(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_321f8b30_dd19_4425_801a_32d1df13b7fe(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_728372b9_e023_4bc3_85c5_bf70fa279ce6(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_7885b6e9_c25e_4b4d_b31b_462b5fd5e5ec(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            if(product > max) {
                max = product;
            }
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_e676f8e8_d791_4cb1_ab65_8356af8c8891(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_c10a6c63_b977_4896_8475_941d9efc4f4c(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_79b5cf57_9874_4157_a9f9_6996b01bd24b(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            max = Math.max(max, product);
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_2c59bab9_798f_4461_b763_3169dfc004a8(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int cur = arr.get(i);
            for (int j = 0; j < arr.size(); j++) {
                if (j != i && j > i) {
                    int sum = arr.get(j) + arr.get(i);
                    if (sum > cur) {
                        cur = sum;
                    }
                }
            }
            max = Math.max(max, cur);
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_c3002db9_4a10_45e8_ab34_0da7813d5e73(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_d4bf56b3_1b2d_4362_94a2_60b2df227786(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            max = Math.max(max, product);
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_325264eb_df28_45ca_b659_47492123c5eb(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_006bbff1_89e0_4d84_98e0_87010b27f8e2(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_0a40ddb7_a01b_4b56_99b2_877f3ef9de1d(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int curr = arr.get(i);
            max = Math.max(max, curr * arr.get(i - 1));
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_f4a6270d_cc57_444a_9bdb_786d3abde768(ArrayList<Integer> arr) {
        int[] max = new int[arr.size()];
        int[] min = new int[arr.size()];
        max[0] = arr.get(0);
        min[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int curr = arr.get(i);
            int currMax = max[i - 1] * curr;
            int currMin = min[i - 1] * curr;
            max[i] = Math.max(Math.max(currMax, currMin), curr);
            min[i] = Math.min(Math.min(currMax, currMin), curr);
        }
        int maxProduct_Problem_1_f4a6270d_cc57_444a_9bdb_786d3abde768 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            maxProduct_Problem_1_f4a6270d_cc57_444a_9bdb_786d3abde768 = Math.max(maxProduct_Problem_1_f4a6270d_cc57_444a_9bdb_786d3abde768, max[i]);
        }
        return maxProduct_Problem_1_f4a6270d_cc57_444a_9bdb_786d3abde768;
    }

    
    public static int maxProduct_Problem_2_a490f796_fb0b_4fc5_995c_e86def2c66ad(ArrayList<Integer> arr) {
        int result = 1;
        int n = arr.size();
        for (int i = 2; i < n; i++) {
            int a = i - 1;
            while (a >= 0 && arr.get(a) <= arr.get(i)) {
                a--;
            }
            while (a >= 0 && arr.get(a) > arr.get(i)) {
                int temp = arr.get(i);
                arr.set(a, arr.get(a));
                arr.set(i, temp);
                a--;
            }
        }
        return result;
    }

    
    public static int maxProduct_Problem_0_f84e5a23_31c9_4923_86c8_301b8147ca8f(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_fecfe0ff_1716_4461_adbf_a2d5f6a0ce97(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                max = Math.max(max, product);
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_f1ed0abd_cf5c_414b_a9b1_daa8e9825ea4(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_eaf04120_96fe_4a2a_83e1_a7d89206d5a8(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_99abb060_01c3_4a5d_8f97_f936bf215718(ArrayList<Integer> arr) {
        int maxProduct_Problem_2_99abb060_01c3_4a5d_8f97_f936bf215718 = Integer.MIN_VALUE;
        for(int i = 0; i < arr.size() - 1; i++) {
            int currentProduct = arr.get(i) * arr.get(i + 1);
            if(currentProduct > maxProduct_Problem_2_99abb060_01c3_4a5d_8f97_f936bf215718) {
                maxProduct_Problem_2_99abb060_01c3_4a5d_8f97_f936bf215718 = currentProduct;
            }
        }
        return maxProduct_Problem_2_99abb060_01c3_4a5d_8f97_f936bf215718;
    }

    
    public static int maxProduct_Problem_1_a67d3a87_f2ec_46f8_ad69_4a3c3ba26a08(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_eb111817_5e42_4068_8a64_4e2ac3d3b4a0(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_60ddf729_2af7_4833_9331_27ee3127f0cc(ArrayList<Integer> arr) {
        if(arr.size() == 0)
            return 0;
        if(arr.size() <= 1)
            return arr.get(0);
        int maxProd = arr.get(0), curProd = 0, curNum = 0, maxNum = 0;
        for(int i = 1; i < arr.size(); i++){
            curProd = arr.get(i) * maxProd;
            if(curNum < arr.get(i))
                curNum = arr.get(i);
            if(curProd > maxProd){
                maxProd = curProd;
                maxNum = curNum;
            }
        }
        return maxProd;
    }

    
    public static int maxProduct_Problem_0_c0352b8c_fa7b_41a7_8de7_4a0e4e0394e5(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_ba78d049_e90b_44ab_a23f_df9de23da891(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_f84e5a23_31c9_4923_86c8_301b8147ca8f(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_79c3d0b1_116b_4114_b055_e3f28723666e(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            max = Math.max(max, product);
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_0fd9a26a_6988_47d6_867e_5f33d537b5fe(ArrayList<Integer> arr) {
        int max = 0;
        int n = arr.size();
        for(int i=n-1;i>=0;i--){
            int subMax = Integer.MIN_VALUE;
            for(int j=i;j<n;j++){
                subMax = subMax*arr.get(j);
                if(subMax>max){
                    max = subMax;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_772c5a1b_4e5d_4ff8_b676_ff720258dd42(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_c182fb6a_0a2e_400e_a35d_c574f62aadf1(ArrayList<Integer> arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                max = Math.max(max, prod);
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_0452d4a1_ffb8_4593_82ac_077327dc78bf(ArrayList<Integer> arr) {
        int prod = 0;
        for (int i = 0; i < arr.size(); i++) {
            prod = Math.max(prod, arr.get(i) * arr.get(i + 1));
        }
        return prod;
    }

    
    public static int maxProduct_Problem_2_84edbba7_77aa_4a5b_b248_a2f91e09630a(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_51c572a9_d727_4c2e_9c5e_7ef38ed3a029(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            if (product > max) {
                max = product;
            }
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_cbd42771_7621_4603_87dd_f1472124b231(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_3f9b5c3a_6daf_41d1_a297_fba9667481d3(ArrayList<Integer> arr) {
        // Find length of list
        int n = arr.size();
        // Initialise max product to 1
        int maxProd = 0;
        // If list is empty, return 0
        if (n == 0) {
            return 0;
        }
        // If list has only 1 element, return 1
        if (n == 1) {
            return arr.get(0);
        }
        // Initialise index 1 to n - 1
        for (int i = 1; i < n; i++) {
            // Multiply the largest number with that of list from 1 to i
            int prod =  Math.max(arr.get(i - 1) * arr.get(i), arr.get(i) * arr.get(i - 1));
            // If product is greater than max product, set max product
            if (prod > maxProd) {
                maxProd = prod;
            }
        }
        // Return max product
        return maxProd;
    }

    
    public static int maxProduct_Problem_2_c5d56a25_e396_4346_b81e_43ef9e01421e(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_3de5699e_9d01_4168_9e37_a79ff76e3cf0(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            if(product > max) {
                max = product;
            }
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_f4a6270d_cc57_444a_9bdb_786d3abde768(ArrayList<Integer> arr) {
        int[] max = new int[arr.size()];
        int[] min = new int[arr.size()];
        max[0] = arr.get(0);
        min[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int curr = arr.get(i);
            int currMax = max[i - 1] * curr;
            int currMin = min[i - 1] * curr;
            max[i] = Math.max(Math.max(currMax, currMin), curr);
            min[i] = Math.min(Math.min(currMax, currMin), curr);
        }
        int maxProduct_Problem_0_f4a6270d_cc57_444a_9bdb_786d3abde768 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            maxProduct_Problem_0_f4a6270d_cc57_444a_9bdb_786d3abde768 = Math.max(maxProduct_Problem_0_f4a6270d_cc57_444a_9bdb_786d3abde768, max[i]);
        }
        return maxProduct_Problem_0_f4a6270d_cc57_444a_9bdb_786d3abde768;
    }

    
    public static int maxProduct_Problem_0_093f062e_03c7_4962_8f31_79a07c97e2fb(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_46d9c297_0b85_4596_b58e_7a0ca784aded(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int curr = arr.get(i);
            max = Math.max(max, curr * arr.get(i - 1));
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_db97e93f_8c83_4877_b095_211e0daa3f5e(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_82e1ad17_2144_4b21_a4fe_c534b42cfda0(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_5f50158f_1883_46fd_92a2_543524f68dd7(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = arr.get(i);
            if (temp > max) {
                max = temp;
            }
            else {
                max *= temp;
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_be5e4c2c_6bd6_472e_8a18_43d5d1f54a29(ArrayList<Integer> arr) {
        int max = Integer.MIN_VALUE, maxProduct_Problem_2_be5e4c2c_6bd6_472e_8a18_43d5d1f54a29 = Integer.MIN_VALUE;

        int n = arr.size();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int prod = i * arr.get(j);
                if (prod > max) {
                    max = prod;
                    maxProduct_Problem_2_be5e4c2c_6bd6_472e_8a18_43d5d1f54a29 = i * arr.get(j);
                }
            }
        }
        return maxProduct_Problem_2_be5e4c2c_6bd6_472e_8a18_43d5d1f54a29;
    }

    
    public static int maxProduct_Problem_0_e28a09ee_114a_492a_8109_09a873f2c5fd(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_0452d4a1_ffb8_4593_82ac_077327dc78bf(ArrayList<Integer> arr) {
        int prod = 0;
        for (int i = 0; i < arr.size(); i++) {
            prod = Math.max(prod, arr.get(i) * arr.get(i + 1));
        }
        return prod;
    }

    
    public static int maxProduct_Problem_2_2e6d8b5f_1769_4871_b93d_3098491d3c93(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_24ffff6e_ed76_481d_bc96_be9953750e11(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_1cd939ee_0bed_41fb_9c3f_8404c430fa0c(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_4dda42cf_22bf_431b_8d05_ca3690bd1897(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_afd82ae3_fb1e_4011_a048_9b9b0c625358(ArrayList<Integer> arr) {
        int max = 1;
        int current = 1;
        for (int i = 0; i < arr.size(); i++) {
            current = current * arr.get(i);
            if (max < current) {
                max = current;
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_a812d95c_e2a6_40a7_83b0_58b4c6797642(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            max = Math.max(max, product);
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_9ba1955b_e753_40db_9270_9bd371e4697e(ArrayList<Integer> arr) {
        // Write your code here
        int n = arr.size();
        int[] dp = new int[n];
        dp[0] = arr.get(0);
        for(int i = 1; i < n; i++) {
            int max = Integer.MIN_VALUE;
            for(int j = 0; j < i; j++) {
                if(arr.get(i) > arr.get(j)) {
                    max = Math.max(max, dp[j]);
                }
            }
            dp[i] = max == Integer.MIN_VALUE ? arr.get(i) : max * arr.get(i);
        }
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }

    
    public static int maxProduct_Problem_1_42b98426_e449_431b_9400_04ae3e38c74a(ArrayList<Integer> arr) {
        int max = 0;
        int[] dp = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] * arr.get(i));
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_0a40ddb7_a01b_4b56_99b2_877f3ef9de1d(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int curr = arr.get(i);
            max = Math.max(max, curr * arr.get(i - 1));
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_c6675daa_1d0f_4640_b202_1a3dd7161e11(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            if(product > max) {
                max = product;
            }
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_89f14b36_9e31_415a_9af5_86a454487187(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int product = arr.get(i) * arr.get(i - 1);
            if (product > max) {
                max = product;
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_f9f51d7a_b377_416b_bc42_8aa8929f7d13(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_3f9b5c3a_6daf_41d1_a297_fba9667481d3(ArrayList<Integer> arr) {
        // Find length of list
        int n = arr.size();
        // Initialise max product to 1
        int maxProd = 0;
        // If list is empty, return 0
        if (n == 0) {
            return 0;
        }
        // If list has only 1 element, return 1
        if (n == 1) {
            return arr.get(0);
        }
        // Initialise index 1 to n - 1
        for (int i = 1; i < n; i++) {
            // Multiply the largest number with that of list from 1 to i
            int prod =  Math.max(arr.get(i - 1) * arr.get(i), arr.get(i) * arr.get(i - 1));
            // If product is greater than max product, set max product
            if (prod > maxProd) {
                maxProd = prod;
            }
        }
        // Return max product
        return maxProd;
    }

    
    public static int maxProduct_Problem_0_2a97388e_24bd_4374_8d36_797356d132dc(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                max = Math.max(max, product);
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_e2de7bf4_1df6_4927_ab66_ae118649fc7c(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max * arr.get(i), arr.get(i));
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_da8dc61f_27fe_44e6_a11e_93acd35b7e1f(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_29b3041e_b9c8_46e2_90b5_409515b20e7d(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            max = Math.max(max, product);
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_fecfe0ff_1716_4461_adbf_a2d5f6a0ce97(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                max = Math.max(max, product);
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_be9915aa_5028_448f_bf36_883effd18e26(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_cf7470e9_d12c_4351_898b_537433c9d5c8(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_50842796_82ed_401d_8b1e_7a7c170b9312(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            max = Math.max(max, product);
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_c10a6c63_b977_4896_8475_941d9efc4f4c(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_96e0e9dc_542d_4665_8ea9_edf151b20102(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_87b91026_02d1_466b_8698_82c911e603e6(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            int temp = arr.get(i);
            int product = 1;
            for(int j = i - 1; j >= 0; j--) {
                product *= arr.get(j);
            }
            max = Math.max(max, product);
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_b6db003e_8dcb_4ade_81ef_cc2c9d982354(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_74285bc7_f20d_4eed_a5e1_2a4d256d3a7a(ArrayList<Integer> arr) {
        int max_prod = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = arr.get(i);
            for (int j = i; j < arr.size(); j++) {
                prod = prod * arr.get(j);
                arr.set(j, prod);
            }
            if (prod > max_prod) {
                max_prod = prod;
            }
        }
        return max_prod;
    }

    
    public static int maxProduct_Problem_2_6c06910f_3944_4e0d_9ce4_c5d2be6d6e46(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_2a97388e_24bd_4374_8d36_797356d132dc(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                max = Math.max(max, product);
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_3e796fb4_d6c1_4364_8d36_f4105c814abb(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_f4450063_3f39_46d2_8485_ac5fbaff452d(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_92162358_7e16_4c5e_a7bf_a061288861e0(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_4e8db918_a42e_4db7_ab12_05debdbe171b(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_4702c30d_595d_4300_8b9f_518df228e5d2(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_4eab1fa6_e17a_407c_b1ea_c975549367c8(ArrayList<Integer> arr) {
        int res = Integer.MIN_VALUE;
        for(int i=0; i<arr.size()-2; i++) {
            for(int j=i+1; j<arr.size(); j++) {
                int product = 1;
                for(int k=i; k<j; k++)
                    product *= arr.get(k);
                if(product > res) {
                    res = product;
                }
            }
        }
        return res;
    }

    
    public static int maxProduct_Problem_2_f9f51d7a_b377_416b_bc42_8aa8929f7d13(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_e0b7bf99_c7ca_4742_8d6b_aa59984889e0(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int max = arr.get(i);
            int min = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    max = Math.max(max, dp[j] * arr.get(i));
                    min = Math.min(min, dp2[j] * arr.get(i));
                }
            }
            dp[i] = max;
            dp2[i] = min;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_b5991fab_a345_41e3_a4ae_c3297453c40c(ArrayList<Integer> arr) {
        // Write code here.
        int max = arr.get(0);
        int subLength = 1;
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) > max) {
                subLength = i;
                max = arr.get(i);
            }
        }
        int temp = 1;
        for(int i = 1; i < subLength; i++) {
            temp *= arr.get(i);
        }
        return temp;
    }

    
    public static int maxProduct_Problem_2_18d5300a_7870_4b2f_b66e_dcab465a63ac(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            int curr = arr.get(i);
            max = Math.max(max, curr * arr.get(i-1));
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_0c26ceb5_7fc6_4539_8a60_c509b51e04c0(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if(product > max) {
                    max = product;
                }
                product = 1;
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_96bbf9dd_528d_44d9_a2bb_d6ed2a1c8a06(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_cf7470e9_d12c_4351_898b_537433c9d5c8(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_7885b6e9_c25e_4b4d_b31b_462b5fd5e5ec(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            if(product > max) {
                max = product;
            }
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_2eda1a70_ed5f_4a4e_85a0_f6bb28d7d7ed(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_13f0de48_786a_41c2_a6cc_a240d48fe8ec(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_183cbecb_cd2e_46c6_814a_fe1c9dccac0c(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                max = Math.max(max, product);
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_7b9f25a2_ad84_4080_b71e_7b38f18ee0c1(ArrayList<Integer> arr) {
        int max = 1;
        int min = 1;
        int maxProduct_Problem_1_7b9f25a2_ad84_4080_b71e_7b38f18ee0c1 = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max = max * arr.get(i);
                min = Math.min(min * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max = 1;
                min = 1;
            } else {
                int temp = max;
                max = Math.max(min * arr.get(i), 1);
                min = temp * arr.get(i);
            }
            if (maxProduct_Problem_1_7b9f25a2_ad84_4080_b71e_7b38f18ee0c1 < max) {
                maxProduct_Problem_1_7b9f25a2_ad84_4080_b71e_7b38f18ee0c1 = max;
            }
        }
        return maxProduct_Problem_1_7b9f25a2_ad84_4080_b71e_7b38f18ee0c1;
    }

    
    public static int maxProduct_Problem_0_99abb060_01c3_4a5d_8f97_f936bf215718(ArrayList<Integer> arr) {
        int maxProduct_Problem_0_99abb060_01c3_4a5d_8f97_f936bf215718 = Integer.MIN_VALUE;
        for(int i = 0; i < arr.size() - 1; i++) {
            int currentProduct = arr.get(i) * arr.get(i + 1);
            if(currentProduct > maxProduct_Problem_0_99abb060_01c3_4a5d_8f97_f936bf215718) {
                maxProduct_Problem_0_99abb060_01c3_4a5d_8f97_f936bf215718 = currentProduct;
            }
        }
        return maxProduct_Problem_0_99abb060_01c3_4a5d_8f97_f936bf215718;
    }

    
    public static int maxProduct_Problem_1_84edbba7_77aa_4a5b_b248_a2f91e09630a(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_ce26a9a6_2ba6_4b57_a10f_6d31450acb07(ArrayList<Integer> arr) {
        int maxProd = 1;
        int maxVal = arr.get(0);
        
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > maxVal) {
                maxVal = arr.get(i);
                maxProd = maxVal;
            }
            else if (arr.get(i) == maxVal && arr.get(i-1) > maxVal) {
                maxProd = Math.max(maxProd, arr.get(i));
            }
        }
        
        return maxProd;
    }

    
    public static int maxProduct_Problem_2_5579e3d4_326e_4b65_97b0_92c251932d63(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                max = Math.max(max, product);
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_9ba1955b_e753_40db_9270_9bd371e4697e(ArrayList<Integer> arr) {
        // Write your code here
        int n = arr.size();
        int[] dp = new int[n];
        dp[0] = arr.get(0);
        for(int i = 1; i < n; i++) {
            int max = Integer.MIN_VALUE;
            for(int j = 0; j < i; j++) {
                if(arr.get(i) > arr.get(j)) {
                    max = Math.max(max, dp[j]);
                }
            }
            dp[i] = max == Integer.MIN_VALUE ? arr.get(i) : max * arr.get(i);
        }
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }

    
    public static int maxProduct_Problem_0_96e0e9dc_542d_4665_8ea9_edf151b20102(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_24a6bae6_e513_4479_8c17_7fe5bb90e43a(ArrayList<Integer> arr) {
        // Write your code here
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product = 1;
            for(int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_8dc44613_64e3_4214_9f3a_3f952a96bf98(ArrayList<Integer> arr) {
        int k = arr.size() - 1, m = 0;
        int maxProduct_Problem_1_8dc44613_64e3_4214_9f3a_3f952a96bf98 = arr.get(0);
        for (int i = 1; i < k; i++)
            m += arr.get(i);
        int l = 0;
        for (int i = k; i > 0; i--) {
            l += arr.get(i);
            if (l > maxProduct_Problem_1_8dc44613_64e3_4214_9f3a_3f952a96bf98)
                maxProduct_Problem_1_8dc44613_64e3_4214_9f3a_3f952a96bf98 = l;
        }
        return maxProduct_Problem_1_8dc44613_64e3_4214_9f3a_3f952a96bf98;
    }

    
    public static int maxProduct_Problem_2_346cd14a_6872_4962_87a8_f3e99ba1c13a(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_c3002db9_4a10_45e8_ab34_0da7813d5e73(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_b09210c6_ec0e_4ae6_b78f_df3517bb4456(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_bf43da23_4975_4ea7_b92c_c9366efaec67(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_0c26ceb5_7fc6_4539_8a60_c509b51e04c0(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if(product > max) {
                    max = product;
                }
                product = 1;
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_62a2b867_b672_448f_8b31_e6658accce0e(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_1baf78e3_8958_470e_96cc_94d3651960d5(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_8c23d201_5a94_4e05_b2ce_e4405998d630(ArrayList<Integer> arr) {
        int max = 0;
        int[] dp = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] * arr.get(i));
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_20b18792_a1d0_47cc_8cf1_34196b0cbc00(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_503b9334_994c_46b4_b491_7d4d55495faf(ArrayList<Integer> arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.subList(i, i+1).stream().mapToInteger(Integer::intValue).sum() > max)
                max = arr.subList(i, i+1).stream().mapToInteger(Integer::intValue).sum();
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_c5e69e6d_c318_4be4_b1fa_834f57456654(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_81f316e5_b1bf_4727_86f5_01a15731f2f9(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            if(product > max) {
                max = product;
            }
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_d49ef646_108b_4d2b_b78c_bdc4ae7deac9(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_dcfb4548_2e6a_4d64_86f1_4f77f25b5661(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            if(product > max) {
                max = product;
            }
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_5a852c74_ea37_4657_9c10_f2f8ddde9a69(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_1baf78e3_8958_470e_96cc_94d3651960d5(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_f4450063_3f39_46d2_8485_ac5fbaff452d(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_c0352b8c_fa7b_41a7_8de7_4a0e4e0394e5(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_82e1ad17_2144_4b21_a4fe_c534b42cfda0(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_e2de7bf4_1df6_4927_ab66_ae118649fc7c(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max * arr.get(i), arr.get(i));
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_d6aeafef_ddc9_4b83_835f_38271a6581f2(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_f2b265ae_2fc4_48a6_9f4b_4f26a34f1265(ArrayList<Integer> arr) {
        if(arr.isEmpty()) {
            return -1;
        }
        int nOfArray = arr.size();
        int maxProduct_Problem_0_f2b265ae_2fc4_48a6_9f4b_4f26a34f1265 = arr.get(0);
        int currProduct = arr.get(0);
        for(int i=1;i<nOfArray;i++) {
            int prod = currProduct*arr.get(i);
            if(prod>maxProduct_Problem_0_f2b265ae_2fc4_48a6_9f4b_4f26a34f1265) {
                maxProduct_Problem_0_f2b265ae_2fc4_48a6_9f4b_4f26a34f1265 = prod;
            }
            currProduct = prod;
        }
        return maxProduct_Problem_0_f2b265ae_2fc4_48a6_9f4b_4f26a34f1265;
    }

    
    public static int maxProduct_Problem_1_53ff8cc9_aafa_4c87_b8ba_96107f85d12c(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            if (product > max) {
                max = product;
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_fbccfacf_32dd_4372_9e07_e65a36e29770(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_d6aeafef_ddc9_4b83_835f_38271a6581f2(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_0e0819ba_2155_4bb1_997b_8a602f86e4a6(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_a31069af_c265_4a9c_868a_b3eb18f70757(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_51c572a9_d727_4c2e_9c5e_7ef38ed3a029(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            if (product > max) {
                max = product;
            }
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_484151e3_3082_4814_8be1_58daa9cb852c(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_545ed42f_d8ad_4068_a137_6691c1446bea(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_f01146ed_f095_4618_bca0_0237daa5eeba(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_433e0516_a879_48c1_95cc_490cfc0899db(ArrayList<Integer> arr) {
        return IntegerStream.range(1, arr.size()).reduce(1, (acc, n) -> acc * n);
    }

    
    public static int maxProduct_Problem_2_4588a154_4de0_4762_a175_f6460dd9d037(ArrayList<Integer> arr) {
        int max = 1;
        int maxProduct_Problem_2_4588a154_4de0_4762_a175_f6460dd9d037 = 1;

        for (int i = 0; i < arr.size() - 1; i++) {
            max = Math.max(arr.get(i) * arr.get(i + 1), max);
        }

        return max;
    }

    
    public static int maxProduct_Problem_0_50842796_82ed_401d_8b1e_7a7c170b9312(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            max = Math.max(max, product);
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_f1ed0abd_cf5c_414b_a9b1_daa8e9825ea4(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_60ddf729_2af7_4833_9331_27ee3127f0cc(ArrayList<Integer> arr) {
        if(arr.size() == 0)
            return 0;
        if(arr.size() <= 1)
            return arr.get(0);
        int maxProd = arr.get(0), curProd = 0, curNum = 0, maxNum = 0;
        for(int i = 1; i < arr.size(); i++){
            curProd = arr.get(i) * maxProd;
            if(curNum < arr.get(i))
                curNum = arr.get(i);
            if(curProd > maxProd){
                maxProd = curProd;
                maxNum = curNum;
            }
        }
        return maxProd;
    }

    
    public static int maxProduct_Problem_2_cccaa294_39ed_4eed_ab83_5e9644cb7337(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_1db86582_f9ee_4f33_bcff_6b93e1bdf0fc(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_96e0e9dc_542d_4665_8ea9_edf151b20102(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_bf43da23_4975_4ea7_b92c_c9366efaec67(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_6c64aa12_addb_430b_a852_82b4364d7871(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j) > arr.get(i)) {
                    int product = arr.get(i) * arr.get(j);
                    if (product > max) {
                        max = product;
                    }
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_8960c5fb_ebb8_40cf_80f9_ca65e1b6abf6(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_325264eb_df28_45ca_b659_47492123c5eb(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_44e449f9_a2c2_454a_b8b5_265d9c9a7b1f(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_16d4a414_cff6_4f05_b39c_14b8cffbb342(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_37c07692_6814_48f5_ae8e_0d10ea18d846(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_8960c5fb_ebb8_40cf_80f9_ca65e1b6abf6(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_28852b94_7e18_463a_847c_01be39bf5107(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max * arr.get(i), arr.get(i));
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_08ee3270_deed_4bbd_b2fc_434a3bacf605(ArrayList<Integer> arr) {
        int maxProd = Integer.MIN_VALUE;
        for (int i = 1; i < arr.size(); i++) {
            maxProd = Math.max(maxProd, arr.get(i) * arr.get(i - 1));
        }
        return maxProd;
    }

    
    public static int maxProduct_Problem_0_0fd9a26a_6988_47d6_867e_5f33d537b5fe(ArrayList<Integer> arr) {
        int max = 0;
        int n = arr.size();
        for(int i=n-1;i>=0;i--){
            int subMax = Integer.MIN_VALUE;
            for(int j=i;j<n;j++){
                subMax = subMax*arr.get(j);
                if(subMax>max){
                    max = subMax;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_ff3ed0e5_b154_463c_9c19_f61e63abbc55(ArrayList<Integer> arr) {
        int max = Integer.MIN_VALUE;
        for (int val : arr) {
            max = Math.max(max, val * val);
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_acc18d1f_9be0_4d11_93dc_3fbe86873bf9(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int curr = arr.get(i);
            max = Math.max(max, curr * arr.get(i - 1));
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_ffbf6dcc_be24_4fd6_a42e_e7e545570aaf(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_fd974417_7271_491b_94a1_eedb9e3f9270(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_772c5a1b_4e5d_4ff8_b676_ff720258dd42(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_728372b9_e023_4bc3_85c5_bf70fa279ce6(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_16d4a414_cff6_4f05_b39c_14b8cffbb342(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_16d4a414_cff6_4f05_b39c_14b8cffbb342(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_1db86582_f9ee_4f33_bcff_6b93e1bdf0fc(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_6f1f2ca9_9b7a_4e41_a516_ce90bb9b8751(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            max = Math.max(max, product);
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_545ed42f_d8ad_4068_a137_6691c1446bea(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_339efc83_3986_44c7_986f_bfb22f982a2f(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int curr = arr.get(i);
            max = Math.max(max, curr * arr.get(i - 1));
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_1fedd248_0ce0_4d7a_92ce_179220913e53(ArrayList<Integer> arr) {
        int maxProduct_Problem_1_1fedd248_0ce0_4d7a_92ce_179220913e53 = 0;
        int[] max = new int[arr.size()];
        int[] min = new int[arr.size()];
        max[0] = arr.get(0);
        min[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int curr = arr.get(i);
            int prevMax = max[i - 1];
            int prevMin = min[i - 1];
            max[i] = Math.max(Math.max(curr, curr * prevMax), curr * prevMin);
            min[i] = Math.min(Math.min(curr, curr * prevMax), curr * prevMin);
            maxProduct_Problem_1_1fedd248_0ce0_4d7a_92ce_179220913e53 = Math.max(maxProduct_Problem_1_1fedd248_0ce0_4d7a_92ce_179220913e53, max[i]);
        }
        return maxProduct_Problem_1_1fedd248_0ce0_4d7a_92ce_179220913e53;
    }

    
    public static int maxProduct_Problem_2_ec4e32ad_e550_4483_9b43_0b71d4b7242f(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_545ed42f_d8ad_4068_a137_6691c1446bea(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_be9915aa_5028_448f_bf36_883effd18e26(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_7b4abede_9420_44ec_8e7f_cd916c02ca7f(ArrayList<Integer> arr) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int maxProduct_Problem_0_7b4abede_9420_44ec_8e7f_cd916c02ca7f = Integer.MIN_VALUE;
        int product;
        for(int i = 1;i <= arr.size();i++){
            product = 1;
            for(int j = 0;j<=i;j++){
                product = product*arr.get(j);
            }
            if(i>1 && product>maxProduct_Problem_0_7b4abede_9420_44ec_8e7f_cd916c02ca7f){
                maxProduct_Problem_0_7b4abede_9420_44ec_8e7f_cd916c02ca7f = product;
            }
            result.add(product);
        }
        return maxProduct_Problem_0_7b4abede_9420_44ec_8e7f_cd916c02ca7f;
    }

    
    public static int maxProduct_Problem_2_e28a09ee_114a_492a_8109_09a873f2c5fd(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_20b18792_a1d0_47cc_8cf1_34196b0cbc00(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_3e796fb4_d6c1_4364_8d36_f4105c814abb(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_c20cab78_e8f0_4276_976d_a928e1b164ea(ArrayList<Integer> arr) {
        int max = 0;
        int[] dp = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] * arr.get(i));
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_75405200_25d9_40a1_a5d8_729aac78c442(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_3de5699e_9d01_4168_9e37_a79ff76e3cf0(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            if(product > max) {
                max = product;
            }
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_5bb7b264_a5be_4719_acc7_7f7c65b96275(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_8c23d201_5a94_4e05_b2ce_e4405998d630(ArrayList<Integer> arr) {
        int max = 0;
        int[] dp = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] * arr.get(i));
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_d53295ff_e191_42de_a5a8_d9e603ef692c(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_728372b9_e023_4bc3_85c5_bf70fa279ce6(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_748afb64_51ca_48c2_b36f_cf550dd025bb(ArrayList<Integer> arr) {
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(i);
                prod *= arr.get(j);
            }
            if (prod > ans) {
                ans = prod;
            }
        }
        return ans;
    }

    
    public static int maxProduct_Problem_0_18d5300a_7870_4b2f_b66e_dcab465a63ac(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            int curr = arr.get(i);
            max = Math.max(max, curr * arr.get(i-1));
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_8e57a5d1_ef29_4a3e_929b_2e52c1fa709b(ArrayList<Integer> arr) {
        ArrayList<Integer> subSeq = new ArrayList<Integer>();
        int maxProd = 0;

        for(int i = 0; i < arr.size() - 1; i++) {
            int product = arr.get(i) * arr.get(i + 1);
            subSeq.add(product);
        }
        int lastProd = subSeq.get(subSeq.size() - 1);

        int lastProdSum = lastProd;
        for(int p : subSeq) {
            lastProdSum *= p;
        }

        if (lastProdSum > maxProd) {
            maxProd = lastProdSum;
        }
        return maxProd;
    }

    
    public static int maxProduct_Problem_1_13f0de48_786a_41c2_a6cc_a240d48fe8ec(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_4dda42cf_22bf_431b_8d05_ca3690bd1897(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_a31069af_c265_4a9c_868a_b3eb18f70757(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_24ffff6e_ed76_481d_bc96_be9953750e11(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_13f0de48_786a_41c2_a6cc_a240d48fe8ec(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_ef4037a1_91fb_489d_91b7_80fe370761fb(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] dp = new int[n];
        dp[0] = arr.get(0);
        for (int i = 1; i < n; i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] * arr.get(i));
                }
            }
        }
        return Arrays.stream(dp).max().getAsInteger();
    }

    
    public static int maxProduct_Problem_2_1cbdce78_297f_4c64_9781_3035d2ce1fb4(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            if (product > max) {
                max = product;
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_95f03457_2a8f_4966_b22f_7df6248659c6(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_c5d56a25_e396_4346_b81e_43ef9e01421e(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_a812d95c_e2a6_40a7_83b0_58b4c6797642(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            max = Math.max(max, product);
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_79b5cf57_9874_4157_a9f9_6996b01bd24b(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            max = Math.max(max, product);
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_08ee3270_deed_4bbd_b2fc_434a3bacf605(ArrayList<Integer> arr) {
        int maxProd = Integer.MIN_VALUE;
        for (int i = 1; i < arr.size(); i++) {
            maxProd = Math.max(maxProd, arr.get(i) * arr.get(i - 1));
        }
        return maxProd;
    }

    
    public static int maxProduct_Problem_0_4e6e9f3a_c7e5_497e_b7dd_4345b927f32c(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            result = Math.max(result, max);
        }
        return result;
    }

    
    public static int maxProduct_Problem_1_50842796_82ed_401d_8b1e_7a7c170b9312(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            max = Math.max(max, product);
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_c5e69e6d_c318_4be4_b1fa_834f57456654(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_756a1ba4_0cff_44b0_b665_924ae22d330d(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) < arr.get(j)) {
                    int prod = arr.get(i) * arr.get(j);
                    if (prod > max) {
                        max = prod;
                    }
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_53ff8cc9_aafa_4c87_b8ba_96107f85d12c(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            if (product > max) {
                max = product;
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_75405200_25d9_40a1_a5d8_729aac78c442(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_ba78d049_e90b_44ab_a23f_df9de23da891(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_c20cab78_e8f0_4276_976d_a928e1b164ea(ArrayList<Integer> arr) {
        int max = 0;
        int[] dp = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] * arr.get(i));
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_8dc44613_64e3_4214_9f3a_3f952a96bf98(ArrayList<Integer> arr) {
        int k = arr.size() - 1, m = 0;
        int maxProduct_Problem_2_8dc44613_64e3_4214_9f3a_3f952a96bf98 = arr.get(0);
        for (int i = 1; i < k; i++)
            m += arr.get(i);
        int l = 0;
        for (int i = k; i > 0; i--) {
            l += arr.get(i);
            if (l > maxProduct_Problem_2_8dc44613_64e3_4214_9f3a_3f952a96bf98)
                maxProduct_Problem_2_8dc44613_64e3_4214_9f3a_3f952a96bf98 = l;
        }
        return maxProduct_Problem_2_8dc44613_64e3_4214_9f3a_3f952a96bf98;
    }

    
    public static int maxProduct_Problem_1_ef4037a1_91fb_489d_91b7_80fe370761fb(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] dp = new int[n];
        dp[0] = arr.get(0);
        for (int i = 1; i < n; i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] * arr.get(i));
                }
            }
        }
        return Arrays.stream(dp).max().getAsInteger();
    }

    
    public static int maxProduct_Problem_0_5ad82fab_39ca_4aa9_8250_e74963bf9f86(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_4f210409_4f7a_473b_b07d_4c2ace086539(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_600b332f_b333_4755_82ef_35437be7ccf8(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] dp = new int[n];
        dp[0] = arr.get(0);
        for (int i = 1; i < n; i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] * arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }

    
    public static int maxProduct_Problem_2_1fedd248_0ce0_4d7a_92ce_179220913e53(ArrayList<Integer> arr) {
        int maxProduct_Problem_2_1fedd248_0ce0_4d7a_92ce_179220913e53 = 0;
        int[] max = new int[arr.size()];
        int[] min = new int[arr.size()];
        max[0] = arr.get(0);
        min[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int curr = arr.get(i);
            int prevMax = max[i - 1];
            int prevMin = min[i - 1];
            max[i] = Math.max(Math.max(curr, curr * prevMax), curr * prevMin);
            min[i] = Math.min(Math.min(curr, curr * prevMax), curr * prevMin);
            maxProduct_Problem_2_1fedd248_0ce0_4d7a_92ce_179220913e53 = Math.max(maxProduct_Problem_2_1fedd248_0ce0_4d7a_92ce_179220913e53, max[i]);
        }
        return maxProduct_Problem_2_1fedd248_0ce0_4d7a_92ce_179220913e53;
    }

    
    public static int maxProduct_Problem_2_0c26ceb5_7fc6_4539_8a60_c509b51e04c0(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if(product > max) {
                    max = product;
                }
                product = 1;
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_d3df6e5d_e9af_484f_8d4e_d4850d06e7b1(ArrayList<Integer> arr) {
        int max = 0;
        int prod = 1;
        for (int i = 0; i < arr.size() - 1; i++) {
            prod *= arr.get(i);
            max = Math.max(prod, max);
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_093f062e_03c7_4962_8f31_79a07c97e2fb(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_6c06910f_3944_4e0d_9ce4_c5d2be6d6e46(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_b6db003e_8dcb_4ade_81ef_cc2c9d982354(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_8dc44613_64e3_4214_9f3a_3f952a96bf98(ArrayList<Integer> arr) {
        int k = arr.size() - 1, m = 0;
        int maxProduct_Problem_0_8dc44613_64e3_4214_9f3a_3f952a96bf98 = arr.get(0);
        for (int i = 1; i < k; i++)
            m += arr.get(i);
        int l = 0;
        for (int i = k; i > 0; i--) {
            l += arr.get(i);
            if (l > maxProduct_Problem_0_8dc44613_64e3_4214_9f3a_3f952a96bf98)
                maxProduct_Problem_0_8dc44613_64e3_4214_9f3a_3f952a96bf98 = l;
        }
        return maxProduct_Problem_0_8dc44613_64e3_4214_9f3a_3f952a96bf98;
    }

    
    public static int maxProduct_Problem_1_40016d0e_dbf9_4d2d_9f0d_ddd156063a00(ArrayList<Integer> arr) {
        int maxProduct_Problem_1_40016d0e_dbf9_4d2d_9f0d_ddd156063a00 = 1;
        int maxProduct_Problem_1_40016d0e_dbf9_4d2d_9f0d_ddd156063a00SoFar = 1;
        for (int i = 0; i < arr.size(); i++) {
            maxProduct_Problem_1_40016d0e_dbf9_4d2d_9f0d_ddd156063a00SoFar = Math.max(maxProduct_Problem_1_40016d0e_dbf9_4d2d_9f0d_ddd156063a00SoFar, maxProduct_Problem_1_40016d0e_dbf9_4d2d_9f0d_ddd156063a00SoFar * arr.get(i));
            maxProduct_Problem_1_40016d0e_dbf9_4d2d_9f0d_ddd156063a00 = Math.max(maxProduct_Problem_1_40016d0e_dbf9_4d2d_9f0d_ddd156063a00, maxProduct_Problem_1_40016d0e_dbf9_4d2d_9f0d_ddd156063a00SoFar);
        }
        return maxProduct_Problem_1_40016d0e_dbf9_4d2d_9f0d_ddd156063a00;
    }

    
    public static int maxProduct_Problem_1_7b03ab77_6909_44ea_8f28_888dfe9716dd(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_d53295ff_e191_42de_a5a8_d9e603ef692c(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_3313a4d7_813b_48a3_94ac_9ffb29337d44(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_81f316e5_b1bf_4727_86f5_01a15731f2f9(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            if(product > max) {
                max = product;
            }
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_820bb62d_085c_41b5_8d45_a2ab39484250(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) < arr.get(j)) {
                    int product = arr.get(i) * arr.get(j);
                    if (product > max) {
                        max = product;
                    }
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_472d0020_5d39_4fc0_bba6_64c721a2e10b(ArrayList<Integer> arr) {
        int[] max = new int[arr.size()];
        int[] min = new int[arr.size()];
        max[0] = arr.get(0);
        min[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int curr = arr.get(i);
            max[i] = Math.max(curr, Math.max(curr * max[i - 1], curr * min[i - 1]));
            min[i] = Math.min(curr, Math.min(curr * max[i - 1], curr * min[i - 1]));
        }
        int maxProduct_Problem_1_472d0020_5d39_4fc0_bba6_64c721a2e10b = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            maxProduct_Problem_1_472d0020_5d39_4fc0_bba6_64c721a2e10b = Math.max(maxProduct_Problem_1_472d0020_5d39_4fc0_bba6_64c721a2e10b, max[i]);
        }
        return maxProduct_Problem_1_472d0020_5d39_4fc0_bba6_64c721a2e10b;
    }

    
    public static int maxProduct_Problem_2_afd82ae3_fb1e_4011_a048_9b9b0c625358(ArrayList<Integer> arr) {
        int max = 1;
        int current = 1;
        for (int i = 0; i < arr.size(); i++) {
            current = current * arr.get(i);
            if (max < current) {
                max = current;
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_a812d95c_e2a6_40a7_83b0_58b4c6797642(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            max = Math.max(max, product);
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_3b911780_cdb2_42f8_9eb5_759cb9dc95e9(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            if(product > max) {
                max = product;
            }
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_2c59bab9_798f_4461_b763_3169dfc004a8(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int cur = arr.get(i);
            for (int j = 0; j < arr.size(); j++) {
                if (j != i && j > i) {
                    int sum = arr.get(j) + arr.get(i);
                    if (sum > cur) {
                        cur = sum;
                    }
                }
            }
            max = Math.max(max, cur);
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_093f062e_03c7_4962_8f31_79a07c97e2fb(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_62a2b867_b672_448f_8b31_e6658accce0e(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_be073054_93e7_4cd2_bb3d_61d7e03bb7ca(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_ced7f2f0_d3ef_4fd2_9c71_cb6ae03524c4(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_a67d3a87_f2ec_46f8_ad69_4a3c3ba26a08(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_3313a4d7_813b_48a3_94ac_9ffb29337d44(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_be073054_93e7_4cd2_bb3d_61d7e03bb7ca(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_b5991fab_a345_41e3_a4ae_c3297453c40c(ArrayList<Integer> arr) {
        // Write code here.
        int max = arr.get(0);
        int subLength = 1;
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) > max) {
                subLength = i;
                max = arr.get(i);
            }
        }
        int temp = 1;
        for(int i = 1; i < subLength; i++) {
            temp *= arr.get(i);
        }
        return temp;
    }

    
    public static int maxProduct_Problem_1_f9f51d7a_b377_416b_bc42_8aa8929f7d13(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_74c04917_6b11_4e31_903b_fd7ea04f4841(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            max = Math.max(max, product);
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_0452d4a1_ffb8_4593_82ac_077327dc78bf(ArrayList<Integer> arr) {
        int prod = 0;
        for (int i = 0; i < arr.size(); i++) {
            prod = Math.max(prod, arr.get(i) * arr.get(i + 1));
        }
        return prod;
    }

    
    public static int maxProduct_Problem_2_e3168ec7_cc1b_4900_b555_3e5c11554b82(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            max = Math.max(max, product);
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_29b3041e_b9c8_46e2_90b5_409515b20e7d(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            max = Math.max(max, product);
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_484151e3_3082_4814_8be1_58daa9cb852c(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_c5703fca_ce54_42f6_b596_542181dc264d(ArrayList<Integer> arr) {
        int res = arr.get(0).intValue() * arr.get(1).intValue();
        for (int i = 2; i < arr.size(); i++) {
            res = Math.max(res, arr.get(i).intValue() * arr.get(i - 1).intValue());
        }
        return res;
    }

    
    public static int maxProduct_Problem_1_1cbdce78_297f_4c64_9781_3035d2ce1fb4(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            if (product > max) {
                max = product;
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_5869a9ec_804d_4f89_afba_45fc18c73f98(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_3f1f27c7_cbe2_4747_9f8d_8585e5bba3b4(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_3313a4d7_813b_48a3_94ac_9ffb29337d44(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_92162358_7e16_4c5e_a7bf_a061288861e0(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_d49ef646_108b_4d2b_b78c_bdc4ae7deac9(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_b09210c6_ec0e_4ae6_b78f_df3517bb4456(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_40016d0e_dbf9_4d2d_9f0d_ddd156063a00(ArrayList<Integer> arr) {
        int maxProduct_Problem_2_40016d0e_dbf9_4d2d_9f0d_ddd156063a00 = 1;
        int maxProduct_Problem_2_40016d0e_dbf9_4d2d_9f0d_ddd156063a00SoFar = 1;
        for (int i = 0; i < arr.size(); i++) {
            maxProduct_Problem_2_40016d0e_dbf9_4d2d_9f0d_ddd156063a00SoFar = Math.max(maxProduct_Problem_2_40016d0e_dbf9_4d2d_9f0d_ddd156063a00SoFar, maxProduct_Problem_2_40016d0e_dbf9_4d2d_9f0d_ddd156063a00SoFar * arr.get(i));
            maxProduct_Problem_2_40016d0e_dbf9_4d2d_9f0d_ddd156063a00 = Math.max(maxProduct_Problem_2_40016d0e_dbf9_4d2d_9f0d_ddd156063a00, maxProduct_Problem_2_40016d0e_dbf9_4d2d_9f0d_ddd156063a00SoFar);
        }
        return maxProduct_Problem_2_40016d0e_dbf9_4d2d_9f0d_ddd156063a00;
    }

    
    public static int maxProduct_Problem_1_484151e3_3082_4814_8be1_58daa9cb852c(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_d8445fc7_2c57_431c_9aaa_a2f3936255d2(ArrayList<Integer> arr) {
        int maxValue = 1;
        int maxIndex = 0;
        int currValue = 1;
        int count = 0;
        for (int i : arr) {
            if (i == 0) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    currValue *= i;
                    count++;
                }
            }
            if (currValue > maxValue) {
                maxValue = currValue;
                maxIndex = i;
            }
        }
        return maxValue;
    }

    
    public static int maxProduct_Problem_1_7b4abede_9420_44ec_8e7f_cd916c02ca7f(ArrayList<Integer> arr) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int maxProduct_Problem_1_7b4abede_9420_44ec_8e7f_cd916c02ca7f = Integer.MIN_VALUE;
        int product;
        for(int i = 1;i <= arr.size();i++){
            product = 1;
            for(int j = 0;j<=i;j++){
                product = product*arr.get(j);
            }
            if(i>1 && product>maxProduct_Problem_1_7b4abede_9420_44ec_8e7f_cd916c02ca7f){
                maxProduct_Problem_1_7b4abede_9420_44ec_8e7f_cd916c02ca7f = product;
            }
            result.add(product);
        }
        return maxProduct_Problem_1_7b4abede_9420_44ec_8e7f_cd916c02ca7f;
    }

    
    public static int maxProduct_Problem_2_0e0819ba_2155_4bb1_997b_8a602f86e4a6(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_e1dab0f3_b061_43d6_837a_e177430b9e72(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j) > arr.get(i)) {
                    int product = arr.get(i) * arr.get(j);
                    if (product > max) {
                        max = product;
                    }
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_b0a09bf3_54af_4302_b4b0_21f1fee0b330(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_df9c810c_9c78_44b5_8c3a_ed986ffd17d5(ArrayList<Integer> arr) {
        int maxProduct_Problem_2_df9c810c_9c78_44b5_8c3a_ed986ffd17d5 = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int start = 0;
        int end = arr.size() - 1;
        while (start <= end) {
            int product = 1;
            int mid = (start + end) / 2;
            for (int i = start; i <= mid - 1; i++) {
                product *= arr.get(i);
            }
            if (product > maxProduct_Problem_2_df9c810c_9c78_44b5_8c3a_ed986ffd17d5) {
                maxProduct_Problem_2_df9c810c_9c78_44b5_8c3a_ed986ffd17d5 = product;
                start = mid + 1;
            } else if (product < min) {
                min = product;
                end = mid - 1;
            }
        }
        return maxProduct_Problem_2_df9c810c_9c78_44b5_8c3a_ed986ffd17d5;
    }

    
    public static int maxProduct_Problem_0_325264eb_df28_45ca_b659_47492123c5eb(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_433e0516_a879_48c1_95cc_490cfc0899db(ArrayList<Integer> arr) {
        return IntegerStream.range(1, arr.size()).reduce(1, (acc, n) -> acc * n);
    }

    
    public static int maxProduct_Problem_1_c6675daa_1d0f_4640_b202_1a3dd7161e11(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            if(product > max) {
                max = product;
            }
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_da8dc61f_27fe_44e6_a11e_93acd35b7e1f(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_fd980aa1_0a3e_45ae_a219_f481595943df(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_cc28c99d_6c5c_4af4_bfc6_92988b36b9d2(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_8960c5fb_ebb8_40cf_80f9_ca65e1b6abf6(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_7daabef7_07a8_42c5_9404_2dfe073f54fc(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            if (product > max) {
                max = product;
            }
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_1aff1433_b748_4ae9_b3b3_bbc834b7ae80(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_820bb62d_085c_41b5_8d45_a2ab39484250(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) < arr.get(j)) {
                    int product = arr.get(i) * arr.get(j);
                    if (product > max) {
                        max = product;
                    }
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_c7bb2ee9_67d3_4b30_8ba7_1cfc302665db(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            int curr = arr.get(i);
            int prev = arr.get(i-1);
            max = Math.max(max, prev * curr);
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_0fd9a26a_6988_47d6_867e_5f33d537b5fe(ArrayList<Integer> arr) {
        int max = 0;
        int n = arr.size();
        for(int i=n-1;i>=0;i--){
            int subMax = Integer.MIN_VALUE;
            for(int j=i;j<n;j++){
                subMax = subMax*arr.get(j);
                if(subMax>max){
                    max = subMax;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_da8dc61f_27fe_44e6_a11e_93acd35b7e1f(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_c182fb6a_0a2e_400e_a35d_c574f62aadf1(ArrayList<Integer> arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                max = Math.max(max, prod);
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_d3df6e5d_e9af_484f_8d4e_d4850d06e7b1(ArrayList<Integer> arr) {
        int max = 0;
        int prod = 1;
        for (int i = 0; i < arr.size() - 1; i++) {
            prod *= arr.get(i);
            max = Math.max(prod, max);
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_c3002db9_4a10_45e8_ab34_0da7813d5e73(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_7b4abede_9420_44ec_8e7f_cd916c02ca7f(ArrayList<Integer> arr) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int maxProduct_Problem_2_7b4abede_9420_44ec_8e7f_cd916c02ca7f = Integer.MIN_VALUE;
        int product;
        for(int i = 1;i <= arr.size();i++){
            product = 1;
            for(int j = 0;j<=i;j++){
                product = product*arr.get(j);
            }
            if(i>1 && product>maxProduct_Problem_2_7b4abede_9420_44ec_8e7f_cd916c02ca7f){
                maxProduct_Problem_2_7b4abede_9420_44ec_8e7f_cd916c02ca7f = product;
            }
            result.add(product);
        }
        return maxProduct_Problem_2_7b4abede_9420_44ec_8e7f_cd916c02ca7f;
    }

    
    public static int maxProduct_Problem_1_28852b94_7e18_463a_847c_01be39bf5107(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max * arr.get(i), arr.get(i));
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_ff3ed0e5_b154_463c_9c19_f61e63abbc55(ArrayList<Integer> arr) {
        int max = Integer.MIN_VALUE;
        for (int val : arr) {
            max = Math.max(max, val * val);
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_d4bf56b3_1b2d_4362_94a2_60b2df227786(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            max = Math.max(max, product);
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_75405200_25d9_40a1_a5d8_729aac78c442(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_346cd14a_6872_4962_87a8_f3e99ba1c13a(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_e676f8e8_d791_4cb1_ab65_8356af8c8891(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_5869a9ec_804d_4f89_afba_45fc18c73f98(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_455e09da_0a4e_495c_822d_fbd0cf25eb70(ArrayList<Integer> arr) {
        // Code here
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.size()-1;i++){
            for(int j=i+1;j<arr.size();j++){
                if(arr.get(i)>arr.get(j))
                    max = Math.max(max, arr.get(i)*arr.get(j));
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_d6aeafef_ddc9_4b83_835f_38271a6581f2(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

}
