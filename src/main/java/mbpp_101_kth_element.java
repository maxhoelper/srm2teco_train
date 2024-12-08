package mbpp_101_kth_element;

public class mbpp_101_kth_element {

    
    public static int kthElement_Problem_1_7676fce1_a495_4e50_9ad0_c4ec53a6fa5c(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int kthElement_Problem_1_7676fce1_a495_4e50_9ad0_c4ec53a6fa5c = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == k) {
                kthElement_Problem_1_7676fce1_a495_4e50_9ad0_c4ec53a6fa5c = arr.get(i);
                break;
            }
        }
        return kthElement_Problem_1_7676fce1_a495_4e50_9ad0_c4ec53a6fa5c;
    }

    
    public static int kthElement_Problem_2_322f4598_bbd8_4144_ace1_186b31238e14(ArrayList<Integer> arr, int k) {
        // your code goes here
        int i = 0;
        int j = arr.size() - 1;
        int x = 0;
        int y = 0;
        while (i <= j) {
            x = arr.get(i);
            y = arr.get(j);
            if (x > y) {
                i++;
            } else if (x < y) {
                j--;
            } else {
                if (k == 1) {
                    return arr.get(i);
                }
                k--;
                i++;
                j--;
            }
        }
        return x;
    }

    
    public static int kthElement_Problem_1_728ca438_d329_49f7_aa7e_8ee10cdd646b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int total = 0L;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int kthElement_Problem_1_095ec8bc_bd95_4699_986f_63a03b74949a(ArrayList<Integer> arr, int k) {
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_9241b538_c4eb_4b75_9441_cc8382d821d9(ArrayList<Integer> arr, int k) {
        return arr.get(k - 1);
    }

    
    public static int kthElement_Problem_0_36daf0e4_5e2f_444e_9b9b_f65a5db53a8d(ArrayList<Integer> arr, int k) {
        // Write code here
        Integer max = null;
        for (Integer i : arr) {
            if (max != null) if (i > max) {
                max = i;
            }
        }
        return max;
    }

    
    public static int kthElement_Problem_2_e08270f9_ae8c_4952_b613_3313fe06b395(ArrayList<Integer> arr, int k) {
        if(arr.size() == 0 || k == 1) return arr.get(0);
        int low = 0, high = arr.size() - 1, mid = 0, count = 0;
        while(low < high) {
            mid = (low + high) / 2;
            if(count == k - 1) return arr.get(mid);
            if(count < k - 1) low = mid + 1;
            else high = mid - 1;
            count++;
        }
        return arr.get(mid);
    }

    
    public static int kthElement_Problem_1_806072dd_c6ec_41bb_ba37_c092ab2a7356(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int count = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            count++;
            if(count == k) {
                return sum;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_2_289d38fb_7087_47b1_a357_cf5600f9d35f(ArrayList<Integer> arr, int k) {
        int res = arr.get(0);
        int cur = 0;
        for(int i = 1; i < arr.size(); i++){
            if(cur == k-1){
                break;
            }
            cur = cur + arr.get(i);
            res = res + cur;
        }
        return res;
    }

    
    public static int kthElement_Problem_0_399e65b7_5a48_466a_ba6c_b5959751ef9a(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_4d74c808_5f24_44b4_b282_f156c0c7cb50(ArrayList<Integer> arr, int k) {
        int result = -1;
        int count = 0;
        for (Integer i : arr) {
            if (count == k - 1) {
                result = i;
                break;
            }
            count++;
        }
        return result;
    }

    
    public static int kthElement_Problem_1_14077ebb_ae1a_44ba_853b_f9b5f7530e11(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
            if (k == sum) {
                return k + 1;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_0_0e8c50f2_37e3_44b6_b1f5_a411d9bb45ab(ArrayList<Integer> arr, int k) {
        int ans = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            ans = Math.min(ans, arr.get(i));
        }
        return ans;
    }

    
    public static int kthElement_Problem_1_0c0d8ac9_78e7_48a7_b112_e8f4d9e7e272(ArrayList<Integer> arr, int k) {
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_97fccc2a_a1ca_43d2_830c_60854cab58ec(ArrayList<Integer> arr, int k) {
        int result = 0;
        int i = 0;
        for(int l : arr) {
            if(i == k - 1) {
                result = l;
                break;
            }
            i++;
        }
        return result;
    }

    
    public static int kthElement_Problem_1_439fc287_62df_4d79_8352_b08390871aa1(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_e5376d05_b6f1_4343_a6f6_1e6e85ed1a66(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_585bbaf7_3c07_482b_a614_e8024ac38b65(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_3e68a307_9632_4b07_ace0_3947c8912ff6(ArrayList<Integer> arr, int k) {
        int result = -1;
        int temp = 0;
        for(int i = 1; i < arr.size(); i++) {
            temp = arr.get(i);
            if(temp == k) {
                result = i;
                break;
            }
        }
        return result;
    }

    
    public static int kthElement_Problem_2_20fa6204_1d35_4c53_852f_230aceb0779f(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int temp = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
        return arr.get(k - 1);
    }

    
    public static int kthElement_Problem_2_15cfbd15_c0c2_4d45_8a23_52717bf6bbbe(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_180a7853_8a5e_496e_83b6_bf024fb6497a(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        int i = k - 1;
        int j = 0;
        int index =  i;
        while (index >= n) {
            index -= n;
            j++;
        }
        return arr.get(j);
    }

    
    public static int kthElement_Problem_0_66611a92_c376_4d94_85ad_f409541f47d3(ArrayList<Integer> arr, int k) {
        int start = 0, end = arr.size() - 1, mid = (start + end) / 2;
        while (start <= end) {
            if (arr.get(mid) < k) {
                start = mid + 1;
            } else if (arr.get(mid) > k) {
                end = mid - 1;
            } else {
                return arr.get(mid);
            }
            mid = (start + end) / 2;
        }
        return -1;
    }

    
    public static int kthElement_Problem_1_41ba2094_1a71_4603_85e9_0af15db8b1b6(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k - 1);
    }

    
    public static int kthElement_Problem_2_23e30f0c_993b_407e_96f8_5d26260ba4e4(ArrayList<Integer> arr, int k) {
        //Your code here
        return 0;
    }

    
    public static int kthElement_Problem_2_4865cb13_0b3c_4691_80d0_0124e3f34d95(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_0ee251d4_5df7_4c5f_b76f_7ea8011a5bb7(ArrayList<Integer> arr, int k) {
        return arr.get(k - 1);
    }

    
    public static int kthElement_Problem_0_889d37ff_9815_4bd8_add9_76977298ea02(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_685fa7a4_a163_45f8_9a00_01f8465d3d29(ArrayList<Integer> arr, int k) {
        int result = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == k) {
                result = arr.get(i);
                break;
            }
        }
        return result;
    }

    
    public static int kthElement_Problem_0_7f520579_694a_40cc_92ce_267471f6630f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int temp = 0;
        for(int i = 1; i < arr.size(); i++) {
            temp = arr.get(i);
            sum += temp;
            if(sum == k) {
                return temp;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_1_762164ae_3f43_47f8_b48b_b12f4cd83c72(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_34a2020e_9525_480b_b5e0_136ba1ca5107(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_5702b26e_1ae7_4e0b_91c6_bfe7d29ac019(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_0c0d8ac9_78e7_48a7_b112_e8f4d9e7e272(ArrayList<Integer> arr, int k) {
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_14e6879d_36ee_42af_a16d_aff5a3d41ed7(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_e79d72c1_a168_4b48_b072_82daa20520b0(ArrayList<Integer> arr, int k) {
        int i = 0, j = arr.size();
        int p = 0, kth = arr.get(0);
        while(i<j) {
            kth = arr.get(i);
            if (kth == k) return kth;
            if (kth < k) {
                p = kth;
                i++;
            } else {
                j--;
            }
        }
        return p;
    }

    
    public static int kthElement_Problem_0_2539626f_491d_4fb7_b734_07e58e90b230(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_eb91f602_2a20_444f_9605_3600c7f1c614(ArrayList<Integer> arr, int k) {
        if (k > arr.size())
            return -1;
        int len = arr.size();
        if (k == 0 || k > len) {
            return -1;
        }
        int curr = -1;
        int prev = arr.get(0);
        int ans = 0;
        int m = len / 2;
        for (int i = 0; i < m; i++) {
            if (k > 1) {
                k--;
            }
            int next = arr.get(i);
            int diff = (next - prev);
            if (diff < 0 || diff > curr) {
                ans = next;
                curr = diff;
            }
            prev = next;
        }
        return ans;
    }

    
    public static int kthElement_Problem_2_be279dfa_4f3c_46f9_bc19_df9147915f29(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_820cbc78_72b8_415d_8250_20a5a7c444c5(ArrayList<Integer> arr, int k) {
        int first = arr.get(0);
        int last = arr.get(arr.size()-1);
        int mid = first;
        int sum = 0;
        int count = 1;
        for(int i=1;i<arr.size();i++) {
            mid = (first + last) / 2;
            sum = first + last;
            count++;
            if(sum > mid) {
                sum = mid;
                first = mid;
            }
            else if(sum == mid) {
                sum = sum + arr.get(i);
            }
            last = mid;
            if(count==k) {
                return first;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_2_4a860a57_4c23_4faf_bf30_c20a963fe4a1(ArrayList<Integer> arr, int k) {
        ArrayList<Integer> arr2 = (ArrayList<Integer>) arr.clone();
        Collections.sort(arr2);
        arr2.remove(arr2.size() - 1);
        int n = arr.size();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr2.get(i) == k) {
                count++;
            }
        }
        return count;
    }

    
    public static int kthElement_Problem_1_01f2da3d_6ade_4701_b9d6_b8d2a21fad43(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int max = arr.get(0);
        int min = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > k) {
                max = arr.get(i);
            }
            if(sum < k) {
                min = arr.get(i);
            }
        }
        return max;
    }

    
    public static int kthElement_Problem_1_7d288170_c01e_44a7_90a3_e95b9019b7b3(ArrayList<Integer> arr, int k) {
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_d6f9f5e6_49df_49f7_8e3a_97a03fe9625a(ArrayList<Integer> arr, int k) {
        int count = 0;
        for(int x : arr) {
            if(++count == k) return x;
        }
        return 0;
    }

    
    public static int kthElement_Problem_1_3a64761c_7989_4400_9ef4_8b89257b47ea(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_5620cee2_4cc8_450d_bb64_eef81a74134f(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int kthElement_Problem_2_5620cee2_4cc8_450d_bb64_eef81a74134f = 0;
        if (arr.size() < k) {
            return -1;
        }
        Collections.sort(arr);
        kthElement_Problem_2_5620cee2_4cc8_450d_bb64_eef81a74134f = arr.get(k-1);
        return kthElement_Problem_2_5620cee2_4cc8_450d_bb64_eef81a74134f;
    }

    
    public static int kthElement_Problem_2_e3cedc1f_c647_433b_8efe_833bb40c067d(ArrayList<Integer> arr, int k) {
        // Your code here
        int kth = arr.indexOf(k);
        if(kth != -1){
            return arr.get(kth);
        }
        else{
            return -1;
        }
    }

    
    public static int kthElement_Problem_1_711cea72_943e_402c_b325_a03bc440f817(ArrayList<Integer> arr, int k) {
        int count = 0;
        if (k > arr.size()) {
            return -1;
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == k) {
                return arr.get(i);
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_2_76d9a85c_e6ea_4673_8b8f_15c586fb581e(ArrayList<Integer> arr, int k) {
        return arr.get(k - 1);
    }

    
    public static int kthElement_Problem_2_ee0692f7_7f59_42ef_aa0c_7633a678cd39(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_820cbc78_72b8_415d_8250_20a5a7c444c5(ArrayList<Integer> arr, int k) {
        int first = arr.get(0);
        int last = arr.get(arr.size()-1);
        int mid = first;
        int sum = 0;
        int count = 1;
        for(int i=1;i<arr.size();i++) {
            mid = (first + last) / 2;
            sum = first + last;
            count++;
            if(sum > mid) {
                sum = mid;
                first = mid;
            }
            else if(sum == mid) {
                sum = sum + arr.get(i);
            }
            last = mid;
            if(count==k) {
                return first;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_0_0bbc14c1_4be9_40c3_942e_aabc934caee8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int temp = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                temp = arr.get(i);
                break;
            }
        }
        return temp;
    }

    
    public static int kthElement_Problem_0_1ca23af8_d030_4d71_8d3e_a0e71d3846da(ArrayList<Integer> arr, int k) {
        int result = -1;
        int count = 0;
        for (Integer i : arr) {
            if (count == k - 1) {
                result = i;
                break;
            }
            count++;
        }
        return result;
    }

    
    public static int kthElement_Problem_1_c0878e5a_5d1e_4353_8589_f12c3d4c4f57(ArrayList<Integer> arr, int k) {
        if (arr.size() < k) return -1;
        
        int first = arr.get(0);
        int index = 0;
        int last = 0;
        while (first != last) {
            last = first;
            first = (first + index++) % arr.size();
        }
        return first;
    }

    
    public static int kthElement_Problem_2_90533f4c_f111_41c5_9f9f_7a0e0cc0fdaa(ArrayList<Integer> arr, int k) {
        int result = 0;
        int i = 0;
        for (Integer x : arr) {
            if (i == k - 1) {
                result = x;
                break;
            }
            i++;
        }
        return result;
    }

    
    public static int kthElement_Problem_1_712d2250_8a19_4372_b4fc_366118e70c47(ArrayList<Integer> arr, int k) {
        int x = 0;
        for(int i = 0; i < arr.size(); ++i) {
            if(arr.get(i) == k) {
                x = arr.get(i);
                break;
            }
            else {
                ++x;
            }
        }
        return x;
    }

    
    public static int kthElement_Problem_0_9241b538_c4eb_4b75_9441_cc8382d821d9(ArrayList<Integer> arr, int k) {
        return arr.get(k - 1);
    }

    
    public static int kthElement_Problem_1_7f520579_694a_40cc_92ce_267471f6630f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int temp = 0;
        for(int i = 1; i < arr.size(); i++) {
            temp = arr.get(i);
            sum += temp;
            if(sum == k) {
                return temp;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_1_59035969_821c_4b7f_92e1_6e0cffcdc856(ArrayList<Integer> arr, int k) {
        return arr.stream().skip(k).findFirst().orElseThrow();
    }

    
    public static int kthElement_Problem_1_465fa6fd_1e3c_4780_b803_c92f31f4e16c(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_23284c12_a6cd_482e_9f6b_54f810cc19a7(ArrayList<Integer> arr, int k) {
        int result = 0;
        int i = 0;
        for(Integer l : arr) {
            if(i == k - 1) {
                result = l;
                break;
            }
            i++;
        }
        return result;
    }

    
    public static int kthElement_Problem_2_491fce79_2d25_4c9b_b5f8_5d48fca88471(ArrayList<Integer> arr, int k) {
        int ans = 0;
        int temp = 0;
        for(int i = 1 ; i < arr.size() ; i++)
        {
            if(arr.get(i-1) > k)
            {
                ans = temp;
                break;
            }
            ans = arr.get(i-1);
        }
        return ans;
    }

    
    public static int kthElement_Problem_0_51e663b6_24b3_4a77_bb83_e8f81d466a04(ArrayList<Integer> arr, int k) {
        return arr.get( k - 1);
    }

    
    public static int kthElement_Problem_2_cb55d6d0_0325_4a3d_97ac_198c4d3ab3d0(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                return arr.get(i-1);
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_1_97fccc2a_a1ca_43d2_830c_60854cab58ec(ArrayList<Integer> arr, int k) {
        int result = 0;
        int i = 0;
        for(int l : arr) {
            if(i == k - 1) {
                result = l;
                break;
            }
            i++;
        }
        return result;
    }

    
    public static int kthElement_Problem_1_dfed0aed_b537_4372_9147_857d54b7d2fc(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_22468c5d_54ec_4f73_9b50_0a5f719c4d2c(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_c77f7263_b6aa_4d48_bc35_95635f693882(ArrayList<Integer> arr, int k) {
        int arrsize = arr.size();
        int sum = 0;
        int curElem = k-1;
        for(int i =0; i<=arrsize; i++) {
            sum += arr.get(i);
            if(sum == curElem) {
                return i;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_1_e08270f9_ae8c_4952_b613_3313fe06b395(ArrayList<Integer> arr, int k) {
        if(arr.size() == 0 || k == 1) return arr.get(0);
        int low = 0, high = arr.size() - 1, mid = 0, count = 0;
        while(low < high) {
            mid = (low + high) / 2;
            if(count == k - 1) return arr.get(mid);
            if(count < k - 1) low = mid + 1;
            else high = mid - 1;
            count++;
        }
        return arr.get(mid);
    }

    
    public static int kthElement_Problem_2_0ee251d4_5df7_4c5f_b76f_7ea8011a5bb7(ArrayList<Integer> arr, int k) {
        return arr.get(k - 1);
    }

    
    public static int kthElement_Problem_2_2cf2c2a2_6831_427f_a446_e949affb7ec7(ArrayList<Integer> arr, int k) {
        int nthElement = 0;
        boolean found = False;
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) == k) {
                found = True;
                nthElement = i;
                break;
            }
        }
        if(!found) {
            throw new IllegalArgumentException("Invalid k!");
        }
        return nthElement;
    }

    
    public static int kthElement_Problem_1_0f2af47d_e820_45d2_aed9_07593242c8a5(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int temp = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            temp = sum;
            sum = sum - arr.get(i);
            if(sum == k) {
                return temp;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_2_6c88d66f_fec3_432e_9bef_7373c0660cc6(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int count = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            count++;
            if(count > k) {
                max = sum;
                break;
            }
            if(sum > max) {
                max = sum;
            }
            if(sum < min) {
                min = sum;
            }
        }
        return max;
    }

    
    public static int kthElement_Problem_1_a8a0adfd_bb6a_44e5_9c9f_168314b6e280(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int max = arr.get(0);
        int min = arr.get(0);
        int mid = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > k) {
                max = arr.get(i);
            }
            else if(sum < k) {
                min = arr.get(i);
            }
            else if(sum == k) {
                mid = arr.get(i);
            }
        }
        return mid;
    }

    
    public static int kthElement_Problem_0_4181106f_0acf_49cb_b0c1_577ae451dcf6(ArrayList<Integer> arr, int k) {
        int min = arr.get(0);
        int max = arr.get(0);

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < min) min = arr.get(i);
            if (arr.get(i) > max) max = arr.get(i);
        }

        int mid = (max + min) / 2;
        int count = 0;

        while (k >= count) {
            if (mid < arr.get(arr.size() - 1))
                mid = (mid + max) / 2; // find the mid point of the array list
            else
                mid = (mid - min) / 2;
            count++;
        }

        return mid;
    }

    
    public static int kthElement_Problem_2_d545055a_4a4a_4ea5_888b_ad93fb2ca2bb(ArrayList<Integer> arr, int k) {
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_a6367e2d_cc34_4cee_876b_36de8b5c1e84(ArrayList<Integer> arr, int k) {
        
        int kthElement_Problem_0_a6367e2d_cc34_4cee_876b_36de8b5c1e84 = arr.get(0);
        
        for(int i = 1; i < arr.size(); i++){
            
            if(arr.get(i) == kthElement_Problem_0_a6367e2d_cc34_4cee_876b_36de8b5c1e84){
                kthElement_Problem_0_a6367e2d_cc34_4cee_876b_36de8b5c1e84 = arr.get(i-1);
            }
        }
        return kthElement_Problem_0_a6367e2d_cc34_4cee_876b_36de8b5c1e84;
    }

    
    public static int kthElement_Problem_1_3286338f_35ad_4741_b2e9_0846a78d45bd(ArrayList<Integer> arr, int k) {
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_9844c27d_b901_4bc2_8d6c_21b206bd1306(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                return arr.get(i);
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_0_bfe3c674_cbf0_4224_a2d9_14e58db0f21c(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_8cfaa867_076f_4b34_a5f2_4623ad9c6d78(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == max) {
                sum += arr.get(i);
            }
        }
        return sum / k;
    }

    
    public static int kthElement_Problem_0_5620cee2_4cc8_450d_bb64_eef81a74134f(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int kthElement_Problem_0_5620cee2_4cc8_450d_bb64_eef81a74134f = 0;
        if (arr.size() < k) {
            return -1;
        }
        Collections.sort(arr);
        kthElement_Problem_0_5620cee2_4cc8_450d_bb64_eef81a74134f = arr.get(k-1);
        return kthElement_Problem_0_5620cee2_4cc8_450d_bb64_eef81a74134f;
    }

    
    public static int kthElement_Problem_2_61e1df7a_b3cd_43c9_8000_01a9a893a2f2(ArrayList<Integer> arr, int k) {
        int index = -1;
        int value = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == k) {
                index = i;
                value = arr.get(i);
                break;
            }
        }
        return value;
    }

    
    public static int kthElement_Problem_2_806072dd_c6ec_41bb_ba37_c092ab2a7356(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int count = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            count++;
            if(count == k) {
                return sum;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_1_ccb9ac76_68af_4a5e_b5b4_351d56db6c0d(ArrayList<Integer> arr, int k) {
        
        int ans = Integer.MAX_VALUE;
        
        int i = 0;
        int j = 0;
        
        for(i = 0; i < arr.size(); i++) {
            int current = arr.get(i);
            
            if(j == k) {
                ans = current;
                break;
            }
            
            if(current > ans) {
                ans = current;
            }
            
            j = j + 1;
        }
        
        return ans;
    }

    
    public static int kthElement_Problem_2_93c733f3_ffc9_43e0_8d0b_55bb9c33f2bd(ArrayList<Integer> arr, int k) {
        return arr.get(k - 1);
    }

    
    public static int kthElement_Problem_0_633598a0_762a_4907_a0cb_8f364fb986ea(ArrayList<Integer> arr, int k) {
        int result = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == k) {
                result = arr.get(i);
                break;
            }
        }
        return result;
    }

    
    public static int kthElement_Problem_2_3feb1da0_a1f3_449e_ac41_889ee793946a(ArrayList<Integer> arr, int k) {
        return arr.stream()
                .distinct()
                .filter(x -> k % 2 == 1)
                .skip(k % 2)
                .findFirst()
                .orElseThrow(RuntimeException::new);
    }

    
    public static int kthElement_Problem_1_7545ed96_a362_424a_876f_bb317518db15(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int count = 0;
        int temp = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum = sum + arr.get(i);
            count++;
            if(count == k) {
                temp = sum;
                break;
            }
        }
        return temp;
    }

    
    public static int kthElement_Problem_1_2539626f_491d_4fb7_b734_07e58e90b230(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_93c733f3_ffc9_43e0_8d0b_55bb9c33f2bd(ArrayList<Integer> arr, int k) {
        return arr.get(k - 1);
    }

    
    public static int kthElement_Problem_1_5e31a264_a45d_49f1_beaf_3eca78019d8c(ArrayList<Integer> arr, int k) {
        int count = 0;
        int firstVal = arr.get(0);
        int lastVal = arr.get(arr.size() - 1);
        int middleVal = (firstVal + lastVal) / 2;

        // if the k is 0, the given array is empty and 0 index is returned
        if (k == 0) {
            return firstVal;
        }

        // If k is less than the length of the array arr, then return -1
        if (k >= arr.size()) {
            return -1;
        }

        int previousVal = firstVal;
        // If k is even, then the middle value is the kth element of the given array.
        if (k % 2 == 0) {
            return middleVal;
        }

        // For every odd k, calculate the difference between previous kth element and middle value
        // and increment the count as per formula above
        for (int i = 1; i <= k; i++) {
            int temp = previousVal - middleVal;
            previousVal = middleVal;
            middleVal = temp;
            count++;
        }

        // If the kth element is not in the given array, then return -1
        if (count < k) {
            return -1;
        }

        // If the kth element is found at index k, then return the kth element
        return middleVal;
    }

    
    public static int kthElement_Problem_2_36daf0e4_5e2f_444e_9b9b_f65a5db53a8d(ArrayList<Integer> arr, int k) {
        // Write code here
        Integer max = null;
        for (Integer i : arr) {
            if (max != null) if (i > max) {
                max = i;
            }
        }
        return max;
    }

    
    public static int kthElement_Problem_0_90533f4c_f111_41c5_9f9f_7a0e0cc0fdaa(ArrayList<Integer> arr, int k) {
        int result = 0;
        int i = 0;
        for (Integer x : arr) {
            if (i == k - 1) {
                result = x;
                break;
            }
            i++;
        }
        return result;
    }

    
    public static int kthElement_Problem_0_de07737b_0335_49b0_9894_4e067218e6a8(ArrayList<Integer> arr, int k) {
        int ans = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            ans = Math.min(ans, arr.get(i));
        }
        return ans;
    }

    
    public static int kthElement_Problem_0_6c88d66f_fec3_432e_9bef_7373c0660cc6(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int count = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            count++;
            if(count > k) {
                max = sum;
                break;
            }
            if(sum > max) {
                max = sum;
            }
            if(sum < min) {
                min = sum;
            }
        }
        return max;
    }

    
    public static int kthElement_Problem_2_0e56e65a_c2ab_46fc_9ec9_32d11d309014(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_61e1df7a_b3cd_43c9_8000_01a9a893a2f2(ArrayList<Integer> arr, int k) {
        int index = -1;
        int value = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == k) {
                index = i;
                value = arr.get(i);
                break;
            }
        }
        return value;
    }

    
    public static int kthElement_Problem_0_6be018ec_9d7b_4d7f_b443_be694bcdb177(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int sumOfSquares = 0;
        int kthElement_Problem_0_6be018ec_9d7b_4d7f_b443_be694bcdb177 = -1;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            sumOfSquares += arr.get(i) * arr.get(i);
            if(sum == k) {
                kthElement_Problem_0_6be018ec_9d7b_4d7f_b443_be694bcdb177 = i;
                break;
            }
        }
        return kthElement_Problem_0_6be018ec_9d7b_4d7f_b443_be694bcdb177;
    }

    
    public static int kthElement_Problem_1_d26609e3_9961_4286_9a94_abc955594502(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int maxIndex = -1;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > maxSum) {
                maxSum = sum;
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    
    public static int kthElement_Problem_1_489d0124_a731_42a9_82c2_d257db13b699(ArrayList<Integer> arr, int k) {
        return arr.get( (k-1));
    }

    
    public static int kthElement_Problem_1_3d68c199_7ae9_4e89_8f4a_f29b364c6b7f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int temp = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            temp = sum;
            sum = sum - arr.get(i) + arr.get(i - 1);
            if(sum == k) {
                return temp;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_2_d4d442b4_2018_4e9d_bc91_20253efe08c0(ArrayList<Integer> arr, int k) {
        Collections.sort(arr);
        int start = arr.indexOf(k-1);
        return arr.get(start);
    }

    
    public static int kthElement_Problem_0_b459d705_156e_45d9_98a9_3212b3c6a402(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int temp = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                temp = arr.get(i);
                break;
            }
        }
        return temp;
    }

    
    public static int kthElement_Problem_1_20f73132_3753_4773_8d5e_eab8efc45b16(ArrayList<Integer> arr, int k) {
        return arr.get( k - 1);
    }

    
    public static int kthElement_Problem_1_15cfbd15_c0c2_4d45_8a23_52717bf6bbbe(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_d00a6eaa_e70d_425a_b11f_91db2e36e449(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        int prev = 0;
        int cur = 0;
        int result = 0;
        for(int i = 0; i < n; ++i) {
            prev = cur;
            cur = arr.get(i);
            if(k == 1) {
                result = cur;
                break;
            }
            else if(k < (n - i)) {
                result = cur;
                k = k - 1;
            }
            else {
                k = k - (n - i);
                result = prev;
            }
        }
        return result;
    }

    
    public static int kthElement_Problem_1_82490d82_e932_425a_aa61_8305d47061f0(ArrayList<Integer> arr, int k) {
        int result = 0;
        int temp = 0;
        for(int i = 1; i < arr.size(); i++) {
            temp = arr.get(i);
            if(k == temp) {
                result = i;
                break;
            }
        }
        return result;
    }

    
    public static int kthElement_Problem_0_97c495b9_29be_49fd_99fc_367243732948(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int count = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            count++;
            if(count == k) {
                return sum;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_0_0c9819af_00f9_4adb_93ff_b8743e3f667c(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_79ee9778_93b3_454c_b87b_2f36da3c3674(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int count = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            count++;
            if(count == k) {
                return sum;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_1_65e26412_8949_4079_b5a4_a69a93fcf7b8(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_fb9c0538_5592_47e9_87fb_ebefcd6a9b3b(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_2539626f_491d_4fb7_b734_07e58e90b230(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_5270d858_6bab_4330_9432_db8b5286a846(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int count = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            count++;
            if(count == k) {
                return sum;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_1_3b721bb6_552f_40c4_8943_421413977f2a(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_ad19bc56_1c31_4e56_891f_0fc2b2910d2d(ArrayList<Integer> arr, int k) {
        int result = -1;
        int sum = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                result = arr.get(i-1);
                break;
            }
        }
        return result;
    }

    
    public static int kthElement_Problem_1_848f2f38_61c1_47d8_8184_0c372a9c050e(ArrayList<Integer> arr, int k) {
        // TODO: Complete me!
        return -1;
    }

    
    public static int kthElement_Problem_2_66d85690_26f1_4214_9bca_cae995f38bd8(ArrayList<Integer> arr, int k) {
        int res = arr.get(0); // first element
        if (k == 0) return res;
        int next = 0;
        for (int i = 1; i < k; i++) // loop from i = 1 to k = length-1 to find kth element
        {
            next = arr.get(i); // next element in i
            if (next < res)
            {
                int temp = res; // store previous value in temp
                res = next; // update res 
                k = i; // update k 
            }
        }
        return res;
    }

    
    public static int kthElement_Problem_2_6d071295_e5bf_4cda_bfcd_21336b22d6c7(ArrayList<Integer> arr, int k) {
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (k == arr.get(i)) {
                result = arr.get(i);
            }
        }
        return result;
    }

    
    public static int kthElement_Problem_1_d6f9f5e6_49df_49f7_8e3a_97a03fe9625a(ArrayList<Integer> arr, int k) {
        int count = 0;
        for(int x : arr) {
            if(++count == k) return x;
        }
        return 0;
    }

    
    public static int kthElement_Problem_1_e3cedc1f_c647_433b_8efe_833bb40c067d(ArrayList<Integer> arr, int k) {
        // Your code here
        int kth = arr.indexOf(k);
        if(kth != -1){
            return arr.get(kth);
        }
        else{
            return -1;
        }
    }

    
    public static int kthElement_Problem_1_a748ad2a_6af3_4887_ba1e_dd3d363b4a3b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                return arr.get(i);
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_2_8cb74768_ace6_4424_a7db_1f83c890f670(ArrayList<Integer> arr, int k) {
        Integer[] a = new Integer[arr.size()];
        for (int i = 0; i < a.length; i++) {
            a[i] = arr.get(i);
        }
        int mid = arr.size() / 2;
        if (arr.size() % 2 != 0) {
            mid++;
        }
        Arrays.sort(a);
        for (int i = 0; i < mid; i++) {
            int tmp = a[i];
            for (int j = i + 1; j < mid; j++) {
                if (tmp < a[j]) {
                    tmp = j;
                }
            }
            if (i == k) {
                return tmp;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_1_fb9c0538_5592_47e9_87fb_ebefcd6a9b3b(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_6d071295_e5bf_4cda_bfcd_21336b22d6c7(ArrayList<Integer> arr, int k) {
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (k == arr.get(i)) {
                result = arr.get(i);
            }
        }
        return result;
    }

    
    public static int kthElement_Problem_2_7a5dbde1_41da_4d32_ab3b_98692226ad38(ArrayList<Integer> arr, int k) {
        int i = 0, j = arr.size() - 1;
        while (i < j) {
            int mid = arr.get(i + (j - i) / 2);
            if (mid == k) return mid;
            if (mid > k) {
                j = i + (j - i) / 2;
            } else {
                i = i + (j - i) / 2 + 1;
            }
        }
        return arr.get(i);
    }

    
    public static int kthElement_Problem_1_29f67b8c_cce6_449c_9e3a_27b336a003cf(ArrayList<Integer> arr, int k) {
        return arr.get(k - 1);
    }

    
    public static int kthElement_Problem_0_4bd5d7e2_8401_40f8_b00a_06b4609694d6(ArrayList<Integer> arr, int k) {
        int count = 0;
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.equals(i)) {
                count++;
            }
        }
        if (count <= k) {
            int max = arr.stream().reduce((a, b) -> Math.max(a, b)).orElse(Integer.MIN_VALUE);
            int min = arr.stream().reduce((a, b) -> Math.min(a, b)).orElse(Integer.MAX_VALUE);
            res = max - min + k;
        }
        return res;
    }

    
    public static int kthElement_Problem_1_ea0ff483_39e7_4b57_a9af_7249e738f3ee(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        if(k > n)
            k = n;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int m = arr.get(0);
        int res = 0;
        for(int i = 1; i < n; i++){
            if((m+arr.get(i))%k == 0){
                temp.add(arr.get(i));
            }
        }
        res = temp.get(0);
        for(int i = 1; i < n; i++){
            m = temp.get(i);
            temp.set(0, m);
            res = res%k;
        }
        arr.clear();
        for(int i = 0; i < n; i++){
            arr.add(res);
        }
        return res;
    }

    
    public static int kthElement_Problem_0_806072dd_c6ec_41bb_ba37_c092ab2a7356(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int count = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            count++;
            if(count == k) {
                return sum;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_1_d2737065_ae9e_4fce_83b5_a6b1ebcfe30a(ArrayList<Integer> arr, int k) {
        int index = (k - 1);
        return arr.get(index);
    }

    
    public static int kthElement_Problem_2_231fc94d_464c_44c1_8e1d_79cde2177ea6(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        int result = 0;
        for (int i = 1; i < n; i++) {
            if (k == i)
                return arr.get(i);
            result += k - arr.get(i);
        }
        return result;
    }

    
    public static int kthElement_Problem_0_09c95153_827d_4c0d_abf3_d7b2df0a9df2(ArrayList<Integer> arr, int k) {
        int left = 0;
        int right = arr.size() - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(k == arr.get(mid)) {
                return arr.get(mid);
            } else if(arr.get(mid) < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_2_1e2596dd_72ef_47db_8a23_109ee04c76b1(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_2be0edc9_2fc0_486b_a507_4e82023c2c63(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_be3286a0_d0a0_4df9_9fef_a507d1d120a4(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                return arr.get(i);
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_2_bfe3c674_cbf0_4224_a2d9_14e58db0f21c(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_5b366821_a469_44a7_bac4_fcca16f84c8d(ArrayList<Integer> arr, int k) {
        // Write your code here
        int size=arr.size();
        int sum=0;
        for(int i=0;i<size;i++){
            sum+=arr.get(i);
        }
        int num=sum/k;
        int result=0;
        for(int i=0;i<size;i++){
            result+=arr.get(i)*((num-sum)*i+1);
        }
        return result;
    }

    
    public static int kthElement_Problem_2_6d4267b6_489a_4751_a417_a2179ac6ef4c(ArrayList<Integer> arr, int k) {
        int result=0;
        for(int i=0;i<k;i++)
        {
            result=result + arr.get(i);
        }
        return result;
    }

    
    public static int kthElement_Problem_0_3e9eae3f_5398_4543_b216_c68ed6f15fb3(ArrayList<Integer> arr, int k) {
        if(arr.size()==0)
            return 0;
        else{
            int curr = arr.get(0);
            int count = 1;
            for(int i = 1; i<arr.size();i++){
                if(arr.get(i)>curr){
                    count++;
                    if(count==k)
                        return curr;
                    curr = arr.get(i);
                }
            }
            return curr;
        }
    }

    
    public static int kthElement_Problem_2_820cbc78_72b8_415d_8250_20a5a7c444c5(ArrayList<Integer> arr, int k) {
        int first = arr.get(0);
        int last = arr.get(arr.size()-1);
        int mid = first;
        int sum = 0;
        int count = 1;
        for(int i=1;i<arr.size();i++) {
            mid = (first + last) / 2;
            sum = first + last;
            count++;
            if(sum > mid) {
                sum = mid;
                first = mid;
            }
            else if(sum == mid) {
                sum = sum + arr.get(i);
            }
            last = mid;
            if(count==k) {
                return first;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_0_fb2b0494_f510_4bff_9d42_9ae7f229ff56(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        Collections.sort(arr);
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_15fbecc2_cc0b_4c37_92ba_31189eeed3e9(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_c6ebfc35_7ed7_4208_bf11_4ae941379bd3(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                return arr.get(i);
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_0_62862c05_d92c_4a55_88b1_a38e0908bb8b(ArrayList<Integer> arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (count == k - 1) {
                return arr.get(i);
            }
            count++;
        }
        return -1;
    }

    
    public static int kthElement_Problem_2_ac8cf698_1ee6_4abc_9673_1179dc587346(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_3189cf8a_4ac6_49e9_bb81_5c6eb26e9353(ArrayList<Integer> arr, int k) {
        int p = arr.get(0);
        int count = 1;
        for(int i = 0; i < arr.size(); i++) {
            p = arr.get(i);
            if(count == k)
                return p;
            count++;
        }
        return p;
    }

    
    public static int kthElement_Problem_0_3d68c199_7ae9_4e89_8f4a_f29b364c6b7f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int temp = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            temp = sum;
            sum = sum - arr.get(i) + arr.get(i - 1);
            if(sum == k) {
                return temp;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_0_01f2da3d_6ade_4701_b9d6_b8d2a21fad43(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int max = arr.get(0);
        int min = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > k) {
                max = arr.get(i);
            }
            if(sum < k) {
                min = arr.get(i);
            }
        }
        return max;
    }

    
    public static int kthElement_Problem_2_65e26412_8949_4079_b5a4_a69a93fcf7b8(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_1c84c07d_a480_49b5_9e31_18fe8382ba0a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int max = arr.get(0);
        int min = arr.get(0);
        int mid = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > k) {
                max = arr.get(i);
            }
            if(sum < k) {
                min = arr.get(i);
            }
            mid = sum / 2;
        }
        return mid;
    }

    
    public static int kthElement_Problem_2_3e68a307_9632_4b07_ace0_3947c8912ff6(ArrayList<Integer> arr, int k) {
        int result = -1;
        int temp = 0;
        for(int i = 1; i < arr.size(); i++) {
            temp = arr.get(i);
            if(temp == k) {
                result = i;
                break;
            }
        }
        return result;
    }

    
    public static int kthElement_Problem_1_8ba18f07_90ba_4f82_8951_eed5e373655a(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == k) {
                result = arr.get(i);
            }
        }
        return result;
    }

    
    public static int kthElement_Problem_1_4bd5d7e2_8401_40f8_b00a_06b4609694d6(ArrayList<Integer> arr, int k) {
        int count = 0;
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.equals(i)) {
                count++;
            }
        }
        if (count <= k) {
            int max = arr.stream().reduce((a, b) -> Math.max(a, b)).orElse(Integer.MIN_VALUE);
            int min = arr.stream().reduce((a, b) -> Math.min(a, b)).orElse(Integer.MAX_VALUE);
            res = max - min + k;
        }
        return res;
    }

    
    public static int kthElement_Problem_2_fda6d31c_f69a_4af9_9997_d2f6cc9a21d9(ArrayList<Integer> arr, int k) {
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_79ee9778_93b3_454c_b87b_2f36da3c3674(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int count = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            count++;
            if(count == k) {
                return sum;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_2_62862c05_d92c_4a55_88b1_a38e0908bb8b(ArrayList<Integer> arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (count == k - 1) {
                return arr.get(i);
            }
            count++;
        }
        return -1;
    }

    
    public static int kthElement_Problem_0_0f2af47d_e820_45d2_aed9_07593242c8a5(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int temp = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            temp = sum;
            sum = sum - arr.get(i);
            if(sum == k) {
                return temp;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_0_21388836_6b4e_4ea7_b32d_d5dc417c47fb(ArrayList<Integer> arr, int k) {
        int maxVal = Integer.MIN_VALUE;
        int curVal = arr.get(0);
        for(int i=1; i < arr.size(); i++) {
            if((curVal + arr.get(i)) <= k) {
                maxVal = arr.get(i);
            }
            curVal += arr.get(i);
        }
        return maxVal;
    }

    
    public static int kthElement_Problem_2_603eaada_c29b_4f27_bdd9_07638ae8e0c1(ArrayList<Integer> arr, int k) {
        int index = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            index += arr.get(i);
            if(index >= k) {
                return arr.get(i + 1);
            }
        }
        return arr.get(arr.size() - 1);
    }

    
    public static int kthElement_Problem_0_848f2f38_61c1_47d8_8184_0c372a9c050e(ArrayList<Integer> arr, int k) {
        // TODO: Complete me!
        return -1;
    }

    
    public static int kthElement_Problem_1_3bb089de_9195_471d_b59d_6248a9947e56(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        int left = 1;
        int right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid-1) < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return arr.get(right);
    }

    
    public static int kthElement_Problem_1_170148a1_0027_46f6_ad53_4bed18bbdd0f(ArrayList<Integer> arr, int k) {
        if (k > arr.size()) {
            System.out.println("Invalid input. Input size must be less than or equal to the size of the array");
            return 0;
        }
        int kthElement_Problem_1_170148a1_0027_46f6_ad53_4bed18bbdd0f = 0;
        boolean isFound = False;
        for (int i = 1; i < k; i++) {
            if (isFound) {
                kthElement_Problem_1_170148a1_0027_46f6_ad53_4bed18bbdd0f = i;
                break;
            }
            int j = 0;
            while (j < arr.size() && !isFound) {
                if (arr.get(j) == i) {
                    isFound = True;
                }
                j++;
            }
        }
        return kthElement_Problem_1_170148a1_0027_46f6_ad53_4bed18bbdd0f;
    }

    
    public static int kthElement_Problem_2_a539f07e_920b_4735_a25b_b892053300bf(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_4865cb13_0b3c_4691_80d0_0124e3f34d95(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_ddd597f5_15ff_4bb8_b3f3_c9674f9e8088(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int count = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            count++;
            if(count == k) {
                return sum;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_1_6bc3b413_e1c6_4cdd_9cb0_2c452b403fa2(ArrayList<Integer> arr, int k) {
        Collections.sort(arr);
        int lastElem = arr.get(arr.size() - 1);
        int currElem = lastElem;
        int count = 0;
        for (int elem : arr) {
            currElem = elem;
            count++;
            if (count == k) {
                break;
            }
        }
        return currElem;
    }

    
    public static int kthElement_Problem_2_ccb9ac76_68af_4a5e_b5b4_351d56db6c0d(ArrayList<Integer> arr, int k) {
        
        int ans = Integer.MAX_VALUE;
        
        int i = 0;
        int j = 0;
        
        for(i = 0; i < arr.size(); i++) {
            int current = arr.get(i);
            
            if(j == k) {
                ans = current;
                break;
            }
            
            if(current > ans) {
                ans = current;
            }
            
            j = j + 1;
        }
        
        return ans;
    }

    
    public static int kthElement_Problem_1_d545055a_4a4a_4ea5_888b_ad93fb2ca2bb(ArrayList<Integer> arr, int k) {
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_9b654aad_f976_4344_bad9_6e476259c4ce(ArrayList<Integer> arr, int k) {
        int ans = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            ans = Math.min(ans, arr.get(i));
        }
        return ans;
    }

    
    public static int kthElement_Problem_0_5dd1bd31_2087_44af_a262_5932bcf5ce25(ArrayList<Integer> arr, int k) {
        // your code goes here
        int l = arr.size();
        int ans = 0;
        int i = 1;
        while (i <= l && arr.get(i - 1) < k) {
            i++;
        }
        if (i <= l && arr.get(i - 1) == k) {
            ans = arr.get(i - 1);
        }
        return ans;
    }

    
    public static int kthElement_Problem_2_bd661d08_91c5_4020_a07b_cf439f427626(ArrayList<Integer> arr, int k) {
        int count = 0;
        for(int i: arr) {
            count ++;
            if(count == k) return i;
        }
        return -1;
    }

    
    public static int kthElement_Problem_1_231fc94d_464c_44c1_8e1d_79cde2177ea6(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        int result = 0;
        for (int i = 1; i < n; i++) {
            if (k == i)
                return arr.get(i);
            result += k - arr.get(i);
        }
        return result;
    }

    
    public static int kthElement_Problem_2_45e4c34e_6f98_4bf8_a0e0_4705554bf7a4(ArrayList<Integer> arr, int k) {
        int nthElem = -1;
        for (int i : arr) {
            nthElem = i;
        }
        return nthElem;
    }

    
    public static int kthElement_Problem_2_0e8a48c3_1fd7_4e0e_8201_1fc96068f83a(ArrayList<Integer> arr, int k) {
        /*
         * Code goes here
         */
        return 0;
    }

    
    public static int kthElement_Problem_0_336446ac_1943_4430_9660_97817e3b6548(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                return arr.get(i);
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_0_ffef77ca_04d6_487a_bef9_dad2958d464f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int count = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                count++;
            }
        }
        return count;
    }

    
    public static int kthElement_Problem_0_82807f27_8982_40f5_8e7b_6ba53815f3f9(ArrayList<Integer> arr, int k) {
        int elem = 0;
        for (int i = 0; i < k-1; i++) {
            elem = arr.get(i);
        }
        return elem;
    }

    
    public static int kthElement_Problem_1_52de34e8_1b85_4733_8308_8bc77f1b0925(ArrayList<Integer> arr, int k) {
        int result = 0;
        int i = 0;
        for (Integer val : arr) {
            if (i == k - 1) {
                result = val;
                break;
            }
            i++;
        }
        return result;
    }

    
    public static int kthElement_Problem_0_1675accb_4ffd_4fa2_8205_83f88808bd30(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 1; i < k; i++){
            sum += arr.get(i - 1);
        }
        return sum;
    }

    
    public static int kthElement_Problem_1_c77f7263_b6aa_4d48_bc35_95635f693882(ArrayList<Integer> arr, int k) {
        int arrsize = arr.size();
        int sum = 0;
        int curElem = k-1;
        for(int i =0; i<=arrsize; i++) {
            sum += arr.get(i);
            if(sum == curElem) {
                return i;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_0_43bc4167_f5cb_463c_9fc9_c7f854f676e4(ArrayList<Integer> arr, int k) {
        //Complete the method body
        int n=arr.size();
        int start=0;
        int sum=0;
        for(int i=0;i<n-1;i++){
            sum+=arr.get(i);
            if(sum==k)
                return arr.get(i);
            sum-=arr.get(i);
        }
        return arr.get(arr.size()-1);
    }

    
    public static int kthElement_Problem_1_61c4c543_cf40_4d45_bff2_07e9eea2e2af(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int kthElement_Problem_1_61c4c543_cf40_4d45_bff2_07e9eea2e2af = 0;
        int n = arr.size();
        if (k > n) {
            return -1;
        }
        Collections.sort(arr);
        kthElement_Problem_1_61c4c543_cf40_4d45_bff2_07e9eea2e2af = arr.get(k - 1);
        return kthElement_Problem_1_61c4c543_cf40_4d45_bff2_07e9eea2e2af;
    }

    
    public static int kthElement_Problem_1_e3daa430_a315_4570_b9af_6b3f637b18a4(ArrayList<Integer> arr, int k) {
        // Your Code Here
        return 0;
    }

    
    public static int kthElement_Problem_2_9241b538_c4eb_4b75_9441_cc8382d821d9(ArrayList<Integer> arr, int k) {
        return arr.get(k - 1);
    }

    
    public static int kthElement_Problem_1_d881c742_945c_472e_8ef2_b2e6f1951aa1(ArrayList<Integer> arr, int k) {
        if (arr == null) return -1;
        if (k <= 0) return -1;
        int i = 0;
        int count = 0;
        for (Integer element : arr) {
            if (count == k - 1) return element;
            count++;
        }
        return -1;
    }

    
    public static int kthElement_Problem_1_3d84d88a_898d_4021_82b0_7f3a413559c1(ArrayList<Integer> arr, int k) {
        return arr.stream()
            .skip(k)
            .findFirst()
            .get();
    }

    
    public static int kthElement_Problem_1_9b654aad_f976_4344_bad9_6e476259c4ce(ArrayList<Integer> arr, int k) {
        int ans = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            ans = Math.min(ans, arr.get(i));
        }
        return ans;
    }

    
    public static int kthElement_Problem_0_bd661d08_91c5_4020_a07b_cf439f427626(ArrayList<Integer> arr, int k) {
        int count = 0;
        for(int i: arr) {
            count ++;
            if(count == k) return i;
        }
        return -1;
    }

    
    public static int kthElement_Problem_2_3bb089de_9195_471d_b59d_6248a9947e56(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        int left = 1;
        int right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid-1) < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return arr.get(right);
    }

    
    public static int kthElement_Problem_0_489d0124_a731_42a9_82c2_d257db13b699(ArrayList<Integer> arr, int k) {
        return arr.get( (k-1));
    }

    
    public static int kthElement_Problem_1_604e0643_103a_4905_b2e7_9d9f51a6fc53(ArrayList<Integer> arr, int k) {
        int l = 0;
        int r = arr.size() - 1;
        int mid = (l + r) / 2;
        while(l <= r) {
            if(arr.get(mid) < k) {
                l = mid + 1;
            } else if(arr.get(mid) > k) {
                r = mid - 1;
            } else {
                return arr.get(mid);
            }
            mid = (l + r) / 2;
        }
        return arr.get(mid);
    }

    
    public static int kthElement_Problem_2_65f3a809_592e_4fe8_a7eb_829eefbf857f(ArrayList<Integer> arr, int k) {
        int low = 1, high = arr.size(), mid;
        int firstElem = arr.get(0);

        while (low < high) {
            mid = (low + high) / 2;
            if (mid == k) {
                return firstElem;
            }
            if (k < firstElem + mid) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return firstElem;
    }

    
    public static int kthElement_Problem_0_580a8159_0c1e_49b2_8050_f6456376b0cf(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get( k - 1);
    }

    
    public static int kthElement_Problem_2_61c4c543_cf40_4d45_bff2_07e9eea2e2af(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int kthElement_Problem_2_61c4c543_cf40_4d45_bff2_07e9eea2e2af = 0;
        int n = arr.size();
        if (k > n) {
            return -1;
        }
        Collections.sort(arr);
        kthElement_Problem_2_61c4c543_cf40_4d45_bff2_07e9eea2e2af = arr.get(k - 1);
        return kthElement_Problem_2_61c4c543_cf40_4d45_bff2_07e9eea2e2af;
    }

    
    public static int kthElement_Problem_0_d15a3b06_6e4c_47a3_bd7f_0ed4050e16c4(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        int start = 0;
        int end = n - 1;
        while (start < end) {
            int mid = start + ((end - start) / 2);
            if (arr.get(mid) == k) {
                return arr.get(mid);
            }
            if (arr.get(mid) < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (start == end) {
            return arr.get(start);
        }
        return -1;
    }

    
    public static int kthElement_Problem_1_dbda883c_7649_4c12_9f78_427a7c7eb6e8(ArrayList<Integer> arr, int k) {
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_2cf2c2a2_6831_427f_a446_e949affb7ec7(ArrayList<Integer> arr, int k) {
        int nthElement = 0;
        boolean found = False;
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) == k) {
                found = True;
                nthElement = i;
                break;
            }
        }
        if(!found) {
            throw new IllegalArgumentException("Invalid k!");
        }
        return nthElement;
    }

    
    public static int kthElement_Problem_0_7af08916_84b4_4311_83ee_15a3e2f3e1d7(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_39467bea_a53d_450e_b4b5_b4dce60add57(ArrayList<Integer> arr, int k) {
        return arr.get(k - 1);
    }

    
    public static int kthElement_Problem_0_0a24a9df_438b_4ce1_9e86_30cf3e8aaacf(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int low = 0;
        int high = arr.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr.get( mid) == k) {
                return arr.get( mid);
            } else if (arr.get( mid) > k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_2_637294dc_4ccd_4664_b3ac_5c949a0222ba(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_6898ec70_b854_4fbc_8363_217c5f880f01(ArrayList<Integer> arr, int k) {
        if (k > arr.size())
            throw new IllegalArgumentException("k value is greater than the size of array");
        int firstElement = arr.get(0);
        int secondElement = arr.get(1);
        int index = 2; //kth is the first element
        int count = 0;
        while (index != arr.size()) {
            count += (firstElement + secondElement) * (index - 1);
            firstElement = secondElement;
            secondElement = arr.get(index++);
        }
        return count;
    }

    
    public static int kthElement_Problem_1_cb55d6d0_0325_4a3d_97ac_198c4d3ab3d0(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                return arr.get(i-1);
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_2_580a8159_0c1e_49b2_8050_f6456376b0cf(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get( k - 1);
    }

    
    public static int kthElement_Problem_1_9844c27d_b901_4bc2_8d6c_21b206bd1306(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                return arr.get(i);
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_0_187cf453_0934_4658_80c6_db29d2707216(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                return arr.get(i);
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_0_d688fceb_88db_4f28_943c_3c55f40fffe5(ArrayList<Integer> arr, int k) {
        int i = arr.size();
        int value = 0;
        int pos = 0;
        while(pos < i-k+1) {
            i--;
            value = arr.get(i);
        }
        return value;
    }

    
    public static int kthElement_Problem_0_8fea0b1c_23c1_4a96_b289_81362304032d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                return arr.get(i);
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_1_250dd369_fc92_44ca_b035_1e1adf424639(ArrayList<Integer> arr, int k) {
        int result = 0;
        int sum = 0;
        int temp = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum = sum + arr.get(i);
            if(sum == k) {
                result = arr.get(i);
                break;
            }
        }
        return result;
    }

    
    public static int kthElement_Problem_0_170148a1_0027_46f6_ad53_4bed18bbdd0f(ArrayList<Integer> arr, int k) {
        if (k > arr.size()) {
            System.out.println("Invalid input. Input size must be less than or equal to the size of the array");
            return 0;
        }
        int kthElement_Problem_0_170148a1_0027_46f6_ad53_4bed18bbdd0f = 0;
        boolean isFound = False;
        for (int i = 1; i < k; i++) {
            if (isFound) {
                kthElement_Problem_0_170148a1_0027_46f6_ad53_4bed18bbdd0f = i;
                break;
            }
            int j = 0;
            while (j < arr.size() && !isFound) {
                if (arr.get(j) == i) {
                    isFound = True;
                }
                j++;
            }
        }
        return kthElement_Problem_0_170148a1_0027_46f6_ad53_4bed18bbdd0f;
    }

    
    public static int kthElement_Problem_2_dbda883c_7649_4c12_9f78_427a7c7eb6e8(ArrayList<Integer> arr, int k) {
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_8bd96037_c543_45ce_9c52_b4da9eafcd0a(ArrayList<Integer> arr, int k) {
        int i;
        for(i = 0; i < arr.size(); i++) {
            if(k > arr.size() - i) {
                k = arr.size() - i;
            }
            if(k == i) {
                return arr.get(i);
            }
        }
        return 0;
    }

    
    public static int kthElement_Problem_0_fb4e43c5_9def_40e2_b04b_c8255d69d997(ArrayList<Integer> arr, int k) {
        Collections.sort(arr);
        int index = arr.indexOf(k) + 1;
        return arr.get(index - 1);
    }

    
    public static int kthElement_Problem_2_3a64761c_7989_4400_9ef4_8b89257b47ea(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_ddd597f5_15ff_4bb8_b3f3_c9674f9e8088(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int count = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            count++;
            if(count == k) {
                return sum;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_2_4c97132f_cd0b_497c_bcc2_c89e90c2435f(ArrayList<Integer> arr, int k) {
        // Write your code here
        int kth = 0;
        int n = arr.size();
        if(k<=n){
            kth = arr.get(k-1);
        }
        return kth;
    }

    
    public static int kthElement_Problem_2_8f6155a7_5e2f_4c8c_8a04_21f7e678d956(ArrayList<Integer> arr, int k) {
        int ans = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            ans = Math.min(ans, arr.get(i));
        }
        return ans;
    }

    
    public static int kthElement_Problem_2_82490d82_e932_425a_aa61_8305d47061f0(ArrayList<Integer> arr, int k) {
        int result = 0;
        int temp = 0;
        for(int i = 1; i < arr.size(); i++) {
            temp = arr.get(i);
            if(k == temp) {
                result = i;
                break;
            }
        }
        return result;
    }

    
    public static int kthElement_Problem_0_ef50b97d_bc22_4cf9_a368_ba03fd59e36a(ArrayList<Integer> arr, int k) {
        // Your code goes here.
        return 0;
    }

    
    public static int kthElement_Problem_1_8d77793f_a35b_4faa_b554_36a5a4e49717(ArrayList<Integer> arr, int k) {
        int j = 0;
        for(int i = 0;i < arr.size();i++) {
            if(j == k) {
                return arr.get(i);
            }
            j++;
        }
        throw new IllegalArgumentException();
    }

    
    public static int kthElement_Problem_2_454b2595_2122_4d75_9350_a4e259021cfa(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_29f67b8c_cce6_449c_9e3a_27b336a003cf(ArrayList<Integer> arr, int k) {
        return arr.get(k - 1);
    }

    
    public static int kthElement_Problem_0_88f1823a_e4a9_4986_b417_12d60b1f55e3(ArrayList<Integer> arr, int k) {
        // your code goes here
        Collections.sort(arr);
        for(int i=0;i<arr.size();i++){
            if(k==arr.get(i)){
                return arr.get(i);
            }
        }
        return 0;
    }

    
    public static int kthElement_Problem_0_350150b1_3df8_46f4_998b_218cdc831f40(ArrayList<Integer> arr, int k) {
        Integer result = null;
        for(int i=arr.size()-1; i>=0 && result==null; i--) {
            if(arr.get(i)<=k) {
                result = arr.get(i);
            }
        }
        return result;
    }

    
    public static int kthElement_Problem_1_6c88d66f_fec3_432e_9bef_7373c0660cc6(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int count = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            count++;
            if(count > k) {
                max = sum;
                break;
            }
            if(sum > max) {
                max = sum;
            }
            if(sum < min) {
                min = sum;
            }
        }
        return max;
    }

    
    public static int kthElement_Problem_2_22468c5d_54ec_4f73_9b50_0a5f719c4d2c(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_bd2e7300_a1e8_4b33_9169_c4305cc75ba2(ArrayList<Integer> arr, int k) {
        int start =  k - 1;
        int result = arr.get(start);
        int size = arr.size();
        for (int i = start; i < size; i++) {
            int nextNum = arr.get(i + 1);
            if (nextNum <= result) {
                result = nextNum;
            }
        }
        return result;
    }

    
    public static int kthElement_Problem_1_ed3267e6_4a9e_4cbb_b4f6_490652cba7fe(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_0ee251d4_5df7_4c5f_b76f_7ea8011a5bb7(ArrayList<Integer> arr, int k) {
        return arr.get(k - 1);
    }

    
    public static int kthElement_Problem_1_5270d858_6bab_4330_9432_db8b5286a846(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int count = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            count++;
            if(count == k) {
                return sum;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_2_a748ad2a_6af3_4887_ba1e_dd3d363b4a3b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                return arr.get(i);
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_0_1c6e2335_041a_4bfe_bd98_32023e7ace1a(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_035ed22f_ffe9_47ef_8899_2dc083bef011(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                return arr.get(i);
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_0_af09fbf7_50b9_4de1_b363_7cfc18acc71b(ArrayList<Integer> arr, int k) {
        int result = 0;
        int sum = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                result = arr.get(i);
                break;
            }
        }
        return result;
    }

    
    public static int kthElement_Problem_0_d92da836_3df6_44a1_a204_5ee4f9da4711(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int sumOfSquares = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            sumOfSquares += arr.get(i) * arr.get(i);
        }
        int kthElement_Problem_0_d92da836_3df6_44a1_a204_5ee4f9da4711 = sum / k;
        int kthElement_Problem_0_d92da836_3df6_44a1_a204_5ee4f9da4711OfSquares = sumOfSquares / k;
        return kthElement_Problem_0_d92da836_3df6_44a1_a204_5ee4f9da4711 * kthElement_Problem_0_d92da836_3df6_44a1_a204_5ee4f9da4711OfSquares;
    }

    
    public static int kthElement_Problem_0_aa7a97e8_8d79_4ff6_8782_d0c6af497f77(ArrayList<Integer> arr, int k) {
        int i = 0, j = 0;
        while (i < arr.size()) {
            j = arr.indexOf(arr.get(i));
            if (i == j) {
                i++;
                continue;
            }
            if (i < k) {
                arr.add(arr.get(j));
                arr.remove(j);
                i++;
                j--;
                continue;
            }
            break;
        }
        if (i < k) {
            return arr.get(0);
        }
        return arr.get(arr.size() - 1);
    }

    
    public static int kthElement_Problem_2_b083aeea_ff8d_438b_b177_c2d00e6b01d2(ArrayList<Integer> arr, int k) {
        return arr.get(k - 1);
    }

    
    public static int kthElement_Problem_2_93c567b7_665e_4976_9289_c5ed96040282(ArrayList<Integer> arr, int k) {
        return arr.get(k - 1);
    }

    
    public static int kthElement_Problem_0_41ba2094_1a71_4603_85e9_0af15db8b1b6(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k - 1);
    }

    
    public static int kthElement_Problem_1_1e2596dd_72ef_47db_8a23_109ee04c76b1(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_439fc287_62df_4d79_8352_b08390871aa1(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_8d9d293d_1e47_4cc6_88dd_f0c54cf9ba86(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int count = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            count++;
            if(count == k) {
                return sum;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_0_f0edd23e_7eaa_4cc0_b89d_1a5a9a154e36(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_93c567b7_665e_4976_9289_c5ed96040282(ArrayList<Integer> arr, int k) {
        return arr.get(k - 1);
    }

    
    public static int kthElement_Problem_1_603eaada_c29b_4f27_bdd9_07638ae8e0c1(ArrayList<Integer> arr, int k) {
        int index = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            index += arr.get(i);
            if(index >= k) {
                return arr.get(i + 1);
            }
        }
        return arr.get(arr.size() - 1);
    }

    
    public static int kthElement_Problem_0_d8b81607_5721_4097_a58b_e843f0fefeb3(ArrayList<Integer> arr, int k) {
        int i = 0;
        int j = arr.size() - 1;
        while(j > i) {
            int mid = (j + i) / 2;
            if(arr.get(mid) == k) {
                return arr.get(mid);
            } else if(arr.get(mid) < k) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_2_d6d61f09_8dc9_4086_b8a5_a0374f567c20(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_8cfaa867_076f_4b34_a5f2_4623ad9c6d78(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == max) {
                sum += arr.get(i);
            }
        }
        return sum / k;
    }

    
    public static int kthElement_Problem_1_e317074e_9933_4046_9e37_8687c9942a30(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_9bcd032c_4da8_416b_9f12_96344df3c6ab(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        //System.out.println(arr);
        //System.out.println(k);
        Collections.sort(arr);
        //System.out.println(arr);
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_bd22913e_3e5d_485c_b87a_8a7320cc8269(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_cb4748ca_0b62_42c5_88c3_ba8ffaf7c7c0(ArrayList<Integer> arr, int k) {
        int sum=0;
        for(int i=1; i<arr.size(); i++) {
            sum+=arr.get(i);
            if(i==k) {
                return sum;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_0_bd2e7300_a1e8_4b33_9169_c4305cc75ba2(ArrayList<Integer> arr, int k) {
        int start =  k - 1;
        int result = arr.get(start);
        int size = arr.size();
        for (int i = start; i < size; i++) {
            int nextNum = arr.get(i + 1);
            if (nextNum <= result) {
                result = nextNum;
            }
        }
        return result;
    }

    
    public static int kthElement_Problem_1_4917a58a_1b3a_4cbd_a9eb_2f45a0c85ec6(ArrayList<Integer> arr, int k) {
        // Write your code here
        Collections.sort(arr);
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_d4d442b4_2018_4e9d_bc91_20253efe08c0(ArrayList<Integer> arr, int k) {
        Collections.sort(arr);
        int start = arr.indexOf(k-1);
        return arr.get(start);
    }

    
    public static int kthElement_Problem_0_5dc61740_bff6_4802_b020_132b40d9fe99(ArrayList<Integer> arr, int k) {
        int n = 0;
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int current = arr.get(i);
            if (current > max) {
                max = current;
            }
            if (n - k - 1 >= 0)
                n = n - k - 1;
            else
                n = arr.size();
        }
        return max;
    }

    
    public static int kthElement_Problem_2_8f3bb2d4_9a9b_42b6_957f_3222e87b091f(ArrayList<Integer> arr, int k) {
        if (k > arr.size()) {
            throw new ArrayIndexOutOfBoundsException();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int index = 0;
        int minIndex = -1;

        boolean found = False;

        while (index < arr.size()) {
            int currentMin = min;
            int currentMax = max;
            int currentIndex = index;
            int currentMinIndex = minIndex;

            if (index == k) {
                found = True;
            }

            if (found) {
                min = currentMin;
                max = currentMax;
                index = currentIndex;
                minIndex = currentMinIndex;
            }

            min = Math.min(min + 1, currentMin);
            max = Math.max(max, currentMax);
            index = index - 1;
        }

        return minIndex;
    }

    
    public static int kthElement_Problem_2_de07737b_0335_49b0_9894_4e067218e6a8(ArrayList<Integer> arr, int k) {
        int ans = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            ans = Math.min(ans, arr.get(i));
        }
        return ans;
    }

    
    public static int kthElement_Problem_1_b609e278_fc47_4f62_ab8c_533e88031ef9(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_2422e4a7_a0d7_4808_84df_6eb81723d5fa(ArrayList<Integer> arr, int k) {
        int element = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == k - 1) {
                element = arr.get(i);
                break;
            }
        }
        return element;
    }

    
    public static int kthElement_Problem_2_f75e9d0d_dcc2_4e54_a6b0_c3a83c230ae9(ArrayList<Integer> arr, int k) {
        int result = 0;
        int i = 0;
        for(Integer num : arr) {
            if(i == k - 1) {
                result = num;
                break;
            }
            i++;
        }
        return result;
    }

    
    public static int kthElement_Problem_1_9bcd032c_4da8_416b_9f12_96344df3c6ab(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        //System.out.println(arr);
        //System.out.println(k);
        Collections.sort(arr);
        //System.out.println(arr);
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_3189cf8a_4ac6_49e9_bb81_5c6eb26e9353(ArrayList<Integer> arr, int k) {
        int p = arr.get(0);
        int count = 1;
        for(int i = 0; i < arr.size(); i++) {
            p = arr.get(i);
            if(count == k)
                return p;
            count++;
        }
        return p;
    }

    
    public static int kthElement_Problem_0_f625c51f_f6f8_4a35_8013_dbeea49a2826(ArrayList<Integer> arr, int k) {
        int ret = -1;
        int i = 0;
        for(int element : arr) {
            if(i == k - 1) {
                ret = element;
            }
            i++;
        }
        return ret;
    }

    
    public static int kthElement_Problem_2_d26609e3_9961_4286_9a94_abc955594502(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int maxIndex = -1;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > maxSum) {
                maxSum = sum;
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    
    public static int kthElement_Problem_0_74853280_2c8e_4809_b629_2a5850701c9b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                return arr.get(i);
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_1_2fa9af95_fd35_4672_8185_abc620252498(ArrayList<Integer> arr, int k) {
        int result = -1;
        int temp;
        for(int i = 1; i < arr.size(); i++) {
            temp = arr.get(i);
            if(k == temp) {
                result = i;
                break;
            }
        }
        return result;
    }

    
    public static int kthElement_Problem_2_09c95153_827d_4c0d_abf3_d7b2df0a9df2(ArrayList<Integer> arr, int k) {
        int left = 0;
        int right = arr.size() - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(k == arr.get(mid)) {
                return arr.get(mid);
            } else if(arr.get(mid) < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_1_187cf453_0934_4658_80c6_db29d2707216(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                return arr.get(i);
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_2_21388836_6b4e_4ea7_b32d_d5dc417c47fb(ArrayList<Integer> arr, int k) {
        int maxVal = Integer.MIN_VALUE;
        int curVal = arr.get(0);
        for(int i=1; i < arr.size(); i++) {
            if((curVal + arr.get(i)) <= k) {
                maxVal = arr.get(i);
            }
            curVal += arr.get(i);
        }
        return maxVal;
    }

    
    public static int kthElement_Problem_1_5bf1cf9d_8f08_416a_a624_77a7b3998363(ArrayList<Integer> arr, int k) {
        int start = 0, end = arr.size() - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (arr.get(mid) < k) {
                start = mid + 1;
            } else if (arr.get(mid) > k) {
                end = mid - 1;
            } else {
                break;
            }
            mid = (start + end) / 2;
        }
        return arr.get(mid);
    }

    
    public static int kthElement_Problem_1_90c5416d_0e2b_45cc_886f_9a0c91e2ca6a(ArrayList<Integer> arr, int k) {
        // Write your code here
        int kthElement_Problem_1_90c5416d_0e2b_45cc_886f_9a0c91e2ca6a = arr.get(k - 1);
        return kthElement_Problem_1_90c5416d_0e2b_45cc_886f_9a0c91e2ca6a;
    }

    
    public static int kthElement_Problem_1_633598a0_762a_4907_a0cb_8f364fb986ea(ArrayList<Integer> arr, int k) {
        int result = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == k) {
                result = arr.get(i);
                break;
            }
        }
        return result;
    }

    
    public static int kthElement_Problem_1_399e65b7_5a48_466a_ba6c_b5959751ef9a(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_633bbed3_3c41_4e54_9191_04f994760d1f(ArrayList<Integer> arr, int k) {
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_af09fbf7_50b9_4de1_b363_7cfc18acc71b(ArrayList<Integer> arr, int k) {
        int result = 0;
        int sum = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                result = arr.get(i);
                break;
            }
        }
        return result;
    }

    
    public static int kthElement_Problem_0_b443450f_a639_4449_a456_8532e6e1b22b(ArrayList<Integer> arr, int k) {
        int kth = 0;
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return kth;
    }

    
    public static int kthElement_Problem_0_1256fa09_7c0d_4f9f_8420_653d0ba2e737(ArrayList<Integer> arr, int k) {
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_6d8a4993_d4f7_415e_aba0_c0ccad5d4619(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_65f3a809_592e_4fe8_a7eb_829eefbf857f(ArrayList<Integer> arr, int k) {
        int low = 1, high = arr.size(), mid;
        int firstElem = arr.get(0);

        while (low < high) {
            mid = (low + high) / 2;
            if (mid == k) {
                return firstElem;
            }
            if (k < firstElem + mid) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return firstElem;
    }

    
    public static int kthElement_Problem_2_cecf0141_159e_4c5a_9c9a_7d6dc9a5c52b(ArrayList<Integer> arr, int k) {
        int res = 0;
        int count = 0;
        for (int i = 0; i < k; i++) {
            count = count + 1;
            if (i == k - 1)
                res = arr.get(i);
            else
                res = res + arr.get(i);
        }
        return res;
    }

    
    public static int kthElement_Problem_0_b083aeea_ff8d_438b_b177_c2d00e6b01d2(ArrayList<Integer> arr, int k) {
        return arr.get(k - 1);
    }

    
    public static int kthElement_Problem_0_ee0692f7_7f59_42ef_aa0c_7633a678cd39(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_43d47d6d_f584_4c4b_ae77_afd447835d66(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_633bbed3_3c41_4e54_9191_04f994760d1f(ArrayList<Integer> arr, int k) {
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_762164ae_3f43_47f8_b48b_b12f4cd83c72(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_439fc287_62df_4d79_8352_b08390871aa1(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_7676fce1_a495_4e50_9ad0_c4ec53a6fa5c(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int kthElement_Problem_2_7676fce1_a495_4e50_9ad0_c4ec53a6fa5c = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == k) {
                kthElement_Problem_2_7676fce1_a495_4e50_9ad0_c4ec53a6fa5c = arr.get(i);
                break;
            }
        }
        return kthElement_Problem_2_7676fce1_a495_4e50_9ad0_c4ec53a6fa5c;
    }

    
    public static int kthElement_Problem_2_ea95b142_5f02_4594_8d26_736f8cede356(ArrayList<Integer> arr, int k) {
        int lastElement = -1;
        int firstElement = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) > lastElement) {
                lastElement = arr.get(i);
                firstElement = arr.get(i - 1);
            }
        }
        return firstElement;
    }

    
    public static int kthElement_Problem_1_8f6155a7_5e2f_4c8c_8a04_21f7e678d956(ArrayList<Integer> arr, int k) {
        int ans = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            ans = Math.min(ans, arr.get(i));
        }
        return ans;
    }

    
    public static int kthElement_Problem_0_6cc42d17_cdde_4a66_b12a_97566e7f14d7(ArrayList<Integer> arr, int k) {
        Integer result = 0L;
        if (arr.isEmpty()) {
            return result;
        }
        int i = 0;
        int n = arr.size()-1;
        while(i<n && arr.get(i)<k) {
            i++;
        }
        if (i<n && arr.get(i) == k) {
            result = arr.get(i);
        } else {
            int j = i-1;
            while(j>=0 && arr.get(j)>k) {
                j--;
            }
            result = arr.get(j+1);
        }
        return result;
    }

    
    public static int kthElement_Problem_2_55dce406_c60b_4611_ab58_32ea5e34930a(ArrayList<Integer> arr, int k) {
        int total = 0;
        for (int i = 0; i < arr.size(); i++) {
            total += arr.get(i);
            if (total >= k) {
                return arr.get(i);
            }
        }
        return arr.get(arr.size() - 1);
    }

    
    public static int kthElement_Problem_1_fb4e43c5_9def_40e2_b04b_c8255d69d997(ArrayList<Integer> arr, int k) {
        Collections.sort(arr);
        int index = arr.indexOf(k) + 1;
        return arr.get(index - 1);
    }

    
    public static int kthElement_Problem_1_491fce79_2d25_4c9b_b5f8_5d48fca88471(ArrayList<Integer> arr, int k) {
        int ans = 0;
        int temp = 0;
        for(int i = 1 ; i < arr.size() ; i++)
        {
            if(arr.get(i-1) > k)
            {
                ans = temp;
                break;
            }
            ans = arr.get(i-1);
        }
        return ans;
    }

    
    public static int kthElement_Problem_0_15cfbd15_c0c2_4d45_8a23_52717bf6bbbe(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_b443450f_a639_4449_a456_8532e6e1b22b(ArrayList<Integer> arr, int k) {
        int kth = 0;
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return kth;
    }

    
    public static int kthElement_Problem_2_4beb9189_ec5b_4e74_9954_a0d87c384d08(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_7d288170_c01e_44a7_90a3_e95b9019b7b3(ArrayList<Integer> arr, int k) {
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_55dce406_c60b_4611_ab58_32ea5e34930a(ArrayList<Integer> arr, int k) {
        int total = 0;
        for (int i = 0; i < arr.size(); i++) {
            total += arr.get(i);
            if (total >= k) {
                return arr.get(i);
            }
        }
        return arr.get(arr.size() - 1);
    }

    
    public static int kthElement_Problem_2_aa7a97e8_8d79_4ff6_8782_d0c6af497f77(ArrayList<Integer> arr, int k) {
        int i = 0, j = 0;
        while (i < arr.size()) {
            j = arr.indexOf(arr.get(i));
            if (i == j) {
                i++;
                continue;
            }
            if (i < k) {
                arr.add(arr.get(j));
                arr.remove(j);
                i++;
                j--;
                continue;
            }
            break;
        }
        if (i < k) {
            return arr.get(0);
        }
        return arr.get(arr.size() - 1);
    }

    
    public static int kthElement_Problem_1_de07737b_0335_49b0_9894_4e067218e6a8(ArrayList<Integer> arr, int k) {
        int ans = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            ans = Math.min(ans, arr.get(i));
        }
        return ans;
    }

    
    public static int kthElement_Problem_1_a07ad8ca_ec79_4786_9df2_11d4170d3093(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_7312bb16_90ef_4677_b734_f5e38571483a(ArrayList<Integer> arr, int k) {
        // write your code
        return 0;
    }

    
    public static int kthElement_Problem_2_40fd7961_27f2_4dff_8cd9_82d8126c0e11(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_f4c474ff_3019_445a_a356_c1fee8054deb(ArrayList<Integer> arr, int k) {
        int ans = 1L;
        int l = arr.size() - 1;
        int m = l - k;
        int temp = 0;
        for(int i = 0; i < k; i++) {
            temp += arr.get(i);
        }
        temp = temp / k;
        ans = temp * (k + 1);
        return ans;
    }

    
    public static int kthElement_Problem_2_59035969_821c_4b7f_92e1_6e0cffcdc856(ArrayList<Integer> arr, int k) {
        return arr.stream().skip(k).findFirst().orElseThrow();
    }

    
    public static int kthElement_Problem_2_6cc42d17_cdde_4a66_b12a_97566e7f14d7(ArrayList<Integer> arr, int k) {
        Integer result = 0L;
        if (arr.isEmpty()) {
            return result;
        }
        int i = 0;
        int n = arr.size()-1;
        while(i<n && arr.get(i)<k) {
            i++;
        }
        if (i<n && arr.get(i) == k) {
            result = arr.get(i);
        } else {
            int j = i-1;
            while(j>=0 && arr.get(j)>k) {
                j--;
            }
            result = arr.get(j+1);
        }
        return result;
    }

    
    public static int kthElement_Problem_2_6be018ec_9d7b_4d7f_b443_be694bcdb177(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int sumOfSquares = 0;
        int kthElement_Problem_2_6be018ec_9d7b_4d7f_b443_be694bcdb177 = -1;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            sumOfSquares += arr.get(i) * arr.get(i);
            if(sum == k) {
                kthElement_Problem_2_6be018ec_9d7b_4d7f_b443_be694bcdb177 = i;
                break;
            }
        }
        return kthElement_Problem_2_6be018ec_9d7b_4d7f_b443_be694bcdb177;
    }

    
    public static int kthElement_Problem_2_d1f080c3_056c_48ae_8609_45f301b114ce(ArrayList<Integer> arr, int k) {
        int count = 0;
        int result = -1;
        while(count<k) {
            count+=1;
            if(count==arr.size()) {
                return result;
            }
            result = arr.get(count-1);
        }
        return result;
    }

    
    public static int kthElement_Problem_1_5dc61740_bff6_4802_b020_132b40d9fe99(ArrayList<Integer> arr, int k) {
        int n = 0;
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int current = arr.get(i);
            if (current > max) {
                max = current;
            }
            if (n - k - 1 >= 0)
                n = n - k - 1;
            else
                n = arr.size();
        }
        return max;
    }

    
    public static int kthElement_Problem_0_e5376d05_b6f1_4343_a6f6_1e6e85ed1a66(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_596c0ac1_5174_4b3d_a732_31dadc46f569(ArrayList<Integer> arr, int k) {
        if (arr.size() == 0 || k < 1 || k >= arr.size()) {
            throw new IllegalArgumentException("The length of given array list should be greater than 0 and less than or equal to n");
        }

        int mid = arr.size() / 2;
        Integer arrMidVal = arr.get(mid);

        if (k < mid && k > arrMidVal) {
            int midVal = kthElement_Problem_0_596c0ac1_5174_4b3d_a732_31dadc46f569(arr, k - mid);
            int kthVal = arrMidVal;
            if (k == mid) {
                return kthVal;
            } else {
                return kthVal + kthElement_Problem_0_596c0ac1_5174_4b3d_a732_31dadc46f569(arr, k - 1);
            }
        } else if (k == mid) {
            return arrMidVal;
        } else {
            return kthElement_Problem_0_596c0ac1_5174_4b3d_a732_31dadc46f569(arr, k - 1);
        }
    }

    
    public static int kthElement_Problem_2_a8a0adfd_bb6a_44e5_9c9f_168314b6e280(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int max = arr.get(0);
        int min = arr.get(0);
        int mid = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > k) {
                max = arr.get(i);
            }
            else if(sum < k) {
                min = arr.get(i);
            }
            else if(sum == k) {
                mid = arr.get(i);
            }
        }
        return mid;
    }

    
    public static int kthElement_Problem_0_0ca15620_c2c1_4be0_98ca_285fff1e4965(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k - 1);
    }

    
    public static int kthElement_Problem_2_be2adfdb_646a_4be0_8286_7804d75a89a7(ArrayList<Integer> arr, int k) {
        // your code goes here
        int pivot = arr.get(arr.size()/2);
        int start = 0, end = arr.size()-1;
        while(arr.get(start) < pivot && start < end) start++;
        while(arr.get(end) > pivot && start < end) end--;
        if(arr.get(start) < pivot && arr.get(end) > pivot) {
            if(k < arr.get(start)) return kthElement_Problem_2_be2adfdb_646a_4be0_8286_7804d75a89a7(arr,k);
            else if(k > arr.get(start)) return kthElement_Problem_2_be2adfdb_646a_4be0_8286_7804d75a89a7(arr,k-arr.get(start)-1);
            else return arr.get(start);
        }
        else if(arr.get(start) < pivot && k < arr.get(start)) return kthElement_Problem_2_be2adfdb_646a_4be0_8286_7804d75a89a7(arr,k);
        else if(arr.get(end) > pivot && k > arr.get(end)) return kthElement_Problem_2_be2adfdb_646a_4be0_8286_7804d75a89a7(arr,k-arr.get(end)-1);
        else return arr.get(end);
    }

    
    public static int kthElement_Problem_1_6d4267b6_489a_4751_a417_a2179ac6ef4c(ArrayList<Integer> arr, int k) {
        int result=0;
        for(int i=0;i<k;i++)
        {
            result=result + arr.get(i);
        }
        return result;
    }

    
    public static int kthElement_Problem_2_d126c6ac_0ebe_4dbf_acc7_8925450cfbed(ArrayList<Integer> arr, int k) {
        // Declare and initialise variables
        int size = arr.size();
        int count = 0;
        int kthElement_Problem_2_d126c6ac_0ebe_4dbf_acc7_8925450cfbed = 0;
        int firstElement = arr.get(0);
        int lastElement = arr.get(size);
        int midElement = firstElement;

        // Perform binary search for desired value
        while (count < size - 1) {
            midElement = (firstElement + lastElement) / 2;
            if (midElement > lastElement) lastElement = midElement;
            else if (midElement < firstElement) firstElement = midElement;
            else { // Found element
                kthElement_Problem_2_d126c6ac_0ebe_4dbf_acc7_8925450cfbed = midElement;
                count++;
            }
        }

        // Return kth element
        return kthElement_Problem_2_d126c6ac_0ebe_4dbf_acc7_8925450cfbed;
    }

    
    public static int kthElement_Problem_2_e317074e_9933_4046_9e37_8687c9942a30(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_4917a58a_1b3a_4cbd_a9eb_2f45a0c85ec6(ArrayList<Integer> arr, int k) {
        // Write your code here
        Collections.sort(arr);
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_55dce406_c60b_4611_ab58_32ea5e34930a(ArrayList<Integer> arr, int k) {
        int total = 0;
        for (int i = 0; i < arr.size(); i++) {
            total += arr.get(i);
            if (total >= k) {
                return arr.get(i);
            }
        }
        return arr.get(arr.size() - 1);
    }

    
    public static int kthElement_Problem_1_ec77bf85_9dda_43b3_9735_f04b061a8fea(ArrayList<Integer> arr, int k) {
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_1256fa09_7c0d_4f9f_8420_653d0ba2e737(ArrayList<Integer> arr, int k) {
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_5702b26e_1ae7_4e0b_91c6_bfe7d29ac019(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_3b721bb6_552f_40c4_8943_421413977f2a(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_4a860a57_4c23_4faf_bf30_c20a963fe4a1(ArrayList<Integer> arr, int k) {
        ArrayList<Integer> arr2 = (ArrayList<Integer>) arr.clone();
        Collections.sort(arr2);
        arr2.remove(arr2.size() - 1);
        int n = arr.size();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr2.get(i) == k) {
                count++;
            }
        }
        return count;
    }

    
    public static int kthElement_Problem_0_65e26412_8949_4079_b5a4_a69a93fcf7b8(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_d6f9f5e6_49df_49f7_8e3a_97a03fe9625a(ArrayList<Integer> arr, int k) {
        int count = 0;
        for(int x : arr) {
            if(++count == k) return x;
        }
        return 0;
    }

    
    public static int kthElement_Problem_1_122b4778_d00e_4aa7_95f5_a63687af9978(ArrayList<Integer> arr, int k) {
        // Your code here
        int i = 0;
        int low = 1;
        int high = arr.size() - 1;
        while(low < high) {
            i = ((low + high) / 2);
            if(arr.get(i) > k) {
                high = i;
            } else if(arr.get(i) < k) {
                low = i + 1;
            } else {
                return arr.get(i);
            }
        }
        return arr.get(i);
    }

    
    public static int kthElement_Problem_0_ccdfff94_1105_4340_80a1_cac5dd75fc5b(ArrayList<Integer> arr, int k) {
        int result = 0;
        int n = arr.size();
        int curr = arr.get(0);

        // Using while loop to find the value by binary search
        while (curr > 0 && (curr - k) >= (n - 1)) {
            int mid = (curr + n - 1) / 2;
            if (k > mid) {
                k = mid - 1;
            } else {
                curr = mid + 1;
            }
        }

        result = curr;
        return result;
    }

    
    public static int kthElement_Problem_1_be279dfa_4f3c_46f9_bc19_df9147915f29(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_18c9c29d_2bc0_4ebc_be6e_3da0c9ed0d5f(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_2422e4a7_a0d7_4808_84df_6eb81723d5fa(ArrayList<Integer> arr, int k) {
        int element = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == k - 1) {
                element = arr.get(i);
                break;
            }
        }
        return element;
    }

    
    public static int kthElement_Problem_2_eb91f602_2a20_444f_9605_3600c7f1c614(ArrayList<Integer> arr, int k) {
        if (k > arr.size())
            return -1;
        int len = arr.size();
        if (k == 0 || k > len) {
            return -1;
        }
        int curr = -1;
        int prev = arr.get(0);
        int ans = 0;
        int m = len / 2;
        for (int i = 0; i < m; i++) {
            if (k > 1) {
                k--;
            }
            int next = arr.get(i);
            int diff = (next - prev);
            if (diff < 0 || diff > curr) {
                ans = next;
                curr = diff;
            }
            prev = next;
        }
        return ans;
    }

    
    public static int kthElement_Problem_1_5620cee2_4cc8_450d_bb64_eef81a74134f(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int kthElement_Problem_1_5620cee2_4cc8_450d_bb64_eef81a74134f = 0;
        if (arr.size() < k) {
            return -1;
        }
        Collections.sort(arr);
        kthElement_Problem_1_5620cee2_4cc8_450d_bb64_eef81a74134f = arr.get(k-1);
        return kthElement_Problem_1_5620cee2_4cc8_450d_bb64_eef81a74134f;
    }

    
    public static int kthElement_Problem_2_e5b4edf1_5c97_4361_abc3_c919f1f6b95c(ArrayList<Integer> arr, int k) {
        int index = 0;
        int element = 0;
        for(int i = 0; i < arr.size(); i++) {
            index = i + 1;
            element = arr.get(i);
            if (index == k) {
                return element;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_1_c5b19ece_18c7_4465_ace9_b3c75d2bd104(ArrayList<Integer> arr, int k) {
        if(arr.size()<k) {
            return -1;
        }
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_6d8a4993_d4f7_415e_aba0_c0ccad5d4619(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_5e1f6917_33f1_47df_ad3a_c652e00659a5(ArrayList<Integer> arr, int k) {
        return arr.get(k - 1);
    }

    
    public static int kthElement_Problem_0_80dd77a3_df85_4559_b0b3_9fe3f502662b(ArrayList<Integer> arr, int k) {
        int result = -1;
        int sum = 0;
        int temp = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                result = arr.get(i);
                break;
            }
        }
        return result;
    }

    
    public static int kthElement_Problem_0_9844c27d_b901_4bc2_8d6c_21b206bd1306(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                return arr.get(i);
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_0_ccb9ac76_68af_4a5e_b5b4_351d56db6c0d(ArrayList<Integer> arr, int k) {
        
        int ans = Integer.MAX_VALUE;
        
        int i = 0;
        int j = 0;
        
        for(i = 0; i < arr.size(); i++) {
            int current = arr.get(i);
            
            if(j == k) {
                ans = current;
                break;
            }
            
            if(current > ans) {
                ans = current;
            }
            
            j = j + 1;
        }
        
        return ans;
    }

    
    public static int kthElement_Problem_1_035ed22f_ffe9_47ef_8899_2dc083bef011(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                return arr.get(i);
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_2_a9839a1b_5688_468b_83e7_a651b56932f3(ArrayList<Integer> arr, int k) {
        int result = 0;
        int i = 0;
        for(Integer e : arr) {
            if(i == k - 1) {
                result = e;
                break;
            }
            i++;
        }
        return result;
    }

    
    public static int kthElement_Problem_2_4b5ea57b_de8f_44ca_8c08_66d142ff6dc1(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_bd22913e_3e5d_485c_b87a_8a7320cc8269(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_e5b4edf1_5c97_4361_abc3_c919f1f6b95c(ArrayList<Integer> arr, int k) {
        int index = 0;
        int element = 0;
        for(int i = 0; i < arr.size(); i++) {
            index = i + 1;
            element = arr.get(i);
            if (index == k) {
                return element;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_1_f1e60fc7_052c_419a_b148_2eef48050c1a(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_9b374ab8_6db0_4fd5_8c8e_afb22dd20cbe(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int max = arr.get(0);
        int min = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > k) {
                max = arr.get(i);
            } else if (sum < k) {
                min = arr.get(i);
            }
        }
        return max;
    }

    
    public static int kthElement_Problem_1_3ed80a23_f2f6_41bf_92ef_27dc5b715e77(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int maxIndex = -1;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > maxSum) {
                maxSum = sum;
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    
    public static int kthElement_Problem_1_7312bb16_90ef_4677_b734_f5e38571483a(ArrayList<Integer> arr, int k) {
        // write your code
        return 0;
    }

    
    public static int kthElement_Problem_1_5e1f6917_33f1_47df_ad3a_c652e00659a5(ArrayList<Integer> arr, int k) {
        return arr.get(k - 1);
    }

    
    public static int kthElement_Problem_2_3cd983d7_84a0_46e7_8209_43187c547b6c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        // Write your logic here.
        return sum;
    }

    
    public static int kthElement_Problem_2_4bd5d7e2_8401_40f8_b00a_06b4609694d6(ArrayList<Integer> arr, int k) {
        int count = 0;
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.equals(i)) {
                count++;
            }
        }
        if (count <= k) {
            int max = arr.stream().reduce((a, b) -> Math.max(a, b)).orElse(Integer.MIN_VALUE);
            int min = arr.stream().reduce((a, b) -> Math.min(a, b)).orElse(Integer.MAX_VALUE);
            res = max - min + k;
        }
        return res;
    }

    
    public static int kthElement_Problem_1_34a2020e_9525_480b_b5e0_136ba1ca5107(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_1675accb_4ffd_4fa2_8205_83f88808bd30(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 1; i < k; i++){
            sum += arr.get(i - 1);
        }
        return sum;
    }

    
    public static int kthElement_Problem_0_3d84d88a_898d_4021_82b0_7f3a413559c1(ArrayList<Integer> arr, int k) {
        return arr.stream()
            .skip(k)
            .findFirst()
            .get();
    }

    
    public static int kthElement_Problem_2_18c9c29d_2bc0_4ebc_be6e_3da0c9ed0d5f(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_7312bb16_90ef_4677_b734_f5e38571483a(ArrayList<Integer> arr, int k) {
        // write your code
        return 0;
    }

    
    public static int kthElement_Problem_0_2cf2c2a2_6831_427f_a446_e949affb7ec7(ArrayList<Integer> arr, int k) {
        int nthElement = 0;
        boolean found = False;
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) == k) {
                found = True;
                nthElement = i;
                break;
            }
        }
        if(!found) {
            throw new IllegalArgumentException("Invalid k!");
        }
        return nthElement;
    }

    
    public static int kthElement_Problem_0_20fa6204_1d35_4c53_852f_230aceb0779f(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int temp = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
        return arr.get(k - 1);
    }

    
    public static int kthElement_Problem_0_711cea72_943e_402c_b325_a03bc440f817(ArrayList<Integer> arr, int k) {
        int count = 0;
        if (k > arr.size()) {
            return -1;
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == k) {
                return arr.get(i);
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_0_691042fc_38e1_4440_8ce5_6b5965d7f725(ArrayList<Integer> arr, int k) {
        // Your code here
        if(arr.isEmpty()){
            return -1;
        }
        int highest = arr.get(0);
        int count = 1;
        int sum = 0;
        int current = highest + 1;
        for(int i = 1 ; i < arr.size() ; i++){
            sum+=arr.get(i);
            if((sum - current)%k == 0){
                count++;
                current = sum;
            }
        }
        return count;
    }

    
    public static int kthElement_Problem_0_ed3267e6_4a9e_4cbb_b4f6_490652cba7fe(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_8fea0b1c_23c1_4a96_b289_81362304032d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                return arr.get(i);
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_0_d2737065_ae9e_4fce_83b5_a6b1ebcfe30a(ArrayList<Integer> arr, int k) {
        int index = (k - 1);
        return arr.get(index);
    }

    
    public static int kthElement_Problem_1_74853280_2c8e_4809_b629_2a5850701c9b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                return arr.get(i);
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_2_c37cbdcb_d715_4c8f_8a64_2fac3a5556b5(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_be279dfa_4f3c_46f9_bc19_df9147915f29(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_8b787411_fe4f_4857_9128_310cf30c0827(ArrayList<Integer> arr, int k) {
        if (arr == null || arr.isEmpty() || k < 1) return -1;
        int i = 1;
        for (int element : arr) {
            if (i == k) return element;
            i++;
        }
        return -1;
    }

    
    public static int kthElement_Problem_0_250dd369_fc92_44ca_b035_1e1adf424639(ArrayList<Integer> arr, int k) {
        int result = 0;
        int sum = 0;
        int temp = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum = sum + arr.get(i);
            if(sum == k) {
                result = arr.get(i);
                break;
            }
        }
        return result;
    }

    
    public static int kthElement_Problem_1_0a24a9df_438b_4ce1_9e86_30cf3e8aaacf(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int low = 0;
        int high = arr.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr.get( mid) == k) {
                return arr.get( mid);
            } else if (arr.get( mid) > k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_2_e7c31105_fbae_420f_8df2_1a8aeceb4fca(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_bc642dbe_6b59_4b55_af5f_90a9abc9dc60(ArrayList<Integer> arr, int k) {
        int start = arr.get(0);
        int end = arr.get(arr.size() - 1);
        int mid = (start + end) / 2;
        int count = 0;
        int curr = 0;

        System.out.println("Start: " + start);
        System.out.println("End: " + end);
        System.out.println("Mid: " + mid);
        while (count < k) {
            if (curr == mid) {
                count++;
                curr = 0;
            }
            curr++;
        }
        return curr == k ? arr.size() : kthElement_Problem_0_bc642dbe_6b59_4b55_af5f_90a9abc9dc60(arr, k - 1);
    }

    
    public static int kthElement_Problem_0_4ccf4303_801b_4aa9_9240_1e8dd7ae0f53(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int kthElement_Problem_0_4ccf4303_801b_4aa9_9240_1e8dd7ae0f53 = 0;
        int size = arr.size();
        if(k > size) {
            return -1;
        }
        Collections.sort(arr);
        kthElement_Problem_0_4ccf4303_801b_4aa9_9240_1e8dd7ae0f53 = arr.get(k-1);
        return kthElement_Problem_0_4ccf4303_801b_4aa9_9240_1e8dd7ae0f53;
    }

    
    public static int kthElement_Problem_1_97ba9a00_c20d_47d9_bb32_1d08f977f581(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_ffef77ca_04d6_487a_bef9_dad2958d464f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int count = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                count++;
            }
        }
        return count;
    }

    
    public static int kthElement_Problem_0_465fa6fd_1e3c_4780_b803_c92f31f4e16c(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_e3daa430_a315_4570_b9af_6b3f637b18a4(ArrayList<Integer> arr, int k) {
        // Your Code Here
        return 0;
    }

    
    public static int kthElement_Problem_1_901a3da0_4e0f_4c65_a2dc_14d033ef93f9(ArrayList<Integer> arr, int k) {
        int result = 0;
        if(arr.size()==0 || k<=0) return result;
        int index = arr.size()-1;
        while(index>=0 && arr.get(index) != k) index--;
        return arr.get(index);
    }

    
    public static int kthElement_Problem_1_f0edd23e_7eaa_4cc0_b89d_1a5a9a154e36(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_f57616f5_f846_49b8_8f7e_b2877fe98cd7(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_8b787411_fe4f_4857_9128_310cf30c0827(ArrayList<Integer> arr, int k) {
        if (arr == null || arr.isEmpty() || k < 1) return -1;
        int i = 1;
        for (int element : arr) {
            if (i == k) return element;
            i++;
        }
        return -1;
    }

    
    public static int kthElement_Problem_1_0c9819af_00f9_4adb_93ff_b8743e3f667c(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_810ef9b8_f7b9_4b39_811e_89af943af3fe(ArrayList<Integer> arr, int k) {
        int result = 0;
        int count = 0;
        for (Integer i : arr) {
            if (count == k - 1) {
                result = i;
                break;
            }
            count++;
        }
        return result;
    }

    
    public static int kthElement_Problem_2_c31a7321_2636_4076_b7e5_68c314ebf8d6(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i != k; ++i) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int kthElement_Problem_0_ea95b142_5f02_4594_8d26_736f8cede356(ArrayList<Integer> arr, int k) {
        int lastElement = -1;
        int firstElement = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) > lastElement) {
                lastElement = arr.get(i);
                firstElement = arr.get(i - 1);
            }
        }
        return firstElement;
    }

    
    public static int kthElement_Problem_1_350150b1_3df8_46f4_998b_218cdc831f40(ArrayList<Integer> arr, int k) {
        Integer result = null;
        for(int i=arr.size()-1; i>=0 && result==null; i--) {
            if(arr.get(i)<=k) {
                result = arr.get(i);
            }
        }
        return result;
    }

    
    public static int kthElement_Problem_1_2e30fa7f_3fbc_4e19_91ae_9528e172ab84(ArrayList<Integer> arr, int k) {
        int nth = 0;
        if (arr.isEmpty() || k > arr.size() || k <= 0) return -1;
        int last = arr.get(arr.size() - 1);
        for (int i = 0; i <= arr.size() - k; i++) {
            if (arr.get(i) > last) {
                if (i == arr.size() - k) nth = -1;
                else nth = arr.get(i);
                break;
            }
        }
        return nth;
    }

    
    public static int kthElement_Problem_0_322f4598_bbd8_4144_ace1_186b31238e14(ArrayList<Integer> arr, int k) {
        // your code goes here
        int i = 0;
        int j = arr.size() - 1;
        int x = 0;
        int y = 0;
        while (i <= j) {
            x = arr.get(i);
            y = arr.get(j);
            if (x > y) {
                i++;
            } else if (x < y) {
                j--;
            } else {
                if (k == 1) {
                    return arr.get(i);
                }
                k--;
                i++;
                j--;
            }
        }
        return x;
    }

    
    public static int kthElement_Problem_1_5dd1bd31_2087_44af_a262_5932bcf5ce25(ArrayList<Integer> arr, int k) {
        // your code goes here
        int l = arr.size();
        int ans = 0;
        int i = 1;
        while (i <= l && arr.get(i - 1) < k) {
            i++;
        }
        if (i <= l && arr.get(i - 1) == k) {
            ans = arr.get(i - 1);
        }
        return ans;
    }

    
    public static int kthElement_Problem_1_8cb74768_ace6_4424_a7db_1f83c890f670(ArrayList<Integer> arr, int k) {
        Integer[] a = new Integer[arr.size()];
        for (int i = 0; i < a.length; i++) {
            a[i] = arr.get(i);
        }
        int mid = arr.size() / 2;
        if (arr.size() % 2 != 0) {
            mid++;
        }
        Arrays.sort(a);
        for (int i = 0; i < mid; i++) {
            int tmp = a[i];
            for (int j = i + 1; j < mid; j++) {
                if (tmp < a[j]) {
                    tmp = j;
                }
            }
            if (i == k) {
                return tmp;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_2_e79d72c1_a168_4b48_b072_82daa20520b0(ArrayList<Integer> arr, int k) {
        int i = 0, j = arr.size();
        int p = 0, kth = arr.get(0);
        while(i<j) {
            kth = arr.get(i);
            if (kth == k) return kth;
            if (kth < k) {
                p = kth;
                i++;
            } else {
                j--;
            }
        }
        return p;
    }

    
    public static int kthElement_Problem_2_627df231_ee86_4189_96a3_49e984ce4d53(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_0f2af47d_e820_45d2_aed9_07593242c8a5(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int temp = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            temp = sum;
            sum = sum - arr.get(i);
            if(sum == k) {
                return temp;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_0_29f67b8c_cce6_449c_9e3a_27b336a003cf(ArrayList<Integer> arr, int k) {
        return arr.get(k - 1);
    }

    
    public static int kthElement_Problem_1_f5e65f57_4ddd_4b8e_bb36_2de45c74bcab(ArrayList<Integer> arr, int k) {
        int len = arr.size();
        int kth = 0;
        int cur_element;
        for(int i=0;i<len;i++) {
            cur_element = arr.get(i);
            kth += cur_element;
            if(kth>=k) {
                return cur_element;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_2_bd2e7300_a1e8_4b33_9169_c4305cc75ba2(ArrayList<Integer> arr, int k) {
        int start =  k - 1;
        int result = arr.get(start);
        int size = arr.size();
        for (int i = start; i < size; i++) {
            int nextNum = arr.get(i + 1);
            if (nextNum <= result) {
                result = nextNum;
            }
        }
        return result;
    }

    
    public static int kthElement_Problem_0_d881c742_945c_472e_8ef2_b2e6f1951aa1(ArrayList<Integer> arr, int k) {
        if (arr == null) return -1;
        if (k <= 0) return -1;
        int i = 0;
        int count = 0;
        for (Integer element : arr) {
            if (count == k - 1) return element;
            count++;
        }
        return -1;
    }

    
    public static int kthElement_Problem_2_465fa6fd_1e3c_4780_b803_c92f31f4e16c(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_39467bea_a53d_450e_b4b5_b4dce60add57(ArrayList<Integer> arr, int k) {
        return arr.get(k - 1);
    }

    
    public static int kthElement_Problem_1_b4aa7912_1a62_4f9d_a09a_551d733a45b4(ArrayList<Integer> arr, int k) {
        int len = arr.size();
        if(len == 0) return 0;
        int i = 1, index = k - 1;
        while(i < len && index > 0) {
            i++;
            index--;
        }
        return arr.get(i - 1);
    }

    
    public static int kthElement_Problem_1_e5b4edf1_5c97_4361_abc3_c919f1f6b95c(ArrayList<Integer> arr, int k) {
        int index = 0;
        int element = 0;
        for(int i = 0; i < arr.size(); i++) {
            index = i + 1;
            element = arr.get(i);
            if (index == k) {
                return element;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_2_51e663b6_24b3_4a77_bb83_e8f81d466a04(ArrayList<Integer> arr, int k) {
        return arr.get( k - 1);
    }

    
    public static int kthElement_Problem_0_50cf23eb_e7bf_4b3e_8b08_d433ffa5baec(ArrayList<Integer> arr, int k) {
        int counter = arr.get(0);
        for (int i : arr)
            counter -= i;
        return k * counter;
    }

    
    public static int kthElement_Problem_0_7446d7cd_b30b_48bc_b20a_2959dafd265c(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int kthElement_Problem_0_7446d7cd_b30b_48bc_b20a_2959dafd265c = 0;
        if (arr.size() >= k) {
            kthElement_Problem_0_7446d7cd_b30b_48bc_b20a_2959dafd265c = arr.get(k - 1);
        }
        return kthElement_Problem_0_7446d7cd_b30b_48bc_b20a_2959dafd265c;
    }

    
    public static int kthElement_Problem_1_3cd983d7_84a0_46e7_8209_43187c547b6c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        // Write your logic here.
        return sum;
    }

    
    public static int kthElement_Problem_0_491fce79_2d25_4c9b_b5f8_5d48fca88471(ArrayList<Integer> arr, int k) {
        int ans = 0;
        int temp = 0;
        for(int i = 1 ; i < arr.size() ; i++)
        {
            if(arr.get(i-1) > k)
            {
                ans = temp;
                break;
            }
            ans = arr.get(i-1);
        }
        return ans;
    }

    
    public static int kthElement_Problem_2_8ba18f07_90ba_4f82_8951_eed5e373655a(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == k) {
                result = arr.get(i);
            }
        }
        return result;
    }

    
    public static int kthElement_Problem_2_f91e864b_3f39_437e_bc6a_0d3c375fb3d0(ArrayList<Integer> arr, int k) {
        int left = 0, right = arr.size() - 1, mid = 0;
        while(left <= right) {
            mid = (left + right) / 2;
            if(arr.get(mid) == k) {
                return arr.get(mid);
            } else if(arr.get(mid) > k) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return arr.get(mid);
    }

    
    public static int kthElement_Problem_1_180a7853_8a5e_496e_83b6_bf024fb6497a(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        int i = k - 1;
        int j = 0;
        int index =  i;
        while (index >= n) {
            index -= n;
            j++;
        }
        return arr.get(j);
    }

    
    public static int kthElement_Problem_2_36475e1a_0c77_4965_ba38_cbc50692792f(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_3e9eae3f_5398_4543_b216_c68ed6f15fb3(ArrayList<Integer> arr, int k) {
        if(arr.size()==0)
            return 0;
        else{
            int curr = arr.get(0);
            int count = 1;
            for(int i = 1; i<arr.size();i++){
                if(arr.get(i)>curr){
                    count++;
                    if(count==k)
                        return curr;
                    curr = arr.get(i);
                }
            }
            return curr;
        }
    }

    
    public static int kthElement_Problem_0_e317074e_9933_4046_9e37_8687c9942a30(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_97c495b9_29be_49fd_99fc_367243732948(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int count = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            count++;
            if(count == k) {
                return sum;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_1_ccdfff94_1105_4340_80a1_cac5dd75fc5b(ArrayList<Integer> arr, int k) {
        int result = 0;
        int n = arr.size();
        int curr = arr.get(0);

        // Using while loop to find the value by binary search
        while (curr > 0 && (curr - k) >= (n - 1)) {
            int mid = (curr + n - 1) / 2;
            if (k > mid) {
                k = mid - 1;
            } else {
                curr = mid + 1;
            }
        }

        result = curr;
        return result;
    }

    
    public static int kthElement_Problem_1_c517743c_9ef0_4bda_9856_af63d0e232c5(ArrayList<Integer> arr, int k) {
        int count = 0;
        int result = -1;
        if(arr.size() == 0 || k == 0) {
            return result;
        }
        for(int i = 0; i < arr.size(); i++) {
            if(count == k) {
                result = arr.get(i);
                break;
            }
            count++;
        }
        return result;
    }

    
    public static int kthElement_Problem_1_7b694316_18f9_486c_872a_bcba82da46d0(ArrayList<Integer> arr, int k) {
        int ans = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            ans = Math.min(ans, arr.get(i));
        }
        return ans;
    }

    
    public static int kthElement_Problem_2_336446ac_1943_4430_9660_97817e3b6548(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                return arr.get(i);
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_0_d1f080c3_056c_48ae_8609_45f301b114ce(ArrayList<Integer> arr, int k) {
        int count = 0;
        int result = -1;
        while(count<k) {
            count+=1;
            if(count==arr.size()) {
                return result;
            }
            result = arr.get(count-1);
        }
        return result;
    }

    
    public static int kthElement_Problem_0_790a2d74_fb6a_4ec9_9e18_633e5f6051c1(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_be2adfdb_646a_4be0_8286_7804d75a89a7(ArrayList<Integer> arr, int k) {
        // your code goes here
        int pivot = arr.get(arr.size()/2);
        int start = 0, end = arr.size()-1;
        while(arr.get(start) < pivot && start < end) start++;
        while(arr.get(end) > pivot && start < end) end--;
        if(arr.get(start) < pivot && arr.get(end) > pivot) {
            if(k < arr.get(start)) return kthElement_Problem_1_be2adfdb_646a_4be0_8286_7804d75a89a7(arr,k);
            else if(k > arr.get(start)) return kthElement_Problem_1_be2adfdb_646a_4be0_8286_7804d75a89a7(arr,k-arr.get(start)-1);
            else return arr.get(start);
        }
        else if(arr.get(start) < pivot && k < arr.get(start)) return kthElement_Problem_1_be2adfdb_646a_4be0_8286_7804d75a89a7(arr,k);
        else if(arr.get(end) > pivot && k > arr.get(end)) return kthElement_Problem_1_be2adfdb_646a_4be0_8286_7804d75a89a7(arr,k-arr.get(end)-1);
        else return arr.get(end);
    }

    
    public static int kthElement_Problem_0_4865cb13_0b3c_4691_80d0_0124e3f34d95(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_fb2b0494_f510_4bff_9d42_9ae7f229ff56(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        Collections.sort(arr);
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_889d37ff_9815_4bd8_add9_76977298ea02(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_20046827_7a5d_4c6b_b5ac_e94c8f6dc9aa(ArrayList<Integer> arr, int k) {
        int l = arr.size() - 1;
        while (k > l) {
            arr.add(arr.get(l) + arr.get(l + 1));
            l++;
        }
        return arr.get(l);
    }

    
    public static int kthElement_Problem_1_24cb073f_e17a_4258_96d4_2365930696ab(ArrayList<Integer> arr, int k) {
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_82490d82_e932_425a_aa61_8305d47061f0(ArrayList<Integer> arr, int k) {
        int result = 0;
        int temp = 0;
        for(int i = 1; i < arr.size(); i++) {
            temp = arr.get(i);
            if(k == temp) {
                result = i;
                break;
            }
        }
        return result;
    }

    
    public static int kthElement_Problem_2_5dc61740_bff6_4802_b020_132b40d9fe99(ArrayList<Integer> arr, int k) {
        int n = 0;
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int current = arr.get(i);
            if (current > max) {
                max = current;
            }
            if (n - k - 1 >= 0)
                n = n - k - 1;
            else
                n = arr.size();
        }
        return max;
    }

    
    public static int kthElement_Problem_0_9348baed_7bba_42e3_9713_ccd4fd110949(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                return arr.get(i);
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_0_4b5ea57b_de8f_44ca_8c08_66d142ff6dc1(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_97c495b9_29be_49fd_99fc_367243732948(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int count = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            count++;
            if(count == k) {
                return sum;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_1_2be0edc9_2fc0_486b_a507_4e82023c2c63(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_2dded4bc_c41d_461a_8980_708bd4ad5c5d(ArrayList<Integer> arr, int k) {
        int total = 0;
        for (int i = 1; i < k; i++) {
            total += arr.get(i);
        }
        return total;
    }

    
    public static int kthElement_Problem_0_f9d050b9_097b_4242_ad0f_cef471946275(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_225219df_fe64_44c6_b4c2_00befd22ed2c(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_9d373ae4_c86e_4acf_9317_e4de6a158225(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
            count++;
        }
        return sum / count;
    }

    
    public static int kthElement_Problem_0_637294dc_4ccd_4664_b3ac_5c949a0222ba(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_336446ac_1943_4430_9660_97817e3b6548(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                return arr.get(i);
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_0_585bbaf7_3c07_482b_a614_e8024ac38b65(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_5702b26e_1ae7_4e0b_91c6_bfe7d29ac019(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_81b402f8_ecb5_4a64_bf2a_421c275e64f5(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                return arr.get(i);
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_1_82807f27_8982_40f5_8e7b_6ba53815f3f9(ArrayList<Integer> arr, int k) {
        int elem = 0;
        for (int i = 0; i < k-1; i++) {
            elem = arr.get(i);
        }
        return elem;
    }

    
    public static int kthElement_Problem_1_685fa7a4_a163_45f8_9a00_01f8465d3d29(ArrayList<Integer> arr, int k) {
        int result = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == k) {
                result = arr.get(i);
                break;
            }
        }
        return result;
    }

    
    public static int kthElement_Problem_2_6bc3b413_e1c6_4cdd_9cb0_2c452b403fa2(ArrayList<Integer> arr, int k) {
        Collections.sort(arr);
        int lastElem = arr.get(arr.size() - 1);
        int currElem = lastElem;
        int count = 0;
        for (int elem : arr) {
            currElem = elem;
            count++;
            if (count == k) {
                break;
            }
        }
        return currElem;
    }

    
    public static int kthElement_Problem_0_f6caa62d_8e68_4f33_8d9b_20d860b45578(ArrayList<Integer> arr, int k) {
        return arr.get((k - 1) / arr.size());
    }

    
    public static int kthElement_Problem_0_4917a58a_1b3a_4cbd_a9eb_2f45a0c85ec6(ArrayList<Integer> arr, int k) {
        // Write your code here
        Collections.sort(arr);
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_8b787411_fe4f_4857_9128_310cf30c0827(ArrayList<Integer> arr, int k) {
        if (arr == null || arr.isEmpty() || k < 1) return -1;
        int i = 1;
        for (int element : arr) {
            if (i == k) return element;
            i++;
        }
        return -1;
    }

    
    public static int kthElement_Problem_0_3bb089de_9195_471d_b59d_6248a9947e56(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        int left = 1;
        int right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid-1) < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return arr.get(right);
    }

    
    public static int kthElement_Problem_2_9348baed_7bba_42e3_9713_ccd4fd110949(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                return arr.get(i);
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_2_d2737065_ae9e_4fce_83b5_a6b1ebcfe30a(ArrayList<Integer> arr, int k) {
        int index = (k - 1);
        return arr.get(index);
    }

    
    public static int kthElement_Problem_1_691042fc_38e1_4440_8ce5_6b5965d7f725(ArrayList<Integer> arr, int k) {
        // Your code here
        if(arr.isEmpty()){
            return -1;
        }
        int highest = arr.get(0);
        int count = 1;
        int sum = 0;
        int current = highest + 1;
        for(int i = 1 ; i < arr.size() ; i++){
            sum+=arr.get(i);
            if((sum - current)%k == 0){
                count++;
                current = sum;
            }
        }
        return count;
    }

    
    public static int kthElement_Problem_1_fb539df9_89f3_4893_bbf9_9540b8ce294a(ArrayList<Integer> arr, int k) {
        int ret = 0;
        int last = 0;
        for (int i = 0; i < arr.size(); i++) {
            last = arr.get(i);
            if (k == 1) return last;
            k -= 1;
        }
        return ret;
    }

    
    public static int kthElement_Problem_1_f75e9d0d_dcc2_4e54_a6b0_c3a83c230ae9(ArrayList<Integer> arr, int k) {
        int result = 0;
        int i = 0;
        for(Integer num : arr) {
            if(i == k - 1) {
                result = num;
                break;
            }
            i++;
        }
        return result;
    }

    
    public static int kthElement_Problem_2_8dab18d0_b7c6_4271_94a2_f4ed1f540ec2(ArrayList<Integer> arr, int k) {
        Collections.sort(arr);
        return arr.get( k - 1);
    }

    
    public static int kthElement_Problem_0_40fd7961_27f2_4dff_8cd9_82d8126c0e11(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_a9839a1b_5688_468b_83e7_a651b56932f3(ArrayList<Integer> arr, int k) {
        int result = 0;
        int i = 0;
        for(Integer e : arr) {
            if(i == k - 1) {
                result = e;
                break;
            }
            i++;
        }
        return result;
    }

    
    public static int kthElement_Problem_0_34a2020e_9525_480b_b5e0_136ba1ca5107(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_d15a3b06_6e4c_47a3_bd7f_0ed4050e16c4(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        int start = 0;
        int end = n - 1;
        while (start < end) {
            int mid = start + ((end - start) / 2);
            if (arr.get(mid) == k) {
                return arr.get(mid);
            }
            if (arr.get(mid) < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (start == end) {
            return arr.get(start);
        }
        return -1;
    }

    
    public static int kthElement_Problem_2_c0878e5a_5d1e_4353_8589_f12c3d4c4f57(ArrayList<Integer> arr, int k) {
        if (arr.size() < k) return -1;
        
        int first = arr.get(0);
        int index = 0;
        int last = 0;
        while (first != last) {
            last = first;
            first = (first + index++) % arr.size();
        }
        return first;
    }

    
    public static int kthElement_Problem_1_1256fa09_7c0d_4f9f_8420_653d0ba2e737(ArrayList<Integer> arr, int k) {
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_399e65b7_5a48_466a_ba6c_b5959751ef9a(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_3eed3344_65d7_441d_ae1d_b7002ce5438d(ArrayList<Integer> arr, int k) {
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_43bc4167_f5cb_463c_9fc9_c7f854f676e4(ArrayList<Integer> arr, int k) {
        //Complete the method body
        int n=arr.size();
        int start=0;
        int sum=0;
        for(int i=0;i<n-1;i++){
            sum+=arr.get(i);
            if(sum==k)
                return arr.get(i);
            sum-=arr.get(i);
        }
        return arr.get(arr.size()-1);
    }

    
    public static int kthElement_Problem_0_e3daa430_a315_4570_b9af_6b3f637b18a4(ArrayList<Integer> arr, int k) {
        // Your Code Here
        return 0;
    }

    
    public static int kthElement_Problem_1_61e1df7a_b3cd_43c9_8000_01a9a893a2f2(ArrayList<Integer> arr, int k) {
        int index = -1;
        int value = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == k) {
                index = i;
                value = arr.get(i);
                break;
            }
        }
        return value;
    }

    
    public static int kthElement_Problem_0_f8b9ca0f_47f9_44cf_8704_4ead071dfac1(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_633bbed3_3c41_4e54_9191_04f994760d1f(ArrayList<Integer> arr, int k) {
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_0e8a48c3_1fd7_4e0e_8201_1fc96068f83a(ArrayList<Integer> arr, int k) {
        /*
         * Code goes here
         */
        return 0;
    }

    
    public static int kthElement_Problem_0_2e30fa7f_3fbc_4e19_91ae_9528e172ab84(ArrayList<Integer> arr, int k) {
        int nth = 0;
        if (arr.isEmpty() || k > arr.size() || k <= 0) return -1;
        int last = arr.get(arr.size() - 1);
        for (int i = 0; i <= arr.size() - k; i++) {
            if (arr.get(i) > last) {
                if (i == arr.size() - k) nth = -1;
                else nth = arr.get(i);
                break;
            }
        }
        return nth;
    }

    
    public static int kthElement_Problem_1_7a5dbde1_41da_4d32_ab3b_98692226ad38(ArrayList<Integer> arr, int k) {
        int i = 0, j = arr.size() - 1;
        while (i < j) {
            int mid = arr.get(i + (j - i) / 2);
            if (mid == k) return mid;
            if (mid > k) {
                j = i + (j - i) / 2;
            } else {
                i = i + (j - i) / 2 + 1;
            }
        }
        return arr.get(i);
    }

    
    public static int kthElement_Problem_2_93420bac_06fa_44cd_b177_b48b3a91a466(ArrayList<Integer> arr, int k) {
        Collections.sort(arr);
        return arr.get( k - 1);
    }

    
    public static int kthElement_Problem_2_66611a92_c376_4d94_85ad_f409541f47d3(ArrayList<Integer> arr, int k) {
        int start = 0, end = arr.size() - 1, mid = (start + end) / 2;
        while (start <= end) {
            if (arr.get(mid) < k) {
                start = mid + 1;
            } else if (arr.get(mid) > k) {
                end = mid - 1;
            } else {
                return arr.get(mid);
            }
            mid = (start + end) / 2;
        }
        return -1;
    }

    
    public static int kthElement_Problem_2_4181106f_0acf_49cb_b0c1_577ae451dcf6(ArrayList<Integer> arr, int k) {
        int min = arr.get(0);
        int max = arr.get(0);

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < min) min = arr.get(i);
            if (arr.get(i) > max) max = arr.get(i);
        }

        int mid = (max + min) / 2;
        int count = 0;

        while (k >= count) {
            if (mid < arr.get(arr.size() - 1))
                mid = (mid + max) / 2; // find the mid point of the array list
            else
                mid = (mid - min) / 2;
            count++;
        }

        return mid;
    }

    
    public static int kthElement_Problem_2_5270d858_6bab_4330_9432_db8b5286a846(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int count = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            count++;
            if(count == k) {
                return sum;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_1_4a860a57_4c23_4faf_bf30_c20a963fe4a1(ArrayList<Integer> arr, int k) {
        ArrayList<Integer> arr2 = (ArrayList<Integer>) arr.clone();
        Collections.sort(arr2);
        arr2.remove(arr2.size() - 1);
        int n = arr.size();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr2.get(i) == k) {
                count++;
            }
        }
        return count;
    }

    
    public static int kthElement_Problem_2_3d68c199_7ae9_4e89_8f4a_f29b364c6b7f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int temp = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            temp = sum;
            sum = sum - arr.get(i) + arr.get(i - 1);
            if(sum == k) {
                return temp;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_2_52de34e8_1b85_4733_8308_8bc77f1b0925(ArrayList<Integer> arr, int k) {
        int result = 0;
        int i = 0;
        for (Integer val : arr) {
            if (i == k - 1) {
                result = val;
                break;
            }
            i++;
        }
        return result;
    }

    
    public static int kthElement_Problem_2_1c6e2335_041a_4bfe_bd98_32023e7ace1a(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_f75e9d0d_dcc2_4e54_a6b0_c3a83c230ae9(ArrayList<Integer> arr, int k) {
        int result = 0;
        int i = 0;
        for(Integer num : arr) {
            if(i == k - 1) {
                result = num;
                break;
            }
            i++;
        }
        return result;
    }

    
    public static int kthElement_Problem_2_4ccf4303_801b_4aa9_9240_1e8dd7ae0f53(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int kthElement_Problem_2_4ccf4303_801b_4aa9_9240_1e8dd7ae0f53 = 0;
        int size = arr.size();
        if(k > size) {
            return -1;
        }
        Collections.sort(arr);
        kthElement_Problem_2_4ccf4303_801b_4aa9_9240_1e8dd7ae0f53 = arr.get(k-1);
        return kthElement_Problem_2_4ccf4303_801b_4aa9_9240_1e8dd7ae0f53;
    }

    
    public static int kthElement_Problem_0_8f3bb2d4_9a9b_42b6_957f_3222e87b091f(ArrayList<Integer> arr, int k) {
        if (k > arr.size()) {
            throw new ArrayIndexOutOfBoundsException();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int index = 0;
        int minIndex = -1;

        boolean found = False;

        while (index < arr.size()) {
            int currentMin = min;
            int currentMax = max;
            int currentIndex = index;
            int currentMinIndex = minIndex;

            if (index == k) {
                found = True;
            }

            if (found) {
                min = currentMin;
                max = currentMax;
                index = currentIndex;
                minIndex = currentMinIndex;
            }

            min = Math.min(min + 1, currentMin);
            max = Math.max(max, currentMax);
            index = index - 1;
        }

        return minIndex;
    }

    
    public static int kthElement_Problem_1_d4d442b4_2018_4e9d_bc91_20253efe08c0(ArrayList<Integer> arr, int k) {
        Collections.sort(arr);
        int start = arr.indexOf(k-1);
        return arr.get(start);
    }

    
    public static int kthElement_Problem_1_cecf0141_159e_4c5a_9c9a_7d6dc9a5c52b(ArrayList<Integer> arr, int k) {
        int res = 0;
        int count = 0;
        for (int i = 0; i < k; i++) {
            count = count + 1;
            if (i == k - 1)
                res = arr.get(i);
            else
                res = res + arr.get(i);
        }
        return res;
    }

    
    public static int kthElement_Problem_2_b459d705_156e_45d9_98a9_3212b3c6a402(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int temp = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                temp = arr.get(i);
                break;
            }
        }
        return temp;
    }

    
    public static int kthElement_Problem_0_6d4267b6_489a_4751_a417_a2179ac6ef4c(ArrayList<Integer> arr, int k) {
        int result=0;
        for(int i=0;i<k;i++)
        {
            result=result + arr.get(i);
        }
        return result;
    }

    
    public static int kthElement_Problem_0_ac8cf698_1ee6_4abc_9673_1179dc587346(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_20fa6204_1d35_4c53_852f_230aceb0779f(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int temp = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
        return arr.get(k - 1);
    }

    
    public static int kthElement_Problem_0_c5b19ece_18c7_4465_ace9_b3c75d2bd104(ArrayList<Integer> arr, int k) {
        if(arr.size()<k) {
            return -1;
        }
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_c5b19ece_18c7_4465_ace9_b3c75d2bd104(ArrayList<Integer> arr, int k) {
        if(arr.size()<k) {
            return -1;
        }
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_93420bac_06fa_44cd_b177_b48b3a91a466(ArrayList<Integer> arr, int k) {
        Collections.sort(arr);
        return arr.get( k - 1);
    }

    
    public static int kthElement_Problem_0_7545ed96_a362_424a_876f_bb317518db15(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int count = 0;
        int temp = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum = sum + arr.get(i);
            count++;
            if(count == k) {
                temp = sum;
                break;
            }
        }
        return temp;
    }

    
    public static int kthElement_Problem_0_c6ebfc35_7ed7_4208_bf11_4ae941379bd3(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                return arr.get(i);
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_0_55201749_5ef0_41c1_9de7_35683e0b0a76(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int count = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            count++;
            if(sum == k) {
                return arr.get(i);
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_2_9b374ab8_6db0_4fd5_8c8e_afb22dd20cbe(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int max = arr.get(0);
        int min = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > k) {
                max = arr.get(i);
            } else if (sum < k) {
                min = arr.get(i);
            }
        }
        return max;
    }

    
    public static int kthElement_Problem_1_790a2d74_fb6a_4ec9_9e18_633e5f6051c1(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_4beb9189_ec5b_4e74_9954_a0d87c384d08(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_596c0ac1_5174_4b3d_a732_31dadc46f569(ArrayList<Integer> arr, int k) {
        if (arr.size() == 0 || k < 1 || k >= arr.size()) {
            throw new IllegalArgumentException("The length of given array list should be greater than 0 and less than or equal to n");
        }

        int mid = arr.size() / 2;
        Integer arrMidVal = arr.get(mid);

        if (k < mid && k > arrMidVal) {
            int midVal = kthElement_Problem_2_596c0ac1_5174_4b3d_a732_31dadc46f569(arr, k - mid);
            int kthVal = arrMidVal;
            if (k == mid) {
                return kthVal;
            } else {
                return kthVal + kthElement_Problem_2_596c0ac1_5174_4b3d_a732_31dadc46f569(arr, k - 1);
            }
        } else if (k == mid) {
            return arrMidVal;
        } else {
            return kthElement_Problem_2_596c0ac1_5174_4b3d_a732_31dadc46f569(arr, k - 1);
        }
    }

    
    public static int kthElement_Problem_1_21388836_6b4e_4ea7_b32d_d5dc417c47fb(ArrayList<Integer> arr, int k) {
        int maxVal = Integer.MIN_VALUE;
        int curVal = arr.get(0);
        for(int i=1; i < arr.size(); i++) {
            if((curVal + arr.get(i)) <= k) {
                maxVal = arr.get(i);
            }
            curVal += arr.get(i);
        }
        return maxVal;
    }

    
    public static int kthElement_Problem_1_a074c58b_50e9_4cd1_92c0_9a2455a44ece(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int count = 0;
        int max = arr.get(0);
        int min = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            count++;
            if(count > k) {
                max = sum;
                min = arr.get(i);
                count = 0;
            }
        }
        return max;
    }

    
    public static int kthElement_Problem_2_7af08916_84b4_4311_83ee_15a3e2f3e1d7(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_80dd77a3_df85_4559_b0b3_9fe3f502662b(ArrayList<Integer> arr, int k) {
        int result = -1;
        int sum = 0;
        int temp = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                result = arr.get(i);
                break;
            }
        }
        return result;
    }

    
    public static int kthElement_Problem_0_93420bac_06fa_44cd_b177_b48b3a91a466(ArrayList<Integer> arr, int k) {
        Collections.sort(arr);
        return arr.get( k - 1);
    }

    
    public static int kthElement_Problem_0_0e8a48c3_1fd7_4e0e_8201_1fc96068f83a(ArrayList<Integer> arr, int k) {
        /*
         * Code goes here
         */
        return 0;
    }

    
    public static int kthElement_Problem_1_e62d29a4_d1db_4f6b_9ede_4c56f4b9ea68(ArrayList<Integer> arr, int k) {
        int size = arr.size();
        if (size == 0) {
            return -1;
        }
        return arr.get( k - 1);
    }

    
    public static int kthElement_Problem_0_15fbecc2_cc0b_4c37_92ba_31189eeed3e9(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_e79d72c1_a168_4b48_b072_82daa20520b0(ArrayList<Integer> arr, int k) {
        int i = 0, j = arr.size();
        int p = 0, kth = arr.get(0);
        while(i<j) {
            kth = arr.get(i);
            if (kth == k) return kth;
            if (kth < k) {
                p = kth;
                i++;
            } else {
                j--;
            }
        }
        return p;
    }

    
    public static int kthElement_Problem_2_ea0ff483_39e7_4b57_a9af_7249e738f3ee(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        if(k > n)
            k = n;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int m = arr.get(0);
        int res = 0;
        for(int i = 1; i < n; i++){
            if((m+arr.get(i))%k == 0){
                temp.add(arr.get(i));
            }
        }
        res = temp.get(0);
        for(int i = 1; i < n; i++){
            m = temp.get(i);
            temp.set(0, m);
            res = res%k;
        }
        arr.clear();
        for(int i = 0; i < n; i++){
            arr.add(res);
        }
        return res;
    }

    
    public static int kthElement_Problem_1_36daf0e4_5e2f_444e_9b9b_f65a5db53a8d(ArrayList<Integer> arr, int k) {
        // Write code here
        Integer max = null;
        for (Integer i : arr) {
            if (max != null) if (i > max) {
                max = i;
            }
        }
        return max;
    }

    
    public static int kthElement_Problem_0_b609e278_fc47_4f62_ab8c_533e88031ef9(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_b0d3574e_3c6b_4fe0_984c_ba5e4280e9ac(ArrayList<Integer> arr, int k) {
        return arr.get( k - 1);
    }

    
    public static int kthElement_Problem_0_728ca438_d329_49f7_aa7e_8ee10cdd646b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int total = 0L;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int kthElement_Problem_2_2ae6f64b_d6d7_4bc4_8930_2a0f822fc158(ArrayList<Integer> arr, int k) {
        int firstElement = arr.get(0);
        int lastElement = arr.get(arr.size()-1);
        int firstElementIndex = arr.indexOf(firstElement);
        int lastElementIndex = arr.lastIndexOf(lastElement);
        return ((firstElementIndex+lastElementIndex)/2)+(k-firstElementIndex)/arr.size()+1;
    }

    
    public static int kthElement_Problem_2_7d288170_c01e_44a7_90a3_e95b9019b7b3(ArrayList<Integer> arr, int k) {
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_20046827_7a5d_4c6b_b5ac_e94c8f6dc9aa(ArrayList<Integer> arr, int k) {
        int l = arr.size() - 1;
        while (k > l) {
            arr.add(arr.get(l) + arr.get(l + 1));
            l++;
        }
        return arr.get(l);
    }

    
    public static int kthElement_Problem_2_0e8c50f2_37e3_44b6_b1f5_a411d9bb45ab(ArrayList<Integer> arr, int k) {
        int ans = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            ans = Math.min(ans, arr.get(i));
        }
        return ans;
    }

    
    public static int kthElement_Problem_2_43bc4167_f5cb_463c_9fc9_c7f854f676e4(ArrayList<Integer> arr, int k) {
        //Complete the method body
        int n=arr.size();
        int start=0;
        int sum=0;
        for(int i=0;i<n-1;i++){
            sum+=arr.get(i);
            if(sum==k)
                return arr.get(i);
            sum-=arr.get(i);
        }
        return arr.get(arr.size()-1);
    }

    
    public static int kthElement_Problem_2_b609e278_fc47_4f62_ab8c_533e88031ef9(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_f57616f5_f846_49b8_8f7e_b2877fe98cd7(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_d00a6eaa_e70d_425a_b11f_91db2e36e449(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        int prev = 0;
        int cur = 0;
        int result = 0;
        for(int i = 0; i < n; ++i) {
            prev = cur;
            cur = arr.get(i);
            if(k == 1) {
                result = cur;
                break;
            }
            else if(k < (n - i)) {
                result = cur;
                k = k - 1;
            }
            else {
                k = k - (n - i);
                result = prev;
            }
        }
        return result;
    }

    
    public static int kthElement_Problem_1_2d59d779_b240_45a7_b8ca_243697bc3e8c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int lastElement = arr.get(arr.size() - 1);
        int currentElement = arr.get(0);
        int count = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += currentElement;
            currentElement = arr.get(i);
            if(sum == k) {
                count++;
            }
        }
        return count;
    }

    
    public static int kthElement_Problem_1_c31a7321_2636_4076_b7e5_68c314ebf8d6(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i != k; ++i) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int kthElement_Problem_1_3e68a307_9632_4b07_ace0_3947c8912ff6(ArrayList<Integer> arr, int k) {
        int result = -1;
        int temp = 0;
        for(int i = 1; i < arr.size(); i++) {
            temp = arr.get(i);
            if(temp == k) {
                result = i;
                break;
            }
        }
        return result;
    }

    
    public static int kthElement_Problem_1_d6d61f09_8dc9_4086_b8a5_a0374f567c20(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_f91e864b_3f39_437e_bc6a_0d3c375fb3d0(ArrayList<Integer> arr, int k) {
        int left = 0, right = arr.size() - 1, mid = 0;
        while(left <= right) {
            mid = (left + right) / 2;
            if(arr.get(mid) == k) {
                return arr.get(mid);
            } else if(arr.get(mid) > k) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return arr.get(mid);
    }

    
    public static int kthElement_Problem_2_cb4748ca_0b62_42c5_88c3_ba8ffaf7c7c0(ArrayList<Integer> arr, int k) {
        int sum=0;
        for(int i=1; i<arr.size(); i++) {
            sum+=arr.get(i);
            if(i==k) {
                return sum;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_0_122b4778_d00e_4aa7_95f5_a63687af9978(ArrayList<Integer> arr, int k) {
        // Your code here
        int i = 0;
        int low = 1;
        int high = arr.size() - 1;
        while(low < high) {
            i = ((low + high) / 2);
            if(arr.get(i) > k) {
                high = i;
            } else if(arr.get(i) < k) {
                low = i + 1;
            } else {
                return arr.get(i);
            }
        }
        return arr.get(i);
    }

    
    public static int kthElement_Problem_0_3feb1da0_a1f3_449e_ac41_889ee793946a(ArrayList<Integer> arr, int k) {
        return arr.stream()
                .distinct()
                .filter(x -> k % 2 == 1)
                .skip(k % 2)
                .findFirst()
                .orElseThrow(RuntimeException::new);
    }

    
    public static int kthElement_Problem_1_51e663b6_24b3_4a77_bb83_e8f81d466a04(ArrayList<Integer> arr, int k) {
        return arr.get( k - 1);
    }

    
    public static int kthElement_Problem_1_1c6e2335_041a_4bfe_bd98_32023e7ace1a(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_0c0d8ac9_78e7_48a7_b112_e8f4d9e7e272(ArrayList<Integer> arr, int k) {
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_2e30fa7f_3fbc_4e19_91ae_9528e172ab84(ArrayList<Integer> arr, int k) {
        int nth = 0;
        if (arr.isEmpty() || k > arr.size() || k <= 0) return -1;
        int last = arr.get(arr.size() - 1);
        for (int i = 0; i <= arr.size() - k; i++) {
            if (arr.get(i) > last) {
                if (i == arr.size() - k) nth = -1;
                else nth = arr.get(i);
                break;
            }
        }
        return nth;
    }

    
    public static int kthElement_Problem_2_41ba2094_1a71_4603_85e9_0af15db8b1b6(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k - 1);
    }

    
    public static int kthElement_Problem_0_43d47d6d_f584_4c4b_ae77_afd447835d66(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_712d2250_8a19_4372_b4fc_366118e70c47(ArrayList<Integer> arr, int k) {
        int x = 0;
        for(int i = 0; i < arr.size(); ++i) {
            if(arr.get(i) == k) {
                x = arr.get(i);
                break;
            }
            else {
                ++x;
            }
        }
        return x;
    }

    
    public static int kthElement_Problem_2_3286338f_35ad_4741_b2e9_0846a78d45bd(ArrayList<Integer> arr, int k) {
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_6d071295_e5bf_4cda_bfcd_21336b22d6c7(ArrayList<Integer> arr, int k) {
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (k == arr.get(i)) {
                result = arr.get(i);
            }
        }
        return result;
    }

    
    public static int kthElement_Problem_2_8592b5de_40c4_4e3f_aed2_2402ee25bd2d(ArrayList<Integer> arr, int k) {
        int curr = 0;
        int pos = 0;
        for (Integer e : arr) {
            pos++;
            if (pos == k) {
                return e;
            }
            curr = e;
        }
        return curr;
    }

    
    public static int kthElement_Problem_2_f1e60fc7_052c_419a_b148_2eef48050c1a(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_a539f07e_920b_4735_a25b_b892053300bf(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_0cbfe5ca_2b73_42ac_be5a_f95c2ff94164(ArrayList<Integer> arr, int k) {
        if(arr == null || arr.isEmpty() || k < 1 || arr.size() < k) {
            return -1;
        }
        int temp = arr.get(arr.size()-1);
        int count = 0;
        for(int i = arr.size()-1; i >= 0; i--) {
            if(arr.get(i) == temp) {
                count++;
                if(count == k) {
                    return temp;
                }
            }
            else {
                count = 0;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_2_604e0643_103a_4905_b2e7_9d9f51a6fc53(ArrayList<Integer> arr, int k) {
        int l = 0;
        int r = arr.size() - 1;
        int mid = (l + r) / 2;
        while(l <= r) {
            if(arr.get(mid) < k) {
                l = mid + 1;
            } else if(arr.get(mid) > k) {
                r = mid - 1;
            } else {
                return arr.get(mid);
            }
            mid = (l + r) / 2;
        }
        return arr.get(mid);
    }

    
    public static int kthElement_Problem_1_90533f4c_f111_41c5_9f9f_7a0e0cc0fdaa(ArrayList<Integer> arr, int k) {
        int result = 0;
        int i = 0;
        for (Integer x : arr) {
            if (i == k - 1) {
                result = x;
                break;
            }
            i++;
        }
        return result;
    }

    
    public static int kthElement_Problem_0_c67f2ee6_a3c4_4dee_a8f7_c308adc225f4(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_49ff3f85_2afc_441b_b418_84f9c337984b(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_0e8c50f2_37e3_44b6_b1f5_a411d9bb45ab(ArrayList<Integer> arr, int k) {
        int ans = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            ans = Math.min(ans, arr.get(i));
        }
        return ans;
    }

    
    public static int kthElement_Problem_2_8af8cedf_8ae7_4c1a_a8ea_1d3aa5555ea1(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_d881c742_945c_472e_8ef2_b2e6f1951aa1(ArrayList<Integer> arr, int k) {
        if (arr == null) return -1;
        if (k <= 0) return -1;
        int i = 0;
        int count = 0;
        for (Integer element : arr) {
            if (count == k - 1) return element;
            count++;
        }
        return -1;
    }

    
    public static int kthElement_Problem_2_b4aa7912_1a62_4f9d_a09a_551d733a45b4(ArrayList<Integer> arr, int k) {
        int len = arr.size();
        if(len == 0) return 0;
        int i = 1, index = k - 1;
        while(i < len && index > 0) {
            i++;
            index--;
        }
        return arr.get(i - 1);
    }

    
    public static int kthElement_Problem_1_23284c12_a6cd_482e_9f6b_54f810cc19a7(ArrayList<Integer> arr, int k) {
        int result = 0;
        int i = 0;
        for(Integer l : arr) {
            if(i == k - 1) {
                result = l;
                break;
            }
            i++;
        }
        return result;
    }

    
    public static int kthElement_Problem_0_14e6879d_36ee_42af_a16d_aff5a3d41ed7(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_691042fc_38e1_4440_8ce5_6b5965d7f725(ArrayList<Integer> arr, int k) {
        // Your code here
        if(arr.isEmpty()){
            return -1;
        }
        int highest = arr.get(0);
        int count = 1;
        int sum = 0;
        int current = highest + 1;
        for(int i = 1 ; i < arr.size() ; i++){
            sum+=arr.get(i);
            if((sum - current)%k == 0){
                count++;
                current = sum;
            }
        }
        return count;
    }

    
    public static int kthElement_Problem_1_f6caa62d_8e68_4f33_8d9b_20d860b45578(ArrayList<Integer> arr, int k) {
        return arr.get((k - 1) / arr.size());
    }

    
    public static int kthElement_Problem_2_1c84c07d_a480_49b5_9e31_18fe8382ba0a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int max = arr.get(0);
        int min = arr.get(0);
        int mid = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > k) {
                max = arr.get(i);
            }
            if(sum < k) {
                min = arr.get(i);
            }
            mid = sum / 2;
        }
        return mid;
    }

    
    public static int kthElement_Problem_0_1c84c07d_a480_49b5_9e31_18fe8382ba0a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int max = arr.get(0);
        int min = arr.get(0);
        int mid = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > k) {
                max = arr.get(i);
            }
            if(sum < k) {
                min = arr.get(i);
            }
            mid = sum / 2;
        }
        return mid;
    }

    
    public static int kthElement_Problem_2_c517743c_9ef0_4bda_9856_af63d0e232c5(ArrayList<Integer> arr, int k) {
        int count = 0;
        int result = -1;
        if(arr.size() == 0 || k == 0) {
            return result;
        }
        for(int i = 0; i < arr.size(); i++) {
            if(count == k) {
                result = arr.get(i);
                break;
            }
            count++;
        }
        return result;
    }

    
    public static int kthElement_Problem_0_201f7589_21d1_4310_8b48_568717d68e9c(ArrayList<Integer> arr, int k) {
        return arr.get((k - 1));
    }

    
    public static int kthElement_Problem_2_711cea72_943e_402c_b325_a03bc440f817(ArrayList<Integer> arr, int k) {
        int count = 0;
        if (k > arr.size()) {
            return -1;
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == k) {
                return arr.get(i);
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_0_604e0643_103a_4905_b2e7_9d9f51a6fc53(ArrayList<Integer> arr, int k) {
        int l = 0;
        int r = arr.size() - 1;
        int mid = (l + r) / 2;
        while(l <= r) {
            if(arr.get(mid) < k) {
                l = mid + 1;
            } else if(arr.get(mid) > k) {
                r = mid - 1;
            } else {
                return arr.get(mid);
            }
            mid = (l + r) / 2;
        }
        return arr.get(mid);
    }

    
    public static int kthElement_Problem_0_7a0168a8_f76c_4c00_a5ec_6d7510d7d8b7(ArrayList<Integer> arr, int k) {
        int count = 0;
        for (int i : arr) {
            if (count == k) {
                return i;
            }
            count++;
        }
        return 0;
    }

    
    public static int kthElement_Problem_0_8592b5de_40c4_4e3f_aed2_2402ee25bd2d(ArrayList<Integer> arr, int k) {
        int curr = 0;
        int pos = 0;
        for (Integer e : arr) {
            pos++;
            if (pos == k) {
                return e;
            }
            curr = e;
        }
        return curr;
    }

    
    public static int kthElement_Problem_0_14077ebb_ae1a_44ba_853b_f9b5f7530e11(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
            if (k == sum) {
                return k + 1;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_0_8af8cedf_8ae7_4c1a_a8ea_1d3aa5555ea1(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_7a0168a8_f76c_4c00_a5ec_6d7510d7d8b7(ArrayList<Integer> arr, int k) {
        int count = 0;
        for (int i : arr) {
            if (count == k) {
                return i;
            }
            count++;
        }
        return 0;
    }

    
    public static int kthElement_Problem_0_3286338f_35ad_4741_b2e9_0846a78d45bd(ArrayList<Integer> arr, int k) {
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_ec77bf85_9dda_43b3_9735_f04b061a8fea(ArrayList<Integer> arr, int k) {
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_3e9eae3f_5398_4543_b216_c68ed6f15fb3(ArrayList<Integer> arr, int k) {
        if(arr.size()==0)
            return 0;
        else{
            int curr = arr.get(0);
            int count = 1;
            for(int i = 1; i<arr.size();i++){
                if(arr.get(i)>curr){
                    count++;
                    if(count==k)
                        return curr;
                    curr = arr.get(i);
                }
            }
            return curr;
        }
    }

    
    public static int kthElement_Problem_2_7446d7cd_b30b_48bc_b20a_2959dafd265c(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int kthElement_Problem_2_7446d7cd_b30b_48bc_b20a_2959dafd265c = 0;
        if (arr.size() >= k) {
            kthElement_Problem_2_7446d7cd_b30b_48bc_b20a_2959dafd265c = arr.get(k - 1);
        }
        return kthElement_Problem_2_7446d7cd_b30b_48bc_b20a_2959dafd265c;
    }

    
    public static int kthElement_Problem_2_97fccc2a_a1ca_43d2_830c_60854cab58ec(ArrayList<Integer> arr, int k) {
        int result = 0;
        int i = 0;
        for(int l : arr) {
            if(i == k - 1) {
                result = l;
                break;
            }
            i++;
        }
        return result;
    }

    
    public static int kthElement_Problem_2_848f2f38_61c1_47d8_8184_0c372a9c050e(ArrayList<Integer> arr, int k) {
        // TODO: Complete me!
        return -1;
    }

    
    public static int kthElement_Problem_2_fb9c0538_5592_47e9_87fb_ebefcd6a9b3b(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_fb539df9_89f3_4893_bbf9_9540b8ce294a(ArrayList<Integer> arr, int k) {
        int ret = 0;
        int last = 0;
        for (int i = 0; i < arr.size(); i++) {
            last = arr.get(i);
            if (k == 1) return last;
            k -= 1;
        }
        return ret;
    }

    
    public static int kthElement_Problem_0_e08270f9_ae8c_4952_b613_3313fe06b395(ArrayList<Integer> arr, int k) {
        if(arr.size() == 0 || k == 1) return arr.get(0);
        int low = 0, high = arr.size() - 1, mid = 0, count = 0;
        while(low < high) {
            mid = (low + high) / 2;
            if(count == k - 1) return arr.get(mid);
            if(count < k - 1) low = mid + 1;
            else high = mid - 1;
            count++;
        }
        return arr.get(mid);
    }

    
    public static int kthElement_Problem_0_3eed3344_65d7_441d_ae1d_b7002ce5438d(ArrayList<Integer> arr, int k) {
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_2dded4bc_c41d_461a_8980_708bd4ad5c5d(ArrayList<Integer> arr, int k) {
        int total = 0;
        for (int i = 1; i < k; i++) {
            total += arr.get(i);
        }
        return total;
    }

    
    public static int kthElement_Problem_2_889d37ff_9815_4bd8_add9_76977298ea02(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_f9d050b9_097b_4242_ad0f_cef471946275(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_5faeff5c_4216_4e46_9404_9f2796de445d(ArrayList<Integer> arr, int k) {
        // Write your code here
        int kth = arr.get(k-1);
        return kth;
    }

    
    public static int kthElement_Problem_1_3eed3344_65d7_441d_ae1d_b7002ce5438d(ArrayList<Integer> arr, int k) {
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_5e1f6917_33f1_47df_ad3a_c652e00659a5(ArrayList<Integer> arr, int k) {
        return arr.get(k - 1);
    }

    
    public static int kthElement_Problem_2_dfed0aed_b537_4372_9147_857d54b7d2fc(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_627df231_ee86_4189_96a3_49e984ce4d53(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_90c5416d_0e2b_45cc_886f_9a0c91e2ca6a(ArrayList<Integer> arr, int k) {
        // Write your code here
        int kthElement_Problem_0_90c5416d_0e2b_45cc_886f_9a0c91e2ca6a = arr.get(k - 1);
        return kthElement_Problem_0_90c5416d_0e2b_45cc_886f_9a0c91e2ca6a;
    }

    
    public static int kthElement_Problem_0_f57616f5_f846_49b8_8f7e_b2877fe98cd7(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_7676fce1_a495_4e50_9ad0_c4ec53a6fa5c(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int kthElement_Problem_0_7676fce1_a495_4e50_9ad0_c4ec53a6fa5c = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == k) {
                kthElement_Problem_0_7676fce1_a495_4e50_9ad0_c4ec53a6fa5c = arr.get(i);
                break;
            }
        }
        return kthElement_Problem_0_7676fce1_a495_4e50_9ad0_c4ec53a6fa5c;
    }

    
    public static int kthElement_Problem_0_d545055a_4a4a_4ea5_888b_ad93fb2ca2bb(ArrayList<Integer> arr, int k) {
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_fda6d31c_f69a_4af9_9997_d2f6cc9a21d9(ArrayList<Integer> arr, int k) {
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_8f6155a7_5e2f_4c8c_8a04_21f7e678d956(ArrayList<Integer> arr, int k) {
        int ans = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            ans = Math.min(ans, arr.get(i));
        }
        return ans;
    }

    
    public static int kthElement_Problem_2_6898ec70_b854_4fbc_8363_217c5f880f01(ArrayList<Integer> arr, int k) {
        if (k > arr.size())
            throw new IllegalArgumentException("k value is greater than the size of array");
        int firstElement = arr.get(0);
        int secondElement = arr.get(1);
        int index = 2; //kth is the first element
        int count = 0;
        while (index != arr.size()) {
            count += (firstElement + secondElement) * (index - 1);
            firstElement = secondElement;
            secondElement = arr.get(index++);
        }
        return count;
    }

    
    public static int kthElement_Problem_1_45e4c34e_6f98_4bf8_a0e0_4705554bf7a4(ArrayList<Integer> arr, int k) {
        int nthElem = -1;
        for (int i : arr) {
            nthElem = i;
        }
        return nthElem;
    }

    
    public static int kthElement_Problem_2_a07ad8ca_ec79_4786_9df2_11d4170d3093(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_c24e1253_77f3_4a38_b256_28a793792dc0(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_810ef9b8_f7b9_4b39_811e_89af943af3fe(ArrayList<Integer> arr, int k) {
        int result = 0;
        int count = 0;
        for (Integer i : arr) {
            if (count == k - 1) {
                result = i;
                break;
            }
            count++;
        }
        return result;
    }

    
    public static int kthElement_Problem_0_36475e1a_0c77_4965_ba38_cbc50692792f(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_289d38fb_7087_47b1_a357_cf5600f9d35f(ArrayList<Integer> arr, int k) {
        int res = arr.get(0);
        int cur = 0;
        for(int i = 1; i < arr.size(); i++){
            if(cur == k-1){
                break;
            }
            cur = cur + arr.get(i);
            res = res + cur;
        }
        return res;
    }

    
    public static int kthElement_Problem_0_ad19bc56_1c31_4e56_891f_0fc2b2910d2d(ArrayList<Integer> arr, int k) {
        int result = -1;
        int sum = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                result = arr.get(i-1);
                break;
            }
        }
        return result;
    }

    
    public static int kthElement_Problem_1_2ae6f64b_d6d7_4bc4_8930_2a0f822fc158(ArrayList<Integer> arr, int k) {
        int firstElement = arr.get(0);
        int lastElement = arr.get(arr.size()-1);
        int firstElementIndex = arr.indexOf(firstElement);
        int lastElementIndex = arr.lastIndexOf(lastElement);
        return ((firstElementIndex+lastElementIndex)/2)+(k-firstElementIndex)/arr.size()+1;
    }

    
    public static int kthElement_Problem_0_7b694316_18f9_486c_872a_bcba82da46d0(ArrayList<Integer> arr, int k) {
        int ans = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            ans = Math.min(ans, arr.get(i));
        }
        return ans;
    }

    
    public static int kthElement_Problem_2_225219df_fe64_44c6_b4c2_00befd22ed2c(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_e62d29a4_d1db_4f6b_9ede_4c56f4b9ea68(ArrayList<Integer> arr, int k) {
        int size = arr.size();
        if (size == 0) {
            return -1;
        }
        return arr.get( k - 1);
    }

    
    public static int kthElement_Problem_1_8bd96037_c543_45ce_9c52_b4da9eafcd0a(ArrayList<Integer> arr, int k) {
        int i;
        for(i = 0; i < arr.size(); i++) {
            if(k > arr.size() - i) {
                k = arr.size() - i;
            }
            if(k == i) {
                return arr.get(i);
            }
        }
        return 0;
    }

    
    public static int kthElement_Problem_0_c0878e5a_5d1e_4353_8589_f12c3d4c4f57(ArrayList<Integer> arr, int k) {
        if (arr.size() < k) return -1;
        
        int first = arr.get(0);
        int index = 0;
        int last = 0;
        while (first != last) {
            last = first;
            first = (first + index++) % arr.size();
        }
        return first;
    }

    
    public static int kthElement_Problem_0_c517743c_9ef0_4bda_9856_af63d0e232c5(ArrayList<Integer> arr, int k) {
        int count = 0;
        int result = -1;
        if(arr.size() == 0 || k == 0) {
            return result;
        }
        for(int i = 0; i < arr.size(); i++) {
            if(count == k) {
                result = arr.get(i);
                break;
            }
            count++;
        }
        return result;
    }

    
    public static int kthElement_Problem_1_66d85690_26f1_4214_9bca_cae995f38bd8(ArrayList<Integer> arr, int k) {
        int res = arr.get(0); // first element
        if (k == 0) return res;
        int next = 0;
        for (int i = 1; i < k; i++) // loop from i = 1 to k = length-1 to find kth element
        {
            next = arr.get(i); // next element in i
            if (next < res)
            {
                int temp = res; // store previous value in temp
                res = next; // update res 
                k = i; // update k 
            }
        }
        return res;
    }

    
    public static int kthElement_Problem_0_5e31a264_a45d_49f1_beaf_3eca78019d8c(ArrayList<Integer> arr, int k) {
        int count = 0;
        int firstVal = arr.get(0);
        int lastVal = arr.get(arr.size() - 1);
        int middleVal = (firstVal + lastVal) / 2;

        // if the k is 0, the given array is empty and 0 index is returned
        if (k == 0) {
            return firstVal;
        }

        // If k is less than the length of the array arr, then return -1
        if (k >= arr.size()) {
            return -1;
        }

        int previousVal = firstVal;
        // If k is even, then the middle value is the kth element of the given array.
        if (k % 2 == 0) {
            return middleVal;
        }

        // For every odd k, calculate the difference between previous kth element and middle value
        // and increment the count as per formula above
        for (int i = 1; i <= k; i++) {
            int temp = previousVal - middleVal;
            previousVal = middleVal;
            middleVal = temp;
            count++;
        }

        // If the kth element is not in the given array, then return -1
        if (count < k) {
            return -1;
        }

        // If the kth element is found at index k, then return the kth element
        return middleVal;
    }

    
    public static int kthElement_Problem_1_ea95b142_5f02_4594_8d26_736f8cede356(ArrayList<Integer> arr, int k) {
        int lastElement = -1;
        int firstElement = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) > lastElement) {
                lastElement = arr.get(i);
                firstElement = arr.get(i - 1);
            }
        }
        return firstElement;
    }

    
    public static int kthElement_Problem_1_4ccf4303_801b_4aa9_9240_1e8dd7ae0f53(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int kthElement_Problem_1_4ccf4303_801b_4aa9_9240_1e8dd7ae0f53 = 0;
        int size = arr.size();
        if(k > size) {
            return -1;
        }
        Collections.sort(arr);
        kthElement_Problem_1_4ccf4303_801b_4aa9_9240_1e8dd7ae0f53 = arr.get(k-1);
        return kthElement_Problem_1_4ccf4303_801b_4aa9_9240_1e8dd7ae0f53;
    }

    
    public static int kthElement_Problem_2_ed3267e6_4a9e_4cbb_b4f6_490652cba7fe(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_1ca23af8_d030_4d71_8d3e_a0e71d3846da(ArrayList<Integer> arr, int k) {
        int result = -1;
        int count = 0;
        for (Integer i : arr) {
            if (count == k - 1) {
                result = i;
                break;
            }
            count++;
        }
        return result;
    }

    
    public static int kthElement_Problem_0_5b366821_a469_44a7_bac4_fcca16f84c8d(ArrayList<Integer> arr, int k) {
        // Write your code here
        int size=arr.size();
        int sum=0;
        for(int i=0;i<size;i++){
            sum+=arr.get(i);
        }
        int num=sum/k;
        int result=0;
        for(int i=0;i<size;i++){
            result+=arr.get(i)*((num-sum)*i+1);
        }
        return result;
    }

    
    public static int kthElement_Problem_1_e7c31105_fbae_420f_8df2_1a8aeceb4fca(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_c7c4f2a2_8a9f_4e69_aff2_ccfe62b33859(ArrayList<Integer> arr, int k) {
        int count = 0;
        for (Integer i : arr) {
            count++;
            if (count == k) {
                return i;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_2_201f7589_21d1_4310_8b48_568717d68e9c(ArrayList<Integer> arr, int k) {
        return arr.get((k - 1));
    }

    
    public static int kthElement_Problem_2_1675accb_4ffd_4fa2_8205_83f88808bd30(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 1; i < k; i++){
            sum += arr.get(i - 1);
        }
        return sum;
    }

    
    public static int kthElement_Problem_0_81b402f8_ecb5_4a64_bf2a_421c275e64f5(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                return arr.get(i);
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_1_c67f2ee6_a3c4_4dee_a8f7_c308adc225f4(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_a07ad8ca_ec79_4786_9df2_11d4170d3093(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_40fd7961_27f2_4dff_8cd9_82d8126c0e11(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

}
