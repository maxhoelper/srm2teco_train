package mbpp_245_max_sum;

public class mbpp_245_max_sum {

    
    public static int maxSum_Problem_2_5fe35593_7728_4906_b0d5_0a5cc9a2e2fb(ArrayList<Integer> arr) {
        int[] maxSum_Problem_2_5fe35593_7728_4906_b0d5_0a5cc9a2e2fb = new int[arr.size()];
        int[] maxSum_Problem_2_5fe35593_7728_4906_b0d5_0a5cc9a2e2fbRev = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            maxSum_Problem_2_5fe35593_7728_4906_b0d5_0a5cc9a2e2fb[i] = arr.get(i);
            maxSum_Problem_2_5fe35593_7728_4906_b0d5_0a5cc9a2e2fbRev[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_2_5fe35593_7728_4906_b0d5_0a5cc9a2e2fb[i] = Math.max(maxSum_Problem_2_5fe35593_7728_4906_b0d5_0a5cc9a2e2fb[i], maxSum_Problem_2_5fe35593_7728_4906_b0d5_0a5cc9a2e2fb[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_2_5fe35593_7728_4906_b0d5_0a5cc9a2e2fbRev[i] = Math.max(maxSum_Problem_2_5fe35593_7728_4906_b0d5_0a5cc9a2e2fbRev[i], maxSum_Problem_2_5fe35593_7728_4906_b0d5_0a5cc9a2e2fbRev[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_2_5fe35593_7728_4906_b0d5_0a5cc9a2e2fb[i] + maxSum_Problem_2_5fe35593_7728_4906_b0d5_0a5cc9a2e2fbRev[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_a3a52a70_51fa_4cfa_a322_fc98aa559708(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        dp[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    
    public static int maxSum_Problem_2_775c7d62_bf01_41f1_ad5a_9ec9f983c675(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        dp[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        int max = dp[0];
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    
    public static int maxSum_Problem_2_775f515c_d1ea_4091_b85b_37cf0b895a8f(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                if (sum < 0) {
                    sum = 0;
                } else {
                    sum = arr.get(i) + arr.get(i + 1);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_9948eb2c_b956_4e30_8ba2_3ad831b7bf83(ArrayList<Integer> arr) {
        // Write your code here
        int[] maxSum_Problem_0_9948eb2c_b956_4e30_8ba2_3ad831b7bf83 = new int[arr.size()];
        int[] maxSum_Problem_0_9948eb2c_b956_4e30_8ba2_3ad831b7bf83Reverse = new int[arr.size()];
        maxSum_Problem_0_9948eb2c_b956_4e30_8ba2_3ad831b7bf83[0] = arr.get(0);
        maxSum_Problem_0_9948eb2c_b956_4e30_8ba2_3ad831b7bf83Reverse[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_0_9948eb2c_b956_4e30_8ba2_3ad831b7bf83[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_0_9948eb2c_b956_4e30_8ba2_3ad831b7bf83[i] < maxSum_Problem_0_9948eb2c_b956_4e30_8ba2_3ad831b7bf83[j] + arr.get(i)) {
                    maxSum_Problem_0_9948eb2c_b956_4e30_8ba2_3ad831b7bf83[i] = maxSum_Problem_0_9948eb2c_b956_4e30_8ba2_3ad831b7bf83[j] + arr.get(i);
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_0_9948eb2c_b956_4e30_8ba2_3ad831b7bf83Reverse[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_0_9948eb2c_b956_4e30_8ba2_3ad831b7bf83Reverse[i] < maxSum_Problem_0_9948eb2c_b956_4e30_8ba2_3ad831b7bf83Reverse[j] + arr.get(i)) {
                    maxSum_Problem_0_9948eb2c_b956_4e30_8ba2_3ad831b7bf83Reverse[i] = maxSum_Problem_0_9948eb2c_b956_4e30_8ba2_3ad831b7bf83Reverse[j] + arr.get(i);
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            if (max < maxSum_Problem_0_9948eb2c_b956_4e30_8ba2_3ad831b7bf83[i] + maxSum_Problem_0_9948eb2c_b956_4e30_8ba2_3ad831b7bf83Reverse[i] - arr.get(i)) {
                max = maxSum_Problem_0_9948eb2c_b956_4e30_8ba2_3ad831b7bf83[i] + maxSum_Problem_0_9948eb2c_b956_4e30_8ba2_3ad831b7bf83Reverse[i] - arr.get(i);
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_684bb9ed_18bb_45f3_aeb2_f676386aecf9(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_f9bee62b_9843_4848_90da_8d016e4ce8e5(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, inc[i] + dec[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_0_b91f2423_f724_438c_b340_c1c38768f554(ArrayList<Integer> arr) {
        int maxSum_Problem_0_b91f2423_f724_438c_b340_c1c38768f554 = 0;
        int sum = 0;
        int maxSum_Problem_0_b91f2423_f724_438c_b340_c1c38768f554OfSubsequence = 0;
        int sumOfSubsequence = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum = arr.get(i);
            sumOfSubsequence += sum;
            for(int j = i; j > 0; j--) {
                sum = arr.get(j) + sum;
                sumOfSubsequence += sum;
                if(sumOfSubsequence > maxSum_Problem_0_b91f2423_f724_438c_b340_c1c38768f554OfSubsequence) {
                    maxSum_Problem_0_b91f2423_f724_438c_b340_c1c38768f554OfSubsequence = sumOfSubsequence;
                }
            }
        }
        maxSum_Problem_0_b91f2423_f724_438c_b340_c1c38768f554 = maxSum_Problem_0_b91f2423_f724_438c_b340_c1c38768f554OfSubsequence;
        return maxSum_Problem_0_b91f2423_f724_438c_b340_c1c38768f554;
    }

    
    public static int maxSum_Problem_2_fb4a88a0_73f6_454b_8848_f4e1e98a0376(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i > 0 && arr.get(i) < arr.get(i - 1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_135522c4_d5dc_44ca_bebb_0a0956c864a3(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_eb499456_6c18_48e6_8600_efba0f7ea4ca(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = Math.max(arr.get(i), dp[i - 1] + arr.get(i));
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dp2[i] = Math.max(arr.get(i), dp2[i + 1] + arr.get(i));
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_65da6de7_0e07_4336_94c0_178622351dbb(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_a0a6a1b7_f54b_4fd4_88e8_3d6f85a2ebb0(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        dec[n-1] = arr.get(n-1);
        for (int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = n-2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = n-1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, inc[i] + dec[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_0_ad2aefa2_5e7e_4640_b465_4c10b4e69662(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_264ca120_1477_43d5_a9ed_b7b1f37c7dd0(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                if (arr.get(i) < arr.get(i + 1)) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_7160da3a_28b7_482e_83fc_42311074177e(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (i == 0) {
                max = sum;
            } else if (sum < max) {
                max = sum;
            } else if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_adc37cf9_db84_414a_9f77_bbaaf9802089(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_e6146e8d_d095_4026_ad30_8221929779b1(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_fa570697_892d_4f3f_a12d_8f0f984e1727(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        dp[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < dp.length; i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    
    public static int maxSum_Problem_1_c4bf226d_b7b8_45b5_979b_242e00ed96e7(ArrayList<Integer> arr) {
        // Write your code here
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = Math.max(inc[i - 1], arr.get(i));
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = Math.max(dec[i + 1], arr.get(i));
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_9d8a7806_ab64_4313_840d_9dcb67f14bfc(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i > 0 && arr.get(i) < arr.get(i - 1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_4ed662a8_f8c8_4fda_8e16_ea7e93bb18c4(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_63d78137_e3d0_4d11_8f3c_d14950168be6(ArrayList<Integer> arr) {
        int[] maxSum_Problem_2_63d78137_e3d0_4d11_8f3c_d14950168be6 = new int[arr.size()];
        maxSum_Problem_2_63d78137_e3d0_4d11_8f3c_d14950168be6[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_2_63d78137_e3d0_4d11_8f3c_d14950168be6[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    maxSum_Problem_2_63d78137_e3d0_4d11_8f3c_d14950168be6[i] = Math.max(maxSum_Problem_2_63d78137_e3d0_4d11_8f3c_d14950168be6[i], maxSum_Problem_2_63d78137_e3d0_4d11_8f3c_d14950168be6[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, maxSum_Problem_2_63d78137_e3d0_4d11_8f3c_d14950168be6[i]);
        }
        return ans;
    }

    
    public static int maxSum_Problem_0_a3a5be1a_1c35_4271_837e_b9927fb9b1b2(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                if(sum < 0) {
                    sum = 0;
                }
                else {
                    sum = arr.get(i) + arr.get(i + 1);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_843409c5_d560_4894_a6e8_4945b25eb688(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_6c9ec2a9_60ed_4756_aa7c_fd4faf24ee6b(ArrayList<Integer> arr) {
        // Write your code here
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_3a4f4e7a_e22b_47bf_a926_5cf6bc5cb422(ArrayList<Integer> arr) {
        int[] maxSum_Problem_0_3a4f4e7a_e22b_47bf_a926_5cf6bc5cb422 = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            maxSum_Problem_0_3a4f4e7a_e22b_47bf_a926_5cf6bc5cb422[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_0_3a4f4e7a_e22b_47bf_a926_5cf6bc5cb422[i] < maxSum_Problem_0_3a4f4e7a_e22b_47bf_a926_5cf6bc5cb422[j] + arr.get(i)) {
                    maxSum_Problem_0_3a4f4e7a_e22b_47bf_a926_5cf6bc5cb422[i] = maxSum_Problem_0_3a4f4e7a_e22b_47bf_a926_5cf6bc5cb422[j] + arr.get(i);
                }
            }
        }
        int max = maxSum_Problem_0_3a4f4e7a_e22b_47bf_a926_5cf6bc5cb422[0];
        for (int i = 1; i < arr.size(); i++) {
            if (max < maxSum_Problem_0_3a4f4e7a_e22b_47bf_a926_5cf6bc5cb422[i]) {
                max = maxSum_Problem_0_3a4f4e7a_e22b_47bf_a926_5cf6bc5cb422[i];
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_fa26023f_4bad_4710_9ad2_59ac2cab665a(ArrayList<Integer> arr) {
        int[] maxSum_Problem_0_fa26023f_4bad_4710_9ad2_59ac2cab665a = new int[arr.size()];
        int[] maxSum_Problem_0_fa26023f_4bad_4710_9ad2_59ac2cab665aRev = new int[arr.size()];
        maxSum_Problem_0_fa26023f_4bad_4710_9ad2_59ac2cab665a[0] = arr.get(0);
        maxSum_Problem_0_fa26023f_4bad_4710_9ad2_59ac2cab665aRev[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_0_fa26023f_4bad_4710_9ad2_59ac2cab665a[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_0_fa26023f_4bad_4710_9ad2_59ac2cab665a[i] = Math.max(maxSum_Problem_0_fa26023f_4bad_4710_9ad2_59ac2cab665a[i], maxSum_Problem_0_fa26023f_4bad_4710_9ad2_59ac2cab665a[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_0_fa26023f_4bad_4710_9ad2_59ac2cab665aRev[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_0_fa26023f_4bad_4710_9ad2_59ac2cab665aRev[i] = Math.max(maxSum_Problem_0_fa26023f_4bad_4710_9ad2_59ac2cab665aRev[i], maxSum_Problem_0_fa26023f_4bad_4710_9ad2_59ac2cab665aRev[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_0_fa26023f_4bad_4710_9ad2_59ac2cab665a[i] + maxSum_Problem_0_fa26023f_4bad_4710_9ad2_59ac2cab665aRev[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_db11fa65_fc56_4da2_a0bc_eba73f8a9dc6(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        dp[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        int max = dp[0];
        for (int i = 1; i < dp.length; i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    
    public static int maxSum_Problem_0_71ee2623_ee38_4dbb_8dc5_fb21eaf798ec(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        for (int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_ee9a41f4_5f9b_4975_baf5_1b70bfa40d3b(ArrayList<Integer> arr) {
        int max = 0;
        int len = arr.size();
        if(len == 0) return 0;
        if(len == 1) return arr.get(0);
        if(len == 2) return arr.get(0) + arr.get(1);
        if(arr.get(0) > arr.get(1)) return arr.get(0) + arr.get(1);
        if(arr.get(0) < arr.get(1)) return arr.get(0) + arr.get(1);
        for(int i = 0; i < len - 1; i++) {
            for(int j = i + 1; j < len; j++) {
                if(arr.get(i) > arr.get(j)) {
                    int sum = arr.get(i) + arr.get(j);
                    if(sum > max) max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_c63c7a49_6638_4bf5_8407_09257c2624af(ArrayList<Integer> arr) {
        int[] maxSum_Problem_0_c63c7a49_6638_4bf5_8407_09257c2624af = new int[arr.size()];
        int[] maxSum_Problem_0_c63c7a49_6638_4bf5_8407_09257c2624afReverse = new int[arr.size()];
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            maxSum_Problem_0_c63c7a49_6638_4bf5_8407_09257c2624af[i] = arr.get(i);
            maxSum_Problem_0_c63c7a49_6638_4bf5_8407_09257c2624afReverse[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_0_c63c7a49_6638_4bf5_8407_09257c2624af[i] < maxSum_Problem_0_c63c7a49_6638_4bf5_8407_09257c2624af[j] + arr.get(i)) {
                    maxSum_Problem_0_c63c7a49_6638_4bf5_8407_09257c2624af[i] = maxSum_Problem_0_c63c7a49_6638_4bf5_8407_09257c2624af[j] + arr.get(i);
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_0_c63c7a49_6638_4bf5_8407_09257c2624afReverse[i] < maxSum_Problem_0_c63c7a49_6638_4bf5_8407_09257c2624afReverse[j] + arr.get(i)) {
                    maxSum_Problem_0_c63c7a49_6638_4bf5_8407_09257c2624afReverse[i] = maxSum_Problem_0_c63c7a49_6638_4bf5_8407_09257c2624afReverse[j] + arr.get(i);
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_0_c63c7a49_6638_4bf5_8407_09257c2624af[i] + maxSum_Problem_0_c63c7a49_6638_4bf5_8407_09257c2624afReverse[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_ca6ae0e8_312c_497c_8ec8_e5195e1c0435(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_40452279_0e6f_4423_ba19_f47ea976be83(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i > 0 && sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_bf746a22_ea62_4e14_b358_83c4e4a27e6d(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i - 1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_cd4d80f6_8755_4ae8_a2bd_87f338ed0337(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_77754d7f_cf77_4aae_a647_fee833987546(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_3198a509_8416_4d6d_896f_a5789790cb96(ArrayList<Integer> arr) {
        int[] max = new int[arr.size()];
        int[] min = new int[arr.size()];
        int[] maxSum_Problem_1_3198a509_8416_4d6d_896f_a5789790cb96 = new int[arr.size()];
        int[] minSum = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            max[i] = arr.get(i);
            min[i] = arr.get(i);
        }
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    max[i] = Math.max(max[i], max[j] + arr.get(i));
                }
                if (arr.get(i) < arr.get(j)) {
                    min[i] = Math.max(min[i], min[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 1; i >= 0; i--) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_1_3198a509_8416_4d6d_896f_a5789790cb96[i] = Math.max(maxSum_Problem_1_3198a509_8416_4d6d_896f_a5789790cb96[i], maxSum_Problem_1_3198a509_8416_4d6d_896f_a5789790cb96[j] + arr.get(i));
                }
                if (arr.get(i) < arr.get(j)) {
                    minSum[i] = Math.max(minSum[i], minSum[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, max[i] + minSum[i]);
            ans = Math.max(ans, min[i] + maxSum_Problem_1_3198a509_8416_4d6d_896f_a5789790cb96[i]);
        }
        return ans;
    }

    
    public static int maxSum_Problem_1_a102357d_4377_4d06_b75f_abc4a585c31c(ArrayList<Integer> arr) {
        // write your function here
        int maxsum = 0;
        int prevsum = 0;
        int currentsum = 0;
        int minsum = (Integer.MAX_VALUE / 2);
        for(int i = 0; i < arr.size(); i++)
        {
            prevsum = currentsum;
            currentsum = arr.get(i);
            if(currentsum < minsum)
            {
                minsum = currentsum;
            }
            for(int j = i + 1; j < arr.size(); j++)
            {
                currentsum = arr.get(j);
                if(currentsum > prevsum)
                {
                    maxsum += minsum;
                    break;
                }
                maxsum += currentsum;
                prevsum = currentsum;
            }
        }
        return maxsum;
    }

    
    public static int maxSum_Problem_0_1d84d0dd_72fb_4a3b_bc23_448b851b192c(ArrayList<Integer> arr) {
        // Write your code here
        int n = arr.size();
        int[] inc = new int[ n];
        int[] dec = new int[ n];
        inc[0] = arr.get(0);
        dec[ n - 1] = arr.get( n - 1);
        for (int i = 1; i < n; i++) {
            inc[ i] = Math.max(inc[ (i - 1)], arr.get( i));
        }
        for (int i = n - 2; i >= 0; i--) {
            dec[ i] = Math.max(dec[ (i + 1)], arr.get( i));
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, inc[ i] + dec[ i] - arr.get( i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_cede8b2b_3df0_420b_91b6_1936f6336b67(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
        }
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum < max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_9af957c8_7519_47c8_ba07_3ad5573ca703(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) > max) {
                    max = arr.get(i) + arr.get(j);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_dc64416d_a35a_4de1_b39e_3949b4335e3d(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_40f19423_c882_428c_9bb0_384ada5ed34d(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_b2f18468_c362_481f_ab48_963caffc4710(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                if (arr.get(i) < arr.get(i + 1)) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_870137b9_930d_471f_a526_dd76966af61a(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            dp[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    
    public static int maxSum_Problem_0_a650a410_5c62_4d07_a197_5cb32d703ff2(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i));
            for(int j = i - 1; j >= 0; j--) {
                max = Math.max(max, arr.get(j) + arr.get(i));
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_ff2d3e2d_fe3e_4900_be17_bf4be98217cb(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_603b62f8_b7d7_4d83_9cd4_5bd038526cdd(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                if(arr.get(i) < arr.get(i + 1)) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_80a0ae74_2327_4618_a408_2a2e9a3514fd(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_0775ea5d_c77b_4ed3_b5e3_2b28e32ed330(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_809869eb_7ac6_42e4_85a6_cfa82bed5854(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum = arr.get(i) + arr.get(i + 1);
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_cb5a3cc8_4bb7_42a5_9293_775f8dceed8e(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            int sum = arr.get(i) + arr.get(i + 1);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fd(ArrayList<Integer> arr) {
        int[] maxSum_Problem_1_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fd = new int[arr.size()];
        int[] maxSum_Problem_1_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fdRev = new int[arr.size()];
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            maxSum_Problem_1_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fd[i] = arr.get(i);
            maxSum_Problem_1_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fdRev[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_1_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fd[i] < maxSum_Problem_1_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fd[j] + arr.get(i)) {
                    maxSum_Problem_1_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fd[i] = maxSum_Problem_1_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fd[j] + arr.get(i);
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_1_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fdRev[i] < maxSum_Problem_1_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fdRev[j] + arr.get(i)) {
                    maxSum_Problem_1_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fdRev[i] = maxSum_Problem_1_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fdRev[j] + arr.get(i);
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_1_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fd[i] + maxSum_Problem_1_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fdRev[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_0e990caf_f513_4dce_a17a_d47a3e0d680d(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            dp2[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j) < arr.get(i)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
            max = Math.max(max, dp[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_5789f66e_114d_4417_b406_894e9cdd0474(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_afe068a7_fda4_4f61_9ba7_9bfc1422e749(ArrayList<Integer> arr) {
        // Write your code here
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        dec[n-1] = arr.get(n-1);
        for(int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for(int j = 0; j < i; j++) {
                if(arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for(int i = n-2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for(int j = n-1; j > i; j--) {
                if(arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            ans = Math.max(ans, inc[i] + dec[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_2_22e36ed8_c0d1_4d37_a51e_931ed4b864cf(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_a194d2ec_4b4a_4ec8_bc4c_74688d8d0b4c(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
        }
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum < max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_33ad81ed_bc08_44fa_bd91_3e3539f3c7e7(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max + arr.get(i), arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_cd60772e_1057_45db_bd9c_9fe8e27a4041(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] lis = new int[n];
        int[] lds = new int[n];
        for (int i = 0; i < n; i++) {
            lis[i] = arr.get(i);
            lds[i] = arr.get(i);
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && lis[i] < lis[j] + arr.get(i)) {
                    lis[i] = lis[j] + arr.get(i);
                }
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = n - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && lds[i] < lds[j] + arr.get(i)) {
                    lds[i] = lds[j] + arr.get(i);
                }
            }
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, lis[i] + lds[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_1_b67b1472_3843_4558_9457_e638eab4be67(ArrayList<Integer> arr) {
        int[] maxSum_Problem_1_b67b1472_3843_4558_9457_e638eab4be67 = new int[arr.size()];
        int[] maxSum_Problem_1_b67b1472_3843_4558_9457_e638eab4be67Reverse = new int[arr.size()];
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            maxSum_Problem_1_b67b1472_3843_4558_9457_e638eab4be67[i] = arr.get(i);
            maxSum_Problem_1_b67b1472_3843_4558_9457_e638eab4be67Reverse[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_1_b67b1472_3843_4558_9457_e638eab4be67[i] < maxSum_Problem_1_b67b1472_3843_4558_9457_e638eab4be67[j] + arr.get(i)) {
                    maxSum_Problem_1_b67b1472_3843_4558_9457_e638eab4be67[i] = maxSum_Problem_1_b67b1472_3843_4558_9457_e638eab4be67[j] + arr.get(i);
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_1_b67b1472_3843_4558_9457_e638eab4be67Reverse[i] < maxSum_Problem_1_b67b1472_3843_4558_9457_e638eab4be67Reverse[j] + arr.get(i)) {
                    maxSum_Problem_1_b67b1472_3843_4558_9457_e638eab4be67Reverse[i] = maxSum_Problem_1_b67b1472_3843_4558_9457_e638eab4be67Reverse[j] + arr.get(i);
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_1_b67b1472_3843_4558_9457_e638eab4be67[i] + maxSum_Problem_1_b67b1472_3843_4558_9457_e638eab4be67Reverse[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_797c0f8c_12c7_429b_885a_e26f361d5bb8(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        dp[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        int[] dp2 = new int[arr.size()];
        dp2[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = arr.size() - 2; i >= 0; i--) {
            dp2[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, dp[i] + dp2[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_2_69f8481f_d50a_4443_a1f8_623dd812f0b7(ArrayList<Integer> arr) {
        int[] maxSum_Problem_2_69f8481f_d50a_4443_a1f8_623dd812f0b7 = new int[arr.size()];
        int[] maxSum_Problem_2_69f8481f_d50a_4443_a1f8_623dd812f0b7Reverse = new int[arr.size()];
        maxSum_Problem_2_69f8481f_d50a_4443_a1f8_623dd812f0b7[0] = arr.get(0);
        maxSum_Problem_2_69f8481f_d50a_4443_a1f8_623dd812f0b7Reverse[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_2_69f8481f_d50a_4443_a1f8_623dd812f0b7[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    maxSum_Problem_2_69f8481f_d50a_4443_a1f8_623dd812f0b7[i] = Math.max(maxSum_Problem_2_69f8481f_d50a_4443_a1f8_623dd812f0b7[i], maxSum_Problem_2_69f8481f_d50a_4443_a1f8_623dd812f0b7[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_2_69f8481f_d50a_4443_a1f8_623dd812f0b7Reverse[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    maxSum_Problem_2_69f8481f_d50a_4443_a1f8_623dd812f0b7Reverse[i] = Math.max(maxSum_Problem_2_69f8481f_d50a_4443_a1f8_623dd812f0b7Reverse[i], maxSum_Problem_2_69f8481f_d50a_4443_a1f8_623dd812f0b7Reverse[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_2_69f8481f_d50a_4443_a1f8_623dd812f0b7[i] + maxSum_Problem_2_69f8481f_d50a_4443_a1f8_623dd812f0b7Reverse[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_ff2d3e2d_fe3e_4900_be17_bf4be98217cb(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_6cada2bc_1e15_49e3_9d0f_b7eabf76b8c6(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i));
        }
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum < 0) {
                sum = 0;
            }
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_b11fcae9_450e_4894_8326_6dfac378c9b5(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_c2af8770_1f04_4109_90bb_1961ca2a7bb4(ArrayList<Integer> arr) {
        int maxSum_Problem_1_c2af8770_1f04_4109_90bb_1961ca2a7bb4 = 0;
        int[] maxSum_Problem_1_c2af8770_1f04_4109_90bb_1961ca2a7bb4Left = new int[arr.size()];
        int[] maxSum_Problem_1_c2af8770_1f04_4109_90bb_1961ca2a7bb4Right = new int[arr.size()];
        int[] maxSum_Problem_1_c2af8770_1f04_4109_90bb_1961ca2a7bb4LeftRight = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            maxSum_Problem_1_c2af8770_1f04_4109_90bb_1961ca2a7bb4Left[i] = arr.get(i);
            maxSum_Problem_1_c2af8770_1f04_4109_90bb_1961ca2a7bb4Right[i] = arr.get(i);
            maxSum_Problem_1_c2af8770_1f04_4109_90bb_1961ca2a7bb4LeftRight[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_1_c2af8770_1f04_4109_90bb_1961ca2a7bb4Left[i] < maxSum_Problem_1_c2af8770_1f04_4109_90bb_1961ca2a7bb4Left[j] + arr.get(i)) {
                    maxSum_Problem_1_c2af8770_1f04_4109_90bb_1961ca2a7bb4Left[i] = maxSum_Problem_1_c2af8770_1f04_4109_90bb_1961ca2a7bb4Left[j] + arr.get(i);
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_1_c2af8770_1f04_4109_90bb_1961ca2a7bb4Right[i] < maxSum_Problem_1_c2af8770_1f04_4109_90bb_1961ca2a7bb4Right[j] + arr.get(i)) {
                    maxSum_Problem_1_c2af8770_1f04_4109_90bb_1961ca2a7bb4Right[i] = maxSum_Problem_1_c2af8770_1f04_4109_90bb_1961ca2a7bb4Right[j] + arr.get(i);
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            maxSum_Problem_1_c2af8770_1f04_4109_90bb_1961ca2a7bb4LeftRight[i] = maxSum_Problem_1_c2af8770_1f04_4109_90bb_1961ca2a7bb4Left[i] + maxSum_Problem_1_c2af8770_1f04_4109_90bb_1961ca2a7bb4Right[i] - arr.get(i);
        }
        for (int i = 0; i < arr.size(); i++) {
            if (maxSum_Problem_1_c2af8770_1f04_4109_90bb_1961ca2a7bb4 < maxSum_Problem_1_c2af8770_1f04_4109_90bb_1961ca2a7bb4LeftRight[i]) {
                maxSum_Problem_1_c2af8770_1f04_4109_90bb_1961ca2a7bb4 = maxSum_Problem_1_c2af8770_1f04_4109_90bb_1961ca2a7bb4LeftRight[i];
            }
        }
        return maxSum_Problem_1_c2af8770_1f04_4109_90bb_1961ca2a7bb4;
    }

    
    public static int maxSum_Problem_1_d47418eb_064f_4b3d_9c97_5bd3f6140b4f(ArrayList<Integer> arr) {
        int[] maxSum_Problem_1_d47418eb_064f_4b3d_9c97_5bd3f6140b4f = new int[arr.size()];
        int[] maxSum_Problem_1_d47418eb_064f_4b3d_9c97_5bd3f6140b4fRev = new int[arr.size()];
        maxSum_Problem_1_d47418eb_064f_4b3d_9c97_5bd3f6140b4f[0] = arr.get(0);
        maxSum_Problem_1_d47418eb_064f_4b3d_9c97_5bd3f6140b4fRev[0] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_1_d47418eb_064f_4b3d_9c97_5bd3f6140b4f[i] = arr.get(i);
            maxSum_Problem_1_d47418eb_064f_4b3d_9c97_5bd3f6140b4fRev[i] = arr.get(arr.size() - 1 - i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    maxSum_Problem_1_d47418eb_064f_4b3d_9c97_5bd3f6140b4f[i] = Math.max(maxSum_Problem_1_d47418eb_064f_4b3d_9c97_5bd3f6140b4f[i], maxSum_Problem_1_d47418eb_064f_4b3d_9c97_5bd3f6140b4f[j] + arr.get(i));
                }
                if (arr.get(arr.size() - 1 - j) < arr.get(arr.size() - 1 - i)) {
                    maxSum_Problem_1_d47418eb_064f_4b3d_9c97_5bd3f6140b4fRev[i] = Math.max(maxSum_Problem_1_d47418eb_064f_4b3d_9c97_5bd3f6140b4fRev[i], maxSum_Problem_1_d47418eb_064f_4b3d_9c97_5bd3f6140b4fRev[j] + arr.get(arr.size() - 1 - i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_1_d47418eb_064f_4b3d_9c97_5bd3f6140b4f[i] + maxSum_Problem_1_d47418eb_064f_4b3d_9c97_5bd3f6140b4fRev[arr.size() - 1 - i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_aab1ad7b_342d_4de7_a84a_033d22191f83(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (i == 0) {
                max = sum;
            } else if (sum < max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_2ba2d7df_b2e3_4f6f_b555_b8f799842929(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_6a0a843a_b983_4ab8_b50f_2dc89a932cd5(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_8ceebed5_4984_4f38_8bb7_30e9342c4db0(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        dp[0] = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for(int j = 0; j < i; j++) {
                if(arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    
    public static int maxSum_Problem_0_264ca120_1477_43d5_a9ed_b7b1f37c7dd0(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                if (arr.get(i) < arr.get(i + 1)) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_d38f5707_5930_4784_ab8c_14940cdbd929(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        dec[n-1] = arr.get(n-1);
        for (int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = n-2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = n-1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_22afba44_cc70_4d4a_8b35_d0ad8ad2be57(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) > max) {
                    max = arr.get(i) + arr.get(j);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_83f59f86_05dc_4112_b281_e88d1404c770(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) > max) {
                    max = arr.get(i) + arr.get(j);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_cec85cdb_7bf6_4c96_9add_302d2090cb18(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                sum -= arr.get(i);
                if(sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_d3d9dbbf_04ef_4456_add7_b519ef37d8ec(ArrayList<Integer> arr) {
        int max = 0;
        int len = arr.size();
        int i = 0;
        int j = len - 1;
        while (i < j) {
            if (arr.get(i) < arr.get(j)) {
                max = Math.max(max, arr.get(i) + arr.get(j));
                i++;
                j--;
            } else {
                max = Math.max(max, arr.get(i) + arr.get(j));
                j--;
                i++;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_0de2235d_f909_49b7_bb4e_faddbc7f9d93(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_98c3c7a3_fbf1_4b88_8f75_bc5c3f10c0f3(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        for (int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[n - 1] = arr.get(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = n - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, inc[i] + dec[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_1_d646d63d_0e1f_45ab_93e2_72089b78b528(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_a650a410_5c62_4d07_a197_5cb32d703ff2(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i));
            for(int j = i - 1; j >= 0; j--) {
                max = Math.max(max, arr.get(j) + arr.get(i));
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_8b309073_c578_49cd_8cfe_af8c50f0df31(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_886685b4_df5c_4c1b_85a7_9d1f5e69d73e(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_337557f5_1c9a_4769_b613_c7856a3236a2(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (i == 0) {
                max = sum;
            } else {
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_298be7af_e376_44f0_b6f2_18483f6a24ae(ArrayList<Integer> arr) {
        // Write your code here
        int[] dp = new int[arr.size()];
        dp[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }

    
    public static int maxSum_Problem_0_9af957c8_7519_47c8_ba07_3ad5573ca703(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) > max) {
                    max = arr.get(i) + arr.get(j);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_7fbccb05_95b1_4fd3_8603_b93629fa6c65(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum = arr.get(i) + arr.get(i+1);
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_5f99b585_2604_42c0_a607_a9aebbd2f013(ArrayList<Integer> arr) {
        int[] maxSum_Problem_1_5f99b585_2604_42c0_a607_a9aebbd2f013 = new int[arr.size()];
        int[] maxSum_Problem_1_5f99b585_2604_42c0_a607_a9aebbd2f013Rev = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            maxSum_Problem_1_5f99b585_2604_42c0_a607_a9aebbd2f013[i] = arr.get(i);
            maxSum_Problem_1_5f99b585_2604_42c0_a607_a9aebbd2f013Rev[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_1_5f99b585_2604_42c0_a607_a9aebbd2f013[i] < maxSum_Problem_1_5f99b585_2604_42c0_a607_a9aebbd2f013[j] + arr.get(i)) {
                    maxSum_Problem_1_5f99b585_2604_42c0_a607_a9aebbd2f013[i] = maxSum_Problem_1_5f99b585_2604_42c0_a607_a9aebbd2f013[j] + arr.get(i);
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_1_5f99b585_2604_42c0_a607_a9aebbd2f013Rev[i] < maxSum_Problem_1_5f99b585_2604_42c0_a607_a9aebbd2f013Rev[j] + arr.get(i)) {
                    maxSum_Problem_1_5f99b585_2604_42c0_a607_a9aebbd2f013Rev[i] = maxSum_Problem_1_5f99b585_2604_42c0_a607_a9aebbd2f013Rev[j] + arr.get(i);
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_1_5f99b585_2604_42c0_a607_a9aebbd2f013[i] + maxSum_Problem_1_5f99b585_2604_42c0_a607_a9aebbd2f013Rev[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_e464fd09_64bd_429c_92d6_b07267c5b66a(ArrayList<Integer> arr) {
        int[] maxSum_Problem_2_e464fd09_64bd_429c_92d6_b07267c5b66a = new int[arr.size()];
        int[] maxSum_Problem_2_e464fd09_64bd_429c_92d6_b07267c5b66aReverse = new int[arr.size()];
        maxSum_Problem_2_e464fd09_64bd_429c_92d6_b07267c5b66a[0] = arr.get(0);
        maxSum_Problem_2_e464fd09_64bd_429c_92d6_b07267c5b66aReverse[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_2_e464fd09_64bd_429c_92d6_b07267c5b66a[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_2_e464fd09_64bd_429c_92d6_b07267c5b66a[i] < maxSum_Problem_2_e464fd09_64bd_429c_92d6_b07267c5b66a[j] + arr.get(i)) {
                    maxSum_Problem_2_e464fd09_64bd_429c_92d6_b07267c5b66a[i] = maxSum_Problem_2_e464fd09_64bd_429c_92d6_b07267c5b66a[j] + arr.get(i);
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_2_e464fd09_64bd_429c_92d6_b07267c5b66aReverse[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_2_e464fd09_64bd_429c_92d6_b07267c5b66aReverse[i] < maxSum_Problem_2_e464fd09_64bd_429c_92d6_b07267c5b66aReverse[j] + arr.get(i)) {
                    maxSum_Problem_2_e464fd09_64bd_429c_92d6_b07267c5b66aReverse[i] = maxSum_Problem_2_e464fd09_64bd_429c_92d6_b07267c5b66aReverse[j] + arr.get(i);
                }
            }
        }
        int max = maxSum_Problem_2_e464fd09_64bd_429c_92d6_b07267c5b66a[0] + maxSum_Problem_2_e464fd09_64bd_429c_92d6_b07267c5b66aReverse[0] - arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (max < maxSum_Problem_2_e464fd09_64bd_429c_92d6_b07267c5b66a[i] + maxSum_Problem_2_e464fd09_64bd_429c_92d6_b07267c5b66aReverse[i] - arr.get(i)) {
                max = maxSum_Problem_2_e464fd09_64bd_429c_92d6_b07267c5b66a[i] + maxSum_Problem_2_e464fd09_64bd_429c_92d6_b07267c5b66aReverse[i] - arr.get(i);
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_6dee756c_18f4_4836_9418_87330c30e700(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_f0faa250_ab3c_4021_ace9_7c5db4749da5(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_d585270c_4d22_433c_96a2_576700b55686(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_caa3107f_fe74_4fdc_9040_589ac585ae90(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) > max) {
                    max = arr.get(i) + arr.get(j);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_290e7b36_95e9_4a8c_b945_fab6843be9b1(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_d45781c7_2243_4c6d_92a3_fa8a86df24ee(ArrayList<Integer> arr) {
        int[] left = new int[arr.size()];
        int[] right = new int[arr.size()];
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            left[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    left[i] = Math.max(left[i], left[j] + arr.get(i));
                }
            }
            max = Math.max(max, left[i]);
        }
        for (int i = arr.size() - 1; i >= 0; i--) {
            right[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    right[i] = Math.max(right[i], right[j] + arr.get(i));
                }
            }
            max = Math.max(max, right[i]);
        }
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    max = Math.max(max, left[i] + right[j]);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_84540f78_bc8a_4122_a8c4_551759eb5555(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_72f16728_6d36_4da9_9d87_ddc163e7b169(ArrayList<Integer> arr) {
        // Write your code here
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        dec[n-1] = arr.get(n-1);
        for(int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for(int j = 0; j < i; j++) {
                if(arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for(int i = n-2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for(int j = n-1; j > i; j--) {
                if(arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            ans = Math.max(ans, inc[i] + dec[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_0_97c15090_b12e_4bc2_ae10_2445fcfc5023(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                sum -= arr.get(i);
                if(sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_775c7d62_bf01_41f1_ad5a_9ec9f983c675(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        dp[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        int max = dp[0];
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    
    public static int maxSum_Problem_0_e945d111_284f_481a_80da_4928c78f170b(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_0ec50b04_2c20_495d_8d71_7459d7e0f82e(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_c638c57d_d637_4997_936e_5c65e5ee9c7e(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_ca6ae0e8_312c_497c_8ec8_e5195e1c0435(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_eb499456_6c18_48e6_8600_efba0f7ea4ca(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = Math.max(arr.get(i), dp[i - 1] + arr.get(i));
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dp2[i] = Math.max(arr.get(i), dp2[i + 1] + arr.get(i));
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_5927b4db_5fb3_42d1_b9bf_cd87c27f4fac(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        dec[n - 1] = arr.get(n - 1);
        for (int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = n - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_08c24dda_2620_4b85_bf33_0084f6c42024(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_87b6ee1a_5901_42e6_9365_0b8e67d26741(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            sum = arr.get(i) + arr.get(i + 1);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_8453bbd0_38a4_4eb9_985e_3f7a1514c28c(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i) + arr.get(i - 1));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_d47418eb_064f_4b3d_9c97_5bd3f6140b4f(ArrayList<Integer> arr) {
        int[] maxSum_Problem_0_d47418eb_064f_4b3d_9c97_5bd3f6140b4f = new int[arr.size()];
        int[] maxSum_Problem_0_d47418eb_064f_4b3d_9c97_5bd3f6140b4fRev = new int[arr.size()];
        maxSum_Problem_0_d47418eb_064f_4b3d_9c97_5bd3f6140b4f[0] = arr.get(0);
        maxSum_Problem_0_d47418eb_064f_4b3d_9c97_5bd3f6140b4fRev[0] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_0_d47418eb_064f_4b3d_9c97_5bd3f6140b4f[i] = arr.get(i);
            maxSum_Problem_0_d47418eb_064f_4b3d_9c97_5bd3f6140b4fRev[i] = arr.get(arr.size() - 1 - i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    maxSum_Problem_0_d47418eb_064f_4b3d_9c97_5bd3f6140b4f[i] = Math.max(maxSum_Problem_0_d47418eb_064f_4b3d_9c97_5bd3f6140b4f[i], maxSum_Problem_0_d47418eb_064f_4b3d_9c97_5bd3f6140b4f[j] + arr.get(i));
                }
                if (arr.get(arr.size() - 1 - j) < arr.get(arr.size() - 1 - i)) {
                    maxSum_Problem_0_d47418eb_064f_4b3d_9c97_5bd3f6140b4fRev[i] = Math.max(maxSum_Problem_0_d47418eb_064f_4b3d_9c97_5bd3f6140b4fRev[i], maxSum_Problem_0_d47418eb_064f_4b3d_9c97_5bd3f6140b4fRev[j] + arr.get(arr.size() - 1 - i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_0_d47418eb_064f_4b3d_9c97_5bd3f6140b4f[i] + maxSum_Problem_0_d47418eb_064f_4b3d_9c97_5bd3f6140b4fRev[arr.size() - 1 - i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_6dee756c_18f4_4836_9418_87330c30e700(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_61b2d3fe_44fa_4732_a0df_b8ac7720c02f(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_f2863c41_e9fb_475e_bc0a_02694128cd24(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        dp[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < dp.length; i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    
    public static int maxSum_Problem_0_68b3e077_c5b3_435b_b114_2d872b8180d6(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        dec[n - 1] = arr.get(n - 1);
        for (int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = n - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, inc[i] + dec[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_0_c9e6356e_d519_4ab6_a8b1_e588c82a738e(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_d24ed62d_b6c0_48b9_abcc_cd0179d58391(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i));
            if (arr.get(i) < arr.get(i - 1)) {
                max = Math.max(max, arr.get(i) + arr.get(i - 1));
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_4908d76c_f17c_4da4_81bc_fe51c8b994d8(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_d646d63d_0e1f_45ab_93e2_72089b78b528(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_53b869ba_5814_4e25_92a9_2cfc207696e4(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            dp[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        int max = dp[0];
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    
    public static int maxSum_Problem_2_65da6de7_0e07_4336_94c0_178622351dbb(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_639e7372_4bd5_4d62_b8a3_08a17068fc8f(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_ff2d3e2d_fe3e_4900_be17_bf4be98217cb(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_d3d9dbbf_04ef_4456_add7_b519ef37d8ec(ArrayList<Integer> arr) {
        int max = 0;
        int len = arr.size();
        int i = 0;
        int j = len - 1;
        while (i < j) {
            if (arr.get(i) < arr.get(j)) {
                max = Math.max(max, arr.get(i) + arr.get(j));
                i++;
                j--;
            } else {
                max = Math.max(max, arr.get(i) + arr.get(j));
                j--;
                i++;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85(ArrayList<Integer> arr) {
        int[] maxSum_Problem_0_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85 = new int[arr.size()];
        int[] maxSum_Problem_0_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85Reverse = new int[arr.size()];
        maxSum_Problem_0_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85[0] = arr.get(0);
        maxSum_Problem_0_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85Reverse[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_0_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_0_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85[i] < maxSum_Problem_0_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85[j] + arr.get(i)) {
                    maxSum_Problem_0_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85[i] = maxSum_Problem_0_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85[j] + arr.get(i);
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_0_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85Reverse[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_0_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85Reverse[i] < maxSum_Problem_0_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85Reverse[j] + arr.get(i)) {
                    maxSum_Problem_0_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85Reverse[i] = maxSum_Problem_0_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85Reverse[j] + arr.get(i);
                }
            }
        }
        int max = maxSum_Problem_0_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85[0] + maxSum_Problem_0_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85Reverse[0] - arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (max < maxSum_Problem_0_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85[i] + maxSum_Problem_0_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85Reverse[i] - arr.get(i)) {
                max = maxSum_Problem_0_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85[i] + maxSum_Problem_0_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85Reverse[i] - arr.get(i);
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_bf427cf1_da73_4032_a9df_fc8a359464ef(ArrayList<Integer> arr) {
        // Write your code here
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for(int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for(int j = 0; j < i; j++) {
                if(arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for(int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for(int j = arr.size() - 1; j > i; j--) {
                if(arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_dc64416d_a35a_4de1_b39e_3949b4335e3d(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_a7028bbc_6e01_44d0_bda4_b2e8ec3cdb4f(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i - 1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_298be7af_e376_44f0_b6f2_18483f6a24ae(ArrayList<Integer> arr) {
        // Write your code here
        int[] dp = new int[arr.size()];
        dp[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }

    
    public static int maxSum_Problem_1_3a4f4e7a_e22b_47bf_a926_5cf6bc5cb422(ArrayList<Integer> arr) {
        int[] maxSum_Problem_1_3a4f4e7a_e22b_47bf_a926_5cf6bc5cb422 = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            maxSum_Problem_1_3a4f4e7a_e22b_47bf_a926_5cf6bc5cb422[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_1_3a4f4e7a_e22b_47bf_a926_5cf6bc5cb422[i] < maxSum_Problem_1_3a4f4e7a_e22b_47bf_a926_5cf6bc5cb422[j] + arr.get(i)) {
                    maxSum_Problem_1_3a4f4e7a_e22b_47bf_a926_5cf6bc5cb422[i] = maxSum_Problem_1_3a4f4e7a_e22b_47bf_a926_5cf6bc5cb422[j] + arr.get(i);
                }
            }
        }
        int max = maxSum_Problem_1_3a4f4e7a_e22b_47bf_a926_5cf6bc5cb422[0];
        for (int i = 1; i < arr.size(); i++) {
            if (max < maxSum_Problem_1_3a4f4e7a_e22b_47bf_a926_5cf6bc5cb422[i]) {
                max = maxSum_Problem_1_3a4f4e7a_e22b_47bf_a926_5cf6bc5cb422[i];
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_afe068a7_fda4_4f61_9ba7_9bfc1422e749(ArrayList<Integer> arr) {
        // Write your code here
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        dec[n-1] = arr.get(n-1);
        for(int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for(int j = 0; j < i; j++) {
                if(arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for(int i = n-2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for(int j = n-1; j > i; j--) {
                if(arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            ans = Math.max(ans, inc[i] + dec[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_2_dc4ef6cb_e76a_45bd_816a_42094bf8ec8b(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = Math.max(dp[i - 1] + arr.get(i), arr.get(i));
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dp2[i] = Math.max(dp2[i + 1] + arr.get(i), arr.get(i));
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_5fe35593_7728_4906_b0d5_0a5cc9a2e2fb(ArrayList<Integer> arr) {
        int[] maxSum_Problem_0_5fe35593_7728_4906_b0d5_0a5cc9a2e2fb = new int[arr.size()];
        int[] maxSum_Problem_0_5fe35593_7728_4906_b0d5_0a5cc9a2e2fbRev = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            maxSum_Problem_0_5fe35593_7728_4906_b0d5_0a5cc9a2e2fb[i] = arr.get(i);
            maxSum_Problem_0_5fe35593_7728_4906_b0d5_0a5cc9a2e2fbRev[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_0_5fe35593_7728_4906_b0d5_0a5cc9a2e2fb[i] = Math.max(maxSum_Problem_0_5fe35593_7728_4906_b0d5_0a5cc9a2e2fb[i], maxSum_Problem_0_5fe35593_7728_4906_b0d5_0a5cc9a2e2fb[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_0_5fe35593_7728_4906_b0d5_0a5cc9a2e2fbRev[i] = Math.max(maxSum_Problem_0_5fe35593_7728_4906_b0d5_0a5cc9a2e2fbRev[i], maxSum_Problem_0_5fe35593_7728_4906_b0d5_0a5cc9a2e2fbRev[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_0_5fe35593_7728_4906_b0d5_0a5cc9a2e2fb[i] + maxSum_Problem_0_5fe35593_7728_4906_b0d5_0a5cc9a2e2fbRev[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_5f5424e8_6908_40ec_9ebc_3b38f4dfb07c(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            int sum = arr.get(i) + arr.get(i + 1);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_48de7605_0b70_4912_8a5c_c52637a36469(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(i == 0) {
                max = sum;
            }
            else if(sum > max) {
                max = sum;
            }
            else if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_f6adc699_1282_4b82_b6d2_a3422bcad081(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) > max) {
                    max = arr.get(i) + arr.get(j);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_98c3c7a3_fbf1_4b88_8f75_bc5c3f10c0f3(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        for (int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[n - 1] = arr.get(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = n - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, inc[i] + dec[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_1_87bac728_72dc_4cec_a294_e612531e23fe(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_6709b93f_c1b9_409f_b24c_ae41a8fe3cc5(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_84718c35_0f76_4cc5_9644_1a76bcae9d39(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_a7b79163_e887_4e4f_a04b_8688618575a2(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_91841539_24dd_4c89_9847_a657100feab9(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i));
            for (int j = i - 1; j >= 0; j--) {
                max = Math.max(max, arr.get(j) + arr.get(i));
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_d24ed62d_b6c0_48b9_abcc_cd0179d58391(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i));
            if (arr.get(i) < arr.get(i - 1)) {
                max = Math.max(max, arr.get(i) + arr.get(i - 1));
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_cc208e43_0ed2_48d3_afc9_3264b511820b(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_4afdf003_3b82_493d_a0f5_47d0b31892e6(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_b803697a_496b_4a0f_9ed0_8dd1e362caaa(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_0775ea5d_c77b_4ed3_b5e3_2b28e32ed330(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_d4cc69ec_22db_4939_b02c_8cb0e2e71d0a(ArrayList<Integer> arr) {
        // Write your code here
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_53b869ba_5814_4e25_92a9_2cfc207696e4(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            dp[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        int max = dp[0];
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    
    public static int maxSum_Problem_0_0e743671_ea0e_43a2_bb13_103c4f2797c1(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i > 0 && arr.get(i) < arr.get(i - 1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_df58b1f8_40a0_406d_bfdb_e6aba6ca03c1(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i) + arr.get(i - 1));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_63d78137_e3d0_4d11_8f3c_d14950168be6(ArrayList<Integer> arr) {
        int[] maxSum_Problem_0_63d78137_e3d0_4d11_8f3c_d14950168be6 = new int[arr.size()];
        maxSum_Problem_0_63d78137_e3d0_4d11_8f3c_d14950168be6[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_0_63d78137_e3d0_4d11_8f3c_d14950168be6[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    maxSum_Problem_0_63d78137_e3d0_4d11_8f3c_d14950168be6[i] = Math.max(maxSum_Problem_0_63d78137_e3d0_4d11_8f3c_d14950168be6[i], maxSum_Problem_0_63d78137_e3d0_4d11_8f3c_d14950168be6[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, maxSum_Problem_0_63d78137_e3d0_4d11_8f3c_d14950168be6[i]);
        }
        return ans;
    }

    
    public static int maxSum_Problem_0_e9c36da5_a3d5_43bb_97cb_af462c8242a4(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i > 0 && arr.get(i) < arr.get(i - 1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_69f8481f_d50a_4443_a1f8_623dd812f0b7(ArrayList<Integer> arr) {
        int[] maxSum_Problem_0_69f8481f_d50a_4443_a1f8_623dd812f0b7 = new int[arr.size()];
        int[] maxSum_Problem_0_69f8481f_d50a_4443_a1f8_623dd812f0b7Reverse = new int[arr.size()];
        maxSum_Problem_0_69f8481f_d50a_4443_a1f8_623dd812f0b7[0] = arr.get(0);
        maxSum_Problem_0_69f8481f_d50a_4443_a1f8_623dd812f0b7Reverse[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_0_69f8481f_d50a_4443_a1f8_623dd812f0b7[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    maxSum_Problem_0_69f8481f_d50a_4443_a1f8_623dd812f0b7[i] = Math.max(maxSum_Problem_0_69f8481f_d50a_4443_a1f8_623dd812f0b7[i], maxSum_Problem_0_69f8481f_d50a_4443_a1f8_623dd812f0b7[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_0_69f8481f_d50a_4443_a1f8_623dd812f0b7Reverse[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    maxSum_Problem_0_69f8481f_d50a_4443_a1f8_623dd812f0b7Reverse[i] = Math.max(maxSum_Problem_0_69f8481f_d50a_4443_a1f8_623dd812f0b7Reverse[i], maxSum_Problem_0_69f8481f_d50a_4443_a1f8_623dd812f0b7Reverse[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_0_69f8481f_d50a_4443_a1f8_623dd812f0b7[i] + maxSum_Problem_0_69f8481f_d50a_4443_a1f8_623dd812f0b7Reverse[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_71ddfc59_fdb3_46a0_9f64_d5cac15783ac(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            dp2[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
                if (arr.get(i) < arr.get(j)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_dc64416d_a35a_4de1_b39e_3949b4335e3d(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_44ae58da_6b23_4555_a9d7_cc8f58eb6ffa(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_bf427cf1_da73_4032_a9df_fc8a359464ef(ArrayList<Integer> arr) {
        // Write your code here
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for(int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for(int j = 0; j < i; j++) {
                if(arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for(int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for(int j = arr.size() - 1; j > i; j--) {
                if(arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_bac70683_cebf_4623_83de_fa9e495e7d7d(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i) + arr.get(i-1));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_48166a44_2795_4beb_a8bf_878ad9de0660(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_9d8a7806_ab64_4313_840d_9dcb67f14bfc(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i > 0 && arr.get(i) < arr.get(i - 1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_f9bee62b_9843_4848_90da_8d016e4ce8e5(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, inc[i] + dec[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_1_0c92f7ca_d67f_4064_9182_bbd07566e8c7(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i > 0 && arr.get(i) < arr.get(i - 1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_e8002407_4069_4d64_817e_968e19a0e360(ArrayList<Integer> arr) {
        int max = 0;
        int len = arr.size();
        if(len == 1) return arr.get(0);
        if(len == 2) return arr.get(0) + arr.get(1);
        if(arr.get(0) > arr.get(1)) return arr.get(0) + arr.get(1);
        if(arr.get(0) < arr.get(1)) return arr.get(0) + arr.get(1);
        for(int i = 1; i < len; i++) {
            int sum = arr.get(i) + arr.get(i-1);
            if(sum > max) max = sum;
        }
        return max;
    }

    
    public static int maxSum_Problem_0_3e8560d5_0cf5_4954_b90c_e370ce5925d8(ArrayList<Integer> arr) {
        int[] max = new int[arr.size()];
        int[] min = new int[arr.size()];
        max[0] = arr.get(0);
        min[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            max[i] = Math.max(max[i - 1] + arr.get(i), arr.get(i));
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            min[i] = Math.max(min[i + 1] + arr.get(i), arr.get(i));
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, max[i] + min[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_2_9d7acd53_e717_4b65_894d_63361a1f4436(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_1e28239f_61eb_4522_a3bc_60b13ec44b35(ArrayList<Integer> arr) {
        int[] maxSum_Problem_1_1e28239f_61eb_4522_a3bc_60b13ec44b35 = new int[arr.size()];
        int[] maxSum_Problem_1_1e28239f_61eb_4522_a3bc_60b13ec44b35Rev = new int[arr.size()];
        maxSum_Problem_1_1e28239f_61eb_4522_a3bc_60b13ec44b35[0] = arr.get(0);
        maxSum_Problem_1_1e28239f_61eb_4522_a3bc_60b13ec44b35Rev[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_1_1e28239f_61eb_4522_a3bc_60b13ec44b35[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_1_1e28239f_61eb_4522_a3bc_60b13ec44b35[i] = Math.max(maxSum_Problem_1_1e28239f_61eb_4522_a3bc_60b13ec44b35[i], maxSum_Problem_1_1e28239f_61eb_4522_a3bc_60b13ec44b35[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_1_1e28239f_61eb_4522_a3bc_60b13ec44b35Rev[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_1_1e28239f_61eb_4522_a3bc_60b13ec44b35Rev[i] = Math.max(maxSum_Problem_1_1e28239f_61eb_4522_a3bc_60b13ec44b35Rev[i], maxSum_Problem_1_1e28239f_61eb_4522_a3bc_60b13ec44b35Rev[j] + arr.get(i));
                }
            }
        }
        int max = maxSum_Problem_1_1e28239f_61eb_4522_a3bc_60b13ec44b35[0] + maxSum_Problem_1_1e28239f_61eb_4522_a3bc_60b13ec44b35Rev[0] - arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_1_1e28239f_61eb_4522_a3bc_60b13ec44b35[i] + maxSum_Problem_1_1e28239f_61eb_4522_a3bc_60b13ec44b35Rev[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_6de994b2_8b59_401b_8bfa_9d2df190834c(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        dp[0] = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for(int j = 0; j < i; j++) {
                if(arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    
    public static int maxSum_Problem_2_ceb40c7c_0c5b_492b_8a76_b057fd862ae2(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                sum -= arr.get(i);
                if(sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_290e7b36_95e9_4a8c_b945_fab6843be9b1(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_f8f2e74c_5f2f_45ce_afe5_1917512c09d7(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (i == 0) {
                max = sum;
            } else if (sum < max) {
                max = sum;
            } else if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_c7dc50f6_2ea4_40d1_a27c_78e7b217152f(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        dp[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }

    
    public static int maxSum_Problem_1_4afdf003_3b82_493d_a0f5_47d0b31892e6(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_5c2de630_85fa_469a_bd85_568ba4f15498(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                if (arr.get(i) < arr.get(i + 1)) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_e2db645b_5ca4_42af_b9ce_1e6c666659c6(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            sum = arr.get(i) + arr.get(i + 1);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_40f19423_c882_428c_9bb0_384ada5ed34d(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_81080153_dc99_4cd8_aeb0_21eb99edbde7(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) > max) {
                    max = arr.get(i) + arr.get(j);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_d5ff24f3_4001_4b8a_8007_1d6caf39efbd(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_53b869ba_5814_4e25_92a9_2cfc207696e4(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            dp[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        int max = dp[0];
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    
    public static int maxSum_Problem_1_63d78137_e3d0_4d11_8f3c_d14950168be6(ArrayList<Integer> arr) {
        int[] maxSum_Problem_1_63d78137_e3d0_4d11_8f3c_d14950168be6 = new int[arr.size()];
        maxSum_Problem_1_63d78137_e3d0_4d11_8f3c_d14950168be6[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_1_63d78137_e3d0_4d11_8f3c_d14950168be6[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    maxSum_Problem_1_63d78137_e3d0_4d11_8f3c_d14950168be6[i] = Math.max(maxSum_Problem_1_63d78137_e3d0_4d11_8f3c_d14950168be6[i], maxSum_Problem_1_63d78137_e3d0_4d11_8f3c_d14950168be6[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, maxSum_Problem_1_63d78137_e3d0_4d11_8f3c_d14950168be6[i]);
        }
        return ans;
    }

    
    public static int maxSum_Problem_0_d853401f_2de2_4563_a3dc_fbd73943ab6d(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                sum -= arr.get(i);
                if(sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_d585270c_4d22_433c_96a2_576700b55686(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_b91f2423_f724_438c_b340_c1c38768f554(ArrayList<Integer> arr) {
        int maxSum_Problem_1_b91f2423_f724_438c_b340_c1c38768f554 = 0;
        int sum = 0;
        int maxSum_Problem_1_b91f2423_f724_438c_b340_c1c38768f554OfSubsequence = 0;
        int sumOfSubsequence = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum = arr.get(i);
            sumOfSubsequence += sum;
            for(int j = i; j > 0; j--) {
                sum = arr.get(j) + sum;
                sumOfSubsequence += sum;
                if(sumOfSubsequence > maxSum_Problem_1_b91f2423_f724_438c_b340_c1c38768f554OfSubsequence) {
                    maxSum_Problem_1_b91f2423_f724_438c_b340_c1c38768f554OfSubsequence = sumOfSubsequence;
                }
            }
        }
        maxSum_Problem_1_b91f2423_f724_438c_b340_c1c38768f554 = maxSum_Problem_1_b91f2423_f724_438c_b340_c1c38768f554OfSubsequence;
        return maxSum_Problem_1_b91f2423_f724_438c_b340_c1c38768f554;
    }

    
    public static int maxSum_Problem_1_e7227e11_6870_4303_8ec9_2c0d5280d266(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_22e36ed8_c0d1_4d37_a51e_931ed4b864cf(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_8c1867ad_0b19_4755_86b9_d27eb70882e2(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max + arr.get(i), arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_0f92c7d4_5e6c_4ee2_b901_976c349877fb(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_3e6ab88c_9886_4e9b_9586_140cee5d9591(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i - 1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_f6e9b29c_c46e_4bce_beb1_4bc3a1325b49(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                sum -= arr.get(i);
                if(sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_43b4c20c_e22f_4dbb_81c2_7e7f697b6e55(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = Math.max(inc[i - 1], arr.get(i));
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = Math.max(dec[i + 1], arr.get(i));
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_d1c24c8b_0210_4f52_8eb1_bdd03f0e376d(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum = arr.get(i) + arr.get(i + 1);
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_2447d683_372e_4063_84fd_eea63c7d654f(ArrayList<Integer> arr) {
        int maxSum_Problem_0_2447d683_372e_4063_84fd_eea63c7d654f = 0;
        int sum = 0;
        int sumOfBitonicSubsequence = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum = sum + arr.get(i);
            if(sum > maxSum_Problem_0_2447d683_372e_4063_84fd_eea63c7d654f) {
                maxSum_Problem_0_2447d683_372e_4063_84fd_eea63c7d654f = sum;
            }
            sumOfBitonicSubsequence += sum;
        }
        for(int i = 0; i < arr.size(); i++) {
            sum = sum - arr.get(i);
            if(sum < sumOfBitonicSubsequence) {
                sumOfBitonicSubsequence = sum;
            }
        }
        return maxSum_Problem_0_2447d683_372e_4063_84fd_eea63c7d654f;
    }

    
    public static int maxSum_Problem_1_fa26023f_4bad_4710_9ad2_59ac2cab665a(ArrayList<Integer> arr) {
        int[] maxSum_Problem_1_fa26023f_4bad_4710_9ad2_59ac2cab665a = new int[arr.size()];
        int[] maxSum_Problem_1_fa26023f_4bad_4710_9ad2_59ac2cab665aRev = new int[arr.size()];
        maxSum_Problem_1_fa26023f_4bad_4710_9ad2_59ac2cab665a[0] = arr.get(0);
        maxSum_Problem_1_fa26023f_4bad_4710_9ad2_59ac2cab665aRev[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_1_fa26023f_4bad_4710_9ad2_59ac2cab665a[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_1_fa26023f_4bad_4710_9ad2_59ac2cab665a[i] = Math.max(maxSum_Problem_1_fa26023f_4bad_4710_9ad2_59ac2cab665a[i], maxSum_Problem_1_fa26023f_4bad_4710_9ad2_59ac2cab665a[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_1_fa26023f_4bad_4710_9ad2_59ac2cab665aRev[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_1_fa26023f_4bad_4710_9ad2_59ac2cab665aRev[i] = Math.max(maxSum_Problem_1_fa26023f_4bad_4710_9ad2_59ac2cab665aRev[i], maxSum_Problem_1_fa26023f_4bad_4710_9ad2_59ac2cab665aRev[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_1_fa26023f_4bad_4710_9ad2_59ac2cab665a[i] + maxSum_Problem_1_fa26023f_4bad_4710_9ad2_59ac2cab665aRev[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_cec85cdb_7bf6_4c96_9add_302d2090cb18(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                sum -= arr.get(i);
                if(sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_6c9ec2a9_60ed_4756_aa7c_fd4faf24ee6b(ArrayList<Integer> arr) {
        // Write your code here
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_8cf20b59_a665_42e3_82e9_9dac3f7c098c(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_81080153_dc99_4cd8_aeb0_21eb99edbde7(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) > max) {
                    max = arr.get(i) + arr.get(j);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_34dd7009_9c9a_43c9_94bb_2ddf503e3986(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                if (arr.get(i) < arr.get(i + 1)) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_b5c8147f_026d_4213_af0b_5e130cd24fd1(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_e9c36da5_a3d5_43bb_97cb_af462c8242a4(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i > 0 && arr.get(i) < arr.get(i - 1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_503b202b_2a74_4458_9ef2_976466e7638a(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum = arr.get(i) + arr.get(i + 1);
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_1a8fc08a_336f_4a40_9580_89c1e3b1c03e(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_84eff1fd_2846_4f24_81de_f919bb2dea35(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                if (sum < 0) {
                    sum = 0;
                }
                sum += arr.get(i + 1);
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_8c77e9b5_c8e3_42d3_84c2_776e34386c5c(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        dec[n - 1] = arr.get(n - 1);
        for (int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = n - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, inc[i] + dec[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_2_f2863c41_e9fb_475e_bc0a_02694128cd24(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        dp[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < dp.length; i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    
    public static int maxSum_Problem_2_3e8560d5_0cf5_4954_b90c_e370ce5925d8(ArrayList<Integer> arr) {
        int[] max = new int[arr.size()];
        int[] min = new int[arr.size()];
        max[0] = arr.get(0);
        min[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            max[i] = Math.max(max[i - 1] + arr.get(i), arr.get(i));
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            min[i] = Math.max(min[i + 1] + arr.get(i), arr.get(i));
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, max[i] + min[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_1_775c7d62_bf01_41f1_ad5a_9ec9f983c675(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        dp[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        int max = dp[0];
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    
    public static int maxSum_Problem_1_d4cc69ec_22db_4939_b02c_8cb0e2e71d0a(ArrayList<Integer> arr) {
        // Write your code here
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_caa3107f_fe74_4fdc_9040_589ac585ae90(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) > max) {
                    max = arr.get(i) + arr.get(j);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_843409c5_d560_4894_a6e8_4945b25eb688(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_19e1ac9d_b5df_4887_945a_530b6e48106b(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_298be7af_e376_44f0_b6f2_18483f6a24ae(ArrayList<Integer> arr) {
        // Write your code here
        int[] dp = new int[arr.size()];
        dp[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }

    
    public static int maxSum_Problem_0_6049422a_6562_446b_bf4e_1bca5e79afc9(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_68ba9f10_4aa1_4cd5_8f57_d3bd55b59e87(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i - 1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_870137b9_930d_471f_a526_dd76966af61a(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            dp[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    
    public static int maxSum_Problem_0_f56d32fc_90d2_48ac_b8ee_1069d0693e8b(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i));
        }
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_34dd7009_9c9a_43c9_94bb_2ddf503e3986(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                if (arr.get(i) < arr.get(i + 1)) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_1812cfe8_d050_405b_a8ab_3e683a7a267d(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_8c77e9b5_c8e3_42d3_84c2_776e34386c5c(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        dec[n - 1] = arr.get(n - 1);
        for (int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = n - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, inc[i] + dec[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_1_b38e0b6b_88f7_4cf9_8649_cd7e1d750af9(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_781cb344_c383_4f49_a600_e5ddf3feb730(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_d45781c7_2243_4c6d_92a3_fa8a86df24ee(ArrayList<Integer> arr) {
        int[] left = new int[arr.size()];
        int[] right = new int[arr.size()];
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            left[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    left[i] = Math.max(left[i], left[j] + arr.get(i));
                }
            }
            max = Math.max(max, left[i]);
        }
        for (int i = arr.size() - 1; i >= 0; i--) {
            right[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    right[i] = Math.max(right[i], right[j] + arr.get(i));
                }
            }
            max = Math.max(max, right[i]);
        }
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    max = Math.max(max, left[i] + right[j]);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_7160da3a_28b7_482e_83fc_42311074177e(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (i == 0) {
                max = sum;
            } else if (sum < max) {
                max = sum;
            } else if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_577cf62f_ed4d_494f_a843_6ff6e87b995e(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, inc[i] + dec[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_1_de6dc62b_32b2_4247_bf95_139c1476f715(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_8942afbc_84f3_4b6f_ae8b_5aee37db2dc5(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_7160da3a_28b7_482e_83fc_42311074177e(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (i == 0) {
                max = sum;
            } else if (sum < max) {
                max = sum;
            } else if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_cb8e9e89_39bc_45f0_8f68_084b84889784(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) > max) {
                    max = arr.get(i) + arr.get(j);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_137a0bcd_3c32_4818_93f7_bae81ab729d7(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] dp = new int[n];
        int[] dp2 = new int[n];
        dp[0] = arr.get(0);
        dp2[n-1] = arr.get(n-1);
        for(int i = 1; i < n; i++) {
            dp[i] = arr.get(i);
            for(int j = 0; j < i; j++) {
                if(arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        for(int i = n-2; i >= 0; i--) {
            dp2[i] = arr.get(i);
            for(int j = n-1; j > i; j--) {
                if(arr.get(j) < arr.get(i)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            ans = Math.max(ans, dp[i] + dp2[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_1_5f5424e8_6908_40ec_9ebc_3b38f4dfb07c(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            int sum = arr.get(i) + arr.get(i + 1);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_71ee2623_ee38_4dbb_8dc5_fb21eaf798ec(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        for (int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_6333f9cc_a038_416e_91a6_74dd27455de7(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            sum = arr.get(i) + arr.get(i + 1);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_5d5b3168_1ef5_41bb_ba49_3e11bd3eeb3d(ArrayList<Integer> arr) {
        int maxSum_Problem_2_5d5b3168_1ef5_41bb_ba49_3e11bd3eeb3d = 0;
        int sum = 0;
        int maxSum_Problem_2_5d5b3168_1ef5_41bb_ba49_3e11bd3eeb3dOfSubSequence = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum = arr.get(i);
            for(int j = i; j < arr.size(); j++) {
                sum = sum + arr.get(j);
                if(sum > maxSum_Problem_2_5d5b3168_1ef5_41bb_ba49_3e11bd3eeb3d) {
                    maxSum_Problem_2_5d5b3168_1ef5_41bb_ba49_3e11bd3eeb3d = sum;
                    maxSum_Problem_2_5d5b3168_1ef5_41bb_ba49_3e11bd3eeb3dOfSubSequence = maxSum_Problem_2_5d5b3168_1ef5_41bb_ba49_3e11bd3eeb3d;
                }
            }
        }
        return maxSum_Problem_2_5d5b3168_1ef5_41bb_ba49_3e11bd3eeb3dOfSubSequence;
    }

    
    public static int maxSum_Problem_1_34dd7009_9c9a_43c9_94bb_2ddf503e3986(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                if (arr.get(i) < arr.get(i + 1)) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_cbb7b31c_225b_4785_b2ba_dc53154ba942(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int sum = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            sum = arr.get(i) + sum;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_35b2e7d2_c93a_4750_ac19_062af2edd5d7(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum = sum + arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_adc37cf9_db84_414a_9f77_bbaaf9802089(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_135522c4_d5dc_44ca_bebb_0a0956c864a3(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_cc208e43_0ed2_48d3_afc9_3264b511820b(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_9f207bd0_faaa_49b8_ad6b_fad6ec4a3bc8(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_72f16728_6d36_4da9_9d87_ddc163e7b169(ArrayList<Integer> arr) {
        // Write your code here
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        dec[n-1] = arr.get(n-1);
        for(int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for(int j = 0; j < i; j++) {
                if(arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for(int i = n-2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for(int j = n-1; j > i; j--) {
                if(arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            ans = Math.max(ans, inc[i] + dec[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_0_e2d456d3_cba8_459b_b439_0a4655bfe170(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) > max) {
                    max = arr.get(i) + arr.get(j);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_4908d76c_f17c_4da4_81bc_fe51c8b994d8(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_afe068a7_fda4_4f61_9ba7_9bfc1422e749(ArrayList<Integer> arr) {
        // Write your code here
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        dec[n-1] = arr.get(n-1);
        for(int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for(int j = 0; j < i; j++) {
                if(arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for(int i = n-2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for(int j = n-1; j > i; j--) {
                if(arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            ans = Math.max(ans, inc[i] + dec[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_2_5c2de630_85fa_469a_bd85_568ba4f15498(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                if (arr.get(i) < arr.get(i + 1)) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_d38f5707_5930_4784_ab8c_14940cdbd929(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        dec[n-1] = arr.get(n-1);
        for (int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = n-2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = n-1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_5b660c12_c171_4294_be3e_0f6ef6d4fdfc(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                sum -= arr.get(i);
                if(sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_f8f2e74c_5f2f_45ce_afe5_1917512c09d7(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (i == 0) {
                max = sum;
            } else if (sum < max) {
                max = sum;
            } else if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_81631487_9203_405f_b0d9_33b963f392bd(ArrayList<Integer> arr) {
        int[] maxSum_Problem_1_81631487_9203_405f_b0d9_33b963f392bd = new int[arr.size()];
        int[] maxSum_Problem_1_81631487_9203_405f_b0d9_33b963f392bdRev = new int[arr.size()];
        maxSum_Problem_1_81631487_9203_405f_b0d9_33b963f392bd[0] = arr.get(0);
        maxSum_Problem_1_81631487_9203_405f_b0d9_33b963f392bdRev[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_1_81631487_9203_405f_b0d9_33b963f392bd[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_1_81631487_9203_405f_b0d9_33b963f392bd[i] = Math.max(maxSum_Problem_1_81631487_9203_405f_b0d9_33b963f392bd[i], maxSum_Problem_1_81631487_9203_405f_b0d9_33b963f392bd[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_1_81631487_9203_405f_b0d9_33b963f392bdRev[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_1_81631487_9203_405f_b0d9_33b963f392bdRev[i] = Math.max(maxSum_Problem_1_81631487_9203_405f_b0d9_33b963f392bdRev[i], maxSum_Problem_1_81631487_9203_405f_b0d9_33b963f392bdRev[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_1_81631487_9203_405f_b0d9_33b963f392bd[i] + maxSum_Problem_1_81631487_9203_405f_b0d9_33b963f392bdRev[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_6de994b2_8b59_401b_8bfa_9d2df190834c(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        dp[0] = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for(int j = 0; j < i; j++) {
                if(arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    
    public static int maxSum_Problem_0_8cf20b59_a665_42e3_82e9_9dac3f7c098c(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_b9707490_6f20_4a3b_98cd_99ee45b06d5a(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int sum = 0;
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_1d84d0dd_72fb_4a3b_bc23_448b851b192c(ArrayList<Integer> arr) {
        // Write your code here
        int n = arr.size();
        int[] inc = new int[ n];
        int[] dec = new int[ n];
        inc[0] = arr.get(0);
        dec[ n - 1] = arr.get( n - 1);
        for (int i = 1; i < n; i++) {
            inc[ i] = Math.max(inc[ (i - 1)], arr.get( i));
        }
        for (int i = n - 2; i >= 0; i--) {
            dec[ i] = Math.max(dec[ (i + 1)], arr.get( i));
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, inc[ i] + dec[ i] - arr.get( i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_8a327fe1_4cb2_4ac4_bd2c_61efc840b1f9(ArrayList<Integer> arr) {
        // Write your code here
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_44ae58da_6b23_4555_a9d7_cc8f58eb6ffa(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_41494c0a_7b49_4c14_96fc_ba7258eff4a7(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dp2[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, dp[i] + dp2[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_1_b496c5d7_03a5_48d3_accc_f3a7ff11ba45(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            dp2[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
                if (arr.get(i) < arr.get(j)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
            max = Math.max(max, dp[i]);
            max = Math.max(max, dp2[i]);
        }
        return max;
    }

    
    public static int maxSum_Problem_1_f56d32fc_90d2_48ac_b8ee_1069d0693e8b(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i));
        }
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_4bcd43ba_c502_4f94_863d_5865fd9b472f(ArrayList<Integer> arr) {
        int[] maxSum_Problem_2_4bcd43ba_c502_4f94_863d_5865fd9b472f = new int[arr.size()];
        int[] maxSum_Problem_2_4bcd43ba_c502_4f94_863d_5865fd9b472fReverse = new int[arr.size()];
        maxSum_Problem_2_4bcd43ba_c502_4f94_863d_5865fd9b472f[0] = arr.get(0);
        maxSum_Problem_2_4bcd43ba_c502_4f94_863d_5865fd9b472fReverse[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_2_4bcd43ba_c502_4f94_863d_5865fd9b472f[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    maxSum_Problem_2_4bcd43ba_c502_4f94_863d_5865fd9b472f[i] = Math.max(maxSum_Problem_2_4bcd43ba_c502_4f94_863d_5865fd9b472f[i], maxSum_Problem_2_4bcd43ba_c502_4f94_863d_5865fd9b472f[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_2_4bcd43ba_c502_4f94_863d_5865fd9b472fReverse[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    maxSum_Problem_2_4bcd43ba_c502_4f94_863d_5865fd9b472fReverse[i] = Math.max(maxSum_Problem_2_4bcd43ba_c502_4f94_863d_5865fd9b472fReverse[i], maxSum_Problem_2_4bcd43ba_c502_4f94_863d_5865fd9b472fReverse[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_2_4bcd43ba_c502_4f94_863d_5865fd9b472f[i] + maxSum_Problem_2_4bcd43ba_c502_4f94_863d_5865fd9b472fReverse[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_aab1ad7b_342d_4de7_a84a_033d22191f83(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (i == 0) {
                max = sum;
            } else if (sum < max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_4f170142_c458_45cb_9dc3_6e2aecb7ee67(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_f56d32fc_90d2_48ac_b8ee_1069d0693e8b(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i));
        }
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_f4ddfa6f_0d1e_4571_bcc2_87bdeab19bc5(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_fb8a33e1_1c15_480e_b700_c03106515378(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int sum = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            sum = sum + arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_797c0f8c_12c7_429b_885a_e26f361d5bb8(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        dp[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        int[] dp2 = new int[arr.size()];
        dp2[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = arr.size() - 2; i >= 0; i--) {
            dp2[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, dp[i] + dp2[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_0_5f43d396_75a1_4fee_b93b_18ccee9efa97(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_92bb20f0_5b37_4706_8f8e_021b139e0912(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_5927b4db_5fb3_42d1_b9bf_cd87c27f4fac(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        dec[n - 1] = arr.get(n - 1);
        for (int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = n - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_77f90d4a_d94a_480e_a748_ab9a2efaba4b(ArrayList<Integer> arr) {
        int maxSum_Problem_1_77f90d4a_d94a_480e_a748_ab9a2efaba4b = 0;
        int sum = 0;
        int maxSum_Problem_1_77f90d4a_d94a_480e_a748_ab9a2efaba4bOfSubsequence = 0;
        int sumOfSubsequence = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum = arr.get(i);
            sumOfSubsequence += sum;
            if(sumOfSubsequence > maxSum_Problem_1_77f90d4a_d94a_480e_a748_ab9a2efaba4bOfSubsequence) {
                maxSum_Problem_1_77f90d4a_d94a_480e_a748_ab9a2efaba4bOfSubsequence = sumOfSubsequence;
            }
            sumOfSubsequence = 0;
        }
        maxSum_Problem_1_77f90d4a_d94a_480e_a748_ab9a2efaba4b = arr.get(0);
        sumOfSubsequence += maxSum_Problem_1_77f90d4a_d94a_480e_a748_ab9a2efaba4b;
        if(sumOfSubsequence > maxSum_Problem_1_77f90d4a_d94a_480e_a748_ab9a2efaba4bOfSubsequence) {
            maxSum_Problem_1_77f90d4a_d94a_480e_a748_ab9a2efaba4bOfSubsequence = sumOfSubsequence;
        }
        return maxSum_Problem_1_77f90d4a_d94a_480e_a748_ab9a2efaba4bOfSubsequence;
    }

    
    public static int maxSum_Problem_2_c9e6356e_d519_4ab6_a8b1_e588c82a738e(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_35177237_db5f_4cc9_82e4_2ebd829eca0a(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) > max) {
                    max = arr.get(i) + arr.get(j);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_bf427cf1_da73_4032_a9df_fc8a359464ef(ArrayList<Integer> arr) {
        // Write your code here
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for(int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for(int j = 0; j < i; j++) {
                if(arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for(int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for(int j = arr.size() - 1; j > i; j--) {
                if(arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_cb8e9e89_39bc_45f0_8f68_084b84889784(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) > max) {
                    max = arr.get(i) + arr.get(j);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_b67b1472_3843_4558_9457_e638eab4be67(ArrayList<Integer> arr) {
        int[] maxSum_Problem_0_b67b1472_3843_4558_9457_e638eab4be67 = new int[arr.size()];
        int[] maxSum_Problem_0_b67b1472_3843_4558_9457_e638eab4be67Reverse = new int[arr.size()];
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            maxSum_Problem_0_b67b1472_3843_4558_9457_e638eab4be67[i] = arr.get(i);
            maxSum_Problem_0_b67b1472_3843_4558_9457_e638eab4be67Reverse[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_0_b67b1472_3843_4558_9457_e638eab4be67[i] < maxSum_Problem_0_b67b1472_3843_4558_9457_e638eab4be67[j] + arr.get(i)) {
                    maxSum_Problem_0_b67b1472_3843_4558_9457_e638eab4be67[i] = maxSum_Problem_0_b67b1472_3843_4558_9457_e638eab4be67[j] + arr.get(i);
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_0_b67b1472_3843_4558_9457_e638eab4be67Reverse[i] < maxSum_Problem_0_b67b1472_3843_4558_9457_e638eab4be67Reverse[j] + arr.get(i)) {
                    maxSum_Problem_0_b67b1472_3843_4558_9457_e638eab4be67Reverse[i] = maxSum_Problem_0_b67b1472_3843_4558_9457_e638eab4be67Reverse[j] + arr.get(i);
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_0_b67b1472_3843_4558_9457_e638eab4be67[i] + maxSum_Problem_0_b67b1472_3843_4558_9457_e638eab4be67Reverse[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_54dcf902_4680_4fa8_9938_8b266986a669(ArrayList<Integer> arr) {
        // Write your code here
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_22afba44_cc70_4d4a_8b35_d0ad8ad2be57(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) > max) {
                    max = arr.get(i) + arr.get(j);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_33d1da03_354e_4d3c_b3c4_f6b275b39aec(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dp2[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_8c77e9b5_c8e3_42d3_84c2_776e34386c5c(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        dec[n - 1] = arr.get(n - 1);
        for (int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = n - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, inc[i] + dec[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_2_cd4d80f6_8755_4ae8_a2bd_87f338ed0337(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_1d01f565_3c71_4880_9609_172ff6b5206f(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_b2f18468_c362_481f_ab48_963caffc4710(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                if (arr.get(i) < arr.get(i + 1)) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_fb4a88a0_73f6_454b_8848_f4e1e98a0376(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i > 0 && arr.get(i) < arr.get(i - 1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_0e743671_ea0e_43a2_bb13_103c4f2797c1(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i > 0 && arr.get(i) < arr.get(i - 1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_a3a5be1a_1c35_4271_837e_b9927fb9b1b2(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                if(sum < 0) {
                    sum = 0;
                }
                else {
                    sum = arr.get(i) + arr.get(i + 1);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_0e990caf_f513_4dce_a17a_d47a3e0d680d(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            dp2[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j) < arr.get(i)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
            max = Math.max(max, dp[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_194b852f_c4bf_4ba3_b6cb_6838fa454e82(ArrayList<Integer> arr) {
        // Write your code here
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size()-1] = arr.get(arr.size()-1);
        for(int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for(int j = 0; j < i; j++) {
                if(arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for(int i = arr.size()-2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for(int j = arr.size()-1; j > i; j--) {
                if(arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_0823c2c4_b797_4dc2_86d3_4fca156df13b(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        for (int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[n - 1] = arr.get(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = n - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, inc[i] + dec[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_0_c638c57d_d637_4997_936e_5c65e5ee9c7e(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_603b62f8_b7d7_4d83_9cd4_5bd038526cdd(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                if(arr.get(i) < arr.get(i + 1)) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_4ed662a8_f8c8_4fda_8e16_ea7e93bb18c4(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_186d29c9_ca1b_40e4_b99f_a29a288781ff(ArrayList<Integer> arr) {
        // Write your code here
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for(int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for(int j = 0; j < i; j++) {
                if(arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for(int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for(int j = arr.size() - 1; j > i; j--) {
                if(arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_6cada2bc_1e15_49e3_9d0f_b7eabf76b8c6(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i));
        }
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum < 0) {
                sum = 0;
            }
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_8a327fe1_4cb2_4ac4_bd2c_61efc840b1f9(ArrayList<Integer> arr) {
        // Write your code here
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_a8884afa_51ba_42cc_950e_6acf07e39b65(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_bc69e2d0_fe72_48dc_875a_f920ab695a28(ArrayList<Integer> arr) {
        int[] maxSum_Problem_1_bc69e2d0_fe72_48dc_875a_f920ab695a28 = new int[arr.size()];
        int[] maxSum_Problem_1_bc69e2d0_fe72_48dc_875a_f920ab695a28Rev = new int[arr.size()];
        maxSum_Problem_1_bc69e2d0_fe72_48dc_875a_f920ab695a28[0] = arr.get(0);
        maxSum_Problem_1_bc69e2d0_fe72_48dc_875a_f920ab695a28Rev[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_1_bc69e2d0_fe72_48dc_875a_f920ab695a28[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    maxSum_Problem_1_bc69e2d0_fe72_48dc_875a_f920ab695a28[i] = Math.max(maxSum_Problem_1_bc69e2d0_fe72_48dc_875a_f920ab695a28[i], maxSum_Problem_1_bc69e2d0_fe72_48dc_875a_f920ab695a28[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_1_bc69e2d0_fe72_48dc_875a_f920ab695a28Rev[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    maxSum_Problem_1_bc69e2d0_fe72_48dc_875a_f920ab695a28Rev[i] = Math.max(maxSum_Problem_1_bc69e2d0_fe72_48dc_875a_f920ab695a28Rev[i], maxSum_Problem_1_bc69e2d0_fe72_48dc_875a_f920ab695a28Rev[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, maxSum_Problem_1_bc69e2d0_fe72_48dc_875a_f920ab695a28[i] + maxSum_Problem_1_bc69e2d0_fe72_48dc_875a_f920ab695a28Rev[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_2_c2af8770_1f04_4109_90bb_1961ca2a7bb4(ArrayList<Integer> arr) {
        int maxSum_Problem_2_c2af8770_1f04_4109_90bb_1961ca2a7bb4 = 0;
        int[] maxSum_Problem_2_c2af8770_1f04_4109_90bb_1961ca2a7bb4Left = new int[arr.size()];
        int[] maxSum_Problem_2_c2af8770_1f04_4109_90bb_1961ca2a7bb4Right = new int[arr.size()];
        int[] maxSum_Problem_2_c2af8770_1f04_4109_90bb_1961ca2a7bb4LeftRight = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            maxSum_Problem_2_c2af8770_1f04_4109_90bb_1961ca2a7bb4Left[i] = arr.get(i);
            maxSum_Problem_2_c2af8770_1f04_4109_90bb_1961ca2a7bb4Right[i] = arr.get(i);
            maxSum_Problem_2_c2af8770_1f04_4109_90bb_1961ca2a7bb4LeftRight[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_2_c2af8770_1f04_4109_90bb_1961ca2a7bb4Left[i] < maxSum_Problem_2_c2af8770_1f04_4109_90bb_1961ca2a7bb4Left[j] + arr.get(i)) {
                    maxSum_Problem_2_c2af8770_1f04_4109_90bb_1961ca2a7bb4Left[i] = maxSum_Problem_2_c2af8770_1f04_4109_90bb_1961ca2a7bb4Left[j] + arr.get(i);
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_2_c2af8770_1f04_4109_90bb_1961ca2a7bb4Right[i] < maxSum_Problem_2_c2af8770_1f04_4109_90bb_1961ca2a7bb4Right[j] + arr.get(i)) {
                    maxSum_Problem_2_c2af8770_1f04_4109_90bb_1961ca2a7bb4Right[i] = maxSum_Problem_2_c2af8770_1f04_4109_90bb_1961ca2a7bb4Right[j] + arr.get(i);
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            maxSum_Problem_2_c2af8770_1f04_4109_90bb_1961ca2a7bb4LeftRight[i] = maxSum_Problem_2_c2af8770_1f04_4109_90bb_1961ca2a7bb4Left[i] + maxSum_Problem_2_c2af8770_1f04_4109_90bb_1961ca2a7bb4Right[i] - arr.get(i);
        }
        for (int i = 0; i < arr.size(); i++) {
            if (maxSum_Problem_2_c2af8770_1f04_4109_90bb_1961ca2a7bb4 < maxSum_Problem_2_c2af8770_1f04_4109_90bb_1961ca2a7bb4LeftRight[i]) {
                maxSum_Problem_2_c2af8770_1f04_4109_90bb_1961ca2a7bb4 = maxSum_Problem_2_c2af8770_1f04_4109_90bb_1961ca2a7bb4LeftRight[i];
            }
        }
        return maxSum_Problem_2_c2af8770_1f04_4109_90bb_1961ca2a7bb4;
    }

    
    public static int maxSum_Problem_1_264ca120_1477_43d5_a9ed_b7b1f37c7dd0(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                if (arr.get(i) < arr.get(i + 1)) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_4908d76c_f17c_4da4_81bc_fe51c8b994d8(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8(ArrayList<Integer> arr) {
        int[] maxSum_Problem_1_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8 = new int[arr.size()];
        int[] maxSum_Problem_1_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8Reverse = new int[arr.size()];
        maxSum_Problem_1_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8[0] = arr.get(0);
        maxSum_Problem_1_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8Reverse[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_1_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_1_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8[i] < maxSum_Problem_1_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8[j] + arr.get(i)) {
                    maxSum_Problem_1_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8[i] = maxSum_Problem_1_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8[j] + arr.get(i);
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_1_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8Reverse[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_1_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8Reverse[i] < maxSum_Problem_1_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8Reverse[j] + arr.get(i)) {
                    maxSum_Problem_1_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8Reverse[i] = maxSum_Problem_1_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8Reverse[j] + arr.get(i);
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_1_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8[i] + maxSum_Problem_1_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8Reverse[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_1a71d834_5b1d_41aa_aa49_99ccc91327c0(ArrayList<Integer> arr) {
        // Write your code here
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        for(int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for(int j = 0; j < i; j++) {
                if(arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[n - 1] = arr.get(n - 1);
        for(int i = n - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for(int j = n - 1; j > i; j--) {
                if(arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            ans = Math.max(ans, inc[i] + dec[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_2_d38f5707_5930_4784_ab8c_14940cdbd929(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        dec[n-1] = arr.get(n-1);
        for (int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = n-2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = n-1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_58b9b65c_0c0e_4eba_805d_38228008eed0(ArrayList<Integer> arr) {
        int[] max = new int[arr.size()];
        int[] min = new int[arr.size()];
        max[0] = arr.get(0);
        min[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            max[i] = Math.max(max[i - 1], arr.get(i));
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            min[i] = Math.min(min[i + 1], arr.get(i));
        }
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum = Math.max(sum, max[i] + min[i] - arr.get(i));
        }
        return sum;
    }

    
    public static int maxSum_Problem_1_c25b78b4_c7ae_40e2_a356_822d6d6c994e(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_c7dc50f6_2ea4_40d1_a27c_78e7b217152f(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        dp[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }

    
    public static int maxSum_Problem_2_48de7605_0b70_4912_8a5c_c52637a36469(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(i == 0) {
                max = sum;
            }
            else if(sum > max) {
                max = sum;
            }
            else if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_a7028bbc_6e01_44d0_bda4_b2e8ec3cdb4f(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i - 1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_df39bd8b_392d_4494_acf0_1d4b1020d9c7(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_c638c57d_d637_4997_936e_5c65e5ee9c7e(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_e6146e8d_d095_4026_ad30_8221929779b1(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_809869eb_7ac6_42e4_85a6_cfa82bed5854(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum = arr.get(i) + arr.get(i + 1);
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_194b852f_c4bf_4ba3_b6cb_6838fa454e82(ArrayList<Integer> arr) {
        // Write your code here
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size()-1] = arr.get(arr.size()-1);
        for(int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for(int j = 0; j < i; j++) {
                if(arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for(int i = arr.size()-2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for(int j = arr.size()-1; j > i; j--) {
                if(arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_b588863a_3846_404d_bff6_06f529534529(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (i == 0) {
                max = sum;
            } else if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_92c48d6a_2f9d_4e49_8a73_890adc786c8d(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_0bf26df3_43db_4644_a0d0_8b11d49d2f28(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
        }
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_165824c4_ffc3_4383_8bf4_f90b8294e92e(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) > arr.get(i-1)) {
                sum -= arr.get(i-1);
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_631cadb4_8adf_4eb5_ad65_5f44d4b15ee4(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_db0feb26_009b_427c_8108_75054b76993d(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum = arr.get(i) + arr.get(i + 1);
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_33854ae3_b291_4378_97c4_883764f21c4c(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[arr.size()-1] = arr.get(arr.size()-1);
        for(int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for(int j = 0; j < i; j++) {
                if(arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        for(int i = arr.size()-2; i >= 0; i--) {
            dp2[i] = arr.get(i);
            for(int j = arr.size()-1; j > i; j--) {
                if(arr.get(j) < arr.get(i)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_7180a468_1214_4199_b781_1024d4d9e018(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_6ceb96f2_1814_4f3f_b2e6_4e78f15cc438(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_e99d09c9_fa60_4740_ba04_7ff530724d49(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_9fc43a6f_8e57_4c88_b646_e828f7d9645c(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_7fbccb05_95b1_4fd3_8603_b93629fa6c65(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum = arr.get(i) + arr.get(i+1);
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_db195c15_9c8a_4702_b31d_f3817e2e07d0(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (i == 0) {
                max = sum;
            } else if (sum > max) {
                max = sum;
            } else {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_7fc37ae3_8f7b_4501_8aa2_569b846e9830(ArrayList<Integer> arr) {
        // Write your code here
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size()-1] = arr.get(arr.size()-1);
        for(int i=1;i<arr.size();i++) {
            inc[i] = arr.get(i);
            for(int j=0;j<i;j++) {
                if(arr.get(j)<arr.get(i)) {
                    inc[i] = Math.max(inc[i],inc[j]+arr.get(i));
                }
            }
        }
        for(int i=arr.size()-2;i>=0;i--) {
            dec[i] = arr.get(i);
            for(int j=arr.size()-1;j>i;j--) {
                if(arr.get(j)<arr.get(i)) {
                    dec[i] = Math.max(dec[i],dec[j]+arr.get(i));
                }
            }
        }
        int max = 0;
        for(int i=0;i<arr.size();i++) {
            max = Math.max(max,inc[i]+dec[i]-arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_cab5c23b_8af5_4b06_85b8_586374cfe95d(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        dec[n - 1] = arr.get(n - 1);
        for (int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = n - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_e464fd09_64bd_429c_92d6_b07267c5b66a(ArrayList<Integer> arr) {
        int[] maxSum_Problem_0_e464fd09_64bd_429c_92d6_b07267c5b66a = new int[arr.size()];
        int[] maxSum_Problem_0_e464fd09_64bd_429c_92d6_b07267c5b66aReverse = new int[arr.size()];
        maxSum_Problem_0_e464fd09_64bd_429c_92d6_b07267c5b66a[0] = arr.get(0);
        maxSum_Problem_0_e464fd09_64bd_429c_92d6_b07267c5b66aReverse[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_0_e464fd09_64bd_429c_92d6_b07267c5b66a[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_0_e464fd09_64bd_429c_92d6_b07267c5b66a[i] < maxSum_Problem_0_e464fd09_64bd_429c_92d6_b07267c5b66a[j] + arr.get(i)) {
                    maxSum_Problem_0_e464fd09_64bd_429c_92d6_b07267c5b66a[i] = maxSum_Problem_0_e464fd09_64bd_429c_92d6_b07267c5b66a[j] + arr.get(i);
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_0_e464fd09_64bd_429c_92d6_b07267c5b66aReverse[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_0_e464fd09_64bd_429c_92d6_b07267c5b66aReverse[i] < maxSum_Problem_0_e464fd09_64bd_429c_92d6_b07267c5b66aReverse[j] + arr.get(i)) {
                    maxSum_Problem_0_e464fd09_64bd_429c_92d6_b07267c5b66aReverse[i] = maxSum_Problem_0_e464fd09_64bd_429c_92d6_b07267c5b66aReverse[j] + arr.get(i);
                }
            }
        }
        int max = maxSum_Problem_0_e464fd09_64bd_429c_92d6_b07267c5b66a[0] + maxSum_Problem_0_e464fd09_64bd_429c_92d6_b07267c5b66aReverse[0] - arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (max < maxSum_Problem_0_e464fd09_64bd_429c_92d6_b07267c5b66a[i] + maxSum_Problem_0_e464fd09_64bd_429c_92d6_b07267c5b66aReverse[i] - arr.get(i)) {
                max = maxSum_Problem_0_e464fd09_64bd_429c_92d6_b07267c5b66a[i] + maxSum_Problem_0_e464fd09_64bd_429c_92d6_b07267c5b66aReverse[i] - arr.get(i);
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_f98657fc_9545_4c63_97af_9a4dcbd60183(ArrayList<Integer> arr) {
        int maxSum_Problem_1_f98657fc_9545_4c63_97af_9a4dcbd60183 = 0;
        int sum = 0;
        int max = 0;
        int sum2 = 0;
        int max2 = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum = sum + arr.get(i);
            if(sum > max) {
                max = sum;
            }
            sum2 = sum2 + arr.get(i);
            if(sum2 > max2) {
                max2 = sum2;
            }
        }
        if(max > max2) {
            max = max2;
        }
        for(int i = 0; i < arr.size(); i++) {
            sum = sum - arr.get(i);
            if(sum > max) {
                max = sum;
            }
            sum2 = sum2 - arr.get(i);
            if(sum2 > max2) {
                max2 = sum2;
            }
        }
        if(max > max2) {
            max = max2;
        }
        maxSum_Problem_1_f98657fc_9545_4c63_97af_9a4dcbd60183 = max;
        return maxSum_Problem_1_f98657fc_9545_4c63_97af_9a4dcbd60183;
    }

    
    public static int maxSum_Problem_2_2062a172_51c4_4e3b_b939_3cb331a5c811(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_9948eb2c_b956_4e30_8ba2_3ad831b7bf83(ArrayList<Integer> arr) {
        // Write your code here
        int[] maxSum_Problem_2_9948eb2c_b956_4e30_8ba2_3ad831b7bf83 = new int[arr.size()];
        int[] maxSum_Problem_2_9948eb2c_b956_4e30_8ba2_3ad831b7bf83Reverse = new int[arr.size()];
        maxSum_Problem_2_9948eb2c_b956_4e30_8ba2_3ad831b7bf83[0] = arr.get(0);
        maxSum_Problem_2_9948eb2c_b956_4e30_8ba2_3ad831b7bf83Reverse[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_2_9948eb2c_b956_4e30_8ba2_3ad831b7bf83[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_2_9948eb2c_b956_4e30_8ba2_3ad831b7bf83[i] < maxSum_Problem_2_9948eb2c_b956_4e30_8ba2_3ad831b7bf83[j] + arr.get(i)) {
                    maxSum_Problem_2_9948eb2c_b956_4e30_8ba2_3ad831b7bf83[i] = maxSum_Problem_2_9948eb2c_b956_4e30_8ba2_3ad831b7bf83[j] + arr.get(i);
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_2_9948eb2c_b956_4e30_8ba2_3ad831b7bf83Reverse[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_2_9948eb2c_b956_4e30_8ba2_3ad831b7bf83Reverse[i] < maxSum_Problem_2_9948eb2c_b956_4e30_8ba2_3ad831b7bf83Reverse[j] + arr.get(i)) {
                    maxSum_Problem_2_9948eb2c_b956_4e30_8ba2_3ad831b7bf83Reverse[i] = maxSum_Problem_2_9948eb2c_b956_4e30_8ba2_3ad831b7bf83Reverse[j] + arr.get(i);
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            if (max < maxSum_Problem_2_9948eb2c_b956_4e30_8ba2_3ad831b7bf83[i] + maxSum_Problem_2_9948eb2c_b956_4e30_8ba2_3ad831b7bf83Reverse[i] - arr.get(i)) {
                max = maxSum_Problem_2_9948eb2c_b956_4e30_8ba2_3ad831b7bf83[i] + maxSum_Problem_2_9948eb2c_b956_4e30_8ba2_3ad831b7bf83Reverse[i] - arr.get(i);
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_35177237_db5f_4cc9_82e4_2ebd829eca0a(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) > max) {
                    max = arr.get(i) + arr.get(j);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_46606935_ec6f_412b_8f56_634292babafc(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                if (sum < 0) {
                    sum = 0;
                }
                if (arr.get(i) < arr.get(i + 1)) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_fa185b77_c656_43c4_b6cc_d261c2471151(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            sum = arr.get(i) + arr.get(i + 1);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_87b6ee1a_5901_42e6_9365_0b8e67d26741(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            sum = arr.get(i) + arr.get(i + 1);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_61b2d3fe_44fa_4732_a0df_b8ac7720c02f(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_468bfbcc_1910_4a97_aa65_1e456e47701b(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_6a0a843a_b983_4ab8_b50f_2dc89a932cd5(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_22afba44_cc70_4d4a_8b35_d0ad8ad2be57(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) > max) {
                    max = arr.get(i) + arr.get(j);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_61d85d14_283c_4b7f_b9ae_8b0e6a209a2f(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                sum -= arr.get(i);
                if(sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_9f207bd0_faaa_49b8_ad6b_fad6ec4a3bc8(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_1d4338f4_d1fd_4281_9073_0bd83759010f(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i) + arr.get(i - 1));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_b38e0b6b_88f7_4cf9_8649_cd7e1d750af9(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_41afaa44_6d8d_4edf_920d_3228ebd53098(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_50256662_c4b8_4e90_93a0_c6e03a1decf4(ArrayList<Integer> arr) {
        ArrayList<Integer> inc = new ArrayList<Integer>();
        ArrayList<Integer> dec = new ArrayList<Integer>();
        for (int i = 0; i < arr.size(); i++) {
            inc.add(arr.get(i));
            dec.add(arr.get(i));
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && inc.get(i) < inc.get(j) + arr.get(i)) {
                    inc.set(i, inc.get(j) + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && dec.get(i) < dec.get(j) + arr.get(i)) {
                    dec.set(i, dec.get(j) + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (max < inc.get(i) + dec.get(i) - arr.get(i)) {
                max = inc.get(i) + dec.get(i) - arr.get(i);
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_f0faa250_ab3c_4021_ace9_7c5db4749da5(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_5b4ea6ef_498c_4668_a6e6_97184e3b6871(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_1d01f565_3c71_4880_9609_172ff6b5206f(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_5b4ea6ef_498c_4668_a6e6_97184e3b6871(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_8c5ccfe0_7d0a_48c8_b8ee_23985c5401bd(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                if(arr.get(i) < arr.get(i + 1)) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_0c92f7ca_d67f_4064_9182_bbd07566e8c7(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i > 0 && arr.get(i) < arr.get(i - 1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_5f43d396_75a1_4fee_b93b_18ccee9efa97(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_80b56867_9e40_4ecf_9c7f_6b18e11df63b(ArrayList<Integer> arr) {
        // Write your code here
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        dec[n - 1] = arr.get(n - 1);
        for (int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = n - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_4c5f3e20_8bd1_4ff8_aad4_51bc5f83372e(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_6d11760c_d5ef_4e44_9171_19ffc145805f(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_d0bc4396_78b1_4a93_8e49_532676fe2350(ArrayList<Integer> arr) {
        // Write your code here
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            dp2[i] = arr.get(i);
        }
        for(int i = 1; i < arr.size(); i++) {
            for(int j = 0; j < i; j++) {
                if(arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        for(int i = arr.size() - 2; i >= 0; i--) {
            for(int j = arr.size() - 1; j > i; j--) {
                if(arr.get(i) > arr.get(j)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_f9fd5812_4d4b_4617_b856_e8ffedc925e3(ArrayList<Integer> arr) {
        int[] maxSum_Problem_1_f9fd5812_4d4b_4617_b856_e8ffedc925e3 = new int[arr.size()];
        int[] maxSum_Problem_1_f9fd5812_4d4b_4617_b856_e8ffedc925e3Reverse = new int[arr.size()];
        maxSum_Problem_1_f9fd5812_4d4b_4617_b856_e8ffedc925e3[0] = arr.get(0);
        maxSum_Problem_1_f9fd5812_4d4b_4617_b856_e8ffedc925e3Reverse[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_1_f9fd5812_4d4b_4617_b856_e8ffedc925e3[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_1_f9fd5812_4d4b_4617_b856_e8ffedc925e3[i] < maxSum_Problem_1_f9fd5812_4d4b_4617_b856_e8ffedc925e3[j] + arr.get(i)) {
                    maxSum_Problem_1_f9fd5812_4d4b_4617_b856_e8ffedc925e3[i] = maxSum_Problem_1_f9fd5812_4d4b_4617_b856_e8ffedc925e3[j] + arr.get(i);
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_1_f9fd5812_4d4b_4617_b856_e8ffedc925e3Reverse[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_1_f9fd5812_4d4b_4617_b856_e8ffedc925e3Reverse[i] < maxSum_Problem_1_f9fd5812_4d4b_4617_b856_e8ffedc925e3Reverse[j] + arr.get(i)) {
                    maxSum_Problem_1_f9fd5812_4d4b_4617_b856_e8ffedc925e3Reverse[i] = maxSum_Problem_1_f9fd5812_4d4b_4617_b856_e8ffedc925e3Reverse[j] + arr.get(i);
                }
            }
        }
        int max = maxSum_Problem_1_f9fd5812_4d4b_4617_b856_e8ffedc925e3[0] + maxSum_Problem_1_f9fd5812_4d4b_4617_b856_e8ffedc925e3Reverse[0] - arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (max < maxSum_Problem_1_f9fd5812_4d4b_4617_b856_e8ffedc925e3[i] + maxSum_Problem_1_f9fd5812_4d4b_4617_b856_e8ffedc925e3Reverse[i] - arr.get(i)) {
                max = maxSum_Problem_1_f9fd5812_4d4b_4617_b856_e8ffedc925e3[i] + maxSum_Problem_1_f9fd5812_4d4b_4617_b856_e8ffedc925e3Reverse[i] - arr.get(i);
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_631cadb4_8adf_4eb5_ad65_5f44d4b15ee4(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_cc208e43_0ed2_48d3_afc9_3264b511820b(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_ffc7556e_deeb_4abd_9709_3b01f89da26b(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = Math.max(dp[i - 1] + arr.get(i), arr.get(i));
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dp2[i] = Math.max(dp2[i + 1] + arr.get(i), arr.get(i));
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_f9271625_f4c7_451d_ae6d_09f42b2c0b81(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_684bb9ed_18bb_45f3_aeb2_f676386aecf9(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_6de994b2_8b59_401b_8bfa_9d2df190834c(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        dp[0] = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for(int j = 0; j < i; j++) {
                if(arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    
    public static int maxSum_Problem_1_86e4025d_721e_4ff1_9757_3a8bbf643209(ArrayList<Integer> arr) {
        int max = 0;
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr.get(i) + arr.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_cb5a3cc8_4bb7_42a5_9293_775f8dceed8e(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            int sum = arr.get(i) + arr.get(i + 1);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_92bb20f0_5b37_4706_8f8e_021b139e0912(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_a8884afa_51ba_42cc_950e_6acf07e39b65(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_99fc55ee_94b6_47e5_854f_2e33abf23fa7(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_ffc7556e_deeb_4abd_9709_3b01f89da26b(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = Math.max(dp[i - 1] + arr.get(i), arr.get(i));
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dp2[i] = Math.max(dp2[i + 1] + arr.get(i), arr.get(i));
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_33ad81ed_bc08_44fa_bd91_3e3539f3c7e7(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max + arr.get(i), arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_1b6813b2_8734_4691_996c_50884792a3d4(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum = arr.get(i) + arr.get(i+1);
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_0d906259_525f_4d10_a4b7_8216e6930dca(ArrayList<Integer> arr) {
        // Write your code here
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_8cf20b59_a665_42e3_82e9_9dac3f7c098c(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_dc4ef6cb_e76a_45bd_816a_42094bf8ec8b(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = Math.max(dp[i - 1] + arr.get(i), arr.get(i));
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dp2[i] = Math.max(dp2[i + 1] + arr.get(i), arr.get(i));
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_80b56867_9e40_4ecf_9c7f_6b18e11df63b(ArrayList<Integer> arr) {
        // Write your code here
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        dec[n - 1] = arr.get(n - 1);
        for (int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = n - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_54dcf902_4680_4fa8_9938_8b266986a669(ArrayList<Integer> arr) {
        // Write your code here
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_b803697a_496b_4a0f_9ed0_8dd1e362caaa(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_8c1867ad_0b19_4755_86b9_d27eb70882e2(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max + arr.get(i), arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_1e09f16d_007f_4ea7_bb41_e5b9a52ce00a(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (i == 0) {
                max = sum;
            } else if (sum < 0) {
                sum = 0;
            } else if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_74b587e9_5156_4e61_a9fc_2e56d176eebc(ArrayList<Integer> arr) {
        int[] maxSum_Problem_0_74b587e9_5156_4e61_a9fc_2e56d176eebc = new int[arr.size()];
        int[] maxSum_Problem_0_74b587e9_5156_4e61_a9fc_2e56d176eebcRev = new int[arr.size()];
        maxSum_Problem_0_74b587e9_5156_4e61_a9fc_2e56d176eebc[0] = arr.get(0);
        maxSum_Problem_0_74b587e9_5156_4e61_a9fc_2e56d176eebcRev[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_0_74b587e9_5156_4e61_a9fc_2e56d176eebc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_0_74b587e9_5156_4e61_a9fc_2e56d176eebc[i] = Math.max(maxSum_Problem_0_74b587e9_5156_4e61_a9fc_2e56d176eebc[i], maxSum_Problem_0_74b587e9_5156_4e61_a9fc_2e56d176eebc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_0_74b587e9_5156_4e61_a9fc_2e56d176eebcRev[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_0_74b587e9_5156_4e61_a9fc_2e56d176eebcRev[i] = Math.max(maxSum_Problem_0_74b587e9_5156_4e61_a9fc_2e56d176eebcRev[i], maxSum_Problem_0_74b587e9_5156_4e61_a9fc_2e56d176eebcRev[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_0_74b587e9_5156_4e61_a9fc_2e56d176eebc[i] + maxSum_Problem_0_74b587e9_5156_4e61_a9fc_2e56d176eebcRev[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_84eff1fd_2846_4f24_81de_f919bb2dea35(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                if (sum < 0) {
                    sum = 0;
                }
                sum += arr.get(i + 1);
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_3198a509_8416_4d6d_896f_a5789790cb96(ArrayList<Integer> arr) {
        int[] max = new int[arr.size()];
        int[] min = new int[arr.size()];
        int[] maxSum_Problem_0_3198a509_8416_4d6d_896f_a5789790cb96 = new int[arr.size()];
        int[] minSum = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            max[i] = arr.get(i);
            min[i] = arr.get(i);
        }
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    max[i] = Math.max(max[i], max[j] + arr.get(i));
                }
                if (arr.get(i) < arr.get(j)) {
                    min[i] = Math.max(min[i], min[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 1; i >= 0; i--) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_0_3198a509_8416_4d6d_896f_a5789790cb96[i] = Math.max(maxSum_Problem_0_3198a509_8416_4d6d_896f_a5789790cb96[i], maxSum_Problem_0_3198a509_8416_4d6d_896f_a5789790cb96[j] + arr.get(i));
                }
                if (arr.get(i) < arr.get(j)) {
                    minSum[i] = Math.max(minSum[i], minSum[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, max[i] + minSum[i]);
            ans = Math.max(ans, min[i] + maxSum_Problem_0_3198a509_8416_4d6d_896f_a5789790cb96[i]);
        }
        return ans;
    }

    
    public static int maxSum_Problem_2_f98657fc_9545_4c63_97af_9a4dcbd60183(ArrayList<Integer> arr) {
        int maxSum_Problem_2_f98657fc_9545_4c63_97af_9a4dcbd60183 = 0;
        int sum = 0;
        int max = 0;
        int sum2 = 0;
        int max2 = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum = sum + arr.get(i);
            if(sum > max) {
                max = sum;
            }
            sum2 = sum2 + arr.get(i);
            if(sum2 > max2) {
                max2 = sum2;
            }
        }
        if(max > max2) {
            max = max2;
        }
        for(int i = 0; i < arr.size(); i++) {
            sum = sum - arr.get(i);
            if(sum > max) {
                max = sum;
            }
            sum2 = sum2 - arr.get(i);
            if(sum2 > max2) {
                max2 = sum2;
            }
        }
        if(max > max2) {
            max = max2;
        }
        maxSum_Problem_2_f98657fc_9545_4c63_97af_9a4dcbd60183 = max;
        return maxSum_Problem_2_f98657fc_9545_4c63_97af_9a4dcbd60183;
    }

    
    public static int maxSum_Problem_1_be1e590f_5c4e_4ad5_b988_13cc44c899e9(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_a3a5be1a_1c35_4271_837e_b9927fb9b1b2(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                if(sum < 0) {
                    sum = 0;
                }
                else {
                    sum = arr.get(i) + arr.get(i + 1);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_1e09f16d_007f_4ea7_bb41_e5b9a52ce00a(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (i == 0) {
                max = sum;
            } else if (sum < 0) {
                sum = 0;
            } else if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_37ce97d4_1507_49d5_b0d8_fab2f8fd8f2d(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_5789f66e_114d_4417_b406_894e9cdd0474(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_2447d683_372e_4063_84fd_eea63c7d654f(ArrayList<Integer> arr) {
        int maxSum_Problem_1_2447d683_372e_4063_84fd_eea63c7d654f = 0;
        int sum = 0;
        int sumOfBitonicSubsequence = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum = sum + arr.get(i);
            if(sum > maxSum_Problem_1_2447d683_372e_4063_84fd_eea63c7d654f) {
                maxSum_Problem_1_2447d683_372e_4063_84fd_eea63c7d654f = sum;
            }
            sumOfBitonicSubsequence += sum;
        }
        for(int i = 0; i < arr.size(); i++) {
            sum = sum - arr.get(i);
            if(sum < sumOfBitonicSubsequence) {
                sumOfBitonicSubsequence = sum;
            }
        }
        return maxSum_Problem_1_2447d683_372e_4063_84fd_eea63c7d654f;
    }

    
    public static int maxSum_Problem_1_5b4ea6ef_498c_4668_a6e6_97184e3b6871(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_9f207bd0_faaa_49b8_ad6b_fad6ec4a3bc8(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_db724021_083a_4625_8ecd_a2f53ee463d8(ArrayList<Integer> arr) {
        int maxSum_Problem_1_db724021_083a_4625_8ecd_a2f53ee463d8 = 0;
        int sum = 0;
        int maxSum_Problem_1_db724021_083a_4625_8ecd_a2f53ee463d8OfSubSeq = 0;
        int sumOfSubSeq = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > maxSum_Problem_1_db724021_083a_4625_8ecd_a2f53ee463d8) {
                maxSum_Problem_1_db724021_083a_4625_8ecd_a2f53ee463d8 = sum;
            }
            sumOfSubSeq = sum;
            for(int j = i; j < arr.size(); j++) {
                sumOfSubSeq += arr.get(j);
                if(sumOfSubSeq > maxSum_Problem_1_db724021_083a_4625_8ecd_a2f53ee463d8OfSubSeq) {
                    maxSum_Problem_1_db724021_083a_4625_8ecd_a2f53ee463d8OfSubSeq = sumOfSubSeq;
                }
            }
        }
        return maxSum_Problem_1_db724021_083a_4625_8ecd_a2f53ee463d8;
    }

    
    public static int maxSum_Problem_1_df457096_3e6e_4489_8858_dee90baf684e(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_a7028bbc_6e01_44d0_bda4_b2e8ec3cdb4f(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i - 1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_db0feb26_009b_427c_8108_75054b76993d(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum = arr.get(i) + arr.get(i + 1);
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_7180a468_1214_4199_b781_1024d4d9e018(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_33ad81ed_bc08_44fa_bd91_3e3539f3c7e7(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max + arr.get(i), arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_bf746a22_ea62_4e14_b358_83c4e4a27e6d(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i - 1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_468bfbcc_1910_4a97_aa65_1e456e47701b(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_ec7ec36b_51f5_441a_9822_296e2e506622(ArrayList<Integer> arr) {
        int maxSum_Problem_0_ec7ec36b_51f5_441a_9822_296e2e506622 = 0;
        int[] maxSum_Problem_0_ec7ec36b_51f5_441a_9822_296e2e506622EndingAt = new int[arr.size()];
        int[] maxSum_Problem_0_ec7ec36b_51f5_441a_9822_296e2e506622StartingAt = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            maxSum_Problem_0_ec7ec36b_51f5_441a_9822_296e2e506622EndingAt[i] = arr.get(i);
            maxSum_Problem_0_ec7ec36b_51f5_441a_9822_296e2e506622StartingAt[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_0_ec7ec36b_51f5_441a_9822_296e2e506622EndingAt[i] = Math.max(maxSum_Problem_0_ec7ec36b_51f5_441a_9822_296e2e506622EndingAt[i], maxSum_Problem_0_ec7ec36b_51f5_441a_9822_296e2e506622EndingAt[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_0_ec7ec36b_51f5_441a_9822_296e2e506622StartingAt[i] = Math.max(maxSum_Problem_0_ec7ec36b_51f5_441a_9822_296e2e506622StartingAt[i], maxSum_Problem_0_ec7ec36b_51f5_441a_9822_296e2e506622StartingAt[j] + arr.get(i));
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            maxSum_Problem_0_ec7ec36b_51f5_441a_9822_296e2e506622 = Math.max(maxSum_Problem_0_ec7ec36b_51f5_441a_9822_296e2e506622, maxSum_Problem_0_ec7ec36b_51f5_441a_9822_296e2e506622EndingAt[i] + maxSum_Problem_0_ec7ec36b_51f5_441a_9822_296e2e506622StartingAt[i] - arr.get(i));
        }
        return maxSum_Problem_0_ec7ec36b_51f5_441a_9822_296e2e506622;
    }

    
    public static int maxSum_Problem_1_8fe583f8_99a9_4467_9d5b_a2f49f2f65b6(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dp2[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_968df31b_ccba_4125_9003_9e8b36200155(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                sum -= arr.get(i);
                if(sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_804a51a5_8b2c_4c0a_a08d_2802f68a6632(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (i == 0) {
                max = sum;
            } else if (sum < max) {
                max = sum;
            } else if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_538d0ebc_23fc_404f_b53d_bbe4b24fcc84(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int sum = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            sum = sum + arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_ad2aefa2_5e7e_4640_b465_4c10b4e69662(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_0f6227b9_7466_4063_8014_ab987e1f4818(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                sum -= arr.get(i);
                if(sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_9fc43a6f_8e57_4c88_b646_e828f7d9645c(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405(ArrayList<Integer> arr) {
        int[] maxSum_Problem_0_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405 = new int[arr.size()];
        int[] maxSum_Problem_0_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405Reverse = new int[arr.size()];
        maxSum_Problem_0_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405[0] = arr.get(0);
        maxSum_Problem_0_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405Reverse[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_0_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_0_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405[i] = Math.max(maxSum_Problem_0_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405[i], maxSum_Problem_0_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_0_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405Reverse[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_0_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405Reverse[i] = Math.max(maxSum_Problem_0_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405Reverse[i], maxSum_Problem_0_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405Reverse[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_0_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405[i] + maxSum_Problem_0_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405Reverse[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_fdd3b4b3_f230_40fa_a80d_463a77681495(ArrayList<Integer> arr) {
        int maxSum_Problem_2_fdd3b4b3_f230_40fa_a80d_463a77681495 = 0;
        int sum = 0;
        int max = 0;
        int sumOfSubSeq = 0;
        int maxOfSubSeq = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum = arr.get(i);
            sumOfSubSeq = sum;
            max = sum;
            for(int j = i; j < arr.size(); j++) {
                sumOfSubSeq += arr.get(j);
                if(sumOfSubSeq > max) {
                    max = sumOfSubSeq;
                }
            }
            if(max > maxSum_Problem_2_fdd3b4b3_f230_40fa_a80d_463a77681495) {
                maxSum_Problem_2_fdd3b4b3_f230_40fa_a80d_463a77681495 = max;
                maxOfSubSeq = sumOfSubSeq;
            }
        }
        return maxSum_Problem_2_fdd3b4b3_f230_40fa_a80d_463a77681495;
    }

    
    public static int maxSum_Problem_0_1c80c326_c968_4325_8628_dd82b993aaa7(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                sum -= arr.get(i);
                if(sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_69b8352f_6364_49d8_ae0a_3e0278a2ef3f(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            dp2[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_e7a0c9d4_801f_46b4_8016_fa469995427c(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i) + arr.get(i-1));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_80a0ae74_2327_4618_a408_2a2e9a3514fd(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_1e28239f_61eb_4522_a3bc_60b13ec44b35(ArrayList<Integer> arr) {
        int[] maxSum_Problem_2_1e28239f_61eb_4522_a3bc_60b13ec44b35 = new int[arr.size()];
        int[] maxSum_Problem_2_1e28239f_61eb_4522_a3bc_60b13ec44b35Rev = new int[arr.size()];
        maxSum_Problem_2_1e28239f_61eb_4522_a3bc_60b13ec44b35[0] = arr.get(0);
        maxSum_Problem_2_1e28239f_61eb_4522_a3bc_60b13ec44b35Rev[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_2_1e28239f_61eb_4522_a3bc_60b13ec44b35[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_2_1e28239f_61eb_4522_a3bc_60b13ec44b35[i] = Math.max(maxSum_Problem_2_1e28239f_61eb_4522_a3bc_60b13ec44b35[i], maxSum_Problem_2_1e28239f_61eb_4522_a3bc_60b13ec44b35[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_2_1e28239f_61eb_4522_a3bc_60b13ec44b35Rev[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_2_1e28239f_61eb_4522_a3bc_60b13ec44b35Rev[i] = Math.max(maxSum_Problem_2_1e28239f_61eb_4522_a3bc_60b13ec44b35Rev[i], maxSum_Problem_2_1e28239f_61eb_4522_a3bc_60b13ec44b35Rev[j] + arr.get(i));
                }
            }
        }
        int max = maxSum_Problem_2_1e28239f_61eb_4522_a3bc_60b13ec44b35[0] + maxSum_Problem_2_1e28239f_61eb_4522_a3bc_60b13ec44b35Rev[0] - arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_2_1e28239f_61eb_4522_a3bc_60b13ec44b35[i] + maxSum_Problem_2_1e28239f_61eb_4522_a3bc_60b13ec44b35Rev[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_c7dc50f6_2ea4_40d1_a27c_78e7b217152f(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        dp[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }

    
    public static int maxSum_Problem_1_74b587e9_5156_4e61_a9fc_2e56d176eebc(ArrayList<Integer> arr) {
        int[] maxSum_Problem_1_74b587e9_5156_4e61_a9fc_2e56d176eebc = new int[arr.size()];
        int[] maxSum_Problem_1_74b587e9_5156_4e61_a9fc_2e56d176eebcRev = new int[arr.size()];
        maxSum_Problem_1_74b587e9_5156_4e61_a9fc_2e56d176eebc[0] = arr.get(0);
        maxSum_Problem_1_74b587e9_5156_4e61_a9fc_2e56d176eebcRev[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_1_74b587e9_5156_4e61_a9fc_2e56d176eebc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_1_74b587e9_5156_4e61_a9fc_2e56d176eebc[i] = Math.max(maxSum_Problem_1_74b587e9_5156_4e61_a9fc_2e56d176eebc[i], maxSum_Problem_1_74b587e9_5156_4e61_a9fc_2e56d176eebc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_1_74b587e9_5156_4e61_a9fc_2e56d176eebcRev[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_1_74b587e9_5156_4e61_a9fc_2e56d176eebcRev[i] = Math.max(maxSum_Problem_1_74b587e9_5156_4e61_a9fc_2e56d176eebcRev[i], maxSum_Problem_1_74b587e9_5156_4e61_a9fc_2e56d176eebcRev[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_1_74b587e9_5156_4e61_a9fc_2e56d176eebc[i] + maxSum_Problem_1_74b587e9_5156_4e61_a9fc_2e56d176eebcRev[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_c92b23ad_20a8_45a0_b206_6f432c4135d7(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum = arr.get(i) + arr.get(i + 1);
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_ffc7556e_deeb_4abd_9709_3b01f89da26b(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = Math.max(dp[i - 1] + arr.get(i), arr.get(i));
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dp2[i] = Math.max(dp2[i + 1] + arr.get(i), arr.get(i));
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_f8f2e74c_5f2f_45ce_afe5_1917512c09d7(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (i == 0) {
                max = sum;
            } else if (sum < max) {
                max = sum;
            } else if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_8942afbc_84f3_4b6f_ae8b_5aee37db2dc5(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_71ddfc59_fdb3_46a0_9f64_d5cac15783ac(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            dp2[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
                if (arr.get(i) < arr.get(j)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_b457a1ad_81b4_4978_8e85_73bc01481f80(ArrayList<Integer> arr) {
        int[] maxSum_Problem_1_b457a1ad_81b4_4978_8e85_73bc01481f80 = new int[arr.size()];
        int[] maxSum_Problem_1_b457a1ad_81b4_4978_8e85_73bc01481f80Rev = new int[arr.size()];
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            maxSum_Problem_1_b457a1ad_81b4_4978_8e85_73bc01481f80[i] = arr.get(i);
            maxSum_Problem_1_b457a1ad_81b4_4978_8e85_73bc01481f80Rev[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_1_b457a1ad_81b4_4978_8e85_73bc01481f80[i] < maxSum_Problem_1_b457a1ad_81b4_4978_8e85_73bc01481f80[j] + arr.get(i)) {
                    maxSum_Problem_1_b457a1ad_81b4_4978_8e85_73bc01481f80[i] = maxSum_Problem_1_b457a1ad_81b4_4978_8e85_73bc01481f80[j] + arr.get(i);
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_1_b457a1ad_81b4_4978_8e85_73bc01481f80Rev[i] < maxSum_Problem_1_b457a1ad_81b4_4978_8e85_73bc01481f80Rev[j] + arr.get(i)) {
                    maxSum_Problem_1_b457a1ad_81b4_4978_8e85_73bc01481f80Rev[i] = maxSum_Problem_1_b457a1ad_81b4_4978_8e85_73bc01481f80Rev[j] + arr.get(i);
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_1_b457a1ad_81b4_4978_8e85_73bc01481f80[i] + maxSum_Problem_1_b457a1ad_81b4_4978_8e85_73bc01481f80Rev[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_4b450da1_2ab7_4da1_8826_98a3635c79e6(ArrayList<Integer> arr) {
        // Write your code here
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dp2[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, dp[i] + dp2[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_2_4ed662a8_f8c8_4fda_8e16_ea7e93bb18c4(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_be1e590f_5c4e_4ad5_b988_13cc44c899e9(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_41494c0a_7b49_4c14_96fc_ba7258eff4a7(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dp2[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, dp[i] + dp2[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_0_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8(ArrayList<Integer> arr) {
        int[] maxSum_Problem_0_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8 = new int[arr.size()];
        int[] maxSum_Problem_0_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8Reverse = new int[arr.size()];
        maxSum_Problem_0_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8[0] = arr.get(0);
        maxSum_Problem_0_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8Reverse[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_0_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_0_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8[i] < maxSum_Problem_0_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8[j] + arr.get(i)) {
                    maxSum_Problem_0_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8[i] = maxSum_Problem_0_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8[j] + arr.get(i);
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_0_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8Reverse[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_0_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8Reverse[i] < maxSum_Problem_0_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8Reverse[j] + arr.get(i)) {
                    maxSum_Problem_0_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8Reverse[i] = maxSum_Problem_0_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8Reverse[j] + arr.get(i);
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_0_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8[i] + maxSum_Problem_0_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8Reverse[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_a7b79163_e887_4e4f_a04b_8688618575a2(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_5f5424e8_6908_40ec_9ebc_3b38f4dfb07c(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            int sum = arr.get(i) + arr.get(i + 1);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_538d0ebc_23fc_404f_b53d_bbe4b24fcc84(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int sum = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            sum = sum + arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_781cb344_c383_4f49_a600_e5ddf3feb730(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_ab6386e1_0ed9_4191_ac2a_923b5564cd84(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_f6adc699_1282_4b82_b6d2_a3422bcad081(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) > max) {
                    max = arr.get(i) + arr.get(j);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_1e28239f_61eb_4522_a3bc_60b13ec44b35(ArrayList<Integer> arr) {
        int[] maxSum_Problem_0_1e28239f_61eb_4522_a3bc_60b13ec44b35 = new int[arr.size()];
        int[] maxSum_Problem_0_1e28239f_61eb_4522_a3bc_60b13ec44b35Rev = new int[arr.size()];
        maxSum_Problem_0_1e28239f_61eb_4522_a3bc_60b13ec44b35[0] = arr.get(0);
        maxSum_Problem_0_1e28239f_61eb_4522_a3bc_60b13ec44b35Rev[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_0_1e28239f_61eb_4522_a3bc_60b13ec44b35[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_0_1e28239f_61eb_4522_a3bc_60b13ec44b35[i] = Math.max(maxSum_Problem_0_1e28239f_61eb_4522_a3bc_60b13ec44b35[i], maxSum_Problem_0_1e28239f_61eb_4522_a3bc_60b13ec44b35[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_0_1e28239f_61eb_4522_a3bc_60b13ec44b35Rev[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_0_1e28239f_61eb_4522_a3bc_60b13ec44b35Rev[i] = Math.max(maxSum_Problem_0_1e28239f_61eb_4522_a3bc_60b13ec44b35Rev[i], maxSum_Problem_0_1e28239f_61eb_4522_a3bc_60b13ec44b35Rev[j] + arr.get(i));
                }
            }
        }
        int max = maxSum_Problem_0_1e28239f_61eb_4522_a3bc_60b13ec44b35[0] + maxSum_Problem_0_1e28239f_61eb_4522_a3bc_60b13ec44b35Rev[0] - arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_0_1e28239f_61eb_4522_a3bc_60b13ec44b35[i] + maxSum_Problem_0_1e28239f_61eb_4522_a3bc_60b13ec44b35Rev[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_0ec50b04_2c20_495d_8d71_7459d7e0f82e(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_3981110e_8890_4d57_8aed_b0218b668e8b(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i) + arr.get(i - 1));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_80b56867_9e40_4ecf_9c7f_6b18e11df63b(ArrayList<Integer> arr) {
        // Write your code here
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        dec[n - 1] = arr.get(n - 1);
        for (int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = n - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_01f02a85_007a_433f_8f43_b24f1aec2250(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int sum = 0;
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_f9271625_f4c7_451d_ae6d_09f42b2c0b81(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_40452279_0e6f_4423_ba19_f47ea976be83(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i > 0 && sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_fa185b77_c656_43c4_b6cc_d261c2471151(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            sum = arr.get(i) + arr.get(i + 1);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_797c0f8c_12c7_429b_885a_e26f361d5bb8(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        dp[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        int[] dp2 = new int[arr.size()];
        dp2[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = arr.size() - 2; i >= 0; i--) {
            dp2[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, dp[i] + dp2[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_2_81631487_9203_405f_b0d9_33b963f392bd(ArrayList<Integer> arr) {
        int[] maxSum_Problem_2_81631487_9203_405f_b0d9_33b963f392bd = new int[arr.size()];
        int[] maxSum_Problem_2_81631487_9203_405f_b0d9_33b963f392bdRev = new int[arr.size()];
        maxSum_Problem_2_81631487_9203_405f_b0d9_33b963f392bd[0] = arr.get(0);
        maxSum_Problem_2_81631487_9203_405f_b0d9_33b963f392bdRev[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_2_81631487_9203_405f_b0d9_33b963f392bd[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_2_81631487_9203_405f_b0d9_33b963f392bd[i] = Math.max(maxSum_Problem_2_81631487_9203_405f_b0d9_33b963f392bd[i], maxSum_Problem_2_81631487_9203_405f_b0d9_33b963f392bd[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_2_81631487_9203_405f_b0d9_33b963f392bdRev[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_2_81631487_9203_405f_b0d9_33b963f392bdRev[i] = Math.max(maxSum_Problem_2_81631487_9203_405f_b0d9_33b963f392bdRev[i], maxSum_Problem_2_81631487_9203_405f_b0d9_33b963f392bdRev[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_2_81631487_9203_405f_b0d9_33b963f392bd[i] + maxSum_Problem_2_81631487_9203_405f_b0d9_33b963f392bdRev[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_71ddfc59_fdb3_46a0_9f64_d5cac15783ac(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            dp2[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
                if (arr.get(i) < arr.get(j)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_cf435951_7553_4428_af51_f92fabe53ac7(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_b059dc4a_aabe_4942_9e89_c3eb25a1b1af(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_ecab9784_93fe_448c_9720_da9eba9ea657(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                sum -= arr.get(i);
                if(sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_84718c35_0f76_4cc5_9644_1a76bcae9d39(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_3e6ab88c_9886_4e9b_9586_140cee5d9591(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i - 1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_290e7b36_95e9_4a8c_b945_fab6843be9b1(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_7fbccb05_95b1_4fd3_8603_b93629fa6c65(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum = arr.get(i) + arr.get(i+1);
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_bac70683_cebf_4623_83de_fa9e495e7d7d(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i) + arr.get(i-1));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_4acd1119_c96d_40fa_b815_6b3ab8e7d669(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dp2[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_f2068ed3_4f6f_4dda_a3ad_45c2e88eacea(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            int sum = arr.get(i) + arr.get(i + 1);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_61d85d14_283c_4b7f_b9ae_8b0e6a209a2f(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                sum -= arr.get(i);
                if(sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_3e8560d5_0cf5_4954_b90c_e370ce5925d8(ArrayList<Integer> arr) {
        int[] max = new int[arr.size()];
        int[] min = new int[arr.size()];
        max[0] = arr.get(0);
        min[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            max[i] = Math.max(max[i - 1] + arr.get(i), arr.get(i));
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            min[i] = Math.max(min[i + 1] + arr.get(i), arr.get(i));
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, max[i] + min[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_2_8a327fe1_4cb2_4ac4_bd2c_61efc840b1f9(ArrayList<Integer> arr) {
        // Write your code here
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_68b3e077_c5b3_435b_b114_2d872b8180d6(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        dec[n - 1] = arr.get(n - 1);
        for (int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = n - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, inc[i] + dec[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_0_5927b4db_5fb3_42d1_b9bf_cd87c27f4fac(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        dec[n - 1] = arr.get(n - 1);
        for (int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = n - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_ecab9784_93fe_448c_9720_da9eba9ea657(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                sum -= arr.get(i);
                if(sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_d4cc69ec_22db_4939_b02c_8cb0e2e71d0a(ArrayList<Integer> arr) {
        // Write your code here
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_19e2b9a9_b2e4_4a88_9853_bfc1dadfc853(ArrayList<Integer> arr) {
        int[] dp1 = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp1[0] = arr.get(0);
        dp2[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            dp1[i] = Math.max(arr.get(i), dp1[i - 1] + arr.get(i));
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dp2[i] = Math.max(arr.get(i), dp2[i + 1] + arr.get(i));
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp1[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_b457a1ad_81b4_4978_8e85_73bc01481f80(ArrayList<Integer> arr) {
        int[] maxSum_Problem_2_b457a1ad_81b4_4978_8e85_73bc01481f80 = new int[arr.size()];
        int[] maxSum_Problem_2_b457a1ad_81b4_4978_8e85_73bc01481f80Rev = new int[arr.size()];
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            maxSum_Problem_2_b457a1ad_81b4_4978_8e85_73bc01481f80[i] = arr.get(i);
            maxSum_Problem_2_b457a1ad_81b4_4978_8e85_73bc01481f80Rev[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_2_b457a1ad_81b4_4978_8e85_73bc01481f80[i] < maxSum_Problem_2_b457a1ad_81b4_4978_8e85_73bc01481f80[j] + arr.get(i)) {
                    maxSum_Problem_2_b457a1ad_81b4_4978_8e85_73bc01481f80[i] = maxSum_Problem_2_b457a1ad_81b4_4978_8e85_73bc01481f80[j] + arr.get(i);
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_2_b457a1ad_81b4_4978_8e85_73bc01481f80Rev[i] < maxSum_Problem_2_b457a1ad_81b4_4978_8e85_73bc01481f80Rev[j] + arr.get(i)) {
                    maxSum_Problem_2_b457a1ad_81b4_4978_8e85_73bc01481f80Rev[i] = maxSum_Problem_2_b457a1ad_81b4_4978_8e85_73bc01481f80Rev[j] + arr.get(i);
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_2_b457a1ad_81b4_4978_8e85_73bc01481f80[i] + maxSum_Problem_2_b457a1ad_81b4_4978_8e85_73bc01481f80Rev[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_0f92c7d4_5e6c_4ee2_b901_976c349877fb(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fd(ArrayList<Integer> arr) {
        int[] maxSum_Problem_0_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fd = new int[arr.size()];
        int[] maxSum_Problem_0_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fdRev = new int[arr.size()];
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            maxSum_Problem_0_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fd[i] = arr.get(i);
            maxSum_Problem_0_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fdRev[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_0_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fd[i] < maxSum_Problem_0_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fd[j] + arr.get(i)) {
                    maxSum_Problem_0_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fd[i] = maxSum_Problem_0_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fd[j] + arr.get(i);
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_0_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fdRev[i] < maxSum_Problem_0_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fdRev[j] + arr.get(i)) {
                    maxSum_Problem_0_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fdRev[i] = maxSum_Problem_0_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fdRev[j] + arr.get(i);
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_0_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fd[i] + maxSum_Problem_0_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fdRev[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_04fe7b27_a62c_4ae5_afbc_98ffeea88c97(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_9b85991b_dfa4_4cda_9c65_4f526bc3081a(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        dec[n-1] = arr.get(n-1);
        for (int i = 1; i < n; i++) {
            inc[i] = Math.max(arr.get(i), inc[i-1] + arr.get(i));
        }
        for (int i = n-2; i >= 0; i--) {
            dec[i] = Math.max(arr.get(i), dec[i+1] + arr.get(i));
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_1b6813b2_8734_4691_996c_50884792a3d4(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum = arr.get(i) + arr.get(i+1);
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_f520c152_5053_46e8_b369_6210321b6c48(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (i == 0) {
                max = sum;
            } else if (sum < 0) {
                max = Math.max(max, sum);
            } else {
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_f2068ed3_4f6f_4dda_a3ad_45c2e88eacea(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            int sum = arr.get(i) + arr.get(i + 1);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_87bac728_72dc_4cec_a294_e612531e23fe(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_22e36ed8_c0d1_4d37_a51e_931ed4b864cf(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_ec7ec36b_51f5_441a_9822_296e2e506622(ArrayList<Integer> arr) {
        int maxSum_Problem_1_ec7ec36b_51f5_441a_9822_296e2e506622 = 0;
        int[] maxSum_Problem_1_ec7ec36b_51f5_441a_9822_296e2e506622EndingAt = new int[arr.size()];
        int[] maxSum_Problem_1_ec7ec36b_51f5_441a_9822_296e2e506622StartingAt = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            maxSum_Problem_1_ec7ec36b_51f5_441a_9822_296e2e506622EndingAt[i] = arr.get(i);
            maxSum_Problem_1_ec7ec36b_51f5_441a_9822_296e2e506622StartingAt[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_1_ec7ec36b_51f5_441a_9822_296e2e506622EndingAt[i] = Math.max(maxSum_Problem_1_ec7ec36b_51f5_441a_9822_296e2e506622EndingAt[i], maxSum_Problem_1_ec7ec36b_51f5_441a_9822_296e2e506622EndingAt[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_1_ec7ec36b_51f5_441a_9822_296e2e506622StartingAt[i] = Math.max(maxSum_Problem_1_ec7ec36b_51f5_441a_9822_296e2e506622StartingAt[i], maxSum_Problem_1_ec7ec36b_51f5_441a_9822_296e2e506622StartingAt[j] + arr.get(i));
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            maxSum_Problem_1_ec7ec36b_51f5_441a_9822_296e2e506622 = Math.max(maxSum_Problem_1_ec7ec36b_51f5_441a_9822_296e2e506622, maxSum_Problem_1_ec7ec36b_51f5_441a_9822_296e2e506622EndingAt[i] + maxSum_Problem_1_ec7ec36b_51f5_441a_9822_296e2e506622StartingAt[i] - arr.get(i));
        }
        return maxSum_Problem_1_ec7ec36b_51f5_441a_9822_296e2e506622;
    }

    
    public static int maxSum_Problem_1_40f19423_c882_428c_9bb0_384ada5ed34d(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_caa3107f_fe74_4fdc_9040_589ac585ae90(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) > max) {
                    max = arr.get(i) + arr.get(j);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_9b220cec_1384_4a56_af58_067d66ab2e15(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_04fe7b27_a62c_4ae5_afbc_98ffeea88c97(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_44ae58da_6b23_4555_a9d7_cc8f58eb6ffa(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_e4ae5760_dd7c_477d_a320_843c03d55517(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_35b2e7d2_c93a_4750_ac19_062af2edd5d7(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum = sum + arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fd(ArrayList<Integer> arr) {
        int[] maxSum_Problem_2_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fd = new int[arr.size()];
        int[] maxSum_Problem_2_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fdRev = new int[arr.size()];
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            maxSum_Problem_2_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fd[i] = arr.get(i);
            maxSum_Problem_2_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fdRev[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_2_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fd[i] < maxSum_Problem_2_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fd[j] + arr.get(i)) {
                    maxSum_Problem_2_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fd[i] = maxSum_Problem_2_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fd[j] + arr.get(i);
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_2_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fdRev[i] < maxSum_Problem_2_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fdRev[j] + arr.get(i)) {
                    maxSum_Problem_2_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fdRev[i] = maxSum_Problem_2_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fdRev[j] + arr.get(i);
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_2_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fd[i] + maxSum_Problem_2_8ae4f1cc_8dc7_4ce5_b115_36561d33f0fdRev[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_6333f9cc_a038_416e_91a6_74dd27455de7(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            sum = arr.get(i) + arr.get(i + 1);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_8fe583f8_99a9_4467_9d5b_a2f49f2f65b6(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dp2[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_df457096_3e6e_4489_8858_dee90baf684e(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_48de7605_0b70_4912_8a5c_c52637a36469(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(i == 0) {
                max = sum;
            }
            else if(sum > max) {
                max = sum;
            }
            else if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_735b834f_a333_43d9_9c2e_94e373d993a0(ArrayList<Integer> arr) {
        // Write your code here
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dp2[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, dp[i] + dp2[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_0_40452279_0e6f_4423_ba19_f47ea976be83(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i > 0 && sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_5f99b585_2604_42c0_a607_a9aebbd2f013(ArrayList<Integer> arr) {
        int[] maxSum_Problem_2_5f99b585_2604_42c0_a607_a9aebbd2f013 = new int[arr.size()];
        int[] maxSum_Problem_2_5f99b585_2604_42c0_a607_a9aebbd2f013Rev = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            maxSum_Problem_2_5f99b585_2604_42c0_a607_a9aebbd2f013[i] = arr.get(i);
            maxSum_Problem_2_5f99b585_2604_42c0_a607_a9aebbd2f013Rev[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_2_5f99b585_2604_42c0_a607_a9aebbd2f013[i] < maxSum_Problem_2_5f99b585_2604_42c0_a607_a9aebbd2f013[j] + arr.get(i)) {
                    maxSum_Problem_2_5f99b585_2604_42c0_a607_a9aebbd2f013[i] = maxSum_Problem_2_5f99b585_2604_42c0_a607_a9aebbd2f013[j] + arr.get(i);
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_2_5f99b585_2604_42c0_a607_a9aebbd2f013Rev[i] < maxSum_Problem_2_5f99b585_2604_42c0_a607_a9aebbd2f013Rev[j] + arr.get(i)) {
                    maxSum_Problem_2_5f99b585_2604_42c0_a607_a9aebbd2f013Rev[i] = maxSum_Problem_2_5f99b585_2604_42c0_a607_a9aebbd2f013Rev[j] + arr.get(i);
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_2_5f99b585_2604_42c0_a607_a9aebbd2f013[i] + maxSum_Problem_2_5f99b585_2604_42c0_a607_a9aebbd2f013Rev[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_ea656d95_bdd1_4b76_86c5_9e1d1325d524(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_9ba85b9d_eb1f_496c_abea_4b7603ab87de(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_f9271625_f4c7_451d_ae6d_09f42b2c0b81(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_c25b78b4_c7ae_40e2_a356_822d6d6c994e(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_c4bf226d_b7b8_45b5_979b_242e00ed96e7(ArrayList<Integer> arr) {
        // Write your code here
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = Math.max(inc[i - 1], arr.get(i));
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = Math.max(dec[i + 1], arr.get(i));
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_33d1da03_354e_4d3c_b3c4_f6b275b39aec(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dp2[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_e7a0c9d4_801f_46b4_8016_fa469995427c(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i) + arr.get(i-1));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_3fbc5625_6609_489f_83fe_1232fc509667(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        dec[n - 1] = arr.get(n - 1);
        for (int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = n - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, inc[i] + dec[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_2_126ac29d_4bad_4ef4_9bf6_1b5cbd76df9c(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        for (int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[n - 1] = arr.get(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = n - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_68845c20_5212_47e6_a793_ba3959aa3c87(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int sum = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > arr.get(i - 1)) {
                sum += arr.get(i);
            } else {
                sum = arr.get(i);
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_dda89315_b64d_4986_a50d_de5d60779793(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            dp[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i : dp) {
            max = Math.max(max, i);
        }
        return max;
    }

    
    public static int maxSum_Problem_1_b5c8147f_026d_4213_af0b_5e130cd24fd1(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_bbc92669_dbaf_4485_88d8_79e587e24ec9(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i));
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(j) > arr.get(i) && arr.get(j) > arr.get(i + 1)) {
                    max = Math.max(max, arr.get(j) + arr.get(i) + arr.get(i + 1));
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_fa26023f_4bad_4710_9ad2_59ac2cab665a(ArrayList<Integer> arr) {
        int[] maxSum_Problem_2_fa26023f_4bad_4710_9ad2_59ac2cab665a = new int[arr.size()];
        int[] maxSum_Problem_2_fa26023f_4bad_4710_9ad2_59ac2cab665aRev = new int[arr.size()];
        maxSum_Problem_2_fa26023f_4bad_4710_9ad2_59ac2cab665a[0] = arr.get(0);
        maxSum_Problem_2_fa26023f_4bad_4710_9ad2_59ac2cab665aRev[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_2_fa26023f_4bad_4710_9ad2_59ac2cab665a[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_2_fa26023f_4bad_4710_9ad2_59ac2cab665a[i] = Math.max(maxSum_Problem_2_fa26023f_4bad_4710_9ad2_59ac2cab665a[i], maxSum_Problem_2_fa26023f_4bad_4710_9ad2_59ac2cab665a[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_2_fa26023f_4bad_4710_9ad2_59ac2cab665aRev[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_2_fa26023f_4bad_4710_9ad2_59ac2cab665aRev[i] = Math.max(maxSum_Problem_2_fa26023f_4bad_4710_9ad2_59ac2cab665aRev[i], maxSum_Problem_2_fa26023f_4bad_4710_9ad2_59ac2cab665aRev[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_2_fa26023f_4bad_4710_9ad2_59ac2cab665a[i] + maxSum_Problem_2_fa26023f_4bad_4710_9ad2_59ac2cab665aRev[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_37ce97d4_1507_49d5_b0d8_fab2f8fd8f2d(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_dc3525a1_ba14_4b36_97a6_ac42cc97d446(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_4b450da1_2ab7_4da1_8826_98a3635c79e6(ArrayList<Integer> arr) {
        // Write your code here
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dp2[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, dp[i] + dp2[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_1_e464fd09_64bd_429c_92d6_b07267c5b66a(ArrayList<Integer> arr) {
        int[] maxSum_Problem_1_e464fd09_64bd_429c_92d6_b07267c5b66a = new int[arr.size()];
        int[] maxSum_Problem_1_e464fd09_64bd_429c_92d6_b07267c5b66aReverse = new int[arr.size()];
        maxSum_Problem_1_e464fd09_64bd_429c_92d6_b07267c5b66a[0] = arr.get(0);
        maxSum_Problem_1_e464fd09_64bd_429c_92d6_b07267c5b66aReverse[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_1_e464fd09_64bd_429c_92d6_b07267c5b66a[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_1_e464fd09_64bd_429c_92d6_b07267c5b66a[i] < maxSum_Problem_1_e464fd09_64bd_429c_92d6_b07267c5b66a[j] + arr.get(i)) {
                    maxSum_Problem_1_e464fd09_64bd_429c_92d6_b07267c5b66a[i] = maxSum_Problem_1_e464fd09_64bd_429c_92d6_b07267c5b66a[j] + arr.get(i);
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_1_e464fd09_64bd_429c_92d6_b07267c5b66aReverse[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_1_e464fd09_64bd_429c_92d6_b07267c5b66aReverse[i] < maxSum_Problem_1_e464fd09_64bd_429c_92d6_b07267c5b66aReverse[j] + arr.get(i)) {
                    maxSum_Problem_1_e464fd09_64bd_429c_92d6_b07267c5b66aReverse[i] = maxSum_Problem_1_e464fd09_64bd_429c_92d6_b07267c5b66aReverse[j] + arr.get(i);
                }
            }
        }
        int max = maxSum_Problem_1_e464fd09_64bd_429c_92d6_b07267c5b66a[0] + maxSum_Problem_1_e464fd09_64bd_429c_92d6_b07267c5b66aReverse[0] - arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (max < maxSum_Problem_1_e464fd09_64bd_429c_92d6_b07267c5b66a[i] + maxSum_Problem_1_e464fd09_64bd_429c_92d6_b07267c5b66aReverse[i] - arr.get(i)) {
                max = maxSum_Problem_1_e464fd09_64bd_429c_92d6_b07267c5b66a[i] + maxSum_Problem_1_e464fd09_64bd_429c_92d6_b07267c5b66aReverse[i] - arr.get(i);
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_4acd1119_c96d_40fa_b815_6b3ab8e7d669(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dp2[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_dda89315_b64d_4986_a50d_de5d60779793(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            dp[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i : dp) {
            max = Math.max(max, i);
        }
        return max;
    }

    
    public static int maxSum_Problem_0_b457a1ad_81b4_4978_8e85_73bc01481f80(ArrayList<Integer> arr) {
        int[] maxSum_Problem_0_b457a1ad_81b4_4978_8e85_73bc01481f80 = new int[arr.size()];
        int[] maxSum_Problem_0_b457a1ad_81b4_4978_8e85_73bc01481f80Rev = new int[arr.size()];
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            maxSum_Problem_0_b457a1ad_81b4_4978_8e85_73bc01481f80[i] = arr.get(i);
            maxSum_Problem_0_b457a1ad_81b4_4978_8e85_73bc01481f80Rev[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_0_b457a1ad_81b4_4978_8e85_73bc01481f80[i] < maxSum_Problem_0_b457a1ad_81b4_4978_8e85_73bc01481f80[j] + arr.get(i)) {
                    maxSum_Problem_0_b457a1ad_81b4_4978_8e85_73bc01481f80[i] = maxSum_Problem_0_b457a1ad_81b4_4978_8e85_73bc01481f80[j] + arr.get(i);
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_0_b457a1ad_81b4_4978_8e85_73bc01481f80Rev[i] < maxSum_Problem_0_b457a1ad_81b4_4978_8e85_73bc01481f80Rev[j] + arr.get(i)) {
                    maxSum_Problem_0_b457a1ad_81b4_4978_8e85_73bc01481f80Rev[i] = maxSum_Problem_0_b457a1ad_81b4_4978_8e85_73bc01481f80Rev[j] + arr.get(i);
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_0_b457a1ad_81b4_4978_8e85_73bc01481f80[i] + maxSum_Problem_0_b457a1ad_81b4_4978_8e85_73bc01481f80Rev[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_8e271b28_8eb7_4f96_8ad9_7a476292eba6(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
        }
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum < max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_4acd1119_c96d_40fa_b815_6b3ab8e7d669(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dp2[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_1d4338f4_d1fd_4281_9073_0bd83759010f(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i) + arr.get(i - 1));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_0c783a7d_4f6b_4102_818b_58382660ada2(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            sum = arr.get(i) + arr.get(i + 1);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_a194d2ec_4b4a_4ec8_bc4c_74688d8d0b4c(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
        }
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum < max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_19e1ac9d_b5df_4887_945a_530b6e48106b(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_adc37cf9_db84_414a_9f77_bbaaf9802089(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_59b5e675_92d0_4d2f_bbcc_515ec74ff0de(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_db724021_083a_4625_8ecd_a2f53ee463d8(ArrayList<Integer> arr) {
        int maxSum_Problem_2_db724021_083a_4625_8ecd_a2f53ee463d8 = 0;
        int sum = 0;
        int maxSum_Problem_2_db724021_083a_4625_8ecd_a2f53ee463d8OfSubSeq = 0;
        int sumOfSubSeq = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > maxSum_Problem_2_db724021_083a_4625_8ecd_a2f53ee463d8) {
                maxSum_Problem_2_db724021_083a_4625_8ecd_a2f53ee463d8 = sum;
            }
            sumOfSubSeq = sum;
            for(int j = i; j < arr.size(); j++) {
                sumOfSubSeq += arr.get(j);
                if(sumOfSubSeq > maxSum_Problem_2_db724021_083a_4625_8ecd_a2f53ee463d8OfSubSeq) {
                    maxSum_Problem_2_db724021_083a_4625_8ecd_a2f53ee463d8OfSubSeq = sumOfSubSeq;
                }
            }
        }
        return maxSum_Problem_2_db724021_083a_4625_8ecd_a2f53ee463d8;
    }

    
    public static int maxSum_Problem_2_19e2b9a9_b2e4_4a88_9853_bfc1dadfc853(ArrayList<Integer> arr) {
        int[] dp1 = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp1[0] = arr.get(0);
        dp2[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            dp1[i] = Math.max(arr.get(i), dp1[i - 1] + arr.get(i));
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dp2[i] = Math.max(arr.get(i), dp2[i + 1] + arr.get(i));
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp1[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_71330793_8eff_41f6_8efc_ea98374f4290(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_6c9ec2a9_60ed_4756_aa7c_fd4faf24ee6b(ArrayList<Integer> arr) {
        // Write your code here
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_bc69e2d0_fe72_48dc_875a_f920ab695a28(ArrayList<Integer> arr) {
        int[] maxSum_Problem_2_bc69e2d0_fe72_48dc_875a_f920ab695a28 = new int[arr.size()];
        int[] maxSum_Problem_2_bc69e2d0_fe72_48dc_875a_f920ab695a28Rev = new int[arr.size()];
        maxSum_Problem_2_bc69e2d0_fe72_48dc_875a_f920ab695a28[0] = arr.get(0);
        maxSum_Problem_2_bc69e2d0_fe72_48dc_875a_f920ab695a28Rev[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_2_bc69e2d0_fe72_48dc_875a_f920ab695a28[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    maxSum_Problem_2_bc69e2d0_fe72_48dc_875a_f920ab695a28[i] = Math.max(maxSum_Problem_2_bc69e2d0_fe72_48dc_875a_f920ab695a28[i], maxSum_Problem_2_bc69e2d0_fe72_48dc_875a_f920ab695a28[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_2_bc69e2d0_fe72_48dc_875a_f920ab695a28Rev[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    maxSum_Problem_2_bc69e2d0_fe72_48dc_875a_f920ab695a28Rev[i] = Math.max(maxSum_Problem_2_bc69e2d0_fe72_48dc_875a_f920ab695a28Rev[i], maxSum_Problem_2_bc69e2d0_fe72_48dc_875a_f920ab695a28Rev[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, maxSum_Problem_2_bc69e2d0_fe72_48dc_875a_f920ab695a28[i] + maxSum_Problem_2_bc69e2d0_fe72_48dc_875a_f920ab695a28Rev[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_1_cb5a3cc8_4bb7_42a5_9293_775f8dceed8e(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            int sum = arr.get(i) + arr.get(i + 1);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_ecab9784_93fe_448c_9720_da9eba9ea657(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                sum -= arr.get(i);
                if(sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_a0a6a1b7_f54b_4fd4_88e8_3d6f85a2ebb0(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        dec[n-1] = arr.get(n-1);
        for (int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = n-2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = n-1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, inc[i] + dec[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_2_0823c2c4_b797_4dc2_86d3_4fca156df13b(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        for (int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[n - 1] = arr.get(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = n - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, inc[i] + dec[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_0_1d01f565_3c71_4880_9609_172ff6b5206f(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_0775ea5d_c77b_4ed3_b5e3_2b28e32ed330(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_af74bc66_e9aa_4b0e_a7a1_96df88443e1f(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_137a0bcd_3c32_4818_93f7_bae81ab729d7(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] dp = new int[n];
        int[] dp2 = new int[n];
        dp[0] = arr.get(0);
        dp2[n-1] = arr.get(n-1);
        for(int i = 1; i < n; i++) {
            dp[i] = arr.get(i);
            for(int j = 0; j < i; j++) {
                if(arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        for(int i = n-2; i >= 0; i--) {
            dp2[i] = arr.get(i);
            for(int j = n-1; j > i; j--) {
                if(arr.get(j) < arr.get(i)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            ans = Math.max(ans, dp[i] + dp2[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_1_071c77a0_9091_41b5_8a00_d979c563202c(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_9a87e86d_9bfb_464f_80d7_06c2e6c75466(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) > max) {
                    max = arr.get(i) + arr.get(j);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_577cf62f_ed4d_494f_a843_6ff6e87b995e(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, inc[i] + dec[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_0_81080153_dc99_4cd8_aeb0_21eb99edbde7(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) > max) {
                    max = arr.get(i) + arr.get(j);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_8453bbd0_38a4_4eb9_985e_3f7a1514c28c(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i) + arr.get(i - 1));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_626a740a_46bc_4e5d_a3a9_9fb867fb3f82(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_e7227e11_6870_4303_8ec9_2c0d5280d266(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_804a51a5_8b2c_4c0a_a08d_2802f68a6632(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (i == 0) {
                max = sum;
            } else if (sum < max) {
                max = sum;
            } else if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_9a87e86d_9bfb_464f_80d7_06c2e6c75466(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) > max) {
                    max = arr.get(i) + arr.get(j);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_08e78e0a_a6dd_407c_b41c_64b5413baadb(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dp2[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_0de2235d_f909_49b7_bb4e_faddbc7f9d93(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_35b2e7d2_c93a_4750_ac19_062af2edd5d7(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum = sum + arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_e9c36da5_a3d5_43bb_97cb_af462c8242a4(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i > 0 && arr.get(i) < arr.get(i - 1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_1dcf2933_0df9_4ad0_81a4_b23eaf3407d2(ArrayList<Integer> arr) {
        int[] dp1 = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            dp1[i] = arr.get(i);
            dp2[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp1[i] = Math.max(dp1[i], dp1[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp1[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_19e2b9a9_b2e4_4a88_9853_bfc1dadfc853(ArrayList<Integer> arr) {
        int[] dp1 = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp1[0] = arr.get(0);
        dp2[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            dp1[i] = Math.max(arr.get(i), dp1[i - 1] + arr.get(i));
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dp2[i] = Math.max(arr.get(i), dp2[i + 1] + arr.get(i));
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp1[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_8fe583f8_99a9_4467_9d5b_a2f49f2f65b6(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dp2[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_01f02a85_007a_433f_8f43_b24f1aec2250(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int sum = 0;
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_d1c24c8b_0210_4f52_8eb1_bdd03f0e376d(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum = arr.get(i) + arr.get(i + 1);
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_91841539_24dd_4c89_9847_a657100feab9(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i));
            for (int j = i - 1; j >= 0; j--) {
                max = Math.max(max, arr.get(j) + arr.get(i));
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_84540f78_bc8a_4122_a8c4_551759eb5555(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_83f59f86_05dc_4112_b281_e88d1404c770(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) > max) {
                    max = arr.get(i) + arr.get(j);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_ea656d95_bdd1_4b76_86c5_9e1d1325d524(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_257111b1_fe1c_4c30_9fec_3071803def38(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        dec[n - 1] = arr.get(n - 1);
        for (int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = n - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, inc[i] + dec[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_2_97c15090_b12e_4bc2_ae10_2445fcfc5023(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                sum -= arr.get(i);
                if(sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_69b8352f_6364_49d8_ae0a_3e0278a2ef3f(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            dp2[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_9af957c8_7519_47c8_ba07_3ad5573ca703(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) > max) {
                    max = arr.get(i) + arr.get(j);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_7180a468_1214_4199_b781_1024d4d9e018(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_b803697a_496b_4a0f_9ed0_8dd1e362caaa(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_2ba2d7df_b2e3_4f6f_b555_b8f799842929(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_68ba9f10_4aa1_4cd5_8f57_d3bd55b59e87(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i - 1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_c58db391_1458_4665_ad43_b33b1b6ca3d2(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_5fd60bea_142d_4141_bc8c_0da61b0e1f04(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_8e271b28_8eb7_4f96_8ad9_7a476292eba6(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
        }
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum < max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_6049422a_6562_446b_bf4e_1bca5e79afc9(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_809869eb_7ac6_42e4_85a6_cfa82bed5854(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum = arr.get(i) + arr.get(i + 1);
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_804a51a5_8b2c_4c0a_a08d_2802f68a6632(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (i == 0) {
                max = sum;
            } else if (sum < max) {
                max = sum;
            } else if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_e945d111_284f_481a_80da_4928c78f170b(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_f98657fc_9545_4c63_97af_9a4dcbd60183(ArrayList<Integer> arr) {
        int maxSum_Problem_0_f98657fc_9545_4c63_97af_9a4dcbd60183 = 0;
        int sum = 0;
        int max = 0;
        int sum2 = 0;
        int max2 = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum = sum + arr.get(i);
            if(sum > max) {
                max = sum;
            }
            sum2 = sum2 + arr.get(i);
            if(sum2 > max2) {
                max2 = sum2;
            }
        }
        if(max > max2) {
            max = max2;
        }
        for(int i = 0; i < arr.size(); i++) {
            sum = sum - arr.get(i);
            if(sum > max) {
                max = sum;
            }
            sum2 = sum2 - arr.get(i);
            if(sum2 > max2) {
                max2 = sum2;
            }
        }
        if(max > max2) {
            max = max2;
        }
        maxSum_Problem_0_f98657fc_9545_4c63_97af_9a4dcbd60183 = max;
        return maxSum_Problem_0_f98657fc_9545_4c63_97af_9a4dcbd60183;
    }

    
    public static int maxSum_Problem_0_8942afbc_84f3_4b6f_ae8b_5aee37db2dc5(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_92eedda6_fc01_4862_814e_73b4148601dd(ArrayList<Integer> arr) {
        int[] maxSum_Problem_0_92eedda6_fc01_4862_814e_73b4148601dd = new int[arr.size()];
        int[] maxSum_Problem_0_92eedda6_fc01_4862_814e_73b4148601ddRev = new int[arr.size()];
        maxSum_Problem_0_92eedda6_fc01_4862_814e_73b4148601dd[0] = arr.get(0);
        maxSum_Problem_0_92eedda6_fc01_4862_814e_73b4148601ddRev[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_0_92eedda6_fc01_4862_814e_73b4148601dd[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_0_92eedda6_fc01_4862_814e_73b4148601dd[i] < maxSum_Problem_0_92eedda6_fc01_4862_814e_73b4148601dd[j] + arr.get(i)) {
                    maxSum_Problem_0_92eedda6_fc01_4862_814e_73b4148601dd[i] = maxSum_Problem_0_92eedda6_fc01_4862_814e_73b4148601dd[j] + arr.get(i);
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_0_92eedda6_fc01_4862_814e_73b4148601ddRev[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_0_92eedda6_fc01_4862_814e_73b4148601ddRev[i] < maxSum_Problem_0_92eedda6_fc01_4862_814e_73b4148601ddRev[j] + arr.get(i)) {
                    maxSum_Problem_0_92eedda6_fc01_4862_814e_73b4148601ddRev[i] = maxSum_Problem_0_92eedda6_fc01_4862_814e_73b4148601ddRev[j] + arr.get(i);
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (max < maxSum_Problem_0_92eedda6_fc01_4862_814e_73b4148601dd[i] + maxSum_Problem_0_92eedda6_fc01_4862_814e_73b4148601ddRev[i] - arr.get(i)) {
                max = maxSum_Problem_0_92eedda6_fc01_4862_814e_73b4148601dd[i] + maxSum_Problem_0_92eedda6_fc01_4862_814e_73b4148601ddRev[i] - arr.get(i);
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_5fd60bea_142d_4141_bc8c_0da61b0e1f04(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_f9fd5812_4d4b_4617_b856_e8ffedc925e3(ArrayList<Integer> arr) {
        int[] maxSum_Problem_2_f9fd5812_4d4b_4617_b856_e8ffedc925e3 = new int[arr.size()];
        int[] maxSum_Problem_2_f9fd5812_4d4b_4617_b856_e8ffedc925e3Reverse = new int[arr.size()];
        maxSum_Problem_2_f9fd5812_4d4b_4617_b856_e8ffedc925e3[0] = arr.get(0);
        maxSum_Problem_2_f9fd5812_4d4b_4617_b856_e8ffedc925e3Reverse[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_2_f9fd5812_4d4b_4617_b856_e8ffedc925e3[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_2_f9fd5812_4d4b_4617_b856_e8ffedc925e3[i] < maxSum_Problem_2_f9fd5812_4d4b_4617_b856_e8ffedc925e3[j] + arr.get(i)) {
                    maxSum_Problem_2_f9fd5812_4d4b_4617_b856_e8ffedc925e3[i] = maxSum_Problem_2_f9fd5812_4d4b_4617_b856_e8ffedc925e3[j] + arr.get(i);
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_2_f9fd5812_4d4b_4617_b856_e8ffedc925e3Reverse[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_2_f9fd5812_4d4b_4617_b856_e8ffedc925e3Reverse[i] < maxSum_Problem_2_f9fd5812_4d4b_4617_b856_e8ffedc925e3Reverse[j] + arr.get(i)) {
                    maxSum_Problem_2_f9fd5812_4d4b_4617_b856_e8ffedc925e3Reverse[i] = maxSum_Problem_2_f9fd5812_4d4b_4617_b856_e8ffedc925e3Reverse[j] + arr.get(i);
                }
            }
        }
        int max = maxSum_Problem_2_f9fd5812_4d4b_4617_b856_e8ffedc925e3[0] + maxSum_Problem_2_f9fd5812_4d4b_4617_b856_e8ffedc925e3Reverse[0] - arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (max < maxSum_Problem_2_f9fd5812_4d4b_4617_b856_e8ffedc925e3[i] + maxSum_Problem_2_f9fd5812_4d4b_4617_b856_e8ffedc925e3Reverse[i] - arr.get(i)) {
                max = maxSum_Problem_2_f9fd5812_4d4b_4617_b856_e8ffedc925e3[i] + maxSum_Problem_2_f9fd5812_4d4b_4617_b856_e8ffedc925e3Reverse[i] - arr.get(i);
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_b588863a_3846_404d_bff6_06f529534529(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (i == 0) {
                max = sum;
            } else if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_df457096_3e6e_4489_8858_dee90baf684e(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_cd4d80f6_8755_4ae8_a2bd_87f338ed0337(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_a3a52a70_51fa_4cfa_a322_fc98aa559708(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        dp[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    
    public static int maxSum_Problem_1_a1263dd4_f8f0_49d2_9a7a_f8980f98fb81(ArrayList<Integer> arr) {
        // Write your code here
        int[] max = new int[arr.size()];
        int[] min = new int[arr.size()];
        max[0] = arr.get(0);
        min[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            max[i] = Math.max(max[i - 1], arr.get(i));
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            min[i] = Math.min(min[i + 1], arr.get(i));
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, max[i] + min[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_2_08e78e0a_a6dd_407c_b41c_64b5413baadb(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dp2[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_8c5ccfe0_7d0a_48c8_b8ee_23985c5401bd(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                if(arr.get(i) < arr.get(i + 1)) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_a097ec2e_529a_4ab3_adbd_f581444643b3(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_d4c26c74_cb8e_498e_8826_edbf2a8c9ecb(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_631cadb4_8adf_4eb5_ad65_5f44d4b15ee4(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_db11fa65_fc56_4da2_a0bc_eba73f8a9dc6(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        dp[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        int max = dp[0];
        for (int i = 1; i < dp.length; i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    
    public static int maxSum_Problem_0_cab5c23b_8af5_4b06_85b8_586374cfe95d(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        dec[n - 1] = arr.get(n - 1);
        for (int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = n - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_1dcf2933_0df9_4ad0_81a4_b23eaf3407d2(ArrayList<Integer> arr) {
        int[] dp1 = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            dp1[i] = arr.get(i);
            dp2[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp1[i] = Math.max(dp1[i], dp1[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp1[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_11407895_2434_4f7d_a98f_93f5fba8d9b7(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_87bac728_72dc_4cec_a294_e612531e23fe(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_41afaa44_6d8d_4edf_920d_3228ebd53098(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_ceb40c7c_0c5b_492b_8a76_b057fd862ae2(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                sum -= arr.get(i);
                if(sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_ab6386e1_0ed9_4191_ac2a_923b5564cd84(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_0a4a14d2_ad6c_4a2c_aca6_b89da8171a90(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_41494c0a_7b49_4c14_96fc_ba7258eff4a7(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dp2[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, dp[i] + dp2[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_2_b9707490_6f20_4a3b_98cd_99ee45b06d5a(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int sum = 0;
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_5f43d396_75a1_4fee_b93b_18ccee9efa97(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_9a87e86d_9bfb_464f_80d7_06c2e6c75466(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) > max) {
                    max = arr.get(i) + arr.get(j);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_0f92c7d4_5e6c_4ee2_b901_976c349877fb(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_1e09f16d_007f_4ea7_bb41_e5b9a52ce00a(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (i == 0) {
                max = sum;
            } else if (sum < 0) {
                sum = 0;
            } else if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_80a0ae74_2327_4618_a408_2a2e9a3514fd(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_927e8d19_734a_4330_a1b6_8c3ae9cc7a0b(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_137a0bcd_3c32_4818_93f7_bae81ab729d7(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] dp = new int[n];
        int[] dp2 = new int[n];
        dp[0] = arr.get(0);
        dp2[n-1] = arr.get(n-1);
        for(int i = 1; i < n; i++) {
            dp[i] = arr.get(i);
            for(int j = 0; j < i; j++) {
                if(arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        for(int i = n-2; i >= 0; i--) {
            dp2[i] = arr.get(i);
            for(int j = n-1; j > i; j--) {
                if(arr.get(j) < arr.get(i)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            ans = Math.max(ans, dp[i] + dp2[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_0_50256662_c4b8_4e90_93a0_c6e03a1decf4(ArrayList<Integer> arr) {
        ArrayList<Integer> inc = new ArrayList<Integer>();
        ArrayList<Integer> dec = new ArrayList<Integer>();
        for (int i = 0; i < arr.size(); i++) {
            inc.add(arr.get(i));
            dec.add(arr.get(i));
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && inc.get(i) < inc.get(j) + arr.get(i)) {
                    inc.set(i, inc.get(j) + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && dec.get(i) < dec.get(j) + arr.get(i)) {
                    dec.set(i, dec.get(j) + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (max < inc.get(i) + dec.get(i) - arr.get(i)) {
                max = inc.get(i) + dec.get(i) - arr.get(i);
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_e0408420_d137_4f46_98d6_33a655270521(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dp2[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, dp[i] + dp2[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_2_d5445717_df65_4ac9_ad0d_a5fc00137739(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) > max) {
                    max = arr.get(i) + arr.get(j);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_2062a172_51c4_4e3b_b939_3cb331a5c811(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_a3a52a70_51fa_4cfa_a322_fc98aa559708(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        dp[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    
    public static int maxSum_Problem_1_8c5ccfe0_7d0a_48c8_b8ee_23985c5401bd(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                if(arr.get(i) < arr.get(i + 1)) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_886685b4_df5c_4c1b_85a7_9d1f5e69d73e(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_0e743671_ea0e_43a2_bb13_103c4f2797c1(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i > 0 && arr.get(i) < arr.get(i - 1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_cf435951_7553_4428_af51_f92fabe53ac7(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_be1e590f_5c4e_4ad5_b988_13cc44c899e9(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_99fc55ee_94b6_47e5_854f_2e33abf23fa7(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_cb36c30d_6f6b_48ef_8444_2b473a347d2a(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_dc3525a1_ba14_4b36_97a6_ac42cc97d446(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_fa570697_892d_4f3f_a12d_8f0f984e1727(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        dp[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < dp.length; i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    
    public static int maxSum_Problem_1_b588863a_3846_404d_bff6_06f529534529(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (i == 0) {
                max = sum;
            } else if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_577cf62f_ed4d_494f_a843_6ff6e87b995e(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, inc[i] + dec[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_1_9fc43a6f_8e57_4c88_b646_e828f7d9645c(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_d5ff24f3_4001_4b8a_8007_1d6caf39efbd(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_6ceb96f2_1814_4f3f_b2e6_4e78f15cc438(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_61d85d14_283c_4b7f_b9ae_8b0e6a209a2f(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                sum -= arr.get(i);
                if(sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_8453bbd0_38a4_4eb9_985e_3f7a1514c28c(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i) + arr.get(i - 1));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_c58db391_1458_4665_ad43_b33b1b6ca3d2(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_8c1867ad_0b19_4755_86b9_d27eb70882e2(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max + arr.get(i), arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_0f6227b9_7466_4063_8014_ab987e1f4818(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                sum -= arr.get(i);
                if(sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_f0faa250_ab3c_4021_ace9_7c5db4749da5(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_74b587e9_5156_4e61_a9fc_2e56d176eebc(ArrayList<Integer> arr) {
        int[] maxSum_Problem_2_74b587e9_5156_4e61_a9fc_2e56d176eebc = new int[arr.size()];
        int[] maxSum_Problem_2_74b587e9_5156_4e61_a9fc_2e56d176eebcRev = new int[arr.size()];
        maxSum_Problem_2_74b587e9_5156_4e61_a9fc_2e56d176eebc[0] = arr.get(0);
        maxSum_Problem_2_74b587e9_5156_4e61_a9fc_2e56d176eebcRev[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_2_74b587e9_5156_4e61_a9fc_2e56d176eebc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_2_74b587e9_5156_4e61_a9fc_2e56d176eebc[i] = Math.max(maxSum_Problem_2_74b587e9_5156_4e61_a9fc_2e56d176eebc[i], maxSum_Problem_2_74b587e9_5156_4e61_a9fc_2e56d176eebc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_2_74b587e9_5156_4e61_a9fc_2e56d176eebcRev[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_2_74b587e9_5156_4e61_a9fc_2e56d176eebcRev[i] = Math.max(maxSum_Problem_2_74b587e9_5156_4e61_a9fc_2e56d176eebcRev[i], maxSum_Problem_2_74b587e9_5156_4e61_a9fc_2e56d176eebcRev[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_2_74b587e9_5156_4e61_a9fc_2e56d176eebc[i] + maxSum_Problem_2_74b587e9_5156_4e61_a9fc_2e56d176eebcRev[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_6dee756c_18f4_4836_9418_87330c30e700(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_81bfb812_a6b2_47a2_a704_4b5b0e0fde9e(ArrayList<Integer> arr) {
        // Write your code here
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            max = Math.max(max, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_775f515c_d1ea_4091_b85b_37cf0b895a8f(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                if (sum < 0) {
                    sum = 0;
                } else {
                    sum = arr.get(i) + arr.get(i + 1);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_01f02a85_007a_433f_8f43_b24f1aec2250(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int sum = 0;
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_0d906259_525f_4d10_a4b7_8216e6930dca(ArrayList<Integer> arr) {
        // Write your code here
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_fa185b77_c656_43c4_b6cc_d261c2471151(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            sum = arr.get(i) + arr.get(i + 1);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_ab6386e1_0ed9_4191_ac2a_923b5564cd84(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_f32df4a5_0492_4268_9eb9_14113f4aebf1(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (i == 0) {
                max = sum;
            } else if (sum > max) {
                max = sum;
            } else if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_6d11760c_d5ef_4e44_9171_19ffc145805f(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_f32df4a5_0492_4268_9eb9_14113f4aebf1(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (i == 0) {
                max = sum;
            } else if (sum > max) {
                max = sum;
            } else if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_59b5e675_92d0_4d2f_bbcc_515ec74ff0de(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_57bc82c6_3056_41bc_a31b_3888d1e11a77(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_d0bc4396_78b1_4a93_8e49_532676fe2350(ArrayList<Integer> arr) {
        // Write your code here
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            dp2[i] = arr.get(i);
        }
        for(int i = 1; i < arr.size(); i++) {
            for(int j = 0; j < i; j++) {
                if(arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        for(int i = arr.size() - 2; i >= 0; i--) {
            for(int j = arr.size() - 1; j > i; j--) {
                if(arr.get(i) > arr.get(j)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_886685b4_df5c_4c1b_85a7_9d1f5e69d73e(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_33d1da03_354e_4d3c_b3c4_f6b275b39aec(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dp2[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_b496c5d7_03a5_48d3_accc_f3a7ff11ba45(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            dp2[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
                if (arr.get(i) < arr.get(j)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
            max = Math.max(max, dp[i]);
            max = Math.max(max, dp2[i]);
        }
        return max;
    }

    
    public static int maxSum_Problem_1_968df31b_ccba_4125_9003_9e8b36200155(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                sum -= arr.get(i);
                if(sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_58b6ea71_e18b_47e7_8dae_3a98f5eaa1e8(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_ceb40c7c_0c5b_492b_8a76_b057fd862ae2(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                sum -= arr.get(i);
                if(sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_f2068ed3_4f6f_4dda_a3ad_45c2e88eacea(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            int sum = arr.get(i) + arr.get(i + 1);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_b38e0b6b_88f7_4cf9_8649_cd7e1d750af9(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_59b5e675_92d0_4d2f_bbcc_515ec74ff0de(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_b84ea3b9_cc82_4707_9f64_9bbef8d581e8(ArrayList<Integer> arr) {
        int[] maxSum_Problem_0_b84ea3b9_cc82_4707_9f64_9bbef8d581e8 = new int[arr.size()];
        int[] maxSum_Problem_0_b84ea3b9_cc82_4707_9f64_9bbef8d581e8Rev = new int[arr.size()];
        maxSum_Problem_0_b84ea3b9_cc82_4707_9f64_9bbef8d581e8[0] = arr.get(0);
        maxSum_Problem_0_b84ea3b9_cc82_4707_9f64_9bbef8d581e8Rev[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_0_b84ea3b9_cc82_4707_9f64_9bbef8d581e8[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_0_b84ea3b9_cc82_4707_9f64_9bbef8d581e8[i] = Math.max(maxSum_Problem_0_b84ea3b9_cc82_4707_9f64_9bbef8d581e8[i], maxSum_Problem_0_b84ea3b9_cc82_4707_9f64_9bbef8d581e8[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_0_b84ea3b9_cc82_4707_9f64_9bbef8d581e8Rev[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_0_b84ea3b9_cc82_4707_9f64_9bbef8d581e8Rev[i] = Math.max(maxSum_Problem_0_b84ea3b9_cc82_4707_9f64_9bbef8d581e8Rev[i], maxSum_Problem_0_b84ea3b9_cc82_4707_9f64_9bbef8d581e8Rev[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, maxSum_Problem_0_b84ea3b9_cc82_4707_9f64_9bbef8d581e8[i] + maxSum_Problem_0_b84ea3b9_cc82_4707_9f64_9bbef8d581e8Rev[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_1_503b202b_2a74_4458_9ef2_976466e7638a(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum = arr.get(i) + arr.get(i + 1);
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_72f16728_6d36_4da9_9d87_ddc163e7b169(ArrayList<Integer> arr) {
        // Write your code here
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        dec[n-1] = arr.get(n-1);
        for(int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for(int j = 0; j < i; j++) {
                if(arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for(int i = n-2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for(int j = n-1; j > i; j--) {
                if(arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            ans = Math.max(ans, inc[i] + dec[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_2_58b9b65c_0c0e_4eba_805d_38228008eed0(ArrayList<Integer> arr) {
        int[] max = new int[arr.size()];
        int[] min = new int[arr.size()];
        max[0] = arr.get(0);
        min[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            max[i] = Math.max(max[i - 1], arr.get(i));
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            min[i] = Math.min(min[i + 1], arr.get(i));
        }
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum = Math.max(sum, max[i] + min[i] - arr.get(i));
        }
        return sum;
    }

    
    public static int maxSum_Problem_2_71330793_8eff_41f6_8efc_ea98374f4290(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_df58b1f8_40a0_406d_bfdb_e6aba6ca03c1(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i) + arr.get(i - 1));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_a097ec2e_529a_4ab3_adbd_f581444643b3(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_0bf26df3_43db_4644_a0d0_8b11d49d2f28(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
        }
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_684bb9ed_18bb_45f3_aeb2_f676386aecf9(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_165824c4_ffc3_4383_8bf4_f90b8294e92e(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) > arr.get(i-1)) {
                sum -= arr.get(i-1);
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_186d29c9_ca1b_40e4_b99f_a29a288781ff(ArrayList<Integer> arr) {
        // Write your code here
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for(int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for(int j = 0; j < i; j++) {
                if(arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for(int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for(int j = arr.size() - 1; j > i; j--) {
                if(arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_4c5f3e20_8bd1_4ff8_aad4_51bc5f83372e(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_bc69e2d0_fe72_48dc_875a_f920ab695a28(ArrayList<Integer> arr) {
        int[] maxSum_Problem_0_bc69e2d0_fe72_48dc_875a_f920ab695a28 = new int[arr.size()];
        int[] maxSum_Problem_0_bc69e2d0_fe72_48dc_875a_f920ab695a28Rev = new int[arr.size()];
        maxSum_Problem_0_bc69e2d0_fe72_48dc_875a_f920ab695a28[0] = arr.get(0);
        maxSum_Problem_0_bc69e2d0_fe72_48dc_875a_f920ab695a28Rev[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_0_bc69e2d0_fe72_48dc_875a_f920ab695a28[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    maxSum_Problem_0_bc69e2d0_fe72_48dc_875a_f920ab695a28[i] = Math.max(maxSum_Problem_0_bc69e2d0_fe72_48dc_875a_f920ab695a28[i], maxSum_Problem_0_bc69e2d0_fe72_48dc_875a_f920ab695a28[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_0_bc69e2d0_fe72_48dc_875a_f920ab695a28Rev[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    maxSum_Problem_0_bc69e2d0_fe72_48dc_875a_f920ab695a28Rev[i] = Math.max(maxSum_Problem_0_bc69e2d0_fe72_48dc_875a_f920ab695a28Rev[i], maxSum_Problem_0_bc69e2d0_fe72_48dc_875a_f920ab695a28Rev[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, maxSum_Problem_0_bc69e2d0_fe72_48dc_875a_f920ab695a28[i] + maxSum_Problem_0_bc69e2d0_fe72_48dc_875a_f920ab695a28Rev[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_0_0c783a7d_4f6b_4102_818b_58382660ada2(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            sum = arr.get(i) + arr.get(i + 1);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_b11fcae9_450e_4894_8326_6dfac378c9b5(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_1a624f0f_5510_41cb_aeef_d64e829522dc(ArrayList<Integer> arr) {
        int[] max = new int[arr.size()];
        int[] min = new int[arr.size()];
        max[0] = arr.get(0);
        min[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            max[i] = Math.max(max[i - 1], arr.get(i));
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            min[i] = Math.min(min[i + 1], arr.get(i));
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, max[i] + min[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_1_ea656d95_bdd1_4b76_86c5_9e1d1325d524(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85(ArrayList<Integer> arr) {
        int[] maxSum_Problem_1_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85 = new int[arr.size()];
        int[] maxSum_Problem_1_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85Reverse = new int[arr.size()];
        maxSum_Problem_1_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85[0] = arr.get(0);
        maxSum_Problem_1_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85Reverse[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_1_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_1_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85[i] < maxSum_Problem_1_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85[j] + arr.get(i)) {
                    maxSum_Problem_1_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85[i] = maxSum_Problem_1_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85[j] + arr.get(i);
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_1_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85Reverse[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_1_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85Reverse[i] < maxSum_Problem_1_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85Reverse[j] + arr.get(i)) {
                    maxSum_Problem_1_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85Reverse[i] = maxSum_Problem_1_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85Reverse[j] + arr.get(i);
                }
            }
        }
        int max = maxSum_Problem_1_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85[0] + maxSum_Problem_1_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85Reverse[0] - arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (max < maxSum_Problem_1_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85[i] + maxSum_Problem_1_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85Reverse[i] - arr.get(i)) {
                max = maxSum_Problem_1_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85[i] + maxSum_Problem_1_49b1e8a5_27a1_4c25_b75b_9f650dc4fe85Reverse[i] - arr.get(i);
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_93ea4c5e_d066_430b_b843_8f82017540bd(ArrayList<Integer> arr) {
        int maxSum_Problem_1_93ea4c5e_d066_430b_b843_8f82017540bd = 0;
        int sum = 0;
        int maxSum_Problem_1_93ea4c5e_d066_430b_b843_8f82017540bdOfSubsequence = 0;
        int sumOfSubsequence = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum = sum + arr.get(i);
            if(sum > maxSum_Problem_1_93ea4c5e_d066_430b_b843_8f82017540bd) {
                maxSum_Problem_1_93ea4c5e_d066_430b_b843_8f82017540bd = sum;
            }
        }
        for(int i = 0; i < arr.size(); i++) {
            sumOfSubsequence = sumOfSubsequence + arr.get(i);
            if(sumOfSubsequence > maxSum_Problem_1_93ea4c5e_d066_430b_b843_8f82017540bdOfSubsequence) {
                maxSum_Problem_1_93ea4c5e_d066_430b_b843_8f82017540bdOfSubsequence = sumOfSubsequence;
            }
        }
        return maxSum_Problem_1_93ea4c5e_d066_430b_b843_8f82017540bdOfSubsequence;
    }

    
    public static int maxSum_Problem_1_fdd3b4b3_f230_40fa_a80d_463a77681495(ArrayList<Integer> arr) {
        int maxSum_Problem_1_fdd3b4b3_f230_40fa_a80d_463a77681495 = 0;
        int sum = 0;
        int max = 0;
        int sumOfSubSeq = 0;
        int maxOfSubSeq = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum = arr.get(i);
            sumOfSubSeq = sum;
            max = sum;
            for(int j = i; j < arr.size(); j++) {
                sumOfSubSeq += arr.get(j);
                if(sumOfSubSeq > max) {
                    max = sumOfSubSeq;
                }
            }
            if(max > maxSum_Problem_1_fdd3b4b3_f230_40fa_a80d_463a77681495) {
                maxSum_Problem_1_fdd3b4b3_f230_40fa_a80d_463a77681495 = max;
                maxOfSubSeq = sumOfSubSeq;
            }
        }
        return maxSum_Problem_1_fdd3b4b3_f230_40fa_a80d_463a77681495;
    }

    
    public static int maxSum_Problem_0_968df31b_ccba_4125_9003_9e8b36200155(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                sum -= arr.get(i);
                if(sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_5c2de630_85fa_469a_bd85_568ba4f15498(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                if (arr.get(i) < arr.get(i + 1)) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_cede8b2b_3df0_420b_91b6_1936f6336b67(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
        }
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum < max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_92bb20f0_5b37_4706_8f8e_021b139e0912(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_61b2d3fe_44fa_4732_a0df_b8ac7720c02f(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_d1c24c8b_0210_4f52_8eb1_bdd03f0e376d(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum = arr.get(i) + arr.get(i + 1);
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_186d29c9_ca1b_40e4_b99f_a29a288781ff(ArrayList<Integer> arr) {
        // Write your code here
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for(int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for(int j = 0; j < i; j++) {
                if(arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for(int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for(int j = arr.size() - 1; j > i; j--) {
                if(arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_22602da9_81f7_43ff_8b7c_0947f1d1b69a(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_b84ea3b9_cc82_4707_9f64_9bbef8d581e8(ArrayList<Integer> arr) {
        int[] maxSum_Problem_2_b84ea3b9_cc82_4707_9f64_9bbef8d581e8 = new int[arr.size()];
        int[] maxSum_Problem_2_b84ea3b9_cc82_4707_9f64_9bbef8d581e8Rev = new int[arr.size()];
        maxSum_Problem_2_b84ea3b9_cc82_4707_9f64_9bbef8d581e8[0] = arr.get(0);
        maxSum_Problem_2_b84ea3b9_cc82_4707_9f64_9bbef8d581e8Rev[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_2_b84ea3b9_cc82_4707_9f64_9bbef8d581e8[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_2_b84ea3b9_cc82_4707_9f64_9bbef8d581e8[i] = Math.max(maxSum_Problem_2_b84ea3b9_cc82_4707_9f64_9bbef8d581e8[i], maxSum_Problem_2_b84ea3b9_cc82_4707_9f64_9bbef8d581e8[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_2_b84ea3b9_cc82_4707_9f64_9bbef8d581e8Rev[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_2_b84ea3b9_cc82_4707_9f64_9bbef8d581e8Rev[i] = Math.max(maxSum_Problem_2_b84ea3b9_cc82_4707_9f64_9bbef8d581e8Rev[i], maxSum_Problem_2_b84ea3b9_cc82_4707_9f64_9bbef8d581e8Rev[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, maxSum_Problem_2_b84ea3b9_cc82_4707_9f64_9bbef8d581e8[i] + maxSum_Problem_2_b84ea3b9_cc82_4707_9f64_9bbef8d581e8Rev[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_2_1a624f0f_5510_41cb_aeef_d64e829522dc(ArrayList<Integer> arr) {
        int[] max = new int[arr.size()];
        int[] min = new int[arr.size()];
        max[0] = arr.get(0);
        min[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            max[i] = Math.max(max[i - 1], arr.get(i));
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            min[i] = Math.min(min[i + 1], arr.get(i));
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, max[i] + min[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_2_639e7372_4bd5_4d62_b8a3_08a17068fc8f(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_0c92f7ca_d67f_4064_9182_bbd07566e8c7(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i > 0 && arr.get(i) < arr.get(i - 1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_86e4025d_721e_4ff1_9757_3a8bbf643209(ArrayList<Integer> arr) {
        int max = 0;
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr.get(i) + arr.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_df39bd8b_392d_4494_acf0_1d4b1020d9c7(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_126ac29d_4bad_4ef4_9bf6_1b5cbd76df9c(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        for (int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[n - 1] = arr.get(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = n - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_8b309073_c578_49cd_8cfe_af8c50f0df31(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_c63c7a49_6638_4bf5_8407_09257c2624af(ArrayList<Integer> arr) {
        int[] maxSum_Problem_2_c63c7a49_6638_4bf5_8407_09257c2624af = new int[arr.size()];
        int[] maxSum_Problem_2_c63c7a49_6638_4bf5_8407_09257c2624afReverse = new int[arr.size()];
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            maxSum_Problem_2_c63c7a49_6638_4bf5_8407_09257c2624af[i] = arr.get(i);
            maxSum_Problem_2_c63c7a49_6638_4bf5_8407_09257c2624afReverse[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_2_c63c7a49_6638_4bf5_8407_09257c2624af[i] < maxSum_Problem_2_c63c7a49_6638_4bf5_8407_09257c2624af[j] + arr.get(i)) {
                    maxSum_Problem_2_c63c7a49_6638_4bf5_8407_09257c2624af[i] = maxSum_Problem_2_c63c7a49_6638_4bf5_8407_09257c2624af[j] + arr.get(i);
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_2_c63c7a49_6638_4bf5_8407_09257c2624afReverse[i] < maxSum_Problem_2_c63c7a49_6638_4bf5_8407_09257c2624afReverse[j] + arr.get(i)) {
                    maxSum_Problem_2_c63c7a49_6638_4bf5_8407_09257c2624afReverse[i] = maxSum_Problem_2_c63c7a49_6638_4bf5_8407_09257c2624afReverse[j] + arr.get(i);
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_2_c63c7a49_6638_4bf5_8407_09257c2624af[i] + maxSum_Problem_2_c63c7a49_6638_4bf5_8407_09257c2624afReverse[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_f2863c41_e9fb_475e_bc0a_02694128cd24(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        dp[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < dp.length; i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    
    public static int maxSum_Problem_2_fa570697_892d_4f3f_a12d_8f0f984e1727(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        dp[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < dp.length; i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    
    public static int maxSum_Problem_1_68ba9f10_4aa1_4cd5_8f57_d3bd55b59e87(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i - 1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_b059dc4a_aabe_4942_9e89_c3eb25a1b1af(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_9b85991b_dfa4_4cda_9c65_4f526bc3081a(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        dec[n-1] = arr.get(n-1);
        for (int i = 1; i < n; i++) {
            inc[i] = Math.max(arr.get(i), inc[i-1] + arr.get(i));
        }
        for (int i = n-2; i >= 0; i--) {
            dec[i] = Math.max(arr.get(i), dec[i+1] + arr.get(i));
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_d45781c7_2243_4c6d_92a3_fa8a86df24ee(ArrayList<Integer> arr) {
        int[] left = new int[arr.size()];
        int[] right = new int[arr.size()];
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            left[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    left[i] = Math.max(left[i], left[j] + arr.get(i));
                }
            }
            max = Math.max(max, left[i]);
        }
        for (int i = arr.size() - 1; i >= 0; i--) {
            right[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    right[i] = Math.max(right[i], right[j] + arr.get(i));
                }
            }
            max = Math.max(max, right[i]);
        }
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    max = Math.max(max, left[i] + right[j]);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_58b9b65c_0c0e_4eba_805d_38228008eed0(ArrayList<Integer> arr) {
        int[] max = new int[arr.size()];
        int[] min = new int[arr.size()];
        max[0] = arr.get(0);
        min[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            max[i] = Math.max(max[i - 1], arr.get(i));
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            min[i] = Math.min(min[i + 1], arr.get(i));
        }
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum = Math.max(sum, max[i] + min[i] - arr.get(i));
        }
        return sum;
    }

}
