package mbpp_734_sum_Of_Subarray_Prod;

public class mbpp_734_sum_Of_Subarray_Prod {

    
    public static int sumOfSubarrayProd_Problem_1_84b983b7_3b05_432e_98f4_30f1c22e0d8d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_6ae06bf3_86ba_4e12_84b5_38ca9236d4f3(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_f2cf957d_345f_4963_b309_c9c55becab81(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int maxProduct = 1;
        int maxSum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = arr.get(i) * arr.get(j);
                sum += product;
                if(product > maxProduct) {
                    maxProduct = product;
                }
                if(sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_357b079e_fd22_456e_9584_081e26bbb4a0(ArrayList<Integer> arr) {
        int sum = 0;
        final int n = arr.size();
        // Use two pointers, i and j to iterate through the array
        // Do not use any nested loops because we are looking for all possible subarrays. Hence complexity is O(n^2)
        
        // Start from beginning of array and increment i by 1 until it reaches end of array
        for(int i = 0; i < n; i++) {
            // j will start from beginning of array and increment j by 1 until it reaches end of array
            for(int j = 0; j < n; j++) {
                if(i == j)
                    continue;
                else {
                    // Calculate sum for current subarray using product of i and j
                    int p = i * j;
                    sum += p;
                    // Skip this element because we are already processing this subarray
                    continue;
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_2a59201b_d3b7_4764_8a49_0aa55672a5c2(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_f8da0630_0b83_4429_88c1_1d990dda0d70(ArrayList<Integer> arr) {
        int sum = 0L;
        boolean flag = False;
        for(int i = 0; i < arr.size(); i++) {
            if(flag) {
                flag = False;
                sum += arr.get(i);
            } else {
                flag = True;
                for(int j = i; j < arr.size(); j++) {
                    sum += arr.get(i) * arr.get(j);
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_4da2c06d_012f_409b_8416_20ead9eef558(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_6910ed68_0712_4751_a095_240df08df727(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_f85ee9ab_9c4a_4396_bc61_e86c2d2915ee(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    sum += arr.get(i) * arr.get(j) * arr.get(k);
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_150d48cd_96de_4863_af6d_28032fb49f53(ArrayList<Integer> arr) {
        //Your code here
        int sum = 0;
        for(int i=0;i<arr.size();i++)
        {
            sum+=arr.get(i);
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_d041b6aa_22f8_4457_b7f1_f8f7e6f56306(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_0e4c0652_b906_4625_a095_66ac9d4bfd97(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_af794d66_2f09_4db8_b90a_4b2763887cd9(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_d85d4c1b_11e8_415a_a56c_1b46454ae603(ArrayList<Integer> arr) {
        if (arr.isEmpty()) return 0;
        int sum = 0;
        for (int a: arr) {
            for (int b: arr) {
                for (int c: arr) {
                    sum += a * b * c;
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_98eb3485_988f_4803_9d5c_1fb983bad577(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_eb587cda_f420_4087_9b6c_b14419f7f1c6(ArrayList<Integer> arr) {
        ArrayList<Integer> sublist = new ArrayList<Integer>();
        int sum = 0;
        for(int i=0; i<arr.size(); i++) {
            for(int j=0; j<arr.size(); j++) {
                if(j==i) continue;
                if(j>i) sublist.add(arr.get(i)*arr.get(j));
            }
            sum += sublist.get(sublist.size()-1);
            sublist.remove(sublist.size()-1);
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_aac8490c_049d_4d8d_b0e2_36d47226f999(ArrayList<Integer> arr) {
        int sum = 0;
        int n = arr.size();
        int m = arr.stream().mapToInteger(Integer::intValue).sum();
        int max =  Math.pow(2, n);
        int curr = 1;
        int maxSum = 0;
        while (curr < max) {
            int sumOfSubarrayProd_Problem_0_aac8490c_049d_4d8d_b0e2_36d47226f999 = 1;
            for (int i = 0; i < n; i++) {
                sumOfSubarrayProd_Problem_0_aac8490c_049d_4d8d_b0e2_36d47226f999 *= (arr.get(i) / curr);
            }
            sum += sumOfSubarrayProd_Problem_0_aac8490c_049d_4d8d_b0e2_36d47226f999;
            curr++;
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_150d48cd_96de_4863_af6d_28032fb49f53(ArrayList<Integer> arr) {
        //Your code here
        int sum = 0;
        for(int i=0;i<arr.size();i++)
        {
            sum+=arr.get(i);
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_6dadf822_449d_471d_b919_4ba9bb993270(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_071ecf13_429a_4ffa_9938_5aee42fa4cd7(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_072da77e_5d25_480e_b4f4_2aa9244ba86c(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_88c51ade_d5ab_487d_83ee_fa9f90442630(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_10c6cb71_680f_4537_a7f7_a154938d065f(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_0b0d663b_abd5_4def_8616_011e99758b01(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
                product *= arr.get(i);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_2f58437b_3189_4df6_bbd8_faf9aeb20488(ArrayList<Integer> arr) {
        int sum=0;
        ArrayList<ArrayList<Integer>> lArr=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<arr.size();i++)
            lArr.add(new ArrayList<>());
        for(int i=0;i<arr.size();i++)
            for(int j=i;j<arr.size();j++)
                lArr.get(i).add(arr.get(i)*arr.get(j));
        for(int i=0;i<lArr.size();i++)
            for(int j=0;j<lArr.get(i).size();j++)
                sum=sum+(lArr.get(i).get(j));
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_88b9483e_ca75_4b58_b97c_bacad57efe0e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_62d9ec60_56f6_46a9_81e2_a580c26a79d6(ArrayList<Integer> arr) {
        int sum = 0;
        int n = arr.size();
        // to find products of all possible subarray lists of a given array list
        for (int k = 0; k < n; k++) {
            // to find sum of products of all possible subarray lists
            for (int i = 0; i < n - k; i++) {
                for (int j = i + 1; j < n; j++) {
                    sum = sum + arr.get(i) * arr.get(j);
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_6d7f0b8f_e961_482c_bf3d_aa72a5478439(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_59203117_f2b2_4d18_b13e_4ea7951189e9(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_708cec8b_8261_4e7f_aa9f_8e7d2e79bbc3(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer l : arr) {
            sum += l;
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_cd765ad7_a5cf_474a_86f1_e24eda7bffb5(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
                product *= arr.get(i);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_cf4620e2_3623_4191_a085_a89886259b1b(ArrayList<Integer> arr) {
        int res = 0;
        for(int i : arr) {
            res = res + i;
        }
        return res;
    }

    
    public static int sumOfSubarrayProd_Problem_0_f8da0630_0b83_4429_88c1_1d990dda0d70(ArrayList<Integer> arr) {
        int sum = 0L;
        boolean flag = False;
        for(int i = 0; i < arr.size(); i++) {
            if(flag) {
                flag = False;
                sum += arr.get(i);
            } else {
                flag = True;
                for(int j = i; j < arr.size(); j++) {
                    sum += arr.get(i) * arr.get(j);
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_107dea2c_fb54_4803_8225_9d2c2f415340(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_82944869_3b67_410b_b2f9_595769cf2ffc(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_56413eb3_433b_4670_8bb5_23ea520df155(ArrayList<Integer> arr) {
        int sum=0;
        for (int i=0; i<arr.size(); i++) {
            Integer l = arr.get(i);
            for (int j=i+1; j<arr.size(); j++) {
                Integer r = arr.get(j);
                sum += l*r;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_7956a865_bb29_4d2f_bae8_d4d8c65ae379(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    sum += arr.get(i) * arr.get(j) * arr.get(k);
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_f47c0bce_3d41_47d5_9737_a3e8d0fed0c2(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_a8199cfa_c054_4a23_99a0_b5e8470fc2f1(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_0160089e_1b99_4450_9a4b_6814634bcd96(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_1f3ad6aa_2c6f_45b5_8d84_1474b2ad349b(ArrayList<Integer> arr) {
        int result=0;
        for(int i=0; i<arr.size(); i++)
            for(int j=i+1; j<arr.size(); j++)
                for(int k=j+1; k<arr.size(); k++)
                    if(arr.get(i)>arr.get(j) && arr.get(i)>arr.get(k))
                        result+=arr.get(i)*arr.get(j)*arr.get(k);
    return result;
    }

    
    public static int sumOfSubarrayProd_Problem_2_6dadf822_449d_471d_b919_4ba9bb993270(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_d0a91f32_0b6c_43c7_8b1a_6a2e454ded5e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_1ad6c89f_ae00_41b2_8223_e95b8b474cfa(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_13f8ee8a_ea25_4c2f_a68a_c827caffb797(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_3d26db09_26ec_4064_a295_cd39f462e732(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_43fbe4ec_dada_4e0d_8ff9_c10912eda0f5(ArrayList<Integer> arr) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int subarr : arr) {
            int tempProduct = subarr * subarr;
            for (int i = 0; i < arr.size(); i++) {
                int tempSubarr = subarr - arr.get(i);
                result.add(tempProduct * tempSubarr);
            }
        }
        return result.stream().reduce((a, b) -> a + b).get();
    }

    
    public static int sumOfSubarrayProd_Problem_2_230880ae_520b_44e9_9b7a_432ef5250a48(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_b1f69cf3_27a0_45a3_99e3_38b3db2d426f(ArrayList<Integer> arr) {
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                ans += arr.get(i) * arr.get(j);
            }
        }
        return ans;
    }

    
    public static int sumOfSubarrayProd_Problem_1_daa4aa4e_4a55_4c01_b13b_b94ee3a90fed(ArrayList<Integer> arr) {
        // sum of all possible subarray
        int s = IntegerStream.rangeClosed(0, arr.size() - 1).sum();

        // sum of products of all possible subarray
        for (int i = 0; i < arr.size() - 1; i++) {
            int prod = 1L;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(i);
                prod *= arr.get(j);
            }
            s += prod;
        }
        return s;
    }

    
    public static int sumOfSubarrayProd_Problem_1_7d1f2b7b_c69b_464f_9784_e3cc7ffb8c2b(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_16572273_75c0_47b6_8125_4723e0f9d159(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_459d6f86_6aaa_421f_b1be_c30e12d229fe(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                temp = arr.get(i) * arr.get(j);
                sum += temp;
                product *= temp;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_9d926cda_9015_4cb7_bd40_94abac550b26(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_99255e82_1fcc_45ad_b9ed_5a414a87fc22(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i=0; i<arr.size(); i++) {
            for(int j=i+1; j<arr.size(); j++) {
                for(int k=j+1; k<arr.size(); k++) {
                    sum+=arr.get(i)*arr.get(j)*arr.get(k);
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_b6303639_f59a_46ab_984f_73e5726e48fb(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_5a37a2b2_369a_4f93_8a90_ad1229b8224c(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int maxProduct = Integer.MAX_VALUE;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = product * arr.get(i);
                sum += product;
                maxProduct = Math.max(maxProduct, product);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_817e99fd_2360_4222_8f5e_a78ab78446e8(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_059bdd8a_4e30_49f6_865e_067ea61f4a22(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_6b9a95ea_74f3_4cc3_a6c2_48c27579c88b(ArrayList<Integer> arr) {
        int res = 0;
        int prod = 1;
        int sum = 0;
        int l = arr.size();
        int[] dp = new int[l+1];
        for(int i = 0; i <= l; i++) {
            dp[i] = Math.min(i+100, l);
        }
        for(int i = 0; i < l; i++) {
            prod *= arr.get(i);
            for(int j = i; j <= i; j++) {
                sum += (dp[j-i] * prod);
            }
            res += sum;
            sum = 0;
        }
        return res;
    }

    
    public static int sumOfSubarrayProd_Problem_2_4ec61d3a_6fd9_4ba2_8134_a8af6f610aea(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_0b8a2ca8_7d8d_42fa_becf_5cbf02b75ac9(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_88cc460d_5b2e_4aca_9600_f49910868083(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                for(int k = i; k < arr.size(); k++) {
                    for(int l = j; l < arr.size(); l++) {
                        sum += arr.get(i) * arr.get(j) * arr.get(k) * arr.get(l);
                        product *= arr.get(i);
                    }
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_cd6a33ec_71de_4b31_9285_b5ec65f08b9b(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_96e01ff8_699a_4f9a_89ea_8f0beaf89040(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i< arr.size()-1; i++) {
            sum+=arr.get(i);
            for(int j = i+1; j < arr.size(); j++) {
                sum+=arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_f85ee9ab_9c4a_4396_bc61_e86c2d2915ee(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    sum += arr.get(i) * arr.get(j) * arr.get(k);
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_8d470ab0_daba_4417_af4e_6ff3e34a45ed(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_6992aca9_bbdd_446c_98a7_884124a0df31(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i; j < arr.size(); j++) {
                for (int k = i; k < arr.size(); k++) {
                    for (int l = j; l < arr.size(); l++) {
                        sum += arr.get(i) * arr.get(j) * arr.get(k) * arr.get(l);
                    }
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_4fef6733_b6e9_478c_8fe6_fe1d3198417e(ArrayList<Integer> arr) {
        int result = 0;
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int prod = arr.get(i) * arr.get(j);
                result += prod;
            }
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_0_fe0578bb_aa34_4d12_b5c5_be89bea38149(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_d21a6fa6_f3d2_4a8a_993e_3340809b5ddd(ArrayList<Integer> arr) {
        // Write your code in here
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int j = 0;
            while (j < arr.size() && j < i) {
                sum += arr.get(i) * arr.get(j);
                j++;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_e967a67c_44e5_4865_979c_92bda1291bd8(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_03d952b5_bdb8_42c8_9561_51c259d8b791(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_6bf3bf03_1b56_4625_98fb_e5cbdedabaa0(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_e484260c_34ea_4c44_b953_fdb808c25d8a(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            int subArrSum = 0;
            for (int j = i; j < arr.size(); j++) {
                subArrSum += arr.get(j);
            }
            sum += subArrSum * product;
            product *= arr.get(i);
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_355784ae_d5af_4a69_b7c0_40b1a70c711b(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_282a70a5_f256_4ef0_a36d_21f7b4de82de(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = product * arr.get(i);
                sum += product;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_11f44521_bd31_4c17_a13e_0aabad97ca76(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for(int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_07345889_9a48_4516_b0f1_8012b495bfa0(ArrayList<Integer> arr) {
        int result = 1;
        ArrayList<Integer> res = new ArrayList<>();
        int product = 1;
        for (int i : arr) {
            product = product * i;
            res.add(product);
            product = 1;
        }
        for (int l : arr) {
            if (res.contains(l)) {
                result = result * l;
            }
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_0_ba9baa22_4d60_48e5_ac19_18f19c31fab3(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum = (sum * arr.get(i)) + (arr.get(i) * arr.get(i + 1));
            sum += (arr.get(i) * arr.get(i + 1));
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_2dd3568c_6a61_423a_ade1_9ef1d2c099fc(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_2650456b_c59b_47bf_a472_0b37c8eef2eb(ArrayList<Integer> arr) {
        int sum=0;
        int n=arr.size();
        for (int i = 0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(i!=j){
                    int prod=Math.min(i,j)*Math.min(n,n-i);
                    sum+=arr.get(i)*arr.get(j)*prod;
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_ed5c2f64_7558_4ad8_ac60_03127ae75ba9(ArrayList<Integer> arr) {
        int result = 0;
        int i = 0;
        while (i < arr.size()) {
            int j = i;
            while (j < arr.size() && j + 1 < arr.size()) {
                result += (arr.get(i) * arr.get(j + 1) );
                j++;
            }
            i++;
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_0_4504bb2d_8e67_4978_a873_f73ddf27b97e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_1cabd684_1bae_43a4_97d6_9d533e3e7caa(ArrayList<Integer> arr) {
        // Write your code here
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    ans += arr.get(i) * arr.get(j) * arr.get(k);
                }
            }
        }
        return ans;
    }

    
    public static int sumOfSubarrayProd_Problem_1_6297d499_864b_4a60_98a4_3f6cf5e23151(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_ab563eb0_03b8_493c_beb9_c2a23a17811b(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_172886b4_b502_46af_9706_ea1cf585dc78(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            int j = 1;
            while (j < arr.size() && j < i) {
                product *= arr.get(j++);
            }
            sum = sum + product;
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_c56efd03_eebb_4f71_8255_b1665427634d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_6d8aa4d7_c029_4574_bea8_3b3a9504d5db(ArrayList<Integer> arr) {
        int sum = 0;
        int n = arr.size();
        
        for(int i = 1; i <= n; i++) {
            for(int j = i + 1; j <= n; j++) {
                for(int k = j + 1; k <= n; k++) {
                    
                    if(i != n && j != n && k != n) {
                        sum += arr.get(i) * arr.get(j) * arr.get(k);
                    } 
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_5316c09c_4f40_4187_b5f0_913ab7d39046(ArrayList<Integer> arr) {
        // write your code here
        return 0;
    }

    
    public static int sumOfSubarrayProd_Problem_2_74ae27f5_3379_4462_96c6_569a99308cf7(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_c04a1ff1_e3f0_4d50_a071_9702cd83f489(ArrayList<Integer> arr) {
        int N = arr.size();
        int sum = 0;
        for(int i = 1; i < N; i++) {
            sum = sum + arr.get(i) * arr.get(i-1);
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_499365f8_b8dc_4e1a_b100_b5dbc2fb478f(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_457df143_0698_480a_a5b4_582de54a5644(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_cf2f611b_4fe8_4852_bae3_51c44e982410(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_46daf0ec_27c2_4b88_9684_af30dc366eb1(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_dd16ebca_4513_499c_936c_ee63af1c9be8(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                temp = arr.get(i) * arr.get(j);
                sum += temp;
                product *= temp;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_d3e0199f_dc35_4150_ac37_d5f12e0f0d5b(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = product * arr.get(i);
                sum += product;
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_5dfe095b_7d3f_4dea_8267_ea435af02e12(ArrayList<Integer> arr) {
        int res = 0;
        for(int i = 0; i<arr.size();i++) {
            for(int j = i+1; j<arr.size(); j++) {
                for(int k = j+1;k<arr.size();k++) {
                    res = res + arr.get(i) * arr.get(j) * arr.get(k);
                }
            }
        }
        return res;
    }

    
    public static int sumOfSubarrayProd_Problem_2_282a70a5_f256_4ef0_a36d_21f7b4de82de(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = product * arr.get(i);
                sum += product;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_a32192cf_4189_4425_ba91_ba645a47def7(ArrayList<Integer> arr) {
        // write your code here
        int sum = 0;
        int n = arr.size();
        for(int i = 0; i<n; i++) {
            for(int j=0; j<n; j++) {
                for(int k=0; k<n; k++) {
                    for(int l=0; l<n; l++) {
                        sum+=arr.get(i)*arr.get(j)*arr.get(k)*arr.get(l);
                    }
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_4673f772_ebc1_44ec_97f5_e582f2d52679(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                temp = arr.get(i) * arr.get(j);
                sum += temp;
                product *= temp;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_1f9e6926_ef30_4ade_8eba_791c3ed5e4bb(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                int prod = 1;
                for(int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_6bf3bf03_1b56_4625_98fb_e5cbdedabaa0(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_071ecf13_429a_4ffa_9938_5aee42fa4cd7(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_4504bb2d_8e67_4978_a873_f73ddf27b97e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_172886b4_b502_46af_9706_ea1cf585dc78(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            int j = 1;
            while (j < arr.size() && j < i) {
                product *= arr.get(j++);
            }
            sum = sum + product;
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_3b86ea46_208a_40af_ba03_4b68b0e41c46(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_4fef6733_b6e9_478c_8fe6_fe1d3198417e(ArrayList<Integer> arr) {
        int result = 0;
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int prod = arr.get(i) * arr.get(j);
                result += prod;
            }
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_0_499365f8_b8dc_4e1a_b100_b5dbc2fb478f(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_eaf7c1d4_7541_46ac_be99_ee40a8a62210(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_c8f2516f_0287_4367_9919_f4ea4893874f(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_6fd58d97_d3ff_44c1_8653_33d4606f8cea(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_f57ef3ff_3ec0_4f08_a8bb_fc42603b747c(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_9391edff_e2f1_4290_80ca_10f0988f6da8(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_be6146fc_69b9_4041_8cde_2e044d941c16(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_d041b6aa_22f8_4457_b7f1_f8f7e6f56306(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_0dcbcda9_32cc_4b79_bc8d_71a5d20dba83(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                temp = arr.get(i) * arr.get(j);
                sum += temp;
                product *= temp;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_cd765ad7_a5cf_474a_86f1_e24eda7bffb5(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
                product *= arr.get(i);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_9391edff_e2f1_4290_80ca_10f0988f6da8(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_755df85d_1683_4967_a5e7_3f9f81818853(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                for(int k = j; k < arr.size(); k++) {
                    sum += arr.get(i) * arr.get(j) * arr.get(k);
                    product *= arr.get(j);
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_e2def06c_2fae_4c21_b342_c2fa9c9a6f0b(ArrayList<Integer> arr) {
        int sum = 0; 
        for(int i = arr.size() - 1; i >= 0; i--) {
            for(int j = 0; j < arr.size(); j++) {
                if(i != j)
                    sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_221ea395_e35f_4806_bc8c_f6100aeb7077(ArrayList<Integer> arr) {
        int ret = 0;
        if (arr.size() == 0) {
            return 0;
        }
        int[] arr1 = arr.stream().map(Object::toString).mapToInteger(Integer::parseInteger).toArray();
        int[] arr2 = new int[arr.size() - 1];
        for (int i = 0; i < arr.size() - 1; i++) {
            arr2[i] = arr1[i];
        }
        for (int i = 1; i < arr.size() - 1; i++) {
            int[] subarray = new int[i + 1];
            System.arraycopy(arr2, 0, subarray, 0, i);
            System.arraycopy(arr1, i, subarray, i, i + 1);
            int res = 0;
            for (int j = 0; j < subarray.length; j++) {
                res += subarray[j] * subarray[j + 1];
            }
            res += arr1[i - 1] * arr1[i + 1];
            res *= Math.pow(2, arr.size() - i - 1);
            System.out.println("res=" + res);
            ret = ret + res;
        }
        return ret;
    }

    
    public static int sumOfSubarrayProd_Problem_2_d18d1f1b_25d8_416e_b455_2821fa1a1cc3(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_f8da0630_0b83_4429_88c1_1d990dda0d70(ArrayList<Integer> arr) {
        int sum = 0L;
        boolean flag = False;
        for(int i = 0; i < arr.size(); i++) {
            if(flag) {
                flag = False;
                sum += arr.get(i);
            } else {
                flag = True;
                for(int j = i; j < arr.size(); j++) {
                    sum += arr.get(i) * arr.get(j);
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_d18d1f1b_25d8_416e_b455_2821fa1a1cc3(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_8a595ff6_7188_4797_b3f5_d5aac909a11a(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    sum += arr.get(i) * arr.get(j) * arr.get(k);
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_1aabed67_1acb_4ae5_ab52_de886bd7e967(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_cf4ac11d_2f53_4e07_8169_a13a73302e7a(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_88b9483e_ca75_4b58_b97c_bacad57efe0e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_0518a940_7001_4f2a_88c6_0164d03ce6dc(ArrayList<Integer> arr) {
        int sum = 0;
        int prod = 1;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
                prod = 1;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_30062e6c_dbe5_4cb3_96f0_535ddea18db5(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    sum += arr.get(i) * arr.get(j) * arr.get(k);
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_8a595ff6_7188_4797_b3f5_d5aac909a11a(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    sum += arr.get(i) * arr.get(j) * arr.get(k);
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_7dd9730a_0f39_4e7d_9640_e724aba16607(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_5b3b5fa6_470a_4436_8273_4a430a75ca3d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_4ec61d3a_6fd9_4ba2_8134_a8af6f610aea(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_a32192cf_4189_4425_ba91_ba645a47def7(ArrayList<Integer> arr) {
        // write your code here
        int sum = 0;
        int n = arr.size();
        for(int i = 0; i<n; i++) {
            for(int j=0; j<n; j++) {
                for(int k=0; k<n; k++) {
                    for(int l=0; l<n; l++) {
                        sum+=arr.get(i)*arr.get(j)*arr.get(k)*arr.get(l);
                    }
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_96a7521e_be68_4170_8859_88271d89b1df(ArrayList<Integer> arr) {
        int res = 0;
        if (arr.isEmpty())
            return 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int prod = arr.get(i) * arr.get(j);
                for (int k = j + 1; k < arr.size(); k++) {
                    prod *= arr.get(k);
                }
                res = res + prod;
            }
        }
        return res;
    }

    
    public static int sumOfSubarrayProd_Problem_0_51ca0613_137e_496d_bef3_858a0a48275d(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = product * arr.get(i);
                sum += product;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_50bb73d8_8b90_4dd5_b5fe_39684d514f1b(ArrayList<Integer> arr) {
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            int sum = 0;
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i);
            }
            ans += sum;
        }
        return ans;
    }

    
    public static int sumOfSubarrayProd_Problem_1_928dbf1b_423a_4849_96b3_02d9bb2ce10b(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_e3448ddb_7697_4988_bafd_fe6b04c85afe(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_fda6359b_26ff_4f86_90e2_bcf3b8fd3ccd(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_d8014098_9fd5_4550_b563_28ed29c74653(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_d57e3b62_dfc2_4a3b_a212_82348b7319a9(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_49439b4d_4eb7_43af_b8f4_1920a4c27587(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_7f11d78f_9131_414e_811f_e873da76720f(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    for (int l = k + 1; l < arr.size(); l++) {
                        sum += arr.get(i) * arr.get(j) * arr.get(k) * arr.get(l);
                    }
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_7d1f2b7b_c69b_464f_9784_e3cc7ffb8c2b(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_ecf9f063_ba19_4784_887e_9814127319a6(ArrayList<Integer> arr) {
        if (arr.size() == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int currVal = arr.get(i);
            if (i == 0) {
                sum += currVal;
            }
            for (int j = i; j < arr.size(); j++) {
                sum += currVal * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_a7022ab0_379b_40a5_a4bf_bd1814779f68(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_28cf5865_576a_475d_a4ad_1e6f61947efa(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int maxProduct = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = arr.get(i) * arr.get(j);
                sum += product;
                if(product > maxProduct) {
                    maxProduct = product;
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_2c6fab5a_4582_467f_91af_e3d53a3a5091(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_531cc976_cc1a_4676_a2ca_41f69d63d846(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_19cb42a8_9489_4875_8565_0d2e1bc7c4bf(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_51abe1dd_b068_4c87_911f_372e526850f2(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_d822026c_4db5_4312_b24a_01416f877d4b(ArrayList<Integer> arr) {
        // Write your code here
        if(arr.size()<=1){
            return 0;
        }
        int[] arr2 = new int[arr.size()];
        int[] res = new int[arr.size()];
        int ans = 0;
        for(int i=0;i<arr.size();i++){
            int j=i;
            int count=0;
            while(j<arr.size() && arr.get(j)==arr.get(i)){
                j++;
                count++;
            }
            if(count==0){
                arr2[i]=arr.get(i);
                res[i]=arr.get(i);
            }else{
                for(int k=i;k<arr.size();k++){
                    if(arr.get(k)!=arr.get(i)){
                        break;
                    }else{
                        if(j==arr.size()-1){
                            arr2[i]=arr.get(j);
                            res[i]=arr.get(j);
                            ans=ans+arr2[i]*res[i];
                        }else{
                            int temp = arr2[i];
                            arr2[i]=arr.get(j);
                            res[i]=arr.get(j);
                            ans=ans+temp*res[i];
                        }
                        j++;
                        count=0;
                    }
                }
            }
        }
        return ans;
    }

    
    public static int sumOfSubarrayProd_Problem_1_e967a67c_44e5_4865_979c_92bda1291bd8(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_b1fd710d_b88d_4b05_9f44_c17383b0af2a(ArrayList<Integer> arr) {
        int n = arr.size();
        int sum = 0;
        int result = 0;

        //System.out.println("The array is " + Arrays.toString(arr));

        for (int i = 0; i < n; i++) {
            int prod = 0;

            for (int j = i; j < n; j++) {
                prod += arr.get(i);
                result += (prod * arr.get(j));
            }

            sum += result;
            result = 0;
        }
        System.out.println(sum);
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_91d89062_604d_462a_92e9_b41cc40dc2be(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_dd16ebca_4513_499c_936c_ee63af1c9be8(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                temp = arr.get(i) * arr.get(j);
                sum += temp;
                product *= temp;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_ce8bee6c_a190_419d_9f7a_1ff707d1d089(ArrayList<Integer> arr) {
        int ans = 0;
        int n = arr.size();
        int cur = 0;
        for(int i = 0; i <n; i++) {
            for(int j = 0; j <n; j++) {
                cur = cur + arr.get(i) * arr.get(j);
            }
            ans = ans + cur;
            cur = 0;
        }
        return ans;
    }

    
    public static int sumOfSubarrayProd_Problem_2_c7f123d8_8fd4_4044_af54_30017e9caff6(ArrayList<Integer> arr) {
        int sum = 0;
        int arrSum = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int prod = arr.get(0) *  Math.pow(arr.size() - i, arr.size());
            prod *= arrSum;
            prod *= arr.get(i);
            sum += prod;
            arrSum += arr.get(i);
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_7e6d8143_23e9_495f_81f8_227c35f4cfc7(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int sumOfSubarrayProd_Problem_1_7e6d8143_23e9_495f_81f8_227c35f4cfc7 = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sumOfSubarrayProd_Problem_1_7e6d8143_23e9_495f_81f8_227c35f4cfc7 += arr.get(i) * arr.get(j);
            }
            sum += arr.get(i);
        }
        product = sumOfSubarrayProd_Problem_1_7e6d8143_23e9_495f_81f8_227c35f4cfc7;
        sum = sumOfSubarrayProd_Problem_1_7e6d8143_23e9_495f_81f8_227c35f4cfc7;
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_01e2617f_ba47_47b9_86da_254f16e55020(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_c7f123d8_8fd4_4044_af54_30017e9caff6(ArrayList<Integer> arr) {
        int sum = 0;
        int arrSum = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int prod = arr.get(0) *  Math.pow(arr.size() - i, arr.size());
            prod *= arrSum;
            prod *= arr.get(i);
            sum += prod;
            arrSum += arr.get(i);
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_059bdd8a_4e30_49f6_865e_067ea61f4a22(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_411e9847_f502_4a9b_a783_d9a632902762(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_9bffdf5d_feec_4c76_9cee_5700866d94e6(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_daab436f_f418_4a6f_9117_2010e4a796b8(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_cde93b53_ad97_48d5_bd57_e4ae240f8b58(ArrayList<Integer> arr) {
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            int curSum = 0;
            for (int j = 0; j < arr.size(); j++) {
                if (i != j) {
                    curSum = curSum + arr.get(j) * (arr.get(i + j) / 2);
                }
            }
            ans += curSum;
        }
        return ans;
    }

    
    public static int sumOfSubarrayProd_Problem_0_9c84ed62_3cb3_40bf_844e_94c3ac9cf6f7(ArrayList<Integer> arr) {
        int product = 1;
        for (Integer i : arr) {
            product *= i;
        }
        return product;
    }

    
    public static int sumOfSubarrayProd_Problem_2_6992aca9_bbdd_446c_98a7_884124a0df31(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i; j < arr.size(); j++) {
                for (int k = i; k < arr.size(); k++) {
                    for (int l = j; l < arr.size(); l++) {
                        sum += arr.get(i) * arr.get(j) * arr.get(k) * arr.get(l);
                    }
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_6297d499_864b_4a60_98a4_3f6cf5e23151(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_25a40014_68a2_452a_9793_777e7bc9862e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_e784b6d4_2812_45e0_ae2d_1b317579bec5(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_a1154d5a_427d_4067_8d67_f90d62833f26(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_e4900b4f_4bb6_4653_917c_89a777270d68(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod = prod * arr.get(k);
                }
                sum = sum + prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_355784ae_d5af_4a69_b7c0_40b1a70c711b(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_413ca459_6010_44f0_9287_0af2e31fe965(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_80864de3_8083_49ae_9904_76f8f67f525e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_31746dac_5582_48d6_9839_014b89e204b0(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int maxProduct = Integer.MAX_VALUE;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = arr.get(i) * arr.get(j);
                if(product > maxProduct) {
                    maxProduct = product;
                }
            }
            sum += maxProduct;
            maxProduct = 1;
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_4f164af6_d272_4160_b406_100dd3d35e94(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = product * arr.get(i);
                sum += product;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_81105219_ad03_427c_a6ce_ec3bddbc7fd9(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
                product *= arr.get(i);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_aac8490c_049d_4d8d_b0e2_36d47226f999(ArrayList<Integer> arr) {
        int sum = 0;
        int n = arr.size();
        int m = arr.stream().mapToInteger(Integer::intValue).sum();
        int max =  Math.pow(2, n);
        int curr = 1;
        int maxSum = 0;
        while (curr < max) {
            int sumOfSubarrayProd_Problem_1_aac8490c_049d_4d8d_b0e2_36d47226f999 = 1;
            for (int i = 0; i < n; i++) {
                sumOfSubarrayProd_Problem_1_aac8490c_049d_4d8d_b0e2_36d47226f999 *= (arr.get(i) / curr);
            }
            sum += sumOfSubarrayProd_Problem_1_aac8490c_049d_4d8d_b0e2_36d47226f999;
            curr++;
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_67f818d3_a6c6_4e00_b6a3_0c864e2f8dee(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
                product *= arr.get(i);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_7fda00bb_24c4_45e1_922e_1eba28ae9899(ArrayList<Integer> arr) {
        if(arr.isEmpty()){
            return 0;
        }
        int sum=0;
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<i;j++){
                sum+=arr.get(i);
            }
            sum-=arr.get(i);
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_925ce753_0459_49be_bf87_132433e89a1a(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_ff995f92_9451_47a5_b5d7_b3cc52fd424d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_f922dcd8_c994_4af2_adcb_80d0663d6d5e(ArrayList<Integer> arr) {
        int ans = 0;
        int sum = 0;
        int sum2 = 0;
        int sum3 = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                sum2 = sum + arr.get(j);
                sum3 = sum2 + arr.get(i);
                ans = ans + sum3;
            }
        }
        return ans;
    }

    
    public static int sumOfSubarrayProd_Problem_2_fe0c6589_20c4_410c_b8c5_9771debb700b(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_81b3cd39_4638_444a_8757_625fac4cbd36(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_852d764a_7f6e_42e5_88fa_b6d11bcbcb6c(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_0cccd6a7_06a9_4184_9e88_fd311f42718f(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_7d0e061b_e7da_4aeb_8d6a_369c000fd713(ArrayList<Integer> arr) {
        
        List<Integer> allSubarrays = arr;
        
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            
            int j = arr.size() - 1;
            while (j >=0) {
                
                int product = allSubarrays.get(i) * allSubarrays.get(j);
                allSubarrays.set(i,product);
                allSubarrays.set(j,product);
                
                sum+=product;
                
                j--;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_5a37a2b2_369a_4f93_8a90_ad1229b8224c(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int maxProduct = Integer.MAX_VALUE;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = product * arr.get(i);
                sum += product;
                maxProduct = Math.max(maxProduct, product);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_2c638e8a_2b96_4f21_8e1f_3a2893b96d1a(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_c56efd03_eebb_4f71_8255_b1665427634d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_6fd58d97_d3ff_44c1_8653_33d4606f8cea(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_230880ae_520b_44e9_9b7a_432ef5250a48(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_31746dac_5582_48d6_9839_014b89e204b0(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int maxProduct = Integer.MAX_VALUE;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = arr.get(i) * arr.get(j);
                if(product > maxProduct) {
                    maxProduct = product;
                }
            }
            sum += maxProduct;
            maxProduct = 1;
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_ba9baa22_4d60_48e5_ac19_18f19c31fab3(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum = (sum * arr.get(i)) + (arr.get(i) * arr.get(i + 1));
            sum += (arr.get(i) * arr.get(i + 1));
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_f4fa5f3b_3f23_4dc4_859f_d897940692ac(ArrayList<Integer> arr) {
        int prod = 1L;
        for(int i=0; i<arr.size(); i++) {
            int sum = 0;
            for(int j=0; j<arr.size(); j++) {
                if (j >= i) {
                    sum += arr.get(j);
                }
            }
            prod *= sum;
        }
        return prod;
    }

    
    public static int sumOfSubarrayProd_Problem_0_7f11d78f_9131_414e_811f_e873da76720f(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    for (int l = k + 1; l < arr.size(); l++) {
                        sum += arr.get(i) * arr.get(j) * arr.get(k) * arr.get(l);
                    }
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_9a57b877_b8f3_4e0f_8ce4_90f9d4bb39fe(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
                product *= arr.get(i);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_81105219_ad03_427c_a6ce_ec3bddbc7fd9(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
                product *= arr.get(i);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_4e89177e_c794_4b31_8de5_3c8a3abaa242(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_51ca0613_137e_496d_bef3_858a0a48275d(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = product * arr.get(i);
                sum += product;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_89ad2d40_1802_47da_86bb_c8d54699fa52(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_8234cc51_e1ef_4428_9cf4_02aa71cb72cc(ArrayList<Integer> arr) {
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++)
                product *= arr.get(j);
            result += product;
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_0_c7585f2a_432d_4ec1_bc77_6c879ece6c5d(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int maxSum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                int subArrSum = arr.get(i) * arr.get(j);
                sum += subArrSum;
                product *= subArrSum;
                if(subArrSum > maxSum) {
                    maxSum = subArrSum;
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_b6e21a90_e2ab_4ab6_9aaa_2ace0db83d05(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = product * arr.get(i);
                sum += product;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_2543c0da_e459_48e7_b7b7_368ec8b857c0(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    sum += arr.get(i) * arr.get(j) * arr.get(k);
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_c8f2516f_0287_4367_9919_f4ea4893874f(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_f57ef3ff_3ec0_4f08_a8bb_fc42603b747c(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_28cf5865_576a_475d_a4ad_1e6f61947efa(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int maxProduct = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = arr.get(i) * arr.get(j);
                sum += product;
                if(product > maxProduct) {
                    maxProduct = product;
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_bee9daa3_b386_458f_9bf7_62e5bb122132(ArrayList<Integer> arr) {
        int subarrayProd = 1;
        int result = 0;
        for (int i = 1; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                subarrayProd *= arr.get(i);
                subarrayProd *= arr.get(j);
                result += subarrayProd;
            }
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_0_1d1aa7b4_606a_488e_8c23_789e9d704318(ArrayList<Integer> arr) {
        int subArrSize=arr.size();
        if (arr.isEmpty())
            return 0;
        ArrayList<ArrayList<Integer>> subArrList = new ArrayList<ArrayList<Integer>>();
        int arrSum=arr.get(0);
        for (int i = 0; i < subArrSize - 1; i++) {
            ArrayList<Integer> subArr = new ArrayList<Integer>();
            int startIndex = i;
            for (int j = i + 1; j < subArrSize; j++) {
                int prod = arr.get(j) * arr.get(startIndex);
                subArr.add(prod);
                startIndex++;
            }
            subArrList.add(subArr);
        }
        for (int i = 0; i < subArrList.size(); i++) {
            int sum = 0;
            for (int j = 0; j < subArrList.get(i).size(); j++) {
                sum += subArrList.get(i).get(j);
            }
            arrSum += sum;
        }
        return arrSum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_56413eb3_433b_4670_8bb5_23ea520df155(ArrayList<Integer> arr) {
        int sum=0;
        for (int i=0; i<arr.size(); i++) {
            Integer l = arr.get(i);
            for (int j=i+1; j<arr.size(); j++) {
                Integer r = arr.get(j);
                sum += l*r;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_a00d17e1_d1c2_4d0f_b1a3_f4a2d018ed77(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_b7a84ef5_038f_4c19_a4fe_6b86aa5021df(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_7e2c2b71_0b25_43e5_8f83_0f4650758ed2(ArrayList<Integer> arr) {
        int product = 1;
        int sum = 0;
        for (int i = arr.size() - 1; i >= 0; i--) {
            for (int j = 0; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
            product = sum;
            sum = 0;
        }
        return product;
    }

    
    public static int sumOfSubarrayProd_Problem_1_3f4bc2a7_0c6a_4e2c_94b4_74804dcc8cf1(ArrayList<Integer> arr) {
        ArrayList<Integer> res = new ArrayList<>();
        int product;
        for(Integer x: arr) {
            product = 1;
            for(Integer y: arr) {
                product *= x;
                if(y != x) {
                    product *= y;
                }
            }
            res.add(product);
        }
        return res.stream().mapToInteger(x -> x).sum();
    }

    
    public static int sumOfSubarrayProd_Problem_1_bfdc069b_50d9_4214_a09e_ef1e2f40afa8(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_7e18a86c_a4a0_4451_ba30_29ac62f945f6(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_7d0e061b_e7da_4aeb_8d6a_369c000fd713(ArrayList<Integer> arr) {
        
        List<Integer> allSubarrays = arr;
        
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            
            int j = arr.size() - 1;
            while (j >=0) {
                
                int product = allSubarrays.get(i) * allSubarrays.get(j);
                allSubarrays.set(i,product);
                allSubarrays.set(j,product);
                
                sum+=product;
                
                j--;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_1bf4f33d_9f1c_44ab_b1da_58bdb130854c(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                int prod = 1;
                for(int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_53f1118a_1a14_41bc_aa6e_e2eadd10b9ab(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_5fae3858_96de_474f_bd3c_101e29163c1a(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i=0;i<arr.size()-1;i++){
            int arrSum = 0;
            for(int j=0;j<arr.size()-i;j++){
                arrSum += arr.get(i+j);
            }
            sum += arrSum;
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_0c7955b0_0044_49a3_bb08_de5d6381b6a2(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_de788be9_d66b_4a83_af4a_020e4b8799e7(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_6cb27b44_049b_4996_ae9f_25d34a53f54b(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_deac3a5c_66ec_48bc_b6a7_63c63f3466ce(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_0e4c0652_b906_4625_a095_66ac9d4bfd97(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_0dcbcda9_32cc_4b79_bc8d_71a5d20dba83(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                temp = arr.get(i) * arr.get(j);
                sum += temp;
                product *= temp;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_8e60b0ce_5a35_401f_b1a2_637618084eda(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_6fd58d97_d3ff_44c1_8653_33d4606f8cea(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_5eb78e35_4801_4f5c_80f7_ff40a8e01e71(ArrayList<Integer> arr) {
        int result = 0;
        int n = arr.size();
        int m = 2;

        //To find the sum of all possible subarray lists 
        while(m * n <= arr.size()){
            for(int i = n; i >= 0; i--){
                if(arr.get(i) >= m){
                    result = result + arr.get(i);
                }
            }
            n++;
            m++;
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_0_30176064_363a_42b4_84c9_cf43d48fd621(ArrayList<Integer> arr) {
        int sum = 0;
        int n = arr.size();
        for (int i = 1; i < n; i++) {
            sum *= i;
            for (int j = i; j < n; j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_b88c6a72_cca8_4d47_b20f_0bf32b682f8f(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_1e99b4ec_f595_4c4a_9707_edee207c28d9(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_88cc460d_5b2e_4aca_9600_f49910868083(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                for(int k = i; k < arr.size(); k++) {
                    for(int l = j; l < arr.size(); l++) {
                        sum += arr.get(i) * arr.get(j) * arr.get(k) * arr.get(l);
                        product *= arr.get(i);
                    }
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_a9d2ab51_1e96_4eef_af6b_7302d918b2fa(ArrayList<Integer> arr) {
        
        int sum = 1;
        // for getting all possible subarrays of a given array
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                sum = sum + product;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_e6acfab3_fd66_47fa_b353_3051bfcea7c3(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i) * arr.get(i);
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_32fc9455_2658_4ec1_825e_29afed184dd3(ArrayList<Integer> arr) {
        int res = 0;
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        ArrayList<Integer> a3 = new ArrayList<>();
        ArrayList<Integer> a4 = new ArrayList<>();
        
        for(int i = 0; i < arr.size(); i++) {
            a1.add(i, arr.get(i));
            a2.add(i, arr.get(i+1));
            a3.add(i, arr.get(i+2));
            a4.add(i, arr.get(i+3));
        }
        
        for(int i = 0; i < a1.size(); i++) {
            res += a1.get(i) * a2.get(i) * a3.get(i) * a4.get(i);
        }
        return res;
    }

    
    public static int sumOfSubarrayProd_Problem_0_deac3a5c_66ec_48bc_b6a7_63c63f3466ce(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_f7dbfd63_4607_4e95_851d_8a9213584ac9(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_c002740e_98ad_417f_bb03_4df8b093dc53(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_a884d798_9fe5_4ff2_9e51_aee51292960d(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer l : arr) {
            for (Integer r : arr) {
                if (l < r) {
                    sum += l * r;
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_433570b3_5cf5_48fc_adb7_2fe4abf0ae7a(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_f7dbfd63_4607_4e95_851d_8a9213584ac9(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_7e2c2b71_0b25_43e5_8f83_0f4650758ed2(ArrayList<Integer> arr) {
        int product = 1;
        int sum = 0;
        for (int i = arr.size() - 1; i >= 0; i--) {
            for (int j = 0; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
            product = sum;
            sum = 0;
        }
        return product;
    }

    
    public static int sumOfSubarrayProd_Problem_1_e04c5702_e4e6_4c5b_ab4c_ee0581f0690b(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
                product *= arr.get(i);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_fe0578bb_aa34_4d12_b5c5_be89bea38149(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_211272e6_713d_45da_b2a1_ec9ccb715eff(ArrayList<Integer> arr) {
        int ans = 0;
        int k = arr.size();
        int n = arr.size();
        int cnt = 0;
        while (k >= 0) {
            int idx = k;
            while (idx >= 0 && cnt < n) {
                ans = ans + arr.get(idx);
                cnt++;
                idx--;
            }
            k--;
        }
        return ans;
    }

    
    public static int sumOfSubarrayProd_Problem_0_1e629d1f_13c5_41c7_a405_006620e9e5c0(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_107dea2c_fb54_4803_8225_9d2c2f415340(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_bee9daa3_b386_458f_9bf7_62e5bb122132(ArrayList<Integer> arr) {
        int subarrayProd = 1;
        int result = 0;
        for (int i = 1; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                subarrayProd *= arr.get(i);
                subarrayProd *= arr.get(j);
                result += subarrayProd;
            }
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_2_38060416_06e7_47ea_ba42_57d25fb43650(ArrayList<Integer> arr) {
        int sum = 0;
        int prod = 1;
        for(int i = 0; i < arr.size(); i++) {
            prod = prod * arr.get(i);
        }
        for(int i = 0; i < arr.size(); i++) {
            for(int j = 0; j < arr.size(); j++) {
                sum = sum + prod * arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_752e5227_df20_4a34_beea_4bdaf8c0201c(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum = sum + arr.get(i) * arr.get(j);
                product = product * arr.get(i);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_d54e788a_0d67_460b_8b10_aaa1ef50a276(ArrayList<Integer> arr) {
        ArrayList<Integer> sublist = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i+1; j < arr.size(); j++) {
                sublist.add(arr.get(i) * arr.get(j));
            }
        }
        for (int i = 0; i < sublist.size(); i++) {
            sum = sum + sublist.get(i);
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_5ce5ed64_514f_4d20_a193_0d6ccd444062(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_7059db19_534d_4b05_b6f4_55ad1e88f819(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_d3c6b73c_4b8b_4e4b_9cb7_5af8e9355405(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_f93cc416_14c3_4b97_8955_e59b7976019d(ArrayList<Integer> arr) {
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                result += arr.get(i) * arr.get(j);
            }
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_1_28cf5865_576a_475d_a4ad_1e6f61947efa(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int maxProduct = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = arr.get(i) * arr.get(j);
                sum += product;
                if(product > maxProduct) {
                    maxProduct = product;
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_826e453b_a211_46b8_980d_0774241d8ebf(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_fea056b2_4700_458a_bc1e_ae6c6522a648(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum =  (sum * arr.get(i) * arr.get(j)) +  arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_30062e6c_dbe5_4cb3_96f0_535ddea18db5(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    sum += arr.get(i) * arr.get(j) * arr.get(k);
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_2a1746d2_e7ef_42c1_bd0c_7ed76b3bc342(ArrayList<Integer> arr) {
        int length = arr.size();
        int res = 0;
        for (int i=0; i<length; i++){
            int prod = 1;
            for (int j=i; j<length; j++){
                prod *= arr.get(i);
                prod *= arr.get(j);
            }
            res+=prod;
        }
        return res;
    }

    
    public static int sumOfSubarrayProd_Problem_2_32fc9455_2658_4ec1_825e_29afed184dd3(ArrayList<Integer> arr) {
        int res = 0;
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        ArrayList<Integer> a3 = new ArrayList<>();
        ArrayList<Integer> a4 = new ArrayList<>();
        
        for(int i = 0; i < arr.size(); i++) {
            a1.add(i, arr.get(i));
            a2.add(i, arr.get(i+1));
            a3.add(i, arr.get(i+2));
            a4.add(i, arr.get(i+3));
        }
        
        for(int i = 0; i < a1.size(); i++) {
            res += a1.get(i) * a2.get(i) * a3.get(i) * a4.get(i);
        }
        return res;
    }

    
    public static int sumOfSubarrayProd_Problem_2_fda6359b_26ff_4f86_90e2_bcf3b8fd3ccd(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_9e46399d_02d2_4495_a720_e6579906ac48(ArrayList<Integer> arr) {
        // Write your code here
        return 0;
    }

    
    public static int sumOfSubarrayProd_Problem_2_5eb78e35_4801_4f5c_80f7_ff40a8e01e71(ArrayList<Integer> arr) {
        int result = 0;
        int n = arr.size();
        int m = 2;

        //To find the sum of all possible subarray lists 
        while(m * n <= arr.size()){
            for(int i = n; i >= 0; i--){
                if(arr.get(i) >= m){
                    result = result + arr.get(i);
                }
            }
            n++;
            m++;
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_0_ed5c2f64_7558_4ad8_ac60_03127ae75ba9(ArrayList<Integer> arr) {
        int result = 0;
        int i = 0;
        while (i < arr.size()) {
            int j = i;
            while (j < arr.size() && j + 1 < arr.size()) {
                result += (arr.get(i) * arr.get(j + 1) );
                j++;
            }
            i++;
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_1_628a9e61_1403_4dcf_9abf_ed817bbd5c84(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_2543c0da_e459_48e7_b7b7_368ec8b857c0(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    sum += arr.get(i) * arr.get(j) * arr.get(k);
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_7b2bdf20_ff24_4922_8dcc_8f0834525e8c(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
                product *= arr.get(i);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_32fc9455_2658_4ec1_825e_29afed184dd3(ArrayList<Integer> arr) {
        int res = 0;
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        ArrayList<Integer> a3 = new ArrayList<>();
        ArrayList<Integer> a4 = new ArrayList<>();
        
        for(int i = 0; i < arr.size(); i++) {
            a1.add(i, arr.get(i));
            a2.add(i, arr.get(i+1));
            a3.add(i, arr.get(i+2));
            a4.add(i, arr.get(i+3));
        }
        
        for(int i = 0; i < a1.size(); i++) {
            res += a1.get(i) * a2.get(i) * a3.get(i) * a4.get(i);
        }
        return res;
    }

    
    public static int sumOfSubarrayProd_Problem_2_5fae3858_96de_474f_bd3c_101e29163c1a(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i=0;i<arr.size()-1;i++){
            int arrSum = 0;
            for(int j=0;j<arr.size()-i;j++){
                arrSum += arr.get(i+j);
            }
            sum += arrSum;
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_dcc8751e_9ffb_456e_bc77_47fcbe109dac(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_66c42348_759a_473d_bd58_f462cc174662(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_beb16cb5_643c_42e7_9205_54e28122db69(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_f922dcd8_c994_4af2_adcb_80d0663d6d5e(ArrayList<Integer> arr) {
        int ans = 0;
        int sum = 0;
        int sum2 = 0;
        int sum3 = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                sum2 = sum + arr.get(j);
                sum3 = sum2 + arr.get(i);
                ans = ans + sum3;
            }
        }
        return ans;
    }

    
    public static int sumOfSubarrayProd_Problem_0_9b5efd85_90b9_4e75_8688_b3e9652e3b44(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_cf4620e2_3623_4191_a085_a89886259b1b(ArrayList<Integer> arr) {
        int res = 0;
        for(int i : arr) {
            res = res + i;
        }
        return res;
    }

    
    public static int sumOfSubarrayProd_Problem_1_2543c0da_e459_48e7_b7b7_368ec8b857c0(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    sum += arr.get(i) * arr.get(j) * arr.get(k);
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_256bedf9_f811_4b58_9325_e579404e2679(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_9da34696_e416_4e2e_a17e_c7e45c340c61(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_e053f9fd_56c9_4c24_888c_e154d2ed9f5d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_d4365610_175e_44c5_a155_ce64732aa2b1(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_7b2bdf20_ff24_4922_8dcc_8f0834525e8c(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
                product *= arr.get(i);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_37e246f6_bd7f_4566_acdf_8987d3e3fd07(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_bee9f261_b3c4_40cc_974b_e455cc96da4d(ArrayList<Integer> arr) {
        int ans = 1;
        
        
        return ans;
        
    }

    
    public static int sumOfSubarrayProd_Problem_1_2791ae15_3dd7_4f19_b1ec_a28bd355de7c(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_c7585f2a_432d_4ec1_bc77_6c879ece6c5d(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int maxSum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                int subArrSum = arr.get(i) * arr.get(j);
                sum += subArrSum;
                product *= subArrSum;
                if(subArrSum > maxSum) {
                    maxSum = subArrSum;
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_6bb1d801_2c2f_43c1_8f59_47ff4d22f934(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_8036023a_5b8f_4aab_b9b0_0151a39a7415(ArrayList<Integer> arr) {
        int sum = 0;
        int result = 0;
        int temp;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                temp = arr.get(i) * arr.get(j);
                result += temp;
                sum += temp;
            }
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_2_31746dac_5582_48d6_9839_014b89e204b0(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int maxProduct = Integer.MAX_VALUE;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = arr.get(i) * arr.get(j);
                if(product > maxProduct) {
                    maxProduct = product;
                }
            }
            sum += maxProduct;
            maxProduct = 1;
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_dd4cc812_eee5_4ac7_9adf_0b9bf57a3238(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_d21a6fa6_f3d2_4a8a_993e_3340809b5ddd(ArrayList<Integer> arr) {
        // Write your code in here
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int j = 0;
            while (j < arr.size() && j < i) {
                sum += arr.get(i) * arr.get(j);
                j++;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_5c808fc3_35f6_40d2_9fd6_12efa245617a(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                for(int k=j+1;k<arr.size();k++){
                    for(int l=k+1;l<arr.size();l++){
                        sum+=arr.get(i)*arr.get(j)*arr.get(k)*arr.get(l);
                    }
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_fe0c6589_20c4_410c_b8c5_9771debb700b(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_96a7521e_be68_4170_8859_88271d89b1df(ArrayList<Integer> arr) {
        int res = 0;
        if (arr.isEmpty())
            return 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int prod = arr.get(i) * arr.get(j);
                for (int k = j + 1; k < arr.size(); k++) {
                    prod *= arr.get(k);
                }
                res = res + prod;
            }
        }
        return res;
    }

    
    public static int sumOfSubarrayProd_Problem_0_e48ec86a_f5ee_4ce0_bbca_01506737e850(ArrayList<Integer> arr) {
        int ans = 0;
        for(int i = 0; i <arr.size(); i++) {
            for(int j = i; j <arr.size(); j++) {
                int prod = 1;
                for (int k = i; k < arr.size(); k++) {
                    prod *= arr.get(k);
                }
                ans += prod;
            }
        }
        return ans;
    }

    
    public static int sumOfSubarrayProd_Problem_1_d18d1f1b_25d8_416e_b455_2821fa1a1cc3(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_af606434_c654_4bec_abb2_2c9f6d8c9120(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int maxProduct = Integer.MAX_VALUE;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = arr.get(i) * arr.get(j);
                if(product > maxProduct) {
                    maxProduct = product;
                }
                sum += product;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_8a1cffc1_be33_4259_915c_063f2ea82958(ArrayList<Integer> arr) {
        // write your code here
        int result = 0;
        boolean first = True;
        for(int i = 0; i<arr.size(); i++){
            for(int j = 0; j<arr.size(); j++){
                if(i==j){
                    if(!first){
                        result += arr.get(i)*arr.get(j);
                    }
                    first = False;
                }
                else{
                    for(int k = 0; k<arr.size(); k++){
                        for(int l = 0; l<arr.size(); l++){
                            if(i+k==j+l){
                                if(!first){
                                    result += arr.get(i)*arr.get(j)*arr.get(k)*arr.get(l);
                                }
                                first = False;
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_0_28bd1e3a_bb1b_4c27_900c_d1471d1c78ad(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_4673f772_ebc1_44ec_97f5_e582f2d52679(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                temp = arr.get(i) * arr.get(j);
                sum += temp;
                product *= temp;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_3d26db09_26ec_4064_a295_cd39f462e732(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_81105219_ad03_427c_a6ce_ec3bddbc7fd9(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
                product *= arr.get(i);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_010906f6_0bee_46ea_8128_3fe8e36408c7(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_eb587cda_f420_4087_9b6c_b14419f7f1c6(ArrayList<Integer> arr) {
        ArrayList<Integer> sublist = new ArrayList<Integer>();
        int sum = 0;
        for(int i=0; i<arr.size(); i++) {
            for(int j=0; j<arr.size(); j++) {
                if(j==i) continue;
                if(j>i) sublist.add(arr.get(i)*arr.get(j));
            }
            sum += sublist.get(sublist.size()-1);
            sublist.remove(sublist.size()-1);
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_6e6499e1_0ef6_4364_9787_0bc56552bf18(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i=0; i < arr.size(); i++) {
            for(int j=i+1; j < arr.size(); j++) {
                for(int k=j+1; k < arr.size(); k++) {
                    for (int m = k+1; m < arr.size(); m++) {
                        sum += arr.get(i)*arr.get(j)*arr.get(k)*arr.get(m);
                    }
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_9e260a83_992e_4960_a527_a2ab9cedafc3(ArrayList<Integer> arr) {
        int n = arr.size();
        int sum = 0;
        int prod = 1;
        int subProd = 1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    subProd *= arr.get(k);
                    subProd *= arr.get(j);
                    subProd *= arr.get(i);
                    sum += subProd;
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_113c1117_bfd4_44a1_8ff5_aa26a327adcc(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_211272e6_713d_45da_b2a1_ec9ccb715eff(ArrayList<Integer> arr) {
        int ans = 0;
        int k = arr.size();
        int n = arr.size();
        int cnt = 0;
        while (k >= 0) {
            int idx = k;
            while (idx >= 0 && cnt < n) {
                ans = ans + arr.get(idx);
                cnt++;
                idx--;
            }
            k--;
        }
        return ans;
    }

    
    public static int sumOfSubarrayProd_Problem_0_1210d22b_3cab_446e_bae4_b85fda7d0ca4(ArrayList<Integer> arr) {
        // write your code here
        ArrayList<Integer> sub = new ArrayList<>(arr);
        sub.remove(arr.size()-1);
        sub.remove(sub.size() - 1);
        int sum=0;
        for(int i=0;i<arr.size();i++){
            for(int j=i;j<arr.size();j++){
                int prod=1;
                for(int k=0;k<arr.size();k++){
                    prod=prod*arr.get(k);
                }
                sum=sum+prod*sub.get(j);
            }
            sub.remove(i);
            sub.remove(i);
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_12dc65e4_4bb2_4d85_957b_682270ae5731(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int sumOfSubarrayProd_Problem_0_12dc65e4_4bb2_4d85_957b_682270ae5731 = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sumOfSubarrayProd_Problem_0_12dc65e4_4bb2_4d85_957b_682270ae5731 += arr.get(i) * arr.get(j);
            }
            sum += arr.get(i);
            product = arr.get(i) * product;
        }
        sumOfSubarrayProd_Problem_0_12dc65e4_4bb2_4d85_957b_682270ae5731 = sumOfSubarrayProd_Problem_0_12dc65e4_4bb2_4d85_957b_682270ae5731 * product;
        return sumOfSubarrayProd_Problem_0_12dc65e4_4bb2_4d85_957b_682270ae5731;
    }

    
    public static int sumOfSubarrayProd_Problem_0_2c6fab5a_4582_467f_91af_e3d53a3a5091(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_efb9d007_cf4b_4d3c_97c2_61985592c27f(ArrayList<Integer> arr) {
        // TODO

        int sum = 0;
        for(int x : arr) {
            int product = 1;
            for(int i : arr) {
                product = product * i;
            }
            sum = sum + product;
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_f8b9461c_9d6c_4953_b4f0_ed1e708fa324(ArrayList<Integer> arr) {
        if(arr.size() == 0){
            return 0;
        }
        int product = arr.get(0);
        for(int i=1;i<arr.size();i++){
            product *= arr.get(i);
        }
        return product;
    }

    
    public static int sumOfSubarrayProd_Problem_1_66c42348_759a_473d_bd58_f462cc174662(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_e8f8e90b_9bf2_4f27_893d_15a2e28a58e8(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_e3448ddb_7697_4988_bafd_fe6b04c85afe(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_670f4971_ec48_4bc7_aaf4_5bb0848903d9(ArrayList<Integer> arr) {
        int sum = 0;
        int size = arr.size();
        int limit = size - 1;

        // loop over all possible subarrays
        for (int i = size - 1; i >= 0; i--) {
            int k = i + 1;

            // loop over all possible sub-sub-arrays
            for (int j = i - 1; j >= k; j--) {
                sum += arr.get(j) * arr.get(k);

                // stop when array is exhausted
                if (j == 0) break;

                // continue looping for the remaining elements
                k--;
            }

            // stop when sub-array is exhausted
            if (k == 0) break;

            // continue looping for the remaining elements
            i--;
        }

        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_cf4620e2_3623_4191_a085_a89886259b1b(ArrayList<Integer> arr) {
        int res = 0;
        for(int i : arr) {
            res = res + i;
        }
        return res;
    }

    
    public static int sumOfSubarrayProd_Problem_2_81b3cd39_4638_444a_8757_625fac4cbd36(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_47512af3_e41e_4304_997b_8e5d33e7bc7f(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_91d89062_604d_462a_92e9_b41cc40dc2be(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_13f8ee8a_ea25_4c2f_a68a_c827caffb797(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_eb009880_b5bf_475d_a61c_7c191f4e016d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_cc41f43b_6955_435f_8be6_2c4f23066176(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_de5b5758_e217_4e26_80a7_e3513202dcf1(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_46917396_9cbd_4109_a032_dbcd8fedfdbf(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_1210d22b_3cab_446e_bae4_b85fda7d0ca4(ArrayList<Integer> arr) {
        // write your code here
        ArrayList<Integer> sub = new ArrayList<>(arr);
        sub.remove(arr.size()-1);
        sub.remove(sub.size() - 1);
        int sum=0;
        for(int i=0;i<arr.size();i++){
            for(int j=i;j<arr.size();j++){
                int prod=1;
                for(int k=0;k<arr.size();k++){
                    prod=prod*arr.get(k);
                }
                sum=sum+prod*sub.get(j);
            }
            sub.remove(i);
            sub.remove(i);
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_4f1fa356_346b_4a02_83e5_c21c5b66cc7b(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_69f72949_5758_49d7_ae92_20afbbfbe4e3(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_5af8bf07_bfbf_478f_a731_a91b06246e2d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_211272e6_713d_45da_b2a1_ec9ccb715eff(ArrayList<Integer> arr) {
        int ans = 0;
        int k = arr.size();
        int n = arr.size();
        int cnt = 0;
        while (k >= 0) {
            int idx = k;
            while (idx >= 0 && cnt < n) {
                ans = ans + arr.get(idx);
                cnt++;
                idx--;
            }
            k--;
        }
        return ans;
    }

    
    public static int sumOfSubarrayProd_Problem_1_1fb80750_0969_4526_9656_4da147fe7835(ArrayList<Integer> arr) {
        int ans = 0;
        // O(n)
        for(int i = 0; i < arr.size(); i++) {
            // O(n)
            for(int j = i + 1; j < arr.size(); j++) {
                // O(1)
                int product = 1;
                // O(n)
                for(int k = 0; k < arr.size(); k++) {
                    // O(n)
                    product *= arr.get(k);
                }
                // O(n^2)
                ans += product;
            }
        }
        return ans;
    }

    
    public static int sumOfSubarrayProd_Problem_0_072da77e_5d25_480e_b4f4_2aa9244ba86c(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_c84e3554_289a_4eb7_8d5e_a5532bdc4ebb(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
                product *= arr.get(i);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_b1f69cf3_27a0_45a3_99e3_38b3db2d426f(ArrayList<Integer> arr) {
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                ans += arr.get(i) * arr.get(j);
            }
        }
        return ans;
    }

    
    public static int sumOfSubarrayProd_Problem_0_928dbf1b_423a_4849_96b3_02d9bb2ce10b(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_826e453b_a211_46b8_980d_0774241d8ebf(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_e053f9fd_56c9_4c24_888c_e154d2ed9f5d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_a884d798_9fe5_4ff2_9e51_aee51292960d(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer l : arr) {
            for (Integer r : arr) {
                if (l < r) {
                    sum += l * r;
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_3c3e2fad_3ca8_4597_b923_5f1d4f84adfa(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_8aa0f381_3608_4e7a_8efc_3affb57b3e98(ArrayList<Integer> arr) {
        int result = 1;
        int prev = 0;
        for( int i = 1 ; i <arr.size() ; i++ ) {
            int sum = 0;
            for( int j = 1 ; j < arr.size() - i ; j++ ) {
                sum += prev * arr.get(j);
            }
            result += sum;
            prev = arr.get(i);
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_0_a0a9a16f_cdf6_4bac_9cf2_f15e9513f921(ArrayList<Integer> arr) {
        int result = 0;
        // iterate the array
        for (int i : arr) {
            int j = i;
            // find the sum of the products
            while (j > 0) {
                result += (i / j);
                j--;
            }
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_0_80864de3_8083_49ae_9904_76f8f67f525e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_b13ab01e_6ced_4fe7_a640_3ded00ad7687(ArrayList<Integer> arr) {
        int res = 0;
        for (Integer l : arr) {
            res = res * l;
        }
        return res;
    }

    
    public static int sumOfSubarrayProd_Problem_0_8eaf6f35_071a_4321_bd39_cfb7853a53ea(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_98eb3485_988f_4803_9d5c_1fb983bad577(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_4ec61d3a_6fd9_4ba2_8134_a8af6f610aea(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_8d470ab0_daba_4417_af4e_6ff3e34a45ed(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_42e8f39d_6190_4a46_b02c_65a507554b72(ArrayList<Integer> arr) {
        int sum = 0;
        final int N = arr.size();
        int[] nums = new int[N];
        Arrays.fill(nums, Integer.MAX_VALUE);
        for(int i = 0; i < N; i++) {
            for(int j = i; j < N; j++){
                nums[i] = Math.max(0, nums[i] + arr.get(i));
                nums[j] = Math.max(0, nums[j] + arr.get(j));
                sum += nums[i];
                sum += nums[j];
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_7a1565c2_5f71_426c_9dd9_cd66a649352d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_b20f774b_1bd1_4a8e_8883_00c1470253c2(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_5af8bf07_bfbf_478f_a731_a91b06246e2d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_2e0421ab_95e4_474a_a25d_369ba1ac17be(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
                product *= arr.get(i);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_daa4aa4e_4a55_4c01_b13b_b94ee3a90fed(ArrayList<Integer> arr) {
        // sum of all possible subarray
        int s = IntegerStream.rangeClosed(0, arr.size() - 1).sum();

        // sum of products of all possible subarray
        for (int i = 0; i < arr.size() - 1; i++) {
            int prod = 1L;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(i);
                prod *= arr.get(j);
            }
            s += prod;
        }
        return s;
    }

    
    public static int sumOfSubarrayProd_Problem_1_73a52c84_024b_40da_9c7d_f2bd63c7ea6f(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_59203117_f2b2_4d18_b13e_4ea7951189e9(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_80abf20d_7e49_45cf_b444_be4a89c54894(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_9a949818_41a1_47d7_93b0_2b5fc24c70bd(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_d9bd9dce_0fb4_404b_938e_e387aa86f28e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_ce1fca36_471d_4f4e_8676_1f2a6d522b52(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_cb90b369_6565_4dee_b4b9_1ef3fdd475af(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_005f9c2b_8a2c_4317_9665_d75bd25d9c09(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_08186fca_889f_4356_84fa_2042a132f873(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_a58f251f_a538_43b0_a131_e81fecc4eed9(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            for(Integer j : arr) {
                int product = 1;
                for(int k = 0; k < arr.size(); k++) {
                    product = product * i;
                }
                sum += product;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_efb9d007_cf4b_4d3c_97c2_61985592c27f(ArrayList<Integer> arr) {
        // TODO

        int sum = 0;
        for(int x : arr) {
            int product = 1;
            for(int i : arr) {
                product = product * i;
            }
            sum = sum + product;
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_1fb80750_0969_4526_9656_4da147fe7835(ArrayList<Integer> arr) {
        int ans = 0;
        // O(n)
        for(int i = 0; i < arr.size(); i++) {
            // O(n)
            for(int j = i + 1; j < arr.size(); j++) {
                // O(1)
                int product = 1;
                // O(n)
                for(int k = 0; k < arr.size(); k++) {
                    // O(n)
                    product *= arr.get(k);
                }
                // O(n^2)
                ans += product;
            }
        }
        return ans;
    }

    
    public static int sumOfSubarrayProd_Problem_2_3f4bc2a7_0c6a_4e2c_94b4_74804dcc8cf1(ArrayList<Integer> arr) {
        ArrayList<Integer> res = new ArrayList<>();
        int product;
        for(Integer x: arr) {
            product = 1;
            for(Integer y: arr) {
                product *= x;
                if(y != x) {
                    product *= y;
                }
            }
            res.add(product);
        }
        return res.stream().mapToInteger(x -> x).sum();
    }

    
    public static int sumOfSubarrayProd_Problem_1_39e085ff_fc11_4a90_b4f9_a58d18fe7e9e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_16dba0d6_f17e_41d6_98af_a8d43b4025cf(ArrayList<Integer> arr) {
        int n = arr.size();
        if (n == 0) {
            return 0;
        }
        int res = 0;
        int maxN = Integer.MAX_VALUE / arr.get(0);
        int minN = -Integer.MAX_VALUE / arr.get(0);
        // For all possible sum
        for (int i = 1; i <= maxN; i++) {
            int prod = 1;
            for (int j = 0; j < n; j++) {
                // For all possible subsets of list
                for (int k = minN; k <= maxN; k++) {
                    prod *= (arr.size() - j - k) * (k - arr.get(j)) * (arr.get(j) + k);
                }
            }
            res = res + prod;
        }
        return res;
    }

    
    public static int sumOfSubarrayProd_Problem_0_8c36ebff_5e83_472e_a78a_708d15e2704d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_b20f774b_1bd1_4a8e_8883_00c1470253c2(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_3fe23aee_130a_40f2_9713_e7847bfcae59(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_cbf9ec37_23f5_4bd6_8162_7e8f43035b3f(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_97c28585_6ab6_413f_a30b_e6f549f0af47(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_7e18a86c_a4a0_4451_ba30_29ac62f945f6(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_bd6a9c63_d4d1_4428_9b69_220e24d1d451(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_c7585f2a_432d_4ec1_bc77_6c879ece6c5d(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int maxSum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                int subArrSum = arr.get(i) * arr.get(j);
                sum += subArrSum;
                product *= subArrSum;
                if(subArrSum > maxSum) {
                    maxSum = subArrSum;
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_fcf9c9b6_a86a_4b65_b795_ed4c9d3ece73(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = product * arr.get(i);
                sum += product;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_1ad6c89f_ae00_41b2_8223_e95b8b474cfa(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_5ab8253e_b2f3_4158_b15b_0b80e42bc0c4(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_230880ae_520b_44e9_9b7a_432ef5250a48(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_f1aadade_b312_455f_84c3_b5d496269ed2(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                temp = arr.get(i) * arr.get(j);
                sum += temp;
                product *= temp;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_80abf20d_7e49_45cf_b444_be4a89c54894(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_d85d4c1b_11e8_415a_a56c_1b46454ae603(ArrayList<Integer> arr) {
        if (arr.isEmpty()) return 0;
        int sum = 0;
        for (int a: arr) {
            for (int b: arr) {
                for (int c: arr) {
                    sum += a * b * c;
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_411e9847_f502_4a9b_a783_d9a632902762(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_51db765d_bfba_4aef_89ed_3d62617f34e2(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_26c133d3_9d5f_459c_a073_e292eb92e73d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_c114c96a_a493_440f_92ca_e85ee212e36a(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_7dd9730a_0f39_4e7d_9640_e724aba16607(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_08186fca_889f_4356_84fa_2042a132f873(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_d9bd9dce_0fb4_404b_938e_e387aa86f28e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_2ea17794_ec60_45dd_a421_e2c1bcb80c4e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_5e899124_5139_4ffa_89d0_6b1acffc3218(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_7fda00bb_24c4_45e1_922e_1eba28ae9899(ArrayList<Integer> arr) {
        if(arr.isEmpty()){
            return 0;
        }
        int sum=0;
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<i;j++){
                sum+=arr.get(i);
            }
            sum-=arr.get(i);
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_cc12c626_cd4c_46f4_8500_9ac0c52e9305(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_e328487e_f8ff_4837_ac14_5ef7d12ada2d(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_17d66729_3856_4ce9_ac98_b702b57f8a3c(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_46daf0ec_27c2_4b88_9684_af30dc366eb1(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_6910ed68_0712_4751_a095_240df08df727(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_dd4cc812_eee5_4ac7_9adf_0b9bf57a3238(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_b7a84ef5_038f_4c19_a4fe_6b86aa5021df(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_150d48cd_96de_4863_af6d_28032fb49f53(ArrayList<Integer> arr) {
        //Your code here
        int sum = 0;
        for(int i=0;i<arr.size();i++)
        {
            sum+=arr.get(i);
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_37641d7f_d91e_4da5_81bd_ae734a7bdcfd(ArrayList<Integer> arr) {
        int result = 1;
        int size = arr.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                int product = arr.get(i) * arr.get(j);
                result *= product;
            }
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_1_0d8df97c_4160_4665_b7b4_4685fab0f99e(ArrayList<Integer> arr) {
        // your code here
        return 0;
    }

    
    public static int sumOfSubarrayProd_Problem_1_af606434_c654_4bec_abb2_2c9f6d8c9120(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int maxProduct = Integer.MAX_VALUE;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = arr.get(i) * arr.get(j);
                if(product > maxProduct) {
                    maxProduct = product;
                }
                sum += product;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_5e899124_5139_4ffa_89d0_6b1acffc3218(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_3c3e2fad_3ca8_4597_b923_5f1d4f84adfa(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_1aabed67_1acb_4ae5_ab52_de886bd7e967(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_8e60b0ce_5a35_401f_b1a2_637618084eda(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_c082b621_7c58_4edf_aa0a_cc158898d8dc(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_c32389e0_07da_4975_8290_1ac8e41157cf(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int maxProduct = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = arr.get(i) * arr.get(j);
                sum += product;
                if(product > maxProduct) {
                    maxProduct = product;
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_10c6cb71_680f_4537_a7f7_a154938d065f(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_81b3cd39_4638_444a_8757_625fac4cbd36(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_c114c96a_a493_440f_92ca_e85ee212e36a(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_e2def06c_2fae_4c21_b342_c2fa9c9a6f0b(ArrayList<Integer> arr) {
        int sum = 0; 
        for(int i = arr.size() - 1; i >= 0; i--) {
            for(int j = 0; j < arr.size(); j++) {
                if(i != j)
                    sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_cc12c626_cd4c_46f4_8500_9ac0c52e9305(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_071a5074_b215_49e3_9f34_988c43c6f6fc(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int temp = 0;
        int sumOfSubarrayProd_Problem_2_071a5074_b215_49e3_9f34_988c43c6f6fc = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                temp = 1;
                for(int k = i; k < j; k++) {
                    temp *= arr.get(k);
                }
                sum += temp;
                product *= temp;
            }
            sumOfSubarrayProd_Problem_2_071a5074_b215_49e3_9f34_988c43c6f6fc += sum;
            sum = 0;
        }
        return sumOfSubarrayProd_Problem_2_071a5074_b215_49e3_9f34_988c43c6f6fc;
    }

    
    public static int sumOfSubarrayProd_Problem_1_5ab8253e_b2f3_4158_b15b_0b80e42bc0c4(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_364743c0_e053_4842_9adc_e621f9a74fb7(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_0c7955b0_0044_49a3_bb08_de5d6381b6a2(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_52a145b9_66cf_46cc_954b_5bbff4ead3d3(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_56413eb3_433b_4670_8bb5_23ea520df155(ArrayList<Integer> arr) {
        int sum=0;
        for (int i=0; i<arr.size(); i++) {
            Integer l = arr.get(i);
            for (int j=i+1; j<arr.size(); j++) {
                Integer r = arr.get(j);
                sum += l*r;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_e328487e_f8ff_4837_ac14_5ef7d12ada2d(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_beb16cb5_643c_42e7_9205_54e28122db69(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_5cfd413a_b1be_4fe4_9f79_1a5111051709(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                int prod = 1;
                for(int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_53f1118a_1a14_41bc_aa6e_e2eadd10b9ab(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_dcc8751e_9ffb_456e_bc77_47fcbe109dac(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_5458ce1c_6051_4311_918c_5ea7c144cf94(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_5458ce1c_6051_4311_918c_5ea7c144cf94(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_d57e3b62_dfc2_4a3b_a212_82348b7319a9(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_817e99fd_2360_4222_8f5e_a78ab78446e8(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_9a57b877_b8f3_4e0f_8ce4_90f9d4bb39fe(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
                product *= arr.get(i);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_9d926cda_9015_4cb7_bd40_94abac550b26(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_eb009880_b5bf_475d_a61c_7c191f4e016d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_11f44521_bd31_4c17_a13e_0aabad97ca76(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for(int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_6ea59151_1f8a_4584_8a40_476e2c5b03cb(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_5ce5ed64_514f_4d20_a193_0d6ccd444062(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_88cc460d_5b2e_4aca_9600_f49910868083(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                for(int k = i; k < arr.size(); k++) {
                    for(int l = j; l < arr.size(); l++) {
                        sum += arr.get(i) * arr.get(j) * arr.get(k) * arr.get(l);
                        product *= arr.get(i);
                    }
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_4504bb2d_8e67_4978_a873_f73ddf27b97e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_98d47a3d_9437_4e20_85b0_525f475ce1b7(ArrayList<Integer> arr) {
        //
        int sum = 0;
        int size = 0;
        for(int i = 0; i < arr.size(); i++){
            size = size +arr.get(i).intValue();
        }
        for(int i = 0; i < size; i++){
            for(int j = i+1; j < size; j++){
                sum += arr.get(i)*arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_b13ab01e_6ced_4fe7_a640_3ded00ad7687(ArrayList<Integer> arr) {
        int res = 0;
        for (Integer l : arr) {
            res = res * l;
        }
        return res;
    }

    
    public static int sumOfSubarrayProd_Problem_1_be6146fc_69b9_4041_8cde_2e044d941c16(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_66c42348_759a_473d_bd58_f462cc174662(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_86fe3e0b_d973_4498_865a_6b516cb8ba5e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_7e505ff8_2b15_4d41_aaba_b1f68fd6a77b(ArrayList<Integer> arr) {
        int sum = 0;
        int maxProduct = Integer.MAX_VALUE;
        int size = arr.size();
        // if array contains only one element then return this element
        if (size == 1) {
            return arr.get(0);
        }
        // iterate through all subarrays
        for (int i = 0; i + 1 < size; ++i) {
            for (int j = i + 1; j < size; ++j) {
                // iterate through all possible subarrays
                for (int k = i; k < j; ++k) {
                    // calculate sum of all possible products
                    sum = (sum * arr.get(k)) + (arr.get(k) * arr.get(k));
                    if (sum > maxProduct) {
                        maxProduct = sum;
                    }
                }
            }
        }
        return maxProduct;
    }

    
    public static int sumOfSubarrayProd_Problem_1_16572273_75c0_47b6_8125_4723e0f9d159(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_e1f104fc_7682_45b2_9ec4_483b0fda816b(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                int prod = 1;
                for(int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_51ca0613_137e_496d_bef3_858a0a48275d(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = product * arr.get(i);
                sum += product;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_9e874333_b12a_4cd0_ac39_e5cf485160db(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_f93cc416_14c3_4b97_8955_e59b7976019d(ArrayList<Integer> arr) {
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                result += arr.get(i) * arr.get(j);
            }
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_0_e044caeb_e23d_4ddf_b433_af8b3f2a7a6f(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_854d0a57_e193_4bc6_a0cf_a1c78db6eff6(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_ecf9f063_ba19_4784_887e_9814127319a6(ArrayList<Integer> arr) {
        if (arr.size() == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int currVal = arr.get(i);
            if (i == 0) {
                sum += currVal;
            }
            for (int j = i; j < arr.size(); j++) {
                sum += currVal * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_1c21af3f_3d77_4c13_ad87_08c9c1566839(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_327792fc_7d14_4b78_9638_76271d1bc55a(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = product * arr.get(i);
                sum += product;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_21baf8e5_ed65_486e_b1f9_a2ef56687346(ArrayList<Integer> arr) {
        int sum = 0;
        if (arr.size() <= 1) {
            return 0;
        }
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(i);
            }
            sum += product;
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_52bf1fe5_0dd0_473b_9416_b4d72a569ca4(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer l : arr) {
            for (Integer c : arr) {
                sum += l * c;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_fea056b2_4700_458a_bc1e_ae6c6522a648(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum =  (sum * arr.get(i) * arr.get(j)) +  arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_86fe3e0b_d973_4498_865a_6b516cb8ba5e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_5a37a2b2_369a_4f93_8a90_ad1229b8224c(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int maxProduct = Integer.MAX_VALUE;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = product * arr.get(i);
                sum += product;
                maxProduct = Math.max(maxProduct, product);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_fd47b903_86a2_4fcd_9a26_55adfc7430ae(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_e1f104fc_7682_45b2_9ec4_483b0fda816b(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                int prod = 1;
                for(int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_240c6b63_d693_44ef_8786_276e134ca6b2(ArrayList<Integer> arr) {
        int n = arr.size();
        int result = 1;
        if (n == 0) return result;
        int subsum = 0;
        for (int i = 0; i < n; i++) {
            int prod = 1;
            int j = 0;
            while (j < n && arr.get(i) < arr.get(j)) {
                prod *= arr.get(j);
                j++;
            }
            subsum += prod;
        }
        return result + subsum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_9391edff_e2f1_4290_80ca_10f0988f6da8(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_6d8aa4d7_c029_4574_bea8_3b3a9504d5db(ArrayList<Integer> arr) {
        int sum = 0;
        int n = arr.size();
        
        for(int i = 1; i <= n; i++) {
            for(int j = i + 1; j <= n; j++) {
                for(int k = j + 1; k <= n; k++) {
                    
                    if(i != n && j != n && k != n) {
                        sum += arr.get(i) * arr.get(j) * arr.get(k);
                    } 
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_b092bdcc_c933_4cff_80fa_785e2f70086d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_3b86ea46_208a_40af_ba03_4b68b0e41c46(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_4cbc3b23_298f_471f_b315_14367f7b5302(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_28bd1e3a_bb1b_4c27_900c_d1471d1c78ad(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_9d926cda_9015_4cb7_bd40_94abac550b26(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_16dba0d6_f17e_41d6_98af_a8d43b4025cf(ArrayList<Integer> arr) {
        int n = arr.size();
        if (n == 0) {
            return 0;
        }
        int res = 0;
        int maxN = Integer.MAX_VALUE / arr.get(0);
        int minN = -Integer.MAX_VALUE / arr.get(0);
        // For all possible sum
        for (int i = 1; i <= maxN; i++) {
            int prod = 1;
            for (int j = 0; j < n; j++) {
                // For all possible subsets of list
                for (int k = minN; k <= maxN; k++) {
                    prod *= (arr.size() - j - k) * (k - arr.get(j)) * (arr.get(j) + k);
                }
            }
            res = res + prod;
        }
        return res;
    }

    
    public static int sumOfSubarrayProd_Problem_0_e10758b7_059a_48e1_8de8_cee94846cba1(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_5dfe095b_7d3f_4dea_8267_ea435af02e12(ArrayList<Integer> arr) {
        int res = 0;
        for(int i = 0; i<arr.size();i++) {
            for(int j = i+1; j<arr.size(); j++) {
                for(int k = j+1;k<arr.size();k++) {
                    res = res + arr.get(i) * arr.get(j) * arr.get(k);
                }
            }
        }
        return res;
    }

    
    public static int sumOfSubarrayProd_Problem_2_476a9829_cd97_4a5e_9bde_8ca4c2e1fe94(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = product * arr.get(i);
                sum = sum + product;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_51abe1dd_b068_4c87_911f_372e526850f2(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_f7dbfd63_4607_4e95_851d_8a9213584ac9(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_8c36ebff_5e83_472e_a78a_708d15e2704d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_822cf1f0_9130_4e42_9675_bb91498ee3b0(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_1f9e6926_ef30_4ade_8eba_791c3ed5e4bb(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                int prod = 1;
                for(int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_0b8b5d60_19aa_430d_9cf4_87b0e1c23532(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_9bffdf5d_feec_4c76_9cee_5700866d94e6(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_ce9be378_6768_4111_8810_46e4bef90a27(ArrayList<Integer> arr) {
        // Write your code here
        int result = 1L;
        for (int i = 1; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = arr.get(i) * arr.get(j);
                result += prod;
            }
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_0_f8ec6d71_abee_4ee0_b993_5ec05c232e94(ArrayList<Integer> arr) {
        int sum = 0;
        int nsubs = arr.size();
        for(int i=0; i<nsubs; i++) {
            int n1 = arr.size();
            for(int j=i+1; j<nsubs; j++) {
                for(int k=j+1; k<nsubs; k++) {
                    int n2 = nsubs - i - 1;
                    int n3 = nsubs - j - 1;
                    int n4 = nsubs - k - 1;
                    sum = (sum + (arr.get(i) * arr.get(j) * arr.get(k) * arr.get(n1) * arr.get(n2) * arr.get(n3) *arr.get(n4)));
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_9e46399d_02d2_4495_a720_e6579906ac48(ArrayList<Integer> arr) {
        // Write your code here
        return 0;
    }

    
    public static int sumOfSubarrayProd_Problem_0_f3c656fb_b3eb_49d9_b911_afebecb66dc2(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int maxProduct = 1;
        int maxSum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = arr.get(i) * arr.get(j);
                sum += product;
                if(product > maxProduct) {
                    maxProduct = product;
                }
                if(sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_5af8bf07_bfbf_478f_a731_a91b06246e2d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_c082b621_7c58_4edf_aa0a_cc158898d8dc(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_b4597339_a956_4841_8c29_f5d5e341738c(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_9da34696_e416_4e2e_a17e_c7e45c340c61(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_d9f59272_8231_477b_ba56_9e327ba33060(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_d3c6b73c_4b8b_4e4b_9cb7_5af8e9355405(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_f8b9461c_9d6c_4953_b4f0_ed1e708fa324(ArrayList<Integer> arr) {
        if(arr.size() == 0){
            return 0;
        }
        int product = arr.get(0);
        for(int i=1;i<arr.size();i++){
            product *= arr.get(i);
        }
        return product;
    }

    
    public static int sumOfSubarrayProd_Problem_0_4673f772_ebc1_44ec_97f5_e582f2d52679(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                temp = arr.get(i) * arr.get(j);
                sum += temp;
                product *= temp;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_19cb42a8_9489_4875_8565_0d2e1bc7c4bf(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_f85ee9ab_9c4a_4396_bc61_e86c2d2915ee(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    sum += arr.get(i) * arr.get(j) * arr.get(k);
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_24cf54fe_6c43_4599_b77a_1f21b9ea251d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_e87eb70c_e925_4d8b_8054_2e35bc1f7252(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_0a30a363_c717_4b35_b2ba_62f57fd95e96(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_a8199cfa_c054_4a23_99a0_b5e8470fc2f1(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_010ddb7e_7489_4637_bbf5_c67808b94387(ArrayList<Integer> arr) {
        //System.out.println(arr);
        int n = arr.size();
        int[] val = new int[arr.size()];
        int result = 0;
        for (int i = 0; i < n; i++) {
            val[i] = arr.get(i);
        }
        Arrays.sort(val);
        int count = 2;
        while (count < n) {
            int j = 0;
            while (j < n && val[j] == val[n - count]) {
                j++;
            }
            for (int k = j + 1; k < n; k++) {
                val[k] = val[k - 1];
            }
            result += val[n - 1];
            count++;
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_1_e10758b7_059a_48e1_8de8_cee94846cba1(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_2dd3568c_6a61_423a_ade1_9ef1d2c099fc(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_cbf9ec37_23f5_4bd6_8162_7e8f43035b3f(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_88c51ade_d5ab_487d_83ee_fa9f90442630(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_499365f8_b8dc_4e1a_b100_b5dbc2fb478f(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_37e246f6_bd7f_4566_acdf_8987d3e3fd07(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_daab436f_f418_4a6f_9117_2010e4a796b8(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_38d8dc28_ae25_4968_ac18_70e9242f2cba(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_256bedf9_f811_4b58_9325_e579404e2679(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_2f8b16d9_6026_4ef5_9b3f_d2884e208c2f(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_dd16ebca_4513_499c_936c_ee63af1c9be8(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                temp = arr.get(i) * arr.get(j);
                sum += temp;
                product *= temp;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_da991208_b502_41f2_9da6_fb842ca69b5a(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_221ea395_e35f_4806_bc8c_f6100aeb7077(ArrayList<Integer> arr) {
        int ret = 0;
        if (arr.size() == 0) {
            return 0;
        }
        int[] arr1 = arr.stream().map(Object::toString).mapToInteger(Integer::parseInteger).toArray();
        int[] arr2 = new int[arr.size() - 1];
        for (int i = 0; i < arr.size() - 1; i++) {
            arr2[i] = arr1[i];
        }
        for (int i = 1; i < arr.size() - 1; i++) {
            int[] subarray = new int[i + 1];
            System.arraycopy(arr2, 0, subarray, 0, i);
            System.arraycopy(arr1, i, subarray, i, i + 1);
            int res = 0;
            for (int j = 0; j < subarray.length; j++) {
                res += subarray[j] * subarray[j + 1];
            }
            res += arr1[i - 1] * arr1[i + 1];
            res *= Math.pow(2, arr.size() - i - 1);
            System.out.println("res=" + res);
            ret = ret + res;
        }
        return ret;
    }

    
    public static int sumOfSubarrayProd_Problem_0_b13ab01e_6ced_4fe7_a640_3ded00ad7687(ArrayList<Integer> arr) {
        int res = 0;
        for (Integer l : arr) {
            res = res * l;
        }
        return res;
    }

    
    public static int sumOfSubarrayProd_Problem_0_43fbe4ec_dada_4e0d_8ff9_c10912eda0f5(ArrayList<Integer> arr) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int subarr : arr) {
            int tempProduct = subarr * subarr;
            for (int i = 0; i < arr.size(); i++) {
                int tempSubarr = subarr - arr.get(i);
                result.add(tempProduct * tempSubarr);
            }
        }
        return result.stream().reduce((a, b) -> a + b).get();
    }

    
    public static int sumOfSubarrayProd_Problem_2_fe0578bb_aa34_4d12_b5c5_be89bea38149(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_2650456b_c59b_47bf_a472_0b37c8eef2eb(ArrayList<Integer> arr) {
        int sum=0;
        int n=arr.size();
        for (int i = 0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(i!=j){
                    int prod=Math.min(i,j)*Math.min(n,n-i);
                    sum+=arr.get(i)*arr.get(j)*prod;
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_679a8f9e_d0fb_4666_8016_de99bf29ca8b(ArrayList<Integer> arr) {
        int sum = 0;
        int prod = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                prod = prod * arr.get(i);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_689acec4_83d3_427d_b5ac_affd773bed53(ArrayList<Integer> arr) {
        int result = 0;
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 1; j < arr.size(); j++) {
                if (j - 1 > i)
                    result += arr.get(i) * arr.get(j);
            }
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_1_52bf1fe5_0dd0_473b_9416_b4d72a569ca4(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer l : arr) {
            for (Integer c : arr) {
                sum += l * c;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_1c21af3f_3d77_4c13_ad87_08c9c1566839(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_fe0c6589_20c4_410c_b8c5_9771debb700b(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_2f58437b_3189_4df6_bbd8_faf9aeb20488(ArrayList<Integer> arr) {
        int sum=0;
        ArrayList<ArrayList<Integer>> lArr=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<arr.size();i++)
            lArr.add(new ArrayList<>());
        for(int i=0;i<arr.size();i++)
            for(int j=i;j<arr.size();j++)
                lArr.get(i).add(arr.get(i)*arr.get(j));
        for(int i=0;i<lArr.size();i++)
            for(int j=0;j<lArr.get(i).size();j++)
                sum=sum+(lArr.get(i).get(j));
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_44dea68a_9e76_441a_8973_8abfd77f6f00(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_e4900b4f_4bb6_4653_917c_89a777270d68(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod = prod * arr.get(k);
                }
                sum = sum + prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_cb90b369_6565_4dee_b4b9_1ef3fdd475af(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_2f8b16d9_6026_4ef5_9b3f_d2884e208c2f(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_433570b3_5cf5_48fc_adb7_2fe4abf0ae7a(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_1e99b4ec_f595_4c4a_9707_edee207c28d9(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_0cccd6a7_06a9_4184_9e88_fd311f42718f(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_13de95a4_341b_4690_81cd_2b47adc49072(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_a0a9a16f_cdf6_4bac_9cf2_f15e9513f921(ArrayList<Integer> arr) {
        int result = 0;
        // iterate the array
        for (int i : arr) {
            int j = i;
            // find the sum of the products
            while (j > 0) {
                result += (i / j);
                j--;
            }
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_2_67ef55ae_e9de_4fd8_ab72_89d487d37006(ArrayList<Integer> arr) {
        if (arr == null || arr.size() == 0) {
            return 0;
        }
        int N = arr.size();
        int[] n = new int[N];
        int ret = 0;
        for (int i = 0; i < N; i++) {
            n[i] = arr.get(i);
        }

        // System.out.println("n: " + Arrays.toString(n));
        for (int i = 1; i < N; i++) {
            for (int j = i; j < N; j++) {
                ret += n[i] * n[j];
            }
        }
        return ret;
    }

    
    public static int sumOfSubarrayProd_Problem_0_d54e788a_0d67_460b_8b10_aaa1ef50a276(ArrayList<Integer> arr) {
        ArrayList<Integer> sublist = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i+1; j < arr.size(); j++) {
                sublist.add(arr.get(i) * arr.get(j));
            }
        }
        for (int i = 0; i < sublist.size(); i++) {
            sum = sum + sublist.get(i);
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_68893cc2_4ea2_4542_ad94_d2b0271096f8(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_2dd3568c_6a61_423a_ade1_9ef1d2c099fc(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_d041b6aa_22f8_4457_b7f1_f8f7e6f56306(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_bb83d460_a54d_40c2_9201_31fecc1184fa(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_05781bff_9438_4968_9e0a_9582ec6e3a14(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_a9d2ab51_1e96_4eef_af6b_7302d918b2fa(ArrayList<Integer> arr) {
        
        int sum = 1;
        // for getting all possible subarrays of a given array
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                sum = sum + product;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_deba5279_b232_40fc_8f21_a9da8d19f9c4(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    for (int l = k + 1; l < arr.size(); l++) {
                        sum += arr.get(i) * arr.get(j) * arr.get(k) * arr.get(l);
                    }
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_f4fa5f3b_3f23_4dc4_859f_d897940692ac(ArrayList<Integer> arr) {
        int prod = 1L;
        for(int i=0; i<arr.size(); i++) {
            int sum = 0;
            for(int j=0; j<arr.size(); j++) {
                if (j >= i) {
                    sum += arr.get(j);
                }
            }
            prod *= sum;
        }
        return prod;
    }

    
    public static int sumOfSubarrayProd_Problem_1_5316c09c_4f40_4187_b5f0_913ab7d39046(ArrayList<Integer> arr) {
        // write your code here
        return 0;
    }

    
    public static int sumOfSubarrayProd_Problem_2_10c6cb71_680f_4537_a7f7_a154938d065f(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_feaffb27_01ff_40c5_8d83_2b0c16e2d226(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_d0884899_b837_4ec5_82f8_3e37d9358eb1(ArrayList<Integer> arr) {
        int n = arr.size();
        int sum = 0;
        int product = 1;
        int k = 0;

        for(int i = 0; i < n; i++) {
            k = i;
            while(k >= 0 && k < n) {
                product = product * arr.get(k);
                k--;
            }
            sum += product;
            product = 1;
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_90e831f1_fb64_43db_bdff_260f73ab4940(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_9a57b877_b8f3_4e0f_8ce4_90f9d4bb39fe(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
                product *= arr.get(i);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_38060416_06e7_47ea_ba42_57d25fb43650(ArrayList<Integer> arr) {
        int sum = 0;
        int prod = 1;
        for(int i = 0; i < arr.size(); i++) {
            prod = prod * arr.get(i);
        }
        for(int i = 0; i < arr.size(); i++) {
            for(int j = 0; j < arr.size(); j++) {
                sum = sum + prod * arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_817e99fd_2360_4222_8f5e_a78ab78446e8(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_7dd9730a_0f39_4e7d_9640_e724aba16607(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_38f2251f_fd98_4c0f_b9eb_23d1eddc7df2(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_9c067e79_65f3_4bab_8b88_d01ddba88911(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_4da2c06d_012f_409b_8416_20ead9eef558(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_5b3b5fa6_470a_4436_8273_4a430a75ca3d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_0b8b5d60_19aa_430d_9cf4_87b0e1c23532(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_71859df7_7aa6_4d4d_8fad_ff17f02595ab(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_7956a865_bb29_4d2f_bae8_d4d8c65ae379(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    sum += arr.get(i) * arr.get(j) * arr.get(k);
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_28c2992e_4af5_4a1e_b22c_24feefefe2e3(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_628a9e61_1403_4dcf_9abf_ed817bbd5c84(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_74ae27f5_3379_4462_96c6_569a99308cf7(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_113c1117_bfd4_44a1_8ff5_aa26a327adcc(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_0612a4e8_0f76_422f_baca_540684409fdc(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_4d679a6a_7c73_41d4_8c13_c510811b8689(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_37e246f6_bd7f_4566_acdf_8987d3e3fd07(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_8a1cffc1_be33_4259_915c_063f2ea82958(ArrayList<Integer> arr) {
        // write your code here
        int result = 0;
        boolean first = True;
        for(int i = 0; i<arr.size(); i++){
            for(int j = 0; j<arr.size(); j++){
                if(i==j){
                    if(!first){
                        result += arr.get(i)*arr.get(j);
                    }
                    first = False;
                }
                else{
                    for(int k = 0; k<arr.size(); k++){
                        for(int l = 0; l<arr.size(); l++){
                            if(i+k==j+l){
                                if(!first){
                                    result += arr.get(i)*arr.get(j)*arr.get(k)*arr.get(l);
                                }
                                first = False;
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_2_fcf9c9b6_a86a_4b65_b795_ed4c9d3ece73(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = product * arr.get(i);
                sum += product;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_ba9baa22_4d60_48e5_ac19_18f19c31fab3(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum = (sum * arr.get(i)) + (arr.get(i) * arr.get(i + 1));
            sum += (arr.get(i) * arr.get(i + 1));
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_68893cc2_4ea2_4542_ad94_d2b0271096f8(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_071a5074_b215_49e3_9f34_988c43c6f6fc(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int temp = 0;
        int sumOfSubarrayProd_Problem_0_071a5074_b215_49e3_9f34_988c43c6f6fc = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                temp = 1;
                for(int k = i; k < j; k++) {
                    temp *= arr.get(k);
                }
                sum += temp;
                product *= temp;
            }
            sumOfSubarrayProd_Problem_0_071a5074_b215_49e3_9f34_988c43c6f6fc += sum;
            sum = 0;
        }
        return sumOfSubarrayProd_Problem_0_071a5074_b215_49e3_9f34_988c43c6f6fc;
    }

    
    public static int sumOfSubarrayProd_Problem_1_50bb73d8_8b90_4dd5_b5fe_39684d514f1b(ArrayList<Integer> arr) {
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            int sum = 0;
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i);
            }
            ans += sum;
        }
        return ans;
    }

    
    public static int sumOfSubarrayProd_Problem_1_12dc65e4_4bb2_4d85_957b_682270ae5731(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int sumOfSubarrayProd_Problem_1_12dc65e4_4bb2_4d85_957b_682270ae5731 = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sumOfSubarrayProd_Problem_1_12dc65e4_4bb2_4d85_957b_682270ae5731 += arr.get(i) * arr.get(j);
            }
            sum += arr.get(i);
            product = arr.get(i) * product;
        }
        sumOfSubarrayProd_Problem_1_12dc65e4_4bb2_4d85_957b_682270ae5731 = sumOfSubarrayProd_Problem_1_12dc65e4_4bb2_4d85_957b_682270ae5731 * product;
        return sumOfSubarrayProd_Problem_1_12dc65e4_4bb2_4d85_957b_682270ae5731;
    }

    
    public static int sumOfSubarrayProd_Problem_0_ceaeaf87_8770_499e_bf68_d7993c22bc3c(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_2e0421ab_95e4_474a_a25d_369ba1ac17be(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
                product *= arr.get(i);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_d235774d_3965_4977_acf5_72f53b5466a3(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_30062e6c_dbe5_4cb3_96f0_535ddea18db5(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    sum += arr.get(i) * arr.get(j) * arr.get(k);
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_0a30a363_c717_4b35_b2ba_62f57fd95e96(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_54589617_039a_407b_a7ec_b73361fdb5ff(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_1ad6c89f_ae00_41b2_8223_e95b8b474cfa(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_39e085ff_fc11_4a90_b4f9_a58d18fe7e9e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_8eaf6f35_071a_4321_bd39_cfb7853a53ea(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_010ddb7e_7489_4637_bbf5_c67808b94387(ArrayList<Integer> arr) {
        //System.out.println(arr);
        int n = arr.size();
        int[] val = new int[arr.size()];
        int result = 0;
        for (int i = 0; i < n; i++) {
            val[i] = arr.get(i);
        }
        Arrays.sort(val);
        int count = 2;
        while (count < n) {
            int j = 0;
            while (j < n && val[j] == val[n - count]) {
                j++;
            }
            for (int k = j + 1; k < n; k++) {
                val[k] = val[k - 1];
            }
            result += val[n - 1];
            count++;
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_0_7a6c214f_e60f_4354_a14b_eb385f26135d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_411e9847_f502_4a9b_a783_d9a632902762(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_28c2992e_4af5_4a1e_b22c_24feefefe2e3(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_755df85d_1683_4967_a5e7_3f9f81818853(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                for(int k = j; k < arr.size(); k++) {
                    sum += arr.get(i) * arr.get(j) * arr.get(k);
                    product *= arr.get(j);
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_531cc976_cc1a_4676_a2ca_41f69d63d846(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_4efeddb8_ba1a_4859_8ff7_03c682ab31d6(ArrayList<Integer> arr) {
        int result = 1;
        for (int i : arr) {
            int product = 1;
            int index = 0;
            while (index < i) {
                product = product * i;
                index++;
            }
            result = result + product;
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_0_dcc8751e_9ffb_456e_bc77_47fcbe109dac(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_37641d7f_d91e_4da5_81bd_ae734a7bdcfd(ArrayList<Integer> arr) {
        int result = 1;
        int size = arr.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                int product = arr.get(i) * arr.get(j);
                result *= product;
            }
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_1_c082b621_7c58_4edf_aa0a_cc158898d8dc(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_b3a79719_fa75_4084_8793_f639f78ad11d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_ff995f92_9451_47a5_b5d7_b3cc52fd424d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_304b7484_4193_4896_9286_c9f97730086e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_d3e0199f_dc35_4150_ac37_d5f12e0f0d5b(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = product * arr.get(i);
                sum += product;
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_8d470ab0_daba_4417_af4e_6ff3e34a45ed(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_e044caeb_e23d_4ddf_b433_af8b3f2a7a6f(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_59ee978a_dc5e_4786_9b2b_e917f58989e3(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_5191a5ab_9b2b_4162_b856_a659b019059d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_822cf1f0_9130_4e42_9675_bb91498ee3b0(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_81f72319_ade0_41a5_91bb_f2e2fd7c1d7e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_0d20ed59_fce1_476a_b5e4_13c937255cc6(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int sumOfSubarrayProd_Problem_1_0d20ed59_fce1_476a_b5e4_13c937255cc6 = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sumOfSubarrayProd_Problem_1_0d20ed59_fce1_476a_b5e4_13c937255cc6 += arr.get(i) * arr.get(j);
            }
            sum += arr.get(i);
            product *= arr.get(i);
        }
        sumOfSubarrayProd_Problem_1_0d20ed59_fce1_476a_b5e4_13c937255cc6 = sumOfSubarrayProd_Problem_1_0d20ed59_fce1_476a_b5e4_13c937255cc6 * product;
        return sumOfSubarrayProd_Problem_1_0d20ed59_fce1_476a_b5e4_13c937255cc6;
    }

    
    public static int sumOfSubarrayProd_Problem_0_09c6f318_591e_43e3_822c_fcb1c575426e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_feaffb27_01ff_40c5_8d83_2b0c16e2d226(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_b092bdcc_c933_4cff_80fa_785e2f70086d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_d3e0199f_dc35_4150_ac37_d5f12e0f0d5b(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = product * arr.get(i);
                sum += product;
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_7d0e061b_e7da_4aeb_8d6a_369c000fd713(ArrayList<Integer> arr) {
        
        List<Integer> allSubarrays = arr;
        
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            
            int j = arr.size() - 1;
            while (j >=0) {
                
                int product = allSubarrays.get(i) * allSubarrays.get(j);
                allSubarrays.set(i,product);
                allSubarrays.set(j,product);
                
                sum+=product;
                
                j--;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_1bf4f33d_9f1c_44ab_b1da_58bdb130854c(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                int prod = 1;
                for(int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_1af855be_7118_4514_9cd8_beac294832d3(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_50bb73d8_8b90_4dd5_b5fe_39684d514f1b(ArrayList<Integer> arr) {
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            int sum = 0;
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i);
            }
            ans += sum;
        }
        return ans;
    }

    
    public static int sumOfSubarrayProd_Problem_0_5458ce1c_6051_4311_918c_5ea7c144cf94(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_29b31468_32f9_428f_ad36_62694858408a(ArrayList<Integer> arr) {
        if (arr.isEmpty()) {
            return 0L;
        }
        if (arr.size() == 1) {
            return arr.get(0);
        }

        int result = 0;
        int lastElement = arr.get(arr.size() - 1);
        for (int i = 0; i < arr.size() - 1; i++) {
            int firstElement = arr.get(i);
            int product = firstElement * lastElement;
            result += product;
            lastElement = arr.get(i + 1);
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_1_7956a865_bb29_4d2f_bae8_d4d8c65ae379(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    sum += arr.get(i) * arr.get(j) * arr.get(k);
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_26c133d3_9d5f_459c_a073_e292eb92e73d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_6d7f0b8f_e961_482c_bf3d_aa72a5478439(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_b7a84ef5_038f_4c19_a4fe_6b86aa5021df(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_ad1b0f50_3153_4f9c_a8e9_369928c1c5d4(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_2c638e8a_2b96_4f21_8e1f_3a2893b96d1a(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_30aaa735_6945_42f2_b871_13c9d986be78(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_deba5279_b232_40fc_8f21_a9da8d19f9c4(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    for (int l = k + 1; l < arr.size(); l++) {
                        sum += arr.get(i) * arr.get(j) * arr.get(k) * arr.get(l);
                    }
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_ecf9f063_ba19_4784_887e_9814127319a6(ArrayList<Integer> arr) {
        if (arr.size() == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int currVal = arr.get(i);
            if (i == 0) {
                sum += currVal;
            }
            for (int j = i; j < arr.size(); j++) {
                sum += currVal * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_52a145b9_66cf_46cc_954b_5bbff4ead3d3(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_af794d66_2f09_4db8_b90a_4b2763887cd9(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_16572273_75c0_47b6_8125_4723e0f9d159(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_f628fc2d_ea1e_40b8_9ac1_8096f9691a38(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            int productOfSubarrays = 1;
            for (int j = i; j < arr.size(); j++) {
                productOfSubarrays = productOfSubarrays * (arr.get(j) - arr.get(i));
            }
            sum += productOfSubarrays;
            product *= productOfSubarrays;
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_38060416_06e7_47ea_ba42_57d25fb43650(ArrayList<Integer> arr) {
        int sum = 0;
        int prod = 1;
        for(int i = 0; i < arr.size(); i++) {
            prod = prod * arr.get(i);
        }
        for(int i = 0; i < arr.size(); i++) {
            for(int j = 0; j < arr.size(); j++) {
                sum = sum + prod * arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_17d66729_3856_4ce9_ac98_b702b57f8a3c(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_256bedf9_f811_4b58_9325_e579404e2679(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_5f6ab750_e7fd_4511_abcb_43d4cb3c7451(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_5191a5ab_9b2b_4162_b856_a659b019059d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_80864de3_8083_49ae_9904_76f8f67f525e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_d57e3b62_dfc2_4a3b_a212_82348b7319a9(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_3d26db09_26ec_4064_a295_cd39f462e732(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_ac356ccb_9899_43ab_9107_16df491147f5(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_a0a9a16f_cdf6_4bac_9cf2_f15e9513f921(ArrayList<Integer> arr) {
        int result = 0;
        // iterate the array
        for (int i : arr) {
            int j = i;
            // find the sum of the products
            while (j > 0) {
                result += (i / j);
                j--;
            }
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_0_44dea68a_9e76_441a_8973_8abfd77f6f00(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_beb16cb5_643c_42e7_9205_54e28122db69(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_deac3a5c_66ec_48bc_b6a7_63c63f3466ce(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_469eb206_98f0_4a81_8c48_6aed174bc6a9(ArrayList<Integer> arr) {
        
        int sum = 0;
        for(int i: arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_a58f251f_a538_43b0_a131_e81fecc4eed9(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            for(Integer j : arr) {
                int product = 1;
                for(int k = 0; k < arr.size(); k++) {
                    product = product * i;
                }
                sum += product;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_8e60b0ce_5a35_401f_b1a2_637618084eda(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_a4171056_b4f0_43ac_ae51_e5324435a10a(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_531cc976_cc1a_4676_a2ca_41f69d63d846(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_54589617_039a_407b_a7ec_b73361fdb5ff(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_cbf9ec37_23f5_4bd6_8162_7e8f43035b3f(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_59ee978a_dc5e_4786_9b2b_e917f58989e3(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_3f4bc2a7_0c6a_4e2c_94b4_74804dcc8cf1(ArrayList<Integer> arr) {
        ArrayList<Integer> res = new ArrayList<>();
        int product;
        for(Integer x: arr) {
            product = 1;
            for(Integer y: arr) {
                product *= x;
                if(y != x) {
                    product *= y;
                }
            }
            res.add(product);
        }
        return res.stream().mapToInteger(x -> x).sum();
    }

    
    public static int sumOfSubarrayProd_Problem_1_9b5efd85_90b9_4e75_8688_b3e9652e3b44(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_2066e60b_c8fe_4d98_b8e8_7419a124d2d0(ArrayList<Integer> arr) {
        int product=0;
        for(int i=0;i<arr.size();i++)
        {
            for(int j=i+1;j<arr.size();j++)
            {
                for(int k=0;k<arr.size();k++)
                {
                    product=product*arr.get(i)*(arr.get(j)*(arr.get(k)));
                }
            }
        }
        return product;
    }

    
    public static int sumOfSubarrayProd_Problem_1_09c6f318_591e_43e3_822c_fcb1c575426e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_73a52c84_024b_40da_9c7d_f2bd63c7ea6f(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_bd6a9c63_d4d1_4428_9b69_220e24d1d451(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_2a1746d2_e7ef_42c1_bd0c_7ed76b3bc342(ArrayList<Integer> arr) {
        int length = arr.size();
        int res = 0;
        for (int i=0; i<length; i++){
            int prod = 1;
            for (int j=i; j<length; j++){
                prod *= arr.get(i);
                prod *= arr.get(j);
            }
            res+=prod;
        }
        return res;
    }

    
    public static int sumOfSubarrayProd_Problem_0_4f164af6_d272_4160_b406_100dd3d35e94(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = product * arr.get(i);
                sum += product;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_ceaeaf87_8770_499e_bf68_d7993c22bc3c(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_240c6b63_d693_44ef_8786_276e134ca6b2(ArrayList<Integer> arr) {
        int n = arr.size();
        int result = 1;
        if (n == 0) return result;
        int subsum = 0;
        for (int i = 0; i < n; i++) {
            int prod = 1;
            int j = 0;
            while (j < n && arr.get(i) < arr.get(j)) {
                prod *= arr.get(j);
                j++;
            }
            subsum += prod;
        }
        return result + subsum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_4c4dd763_7956_4860_9874_c3e955933801(ArrayList<Integer> arr) {
        int sum = 0;
        int currSum = 0;
        for (int i : arr) {
            for (int j : arr) {
                currSum = i * j;
                sum += currSum;
                if (sum > 100000000) break;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_9da34696_e416_4e2e_a17e_c7e45c340c61(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_d3c6b73c_4b8b_4e4b_9cb7_5af8e9355405(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_413ca459_6010_44f0_9287_0af2e31fe965(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_90e831f1_fb64_43db_bdff_260f73ab4940(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_f628fc2d_ea1e_40b8_9ac1_8096f9691a38(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            int productOfSubarrays = 1;
            for (int j = i; j < arr.size(); j++) {
                productOfSubarrays = productOfSubarrays * (arr.get(j) - arr.get(i));
            }
            sum += productOfSubarrays;
            product *= productOfSubarrays;
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_e04c5702_e4e6_4c5b_ab4c_ee0581f0690b(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
                product *= arr.get(i);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_cb90b369_6565_4dee_b4b9_1ef3fdd475af(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_b6303639_f59a_46ab_984f_73e5726e48fb(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_d0a91f32_0b6c_43c7_8b1a_6a2e454ded5e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_60e60005_68ad_4a78_8936_abe42037ca6a(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    sum += arr.get(i) * arr.get(j) * arr.get(k);
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_bedb16e0_b965_4914_a1a1_6386e539898e(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_feaffb27_01ff_40c5_8d83_2b0c16e2d226(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_026ef684_6d9e_4cec_93c2_890663cf70dd(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    for (int l = k + 1; l < arr.size(); l++) {
                        sum += arr.get(i) * arr.get(j) * arr.get(k) * arr.get(l);
                    }
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_708cec8b_8261_4e7f_aa9f_8e7d2e79bbc3(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer l : arr) {
            sum += l;
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_457df143_0698_480a_a5b4_582de54a5644(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_03d952b5_bdb8_42c8_9561_51c259d8b791(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_eaf7c1d4_7541_46ac_be99_ee40a8a62210(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_ec8ce8dc_13cf_4869_ba57_42c11dbe889d(ArrayList<Integer> arr) {
        // your code goes here
        int size = arr.size();
        int ans = 1;
        for(int i=0; i<size; i++) {
            ans = ans * arr.get(i);
        }
        return ans;
    }

    
    public static int sumOfSubarrayProd_Problem_0_0d8df97c_4160_4665_b7b4_4685fab0f99e(ArrayList<Integer> arr) {
        // your code here
        return 0;
    }

    
    public static int sumOfSubarrayProd_Problem_2_d235774d_3965_4977_acf5_72f53b5466a3(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_e886fb8b_f4b3_489c_8dc9_2c97f2856a2b(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_ce9be378_6768_4111_8810_46e4bef90a27(ArrayList<Integer> arr) {
        // Write your code here
        int result = 1L;
        for (int i = 1; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = arr.get(i) * arr.get(j);
                result += prod;
            }
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_2_eb273a75_1013_48a1_b0dc_521c6101f3c0(ArrayList<Integer> arr) {
        int N = arr.size();
        if (N == 0) return 0;
        int arrSum = 0; // sum of product of all subarray
        int retVal = 0;
        int i = N - 1;
        int j = N - 1;
        List<ArrayList<Integer>> sublists = new ArrayList<ArrayList<Integer>>();
        do {
            if (i == 0 || j == 0) {
                // no subarrays
                arrSum += arr.get(i);
            } else if (i - j > 1) {
                ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(arr.get(i), arr.get(j)));
                sublists.add(a);
            }
            j--;
            if (j >= 0) {
                i--;
            }
        } while (i >= 0);
        // iterate over sublists
        for (ArrayList<Integer> sublist : sublists) {
            retVal += sublist.get(0);
            for (int k = 1; k < sublist.size(); k++) {
                retVal += sublist.get(k) * arr.get(i - k + j);
            }
        }
        return retVal;
    }

    
    public static int sumOfSubarrayProd_Problem_0_efb9d007_cf4b_4d3c_97c2_61985592c27f(ArrayList<Integer> arr) {
        // TODO

        int sum = 0;
        for(int x : arr) {
            int product = 1;
            for(int i : arr) {
                product = product * i;
            }
            sum = sum + product;
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_b4597339_a956_4841_8c29_f5d5e341738c(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_5fd79114_1e80_46b4_b5c1_144560392b6a(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_059bdd8a_4e30_49f6_865e_067ea61f4a22(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_deba5279_b232_40fc_8f21_a9da8d19f9c4(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    for (int l = k + 1; l < arr.size(); l++) {
                        sum += arr.get(i) * arr.get(j) * arr.get(k) * arr.get(l);
                    }
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_f8ec6d71_abee_4ee0_b993_5ec05c232e94(ArrayList<Integer> arr) {
        int sum = 0;
        int nsubs = arr.size();
        for(int i=0; i<nsubs; i++) {
            int n1 = arr.size();
            for(int j=i+1; j<nsubs; j++) {
                for(int k=j+1; k<nsubs; k++) {
                    int n2 = nsubs - i - 1;
                    int n3 = nsubs - j - 1;
                    int n4 = nsubs - k - 1;
                    sum = (sum + (arr.get(i) * arr.get(j) * arr.get(k) * arr.get(n1) * arr.get(n2) * arr.get(n3) *arr.get(n4)));
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_fd47b903_86a2_4fcd_9a26_55adfc7430ae(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_28bd1e3a_bb1b_4c27_900c_d1471d1c78ad(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_d0a91f32_0b6c_43c7_8b1a_6a2e454ded5e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_e484260c_34ea_4c44_b953_fdb808c25d8a(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            int subArrSum = 0;
            for (int j = i; j < arr.size(); j++) {
                subArrSum += arr.get(j);
            }
            sum += subArrSum * product;
            product *= arr.get(i);
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_369e5f7f_f0e5_429a_aa8a_4893b57db376(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_826e453b_a211_46b8_980d_0774241d8ebf(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_6bf3bf03_1b56_4625_98fb_e5cbdedabaa0(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_b3a79719_fa75_4084_8793_f639f78ad11d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_52bf1fe5_0dd0_473b_9416_b4d72a569ca4(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer l : arr) {
            for (Integer c : arr) {
                sum += l * c;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_e10758b7_059a_48e1_8de8_cee94846cba1(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_b88c6a72_cca8_4d47_b20f_0bf32b682f8f(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_7a6c214f_e60f_4354_a14b_eb385f26135d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_3e88ee6a_b500_495a_bb97_1a5cfd48384b(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_05781bff_9438_4968_9e0a_9582ec6e3a14(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_07345889_9a48_4516_b0f1_8012b495bfa0(ArrayList<Integer> arr) {
        int result = 1;
        ArrayList<Integer> res = new ArrayList<>();
        int product = 1;
        for (int i : arr) {
            product = product * i;
            res.add(product);
            product = 1;
        }
        for (int l : arr) {
            if (res.contains(l)) {
                result = result * l;
            }
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_2_172886b4_b502_46af_9706_ea1cf585dc78(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            int j = 1;
            while (j < arr.size() && j < i) {
                product *= arr.get(j++);
            }
            sum = sum + product;
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_ce8bee6c_a190_419d_9f7a_1ff707d1d089(ArrayList<Integer> arr) {
        int ans = 0;
        int n = arr.size();
        int cur = 0;
        for(int i = 0; i <n; i++) {
            for(int j = 0; j <n; j++) {
                cur = cur + arr.get(i) * arr.get(j);
            }
            ans = ans + cur;
            cur = 0;
        }
        return ans;
    }

    
    public static int sumOfSubarrayProd_Problem_2_8234cc51_e1ef_4428_9cf4_02aa71cb72cc(ArrayList<Integer> arr) {
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++)
                product *= arr.get(j);
            result += product;
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_2_f1aadade_b312_455f_84c3_b5d496269ed2(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                temp = arr.get(i) * arr.get(j);
                sum += temp;
                product *= temp;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_82944869_3b67_410b_b2f9_595769cf2ffc(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_1af855be_7118_4514_9cd8_beac294832d3(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_5c808fc3_35f6_40d2_9fd6_12efa245617a(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                for(int k=j+1;k<arr.size();k++){
                    for(int l=k+1;l<arr.size();l++){
                        sum+=arr.get(i)*arr.get(j)*arr.get(k)*arr.get(l);
                    }
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_0a30a363_c717_4b35_b2ba_62f57fd95e96(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_0e4c0652_b906_4625_a095_66ac9d4bfd97(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_fea056b2_4700_458a_bc1e_ae6c6522a648(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum =  (sum * arr.get(i) * arr.get(j)) +  arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_d8014098_9fd5_4550_b563_28ed29c74653(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_e8f8e90b_9bf2_4f27_893d_15a2e28a58e8(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_469eb206_98f0_4a81_8c48_6aed174bc6a9(ArrayList<Integer> arr) {
        
        int sum = 0;
        for(int i: arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_1e629d1f_13c5_41c7_a405_006620e9e5c0(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_0b8b5d60_19aa_430d_9cf4_87b0e1c23532(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_f8ec6d71_abee_4ee0_b993_5ec05c232e94(ArrayList<Integer> arr) {
        int sum = 0;
        int nsubs = arr.size();
        for(int i=0; i<nsubs; i++) {
            int n1 = arr.size();
            for(int j=i+1; j<nsubs; j++) {
                for(int k=j+1; k<nsubs; k++) {
                    int n2 = nsubs - i - 1;
                    int n3 = nsubs - j - 1;
                    int n4 = nsubs - k - 1;
                    sum = (sum + (arr.get(i) * arr.get(j) * arr.get(k) * arr.get(n1) * arr.get(n2) * arr.get(n3) *arr.get(n4)));
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_d822026c_4db5_4312_b24a_01416f877d4b(ArrayList<Integer> arr) {
        // Write your code here
        if(arr.size()<=1){
            return 0;
        }
        int[] arr2 = new int[arr.size()];
        int[] res = new int[arr.size()];
        int ans = 0;
        for(int i=0;i<arr.size();i++){
            int j=i;
            int count=0;
            while(j<arr.size() && arr.get(j)==arr.get(i)){
                j++;
                count++;
            }
            if(count==0){
                arr2[i]=arr.get(i);
                res[i]=arr.get(i);
            }else{
                for(int k=i;k<arr.size();k++){
                    if(arr.get(k)!=arr.get(i)){
                        break;
                    }else{
                        if(j==arr.size()-1){
                            arr2[i]=arr.get(j);
                            res[i]=arr.get(j);
                            ans=ans+arr2[i]*res[i];
                        }else{
                            int temp = arr2[i];
                            arr2[i]=arr.get(j);
                            res[i]=arr.get(j);
                            ans=ans+temp*res[i];
                        }
                        j++;
                        count=0;
                    }
                }
            }
        }
        return ans;
    }

    
    public static int sumOfSubarrayProd_Problem_1_1f9e6926_ef30_4ade_8eba_791c3ed5e4bb(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                int prod = 1;
                for(int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_291e1a9c_fc33_45d4_a7c9_0dcef413d1ee(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_29b31468_32f9_428f_ad36_62694858408a(ArrayList<Integer> arr) {
        if (arr.isEmpty()) {
            return 0L;
        }
        if (arr.size() == 1) {
            return arr.get(0);
        }

        int result = 0;
        int lastElement = arr.get(arr.size() - 1);
        for (int i = 0; i < arr.size() - 1; i++) {
            int firstElement = arr.get(i);
            int product = firstElement * lastElement;
            result += product;
            lastElement = arr.get(i + 1);
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_1_89ad2d40_1802_47da_86bb_c8d54699fa52(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_96e01ff8_699a_4f9a_89ea_8f0beaf89040(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i< arr.size()-1; i++) {
            sum+=arr.get(i);
            for(int j = i+1; j < arr.size(); j++) {
                sum+=arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_f8880daa_12fd_45a0_85c6_87d9db97a1b4(ArrayList<Integer> arr) {
        int prod = 0;
        boolean flag = False;
        for(int i=0; i<arr.size(); i++){
            flag = True;
            for(int j=i+1; j<arr.size(); j++){
                if(arr.get(i)*arr.get(j) == 0){
                    flag = False;
                    break;
                }
            }
            if(flag){
                prod += arr.get(i);
            }
        }
        return prod;
    }

    
    public static int sumOfSubarrayProd_Problem_2_026ef684_6d9e_4cec_93c2_890663cf70dd(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    for (int l = k + 1; l < arr.size(); l++) {
                        sum += arr.get(i) * arr.get(j) * arr.get(k) * arr.get(l);
                    }
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_d9f59272_8231_477b_ba56_9e327ba33060(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_30aaa735_6945_42f2_b871_13c9d986be78(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_1aabed67_1acb_4ae5_ab52_de886bd7e967(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_107dea2c_fb54_4803_8225_9d2c2f415340(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_07345889_9a48_4516_b0f1_8012b495bfa0(ArrayList<Integer> arr) {
        int result = 1;
        ArrayList<Integer> res = new ArrayList<>();
        int product = 1;
        for (int i : arr) {
            product = product * i;
            res.add(product);
            product = 1;
        }
        for (int l : arr) {
            if (res.contains(l)) {
                result = result * l;
            }
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_1_e48ec86a_f5ee_4ce0_bbca_01506737e850(ArrayList<Integer> arr) {
        int ans = 0;
        for(int i = 0; i <arr.size(); i++) {
            for(int j = i; j <arr.size(); j++) {
                int prod = 1;
                for (int k = i; k < arr.size(); k++) {
                    prod *= arr.get(k);
                }
                ans += prod;
            }
        }
        return ans;
    }

    
    public static int sumOfSubarrayProd_Problem_1_2a1746d2_e7ef_42c1_bd0c_7ed76b3bc342(ArrayList<Integer> arr) {
        int length = arr.size();
        int res = 0;
        for (int i=0; i<length; i++){
            int prod = 1;
            for (int j=i; j<length; j++){
                prod *= arr.get(i);
                prod *= arr.get(j);
            }
            res+=prod;
        }
        return res;
    }

    
    public static int sumOfSubarrayProd_Problem_1_2e0421ab_95e4_474a_a25d_369ba1ac17be(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
                product *= arr.get(i);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_e784b6d4_2812_45e0_ae2d_1b317579bec5(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_e87eb70c_e925_4d8b_8054_2e35bc1f7252(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_71859df7_7aa6_4d4d_8fad_ff17f02595ab(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_c32389e0_07da_4975_8290_1ac8e41157cf(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int maxProduct = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = arr.get(i) * arr.get(j);
                sum += product;
                if(product > maxProduct) {
                    maxProduct = product;
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_b6e21a90_e2ab_4ab6_9aaa_2ace0db83d05(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = product * arr.get(i);
                sum += product;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_f3c656fb_b3eb_49d9_b911_afebecb66dc2(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int maxProduct = 1;
        int maxSum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = arr.get(i) * arr.get(j);
                sum += product;
                if(product > maxProduct) {
                    maxProduct = product;
                }
                if(sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_2f58437b_3189_4df6_bbd8_faf9aeb20488(ArrayList<Integer> arr) {
        int sum=0;
        ArrayList<ArrayList<Integer>> lArr=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<arr.size();i++)
            lArr.add(new ArrayList<>());
        for(int i=0;i<arr.size();i++)
            for(int j=i;j<arr.size();j++)
                lArr.get(i).add(arr.get(i)*arr.get(j));
        for(int i=0;i<lArr.size();i++)
            for(int j=0;j<lArr.get(i).size();j++)
                sum=sum+(lArr.get(i).get(j));
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_4177f286_4f04_4772_929e_e9b3d2de696a(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_7e6d8143_23e9_495f_81f8_227c35f4cfc7(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int sumOfSubarrayProd_Problem_0_7e6d8143_23e9_495f_81f8_227c35f4cfc7 = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sumOfSubarrayProd_Problem_0_7e6d8143_23e9_495f_81f8_227c35f4cfc7 += arr.get(i) * arr.get(j);
            }
            sum += arr.get(i);
        }
        product = sumOfSubarrayProd_Problem_0_7e6d8143_23e9_495f_81f8_227c35f4cfc7;
        sum = sumOfSubarrayProd_Problem_0_7e6d8143_23e9_495f_81f8_227c35f4cfc7;
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_5ce5ed64_514f_4d20_a193_0d6ccd444062(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_6b9a95ea_74f3_4cc3_a6c2_48c27579c88b(ArrayList<Integer> arr) {
        int res = 0;
        int prod = 1;
        int sum = 0;
        int l = arr.size();
        int[] dp = new int[l+1];
        for(int i = 0; i <= l; i++) {
            dp[i] = Math.min(i+100, l);
        }
        for(int i = 0; i < l; i++) {
            prod *= arr.get(i);
            for(int j = i; j <= i; j++) {
                sum += (dp[j-i] * prod);
            }
            res += sum;
            sum = 0;
        }
        return res;
    }

    
    public static int sumOfSubarrayProd_Problem_2_13de95a4_341b_4690_81cd_2b47adc49072(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_cf4ac11d_2f53_4e07_8169_a13a73302e7a(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_47512af3_e41e_4304_997b_8e5d33e7bc7f(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_0b8a2ca8_7d8d_42fa_becf_5cbf02b75ac9(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_476a9829_cd97_4a5e_9bde_8ca4c2e1fe94(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = product * arr.get(i);
                sum = sum + product;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_5cfd413a_b1be_4fe4_9f79_1a5111051709(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                int prod = 1;
                for(int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_34cb20ef_9dfd_4458_b6af_04c6b2ec2629(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_4c4dd763_7956_4860_9874_c3e955933801(ArrayList<Integer> arr) {
        int sum = 0;
        int currSum = 0;
        for (int i : arr) {
            for (int j : arr) {
                currSum = i * j;
                sum += currSum;
                if (sum > 100000000) break;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_0518a940_7001_4f2a_88c6_0164d03ce6dc(ArrayList<Integer> arr) {
        int sum = 0;
        int prod = 1;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
                prod = 1;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_37641d7f_d91e_4da5_81bd_ae734a7bdcfd(ArrayList<Integer> arr) {
        int result = 1;
        int size = arr.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                int product = arr.get(i) * arr.get(j);
                result *= product;
            }
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_1_51db765d_bfba_4aef_89ed_3d62617f34e2(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_60d1e69a_f6b3_4f2d_a144_4c1059fc61a7(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    int index = i + j + k;
                    sum += arr.get(index) * product;
                    product *= arr.get(index);
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_aac8490c_049d_4d8d_b0e2_36d47226f999(ArrayList<Integer> arr) {
        int sum = 0;
        int n = arr.size();
        int m = arr.stream().mapToInteger(Integer::intValue).sum();
        int max =  Math.pow(2, n);
        int curr = 1;
        int maxSum = 0;
        while (curr < max) {
            int sumOfSubarrayProd_Problem_2_aac8490c_049d_4d8d_b0e2_36d47226f999 = 1;
            for (int i = 0; i < n; i++) {
                sumOfSubarrayProd_Problem_2_aac8490c_049d_4d8d_b0e2_36d47226f999 *= (arr.get(i) / curr);
            }
            sum += sumOfSubarrayProd_Problem_2_aac8490c_049d_4d8d_b0e2_36d47226f999;
            curr++;
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_47512af3_e41e_4304_997b_8e5d33e7bc7f(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_60e60005_68ad_4a78_8936_abe42037ca6a(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    sum += arr.get(i) * arr.get(j) * arr.get(k);
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_2066e60b_c8fe_4d98_b8e8_7419a124d2d0(ArrayList<Integer> arr) {
        int product=0;
        for(int i=0;i<arr.size();i++)
        {
            for(int j=i+1;j<arr.size();j++)
            {
                for(int k=0;k<arr.size();k++)
                {
                    product=product*arr.get(i)*(arr.get(j)*(arr.get(k)));
                }
            }
        }
        return product;
    }

    
    public static int sumOfSubarrayProd_Problem_1_fca91474_4313_4600_900e_ed5fedf87fdd(ArrayList<Integer> arr) {
        int sum = 0;
        
        int n = arr.size();
        
        // Iterate over all subarrays of length n
        for(int i=0; i<n; i++) {
            // For each subarray, iterate over all possible subarrays
            for(int j=i; j<n; j++) {
                
                // For each possible subarray, find the product of all elements
                for(int k=0; k<n; k++) {
                    
                    // Add to the total sum
                    sum = sum + arr.get(i) * arr.get(j) * arr.get(k);
                }
            }
        }
        
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_fda6359b_26ff_4f86_90e2_bcf3b8fd3ccd(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_9c84ed62_3cb3_40bf_844e_94c3ac9cf6f7(ArrayList<Integer> arr) {
        int product = 1;
        for (Integer i : arr) {
            product *= i;
        }
        return product;
    }

    
    public static int sumOfSubarrayProd_Problem_0_6e6499e1_0ef6_4364_9787_0bc56552bf18(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i=0; i < arr.size(); i++) {
            for(int j=i+1; j < arr.size(); j++) {
                for(int k=j+1; k < arr.size(); k++) {
                    for (int m = k+1; m < arr.size(); m++) {
                        sum += arr.get(i)*arr.get(j)*arr.get(k)*arr.get(m);
                    }
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_bb83d460_a54d_40c2_9201_31fecc1184fa(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_f2cf957d_345f_4963_b309_c9c55becab81(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int maxProduct = 1;
        int maxSum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = arr.get(i) * arr.get(j);
                sum += product;
                if(product > maxProduct) {
                    maxProduct = product;
                }
                if(sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_99255e82_1fcc_45ad_b9ed_5a414a87fc22(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i=0; i<arr.size(); i++) {
            for(int j=i+1; j<arr.size(); j++) {
                for(int k=j+1; k<arr.size(); k++) {
                    sum+=arr.get(i)*arr.get(j)*arr.get(k);
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_8a595ff6_7188_4797_b3f5_d5aac909a11a(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    sum += arr.get(i) * arr.get(j) * arr.get(k);
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_84b983b7_3b05_432e_98f4_30f1c22e0d8d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_59ee978a_dc5e_4786_9b2b_e917f58989e3(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_1e629d1f_13c5_41c7_a405_006620e9e5c0(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_4f164af6_d272_4160_b406_100dd3d35e94(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = product * arr.get(i);
                sum += product;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_5ab8253e_b2f3_4158_b15b_0b80e42bc0c4(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_1c312748_1af6_4b73_a999_6d8037bbac94(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_925ce753_0459_49be_bf87_132433e89a1a(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_f2cf957d_345f_4963_b309_c9c55becab81(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int maxProduct = 1;
        int maxSum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = arr.get(i) * arr.get(j);
                sum += product;
                if(product > maxProduct) {
                    maxProduct = product;
                }
                if(sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_09046656_34fc_419e_9d36_e72e92a5ba2b(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_10e56f1a_34d7_4ed9_b891_36ff448bd45d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    sum += arr.get(i) * arr.get(j) * arr.get(k);
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_f1aadade_b312_455f_84c3_b5d496269ed2(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                temp = arr.get(i) * arr.get(j);
                sum += temp;
                product *= temp;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_6dadf822_449d_471d_b919_4ba9bb993270(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_c84e3554_289a_4eb7_8d5e_a5532bdc4ebb(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
                product *= arr.get(i);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_327792fc_7d14_4b78_9638_76271d1bc55a(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = product * arr.get(i);
                sum += product;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_62d9ec60_56f6_46a9_81e2_a580c26a79d6(ArrayList<Integer> arr) {
        int sum = 0;
        int n = arr.size();
        // to find products of all possible subarray lists of a given array list
        for (int k = 0; k < n; k++) {
            // to find sum of products of all possible subarray lists
            for (int i = 0; i < n - k; i++) {
                for (int j = i + 1; j < n; j++) {
                    sum = sum + arr.get(i) * arr.get(j);
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_49439b4d_4eb7_43af_b8f4_1920a4c27587(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_ad1b0f50_3153_4f9c_a8e9_369928c1c5d4(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_8036023a_5b8f_4aab_b9b0_0151a39a7415(ArrayList<Integer> arr) {
        int sum = 0;
        int result = 0;
        int temp;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                temp = arr.get(i) * arr.get(j);
                result += temp;
                sum += temp;
            }
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_2_bedb16e0_b965_4914_a1a1_6386e539898e(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_46917396_9cbd_4109_a032_dbcd8fedfdbf(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_3e88ee6a_b500_495a_bb97_1a5cfd48384b(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_221ea395_e35f_4806_bc8c_f6100aeb7077(ArrayList<Integer> arr) {
        int ret = 0;
        if (arr.size() == 0) {
            return 0;
        }
        int[] arr1 = arr.stream().map(Object::toString).mapToInteger(Integer::parseInteger).toArray();
        int[] arr2 = new int[arr.size() - 1];
        for (int i = 0; i < arr.size() - 1; i++) {
            arr2[i] = arr1[i];
        }
        for (int i = 1; i < arr.size() - 1; i++) {
            int[] subarray = new int[i + 1];
            System.arraycopy(arr2, 0, subarray, 0, i);
            System.arraycopy(arr1, i, subarray, i, i + 1);
            int res = 0;
            for (int j = 0; j < subarray.length; j++) {
                res += subarray[j] * subarray[j + 1];
            }
            res += arr1[i - 1] * arr1[i + 1];
            res *= Math.pow(2, arr.size() - i - 1);
            System.out.println("res=" + res);
            ret = ret + res;
        }
        return ret;
    }

    
    public static int sumOfSubarrayProd_Problem_1_3fe23aee_130a_40f2_9713_e7847bfcae59(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_1e99b4ec_f595_4c4a_9707_edee207c28d9(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_928dbf1b_423a_4849_96b3_02d9bb2ce10b(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_4177f286_4f04_4772_929e_e9b3d2de696a(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_68893cc2_4ea2_4542_ad94_d2b0271096f8(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_cc41f43b_6955_435f_8be6_2c4f23066176(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_cf2f611b_4fe8_4852_bae3_51c44e982410(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_ce731f89_e462_4be9_99f9_399984d9bd43(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_19cb42a8_9489_4875_8565_0d2e1bc7c4bf(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_6ae06bf3_86ba_4e12_84b5_38ca9236d4f3(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_5fd79114_1e80_46b4_b5c1_144560392b6a(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_30aaa735_6945_42f2_b871_13c9d986be78(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_7fda00bb_24c4_45e1_922e_1eba28ae9899(ArrayList<Integer> arr) {
        if(arr.isEmpty()){
            return 0;
        }
        int sum=0;
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<i;j++){
                sum+=arr.get(i);
            }
            sum-=arr.get(i);
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_94495d58_b237_457a_a4ff_c0f0b0e83cb6(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_88c51ade_d5ab_487d_83ee_fa9f90442630(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_ceaeaf87_8770_499e_bf68_d7993c22bc3c(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_1bf4f33d_9f1c_44ab_b1da_58bdb130854c(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                int prod = 1;
                for(int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_89ad2d40_1802_47da_86bb_c8d54699fa52(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_67ef55ae_e9de_4fd8_ab72_89d487d37006(ArrayList<Integer> arr) {
        if (arr == null || arr.size() == 0) {
            return 0;
        }
        int N = arr.size();
        int[] n = new int[N];
        int ret = 0;
        for (int i = 0; i < N; i++) {
            n[i] = arr.get(i);
        }

        // System.out.println("n: " + Arrays.toString(n));
        for (int i = 1; i < N; i++) {
            for (int j = i; j < N; j++) {
                ret += n[i] * n[j];
            }
        }
        return ret;
    }

    
    public static int sumOfSubarrayProd_Problem_0_67f818d3_a6c6_4e00_b6a3_0c864e2f8dee(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
                product *= arr.get(i);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_4d679a6a_7c73_41d4_8c13_c510811b8689(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_91d89062_604d_462a_92e9_b41cc40dc2be(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_a1154d5a_427d_4067_8d67_f90d62833f26(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_c56efd03_eebb_4f71_8255_b1665427634d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_6bb1d801_2c2f_43c1_8f59_47ff4d22f934(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_b1fd710d_b88d_4b05_9f44_c17383b0af2a(ArrayList<Integer> arr) {
        int n = arr.size();
        int sum = 0;
        int result = 0;

        //System.out.println("The array is " + Arrays.toString(arr));

        for (int i = 0; i < n; i++) {
            int prod = 0;

            for (int j = i; j < n; j++) {
                prod += arr.get(i);
                result += (prod * arr.get(j));
            }

            sum += result;
            result = 0;
        }
        System.out.println(sum);
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_cc41f43b_6955_435f_8be6_2c4f23066176(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_bedb16e0_b965_4914_a1a1_6386e539898e(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_e967a67c_44e5_4865_979c_92bda1291bd8(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_51abe1dd_b068_4c87_911f_372e526850f2(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_628a9e61_1403_4dcf_9abf_ed817bbd5c84(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_4c4dd763_7956_4860_9874_c3e955933801(ArrayList<Integer> arr) {
        int sum = 0;
        int currSum = 0;
        for (int i : arr) {
            for (int j : arr) {
                currSum = i * j;
                sum += currSum;
                if (sum > 100000000) break;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_7174f099_74aa_401d_883e_28dbbf7c08f6(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_071ecf13_429a_4ffa_9938_5aee42fa4cd7(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_cb588ed5_68d3_4260_a807_9fdd4d8925e2(ArrayList<Integer> arr) {
        int sum = 0;
        // System.out.println(arr);
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int mult = arr.get(i) * arr.get(j);
                sum += mult;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_ab563eb0_03b8_493c_beb9_c2a23a17811b(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_da991208_b502_41f2_9da6_fb842ca69b5a(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_457df143_0698_480a_a5b4_582de54a5644(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_440dccbd_ab3b_4284_8728_35b66219308b(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_330c5305_2f57_43d3_8463_31e255dda649(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_95a7a4f5_310e_4c04_a42e_8a68eae6c46e(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                for(int k = j; k < arr.size(); k++) {
                    for(int l = k; l < arr.size(); l++) {
                        sum += arr.get(i) * arr.get(j) * arr.get(k) * arr.get(l);
                        product *= arr.get(k);
                    }
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_43fbe4ec_dada_4e0d_8ff9_c10912eda0f5(ArrayList<Integer> arr) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int subarr : arr) {
            int tempProduct = subarr * subarr;
            for (int i = 0; i < arr.size(); i++) {
                int tempSubarr = subarr - arr.get(i);
                result.add(tempProduct * tempSubarr);
            }
        }
        return result.stream().reduce((a, b) -> a + b).get();
    }

    
    public static int sumOfSubarrayProd_Problem_0_01e2617f_ba47_47b9_86da_254f16e55020(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_a4171056_b4f0_43ac_ae51_e5324435a10a(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_9159493b_5058_4050_af56_63a2f63d5912(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_113c1117_bfd4_44a1_8ff5_aa26a327adcc(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_a9d2ab51_1e96_4eef_af6b_7302d918b2fa(ArrayList<Integer> arr) {
        
        int sum = 1;
        // for getting all possible subarrays of a given array
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                sum = sum + product;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_e18015e5_70e7_4266_99d7_17cc7167e060(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_9bffdf5d_feec_4c76_9cee_5700866d94e6(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_1cabd684_1bae_43a4_97d6_9d533e3e7caa(ArrayList<Integer> arr) {
        // Write your code here
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    ans += arr.get(i) * arr.get(j) * arr.get(k);
                }
            }
        }
        return ans;
    }

    
    public static int sumOfSubarrayProd_Problem_1_364743c0_e053_4842_9adc_e621f9a74fb7(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_e3448ddb_7697_4988_bafd_fe6b04c85afe(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_010ddb7e_7489_4637_bbf5_c67808b94387(ArrayList<Integer> arr) {
        //System.out.println(arr);
        int n = arr.size();
        int[] val = new int[arr.size()];
        int result = 0;
        for (int i = 0; i < n; i++) {
            val[i] = arr.get(i);
        }
        Arrays.sort(val);
        int count = 2;
        while (count < n) {
            int j = 0;
            while (j < n && val[j] == val[n - count]) {
                j++;
            }
            for (int k = j + 1; k < n; k++) {
                val[k] = val[k - 1];
            }
            result += val[n - 1];
            count++;
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_1_679a8f9e_d0fb_4666_8016_de99bf29ca8b(ArrayList<Integer> arr) {
        int sum = 0;
        int prod = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                prod = prod * arr.get(i);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_5b3b5fa6_470a_4436_8273_4a430a75ca3d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_54589617_039a_407b_a7ec_b73361fdb5ff(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_b3a79719_fa75_4084_8793_f639f78ad11d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_67f818d3_a6c6_4e00_b6a3_0c864e2f8dee(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
                product *= arr.get(i);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_51db765d_bfba_4aef_89ed_3d62617f34e2(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_7a1565c2_5f71_426c_9dd9_cd66a649352d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_9159493b_5058_4050_af56_63a2f63d5912(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_b41ffe98_4f42_4a4f_9cce_986346a29bc7(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            int j = i;
            while (j + 1 < arr.size() && arr.get(j + 1) > arr.get(j)) {
                j++;
            }
            int k = j;
            while (k + 1 < arr.size() && arr.get(k + 1) > arr.get(k)) {
                k++;
            }
            int l = k;
            while (l + 1 < arr.size() && arr.get(l + 1) > arr.get(l)) {
                l++;
            }
            sum += product * (arr.get(i) - arr.get(j)) * (arr.get(k) - arr.get(l));
            product = product * arr.get(i);
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_e044caeb_e23d_4ddf_b433_af8b3f2a7a6f(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_12dc65e4_4bb2_4d85_957b_682270ae5731(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int sumOfSubarrayProd_Problem_2_12dc65e4_4bb2_4d85_957b_682270ae5731 = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sumOfSubarrayProd_Problem_2_12dc65e4_4bb2_4d85_957b_682270ae5731 += arr.get(i) * arr.get(j);
            }
            sum += arr.get(i);
            product = arr.get(i) * product;
        }
        sumOfSubarrayProd_Problem_2_12dc65e4_4bb2_4d85_957b_682270ae5731 = sumOfSubarrayProd_Problem_2_12dc65e4_4bb2_4d85_957b_682270ae5731 * product;
        return sumOfSubarrayProd_Problem_2_12dc65e4_4bb2_4d85_957b_682270ae5731;
    }

    
    public static int sumOfSubarrayProd_Problem_0_82944869_3b67_410b_b2f9_595769cf2ffc(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_af606434_c654_4bec_abb2_2c9f6d8c9120(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int maxProduct = Integer.MAX_VALUE;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = arr.get(i) * arr.get(j);
                if(product > maxProduct) {
                    maxProduct = product;
                }
                sum += product;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_7174f099_74aa_401d_883e_28dbbf7c08f6(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_e784b6d4_2812_45e0_ae2d_1b317579bec5(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_d9f59272_8231_477b_ba56_9e327ba33060(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_eb273a75_1013_48a1_b0dc_521c6101f3c0(ArrayList<Integer> arr) {
        int N = arr.size();
        if (N == 0) return 0;
        int arrSum = 0; // sum of product of all subarray
        int retVal = 0;
        int i = N - 1;
        int j = N - 1;
        List<ArrayList<Integer>> sublists = new ArrayList<ArrayList<Integer>>();
        do {
            if (i == 0 || j == 0) {
                // no subarrays
                arrSum += arr.get(i);
            } else if (i - j > 1) {
                ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(arr.get(i), arr.get(j)));
                sublists.add(a);
            }
            j--;
            if (j >= 0) {
                i--;
            }
        } while (i >= 0);
        // iterate over sublists
        for (ArrayList<Integer> sublist : sublists) {
            retVal += sublist.get(0);
            for (int k = 1; k < sublist.size(); k++) {
                retVal += sublist.get(k) * arr.get(i - k + j);
            }
        }
        return retVal;
    }

    
    public static int sumOfSubarrayProd_Problem_0_39e085ff_fc11_4a90_b4f9_a58d18fe7e9e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_4e89177e_c794_4b31_8de5_3c8a3abaa242(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_6ea59151_1f8a_4584_8a40_476e2c5b03cb(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_ec8ce8dc_13cf_4869_ba57_42c11dbe889d(ArrayList<Integer> arr) {
        // your code goes here
        int size = arr.size();
        int ans = 1;
        for(int i=0; i<size; i++) {
            ans = ans * arr.get(i);
        }
        return ans;
    }

    
    public static int sumOfSubarrayProd_Problem_1_2a59201b_d3b7_4764_8a49_0aa55672a5c2(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_f3c656fb_b3eb_49d9_b911_afebecb66dc2(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int maxProduct = 1;
        int maxSum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = arr.get(i) * arr.get(j);
                sum += product;
                if(product > maxProduct) {
                    maxProduct = product;
                }
                if(sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_cf2f611b_4fe8_4852_bae3_51c44e982410(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_5f6ab750_e7fd_4511_abcb_43d4cb3c7451(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_fca91474_4313_4600_900e_ed5fedf87fdd(ArrayList<Integer> arr) {
        int sum = 0;
        
        int n = arr.size();
        
        // Iterate over all subarrays of length n
        for(int i=0; i<n; i++) {
            // For each subarray, iterate over all possible subarrays
            for(int j=i; j<n; j++) {
                
                // For each possible subarray, find the product of all elements
                for(int k=0; k<n; k++) {
                    
                    // Add to the total sum
                    sum = sum + arr.get(i) * arr.get(j) * arr.get(k);
                }
            }
        }
        
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_58c8f53c_40ef_4fc0_8ec9_738620066e45(ArrayList<Integer> arr) {
        int res = 0;
        int n = arr.size();
        for(int i=1; i<=n; i++) {
            for(int j=1; j<n; j++) {
                if(i>j) {
                    if(arr.get(i-j)*arr.get(j) > 0) {
                        res += arr.get(i-j) * arr.get(j);
                    }
                }
            }
        }
        return res;
    }

    
    public static int sumOfSubarrayProd_Problem_1_7e622fa2_000b_4fd4_8e8c_52ed979ce2f2(ArrayList<Integer> arr) {
        int sum = 0;
        
        // First pass: we find the number of elements that make up the first subarray
        int k = arr.size(); 

        // Now we find the sum of all possible subarrays. We will use subarrays that consist of
        // consecutive elements
        for (int i = 1; i < k; i++) {
            sum = sum + arr.get(i - 1) * arr.get(i);
        }
        
        // Second pass: we find the number of elements that make up the second subarray
        // Same as in the first pass, except for i = k - 1
        for (int i = k - 1; i >= 0; i--) {
            sum = sum + arr.get(i) * arr.get(k - 1);
        }
        
        return sum;
    }

}
