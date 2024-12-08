package mbpp_622_get_median;

public class mbpp_622_get_median {

    
    public static float getMedian_Problem_1_6cd88e66_716a_4aa2_a737_edd1e5cd3d81(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
            else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_80dc2bb8_b608_4ca5_ad2d_97115bc463c7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1;
        int m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                break;
            }
            else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_65792403_166e_459f_8ac0_fa175807a2dd(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int m1 = -1;
        int m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_dfd6481f_a6d5_4c80_ab7b_39d250590618(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0))/2.0;
        }
        int mid = arr1.size()/2;
        if(arr1.size()%2 == 0) {
            return (arr1.get(mid) + arr2.get(mid))/2.0;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_1_71b15cc5_4d84_44f8_ac17_1ad2f65f30fc(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() == arr2.size()) {
            int sum = 0;
            for(int i = 0; i < arr1.size(); i++) {
                sum += arr1.get(i);
            }
            for(int i = 0; i < arr2.size(); i++) {
                sum += arr2.get(i);
            }
            if(sum > n) {
                return getMedian_Problem_1_71b15cc5_4d84_44f8_ac17_1ad2f65f30fc(arr2, arr1, n);
            }
            else {
                return  (arr1.get(arr1.size()/2) + arr2.get(arr2.size()/2)) / 2;
            }
        }
        else {
            return  (arr1.get(arr1.size()/2) + arr2.get(arr2.size()/2)) / 2;
        }
    }

    
    public static float getMedian_Problem_0_009bace1_b805_48aa_aad6_6f7a0b8e435c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int mid1 = arr1.get((n/2));
        int mid2 = arr2.get((n/2));
        if(mid1 < mid2)
            median = mid1;
        else
            median = mid2;
        
        return median;
    }

    
    public static float getMedian_Problem_2_b98aed2d_5f08_48a3_b0fc_120a47640c47(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (i == n) {
                median += arr2.get(j);
                j++;
            } else if (j == n) {
                median += arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                median += arr1.get(i);
                i++;
            } else {
                median += arr2.get(j);
                j++;
            }
            count++;
            if (count == n) {
                return median / 2;
            }
        }
        if (arr1.get(i) < arr2.get(j)) {
            median += arr1.get(i);
        } else {
            median += arr2.get(j);
        }
        return median / 2;
    }

    
    public static float getMedian_Problem_1_de8e2326_44e0_4bda_abb0_40fca8d6c519(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int a1 = 0, a2 = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                a1 = arr1.get(i);
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                a2 = arr2.get(j);
                j++;
            } else {
                count++;
                i++;
                j++;
            }
        }
        if (count == n) {
            return  (a1 + a2) / 2;
        } else if (count < n) {
            return  a1;
        } else {
            return  a2;
        }
    }

    
    public static float getMedian_Problem_1_0e7f4001_594f_463f_b498_2a232a932d3a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int median = 0;
        int i = 0;
        int j = 0;
        int count;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(j);
                break;
            }
            if (j == n) {
                median = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        if (n % 2 == 0) {
            if (i == n) {
                return (median + arr2.get(j)) / 2;
            }
            if (j == n) {
                return (median + arr1.get(i)) / 2;
            }
            return (median + Math.min(arr1.get(i), arr2.get(j))) / 2;
        }
        return median;
    }

    
    public static float getMedian_Problem_0_a3db5259_bdee_4141_b8e0_eff1bdb5f3a4(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        int m1 = -1;
        int m2 = -1;
        while (count <= n) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0).intValue();
                break;
            }
            else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0).intValue();
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i).intValue();
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2.get(j).intValue();
                j++;
            }
            count++;
        }
        if (n % 2 == 0) {
            median = (m1 + m2) / 2;
        }
        else {
            median = m2;
        }
        return median;
    }

    
    public static float getMedian_Problem_1_f3cb5be7_55a0_49e6_9993_582c29587d4d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_32e8eff0_b3c8_4bdc_a243_0cc0e033f5d6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                median = arr2.get(j);
                break;
            }
            if (j == n) {
                median = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_2_f17ffdc4_2af6_46ac_9062_9275f35a6402(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_1_0b0b054d_10bb_49c7_9cb6_aee7897dcc16(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0).intValue();
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0).intValue();
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i).intValue();
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j).intValue();
                j++;
            }
        }
        median = (m1 + m2) / 2.0;
        return median;
    }

    
    public static float getMedian_Problem_2_96c8a81e_3c8e_4a7e_98fa_31a4915cd204(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_2_adf83b5f_0b8a_4302_8c0a_00db1c8a308a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        ArrayList < Integer > arr = new ArrayList < > ();
        for (Integer l : arr1) {
            arr.add(l);
        }
        for (Integer l : arr2) {
            arr.add(l);
        }
        Collections.sort(arr);
        if (n >= arr.size())
            n -= arr.size();
        return  n / 2;
    }

    
    public static float getMedian_Problem_1_250685a6_d1bd_4c52_b53e_286de2da9a32(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = n / 2;
        if (n % 2 == 0) {
            return getMedian_Problem_1_250685a6_d1bd_4c52_b53e_286de2da9a32(arr1, arr2, mid);
        } else {
            return getMedian_Problem_1_250685a6_d1bd_4c52_b53e_286de2da9a32(arr2, arr1, mid - 1);
        }
    }

    
    public static float getMedian_Problem_2_e9c10a10_fa58_4d6c_a0cf_f5f61cc599dc(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int sum = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                sum += arr1.get(i);
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                sum += arr2.get(j);
                j++;
            } else {
                sum += arr1.get(i);
                i++;
                j++;
            }
        }
        while (i < arr1.size()) {
            sum += arr1.get(i);
            i++;
        }
        while (j < arr2.size()) {
            sum += arr2.get(j);
            j++;
        }
        return  sum / n;
    }

    
    public static float getMedian_Problem_0_82d86032_64ed_47df_8c01_602dedc61930(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_2_dc3cff7d_629b_4db3_b22f_478ff1ffe04c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0).intValue();
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0).intValue();
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i).intValue();
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j).intValue();
                j++;
            }
        }
        median = (m1 + m2) / 2;
        return median;
    }

    
    public static float getMedian_Problem_1_f4148fd5_b67a_49f4_9052_5bd075dafba7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_47f14cb9_2049_4db4_8135_6bf85eac05b6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2.0;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2.0;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_2_7b332b9c_cda0_4953_98d2_467fed8ef036(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get( j);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get( i);
                break;
            }
            if (arr1.get( i) < arr2.get( j)) {
                m1 = m2;
                m2 = arr1.get( i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get( j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_1_7b332b9c_cda0_4953_98d2_467fed8ef036(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get( j);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get( i);
                break;
            }
            if (arr1.get( i) < arr2.get( j)) {
                m1 = m2;
                m2 = arr1.get( i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get( j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_0_638450b2_f2b3_404a_b91f_975c8e1edf08(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        //write your code
        int i = (arr1.size() + arr2.size()) / 2;
        float mid1 = getMedian_Problem_0_638450b2_f2b3_404a_b91f_975c8e1edf08(arr1, arr2, i);
        float mid2 = getMedian_Problem_0_638450b2_f2b3_404a_b91f_975c8e1edf08(arr2, arr1, i);
        return (mid1 + mid2) / 2;
    }

    
    public static float getMedian_Problem_2_eb61b29b_62e7_42a7_8d9d_f7328281e10f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = (arr1.size() + arr2.size()) / 2;
        if (arr1.size() > arr2.size()) {
            return getMedian_Problem_2_eb61b29b_62e7_42a7_8d9d_f7328281e10f(arr2, arr1, mid);
        } else {
            return getMedian_Problem_2_eb61b29b_62e7_42a7_8d9d_f7328281e10f(arr1, arr2, mid);
        }
    }

    
    public static float getMedian_Problem_2_b1826fad_f935_4046_9b4a_913badb03189(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_18d6e0b4_bd86_4dcd_b71a_a8f0ff7e21b3(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0;
        int j = 0;
        int count;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_2_6f4835ef_45c7_4ef4_a9fc_4f49ae72be79(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                count++;
                i++;
                j++;
            }
        }
        if (count == n) {
            return  ((arr1.get(i - 1) + arr2.get(j - 1)) / 2);
        } else if (count < n) {
            return  arr1.get(i - 1);
        } else {
            return  arr2.get(j - 1);
        }
    }

    
    public static float getMedian_Problem_1_8afc9655_1bf5_4043_a24d_be468e4e894c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_2_28a68fd8_575e_4887_b9ca_4e2bddd784d1(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int size = arr1.size();
        if(size != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if(size == 1) {
            return  arr1.get(0);
        }
        if(size == 2) {
            return  (arr1.get(0) + arr2.get(0)) / 2.0;
        }
        int mid = size / 2;
        int i = 0;
        int j = 0;
        while(i < mid && j < mid) {
            if(arr1.get(i) < arr2.get(j)) {
                i++;
            } else if(arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if(i == mid) {
            return  arr1.get(i);
        } else if(j == mid) {
            return  arr2.get(j);
        } else {
            return  (arr1.get(i) + arr2.get(j)) / 2.0;
        }
    }

    
    public static float getMedian_Problem_1_3bfe6c83_5bc1_402f_8b0a_348b4b0df7d2(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays should be of same size");
        }
        if (arr1.size() == 0) {
            throw new IllegalArgumentException("The two arrays should be non-empty");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2.0;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2.0;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_2_ffc204d0_d55e_44b0_a3d0_7632dc9408da(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr1.get(1)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_1_cc5e385a_615d_4e58_8621_7f77484ddcb2(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = n / 2;
        int sum1 = 0, sum2 = 0;
        float median;
        for(int i = 0; i < n; i++) {
            sum1 += arr1.get(i);
            sum2 += arr2.get(i);
        }
        float average1 = sum1 / n;
        float average2 = sum2 / n;
        float diff1 = average1 - average2;
        float diff2 = average2 - average1;
        float diff = (diff1 + diff2) / 2;
        median = diff;
        return median;
    }

    
    public static float getMedian_Problem_0_e77c5f4d_f7a3_4811_8b1f_5021ef320f7f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() < 1 || arr2.size() < 1) {
            return Float.NaN;
        }
        int median = arr1.get(arr1.size() / 2);
        int med = (arr1.size() / 2);
        int median2 = arr2.get(arr2.size() / 2);
        int med2 = (arr2.size() / 2);

        int m1 = arr1.get(arr1.size() / 2);
        int m2 = arr2.get(arr2.size() / 2);

        int m1med = (arr1.size() / 2);
        int m2med = (arr2.size() / 2);

        if (arr1.get(arr1.size() / 2).equals(arr2.get(arr2.size() / 2))) {
            return m1;
        }
        if (m1 < med) {
            if (m2 < med2) {
                return m2;
            }
        }
        if (m1 > med) {
            if (m2 > med2) {
                return m1;
            }
        }
        return m1;
    }

    
    public static float getMedian_Problem_0_bc1eb431_c49f_4a0b_b087_56f0a6264004(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            return -1;
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if(arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_2_f4148fd5_b67a_49f4_9052_5bd075dafba7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_750b4722_07f9_4d4c_9261_16afe6d7c3cb(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("Arrays must be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int left = 0;
        int right = arr1.size() - 1;
        while (left < right) {
            if (arr1.get(left) < arr1.get(right)) {
                left++;
            } else {
                right--;
            }
        }
        if (arr1.get(left) < arr2.get(left)) {
            left++;
        }
        if (arr1.get(right) < arr2.get(right)) {
            right--;
        }
        if (left == right) {
            return arr1.get(left);
        }
        if (left == right - 1) {
            return (arr1.get(left) + arr2.get(right)) / 2;
        }
        if (left == right + 1) {
            return (arr1.get(left) + arr2.get(right)) / 2;
        }
        return (arr1.get(left) + arr2.get(right)) / 2;
    }

    
    public static float getMedian_Problem_0_3e20dd10_e7b4_4b80_b615_a9b9f175aa55(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        median = (m1 + m2) / 2.0;
        return median;
    }

    
    public static float getMedian_Problem_1_69d7b38c_877a_48df_a4bb_9e5f5083e01c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_2_cab72c27_4271_4468_a711_0d072b6f7531(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int median = 0;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(j);
                break;
            }
            if (j == n) {
                median = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_1_7f4224a9_ac1e_4808_a5f1_e3589498402d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_128e3907_d63f_41a8_9994_0655518f7ed0(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                median = arr2.get(j);
                break;
            }
            if (j == n) {
                median = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_2_3d765a3c_80a7_4beb_aeef_a0cda973f88b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_1_10aec405_4f20_476d_8676_efa32722ccbe(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count = 0;
        int m1 = -1;
        int m2 = -1;
        while (count <= n) {
            count++;
            if (i == n) {
                m1 = m2;
                m2 = arr2.get( j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get( i);
                i++;
            } else if (arr1.get( i) < arr2.get( j)) {
                m1 = m2;
                m2 = arr1.get( i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get( j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_2_feeacedf_4a3e_40e1_b9d1_57f6854e72fa(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_bfef20d7_c4d6_4d77_895c_ec51656d56ed(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr1.get(1)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_1_f46a7e7b_73a6_4fcd_9f89_115e26eaa9eb(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() == arr2.size()) {
            int sum = 0;
            for (int i = 0; i < arr1.size(); i++) {
                sum += arr1.get(i);
            }
            for (int i = 0; i < arr2.size(); i++) {
                sum += arr2.get(i);
            }
            if (sum % 2 == 0) {
                return  ((arr1.get(arr1.size() / 2) + arr2.get(arr2.size() / 2)) / 2);
            } else {
                return  (arr1.get(arr1.size() / 2) + arr2.get(arr2.size() / 2)) / 2;
            }
        } else {
            return  (arr1.get(arr1.size() / 2) + arr2.get(arr2.size() / 2)) / 2;
        }
    }

    
    public static float getMedian_Problem_1_7ac07718_2d30_4251_b6de_6f6b3c0ffe61(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_f17ffdc4_2af6_46ac_9062_9275f35a6402(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_1_be115c87_c5d4_4267_99d9_8bada5ac99df(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_ec60c9df_d621_4591_b54a_971b5e0b8d94(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_b11cb5ba_59e6_4257_9df9_a68999fd5734(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two array lists should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_0_c761e60a_8247_4ac4_861f_c3cd41f1ae77(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_0_cdf642e4_6841_402b_8713_fee83df5f561(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int sum = 0;
        int mid = n/2;
        for(int i = 0; i < n; i++) {
            sum += arr1.get(i);
        }
        for(int i = 0; i < n; i++) {
            sum += arr2.get(i);
        }
        float median =  sum/n;
        return median;
    }

    
    public static float getMedian_Problem_0_237a89d9_e3a5_4f0c_9e04_862c25dce8eb(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_1_44b5dd90_5406_4756_ac4c_03ab7584e9a9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            }
            else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_3ca95e37_38bf_45d3_9b86_e364d597cad9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if(arr1.size() == 0) {
            throw new IllegalArgumentException("The two arrays are empty");
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0))/2;
        }
        int mid = arr1.size()/2;
        if(arr1.size()%2 == 0) {
            return (arr1.get(mid) + arr2.get(mid))/2;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_2_0616ac5c_e841_4c02_9b7e_8000baa9012c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_2c4119eb_6f24_4c0e_b64c_38966edf3ebe(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = (n + 1) / 2;
        if (arr1.size() > arr2.size()) {
            int leftSum = 0;
            int rightSum = 0;
            for (int i = 0; i < n; i++) {
                leftSum += arr1.get(i);
                rightSum += arr2.get(i);
            }
            return ( leftSum + rightSum) / n;
        } else {
            int leftSum = 0;
            int rightSum = 0;
            for (int i = 0; i < n; i++) {
                leftSum += arr2.get(i);
                rightSum += arr1.get(i);
            }
            return ( leftSum + rightSum) / n;
        }
    }

    
    public static float getMedian_Problem_2_78f2d935_c9e3_4fdc_8b1e_94d9b09201a5(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        int m1 = -1;
        int m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0).intValue();
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0).intValue();
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i).intValue();
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j).intValue();
                j++;
            }
        }
        median = (m1 + m2) / 2;
        return median;
    }

    
    public static float getMedian_Problem_2_fd7c27e8_f9f5_4e9d_a60d_65e636a067ad(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int median = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        while (count <= n) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_1_13b6cba2_a853_4028_bcaa_856bfd70fa87(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0;
        int j = 0;
        int count;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_0_b9b5c53d_9026_42d6_97ca_304040fdf66b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        // Your code here
        int median = 0;
        int median1 = 0;
        int median2 = 0;
        int i = 0;
        int j = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                median1 = median2;
                median2 = arr2.get(0);
                break;
            } else if (j == n) {
                median1 = median2;
                median2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median1 = median2;
                median2 = arr1.get(i);
                i++;
            } else {
                median1 = median2;
                median2 = arr2.get(j);
                j++;
            }
        }
        median = (median1 + median2) / 2;
        return median;
    }

    
    public static float getMedian_Problem_0_d18b9bda_1dd3_4c2a_bc82_391d45798b46(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = n / 2;
        if (arr1.size() > arr2.size()) {
            ArrayList<Integer> temp = new ArrayList<Integer>(arr2);
            temp.removeAll(arr1);
            return getMedian_Problem_0_d18b9bda_1dd3_4c2a_bc82_391d45798b46(arr1, temp, n);
        }
        if (arr1.size() < arr2.size()) {
            ArrayList<Integer> temp = new ArrayList<Integer>(arr1);
            temp.removeAll(arr2);
            return getMedian_Problem_0_d18b9bda_1dd3_4c2a_bc82_391d45798b46(arr2, temp, n);
        }
        if (arr1.size() == arr2.size()) {
            ArrayList<Integer> temp = new ArrayList<Integer>(arr1);
            temp.removeAll(arr2);
            int sum = 0;
            for (int i : temp) {
                sum += i;
            }
            float median =  sum / n;
            return median;
        }
        return -1;
    }

    
    public static float getMedian_Problem_0_a638c70b_3c62_456e_9021_e11979d49504(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("Arrays must be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while (i < mid) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (arr1.size() % 2 == 0) {
            return (arr1.get(i) + arr2.get(j)) / 2;
        } else {
            return arr1.get(i);
        }
    }

    
    public static float getMedian_Problem_2_7e1aeb3e_93e6_4db3_8d07_5c93b66fcdec(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_dd37a666_5be3_43c1_b522_e7dd4a002387(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                count++;
                i++;
                j++;
            }
        }
        if (count == n) {
            return (arr1.get(i - 1) + arr2.get(j - 1)) / 2.0;
        } else if (count < n) {
            return arr1.get(i - 1);
        } else {
            return arr2.get(j - 1);
        }
    }

    
    public static float getMedian_Problem_2_727addcf_e2c0_4f89_85d7_062a978dc52c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = (arr1.size() + arr2.size()) / 2;
        if (arr1.size() > arr2.size()) {
            return getMedian_Problem_2_727addcf_e2c0_4f89_85d7_062a978dc52c(arr1, arr2, mid);
        } else {
            return getMedian_Problem_2_727addcf_e2c0_4f89_85d7_062a978dc52c(arr2, arr1, mid);
        }
    }

    
    public static float getMedian_Problem_2_e3b3fea4_3d05_4186_beb5_833bf0f12bf0(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_1_4a93b853_ceb4_4432_9b4f_b16221e7699c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        if (arr1.size() <= arr2.size()) {
            for (int i = 0; i < arr1.size(); i++) {
                list.add(arr1.get(i));
            }
            for (int i = 0; i < arr2.size(); i++) {
                list.add(arr2.get(i));
            }
            int index = list.size() / 2;
            float median;
            if (list.size() % 2 == 1) {
                median = list.get(index);
            } else {
                median = ((list.get(index) + list.get(index + 1))) / 2;
            }
            return median;
        }
        return -1;
    }

    
    public static float getMedian_Problem_1_be5615e8_6129_46c0_a560_92edac9efb3f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two array lists should be of same size");
        }
        if(arr1.size() == 0) {
            return 0;
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if(arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_0_00ee4a08_3264_483c_9778_f3756246d69b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_a3db5259_bdee_4141_b8e0_eff1bdb5f3a4(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        int m1 = -1;
        int m2 = -1;
        while (count <= n) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0).intValue();
                break;
            }
            else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0).intValue();
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i).intValue();
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2.get(j).intValue();
                j++;
            }
            count++;
        }
        if (n % 2 == 0) {
            median = (m1 + m2) / 2;
        }
        else {
            median = m2;
        }
        return median;
    }

    
    public static float getMedian_Problem_2_dfce2c98_6b05_4301_adc3_564c720db662(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_2_3a97bba8_a2ea_4502_8637_c79208fbad58(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_4bc28496_75af_454c_b2c6_d45095a365ad(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        Collections.sort(arr1);
        Collections.sort(arr2);
        if (arr1.size() >= arr2.size()) {
            return (arr1.get((arr1.size() / 2) + 1)
                    - arr2.get((arr2.size() / 2) + 1)) / 2.0;
        } else {
            return arr1.get((arr1.size() / 2)) - arr2.get((arr2.size() / 2)) / 2.0;
        }
    }

    
    public static float getMedian_Problem_2_41272288_bd2d_4d26_9c47_faa85e8463aa(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (n == 1) {
            return arr1.get(0) + arr2.get(0) / 2;
        }
        if (arr1.size() == arr2.size()) {
            ArrayList<Integer> smaller = new ArrayList<Integer>(arr1);
            smaller.removeAll(new ArrayList<Integer>(arr2));
            if (smaller.isEmpty()) {
                return arr1.get(arr1.size() / 2);
            }
            return arr1.get((arr1.size() / 2)) + getMedian_Problem_2_41272288_bd2d_4d26_9c47_faa85e8463aa(arr2, arr2, n - 1);
        }
        if (arr2.size() == arr1.size()) {
            ArrayList<Integer> smaller = new ArrayList<Integer>(arr2);
            smaller.removeAll(new ArrayList<Integer>(arr1));
            if (smaller.isEmpty()) {
                return arr2.get(arr2.size() / 2);
            }
            return arr2.get((arr2.size() / 2)) + getMedian_Problem_2_41272288_bd2d_4d26_9c47_faa85e8463aa(arr1, arr1, n - 1);
        }
        if (arr1.size() > arr2.size()) {
            return getMedian_Problem_2_41272288_bd2d_4d26_9c47_faa85e8463aa(arr1, new ArrayList<Integer>(arr2), n - 1);
        }
        if (arr2.size() > arr1.size()) {
            return getMedian_Problem_2_41272288_bd2d_4d26_9c47_faa85e8463aa(new ArrayList<Integer>(arr1), arr2, n - 1);
        }
        return getMedian_Problem_2_41272288_bd2d_4d26_9c47_faa85e8463aa(arr1, arr2, n - 1);
    }

    
    public static float getMedian_Problem_1_679338b5_aaac_423f_8f1a_b0a2ba1cc45c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = (arr1.size() + arr2.size()) / 2;
        if (arr1.size() > arr2.size()) {
            return getMedian_Problem_1_679338b5_aaac_423f_8f1a_b0a2ba1cc45c(arr1, arr2, mid);
        } else {
            return getMedian_Problem_1_679338b5_aaac_423f_8f1a_b0a2ba1cc45c(arr2, arr1, mid);
        }
    }

    
    public static float getMedian_Problem_1_7668f170_5406_48db_9116_1bffac18d010(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median =  0;
        if (arr1.size() > arr2.size()) {
            for (int i = 0; i < n; i++) {
                int l1 = arr1.get(i);
                int l2 = arr2.get(i);
                median += (l1 + l2) / 2;
            }
        } else {
            for (int i = 0; i < n; i++) {
                int l1 = arr1.get(i);
                int l2 = arr2.get(i);
                median += l1 + l2;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_2_72649417_907d_44a5_a548_0bd6e0d3246d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_1_cab72c27_4271_4468_a711_0d072b6f7531(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int median = 0;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(j);
                break;
            }
            if (j == n) {
                median = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_1_b31401e6_aaf7_4e00_bb21_7b637a8fe693(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while(count < n) {
            if(arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            }
            else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_1_a151771c_d526_4ca6_bdfa_bc46978ea099(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get( j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get( i);
                i++;
            } else if (arr1.get( i) < arr2.get( j)) {
                m1 = m2;
                m2 = arr1.get( i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get( j);
                j++;
            }
        }
        median = (m1 + m2) / 2;
        return median;
    }

    
    public static float getMedian_Problem_2_b330e4fc_7704_49ad_8ff8_5c43c04774b7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        // TODO: Write your code here
        return 0;
    }

    
    public static float getMedian_Problem_0_a3290dc7_154b_4eab_a7cf_74ed5e15d44b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two array lists should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int left = 0;
        int right = arr1.size() - 1;
        while (left <= right) {
            if (arr1.get(left) < arr2.get(mid)) {
                left++;
            } else if (arr1.get(right) > arr2.get(mid)) {
                right--;
            } else {
                break;
            }
        }
        if (left == right) {
            return arr1.get(left);
        }
        if (left == 0) {
            return arr2.get(mid);
        }
        if (right == arr1.size() - 1) {
            return arr1.get(right);
        }
        return (arr1.get(left) + arr2.get(mid)) / 2;
    }

    
    public static float getMedian_Problem_2_e3a95816_b8f9_4802_a4d8_b9a7df697b45(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        // if n is odd, then median is middle element of sorted array
        // if n is even, then median is average of middle two elements of sorted array
        int median1 = 0, median2 = 0;
        int i = 0, j = 0;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                median1 = median2;
                median2 = arr2.get(0);
                break;
            } else if (j == n) {
                median1 = median2;
                median2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median1 = median2;
                median2 = arr1.get(i);
                i++;
            } else {
                median1 = median2;
                median2 = arr2.get(j);
                j++;
            }
        }
        return (median1 + median2) / 2;
    }

    
    public static float getMedian_Problem_0_abc93be9_1578_494a_8ad5_28f314e02b6c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_1_f4d09052_70b7_43cd_a0ab_e13cdd212404(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = n / 2;
        int leftSum = 0;
        int rightSum = 0;
        int leftCount = 0;
        int rightCount = 0;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            sum += arr1.get(i);
            count++;
        }
        for (int i = 0; i < n; i++) {
            sum += arr2.get(i);
            count++;
        }
        leftSum = sum / count;
        rightSum = sum / count;
        leftCount = count;
        rightCount = count;
        for (int i = 0; i < n; i++) {
            if (arr1.get(i) < leftSum) {
                leftCount--;
                leftSum += arr1.get(i);
            } else if (arr1.get(i) > leftSum) {
                rightCount--;
                rightSum += arr1.get(i);
            }
            if (arr2.get(i) < rightSum) {
                leftCount--;
                leftSum += arr2.get(i);
            } else if (arr2.get(i) > rightSum) {
                rightCount--;
                rightSum += arr2.get(i);
            }
        }
        if (leftCount > rightCount) {
            return leftSum;
        } else {
            return rightSum;
        }
    }

    
    public static float getMedian_Problem_2_f1056099_cbaf_4bab_bf74_0ca944aedb61(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int mid = 0;
        int size = arr1.size();
        if (size != arr2.size()) {
            return -1;
        }
        if (size == 1) {
            return  arr1.get(0);
        }
        if (size == 2) {
            return  (arr1.get(0) + arr2.get(0)) / 2;
        }
        while (i < size && j < size) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (i == size) {
            mid = arr2.get(j);
        } else if (j == size) {
            mid = arr1.get(i);
        } else {
            mid = (arr1.get(i) + arr2.get(j)) / 2;
        }
        return  mid / n;
    }

    
    public static float getMedian_Problem_0_345d8077_058a_4ebc_bc8e_d1f025466cdc(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_2_009bace1_b805_48aa_aad6_6f7a0b8e435c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int mid1 = arr1.get((n/2));
        int mid2 = arr2.get((n/2));
        if(mid1 < mid2)
            median = mid1;
        else
            median = mid2;
        
        return median;
    }

    
    public static float getMedian_Problem_0_258f2e2b_e13c_439e_9a80_6f668ee07476(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() == arr2.size()) {
            int sum = 0;
            for (int i = 0; i < arr1.size(); i++) {
                sum += arr1.get(i);
            }
            for (int i = 0; i < arr2.size(); i++) {
                sum += arr2.get(i);
            }
            if (sum % 2 == 0) {
                return  ((arr1.get(arr1.size() / 2) + arr2.get(arr2.size() / 2)) / 2);
            } else {
                return  (arr1.get(arr1.size() / 2) + arr2.get(arr2.size() / 2)) / 2;
            }
        } else {
            return  (arr1.get(arr1.size() / 2) + arr2.get(arr2.size() / 2)) / 2;
        }
    }

    
    public static float getMedian_Problem_1_dd37a666_5be3_43c1_b522_e7dd4a002387(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                count++;
                i++;
                j++;
            }
        }
        if (count == n) {
            return (arr1.get(i - 1) + arr2.get(j - 1)) / 2.0;
        } else if (count < n) {
            return arr1.get(i - 1);
        } else {
            return arr2.get(j - 1);
        }
    }

    
    public static float getMedian_Problem_2_d25d98b3_3382_4e86_a821_9d3623773c36(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_1c7e6c3b_7929_4cd6_aaa3_a977635c8174(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_4f881abf_5880_4177_8c6f_a33cecd1fd48(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_1_2c0797c3_81b0_4984_9d24_14669f2ac28f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                count++;
                i++;
                j++;
            }
        }
        if (count == n) {
            return (arr1.get(i - 1) + arr2.get(j - 1)) / 2.0;
        } else if (count < n) {
            return arr1.get(i - 1);
        } else {
            return arr2.get(j - 1);
        }
    }

    
    public static float getMedian_Problem_2_e77c5f4d_f7a3_4811_8b1f_5021ef320f7f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() < 1 || arr2.size() < 1) {
            return Float.NaN;
        }
        int median = arr1.get(arr1.size() / 2);
        int med = (arr1.size() / 2);
        int median2 = arr2.get(arr2.size() / 2);
        int med2 = (arr2.size() / 2);

        int m1 = arr1.get(arr1.size() / 2);
        int m2 = arr2.get(arr2.size() / 2);

        int m1med = (arr1.size() / 2);
        int m2med = (arr2.size() / 2);

        if (arr1.get(arr1.size() / 2).equals(arr2.get(arr2.size() / 2))) {
            return m1;
        }
        if (m1 < med) {
            if (m2 < med2) {
                return m2;
            }
        }
        if (m1 > med) {
            if (m2 > med2) {
                return m1;
            }
        }
        return m1;
    }

    
    public static float getMedian_Problem_1_4b657e32_b912_40a2_b859_6f57c3583e52(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = (n + 1) / 2;
        if (arr1.size() > arr2.size()) {
            return getMedian_Problem_1_4b657e32_b912_40a2_b859_6f57c3583e52(arr2, arr1, mid);
        }
        if (arr1.size() < arr2.size()) {
            return getMedian_Problem_1_4b657e32_b912_40a2_b859_6f57c3583e52(arr1, arr2, mid);
        }
        if (arr1.size() == arr2.size()) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr1.get(i);
            }
            int sum2 = 0;
            for (int i = 0; i < n; i++) {
                sum2 += arr2.get(i);
            }
            return sum / n + (sum2 / n - sum / n) / 2;
        }
        return -1;
    }

    
    public static float getMedian_Problem_0_dc3cff7d_629b_4db3_b22f_478ff1ffe04c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0).intValue();
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0).intValue();
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i).intValue();
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j).intValue();
                j++;
            }
        }
        median = (m1 + m2) / 2;
        return median;
    }

    
    public static float getMedian_Problem_2_a6cd8351_b02b_49b5_9afd_40b3de8cd5ae(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays should be of same size");
        }
        if(arr1.size() == 0) {
            return 0;
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr1.get(1)) / 2;
        }
        int mid = arr1.size() / 2;
        if(arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_0_d1d1dbd1_3ccb_4ed9_aed4_faa902cc5ea6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = n / 2;
        int leftSum = 0;
        int rightSum = 0;
        int sum = 0;
        for (int i = 0; i < mid; i++) {
            leftSum += arr1.get(i);
            rightSum += arr2.get(i);
            sum += arr1.get(i);
        }
        float median =  (sum / 2);
        if (leftSum == rightSum) {
            return median;
        }
        if (leftSum > rightSum) {
            int temp = leftSum;
            leftSum = rightSum;
            rightSum = temp;
        }
        float leftMedian =  (leftSum / 2);
        float rightMedian =  (rightSum / 2);
        if (leftMedian * rightMedian > median) {
            return leftMedian;
        } else {
            return rightMedian;
        }
    }

    
    public static float getMedian_Problem_0_0b4f1f9d_d955_4591_9243_04d8b7176048(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        int m1 = -1;
        int m2 = -1;
        while (count <= n) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0).intValue();
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0).intValue();
                break;
            }
            if (arr1.get(i).intValue() < arr2.get(j).intValue()) {
                m1 = m2;
                m2 = arr1.get(i).intValue();
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j).intValue();
                j++;
            }
            count++;
        }
        median = (m1 + m2) / 2.0;
        return median;
    }

    
    public static float getMedian_Problem_0_3cf89387_02fd_4387_8dca_5a6c3f012306(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int size = arr1.size();
        if (size != arr2.size()) {
            return -1;
        }
        if (size == 0) {
            return -1;
        }
        if (size == 1) {
            return arr1.get(0);
        }
        int mid = size / 2;
        int i = 0;
        int j = 0;
        while (i < mid && j < mid) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (i == mid) {
            return arr1.get(i);
        } else if (j == mid) {
            return arr2.get(j);
        } else {
            return (arr1.get(i) + arr2.get(j)) / 2;
        }
    }

    
    public static float getMedian_Problem_2_392772f9_fd66_4644_af9c_9a8d02c1ca8d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int mid = (arr1.size() + arr2.size()) / 2;
        if (arr1.size() == arr2.size()) {
            while (i < arr1.size() && j < arr2.size()) {
                if (arr1.get(i) < arr2.get(j)) {
                    i++;
                } else if (arr1.get(i) > arr2.get(j)) {
                    j++;
                } else {
                    i++;
                    j++;
                }
            }
            if (i == arr1.size()) {
                return arr2.get(j);
            } else if (j == arr2.size()) {
                return arr1.get(i);
            } else {
                return (arr1.get(i) + arr2.get(j)) / 2.0;
            }
        } else if (arr1.size() > arr2.size()) {
            while (i < arr1.size() && j < arr2.size()) {
                if (arr1.get(i) < arr2.get(j)) {
                    i++;
                } else if (arr1.get(i) > arr2.get(j)) {
                    j++;
                } else {
                    i++;
                    j++;
                }
            }
            if (i == arr1.size()) {
                return arr2.get(j);
            } else {
                return arr1.get(i);
            }
        } else {
            while (i < arr1.size() && j < arr2.size()) {
                if (arr1.get(i) < arr2.get(j)) {
                    i++;
                } else if (arr1.get(i) > arr2.get(j)) {
                    j++;
                } else {
                    i++;
                    j++;
                }
            }
            if (i == arr1.size()) {
                return arr2.get(j);
            } else {
                return arr1.get(i);
            }
        }
    }

    
    public static float getMedian_Problem_0_727addcf_e2c0_4f89_85d7_062a978dc52c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = (arr1.size() + arr2.size()) / 2;
        if (arr1.size() > arr2.size()) {
            return getMedian_Problem_0_727addcf_e2c0_4f89_85d7_062a978dc52c(arr1, arr2, mid);
        } else {
            return getMedian_Problem_0_727addcf_e2c0_4f89_85d7_062a978dc52c(arr2, arr1, mid);
        }
    }

    
    public static float getMedian_Problem_2_9453ac82_b84e_4c99_9a19_b7251d7e77bf(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_e77c5f4d_f7a3_4811_8b1f_5021ef320f7f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() < 1 || arr2.size() < 1) {
            return Float.NaN;
        }
        int median = arr1.get(arr1.size() / 2);
        int med = (arr1.size() / 2);
        int median2 = arr2.get(arr2.size() / 2);
        int med2 = (arr2.size() / 2);

        int m1 = arr1.get(arr1.size() / 2);
        int m2 = arr2.get(arr2.size() / 2);

        int m1med = (arr1.size() / 2);
        int m2med = (arr2.size() / 2);

        if (arr1.get(arr1.size() / 2).equals(arr2.get(arr2.size() / 2))) {
            return m1;
        }
        if (m1 < med) {
            if (m2 < med2) {
                return m2;
            }
        }
        if (m1 > med) {
            if (m2 > med2) {
                return m1;
            }
        }
        return m1;
    }

    
    public static float getMedian_Problem_2_8ef91bb3_3a6e_4287_9737_09ccb1561c07(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median;
        if (arr1.size() >= arr2.size()) {
            median =  getMedian_Problem_2_8ef91bb3_3a6e_4287_9737_09ccb1561c07(arr1, arr2, arr2.size());
        } else {
            median =  getMedian_Problem_2_8ef91bb3_3a6e_4287_9737_09ccb1561c07(arr2, arr1, arr1.size());
        }
        return median;
    }

    
    public static float getMedian_Problem_0_0a37d382_b353_4a42_a514_61e8c8c88e5c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_0_0e7f4001_594f_463f_b498_2a232a932d3a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int median = 0;
        int i = 0;
        int j = 0;
        int count;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(j);
                break;
            }
            if (j == n) {
                median = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        if (n % 2 == 0) {
            if (i == n) {
                return (median + arr2.get(j)) / 2;
            }
            if (j == n) {
                return (median + arr1.get(i)) / 2;
            }
            return (median + Math.min(arr1.get(i), arr2.get(j))) / 2;
        }
        return median;
    }

    
    public static float getMedian_Problem_0_fc0277e6_4361_4114_af20_4815cc7edd93(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int size = arr1.size();
        if (size != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (size == 1) {
            return  arr1.get(0);
        }
        if (size == 2) {
            return  (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = size / 2;
        int i = 0;
        int j = 0;
        while (i < mid && j < mid) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (i == mid) {
            return  arr1.get(i);
        }
        if (j == mid) {
            return  arr2.get(j);
        }
        if (arr1.get(i) < arr2.get(j)) {
            return  (arr1.get(i) + arr2.get(j)) / 2;
        } else {
            return  (arr1.get(i) + arr2.get(j)) / 2;
        }
    }

    
    public static float getMedian_Problem_0_074694df_a7f7_487d_9998_086abe379425(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            }
            else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_df7b0710_7ac9_41e8_abf0_f26a95cbed90(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_0_f3cb5be7_55a0_49e6_9993_582c29587d4d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_1d6924bd_19a2_4369_9ddb_11680079ff5b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr1.get(1)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_2_36de7655_aea4_4fa5_a08c_30fcfafb17d2(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_1_fbf91551_1a10_4347_ae8c_06cf9d4d8760(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int size = arr1.size();
        int size2 = arr2.size();
        int size3 = size + size2;
        if (size3 % 2 == 0) {
            return  ((arr1.get(i) + arr2.get(j)) / 2);
        } else {
            return  arr1.get(i);
        }
    }

    
    public static float getMedian_Problem_1_7c852d97_ffeb_4f16_91c9_ddd90aa899de(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
            else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_9f232f7a_dea2_4e60_9bfd_ba8c9a77a38d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() == arr2.size()) {
            int i = 0;
            int j = 0;
            int k = 0;
            while (i < arr1.size() && j < arr2.size()) {
                if (arr1.get(i) < arr2.get(j)) {
                    i++;
                } else if (arr1.get(i) > arr2.get(j)) {
                    j++;
                } else {
                    k++;
                    i++;
                    j++;
                }
            }
            if (k == n / 2) {
                return  (arr1.get(i - 1) + arr2.get(j - 1)) / 2;
            } else if (k < n / 2) {
                return arr1.get(i - 1);
            } else {
                return arr2.get(j - 1);
            }
        } else {
            return -1;
        }
    }

    
    public static float getMedian_Problem_1_442d8240_7a54_499a_9efb_576380e54952(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_1296c4ec_cadc_4ec2_b651_b7af90c1eeaf(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_3d829aee_fe40_4a3b_beb2_9009eea39e04(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr1.get(1)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_0_b27cb000_7c0a_4950_b127_cc313e9a9e9a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int leftIndex=Integer.MAX_VALUE;
        int rightIndex=0;
        int size=arr1.size()+arr2.size();
        for(int i=0;i<n;i++)
        {
            if(i>leftIndex&&i<rightIndex)
            {
                if(arr1.get(i)<arr2.get(i))
                    return (arr1.get(i)<arr2.get(i))?arr1.get(i):arr2.get(i);
                else
                    return (arr1.get(i)<arr2.get(i))?arr2.get(i):arr1.get(i);
            }
            else if(arr1.get(i)<arr2.get(i))
            {
                leftIndex=i;
            }
            else if(arr1.get(i)>arr2.get(i))
            {
                rightIndex=i;
            }
        }
        return (arr1.get(leftIndex)>arr2.get(rightIndex))?arr1.get(leftIndex):arr2.get(rightIndex);
    }

    
    public static float getMedian_Problem_1_059699f8_873c_48b1_a8c7_07a97a304c9c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1;
        int m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                break;
            }
            else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_d25d98b3_3382_4e86_a821_9d3623773c36(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_6017e43c_b737_49d2_bed5_feac602bb5d9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
            else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_60c1a3ca_808c_4324_8523_143d37934251(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;
        int n1 = arr1.size();
        int n2 = arr2.size();
        int count = 0;
        while (count < n) {
            if (i < n1 && j < n2) {
                if (arr1.get(i) < arr2.get(j)) {
                    i++;
                } else if (arr1.get(i) > arr2.get(j)) {
                    j++;
                } else {
                    count++;
                    i++;
                    j++;
                }
            } else if (i < n1) {
                i++;
            } else if (j < n2) {
                j++;
            } else {
                count++;
            }
        }
        if (count == n) {
            return (arr1.get(i - 1) + arr2.get(j - 1)) / 2.0;
        }
        return 0;
    }

    
    public static float getMedian_Problem_2_d660a810_7ac3_4dbd_8123_de2709d519c5(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 0) {
            throw new IllegalArgumentException("The two arrays are empty");
        }
        if (arr1.size() == 1) {
            return  arr1.get(0);
        }
        if (arr1.size() == 2) {
            return  ((arr1.get(0) + arr2.get(0)) / 2);
        }
        int mid = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (arr1.size() % 2 == 0) {
            return  ((arr1.get(mid) + arr2.get(mid2)) / 2);
        } else {
            return  arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_1_a6cd8351_b02b_49b5_9afd_40b3de8cd5ae(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays should be of same size");
        }
        if(arr1.size() == 0) {
            return 0;
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr1.get(1)) / 2;
        }
        int mid = arr1.size() / 2;
        if(arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_1_d18b9bda_1dd3_4c2a_bc82_391d45798b46(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = n / 2;
        if (arr1.size() > arr2.size()) {
            ArrayList<Integer> temp = new ArrayList<Integer>(arr2);
            temp.removeAll(arr1);
            return getMedian_Problem_1_d18b9bda_1dd3_4c2a_bc82_391d45798b46(arr1, temp, n);
        }
        if (arr1.size() < arr2.size()) {
            ArrayList<Integer> temp = new ArrayList<Integer>(arr1);
            temp.removeAll(arr2);
            return getMedian_Problem_1_d18b9bda_1dd3_4c2a_bc82_391d45798b46(arr2, temp, n);
        }
        if (arr1.size() == arr2.size()) {
            ArrayList<Integer> temp = new ArrayList<Integer>(arr1);
            temp.removeAll(arr2);
            int sum = 0;
            for (int i : temp) {
                sum += i;
            }
            float median =  sum / n;
            return median;
        }
        return -1;
    }

    
    public static float getMedian_Problem_2_5ffce3f5_02ca_462e_a18b_948126569990(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int size = arr1.size();
        int size2 = arr2.size();
        int size3 = size + size2;
        if (size3 % 2 == 0) {
            return  ((arr1.get(i) + arr2.get(j)) / 2);
        } else {
            return  arr1.get(i);
        }
    }

    
    public static float getMedian_Problem_1_0a37d382_b353_4a42_a514_61e8c8c88e5c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_2_7e5f4ca1_625c_43cc_a0df_734f6f67aa3c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_1_b9b5c53d_9026_42d6_97ca_304040fdf66b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        // Your code here
        int median = 0;
        int median1 = 0;
        int median2 = 0;
        int i = 0;
        int j = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                median1 = median2;
                median2 = arr2.get(0);
                break;
            } else if (j == n) {
                median1 = median2;
                median2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median1 = median2;
                median2 = arr1.get(i);
                i++;
            } else {
                median1 = median2;
                median2 = arr2.get(j);
                j++;
            }
        }
        median = (median1 + median2) / 2;
        return median;
    }

    
    public static float getMedian_Problem_2_8b728065_1a2a_495e_a999_484e014da632(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = (n + 1) / 2;
        if (arr1.size() > arr2.size()) {
            return getMedian_Problem_2_8b728065_1a2a_495e_a999_484e014da632(arr2, arr1, mid);
        } else {
            return getMedian_Problem_2_8b728065_1a2a_495e_a999_484e014da632(arr1, arr2, mid);
        }
    }

    
    public static float getMedian_Problem_2_4aa0423d_36f6_4050_9300_dcea18ac3a8e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        if (arr1.size() > arr2.size()) {
            median =  arr1.get(arr1.size() / 2);
        } else if (arr2.size() > arr1.size()) {
            median =  arr2.get(arr2.size() / 2);
        } else {
            median =  arr1.get(arr1.size() / 2);
        }
        return median;
    }

    
    public static float getMedian_Problem_0_5b6e667b_92f0_4182_ab9e_038ae465d565(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int half = n / 2;
        int sum1 = arr1.stream().mapToInteger(x -> x).sum();
        int sum2 = arr2.stream().mapToInteger(x -> x).sum();

        return half*((sum1+sum2)/(n-1));
    }

    
    public static float getMedian_Problem_2_87d2161e_251f_47b8_bd98_f8db2b792b15(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_5a71e3f9_9274_4737_84ea_73ec1b1b3288(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_31c019e6_4452_464d_9d4a_fb7efa9ed48c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_0_b70ccead_d646_4bc6_afa2_2fe51c6e716a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_0_69599c7a_ea95_4393_b44e_e8eb64b0a1dc(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_0_6cd88e66_716a_4aa2_a737_edd1e5cd3d81(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
            else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_392772f9_fd66_4644_af9c_9a8d02c1ca8d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int mid = (arr1.size() + arr2.size()) / 2;
        if (arr1.size() == arr2.size()) {
            while (i < arr1.size() && j < arr2.size()) {
                if (arr1.get(i) < arr2.get(j)) {
                    i++;
                } else if (arr1.get(i) > arr2.get(j)) {
                    j++;
                } else {
                    i++;
                    j++;
                }
            }
            if (i == arr1.size()) {
                return arr2.get(j);
            } else if (j == arr2.size()) {
                return arr1.get(i);
            } else {
                return (arr1.get(i) + arr2.get(j)) / 2.0;
            }
        } else if (arr1.size() > arr2.size()) {
            while (i < arr1.size() && j < arr2.size()) {
                if (arr1.get(i) < arr2.get(j)) {
                    i++;
                } else if (arr1.get(i) > arr2.get(j)) {
                    j++;
                } else {
                    i++;
                    j++;
                }
            }
            if (i == arr1.size()) {
                return arr2.get(j);
            } else {
                return arr1.get(i);
            }
        } else {
            while (i < arr1.size() && j < arr2.size()) {
                if (arr1.get(i) < arr2.get(j)) {
                    i++;
                } else if (arr1.get(i) > arr2.get(j)) {
                    j++;
                } else {
                    i++;
                    j++;
                }
            }
            if (i == arr1.size()) {
                return arr2.get(j);
            } else {
                return arr1.get(i);
            }
        }
    }

    
    public static float getMedian_Problem_0_f4d09052_70b7_43cd_a0ab_e13cdd212404(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = n / 2;
        int leftSum = 0;
        int rightSum = 0;
        int leftCount = 0;
        int rightCount = 0;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            sum += arr1.get(i);
            count++;
        }
        for (int i = 0; i < n; i++) {
            sum += arr2.get(i);
            count++;
        }
        leftSum = sum / count;
        rightSum = sum / count;
        leftCount = count;
        rightCount = count;
        for (int i = 0; i < n; i++) {
            if (arr1.get(i) < leftSum) {
                leftCount--;
                leftSum += arr1.get(i);
            } else if (arr1.get(i) > leftSum) {
                rightCount--;
                rightSum += arr1.get(i);
            }
            if (arr2.get(i) < rightSum) {
                leftCount--;
                leftSum += arr2.get(i);
            } else if (arr2.get(i) > rightSum) {
                rightCount--;
                rightSum += arr2.get(i);
            }
        }
        if (leftCount > rightCount) {
            return leftSum;
        } else {
            return rightSum;
        }
    }

    
    public static float getMedian_Problem_1_9177488e_8182_4414_af62_c5ba799b53c5(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2.0;
        }
        int mid = arr1.size() / 2;
        if(arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2.0;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_0_87d2161e_251f_47b8_bd98_f8db2b792b15(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_1d6924bd_19a2_4369_9ddb_11680079ff5b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr1.get(1)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_2_43a539db_97a4_41f9_91cd_686121d85190(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int size = arr1.size();
        if (size != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        while (i < size && j < size) {
            if (arr1.get(i) <= arr2.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        if (i == size) {
            return arr1.get(i - 1);
        } else if (j == size) {
            return arr2.get(j - 1);
        } else {
            return (arr1.get(i - 1) + arr2.get(j - 1)) / 2.0;
        }
    }

    
    public static float getMedian_Problem_0_edf85e5c_5dd7_4514_bad1_fd53a52b9a96(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_2_d3cb1477_1dc8_4a38_bae0_26b9992d905b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        if (arr1.size() > arr2.size()) {
            median =  getMedian_Problem_2_d3cb1477_1dc8_4a38_bae0_26b9992d905b(arr2, arr1, n);
        } else {
            median =  getMedian_Problem_2_d3cb1477_1dc8_4a38_bae0_26b9992d905b(arr1, arr2, n);
        }
        return median;
    }

    
    public static float getMedian_Problem_1_a81253ac_30a5_4b3a_9366_d1355e820b61(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count = 0;
        int m1 = -1;
        int m2 = -1;
        while (count < n + 1) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
            count++;
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_e3a95816_b8f9_4802_a4d8_b9a7df697b45(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        // if n is odd, then median is middle element of sorted array
        // if n is even, then median is average of middle two elements of sorted array
        int median1 = 0, median2 = 0;
        int i = 0, j = 0;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                median1 = median2;
                median2 = arr2.get(0);
                break;
            } else if (j == n) {
                median1 = median2;
                median2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median1 = median2;
                median2 = arr1.get(i);
                i++;
            } else {
                median1 = median2;
                median2 = arr2.get(j);
                j++;
            }
        }
        return (median1 + median2) / 2;
    }

    
    public static float getMedian_Problem_0_be115c87_c5d4_4267_99d9_8bada5ac99df(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_4dee14b2_72f4_4433_a0f1_cfdf1bbfbb7f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0).intValue();
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0).intValue();
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i).intValue();
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j).intValue();
                j++;
            }
        }
        median = (m1 + m2) / 2;
        return median;
    }

    
    public static float getMedian_Problem_0_6dffef1f_bbcb_41a1_846c_0c01e0480c2d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two lists must be of same size");
        }
        if(arr1.size() == 0) {
            return 0;
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while(i < mid) {
            if(arr1.get(i) < arr2.get(j)) {
                i++;
            } else if(arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if(arr1.size() % 2 == 1) {
            return arr1.get(i);
        } else {
            return (arr1.get(i) + arr2.get(j)) / 2;
        }
    }

    
    public static float getMedian_Problem_2_a4f7b3a1_b359_4df0_a07a_ce732d8ffb67(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int sum = 0;
        int mid = 0;
        float median = 0;
        for(int i = 0; i < n; i++) {
            sum += arr1.get(i);
            sum += arr2.get(i);
        }
        mid = sum / 2;
        for(int i = 0; i < n; i++) {
            if(arr1.get(i) < mid) {
                median += arr1.get(i);
            }
            if(arr2.get(i) < mid) {
                median += arr2.get(i);
            }
        }
        median = median / 2;
        return median;
    }

    
    public static float getMedian_Problem_2_5bd3fb8f_8a91_4ae9_a549_e5de42b64c2c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0;
        int j = 0;
        int count;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_2_b70ccead_d646_4bc6_afa2_2fe51c6e716a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_2_13b6cba2_a853_4028_bcaa_856bfd70fa87(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0;
        int j = 0;
        int count;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_2_cc2a23ad_3b4a_4eea_b543_95c260625884(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_1_d25d98b3_3382_4e86_a821_9d3623773c36(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_6796fe20_7dbd_445a_9b9c_ef5fd94a36a8(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 0) {
            throw new IllegalArgumentException("The two arrays are empty");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2.0;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (i == arr1.size()) {
            return arr2.get(j);
        } else if (j == arr2.size()) {
            return arr1.get(i);
        } else {
            return (arr1.get(i) + arr2.get(j)) / 2.0;
        }
    }

    
    public static float getMedian_Problem_1_e6381e31_439e_4840_bfc4_ad8ead9fe210(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_5da7ae3c_13f1_42ee_9ceb_b83c617392f1(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() == 0 && arr2.size() == 0) {
            return  n/2;
        } else if (arr1.size() == 0 && arr2.size() > 0) {
            return arr2.get( (n/2));
        } else if (arr1.size() > 0 && arr2.size() == 0) {
            return arr1.get( (n/2));
        } else if (arr1.size() == arr2.size()) {
            return getMedian_Problem_1_5da7ae3c_13f1_42ee_9ceb_b83c617392f1(arr1, arr2, n/2);
        } else {
            return getMedian_Problem_1_5da7ae3c_13f1_42ee_9ceb_b83c617392f1(arr1, arr2, n/2);
        }
    }

    
    public static float getMedian_Problem_0_bcc5a66f_6490_44fe_9710_8abc0e55395a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int sum = 0;
        int mid = 0;
        float median = 0;
        for(int i = 0; i < n; i++) {
            sum += arr1.get(i);
            sum += arr2.get(i);
        }
        mid = sum / 2;
        for(int i = 0; i < n; i++) {
            if(arr1.get(i) < mid) {
                median += arr1.get(i);
            }
            else if(arr2.get(i) < mid) {
                median += arr2.get(i);
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_0_eb65d6d0_d6b9_4038_90f2_ed7426f4fc82(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_5ef65891_4a30_4d9c_a884_47d7485bdec0(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr1.get(i) + arr2.get(i);
        }
        return sum / (2 * n);
    }

    
    public static float getMedian_Problem_1_39f53ee7_bb23_4d64_b08c_051cfbe3c240(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (i == arr1.size()) {
            return arr2.get(j);
        } else if (j == arr2.size()) {
            return arr1.get(i);
        } else {
            return (arr1.get(i) + arr2.get(j)) / 2;
        }
    }

    
    public static float getMedian_Problem_2_15b2e561_7346_4a51_944e_178aebca67c6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                median = arr2.get(j);
                break;
            }
            if (j == n) {
                median = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_0_523defd2_62a0_4054_81dd_83d2b4671e0a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int sum = 0;
        int mid = n/2;
        for(int i = 0; i < n; i++) {
            sum += arr1.get(i);
        }
        for(int i = 0; i < n; i++) {
            sum += arr2.get(i);
        }
        float median =  sum/n;
        return median;
    }

    
    public static float getMedian_Problem_1_b877302c_8bcc_4c10_b2b2_2dd07b053700(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            return -1;
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if(arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_0_b6c2991e_0f6d_44e4_a682_24087e4863ef(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("Array lists are not of same size");
        }
        if (arr1.size() == 0) {
            throw new IllegalArgumentException("Array lists are empty");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr1.get(1)) / 2.0;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2.0;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_0_1296c4ec_cadc_4ec2_b651_b7af90c1eeaf(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_1d1b8747_84df_4cf2_bdb9_d4ee6e8aac06(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        int m1 = -1;
        int m2 = -1;
        while (count <= n) {
            if (i == n) {
                m1 = m2;
                m2 =  arr2.get(0).intValue();
                break;
            }
            else if (j == n) {
                m1 = m2;
                m2 =  arr1.get(0).intValue();
                break;
            }
            if (arr1.get(i).intValue() < arr2.get(j).intValue()) {
                m1 = m2;
                m2 =  arr1.get(i).intValue();
                i++;
            }
            else {
                m1 = m2;
                m2 =  arr2.get(j).intValue();
                j++;
            }
            count++;
        }
        if (n % 2 == 0) {
            median = (m1 + m2) / 2;
        }
        else {
            median = m2;
        }
        return median;
    }

    
    public static float getMedian_Problem_2_3fff20dc_cac5_4011_9818_82c7dc027f47(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int median = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_0_22820c53_03cf_4665_9514_ec828a5f0d54(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                median = arr2.get(j);
                break;
            }
            if (j == n) {
                median = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_0_62b925c9_dcad_4c76_93bf_0aafdb31978b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int median = 0;
        if (arr1.size() >= arr2.size()) {
            median = arr1.get((arr1.size() / 2) - 1) + ((arr2.get((arr2.size() / 2) - 1)
                    - arr1.get((arr1.size() / 2) - 1)) / 2);
        } else {
            median = arr2.get((arr2.size() / 2) - 1) + ((arr1.get((arr1.size() / 2) - 1)
                    - arr2.get((arr2.size() / 2) - 1)) / 2);
        }
        return  median;
    }

    
    public static float getMedian_Problem_0_c20ec3f9_2bd4_4f0d_8d5b_838b7c759551(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1;
        int m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_a638c70b_3c62_456e_9021_e11979d49504(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("Arrays must be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while (i < mid) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (arr1.size() % 2 == 0) {
            return (arr1.get(i) + arr2.get(j)) / 2;
        } else {
            return arr1.get(i);
        }
    }

    
    public static float getMedian_Problem_2_d18b9bda_1dd3_4c2a_bc82_391d45798b46(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = n / 2;
        if (arr1.size() > arr2.size()) {
            ArrayList<Integer> temp = new ArrayList<Integer>(arr2);
            temp.removeAll(arr1);
            return getMedian_Problem_2_d18b9bda_1dd3_4c2a_bc82_391d45798b46(arr1, temp, n);
        }
        if (arr1.size() < arr2.size()) {
            ArrayList<Integer> temp = new ArrayList<Integer>(arr1);
            temp.removeAll(arr2);
            return getMedian_Problem_2_d18b9bda_1dd3_4c2a_bc82_391d45798b46(arr2, temp, n);
        }
        if (arr1.size() == arr2.size()) {
            ArrayList<Integer> temp = new ArrayList<Integer>(arr1);
            temp.removeAll(arr2);
            int sum = 0;
            for (int i : temp) {
                sum += i;
            }
            float median =  sum / n;
            return median;
        }
        return -1;
    }

    
    public static float getMedian_Problem_2_db031856_b854_4b04_97c1_3f118d32b590(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = (arr1.size() + arr2.size()) / 2;
        if (arr1.size() > arr2.size()) {
            return getMedian_Problem_2_db031856_b854_4b04_97c1_3f118d32b590(arr1, arr2, mid);
        } else {
            return getMedian_Problem_2_db031856_b854_4b04_97c1_3f118d32b590(arr2, arr1, mid);
        }
    }

    
    public static float getMedian_Problem_1_eda26962_997c_42ce_b8df_03f99edcd68c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_20c18795_6088_4533_a555_abbfef479f68(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_5aa98be7_3399_4fc8_a9b6_628a8e0ae8ab(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_4a93b853_ceb4_4432_9b4f_b16221e7699c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        if (arr1.size() <= arr2.size()) {
            for (int i = 0; i < arr1.size(); i++) {
                list.add(arr1.get(i));
            }
            for (int i = 0; i < arr2.size(); i++) {
                list.add(arr2.get(i));
            }
            int index = list.size() / 2;
            float median;
            if (list.size() % 2 == 1) {
                median = list.get(index);
            } else {
                median = ((list.get(index) + list.get(index + 1))) / 2;
            }
            return median;
        }
        return -1;
    }

    
    public static float getMedian_Problem_1_074694df_a7f7_487d_9998_086abe379425(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            }
            else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_edf85e5c_5dd7_4514_bad1_fd53a52b9a96(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_0_4b5b89eb_1b98_4c96_a236_7347933e042a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        // write your code here
        int size = arr1.size();
        if(arr2.size() > size) {
            ArrayList<Integer> arr3 = new ArrayList<Integer>(arr2);
            for(int i = 0; i < arr2.size(); i++) {
                arr3.add(arr2.get(i));
            }
            return getMedian_Problem_0_4b5b89eb_1b98_4c96_a236_7347933e042a(arr1, arr3, n);
        }
        return (arr1.get(size-1) + arr2.get(size-1)) / 2;
    }

    
    public static float getMedian_Problem_2_c761e60a_8247_4ac4_861f_c3cd41f1ae77(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_2_47f14cb9_2049_4db4_8135_6bf85eac05b6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2.0;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2.0;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_2_b9b5c53d_9026_42d6_97ca_304040fdf66b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        // Your code here
        int median = 0;
        int median1 = 0;
        int median2 = 0;
        int i = 0;
        int j = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                median1 = median2;
                median2 = arr2.get(0);
                break;
            } else if (j == n) {
                median1 = median2;
                median2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median1 = median2;
                median2 = arr1.get(i);
                i++;
            } else {
                median1 = median2;
                median2 = arr2.get(j);
                j++;
            }
        }
        median = (median1 + median2) / 2;
        return median;
    }

    
    public static float getMedian_Problem_1_4b5b89eb_1b98_4c96_a236_7347933e042a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        // write your code here
        int size = arr1.size();
        if(arr2.size() > size) {
            ArrayList<Integer> arr3 = new ArrayList<Integer>(arr2);
            for(int i = 0; i < arr2.size(); i++) {
                arr3.add(arr2.get(i));
            }
            return getMedian_Problem_1_4b5b89eb_1b98_4c96_a236_7347933e042a(arr1, arr3, n);
        }
        return (arr1.get(size-1) + arr2.get(size-1)) / 2;
    }

    
    public static float getMedian_Problem_1_8f655b17_bcb1_4cbb_b59d_05ecc310d42f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_d69ed044_7aac_4dc8_980c_05fd2fc3b99b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        if (arr1.size() < arr2.size()) {
            for (int i = 0; i < n; i++) {
                median += arr1.get(i);
            }
        } else {
            for (int i = 0; i < n; i++) {
                median += arr2.get(i);
            }
        }
        median /= n;
        return median;
    }

    
    public static float getMedian_Problem_0_15b2e561_7346_4a51_944e_178aebca67c6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                median = arr2.get(j);
                break;
            }
            if (j == n) {
                median = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_2_12031f5a_6f71_4648_bc2e_5d5bbee84998(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() == 0 || arr2.size() == 0) {
            return  1.0;
        }
        int mid1 =  Math.floor(n / 2);
        int mid2 =  Math.floor(n / 2);

        if (arr1.get(mid1) < arr2.get(mid2)) {
            return getMedian_Problem_2_12031f5a_6f71_4648_bc2e_5d5bbee84998(arr1, arr2, mid1);
        } else {
            return getMedian_Problem_2_12031f5a_6f71_4648_bc2e_5d5bbee84998(arr1, arr2, mid2);
        }
    }

    
    public static float getMedian_Problem_2_3bfe6c83_5bc1_402f_8b0a_348b4b0df7d2(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays should be of same size");
        }
        if (arr1.size() == 0) {
            throw new IllegalArgumentException("The two arrays should be non-empty");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2.0;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2.0;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_2_a605d765_92c1_4c4f_bba5_9d177a1db0f7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_2ffd29b1_0607_4bb4_af52_f9d7cb7af1a5(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays must be of same size");
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0))/2;
        }
        int mid = arr1.size()/2;
        if(arr1.size()%2 == 0) {
            return (arr1.get(mid) + arr2.get(mid))/2;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_1_12d03d1e_6e82_4240_8e3c_89be72142aba(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_21b72bf6_5d2a_4d29_bd7e_22ca3b519a2f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float f1, f2;
        if (arr1.size() == 0 || arr2.size() == 0) {
            return 0;
        }
        if (arr1.size() > arr2.size()) {
            f1 = getMedian_Problem_2_21b72bf6_5d2a_4d29_bd7e_22ca3b519a2f(arr1, arr2, arr1.size());
        } else {
            f2 = getMedian_Problem_2_21b72bf6_5d2a_4d29_bd7e_22ca3b519a2f(arr1, arr2, arr2.size());
        }
        ArrayList<Integer> list1 = new ArrayList<>(arr1);
        ArrayList<Integer> list2 = new ArrayList<>(arr2);
        float f3;
        if (list1.size() % 2 == 0 && list2.size() % 2 == 0) {
            f3 = (list1.get(list1.size() / 2)) + (list2.get(list2.size() / 2)) / 2.0;
            return f3;
        }
        if (list1.size() % 2 == 0) {
            f1 = getMedian_Problem_2_21b72bf6_5d2a_4d29_bd7e_22ca3b519a2f(arr1, arr2, arr1.size() / 2);
            f2 = getMedian_Problem_2_21b72bf6_5d2a_4d29_bd7e_22ca3b519a2f(arr1, arr2, arr2.size() / 2);
        } else {
            f1 = getMedian_Problem_2_21b72bf6_5d2a_4d29_bd7e_22ca3b519a2f(arr1, arr2, arr1.size() / 2);
            f2 = getMedian_Problem_2_21b72bf6_5d2a_4d29_bd7e_22ca3b519a2f(arr1, arr2, arr2.size() / 2);
        }
        if (f1 < f2) {
            return f1;
        } else {
            return f2;
        }
    }

    
    public static float getMedian_Problem_0_976e46c3_f83f_44be_a322_fff06136eba7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                median = arr2.get(j);
                break;
            }
            if (j == n) {
                median = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_0_b11cb5ba_59e6_4257_9df9_a68999fd5734(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two array lists should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_0_6e27a001_af80_4a69_9700_40ac76eca3dd(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median;
        if (arr1.size() >= arr2.size()) {
            ArrayList<Integer> temp = arr2;
            arr2 = arr1;
            arr1 = temp;
        }
        int half = arr1.size() / 2;
        median = ( arr1.get(half) +  arr2.get(half)) / 2;
        return median;
    }

    
    public static float getMedian_Problem_2_85f7b80c_2eb9_4520_b3d7_51a4fd53b21e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1;
        int m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                break;
            }
            else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_bcc5a66f_6490_44fe_9710_8abc0e55395a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int sum = 0;
        int mid = 0;
        float median = 0;
        for(int i = 0; i < n; i++) {
            sum += arr1.get(i);
            sum += arr2.get(i);
        }
        mid = sum / 2;
        for(int i = 0; i < n; i++) {
            if(arr1.get(i) < mid) {
                median += arr1.get(i);
            }
            else if(arr2.get(i) < mid) {
                median += arr2.get(i);
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_2_12d03d1e_6e82_4240_8e3c_89be72142aba(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_a291cc4d_5bcd_47de_974c_9457214aaac6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_1_d9f8e44e_932e_4a39_aa58_75706b1689ef(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = (((n + 1) >> 1) + 0.5); // mid point
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum = sum + arr1.get(i) + arr2.get(i);
        }
        float ans =  ((sum) / n);
        return ans;
    }

    
    public static float getMedian_Problem_2_15cfe96e_f8f0_46df_ab3f_73f6466ac3ea(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int sum = 0;
        int mid;
        float median;
        int min;
        int max;
        if (arr1.size() > arr2.size()) {
            min = arr1.get(arr1.size() - 1);
            max = arr2.get(arr2.size() - 1);
        } else {
            min = arr2.get(arr2.size() - 1);
            max = arr1.get(arr1.size() - 1);
        }
        mid = (min + max) / 2;
        sum = arr1.get(arr1.size() - 1) + arr2.get(arr2.size() - 1);
        median =  sum / n;
        return median;
    }

    
    public static float getMedian_Problem_1_b330e4fc_7704_49ad_8ff8_5c43c04774b7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        // TODO: Write your code here
        return 0;
    }

    
    public static float getMedian_Problem_0_4c66efc8_ae0b_411f_b155_4b7c11b6b13b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("Array lists are not of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_0_6017e43c_b737_49d2_bed5_feac602bb5d9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
            else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_66b134cd_869c_4cca_9273_4626db965f70(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < mid) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
            k++;
        }
        if (arr1.size() % 2 == 0) {
            return (arr1.get(i) + arr2.get(j)) / 2;
        } else {
            return arr1.get(i);
        }
    }

    
    public static float getMedian_Problem_1_6796fe20_7dbd_445a_9b9c_ef5fd94a36a8(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 0) {
            throw new IllegalArgumentException("The two arrays are empty");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2.0;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (i == arr1.size()) {
            return arr2.get(j);
        } else if (j == arr2.size()) {
            return arr1.get(i);
        } else {
            return (arr1.get(i) + arr2.get(j)) / 2.0;
        }
    }

    
    public static float getMedian_Problem_0_466dce18_9f22_4526_aac0_b4ffd5a38917(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                median = arr2.get(j);
                break;
            }
            if (j == n) {
                median = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_2_a151771c_d526_4ca6_bdfa_bc46978ea099(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get( j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get( i);
                i++;
            } else if (arr1.get( i) < arr2.get( j)) {
                m1 = m2;
                m2 = arr1.get( i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get( j);
                j++;
            }
        }
        median = (m1 + m2) / 2;
        return median;
    }

    
    public static float getMedian_Problem_0_8c991c29_947f_4fdf_a8f7_9288da60d590(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        int m1 = -1;
        int m2 = -1;
        while (count <= n) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0).intValue();
                break;
            }
            else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0).intValue();
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i).intValue();
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2.get(j).intValue();
                j++;
            }
            count++;
        }
        median = (m1 + m2) / 2.0;
        return median;
    }

    
    public static float getMedian_Problem_1_cba76ef3_6c92_42b5_9e9b_ffed009a5f8a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_2_52b95c50_a075_4eb3_a49a_a7d339963da4(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_5b8dea58_f316_41f4_9102_b71dfaf392b4(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("Array lists should be of same size");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while (i < mid) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (i == mid) {
            return arr1.get(i);
        } else if (j == mid) {
            return arr2.get(j);
        } else {
            return (arr1.get(i) + arr2.get(j)) / 2;
        }
    }

    
    public static float getMedian_Problem_1_0e4a0796_07d5_486c_a420_34ad0486c4bd(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_1_466cf13f_44de_4aa9_8dff_f1424311ecf1(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_250685a6_d1bd_4c52_b53e_286de2da9a32(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = n / 2;
        if (n % 2 == 0) {
            return getMedian_Problem_0_250685a6_d1bd_4c52_b53e_286de2da9a32(arr1, arr2, mid);
        } else {
            return getMedian_Problem_0_250685a6_d1bd_4c52_b53e_286de2da9a32(arr2, arr1, mid - 1);
        }
    }

    
    public static float getMedian_Problem_2_ec60c9df_d621_4591_b54a_971b5e0b8d94(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_4daad001_cf67_47b1_9bd8_e4599034272f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_258f2e2b_e13c_439e_9a80_6f668ee07476(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() == arr2.size()) {
            int sum = 0;
            for (int i = 0; i < arr1.size(); i++) {
                sum += arr1.get(i);
            }
            for (int i = 0; i < arr2.size(); i++) {
                sum += arr2.get(i);
            }
            if (sum % 2 == 0) {
                return  ((arr1.get(arr1.size() / 2) + arr2.get(arr2.size() / 2)) / 2);
            } else {
                return  (arr1.get(arr1.size() / 2) + arr2.get(arr2.size() / 2)) / 2;
            }
        } else {
            return  (arr1.get(arr1.size() / 2) + arr2.get(arr2.size() / 2)) / 2;
        }
    }

    
    public static float getMedian_Problem_1_6136dda5_6b09_4ee6_a511_7617b07fe7b1(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get( j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get( i);
                i++;
            } else if (arr1.get( i) < arr2.get( j)) {
                m1 = m2;
                m2 = arr1.get( i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get( j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_d9f8e44e_932e_4a39_aa58_75706b1689ef(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = (((n + 1) >> 1) + 0.5); // mid point
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum = sum + arr1.get(i) + arr2.get(i);
        }
        float ans =  ((sum) / n);
        return ans;
    }

    
    public static float getMedian_Problem_2_ebe4f182_8d6b_41ca_ae89_78305dee7ac4(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        ArrayList<Integer> sorted1 = new ArrayList<Integer>(arr1);
        ArrayList<Integer> sorted2 = new ArrayList<Integer>(arr2);
        Collections.sort(sorted1);
        Collections.sort(sorted2);
        int middle1 =  (n/2);
        int middle2 =  (n/2);
        int median1 = sorted1.get(middle1);
        int median2 = sorted2.get(middle2);
        if (n == 1){
            return  median2;
        }
        if (n == 2){
            return  median1;
        }
        if (median1 > median2){
            return  getMedian_Problem_2_ebe4f182_8d6b_41ca_ae89_78305dee7ac4(arr1, sorted2, n);
        } else {
            return  getMedian_Problem_2_ebe4f182_8d6b_41ca_ae89_78305dee7ac4(arr2, sorted1, n);
        }
    }

    
    public static float getMedian_Problem_1_5065d916_4033_4964_962e_aa2a8fe92ac3(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays must be of same size");
        }
        if (arr1.size() == 0) {
            throw new IllegalArgumentException("The two arrays must be non-empty");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2.0;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while (i < mid) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (arr1.get(i) < arr2.get(j)) {
            return arr1.get(i);
        } else if (arr1.get(i) > arr2.get(j)) {
            return arr2.get(j);
        } else {
            return (arr1.get(i) + arr2.get(j)) / 2.0;
        }
    }

    
    public static float getMedian_Problem_2_f4d09052_70b7_43cd_a0ab_e13cdd212404(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = n / 2;
        int leftSum = 0;
        int rightSum = 0;
        int leftCount = 0;
        int rightCount = 0;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            sum += arr1.get(i);
            count++;
        }
        for (int i = 0; i < n; i++) {
            sum += arr2.get(i);
            count++;
        }
        leftSum = sum / count;
        rightSum = sum / count;
        leftCount = count;
        rightCount = count;
        for (int i = 0; i < n; i++) {
            if (arr1.get(i) < leftSum) {
                leftCount--;
                leftSum += arr1.get(i);
            } else if (arr1.get(i) > leftSum) {
                rightCount--;
                rightSum += arr1.get(i);
            }
            if (arr2.get(i) < rightSum) {
                leftCount--;
                leftSum += arr2.get(i);
            } else if (arr2.get(i) > rightSum) {
                rightCount--;
                rightSum += arr2.get(i);
            }
        }
        if (leftCount > rightCount) {
            return leftSum;
        } else {
            return rightSum;
        }
    }

    
    public static float getMedian_Problem_2_cba76ef3_6c92_42b5_9e9b_ffed009a5f8a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_2_976e46c3_f83f_44be_a322_fff06136eba7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                median = arr2.get(j);
                break;
            }
            if (j == n) {
                median = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_0_115ea3fb_2677_41a6_9fe9_f4e4e779ba75(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        // initialize variables
        float med = 0;
        double mid;
        int arr1Sum = 0;
        int arr2Sum = 0;
        // calculate the sums for each array
        for (int i = 0; i < n; i++)
            arr1Sum += arr1.get(i);
        for (int i = 0; i < n; i++)
            arr2Sum += arr2.get(i);
        // calculate the mid-point
        mid =  (((double)arr1Sum + arr2Sum) / 2);
        // calculate the median
        if (arr1Sum > arr2Sum)
            med =  mid;
        else
            med =  (2 * mid);
        return med;
    }

    
    public static float getMedian_Problem_1_89f75060_37e4_4205_a95e_4f89e5a8fb88(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (i == n) {
                median += arr2.get(j);
                j++;
            } else if (j == n) {
                median += arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                median += arr1.get(i);
                i++;
            } else {
                median += arr2.get(j);
                j++;
            }
            count++;
        }
        return median / 2;
    }

    
    public static float getMedian_Problem_1_abc93be9_1578_494a_8ad5_28f314e02b6c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_0_4f881abf_5880_4177_8c6f_a33cecd1fd48(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_0_b330e4fc_7704_49ad_8ff8_5c43c04774b7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        // TODO: Write your code here
        return 0;
    }

    
    public static float getMedian_Problem_1_3cd42609_3709_4be4_8b1f_a1c9e84c78fa(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("Arrays must be of same size");
        }
        if(arr1.size() == 0) {
            return 0;
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while(i < mid) {
            if(arr1.get(i) < arr2.get(j)) {
                i++;
            } else if(arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if(arr1.size() % 2 == 0) {
            return (arr1.get(i) + arr2.get(j)) / 2;
        } else {
            return arr1.get(i);
        }
    }

    
    public static float getMedian_Problem_0_750b4722_07f9_4d4c_9261_16afe6d7c3cb(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("Arrays must be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int left = 0;
        int right = arr1.size() - 1;
        while (left < right) {
            if (arr1.get(left) < arr1.get(right)) {
                left++;
            } else {
                right--;
            }
        }
        if (arr1.get(left) < arr2.get(left)) {
            left++;
        }
        if (arr1.get(right) < arr2.get(right)) {
            right--;
        }
        if (left == right) {
            return arr1.get(left);
        }
        if (left == right - 1) {
            return (arr1.get(left) + arr2.get(right)) / 2;
        }
        if (left == right + 1) {
            return (arr1.get(left) + arr2.get(right)) / 2;
        }
        return (arr1.get(left) + arr2.get(right)) / 2;
    }

    
    public static float getMedian_Problem_2_d4568430_48e4_4245_a39a_0850b623d425(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = (arr1.size() + arr2.size()) / 2;
        if (arr1.size() == arr2.size()) {
            return (arr1.get(mid) + arr2.get(mid)) / 2.0;
        } else if (arr1.size() > arr2.size()) {
            return arr1.get(mid);
        } else {
            return arr2.get(mid);
        }
    }

    
    public static float getMedian_Problem_0_5a7327b1_6c37_44b8_a8b5_13d4fd577205(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_cfd92b6c_3875_4fae_b77a_d08860a8c482(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_8f655b17_bcb1_4cbb_b59d_05ecc310d42f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_5b8dea58_f316_41f4_9102_b71dfaf392b4(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("Array lists should be of same size");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while (i < mid) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (i == mid) {
            return arr1.get(i);
        } else if (j == mid) {
            return arr2.get(j);
        } else {
            return (arr1.get(i) + arr2.get(j)) / 2;
        }
    }

    
    public static float getMedian_Problem_2_deb24fd5_40db_4776_8635_2c17c5cd9de4(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        median = (m1 + m2) / 2;
        return median;
    }

    
    public static float getMedian_Problem_1_9185d814_b954_4452_959c_60761851913a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int size = arr1.size() + arr2.size();
        if (size % 2 == 0) {
            i = (size / 2) - 1;
            j = (size / 2);
        } else {
            i = (size / 2);
            j = (size / 2) + 1;
        }
        if (arr1.size() > arr2.size()) {
            int temp = arr1.get(i);
            arr1.set(i, arr2.get(i));
            arr2.set(i, temp);
        } else if (arr1.size() < arr2.size()) {
            int temp = arr2.get(i);
            arr2.set(i, arr1.get(i));
            arr1.set(i, temp);
        }
        if (arr1.size() > arr2.size()) {
            int temp = arr1.get(j);
            arr1.set(j, arr2.get(j));
            arr2.set(j, temp);
        } else if (arr1.size() < arr2.size()) {
            int temp = arr2.get(j);
            arr2.set(j, arr1.get(j));
            arr1.set(j, temp);
        }
        if (arr1.size() > arr2.size()) {
            return  arr1.get(i);
        } else if (arr1.size() < arr2.size()) {
            return  arr2.get(i);
        } else {
            return  (arr1.get(i) + arr2.get(i)) / 2;
        }
    }

    
    public static float getMedian_Problem_0_6eff4878_e862_432f_8491_c88e452561d7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_7606a613_62b2_4283_9eee_35bcd4187bea(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        ArrayList<Integer> arr3 = new ArrayList<Integer>();
        ArrayList<Integer> arr4 = new ArrayList<Integer>();
        arr3.add(0L);
        arr4.add(0L);
        for (int i = 0; i < n; i++) {
            if (arr1.get(i) < arr2.get(i)) {
                arr3.add(arr1.get(i));
                arr4.add(arr2.get(i));
            } else {
                arr3.add(arr2.get(i));
                arr4.add(arr1.get(i));
            }
        }
        int l = 0;
        int h = arr3.size()-1;
        int middle = (h + l)/2;
        return arr3.get(middle);
    }

    
    public static float getMedian_Problem_2_faff0b0b_007b_4794_b755_f1fc1348dbf6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_1_c2c5f034_662d_4d0e_9e9f_41aa59860b92(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            return -1;
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0))/2;
        }
        int mid = arr1.size()/2;
        if(arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid))/2;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_0_b2cbd1ec_f0fc_4b3c_9230_42403dc1fed6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_ab1c471d_7720_4631_b93e_d92dc39dc584(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two array lists should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while (i < mid) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (arr1.get(i) < arr2.get(j)) {
            return arr1.get(i);
        } else if (arr1.get(i) > arr2.get(j)) {
            return arr2.get(j);
        } else {
            return arr1.get(i);
        }
    }

    
    public static float getMedian_Problem_0_e43d386e_d4cb_47af_b206_841990a63b55(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_de8e2326_44e0_4bda_abb0_40fca8d6c519(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int a1 = 0, a2 = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                a1 = arr1.get(i);
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                a2 = arr2.get(j);
                j++;
            } else {
                count++;
                i++;
                j++;
            }
        }
        if (count == n) {
            return  (a1 + a2) / 2;
        } else if (count < n) {
            return  a1;
        } else {
            return  a2;
        }
    }

    
    public static float getMedian_Problem_2_72732fe4_7cee_4457_b60c_8b5e14b09b4a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        ArrayList<Integer> arr1Mid = new ArrayList<Integer>();
        ArrayList<Integer> arr2Mid = new ArrayList<Integer>();

        for (int i = 0; i < mid1; i++)
            arr1Mid.add(arr1.get(i));

        for (int i = 0; i < mid2; i++)
            arr2Mid.add(arr2.get(i));

        int sumOf1 = 0, sumOf2 = 0;

        for (int i = 0; i < mid1; i++)
            sumOf1 += arr1Mid.get(i);

        for (int i = 0; i < mid2; i++)
            sumOf2 += arr2Mid.get(i);

        if (mid1 == mid2) {
            if (sumOf1 < sumOf2)
                return arr1.get(mid1);
            else
                return arr2.get(mid1);
        }
        if (sumOf1 < sumOf2)
            return arr1.get(mid1);
        else
            return arr2.get(mid2);
    }

    
    public static float getMedian_Problem_2_2d076beb_0885_4698_9e2e_272762073781(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        while (i < n && j < n) {
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        if (i < n) {
            median = arr1.get(i);
        }
        if (j < n) {
            median = arr2.get(j);
        }
        return median;
    }

    
    public static float getMedian_Problem_0_43a539db_97a4_41f9_91cd_686121d85190(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int size = arr1.size();
        if (size != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        while (i < size && j < size) {
            if (arr1.get(i) <= arr2.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        if (i == size) {
            return arr1.get(i - 1);
        } else if (j == size) {
            return arr2.get(j - 1);
        } else {
            return (arr1.get(i - 1) + arr2.get(j - 1)) / 2.0;
        }
    }

    
    public static float getMedian_Problem_2_dc75bd71_7e9a_4ae7_9d44_9012f47e11ca(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int m = (arr1.size() + arr2.size()) / 2;
        int sum1 = 0, sum2 = 0;
        for(int i = 0; i < m; i++) {
            sum1 += arr1.get(i);
            sum2 += arr2.get(i);
        }
        float median = (sum1 + sum2) / m;
        float sum = 0;
        for(int i = 0; i < n; i++) {
            sum += arr1.get(i);
        }
        return sum / n;
    }

    
    public static float getMedian_Problem_0_5864b4f7_64fc_467c_b82f_84d49b7eeaf8(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_47d87e3a_0566_4a5a_aa69_c1c8bc10cdc1(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            return -1;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr2.size() == 1) {
            return arr2.get(0);
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2.0;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_1_3bcc1151_0a6d_4029_8a91_c5734b109a0b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            return -1;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int i = 0, j = 0;
        while (i < mid) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (i == mid) {
            return arr1.get(i);
        }
        if (j == mid) {
            return arr2.get(j);
        }
        return (arr1.get(i) + arr2.get(j)) / 2;
    }

    
    public static float getMedian_Problem_2_8e6ae9c3_1d7a_4f68_bbef_6b2ec2a95b44(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
            else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_ebe4f182_8d6b_41ca_ae89_78305dee7ac4(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        ArrayList<Integer> sorted1 = new ArrayList<Integer>(arr1);
        ArrayList<Integer> sorted2 = new ArrayList<Integer>(arr2);
        Collections.sort(sorted1);
        Collections.sort(sorted2);
        int middle1 =  (n/2);
        int middle2 =  (n/2);
        int median1 = sorted1.get(middle1);
        int median2 = sorted2.get(middle2);
        if (n == 1){
            return  median2;
        }
        if (n == 2){
            return  median1;
        }
        if (median1 > median2){
            return  getMedian_Problem_1_ebe4f182_8d6b_41ca_ae89_78305dee7ac4(arr1, sorted2, n);
        } else {
            return  getMedian_Problem_1_ebe4f182_8d6b_41ca_ae89_78305dee7ac4(arr2, sorted1, n);
        }
    }

    
    public static float getMedian_Problem_2_50a22e35_fe9f_465d_98c1_7481b8819155(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() == arr2.size()) {
            int sum = 0;
            for (int i = 0; i < arr1.size(); i++) {
                sum += arr1.get(i);
            }
            for (int i = 0; i < arr2.size(); i++) {
                sum += arr2.get(i);
            }
            if (sum % 2 == 0) {
                return  ((arr1.get(arr1.size() / 2) + arr2.get(arr2.size() / 2)) / 2);
            } else {
                return  (arr1.get(arr1.size() / 2) + arr2.get(arr2.size() / 2)) / 2;
            }
        } else {
            return  (arr1.get(arr1.size() / 2) + arr2.get(arr2.size() / 2)) / 2;
        }
    }

    
    public static float getMedian_Problem_2_69d7b38c_877a_48df_a4bb_9e5f5083e01c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_2_d8b4ae7e_8f66_4396_8e91_deef10938e64(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_1_987e1b3f_e868_465f_80f6_9624e9b66849(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_0b2e061b_f4a0_4577_a3df_68ef1d4dca01(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int size = arr1.size();
        if (size != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (size == 0) {
            return 0;
        }
        if (size == 1) {
            return arr1.get(0);
        }
        int mid = size / 2;
        if (n % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_1_c4a54e94_48a6_45ca_bd04_34354d00ddd7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_eb65d6d0_d6b9_4038_90f2_ed7426f4fc82(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_6a3f2803_f2be_4a36_8edc_630e44ae47cd(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_1_df7b0710_7ac9_41e8_abf0_f26a95cbed90(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_2_ba763a9d_4e60_4f5c_941c_3b28111bc9b4(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get( j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get( i);
                i++;
            } else if (arr1.get( i) < arr2.get( j)) {
                m1 = m2;
                m2 = arr1.get( i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get( j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_cb8a0509_1030_4cc4_96c9_513c44000ff8(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_e082661c_fe28_4c5f_a28d_c9a597e50a37(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (i == n) {
                median += arr2.get(j);
                j++;
            } else if (j == n) {
                median += arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                median += arr1.get(i);
                i++;
            } else {
                median += arr2.get(j);
                j++;
            }
            count++;
        }
        return median / 2;
    }

    
    public static float getMedian_Problem_2_8dcb8b32_ffae_45b7_aa67_2d4b31622d03(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        // Write your code here
        float median = 0;
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0).intValue();
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0).intValue();
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i).intValue();
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j).intValue();
                j++;
            }
        }
        median = (m1 + m2) / 2.0;
        return median;
    }

    
    public static float getMedian_Problem_2_ce85318f_137a_4689_b3c5_8cf69fb52303(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_1_00ee4a08_3264_483c_9778_f3756246d69b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_d4d1b0c4_27f6_41a1_b15e_7d13e59eb8ef(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("Arrays must be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_1_df5f0c03_72bb_4b83_a3cb_f3aa30cc9673(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;
        int n1 = 0;
        int n2 = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                count++;
                i++;
                j++;
            }
        }
        if (count == n) {
            return (arr1.get(i - 1) + arr2.get(j - 1)) / 2.0;
        } else if (count > n / 2) {
            return (arr1.get(i - 1) + arr2.get(j - 1)) / 2.0;
        } else {
            while (i < arr1.size() && j < arr2.size()) {
                if (arr1.get(i) < arr2.get(j)) {
                    n1++;
                    i++;
                } else if (arr1.get(i) > arr2.get(j)) {
                    n2++;
                    j++;
                } else {
                    i++;
                    j++;
                }
            }
            if (n1 > n2) {
                return arr1.get(i - 1);
            } else {
                return arr2.get(j - 1);
            }
        }
    }

    
    public static float getMedian_Problem_0_1d1b8747_84df_4cf2_bdb9_d4ee6e8aac06(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        int m1 = -1;
        int m2 = -1;
        while (count <= n) {
            if (i == n) {
                m1 = m2;
                m2 =  arr2.get(0).intValue();
                break;
            }
            else if (j == n) {
                m1 = m2;
                m2 =  arr1.get(0).intValue();
                break;
            }
            if (arr1.get(i).intValue() < arr2.get(j).intValue()) {
                m1 = m2;
                m2 =  arr1.get(i).intValue();
                i++;
            }
            else {
                m1 = m2;
                m2 =  arr2.get(j).intValue();
                j++;
            }
            count++;
        }
        if (n % 2 == 0) {
            median = (m1 + m2) / 2;
        }
        else {
            median = m2;
        }
        return median;
    }

    
    public static float getMedian_Problem_1_d3cb1477_1dc8_4a38_bae0_26b9992d905b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        if (arr1.size() > arr2.size()) {
            median =  getMedian_Problem_1_d3cb1477_1dc8_4a38_bae0_26b9992d905b(arr2, arr1, n);
        } else {
            median =  getMedian_Problem_1_d3cb1477_1dc8_4a38_bae0_26b9992d905b(arr1, arr2, n);
        }
        return median;
    }

    
    public static float getMedian_Problem_0_3edd1e72_e533_4459_8976_384df961b4f1(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float mid, diff;
        int sum1 = 0, sum2 = 0;
        for(int i = 0; i < n; i++) {
            sum1 += arr1.get(i);
            sum2 += arr2.get(i);
        }
        mid = sum1/n;
        diff = sum2/n - mid;
        if(diff > 0) return mid;
        return sum2 + mid;
    }

    
    public static float getMedian_Problem_1_b2cbd1ec_f0fc_4b3c_9230_42403dc1fed6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_3d765a3c_80a7_4beb_aeef_a0cda973f88b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_2_7c852d97_ffeb_4f16_91c9_ddd90aa899de(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
            else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_31ebd1d1_73f8_448a_9b86_130ec2552ad9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_0_7c852d97_ffeb_4f16_91c9_ddd90aa899de(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
            else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_da0e76df_8099_4921_bd98_3fa223a96866(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        for (int i = 0; i < n; i++) {
            if (arr1.get(i) > arr2.get(i)) {
                median = arr1.get(i);
                break;
            } else if (arr1.get(i) < arr2.get(i)) {
                median = arr2.get(i);
                break;
            } else {
                median = arr1.get(i);
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_2_d69ed044_7aac_4dc8_980c_05fd2fc3b99b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        if (arr1.size() < arr2.size()) {
            for (int i = 0; i < n; i++) {
                median += arr1.get(i);
            }
        } else {
            for (int i = 0; i < n; i++) {
                median += arr2.get(i);
            }
        }
        median /= n;
        return median;
    }

    
    public static float getMedian_Problem_0_60c1a3ca_808c_4324_8523_143d37934251(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;
        int n1 = arr1.size();
        int n2 = arr2.size();
        int count = 0;
        while (count < n) {
            if (i < n1 && j < n2) {
                if (arr1.get(i) < arr2.get(j)) {
                    i++;
                } else if (arr1.get(i) > arr2.get(j)) {
                    j++;
                } else {
                    count++;
                    i++;
                    j++;
                }
            } else if (i < n1) {
                i++;
            } else if (j < n2) {
                j++;
            } else {
                count++;
            }
        }
        if (count == n) {
            return (arr1.get(i - 1) + arr2.get(j - 1)) / 2.0;
        }
        return 0;
    }

    
    public static float getMedian_Problem_0_e007e0ae_37de_4c14_9e15_e0689d2c35d6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = (arr1.size() + arr2.size()) / 2;
        if (arr1.size() > arr2.size()) {
            return getMedian_Problem_0_e007e0ae_37de_4c14_9e15_e0689d2c35d6(arr1, arr2, mid);
        } else {
            return getMedian_Problem_0_e007e0ae_37de_4c14_9e15_e0689d2c35d6(arr2, arr1, mid);
        }
    }

    
    public static float getMedian_Problem_1_fc0277e6_4361_4114_af20_4815cc7edd93(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int size = arr1.size();
        if (size != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (size == 1) {
            return  arr1.get(0);
        }
        if (size == 2) {
            return  (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = size / 2;
        int i = 0;
        int j = 0;
        while (i < mid && j < mid) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (i == mid) {
            return  arr1.get(i);
        }
        if (j == mid) {
            return  arr2.get(j);
        }
        if (arr1.get(i) < arr2.get(j)) {
            return  (arr1.get(i) + arr2.get(j)) / 2;
        } else {
            return  (arr1.get(i) + arr2.get(j)) / 2;
        }
    }

    
    public static float getMedian_Problem_2_750b4722_07f9_4d4c_9261_16afe6d7c3cb(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("Arrays must be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int left = 0;
        int right = arr1.size() - 1;
        while (left < right) {
            if (arr1.get(left) < arr1.get(right)) {
                left++;
            } else {
                right--;
            }
        }
        if (arr1.get(left) < arr2.get(left)) {
            left++;
        }
        if (arr1.get(right) < arr2.get(right)) {
            right--;
        }
        if (left == right) {
            return arr1.get(left);
        }
        if (left == right - 1) {
            return (arr1.get(left) + arr2.get(right)) / 2;
        }
        if (left == right + 1) {
            return (arr1.get(left) + arr2.get(right)) / 2;
        }
        return (arr1.get(left) + arr2.get(right)) / 2;
    }

    
    public static float getMedian_Problem_0_3ca95e37_38bf_45d3_9b86_e364d597cad9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if(arr1.size() == 0) {
            throw new IllegalArgumentException("The two arrays are empty");
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0))/2;
        }
        int mid = arr1.size()/2;
        if(arr1.size()%2 == 0) {
            return (arr1.get(mid) + arr2.get(mid))/2;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_2_11ec7837_669a_4f04_a9cb_8eb30a3b8038(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_6de22b45_374c_4d95_a6ea_e54ecb4ece97(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        while (count < n) {
            if (i == n) {
                median = arr2.get(j);
                break;
            }
            if (j == n) {
                median = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_2_638450b2_f2b3_404a_b91f_975c8e1edf08(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        //write your code
        int i = (arr1.size() + arr2.size()) / 2;
        float mid1 = getMedian_Problem_2_638450b2_f2b3_404a_b91f_975c8e1edf08(arr1, arr2, i);
        float mid2 = getMedian_Problem_2_638450b2_f2b3_404a_b91f_975c8e1edf08(arr2, arr1, i);
        return (mid1 + mid2) / 2;
    }

    
    public static float getMedian_Problem_0_009b97f6_aa5d_42c2_9411_114fd9b06515(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_2f05ca9a_b345_42bd_b19e_acb204d676fe(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() == arr2.size()) {
            int sum = 0;
            for (int i = 0; i < arr1.size(); i++) {
                sum += arr1.get(i);
            }
            for (int i = 0; i < arr2.size(); i++) {
                sum += arr2.get(i);
            }
            return  (sum / n);
        } else {
            return  (arr1.get(arr1.size() / 2) + arr2.get(arr2.size() / 2));
        }
    }

    
    public static float getMedian_Problem_0_059699f8_873c_48b1_a8c7_07a97a304c9c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1;
        int m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                break;
            }
            else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_8afc9655_1bf5_4043_a24d_be468e4e894c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_1_50a22e35_fe9f_465d_98c1_7481b8819155(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() == arr2.size()) {
            int sum = 0;
            for (int i = 0; i < arr1.size(); i++) {
                sum += arr1.get(i);
            }
            for (int i = 0; i < arr2.size(); i++) {
                sum += arr2.get(i);
            }
            if (sum % 2 == 0) {
                return  ((arr1.get(arr1.size() / 2) + arr2.get(arr2.size() / 2)) / 2);
            } else {
                return  (arr1.get(arr1.size() / 2) + arr2.get(arr2.size() / 2)) / 2;
            }
        } else {
            return  (arr1.get(arr1.size() / 2) + arr2.get(arr2.size() / 2)) / 2;
        }
    }

    
    public static float getMedian_Problem_2_b6c2991e_0f6d_44e4_a682_24087e4863ef(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("Array lists are not of same size");
        }
        if (arr1.size() == 0) {
            throw new IllegalArgumentException("Array lists are empty");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr1.get(1)) / 2.0;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2.0;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_1_5ffce3f5_02ca_462e_a18b_948126569990(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int size = arr1.size();
        int size2 = arr2.size();
        int size3 = size + size2;
        if (size3 % 2 == 0) {
            return  ((arr1.get(i) + arr2.get(j)) / 2);
        } else {
            return  arr1.get(i);
        }
    }

    
    public static float getMedian_Problem_2_7cff6bcb_fccd_4f1c_b131_a4d979e08eee(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_7e5f4ca1_625c_43cc_a0df_734f6f67aa3c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_2_5ef65891_4a30_4d9c_a884_47d7485bdec0(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr1.get(i) + arr2.get(i);
        }
        return sum / (2 * n);
    }

    
    public static float getMedian_Problem_0_e8d893bd_b94b_41e8_9a01_6cb81ff4ac22(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_db031856_b854_4b04_97c1_3f118d32b590(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = (arr1.size() + arr2.size()) / 2;
        if (arr1.size() > arr2.size()) {
            return getMedian_Problem_0_db031856_b854_4b04_97c1_3f118d32b590(arr1, arr2, mid);
        } else {
            return getMedian_Problem_0_db031856_b854_4b04_97c1_3f118d32b590(arr2, arr1, mid);
        }
    }

    
    public static float getMedian_Problem_1_2d076beb_0885_4698_9e2e_272762073781(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        while (i < n && j < n) {
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        if (i < n) {
            median = arr1.get(i);
        }
        if (j < n) {
            median = arr2.get(j);
        }
        return median;
    }

    
    public static float getMedian_Problem_0_44b5dd90_5406_4756_ac4c_03ab7584e9a9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            }
            else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_85e8c9c6_39d8_4657_8f13_faf3a833a234(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_0bd0540a_1f91_41d9_84d1_545bbd115531(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        median = (m1 + m2) / 2;
        return median;
    }

    
    public static float getMedian_Problem_1_b98aed2d_5f08_48a3_b0fc_120a47640c47(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (i == n) {
                median += arr2.get(j);
                j++;
            } else if (j == n) {
                median += arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                median += arr1.get(i);
                i++;
            } else {
                median += arr2.get(j);
                j++;
            }
            count++;
            if (count == n) {
                return median / 2;
            }
        }
        if (arr1.get(i) < arr2.get(j)) {
            median += arr1.get(i);
        } else {
            median += arr2.get(j);
        }
        return median / 2;
    }

    
    public static float getMedian_Problem_0_105a9f5d_0baa_4c16_a8ca_115c6fa28f25(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int size = arr1.size();
        int size2 = arr2.size();
        int size3 = size + size2;
        if (size3 % 2 == 0) {
            return  ((arr1.get(size / 2) + arr2.get(size2 / 2)) / 2);
        } else {
            return  (arr1.get(size / 2));
        }
    }

    
    public static float getMedian_Problem_0_5d7845e6_3610_4187_a230_7ed5bf251366(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        // Write your code here
        
        int minVal = arr1.get(0);
        int maxVal = arr2.get(0);
        
        if(arr1.size() > arr2.size()){
            minVal = arr2.get(arr2.size()-1);
            maxVal = arr1.get(arr1.size()-1);
        }
        else{
            minVal = arr1.get(arr1.size()-1);
            maxVal = arr2.get(arr2.size()-1);
        }
        
        float midVal = (minVal+maxVal)/2;
        
        for(int i = 0; i < n; i++){
            if(arr1.get(i) < midVal && arr2.get(i) < midVal){
                arr1.remove(i);
                arr2.remove(i);
            }
            if(arr1.get(i) > midVal && arr2.get(i) > midVal){
                arr1.remove(i);
                arr2.remove(i);
            }
        }
        
        float median = ((arr1.get(0) + arr2.get(0) / 2))/2;
        
        return median;
    }

    
    public static float getMedian_Problem_0_71b15cc5_4d84_44f8_ac17_1ad2f65f30fc(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() == arr2.size()) {
            int sum = 0;
            for(int i = 0; i < arr1.size(); i++) {
                sum += arr1.get(i);
            }
            for(int i = 0; i < arr2.size(); i++) {
                sum += arr2.get(i);
            }
            if(sum > n) {
                return getMedian_Problem_0_71b15cc5_4d84_44f8_ac17_1ad2f65f30fc(arr2, arr1, n);
            }
            else {
                return  (arr1.get(arr1.size()/2) + arr2.get(arr2.size()/2)) / 2;
            }
        }
        else {
            return  (arr1.get(arr1.size()/2) + arr2.get(arr2.size()/2)) / 2;
        }
    }

    
    public static float getMedian_Problem_1_0616ac5c_e841_4c02_9b7e_8000baa9012c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_5328a13b_f676_4440_8b4e_d50c125e3071(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() > arr2.size()) {
            return getMedian_Problem_1_5328a13b_f676_4440_8b4e_d50c125e3071(arr2, arr1, n);
        }
        int mid = arr1.size() / 2;
        int m1 = arr1.get(mid);
        int m2 = arr2.get(mid);
        if (m1 == m2)
            return m1;
        if (m2 < m1)
            return getMedian_Problem_1_5328a13b_f676_4440_8b4e_d50c125e3071(arr2, arr1, n);
        return getMedian_Problem_1_5328a13b_f676_4440_8b4e_d50c125e3071(arr1, arr2, n);
    }

    
    public static float getMedian_Problem_2_87e855e0_4b3d_4223_b727_5069b628b571(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = (n + 1) / 2;
        if (arr1.size() > arr2.size()) {
            return getMedian_Problem_2_87e855e0_4b3d_4223_b727_5069b628b571(arr2, arr1, mid);
        }
        if (arr1.size() < arr2.size()) {
            return getMedian_Problem_2_87e855e0_4b3d_4223_b727_5069b628b571(arr1, arr2, mid);
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr1.get(i) + arr2.get(i);
        }
        float median =  sum / n;
        return median;
    }

    
    public static float getMedian_Problem_1_4daad001_cf67_47b1_9bd8_e4599034272f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_cab72c27_4271_4468_a711_0d072b6f7531(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int median = 0;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(j);
                break;
            }
            if (j == n) {
                median = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_1_862424eb_3518_40cf_8591_7f3e25c6937b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float result = ((arr2.size() > arr1.size() ? arr2.get( ((n - 1) / 2)) : arr1.get( ((n - 1) / 2)))
                + ((arr1.size() > arr2.size() ? arr1.get( ((n - 1) / 2)) : arr2.get( ((n - 1) / 2))))) / 2;
        return result;
    }

    
    public static float getMedian_Problem_2_3edd1e72_e533_4459_8976_384df961b4f1(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float mid, diff;
        int sum1 = 0, sum2 = 0;
        for(int i = 0; i < n; i++) {
            sum1 += arr1.get(i);
            sum2 += arr2.get(i);
        }
        mid = sum1/n;
        diff = sum2/n - mid;
        if(diff > 0) return mid;
        return sum2 + mid;
    }

    
    public static float getMedian_Problem_1_d1d1dbd1_3ccb_4ed9_aed4_faa902cc5ea6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = n / 2;
        int leftSum = 0;
        int rightSum = 0;
        int sum = 0;
        for (int i = 0; i < mid; i++) {
            leftSum += arr1.get(i);
            rightSum += arr2.get(i);
            sum += arr1.get(i);
        }
        float median =  (sum / 2);
        if (leftSum == rightSum) {
            return median;
        }
        if (leftSum > rightSum) {
            int temp = leftSum;
            leftSum = rightSum;
            rightSum = temp;
        }
        float leftMedian =  (leftSum / 2);
        float rightMedian =  (rightSum / 2);
        if (leftMedian * rightMedian > median) {
            return leftMedian;
        } else {
            return rightMedian;
        }
    }

    
    public static float getMedian_Problem_0_f4148fd5_b67a_49f4_9052_5bd075dafba7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_62b925c9_dcad_4c76_93bf_0aafdb31978b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int median = 0;
        if (arr1.size() >= arr2.size()) {
            median = arr1.get((arr1.size() / 2) - 1) + ((arr2.get((arr2.size() / 2) - 1)
                    - arr1.get((arr1.size() / 2) - 1)) / 2);
        } else {
            median = arr2.get((arr2.size() / 2) - 1) + ((arr1.get((arr1.size() / 2) - 1)
                    - arr2.get((arr2.size() / 2) - 1)) / 2);
        }
        return  median;
    }

    
    public static float getMedian_Problem_0_e1333cfa_a8e7_4b0a_837e_ec8d5098f9a5(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int sum = 0;
        int mid;
        float median;
        for(int i = 0; i < n; i++) {
            sum += arr1.get(i);
            sum += arr2.get(i);
        }
        mid = sum / 2;
        median =  Math.ceil(sum / 2);
        return median;
    }

    
    public static float getMedian_Problem_1_7e1aeb3e_93e6_4db3_8d07_5c93b66fcdec(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_4bc28496_75af_454c_b2c6_d45095a365ad(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        Collections.sort(arr1);
        Collections.sort(arr2);
        if (arr1.size() >= arr2.size()) {
            return (arr1.get((arr1.size() / 2) + 1)
                    - arr2.get((arr2.size() / 2) + 1)) / 2.0;
        } else {
            return arr1.get((arr1.size() / 2)) - arr2.get((arr2.size() / 2)) / 2.0;
        }
    }

    
    public static float getMedian_Problem_2_e33627c0_09dc_4219_9a63_bf2884913d1c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() == arr2.size()) {
            int sum = 0;
            for (int i = 0; i < arr1.size(); i++) {
                sum += arr1.get(i);
            }
            for (int i = 0; i < arr2.size(); i++) {
                sum += arr2.get(i);
            }
            if (n % 2 == 0) {
                return  (sum / 2);
            } else {
                return  (sum / 2 + arr1.get(arr1.size() / 2));
            }
        } else {
            return  (arr1.get(arr1.size() / 2) + arr2.get(arr2.size() / 2));
        }
    }

    
    public static float getMedian_Problem_2_53c2acd5_a3d0_4a29_b117_cb539d43b176(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int sum = 0;
        int mid = 0;
        float median = 0;
        for(int i = 0; i < n; i++) {
            sum += arr1.get(i);
            sum += arr2.get(i);
        }
        mid = sum / 2;
        for(int i = 0; i < n; i++) {
            if(arr1.get(i) < mid) {
                median += arr1.get(i);
            } else {
                median += arr2.get(i);
            }
        }
        median = median / 2;
        return median;
    }

    
    public static float getMedian_Problem_1_3fff20dc_cac5_4011_9818_82c7dc027f47(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int median = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_0_3d829aee_fe40_4a3b_beb2_9009eea39e04(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr1.get(1)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_1_825c2b2c_ab0d_4128_a555_9941c4ae9a94(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two array lists should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_2_6d232e17_43f6_403b_8013_0fdad622e3f9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int first = 0;
        int second = 0;
        if(arr1.isEmpty() || arr2.isEmpty()){
            return 0;
        }
        if(arr1.size() < arr2.size()){
            first = arr1.get(0);
            second = arr2.get(arr2.size()-1);
        }
        else{
            first = arr2.get(0);
            second = arr1.get(arr1.size()-1);
        }
        if(first > second){
            return first;
        }
        if(first == second){
            return first;
        }
        int half = (first + second)/2;
        return half;
    }

    
    public static float getMedian_Problem_2_708091ce_5384_466d_ad24_d10729946a29(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.isEmpty() && arr2.isEmpty()) {
            System.out.println("Empty list");
            return 0;
        }
        if (arr1.isEmpty() && arr2.size() == n) {
            return arr2.get(0);
        }
        if (arr1.size() == n && arr2.isEmpty()) {
            return arr1.get(0);
        }
        if (arr1.size() == n && arr2.size() == n) {
            int sum = 0;
            Integer num1 = arr1.get(arr1.size() - 1);
            Integer num2 = arr2.get(arr2.size() - 1);
            sum += num1;
            sum += num2;
            return (sum / 2);
        }
        return Float.POSITIVE_INFINITY;
    }

    
    public static float getMedian_Problem_1_a3db5259_bdee_4141_b8e0_eff1bdb5f3a4(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        int m1 = -1;
        int m2 = -1;
        while (count <= n) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0).intValue();
                break;
            }
            else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0).intValue();
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i).intValue();
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2.get(j).intValue();
                j++;
            }
            count++;
        }
        if (n % 2 == 0) {
            median = (m1 + m2) / 2;
        }
        else {
            median = m2;
        }
        return median;
    }

    
    public static float getMedian_Problem_1_195fa5f4_4898_46e1_bb7e_8f8ee10272d9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.isEmpty() && arr2.isEmpty()) {
            return 0;
        }
        int lower = Math.min(arr1.get(0), arr2.get(0));
        int upper = Math.max(arr1.get(0), arr2.get(0));
        float median = 0;
        if (arr1.get(0) <= arr2.get(0)) {
            median =  (lower + upper / 2); // int overflow is okay here.
        } else {
            median =  (upper + lower / 2); // int overflow is okay here.
        }
        for (int i = 1; i < n; i++) {
            lower = Math.min(lower, arr1.get(i));
            upper = Math.max(upper, arr1.get(i));
            median =  (median +  (arr2.get(i) - lower)); // int overflow is okay here.
        }
        return median;
    }

    
    public static float getMedian_Problem_2_3a64467c_b298_4d7f_8763_bca28d10044c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1;
        int m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                break;
            }
            if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_bc1eb431_c49f_4a0b_b087_56f0a6264004(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            return -1;
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if(arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_1_d4568430_48e4_4245_a39a_0850b623d425(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = (arr1.size() + arr2.size()) / 2;
        if (arr1.size() == arr2.size()) {
            return (arr1.get(mid) + arr2.get(mid)) / 2.0;
        } else if (arr1.size() > arr2.size()) {
            return arr1.get(mid);
        } else {
            return arr2.get(mid);
        }
    }

    
    public static float getMedian_Problem_0_12aa832a_9b86_42e2_84cd_17635f3ba268(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays should be of same size");
        }
        if (arr1.size() == 0) {
            throw new IllegalArgumentException("The two arrays should be non-empty");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2.0;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while (i < mid) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (arr1.get(i) < arr2.get(j)) {
            return arr1.get(i);
        } else if (arr1.get(i) > arr2.get(j)) {
            return arr2.get(j);
        } else {
            return (arr1.get(i) + arr2.get(j)) / 2.0;
        }
    }

    
    public static float getMedian_Problem_2_99b946d3_de14_45eb_801c_7461a8d14c3a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        // Write your code here
        float median = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        while (count < n) {
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_2_7b2ae845_ecb0_42b8_a3ff_e4a5b8b16bde(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        // TODO Auto-generated method stub
        return 0;
    }

    
    public static float getMedian_Problem_2_c4a54e94_48a6_45ca_bd04_34354d00ddd7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_12031f5a_6f71_4648_bc2e_5d5bbee84998(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() == 0 || arr2.size() == 0) {
            return  1.0;
        }
        int mid1 =  Math.floor(n / 2);
        int mid2 =  Math.floor(n / 2);

        if (arr1.get(mid1) < arr2.get(mid2)) {
            return getMedian_Problem_1_12031f5a_6f71_4648_bc2e_5d5bbee84998(arr1, arr2, mid1);
        } else {
            return getMedian_Problem_1_12031f5a_6f71_4648_bc2e_5d5bbee84998(arr1, arr2, mid2);
        }
    }

    
    public static float getMedian_Problem_2_c1baa561_a670_4c3c_be23_12620344b861(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                median = arr2.get(j);
                break;
            }
            if (j == n) {
                median = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_0_bfef20d7_c4d6_4d77_895c_ec51656d56ed(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr1.get(1)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_1_dc75bd71_7e9a_4ae7_9d44_9012f47e11ca(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int m = (arr1.size() + arr2.size()) / 2;
        int sum1 = 0, sum2 = 0;
        for(int i = 0; i < m; i++) {
            sum1 += arr1.get(i);
            sum2 += arr2.get(i);
        }
        float median = (sum1 + sum2) / m;
        float sum = 0;
        for(int i = 0; i < n; i++) {
            sum += arr1.get(i);
        }
        return sum / n;
    }

    
    public static float getMedian_Problem_2_1d6924bd_19a2_4369_9ddb_11680079ff5b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr1.get(1)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_2_eab93532_44c4_4283_abcb_cac3cafb5986(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median;
        if (arr1.size() > arr2.size()) {
            median =  getMedian_Problem_2_eab93532_44c4_4283_abcb_cac3cafb5986(arr2, arr1, n);
        } else {
            median =  getMedian_Problem_2_eab93532_44c4_4283_abcb_cac3cafb5986(arr1, arr2, n);
        }
        return median;
    }

    
    public static float getMedian_Problem_1_feeacedf_4a3e_40e1_b9d1_57f6854e72fa(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_4b5b89eb_1b98_4c96_a236_7347933e042a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        // write your code here
        int size = arr1.size();
        if(arr2.size() > size) {
            ArrayList<Integer> arr3 = new ArrayList<Integer>(arr2);
            for(int i = 0; i < arr2.size(); i++) {
                arr3.add(arr2.get(i));
            }
            return getMedian_Problem_2_4b5b89eb_1b98_4c96_a236_7347933e042a(arr1, arr3, n);
        }
        return (arr1.get(size-1) + arr2.get(size-1)) / 2;
    }

    
    public static float getMedian_Problem_1_b1826fad_f935_4046_9b4a_913badb03189(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_6796fe20_7dbd_445a_9b9c_ef5fd94a36a8(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 0) {
            throw new IllegalArgumentException("The two arrays are empty");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2.0;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (i == arr1.size()) {
            return arr2.get(j);
        } else if (j == arr2.size()) {
            return arr1.get(i);
        } else {
            return (arr1.get(i) + arr2.get(j)) / 2.0;
        }
    }

    
    public static float getMedian_Problem_0_a6cd8351_b02b_49b5_9afd_40b3de8cd5ae(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays should be of same size");
        }
        if(arr1.size() == 0) {
            return 0;
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr1.get(1)) / 2;
        }
        int mid = arr1.size() / 2;
        if(arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_1_65792403_166e_459f_8ac0_fa175807a2dd(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int m1 = -1;
        int m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_39f53ee7_bb23_4d64_b08c_051cfbe3c240(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (i == arr1.size()) {
            return arr2.get(j);
        } else if (j == arr2.size()) {
            return arr1.get(i);
        } else {
            return (arr1.get(i) + arr2.get(j)) / 2;
        }
    }

    
    public static float getMedian_Problem_1_7d9c6a75_ff21_4ca1_b386_0bc313908b1d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays must be of same size");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int left = 0;
        int right = arr1.size() - 1;
        while (left <= right) {
            if (arr1.get(mid) < arr2.get(mid)) {
                left = mid + 1;
            } else if (arr1.get(mid) > arr2.get(mid)) {
                right = mid - 1;
            } else {
                return arr1.get(mid);
            }
            mid = (left + right) / 2;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_2_f1352776_2df7_4199_90d5_5d2a01558bab(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
            else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_7668f170_5406_48db_9116_1bffac18d010(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median =  0;
        if (arr1.size() > arr2.size()) {
            for (int i = 0; i < n; i++) {
                int l1 = arr1.get(i);
                int l2 = arr2.get(i);
                median += (l1 + l2) / 2;
            }
        } else {
            for (int i = 0; i < n; i++) {
                int l1 = arr1.get(i);
                int l2 = arr2.get(i);
                median += l1 + l2;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_1_87e855e0_4b3d_4223_b727_5069b628b571(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = (n + 1) / 2;
        if (arr1.size() > arr2.size()) {
            return getMedian_Problem_1_87e855e0_4b3d_4223_b727_5069b628b571(arr2, arr1, mid);
        }
        if (arr1.size() < arr2.size()) {
            return getMedian_Problem_1_87e855e0_4b3d_4223_b727_5069b628b571(arr1, arr2, mid);
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr1.get(i) + arr2.get(i);
        }
        float median =  sum / n;
        return median;
    }

    
    public static float getMedian_Problem_1_4b130ebe_d8cd_4c96_b790_7cfcf4ebf7c4(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_2_c6894179_2097_40d7_b915_54d11e7ece9f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        // Code goes here
        int median = 0;
        
        if(arr1.size() == 0 || arr2.size() == 0)
            return 0;
        
        if(arr1.size() > arr2.size())
            n = arr1.size();
        else
            n = arr2.size();
        
        for(int i = 0; i < n; i++) {
            median += arr1.get(i) + arr2.get(i);
        }
        
        int half = n/2;
        median /= half;
        return Float.parseFloat(Float.toString(median));
    }

    
    public static float getMedian_Problem_0_dbb919a4_e976_4a45_b35b_f821ca952f92(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1 == null || arr2 == null) {
            throw new IllegalArgumentException("ArrayLists can not be empty");
        }
        if (arr1.size() < arr2.size()) {
            ArrayList<Integer> arr3 = new ArrayList<Integer>(arr2);
            arr3.addAll(arr1);
            return getMedian_Problem_0_dbb919a4_e976_4a45_b35b_f821ca952f92(arr1, arr3, n - arr1.size());
        }
        ArrayList<Integer> arr3 = new ArrayList<Integer>(arr1);
        arr3.addAll(arr2);
        arr3.removeAll(arr1);
        return getMedian_Problem_0_dbb919a4_e976_4a45_b35b_f821ca952f92(arr3, arr3, n - arr3.size());
    }

    
    public static float getMedian_Problem_0_571a607c_a51e_4485_813c_be1410942448(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (i == arr1.size()) {
            return arr2.get(j);
        } else if (j == arr2.size()) {
            return arr1.get(i);
        } else {
            return (arr1.get(i) + arr2.get(j)) / 2;
        }
    }

    
    public static float getMedian_Problem_2_cfd92b6c_3875_4fae_b77a_d08860a8c482(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_52b95c50_a075_4eb3_a49a_a7d339963da4(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_074694df_a7f7_487d_9998_086abe379425(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            }
            else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_87d2161e_251f_47b8_bd98_f8db2b792b15(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_f1352776_2df7_4199_90d5_5d2a01558bab(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
            else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_dd37a666_5be3_43c1_b522_e7dd4a002387(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                count++;
                i++;
                j++;
            }
        }
        if (count == n) {
            return (arr1.get(i - 1) + arr2.get(j - 1)) / 2.0;
        } else if (count < n) {
            return arr1.get(i - 1);
        } else {
            return arr2.get(j - 1);
        }
    }

    
    public static float getMedian_Problem_0_ce85318f_137a_4689_b3c5_8cf69fb52303(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_2_0bd0540a_1f91_41d9_84d1_545bbd115531(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        median = (m1 + m2) / 2;
        return median;
    }

    
    public static float getMedian_Problem_0_eda26962_997c_42ce_b8df_03f99edcd68c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_5a470991_daf1_438c_9662_80b5ccc9b421(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median;
        if (arr1.size() > arr2.size()) {
            median =  getMedian_Problem_0_5a470991_daf1_438c_9662_80b5ccc9b421(arr2, arr1, n);
        } else {
            median =  getMedian_Problem_0_5a470991_daf1_438c_9662_80b5ccc9b421(arr1, arr2, n);
        }
        return median;
    }

    
    public static float getMedian_Problem_2_0b0b054d_10bb_49c7_9cb6_aee7897dcc16(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0).intValue();
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0).intValue();
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i).intValue();
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j).intValue();
                j++;
            }
        }
        median = (m1 + m2) / 2.0;
        return median;
    }

    
    public static float getMedian_Problem_0_faff0b0b_007b_4794_b755_f1fc1348dbf6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_0_6d061ff0_dd62_46d1_bd2e_0e1db47f7469(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int sum = 0;
        int mid = n/2;
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < n; i++) {
            sum += arr1.get(i);
            sum1 += arr2.get(i);
        }
        float median =  sum/n;
        float median1 =  sum1/n;
        float median2 =  sum2/n;
        if(sum%2 == 0) {
            return median;
        } else {
            return median1;
        }
    }

    
    public static float getMedian_Problem_2_679338b5_aaac_423f_8f1a_b0a2ba1cc45c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = (arr1.size() + arr2.size()) / 2;
        if (arr1.size() > arr2.size()) {
            return getMedian_Problem_2_679338b5_aaac_423f_8f1a_b0a2ba1cc45c(arr1, arr2, mid);
        } else {
            return getMedian_Problem_2_679338b5_aaac_423f_8f1a_b0a2ba1cc45c(arr2, arr1, mid);
        }
    }

    
    public static float getMedian_Problem_1_4dee14b2_72f4_4433_a0f1_cfdf1bbfbb7f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0).intValue();
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0).intValue();
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i).intValue();
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j).intValue();
                j++;
            }
        }
        median = (m1 + m2) / 2;
        return median;
    }

    
    public static float getMedian_Problem_2_27a600a8_cb5e_4e2f_b6b6_df2572b09964(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_1_cb8a0509_1030_4cc4_96c9_513c44000ff8(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_0616ac5c_e841_4c02_9b7e_8000baa9012c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_6f4835ef_45c7_4ef4_a9fc_4f49ae72be79(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                count++;
                i++;
                j++;
            }
        }
        if (count == n) {
            return  ((arr1.get(i - 1) + arr2.get(j - 1)) / 2);
        } else if (count < n) {
            return  arr1.get(i - 1);
        } else {
            return  arr2.get(j - 1);
        }
    }

    
    public static float getMedian_Problem_2_bfef20d7_c4d6_4d77_895c_ec51656d56ed(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr1.get(1)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_2_258f2e2b_e13c_439e_9a80_6f668ee07476(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() == arr2.size()) {
            int sum = 0;
            for (int i = 0; i < arr1.size(); i++) {
                sum += arr1.get(i);
            }
            for (int i = 0; i < arr2.size(); i++) {
                sum += arr2.get(i);
            }
            if (sum % 2 == 0) {
                return  ((arr1.get(arr1.size() / 2) + arr2.get(arr2.size() / 2)) / 2);
            } else {
                return  (arr1.get(arr1.size() / 2) + arr2.get(arr2.size() / 2)) / 2;
            }
        } else {
            return  (arr1.get(arr1.size() / 2) + arr2.get(arr2.size() / 2)) / 2;
        }
    }

    
    public static float getMedian_Problem_2_6136dda5_6b09_4ee6_a511_7617b07fe7b1(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get( j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get( i);
                i++;
            } else if (arr1.get( i) < arr2.get( j)) {
                m1 = m2;
                m2 = arr1.get( i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get( j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_e9c10a10_fa58_4d6c_a0cf_f5f61cc599dc(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int sum = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                sum += arr1.get(i);
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                sum += arr2.get(j);
                j++;
            } else {
                sum += arr1.get(i);
                i++;
                j++;
            }
        }
        while (i < arr1.size()) {
            sum += arr1.get(i);
            i++;
        }
        while (j < arr2.size()) {
            sum += arr2.get(j);
            j++;
        }
        return  sum / n;
    }

    
    public static float getMedian_Problem_0_e082661c_fe28_4c5f_a28d_c9a597e50a37(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (i == n) {
                median += arr2.get(j);
                j++;
            } else if (j == n) {
                median += arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                median += arr1.get(i);
                i++;
            } else {
                median += arr2.get(j);
                j++;
            }
            count++;
        }
        return median / 2;
    }

    
    public static float getMedian_Problem_0_6a3f2803_f2be_4a36_8edc_630e44ae47cd(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_1_9453ac82_b84e_4c99_9a19_b7251d7e77bf(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_eab93532_44c4_4283_abcb_cac3cafb5986(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median;
        if (arr1.size() > arr2.size()) {
            median =  getMedian_Problem_0_eab93532_44c4_4283_abcb_cac3cafb5986(arr2, arr1, n);
        } else {
            median =  getMedian_Problem_0_eab93532_44c4_4283_abcb_cac3cafb5986(arr1, arr2, n);
        }
        return median;
    }

    
    public static float getMedian_Problem_2_8bee9b70_9ed2_416b_b717_bd1e30b2d8c9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_ebe4f182_8d6b_41ca_ae89_78305dee7ac4(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        ArrayList<Integer> sorted1 = new ArrayList<Integer>(arr1);
        ArrayList<Integer> sorted2 = new ArrayList<Integer>(arr2);
        Collections.sort(sorted1);
        Collections.sort(sorted2);
        int middle1 =  (n/2);
        int middle2 =  (n/2);
        int median1 = sorted1.get(middle1);
        int median2 = sorted2.get(middle2);
        if (n == 1){
            return  median2;
        }
        if (n == 2){
            return  median1;
        }
        if (median1 > median2){
            return  getMedian_Problem_0_ebe4f182_8d6b_41ca_ae89_78305dee7ac4(arr1, sorted2, n);
        } else {
            return  getMedian_Problem_0_ebe4f182_8d6b_41ca_ae89_78305dee7ac4(arr2, sorted1, n);
        }
    }

    
    public static float getMedian_Problem_0_01bcde5d_1c3c_4151_86ff_fce7167dd090(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0, high = arr1.get(arr1.size()/2);
        for(int i = 0; i < arr2.size(); i++) {
            if(high > arr2.get(i)) {
                high = arr2.get(i);
            }
        }
        if(high > n) high = n;
        if(arr1.size() > arr2.size()) {
            for(int i = 0; i < arr1.size(); i++) {
                if(high > arr1.get(i)) high = arr1.get(i);
            }
            return high;
        } else {
            for(int i = 0; i < arr2.size(); i++) {
                if(high > arr2.get(i)) high = arr2.get(i);
            }
            return high;
        }
    }

    
    public static float getMedian_Problem_2_68247956_7a8f_4e1c_b3f7_1256cef3d28a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
            else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_dbdc6eaf_9650_499f_abdd_039648c47b51(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 0) {
            throw new IllegalArgumentException("The two arrays are empty");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_1_3e20dd10_e7b4_4b80_b615_a9b9f175aa55(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        median = (m1 + m2) / 2.0;
        return median;
    }

    
    public static float getMedian_Problem_1_5a71e3f9_9274_4737_84ea_73ec1b1b3288(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_036e572a_b3ea_46b6_a6d5_3789d616d244(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 0) {
            throw new IllegalArgumentException("The two arrays are empty");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2.0;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while (i < mid) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (arr1.size() % 2 == 0) {
            return (arr1.get(i) + arr2.get(j)) / 2.0;
        } else {
            return arr1.get(i);
        }
    }

    
    public static float getMedian_Problem_0_e3b3fea4_3d05_4186_beb5_833bf0f12bf0(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_1_128e3907_d63f_41a8_9994_0655518f7ed0(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                median = arr2.get(j);
                break;
            }
            if (j == n) {
                median = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_0_6bbb5aff_8e4c_43bf_b2b5_ff04ed94b365(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int m1 = -1;
        int m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_679d8a51_9506_48a6_8964_18921f0183b6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two lists are not of same size");
        }
        if(arr1.size() == 0) {
            return 0;
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if(arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_2_4dee14b2_72f4_4433_a0f1_cfdf1bbfbb7f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0).intValue();
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0).intValue();
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i).intValue();
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j).intValue();
                j++;
            }
        }
        median = (m1 + m2) / 2;
        return median;
    }

    
    public static float getMedian_Problem_1_f1fe3a44_4490_467a_a0f0_3282b982788f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_0_7b332b9c_cda0_4953_98d2_467fed8ef036(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get( j);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get( i);
                break;
            }
            if (arr1.get( i) < arr2.get( j)) {
                m1 = m2;
                m2 = arr1.get( i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get( j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_0_e381dd11_fc58_4612_9b53_6fa8bd0f8ee8(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two lists must be of same size");
        }
        if(arr1.size() == 0) {
            return 0;
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while(i < mid) {
            if(arr1.get(i) < arr2.get(j)) {
                i++;
            } else if(arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if(arr1.size() % 2 == 0) {
            return (arr1.get(i) + arr2.get(j)) / 2;
        } else {
            return arr1.get(i);
        }
    }

    
    public static float getMedian_Problem_1_3a97bba8_a2ea_4502_8637_c79208fbad58(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_01bcde5d_1c3c_4151_86ff_fce7167dd090(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0, high = arr1.get(arr1.size()/2);
        for(int i = 0; i < arr2.size(); i++) {
            if(high > arr2.get(i)) {
                high = arr2.get(i);
            }
        }
        if(high > n) high = n;
        if(arr1.size() > arr2.size()) {
            for(int i = 0; i < arr1.size(); i++) {
                if(high > arr1.get(i)) high = arr1.get(i);
            }
            return high;
        } else {
            for(int i = 0; i < arr2.size(); i++) {
                if(high > arr2.get(i)) high = arr2.get(i);
            }
            return high;
        }
    }

    
    public static float getMedian_Problem_0_3a64467c_b298_4d7f_8763_bca28d10044c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1;
        int m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                break;
            }
            if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_6136dda5_6b09_4ee6_a511_7617b07fe7b1(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get( j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get( i);
                i++;
            } else if (arr1.get( i) < arr2.get( j)) {
                m1 = m2;
                m2 = arr1.get( i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get( j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_392772f9_fd66_4644_af9c_9a8d02c1ca8d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int mid = (arr1.size() + arr2.size()) / 2;
        if (arr1.size() == arr2.size()) {
            while (i < arr1.size() && j < arr2.size()) {
                if (arr1.get(i) < arr2.get(j)) {
                    i++;
                } else if (arr1.get(i) > arr2.get(j)) {
                    j++;
                } else {
                    i++;
                    j++;
                }
            }
            if (i == arr1.size()) {
                return arr2.get(j);
            } else if (j == arr2.size()) {
                return arr1.get(i);
            } else {
                return (arr1.get(i) + arr2.get(j)) / 2.0;
            }
        } else if (arr1.size() > arr2.size()) {
            while (i < arr1.size() && j < arr2.size()) {
                if (arr1.get(i) < arr2.get(j)) {
                    i++;
                } else if (arr1.get(i) > arr2.get(j)) {
                    j++;
                } else {
                    i++;
                    j++;
                }
            }
            if (i == arr1.size()) {
                return arr2.get(j);
            } else {
                return arr1.get(i);
            }
        } else {
            while (i < arr1.size() && j < arr2.size()) {
                if (arr1.get(i) < arr2.get(j)) {
                    i++;
                } else if (arr1.get(i) > arr2.get(j)) {
                    j++;
                } else {
                    i++;
                    j++;
                }
            }
            if (i == arr1.size()) {
                return arr2.get(j);
            } else {
                return arr1.get(i);
            }
        }
    }

    
    public static float getMedian_Problem_1_47f14cb9_2049_4db4_8135_6bf85eac05b6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2.0;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2.0;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_0_aae821ef_c4d3_46ff_b773_75cefae98d41(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        
        // Check input parameters
        if (arr1.size() != arr2.size()) {
            System.out.println("Error: arr1 and arr2 sizes are not equal.");
            System.exit(-1);
        }

        // If there are an even number of elements, then the median is just the
        // middle element
        if (arr1.size() % 2 == 0 && arr2.size() % 2 == 0) {
            return arr1.get((n/2)) + arr2.get((n/2));
        }

        // If there are an odd number of elements, then there is an average of
        // the middle elements and the median is half way between the two
        // middle elements
        else if (arr1.size() % 2 != 0 && arr2.size() % 2 != 0) {
            int mid = (n/2);
            return ((arr1.get(mid) + arr2.get(mid))/2) / 2;
        }

        // If n is odd, then we compute the median as the average of the first
        // and the last element
        else {
            int mid = (n/2);
            return ((arr1.get(mid) + arr2.get(mid))/2) / 2;
        }
    }

    
    public static float getMedian_Problem_2_b2cbd1ec_f0fc_4b3c_9230_42403dc1fed6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_3bcc1151_0a6d_4029_8a91_c5734b109a0b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            return -1;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int i = 0, j = 0;
        while (i < mid) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (i == mid) {
            return arr1.get(i);
        }
        if (j == mid) {
            return arr2.get(j);
        }
        return (arr1.get(i) + arr2.get(j)) / 2;
    }

    
    public static float getMedian_Problem_0_4e49bf07_d83c_445c_b7b3_7a3ede714cc4(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        int m1 = -1;
        int m2 = -1;
        while (count <= n) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0).intValue();
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0).intValue();
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i).intValue();
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j).intValue();
                j++;
            }
            count++;
        }
        if (n % 2 == 0) {
            median =  (m1 + m2) / 2;
        } else {
            median = m2;
        }
        return median;
    }

    
    public static float getMedian_Problem_0_dc75bd71_7e9a_4ae7_9d44_9012f47e11ca(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int m = (arr1.size() + arr2.size()) / 2;
        int sum1 = 0, sum2 = 0;
        for(int i = 0; i < m; i++) {
            sum1 += arr1.get(i);
            sum2 += arr2.get(i);
        }
        float median = (sum1 + sum2) / m;
        float sum = 0;
        for(int i = 0; i < n; i++) {
            sum += arr1.get(i);
        }
        return sum / n;
    }

    
    public static float getMedian_Problem_2_e00b81d8_a6e2_4cfb_adeb_6bdfb05509aa(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int size = arr1.size() + arr2.size();
        int mid = size / 2;
        if (size % 2 == 0) {
            return  ((arr1.get(mid) + arr2.get(mid)) / 2);
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_0_215bca0e_432a_4f5c_839b_60ffc59df268(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int size = arr1.size();
        while (i < size && j < size) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (i == size) {
            return arr2.get(j - 1);
        } else if (j == size) {
            return arr1.get(i - 1);
        } else {
            return (arr1.get(i - 1) + arr2.get(j - 1)) / 2.0;
        }
    }

    
    public static float getMedian_Problem_2_1384f5fb_0afe_4353_b147_2a765c05480b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if(arr1.size() == 0) {
            return 0;
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if(arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_2_4fbcde55_3091_4485_b55b_3ac1f93629ad(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_0_fd7c27e8_f9f5_4e9d_a60d_65e636a067ad(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int median = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        while (count <= n) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_1_e381dd11_fc58_4612_9b53_6fa8bd0f8ee8(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two lists must be of same size");
        }
        if(arr1.size() == 0) {
            return 0;
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while(i < mid) {
            if(arr1.get(i) < arr2.get(j)) {
                i++;
            } else if(arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if(arr1.size() % 2 == 0) {
            return (arr1.get(i) + arr2.get(j)) / 2;
        } else {
            return arr1.get(i);
        }
    }

    
    public static float getMedian_Problem_0_1c7e6c3b_7929_4cd6_aaa3_a977635c8174(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_3cd42609_3709_4be4_8b1f_a1c9e84c78fa(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("Arrays must be of same size");
        }
        if(arr1.size() == 0) {
            return 0;
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while(i < mid) {
            if(arr1.get(i) < arr2.get(j)) {
                i++;
            } else if(arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if(arr1.size() % 2 == 0) {
            return (arr1.get(i) + arr2.get(j)) / 2;
        } else {
            return arr1.get(i);
        }
    }

    
    public static float getMedian_Problem_1_5a7327b1_6c37_44b8_a8b5_13d4fd577205(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_aae821ef_c4d3_46ff_b773_75cefae98d41(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        
        // Check input parameters
        if (arr1.size() != arr2.size()) {
            System.out.println("Error: arr1 and arr2 sizes are not equal.");
            System.exit(-1);
        }

        // If there are an even number of elements, then the median is just the
        // middle element
        if (arr1.size() % 2 == 0 && arr2.size() % 2 == 0) {
            return arr1.get((n/2)) + arr2.get((n/2));
        }

        // If there are an odd number of elements, then there is an average of
        // the middle elements and the median is half way between the two
        // middle elements
        else if (arr1.size() % 2 != 0 && arr2.size() % 2 != 0) {
            int mid = (n/2);
            return ((arr1.get(mid) + arr2.get(mid))/2) / 2;
        }

        // If n is odd, then we compute the median as the average of the first
        // and the last element
        else {
            int mid = (n/2);
            return ((arr1.get(mid) + arr2.get(mid))/2) / 2;
        }
    }

    
    public static float getMedian_Problem_0_0b0b054d_10bb_49c7_9cb6_aee7897dcc16(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0).intValue();
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0).intValue();
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i).intValue();
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j).intValue();
                j++;
            }
        }
        median = (m1 + m2) / 2.0;
        return median;
    }

    
    public static float getMedian_Problem_0_5bd3fb8f_8a91_4ae9_a549_e5de42b64c2c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0;
        int j = 0;
        int count;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_0_50a22e35_fe9f_465d_98c1_7481b8819155(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() == arr2.size()) {
            int sum = 0;
            for (int i = 0; i < arr1.size(); i++) {
                sum += arr1.get(i);
            }
            for (int i = 0; i < arr2.size(); i++) {
                sum += arr2.get(i);
            }
            if (sum % 2 == 0) {
                return  ((arr1.get(arr1.size() / 2) + arr2.get(arr2.size() / 2)) / 2);
            } else {
                return  (arr1.get(arr1.size() / 2) + arr2.get(arr2.size() / 2)) / 2;
            }
        } else {
            return  (arr1.get(arr1.size() / 2) + arr2.get(arr2.size() / 2)) / 2;
        }
    }

    
    public static float getMedian_Problem_0_57bdb2bf_8338_45fc_908f_ca4d6af019ab(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        return arr1.get( (n * 0.5)) + arr2.get( (n * 0.5));
    }

    
    public static float getMedian_Problem_1_12aa832a_9b86_42e2_84cd_17635f3ba268(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays should be of same size");
        }
        if (arr1.size() == 0) {
            throw new IllegalArgumentException("The two arrays should be non-empty");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2.0;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while (i < mid) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (arr1.get(i) < arr2.get(j)) {
            return arr1.get(i);
        } else if (arr1.get(i) > arr2.get(j)) {
            return arr2.get(j);
        } else {
            return (arr1.get(i) + arr2.get(j)) / 2.0;
        }
    }

    
    public static float getMedian_Problem_2_01bcde5d_1c3c_4151_86ff_fce7167dd090(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0, high = arr1.get(arr1.size()/2);
        for(int i = 0; i < arr2.size(); i++) {
            if(high > arr2.get(i)) {
                high = arr2.get(i);
            }
        }
        if(high > n) high = n;
        if(arr1.size() > arr2.size()) {
            for(int i = 0; i < arr1.size(); i++) {
                if(high > arr1.get(i)) high = arr1.get(i);
            }
            return high;
        } else {
            for(int i = 0; i < arr2.size(); i++) {
                if(high > arr2.get(i)) high = arr2.get(i);
            }
            return high;
        }
    }

    
    public static float getMedian_Problem_0_679338b5_aaac_423f_8f1a_b0a2ba1cc45c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = (arr1.size() + arr2.size()) / 2;
        if (arr1.size() > arr2.size()) {
            return getMedian_Problem_0_679338b5_aaac_423f_8f1a_b0a2ba1cc45c(arr1, arr2, mid);
        } else {
            return getMedian_Problem_0_679338b5_aaac_423f_8f1a_b0a2ba1cc45c(arr2, arr1, mid);
        }
    }

    
    public static float getMedian_Problem_0_a4f7b3a1_b359_4df0_a07a_ce732d8ffb67(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int sum = 0;
        int mid = 0;
        float median = 0;
        for(int i = 0; i < n; i++) {
            sum += arr1.get(i);
            sum += arr2.get(i);
        }
        mid = sum / 2;
        for(int i = 0; i < n; i++) {
            if(arr1.get(i) < mid) {
                median += arr1.get(i);
            }
            if(arr2.get(i) < mid) {
                median += arr2.get(i);
            }
        }
        median = median / 2;
        return median;
    }

    
    public static float getMedian_Problem_2_77a3a3f1_d134_4569_84bb_eae7c2918609(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                median = arr2.get(j);
                break;
            }
            if (j == n) {
                median = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_1_ce85318f_137a_4689_b3c5_8cf69fb52303(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_1_63fdf38b_0a7c_4677_9b87_f5be15b7d6f0(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        while (count < n) {
            if (i == n) {
                median += arr2.get(j);
                j++;
            } else if (j == n) {
                median += arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                median += arr1.get(i);
                i++;
            } else {
                median += arr2.get(j);
                j++;
            }
            count++;
        }
        return median / 2;
    }

    
    public static float getMedian_Problem_2_4b130ebe_d8cd_4c96_b790_7cfcf4ebf7c4(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_2_fc0277e6_4361_4114_af20_4815cc7edd93(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int size = arr1.size();
        if (size != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (size == 1) {
            return  arr1.get(0);
        }
        if (size == 2) {
            return  (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = size / 2;
        int i = 0;
        int j = 0;
        while (i < mid && j < mid) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (i == mid) {
            return  arr1.get(i);
        }
        if (j == mid) {
            return  arr2.get(j);
        }
        if (arr1.get(i) < arr2.get(j)) {
            return  (arr1.get(i) + arr2.get(j)) / 2;
        } else {
            return  (arr1.get(i) + arr2.get(j)) / 2;
        }
    }

    
    public static float getMedian_Problem_1_bc1eb431_c49f_4a0b_b087_56f0a6264004(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            return -1;
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if(arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_1_9ac0b7e4_2e4b_4b67_8202_dc2dda99be9e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int size = arr1.size();
        int size2 = arr2.size();
        int size3 = size + size2;
        if (size3 % 2 == 0) {
            return  ((arr1.get(i) + arr2.get(j)) / 2);
        } else {
            return  (arr1.get(i) + arr2.get(j));
        }
    }

    
    public static float getMedian_Problem_2_8c991c29_947f_4fdf_a8f7_9288da60d590(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        int m1 = -1;
        int m2 = -1;
        while (count <= n) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0).intValue();
                break;
            }
            else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0).intValue();
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i).intValue();
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2.get(j).intValue();
                j++;
            }
            count++;
        }
        median = (m1 + m2) / 2.0;
        return median;
    }

    
    public static float getMedian_Problem_2_16fd65af_b101_47c0_9501_fab001dcc3ab(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get( j);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get( i);
                break;
            }
            if (arr1.get( i) < arr2.get( j)) {
                m1 = m2;
                m2 = arr1.get( i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get( j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_2_62b925c9_dcad_4c76_93bf_0aafdb31978b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int median = 0;
        if (arr1.size() >= arr2.size()) {
            median = arr1.get((arr1.size() / 2) - 1) + ((arr2.get((arr2.size() / 2) - 1)
                    - arr1.get((arr1.size() / 2) - 1)) / 2);
        } else {
            median = arr2.get((arr2.size() / 2) - 1) + ((arr1.get((arr1.size() / 2) - 1)
                    - arr2.get((arr2.size() / 2) - 1)) / 2);
        }
        return  median;
    }

    
    public static float getMedian_Problem_1_d4d1b0c4_27f6_41a1_b15e_7d13e59eb8ef(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("Arrays must be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_2_71b15cc5_4d84_44f8_ac17_1ad2f65f30fc(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() == arr2.size()) {
            int sum = 0;
            for(int i = 0; i < arr1.size(); i++) {
                sum += arr1.get(i);
            }
            for(int i = 0; i < arr2.size(); i++) {
                sum += arr2.get(i);
            }
            if(sum > n) {
                return getMedian_Problem_2_71b15cc5_4d84_44f8_ac17_1ad2f65f30fc(arr2, arr1, n);
            }
            else {
                return  (arr1.get(arr1.size()/2) + arr2.get(arr2.size()/2)) / 2;
            }
        }
        else {
            return  (arr1.get(arr1.size()/2) + arr2.get(arr2.size()/2)) / 2;
        }
    }

    
    public static float getMedian_Problem_1_c52d7847_83c4_4d4e_92ca_9820a1be941f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int sum = 0;
        int mid = n/2;
        for(int i = 0; i < n; i++) {
            sum += arr1.get(i);
        }
        for(int i = 0; i < n; i++) {
            sum += arr2.get(i);
        }
        float median =  sum / n;
        return median;
    }

    
    public static float getMedian_Problem_0_8b728065_1a2a_495e_a999_484e014da632(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = (n + 1) / 2;
        if (arr1.size() > arr2.size()) {
            return getMedian_Problem_0_8b728065_1a2a_495e_a999_484e014da632(arr2, arr1, mid);
        } else {
            return getMedian_Problem_0_8b728065_1a2a_495e_a999_484e014da632(arr1, arr2, mid);
        }
    }

    
    public static float getMedian_Problem_0_e9c10a10_fa58_4d6c_a0cf_f5f61cc599dc(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int sum = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                sum += arr1.get(i);
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                sum += arr2.get(j);
                j++;
            } else {
                sum += arr1.get(i);
                i++;
                j++;
            }
        }
        while (i < arr1.size()) {
            sum += arr1.get(i);
            i++;
        }
        while (j < arr2.size()) {
            sum += arr2.get(j);
            j++;
        }
        return  sum / n;
    }

    
    public static float getMedian_Problem_2_be115c87_c5d4_4267_99d9_8bada5ac99df(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_bbe647a0_3649_4120_b424_28bb20a0dd46(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr1.get(1)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_0_ffc204d0_d55e_44b0_a3d0_7632dc9408da(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr1.get(1)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_2_f46a7e7b_73a6_4fcd_9f89_115e26eaa9eb(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() == arr2.size()) {
            int sum = 0;
            for (int i = 0; i < arr1.size(); i++) {
                sum += arr1.get(i);
            }
            for (int i = 0; i < arr2.size(); i++) {
                sum += arr2.get(i);
            }
            if (sum % 2 == 0) {
                return  ((arr1.get(arr1.size() / 2) + arr2.get(arr2.size() / 2)) / 2);
            } else {
                return  (arr1.get(arr1.size() / 2) + arr2.get(arr2.size() / 2)) / 2;
            }
        } else {
            return  (arr1.get(arr1.size() / 2) + arr2.get(arr2.size() / 2)) / 2;
        }
    }

    
    public static float getMedian_Problem_2_c8209fd3_7c58_4ca8_9592_6d10dce34f0e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        // Your code here
        int i=0,j=0,k=0;
        int[] arr3 = new int[2*n];
        while(i<n && j<n){
            if(arr1.get(i)<arr2.get(j)){
                arr3[k]=arr1.get(i);
                i++;
            }
            else{
                arr3[k]=arr2.get(j);
                j++;
            }
            k++;
        }
        while(i<n){
            arr3[k]=arr1.get(i);
            i++;
            k++;
        }
        while(j<n){
            arr3[k]=arr2.get(j);
            j++;
            k++;
        }
        return (arr3[(n-1)]+arr3[n])/2;
    }

    
    public static float getMedian_Problem_0_ef53482c_153d_45ea_8a5c_2a77d72b8be3(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            return -1;
        }
        if (arr1.size() == 0) {
            return -1;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_1_41857aa9_2233_4175_817b_bff316376d79(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int left = 0;
        int right = arr1.size() - 1;
        while (left < right) {
            if (arr1.get(left) < arr1.get(right)) {
                if (arr1.get(left) < arr2.get(mid)) {
                    left++;
                } else if (arr2.get(mid) < arr1.get(right)) {
                    right--;
                } else {
                    return arr1.get(left);
                }
            } else {
                if (arr2.get(mid) < arr1.get(left)) {
                    left++;
                } else if (arr1.get(right) < arr2.get(mid)) {
                    right--;
                } else {
                    return arr2.get(mid);
                }
            }
        }
        return arr1.get(left);
    }

    
    public static float getMedian_Problem_2_cb8a0509_1030_4cc4_96c9_513c44000ff8(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_e6381e31_439e_4840_bfc4_ad8ead9fe210(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_e082661c_fe28_4c5f_a28d_c9a597e50a37(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (i == n) {
                median += arr2.get(j);
                j++;
            } else if (j == n) {
                median += arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                median += arr1.get(i);
                i++;
            } else {
                median += arr2.get(j);
                j++;
            }
            count++;
        }
        return median / 2;
    }

    
    public static float getMedian_Problem_1_43a539db_97a4_41f9_91cd_686121d85190(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int size = arr1.size();
        if (size != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        while (i < size && j < size) {
            if (arr1.get(i) <= arr2.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        if (i == size) {
            return arr1.get(i - 1);
        } else if (j == size) {
            return arr2.get(j - 1);
        } else {
            return (arr1.get(i - 1) + arr2.get(j - 1)) / 2.0;
        }
    }

    
    public static float getMedian_Problem_0_18d6e0b4_bd86_4dcd_b71a_a8f0ff7e21b3(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0;
        int j = 0;
        int count;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_0_7668f170_5406_48db_9116_1bffac18d010(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median =  0;
        if (arr1.size() > arr2.size()) {
            for (int i = 0; i < n; i++) {
                int l1 = arr1.get(i);
                int l2 = arr2.get(i);
                median += (l1 + l2) / 2;
            }
        } else {
            for (int i = 0; i < n; i++) {
                int l1 = arr1.get(i);
                int l2 = arr2.get(i);
                median += l1 + l2;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_2_32e8eff0_b3c8_4bdc_a243_0cc0e033f5d6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                median = arr2.get(j);
                break;
            }
            if (j == n) {
                median = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_2_b88bf0af_2ab2_4dd4_b8bb_9b08cee6a5be(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int k = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                k++;
                i++;
                j++;
            }
        }
        if (k == n / 2) {
            return  (arr1.get(i - 1) + arr2.get(j - 1)) / 2;
        } else if (k < n / 2) {
            return  arr1.get(i - 1);
        } else {
            return  arr2.get(j - 1);
        }
    }

    
    public static float getMedian_Problem_0_b8006c2e_7188_4813_adb8_b0135858922c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int median = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        int m1 = -1;
        int m2 = -1;
        while (count <= n) {
            count++;
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        median = (m1 + m2) / 2;
        return median;
    }

    
    public static float getMedian_Problem_0_7b2ae845_ecb0_42b8_a3ff_e4a5b8b16bde(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        // TODO Auto-generated method stub
        return 0;
    }

    
    public static float getMedian_Problem_2_825c2b2c_ab0d_4128_a555_9941c4ae9a94(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two array lists should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_0_df5f0c03_72bb_4b83_a3cb_f3aa30cc9673(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;
        int n1 = 0;
        int n2 = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                count++;
                i++;
                j++;
            }
        }
        if (count == n) {
            return (arr1.get(i - 1) + arr2.get(j - 1)) / 2.0;
        } else if (count > n / 2) {
            return (arr1.get(i - 1) + arr2.get(j - 1)) / 2.0;
        } else {
            while (i < arr1.size() && j < arr2.size()) {
                if (arr1.get(i) < arr2.get(j)) {
                    n1++;
                    i++;
                } else if (arr1.get(i) > arr2.get(j)) {
                    n2++;
                    j++;
                } else {
                    i++;
                    j++;
                }
            }
            if (n1 > n2) {
                return arr1.get(i - 1);
            } else {
                return arr2.get(j - 1);
            }
        }
    }

    
    public static float getMedian_Problem_1_cdf642e4_6841_402b_8713_fee83df5f561(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int sum = 0;
        int mid = n/2;
        for(int i = 0; i < n; i++) {
            sum += arr1.get(i);
        }
        for(int i = 0; i < n; i++) {
            sum += arr2.get(i);
        }
        float median =  sum/n;
        return median;
    }

    
    public static float getMedian_Problem_2_5065d916_4033_4964_962e_aa2a8fe92ac3(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays must be of same size");
        }
        if (arr1.size() == 0) {
            throw new IllegalArgumentException("The two arrays must be non-empty");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2.0;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while (i < mid) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (arr1.get(i) < arr2.get(j)) {
            return arr1.get(i);
        } else if (arr1.get(i) > arr2.get(j)) {
            return arr2.get(j);
        } else {
            return (arr1.get(i) + arr2.get(j)) / 2.0;
        }
    }

    
    public static float getMedian_Problem_1_9ab8ea3a_354a_4ab8_8dc5_5eb4f184df5d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        int m1 = -1;
        int m2 = -1;
        while (count <= n) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0).intValue();
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0).intValue();
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i).intValue();
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j).intValue();
                j++;
            }
            count++;
        }
        median = (m1 + m2) / 2;
        return median;
    }

    
    public static float getMedian_Problem_0_1f4e3e72_a64c_483f_bc86_6c9b3fd3ea2a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float temp;
        if (arr1.size() < arr2.size()) {
            temp = arr1.get((arr1.size() / 2));
            arr1.remove((arr1.size() / 2));
            arr2.remove((arr2.size() / 2));
            return temp;
        }
        temp = arr2.get((arr2.size() / 2));
        arr1.remove((arr2.size() / 2));
        arr2.remove((arr1.size() / 2));
        return temp;
    }

    
    public static float getMedian_Problem_0_d4d1b0c4_27f6_41a1_b15e_7d13e59eb8ef(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("Arrays must be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_2_2c0797c3_81b0_4984_9d24_14669f2ac28f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                count++;
                i++;
                j++;
            }
        }
        if (count == n) {
            return (arr1.get(i - 1) + arr2.get(j - 1)) / 2.0;
        } else if (count < n) {
            return arr1.get(i - 1);
        } else {
            return arr2.get(j - 1);
        }
    }

    
    public static float getMedian_Problem_0_8bee9b70_9ed2_416b_b717_bd1e30b2d8c9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_ef53482c_153d_45ea_8a5c_2a77d72b8be3(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            return -1;
        }
        if (arr1.size() == 0) {
            return -1;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_1_3d765a3c_80a7_4beb_aeef_a0cda973f88b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_1_b05d0ff8_6115_446b_bb8e_60f02296a78e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int sum = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                sum += arr1.get(i);
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                sum += arr2.get(j);
                j++;
            } else {
                sum += arr1.get(i);
                i++;
                j++;
            }
        }
        if (i == arr1.size()) {
            while (j < arr2.size()) {
                sum += arr2.get(j);
                j++;
            }
        } else if (j == arr2.size()) {
            while (i < arr1.size()) {
                sum += arr1.get(i);
                i++;
            }
        }
        return  sum / n;
    }

    
    public static float getMedian_Problem_2_de8bea11_1db4_4cde_89af_50e5cb730fab(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median;
        int mid;
        int sum;
        int min;
        int max;
        if (arr1.size() > arr2.size()) {
            min = arr1.get(arr1.size() - 1);
            max = arr2.get(arr2.size() - 1);
            mid = (min + max) / 2;
            sum = arr1.get(arr1.size() - 1) + arr2.get(arr2.size() - 1);
            median =  (sum / 2);
        } else if (arr1.size() < arr2.size()) {
            min = arr2.get(arr2.size() - 1);
            max = arr1.get(arr1.size() - 1);
            mid = (min + max) / 2;
            sum = arr1.get(arr1.size() - 1) + arr2.get(arr2.size() - 1);
            median =  (sum / 2);
        } else {
            min = arr1.get(arr1.size() - 1);
            max = arr2.get(arr2.size() - 1);
            mid = (min + max) / 2;
            sum = arr1.get(arr1.size() - 1) + arr2.get(arr2.size() - 1);
            median =  (sum / 2);
        }
        return median;
    }

    
    public static float getMedian_Problem_1_1c7e6c3b_7929_4cd6_aaa3_a977635c8174(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_3c24776a_4973_49a6_b9d4_2a969814d801(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_eaf0f96a_0388_4af0_8b37_b36a97fd73a4(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_0_d69ed044_7aac_4dc8_980c_05fd2fc3b99b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        if (arr1.size() < arr2.size()) {
            for (int i = 0; i < n; i++) {
                median += arr1.get(i);
            }
        } else {
            for (int i = 0; i < n; i++) {
                median += arr2.get(i);
            }
        }
        median /= n;
        return median;
    }

    
    public static float getMedian_Problem_1_2a5a255a_6d90_49d6_b892_4613cf4ee6bd(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 0) {
            throw new IllegalArgumentException("The two arrays are empty");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2.0;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2.0;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_1_ffc204d0_d55e_44b0_a3d0_7632dc9408da(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr1.get(1)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_0_a81253ac_30a5_4b3a_9366_d1355e820b61(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count = 0;
        int m1 = -1;
        int m2 = -1;
        while (count < n + 1) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
            count++;
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_a5a0aee0_2110_42ca_9e01_49e16f3deb57(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (i == n) {
                median += arr2.get(j);
                j++;
            } else if (j == n) {
                median += arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                median += arr1.get(i);
                i++;
            } else {
                median += arr2.get(j);
                j++;
            }
            count++;
        }
        return median / 2;
    }

    
    public static float getMedian_Problem_0_28a68fd8_575e_4887_b9ca_4e2bddd784d1(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int size = arr1.size();
        if(size != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if(size == 1) {
            return  arr1.get(0);
        }
        if(size == 2) {
            return  (arr1.get(0) + arr2.get(0)) / 2.0;
        }
        int mid = size / 2;
        int i = 0;
        int j = 0;
        while(i < mid && j < mid) {
            if(arr1.get(i) < arr2.get(j)) {
                i++;
            } else if(arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if(i == mid) {
            return  arr1.get(i);
        } else if(j == mid) {
            return  arr2.get(j);
        } else {
            return  (arr1.get(i) + arr2.get(j)) / 2.0;
        }
    }

    
    public static float getMedian_Problem_1_7e5f4ca1_625c_43cc_a0df_734f6f67aa3c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_2_466cf13f_44de_4aa9_8dff_f1424311ecf1(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_90bb459d_5185_4537_855b_80b9e43ce853(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_a5a0aee0_2110_42ca_9e01_49e16f3deb57(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (i == n) {
                median += arr2.get(j);
                j++;
            } else if (j == n) {
                median += arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                median += arr1.get(i);
                i++;
            } else {
                median += arr2.get(j);
                j++;
            }
            count++;
        }
        return median / 2;
    }

    
    public static float getMedian_Problem_0_9ac0b7e4_2e4b_4b67_8202_dc2dda99be9e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int size = arr1.size();
        int size2 = arr2.size();
        int size3 = size + size2;
        if (size3 % 2 == 0) {
            return  ((arr1.get(i) + arr2.get(j)) / 2);
        } else {
            return  (arr1.get(i) + arr2.get(j));
        }
    }

    
    public static float getMedian_Problem_2_7606a613_62b2_4283_9eee_35bcd4187bea(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        ArrayList<Integer> arr3 = new ArrayList<Integer>();
        ArrayList<Integer> arr4 = new ArrayList<Integer>();
        arr3.add(0L);
        arr4.add(0L);
        for (int i = 0; i < n; i++) {
            if (arr1.get(i) < arr2.get(i)) {
                arr3.add(arr1.get(i));
                arr4.add(arr2.get(i));
            } else {
                arr3.add(arr2.get(i));
                arr4.add(arr1.get(i));
            }
        }
        int l = 0;
        int h = arr3.size()-1;
        int middle = (h + l)/2;
        return arr3.get(middle);
    }

    
    public static float getMedian_Problem_0_a72e3a68_b08e_4bff_a376_98baac154dcd(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i =  Math.ceil(n / 2);
        int l1 = Math.min(arr1.size(), i);
        int l2 = Math.min(arr2.size(), i);
        if (l1 < l2) {
            return getMedian_Problem_0_a72e3a68_b08e_4bff_a376_98baac154dcd(arr1, arr2, l1);
        }
        return getMedian_Problem_0_a72e3a68_b08e_4bff_a376_98baac154dcd(arr2, arr1, l2);
    }

    
    public static float getMedian_Problem_1_67151c45_0a35_441d_8a7e_f54032b7d85b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_15cfe96e_f8f0_46df_ab3f_73f6466ac3ea(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int sum = 0;
        int mid;
        float median;
        int min;
        int max;
        if (arr1.size() > arr2.size()) {
            min = arr1.get(arr1.size() - 1);
            max = arr2.get(arr2.size() - 1);
        } else {
            min = arr2.get(arr2.size() - 1);
            max = arr1.get(arr1.size() - 1);
        }
        mid = (min + max) / 2;
        sum = arr1.get(arr1.size() - 1) + arr2.get(arr2.size() - 1);
        median =  sum / n;
        return median;
    }

    
    public static float getMedian_Problem_1_04c9c1c7_2cbf_4436_a194_0d9df7e1acb9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_27a600a8_cb5e_4e2f_b6b6_df2572b09964(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_0_4aa0423d_36f6_4050_9300_dcea18ac3a8e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        if (arr1.size() > arr2.size()) {
            median =  arr1.get(arr1.size() / 2);
        } else if (arr2.size() > arr1.size()) {
            median =  arr2.get(arr2.size() / 2);
        } else {
            median =  arr1.get(arr1.size() / 2);
        }
        return median;
    }

    
    public static float getMedian_Problem_1_5b6e667b_92f0_4182_ab9e_038ae465d565(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int half = n / 2;
        int sum1 = arr1.stream().mapToInteger(x -> x).sum();
        int sum2 = arr2.stream().mapToInteger(x -> x).sum();

        return half*((sum1+sum2)/(n-1));
    }

    
    public static float getMedian_Problem_2_e43d386e_d4cb_47af_b206_841990a63b55(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_3c24776a_4973_49a6_b9d4_2a969814d801(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_036e572a_b3ea_46b6_a6d5_3789d616d244(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 0) {
            throw new IllegalArgumentException("The two arrays are empty");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2.0;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while (i < mid) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (arr1.size() % 2 == 0) {
            return (arr1.get(i) + arr2.get(j)) / 2.0;
        } else {
            return arr1.get(i);
        }
    }

    
    public static float getMedian_Problem_0_bbe647a0_3649_4120_b424_28bb20a0dd46(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr1.get(1)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_0_15cfe96e_f8f0_46df_ab3f_73f6466ac3ea(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int sum = 0;
        int mid;
        float median;
        int min;
        int max;
        if (arr1.size() > arr2.size()) {
            min = arr1.get(arr1.size() - 1);
            max = arr2.get(arr2.size() - 1);
        } else {
            min = arr2.get(arr2.size() - 1);
            max = arr1.get(arr1.size() - 1);
        }
        mid = (min + max) / 2;
        sum = arr1.get(arr1.size() - 1) + arr2.get(arr2.size() - 1);
        median =  sum / n;
        return median;
    }

    
    public static float getMedian_Problem_2_5a470991_daf1_438c_9662_80b5ccc9b421(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median;
        if (arr1.size() > arr2.size()) {
            median =  getMedian_Problem_2_5a470991_daf1_438c_9662_80b5ccc9b421(arr2, arr1, n);
        } else {
            median =  getMedian_Problem_2_5a470991_daf1_438c_9662_80b5ccc9b421(arr1, arr2, n);
        }
        return median;
    }

    
    public static float getMedian_Problem_1_8c991c29_947f_4fdf_a8f7_9288da60d590(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        int m1 = -1;
        int m2 = -1;
        while (count <= n) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0).intValue();
                break;
            }
            else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0).intValue();
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i).intValue();
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2.get(j).intValue();
                j++;
            }
            count++;
        }
        median = (m1 + m2) / 2.0;
        return median;
    }

    
    public static float getMedian_Problem_0_feeacedf_4a3e_40e1_b9d1_57f6854e72fa(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_6de22b45_374c_4d95_a6ea_e54ecb4ece97(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        while (count < n) {
            if (i == n) {
                median = arr2.get(j);
                break;
            }
            if (j == n) {
                median = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_1_6b3f9721_4f0f_4258_9c24_19cbd2f348da(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int sum = 0;
        int half = n/2;
        int temp = 0;
        for(int i=0;i<n;i++){
            sum = sum + arr2.get(i);
        }
        for(int i=0;i<n;i++){
            temp = sum + arr1.get(i);
        }
        float median =  (temp + sum)/2;
        return median;
    }

    
    public static float getMedian_Problem_2_1d1b8747_84df_4cf2_bdb9_d4ee6e8aac06(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        int m1 = -1;
        int m2 = -1;
        while (count <= n) {
            if (i == n) {
                m1 = m2;
                m2 =  arr2.get(0).intValue();
                break;
            }
            else if (j == n) {
                m1 = m2;
                m2 =  arr1.get(0).intValue();
                break;
            }
            if (arr1.get(i).intValue() < arr2.get(j).intValue()) {
                m1 = m2;
                m2 =  arr1.get(i).intValue();
                i++;
            }
            else {
                m1 = m2;
                m2 =  arr2.get(j).intValue();
                j++;
            }
            count++;
        }
        if (n % 2 == 0) {
            median = (m1 + m2) / 2;
        }
        else {
            median = m2;
        }
        return median;
    }

    
    public static float getMedian_Problem_1_41272288_bd2d_4d26_9c47_faa85e8463aa(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (n == 1) {
            return arr1.get(0) + arr2.get(0) / 2;
        }
        if (arr1.size() == arr2.size()) {
            ArrayList<Integer> smaller = new ArrayList<Integer>(arr1);
            smaller.removeAll(new ArrayList<Integer>(arr2));
            if (smaller.isEmpty()) {
                return arr1.get(arr1.size() / 2);
            }
            return arr1.get((arr1.size() / 2)) + getMedian_Problem_1_41272288_bd2d_4d26_9c47_faa85e8463aa(arr2, arr2, n - 1);
        }
        if (arr2.size() == arr1.size()) {
            ArrayList<Integer> smaller = new ArrayList<Integer>(arr2);
            smaller.removeAll(new ArrayList<Integer>(arr1));
            if (smaller.isEmpty()) {
                return arr2.get(arr2.size() / 2);
            }
            return arr2.get((arr2.size() / 2)) + getMedian_Problem_1_41272288_bd2d_4d26_9c47_faa85e8463aa(arr1, arr1, n - 1);
        }
        if (arr1.size() > arr2.size()) {
            return getMedian_Problem_1_41272288_bd2d_4d26_9c47_faa85e8463aa(arr1, new ArrayList<Integer>(arr2), n - 1);
        }
        if (arr2.size() > arr1.size()) {
            return getMedian_Problem_1_41272288_bd2d_4d26_9c47_faa85e8463aa(new ArrayList<Integer>(arr1), arr2, n - 1);
        }
        return getMedian_Problem_1_41272288_bd2d_4d26_9c47_faa85e8463aa(arr1, arr2, n - 1);
    }

    
    public static float getMedian_Problem_2_5a7327b1_6c37_44b8_a8b5_13d4fd577205(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_e1333cfa_a8e7_4b0a_837e_ec8d5098f9a5(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int sum = 0;
        int mid;
        float median;
        for(int i = 0; i < n; i++) {
            sum += arr1.get(i);
            sum += arr2.get(i);
        }
        mid = sum / 2;
        median =  Math.ceil(sum / 2);
        return median;
    }

    
    public static float getMedian_Problem_0_44c4b493_a267_47cb_adbe_79f8605b0481(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2.0;
        }
        int mid = arr1.size() / 2;
        if(arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2.0;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_0_ec60c9df_d621_4591_b54a_971b5e0b8d94(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_7bb4014f_f82a_47f8_860e_0cffdbb7fc68(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int m1 = -1;
        int m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_53c2acd5_a3d0_4a29_b117_cb539d43b176(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int sum = 0;
        int mid = 0;
        float median = 0;
        for(int i = 0; i < n; i++) {
            sum += arr1.get(i);
            sum += arr2.get(i);
        }
        mid = sum / 2;
        for(int i = 0; i < n; i++) {
            if(arr1.get(i) < mid) {
                median += arr1.get(i);
            } else {
                median += arr2.get(i);
            }
        }
        median = median / 2;
        return median;
    }

    
    public static float getMedian_Problem_1_f1352776_2df7_4199_90d5_5d2a01558bab(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
            else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_523defd2_62a0_4054_81dd_83d2b4671e0a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int sum = 0;
        int mid = n/2;
        for(int i = 0; i < n; i++) {
            sum += arr1.get(i);
        }
        for(int i = 0; i < n; i++) {
            sum += arr2.get(i);
        }
        float median =  sum/n;
        return median;
    }

    
    public static float getMedian_Problem_2_c2c5f034_662d_4d0e_9e9f_41aa59860b92(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            return -1;
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0))/2;
        }
        int mid = arr1.size()/2;
        if(arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid))/2;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_1_adf83b5f_0b8a_4302_8c0a_00db1c8a308a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        ArrayList < Integer > arr = new ArrayList < > ();
        for (Integer l : arr1) {
            arr.add(l);
        }
        for (Integer l : arr2) {
            arr.add(l);
        }
        Collections.sort(arr);
        if (n >= arr.size())
            n -= arr.size();
        return  n / 2;
    }

    
    public static float getMedian_Problem_0_c52d7847_83c4_4d4e_92ca_9820a1be941f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int sum = 0;
        int mid = n/2;
        for(int i = 0; i < n; i++) {
            sum += arr1.get(i);
        }
        for(int i = 0; i < n; i++) {
            sum += arr2.get(i);
        }
        float median =  sum / n;
        return median;
    }

    
    public static float getMedian_Problem_2_0e4a0796_07d5_486c_a420_34ad0486c4bd(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_0_7cff6bcb_fccd_4f1c_b131_a4d979e08eee(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_b1826fad_f935_4046_9b4a_913badb03189(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_ab1c471d_7720_4631_b93e_d92dc39dc584(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two array lists should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while (i < mid) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (arr1.get(i) < arr2.get(j)) {
            return arr1.get(i);
        } else if (arr1.get(i) > arr2.get(j)) {
            return arr2.get(j);
        } else {
            return arr1.get(i);
        }
    }

    
    public static float getMedian_Problem_0_0e4a0796_07d5_486c_a420_34ad0486c4bd(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_2_0b2e061b_f4a0_4577_a3df_68ef1d4dca01(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int size = arr1.size();
        if (size != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (size == 0) {
            return 0;
        }
        if (size == 1) {
            return arr1.get(0);
        }
        int mid = size / 2;
        if (n % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_1_16fd65af_b101_47c0_9501_fab001dcc3ab(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get( j);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get( i);
                break;
            }
            if (arr1.get( i) < arr2.get( j)) {
                m1 = m2;
                m2 = arr1.get( i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get( j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_1_17ae4227_9c6f_45c1_b862_516fc35028ab(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_4aa0423d_36f6_4050_9300_dcea18ac3a8e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        if (arr1.size() > arr2.size()) {
            median =  arr1.get(arr1.size() / 2);
        } else if (arr2.size() > arr1.size()) {
            median =  arr2.get(arr2.size() / 2);
        } else {
            median =  arr1.get(arr1.size() / 2);
        }
        return median;
    }

    
    public static float getMedian_Problem_0_825c2b2c_ab0d_4128_a555_9941c4ae9a94(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two array lists should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_1_fc6e0b59_7d7e_494c_98dd_ade7a1e1f0ed(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays must be of same size");
        }
        if (arr1.size() == 0) {
            throw new IllegalArgumentException("The two arrays cannot be empty");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while (i < mid) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (arr1.size() % 2 == 0) {
            return (arr1.get(i) + arr2.get(j)) / 2;
        } else {
            return arr1.get(i);
        }
    }

    
    public static float getMedian_Problem_0_9ab8ea3a_354a_4ab8_8dc5_5eb4f184df5d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        int m1 = -1;
        int m2 = -1;
        while (count <= n) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0).intValue();
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0).intValue();
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i).intValue();
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j).intValue();
                j++;
            }
            count++;
        }
        median = (m1 + m2) / 2;
        return median;
    }

    
    public static float getMedian_Problem_0_f1056099_cbaf_4bab_bf74_0ca944aedb61(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int mid = 0;
        int size = arr1.size();
        if (size != arr2.size()) {
            return -1;
        }
        if (size == 1) {
            return  arr1.get(0);
        }
        if (size == 2) {
            return  (arr1.get(0) + arr2.get(0)) / 2;
        }
        while (i < size && j < size) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (i == size) {
            mid = arr2.get(j);
        } else if (j == size) {
            mid = arr1.get(i);
        } else {
            mid = (arr1.get(i) + arr2.get(j)) / 2;
        }
        return  mid / n;
    }

    
    public static float getMedian_Problem_2_cc5e385a_615d_4e58_8621_7f77484ddcb2(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = n / 2;
        int sum1 = 0, sum2 = 0;
        float median;
        for(int i = 0; i < n; i++) {
            sum1 += arr1.get(i);
            sum2 += arr2.get(i);
        }
        float average1 = sum1 / n;
        float average2 = sum2 / n;
        float diff1 = average1 - average2;
        float diff2 = average2 - average1;
        float diff = (diff1 + diff2) / 2;
        median = diff;
        return median;
    }

    
    public static float getMedian_Problem_0_d3cb1477_1dc8_4a38_bae0_26b9992d905b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        if (arr1.size() > arr2.size()) {
            median =  getMedian_Problem_0_d3cb1477_1dc8_4a38_bae0_26b9992d905b(arr2, arr1, n);
        } else {
            median =  getMedian_Problem_0_d3cb1477_1dc8_4a38_bae0_26b9992d905b(arr1, arr2, n);
        }
        return median;
    }

    
    public static float getMedian_Problem_2_340779c8_41f0_42df_8355_85c74151cddf(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        if (arr1.size() > arr2.size()) {
            median = arr1.get( (n/2));
        } else {
            median = arr2.get( (n/2));
        }
        return median;
    }

    
    public static float getMedian_Problem_2_57bdb2bf_8338_45fc_908f_ca4d6af019ab(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        return arr1.get( (n * 0.5)) + arr2.get( (n * 0.5));
    }

    
    public static float getMedian_Problem_0_63fdf38b_0a7c_4677_9b87_f5be15b7d6f0(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        while (count < n) {
            if (i == n) {
                median += arr2.get(j);
                j++;
            } else if (j == n) {
                median += arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                median += arr1.get(i);
                i++;
            } else {
                median += arr2.get(j);
                j++;
            }
            count++;
        }
        return median / 2;
    }

    
    public static float getMedian_Problem_0_128e3907_d63f_41a8_9994_0655518f7ed0(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                median = arr2.get(j);
                break;
            }
            if (j == n) {
                median = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_1_3edd1e72_e533_4459_8976_384df961b4f1(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float mid, diff;
        int sum1 = 0, sum2 = 0;
        for(int i = 0; i < n; i++) {
            sum1 += arr1.get(i);
            sum2 += arr2.get(i);
        }
        mid = sum1/n;
        diff = sum2/n - mid;
        if(diff > 0) return mid;
        return sum2 + mid;
    }

    
    public static float getMedian_Problem_2_ef53482c_153d_45ea_8a5c_2a77d72b8be3(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            return -1;
        }
        if (arr1.size() == 0) {
            return -1;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_0_eaf0f96a_0388_4af0_8b37_b36a97fd73a4(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_0_3bcc1151_0a6d_4029_8a91_c5734b109a0b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            return -1;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int i = 0, j = 0;
        while (i < mid) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (i == mid) {
            return arr1.get(i);
        }
        if (j == mid) {
            return arr2.get(j);
        }
        return (arr1.get(i) + arr2.get(j)) / 2;
    }

    
    public static float getMedian_Problem_0_5da7ae3c_13f1_42ee_9ceb_b83c617392f1(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() == 0 && arr2.size() == 0) {
            return  n/2;
        } else if (arr1.size() == 0 && arr2.size() > 0) {
            return arr2.get( (n/2));
        } else if (arr1.size() > 0 && arr2.size() == 0) {
            return arr1.get( (n/2));
        } else if (arr1.size() == arr2.size()) {
            return getMedian_Problem_0_5da7ae3c_13f1_42ee_9ceb_b83c617392f1(arr1, arr2, n/2);
        } else {
            return getMedian_Problem_0_5da7ae3c_13f1_42ee_9ceb_b83c617392f1(arr1, arr2, n/2);
        }
    }

    
    public static float getMedian_Problem_2_6e27a001_af80_4a69_9700_40ac76eca3dd(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median;
        if (arr1.size() >= arr2.size()) {
            ArrayList<Integer> temp = arr2;
            arr2 = arr1;
            arr1 = temp;
        }
        int half = arr1.size() / 2;
        median = ( arr1.get(half) +  arr2.get(half)) / 2;
        return median;
    }

    
    public static float getMedian_Problem_1_8e6ae9c3_1d7a_4f68_bbef_6b2ec2a95b44(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
            else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_3a64467c_b298_4d7f_8763_bca28d10044c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1;
        int m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                break;
            }
            if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_3c24776a_4973_49a6_b9d4_2a969814d801(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_8afc9655_1bf5_4043_a24d_be468e4e894c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_1_59f5b2b0_eb45_4560_90fa_3f9c857628f7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_b8006c2e_7188_4813_adb8_b0135858922c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int median = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        int m1 = -1;
        int m2 = -1;
        while (count <= n) {
            count++;
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        median = (m1 + m2) / 2;
        return median;
    }

    
    public static float getMedian_Problem_0_ff689b4e_f4c2_457c_9f70_4cf507b895a3(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            } else if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_2_4647d853_771f_4bbe_8307_a1a700a0657e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_52b95c50_a075_4eb3_a49a_a7d339963da4(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_571a607c_a51e_4485_813c_be1410942448(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (i == arr1.size()) {
            return arr2.get(j);
        } else if (j == arr2.size()) {
            return arr1.get(i);
        } else {
            return (arr1.get(i) + arr2.get(j)) / 2;
        }
    }

    
    public static float getMedian_Problem_0_c4a54e94_48a6_45ca_bd04_34354d00ddd7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_a81253ac_30a5_4b3a_9366_d1355e820b61(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count = 0;
        int m1 = -1;
        int m2 = -1;
        while (count < n + 1) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
            count++;
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_f6f8a880_7e82_498a_952e_d2e6a37b230f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_8dcb8b32_ffae_45b7_aa67_2d4b31622d03(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        // Write your code here
        float median = 0;
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0).intValue();
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0).intValue();
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i).intValue();
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j).intValue();
                j++;
            }
        }
        median = (m1 + m2) / 2.0;
        return median;
    }

    
    public static float getMedian_Problem_0_8a2418d5_2b5d_4a85_96cf_bde64bf5baa8(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_fbf91551_1a10_4347_ae8c_06cf9d4d8760(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int size = arr1.size();
        int size2 = arr2.size();
        int size3 = size + size2;
        if (size3 % 2 == 0) {
            return  ((arr1.get(i) + arr2.get(j)) / 2);
        } else {
            return  arr1.get(i);
        }
    }

    
    public static float getMedian_Problem_2_b11cb5ba_59e6_4257_9df9_a68999fd5734(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two array lists should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_2_12aa832a_9b86_42e2_84cd_17635f3ba268(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays should be of same size");
        }
        if (arr1.size() == 0) {
            throw new IllegalArgumentException("The two arrays should be non-empty");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2.0;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while (i < mid) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (arr1.get(i) < arr2.get(j)) {
            return arr1.get(i);
        } else if (arr1.get(i) > arr2.get(j)) {
            return arr2.get(j);
        } else {
            return (arr1.get(i) + arr2.get(j)) / 2.0;
        }
    }

    
    public static float getMedian_Problem_2_237a89d9_e3a5_4f0c_9e04_862c25dce8eb(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_0_69d7b38c_877a_48df_a4bb_9e5f5083e01c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_2_059699f8_873c_48b1_a8c7_07a97a304c9c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1;
        int m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                break;
            }
            else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_ec05598b_c3b3_4fe1_a134_5c4802133de2(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = (arr1.size() + arr2.size()) / 2;
        if (arr1.size() > arr2.size()) {
            return getMedian_Problem_0_ec05598b_c3b3_4fe1_a134_5c4802133de2(arr1, arr2, mid);
        } else {
            return getMedian_Problem_0_ec05598b_c3b3_4fe1_a134_5c4802133de2(arr2, arr1, mid);
        }
    }

    
    public static float getMedian_Problem_0_41272288_bd2d_4d26_9c47_faa85e8463aa(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (n == 1) {
            return arr1.get(0) + arr2.get(0) / 2;
        }
        if (arr1.size() == arr2.size()) {
            ArrayList<Integer> smaller = new ArrayList<Integer>(arr1);
            smaller.removeAll(new ArrayList<Integer>(arr2));
            if (smaller.isEmpty()) {
                return arr1.get(arr1.size() / 2);
            }
            return arr1.get((arr1.size() / 2)) + getMedian_Problem_0_41272288_bd2d_4d26_9c47_faa85e8463aa(arr2, arr2, n - 1);
        }
        if (arr2.size() == arr1.size()) {
            ArrayList<Integer> smaller = new ArrayList<Integer>(arr2);
            smaller.removeAll(new ArrayList<Integer>(arr1));
            if (smaller.isEmpty()) {
                return arr2.get(arr2.size() / 2);
            }
            return arr2.get((arr2.size() / 2)) + getMedian_Problem_0_41272288_bd2d_4d26_9c47_faa85e8463aa(arr1, arr1, n - 1);
        }
        if (arr1.size() > arr2.size()) {
            return getMedian_Problem_0_41272288_bd2d_4d26_9c47_faa85e8463aa(arr1, new ArrayList<Integer>(arr2), n - 1);
        }
        if (arr2.size() > arr1.size()) {
            return getMedian_Problem_0_41272288_bd2d_4d26_9c47_faa85e8463aa(new ArrayList<Integer>(arr1), arr2, n - 1);
        }
        return getMedian_Problem_0_41272288_bd2d_4d26_9c47_faa85e8463aa(arr1, arr2, n - 1);
    }

    
    public static float getMedian_Problem_2_41857aa9_2233_4175_817b_bff316376d79(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int left = 0;
        int right = arr1.size() - 1;
        while (left < right) {
            if (arr1.get(left) < arr1.get(right)) {
                if (arr1.get(left) < arr2.get(mid)) {
                    left++;
                } else if (arr2.get(mid) < arr1.get(right)) {
                    right--;
                } else {
                    return arr1.get(left);
                }
            } else {
                if (arr2.get(mid) < arr1.get(left)) {
                    left++;
                } else if (arr1.get(right) < arr2.get(mid)) {
                    right--;
                } else {
                    return arr2.get(mid);
                }
            }
        }
        return arr1.get(left);
    }

    
    public static float getMedian_Problem_2_f3cb5be7_55a0_49e6_9993_582c29587d4d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_68247956_7a8f_4e1c_b3f7_1256cef3d28a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
            else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_8b728065_1a2a_495e_a999_484e014da632(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = (n + 1) / 2;
        if (arr1.size() > arr2.size()) {
            return getMedian_Problem_1_8b728065_1a2a_495e_a999_484e014da632(arr2, arr1, mid);
        } else {
            return getMedian_Problem_1_8b728065_1a2a_495e_a999_484e014da632(arr1, arr2, mid);
        }
    }

    
    public static float getMedian_Problem_2_f1fe3a44_4490_467a_a0f0_3282b982788f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_2_9ab8ea3a_354a_4ab8_8dc5_5eb4f184df5d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        int m1 = -1;
        int m2 = -1;
        while (count <= n) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0).intValue();
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0).intValue();
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i).intValue();
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j).intValue();
                j++;
            }
            count++;
        }
        median = (m1 + m2) / 2;
        return median;
    }

    
    public static float getMedian_Problem_0_77a3a3f1_d134_4569_84bb_eae7c2918609(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                median = arr2.get(j);
                break;
            }
            if (j == n) {
                median = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_2_6bbb5aff_8e4c_43bf_b2b5_ff04ed94b365(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int m1 = -1;
        int m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_6a3f2803_f2be_4a36_8edc_630e44ae47cd(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_0_b31401e6_aaf7_4e00_bb21_7b637a8fe693(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while(count < n) {
            if(arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            }
            else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_2_63fdf38b_0a7c_4677_9b87_f5be15b7d6f0(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        while (count < n) {
            if (i == n) {
                median += arr2.get(j);
                j++;
            } else if (j == n) {
                median += arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                median += arr1.get(i);
                i++;
            } else {
                median += arr2.get(j);
                j++;
            }
            count++;
        }
        return median / 2;
    }

    
    public static float getMedian_Problem_0_b98aed2d_5f08_48a3_b0fc_120a47640c47(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (i == n) {
                median += arr2.get(j);
                j++;
            } else if (j == n) {
                median += arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                median += arr1.get(i);
                i++;
            } else {
                median += arr2.get(j);
                j++;
            }
            count++;
            if (count == n) {
                return median / 2;
            }
        }
        if (arr1.get(i) < arr2.get(j)) {
            median += arr1.get(i);
        } else {
            median += arr2.get(j);
        }
        return median / 2;
    }

    
    public static float getMedian_Problem_2_7ac07718_2d30_4251_b6de_6f6b3c0ffe61(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_4647d853_771f_4bbe_8307_a1a700a0657e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_81768a86_98bc_43d0_a41c_85009dacc9e5(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int sum = 0;
        for (int i = 0; i < arr1.size(); i++) {
            sum += arr1.get(i);
        }
        for (int i = 0; i < arr2.size(); i++) {
            sum += arr2.get(i);
        }
        int median = sum / 2;
        if (n % 2 == 0) {
            return  median / 2;
        } else {
            return  median / 2 +  arr1.get(arr1.size() / 2) / 2;
        }
    }

    
    public static float getMedian_Problem_2_7d9c6a75_ff21_4ca1_b386_0bc313908b1d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays must be of same size");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int left = 0;
        int right = arr1.size() - 1;
        while (left <= right) {
            if (arr1.get(mid) < arr2.get(mid)) {
                left = mid + 1;
            } else if (arr1.get(mid) > arr2.get(mid)) {
                right = mid - 1;
            } else {
                return arr1.get(mid);
            }
            mid = (left + right) / 2;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_0_2c0797c3_81b0_4984_9d24_14669f2ac28f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                count++;
                i++;
                j++;
            }
        }
        if (count == n) {
            return (arr1.get(i - 1) + arr2.get(j - 1)) / 2.0;
        } else if (count < n) {
            return arr1.get(i - 1);
        } else {
            return arr2.get(j - 1);
        }
    }

    
    public static float getMedian_Problem_0_3bfe6c83_5bc1_402f_8b0a_348b4b0df7d2(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays should be of same size");
        }
        if (arr1.size() == 0) {
            throw new IllegalArgumentException("The two arrays should be non-empty");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2.0;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2.0;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_1_6f4835ef_45c7_4ef4_a9fc_4f49ae72be79(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                count++;
                i++;
                j++;
            }
        }
        if (count == n) {
            return  ((arr1.get(i - 1) + arr2.get(j - 1)) / 2);
        } else if (count < n) {
            return  arr1.get(i - 1);
        } else {
            return  arr2.get(j - 1);
        }
    }

    
    public static float getMedian_Problem_2_eaf0f96a_0388_4af0_8b37_b36a97fd73a4(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_1_18d6e0b4_bd86_4dcd_b71a_a8f0ff7e21b3(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0;
        int j = 0;
        int count;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_0_9177488e_8182_4414_af62_c5ba799b53c5(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2.0;
        }
        int mid = arr1.size() / 2;
        if(arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2.0;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_1_715257f5_8600_451c_b734_e16caf3ff236(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_2_39f53ee7_bb23_4d64_b08c_051cfbe3c240(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (i == arr1.size()) {
            return arr2.get(j);
        } else if (j == arr2.size()) {
            return arr1.get(i);
        } else {
            return (arr1.get(i) + arr2.get(j)) / 2;
        }
    }

    
    public static float getMedian_Problem_2_aae821ef_c4d3_46ff_b773_75cefae98d41(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        
        // Check input parameters
        if (arr1.size() != arr2.size()) {
            System.out.println("Error: arr1 and arr2 sizes are not equal.");
            System.exit(-1);
        }

        // If there are an even number of elements, then the median is just the
        // middle element
        if (arr1.size() % 2 == 0 && arr2.size() % 2 == 0) {
            return arr1.get((n/2)) + arr2.get((n/2));
        }

        // If there are an odd number of elements, then there is an average of
        // the middle elements and the median is half way between the two
        // middle elements
        else if (arr1.size() % 2 != 0 && arr2.size() % 2 != 0) {
            int mid = (n/2);
            return ((arr1.get(mid) + arr2.get(mid))/2) / 2;
        }

        // If n is odd, then we compute the median as the average of the first
        // and the last element
        else {
            int mid = (n/2);
            return ((arr1.get(mid) + arr2.get(mid))/2) / 2;
        }
    }

    
    public static float getMedian_Problem_0_eb61b29b_62e7_42a7_8d9d_f7328281e10f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = (arr1.size() + arr2.size()) / 2;
        if (arr1.size() > arr2.size()) {
            return getMedian_Problem_0_eb61b29b_62e7_42a7_8d9d_f7328281e10f(arr2, arr1, mid);
        } else {
            return getMedian_Problem_0_eb61b29b_62e7_42a7_8d9d_f7328281e10f(arr1, arr2, mid);
        }
    }

    
    public static float getMedian_Problem_2_ec05598b_c3b3_4fe1_a134_5c4802133de2(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = (arr1.size() + arr2.size()) / 2;
        if (arr1.size() > arr2.size()) {
            return getMedian_Problem_2_ec05598b_c3b3_4fe1_a134_5c4802133de2(arr1, arr2, mid);
        } else {
            return getMedian_Problem_2_ec05598b_c3b3_4fe1_a134_5c4802133de2(arr2, arr1, mid);
        }
    }

    
    public static float getMedian_Problem_2_4daad001_cf67_47b1_9bd8_e4599034272f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_8a2418d5_2b5d_4a85_96cf_bde64bf5baa8(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_638450b2_f2b3_404a_b91f_975c8e1edf08(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        //write your code
        int i = (arr1.size() + arr2.size()) / 2;
        float mid1 = getMedian_Problem_1_638450b2_f2b3_404a_b91f_975c8e1edf08(arr1, arr2, i);
        float mid2 = getMedian_Problem_1_638450b2_f2b3_404a_b91f_975c8e1edf08(arr2, arr1, i);
        return (mid1 + mid2) / 2;
    }

    
    public static float getMedian_Problem_0_dfce2c98_6b05_4301_adc3_564c720db662(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_0_036e572a_b3ea_46b6_a6d5_3789d616d244(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 0) {
            throw new IllegalArgumentException("The two arrays are empty");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2.0;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while (i < mid) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (arr1.size() % 2 == 0) {
            return (arr1.get(i) + arr2.get(j)) / 2.0;
        } else {
            return arr1.get(i);
        }
    }

    
    public static float getMedian_Problem_1_c20ec3f9_2bd4_4f0d_8d5b_838b7c759551(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1;
        int m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_41857aa9_2233_4175_817b_bff316376d79(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int left = 0;
        int right = arr1.size() - 1;
        while (left < right) {
            if (arr1.get(left) < arr1.get(right)) {
                if (arr1.get(left) < arr2.get(mid)) {
                    left++;
                } else if (arr2.get(mid) < arr1.get(right)) {
                    right--;
                } else {
                    return arr1.get(left);
                }
            } else {
                if (arr2.get(mid) < arr1.get(left)) {
                    left++;
                } else if (arr1.get(right) < arr2.get(mid)) {
                    right--;
                } else {
                    return arr2.get(mid);
                }
            }
        }
        return arr1.get(left);
    }

    
    public static float getMedian_Problem_1_253b6217_263b_4268_b326_d954cedd9c65(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int median = 0;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(j);
                break;
            }
            if (j == n) {
                median = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_2_80dc2bb8_b608_4ca5_ad2d_97115bc463c7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1;
        int m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                break;
            }
            else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_78f2d935_c9e3_4fdc_8b1e_94d9b09201a5(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        int m1 = -1;
        int m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0).intValue();
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0).intValue();
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i).intValue();
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j).intValue();
                j++;
            }
        }
        median = (m1 + m2) / 2;
        return median;
    }

    
    public static float getMedian_Problem_1_32e8eff0_b3c8_4bdc_a243_0cc0e033f5d6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                median = arr2.get(j);
                break;
            }
            if (j == n) {
                median = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_0_5065d916_4033_4964_962e_aa2a8fe92ac3(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays must be of same size");
        }
        if (arr1.size() == 0) {
            throw new IllegalArgumentException("The two arrays must be non-empty");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2.0;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while (i < mid) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (arr1.get(i) < arr2.get(j)) {
            return arr1.get(i);
        } else if (arr1.get(i) > arr2.get(j)) {
            return arr2.get(j);
        } else {
            return (arr1.get(i) + arr2.get(j)) / 2.0;
        }
    }

    
    public static float getMedian_Problem_1_db031856_b854_4b04_97c1_3f118d32b590(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = (arr1.size() + arr2.size()) / 2;
        if (arr1.size() > arr2.size()) {
            return getMedian_Problem_1_db031856_b854_4b04_97c1_3f118d32b590(arr1, arr2, mid);
        } else {
            return getMedian_Problem_1_db031856_b854_4b04_97c1_3f118d32b590(arr2, arr1, mid);
        }
    }

    
    public static float getMedian_Problem_1_ec05598b_c3b3_4fe1_a134_5c4802133de2(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = (arr1.size() + arr2.size()) / 2;
        if (arr1.size() > arr2.size()) {
            return getMedian_Problem_1_ec05598b_c3b3_4fe1_a134_5c4802133de2(arr1, arr2, mid);
        } else {
            return getMedian_Problem_1_ec05598b_c3b3_4fe1_a134_5c4802133de2(arr2, arr1, mid);
        }
    }

    
    public static float getMedian_Problem_2_66b134cd_869c_4cca_9273_4626db965f70(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < mid) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
            k++;
        }
        if (arr1.size() % 2 == 0) {
            return (arr1.get(i) + arr2.get(j)) / 2;
        } else {
            return arr1.get(i);
        }
    }

    
    public static float getMedian_Problem_2_bcc5a66f_6490_44fe_9710_8abc0e55395a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int sum = 0;
        int mid = 0;
        float median = 0;
        for(int i = 0; i < n; i++) {
            sum += arr1.get(i);
            sum += arr2.get(i);
        }
        mid = sum / 2;
        for(int i = 0; i < n; i++) {
            if(arr1.get(i) < mid) {
                median += arr1.get(i);
            }
            else if(arr2.get(i) < mid) {
                median += arr2.get(i);
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_0_47d41e42_70ad_44d4_9fe3_65ff65d0efa4(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        // if n is odd, then median is middle element of sorted array
        // if n is even, then median is average of middle two elements of sorted array
        int median = 0;
        if (n % 2 == 0) {
            median = (arr1.get(n/2) + arr2.get(n/2)) / 2;
        } else {
            median = arr1.get(n/2);
        }
        return median;
    }

    
    public static float getMedian_Problem_1_d8b4ae7e_8f66_4396_8e91_deef10938e64(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_1_6eff4878_e862_432f_8491_c88e452561d7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_c20ec3f9_2bd4_4f0d_8d5b_838b7c759551(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1;
        int m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_57bdb2bf_8338_45fc_908f_ca4d6af019ab(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        return arr1.get( (n * 0.5)) + arr2.get( (n * 0.5));
    }

    
    public static float getMedian_Problem_0_deb24fd5_40db_4776_8635_2c17c5cd9de4(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        median = (m1 + m2) / 2;
        return median;
    }

    
    public static float getMedian_Problem_1_78f2d935_c9e3_4fdc_8b1e_94d9b09201a5(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        int m1 = -1;
        int m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0).intValue();
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0).intValue();
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i).intValue();
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j).intValue();
                j++;
            }
        }
        median = (m1 + m2) / 2;
        return median;
    }

    
    public static float getMedian_Problem_2_215bca0e_432a_4f5c_839b_60ffc59df268(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int size = arr1.size();
        while (i < size && j < size) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (i == size) {
            return arr2.get(j - 1);
        } else if (j == size) {
            return arr1.get(i - 1);
        } else {
            return (arr1.get(i - 1) + arr2.get(j - 1)) / 2.0;
        }
    }

    
    public static float getMedian_Problem_0_7be4b316_8954_4897_8d6d_9c721536b7a4(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("Arrays must be of same size");
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2.0;
        }
        int mid = arr1.size() / 2;
        if(arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2.0;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_1_15b2e561_7346_4a51_944e_178aebca67c6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                median = arr2.get(j);
                break;
            }
            if (j == n) {
                median = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_2_d6f08a87_b70f_4881_ac4b_65431f43d426(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int sum = 0;
        int mid = 0;
        float median;
        int temp;
        for(int i = 0; i < n; i++) {
            sum += arr1.get(i);
        }
        mid = sum / n;
        sum = 0;
        for(int i = 0; i < n; i++) {
            sum += arr2.get(i);
        }
        temp = sum / n;
        median =  mid +  temp;
        return median;
    }

    
    public static float getMedian_Problem_1_5864b4f7_64fc_467c_b82f_84d49b7eeaf8(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_90bb459d_5185_4537_855b_80b9e43ce853(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_2f05ca9a_b345_42bd_b19e_acb204d676fe(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() == arr2.size()) {
            int sum = 0;
            for (int i = 0; i < arr1.size(); i++) {
                sum += arr1.get(i);
            }
            for (int i = 0; i < arr2.size(); i++) {
                sum += arr2.get(i);
            }
            return  (sum / n);
        } else {
            return  (arr1.get(arr1.size() / 2) + arr2.get(arr2.size() / 2));
        }
    }

    
    public static float getMedian_Problem_2_a291cc4d_5bcd_47de_974c_9457214aaac6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_1_faff0b0b_007b_4794_b755_f1fc1348dbf6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_2_7f4224a9_ac1e_4808_a5f1_e3589498402d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_edf85e5c_5dd7_4514_bad1_fd53a52b9a96(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_0_59f5b2b0_eb45_4560_90fa_3f9c857628f7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_5a71e3f9_9274_4737_84ea_73ec1b1b3288(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_99b946d3_de14_45eb_801c_7461a8d14c3a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        // Write your code here
        float median = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        while (count < n) {
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_2_115ea3fb_2677_41a6_9fe9_f4e4e779ba75(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        // initialize variables
        float med = 0;
        double mid;
        int arr1Sum = 0;
        int arr2Sum = 0;
        // calculate the sums for each array
        for (int i = 0; i < n; i++)
            arr1Sum += arr1.get(i);
        for (int i = 0; i < n; i++)
            arr2Sum += arr2.get(i);
        // calculate the mid-point
        mid =  (((double)arr1Sum + arr2Sum) / 2);
        // calculate the median
        if (arr1Sum > arr2Sum)
            med =  mid;
        else
            med =  (2 * mid);
        return med;
    }

    
    public static float getMedian_Problem_1_47d87e3a_0566_4a5a_aa69_c1c8bc10cdc1(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            return -1;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr2.size() == 1) {
            return arr2.get(0);
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2.0;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_0_89f75060_37e4_4205_a95e_4f89e5a8fb88(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (i == n) {
                median += arr2.get(j);
                j++;
            } else if (j == n) {
                median += arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                median += arr1.get(i);
                i++;
            } else {
                median += arr2.get(j);
                j++;
            }
            count++;
        }
        return median / 2;
    }

    
    public static float getMedian_Problem_0_3a97bba8_a2ea_4502_8637_c79208fbad58(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_4b657e32_b912_40a2_b859_6f57c3583e52(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = (n + 1) / 2;
        if (arr1.size() > arr2.size()) {
            return getMedian_Problem_2_4b657e32_b912_40a2_b859_6f57c3583e52(arr2, arr1, mid);
        }
        if (arr1.size() < arr2.size()) {
            return getMedian_Problem_2_4b657e32_b912_40a2_b859_6f57c3583e52(arr1, arr2, mid);
        }
        if (arr1.size() == arr2.size()) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr1.get(i);
            }
            int sum2 = 0;
            for (int i = 0; i < n; i++) {
                sum2 += arr2.get(i);
            }
            return sum / n + (sum2 / n - sum / n) / 2;
        }
        return -1;
    }

    
    public static float getMedian_Problem_2_250685a6_d1bd_4c52_b53e_286de2da9a32(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = n / 2;
        if (n % 2 == 0) {
            return getMedian_Problem_2_250685a6_d1bd_4c52_b53e_286de2da9a32(arr1, arr2, mid);
        } else {
            return getMedian_Problem_2_250685a6_d1bd_4c52_b53e_286de2da9a32(arr2, arr1, mid - 1);
        }
    }

    
    public static float getMedian_Problem_1_4fbcde55_3091_4485_b55b_3ac1f93629ad(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_0_4bc28496_75af_454c_b2c6_d45095a365ad(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        Collections.sort(arr1);
        Collections.sort(arr2);
        if (arr1.size() >= arr2.size()) {
            return (arr1.get((arr1.size() / 2) + 1)
                    - arr2.get((arr2.size() / 2) + 1)) / 2.0;
        } else {
            return arr1.get((arr1.size() / 2)) - arr2.get((arr2.size() / 2)) / 2.0;
        }
    }

    
    public static float getMedian_Problem_1_60c1a3ca_808c_4324_8523_143d37934251(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;
        int n1 = arr1.size();
        int n2 = arr2.size();
        int count = 0;
        while (count < n) {
            if (i < n1 && j < n2) {
                if (arr1.get(i) < arr2.get(j)) {
                    i++;
                } else if (arr1.get(i) > arr2.get(j)) {
                    j++;
                } else {
                    count++;
                    i++;
                    j++;
                }
            } else if (i < n1) {
                i++;
            } else if (j < n2) {
                j++;
            } else {
                count++;
            }
        }
        if (count == n) {
            return (arr1.get(i - 1) + arr2.get(j - 1)) / 2.0;
        }
        return 0;
    }

    
    public static float getMedian_Problem_1_cc2a23ad_3b4a_4eea_b543_95c260625884(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_2_6b3f9721_4f0f_4258_9c24_19cbd2f348da(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int sum = 0;
        int half = n/2;
        int temp = 0;
        for(int i=0;i<n;i++){
            sum = sum + arr2.get(i);
        }
        for(int i=0;i<n;i++){
            temp = sum + arr1.get(i);
        }
        float median =  (temp + sum)/2;
        return median;
    }

    
    public static float getMedian_Problem_0_72649417_907d_44a5_a548_0bd6e0d3246d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_2_ff689b4e_f4c2_457c_9f70_4cf507b895a3(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            } else if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_1_3cf89387_02fd_4387_8dca_5a6c3f012306(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int size = arr1.size();
        if (size != arr2.size()) {
            return -1;
        }
        if (size == 0) {
            return -1;
        }
        if (size == 1) {
            return arr1.get(0);
        }
        int mid = size / 2;
        int i = 0;
        int j = 0;
        while (i < mid && j < mid) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (i == mid) {
            return arr1.get(i);
        } else if (j == mid) {
            return arr2.get(j);
        } else {
            return (arr1.get(i) + arr2.get(j)) / 2;
        }
    }

    
    public static float getMedian_Problem_2_7be4b316_8954_4897_8d6d_9c721536b7a4(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("Arrays must be of same size");
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2.0;
        }
        int mid = arr1.size() / 2;
        if(arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2.0;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_0_efe02e9a_c3b7_4140_9a0d_20ed54a5b7fd(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int median = 0;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_1_c761e60a_8247_4ac4_861f_c3cd41f1ae77(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_0_9185d814_b954_4452_959c_60761851913a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int size = arr1.size() + arr2.size();
        if (size % 2 == 0) {
            i = (size / 2) - 1;
            j = (size / 2);
        } else {
            i = (size / 2);
            j = (size / 2) + 1;
        }
        if (arr1.size() > arr2.size()) {
            int temp = arr1.get(i);
            arr1.set(i, arr2.get(i));
            arr2.set(i, temp);
        } else if (arr1.size() < arr2.size()) {
            int temp = arr2.get(i);
            arr2.set(i, arr1.get(i));
            arr1.set(i, temp);
        }
        if (arr1.size() > arr2.size()) {
            int temp = arr1.get(j);
            arr1.set(j, arr2.get(j));
            arr2.set(j, temp);
        } else if (arr1.size() < arr2.size()) {
            int temp = arr2.get(j);
            arr2.set(j, arr1.get(j));
            arr1.set(j, temp);
        }
        if (arr1.size() > arr2.size()) {
            return  arr1.get(i);
        } else if (arr1.size() < arr2.size()) {
            return  arr2.get(i);
        } else {
            return  (arr1.get(i) + arr2.get(i)) / 2;
        }
    }

    
    public static float getMedian_Problem_1_1384f5fb_0afe_4353_b147_2a765c05480b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if(arr1.size() == 0) {
            return 0;
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if(arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_2_cdf642e4_6841_402b_8713_fee83df5f561(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int sum = 0;
        int mid = n/2;
        for(int i = 0; i < n; i++) {
            sum += arr1.get(i);
        }
        for(int i = 0; i < n; i++) {
            sum += arr2.get(i);
        }
        float median =  sum/n;
        return median;
    }

    
    public static float getMedian_Problem_1_2f05ca9a_b345_42bd_b19e_acb204d676fe(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() == arr2.size()) {
            int sum = 0;
            for (int i = 0; i < arr1.size(); i++) {
                sum += arr1.get(i);
            }
            for (int i = 0; i < arr2.size(); i++) {
                sum += arr2.get(i);
            }
            return  (sum / n);
        } else {
            return  (arr1.get(arr1.size() / 2) + arr2.get(arr2.size() / 2));
        }
    }

    
    public static float getMedian_Problem_0_5328a13b_f676_4440_8b4e_d50c125e3071(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() > arr2.size()) {
            return getMedian_Problem_0_5328a13b_f676_4440_8b4e_d50c125e3071(arr2, arr1, n);
        }
        int mid = arr1.size() / 2;
        int m1 = arr1.get(mid);
        int m2 = arr2.get(mid);
        if (m1 == m2)
            return m1;
        if (m2 < m1)
            return getMedian_Problem_0_5328a13b_f676_4440_8b4e_d50c125e3071(arr2, arr1, n);
        return getMedian_Problem_0_5328a13b_f676_4440_8b4e_d50c125e3071(arr1, arr2, n);
    }

    
    public static float getMedian_Problem_0_679d8a51_9506_48a6_8964_18921f0183b6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two lists are not of same size");
        }
        if(arr1.size() == 0) {
            return 0;
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if(arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_2_31ebd1d1_73f8_448a_9b86_130ec2552ad9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_2_22820c53_03cf_4665_9514_ec828a5f0d54(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                median = arr2.get(j);
                break;
            }
            if (j == n) {
                median = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_1_571a607c_a51e_4485_813c_be1410942448(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (i == arr1.size()) {
            return arr2.get(j);
        } else if (j == arr2.size()) {
            return arr1.get(i);
        } else {
            return (arr1.get(i) + arr2.get(j)) / 2;
        }
    }

    
    public static float getMedian_Problem_1_976e46c3_f83f_44be_a322_fff06136eba7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                median = arr2.get(j);
                break;
            }
            if (j == n) {
                median = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_1_5d7845e6_3610_4187_a230_7ed5bf251366(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        // Write your code here
        
        int minVal = arr1.get(0);
        int maxVal = arr2.get(0);
        
        if(arr1.size() > arr2.size()){
            minVal = arr2.get(arr2.size()-1);
            maxVal = arr1.get(arr1.size()-1);
        }
        else{
            minVal = arr1.get(arr1.size()-1);
            maxVal = arr2.get(arr2.size()-1);
        }
        
        float midVal = (minVal+maxVal)/2;
        
        for(int i = 0; i < n; i++){
            if(arr1.get(i) < midVal && arr2.get(i) < midVal){
                arr1.remove(i);
                arr2.remove(i);
            }
            if(arr1.get(i) > midVal && arr2.get(i) > midVal){
                arr1.remove(i);
                arr2.remove(i);
            }
        }
        
        float median = ((arr1.get(0) + arr2.get(0) / 2))/2;
        
        return median;
    }

    
    public static float getMedian_Problem_0_862424eb_3518_40cf_8591_7f3e25c6937b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float result = ((arr2.size() > arr1.size() ? arr2.get( ((n - 1) / 2)) : arr1.get( ((n - 1) / 2)))
                + ((arr1.size() > arr2.size() ? arr1.get( ((n - 1) / 2)) : arr2.get( ((n - 1) / 2))))) / 2;
        return result;
    }

    
    public static float getMedian_Problem_1_6fa96156_d28b_4187_a71d_ebfa26958100(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_2_bbe647a0_3649_4120_b424_28bb20a0dd46(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr1.get(1)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_0_adf83b5f_0b8a_4302_8c0a_00db1c8a308a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        ArrayList < Integer > arr = new ArrayList < > ();
        for (Integer l : arr1) {
            arr.add(l);
        }
        for (Integer l : arr2) {
            arr.add(l);
        }
        Collections.sort(arr);
        if (n >= arr.size())
            n -= arr.size();
        return  n / 2;
    }

    
    public static float getMedian_Problem_1_9682ce5c_2e08_4612_9262_49cf25840295(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_1f4e3e72_a64c_483f_bc86_6c9b3fd3ea2a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float temp;
        if (arr1.size() < arr2.size()) {
            temp = arr1.get((arr1.size() / 2));
            arr1.remove((arr1.size() / 2));
            arr2.remove((arr2.size() / 2));
            return temp;
        }
        temp = arr2.get((arr2.size() / 2));
        arr1.remove((arr2.size() / 2));
        arr2.remove((arr1.size() / 2));
        return temp;
    }

    
    public static float getMedian_Problem_1_81768a86_98bc_43d0_a41c_85009dacc9e5(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int sum = 0;
        for (int i = 0; i < arr1.size(); i++) {
            sum += arr1.get(i);
        }
        for (int i = 0; i < arr2.size(); i++) {
            sum += arr2.get(i);
        }
        int median = sum / 2;
        if (n % 2 == 0) {
            return  median / 2;
        } else {
            return  median / 2 +  arr1.get(arr1.size() / 2) / 2;
        }
    }

    
    public static float getMedian_Problem_2_85e8c9c6_39d8_4657_8f13_faf3a833a234(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_5bd3fb8f_8a91_4ae9_a549_e5de42b64c2c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0;
        int j = 0;
        int count;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_2_eda26962_997c_42ce_b8df_03f99edcd68c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_31c019e6_4452_464d_9d4a_fb7efa9ed48c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_2_df5f0c03_72bb_4b83_a3cb_f3aa30cc9673(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;
        int n1 = 0;
        int n2 = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                count++;
                i++;
                j++;
            }
        }
        if (count == n) {
            return (arr1.get(i - 1) + arr2.get(j - 1)) / 2.0;
        } else if (count > n / 2) {
            return (arr1.get(i - 1) + arr2.get(j - 1)) / 2.0;
        } else {
            while (i < arr1.size() && j < arr2.size()) {
                if (arr1.get(i) < arr2.get(j)) {
                    n1++;
                    i++;
                } else if (arr1.get(i) > arr2.get(j)) {
                    n2++;
                    j++;
                } else {
                    i++;
                    j++;
                }
            }
            if (n1 > n2) {
                return arr1.get(i - 1);
            } else {
                return arr2.get(j - 1);
            }
        }
    }

}
