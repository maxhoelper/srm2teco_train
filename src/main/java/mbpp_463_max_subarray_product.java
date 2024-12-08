package mbpp_463_max_subarray_product;

public class mbpp_463_max_subarray_product {

    
    public static int maxSubarrayProduct_Problem_0_97ef51f4_4825_4730_bc75_cd8f5381b4a9(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_79bca773_f732_40b6_97aa_79dc94e41514(ArrayList<Integer> arr) {
        int max_so_far = arr.get(0);
        int min_so_far = arr.get(0);
        int max_ending_here = arr.get(0);
        int min_ending_here = arr.get(0);
        int max_product = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int x = arr.get(i);
            max_ending_here = Math.max(Math.max(x, x * max_so_far), x * min_so_far);
            min_ending_here = Math.min(Math.min(x, x * max_so_far), x * min_so_far);
            max_so_far = max_ending_here;
            min_so_far = min_ending_here;
            max_product = Math.max(max_product, max_so_far);
        }
        return max_product;
    }

    
    public static int maxSubarrayProduct_Problem_1_75c95bf5_4969_44bd_9a0a_16ffea113b72(ArrayList<Integer> arr) {
        int maxProduct = 1;
        int minProduct = 1;
        int maxSoFar = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                maxProduct = maxProduct * arr.get(i);
                minProduct = Math.min(minProduct * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                maxProduct = 1;
                minProduct = 1;
            } else {
                int temp = maxProduct;
                maxProduct = Math.max(minProduct * arr.get(i), 1);
                minProduct = temp * arr.get(i);
            }
            if (maxSoFar < maxProduct) {
                maxSoFar = maxProduct;
            }
        }
        return maxSoFar;
    }

    
    public static int maxSubarrayProduct_Problem_1_894dca6d_1dc0_46b2_9160_3a7430bfbe03(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_b302823d_d6a9_452b_a161_f64072a7b545(ArrayList<Integer> arr) {
        int maxProduct = Integer.MIN_VALUE;
        int maxSubarray = 0;
        int currentProduct = 0;
        int currentSubarray = 0;
        for(int i = 0; i < arr.size(); i++) {
            currentProduct = arr.get(i);
            currentSubarray = 1;
            for(int j = i; j < arr.size(); j++) {
                currentProduct *= arr.get(j);
                currentSubarray++;
                if(currentProduct > maxProduct) {
                    maxProduct = currentProduct;
                    maxSubarray = currentSubarray;
                }
            }
        }
        return maxProduct;
    }

    
    public static int maxSubarrayProduct_Problem_2_ee903e2b_fa77_4a7e_8f40_6c34d1d0375e(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_b778c008_790f_45df_a218_c66380fb9f35(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_1_5fba94e2_2951_49e2_870a_013502c57731(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_36af3165_9cc2_4a1b_b512_4b80e175aa24(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_6f854efb_64f0_49b2_a8bb_28c22905e0d9(ArrayList<Integer> arr) {
        int maxProduct = 1;
        int minProduct = 1;
        int maxSoFar = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                maxProduct = maxProduct * arr.get(i);
                minProduct = Math.min(minProduct * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                maxProduct = 1;
                minProduct = 1;
            } else {
                int temp = maxProduct;
                maxProduct = Math.max(minProduct * arr.get(i), 1);
                minProduct = temp * arr.get(i);
            }
            if (maxSoFar < maxProduct) {
                maxSoFar = maxProduct;
            }
        }
        return maxSoFar;
    }

    
    public static int maxSubarrayProduct_Problem_0_aaf6373c_d9e1_420d_a553_0c48c13a7004(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_0e23ad17_eb1e_41e2_a8a5_e6589140fb38(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_0_ee903e2b_fa77_4a7e_8f40_6c34d1d0375e(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_79a16fa0_c2d4_43e4_ac1f_1d8488e82045(ArrayList<Integer> arr) {
        int maxProduct = 0;
        int currentProduct = 1;
        for (int i = 0; i < arr.size(); i++) {
            currentProduct *= arr.get(i);
            maxProduct = Math.max(maxProduct, currentProduct);
            if (currentProduct == 0) {
                currentProduct = 1;
            }
        }
        currentProduct = 1;
        for (int i = arr.size() - 1; i >= 0; i--) {
            currentProduct *= arr.get(i);
            maxProduct = Math.max(maxProduct, currentProduct);
            if (currentProduct == 0) {
                currentProduct = 1;
            }
        }
        return maxProduct;
    }

    
    public static int maxSubarrayProduct_Problem_0_679d0f66_668d_409f_b52d_cab1706e8c8d(ArrayList<Integer> arr) {
        int max = 0;
        int maxProduct = Integer.MAX_VALUE;
        int product;
        int sum = 0;
        int sumProduct = 0;
        for(int i = 0; i < arr.size(); i++) {
            product = arr.get(i);
            sum += product;
            sumProduct += product;
            if(sumProduct > maxProduct) {
                max = sumProduct;
                maxProduct = sumProduct;
            }
        }
        return max;
    }

    
    public static int maxSubarrayProduct_Problem_1_84b5d162_651d_4a81_89bd_449f027a02e4(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_1fdc08d8_0c16_4264_aa21_f360230df069(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_21649b5b_b1bd_494d_9f25_1bc9683cfd59(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_500d3c6f_6f3d_46ef_961b_6476c9076357(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_2_6f93825b_c5b2_477c_830b_75e03578976e(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_4375149e_b457_4f53_b90c_816e8841a664(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_136d83cf_5c2d_4be4_a84a_3da70332fed5(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_2_185d770d_1651_466f_8e99_1d78cc16a9bb(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_35284431_b7b9_48f5_a997_1c20141243a8(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_c070547f_3247_4817_8561_379d44ed0d3b(ArrayList<Integer> arr) {
        int maxProduct = Integer.MIN_VALUE;
        int maxProductIndex = 0;
        int maxProductSubArrayIndex = 0;
        int maxProductSubArrayProduct = Integer.MIN_VALUE;
        for(int i = 0; i < arr.size(); i++) {
            int product = arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                int subArrayProduct = arr.get(j) * arr.get(i);
                if(subArrayProduct > maxProductSubArrayProduct) {
                    maxProductSubArrayProduct = subArrayProduct;
                    maxProductSubArrayIndex = j;
                }
            }
            if(product > maxProduct) {
                maxProduct = product;
                maxProductIndex = i;
            }
        }
        return maxProduct;
    }

    
    public static int maxSubarrayProduct_Problem_1_6ad1caec_24cd_4154_a983_5ec27bb9ccad(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_3436c874_8bab_4d96_ad3c_6959031db3dc(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_7a3b4760_b39c_499a_8598_c0c917440fc2(ArrayList<Integer> arr) {
        int max_so_far = arr.get(0);
        int min_so_far = arr.get(0);
        int max_ending_here = 1;
        int min_ending_here = 1;
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (min_so_far > min_ending_here)
                min_so_far = min_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_1640a82f_9051_4d51_a542_b0a1f48a157c(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_00b595bd_28f2_4a59_b139_3eba0d0215c4(ArrayList<Integer> arr) {
        int max = 0;
        int maxProduct = 0;
        int product = 0;
        int sum = 0;
        int sumProduct = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            sumProduct += arr.get(i);
        }
        for(int i = 0; i < arr.size(); i++) {
            product = sumProduct / sum;
            if(product > maxProduct) {
                maxProduct = product;
                max = sumProduct / sum;
            }
            sumProduct -= arr.get(i);
            sum -= arr.get(i);
        }
        return maxProduct;
    }

    
    public static int maxSubarrayProduct_Problem_0_fb52a086_ce28_4bba_a1b6_80d7679f7c79(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_1997dc4a_a82a_4c5f_bbdf_876dd01ad49c(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_7a3b4760_b39c_499a_8598_c0c917440fc2(ArrayList<Integer> arr) {
        int max_so_far = arr.get(0);
        int min_so_far = arr.get(0);
        int max_ending_here = 1;
        int min_ending_here = 1;
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (min_so_far > min_ending_here)
                min_so_far = min_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_4d8d3b80_f55a_421d_bba2_946bba374dbc(ArrayList<Integer> arr) {
        int max_so_far = arr.get(0);
        int min_so_far = arr.get(0);
        int max_ending_here = arr.get(0);
        int min_ending_here = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int x = arr.get(i);
            max_ending_here = Math.max(x, Math.max(x * max_ending_here, x * min_ending_here));
            min_ending_here = Math.min(x, Math.min(x * max_ending_here, x * min_ending_here));
            max_so_far = Math.max(max_so_far, max_ending_here);
            min_so_far = Math.min(min_so_far, min_ending_here);
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_60d81155_9c15_44ab_8187_478c16613fff(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_1_99f0f52a_c887_4aac_8063_65fe6b80bf78(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_0f3f841c_920e_4a98_8f31_06cf98adef41(ArrayList<Integer> arr) {
        int max = 0;
        int maxProduct = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product = arr.get(i);
            for(int j = i; j < arr.size(); j++) {
                product = product * arr.get(j);
                if(product > maxProduct) {
                    max = product;
                    maxProduct = product;
                }
            }
        }
        return maxProduct;
    }

    
    public static int maxSubarrayProduct_Problem_2_84b5d162_651d_4a81_89bd_449f027a02e4(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_500d3c6f_6f3d_46ef_961b_6476c9076357(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_1_fe079095_89bc_4e7f_8b48_312fe7f67ace(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_0_bda4cde2_7f1e_4f7f_87a7_d3b93fd4e0b6(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_9143e7c3_ff8b_4c93_b4e2_b0244c3968e9(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_98822e24_7474_4560_80dc_a5b6d03b0ea0(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_1640a82f_9051_4d51_a542_b0a1f48a157c(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_340d0422_3471_4c9f_8dc2_68db527e4930(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_ff62a858_a7cf_4f5d_b9c0_93607005d9e5(ArrayList<Integer> arr) {
        int max = 0;
        int maxSubarrayProduct_Problem_0_ff62a858_a7cf_4f5d_b9c0_93607005d9e5 = 0;
        for(int i = 0; i < arr.size(); i++) {
            int product = 1;
            for(int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
            }
            if(product > max) {
                max = product;
                maxSubarrayProduct_Problem_0_ff62a858_a7cf_4f5d_b9c0_93607005d9e5 = product;
            }
        }
        return maxSubarrayProduct_Problem_0_ff62a858_a7cf_4f5d_b9c0_93607005d9e5;
    }

    
    public static int maxSubarrayProduct_Problem_1_07806d8c_6e59_4ff3_8d78_b5cb6dd83660(ArrayList<Integer> arr) {
        int max_so_far = arr.get(0);
        int min_so_far = arr.get(0);
        int max_ending_here = arr.get(0);
        int min_ending_here = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = Math.max(max_ending_here * arr.get(i), arr.get(i));
                min_ending_here = Math.min(min_ending_here * arr.get(i), arr.get(i));
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), arr.get(i));
                min_ending_here = Math.min(temp * arr.get(i), arr.get(i));
            }
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_bc6b677f_a132_42dc_b171_236b38afcb53(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        int maxProduct = Integer.MIN_VALUE;
        for(int i = 0; i < arr.size(); i++) {
            product = arr.get(i);
            for(int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if(product > maxProduct) {
                    maxProduct = product;
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxSubarrayProduct_Problem_2_1f950b78_6066_4606_af3f_51bb2a5aafb6(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_97ef51f4_4825_4730_bc75_cd8f5381b4a9(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_b476eab9_3315_4984_a84b_a73d7b10cc66(ArrayList<Integer> arr) {
        int max = 0;
        int maxProduct = Integer.MAX_VALUE;
        for(int i = 0; i < arr.size(); i++) {
            int product = arr.get(i);
            for(int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
            }
            max = Math.max(product, max);
            maxProduct = Math.max(maxProduct, product);
        }
        return maxProduct;
    }

    
    public static int maxSubarrayProduct_Problem_0_702a44bc_759a_488a_ba97_c248e660ce9b(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_c0d7fa77_2149_49aa_bb5c_185a5508a988(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_50ebfd4b_45a0_49b7_9d9a_98b346cfc897(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_cfa56a3e_c6c8_409c_bc2e_3e68b5f4de03(ArrayList<Integer> arr) {
        // Write your code here.
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_8bfce62a_e749_4a27_9313_2f701db6d224(ArrayList<Integer> arr) {
        int maxProduct = 1;
        int minProduct = 1;
        int maxSoFar = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                maxProduct = maxProduct * arr.get(i);
                minProduct = Math.min(minProduct * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                maxProduct = 1;
                minProduct = 1;
            } else {
                int temp = maxProduct;
                maxProduct = Math.max(minProduct * arr.get(i), 1);
                minProduct = temp * arr.get(i);
            }
            if (maxSoFar < maxProduct) {
                maxSoFar = maxProduct;
            }
        }
        return maxSoFar;
    }

    
    public static int maxSubarrayProduct_Problem_2_fa7ec3cc_ad4d_4554_b1b4_e50484dcd3f0(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_679d0f66_668d_409f_b52d_cab1706e8c8d(ArrayList<Integer> arr) {
        int max = 0;
        int maxProduct = Integer.MAX_VALUE;
        int product;
        int sum = 0;
        int sumProduct = 0;
        for(int i = 0; i < arr.size(); i++) {
            product = arr.get(i);
            sum += product;
            sumProduct += product;
            if(sumProduct > maxProduct) {
                max = sumProduct;
                maxProduct = sumProduct;
            }
        }
        return max;
    }

    
    public static int maxSubarrayProduct_Problem_0_96f6881c_0214_4ebb_8106_542348f7b808(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_fa7ec3cc_ad4d_4554_b1b4_e50484dcd3f0(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_96f6881c_0214_4ebb_8106_542348f7b808(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_6628188c_6cb4_4658_98a6_a6233825d142(ArrayList<Integer> arr) {
        int max = 0;
        int maxProduct = Integer.MIN_VALUE;
        int product = 0;
        int sum = 0;
        int sumProduct = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            sumProduct += arr.get(i);
            product = sumProduct * sum;
            if(product > maxProduct) {
                max = product;
                maxProduct = product;
            }
        }
        return max;
    }

    
    public static int maxSubarrayProduct_Problem_2_ad808b4e_bcf9_4968_b57e_3f0e32b648c9(ArrayList<Integer> arr) {
        int max = 0;
        int maxProduct = 0;
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            product = sum;
            for(int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
            }
            if(product > maxProduct) {
                max = product;
                maxProduct = max;
            }
        }
        return maxProduct;
    }

    
    public static int maxSubarrayProduct_Problem_2_7ebb921c_6c84_40f0_9a8b_a3bcecfdc3d1(ArrayList<Integer> arr) {
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

    
    public static int maxSubarrayProduct_Problem_1_7dd658db_d72c_4fbc_8542_d321eb900958(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_e30122e8_d844_4d3f_9e47_a301b529d25e(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_1_3db8593d_6414_47d6_8cd2_bdd4c945d48d(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_f86200eb_febf_48fb_abb1_395e1bfe7add(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int ans = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > ans)
                ans = max;
        }
        return ans;
    }

    
    public static int maxSubarrayProduct_Problem_2_7dd658db_d72c_4fbc_8542_d321eb900958(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_c5d139ed_94b0_4e75_8722_6706ff231092(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_d0fb42ed_bc21_4657_8d08_3fb34ead2a83(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_b302823d_d6a9_452b_a161_f64072a7b545(ArrayList<Integer> arr) {
        int maxProduct = Integer.MIN_VALUE;
        int maxSubarray = 0;
        int currentProduct = 0;
        int currentSubarray = 0;
        for(int i = 0; i < arr.size(); i++) {
            currentProduct = arr.get(i);
            currentSubarray = 1;
            for(int j = i; j < arr.size(); j++) {
                currentProduct *= arr.get(j);
                currentSubarray++;
                if(currentProduct > maxProduct) {
                    maxProduct = currentProduct;
                    maxSubarray = currentSubarray;
                }
            }
        }
        return maxProduct;
    }

    
    public static int maxSubarrayProduct_Problem_2_2b893af0_d357_4ca8_a17b_853ce6fe8e7a(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_1145f1b8_84f6_4cdd_8ee5_97b27a5521bf(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_6840e64f_3d15_4817_b83f_59642aaacb34(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_0_a9593238_8e10_412e_8364_86f3fba551cf(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_9143e7c3_ff8b_4c93_b4e2_b0244c3968e9(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_340d0422_3471_4c9f_8dc2_68db527e4930(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_934e2362_2ce0_4699_9f69_7d5bb42df51a(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_702a44bc_759a_488a_ba97_c248e660ce9b(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_07806d8c_6e59_4ff3_8d78_b5cb6dd83660(ArrayList<Integer> arr) {
        int max_so_far = arr.get(0);
        int min_so_far = arr.get(0);
        int max_ending_here = arr.get(0);
        int min_ending_here = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = Math.max(max_ending_here * arr.get(i), arr.get(i));
                min_ending_here = Math.min(min_ending_here * arr.get(i), arr.get(i));
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), arr.get(i));
                min_ending_here = Math.min(temp * arr.get(i), arr.get(i));
            }
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_9bb9081a_353a_4d99_b29e_fcb49305d3b8(ArrayList<Integer> arr) {
        int maxProduct = 1;
        int minProduct = 1;
        int maxSoFar = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                maxProduct = maxProduct * arr.get(i);
                minProduct = Math.min(minProduct * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                maxProduct = 1;
                minProduct = 1;
            } else {
                int temp = maxProduct;
                maxProduct = Math.max(minProduct * arr.get(i), 1);
                minProduct = temp * arr.get(i);
            }
            if (maxSoFar < maxProduct) {
                maxSoFar = maxProduct;
            }
        }
        return maxSoFar;
    }

    
    public static int maxSubarrayProduct_Problem_1_a099754d_d186_4d63_a08d_5fc4cada69eb(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_1145f1b8_84f6_4cdd_8ee5_97b27a5521bf(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_79bca773_f732_40b6_97aa_79dc94e41514(ArrayList<Integer> arr) {
        int max_so_far = arr.get(0);
        int min_so_far = arr.get(0);
        int max_ending_here = arr.get(0);
        int min_ending_here = arr.get(0);
        int max_product = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int x = arr.get(i);
            max_ending_here = Math.max(Math.max(x, x * max_so_far), x * min_so_far);
            min_ending_here = Math.min(Math.min(x, x * max_so_far), x * min_so_far);
            max_so_far = max_ending_here;
            min_so_far = min_ending_here;
            max_product = Math.max(max_product, max_so_far);
        }
        return max_product;
    }

    
    public static int maxSubarrayProduct_Problem_0_75c95bf5_4969_44bd_9a0a_16ffea113b72(ArrayList<Integer> arr) {
        int maxProduct = 1;
        int minProduct = 1;
        int maxSoFar = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                maxProduct = maxProduct * arr.get(i);
                minProduct = Math.min(minProduct * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                maxProduct = 1;
                minProduct = 1;
            } else {
                int temp = maxProduct;
                maxProduct = Math.max(minProduct * arr.get(i), 1);
                minProduct = temp * arr.get(i);
            }
            if (maxSoFar < maxProduct) {
                maxSoFar = maxProduct;
            }
        }
        return maxSoFar;
    }

    
    public static int maxSubarrayProduct_Problem_0_185d770d_1651_466f_8e99_1d78cc16a9bb(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_9bb9081a_353a_4d99_b29e_fcb49305d3b8(ArrayList<Integer> arr) {
        int maxProduct = 1;
        int minProduct = 1;
        int maxSoFar = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                maxProduct = maxProduct * arr.get(i);
                minProduct = Math.min(minProduct * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                maxProduct = 1;
                minProduct = 1;
            } else {
                int temp = maxProduct;
                maxProduct = Math.max(minProduct * arr.get(i), 1);
                minProduct = temp * arr.get(i);
            }
            if (maxSoFar < maxProduct) {
                maxSoFar = maxProduct;
            }
        }
        return maxSoFar;
    }

    
    public static int maxSubarrayProduct_Problem_1_6ed89a32_9f3c_434f_85a0_7939779c1b78(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_7a3b4760_b39c_499a_8598_c0c917440fc2(ArrayList<Integer> arr) {
        int max_so_far = arr.get(0);
        int min_so_far = arr.get(0);
        int max_ending_here = 1;
        int min_ending_here = 1;
        int result = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (min_so_far > min_ending_here)
                min_so_far = min_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_7dd658db_d72c_4fbc_8542_d321eb900958(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_21649b5b_b1bd_494d_9f25_1bc9683cfd59(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_ad41b088_91f5_4f61_9637_4f85a8c3b973(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int max_so_far = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            max_so_far = Math.max(max, max_so_far);
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_6e979e99_cac1_446a_8369_04f48e5106d7(ArrayList<Integer> arr) {
        int maxProduct = Integer.MIN_VALUE;
        int maxProductIndex = 0;
        int maxProductValue = 0;
        for(int i = 0; i < arr.size(); i++) {
            int product = arr.get(i);
            for(int j = i; j < arr.size(); j++) {
                int value = arr.get(j);
                product = product * value;
                if(product > maxProduct) {
                    maxProduct = product;
                    maxProductIndex = j;
                    maxProductValue = value;
                }
            }
        }
        return maxProduct;
    }

    
    public static int maxSubarrayProduct_Problem_0_bebcfbd9_b9bd_4048_a764_6beb4292707b(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_c0d7fa77_2149_49aa_bb5c_185a5508a988(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_bae10227_bf81_433f_9dd5_5f4c44a63eb0(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_21649b5b_b1bd_494d_9f25_1bc9683cfd59(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_d1068d18_2bed_4007_8e66_24ad363f6097(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_0_fe079095_89bc_4e7f_8b48_312fe7f67ace(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_0_7750e033_5b63_463f_9218_f10585b737cf(ArrayList<Integer> arr) {
        int maxProduct = 1;
        int minProduct = 1;
        int maxSoFar = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                maxProduct = maxProduct * arr.get(i);
                minProduct = Math.min(minProduct * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                maxProduct = 1;
                minProduct = 1;
            } else {
                int temp = maxProduct;
                maxProduct = Math.max(minProduct * arr.get(i), 1);
                minProduct = temp * arr.get(i);
            }
            if (maxSoFar < maxProduct) {
                maxSoFar = maxProduct;
            }
        }
        return maxSoFar;
    }

    
    public static int maxSubarrayProduct_Problem_2_a099754d_d186_4d63_a08d_5fc4cada69eb(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_56be2530_d269_4945_b633_a3c16d764a89(ArrayList<Integer> arr) {
        int maxProduct = Integer.MIN_VALUE;
        int maxSubarray = 0;
        int currentProduct = 0;
        for(int i = 0; i < arr.size(); i++) {
            currentProduct = arr.get(i);
            for(int j = i; j < arr.size(); j++) {
                currentProduct *= arr.get(j);
                if(currentProduct > maxProduct) {
                    maxProduct = currentProduct;
                    maxSubarray = i;
                }
            }
        }
        return maxProduct;
    }

    
    public static int maxSubarrayProduct_Problem_0_894dca6d_1dc0_46b2_9160_3a7430bfbe03(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_56be2530_d269_4945_b633_a3c16d764a89(ArrayList<Integer> arr) {
        int maxProduct = Integer.MIN_VALUE;
        int maxSubarray = 0;
        int currentProduct = 0;
        for(int i = 0; i < arr.size(); i++) {
            currentProduct = arr.get(i);
            for(int j = i; j < arr.size(); j++) {
                currentProduct *= arr.get(j);
                if(currentProduct > maxProduct) {
                    maxProduct = currentProduct;
                    maxSubarray = i;
                }
            }
        }
        return maxProduct;
    }

    
    public static int maxSubarrayProduct_Problem_0_7ebb921c_6c84_40f0_9a8b_a3bcecfdc3d1(ArrayList<Integer> arr) {
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

    
    public static int maxSubarrayProduct_Problem_2_7750e033_5b63_463f_9218_f10585b737cf(ArrayList<Integer> arr) {
        int maxProduct = 1;
        int minProduct = 1;
        int maxSoFar = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                maxProduct = maxProduct * arr.get(i);
                minProduct = Math.min(minProduct * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                maxProduct = 1;
                minProduct = 1;
            } else {
                int temp = maxProduct;
                maxProduct = Math.max(minProduct * arr.get(i), 1);
                minProduct = temp * arr.get(i);
            }
            if (maxSoFar < maxProduct) {
                maxSoFar = maxProduct;
            }
        }
        return maxSoFar;
    }

    
    public static int maxSubarrayProduct_Problem_1_7750e033_5b63_463f_9218_f10585b737cf(ArrayList<Integer> arr) {
        int maxProduct = 1;
        int minProduct = 1;
        int maxSoFar = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                maxProduct = maxProduct * arr.get(i);
                minProduct = Math.min(minProduct * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                maxProduct = 1;
                minProduct = 1;
            } else {
                int temp = maxProduct;
                maxProduct = Math.max(minProduct * arr.get(i), 1);
                minProduct = temp * arr.get(i);
            }
            if (maxSoFar < maxProduct) {
                maxSoFar = maxProduct;
            }
        }
        return maxSoFar;
    }

    
    public static int maxSubarrayProduct_Problem_1_1997dc4a_a82a_4c5f_bbdf_876dd01ad49c(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_fa7ec3cc_ad4d_4554_b1b4_e50484dcd3f0(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_bc6b677f_a132_42dc_b171_236b38afcb53(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        int maxProduct = Integer.MIN_VALUE;
        for(int i = 0; i < arr.size(); i++) {
            product = arr.get(i);
            for(int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if(product > maxProduct) {
                    maxProduct = product;
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxSubarrayProduct_Problem_1_60d81155_9c15_44ab_8187_478c16613fff(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_2_5fba94e2_2951_49e2_870a_013502c57731(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_b476eab9_3315_4984_a84b_a73d7b10cc66(ArrayList<Integer> arr) {
        int max = 0;
        int maxProduct = Integer.MAX_VALUE;
        for(int i = 0; i < arr.size(); i++) {
            int product = arr.get(i);
            for(int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
            }
            max = Math.max(product, max);
            maxProduct = Math.max(maxProduct, product);
        }
        return maxProduct;
    }

    
    public static int maxSubarrayProduct_Problem_1_a9a37441_3032_4ca3_9447_02b5c57bd18a(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_aaf6373c_d9e1_420d_a553_0c48c13a7004(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_934e2362_2ce0_4699_9f69_7d5bb42df51a(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_500d3c6f_6f3d_46ef_961b_6476c9076357(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_2_b5125cd7_11c2_4e77_a5a2_51235eea3507(ArrayList<Integer> arr) {
        int maxProduct = Integer.MIN_VALUE;
        int maxProductIndex = 0;
        int maxProductValue = 0;
        int maxProductValueIndex = 0;
        for(int i = 0; i < arr.size(); i++) {
            int product = arr.get(i);
            for(int j = i; j < arr.size(); j++) {
                int value = arr.get(j);
                int productValue = product * value;
                if(productValue > maxProductValue) {
                    maxProductValue = productValue;
                    maxProductIndex = j;
                }
            }
        }
        return maxProduct;
    }

    
    public static int maxSubarrayProduct_Problem_1_934e2362_2ce0_4699_9f69_7d5bb42df51a(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_ee903e2b_fa77_4a7e_8f40_6c34d1d0375e(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_d0fb42ed_bc21_4657_8d08_3fb34ead2a83(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_99f0f52a_c887_4aac_8063_65fe6b80bf78(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_50ebfd4b_45a0_49b7_9d9a_98b346cfc897(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_84b5d162_651d_4a81_89bd_449f027a02e4(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_0f3f841c_920e_4a98_8f31_06cf98adef41(ArrayList<Integer> arr) {
        int max = 0;
        int maxProduct = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product = arr.get(i);
            for(int j = i; j < arr.size(); j++) {
                product = product * arr.get(j);
                if(product > maxProduct) {
                    max = product;
                    maxProduct = product;
                }
            }
        }
        return maxProduct;
    }

    
    public static int maxSubarrayProduct_Problem_2_6ad1caec_24cd_4154_a983_5ec27bb9ccad(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_4375149e_b457_4f53_b90c_816e8841a664(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_6628188c_6cb4_4658_98a6_a6233825d142(ArrayList<Integer> arr) {
        int max = 0;
        int maxProduct = Integer.MIN_VALUE;
        int product = 0;
        int sum = 0;
        int sumProduct = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            sumProduct += arr.get(i);
            product = sumProduct * sum;
            if(product > maxProduct) {
                max = product;
                maxProduct = product;
            }
        }
        return max;
    }

    
    public static int maxSubarrayProduct_Problem_2_79bca773_f732_40b6_97aa_79dc94e41514(ArrayList<Integer> arr) {
        int max_so_far = arr.get(0);
        int min_so_far = arr.get(0);
        int max_ending_here = arr.get(0);
        int min_ending_here = arr.get(0);
        int max_product = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int x = arr.get(i);
            max_ending_here = Math.max(Math.max(x, x * max_so_far), x * min_so_far);
            min_ending_here = Math.min(Math.min(x, x * max_so_far), x * min_so_far);
            max_so_far = max_ending_here;
            min_so_far = min_ending_here;
            max_product = Math.max(max_product, max_so_far);
        }
        return max_product;
    }

    
    public static int maxSubarrayProduct_Problem_0_1f950b78_6066_4606_af3f_51bb2a5aafb6(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_79a16fa0_c2d4_43e4_ac1f_1d8488e82045(ArrayList<Integer> arr) {
        int maxProduct = 0;
        int currentProduct = 1;
        for (int i = 0; i < arr.size(); i++) {
            currentProduct *= arr.get(i);
            maxProduct = Math.max(maxProduct, currentProduct);
            if (currentProduct == 0) {
                currentProduct = 1;
            }
        }
        currentProduct = 1;
        for (int i = arr.size() - 1; i >= 0; i--) {
            currentProduct *= arr.get(i);
            maxProduct = Math.max(maxProduct, currentProduct);
            if (currentProduct == 0) {
                currentProduct = 1;
            }
        }
        return maxProduct;
    }

    
    public static int maxSubarrayProduct_Problem_1_bc05a00c_2e8c_4445_8960_a1e01bc312d5(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_44cdd762_7d7c_4d75_a54f_58cfd825c596(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(arr.get(i), max * arr.get(i));
            min = Math.min(arr.get(i), min * arr.get(i));
            result = Math.max(result, max);
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_0_4215cae7_7d4b_4e5c_bef0_4f3ec7ffc075(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_4d8d3b80_f55a_421d_bba2_946bba374dbc(ArrayList<Integer> arr) {
        int max_so_far = arr.get(0);
        int min_so_far = arr.get(0);
        int max_ending_here = arr.get(0);
        int min_ending_here = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int x = arr.get(i);
            max_ending_here = Math.max(x, Math.max(x * max_ending_here, x * min_ending_here));
            min_ending_here = Math.min(x, Math.min(x * max_ending_here, x * min_ending_here));
            max_so_far = Math.max(max_so_far, max_ending_here);
            min_so_far = Math.min(min_so_far, min_ending_here);
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_5d2890ed_1105_4fbd_9fe1_218b1622ba87(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_1_7ebb921c_6c84_40f0_9a8b_a3bcecfdc3d1(ArrayList<Integer> arr) {
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

    
    public static int maxSubarrayProduct_Problem_1_5d2890ed_1105_4fbd_9fe1_218b1622ba87(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_1_1fdc08d8_0c16_4264_aa21_f360230df069(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_bd01c87a_b6c8_4a3e_9305_d21794c8a358(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_1145f1b8_84f6_4cdd_8ee5_97b27a5521bf(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_50ebfd4b_45a0_49b7_9d9a_98b346cfc897(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_cfa56a3e_c6c8_409c_bc2e_3e68b5f4de03(ArrayList<Integer> arr) {
        // Write your code here.
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_2b893af0_d357_4ca8_a17b_853ce6fe8e7a(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_1640a82f_9051_4d51_a542_b0a1f48a157c(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_679d0f66_668d_409f_b52d_cab1706e8c8d(ArrayList<Integer> arr) {
        int max = 0;
        int maxProduct = Integer.MAX_VALUE;
        int product;
        int sum = 0;
        int sumProduct = 0;
        for(int i = 0; i < arr.size(); i++) {
            product = arr.get(i);
            sum += product;
            sumProduct += product;
            if(sumProduct > maxProduct) {
                max = sumProduct;
                maxProduct = sumProduct;
            }
        }
        return max;
    }

    
    public static int maxSubarrayProduct_Problem_2_ad41b088_91f5_4f61_9637_4f85a8c3b973(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int max_so_far = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            max_so_far = Math.max(max, max_so_far);
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_6e979e99_cac1_446a_8369_04f48e5106d7(ArrayList<Integer> arr) {
        int maxProduct = Integer.MIN_VALUE;
        int maxProductIndex = 0;
        int maxProductValue = 0;
        for(int i = 0; i < arr.size(); i++) {
            int product = arr.get(i);
            for(int j = i; j < arr.size(); j++) {
                int value = arr.get(j);
                product = product * value;
                if(product > maxProduct) {
                    maxProduct = product;
                    maxProductIndex = j;
                    maxProductValue = value;
                }
            }
        }
        return maxProduct;
    }

    
    public static int maxSubarrayProduct_Problem_0_ee905c5c_844d_4f07_ad6c_6b072c4b3aef(ArrayList<Integer> arr) {
        int max_so_far = 1;
        int min_so_far = 1;
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_product = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
            if (min_so_far > min_ending_here) {
                min_so_far = min_ending_here;
            }
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_cff3712b_3934_4ecb_a79d_e6421eecdd65(ArrayList<Integer> arr) {
        int maxProduct = Integer.MIN_VALUE;
        int maxProductIndex = 0;
        int maxProductValue = 0;
        for(int i = 0; i < arr.size(); i++) {
            int product = arr.get(i);
            for(int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if(product > maxProduct) {
                    maxProduct = product;
                    maxProductIndex = j;
                    maxProductValue = arr.get(j);
                }
            }
        }
        return maxProduct;
    }

    
    public static int maxSubarrayProduct_Problem_2_2deca374_ca41_4f86_ad4e_a9f0e3675071(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_2_6ed89a32_9f3c_434f_85a0_7939779c1b78(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_bafb4177_2208_4ad4_be0c_f88289edcc72(ArrayList<Integer> arr) {
        int max = 0;
        int maxProduct = Integer.MIN_VALUE;
        int product = 1;
        int sum = 0;
        int sumProduct = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            sumProduct += arr.get(i);
            product = sumProduct * sum;
            if(product > maxProduct) {
                maxProduct = product;
                max = sumProduct;
            }
        }
        return max;
    }

    
    public static int maxSubarrayProduct_Problem_1_c5d139ed_94b0_4e75_8722_6706ff231092(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_8610b2e8_4cc0_433b_94ba_1b7f481cac4d(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_1_6840e64f_3d15_4817_b83f_59642aaacb34(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_0_136d83cf_5c2d_4be4_a84a_3da70332fed5(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_1_c070547f_3247_4817_8561_379d44ed0d3b(ArrayList<Integer> arr) {
        int maxProduct = Integer.MIN_VALUE;
        int maxProductIndex = 0;
        int maxProductSubArrayIndex = 0;
        int maxProductSubArrayProduct = Integer.MIN_VALUE;
        for(int i = 0; i < arr.size(); i++) {
            int product = arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                int subArrayProduct = arr.get(j) * arr.get(i);
                if(subArrayProduct > maxProductSubArrayProduct) {
                    maxProductSubArrayProduct = subArrayProduct;
                    maxProductSubArrayIndex = j;
                }
            }
            if(product > maxProduct) {
                maxProduct = product;
                maxProductIndex = i;
            }
        }
        return maxProduct;
    }

    
    public static int maxSubarrayProduct_Problem_1_96f6881c_0214_4ebb_8106_542348f7b808(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_fe079095_89bc_4e7f_8b48_312fe7f67ace(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_0_85a96d09_eaea_43bc_9b4e_8483a7c070a5(ArrayList<Integer> arr) {
        int max = 0;
        int maxProduct = Integer.MIN_VALUE;
        int product = Integer.MIN_VALUE;
        int sum = 0;
        int sumProduct = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            sumProduct += arr.get(i);
            product = sumProduct * sum;
            if(product > maxProduct) {
                max = product;
                maxProduct = product;
            }
        }
        return maxProduct;
    }

    
    public static int maxSubarrayProduct_Problem_2_99f0f52a_c887_4aac_8063_65fe6b80bf78(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_8610b2e8_4cc0_433b_94ba_1b7f481cac4d(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_0_d1ea9a41_164f_454b_b898_6c583a92d914(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int product = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            int curr = arr.get(i);
            if(curr > max) {
                max = curr;
            }
            if(curr < min) {
                min = curr;
            }
            product = product * curr;
        }
        return product;
    }

    
    public static int maxSubarrayProduct_Problem_1_1f950b78_6066_4606_af3f_51bb2a5aafb6(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_7321d927_a8ad_4477_beaa_728410862acb(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_2_f86200eb_febf_48fb_abb1_395e1bfe7add(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int ans = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > ans)
                ans = max;
        }
        return ans;
    }

    
    public static int maxSubarrayProduct_Problem_1_4215cae7_7d4b_4e5c_bef0_4f3ec7ffc075(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_3aa96217_b5f2_486b_aa71_30ab55ef0c8c(ArrayList<Integer> arr) {
        int maxProduct = 1;
        int minProduct = 1;
        int maxSoFar = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                maxProduct = maxProduct * arr.get(i);
                minProduct = Math.min(minProduct * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                maxProduct = 1;
                minProduct = 1;
            } else {
                int temp = maxProduct;
                maxProduct = Math.max(minProduct * arr.get(i), 1);
                minProduct = temp * arr.get(i);
            }
            if (maxSoFar < maxProduct) {
                maxSoFar = maxProduct;
            }
        }
        return maxSoFar;
    }

    
    public static int maxSubarrayProduct_Problem_1_97ef51f4_4825_4730_bc75_cd8f5381b4a9(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_bebcfbd9_b9bd_4048_a764_6beb4292707b(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_c5d139ed_94b0_4e75_8722_6706ff231092(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_ad808b4e_bcf9_4968_b57e_3f0e32b648c9(ArrayList<Integer> arr) {
        int max = 0;
        int maxProduct = 0;
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            product = sum;
            for(int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
            }
            if(product > maxProduct) {
                max = product;
                maxProduct = max;
            }
        }
        return maxProduct;
    }

    
    public static int maxSubarrayProduct_Problem_0_6adac981_510d_455d_bc9d_681eea889870(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(arr.get(i), max * arr.get(i));
            min = Math.min(arr.get(i), min * arr.get(i));
            result = Math.max(result, max);
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_2_b778c008_790f_45df_a218_c66380fb9f35(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_1_b5125cd7_11c2_4e77_a5a2_51235eea3507(ArrayList<Integer> arr) {
        int maxProduct = Integer.MIN_VALUE;
        int maxProductIndex = 0;
        int maxProductValue = 0;
        int maxProductValueIndex = 0;
        for(int i = 0; i < arr.size(); i++) {
            int product = arr.get(i);
            for(int j = i; j < arr.size(); j++) {
                int value = arr.get(j);
                int productValue = product * value;
                if(productValue > maxProductValue) {
                    maxProductValue = productValue;
                    maxProductIndex = j;
                }
            }
        }
        return maxProduct;
    }

    
    public static int maxSubarrayProduct_Problem_1_44cdd762_7d7c_4d75_a54f_58cfd825c596(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(arr.get(i), max * arr.get(i));
            min = Math.min(arr.get(i), min * arr.get(i));
            result = Math.max(result, max);
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_0_8bfce62a_e749_4a27_9313_2f701db6d224(ArrayList<Integer> arr) {
        int maxProduct = 1;
        int minProduct = 1;
        int maxSoFar = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                maxProduct = maxProduct * arr.get(i);
                minProduct = Math.min(minProduct * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                maxProduct = 1;
                minProduct = 1;
            } else {
                int temp = maxProduct;
                maxProduct = Math.max(minProduct * arr.get(i), 1);
                minProduct = temp * arr.get(i);
            }
            if (maxSoFar < maxProduct) {
                maxSoFar = maxProduct;
            }
        }
        return maxSoFar;
    }

    
    public static int maxSubarrayProduct_Problem_1_143c1acb_ec0e_42b0_9b3d_52210400be8a(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(arr.get(i), max * arr.get(i));
            min = Math.min(arr.get(i), min * arr.get(i));
            result = Math.max(result, max);
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_1_2b893af0_d357_4ca8_a17b_853ce6fe8e7a(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_e30122e8_d844_4d3f_9e47_a301b529d25e(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_1_6adac981_510d_455d_bc9d_681eea889870(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(arr.get(i), max * arr.get(i));
            min = Math.min(arr.get(i), min * arr.get(i));
            result = Math.max(result, max);
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_1_6f93825b_c5b2_477c_830b_75e03578976e(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_a9a37441_3032_4ca3_9447_02b5c57bd18a(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_ee905c5c_844d_4f07_ad6c_6b072c4b3aef(ArrayList<Integer> arr) {
        int max_so_far = 1;
        int min_so_far = 1;
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_product = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
            if (min_so_far > min_ending_here) {
                min_so_far = min_ending_here;
            }
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_136d83cf_5c2d_4be4_a84a_3da70332fed5(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_0_1fdc08d8_0c16_4264_aa21_f360230df069(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_35284431_b7b9_48f5_a997_1c20141243a8(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_3aa96217_b5f2_486b_aa71_30ab55ef0c8c(ArrayList<Integer> arr) {
        int maxProduct = 1;
        int minProduct = 1;
        int maxSoFar = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                maxProduct = maxProduct * arr.get(i);
                minProduct = Math.min(minProduct * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                maxProduct = 1;
                minProduct = 1;
            } else {
                int temp = maxProduct;
                maxProduct = Math.max(minProduct * arr.get(i), 1);
                minProduct = temp * arr.get(i);
            }
            if (maxSoFar < maxProduct) {
                maxSoFar = maxProduct;
            }
        }
        return maxSoFar;
    }

    
    public static int maxSubarrayProduct_Problem_2_fb52a086_ce28_4bba_a1b6_80d7679f7c79(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_3db8593d_6414_47d6_8cd2_bdd4c945d48d(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_4215cae7_7d4b_4e5c_bef0_4f3ec7ffc075(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_3e3ff12d_6b0f_49a2_aad7_dc3274ba4e3c(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_7321d927_a8ad_4477_beaa_728410862acb(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_2_143c1acb_ec0e_42b0_9b3d_52210400be8a(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(arr.get(i), max * arr.get(i));
            min = Math.min(arr.get(i), min * arr.get(i));
            result = Math.max(result, max);
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_2_9d17b707_584e_499a_aa78_7b514468714e(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_5d2890ed_1105_4fbd_9fe1_218b1622ba87(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_1_cdcfb7ed_573e_4c18_a4d7_84793a3e4d09(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_6e979e99_cac1_446a_8369_04f48e5106d7(ArrayList<Integer> arr) {
        int maxProduct = Integer.MIN_VALUE;
        int maxProductIndex = 0;
        int maxProductValue = 0;
        for(int i = 0; i < arr.size(); i++) {
            int product = arr.get(i);
            for(int j = i; j < arr.size(); j++) {
                int value = arr.get(j);
                product = product * value;
                if(product > maxProduct) {
                    maxProduct = product;
                    maxProductIndex = j;
                    maxProductValue = value;
                }
            }
        }
        return maxProduct;
    }

    
    public static int maxSubarrayProduct_Problem_2_aaf6373c_d9e1_420d_a553_0c48c13a7004(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_702a44bc_759a_488a_ba97_c248e660ce9b(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_bda4cde2_7f1e_4f7f_87a7_d3b93fd4e0b6(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_8610b2e8_4cc0_433b_94ba_1b7f481cac4d(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_2_bc6b677f_a132_42dc_b171_236b38afcb53(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        int maxProduct = Integer.MIN_VALUE;
        for(int i = 0; i < arr.size(); i++) {
            product = arr.get(i);
            for(int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if(product > maxProduct) {
                    maxProduct = product;
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxSubarrayProduct_Problem_1_ee905c5c_844d_4f07_ad6c_6b072c4b3aef(ArrayList<Integer> arr) {
        int max_so_far = 1;
        int min_so_far = 1;
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_product = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
            if (min_so_far > min_ending_here) {
                min_so_far = min_ending_here;
            }
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_00b595bd_28f2_4a59_b139_3eba0d0215c4(ArrayList<Integer> arr) {
        int max = 0;
        int maxProduct = 0;
        int product = 0;
        int sum = 0;
        int sumProduct = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            sumProduct += arr.get(i);
        }
        for(int i = 0; i < arr.size(); i++) {
            product = sumProduct / sum;
            if(product > maxProduct) {
                maxProduct = product;
                max = sumProduct / sum;
            }
            sumProduct -= arr.get(i);
            sum -= arr.get(i);
        }
        return maxProduct;
    }

    
    public static int maxSubarrayProduct_Problem_2_98822e24_7474_4560_80dc_a5b6d03b0ea0(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_3436c874_8bab_4d96_ad3c_6959031db3dc(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_ad808b4e_bcf9_4968_b57e_3f0e32b648c9(ArrayList<Integer> arr) {
        int max = 0;
        int maxProduct = 0;
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            product = sum;
            for(int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
            }
            if(product > maxProduct) {
                max = product;
                maxProduct = max;
            }
        }
        return maxProduct;
    }

    
    public static int maxSubarrayProduct_Problem_1_2deca374_ca41_4f86_ad4e_a9f0e3675071(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_1_d7defdf8_5789_404f_9337_9e02eab81083(ArrayList<Integer> arr) {
        int maxProduct = 1;
        int minProduct = 1;
        int maxSoFar = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                maxProduct = maxProduct * arr.get(i);
                minProduct = Math.min(minProduct * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                maxProduct = 1;
                minProduct = 1;
            } else {
                int temp = maxProduct;
                maxProduct = Math.max(minProduct * arr.get(i), 1);
                minProduct = temp * arr.get(i);
            }
            if (maxSoFar < maxProduct) {
                maxSoFar = maxProduct;
            }
        }
        return maxSoFar;
    }

}
