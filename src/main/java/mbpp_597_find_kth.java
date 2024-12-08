package mbpp_597_find_kth;

public class mbpp_597_find_kth {

    
    public static int findKth_Problem_0_90774b42_77d6_4c5a_b8f0_b7676dbdbb8b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        while (k > 0) {
            if (i >= arr1.size()) {
                j++;
            } else if (j >= arr2.size()) {
                i++;
            } else if (arr1.get( i) < arr2.get( j)) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        if (i >= arr1.size()) {
            return arr2.get( j);
        } else if (j >= arr2.size()) {
            return arr1.get( i);
        } else {
            return Math.min(arr1.get( i), arr2.get( j));
        }
    }

    
    public static int findKth_Problem_1_c1fe38b7_7e78_4364_9dda_16c243919f55(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                if (i + j + 1 == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                if (i + j + 1 == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        if (i < arr1.size()) {
            return arr1.get( (k - j - 1));
        }
        return arr2.get( (k - i - 1));
    }

    
    public static int findKth_Problem_2_57accfab_e274_4a9b_9eee_f62f07ab173f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int k1 = Math.min(k / 2, arr1.size());
        int k2 = Math.min(k / 2, arr2.size());
        if (arr1.get(k1 - 1) < arr2.get(k2 - 1)) {
            return findKth_Problem_2_57accfab_e274_4a9b_9eee_f62f07ab173f(new ArrayList<Integer>(arr1.subList(k1, arr1.size())), arr2, k - k1);
        } else {
            return findKth_Problem_2_57accfab_e274_4a9b_9eee_f62f07ab173f(arr1, new ArrayList<Integer>(arr2.subList(k2, arr2.size())), k - k2);
        }
    }

    
    public static int findKth_Problem_2_10830d77_3631_473c_8c56_9763422ad9a1(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) return arr2.get(k);
        if (arr2.size() == 0) return arr1.get(k);
        if (k == 0) return Math.min(arr1.get(0), arr2.get(0));
        if (k == arr1.size() + arr2.size() - 1) return Math.max(arr1.get(arr1.size() - 1), arr2.get(arr2.size() - 1));
        int i = Math.min(k / 2, arr1.size() - 1);
        int j = Math.min(k / 2, arr2.size() - 1);
        if (arr1.get(i) < arr2.get(j)) {
            return findKth_Problem_2_10830d77_3631_473c_8c56_9763422ad9a1(new ArrayList<Integer>(arr1.subList(i + 1, arr1.size())), arr2, k - i - 1);
        } else {
            return findKth_Problem_2_10830d77_3631_473c_8c56_9763422ad9a1(arr1, new ArrayList<Integer>(arr2.subList(j + 1, arr2.size())), k - j - 1);
        }
    }

    
    public static int findKth_Problem_2_5256bd27_3363_4740_aedc_2b7c6c2e1113(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        int i = 0;
        int j = 0;
        int count = 0;
        while (count < k) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
            count++;
        }
        if (arr1.get(i) < arr2.get(j)) {
            return arr1.get(i);
        } else {
            return arr2.get(j);
        }
    }

    
    public static int findKth_Problem_0_1d8ddbf2_e711_45de_9f23_d24023c1bf9d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 1 && arr2.size() == 1) {
            return Math.max(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (arr1.get(mid1) <= arr2.get(mid2)) {
            if (k <= mid1 + mid2 + 1) {
                return findKth_Problem_0_1d8ddbf2_e711_45de_9f23_d24023c1bf9d(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_0_1d8ddbf2_e711_45de_9f23_d24023c1bf9d(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            }
        } else {
            if (k <= mid1 + mid2 + 1) {
                return findKth_Problem_0_1d8ddbf2_e711_45de_9f23_d24023c1bf9d(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            } else {
                return findKth_Problem_0_1d8ddbf2_e711_45de_9f23_d24023c1bf9d(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        }
    }

    
    public static int findKth_Problem_1_f53da2fd_553f_435c_a723_2b12f193853b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int size1 = arr1.size();
        int size2 = arr2.size();
        int result = 0;
        while (i < size1 && j < size2) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
                if (k == 1) {
                    result = arr1.get(i);
                    break;
                } else {
                    k--;
                }
            }
        }
        return result;
    }

    
    public static int findKth_Problem_2_cc7b57f6_7c77_4f42_9858_e5a313d8157d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int kth = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                kth = arr1.get(i);
                i++;
            } else {
                kth = arr2.get(j);
                j++;
            }
            if (i + j == k) {
                break;
            }
        }
        if (i == arr1.size()) {
            while (j < arr2.size()) {
                kth = arr2.get(j);
                j++;
                if (i + j == k) {
                    break;
                }
            }
        } else if (j == arr2.size()) {
            while (i < arr1.size()) {
                kth = arr1.get(i);
                i++;
                if (i + j == k) {
                    break;
                }
            }
        }
        return kth;
    }

    
    public static int findKth_Problem_2_fa14d10b_6cec_4ff0_8ba6_575793e8119f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) return arr2.get(k);
        if (arr2.size() == 0) return arr1.get(k);
        if (arr1.size() + arr2.size() == k) return Math.max(arr1.get(arr1.size() - 1), arr2.get(arr2.size() - 1));
        if (arr1.size() + arr2.size() == k + 1) return Math.min(arr1.get(arr1.size() - 1), arr2.get(arr2.size() - 1));
        if (k == 0) return Math.min(arr1.get(0), arr2.get(0));
        if (k == 1) return Math.max(arr1.get(0), arr2.get(0));
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_fa14d10b_6cec_4ff0_8ba6_575793e8119f(arr1, new ArrayList<Integer>(arr2.subList(mid2, arr2.size())), k - mid2);
            } else {
                return findKth_Problem_2_fa14d10b_6cec_4ff0_8ba6_575793e8119f(new ArrayList<Integer>(arr1.subList(mid1, arr1.size())), arr2, k - mid1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_fa14d10b_6cec_4ff0_8ba6_575793e8119f(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_2_fa14d10b_6cec_4ff0_8ba6_575793e8119f(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_0_6e5227ad_2f25_4cf1_8c8b_ab9c0ec21646(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_0_a9e82594_511c_43a7_891c_5a2282075a1c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        return 0;
    }

    
    public static int findKth_Problem_0_ea01bcdf_1cbc_4ff8_bb60_4a3a146d99db(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        //write your code here
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr1.size(); i++) {
            sum += arr1.get(i);
        }
        for (int i = 0; i < arr2.size(); i++) {
            sum1 += arr2.get(i);
        }
        int max1 = sum1 / k;
        int max2 = sum2 / k;
        int max = (sum1 + sum2) / 2;
        if (max1 < max2) {
            return max1;
        } else if (max2 < max1) {
            return max2;
        } else if (max1 == max2) {
            if (sum == max) {
                return max;
            } else {
                return max1;
            }
        } else {
            return max1;
        }

    }

    
    public static int findKth_Problem_0_d76289b4_1f8c_4d0c_916c_30e3fb1fc52c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_d76289b4_1f8c_4d0c_916c_30e3fb1fc52c(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_0_d76289b4_1f8c_4d0c_916c_30e3fb1fc52c(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_d76289b4_1f8c_4d0c_916c_30e3fb1fc52c(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_0_d76289b4_1f8c_4d0c_916c_30e3fb1fc52c(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_1_09578403_42cc_4708_abc7_8a18272c644a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        return 0;
    }

    
    public static int findKth_Problem_0_004b13cd_8b47_4b56_9e9c_2493eadc5c3e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() > arr2.size()) {
            return findKth_Problem_0_004b13cd_8b47_4b56_9e9c_2493eadc5c3e(arr2, arr1, k);
        }
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i = Math.min(k / 2, arr1.size());
        int j = k - i;
        if (arr1.get(i - 1) > arr2.get(j - 1)) {
            return findKth_Problem_0_004b13cd_8b47_4b56_9e9c_2493eadc5c3e(arr1, new ArrayList<Integer>(arr2.subList(j, arr2.size())), k - j);
        } else {
            return findKth_Problem_0_004b13cd_8b47_4b56_9e9c_2493eadc5c3e(new ArrayList<Integer>(arr1.subList(i, arr1.size())), arr2, k - i);
        }
    }

    
    public static int findKth_Problem_0_4b55ea00_bbeb_4fac_b3e8_03334aaca300(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int k1 = Math.min(k / 2, arr1.size());
        int k2 = Math.min(k / 2, arr2.size());
        if (arr1.get(k1 - 1) < arr2.get(k2 - 1)) {
            return findKth_Problem_0_4b55ea00_bbeb_4fac_b3e8_03334aaca300(new ArrayList<Integer>(arr1.subList(k1, arr1.size())), arr2, k - k1);
        } else {
            return findKth_Problem_0_4b55ea00_bbeb_4fac_b3e8_03334aaca300(arr1, new ArrayList<Integer>(arr2.subList(k2, arr2.size())), k - k2);
        }
    }

    
    public static int findKth_Problem_2_fec2c8de_109c_48df_a1d6_64d895e616be(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int result=0;
        for(int i=0;i<arr1.size();i++) {
            if(arr1.get(i)<arr2.get(i)) {
                result+=arr1.get(i);
                arr1.remove(arr1.get(i));
                arr2.remove(arr2.get(i));
            }
        }
        int total=0;
        for(int i=0;i<arr1.size();i++) {
            total+=arr1.get(i);
        }
        return total+result+k;
    }

    
    public static int findKth_Problem_2_46e9583e_9a09_45fa_a6ad_3a7c667e5aed(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int l1 = arr1.size();
        int l2 = arr2.size();
        if(l1 > l2)
        {
            k = arr2.size() - k;
            l2 = l1;
        }
        int res = 0;
        int i = 1;
        int j = 0;
        while(j < k)
        {
            if(arr1.get(i) <= arr2.get(j))
            {
                i++;
                j++;
            }
            else
            {
                j++;
            }
        }
        return res;
    }

    
    public static int findKth_Problem_1_117bb787_34ca_4676_8b5b_d83e2e40a022(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (k > arr1.size() + arr2.size()) return -1;
        if (arr1.size() == 0) return arr2.get(k - 1);
        if (arr2.size() == 0) return arr1.get(k - 1);
        if (k == 1) return Math.min(arr1.get(0), arr2.get(0));
        int mid1 = Math.min(k / 2, arr1.size());
        int mid2 = Math.min(k / 2, arr2.size());
        if (arr1.get(mid1 - 1) < arr2.get(mid2 - 1)) {
            return findKth_Problem_1_117bb787_34ca_4676_8b5b_d83e2e40a022(new ArrayList<Integer>(arr1.subList(mid1, arr1.size())), arr2, k - mid1);
        } else {
            return findKth_Problem_1_117bb787_34ca_4676_8b5b_d83e2e40a022(arr1, new ArrayList<Integer>(arr2.subList(mid2, arr2.size())), k - mid2);
        }
    }

    
    public static int findKth_Problem_0_4ae2636e_5037_462b_945f_6a186c3afe6a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (n >= m) {
            arr1.add(arr2.get(m - 1));
            arr2.remove(m - 1);
        }
        int index = 0;
        int kth = -1;
        int count = 0;
        int flag = 0;
        for (int i = 0; i < n; i++) {
            count++;
            if (count > k) {
                count = 1;
                flag++;
                index++;
            }
            if (i == 0) {
                kth = arr1.get(i);
                kth = (arr2.get(m));
                kth = (arr1.get(m));
            }
            if (arr1.get(i) == arr2.get(m)) {
                kth = (arr1.get(m));
                kth = (arr2.get(m));
            }
            if (arr1.get(i) > arr2.get(m)) {
                kth = (arr1.get(m));
                kth = (arr2.get(m));
            }
            if (flag == (n - 1)) {
                return kth;
            }
        }
        return -1;
    }

    
    public static int findKth_Problem_1_205251e3_7b32_4971_b5e1_969ccf3621e7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        int n = arr1.size();
        int m = arr2.size();
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < n && j < m) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < n) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < m) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_0_3a0bc393_489c_46c0_b58b_963d2c6a2f0f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() > arr2.size()) {
            return findKth_Problem_0_3a0bc393_489c_46c0_b58b_963d2c6a2f0f(arr2, arr1, k);
        }
        int i = Math.min(k / 2, arr1.size());
        int j = Math.min(k / 2, arr2.size());
        if (arr1.get(i - 1) < arr2.get(j - 1)) {
            return findKth_Problem_0_3a0bc393_489c_46c0_b58b_963d2c6a2f0f(new ArrayList<Integer>(arr1.subList(i, arr1.size())), arr2, k - i);
        } else {
            return findKth_Problem_0_3a0bc393_489c_46c0_b58b_963d2c6a2f0f(arr1, new ArrayList<Integer>(arr2.subList(j, arr2.size())), k - j);
        }
    }

    
    public static int findKth_Problem_2_4b0d417a_5503_4640_8564_e33916aa0c93(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        ArrayList<Integer> arr3 = new ArrayList<Integer>();
        int count = 0;
        for (int i = 0; i <= arr1.size(); i++) {
            if (arr1.get(i) < arr2.get(i)) {
                arr3.add(arr1.get(i));
                count++;
            } else {
                arr3.add(arr2.get(i));
            }
        }
        if (arr1.size() - 1 == arr3.size()) {
            return arr1.get(arr1.size() - 1);
        }
        if (arr2.size() - 1 == arr3.size()) {
            return arr2.get(arr2.size() - 1);
        }
        int first = findKth_Problem_2_4b0d417a_5503_4640_8564_e33916aa0c93(arr3, arr2, k);
        if (arr3.get(arr3.size() - 1) == first) {
            return arr3.get(arr3.size() - 1);
        }
        return first;
    }

    
    public static int findKth_Problem_0_5ccc651d_6fed_4d6e_bfbd_e7de6c56c178(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
                j++;
            }
        }
        return -1;
    }

    
    public static int findKth_Problem_0_fa193b2c_f92f_4328_909e_7a4faa14b232(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        int n = arr1.size(), m = arr2.size();
        while (i < n && j < m) {
            if (arr1.get(i) < arr2.get(j)) {
                if (k == 1) {
                    return arr1.get(i);
                }
                i++;
                k--;
            } else {
                if (k == 1) {
                    return arr2.get(j);
                }
                j++;
                k--;
            }
        }
        while (i < n) {
            if (k == 1) {
                return arr1.get(i);
            }
            i++;
            k--;
        }
        while (j < m) {
            if (k == 1) {
                return arr2.get(j);
            }
            j++;
            k--;
        }
        return -1;
    }

    
    public static int findKth_Problem_2_7abe2e27_49a1_45b7_872e_416f74c61ca5(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (k > n + m) {
            return -1;
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (k == n + m) {
            return Math.max(arr1.get(n - 1), arr2.get(m - 1));
        }
        int i =  Math.min(k - 1, n - 1);
        int j =  (k - i - 2);
        if (arr1.get(i) < arr2.get(j)) {
            ArrayList<Integer> newArr1 = new ArrayList<Integer>(arr1.subList(i + 1, n));
            return findKth_Problem_2_7abe2e27_49a1_45b7_872e_416f74c61ca5(newArr1, arr2, k - i - 1);
        } else if (arr1.get(i) > arr2.get(j)) {
            ArrayList<Integer> newArr2 = new ArrayList<Integer>(arr2.subList(j + 1, m));
            return findKth_Problem_2_7abe2e27_49a1_45b7_872e_416f74c61ca5(arr1, newArr2, k - j - 1);
        } else {
            return arr1.get(i);
        }
    }

    
    public static int findKth_Problem_2_c4024d56_9358_4bfe_bcd1_0f90241618b7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() * k / (arr1.size() + arr2.size());
        int mid2 = k - mid1 - 1;
        if (arr1.get(mid1) > arr2.get(mid2)) {
            ArrayList<Integer> newArr1 = new ArrayList<Integer>(arr1.subList(0, mid1));
            ArrayList<Integer> newArr2 = new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size()));
            return findKth_Problem_2_c4024d56_9358_4bfe_bcd1_0f90241618b7(newArr1, newArr2, k - mid2 - 1);
        } else {
            ArrayList<Integer> newArr1 = new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size()));
            ArrayList<Integer> newArr2 = new ArrayList<Integer>(arr2.subList(0, mid2));
            return findKth_Problem_2_c4024d56_9358_4bfe_bcd1_0f90241618b7(newArr1, newArr2, k - mid1 - 1);
        }
    }

    
    public static int findKth_Problem_1_5256bd27_3363_4740_aedc_2b7c6c2e1113(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        int i = 0;
        int j = 0;
        int count = 0;
        while (count < k) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
            count++;
        }
        if (arr1.get(i) < arr2.get(j)) {
            return arr1.get(i);
        } else {
            return arr2.get(j);
        }
    }

    
    public static int findKth_Problem_2_90774b42_77d6_4c5a_b8f0_b7676dbdbb8b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        while (k > 0) {
            if (i >= arr1.size()) {
                j++;
            } else if (j >= arr2.size()) {
                i++;
            } else if (arr1.get( i) < arr2.get( j)) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        if (i >= arr1.size()) {
            return arr2.get( j);
        } else if (j >= arr2.size()) {
            return arr1.get( i);
        } else {
            return Math.min(arr1.get( i), arr2.get( j));
        }
    }

    
    public static int findKth_Problem_0_051421f3_ae67_4541_b232_575727becf5e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_0_a2e4e944_a916_40ab_b7cf_d6af2c5dea45(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        while (k > 0) {
            if (i >= arr1.size()) {
                return arr2.get(j +  k - 1);
            }
            if (j >= arr2.size()) {
                return arr1.get(i +  k - 1);
            }
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        return Math.min(arr1.get(i), arr2.get(j));
    }

    
    public static int findKth_Problem_1_802799ee_27a3_4c6f_945e_a8cf842fe256(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int low = arr1.get(0); // low is the first element of arr1
        int high = arr1.get(arr1.size() - 1); // high is the last element of arr1
        int mid = low + (high - low) / 2; // mid is mid element of arr1
        int mid1 = arr2.get(0); // mid1 is the first element of arr2
        int mid2 = arr2.get(arr2.size() - 1); // mid2 is the last element of arr2
        while (k >= mid) {
            if (k < mid) {
                if (mid2 > mid) { // if mid2 is greater than mid
                    high = mid;
                } else {
                    low = mid;
                    mid = low + (high - low) / 2; // mid is mid element of arr1
                }
            } else if (k > mid) {
                if (mid1 > mid) { // if mid1 is greater than mid
                    low = mid;
                } else {
                    high = mid;
                    mid = low + (high - low) / 2; // mid is mid element of arr1
                }
            } else {
                return mid1;
            }
        }
        return mid2;
    }

    
    public static int findKth_Problem_2_7c342204_6f1d_4a16_bd08_2b15bb812cb0(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() >= k / 2 ? arr1.get(k / 2 - 1) : Integer.MAX_VALUE;
        int mid2 = arr2.size() >= k / 2 ? arr2.get(k / 2 - 1) : Integer.MAX_VALUE;
        if (mid1 < mid2) {
            return findKth_Problem_2_7c342204_6f1d_4a16_bd08_2b15bb812cb0(new ArrayList<Integer>(arr1.subList(k / 2, arr1.size())), arr2, k - k / 2);
        } else {
            return findKth_Problem_2_7c342204_6f1d_4a16_bd08_2b15bb812cb0(arr1, new ArrayList<Integer>(arr2.subList(k / 2, arr2.size())), k - k / 2);
        }
    }

    
    public static int findKth_Problem_0_b90c75b7_08a8_48b5_870f_f8df981131cd(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(Math.min(k / 2, arr1.size()) - 1);
        int mid2 = arr2.get(Math.min(k / 2, arr2.size()) - 1);
        if (mid1 < mid2) {
            return findKth_Problem_0_b90c75b7_08a8_48b5_870f_f8df981131cd(new ArrayList<Integer>(arr1.subList(Math.min(k / 2, arr1.size()), arr1.size())), arr2, k - Math.min(k / 2, arr1.size()));
        } else {
            return findKth_Problem_0_b90c75b7_08a8_48b5_870f_f8df981131cd(arr1, new ArrayList<Integer>(arr2.subList(Math.min(k / 2, arr2.size()), arr2.size())), k - Math.min(k / 2, arr2.size()));
        }
    }

    
    public static int findKth_Problem_0_a696f654_0db6_4895_9f82_d29afde5571a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int kth = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                kth = arr1.get(i);
                i++;
            } else {
                kth = arr2.get(j);
                j++;
            }
            k--;
            if (k == 0) {
                break;
            }
        }
        while (i < arr1.size()) {
            kth = arr1.get(i);
            i++;
            k--;
            if (k == 0) {
                break;
            }
        }
        while (j < arr2.size()) {
            kth = arr2.get(j);
            j++;
            k--;
            if (k == 0) {
                break;
            }
        }
        return kth;
    }

    
    public static int findKth_Problem_0_eedce435_992f_4e14_a5a3_c5827da7c08b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1 == null || arr2 == null) {
            return -1;
        }
        int len = arr1.size() + arr2.size();
        int firstValue = arr1.get(0); // take the first element from arr1
        int secondValue = arr2.get(0); // take the first element from arr2
        int count = 0;
        // iterate over arr1 and arr2
        for (int i = 0; i <= len; i++) {
            int sum = firstValue + secondValue;
            // check if sum is greater or equal to k
            if (sum >= k) {
                // if sum is greater or equal to k, then increase count
                count += 1;
                firstValue = firstValue + arr1.get(i - count);
                secondValue = secondValue + arr2.get(i - count);
                // if sum is not equal to k, then reset count and take the first element from arr1
            } else {
                firstValue = firstValue + arr1.get(i - 1);
                secondValue = secondValue + arr2.get(i - 1);
            }
        }
        return count + 1;
    }

    
    public static int findKth_Problem_0_87004ba6_da91_47f7_aee4_656f88234458(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (arr1.get(0) < arr2.get(0)) {
            arr1.remove(0);
            return findKth_Problem_0_87004ba6_da91_47f7_aee4_656f88234458(arr1, arr2, k - 1);
        } else {
            arr2.remove(0);
            return findKth_Problem_0_87004ba6_da91_47f7_aee4_656f88234458(arr1, arr2, k - 1);
        }
    }

    
    public static int findKth_Problem_0_b879532d_5ccd_4dc1_be58_3a618378513e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (k == 0) return 0;
        if (arr1.size() == 0) return arr2.get(k - 1);
        if (arr2.size() == 0) return arr1.get(k - 1);
        if (k == 1) return Math.min(arr1.get(0), arr2.get(0));
        int mid1 = arr1.get(Math.min(k / 2, arr1.size()) - 1);
        int mid2 = arr2.get(Math.min(k / 2, arr2.size()) - 1);
        if (mid1 < mid2) {
            ArrayList<Integer> newArr1 = new ArrayList<Integer>(arr1.subList(Math.min(k / 2, arr1.size()), arr1.size()));
            return findKth_Problem_0_b879532d_5ccd_4dc1_be58_3a618378513e(newArr1, arr2, k - Math.min(k / 2, arr1.size()));
        } else {
            ArrayList<Integer> newArr2 = new ArrayList<Integer>(arr2.subList(Math.min(k / 2, arr2.size()), arr2.size()));
            return findKth_Problem_0_b879532d_5ccd_4dc1_be58_3a618378513e(arr1, newArr2, k - Math.min(k / 2, arr2.size()));
        }
    }

    
    public static int findKth_Problem_2_77a55f81_8838_43e8_8c42_b21bbbd1f633(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        if (arr1.size() == 0) {
            return arr2.get( k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get( k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get( Math.min(k / 2, arr1.size()) - 1);
        int mid2 = arr2.get( Math.min(k / 2, arr2.size()) - 1);
        if (mid1 < mid2) {
            return findKth_Problem_2_77a55f81_8838_43e8_8c42_b21bbbd1f633(new ArrayList<Integer>(arr1.subList( Math.min(k / 2, arr1.size()), arr1.size())), arr2, k - Math.min(k / 2, arr1.size()));
        } else {
            return findKth_Problem_2_77a55f81_8838_43e8_8c42_b21bbbd1f633(arr1, new ArrayList<Integer>(arr2.subList( Math.min(k / 2, arr2.size()), arr2.size())), k - Math.min(k / 2, arr2.size()));
        }
    }

    
    public static int findKth_Problem_2_de46f19a_e569_4307_9c14_c8aa48d10d68(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (k >= arr2.size()) {
            return arr1.get(arr2.size() - 1);
        }
        if (k <= 0) {
            return arr1.get(0);
        }
        int low = 0;
        int high = arr2.size() - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            if (k < arr2.get(mid)) {
                low = mid + 1;
            } else if (k > arr2.get(mid)) {
                high = mid - 1;
            } else {
                return arr1.get(mid);
            }
        }
        return arr1.get(low);
    }

    
    public static int findKth_Problem_2_7162278d_dc1a_486a_9473_8b38bb4ca021(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (k == 0) return -1;
        if (arr1.size() == 0) return arr2.get(k-1);
        if (arr2.size() == 0) return arr1.get(k-1);
        if (k == 1) return Math.min(arr1.get(0), arr2.get(0));
        int a = arr1.get(0);
        int b = arr2.get(0);
        if (a < b) {
            arr1.remove(0);
            return findKth_Problem_2_7162278d_dc1a_486a_9473_8b38bb4ca021(arr1, arr2, k-1);
        } else {
            arr2.remove(0);
            return findKth_Problem_2_7162278d_dc1a_486a_9473_8b38bb4ca021(arr1, arr2, k-1);
        }
    }

    
    public static int findKth_Problem_0_3d7c0156_bfbb_4bb4_8a0b_642610e02f90(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int count = 0;
        int i = 0;
        int j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
                j++;
            }
        }
        return -1;
    }

    
    public static int findKth_Problem_0_77a55f81_8838_43e8_8c42_b21bbbd1f633(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        if (arr1.size() == 0) {
            return arr2.get( k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get( k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get( Math.min(k / 2, arr1.size()) - 1);
        int mid2 = arr2.get( Math.min(k / 2, arr2.size()) - 1);
        if (mid1 < mid2) {
            return findKth_Problem_0_77a55f81_8838_43e8_8c42_b21bbbd1f633(new ArrayList<Integer>(arr1.subList( Math.min(k / 2, arr1.size()), arr1.size())), arr2, k - Math.min(k / 2, arr1.size()));
        } else {
            return findKth_Problem_0_77a55f81_8838_43e8_8c42_b21bbbd1f633(arr1, new ArrayList<Integer>(arr2.subList( Math.min(k / 2, arr2.size()), arr2.size())), k - Math.min(k / 2, arr2.size()));
        }
    }

    
    public static int findKth_Problem_2_2f425929_9057_46b5_9a6a_10e237b27b38(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int maxIndex1 = 0;
        int maxIndex2 = 0;
        int maxIndex = -1;
        for (int i = 0; i < arr1.size(); i++) {
            if (arr1.get(i) > maxIndex1) {
                maxIndex1 = arr1.get(i);
            }
        }
        for (int j = 0; j < arr2.size(); j++) {
            if (arr2.get(j) > maxIndex2) {
                maxIndex2 = arr2.get(j);
            }
        }
        if (maxIndex1 < maxIndex2) {
            maxIndex = maxIndex1;
        } else {
            maxIndex = maxIndex2;
        }
        int maxArr1Index = arr1.indexOf(maxIndex + 1);
        int maxArr2Index = arr2.indexOf(maxIndex + 1);
        int maxDiff = Math.abs(maxArr1Index - maxArr2Index);
        while (k > maxDiff) {
            maxIndex++;
            maxArr1Index = arr1.indexOf(maxIndex + 1);
            maxArr2Index = arr2.indexOf(maxIndex + 1);
            maxDiff = Math.abs(maxArr1Index - maxArr2Index);
        }
        return maxIndex;
    }

    
    public static int findKth_Problem_1_4cbff54e_b122_4bc3_a2c6_807a0cba9bcd(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 1 && arr2.size() == 1) {
            return Math.max(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_4cbff54e_b122_4bc3_a2c6_807a0cba9bcd(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_1_4cbff54e_b122_4bc3_a2c6_807a0cba9bcd(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_4cbff54e_b122_4bc3_a2c6_807a0cba9bcd(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_1_4cbff54e_b122_4bc3_a2c6_807a0cba9bcd(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_0_eed8f161_5712_4a44_be7e_1c63a16b2669(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (n == 0) return arr2.get(k - 1);
        if (m == 0) return arr1.get(k - 1);
        if (k == 1) return Math.min(arr1.get(0), arr2.get(0));
        if (k == n + m) return Math.max(arr1.get(n - 1), arr2.get(m - 1));
        int i = Math.min(k / 2, n);
        int j = Math.min(k / 2, m);
        if (arr1.get(i - 1) < arr2.get(j - 1)) {
            return findKth_Problem_0_eed8f161_5712_4a44_be7e_1c63a16b2669(new ArrayList<Integer>(arr1.subList(i, n)), arr2, k - i);
        } else {
            return findKth_Problem_0_eed8f161_5712_4a44_be7e_1c63a16b2669(arr1, new ArrayList<Integer>(arr2.subList(j, m)), k - j);
        }
    }

    
    public static int findKth_Problem_1_17f4fd35_2de8_4242_9092_3a8680f1df36(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Declare variable
        int count = 0;
        // Declare two list
        ArrayList<Integer> list1 = new ArrayList<Integer>(arr1);
        ArrayList<Integer> list2 = new ArrayList<Integer>(arr2);

        // Scan all the elements of list1 from 1st to end
        for(int i=0; i<list1.size(); i++) {
            // Check if k is equal to current element in list1
            if(list1.get(i) == k) {
                count++;
            }
        }
        // Scan all the elements of list2 from 1st to end
        for(int j=0; j<list2.size(); j++) {
            // Check if k is equal to current element in list2
            if(list2.get(j) == k) {
                count++;
            }
        }
        return count;
    }

    
    public static int findKth_Problem_2_87aa317a_fe66_48f6_894b_870e7027546f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                if (i + j + 1 == k) return arr1.get(i);
                i++;
            } else {
                if (i + j + 1 == k) return arr2.get(j);
                j++;
            }
        }
        if (i < arr1.size()) return arr1.get( (k - j - 1));
        else return arr2.get( (k - i - 1));
    }

    
    public static int findKth_Problem_2_fca4657d_0b25_40d4_8ae7_20efd937f16c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get( (k - 1));
        }
        if (arr2.size() == 0) {
            return arr1.get( (k - 1));
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() > arr2.size()) {
            return findKth_Problem_2_fca4657d_0b25_40d4_8ae7_20efd937f16c(arr2, arr1, k);
        }
        int a = Math.min(k / 2, arr1.size());
        int b = k - a;
        if (arr1.get( (a - 1)) < arr2.get( (b - 1))) {
            return findKth_Problem_2_fca4657d_0b25_40d4_8ae7_20efd937f16c(new ArrayList<Integer>(arr1.subList( a, arr1.size())), arr2, k - a);
        } else if (arr1.get( (a - 1)) > arr2.get( (b - 1))) {
            return findKth_Problem_2_fca4657d_0b25_40d4_8ae7_20efd937f16c(arr1, new ArrayList<Integer>(arr2.subList( b, arr2.size())), k - b);
        } else {
            return arr1.get( (a - 1));
        }
    }

    
    public static int findKth_Problem_0_c55c845e_d816_421e_bb41_ce3f0d29f458(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() >= k / 2 ? arr1.get(k / 2 - 1) : Integer.MAX_VALUE;
        int mid2 = arr2.size() >= k / 2 ? arr2.get(k / 2 - 1) : Integer.MAX_VALUE;
        if (mid1 < mid2) {
            return findKth_Problem_0_c55c845e_d816_421e_bb41_ce3f0d29f458(new ArrayList<Integer>(arr1.subList(k / 2, arr1.size())), arr2, k - k / 2);
        } else {
            return findKth_Problem_0_c55c845e_d816_421e_bb41_ce3f0d29f458(arr1, new ArrayList<Integer>(arr2.subList(k / 2, arr2.size())), k - k / 2);
        }
    }

    
    public static int findKth_Problem_1_2c5ba380_2837_4a3c_b936_adcb0c24760a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_2c5ba380_2837_4a3c_b936_adcb0c24760a(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_1_2c5ba380_2837_4a3c_b936_adcb0c24760a(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_2c5ba380_2837_4a3c_b936_adcb0c24760a(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_1_2c5ba380_2837_4a3c_b936_adcb0c24760a(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_2_55cfdeb9_5036_4ff0_a463_dbf873c93770(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (k > n + m) {
            return -1;
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.get(n - 1) < arr2.get(0)) {
            return arr1.get( k - 1);
        }
        if (arr2.get(m - 1) < arr1.get(0)) {
            return arr2.get( k - 1);
        }
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (arr1.get(i) < arr2.get(j)) {
                if (k == 1) {
                    return arr1.get(i);
                }
                i++;
                k--;
            } else {
                if (k == 1) {
                    return arr2.get(j);
                }
                j++;
                k--;
            }
        }
        if (i < n) {
            return arr1.get( k - 1);
        }
        if (j < m) {
            return arr2.get( k - 1);
        }
        return -1;
    }

    
    public static int findKth_Problem_1_7162278d_dc1a_486a_9473_8b38bb4ca021(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (k == 0) return -1;
        if (arr1.size() == 0) return arr2.get(k-1);
        if (arr2.size() == 0) return arr1.get(k-1);
        if (k == 1) return Math.min(arr1.get(0), arr2.get(0));
        int a = arr1.get(0);
        int b = arr2.get(0);
        if (a < b) {
            arr1.remove(0);
            return findKth_Problem_1_7162278d_dc1a_486a_9473_8b38bb4ca021(arr1, arr2, k-1);
        } else {
            arr2.remove(0);
            return findKth_Problem_1_7162278d_dc1a_486a_9473_8b38bb4ca021(arr1, arr2, k-1);
        }
    }

    
    public static int findKth_Problem_1_15fcd6a2_4c0a_467c_a5cc_44b6a78ec625(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        while (k > 0) {
            if (i >= arr1.size()) {
                return arr2.get(j + k - 1);
            }
            if (j >= arr2.size()) {
                return arr1.get(i + k - 1);
            }
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        return Math.min(arr1.get(i), arr2.get(j));
    }

    
    public static int findKth_Problem_0_888e2b57_5c96_47de_b9bb_0c8391c1117a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_2_a9811eb7_5c85_4030_a378_98da5e9dba77(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        while (k > 0) {
            if (i >= arr1.size()) {
                return arr2.get( (j + k - 1));
            }
            if (j >= arr2.size()) {
                return arr1.get( (i + k - 1));
            }
            if (arr1.get( i) < arr2.get( j)) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        if (i >= arr1.size()) {
            return arr2.get( (j + k - 1));
        }
        if (j >= arr2.size()) {
            return arr1.get( (i + k - 1));
        }
        return Math.min(arr1.get( i), arr2.get( j));
    }

    
    public static int findKth_Problem_2_fd41b0af_cb96_495b_a589_6f795c29bc5a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) return arr2.get(k);
        if (arr2.size() == 0) return arr1.get(k);
        if (k == 0) return Math.min(arr1.get(0), arr2.get(0));
        if (arr1.size() == 1 && arr2.size() == 1) return Math.max(arr1.get(0), arr2.get(0));
        if (arr1.size() == 1) {
            if (arr1.get(0) < arr2.get(k - 1)) return arr2.get(k - 1);
            if (arr1.get(0) > arr2.get(k)) return arr2.get(k);
            return arr1.get(0);
        }
        if (arr2.size() == 1) {
            if (arr2.get(0) < arr1.get(k - 1)) return arr1.get(k - 1);
            if (arr2.get(0) > arr1.get(k)) return arr1.get(k);
            return arr2.get(0);
        }
        int m1 = arr1.get(k / 2);
        int m2 = arr2.get(k / 2);
        if (m1 < m2) {
            return findKth_Problem_2_fd41b0af_cb96_495b_a589_6f795c29bc5a(new ArrayList<Integer>(arr1.subList(k / 2, arr1.size())), arr2, k - k / 2);
        } else {
            return findKth_Problem_2_fd41b0af_cb96_495b_a589_6f795c29bc5a(arr1, new ArrayList<Integer>(arr2.subList(k / 2, arr2.size())), k - k / 2);
        }
    }

    
    public static int findKth_Problem_0_8f38dc30_326d_4e29_9993_3ac5ba19de82(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int result = -1;
        if (arr1.size() >= arr2.size()) {
            // We don't know the sizes of the two arrays, so we must compare the two arrays.
            int i = 0;
            while (i < arr1.size() && i < arr2.size() && arr1.get(i) < arr2.get(i)) {
                i++;
            }
            if (arr1.size() > arr2.size()) {
                while (i < arr1.size() && arr1.get(i) < k) {
                    i++;
                }
                result = arr1.get(i);
            } else {
                while (i < arr2.size() && arr2.get(i) < k) {
                    i++;
                }
                result = arr2.get(i);
            }
        } else {
            // We don't know the sizes of the two arrays, so we must compare the two arrays.
            int i = 0;
            while (i < arr1.size() && i < arr2.size() && arr1.get(i) < arr2.get(i)) {
                i++;
            }
            if (arr1.size() > arr2.size()) {
                while (i < arr1.size() && arr1.get(i) < k) {
                    i++;
                }
                result = arr1.get(i);
            } else {
                while (i < arr2.size() && arr2.get(i) < k) {
                    i++;
                }
                result = arr2.get(i);
            }
        }
        return result;
    }

    
    public static int findKth_Problem_0_195bcf66_4f40_4663_b57c_35c8980a49e2(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() <= 1 && arr2.size() <= 1) {
            return -1;
        }
        int low = arr1.get(0);
        int high = arr2.get(0);
        int mid = (low + high) / 2;
        int prev = 0;
        int next = 0;
        for (int i = 1; i < arr1.size(); i++) {
            if (mid >= arr1.get(i) && mid <= arr2.get(i)) {
                return mid;
            }
            else if (mid >= arr1.get(i)) {
                prev = mid;
                mid = (mid + arr2.get(i)) / 2;
            }
            else {
                next = mid + arr1.get(i);
            }
        }
        if (prev + 1 == next) {
            return prev;
        }
        int mid2 = (prev + next) / 2;
        return mid2;
    }

    
    public static int findKth_Problem_2_59b84a6d_13cb_4314_80c3_af1c07bdde7d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(Math.min(k/2, arr1.size() - 1));
        int mid2 = arr2.get(Math.min(k/2, arr2.size() - 1));
        if (mid1 < mid2) {
            return findKth_Problem_2_59b84a6d_13cb_4314_80c3_af1c07bdde7d(new ArrayList<Integer>(arr1.subList(Math.min(k/2, arr1.size() - 1), arr1.size())), arr2, k - Math.min(k/2, arr1.size()));
        } else {
            return findKth_Problem_2_59b84a6d_13cb_4314_80c3_af1c07bdde7d(arr1, new ArrayList<Integer>(arr2.subList(Math.min(k/2, arr2.size() - 1), arr2.size())), k - Math.min(k/2, arr2.size()));
        }
    }

    
    public static int findKth_Problem_0_79f472a4_4423_4680_9149_613f679d454b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                if (count == k - 1) {
                    return arr1.get(i);
                }
                i++;
                count++;
            } else {
                if (count == k - 1) {
                    return arr2.get(j);
                }
                j++;
                count++;
            }
        }
        while (i < arr1.size()) {
            if (count == k - 1) {
                return arr1.get(i);
            }
            i++;
            count++;
        }
        while (j < arr2.size()) {
            if (count == k - 1) {
                return arr2.get(j);
            }
            j++;
            count++;
        }
        return -1;
    }

    
    public static int findKth_Problem_2_9d1ce91d_341e_4655_9362_48010b7a25f8(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 1 && arr2.size() == 1) {
            return Math.max(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(arr1.size()/2);
        int mid2 = arr2.get(arr2.size()/2);
        if (mid1 < mid2) {
            if (k <= arr1.size()/2 + arr2.size()/2) {
                return findKth_Problem_2_9d1ce91d_341e_4655_9362_48010b7a25f8(new ArrayList<Integer>(arr1.subList(0, arr1.size()/2)), arr2, k);
            } else {
                return findKth_Problem_2_9d1ce91d_341e_4655_9362_48010b7a25f8(arr1, new ArrayList<Integer>(arr2.subList(arr2.size()/2, arr2.size())), k - arr2.size()/2);
            }
        } else {
            if (k <= arr1.size()/2 + arr2.size()/2) {
                return findKth_Problem_2_9d1ce91d_341e_4655_9362_48010b7a25f8(arr1, new ArrayList<Integer>(arr2.subList(0, arr2.size()/2)), k);
            } else {
                return findKth_Problem_2_9d1ce91d_341e_4655_9362_48010b7a25f8(new ArrayList<Integer>(arr1.subList(arr1.size()/2, arr1.size())), arr2, k - arr1.size()/2);
            }
        }
    }

    
    public static int findKth_Problem_0_7ffe92ff_df83_4cd5_b50d_1e5146c9d1d6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        int firstArray = arr1.get(0);
        int secondArray = arr2.get(0);
        int finalArray = firstArray + (secondArray - firstArray) * (k - 1);
        return finalArray;
    }

    
    public static int findKth_Problem_2_27fb1526_69ab_473f_adb9_9aecb0631c92(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
                count++;
            } else {
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
                count++;
            }
        }
        while (i < arr1.size()) {
            if (count == k) {
                return arr1.get(i);
            }
            i++;
            count++;
        }
        while (j < arr2.size()) {
            if (count == k) {
                return arr2.get(j);
            }
            j++;
            count++;
        }
        return -1;
    }

    
    public static int findKth_Problem_2_83b9b31a_d603_4e77_b639_73acbac60ac1(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 1 && arr2.size() == 1) {
            return Math.max(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(arr1.size() / 2);
        int mid2 = arr2.get(arr2.size() / 2);
        if (mid1 < mid2) {
            if (k <= arr1.size() / 2 + arr2.size() / 2) {
                return findKth_Problem_2_83b9b31a_d603_4e77_b639_73acbac60ac1(new ArrayList<Integer>(arr1.subList(0, arr1.size() / 2)), arr2, k);
            } else {
                return findKth_Problem_2_83b9b31a_d603_4e77_b639_73acbac60ac1(arr1, new ArrayList<Integer>(arr2.subList(arr2.size() / 2 + 1, arr2.size())), k - arr2.size() / 2 - 1);
            }
        } else {
            if (k <= arr1.size() / 2 + arr2.size() / 2) {
                return findKth_Problem_2_83b9b31a_d603_4e77_b639_73acbac60ac1(arr1, new ArrayList<Integer>(arr2.subList(0, arr2.size() / 2)), k);
            } else {
                return findKth_Problem_2_83b9b31a_d603_4e77_b639_73acbac60ac1(new ArrayList<Integer>(arr1.subList(arr1.size() / 2 + 1, arr1.size())), arr2, k - arr1.size() / 2 - 1);
            }
        }
    }

    
    public static int findKth_Problem_0_a6339143_f507_43f0_b684_acedf537b407(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int sum = 0; //sum of all elements
        int index = 0;
        for(int i = 0; i < arr1.size(); i++) {
            sum += arr1.get(i);
            if(sum > k) {
                index = i; //index where sum will be greater than k
            }
        }
        
        sum = 0;
        for(int i = 0; i < arr2.size(); i++) {
            sum += arr2.get(i);
            if(sum > k) {
                index = i; //index where sum will be greater than k
            }
        }
        
        
        
        
        return arr1.get(index); //return kth element from the array list
    }

    
    public static int findKth_Problem_0_1be5851c_2a18_4a85_a8da_522865976ead(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(Math.min(k/2, arr1.size()-1));
        int mid2 = arr2.get(Math.min(k/2, arr2.size()-1));
        if (mid1 < mid2) {
            return findKth_Problem_0_1be5851c_2a18_4a85_a8da_522865976ead(new ArrayList<Integer>(arr1.subList(Math.min(k/2, arr1.size()-1), arr1.size())), arr2, k - Math.min(k/2, arr1.size()-1));
        } else {
            return findKth_Problem_0_1be5851c_2a18_4a85_a8da_522865976ead(arr1, new ArrayList<Integer>(arr2.subList(Math.min(k/2, arr2.size()-1), arr2.size())), k - Math.min(k/2, arr2.size()-1));
        }
    }

    
    public static int findKth_Problem_0_f8b5bb6c_1784_4a6d_9aa0_133a8fb398a2(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1 == null || arr2 == null || k <= 0 || arr1.size() == 0 || arr2.size() == 0)
            return 0;
        int firstElem = arr1.get(0);
        int secondElem = arr2.get(0);
        if (firstElem != secondElem && k <= (firstElem + secondElem)) {
            return firstElem;
        }
        ArrayList<Integer> temp1 = new ArrayList<Integer>();
        ArrayList<Integer> temp2 = new ArrayList<Integer>();
        int currentVal = firstElem;
        while (currentVal <= arr2.get(arr2.size() - 1)) {
            if (k == currentVal) {
                temp1.add(currentVal);
            }
            currentVal++;
        }
        currentVal = firstElem;
        while (currentVal <= arr1.get(arr1.size() - 1)) {
            if (k == currentVal) {
                temp2.add(currentVal);
            }
            currentVal++;
        }
        if (temp1.size() > temp2.size()) {
            temp1.removeAll(new ArrayList<Integer>(temp2));
            System.out.println(temp1.toString());
        } else {
            temp2.removeAll(new ArrayList<Integer>(temp1));
            System.out.println(temp2.toString());
        }
        return currentVal;
    }

    
    public static int findKth_Problem_1_a9e82594_511c_43a7_891c_5a2282075a1c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        return 0;
    }

    
    public static int findKth_Problem_1_6912dae3_b507_48c1_aa0d_7c1520a93c09(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k-1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k-1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(Math.min(k/2, arr1.size())-1);
        int mid2 = arr2.get(Math.min(k/2, arr2.size())-1);
        if (mid1 < mid2) {
            return findKth_Problem_1_6912dae3_b507_48c1_aa0d_7c1520a93c09(new ArrayList<Integer>(arr1.subList(Math.min(k/2, arr1.size()), arr1.size())), arr2, k - Math.min(k/2, arr1.size()));
        } else {
            return findKth_Problem_1_6912dae3_b507_48c1_aa0d_7c1520a93c09(arr1, new ArrayList<Integer>(arr2.subList(Math.min(k/2, arr2.size()), arr2.size())), k - Math.min(k/2, arr2.size()));
        }
    }

    
    public static int findKth_Problem_1_1c443cd2_9aa6_4564_a069_df2c6d26bc52(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (k > n + m) {
            return -1;
        }
        if (n == 0) {
            return arr2.get( k - 1);
        }
        if (m == 0) {
            return arr1.get( k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i = Math.min(n,  k / 2);
        int j = Math.min(m,  k / 2);
        if (arr1.get(i - 1) > arr2.get(j - 1)) {
            return findKth_Problem_1_1c443cd2_9aa6_4564_a069_df2c6d26bc52(arr1, new ArrayList<Integer>(arr2.subList(j, m)), k - j);
        } else {
            return findKth_Problem_1_1c443cd2_9aa6_4564_a069_df2c6d26bc52(new ArrayList<Integer>(arr1.subList(i, n)), arr2, k - i);
        }
    }

    
    public static int findKth_Problem_0_6a6fb7b1_8346_49da_84af_45db781eb0ec(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() >= k / 2 ? arr1.get(k / 2 - 1) : Integer.MAX_VALUE;
        int mid2 = arr2.size() >= k / 2 ? arr2.get(k / 2 - 1) : Integer.MAX_VALUE;
        if (mid1 < mid2) {
            return findKth_Problem_0_6a6fb7b1_8346_49da_84af_45db781eb0ec(new ArrayList<Integer>(arr1.subList(k / 2, arr1.size())), arr2, k - k / 2);
        } else {
            return findKth_Problem_0_6a6fb7b1_8346_49da_84af_45db781eb0ec(arr1, new ArrayList<Integer>(arr2.subList(k / 2, arr2.size())), k - k / 2);
        }
    }

    
    public static int findKth_Problem_2_c051a651_105e_448d_b171_846d973fd033(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int res = -1;
        if (k == arr1.size()) return arr2.get(0);
        if (k == arr2.size()) return arr1.get(0);
        int i = 0;
        while (arr1.size() > 0 && arr2.size() > 0 && i < k) {
            if (arr1.get(arr1.size() - 1) <= arr2.get(arr2.size() - 1)) {
                if (res == -1) return arr1.get(arr1.size() - 1);
                else
                    res = arr1.get(arr1.size() - 1);
                arr1.remove(arr1.size() - 1);
            } else {
                if (res == -1) return arr2.get(arr2.size() - 1);
                else
                    res = arr2.get(arr2.size() - 1);
                arr2.remove(arr2.size() - 1);
            }
            i++;
        }
        return res;
    }

    
    public static int findKth_Problem_1_e325696e_0b3c_47fa_a3c4_323e996eb3ce(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 1) {
            if (arr1.get(0) < arr2.get(0)) {
                return arr2.get(k - 1);
            } else {
                return arr2.get(k);
            }
        }
        if (arr2.size() == 1) {
            if (arr2.get(0) < arr1.get(0)) {
                return arr1.get(k - 1);
            } else {
                return arr1.get(k);
            }
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_e325696e_0b3c_47fa_a3c4_323e996eb3ce(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_1_e325696e_0b3c_47fa_a3c4_323e996eb3ce(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_e325696e_0b3c_47fa_a3c4_323e996eb3ce(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_1_e325696e_0b3c_47fa_a3c4_323e996eb3ce(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_2_ec7a9aaf_7fdb_49a3_89bf_2918123c144b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() > arr2.size()) {
            return findKth_Problem_2_ec7a9aaf_7fdb_49a3_89bf_2918123c144b(arr2, arr1, k);
        }
        int i = Math.min(arr1.size() - 1, k / 2);
        int j = Math.min(arr2.size() - 1, k / 2);
        if (arr1.get(i) > arr2.get(j)) {
            return findKth_Problem_2_ec7a9aaf_7fdb_49a3_89bf_2918123c144b(arr1, new ArrayList<Integer>(arr2.subList(j + 1, arr2.size())), k - j - 1);
        }
        else {
            return findKth_Problem_2_ec7a9aaf_7fdb_49a3_89bf_2918123c144b(new ArrayList<Integer>(arr1.subList(i + 1, arr1.size())), arr2, k - i - 1);
        }
    }

    
    public static int findKth_Problem_2_3d7c0156_bfbb_4bb4_8a0b_642610e02f90(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int count = 0;
        int i = 0;
        int j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
                j++;
            }
        }
        return -1;
    }

    
    public static int findKth_Problem_1_79f472a4_4423_4680_9149_613f679d454b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                if (count == k - 1) {
                    return arr1.get(i);
                }
                i++;
                count++;
            } else {
                if (count == k - 1) {
                    return arr2.get(j);
                }
                j++;
                count++;
            }
        }
        while (i < arr1.size()) {
            if (count == k - 1) {
                return arr1.get(i);
            }
            i++;
            count++;
        }
        while (j < arr2.size()) {
            if (count == k - 1) {
                return arr2.get(j);
            }
            j++;
            count++;
        }
        return -1;
    }

    
    public static int findKth_Problem_2_a4a143f6_4e14_4ae6_807b_d3bcf637b84c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        } else if (arr2.size() == 0) {
            return arr1.get(k);
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_a4a143f6_4e14_4ae6_807b_d3bcf637b84c(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_2_a4a143f6_4e14_4ae6_807b_d3bcf637b84c(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_a4a143f6_4e14_4ae6_807b_d3bcf637b84c(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_2_a4a143f6_4e14_4ae6_807b_d3bcf637b84c(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_0_f985e9b9_1316_40fd_b51b_d245bff8caf8(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_f985e9b9_1316_40fd_b51b_d245bff8caf8(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_0_f985e9b9_1316_40fd_b51b_d245bff8caf8(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_f985e9b9_1316_40fd_b51b_d245bff8caf8(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_0_f985e9b9_1316_40fd_b51b_d245bff8caf8(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_2_3b7c4e23_ccd3_4067_8e4b_6ca9fdad9f1e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) return arr2.get(k);
        if (arr2.size() == 0) return arr1.get(k);
        if (k == 0) return Math.min(arr1.get(0), arr2.get(0));
        if (arr1.size() == 1 && arr2.size() == 1) return Math.max(arr1.get(0), arr2.get(0));
        if (arr1.size() == 1) {
            if (arr1.get(0) < arr2.get(k/2)) return arr2.get(k-1);
            else return findKth_Problem_2_3b7c4e23_ccd3_4067_8e4b_6ca9fdad9f1e(new ArrayList<Integer>(), arr2, k-1);
        }
        if (arr2.size() == 1) {
            if (arr2.get(0) < arr1.get(k/2)) return arr1.get(k-1);
            else return findKth_Problem_2_3b7c4e23_ccd3_4067_8e4b_6ca9fdad9f1e(arr1, new ArrayList<Integer>(), k-1);
        }
        if (arr1.get(k/2) < arr2.get(k/2)) {
            return findKth_Problem_2_3b7c4e23_ccd3_4067_8e4b_6ca9fdad9f1e(new ArrayList<Integer>(arr1.subList(k/2, arr1.size())), arr2, k-k/2);
        } else {
            return findKth_Problem_2_3b7c4e23_ccd3_4067_8e4b_6ca9fdad9f1e(arr1, new ArrayList<Integer>(arr2.subList(k/2, arr2.size())), k-k/2);
        }
    }

    
    public static int findKth_Problem_0_3b7c4e23_ccd3_4067_8e4b_6ca9fdad9f1e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) return arr2.get(k);
        if (arr2.size() == 0) return arr1.get(k);
        if (k == 0) return Math.min(arr1.get(0), arr2.get(0));
        if (arr1.size() == 1 && arr2.size() == 1) return Math.max(arr1.get(0), arr2.get(0));
        if (arr1.size() == 1) {
            if (arr1.get(0) < arr2.get(k/2)) return arr2.get(k-1);
            else return findKth_Problem_0_3b7c4e23_ccd3_4067_8e4b_6ca9fdad9f1e(new ArrayList<Integer>(), arr2, k-1);
        }
        if (arr2.size() == 1) {
            if (arr2.get(0) < arr1.get(k/2)) return arr1.get(k-1);
            else return findKth_Problem_0_3b7c4e23_ccd3_4067_8e4b_6ca9fdad9f1e(arr1, new ArrayList<Integer>(), k-1);
        }
        if (arr1.get(k/2) < arr2.get(k/2)) {
            return findKth_Problem_0_3b7c4e23_ccd3_4067_8e4b_6ca9fdad9f1e(new ArrayList<Integer>(arr1.subList(k/2, arr1.size())), arr2, k-k/2);
        } else {
            return findKth_Problem_0_3b7c4e23_ccd3_4067_8e4b_6ca9fdad9f1e(arr1, new ArrayList<Integer>(arr2.subList(k/2, arr2.size())), k-k/2);
        }
    }

    
    public static int findKth_Problem_1_94fe36dc_c134_4a40_ae3e_ef9120865668(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_94fe36dc_c134_4a40_ae3e_ef9120865668(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_1_94fe36dc_c134_4a40_ae3e_ef9120865668(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_94fe36dc_c134_4a40_ae3e_ef9120865668(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_1_94fe36dc_c134_4a40_ae3e_ef9120865668(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_2_4b55ea00_bbeb_4fac_b3e8_03334aaca300(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int k1 = Math.min(k / 2, arr1.size());
        int k2 = Math.min(k / 2, arr2.size());
        if (arr1.get(k1 - 1) < arr2.get(k2 - 1)) {
            return findKth_Problem_2_4b55ea00_bbeb_4fac_b3e8_03334aaca300(new ArrayList<Integer>(arr1.subList(k1, arr1.size())), arr2, k - k1);
        } else {
            return findKth_Problem_2_4b55ea00_bbeb_4fac_b3e8_03334aaca300(arr1, new ArrayList<Integer>(arr2.subList(k2, arr2.size())), k - k2);
        }
    }

    
    public static int findKth_Problem_0_fca4657d_0b25_40d4_8ae7_20efd937f16c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get( (k - 1));
        }
        if (arr2.size() == 0) {
            return arr1.get( (k - 1));
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() > arr2.size()) {
            return findKth_Problem_0_fca4657d_0b25_40d4_8ae7_20efd937f16c(arr2, arr1, k);
        }
        int a = Math.min(k / 2, arr1.size());
        int b = k - a;
        if (arr1.get( (a - 1)) < arr2.get( (b - 1))) {
            return findKth_Problem_0_fca4657d_0b25_40d4_8ae7_20efd937f16c(new ArrayList<Integer>(arr1.subList( a, arr1.size())), arr2, k - a);
        } else if (arr1.get( (a - 1)) > arr2.get( (b - 1))) {
            return findKth_Problem_0_fca4657d_0b25_40d4_8ae7_20efd937f16c(arr1, new ArrayList<Integer>(arr2.subList( b, arr2.size())), k - b);
        } else {
            return arr1.get( (a - 1));
        }
    }

    
    public static int findKth_Problem_2_abe82fe9_c4c3_426c_b8b8_4758ee480815(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        while (i < arr1.size() && j < arr2.size() && k > 0) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        if (k == 0) {
            return Math.min(arr1.get(i), arr2.get(j));
        } else if (i == arr1.size()) {
            return arr2.get( k - 1);
        } else {
            return arr1.get( k - 1);
        }
    }

    
    public static int findKth_Problem_1_20291938_569d_487a_8f67_34fd8472c308(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int x = Math.min(arr1.size(), k / 2);
        int y = Math.min(arr2.size(), k / 2);
        if (arr1.get(x - 1) < arr2.get(y - 1)) {
            return findKth_Problem_1_20291938_569d_487a_8f67_34fd8472c308(new ArrayList<Integer>(arr1.subList(x, arr1.size())), arr2, k - x);
        } else {
            return findKth_Problem_1_20291938_569d_487a_8f67_34fd8472c308(arr1, new ArrayList<Integer>(arr2.subList(y, arr2.size())), k - y);
        }
    }

    
    public static int findKth_Problem_2_390ef899_8fab_4147_9157_e64110efffe9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_1_9d1ce91d_341e_4655_9362_48010b7a25f8(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 1 && arr2.size() == 1) {
            return Math.max(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(arr1.size()/2);
        int mid2 = arr2.get(arr2.size()/2);
        if (mid1 < mid2) {
            if (k <= arr1.size()/2 + arr2.size()/2) {
                return findKth_Problem_1_9d1ce91d_341e_4655_9362_48010b7a25f8(new ArrayList<Integer>(arr1.subList(0, arr1.size()/2)), arr2, k);
            } else {
                return findKth_Problem_1_9d1ce91d_341e_4655_9362_48010b7a25f8(arr1, new ArrayList<Integer>(arr2.subList(arr2.size()/2, arr2.size())), k - arr2.size()/2);
            }
        } else {
            if (k <= arr1.size()/2 + arr2.size()/2) {
                return findKth_Problem_1_9d1ce91d_341e_4655_9362_48010b7a25f8(arr1, new ArrayList<Integer>(arr2.subList(0, arr2.size()/2)), k);
            } else {
                return findKth_Problem_1_9d1ce91d_341e_4655_9362_48010b7a25f8(new ArrayList<Integer>(arr1.subList(arr1.size()/2, arr1.size())), arr2, k - arr1.size()/2);
            }
        }
    }

    
    public static int findKth_Problem_2_6fedbf3f_92e2_4fdf_8653_98e051b5c829(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get( k);
        }
        if (arr2.size() == 0) {
            return arr1.get( k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 =  Math.min(k / 2, arr1.size() - 1);
        int mid2 =  Math.min(k / 2, arr2.size() - 1);
        if (arr1.get(mid1) < arr2.get(mid2)) {
            return findKth_Problem_2_6fedbf3f_92e2_4fdf_8653_98e051b5c829(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
        } else {
            return findKth_Problem_2_6fedbf3f_92e2_4fdf_8653_98e051b5c829(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
        }
    }

    
    public static int findKth_Problem_2_ff200f58_58b3_4c43_91d6_e543ee42acbc(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 1 && arr2.size() == 1) {
            return Math.max(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_ff200f58_58b3_4c43_91d6_e543ee42acbc(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_2_ff200f58_58b3_4c43_91d6_e543ee42acbc(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_ff200f58_58b3_4c43_91d6_e543ee42acbc(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_2_ff200f58_58b3_4c43_91d6_e543ee42acbc(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_2_7c307c88_cfcb_424d_8ec1_070006570587(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get( k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get( k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int a = arr1.get(0);
        int b = arr2.get(0);
        if (a < b) {
            arr1.remove(0);
            return findKth_Problem_2_7c307c88_cfcb_424d_8ec1_070006570587(arr1, arr2, k - 1);
        } else {
            arr2.remove(0);
            return findKth_Problem_2_7c307c88_cfcb_424d_8ec1_070006570587(arr1, arr2, k - 1);
        }
    }

    
    public static int findKth_Problem_0_f2e1951e_f0d4_4beb_8c8d_ab73d8521dd3(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        while (k > 0) {
            if (i >= arr1.size()) {
                j++;
            } else if (j >= arr2.size()) {
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        if (i >= arr1.size()) {
            return arr2.get(j);
        } else if (j >= arr2.size()) {
            return arr1.get(i);
        } else {
            return Math.min(arr1.get(i), arr2.get(j));
        }
    }

    
    public static int findKth_Problem_2_f3b2cc1f_5b91_455c_b31e_1d156cf68471(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get((k/2));
        int mid2 = arr2.get((k/2));
        if (mid1 < mid2) {
            return findKth_Problem_2_f3b2cc1f_5b91_455c_b31e_1d156cf68471(new ArrayList<Integer>(arr1.subList((k/2), arr1.size())), arr2, k - k/2);
        } else {
            return findKth_Problem_2_f3b2cc1f_5b91_455c_b31e_1d156cf68471(arr1, new ArrayList<Integer>(arr2.subList((k/2), arr2.size())), k - k/2);
        }
    }

    
    public static int findKth_Problem_2_d76289b4_1f8c_4d0c_916c_30e3fb1fc52c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_d76289b4_1f8c_4d0c_916c_30e3fb1fc52c(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_2_d76289b4_1f8c_4d0c_916c_30e3fb1fc52c(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_d76289b4_1f8c_4d0c_916c_30e3fb1fc52c(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_2_d76289b4_1f8c_4d0c_916c_30e3fb1fc52c(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_2_93827ce6_889f_49ef_b738_c226c0f63560(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int res = 0;
        for(int i = 0; i < k; i++) {
            if(arr1.get(i) > arr2.get(i))
                return res + 1;
            else
                res = (res + arr1.get(i)) + arr2.get(i);
        }
        return res;
    }

    
    public static int findKth_Problem_2_c067569b_38cf_426a_bb0d_434086d63198(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        int n = arr1.size();
        int m = arr2.size();
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < n && j < m) {
            if (arr1.get(i) < arr2.get(j)) {
                if (count == k - 1) {
                    return arr1.get(i);
                }
                i++;
                count++;
            } else {
                if (count == k - 1) {
                    return arr2.get(j);
                }
                j++;
                count++;
            }
        }
        while (i < n) {
            if (count == k - 1) {
                return arr1.get(i);
            }
            i++;
            count++;
        }
        while (j < m) {
            if (count == k - 1) {
                return arr2.get(j);
            }
            j++;
            count++;
        }
        return -1;
    }

    
    public static int findKth_Problem_0_6590173f_2d4f_4895_93f6_c5dfb72e655a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = Math.min(k/2, arr1.size() - 1);
        int mid2 = Math.min(k/2, arr2.size() - 1);
        if (arr1.get(mid1) < arr2.get(mid2)) {
            return findKth_Problem_0_6590173f_2d4f_4895_93f6_c5dfb72e655a(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
        }
        else {
            return findKth_Problem_0_6590173f_2d4f_4895_93f6_c5dfb72e655a(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
        }
    }

    
    public static int findKth_Problem_2_0011f485_8be0_4ada_9b11_c907e18c9b11(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (k == 1) {
            return Math.max(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (arr1.get(0) < arr2.get(0)) {
            arr1.remove(0);
            return findKth_Problem_2_0011f485_8be0_4ada_9b11_c907e18c9b11(arr1, arr2, k - 1);
        } else {
            arr2.remove(0);
            return findKth_Problem_2_0011f485_8be0_4ada_9b11_c907e18c9b11(arr1, arr2, k - 1);
        }
    }

    
    public static int findKth_Problem_1_834083b3_66c2_4207_927c_f259068f8522(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        int curr = 0;
        while (k > 0) {
            if (i >= arr1.size()) {
                curr = arr2.get(j);
                j++;
            } else if (j >= arr2.size()) {
                curr = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                curr = arr1.get(i);
                i++;
            } else {
                curr = arr2.get(j);
                j++;
            }
            k--;
        }
        return curr;
    }

    
    public static int findKth_Problem_1_b55809cf_b6b3_47da_ac2a_3e3cf5f16b53(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        while (k > 0) {
            if (i < arr1.size() && j < arr2.size()) {
                if (arr1.get(i) < arr2.get(j)) {
                    i++;
                } else {
                    j++;
                }
            } else if (i < arr1.size()) {
                i++;
            } else if (j < arr2.size()) {
                j++;
            }
            k--;
        }
        if (i < arr1.size() && j < arr2.size()) {
            return Math.min(arr1.get(i), arr2.get(j));
        } else if (i < arr1.size()) {
            return arr1.get(i);
        } else if (j < arr2.size()) {
            return arr2.get(j);
        }
        return -1;
    }

    
    public static int findKth_Problem_1_05f60838_f05a_4f1b_9307_6c4774b8ca3d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        return 0;
    }

    
    public static int findKth_Problem_2_eed8f161_5712_4a44_be7e_1c63a16b2669(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (n == 0) return arr2.get(k - 1);
        if (m == 0) return arr1.get(k - 1);
        if (k == 1) return Math.min(arr1.get(0), arr2.get(0));
        if (k == n + m) return Math.max(arr1.get(n - 1), arr2.get(m - 1));
        int i = Math.min(k / 2, n);
        int j = Math.min(k / 2, m);
        if (arr1.get(i - 1) < arr2.get(j - 1)) {
            return findKth_Problem_2_eed8f161_5712_4a44_be7e_1c63a16b2669(new ArrayList<Integer>(arr1.subList(i, n)), arr2, k - i);
        } else {
            return findKth_Problem_2_eed8f161_5712_4a44_be7e_1c63a16b2669(arr1, new ArrayList<Integer>(arr2.subList(j, m)), k - j);
        }
    }

    
    public static int findKth_Problem_1_46e9583e_9a09_45fa_a6ad_3a7c667e5aed(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int l1 = arr1.size();
        int l2 = arr2.size();
        if(l1 > l2)
        {
            k = arr2.size() - k;
            l2 = l1;
        }
        int res = 0;
        int i = 1;
        int j = 0;
        while(j < k)
        {
            if(arr1.get(i) <= arr2.get(j))
            {
                i++;
                j++;
            }
            else
            {
                j++;
            }
        }
        return res;
    }

    
    public static int findKth_Problem_2_aaa83284_40ad_4408_8106_9c4451a5753f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        int ans = 0;
        while (k > 0) {
            if (i < arr1.size() && j < arr2.size()) {
                if (arr1.get(i) < arr2.get(j)) {
                    ans = arr1.get(i);
                    i++;
                } else {
                    ans = arr2.get(j);
                    j++;
                }
            } else if (i < arr1.size()) {
                ans = arr1.get(i);
                i++;
            } else {
                ans = arr2.get(j);
                j++;
            }
            k--;
        }
        return ans;
    }

    
    public static int findKth_Problem_0_fd5eee6d_857a_4317_a63d_c14e6fb7464f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (k > arr1.size() + arr2.size()) {
            return -1;
        }
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_2_4f6a2610_9528_4a12_910c_8a521aa70ac5(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int min = arr1.get(0); // initialize min with first element
        int max = arr2.get(0); // initialize max with first element

        for(int i = 1; i < arr1.size(); i++) { // start from index 1
            if(arr1.get(i) < min) {
                min = arr1.get(i);
            }
            else if(arr1.get(i) > max) {
                max = arr2.get(i);
            }
        }
        int mid = (min + max) / 2; // find the mid point
        
        int pos = -1;
        int j = 0;
        for(int i = 0; i < arr2.size(); i++) {
            int temp = arr2.get(i);
            int cmp = arr1.get(i);
            if (cmp >= mid) { // when current element is greater than mid point
                j++;
                if (j == k) {
                    pos = temp;
                }
            }
        }
        return pos;
    }

    
    public static int findKth_Problem_0_d4669cc5_5116_4be4_958f_8d5698f55d9e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (k > (n + m)) {
            return -1;
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i = Math.min(n,  k / 2);
        int j = Math.min(m,  k / 2);
        if (arr1.get(i - 1) > arr2.get(j - 1)) {
            ArrayList<Integer> new_arr = new ArrayList<Integer>(arr2.subList(j, m));
            return findKth_Problem_0_d4669cc5_5116_4be4_958f_8d5698f55d9e(arr1, new_arr, k - j);
        } else {
            ArrayList<Integer> new_arr = new ArrayList<Integer>(arr1.subList(i, n));
            return findKth_Problem_0_d4669cc5_5116_4be4_958f_8d5698f55d9e(new_arr, arr2, k - i);
        }
    }

    
    public static int findKth_Problem_2_3393713e_7915_4fbe_853f_bcea56580efa(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() > arr2.size()) {
            return findKth_Problem_2_3393713e_7915_4fbe_853f_bcea56580efa(arr2, arr1, k);
        }
        if (arr1.size() == 1) {
            if (arr2.size() == 1) {
                return Math.max(arr1.get(0), arr2.get(0));
            }
            int i = Math.min(k / 2, arr2.size() - 1);
            if (arr1.get(0) > arr2.get(i)) {
                return findKth_Problem_2_3393713e_7915_4fbe_853f_bcea56580efa(arr1, new ArrayList<Integer>(arr2.subList(i + 1, arr2.size())), k - i - 1);
            } else {
                return findKth_Problem_2_3393713e_7915_4fbe_853f_bcea56580efa(arr1, new ArrayList<Integer>(arr2.subList(0, i)), k);
            }
        }
        int i = Math.min(k / 2, arr1.size() - 1);
        if (arr1.get(i) > arr2.get(i)) {
            return findKth_Problem_2_3393713e_7915_4fbe_853f_bcea56580efa(new ArrayList<Integer>(arr1.subList(0, i)), arr2, k);
        } else {
            return findKth_Problem_2_3393713e_7915_4fbe_853f_bcea56580efa(new ArrayList<Integer>(arr1.subList(i + 1, arr1.size())), arr2, k - i - 1);
        }
    }

    
    public static int findKth_Problem_0_fd41b0af_cb96_495b_a589_6f795c29bc5a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) return arr2.get(k);
        if (arr2.size() == 0) return arr1.get(k);
        if (k == 0) return Math.min(arr1.get(0), arr2.get(0));
        if (arr1.size() == 1 && arr2.size() == 1) return Math.max(arr1.get(0), arr2.get(0));
        if (arr1.size() == 1) {
            if (arr1.get(0) < arr2.get(k - 1)) return arr2.get(k - 1);
            if (arr1.get(0) > arr2.get(k)) return arr2.get(k);
            return arr1.get(0);
        }
        if (arr2.size() == 1) {
            if (arr2.get(0) < arr1.get(k - 1)) return arr1.get(k - 1);
            if (arr2.get(0) > arr1.get(k)) return arr1.get(k);
            return arr2.get(0);
        }
        int m1 = arr1.get(k / 2);
        int m2 = arr2.get(k / 2);
        if (m1 < m2) {
            return findKth_Problem_0_fd41b0af_cb96_495b_a589_6f795c29bc5a(new ArrayList<Integer>(arr1.subList(k / 2, arr1.size())), arr2, k - k / 2);
        } else {
            return findKth_Problem_0_fd41b0af_cb96_495b_a589_6f795c29bc5a(arr1, new ArrayList<Integer>(arr2.subList(k / 2, arr2.size())), k - k / 2);
        }
    }

    
    public static int findKth_Problem_0_3715de52_a3ed_4a99_a813_acbed3f97068(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_3715de52_a3ed_4a99_a813_acbed3f97068(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_0_3715de52_a3ed_4a99_a813_acbed3f97068(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_3715de52_a3ed_4a99_a813_acbed3f97068(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_0_3715de52_a3ed_4a99_a813_acbed3f97068(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_1_e261bde5_860e_482a_898d_749fa592ebc0(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() > arr2.size()) {
            return findKth_Problem_1_e261bde5_860e_482a_898d_749fa592ebc0(arr2, arr1, k);
        }
        int mid = arr1.size() / 2;
        if (arr1.get(mid) > arr2.get(k - mid)) {
            return findKth_Problem_1_e261bde5_860e_482a_898d_749fa592ebc0(new ArrayList<Integer>(arr1.subList(0, mid)), arr2, k);
        } else {
            return findKth_Problem_1_e261bde5_860e_482a_898d_749fa592ebc0(arr1, new ArrayList<Integer>(arr2.subList(0, k - mid)), k - mid);
        }
    }

    
    public static int findKth_Problem_2_4ae3e247_9f64_4d7d_8d87_8d55e4703625(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_4ae3e247_9f64_4d7d_8d87_8d55e4703625(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_2_4ae3e247_9f64_4d7d_8d87_8d55e4703625(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_4ae3e247_9f64_4d7d_8d87_8d55e4703625(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_2_4ae3e247_9f64_4d7d_8d87_8d55e4703625(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_1_b1e6eccb_bdad_41ec_8cb1_4681c2b5e009(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get( i) <= arr2.get( j)) {
                if (count == k) {
                    return arr1.get( i);
                }
                i++;
                count++;
            } else {
                if (count == k) {
                    return arr2.get( j);
                }
                j++;
                count++;
            }
        }
        while (i < arr1.size()) {
            if (count == k) {
                return arr1.get( i);
            }
            i++;
            count++;
        }
        while (j < arr2.size()) {
            if (count == k) {
                return arr2.get( j);
            }
            j++;
            count++;
        }
        return -1;
    }

    
    public static int findKth_Problem_0_ef482285_1375_4b46_aca3_0c6ee414bb7d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int m = arr1.size();
        int n = arr2.size();
        
        int l = arr1.get(0),r = arr2.get(0);
        
        int mid = l + r + 1;
        
        int lDiff = l - mid;
        int rDiff = r - mid;
        
        if(lDiff <= rDiff) {
            while(k >= 0 && r > mid && lDiff <= rDiff) {
                l++;
                lDiff++;
                k--;
            }
        } else {
            while(k >= 0 && r > mid && rDiff <= lDiff) {
                r--;
                rDiff--;
                k--;
            }
        }
        
        return mid;
    }

    
    public static int findKth_Problem_1_f8b5bb6c_1784_4a6d_9aa0_133a8fb398a2(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1 == null || arr2 == null || k <= 0 || arr1.size() == 0 || arr2.size() == 0)
            return 0;
        int firstElem = arr1.get(0);
        int secondElem = arr2.get(0);
        if (firstElem != secondElem && k <= (firstElem + secondElem)) {
            return firstElem;
        }
        ArrayList<Integer> temp1 = new ArrayList<Integer>();
        ArrayList<Integer> temp2 = new ArrayList<Integer>();
        int currentVal = firstElem;
        while (currentVal <= arr2.get(arr2.size() - 1)) {
            if (k == currentVal) {
                temp1.add(currentVal);
            }
            currentVal++;
        }
        currentVal = firstElem;
        while (currentVal <= arr1.get(arr1.size() - 1)) {
            if (k == currentVal) {
                temp2.add(currentVal);
            }
            currentVal++;
        }
        if (temp1.size() > temp2.size()) {
            temp1.removeAll(new ArrayList<Integer>(temp2));
            System.out.println(temp1.toString());
        } else {
            temp2.removeAll(new ArrayList<Integer>(temp1));
            System.out.println(temp2.toString());
        }
        return currentVal;
    }

    
    public static int findKth_Problem_2_e325696e_0b3c_47fa_a3c4_323e996eb3ce(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 1) {
            if (arr1.get(0) < arr2.get(0)) {
                return arr2.get(k - 1);
            } else {
                return arr2.get(k);
            }
        }
        if (arr2.size() == 1) {
            if (arr2.get(0) < arr1.get(0)) {
                return arr1.get(k - 1);
            } else {
                return arr1.get(k);
            }
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_e325696e_0b3c_47fa_a3c4_323e996eb3ce(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_2_e325696e_0b3c_47fa_a3c4_323e996eb3ce(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_e325696e_0b3c_47fa_a3c4_323e996eb3ce(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_2_e325696e_0b3c_47fa_a3c4_323e996eb3ce(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_2_caeaa497_d132_4e87_956f_28dadf449112(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int min = arr1.get(0);
        int max = arr2.get(0);
        int result = min + max;

        if (result == k) {
            return min;
        } else if (result > k) {
            min = arr1.get(1);
            max = arr2.get(1);
            result = min + max;

            if (result == k) {
                return min;
            } else if (result > k) {
                min = arr1.get(2);
                max = arr2.get(2);
                result = min + max;

                if (result == k) {
                    return min;
                }
            }
        }
        return max;
    }

    
    public static int findKth_Problem_1_b49f970f_61a9_46a2_a8e6_652436ef9810(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 1 && arr2.size() == 1) {
            return Math.max(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_b49f970f_61a9_46a2_a8e6_652436ef9810(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_1_b49f970f_61a9_46a2_a8e6_652436ef9810(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_b49f970f_61a9_46a2_a8e6_652436ef9810(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_1_b49f970f_61a9_46a2_a8e6_652436ef9810(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_2_f2e1951e_f0d4_4beb_8c8d_ab73d8521dd3(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        while (k > 0) {
            if (i >= arr1.size()) {
                j++;
            } else if (j >= arr2.size()) {
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        if (i >= arr1.size()) {
            return arr2.get(j);
        } else if (j >= arr2.size()) {
            return arr1.get(i);
        } else {
            return Math.min(arr1.get(i), arr2.get(j));
        }
    }

    
    public static int findKth_Problem_0_27fb1526_69ab_473f_adb9_9aecb0631c92(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
                count++;
            } else {
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
                count++;
            }
        }
        while (i < arr1.size()) {
            if (count == k) {
                return arr1.get(i);
            }
            i++;
            count++;
        }
        while (j < arr2.size()) {
            if (count == k) {
                return arr2.get(j);
            }
            j++;
            count++;
        }
        return -1;
    }

    
    public static int findKth_Problem_2_641476ec_1b4b_48e7_a502_1cbfcbec3ab9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here.
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_2_09578403_42cc_4708_abc7_8a18272c644a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        return 0;
    }

    
    public static int findKth_Problem_1_d3b9eaaf_fd17_4dbf_be31_fe7140ab6619(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get( (k - 1));
        }
        if (arr2.size() == 0) {
            return arr1.get( (k - 1));
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i =  Math.min(k / 2, arr1.size());
        int j =  Math.min(k / 2, arr2.size());
        if (arr1.get(i - 1) < arr2.get(j - 1)) {
            return findKth_Problem_1_d3b9eaaf_fd17_4dbf_be31_fe7140ab6619(new ArrayList<Integer>(arr1.subList(i, arr1.size())), arr2, k - i);
        } else {
            return findKth_Problem_1_d3b9eaaf_fd17_4dbf_be31_fe7140ab6619(arr1, new ArrayList<Integer>(arr2.subList(j, arr2.size())), k - j);
        }
    }

    
    public static int findKth_Problem_2_bc2a39df_ae01_40a3_86e6_b676dde502d2(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() > arr2.size()) {
            return findKth_Problem_2_bc2a39df_ae01_40a3_86e6_b676dde502d2(arr2, arr1, k);
        }
        int i = Math.min(k / 2, arr1.size());
        int j = k - i;
        if (arr1.get(i - 1) < arr2.get(j - 1)) {
            ArrayList<Integer> newArr1 = new ArrayList<Integer>(arr1.subList(i, arr1.size()));
            return findKth_Problem_2_bc2a39df_ae01_40a3_86e6_b676dde502d2(newArr1, arr2, k - i);
        } else if (arr1.get(i - 1) > arr2.get(j - 1)) {
            ArrayList<Integer> newArr2 = new ArrayList<Integer>(arr2.subList(j, arr2.size()));
            return findKth_Problem_2_bc2a39df_ae01_40a3_86e6_b676dde502d2(arr1, newArr2, k - j);
        } else {
            return arr1.get(i - 1);
        }
    }

    
    public static int findKth_Problem_1_a2e4e944_a916_40ab_b7cf_d6af2c5dea45(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        while (k > 0) {
            if (i >= arr1.size()) {
                return arr2.get(j +  k - 1);
            }
            if (j >= arr2.size()) {
                return arr1.get(i +  k - 1);
            }
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        return Math.min(arr1.get(i), arr2.get(j));
    }

    
    public static int findKth_Problem_1_f985e9b9_1316_40fd_b51b_d245bff8caf8(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_f985e9b9_1316_40fd_b51b_d245bff8caf8(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_1_f985e9b9_1316_40fd_b51b_d245bff8caf8(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_f985e9b9_1316_40fd_b51b_d245bff8caf8(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_1_f985e9b9_1316_40fd_b51b_d245bff8caf8(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_1_e9061600_9b5b_4e13_b18c_36abec9e8f59(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if(k == 0)
            return -1;
        // Find the middle index
        int mid = (arr1.size()+arr2.size())/2;
        if(arr1.size() > arr2.size())
            return findKth_Problem_1_e9061600_9b5b_4e13_b18c_36abec9e8f59(arr1, arr2, k-1);
        else
            return findKth_Problem_1_e9061600_9b5b_4e13_b18c_36abec9e8f59(arr2, arr1, k-1);
    }

    
    public static int findKth_Problem_1_f1408c60_c610_46e8_b905_5463123ed9fc(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int k1 = arr1.get(0);
        int k2 = arr2.get(0);
        if (k1 > k2) {
            int t = k1;
            k1 = k2;
            k2 = t;
        }
        int max1 = arr1.get(arr1.size() - 1);
        int max2 = arr2.get(arr2.size() - 1);
        if (max1 < max2) {
            return k1;
        } else if (max1 > max2) {
            return k2;
        } else {
            int i = 0;
            int j = 0;
            while (j < k - 1) {
                if (arr1.get(i) < arr2.get(j)) {
                    i++;
                } else if (arr1.get(i) > arr2.get(j)) {
                    j++;
                } else {
                    break;
                }
            }
            if (j == k - 1) {
                return arr1.get(i - 1);
            } else if (i == k - 1) {
                return arr2.get(j - 1);
            } else {
                return arr1.get(i - 1) + findKth_Problem_1_f1408c60_c610_46e8_b905_5463123ed9fc(arr1, arr2, j - 1);
            }
        }
    }

    
    public static int findKth_Problem_1_c2e62127_b750_4196_ad1b_0cd165261ed0(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() >= k / 2 ? arr1.get(k / 2 - 1) : Integer.MAX_VALUE;
        int mid2 = arr2.size() >= k / 2 ? arr2.get(k / 2 - 1) : Integer.MAX_VALUE;
        if (mid1 < mid2) {
            return findKth_Problem_1_c2e62127_b750_4196_ad1b_0cd165261ed0(new ArrayList<Integer>(arr1.subList(k / 2, arr1.size())), arr2, k - k / 2);
        } else {
            return findKth_Problem_1_c2e62127_b750_4196_ad1b_0cd165261ed0(arr1, new ArrayList<Integer>(arr2.subList(k / 2, arr2.size())), k - k / 2);
        }
    }

    
    public static int findKth_Problem_2_5d4758d2_6e0c_4248_8746_1849e0e7766c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        int n = arr1.size();
        int m = arr2.size();
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < n && j < m) {
            if (arr1.get( i) < arr2.get( j)) {
                count++;
                if (count == k) {
                    return arr1.get( i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get( j);
                }
                j++;
            }
        }
        while (i < n) {
            count++;
            if (count == k) {
                return arr1.get( i);
            }
            i++;
        }
        while (j < m) {
            count++;
            if (count == k) {
                return arr2.get( j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_1_3131093a_ad34_46b4_a231_bf290ca43946(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k-1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k-1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() >= k/2 ? arr1.get(k/2-1) : Integer.MAX_VALUE;
        int mid2 = arr2.size() >= k/2 ? arr2.get(k/2-1) : Integer.MAX_VALUE;
        if (mid1 < mid2) {
            return findKth_Problem_1_3131093a_ad34_46b4_a231_bf290ca43946(new ArrayList<Integer>(arr1.subList(k/2, arr1.size())), arr2, k - k/2);
        } else {
            return findKth_Problem_1_3131093a_ad34_46b4_a231_bf290ca43946(arr1, new ArrayList<Integer>(arr2.subList(k/2, arr2.size())), k - k/2);
        }
    }

    
    public static int findKth_Problem_1_6a6fb7b1_8346_49da_84af_45db781eb0ec(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() >= k / 2 ? arr1.get(k / 2 - 1) : Integer.MAX_VALUE;
        int mid2 = arr2.size() >= k / 2 ? arr2.get(k / 2 - 1) : Integer.MAX_VALUE;
        if (mid1 < mid2) {
            return findKth_Problem_1_6a6fb7b1_8346_49da_84af_45db781eb0ec(new ArrayList<Integer>(arr1.subList(k / 2, arr1.size())), arr2, k - k / 2);
        } else {
            return findKth_Problem_1_6a6fb7b1_8346_49da_84af_45db781eb0ec(arr1, new ArrayList<Integer>(arr2.subList(k / 2, arr2.size())), k - k / 2);
        }
    }

    
    public static int findKth_Problem_2_28a1eada_e86d_4ed1_8fac_244534784fca(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_0_39ee3e07_9f71_4249_a0fd_99a8d24ef171(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get( i) < arr2.get( j)) {
                if (k == 1) {
                    return arr1.get( i);
                }
                i++;
                k--;
            } else {
                if (k == 1) {
                    return arr2.get( j);
                }
                j++;
                k--;
            }
        }
        if (i == arr1.size()) {
            return arr2.get( (j + k - 1));
        } else {
            return arr1.get( (i + k - 1));
        }
    }

    
    public static int findKth_Problem_2_4c3cc235_89d2_4e79_be64_52fc490642ed(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(Math.min(k/2, arr1.size()) - 1);
        int mid2 = arr2.get(Math.min(k/2, arr2.size()) - 1);
        if (mid1 < mid2) {
            return findKth_Problem_2_4c3cc235_89d2_4e79_be64_52fc490642ed(new ArrayList<Integer>(arr1.subList(Math.min(k/2, arr1.size()), arr1.size())), arr2, k - Math.min(k/2, arr1.size()));
        } else {
            return findKth_Problem_2_4c3cc235_89d2_4e79_be64_52fc490642ed(arr1, new ArrayList<Integer>(arr2.subList(Math.min(k/2, arr2.size()), arr2.size())), k - Math.min(k/2, arr2.size()));
        }
    }

    
    public static int findKth_Problem_2_a2739c01_eea2_4c9f_aa3a_e85c5b7beb53(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int low = arr1.get(0); // initialize low to first element of first array
        int high = arr2.get(arr2.size()-1); // initialize high to last element of second array
        int mid = (low+high)/2; // initialize mid to average of low and high
        int count = 0;
        while(low<=high) {
            count++;
            if(count==k) {
                return mid;
            }
            if(count>k) {
                low++;
            }
            else {
                high--;
            }
        }
        return -1;
    }

    
    public static int findKth_Problem_0_0b98057f_56d9_4242_81be_df4f65c8f0f9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // TODO Auto-generated method stub
        int k1 = arr1.size()-1;
        int k2 = arr2.size()-1;
        int sum = 0;
        int count = 1;
        while (k2 != k1 && k2 != -1) {
            sum = arr1.get(k1) + arr2.get(k2);
            if (sum >= k) {
                k2 = arr2.size()-1;
            } else {
                k1 = arr1.size()-1;
            }
            count++;
        }
        sum = arr1.get(k1) + arr2.get(k2);
        return sum;
    }

    
    public static int findKth_Problem_0_fe9621b1_5f0c_4143_9e78_2257a3d7067a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        while (k > 0) {
            if (i >= arr1.size()) {
                return arr2.get( (j + k - 1));
            }
            if (j >= arr2.size()) {
                return arr1.get( (i + k - 1));
            }
            if (arr1.get( i) < arr2.get( j)) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        return Math.min(arr1.get( i), arr2.get( j));
    }

    
    public static int findKth_Problem_0_534a3f2b_30a5_48b6_bfbe_c3ff00a87f70(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int firstValue = arr1.get(0); 
        int secondValue = arr2.get(0);

        int i = 1;
        while (i <= k) {
            if (arr1.get(i) > firstValue) {
                firstValue = arr1.get(i);
            }
            if (arr2.get(i) > secondValue) {
                secondValue = arr2.get(i);
            }
            i++;
        }
        return firstValue;
    }

    
    public static int findKth_Problem_2_30ffdced_e132_414a_a5cb_901acd9cff92(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int count = 0;
        int i = 0;
        int j = 0;
        while (count < k) {
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
        return arr1.get(i);
    }

    
    public static int findKth_Problem_2_b41755da_db68_4eb2_afde_5e8174db2ce8(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int count = 0;
        int i = 0;
        int j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
                j++;
            }
        }
        return -1;
    }

    
    public static int findKth_Problem_1_da953bb0_0aac_410d_bd43_cc75f9145461(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        int n = arr1.size(), m = arr2.size();
        while(i < n && j < m) {
            if(arr1.get(i) < arr2.get(j)) {
                if(i + j + 1 == k) {
                    return arr1.get(i);
                }
                i++;
            }
            else {
                if(i + j + 1 == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        if(i == n) {
            return arr2.get((k - n));
        }
        else {
            return arr1.get((k - m));
        }
    }

    
    public static int findKth_Problem_1_5254dbf1_4e45_4528_9e35_d30bb16393e0(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_2_e261bde5_860e_482a_898d_749fa592ebc0(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() > arr2.size()) {
            return findKth_Problem_2_e261bde5_860e_482a_898d_749fa592ebc0(arr2, arr1, k);
        }
        int mid = arr1.size() / 2;
        if (arr1.get(mid) > arr2.get(k - mid)) {
            return findKth_Problem_2_e261bde5_860e_482a_898d_749fa592ebc0(new ArrayList<Integer>(arr1.subList(0, mid)), arr2, k);
        } else {
            return findKth_Problem_2_e261bde5_860e_482a_898d_749fa592ebc0(arr1, new ArrayList<Integer>(arr2.subList(0, k - mid)), k - mid);
        }
    }

    
    public static int findKth_Problem_0_39082eda_6159_4576_b69f_d690e6115fbc(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int ans = arr1.get(0);
        int sum = 0;
        int i=1;
        // System.out.println("arr1 " + arr1.get(0));
        // System.out.println("arr2 " + arr2.get(0));
        int max1 = arr1.get(i);
        int max2 = arr2.get(i);

        while(i < arr1.size()) {
            int mid1 = sum + max1;
            int mid2 = sum + max2;

            sum = mid1 + mid2;

            if((sum == k) || (sum == k-1)) {
                return ans;
            }
            else if(sum > k) {
                max2 = max1;
                max1 = arr1.get(i);
                i++;
            }
            else {
                max1 = max2;
                max2 = arr2.get(i);
                i++;
            }
        }
        return ans;
    }

    
    public static int findKth_Problem_1_87aa317a_fe66_48f6_894b_870e7027546f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                if (i + j + 1 == k) return arr1.get(i);
                i++;
            } else {
                if (i + j + 1 == k) return arr2.get(j);
                j++;
            }
        }
        if (i < arr1.size()) return arr1.get( (k - j - 1));
        else return arr2.get( (k - i - 1));
    }

    
    public static int findKth_Problem_0_ce0cd714_dc21_471a_b29d_a47b053abdc3(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (k > n + m) {
            return -1;
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (n == 0) {
            return arr2.get(k - 1);
        }
        if (m == 0) {
            return arr1.get(k - 1);
        }
        int i = Math.min(n, k / 2);
        int j = Math.min(m, k / 2);
        if (arr1.get(i - 1) > arr2.get(j - 1)) {
            return findKth_Problem_0_ce0cd714_dc21_471a_b29d_a47b053abdc3(arr1, new ArrayList<Integer>(arr2.subList(j, m)), k - j);
        } else {
            return findKth_Problem_0_ce0cd714_dc21_471a_b29d_a47b053abdc3(new ArrayList<Integer>(arr1.subList(i, n)), arr2, k - i);
        }
    }

    
    public static int findKth_Problem_1_69d12098_1812_43e7_8e95_3a26fbfb9acc(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get( k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get( k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() > arr2.size()) {
            return findKth_Problem_1_69d12098_1812_43e7_8e95_3a26fbfb9acc(arr2, arr1, k);
        }
        int i =  Math.min(arr1.size(), k / 2);
        int j =  Math.min(arr2.size(), k / 2);
        if (arr1.get(i - 1) > arr2.get(j - 1)) {
            return findKth_Problem_1_69d12098_1812_43e7_8e95_3a26fbfb9acc(arr1, new ArrayList<Integer>(arr2.subList(j, arr2.size())), k - j);
        } else {
            return findKth_Problem_1_69d12098_1812_43e7_8e95_3a26fbfb9acc(new ArrayList<Integer>(arr1.subList(i, arr1.size())), arr2, k - i);
        }
    }

    
    public static int findKth_Problem_1_efc897f3_c9d7_4b9f_826a_4ce58adb3ad5(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int count = 0;
        int i = 0;
        int j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
                j++;
            }
        }
        return -1;
    }

    
    public static int findKth_Problem_1_ff200f58_58b3_4c43_91d6_e543ee42acbc(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 1 && arr2.size() == 1) {
            return Math.max(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_ff200f58_58b3_4c43_91d6_e543ee42acbc(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_1_ff200f58_58b3_4c43_91d6_e543ee42acbc(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_ff200f58_58b3_4c43_91d6_e543ee42acbc(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_1_ff200f58_58b3_4c43_91d6_e543ee42acbc(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_1_c15ab229_3d29_4f5c_8ac6_efe372cd2a41(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 1 && arr2.size() == 1) {
            return Math.max(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                arr2 = new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size()));
                return findKth_Problem_1_c15ab229_3d29_4f5c_8ac6_efe372cd2a41(arr1, arr2, k - mid2 - 1);
            } else {
                arr1 = new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size()));
                return findKth_Problem_1_c15ab229_3d29_4f5c_8ac6_efe372cd2a41(arr1, arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                arr1 = new ArrayList<Integer>(arr1.subList(0, mid1));
                return findKth_Problem_1_c15ab229_3d29_4f5c_8ac6_efe372cd2a41(arr1, arr2, k);
            } else {
                arr2 = new ArrayList<Integer>(arr2.subList(0, mid2));
                return findKth_Problem_1_c15ab229_3d29_4f5c_8ac6_efe372cd2a41(arr1, arr2, k);
            }
        }
    }

    
    public static int findKth_Problem_1_2f425929_9057_46b5_9a6a_10e237b27b38(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int maxIndex1 = 0;
        int maxIndex2 = 0;
        int maxIndex = -1;
        for (int i = 0; i < arr1.size(); i++) {
            if (arr1.get(i) > maxIndex1) {
                maxIndex1 = arr1.get(i);
            }
        }
        for (int j = 0; j < arr2.size(); j++) {
            if (arr2.get(j) > maxIndex2) {
                maxIndex2 = arr2.get(j);
            }
        }
        if (maxIndex1 < maxIndex2) {
            maxIndex = maxIndex1;
        } else {
            maxIndex = maxIndex2;
        }
        int maxArr1Index = arr1.indexOf(maxIndex + 1);
        int maxArr2Index = arr2.indexOf(maxIndex + 1);
        int maxDiff = Math.abs(maxArr1Index - maxArr2Index);
        while (k > maxDiff) {
            maxIndex++;
            maxArr1Index = arr1.indexOf(maxIndex + 1);
            maxArr2Index = arr2.indexOf(maxIndex + 1);
            maxDiff = Math.abs(maxArr1Index - maxArr2Index);
        }
        return maxIndex;
    }

    
    public static int findKth_Problem_2_3be86e4d_1f58_4c1e_a07f_26c5cf7ad399(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int result = 0;
        int l1 = arr1.size();
        int l2 = arr2.size();
        // write your code here
        if(l1>l2){
            for(int i=0;i<l1;i++){
                if((arr1.get(i))<(arr2.get(i))){
                    if(i==0){
                        result = arr1.get(i);
                        break;
                    }
                    else{
                        result = arr2.get(i-1);
                        break;
                    }
                }
                else{
                    if(i==l1-1){
                        result = arr1.get(i);
                        break;
                    }
                    else{
                        result = arr2.get(l1-1);
                        break;
                    }
                }
            }
        }
        else if(l1==l2){
            for(int i=0;i<l1;i++){
                if((arr1.get(i))==(arr2.get(i))){
                    result = arr1.get(i);
                    if(i==0){
                        result = arr2.get(i);
                        break;
                    }
                    else{
                        result = arr1.get(l1-1);
                        break;
                    }
                }
                else{
                    if(i==l1-1){
                        result = arr2.get(i);
                        break;
                    }
                    else{
                        result = arr1.get(l1-1);
                        break;
                    }
                }
            }
        }
        else{
            for(int i=0;i<l1;i++){
                if((arr1.get(i))<(arr2.get(i))){
                    if(i==0){
                        result = arr2.get(i);
                        break;
                    }
                    else{
                        result = arr1.get(i-1);
                        break;
                    }
                }
                else{
                    if(i==l1-1){
                        result = arr1.get(i);
                        break;
                    }
                    else{
                        result = arr2.get(l1-1);
                        break;
                    }
                }
            }
            for(int i=0;i<l2;i++){
                if((arr2.get(i))<(arr1.get(i))){
                    if(i==0){
                        result = arr1.get(i);
                        break;
                    }
                    else{
                        result = arr2.get(l1-1);
                        break;
                    }
                }
                else{
                    if(i==l1-1){
                        result = arr2.get(i);
                        break;
                    }
                    else{
                        result = arr1.get(l1-1);
                        break;
                    }
                }
            }
        }
        return result;
    }

    
    public static int findKth_Problem_2_0a57ce50_632d_45b9_915c_89e2bc1b46d6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1 == null || arr2 == null) {
            System.out.println("Null ArrayLists");
            return 0;
        }
        if (arr1.size() < arr2.size()) {
            System.out.println("ArrayList 1 size is smaller than ArrayList 2");
            return 0;
        }
        int low = 0;
        int high = arr1.size() - 1;
        int mid = 0;
        int mid2 = 0;
        int res = 0;
        int flag = 0;
        if (arr1.size() < 3) {
            if (arr1.size() < arr2.size()) {
                System.out.println("ArrayList 1 size is smaller than ArrayList 2");
                return 0;
            }
        } else if (arr1.size() > arr2.size()) {
            System.out.println("ArrayList 1 size is greater than ArrayList 2");
            return 0;
        }
        while (high >= low) {
            mid = (low + high) / 2;
            mid2 =  (arr1.get(mid) * (arr2.get(mid) / arr1.get(mid)));
            if (mid2 == k)
                return arr1.get(mid);
            if (mid2 > k)
                low = mid + 1;
            else
                high = mid - 1;
        }
        System.out.println("Element not found");
        return 0;
    }

    
    public static int findKth_Problem_1_bd209dbb_74bf_4a96_aec4_75c4e0c100c1(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int count = 0;
        int i = 0;
        int j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
                j++;
            }
        }
        return -1;
    }

    
    public static int findKth_Problem_1_7a471dc1_85cc_45d4_8ad7_b552f9c7ffb6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (k == 1) {
            if (arr1.get(0) < arr2.get(0)) {
                return Math.min(arr1.get(1), arr2.get(0));
            }
            else {
                return Math.min(arr1.get(0), arr2.get(1));
            }
        }
        int k1 = Math.min(k/2, arr1.size()-1);
        int k2 = Math.min(k/2, arr2.size()-1);
        if (arr1.get(k1) < arr2.get(k2)) {
            return findKth_Problem_1_7a471dc1_85cc_45d4_8ad7_b552f9c7ffb6(new ArrayList<Integer>(arr1.subList(k1, arr1.size())), arr2, k-k1);
        }
        else {
            return findKth_Problem_1_7a471dc1_85cc_45d4_8ad7_b552f9c7ffb6(arr1, new ArrayList<Integer>(arr2.subList(k2, arr2.size())), k-k2);
        }
    }

    
    public static int findKth_Problem_2_8f38dc30_326d_4e29_9993_3ac5ba19de82(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int result = -1;
        if (arr1.size() >= arr2.size()) {
            // We don't know the sizes of the two arrays, so we must compare the two arrays.
            int i = 0;
            while (i < arr1.size() && i < arr2.size() && arr1.get(i) < arr2.get(i)) {
                i++;
            }
            if (arr1.size() > arr2.size()) {
                while (i < arr1.size() && arr1.get(i) < k) {
                    i++;
                }
                result = arr1.get(i);
            } else {
                while (i < arr2.size() && arr2.get(i) < k) {
                    i++;
                }
                result = arr2.get(i);
            }
        } else {
            // We don't know the sizes of the two arrays, so we must compare the two arrays.
            int i = 0;
            while (i < arr1.size() && i < arr2.size() && arr1.get(i) < arr2.get(i)) {
                i++;
            }
            if (arr1.size() > arr2.size()) {
                while (i < arr1.size() && arr1.get(i) < k) {
                    i++;
                }
                result = arr1.get(i);
            } else {
                while (i < arr2.size() && arr2.get(i) < k) {
                    i++;
                }
                result = arr2.get(i);
            }
        }
        return result;
    }

    
    public static int findKth_Problem_1_acb0d5e7_a06f_4b9c_a7f9_6bbe8a380f99(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (count < k) {
            if (i >= arr1.size()) {
                j++;
            } else if (j >= arr2.size()) {
                i++;
            } else if (arr1.get( i) < arr2.get( j)) {
                i++;
            } else {
                j++;
            }
            count++;
        }
        if (i >= arr1.size()) {
            return arr2.get( j);
        } else if (j >= arr2.size()) {
            return arr1.get( i);
        } else {
            return Math.min(arr1.get( i), arr2.get( j));
        }
    }

    
    public static int findKth_Problem_0_c4024d56_9358_4bfe_bcd1_0f90241618b7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() * k / (arr1.size() + arr2.size());
        int mid2 = k - mid1 - 1;
        if (arr1.get(mid1) > arr2.get(mid2)) {
            ArrayList<Integer> newArr1 = new ArrayList<Integer>(arr1.subList(0, mid1));
            ArrayList<Integer> newArr2 = new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size()));
            return findKth_Problem_0_c4024d56_9358_4bfe_bcd1_0f90241618b7(newArr1, newArr2, k - mid2 - 1);
        } else {
            ArrayList<Integer> newArr1 = new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size()));
            ArrayList<Integer> newArr2 = new ArrayList<Integer>(arr2.subList(0, mid2));
            return findKth_Problem_0_c4024d56_9358_4bfe_bcd1_0f90241618b7(newArr1, newArr2, k - mid1 - 1);
        }
    }

    
    public static int findKth_Problem_2_2a8ba2bc_92d9_4022_ac96_f6c548347021(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 1 && arr2.size() == 1) {
            return Math.max(arr1.get(0), arr2.get(0));
        }
        int mid1 = Math.ceil((double)arr1.size() / 2);
        int mid2 = Math.ceil((double)arr2.size() / 2);
        if (arr1.get(mid1) < arr2.get(mid2)) {
            if (mid1 + mid2 > k) {
                return findKth_Problem_2_2a8ba2bc_92d9_4022_ac96_f6c548347021(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            } else {
                return findKth_Problem_2_2a8ba2bc_92d9_4022_ac96_f6c548347021(new ArrayList<Integer>(arr1.subList(mid1, arr1.size())), arr2, k - mid1);
            }
        } else {
            if (mid1 + mid2 > k) {
                return findKth_Problem_2_2a8ba2bc_92d9_4022_ac96_f6c548347021(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_2_2a8ba2bc_92d9_4022_ac96_f6c548347021(arr1, new ArrayList<Integer>(arr2.subList(mid2, arr2.size())), k - mid2);
            }
        }
    }

    
    public static int findKth_Problem_2_429813f2_765e_4c96_b45d_15062e87bf39(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        return 0;
    }

    
    public static int findKth_Problem_1_ece4ee1f_4a6c_405a_b6ac_59cd4d8682c6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() >= k / 2 ? arr1.get(k / 2 - 1) : Integer.MAX_VALUE;
        int mid2 = arr2.size() >= k / 2 ? arr2.get(k / 2 - 1) : Integer.MAX_VALUE;
        if (mid1 < mid2) {
            return findKth_Problem_1_ece4ee1f_4a6c_405a_b6ac_59cd4d8682c6(new ArrayList<Integer>(arr1.subList(k / 2, arr1.size())), arr2, k - k / 2);
        } else {
            return findKth_Problem_1_ece4ee1f_4a6c_405a_b6ac_59cd4d8682c6(arr1, new ArrayList<Integer>(arr2.subList(k / 2, arr2.size())), k - k / 2);
        }
    }

    
    public static int findKth_Problem_0_10830d77_3631_473c_8c56_9763422ad9a1(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) return arr2.get(k);
        if (arr2.size() == 0) return arr1.get(k);
        if (k == 0) return Math.min(arr1.get(0), arr2.get(0));
        if (k == arr1.size() + arr2.size() - 1) return Math.max(arr1.get(arr1.size() - 1), arr2.get(arr2.size() - 1));
        int i = Math.min(k / 2, arr1.size() - 1);
        int j = Math.min(k / 2, arr2.size() - 1);
        if (arr1.get(i) < arr2.get(j)) {
            return findKth_Problem_0_10830d77_3631_473c_8c56_9763422ad9a1(new ArrayList<Integer>(arr1.subList(i + 1, arr1.size())), arr2, k - i - 1);
        } else {
            return findKth_Problem_0_10830d77_3631_473c_8c56_9763422ad9a1(arr1, new ArrayList<Integer>(arr2.subList(j + 1, arr2.size())), k - j - 1);
        }
    }

    
    public static int findKth_Problem_0_cfeb2334_ce6a_4927_a547_d3a1c99beff7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        int n = arr1.size(), m = arr2.size();
        while (i < n && j < m) {
            if (arr1.get(i) < arr2.get(j)) {
                if (i + j + 1 == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                if (i + j + 1 == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        if (i < n) {
            return arr1.get((k - m - 1));
        }
        return arr2.get((k - n - 1));
    }

    
    public static int findKth_Problem_2_ece4ee1f_4a6c_405a_b6ac_59cd4d8682c6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() >= k / 2 ? arr1.get(k / 2 - 1) : Integer.MAX_VALUE;
        int mid2 = arr2.size() >= k / 2 ? arr2.get(k / 2 - 1) : Integer.MAX_VALUE;
        if (mid1 < mid2) {
            return findKth_Problem_2_ece4ee1f_4a6c_405a_b6ac_59cd4d8682c6(new ArrayList<Integer>(arr1.subList(k / 2, arr1.size())), arr2, k - k / 2);
        } else {
            return findKth_Problem_2_ece4ee1f_4a6c_405a_b6ac_59cd4d8682c6(arr1, new ArrayList<Integer>(arr2.subList(k / 2, arr2.size())), k - k / 2);
        }
    }

    
    public static int findKth_Problem_1_ef482285_1375_4b46_aca3_0c6ee414bb7d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int m = arr1.size();
        int n = arr2.size();
        
        int l = arr1.get(0),r = arr2.get(0);
        
        int mid = l + r + 1;
        
        int lDiff = l - mid;
        int rDiff = r - mid;
        
        if(lDiff <= rDiff) {
            while(k >= 0 && r > mid && lDiff <= rDiff) {
                l++;
                lDiff++;
                k--;
            }
        } else {
            while(k >= 0 && r > mid && rDiff <= lDiff) {
                r--;
                rDiff--;
                k--;
            }
        }
        
        return mid;
    }

    
    public static int findKth_Problem_1_10830d77_3631_473c_8c56_9763422ad9a1(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) return arr2.get(k);
        if (arr2.size() == 0) return arr1.get(k);
        if (k == 0) return Math.min(arr1.get(0), arr2.get(0));
        if (k == arr1.size() + arr2.size() - 1) return Math.max(arr1.get(arr1.size() - 1), arr2.get(arr2.size() - 1));
        int i = Math.min(k / 2, arr1.size() - 1);
        int j = Math.min(k / 2, arr2.size() - 1);
        if (arr1.get(i) < arr2.get(j)) {
            return findKth_Problem_1_10830d77_3631_473c_8c56_9763422ad9a1(new ArrayList<Integer>(arr1.subList(i + 1, arr1.size())), arr2, k - i - 1);
        } else {
            return findKth_Problem_1_10830d77_3631_473c_8c56_9763422ad9a1(arr1, new ArrayList<Integer>(arr2.subList(j + 1, arr2.size())), k - j - 1);
        }
    }

    
    public static int findKth_Problem_0_59b84a6d_13cb_4314_80c3_af1c07bdde7d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(Math.min(k/2, arr1.size() - 1));
        int mid2 = arr2.get(Math.min(k/2, arr2.size() - 1));
        if (mid1 < mid2) {
            return findKth_Problem_0_59b84a6d_13cb_4314_80c3_af1c07bdde7d(new ArrayList<Integer>(arr1.subList(Math.min(k/2, arr1.size() - 1), arr1.size())), arr2, k - Math.min(k/2, arr1.size()));
        } else {
            return findKth_Problem_0_59b84a6d_13cb_4314_80c3_af1c07bdde7d(arr1, new ArrayList<Integer>(arr2.subList(Math.min(k/2, arr2.size() - 1), arr2.size())), k - Math.min(k/2, arr2.size()));
        }
    }

    
    public static int findKth_Problem_0_03ca634e_d177_46d5_9d34_e6f28b5a3de2(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(Math.min(k/2, arr1.size() - 1));
        int mid2 = arr2.get(Math.min(k/2, arr2.size() - 1));
        if (mid1 < mid2) {
            return findKth_Problem_0_03ca634e_d177_46d5_9d34_e6f28b5a3de2(new ArrayList<Integer>(arr1.subList(Math.min(k/2, arr1.size() - 1), arr1.size())), arr2, k - Math.min(k/2, arr1.size() - 1));
        } else {
            return findKth_Problem_0_03ca634e_d177_46d5_9d34_e6f28b5a3de2(arr1, new ArrayList<Integer>(arr2.subList(Math.min(k/2, arr2.size() - 1), arr2.size())), k - Math.min(k/2, arr2.size() - 1));
        }
    }

    
    public static int findKth_Problem_1_caeaa497_d132_4e87_956f_28dadf449112(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int min = arr1.get(0);
        int max = arr2.get(0);
        int result = min + max;

        if (result == k) {
            return min;
        } else if (result > k) {
            min = arr1.get(1);
            max = arr2.get(1);
            result = min + max;

            if (result == k) {
                return min;
            } else if (result > k) {
                min = arr1.get(2);
                max = arr2.get(2);
                result = min + max;

                if (result == k) {
                    return min;
                }
            }
        }
        return max;
    }

    
    public static int findKth_Problem_1_6e5227ad_2f25_4cf1_8c8b_ab9c0ec21646(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_2_b1e6eccb_bdad_41ec_8cb1_4681c2b5e009(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get( i) <= arr2.get( j)) {
                if (count == k) {
                    return arr1.get( i);
                }
                i++;
                count++;
            } else {
                if (count == k) {
                    return arr2.get( j);
                }
                j++;
                count++;
            }
        }
        while (i < arr1.size()) {
            if (count == k) {
                return arr1.get( i);
            }
            i++;
            count++;
        }
        while (j < arr2.size()) {
            if (count == k) {
                return arr2.get( j);
            }
            j++;
            count++;
        }
        return -1;
    }

    
    public static int findKth_Problem_2_bf55a5f8_d525_445b_8a95_44f4b95934bd(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get( k);
        }
        if (arr2.size() == 0) {
            return arr1.get( k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get( mid1) > arr2.get( mid2)) {
                return findKth_Problem_2_bf55a5f8_d525_445b_8a95_44f4b95934bd(arr1, new ArrayList<Integer>(arr2.subList( mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_2_bf55a5f8_d525_445b_8a95_44f4b95934bd(new ArrayList<Integer>(arr1.subList( mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get( mid1) > arr2.get( mid2)) {
                return findKth_Problem_2_bf55a5f8_d525_445b_8a95_44f4b95934bd(new ArrayList<Integer>(arr1.subList(0,  mid1)), arr2, k);
            } else {
                return findKth_Problem_2_bf55a5f8_d525_445b_8a95_44f4b95934bd(arr1, new ArrayList<Integer>(arr2.subList(0,  mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_0_3be86e4d_1f58_4c1e_a07f_26c5cf7ad399(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int result = 0;
        int l1 = arr1.size();
        int l2 = arr2.size();
        // write your code here
        if(l1>l2){
            for(int i=0;i<l1;i++){
                if((arr1.get(i))<(arr2.get(i))){
                    if(i==0){
                        result = arr1.get(i);
                        break;
                    }
                    else{
                        result = arr2.get(i-1);
                        break;
                    }
                }
                else{
                    if(i==l1-1){
                        result = arr1.get(i);
                        break;
                    }
                    else{
                        result = arr2.get(l1-1);
                        break;
                    }
                }
            }
        }
        else if(l1==l2){
            for(int i=0;i<l1;i++){
                if((arr1.get(i))==(arr2.get(i))){
                    result = arr1.get(i);
                    if(i==0){
                        result = arr2.get(i);
                        break;
                    }
                    else{
                        result = arr1.get(l1-1);
                        break;
                    }
                }
                else{
                    if(i==l1-1){
                        result = arr2.get(i);
                        break;
                    }
                    else{
                        result = arr1.get(l1-1);
                        break;
                    }
                }
            }
        }
        else{
            for(int i=0;i<l1;i++){
                if((arr1.get(i))<(arr2.get(i))){
                    if(i==0){
                        result = arr2.get(i);
                        break;
                    }
                    else{
                        result = arr1.get(i-1);
                        break;
                    }
                }
                else{
                    if(i==l1-1){
                        result = arr1.get(i);
                        break;
                    }
                    else{
                        result = arr2.get(l1-1);
                        break;
                    }
                }
            }
            for(int i=0;i<l2;i++){
                if((arr2.get(i))<(arr1.get(i))){
                    if(i==0){
                        result = arr1.get(i);
                        break;
                    }
                    else{
                        result = arr2.get(l1-1);
                        break;
                    }
                }
                else{
                    if(i==l1-1){
                        result = arr2.get(i);
                        break;
                    }
                    else{
                        result = arr1.get(l1-1);
                        break;
                    }
                }
            }
        }
        return result;
    }

    
    public static int findKth_Problem_2_517179c6_5369_46a5_a178_920546d18446(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 1 && arr2.size() == 1) {
            return Math.max(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_517179c6_5369_46a5_a178_920546d18446(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_2_517179c6_5369_46a5_a178_920546d18446(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_517179c6_5369_46a5_a178_920546d18446(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_2_517179c6_5369_46a5_a178_920546d18446(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_2_3a1fbb5b_9b07_4a91_a320_426fcfd3ce5c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        while (k > 0) {
            if (i < arr1.size() && j < arr2.size()) {
                if (arr1.get(i) < arr2.get(j)) {
                    i++;
                } else {
                    j++;
                }
            } else if (i < arr1.size()) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        if (i < arr1.size() && j < arr2.size()) {
            return Math.min(arr1.get(i), arr2.get(j));
        } else if (i < arr1.size()) {
            return arr1.get(i);
        } else {
            return arr2.get(j);
        }
    }

    
    public static int findKth_Problem_0_bd9aa0c9_77f6_44a7_b0c8_3be769d766a7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int l1 = arr1.get(arr1.size()-1);
        int l2 = arr2.get(arr2.size()-1);
        if(k <= l1 || k >= l2)
            return -1;
        else if(k == l1)
            return arr2.get(arr2.size()-1);
        else if(k == l2)
            return arr1.get(arr1.size()-1);
        else if(k <= (l1+l2)/2)
            return findKth_Problem_0_bd9aa0c9_77f6_44a7_b0c8_3be769d766a7(arr1, arr2, k/2);
        else
            return findKth_Problem_0_bd9aa0c9_77f6_44a7_b0c8_3be769d766a7(arr2, arr1, k/2);
    }

    
    public static int findKth_Problem_0_4c3cc235_89d2_4e79_be64_52fc490642ed(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(Math.min(k/2, arr1.size()) - 1);
        int mid2 = arr2.get(Math.min(k/2, arr2.size()) - 1);
        if (mid1 < mid2) {
            return findKth_Problem_0_4c3cc235_89d2_4e79_be64_52fc490642ed(new ArrayList<Integer>(arr1.subList(Math.min(k/2, arr1.size()), arr1.size())), arr2, k - Math.min(k/2, arr1.size()));
        } else {
            return findKth_Problem_0_4c3cc235_89d2_4e79_be64_52fc490642ed(arr1, new ArrayList<Integer>(arr2.subList(Math.min(k/2, arr2.size()), arr2.size())), k - Math.min(k/2, arr2.size()));
        }
    }

    
    public static int findKth_Problem_2_da9a6695_c586_4bb7_b866_fa150a4be9c0(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_da9a6695_c586_4bb7_b866_fa150a4be9c0(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_2_da9a6695_c586_4bb7_b866_fa150a4be9c0(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_da9a6695_c586_4bb7_b866_fa150a4be9c0(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_2_da9a6695_c586_4bb7_b866_fa150a4be9c0(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_1_c051a651_105e_448d_b171_846d973fd033(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int res = -1;
        if (k == arr1.size()) return arr2.get(0);
        if (k == arr2.size()) return arr1.get(0);
        int i = 0;
        while (arr1.size() > 0 && arr2.size() > 0 && i < k) {
            if (arr1.get(arr1.size() - 1) <= arr2.get(arr2.size() - 1)) {
                if (res == -1) return arr1.get(arr1.size() - 1);
                else
                    res = arr1.get(arr1.size() - 1);
                arr1.remove(arr1.size() - 1);
            } else {
                if (res == -1) return arr2.get(arr2.size() - 1);
                else
                    res = arr2.get(arr2.size() - 1);
                arr2.remove(arr2.size() - 1);
            }
            i++;
        }
        return res;
    }

    
    public static int findKth_Problem_1_8896c322_c3a6_4638_ab4b_0d3956f534ff(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(arr1.size()==0 || arr2.size()==0)
            return -1L;

        int l1 = arr1.get(arr1.size()-1);
        int l2 = arr2.get(arr2.size()-1);
        if(k==1)
        {
            if(l1>l2)
                return l1; // if k is 1 then find first element from both array
            else if(l1>l2)
                return l2; // if k is 1 then find first element from both array
            else
                return -1L; // if k is 1 then find first element from both array
        }

        if(k>1 && k%2==0)
        {
            int temp = findKth_Problem_1_8896c322_c3a6_4638_ab4b_0d3956f534ff(arr1, arr2, k/2);
            if(temp==-1L)
                return -1L;
            else if(temp>l1 && temp>l2)
                return temp;
            else if(temp>l1)
                return l1;
            else
                return l2;
        }
        else if(k>1 && k%2!=0)
        {
            int temp = findKth_Problem_1_8896c322_c3a6_4638_ab4b_0d3956f534ff(arr2, arr1, k/2);
            if(temp==-1L)
                return -1L;
            else if(temp>l1 && temp>l2)
                return temp;
            else if(temp>l1)
                return l1;
            else
                return l2;
        }
        else
        {
            if(arr1.size()==1 && arr2.size()==1)
            {
                if(l1==l2)
                    return l1;
                else
                    return l2;
            }
            else
            {
                for(int i=arr1.size()-1;i>=0;i--)
                {
                    int c1 = arr1.get(i);
                    for(int j=arr2.size()-1;j>=0;j--)
                    {
                        int c2 = arr2.get(j);
                        if(c1>c2)
                        {
                            result.add(c1);
                            result.add(c2);
                            if(i==arr1.size()-1 && j==arr2.size()-1)
                            {
                                return result.get(result.size()-1);
                            }
                        }
                        else if(c1<c2)
                        {
                            result.add(c2);
                            result.add(c1);
                            if(i==arr1.size()-1 && j==arr2.size()-1)
                            {
                                return result.get(result.size()-1);
                            }
                        }
                    }
                }
                return -1L;
            }
        }
    }

    
    public static int findKth_Problem_0_c7aec5b7_dc3a_4105_9bd0_6eb1a4d02500(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        while (k > 0) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        return Math.min(arr1.get(i), arr2.get(j));
    }

    
    public static int findKth_Problem_1_ac131d76_198d_468c_8557_7dfe2a27f293(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int ans = 0;
        int min = arr1.get(0), max = arr1.get(arr1.size()-1);
        int size1 = arr1.size();
        int size2 = arr2.size();
        while (ans < k) {
            if (min == max) {
                ans += 1;
                min += 1;
            }
            else {
                int mid = (min + max)/2;
                if (k - mid == 0)
                    ans = mid - 1;
                else if (k - mid < 0)
                    ans = mid + 1;
                else
                    ans = findKth_Problem_1_ac131d76_198d_468c_8557_7dfe2a27f293(arr1, arr2, k - mid);
            }
            min = arr1.get(size1 - 1);
            max = arr1.get(0);
        }
        return ans;
    }

    
    public static int findKth_Problem_1_39082eda_6159_4576_b69f_d690e6115fbc(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int ans = arr1.get(0);
        int sum = 0;
        int i=1;
        // System.out.println("arr1 " + arr1.get(0));
        // System.out.println("arr2 " + arr2.get(0));
        int max1 = arr1.get(i);
        int max2 = arr2.get(i);

        while(i < arr1.size()) {
            int mid1 = sum + max1;
            int mid2 = sum + max2;

            sum = mid1 + mid2;

            if((sum == k) || (sum == k-1)) {
                return ans;
            }
            else if(sum > k) {
                max2 = max1;
                max1 = arr1.get(i);
                i++;
            }
            else {
                max1 = max2;
                max2 = arr2.get(i);
                i++;
            }
        }
        return ans;
    }

    
    public static int findKth_Problem_0_da953bb0_0aac_410d_bd43_cc75f9145461(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        int n = arr1.size(), m = arr2.size();
        while(i < n && j < m) {
            if(arr1.get(i) < arr2.get(j)) {
                if(i + j + 1 == k) {
                    return arr1.get(i);
                }
                i++;
            }
            else {
                if(i + j + 1 == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        if(i == n) {
            return arr2.get((k - n));
        }
        else {
            return arr1.get((k - m));
        }
    }

    
    public static int findKth_Problem_2_f8b5bb6c_1784_4a6d_9aa0_133a8fb398a2(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1 == null || arr2 == null || k <= 0 || arr1.size() == 0 || arr2.size() == 0)
            return 0;
        int firstElem = arr1.get(0);
        int secondElem = arr2.get(0);
        if (firstElem != secondElem && k <= (firstElem + secondElem)) {
            return firstElem;
        }
        ArrayList<Integer> temp1 = new ArrayList<Integer>();
        ArrayList<Integer> temp2 = new ArrayList<Integer>();
        int currentVal = firstElem;
        while (currentVal <= arr2.get(arr2.size() - 1)) {
            if (k == currentVal) {
                temp1.add(currentVal);
            }
            currentVal++;
        }
        currentVal = firstElem;
        while (currentVal <= arr1.get(arr1.size() - 1)) {
            if (k == currentVal) {
                temp2.add(currentVal);
            }
            currentVal++;
        }
        if (temp1.size() > temp2.size()) {
            temp1.removeAll(new ArrayList<Integer>(temp2));
            System.out.println(temp1.toString());
        } else {
            temp2.removeAll(new ArrayList<Integer>(temp1));
            System.out.println(temp2.toString());
        }
        return currentVal;
    }

    
    public static int findKth_Problem_1_bd9aa0c9_77f6_44a7_b0c8_3be769d766a7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int l1 = arr1.get(arr1.size()-1);
        int l2 = arr2.get(arr2.size()-1);
        if(k <= l1 || k >= l2)
            return -1;
        else if(k == l1)
            return arr2.get(arr2.size()-1);
        else if(k == l2)
            return arr1.get(arr1.size()-1);
        else if(k <= (l1+l2)/2)
            return findKth_Problem_1_bd9aa0c9_77f6_44a7_b0c8_3be769d766a7(arr1, arr2, k/2);
        else
            return findKth_Problem_1_bd9aa0c9_77f6_44a7_b0c8_3be769d766a7(arr2, arr1, k/2);
    }

    
    public static int findKth_Problem_1_2c521b8f_1bf7_4987_b678_75d09ebd8290(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int sum = 0;
        if (arr1.size() > arr2.size()) {
            for (int i = 0; i < arr2.size(); i++) {
                if (arr1.get(i) >= arr2.get(i))
                    sum += arr2.get(i);
                else
                    sum += arr1.get(i);
            }
            return sum % k;
        }
        else {
            for (int i = 0; i < arr1.size(); i++) {
                if (arr1.get(i) > arr2.get(i))
                    sum += arr1.get(i);
                else
                    sum += arr2.get(i);
            }
            return sum % k;
        }
    }

    
    public static int findKth_Problem_1_d181ce19_34ec_4785_9fee_23b31cce6d78(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        while (k > 0) {
            if (i < arr1.size() && j < arr2.size()) {
                if (arr1.get( i) < arr2.get( j)) {
                    i++;
                } else {
                    j++;
                }
            } else if (i < arr1.size()) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        if (i < arr1.size() && j < arr2.size()) {
            return Math.min(arr1.get( i), arr2.get( j));
        } else if (i < arr1.size()) {
            return arr1.get( i);
        } else {
            return arr2.get( j);
        }
    }

    
    public static int findKth_Problem_1_fd41b0af_cb96_495b_a589_6f795c29bc5a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) return arr2.get(k);
        if (arr2.size() == 0) return arr1.get(k);
        if (k == 0) return Math.min(arr1.get(0), arr2.get(0));
        if (arr1.size() == 1 && arr2.size() == 1) return Math.max(arr1.get(0), arr2.get(0));
        if (arr1.size() == 1) {
            if (arr1.get(0) < arr2.get(k - 1)) return arr2.get(k - 1);
            if (arr1.get(0) > arr2.get(k)) return arr2.get(k);
            return arr1.get(0);
        }
        if (arr2.size() == 1) {
            if (arr2.get(0) < arr1.get(k - 1)) return arr1.get(k - 1);
            if (arr2.get(0) > arr1.get(k)) return arr1.get(k);
            return arr2.get(0);
        }
        int m1 = arr1.get(k / 2);
        int m2 = arr2.get(k / 2);
        if (m1 < m2) {
            return findKth_Problem_1_fd41b0af_cb96_495b_a589_6f795c29bc5a(new ArrayList<Integer>(arr1.subList(k / 2, arr1.size())), arr2, k - k / 2);
        } else {
            return findKth_Problem_1_fd41b0af_cb96_495b_a589_6f795c29bc5a(arr1, new ArrayList<Integer>(arr2.subList(k / 2, arr2.size())), k - k / 2);
        }
    }

    
    public static int findKth_Problem_0_0011f485_8be0_4ada_9b11_c907e18c9b11(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (k == 1) {
            return Math.max(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (arr1.get(0) < arr2.get(0)) {
            arr1.remove(0);
            return findKth_Problem_0_0011f485_8be0_4ada_9b11_c907e18c9b11(arr1, arr2, k - 1);
        } else {
            arr2.remove(0);
            return findKth_Problem_0_0011f485_8be0_4ada_9b11_c907e18c9b11(arr1, arr2, k - 1);
        }
    }

    
    public static int findKth_Problem_0_93827ce6_889f_49ef_b738_c226c0f63560(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int res = 0;
        for(int i = 0; i < k; i++) {
            if(arr1.get(i) > arr2.get(i))
                return res + 1;
            else
                res = (res + arr1.get(i)) + arr2.get(i);
        }
        return res;
    }

    
    public static int findKth_Problem_2_58fd0016_9ec3_4068_acdf_b7e71652f9b3(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Your code goes here
        int x = arr1.get(0); 
        int y = 0;
        for(int i = 1; i < arr2.size(); i++){
            if(arr2.get(i) == x){
                y = i-1;
            }
        }
        if(arr2.get(y) < k){
            return arr2.get(y);
        }
        else{
            return arr2.get(y+1);
        }
    }

    
    public static int findKth_Problem_0_ef3fa9f4_5f02_4307_9179_5887c4b3c796(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        int n = arr1.size();
        int m = arr2.size();
        int i = 0;
        int j = 0;
        while (i < n && j < m && k > 0) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        if (i == n) {
            return arr2.get( (k - 1));
        } else if (j == m) {
            return arr1.get( (k - 1));
        } else {
            return Math.min(arr1.get(i), arr2.get(j));
        }
    }

    
    public static int findKth_Problem_0_30ffdced_e132_414a_a5cb_901acd9cff92(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int count = 0;
        int i = 0;
        int j = 0;
        while (count < k) {
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
        return arr1.get(i);
    }

    
    public static int findKth_Problem_1_39ee3e07_9f71_4249_a0fd_99a8d24ef171(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get( i) < arr2.get( j)) {
                if (k == 1) {
                    return arr1.get( i);
                }
                i++;
                k--;
            } else {
                if (k == 1) {
                    return arr2.get( j);
                }
                j++;
                k--;
            }
        }
        if (i == arr1.size()) {
            return arr2.get( (j + k - 1));
        } else {
            return arr1.get( (i + k - 1));
        }
    }

    
    public static int findKth_Problem_1_fec2c8de_109c_48df_a1d6_64d895e616be(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int result=0;
        for(int i=0;i<arr1.size();i++) {
            if(arr1.get(i)<arr2.get(i)) {
                result+=arr1.get(i);
                arr1.remove(arr1.get(i));
                arr2.remove(arr2.get(i));
            }
        }
        int total=0;
        for(int i=0;i<arr1.size();i++) {
            total+=arr1.get(i);
        }
        return total+result+k;
    }

    
    public static int findKth_Problem_2_2ecf9b90_edbb_432e_9a40_90a6ceeed618(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int low = arr1.get(0); // initialize low to first element of first array
        int high = arr2.get(arr2.size()-1); // initialize high to last element of second array
        int mid = (low+high)/2;
        int count = 0;
        while(low<=high){
            count++;
            if(count==k){
                return mid;
            }
            if(count>k){
                high = arr2.get(arr2.size()-1);
            }
            else if(count<k){
                low = arr1.get(0); // initialize low to first element of first array
            }
            mid = (low+high)/2;
        }
        return -1;
    }

    
    public static int findKth_Problem_2_9a2e175d_faaf_40da_8637_a786b87a597b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = Math.min(k/2, arr1.size() - 1);
        int mid2 = Math.min(k/2, arr2.size() - 1);
        if (arr1.get(mid1) < arr2.get(mid2)) {
            return findKth_Problem_2_9a2e175d_faaf_40da_8637_a786b87a597b(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
        } else {
            return findKth_Problem_2_9a2e175d_faaf_40da_8637_a786b87a597b(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
        }
    }

    
    public static int findKth_Problem_1_c7aec5b7_dc3a_4105_9bd0_6eb1a4d02500(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        while (k > 0) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        return Math.min(arr1.get(i), arr2.get(j));
    }

    
    public static int findKth_Problem_1_e70f9632_3596_42b2_90d7_69032ba662bf(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) return arr2.get(k - 1);
        if (arr2.size() == 0) return arr1.get(k - 1);
        if (k == 1) return Math.min(arr1.get(0), arr2.get(0));
        int mid1 = (arr1.size() >= k/2) ? arr1.get(k/2 - 1) : Integer.MAX_VALUE;
        int mid2 = (arr2.size() >= k/2) ? arr2.get(k/2 - 1) : Integer.MAX_VALUE;
        if (mid1 < mid2) {
            return findKth_Problem_1_e70f9632_3596_42b2_90d7_69032ba662bf(new ArrayList<Integer>(arr1.subList(k/2, arr1.size())), arr2, k - k/2);
        } else {
            return findKth_Problem_1_e70f9632_3596_42b2_90d7_69032ba662bf(arr1, new ArrayList<Integer>(arr2.subList(k/2, arr2.size())), k - k/2);
        }
    }

    
    public static int findKth_Problem_2_6453d333_eb81_46fd_8c16_918c252bbd24(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get( k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get( k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() >= k / 2 ? arr1.get( k / 2 - 1) : Integer.MAX_VALUE;
        int mid2 = arr2.size() >= k / 2 ? arr2.get( k / 2 - 1) : Integer.MAX_VALUE;
        if (mid1 < mid2) {
            return findKth_Problem_2_6453d333_eb81_46fd_8c16_918c252bbd24(new ArrayList<Integer>(arr1.subList( k / 2, arr1.size())), arr2, k - k / 2);
        } else {
            return findKth_Problem_2_6453d333_eb81_46fd_8c16_918c252bbd24(arr1, new ArrayList<Integer>(arr2.subList( k / 2, arr2.size())), k - k / 2);
        }
    }

    
    public static int findKth_Problem_2_a9e82594_511c_43a7_891c_5a2282075a1c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        return 0;
    }

    
    public static int findKth_Problem_1_ef43bfc7_db2f_486e_afbc_f2e0333941ad(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() >= k / 2 ? arr1.get(k / 2 - 1) : Integer.MAX_VALUE;
        int mid2 = arr2.size() >= k / 2 ? arr2.get(k / 2 - 1) : Integer.MAX_VALUE;
        if (mid1 < mid2) {
            return findKth_Problem_1_ef43bfc7_db2f_486e_afbc_f2e0333941ad(new ArrayList<Integer>(arr1.subList(k / 2, arr1.size())), arr2, k - k / 2);
        } else {
            return findKth_Problem_1_ef43bfc7_db2f_486e_afbc_f2e0333941ad(arr1, new ArrayList<Integer>(arr2.subList(k / 2, arr2.size())), k - k / 2);
        }
    }

    
    public static int findKth_Problem_1_da9a6695_c586_4bb7_b866_fa150a4be9c0(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_da9a6695_c586_4bb7_b866_fa150a4be9c0(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_1_da9a6695_c586_4bb7_b866_fa150a4be9c0(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_da9a6695_c586_4bb7_b866_fa150a4be9c0(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_1_da9a6695_c586_4bb7_b866_fa150a4be9c0(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_1_8f38dc30_326d_4e29_9993_3ac5ba19de82(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int result = -1;
        if (arr1.size() >= arr2.size()) {
            // We don't know the sizes of the two arrays, so we must compare the two arrays.
            int i = 0;
            while (i < arr1.size() && i < arr2.size() && arr1.get(i) < arr2.get(i)) {
                i++;
            }
            if (arr1.size() > arr2.size()) {
                while (i < arr1.size() && arr1.get(i) < k) {
                    i++;
                }
                result = arr1.get(i);
            } else {
                while (i < arr2.size() && arr2.get(i) < k) {
                    i++;
                }
                result = arr2.get(i);
            }
        } else {
            // We don't know the sizes of the two arrays, so we must compare the two arrays.
            int i = 0;
            while (i < arr1.size() && i < arr2.size() && arr1.get(i) < arr2.get(i)) {
                i++;
            }
            if (arr1.size() > arr2.size()) {
                while (i < arr1.size() && arr1.get(i) < k) {
                    i++;
                }
                result = arr1.get(i);
            } else {
                while (i < arr2.size() && arr2.get(i) < k) {
                    i++;
                }
                result = arr2.get(i);
            }
        }
        return result;
    }

    
    public static int findKth_Problem_0_4afe2e96_ad68_46d5_a8fb_5b3d766d4de1(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int kth = 0;
        int prev = -99999999;
        for (int i = 0; i < arr1.size(); i++) {
            if (prev <= arr1.get(i)) {
                kth = arr1.get(i);
            }
            prev = arr2.get(i);
        }
        return kth;
    }

    
    public static int findKth_Problem_1_e5fe3832_65b1_4a26_b630_81f4b0e701b4(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (k > arr1.size() + arr2.size()) {
            return -1;
        }
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = Math.min(k / 2, arr1.size());
        int mid2 = Math.min(k / 2, arr2.size());
        if (arr1.get(mid1 - 1) < arr2.get(mid2 - 1)) {
            return findKth_Problem_1_e5fe3832_65b1_4a26_b630_81f4b0e701b4(new ArrayList<Integer>(arr1.subList(mid1, arr1.size())), arr2, k - mid1);
        } else {
            return findKth_Problem_1_e5fe3832_65b1_4a26_b630_81f4b0e701b4(arr1, new ArrayList<Integer>(arr2.subList(mid2, arr2.size())), k - mid2);
        }
    }

    
    public static int findKth_Problem_0_802799ee_27a3_4c6f_945e_a8cf842fe256(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int low = arr1.get(0); // low is the first element of arr1
        int high = arr1.get(arr1.size() - 1); // high is the last element of arr1
        int mid = low + (high - low) / 2; // mid is mid element of arr1
        int mid1 = arr2.get(0); // mid1 is the first element of arr2
        int mid2 = arr2.get(arr2.size() - 1); // mid2 is the last element of arr2
        while (k >= mid) {
            if (k < mid) {
                if (mid2 > mid) { // if mid2 is greater than mid
                    high = mid;
                } else {
                    low = mid;
                    mid = low + (high - low) / 2; // mid is mid element of arr1
                }
            } else if (k > mid) {
                if (mid1 > mid) { // if mid1 is greater than mid
                    low = mid;
                } else {
                    high = mid;
                    mid = low + (high - low) / 2; // mid is mid element of arr1
                }
            } else {
                return mid1;
            }
        }
        return mid2;
    }

    
    public static int findKth_Problem_1_f1cd36f9_1c4c_4f47_bc5e_430399abd47e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
                count++;
            } else {
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
                count++;
            }
        }
        while (i < arr1.size()) {
            if (count == k) {
                return arr1.get(i);
            }
            i++;
            count++;
        }
        while (j < arr2.size()) {
            if (count == k) {
                return arr2.get(j);
            }
            j++;
            count++;
        }
        return -1;
    }

    
    public static int findKth_Problem_1_fe9621b1_5f0c_4143_9e78_2257a3d7067a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        while (k > 0) {
            if (i >= arr1.size()) {
                return arr2.get( (j + k - 1));
            }
            if (j >= arr2.size()) {
                return arr1.get( (i + k - 1));
            }
            if (arr1.get( i) < arr2.get( j)) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        return Math.min(arr1.get( i), arr2.get( j));
    }

    
    public static int findKth_Problem_2_b5f002e0_3d9f_4d96_99e6_0b31b7a74240(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get( i) < arr2.get( j)) {
                count++;
                if (count == k) {
                    return arr1.get( i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get( j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get( i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get( j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_0_b15da6bc_c563_4676_9039_6ff8b8e25afc(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_b15da6bc_c563_4676_9039_6ff8b8e25afc(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_0_b15da6bc_c563_4676_9039_6ff8b8e25afc(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_b15da6bc_c563_4676_9039_6ff8b8e25afc(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_0_b15da6bc_c563_4676_9039_6ff8b8e25afc(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_2_9b1f73ab_1904_40ca_9fc5_bf359469c1f0(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_1_67dcdc9a_2928_4611_8c01_71fe2f92b94f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get( (k - 1));
        }
        if (arr2.size() == 0) {
            return arr1.get( (k - 1));
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int a = arr1.get( Math.min(k / 2, arr1.size()) - 1);
        int b = arr2.get( Math.min(k / 2, arr2.size()) - 1);
        if (a < b) {
            return findKth_Problem_1_67dcdc9a_2928_4611_8c01_71fe2f92b94f(new ArrayList<Integer>(arr1.subList( Math.min(k / 2, arr1.size()), arr1.size())), arr2, k - Math.min(k / 2, arr1.size()));
        } else {
            return findKth_Problem_1_67dcdc9a_2928_4611_8c01_71fe2f92b94f(arr1, new ArrayList<Integer>(arr2.subList( Math.min(k / 2, arr2.size()), arr2.size())), k - Math.min(k / 2, arr2.size()));
        }
    }

    
    public static int findKth_Problem_2_f1408c60_c610_46e8_b905_5463123ed9fc(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int k1 = arr1.get(0);
        int k2 = arr2.get(0);
        if (k1 > k2) {
            int t = k1;
            k1 = k2;
            k2 = t;
        }
        int max1 = arr1.get(arr1.size() - 1);
        int max2 = arr2.get(arr2.size() - 1);
        if (max1 < max2) {
            return k1;
        } else if (max1 > max2) {
            return k2;
        } else {
            int i = 0;
            int j = 0;
            while (j < k - 1) {
                if (arr1.get(i) < arr2.get(j)) {
                    i++;
                } else if (arr1.get(i) > arr2.get(j)) {
                    j++;
                } else {
                    break;
                }
            }
            if (j == k - 1) {
                return arr1.get(i - 1);
            } else if (i == k - 1) {
                return arr2.get(j - 1);
            } else {
                return arr1.get(i - 1) + findKth_Problem_2_f1408c60_c610_46e8_b905_5463123ed9fc(arr1, arr2, j - 1);
            }
        }
    }

    
    public static int findKth_Problem_1_90162c15_5ddc_4934_992b_3fd558310b63(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (k == 0 || k > arr1.size() || arr2.size() == 0 || arr2.size() < k) {
            return -1;
        }
        int firstElem = arr1.get(0);
        int secondElem = arr2.get(0);
        int diff = secondElem - firstElem;
        if (diff > arr1.get(arr1.size() - 1)) {
            secondElem = arr1.get(arr1.size() - 1);
            diff = secondElem - firstElem;
        }
        int index = -1;
        if (diff == 0) {
            int count = 0;
            for (int i = 0; i < arr2.size(); i++) {
                if (secondElem == arr2.get(i)) {
                    count++;
                    if (count == k) {
                        index = i;
                        return firstElem + (index - index / 2);
                    }
                }
            }
        }
        return -1;
    }

    
    public static int findKth_Problem_2_e30523bd_30ce_4688_aeee_9560f38da224(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) return arr2.get(k);
        if (arr2.size() == 0) return arr1.get(k);
        if (k == 0) return Math.min(arr1.get(0), arr2.get(0));
        int i = Math.min(arr1.size() - 1, k / 2);
        int j = Math.min(arr2.size() - 1, k / 2);
        if (arr1.get(i) > arr2.get(j)) {
            return findKth_Problem_2_e30523bd_30ce_4688_aeee_9560f38da224(arr1, new ArrayList<Integer>(arr2.subList(j + 1, arr2.size())), k - j - 1);
        } else {
            return findKth_Problem_2_e30523bd_30ce_4688_aeee_9560f38da224(new ArrayList<Integer>(arr1.subList(i + 1, arr1.size())), arr2, k - i - 1);
        }
    }

    
    public static int findKth_Problem_2_b9e6264a_5e29_4464_b17b_c4daceb4a950(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        return 0;
    }

    
    public static int findKth_Problem_0_67dcdc9a_2928_4611_8c01_71fe2f92b94f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get( (k - 1));
        }
        if (arr2.size() == 0) {
            return arr1.get( (k - 1));
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int a = arr1.get( Math.min(k / 2, arr1.size()) - 1);
        int b = arr2.get( Math.min(k / 2, arr2.size()) - 1);
        if (a < b) {
            return findKth_Problem_0_67dcdc9a_2928_4611_8c01_71fe2f92b94f(new ArrayList<Integer>(arr1.subList( Math.min(k / 2, arr1.size()), arr1.size())), arr2, k - Math.min(k / 2, arr1.size()));
        } else {
            return findKth_Problem_0_67dcdc9a_2928_4611_8c01_71fe2f92b94f(arr1, new ArrayList<Integer>(arr2.subList( Math.min(k / 2, arr2.size()), arr2.size())), k - Math.min(k / 2, arr2.size()));
        }
    }

    
    public static int findKth_Problem_2_f7a5b0b5_8a19_4956_8d51_fbf0bb260c0e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = arr1.size() - 1;
        int j = arr2.size() - 1;
        int sum = 0;
        while (i >= 0 && j >= 0) {
            if (arr1.get(i) < arr2.get(j)) {
                sum++;
                i--;
            }
            else if (arr1.get(i) > arr2.get(j)) {
                sum++;
                j--;
            }
            else {
                sum++;
                i = i - 1;
                j = j - 1;
            }
        }
        return sum;
    }

    
    public static int findKth_Problem_0_5fff58d2_6c92_422e_9f4f_f6229a561786(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 1 && arr2.size() == 1) {
            return Math.max(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_5fff58d2_6c92_422e_9f4f_f6229a561786(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_0_5fff58d2_6c92_422e_9f4f_f6229a561786(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_5fff58d2_6c92_422e_9f4f_f6229a561786(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_0_5fff58d2_6c92_422e_9f4f_f6229a561786(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_2_0b98057f_56d9_4242_81be_df4f65c8f0f9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // TODO Auto-generated method stub
        int k1 = arr1.size()-1;
        int k2 = arr2.size()-1;
        int sum = 0;
        int count = 1;
        while (k2 != k1 && k2 != -1) {
            sum = arr1.get(k1) + arr2.get(k2);
            if (sum >= k) {
                k2 = arr2.size()-1;
            } else {
                k1 = arr1.size()-1;
            }
            count++;
        }
        sum = arr1.get(k1) + arr2.get(k2);
        return sum;
    }

    
    public static int findKth_Problem_0_1d2d5a03_75d8_4762_a582_33ce21814c83(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_1d2d5a03_75d8_4762_a582_33ce21814c83(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_0_1d2d5a03_75d8_4762_a582_33ce21814c83(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_1d2d5a03_75d8_4762_a582_33ce21814c83(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_0_1d2d5a03_75d8_4762_a582_33ce21814c83(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_2_127bd87b_f865_491b_b073_9d121e70da97(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
            count++;
            if (count == k) {
                break;
            }
        }
        if (i == arr1.size()) {
            return arr2.get(j);
        } else {
            return arr1.get(i);
        }
    }

    
    public static int findKth_Problem_1_127bd87b_f865_491b_b073_9d121e70da97(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
            count++;
            if (count == k) {
                break;
            }
        }
        if (i == arr1.size()) {
            return arr2.get(j);
        } else {
            return arr1.get(i);
        }
    }

    
    public static int findKth_Problem_2_87004ba6_da91_47f7_aee4_656f88234458(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (arr1.get(0) < arr2.get(0)) {
            arr1.remove(0);
            return findKth_Problem_2_87004ba6_da91_47f7_aee4_656f88234458(arr1, arr2, k - 1);
        } else {
            arr2.remove(0);
            return findKth_Problem_2_87004ba6_da91_47f7_aee4_656f88234458(arr1, arr2, k - 1);
        }
    }

    
    public static int findKth_Problem_1_4ae3e247_9f64_4d7d_8d87_8d55e4703625(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_4ae3e247_9f64_4d7d_8d87_8d55e4703625(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_1_4ae3e247_9f64_4d7d_8d87_8d55e4703625(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_4ae3e247_9f64_4d7d_8d87_8d55e4703625(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_1_4ae3e247_9f64_4d7d_8d87_8d55e4703625(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_1_5ac789f4_bb1c_4116_8a86_e5a26fb78fc1(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (k > (n + m)) {
            return -1;
        }
        if (n == 0) {
            return arr2.get(k - 1);
        }
        if (m == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i = Math.min(n, k/2);
        int j = Math.min(m, k/2);
        if (arr1.get(i - 1) > arr2.get(j - 1)) {
            ArrayList<Integer> new_arr = new ArrayList<Integer>();
            for (int x = j; x < m; x++) {
                new_arr.add(arr2.get(x));
            }
            return findKth_Problem_1_5ac789f4_bb1c_4116_8a86_e5a26fb78fc1(arr1, new_arr, k - j);
        } else {
            ArrayList<Integer> new_arr = new ArrayList<Integer>();
            for (int x = i; x < n; x++) {
                new_arr.add(arr1.get(x));
            }
            return findKth_Problem_1_5ac789f4_bb1c_4116_8a86_e5a26fb78fc1(new_arr, arr2, k - i);
        }
    }

    
    public static int findKth_Problem_2_bd209dbb_74bf_4a96_aec4_75c4e0c100c1(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int count = 0;
        int i = 0;
        int j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
                j++;
            }
        }
        return -1;
    }

    
    public static int findKth_Problem_2_534a3f2b_30a5_48b6_bfbe_c3ff00a87f70(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int firstValue = arr1.get(0); 
        int secondValue = arr2.get(0);

        int i = 1;
        while (i <= k) {
            if (arr1.get(i) > firstValue) {
                firstValue = arr1.get(i);
            }
            if (arr2.get(i) > secondValue) {
                secondValue = arr2.get(i);
            }
            i++;
        }
        return firstValue;
    }

    
    public static int findKth_Problem_1_7c307c88_cfcb_424d_8ec1_070006570587(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get( k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get( k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int a = arr1.get(0);
        int b = arr2.get(0);
        if (a < b) {
            arr1.remove(0);
            return findKth_Problem_1_7c307c88_cfcb_424d_8ec1_070006570587(arr1, arr2, k - 1);
        } else {
            arr2.remove(0);
            return findKth_Problem_1_7c307c88_cfcb_424d_8ec1_070006570587(arr1, arr2, k - 1);
        }
    }

    
    public static int findKth_Problem_0_a2739c01_eea2_4c9f_aa3a_e85c5b7beb53(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int low = arr1.get(0); // initialize low to first element of first array
        int high = arr2.get(arr2.size()-1); // initialize high to last element of second array
        int mid = (low+high)/2; // initialize mid to average of low and high
        int count = 0;
        while(low<=high) {
            count++;
            if(count==k) {
                return mid;
            }
            if(count>k) {
                low++;
            }
            else {
                high--;
            }
        }
        return -1;
    }

    
    public static int findKth_Problem_2_6912dae3_b507_48c1_aa0d_7c1520a93c09(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k-1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k-1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(Math.min(k/2, arr1.size())-1);
        int mid2 = arr2.get(Math.min(k/2, arr2.size())-1);
        if (mid1 < mid2) {
            return findKth_Problem_2_6912dae3_b507_48c1_aa0d_7c1520a93c09(new ArrayList<Integer>(arr1.subList(Math.min(k/2, arr1.size()), arr1.size())), arr2, k - Math.min(k/2, arr1.size()));
        } else {
            return findKth_Problem_2_6912dae3_b507_48c1_aa0d_7c1520a93c09(arr1, new ArrayList<Integer>(arr2.subList(Math.min(k/2, arr2.size()), arr2.size())), k - Math.min(k/2, arr2.size()));
        }
    }

    
    public static int findKth_Problem_2_acb0d5e7_a06f_4b9c_a7f9_6bbe8a380f99(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (count < k) {
            if (i >= arr1.size()) {
                j++;
            } else if (j >= arr2.size()) {
                i++;
            } else if (arr1.get( i) < arr2.get( j)) {
                i++;
            } else {
                j++;
            }
            count++;
        }
        if (i >= arr1.size()) {
            return arr2.get( j);
        } else if (j >= arr2.size()) {
            return arr1.get( i);
        } else {
            return Math.min(arr1.get( i), arr2.get( j));
        }
    }

    
    public static int findKth_Problem_1_2c714dda_fbac_4579_a457_8d1d0f4c9d1e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 1 && arr2.size() == 1) {
            return Math.max(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(arr1.size() / 2);
        int mid2 = arr2.get(arr2.size() / 2);
        if (mid1 < mid2) {
            if (k <= arr1.size() / 2 + arr2.size() / 2) {
                return findKth_Problem_1_2c714dda_fbac_4579_a457_8d1d0f4c9d1e(new ArrayList<Integer>(arr1.subList(0, arr1.size() / 2)), arr2, k);
            } else {
                return findKth_Problem_1_2c714dda_fbac_4579_a457_8d1d0f4c9d1e(arr1, new ArrayList<Integer>(arr2.subList(arr2.size() / 2, arr2.size())), k - arr2.size() / 2);
            }
        } else {
            if (k <= arr1.size() / 2 + arr2.size() / 2) {
                return findKth_Problem_1_2c714dda_fbac_4579_a457_8d1d0f4c9d1e(arr1, new ArrayList<Integer>(arr2.subList(0, arr2.size() / 2)), k);
            } else {
                return findKth_Problem_1_2c714dda_fbac_4579_a457_8d1d0f4c9d1e(new ArrayList<Integer>(arr1.subList(arr1.size() / 2, arr1.size())), arr2, k - arr1.size() / 2);
            }
        }
    }

    
    public static int findKth_Problem_1_d76289b4_1f8c_4d0c_916c_30e3fb1fc52c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_d76289b4_1f8c_4d0c_916c_30e3fb1fc52c(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_1_d76289b4_1f8c_4d0c_916c_30e3fb1fc52c(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_d76289b4_1f8c_4d0c_916c_30e3fb1fc52c(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_1_d76289b4_1f8c_4d0c_916c_30e3fb1fc52c(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_2_5cc86954_0eef_44b8_8cb4_ef5670fecc02(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        int n1 = arr1.size();
        int n2 = arr2.size();
        if (n1 == 0) {
            return arr2.get( k - 1);
        }
        if (n2 == 0) {
            return arr1.get( k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i = Math.min(n1,  k / 2);
        int j = Math.min(n2,  k / 2);
        if (arr1.get(i - 1) > arr2.get(j - 1)) {
            return findKth_Problem_2_5cc86954_0eef_44b8_8cb4_ef5670fecc02(arr1, new ArrayList<Integer>(arr2.subList(j, n2)), k - j);
        } else {
            return findKth_Problem_2_5cc86954_0eef_44b8_8cb4_ef5670fecc02(new ArrayList<Integer>(arr1.subList(i, n1)), arr2, k - i);
        }
    }

    
    public static int findKth_Problem_0_65210f31_d970_436a_8b8e_633e1b6bf63e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_65210f31_d970_436a_8b8e_633e1b6bf63e(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_0_65210f31_d970_436a_8b8e_633e1b6bf63e(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_65210f31_d970_436a_8b8e_633e1b6bf63e(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_0_65210f31_d970_436a_8b8e_633e1b6bf63e(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_0_4ae3e247_9f64_4d7d_8d87_8d55e4703625(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_4ae3e247_9f64_4d7d_8d87_8d55e4703625(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_0_4ae3e247_9f64_4d7d_8d87_8d55e4703625(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_4ae3e247_9f64_4d7d_8d87_8d55e4703625(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_0_4ae3e247_9f64_4d7d_8d87_8d55e4703625(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_1_4c3cc235_89d2_4e79_be64_52fc490642ed(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(Math.min(k/2, arr1.size()) - 1);
        int mid2 = arr2.get(Math.min(k/2, arr2.size()) - 1);
        if (mid1 < mid2) {
            return findKth_Problem_1_4c3cc235_89d2_4e79_be64_52fc490642ed(new ArrayList<Integer>(arr1.subList(Math.min(k/2, arr1.size()), arr1.size())), arr2, k - Math.min(k/2, arr1.size()));
        } else {
            return findKth_Problem_1_4c3cc235_89d2_4e79_be64_52fc490642ed(arr1, new ArrayList<Integer>(arr2.subList(Math.min(k/2, arr2.size()), arr2.size())), k - Math.min(k/2, arr2.size()));
        }
    }

    
    public static int findKth_Problem_0_20291938_569d_487a_8f67_34fd8472c308(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int x = Math.min(arr1.size(), k / 2);
        int y = Math.min(arr2.size(), k / 2);
        if (arr1.get(x - 1) < arr2.get(y - 1)) {
            return findKth_Problem_0_20291938_569d_487a_8f67_34fd8472c308(new ArrayList<Integer>(arr1.subList(x, arr1.size())), arr2, k - x);
        } else {
            return findKth_Problem_0_20291938_569d_487a_8f67_34fd8472c308(arr1, new ArrayList<Integer>(arr2.subList(y, arr2.size())), k - y);
        }
    }

    
    public static int findKth_Problem_1_b74bd53f_927b_45d1_813e_938b2fecde75(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() > arr2.size()) {
            return findKth_Problem_1_b74bd53f_927b_45d1_813e_938b2fecde75(arr2, arr1, k);
        }
        int index1 = Math.min(k/2, arr1.size() - 1);
        int index2 = k - index1 - 1;
        if (arr1.get(index1) < arr2.get(index2)) {
            return findKth_Problem_1_b74bd53f_927b_45d1_813e_938b2fecde75(new ArrayList<Integer>(arr1.subList(index1 + 1, arr1.size())), arr2, k - index1 - 1);
        } else {
            return findKth_Problem_1_b74bd53f_927b_45d1_813e_938b2fecde75(arr1, new ArrayList<Integer>(arr2.subList(index2 + 1, arr2.size())), k - index2 - 1);
        }
    }

    
    public static int findKth_Problem_2_7a471dc1_85cc_45d4_8ad7_b552f9c7ffb6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (k == 1) {
            if (arr1.get(0) < arr2.get(0)) {
                return Math.min(arr1.get(1), arr2.get(0));
            }
            else {
                return Math.min(arr1.get(0), arr2.get(1));
            }
        }
        int k1 = Math.min(k/2, arr1.size()-1);
        int k2 = Math.min(k/2, arr2.size()-1);
        if (arr1.get(k1) < arr2.get(k2)) {
            return findKth_Problem_2_7a471dc1_85cc_45d4_8ad7_b552f9c7ffb6(new ArrayList<Integer>(arr1.subList(k1, arr1.size())), arr2, k-k1);
        }
        else {
            return findKth_Problem_2_7a471dc1_85cc_45d4_8ad7_b552f9c7ffb6(arr1, new ArrayList<Integer>(arr2.subList(k2, arr2.size())), k-k2);
        }
    }

    
    public static int findKth_Problem_2_a3d2841b_b1d7_4dc7_aac3_d9683c1f8dd5(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                ArrayList<Integer> newArr = new ArrayList<Integer>();
                for (int i = mid2 + 1; i < arr2.size(); i++) {
                    newArr.add(arr2.get(i));
                }
                return findKth_Problem_2_a3d2841b_b1d7_4dc7_aac3_d9683c1f8dd5(arr1, newArr, k - mid2 - 1);
            } else {
                ArrayList<Integer> newArr = new ArrayList<Integer>();
                for (int i = mid1 + 1; i < arr1.size(); i++) {
                    newArr.add(arr1.get(i));
                }
                return findKth_Problem_2_a3d2841b_b1d7_4dc7_aac3_d9683c1f8dd5(newArr, arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                ArrayList<Integer> newArr = new ArrayList<Integer>();
                for (int i = 0; i < mid2; i++) {
                    newArr.add(arr2.get(i));
                }
                return findKth_Problem_2_a3d2841b_b1d7_4dc7_aac3_d9683c1f8dd5(arr1, newArr, k);
            } else {
                ArrayList<Integer> newArr = new ArrayList<Integer>();
                for (int i = 0; i < mid1; i++) {
                    newArr.add(arr1.get(i));
                }
                return findKth_Problem_2_a3d2841b_b1d7_4dc7_aac3_d9683c1f8dd5(newArr, arr2, k);
            }
        }
    }

    
    public static int findKth_Problem_2_b90c75b7_08a8_48b5_870f_f8df981131cd(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(Math.min(k / 2, arr1.size()) - 1);
        int mid2 = arr2.get(Math.min(k / 2, arr2.size()) - 1);
        if (mid1 < mid2) {
            return findKth_Problem_2_b90c75b7_08a8_48b5_870f_f8df981131cd(new ArrayList<Integer>(arr1.subList(Math.min(k / 2, arr1.size()), arr1.size())), arr2, k - Math.min(k / 2, arr1.size()));
        } else {
            return findKth_Problem_2_b90c75b7_08a8_48b5_870f_f8df981131cd(arr1, new ArrayList<Integer>(arr2.subList(Math.min(k / 2, arr2.size()), arr2.size())), k - Math.min(k / 2, arr2.size()));
        }
    }

    
    public static int findKth_Problem_1_a2739c01_eea2_4c9f_aa3a_e85c5b7beb53(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int low = arr1.get(0); // initialize low to first element of first array
        int high = arr2.get(arr2.size()-1); // initialize high to last element of second array
        int mid = (low+high)/2; // initialize mid to average of low and high
        int count = 0;
        while(low<=high) {
            count++;
            if(count==k) {
                return mid;
            }
            if(count>k) {
                low++;
            }
            else {
                high--;
            }
        }
        return -1;
    }

    
    public static int findKth_Problem_1_59b84a6d_13cb_4314_80c3_af1c07bdde7d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(Math.min(k/2, arr1.size() - 1));
        int mid2 = arr2.get(Math.min(k/2, arr2.size() - 1));
        if (mid1 < mid2) {
            return findKth_Problem_1_59b84a6d_13cb_4314_80c3_af1c07bdde7d(new ArrayList<Integer>(arr1.subList(Math.min(k/2, arr1.size() - 1), arr1.size())), arr2, k - Math.min(k/2, arr1.size()));
        } else {
            return findKth_Problem_1_59b84a6d_13cb_4314_80c3_af1c07bdde7d(arr1, new ArrayList<Integer>(arr2.subList(Math.min(k/2, arr2.size() - 1), arr2.size())), k - Math.min(k/2, arr2.size()));
        }
    }

    
    public static int findKth_Problem_2_2c5ba380_2837_4a3c_b936_adcb0c24760a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_2c5ba380_2837_4a3c_b936_adcb0c24760a(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_2_2c5ba380_2837_4a3c_b936_adcb0c24760a(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_2c5ba380_2837_4a3c_b936_adcb0c24760a(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_2_2c5ba380_2837_4a3c_b936_adcb0c24760a(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_1_4e27b670_589d_4abf_ba8a_22708d909c53(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(arr1.size() / 2);
        int mid2 = arr2.get(arr2.size() / 2);
        if (mid1 < mid2) {
            ArrayList<Integer> newArr1 = new ArrayList<Integer>(arr1.subList(arr1.size() / 2 + 1, arr1.size()));
            ArrayList<Integer> newArr2 = new ArrayList<Integer>(arr2.subList(0, arr2.size() / 2));
            return findKth_Problem_1_4e27b670_589d_4abf_ba8a_22708d909c53(newArr1, newArr2, k - arr1.size() / 2 - 1);
        } else {
            ArrayList<Integer> newArr1 = new ArrayList<Integer>(arr1.subList(0, arr1.size() / 2));
            ArrayList<Integer> newArr2 = new ArrayList<Integer>(arr2.subList(arr2.size() / 2 + 1, arr2.size()));
            return findKth_Problem_1_4e27b670_589d_4abf_ba8a_22708d909c53(newArr1, newArr2, k - arr2.size() / 2 - 1);
        }
    }

    
    public static int findKth_Problem_0_4f6a2610_9528_4a12_910c_8a521aa70ac5(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int min = arr1.get(0); // initialize min with first element
        int max = arr2.get(0); // initialize max with first element

        for(int i = 1; i < arr1.size(); i++) { // start from index 1
            if(arr1.get(i) < min) {
                min = arr1.get(i);
            }
            else if(arr1.get(i) > max) {
                max = arr2.get(i);
            }
        }
        int mid = (min + max) / 2; // find the mid point
        
        int pos = -1;
        int j = 0;
        for(int i = 0; i < arr2.size(); i++) {
            int temp = arr2.get(i);
            int cmp = arr1.get(i);
            if (cmp >= mid) { // when current element is greater than mid point
                j++;
                if (j == k) {
                    pos = temp;
                }
            }
        }
        return pos;
    }

    
    public static int findKth_Problem_0_e30523bd_30ce_4688_aeee_9560f38da224(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) return arr2.get(k);
        if (arr2.size() == 0) return arr1.get(k);
        if (k == 0) return Math.min(arr1.get(0), arr2.get(0));
        int i = Math.min(arr1.size() - 1, k / 2);
        int j = Math.min(arr2.size() - 1, k / 2);
        if (arr1.get(i) > arr2.get(j)) {
            return findKth_Problem_0_e30523bd_30ce_4688_aeee_9560f38da224(arr1, new ArrayList<Integer>(arr2.subList(j + 1, arr2.size())), k - j - 1);
        } else {
            return findKth_Problem_0_e30523bd_30ce_4688_aeee_9560f38da224(new ArrayList<Integer>(arr1.subList(i + 1, arr1.size())), arr2, k - i - 1);
        }
    }

    
    public static int findKth_Problem_0_1a4e3afe_cd60_4060_9477_622b47098ccf(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if(arr1.size() == 0) return arr2.get(k);
        if(arr2.size() == 0) return arr1.get(k);
        if(k == 0) return Math.min(arr1.get(0), arr2.get(0));
        int i = Math.min(arr1.size()-1, k/2);
        int j = Math.min(arr2.size()-1, k/2);
        if(arr1.get(i) > arr2.get(j)) {
            return findKth_Problem_0_1a4e3afe_cd60_4060_9477_622b47098ccf(arr1, new ArrayList<Integer>(arr2.subList(j+1, arr2.size())), k-j-1);
        } else {
            return findKth_Problem_0_1a4e3afe_cd60_4060_9477_622b47098ccf(new ArrayList<Integer>(arr1.subList(i+1, arr1.size())), arr2, k-i-1);
        }
    }

    
    public static int findKth_Problem_1_7c342204_6f1d_4a16_bd08_2b15bb812cb0(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() >= k / 2 ? arr1.get(k / 2 - 1) : Integer.MAX_VALUE;
        int mid2 = arr2.size() >= k / 2 ? arr2.get(k / 2 - 1) : Integer.MAX_VALUE;
        if (mid1 < mid2) {
            return findKth_Problem_1_7c342204_6f1d_4a16_bd08_2b15bb812cb0(new ArrayList<Integer>(arr1.subList(k / 2, arr1.size())), arr2, k - k / 2);
        } else {
            return findKth_Problem_1_7c342204_6f1d_4a16_bd08_2b15bb812cb0(arr1, new ArrayList<Integer>(arr2.subList(k / 2, arr2.size())), k - k / 2);
        }
    }

    
    public static int findKth_Problem_0_a2316985_b8db_42aa_91d9_3cc9d10df719(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get( k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get( k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get( Math.min(k / 2, arr1.size()) - 1);
        int mid2 = arr2.get( Math.min(k / 2, arr2.size()) - 1);
        if (mid1 < mid2) {
            return findKth_Problem_0_a2316985_b8db_42aa_91d9_3cc9d10df719(new ArrayList<Integer>(arr1.subList( Math.min(k / 2, arr1.size()), arr1.size())), arr2, k - Math.min(k / 2, arr1.size()));
        } else {
            return findKth_Problem_0_a2316985_b8db_42aa_91d9_3cc9d10df719(arr1, new ArrayList<Integer>(arr2.subList( Math.min(k / 2, arr2.size()), arr2.size())), k - Math.min(k / 2, arr2.size()));
        }
    }

    
    public static int findKth_Problem_0_9c9b3743_b5da_4b8a_b503_768caec9a8c0(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() >= k / 2 ? arr1.get(k / 2 - 1) : Integer.MAX_VALUE;
        int mid2 = arr2.size() >= k / 2 ? arr2.get(k / 2 - 1) : Integer.MAX_VALUE;
        if (mid1 < mid2) {
            return findKth_Problem_0_9c9b3743_b5da_4b8a_b503_768caec9a8c0(new ArrayList<Integer>(arr1.subList(k / 2, arr1.size())), arr2, k - k / 2);
        } else {
            return findKth_Problem_0_9c9b3743_b5da_4b8a_b503_768caec9a8c0(arr1, new ArrayList<Integer>(arr2.subList(k / 2, arr2.size())), k - k / 2);
        }
    }

    
    public static int findKth_Problem_0_a3d2841b_b1d7_4dc7_aac3_d9683c1f8dd5(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                ArrayList<Integer> newArr = new ArrayList<Integer>();
                for (int i = mid2 + 1; i < arr2.size(); i++) {
                    newArr.add(arr2.get(i));
                }
                return findKth_Problem_0_a3d2841b_b1d7_4dc7_aac3_d9683c1f8dd5(arr1, newArr, k - mid2 - 1);
            } else {
                ArrayList<Integer> newArr = new ArrayList<Integer>();
                for (int i = mid1 + 1; i < arr1.size(); i++) {
                    newArr.add(arr1.get(i));
                }
                return findKth_Problem_0_a3d2841b_b1d7_4dc7_aac3_d9683c1f8dd5(newArr, arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                ArrayList<Integer> newArr = new ArrayList<Integer>();
                for (int i = 0; i < mid2; i++) {
                    newArr.add(arr2.get(i));
                }
                return findKth_Problem_0_a3d2841b_b1d7_4dc7_aac3_d9683c1f8dd5(arr1, newArr, k);
            } else {
                ArrayList<Integer> newArr = new ArrayList<Integer>();
                for (int i = 0; i < mid1; i++) {
                    newArr.add(arr1.get(i));
                }
                return findKth_Problem_0_a3d2841b_b1d7_4dc7_aac3_d9683c1f8dd5(newArr, arr2, k);
            }
        }
    }

    
    public static int findKth_Problem_0_4cbff54e_b122_4bc3_a2c6_807a0cba9bcd(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 1 && arr2.size() == 1) {
            return Math.max(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_4cbff54e_b122_4bc3_a2c6_807a0cba9bcd(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_0_4cbff54e_b122_4bc3_a2c6_807a0cba9bcd(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_4cbff54e_b122_4bc3_a2c6_807a0cba9bcd(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_0_4cbff54e_b122_4bc3_a2c6_807a0cba9bcd(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_0_0f2a5347_bb83_4a02_8f07_d9504bd41cc5(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int res = 0;
        for (int i = 0; i < arr2.size(); i++) {
            if (arr1.size() - k + 1 >= arr2.get(i)) {
                if (arr1.get(i) < arr2.get(i)) {
                    res = arr2.get(i);
                    break;
                } else if (arr1.get(i) > arr2.get(i)) {
                    res = arr1.get(i);
                    break;
                } else if (arr1.get(i) == arr2.get(i)) {
                    res = arr1.get(i);
                    break;
                }
            }
        }
        return res;
    }

    
    public static int findKth_Problem_0_25fe0547_3a3b_40e6_b8ee_6f57610960f7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        while (k > 0) {
            if (i >= arr1.size()) {
                j++;
            } else if (j >= arr2.size()) {
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        if (i >= arr1.size()) {
            return arr2.get(j);
        } else if (j >= arr2.size()) {
            return arr1.get(i);
        } else {
            return Math.min(arr1.get(i), arr2.get(j));
        }
    }

    
    public static int findKth_Problem_2_4ae2636e_5037_462b_945f_6a186c3afe6a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (n >= m) {
            arr1.add(arr2.get(m - 1));
            arr2.remove(m - 1);
        }
        int index = 0;
        int kth = -1;
        int count = 0;
        int flag = 0;
        for (int i = 0; i < n; i++) {
            count++;
            if (count > k) {
                count = 1;
                flag++;
                index++;
            }
            if (i == 0) {
                kth = arr1.get(i);
                kth = (arr2.get(m));
                kth = (arr1.get(m));
            }
            if (arr1.get(i) == arr2.get(m)) {
                kth = (arr1.get(m));
                kth = (arr2.get(m));
            }
            if (arr1.get(i) > arr2.get(m)) {
                kth = (arr1.get(m));
                kth = (arr2.get(m));
            }
            if (flag == (n - 1)) {
                return kth;
            }
        }
        return -1;
    }

    
    public static int findKth_Problem_2_a2316985_b8db_42aa_91d9_3cc9d10df719(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get( k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get( k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get( Math.min(k / 2, arr1.size()) - 1);
        int mid2 = arr2.get( Math.min(k / 2, arr2.size()) - 1);
        if (mid1 < mid2) {
            return findKth_Problem_2_a2316985_b8db_42aa_91d9_3cc9d10df719(new ArrayList<Integer>(arr1.subList( Math.min(k / 2, arr1.size()), arr1.size())), arr2, k - Math.min(k / 2, arr1.size()));
        } else {
            return findKth_Problem_2_a2316985_b8db_42aa_91d9_3cc9d10df719(arr1, new ArrayList<Integer>(arr2.subList( Math.min(k / 2, arr2.size()), arr2.size())), k - Math.min(k / 2, arr2.size()));
        }
    }

    
    public static int findKth_Problem_1_3a1fbb5b_9b07_4a91_a320_426fcfd3ce5c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        while (k > 0) {
            if (i < arr1.size() && j < arr2.size()) {
                if (arr1.get(i) < arr2.get(j)) {
                    i++;
                } else {
                    j++;
                }
            } else if (i < arr1.size()) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        if (i < arr1.size() && j < arr2.size()) {
            return Math.min(arr1.get(i), arr2.get(j));
        } else if (i < arr1.size()) {
            return arr1.get(i);
        } else {
            return arr2.get(j);
        }
    }

    
    public static int findKth_Problem_0_0189e747_0948_4284_8f75_d796162879bc(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        while (k > 0) {
            if (i >= arr1.size()) {
                j++;
            } else if (j >= arr2.size()) {
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        if (i >= arr1.size()) {
            return arr2.get(j);
        } else if (j >= arr2.size()) {
            return arr1.get(i);
        } else {
            return Math.min(arr1.get(i), arr2.get(j));
        }
    }

    
    public static int findKth_Problem_0_a395eb8b_b7a2_4b8a_a6ec_39c8a381e357(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
                count++;
            } else {
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
                count++;
            }
        }
        while (i < arr1.size()) {
            if (count == k) {
                return arr1.get(i);
            }
            i++;
            count++;
        }
        while (j < arr2.size()) {
            if (count == k) {
                return arr2.get(j);
            }
            j++;
            count++;
        }
        return -1;
    }

    
    public static int findKth_Problem_1_6e46801c_4990_4ceb_a59e_910865fa6a7d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int count = 0;
        int i = 0;
        int j = 0;
        int size = arr1.size();
        while (i < size && j < size) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
                j++;
            }
        }
        return -1;
    }

    
    public static int findKth_Problem_1_5cc86954_0eef_44b8_8cb4_ef5670fecc02(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        int n1 = arr1.size();
        int n2 = arr2.size();
        if (n1 == 0) {
            return arr2.get( k - 1);
        }
        if (n2 == 0) {
            return arr1.get( k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i = Math.min(n1,  k / 2);
        int j = Math.min(n2,  k / 2);
        if (arr1.get(i - 1) > arr2.get(j - 1)) {
            return findKth_Problem_1_5cc86954_0eef_44b8_8cb4_ef5670fecc02(arr1, new ArrayList<Integer>(arr2.subList(j, n2)), k - j);
        } else {
            return findKth_Problem_1_5cc86954_0eef_44b8_8cb4_ef5670fecc02(new ArrayList<Integer>(arr1.subList(i, n1)), arr2, k - i);
        }
    }

    
    public static int findKth_Problem_2_6a6fb7b1_8346_49da_84af_45db781eb0ec(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() >= k / 2 ? arr1.get(k / 2 - 1) : Integer.MAX_VALUE;
        int mid2 = arr2.size() >= k / 2 ? arr2.get(k / 2 - 1) : Integer.MAX_VALUE;
        if (mid1 < mid2) {
            return findKth_Problem_2_6a6fb7b1_8346_49da_84af_45db781eb0ec(new ArrayList<Integer>(arr1.subList(k / 2, arr1.size())), arr2, k - k / 2);
        } else {
            return findKth_Problem_2_6a6fb7b1_8346_49da_84af_45db781eb0ec(arr1, new ArrayList<Integer>(arr2.subList(k / 2, arr2.size())), k - k / 2);
        }
    }

    
    public static int findKth_Problem_0_65298a7d_fb35_4bf8_8728_dcc8fa602857(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
            count++;
        }
        while (i < arr1.size()) {
            if (count == k) {
                return arr1.get(i);
            }
            i++;
            count++;
        }
        while (j < arr2.size()) {
            if (count == k) {
                return arr2.get(j);
            }
            j++;
            count++;
        }
        return -1;
    }

    
    public static int findKth_Problem_0_f7a5b0b5_8a19_4956_8d51_fbf0bb260c0e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = arr1.size() - 1;
        int j = arr2.size() - 1;
        int sum = 0;
        while (i >= 0 && j >= 0) {
            if (arr1.get(i) < arr2.get(j)) {
                sum++;
                i--;
            }
            else if (arr1.get(i) > arr2.get(j)) {
                sum++;
                j--;
            }
            else {
                sum++;
                i = i - 1;
                j = j - 1;
            }
        }
        return sum;
    }

    
    public static int findKth_Problem_1_4cf5de56_337a_4e4a_8982_466ca0c14b53(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        while (k > 0) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        return Math.min(arr1.get(i), arr2.get(j));
    }

    
    public static int findKth_Problem_2_d3b9eaaf_fd17_4dbf_be31_fe7140ab6619(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get( (k - 1));
        }
        if (arr2.size() == 0) {
            return arr1.get( (k - 1));
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i =  Math.min(k / 2, arr1.size());
        int j =  Math.min(k / 2, arr2.size());
        if (arr1.get(i - 1) < arr2.get(j - 1)) {
            return findKth_Problem_2_d3b9eaaf_fd17_4dbf_be31_fe7140ab6619(new ArrayList<Integer>(arr1.subList(i, arr1.size())), arr2, k - i);
        } else {
            return findKth_Problem_2_d3b9eaaf_fd17_4dbf_be31_fe7140ab6619(arr1, new ArrayList<Integer>(arr2.subList(j, arr2.size())), k - j);
        }
    }

    
    public static int findKth_Problem_1_0b98057f_56d9_4242_81be_df4f65c8f0f9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // TODO Auto-generated method stub
        int k1 = arr1.size()-1;
        int k2 = arr2.size()-1;
        int sum = 0;
        int count = 1;
        while (k2 != k1 && k2 != -1) {
            sum = arr1.get(k1) + arr2.get(k2);
            if (sum >= k) {
                k2 = arr2.size()-1;
            } else {
                k1 = arr1.size()-1;
            }
            count++;
        }
        sum = arr1.get(k1) + arr2.get(k2);
        return sum;
    }

    
    public static int findKth_Problem_1_5e35744a_2777_4bff_ad95_e0afd7ed0a6f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int ans = 0;
        int l = 0;
        int r = 0;
        if (arr1.size() > arr2.size()) {
            int i = arr1.size() - 1;
            while (i >= 0 && l < arr2.size()) {
                if (arr1.get(i) <= arr2.get(l)) {
                    ans++;
                    i = i - 1;
                } else {
                    l++;
                }
            }
            i = arr1.size() - 1;
            while (i < arr1.size() && r < arr2.size()) {
                if (arr1.get(i) <= arr2.get(r)) {
                    ans++;
                    i = i + 1;
                } else {
                    r++;
                }
            }
        } else {
            int i = arr2.size() - 1;
            while (i >= 0 && r < arr2.size()) {
                if (arr2.get(i) <= arr1.get(r)) {
                    ans++;
                    i = i - 1;
                } else {
                    r++;
                }
            }
            i = arr2.size() - 1;
            while (i < arr2.size() && l < arr1.size()) {
                if (arr2.get(i) <= arr1.get(l)) {
                    ans++;
                    i = i + 1;
                } else {
                    l++;
                }
            }
        }
        return ans;
    }

    
    public static int findKth_Problem_0_b60d5887_2794_46c1_b3b0_68bc861ef826(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get( i) < arr2.get( j)) {
                count++;
                if (count == k) {
                    return arr1.get( i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get( j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get( i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get( j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_1_7ffe92ff_df83_4cd5_b50d_1e5146c9d1d6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        int firstArray = arr1.get(0);
        int secondArray = arr2.get(0);
        int finalArray = firstArray + (secondArray - firstArray) * (k - 1);
        return finalArray;
    }

    
    public static int findKth_Problem_2_195bcf66_4f40_4663_b57c_35c8980a49e2(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() <= 1 && arr2.size() <= 1) {
            return -1;
        }
        int low = arr1.get(0);
        int high = arr2.get(0);
        int mid = (low + high) / 2;
        int prev = 0;
        int next = 0;
        for (int i = 1; i < arr1.size(); i++) {
            if (mid >= arr1.get(i) && mid <= arr2.get(i)) {
                return mid;
            }
            else if (mid >= arr1.get(i)) {
                prev = mid;
                mid = (mid + arr2.get(i)) / 2;
            }
            else {
                next = mid + arr1.get(i);
            }
        }
        if (prev + 1 == next) {
            return prev;
        }
        int mid2 = (prev + next) / 2;
        return mid2;
    }

    
    public static int findKth_Problem_2_67dcdc9a_2928_4611_8c01_71fe2f92b94f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get( (k - 1));
        }
        if (arr2.size() == 0) {
            return arr1.get( (k - 1));
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int a = arr1.get( Math.min(k / 2, arr1.size()) - 1);
        int b = arr2.get( Math.min(k / 2, arr2.size()) - 1);
        if (a < b) {
            return findKth_Problem_2_67dcdc9a_2928_4611_8c01_71fe2f92b94f(new ArrayList<Integer>(arr1.subList( Math.min(k / 2, arr1.size()), arr1.size())), arr2, k - Math.min(k / 2, arr1.size()));
        } else {
            return findKth_Problem_2_67dcdc9a_2928_4611_8c01_71fe2f92b94f(arr1, new ArrayList<Integer>(arr2.subList( Math.min(k / 2, arr2.size()), arr2.size())), k - Math.min(k / 2, arr2.size()));
        }
    }

    
    public static int findKth_Problem_1_c067569b_38cf_426a_bb0d_434086d63198(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        int n = arr1.size();
        int m = arr2.size();
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < n && j < m) {
            if (arr1.get(i) < arr2.get(j)) {
                if (count == k - 1) {
                    return arr1.get(i);
                }
                i++;
                count++;
            } else {
                if (count == k - 1) {
                    return arr2.get(j);
                }
                j++;
                count++;
            }
        }
        while (i < n) {
            if (count == k - 1) {
                return arr1.get(i);
            }
            i++;
            count++;
        }
        while (j < m) {
            if (count == k - 1) {
                return arr2.get(j);
            }
            j++;
            count++;
        }
        return -1;
    }

    
    public static int findKth_Problem_1_a1a1120b_29e9_46a6_af96_1bd65daf6597(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_a1a1120b_29e9_46a6_af96_1bd65daf6597(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_1_a1a1120b_29e9_46a6_af96_1bd65daf6597(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_a1a1120b_29e9_46a6_af96_1bd65daf6597(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_1_a1a1120b_29e9_46a6_af96_1bd65daf6597(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_0_b49f970f_61a9_46a2_a8e6_652436ef9810(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 1 && arr2.size() == 1) {
            return Math.max(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_b49f970f_61a9_46a2_a8e6_652436ef9810(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_0_b49f970f_61a9_46a2_a8e6_652436ef9810(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_b49f970f_61a9_46a2_a8e6_652436ef9810(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_0_b49f970f_61a9_46a2_a8e6_652436ef9810(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_2_5254dbf1_4e45_4528_9e35_d30bb16393e0(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_2_b879532d_5ccd_4dc1_be58_3a618378513e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (k == 0) return 0;
        if (arr1.size() == 0) return arr2.get(k - 1);
        if (arr2.size() == 0) return arr1.get(k - 1);
        if (k == 1) return Math.min(arr1.get(0), arr2.get(0));
        int mid1 = arr1.get(Math.min(k / 2, arr1.size()) - 1);
        int mid2 = arr2.get(Math.min(k / 2, arr2.size()) - 1);
        if (mid1 < mid2) {
            ArrayList<Integer> newArr1 = new ArrayList<Integer>(arr1.subList(Math.min(k / 2, arr1.size()), arr1.size()));
            return findKth_Problem_2_b879532d_5ccd_4dc1_be58_3a618378513e(newArr1, arr2, k - Math.min(k / 2, arr1.size()));
        } else {
            ArrayList<Integer> newArr2 = new ArrayList<Integer>(arr2.subList(Math.min(k / 2, arr2.size()), arr2.size()));
            return findKth_Problem_2_b879532d_5ccd_4dc1_be58_3a618378513e(arr1, newArr2, k - Math.min(k / 2, arr2.size()));
        }
    }

    
    public static int findKth_Problem_0_b7daedab_c816_4a5b_87e3_a1940d6e45f5(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Your code goes here
        int result = 0;
        int count1 = 0;
        int count2 = 0;
        if (k > arr1.size()) {
            k--;
        }
        for (int i = 0; i < arr1.size() - k; i++) {
            if (arr1.get(i) < arr2.get(i)) {
                count1++;
                if (count1 == k) {
                    result = arr1.get(i);
                }
            } else {
                count2++;
                if (count2 == k) {
                    result = arr2.get(i);
                }
            }
        }
        return result;
    }

    
    public static int findKth_Problem_2_f2dd8c40_9cdf_4f2b_9bac_c614e4e4ccb0(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        while (k > 0) {
            if (i == arr1.size()) {
                j++;
            } else if (j == arr2.size()) {
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        if (i == arr1.size()) {
            return arr2.get(j);
        } else if (j == arr2.size()) {
            return arr1.get(i);
        } else {
            return Math.min(arr1.get(i), arr2.get(j));
        }
    }

    
    public static int findKth_Problem_2_2c521b8f_1bf7_4987_b678_75d09ebd8290(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int sum = 0;
        if (arr1.size() > arr2.size()) {
            for (int i = 0; i < arr2.size(); i++) {
                if (arr1.get(i) >= arr2.get(i))
                    sum += arr2.get(i);
                else
                    sum += arr1.get(i);
            }
            return sum % k;
        }
        else {
            for (int i = 0; i < arr1.size(); i++) {
                if (arr1.get(i) > arr2.get(i))
                    sum += arr1.get(i);
                else
                    sum += arr2.get(i);
            }
            return sum % k;
        }
    }

    
    public static int findKth_Problem_2_9a4a19c0_4bea_4079_904d_4aac50905264(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        int res = 0;
        while (k > 0) {
            if (i < arr1.size() && j < arr2.size()) {
                if (arr1.get(i) < arr2.get(j)) {
                    res = arr1.get(i);
                    i++;
                } else {
                    res = arr2.get(j);
                    j++;
                }
            } else if (i < arr1.size()) {
                res = arr1.get(i);
                i++;
            } else {
                res = arr2.get(j);
                j++;
            }
            k--;
        }
        return res;
    }

    
    public static int findKth_Problem_1_f7a5b0b5_8a19_4956_8d51_fbf0bb260c0e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = arr1.size() - 1;
        int j = arr2.size() - 1;
        int sum = 0;
        while (i >= 0 && j >= 0) {
            if (arr1.get(i) < arr2.get(j)) {
                sum++;
                i--;
            }
            else if (arr1.get(i) > arr2.get(j)) {
                sum++;
                j--;
            }
            else {
                sum++;
                i = i - 1;
                j = j - 1;
            }
        }
        return sum;
    }

    
    public static int findKth_Problem_0_8b3a5730_3bd7_48aa_ab2a_35df3d91b529(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (k > (n + m)) {
            return -1;
        }
        if (n == 0) {
            return arr2.get( k - 1);
        }
        if (m == 0) {
            return arr1.get( k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i = Math.min(n,  k / 2);
        int j = Math.min(m,  k / 2);
        if (arr1.get(i - 1) > arr2.get(j - 1)) {
            ArrayList<Integer> newArr = new ArrayList<Integer>();
            for (int x = j; x < m; x++) {
                newArr.add(arr2.get(x));
            }
            return findKth_Problem_0_8b3a5730_3bd7_48aa_ab2a_35df3d91b529(arr1, newArr, k - j);
        } else {
            ArrayList<Integer> newArr = new ArrayList<Integer>();
            for (int x = i; x < n; x++) {
                newArr.add(arr1.get(x));
            }
            return findKth_Problem_0_8b3a5730_3bd7_48aa_ab2a_35df3d91b529(newArr, arr2, k - i);
        }
    }

    
    public static int findKth_Problem_2_4e47c23d_4351_4d6e_975e_c02d28c05784(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (k > (n + m)) {
            return -1;
        }
        if (n == 0) {
            return arr2.get( k - 1);
        }
        if (m == 0) {
            return arr1.get( k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i = Math.min(n, k / 2);
        int j = Math.min(m, k / 2);
        if (arr1.get( i - 1) > arr2.get( j - 1)) {
            return findKth_Problem_2_4e47c23d_4351_4d6e_975e_c02d28c05784(arr1, new ArrayList<Integer>(arr2.subList( j,  m)), k - j);
        } else {
            return findKth_Problem_2_4e47c23d_4351_4d6e_975e_c02d28c05784(new ArrayList<Integer>(arr1.subList( i,  n)), arr2, k - i);
        }
    }

    
    public static int findKth_Problem_1_abe82fe9_c4c3_426c_b8b8_4758ee480815(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        while (i < arr1.size() && j < arr2.size() && k > 0) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        if (k == 0) {
            return Math.min(arr1.get(i), arr2.get(j));
        } else if (i == arr1.size()) {
            return arr2.get( k - 1);
        } else {
            return arr1.get( k - 1);
        }
    }

    
    public static int findKth_Problem_1_4a09308c_8f41_4f3d_a0c2_a9626a8b2e21(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int low = arr1.get(0); // initialize low to first element of first array
        int high = arr2.get(arr2.size()-1); // initialize high to last element of second array
        int mid = (low+high)/2;
        int count = 0;
        while(low<=high) {
            count++;
            if(count==k) {
                return mid;
            }
            if(count>k) {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
            mid = (low+high)/2;
        }
        return -1;
    }

    
    public static int findKth_Problem_1_3393713e_7915_4fbe_853f_bcea56580efa(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() > arr2.size()) {
            return findKth_Problem_1_3393713e_7915_4fbe_853f_bcea56580efa(arr2, arr1, k);
        }
        if (arr1.size() == 1) {
            if (arr2.size() == 1) {
                return Math.max(arr1.get(0), arr2.get(0));
            }
            int i = Math.min(k / 2, arr2.size() - 1);
            if (arr1.get(0) > arr2.get(i)) {
                return findKth_Problem_1_3393713e_7915_4fbe_853f_bcea56580efa(arr1, new ArrayList<Integer>(arr2.subList(i + 1, arr2.size())), k - i - 1);
            } else {
                return findKth_Problem_1_3393713e_7915_4fbe_853f_bcea56580efa(arr1, new ArrayList<Integer>(arr2.subList(0, i)), k);
            }
        }
        int i = Math.min(k / 2, arr1.size() - 1);
        if (arr1.get(i) > arr2.get(i)) {
            return findKth_Problem_1_3393713e_7915_4fbe_853f_bcea56580efa(new ArrayList<Integer>(arr1.subList(0, i)), arr2, k);
        } else {
            return findKth_Problem_1_3393713e_7915_4fbe_853f_bcea56580efa(new ArrayList<Integer>(arr1.subList(i + 1, arr1.size())), arr2, k - i - 1);
        }
    }

    
    public static int findKth_Problem_0_e2c77df5_4c96_43f7_9e4a_1b7db8277200(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int low=arr1.get(0),high=arr1.get(arr1.size()-1),middle=arr1.get(0);
        int i=1;
        while(low<=high){
            middle=(low+high)/2;
            if(arr2.contains(middle)){
                low=middle;
            }
            else if(arr2.contains(middle+1)){
                high=middle-1;
            }
            else{
                i++;
            }
        }
        return k;
    }

    
    public static int findKth_Problem_0_04189ace_0e70_4941_b054_8b6a9f260394(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        int n = arr1.size();
        int m = arr2.size();
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < n && j < m) {
            if (arr1.get( i) < arr2.get( j)) {
                count++;
                if (count == k) {
                    return arr1.get( i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get( j);
                }
                j++;
            }
        }
        while (i < n) {
            count++;
            if (count == k) {
                return arr1.get( i);
            }
            i++;
        }
        while (j < m) {
            count++;
            if (count == k) {
                return arr2.get( j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_0_a4a143f6_4e14_4ae6_807b_d3bcf637b84c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        } else if (arr2.size() == 0) {
            return arr1.get(k);
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_a4a143f6_4e14_4ae6_807b_d3bcf637b84c(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_0_a4a143f6_4e14_4ae6_807b_d3bcf637b84c(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_a4a143f6_4e14_4ae6_807b_d3bcf637b84c(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_0_a4a143f6_4e14_4ae6_807b_d3bcf637b84c(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_1_a3d2841b_b1d7_4dc7_aac3_d9683c1f8dd5(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                ArrayList<Integer> newArr = new ArrayList<Integer>();
                for (int i = mid2 + 1; i < arr2.size(); i++) {
                    newArr.add(arr2.get(i));
                }
                return findKth_Problem_1_a3d2841b_b1d7_4dc7_aac3_d9683c1f8dd5(arr1, newArr, k - mid2 - 1);
            } else {
                ArrayList<Integer> newArr = new ArrayList<Integer>();
                for (int i = mid1 + 1; i < arr1.size(); i++) {
                    newArr.add(arr1.get(i));
                }
                return findKth_Problem_1_a3d2841b_b1d7_4dc7_aac3_d9683c1f8dd5(newArr, arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                ArrayList<Integer> newArr = new ArrayList<Integer>();
                for (int i = 0; i < mid2; i++) {
                    newArr.add(arr2.get(i));
                }
                return findKth_Problem_1_a3d2841b_b1d7_4dc7_aac3_d9683c1f8dd5(arr1, newArr, k);
            } else {
                ArrayList<Integer> newArr = new ArrayList<Integer>();
                for (int i = 0; i < mid1; i++) {
                    newArr.add(arr1.get(i));
                }
                return findKth_Problem_1_a3d2841b_b1d7_4dc7_aac3_d9683c1f8dd5(newArr, arr2, k);
            }
        }
    }

    
    public static int findKth_Problem_2_b9ce77c2_98c3_45d5_bed9_843848331904(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        int curr = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                curr = arr1.get(i);
                i++;
            } else {
                curr = arr2.get(j);
                j++;
            }
            if (i + j == k) {
                return curr;
            }
        }
        while (i < arr1.size()) {
            curr = arr1.get(i);
            i++;
            if (i + j == k) {
                return curr;
            }
        }
        while (j < arr2.size()) {
            curr = arr2.get(j);
            j++;
            if (i + j == k) {
                return curr;
            }
        }
        return curr;
    }

    
    public static int findKth_Problem_0_69d12098_1812_43e7_8e95_3a26fbfb9acc(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get( k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get( k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() > arr2.size()) {
            return findKth_Problem_0_69d12098_1812_43e7_8e95_3a26fbfb9acc(arr2, arr1, k);
        }
        int i =  Math.min(arr1.size(), k / 2);
        int j =  Math.min(arr2.size(), k / 2);
        if (arr1.get(i - 1) > arr2.get(j - 1)) {
            return findKth_Problem_0_69d12098_1812_43e7_8e95_3a26fbfb9acc(arr1, new ArrayList<Integer>(arr2.subList(j, arr2.size())), k - j);
        } else {
            return findKth_Problem_0_69d12098_1812_43e7_8e95_3a26fbfb9acc(new ArrayList<Integer>(arr1.subList(i, arr1.size())), arr2, k - i);
        }
    }

    
    public static int findKth_Problem_0_7c307c88_cfcb_424d_8ec1_070006570587(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get( k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get( k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int a = arr1.get(0);
        int b = arr2.get(0);
        if (a < b) {
            arr1.remove(0);
            return findKth_Problem_0_7c307c88_cfcb_424d_8ec1_070006570587(arr1, arr2, k - 1);
        } else {
            arr2.remove(0);
            return findKth_Problem_0_7c307c88_cfcb_424d_8ec1_070006570587(arr1, arr2, k - 1);
        }
    }

    
    public static int findKth_Problem_0_cb099428_1c24_466a_9907_6677fd1cd20c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (k <= 0) {
            return -1;
        }
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() >= k / 2 ? arr1.get(k / 2 - 1) : Integer.MAX_VALUE;
        int mid2 = arr2.size() >= k / 2 ? arr2.get(k / 2 - 1) : Integer.MAX_VALUE;
        if (mid1 < mid2) {
            return findKth_Problem_0_cb099428_1c24_466a_9907_6677fd1cd20c(new ArrayList<Integer>(arr1.subList(k / 2, arr1.size())), arr2, k - k / 2);
        } else {
            return findKth_Problem_0_cb099428_1c24_466a_9907_6677fd1cd20c(arr1, new ArrayList<Integer>(arr2.subList(k / 2, arr2.size())), k - k / 2);
        }
    }

    
    public static int findKth_Problem_2_5e35744a_2777_4bff_ad95_e0afd7ed0a6f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int ans = 0;
        int l = 0;
        int r = 0;
        if (arr1.size() > arr2.size()) {
            int i = arr1.size() - 1;
            while (i >= 0 && l < arr2.size()) {
                if (arr1.get(i) <= arr2.get(l)) {
                    ans++;
                    i = i - 1;
                } else {
                    l++;
                }
            }
            i = arr1.size() - 1;
            while (i < arr1.size() && r < arr2.size()) {
                if (arr1.get(i) <= arr2.get(r)) {
                    ans++;
                    i = i + 1;
                } else {
                    r++;
                }
            }
        } else {
            int i = arr2.size() - 1;
            while (i >= 0 && r < arr2.size()) {
                if (arr2.get(i) <= arr1.get(r)) {
                    ans++;
                    i = i - 1;
                } else {
                    r++;
                }
            }
            i = arr2.size() - 1;
            while (i < arr2.size() && l < arr1.size()) {
                if (arr2.get(i) <= arr1.get(l)) {
                    ans++;
                    i = i + 1;
                } else {
                    l++;
                }
            }
        }
        return ans;
    }

    
    public static int findKth_Problem_1_aaa83284_40ad_4408_8106_9c4451a5753f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        int ans = 0;
        while (k > 0) {
            if (i < arr1.size() && j < arr2.size()) {
                if (arr1.get(i) < arr2.get(j)) {
                    ans = arr1.get(i);
                    i++;
                } else {
                    ans = arr2.get(j);
                    j++;
                }
            } else if (i < arr1.size()) {
                ans = arr1.get(i);
                i++;
            } else {
                ans = arr2.get(j);
                j++;
            }
            k--;
        }
        return ans;
    }

    
    public static int findKth_Problem_0_1fcf2901_d4f7_471b_8dd1_77c5ffdab3b4(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        ArrayList<Integer> arr3 = new ArrayList<Integer>();
        int min1 = arr1.get(arr1.size()-1);
        int min2 = arr2.get(arr2.size()-1);
        int i = 0;
        int next1 = 0;
        int next2 = 0;
        int min = 0;
        while (i < arr1.size() - 1) {
            next1 = min1 + arr1.get(i+1);
            next2 = min2 + arr2.get(i+1);
            min = next1;
            if (next1 < next2) {
                min = Math.min(next1, next2);
            }
            if (min == k) {
                arr3.add(min);
            }
            i++;
        }
        int ans = arr3.get(arr3.size()-1);
        return ans;
    }

    
    public static int findKth_Problem_1_b60d5887_2794_46c1_b3b0_68bc861ef826(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get( i) < arr2.get( j)) {
                count++;
                if (count == k) {
                    return arr1.get( i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get( j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get( i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get( j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_2_c57565c8_f957_47ff_b566_f2c2e3bfdf0e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get( k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get( k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i =  Math.min(k / 2, arr1.size());
        int j =  Math.min(k / 2, arr2.size());
        if (arr1.get(i - 1) < arr2.get(j - 1)) {
            return findKth_Problem_2_c57565c8_f957_47ff_b566_f2c2e3bfdf0e(new ArrayList<Integer>(arr1.subList(i, arr1.size())), arr2, k - i);
        } else {
            return findKth_Problem_2_c57565c8_f957_47ff_b566_f2c2e3bfdf0e(arr1, new ArrayList<Integer>(arr2.subList(j, arr2.size())), k - j);
        }
    }

    
    public static int findKth_Problem_0_0d162a35_b79b_4961_82bf_4c9b7f406381(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (k > (n + m)) {
            return -1;
        }
        if (n > m) {
            return findKth_Problem_0_0d162a35_b79b_4961_82bf_4c9b7f406381(arr2, arr1, k);
        }
        if (n == 0) {
            return arr2.get( k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i = Math.min(n, k / 2);
        int j = Math.min(m, k / 2);
        if (arr1.get( i - 1) > arr2.get( j - 1)) {
            return findKth_Problem_0_0d162a35_b79b_4961_82bf_4c9b7f406381(arr1, new ArrayList<Integer>(arr2.subList( j,  m)), k - j);
        } else {
            return findKth_Problem_0_0d162a35_b79b_4961_82bf_4c9b7f406381(new ArrayList<Integer>(arr1.subList( i,  n)), arr2, k - i);
        }
    }

    
    public static int findKth_Problem_2_fa193b2c_f92f_4328_909e_7a4faa14b232(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        int n = arr1.size(), m = arr2.size();
        while (i < n && j < m) {
            if (arr1.get(i) < arr2.get(j)) {
                if (k == 1) {
                    return arr1.get(i);
                }
                i++;
                k--;
            } else {
                if (k == 1) {
                    return arr2.get(j);
                }
                j++;
                k--;
            }
        }
        while (i < n) {
            if (k == 1) {
                return arr1.get(i);
            }
            i++;
            k--;
        }
        while (j < m) {
            if (k == 1) {
                return arr2.get(j);
            }
            j++;
            k--;
        }
        return -1;
    }

    
    public static int findKth_Problem_2_72b1f688_b079_4e88_a576_9a2c7c140be6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(Math.min(k / 2, arr1.size()) - 1);
        int mid2 = arr2.get(Math.min(k / 2, arr2.size()) - 1);
        if (mid1 < mid2) {
            return findKth_Problem_2_72b1f688_b079_4e88_a576_9a2c7c140be6(new ArrayList<Integer>(arr1.subList(Math.min(k / 2, arr1.size()), arr1.size())), arr2, k - Math.min(k / 2, arr1.size()));
        } else {
            return findKth_Problem_2_72b1f688_b079_4e88_a576_9a2c7c140be6(arr1, new ArrayList<Integer>(arr2.subList(Math.min(k / 2, arr2.size()), arr2.size())), k - Math.min(k / 2, arr2.size()));
        }
    }

    
    public static int findKth_Problem_2_b7daedab_c816_4a5b_87e3_a1940d6e45f5(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Your code goes here
        int result = 0;
        int count1 = 0;
        int count2 = 0;
        if (k > arr1.size()) {
            k--;
        }
        for (int i = 0; i < arr1.size() - k; i++) {
            if (arr1.get(i) < arr2.get(i)) {
                count1++;
                if (count1 == k) {
                    result = arr1.get(i);
                }
            } else {
                count2++;
                if (count2 == k) {
                    result = arr2.get(i);
                }
            }
        }
        return result;
    }

    
    public static int findKth_Problem_0_b5f002e0_3d9f_4d96_99e6_0b31b7a74240(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get( i) < arr2.get( j)) {
                count++;
                if (count == k) {
                    return arr1.get( i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get( j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get( i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get( j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_0_b74bd53f_927b_45d1_813e_938b2fecde75(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() > arr2.size()) {
            return findKth_Problem_0_b74bd53f_927b_45d1_813e_938b2fecde75(arr2, arr1, k);
        }
        int index1 = Math.min(k/2, arr1.size() - 1);
        int index2 = k - index1 - 1;
        if (arr1.get(index1) < arr2.get(index2)) {
            return findKth_Problem_0_b74bd53f_927b_45d1_813e_938b2fecde75(new ArrayList<Integer>(arr1.subList(index1 + 1, arr1.size())), arr2, k - index1 - 1);
        } else {
            return findKth_Problem_0_b74bd53f_927b_45d1_813e_938b2fecde75(arr1, new ArrayList<Integer>(arr2.subList(index2 + 1, arr2.size())), k - index2 - 1);
        }
    }

    
    public static int findKth_Problem_1_bb2ba83b_7b1f_4491_885e_3a2364276615(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        //Code Here
        if (arr1 == null || arr1.isEmpty() || arr2 == null || arr2.isEmpty()) {
            return 0;
        }
        int low = 0;
        int high = arr1.size();
        if (k <= high) {
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (mid == k) {
                    return arr1.get(mid);
                }
                else if (mid > k) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }
        else {
            return 0;
        }
        return 0;
    }

    
    public static int findKth_Problem_0_4dd7d11f_8a60_4d2e_9cf3_22d1d52bc8ff(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int result = 0;
        int comp = 0;
        int l1 = arr1.size();
        int l2 = arr2.size();
        if (k < arr1.get(0))
            return arr1.get(0);
        if (k < arr2.get(0))
            return arr2.get(0);
        if (arr1.get(0) == arr2.get(0)) {
            while (comp < l1) {
                if (arr1.get(comp) <= k)
                    result |= (1L << (arr1.get(comp) + 1));
                comp++;
            }
            while (comp < l2) {
                if (arr2.get(comp) <= k)
                    result |= (1L << (arr2.get(comp) + 1));
                comp++;
            }
        }
        if (comp == l1) {
            while (comp < l2) {
                if (arr2.get(comp) <= k)
                    result |= (1L << (arr2.get(comp) + 1));
                comp++;
            }
        }
        if (comp == l2) {
            while (comp < l1) {
                if (arr1.get(comp) <= k)
                    result |= (1L << (arr1.get(comp) + 1));
                comp++;
            }
        }
        return result;
    }

    
    public static int findKth_Problem_0_6fedbf3f_92e2_4fdf_8653_98e051b5c829(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get( k);
        }
        if (arr2.size() == 0) {
            return arr1.get( k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 =  Math.min(k / 2, arr1.size() - 1);
        int mid2 =  Math.min(k / 2, arr2.size() - 1);
        if (arr1.get(mid1) < arr2.get(mid2)) {
            return findKth_Problem_0_6fedbf3f_92e2_4fdf_8653_98e051b5c829(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
        } else {
            return findKth_Problem_0_6fedbf3f_92e2_4fdf_8653_98e051b5c829(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
        }
    }

    
    public static int findKth_Problem_0_a971454e_b1d4_471e_86fd_823f4a59c8b8(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get( (k - 1));
        }
        if (arr2.size() == 0) {
            return arr1.get( (k - 1));
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 =  Math.min(k / 2, arr1.size());
        int mid2 =  Math.min(k / 2, arr2.size());
        if (arr1.get(mid1 - 1) < arr2.get(mid2 - 1)) {
            ArrayList<Integer> newArr1 = new ArrayList<Integer>(arr1.subList(mid1, arr1.size()));
            return findKth_Problem_0_a971454e_b1d4_471e_86fd_823f4a59c8b8(newArr1, arr2, k - mid1);
        } else {
            ArrayList<Integer> newArr2 = new ArrayList<Integer>(arr2.subList(mid2, arr2.size()));
            return findKth_Problem_0_a971454e_b1d4_471e_86fd_823f4a59c8b8(arr1, newArr2, k - mid2);
        }
    }

    
    public static int findKth_Problem_0_abe82fe9_c4c3_426c_b8b8_4758ee480815(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        while (i < arr1.size() && j < arr2.size() && k > 0) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        if (k == 0) {
            return Math.min(arr1.get(i), arr2.get(j));
        } else if (i == arr1.size()) {
            return arr2.get( k - 1);
        } else {
            return arr1.get( k - 1);
        }
    }

    
    public static int findKth_Problem_0_4e27b670_589d_4abf_ba8a_22708d909c53(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(arr1.size() / 2);
        int mid2 = arr2.get(arr2.size() / 2);
        if (mid1 < mid2) {
            ArrayList<Integer> newArr1 = new ArrayList<Integer>(arr1.subList(arr1.size() / 2 + 1, arr1.size()));
            ArrayList<Integer> newArr2 = new ArrayList<Integer>(arr2.subList(0, arr2.size() / 2));
            return findKth_Problem_0_4e27b670_589d_4abf_ba8a_22708d909c53(newArr1, newArr2, k - arr1.size() / 2 - 1);
        } else {
            ArrayList<Integer> newArr1 = new ArrayList<Integer>(arr1.subList(0, arr1.size() / 2));
            ArrayList<Integer> newArr2 = new ArrayList<Integer>(arr2.subList(arr2.size() / 2 + 1, arr2.size()));
            return findKth_Problem_0_4e27b670_589d_4abf_ba8a_22708d909c53(newArr1, newArr2, k - arr2.size() / 2 - 1);
        }
    }

    
    public static int findKth_Problem_1_6fedbf3f_92e2_4fdf_8653_98e051b5c829(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get( k);
        }
        if (arr2.size() == 0) {
            return arr1.get( k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 =  Math.min(k / 2, arr1.size() - 1);
        int mid2 =  Math.min(k / 2, arr2.size() - 1);
        if (arr1.get(mid1) < arr2.get(mid2)) {
            return findKth_Problem_1_6fedbf3f_92e2_4fdf_8653_98e051b5c829(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
        } else {
            return findKth_Problem_1_6fedbf3f_92e2_4fdf_8653_98e051b5c829(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
        }
    }

    
    public static int findKth_Problem_0_acb0d5e7_a06f_4b9c_a7f9_6bbe8a380f99(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (count < k) {
            if (i >= arr1.size()) {
                j++;
            } else if (j >= arr2.size()) {
                i++;
            } else if (arr1.get( i) < arr2.get( j)) {
                i++;
            } else {
                j++;
            }
            count++;
        }
        if (i >= arr1.size()) {
            return arr2.get( j);
        } else if (j >= arr2.size()) {
            return arr1.get( i);
        } else {
            return Math.min(arr1.get( i), arr2.get( j));
        }
    }

    
    public static int findKth_Problem_2_ea01bcdf_1cbc_4ff8_bb60_4a3a146d99db(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        //write your code here
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr1.size(); i++) {
            sum += arr1.get(i);
        }
        for (int i = 0; i < arr2.size(); i++) {
            sum1 += arr2.get(i);
        }
        int max1 = sum1 / k;
        int max2 = sum2 / k;
        int max = (sum1 + sum2) / 2;
        if (max1 < max2) {
            return max1;
        } else if (max2 < max1) {
            return max2;
        } else if (max1 == max2) {
            if (sum == max) {
                return max;
            } else {
                return max1;
            }
        } else {
            return max1;
        }

    }

    
    public static int findKth_Problem_0_efdecb5a_3789_401f_adb0_1135f9c8ce83(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int a = arr1.get( Math.min(k / 2, arr1.size()) - 1);
        int b = arr2.get( Math.min(k / 2, arr2.size()) - 1);
        if (a < b) {
            return findKth_Problem_0_efdecb5a_3789_401f_adb0_1135f9c8ce83(new ArrayList<Integer>(arr1.subList( Math.min(k / 2, arr1.size()), arr1.size())), arr2, k - Math.min(k / 2, arr1.size()));
        } else {
            return findKth_Problem_0_efdecb5a_3789_401f_adb0_1135f9c8ce83(arr1, new ArrayList<Integer>(arr2.subList( Math.min(k / 2, arr2.size()), arr2.size())), k - Math.min(k / 2, arr2.size()));
        }
    }

    
    public static int findKth_Problem_0_6453d333_eb81_46fd_8c16_918c252bbd24(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get( k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get( k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() >= k / 2 ? arr1.get( k / 2 - 1) : Integer.MAX_VALUE;
        int mid2 = arr2.size() >= k / 2 ? arr2.get( k / 2 - 1) : Integer.MAX_VALUE;
        if (mid1 < mid2) {
            return findKth_Problem_0_6453d333_eb81_46fd_8c16_918c252bbd24(new ArrayList<Integer>(arr1.subList( k / 2, arr1.size())), arr2, k - k / 2);
        } else {
            return findKth_Problem_0_6453d333_eb81_46fd_8c16_918c252bbd24(arr1, new ArrayList<Integer>(arr2.subList( k / 2, arr2.size())), k - k / 2);
        }
    }

    
    public static int findKth_Problem_2_8a1b02c0_9027_405b_93e8_005426a61a43(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
                count++;
            } else {
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
                count++;
            }
        }
        while (i < arr1.size()) {
            if (count == k) {
                return arr1.get(i);
            }
            i++;
            count++;
        }
        while (j < arr2.size()) {
            if (count == k) {
                return arr2.get(j);
            }
            j++;
            count++;
        }
        return -1;
    }

    
    public static int findKth_Problem_0_b55809cf_b6b3_47da_ac2a_3e3cf5f16b53(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        while (k > 0) {
            if (i < arr1.size() && j < arr2.size()) {
                if (arr1.get(i) < arr2.get(j)) {
                    i++;
                } else {
                    j++;
                }
            } else if (i < arr1.size()) {
                i++;
            } else if (j < arr2.size()) {
                j++;
            }
            k--;
        }
        if (i < arr1.size() && j < arr2.size()) {
            return Math.min(arr1.get(i), arr2.get(j));
        } else if (i < arr1.size()) {
            return arr1.get(i);
        } else if (j < arr2.size()) {
            return arr2.get(j);
        }
        return -1;
    }

    
    public static int findKth_Problem_1_5d4758d2_6e0c_4248_8746_1849e0e7766c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        int n = arr1.size();
        int m = arr2.size();
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < n && j < m) {
            if (arr1.get( i) < arr2.get( j)) {
                count++;
                if (count == k) {
                    return arr1.get( i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get( j);
                }
                j++;
            }
        }
        while (i < n) {
            count++;
            if (count == k) {
                return arr1.get( i);
            }
            i++;
        }
        while (j < m) {
            count++;
            if (count == k) {
                return arr2.get( j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_0_17f4fd35_2de8_4242_9092_3a8680f1df36(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Declare variable
        int count = 0;
        // Declare two list
        ArrayList<Integer> list1 = new ArrayList<Integer>(arr1);
        ArrayList<Integer> list2 = new ArrayList<Integer>(arr2);

        // Scan all the elements of list1 from 1st to end
        for(int i=0; i<list1.size(); i++) {
            // Check if k is equal to current element in list1
            if(list1.get(i) == k) {
                count++;
            }
        }
        // Scan all the elements of list2 from 1st to end
        for(int j=0; j<list2.size(); j++) {
            // Check if k is equal to current element in list2
            if(list2.get(j) == k) {
                count++;
            }
        }
        return count;
    }

    
    public static int findKth_Problem_2_69d12098_1812_43e7_8e95_3a26fbfb9acc(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get( k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get( k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() > arr2.size()) {
            return findKth_Problem_2_69d12098_1812_43e7_8e95_3a26fbfb9acc(arr2, arr1, k);
        }
        int i =  Math.min(arr1.size(), k / 2);
        int j =  Math.min(arr2.size(), k / 2);
        if (arr1.get(i - 1) > arr2.get(j - 1)) {
            return findKth_Problem_2_69d12098_1812_43e7_8e95_3a26fbfb9acc(arr1, new ArrayList<Integer>(arr2.subList(j, arr2.size())), k - j);
        } else {
            return findKth_Problem_2_69d12098_1812_43e7_8e95_3a26fbfb9acc(new ArrayList<Integer>(arr1.subList(i, arr1.size())), arr2, k - i);
        }
    }

    
    public static int findKth_Problem_0_e70f9632_3596_42b2_90d7_69032ba662bf(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) return arr2.get(k - 1);
        if (arr2.size() == 0) return arr1.get(k - 1);
        if (k == 1) return Math.min(arr1.get(0), arr2.get(0));
        int mid1 = (arr1.size() >= k/2) ? arr1.get(k/2 - 1) : Integer.MAX_VALUE;
        int mid2 = (arr2.size() >= k/2) ? arr2.get(k/2 - 1) : Integer.MAX_VALUE;
        if (mid1 < mid2) {
            return findKth_Problem_0_e70f9632_3596_42b2_90d7_69032ba662bf(new ArrayList<Integer>(arr1.subList(k/2, arr1.size())), arr2, k - k/2);
        } else {
            return findKth_Problem_0_e70f9632_3596_42b2_90d7_69032ba662bf(arr1, new ArrayList<Integer>(arr2.subList(k/2, arr2.size())), k - k/2);
        }
    }

    
    public static int findKth_Problem_2_051421f3_ae67_4541_b232_575727becf5e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_1_534a3f2b_30a5_48b6_bfbe_c3ff00a87f70(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int firstValue = arr1.get(0); 
        int secondValue = arr2.get(0);

        int i = 1;
        while (i <= k) {
            if (arr1.get(i) > firstValue) {
                firstValue = arr1.get(i);
            }
            if (arr2.get(i) > secondValue) {
                secondValue = arr2.get(i);
            }
            i++;
        }
        return firstValue;
    }

    
    public static int findKth_Problem_0_205251e3_7b32_4971_b5e1_969ccf3621e7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        int n = arr1.size();
        int m = arr2.size();
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < n && j < m) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < n) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < m) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_2_65e30825_85c7_408e_8577_b110e16df9ed(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i = Math.min(arr1.size() - 1, k / 2 - 1);
        int j = Math.min(arr2.size() - 1, k / 2 - 1);
        if (arr1.get(i) > arr2.get(j)) {
            return findKth_Problem_2_65e30825_85c7_408e_8577_b110e16df9ed(arr1, new ArrayList<Integer>(arr2.subList(j + 1, arr2.size())), k - j - 1);
        } else {
            return findKth_Problem_2_65e30825_85c7_408e_8577_b110e16df9ed(new ArrayList<Integer>(arr1.subList(i + 1, arr1.size())), arr2, k - i - 1);
        }
    }

    
    public static int findKth_Problem_0_c6218613_4064_41c3_92ac_506de1acfa12(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int count = 0;
        int i = 0;
        int j = 0;
        int size = arr1.size();
        while (i < size && j < size) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
                j++;
            }
        }
        return -1;
    }

    
    public static int findKth_Problem_2_59428adf_8c31_4813_874c_6156103d03db(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (k == arr1.size() + arr2.size() - 1) {
            return Math.max(arr1.get(arr1.size() - 1), arr2.get(arr2.size() - 1));
        }
        int mid1 = arr1.get((k / 2));
        int mid2 = arr2.get((k / 2));
        if (mid1 < mid2) {
            return findKth_Problem_2_59428adf_8c31_4813_874c_6156103d03db(new ArrayList<Integer>(arr1.subList((k / 2), arr1.size())), arr2, k - k / 2);
        } else {
            return findKth_Problem_2_59428adf_8c31_4813_874c_6156103d03db(arr1, new ArrayList<Integer>(arr2.subList((k / 2), arr2.size())), k - k / 2);
        }
    }

    
    public static int findKth_Problem_1_30ffdced_e132_414a_a5cb_901acd9cff92(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int count = 0;
        int i = 0;
        int j = 0;
        while (count < k) {
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
        return arr1.get(i);
    }

    
    public static int findKth_Problem_0_20e2f203_6dc8_4488_86d3_75a88b9d9c60(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (k > n + m) {
            return -1;
        }
        if (n == 0) {
            return arr2.get(k - 1);
        }
        if (m == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i = Math.min(n, k / 2);
        int j = Math.min(m, k / 2);
        if (arr1.get(i - 1) > arr2.get(j - 1)) {
            return findKth_Problem_0_20e2f203_6dc8_4488_86d3_75a88b9d9c60(arr1, new ArrayList<Integer>(arr2.subList(j, m)), k - j);
        } else {
            return findKth_Problem_0_20e2f203_6dc8_4488_86d3_75a88b9d9c60(new ArrayList<Integer>(arr1.subList(i, n)), arr2, k - i);
        }
    }

    
    public static int findKth_Problem_1_55cfdeb9_5036_4ff0_a463_dbf873c93770(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (k > n + m) {
            return -1;
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.get(n - 1) < arr2.get(0)) {
            return arr1.get( k - 1);
        }
        if (arr2.get(m - 1) < arr1.get(0)) {
            return arr2.get( k - 1);
        }
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (arr1.get(i) < arr2.get(j)) {
                if (k == 1) {
                    return arr1.get(i);
                }
                i++;
                k--;
            } else {
                if (k == 1) {
                    return arr2.get(j);
                }
                j++;
                k--;
            }
        }
        if (i < n) {
            return arr1.get( k - 1);
        }
        if (j < m) {
            return arr2.get( k - 1);
        }
        return -1;
    }

    
    public static int findKth_Problem_1_1be5851c_2a18_4a85_a8da_522865976ead(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(Math.min(k/2, arr1.size()-1));
        int mid2 = arr2.get(Math.min(k/2, arr2.size()-1));
        if (mid1 < mid2) {
            return findKth_Problem_1_1be5851c_2a18_4a85_a8da_522865976ead(new ArrayList<Integer>(arr1.subList(Math.min(k/2, arr1.size()-1), arr1.size())), arr2, k - Math.min(k/2, arr1.size()-1));
        } else {
            return findKth_Problem_1_1be5851c_2a18_4a85_a8da_522865976ead(arr1, new ArrayList<Integer>(arr2.subList(Math.min(k/2, arr2.size()-1), arr2.size())), k - Math.min(k/2, arr2.size()-1));
        }
    }

    
    public static int findKth_Problem_1_b9e6264a_5e29_4464_b17b_c4daceb4a950(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        return 0;
    }

    
    public static int findKth_Problem_1_4b55ea00_bbeb_4fac_b3e8_03334aaca300(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int k1 = Math.min(k / 2, arr1.size());
        int k2 = Math.min(k / 2, arr2.size());
        if (arr1.get(k1 - 1) < arr2.get(k2 - 1)) {
            return findKth_Problem_1_4b55ea00_bbeb_4fac_b3e8_03334aaca300(new ArrayList<Integer>(arr1.subList(k1, arr1.size())), arr2, k - k1);
        } else {
            return findKth_Problem_1_4b55ea00_bbeb_4fac_b3e8_03334aaca300(arr1, new ArrayList<Integer>(arr2.subList(k2, arr2.size())), k - k2);
        }
    }

    
    public static int findKth_Problem_1_a971454e_b1d4_471e_86fd_823f4a59c8b8(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get( (k - 1));
        }
        if (arr2.size() == 0) {
            return arr1.get( (k - 1));
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 =  Math.min(k / 2, arr1.size());
        int mid2 =  Math.min(k / 2, arr2.size());
        if (arr1.get(mid1 - 1) < arr2.get(mid2 - 1)) {
            ArrayList<Integer> newArr1 = new ArrayList<Integer>(arr1.subList(mid1, arr1.size()));
            return findKth_Problem_1_a971454e_b1d4_471e_86fd_823f4a59c8b8(newArr1, arr2, k - mid1);
        } else {
            ArrayList<Integer> newArr2 = new ArrayList<Integer>(arr2.subList(mid2, arr2.size()));
            return findKth_Problem_1_a971454e_b1d4_471e_86fd_823f4a59c8b8(arr1, newArr2, k - mid2);
        }
    }

    
    public static int findKth_Problem_1_a0e753e2_f1ad_442f_816f_37e70c5566dc(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if(arr1.isEmpty()) return -1;
        if(arr2.isEmpty()) return -1;
        int l1 = arr1.get(0), l2 = arr2.get(0);
        int curr = l1-l2;
        int prevVal;
        while(k > curr) {
            prevVal = arr1.get(arr1.size()-1);
            arr1.remove(prevVal);
            arr2.remove(prevVal);
            curr -= prevVal;
            k -= prevVal;
        }
        return arr2.get(arr2.size()-1);
    }

    
    public static int findKth_Problem_0_d3b9eaaf_fd17_4dbf_be31_fe7140ab6619(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get( (k - 1));
        }
        if (arr2.size() == 0) {
            return arr1.get( (k - 1));
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i =  Math.min(k / 2, arr1.size());
        int j =  Math.min(k / 2, arr2.size());
        if (arr1.get(i - 1) < arr2.get(j - 1)) {
            return findKth_Problem_0_d3b9eaaf_fd17_4dbf_be31_fe7140ab6619(new ArrayList<Integer>(arr1.subList(i, arr1.size())), arr2, k - i);
        } else {
            return findKth_Problem_0_d3b9eaaf_fd17_4dbf_be31_fe7140ab6619(arr1, new ArrayList<Integer>(arr2.subList(j, arr2.size())), k - j);
        }
    }

    
    public static int findKth_Problem_1_c4024d56_9358_4bfe_bcd1_0f90241618b7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() * k / (arr1.size() + arr2.size());
        int mid2 = k - mid1 - 1;
        if (arr1.get(mid1) > arr2.get(mid2)) {
            ArrayList<Integer> newArr1 = new ArrayList<Integer>(arr1.subList(0, mid1));
            ArrayList<Integer> newArr2 = new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size()));
            return findKth_Problem_1_c4024d56_9358_4bfe_bcd1_0f90241618b7(newArr1, newArr2, k - mid2 - 1);
        } else {
            ArrayList<Integer> newArr1 = new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size()));
            ArrayList<Integer> newArr2 = new ArrayList<Integer>(arr2.subList(0, mid2));
            return findKth_Problem_1_c4024d56_9358_4bfe_bcd1_0f90241618b7(newArr1, newArr2, k - mid1 - 1);
        }
    }

    
    public static int findKth_Problem_1_a4a143f6_4e14_4ae6_807b_d3bcf637b84c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        } else if (arr2.size() == 0) {
            return arr1.get(k);
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_a4a143f6_4e14_4ae6_807b_d3bcf637b84c(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_1_a4a143f6_4e14_4ae6_807b_d3bcf637b84c(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_a4a143f6_4e14_4ae6_807b_d3bcf637b84c(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_1_a4a143f6_4e14_4ae6_807b_d3bcf637b84c(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_2_19ea1fef_f3b9_4950_9c68_6d2534cdfc55(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        final int len1 = arr1.size();
        final int len2 = arr2.size();
        int ret = 0;
        for (int i = 0; i < Math.min(len1, len2); i++) {
            if (i == len1) {
                if (arr1.get(i) == arr2.get(i)) {
                    ret = arr1.get(i);
                    break;
                }
            } else if (i == len2) {
                if (arr2.get(i) == arr1.get(i)) {
                    ret = arr2.get(i);
                    break;
                }
            } else {
                if (arr1.get(i) == arr2.get(i)) {
                    ret = arr1.get(i);
                    break;
                }
            }
        }
        return ret;
    }

    
    public static int findKth_Problem_1_0b90cf25_3e95_41c0_bd09_14f30d38aca7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // write your logic here
        if (arr1.size() == 0 || arr2.size() == 0 || k <= 0) {
            return -1;
        }

        int temp = 0;
        int max = arr1.get(0);
        int temp2 = 0;
        int max2 = arr2.get(0);

        for (int i = 1; i < arr1.size(); i++) {
            max = Math.max(max, arr1.get(i));
        }
        for (int i = 1; i < arr2.size(); i++) {
            max2 = Math.max(max2, arr2.get(i));
        }
        int x = max;
        int y = max2;

        int mid = (x + y) / 2;

        for (int i = 0; i <= k; i++) {
            int count = 0;
            int mid2 = (x + y) / 2;

            while (x != mid2) {
                x = mid2;
                mid2 = ((x + y) / 2);
                count += 1;
            }
            x += count;
        }
        int kth = Math.max((x + y) / 2, max);
        // System.out.println(kth);
        System.out.println("Max Element from Array 1: " + x);
        System.out.println("Max Element from Array 2: " + y);
        System.out.println("Index of kth Element: " + k);

        return kth;
    }

    
    public static int findKth_Problem_2_bd9aa0c9_77f6_44a7_b0c8_3be769d766a7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int l1 = arr1.get(arr1.size()-1);
        int l2 = arr2.get(arr2.size()-1);
        if(k <= l1 || k >= l2)
            return -1;
        else if(k == l1)
            return arr2.get(arr2.size()-1);
        else if(k == l2)
            return arr1.get(arr1.size()-1);
        else if(k <= (l1+l2)/2)
            return findKth_Problem_2_bd9aa0c9_77f6_44a7_b0c8_3be769d766a7(arr1, arr2, k/2);
        else
            return findKth_Problem_2_bd9aa0c9_77f6_44a7_b0c8_3be769d766a7(arr2, arr1, k/2);
    }

    
    public static int findKth_Problem_1_3efb9273_9981_4d1b_8aff_fabc0283cc54(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) return arr2.get(k);
        if (arr2.size() == 0) return arr1.get(k);
        if (k == 0) return Math.min(arr1.get(0), arr2.get(0));
        if (k == arr1.size() + arr2.size() - 1) return Math.max(arr1.get(arr1.size() - 1), arr2.get(arr2.size() - 1));
        int mid1 = arr1.get((k / 2));
        int mid2 = arr2.get((k / 2));
        if (mid1 < mid2) {
            return findKth_Problem_1_3efb9273_9981_4d1b_8aff_fabc0283cc54(new ArrayList<Integer>(arr1.subList((k / 2) + 1, arr1.size())), arr2, k - (k / 2) - 1);
        } else {
            return findKth_Problem_1_3efb9273_9981_4d1b_8aff_fabc0283cc54(arr1, new ArrayList<Integer>(arr2.subList((k / 2) + 1, arr2.size())), k - (k / 2) - 1);
        }
    }

    
    public static int findKth_Problem_2_70d53e11_bab4_475b_9d90_1e2309d73fda(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() > arr2.size()) {
            return findKth_Problem_2_70d53e11_bab4_475b_9d90_1e2309d73fda(arr2, arr1, k);
        }
        int a = Math.min(k / 2, arr1.size());
        int b = k - a;
        if (arr1.get(a - 1) < arr2.get(b - 1)) {
            return findKth_Problem_2_70d53e11_bab4_475b_9d90_1e2309d73fda(new ArrayList<Integer>(arr1.subList(a, arr1.size())), arr2, k - a);
        } else if (arr1.get(a - 1) > arr2.get(b - 1)) {
            return findKth_Problem_2_70d53e11_bab4_475b_9d90_1e2309d73fda(arr1, new ArrayList<Integer>(arr2.subList(b, arr2.size())), k - b);
        } else {
            return arr1.get(a - 1);
        }
    }

    
    public static int findKth_Problem_0_f288f55c_1332_45a7_8ace_dc1605bcd6d9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 1 && arr2.size() == 1) {
            return Math.max(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(arr1.size()/2);
        int mid2 = arr2.get(arr2.size()/2);
        if (mid1 < mid2) {
            if (k <= arr1.size()/2 + arr2.size()/2) {
                return findKth_Problem_0_f288f55c_1332_45a7_8ace_dc1605bcd6d9(new ArrayList<Integer>(arr1.subList(0, arr1.size()/2)), arr2, k);
            } else {
                return findKth_Problem_0_f288f55c_1332_45a7_8ace_dc1605bcd6d9(arr1, new ArrayList<Integer>(arr2.subList(arr2.size()/2, arr2.size())), k - arr2.size()/2);
            }
        } else {
            if (k <= arr1.size()/2 + arr2.size()/2) {
                return findKth_Problem_0_f288f55c_1332_45a7_8ace_dc1605bcd6d9(arr1, new ArrayList<Integer>(arr2.subList(0, arr2.size()/2)), k);
            } else {
                return findKth_Problem_0_f288f55c_1332_45a7_8ace_dc1605bcd6d9(new ArrayList<Integer>(arr1.subList(arr1.size()/2, arr1.size())), arr2, k - arr1.size()/2);
            }
        }
    }

    
    public static int findKth_Problem_0_2c5ba380_2837_4a3c_b936_adcb0c24760a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_2c5ba380_2837_4a3c_b936_adcb0c24760a(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_0_2c5ba380_2837_4a3c_b936_adcb0c24760a(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_2c5ba380_2837_4a3c_b936_adcb0c24760a(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_0_2c5ba380_2837_4a3c_b936_adcb0c24760a(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_1_d4669cc5_5116_4be4_958f_8d5698f55d9e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (k > (n + m)) {
            return -1;
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i = Math.min(n,  k / 2);
        int j = Math.min(m,  k / 2);
        if (arr1.get(i - 1) > arr2.get(j - 1)) {
            ArrayList<Integer> new_arr = new ArrayList<Integer>(arr2.subList(j, m));
            return findKth_Problem_1_d4669cc5_5116_4be4_958f_8d5698f55d9e(arr1, new_arr, k - j);
        } else {
            ArrayList<Integer> new_arr = new ArrayList<Integer>(arr1.subList(i, n));
            return findKth_Problem_1_d4669cc5_5116_4be4_958f_8d5698f55d9e(new_arr, arr2, k - i);
        }
    }

    
    public static int findKth_Problem_1_4b0d417a_5503_4640_8564_e33916aa0c93(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        ArrayList<Integer> arr3 = new ArrayList<Integer>();
        int count = 0;
        for (int i = 0; i <= arr1.size(); i++) {
            if (arr1.get(i) < arr2.get(i)) {
                arr3.add(arr1.get(i));
                count++;
            } else {
                arr3.add(arr2.get(i));
            }
        }
        if (arr1.size() - 1 == arr3.size()) {
            return arr1.get(arr1.size() - 1);
        }
        if (arr2.size() - 1 == arr3.size()) {
            return arr2.get(arr2.size() - 1);
        }
        int first = findKth_Problem_1_4b0d417a_5503_4640_8564_e33916aa0c93(arr3, arr2, k);
        if (arr3.get(arr3.size() - 1) == first) {
            return arr3.get(arr3.size() - 1);
        }
        return first;
    }

    
    public static int findKth_Problem_0_9d1ce91d_341e_4655_9362_48010b7a25f8(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 1 && arr2.size() == 1) {
            return Math.max(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(arr1.size()/2);
        int mid2 = arr2.get(arr2.size()/2);
        if (mid1 < mid2) {
            if (k <= arr1.size()/2 + arr2.size()/2) {
                return findKth_Problem_0_9d1ce91d_341e_4655_9362_48010b7a25f8(new ArrayList<Integer>(arr1.subList(0, arr1.size()/2)), arr2, k);
            } else {
                return findKth_Problem_0_9d1ce91d_341e_4655_9362_48010b7a25f8(arr1, new ArrayList<Integer>(arr2.subList(arr2.size()/2, arr2.size())), k - arr2.size()/2);
            }
        } else {
            if (k <= arr1.size()/2 + arr2.size()/2) {
                return findKth_Problem_0_9d1ce91d_341e_4655_9362_48010b7a25f8(arr1, new ArrayList<Integer>(arr2.subList(0, arr2.size()/2)), k);
            } else {
                return findKth_Problem_0_9d1ce91d_341e_4655_9362_48010b7a25f8(new ArrayList<Integer>(arr1.subList(arr1.size()/2, arr1.size())), arr2, k - arr1.size()/2);
            }
        }
    }

    
    public static int findKth_Problem_2_1fcf2901_d4f7_471b_8dd1_77c5ffdab3b4(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        ArrayList<Integer> arr3 = new ArrayList<Integer>();
        int min1 = arr1.get(arr1.size()-1);
        int min2 = arr2.get(arr2.size()-1);
        int i = 0;
        int next1 = 0;
        int next2 = 0;
        int min = 0;
        while (i < arr1.size() - 1) {
            next1 = min1 + arr1.get(i+1);
            next2 = min2 + arr2.get(i+1);
            min = next1;
            if (next1 < next2) {
                min = Math.min(next1, next2);
            }
            if (min == k) {
                arr3.add(min);
            }
            i++;
        }
        int ans = arr3.get(arr3.size()-1);
        return ans;
    }

    
    public static int findKth_Problem_0_efc897f3_c9d7_4b9f_826a_4ce58adb3ad5(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int count = 0;
        int i = 0;
        int j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
                j++;
            }
        }
        return -1;
    }

    
    public static int findKth_Problem_0_28a1eada_e86d_4ed1_8fac_244534784fca(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_1_ec7a9aaf_7fdb_49a3_89bf_2918123c144b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() > arr2.size()) {
            return findKth_Problem_1_ec7a9aaf_7fdb_49a3_89bf_2918123c144b(arr2, arr1, k);
        }
        int i = Math.min(arr1.size() - 1, k / 2);
        int j = Math.min(arr2.size() - 1, k / 2);
        if (arr1.get(i) > arr2.get(j)) {
            return findKth_Problem_1_ec7a9aaf_7fdb_49a3_89bf_2918123c144b(arr1, new ArrayList<Integer>(arr2.subList(j + 1, arr2.size())), k - j - 1);
        }
        else {
            return findKth_Problem_1_ec7a9aaf_7fdb_49a3_89bf_2918123c144b(new ArrayList<Integer>(arr1.subList(i + 1, arr1.size())), arr2, k - i - 1);
        }
    }

    
    public static int findKth_Problem_2_a971454e_b1d4_471e_86fd_823f4a59c8b8(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get( (k - 1));
        }
        if (arr2.size() == 0) {
            return arr1.get( (k - 1));
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 =  Math.min(k / 2, arr1.size());
        int mid2 =  Math.min(k / 2, arr2.size());
        if (arr1.get(mid1 - 1) < arr2.get(mid2 - 1)) {
            ArrayList<Integer> newArr1 = new ArrayList<Integer>(arr1.subList(mid1, arr1.size()));
            return findKth_Problem_2_a971454e_b1d4_471e_86fd_823f4a59c8b8(newArr1, arr2, k - mid1);
        } else {
            ArrayList<Integer> newArr2 = new ArrayList<Integer>(arr2.subList(mid2, arr2.size()));
            return findKth_Problem_2_a971454e_b1d4_471e_86fd_823f4a59c8b8(arr1, newArr2, k - mid2);
        }
    }

    
    public static int findKth_Problem_1_c6218613_4064_41c3_92ac_506de1acfa12(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int count = 0;
        int i = 0;
        int j = 0;
        int size = arr1.size();
        while (i < size && j < size) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
                j++;
            }
        }
        return -1;
    }

    
    public static int findKth_Problem_2_b49f970f_61a9_46a2_a8e6_652436ef9810(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 1 && arr2.size() == 1) {
            return Math.max(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_b49f970f_61a9_46a2_a8e6_652436ef9810(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_2_b49f970f_61a9_46a2_a8e6_652436ef9810(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_b49f970f_61a9_46a2_a8e6_652436ef9810(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_2_b49f970f_61a9_46a2_a8e6_652436ef9810(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_1_051421f3_ae67_4541_b232_575727becf5e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_1_fcca2229_11db_48c6_ae97_085fc55ff4eb(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_1_2074d18a_794c_435d_a2ec_695918015271(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int count = 0;
        int arr1Size = arr1.size();
        int arr2Size = arr2.size();
        int kthSum = 0;
        int sum = 0;
        int mid = (arr1Size + arr2Size) / 2;
        for (int i = 0; i < arr1Size && count < k; i++) {
            if (arr1.get(i) < mid) {
                sum += arr1.get(i);
                count++;
            }
        }
        for (int j = 0; j < arr2Size && count < k; j++) {
            if (arr2.get(j) < mid) {
                sum += arr2.get(j);
                count++;
            }
        }
        if (sum >= kthSum) {
            return sum;
        }
        while (kthSum < sum) {
            mid = (arr1Size + arr2Size) / 2;
            sum = 0;
            for (int i = 0; i < arr1Size && count < k; i++) {
                if (arr1.get(i) < mid) {
                    sum += arr1.get(i);
                    count++;
                }
            }
            for (int j = 0; j < arr2Size && count < k; j++) {
                if (arr2.get(j) < mid) {
                    sum += arr2.get(j);
                    count++;
                }
            }
            if (sum >= kthSum) {
                return sum;
            }
            kthSum += mid;
        }
        return sum;
    }

    
    public static int findKth_Problem_2_1a4e3afe_cd60_4060_9477_622b47098ccf(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if(arr1.size() == 0) return arr2.get(k);
        if(arr2.size() == 0) return arr1.get(k);
        if(k == 0) return Math.min(arr1.get(0), arr2.get(0));
        int i = Math.min(arr1.size()-1, k/2);
        int j = Math.min(arr2.size()-1, k/2);
        if(arr1.get(i) > arr2.get(j)) {
            return findKth_Problem_2_1a4e3afe_cd60_4060_9477_622b47098ccf(arr1, new ArrayList<Integer>(arr2.subList(j+1, arr2.size())), k-j-1);
        } else {
            return findKth_Problem_2_1a4e3afe_cd60_4060_9477_622b47098ccf(new ArrayList<Integer>(arr1.subList(i+1, arr1.size())), arr2, k-i-1);
        }
    }

    
    public static int findKth_Problem_1_8b3a5730_3bd7_48aa_ab2a_35df3d91b529(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (k > (n + m)) {
            return -1;
        }
        if (n == 0) {
            return arr2.get( k - 1);
        }
        if (m == 0) {
            return arr1.get( k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i = Math.min(n,  k / 2);
        int j = Math.min(m,  k / 2);
        if (arr1.get(i - 1) > arr2.get(j - 1)) {
            ArrayList<Integer> newArr = new ArrayList<Integer>();
            for (int x = j; x < m; x++) {
                newArr.add(arr2.get(x));
            }
            return findKth_Problem_1_8b3a5730_3bd7_48aa_ab2a_35df3d91b529(arr1, newArr, k - j);
        } else {
            ArrayList<Integer> newArr = new ArrayList<Integer>();
            for (int x = i; x < n; x++) {
                newArr.add(arr1.get(x));
            }
            return findKth_Problem_1_8b3a5730_3bd7_48aa_ab2a_35df3d91b529(newArr, arr2, k - i);
        }
    }

    
    public static int findKth_Problem_2_30fad773_f5ce_462e_b24e_f5a778552c88(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) return arr2.get(k-1);
        if (arr2.size() == 0) return arr1.get(k-1);
        if (k == 1) return Math.min(arr1.get(0), arr2.get(0));
        if (arr1.size() > arr2.size()) return findKth_Problem_2_30fad773_f5ce_462e_b24e_f5a778552c88(arr2, arr1, k);
        int i = Math.min(k/2, arr1.size());
        int j = k - i;
        if (arr1.get(i-1) < arr2.get(j-1)) {
            ArrayList<Integer> arr = new ArrayList<Integer>(arr1.subList(i, arr1.size()));
            return findKth_Problem_2_30fad773_f5ce_462e_b24e_f5a778552c88(arr, arr2, k-i);
        }
        else if (arr1.get(i-1) > arr2.get(j-1)) {
            ArrayList<Integer> arr = new ArrayList<Integer>(arr2.subList(j, arr2.size()));
            return findKth_Problem_2_30fad773_f5ce_462e_b24e_f5a778552c88(arr1, arr, k-j);
        }
        else return arr1.get(i-1);
    }

    
    public static int findKth_Problem_0_9a2e175d_faaf_40da_8637_a786b87a597b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = Math.min(k/2, arr1.size() - 1);
        int mid2 = Math.min(k/2, arr2.size() - 1);
        if (arr1.get(mid1) < arr2.get(mid2)) {
            return findKth_Problem_0_9a2e175d_faaf_40da_8637_a786b87a597b(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
        } else {
            return findKth_Problem_0_9a2e175d_faaf_40da_8637_a786b87a597b(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
        }
    }

    
    public static int findKth_Problem_1_87004ba6_da91_47f7_aee4_656f88234458(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (arr1.get(0) < arr2.get(0)) {
            arr1.remove(0);
            return findKth_Problem_1_87004ba6_da91_47f7_aee4_656f88234458(arr1, arr2, k - 1);
        } else {
            arr2.remove(0);
            return findKth_Problem_1_87004ba6_da91_47f7_aee4_656f88234458(arr1, arr2, k - 1);
        }
    }

    
    public static int findKth_Problem_2_f288f55c_1332_45a7_8ace_dc1605bcd6d9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 1 && arr2.size() == 1) {
            return Math.max(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(arr1.size()/2);
        int mid2 = arr2.get(arr2.size()/2);
        if (mid1 < mid2) {
            if (k <= arr1.size()/2 + arr2.size()/2) {
                return findKth_Problem_2_f288f55c_1332_45a7_8ace_dc1605bcd6d9(new ArrayList<Integer>(arr1.subList(0, arr1.size()/2)), arr2, k);
            } else {
                return findKth_Problem_2_f288f55c_1332_45a7_8ace_dc1605bcd6d9(arr1, new ArrayList<Integer>(arr2.subList(arr2.size()/2, arr2.size())), k - arr2.size()/2);
            }
        } else {
            if (k <= arr1.size()/2 + arr2.size()/2) {
                return findKth_Problem_2_f288f55c_1332_45a7_8ace_dc1605bcd6d9(arr1, new ArrayList<Integer>(arr2.subList(0, arr2.size()/2)), k);
            } else {
                return findKth_Problem_2_f288f55c_1332_45a7_8ace_dc1605bcd6d9(new ArrayList<Integer>(arr1.subList(arr1.size()/2, arr1.size())), arr2, k - arr1.size()/2);
            }
        }
    }

    
    public static int findKth_Problem_0_fcca2229_11db_48c6_ae97_085fc55ff4eb(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_1_1d2d5a03_75d8_4762_a582_33ce21814c83(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_1d2d5a03_75d8_4762_a582_33ce21814c83(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_1_1d2d5a03_75d8_4762_a582_33ce21814c83(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_1d2d5a03_75d8_4762_a582_33ce21814c83(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_1_1d2d5a03_75d8_4762_a582_33ce21814c83(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_0_c57565c8_f957_47ff_b566_f2c2e3bfdf0e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get( k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get( k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i =  Math.min(k / 2, arr1.size());
        int j =  Math.min(k / 2, arr2.size());
        if (arr1.get(i - 1) < arr2.get(j - 1)) {
            return findKth_Problem_0_c57565c8_f957_47ff_b566_f2c2e3bfdf0e(new ArrayList<Integer>(arr1.subList(i, arr1.size())), arr2, k - i);
        } else {
            return findKth_Problem_0_c57565c8_f957_47ff_b566_f2c2e3bfdf0e(arr1, new ArrayList<Integer>(arr2.subList(j, arr2.size())), k - j);
        }
    }

    
    public static int findKth_Problem_0_90162c15_5ddc_4934_992b_3fd558310b63(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (k == 0 || k > arr1.size() || arr2.size() == 0 || arr2.size() < k) {
            return -1;
        }
        int firstElem = arr1.get(0);
        int secondElem = arr2.get(0);
        int diff = secondElem - firstElem;
        if (diff > arr1.get(arr1.size() - 1)) {
            secondElem = arr1.get(arr1.size() - 1);
            diff = secondElem - firstElem;
        }
        int index = -1;
        if (diff == 0) {
            int count = 0;
            for (int i = 0; i < arr2.size(); i++) {
                if (secondElem == arr2.get(i)) {
                    count++;
                    if (count == k) {
                        index = i;
                        return firstElem + (index - index / 2);
                    }
                }
            }
        }
        return -1;
    }

    
    public static int findKth_Problem_2_aa7981d8_ef18_4579_aef8_a2e11a60cc38(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (k > n + m) {
            return -1;
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i = Math.min(k / 2, n);
        int j = Math.min(k / 2, m);
        if (arr1.get( i - 1) > arr2.get( j - 1)) {
            return findKth_Problem_2_aa7981d8_ef18_4579_aef8_a2e11a60cc38(arr1, new ArrayList<Integer>(arr2.subList( j,  m)), k - j);
        } else {
            return findKth_Problem_2_aa7981d8_ef18_4579_aef8_a2e11a60cc38(new ArrayList<Integer>(arr1.subList( i,  n)), arr2, k - i);
        }
    }

    
    public static int findKth_Problem_2_cfeb2334_ce6a_4927_a547_d3a1c99beff7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        int n = arr1.size(), m = arr2.size();
        while (i < n && j < m) {
            if (arr1.get(i) < arr2.get(j)) {
                if (i + j + 1 == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                if (i + j + 1 == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        if (i < n) {
            return arr1.get((k - m - 1));
        }
        return arr2.get((k - n - 1));
    }

    
    public static int findKth_Problem_2_004b13cd_8b47_4b56_9e9c_2493eadc5c3e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() > arr2.size()) {
            return findKth_Problem_2_004b13cd_8b47_4b56_9e9c_2493eadc5c3e(arr2, arr1, k);
        }
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i = Math.min(k / 2, arr1.size());
        int j = k - i;
        if (arr1.get(i - 1) > arr2.get(j - 1)) {
            return findKth_Problem_2_004b13cd_8b47_4b56_9e9c_2493eadc5c3e(arr1, new ArrayList<Integer>(arr2.subList(j, arr2.size())), k - j);
        } else {
            return findKth_Problem_2_004b13cd_8b47_4b56_9e9c_2493eadc5c3e(new ArrayList<Integer>(arr1.subList(i, arr1.size())), arr2, k - i);
        }
    }

    
    public static int findKth_Problem_0_4b0d417a_5503_4640_8564_e33916aa0c93(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        ArrayList<Integer> arr3 = new ArrayList<Integer>();
        int count = 0;
        for (int i = 0; i <= arr1.size(); i++) {
            if (arr1.get(i) < arr2.get(i)) {
                arr3.add(arr1.get(i));
                count++;
            } else {
                arr3.add(arr2.get(i));
            }
        }
        if (arr1.size() - 1 == arr3.size()) {
            return arr1.get(arr1.size() - 1);
        }
        if (arr2.size() - 1 == arr3.size()) {
            return arr2.get(arr2.size() - 1);
        }
        int first = findKth_Problem_0_4b0d417a_5503_4640_8564_e33916aa0c93(arr3, arr2, k);
        if (arr3.get(arr3.size() - 1) == first) {
            return arr3.get(arr3.size() - 1);
        }
        return first;
    }

    
    public static int findKth_Problem_0_6e46801c_4990_4ceb_a59e_910865fa6a7d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int count = 0;
        int i = 0;
        int j = 0;
        int size = arr1.size();
        while (i < size && j < size) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
                j++;
            }
        }
        return -1;
    }

    
    public static int findKth_Problem_2_5ac789f4_bb1c_4116_8a86_e5a26fb78fc1(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (k > (n + m)) {
            return -1;
        }
        if (n == 0) {
            return arr2.get(k - 1);
        }
        if (m == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i = Math.min(n, k/2);
        int j = Math.min(m, k/2);
        if (arr1.get(i - 1) > arr2.get(j - 1)) {
            ArrayList<Integer> new_arr = new ArrayList<Integer>();
            for (int x = j; x < m; x++) {
                new_arr.add(arr2.get(x));
            }
            return findKth_Problem_2_5ac789f4_bb1c_4116_8a86_e5a26fb78fc1(arr1, new_arr, k - j);
        } else {
            ArrayList<Integer> new_arr = new ArrayList<Integer>();
            for (int x = i; x < n; x++) {
                new_arr.add(arr1.get(x));
            }
            return findKth_Problem_2_5ac789f4_bb1c_4116_8a86_e5a26fb78fc1(new_arr, arr2, k - i);
        }
    }

    
    public static int findKth_Problem_1_b24c9d76_74f8_4c05_86be_adab2bbbc045(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(Math.min(k/2, arr1.size()) - 1);
        int mid2 = arr2.get(Math.min(k/2, arr2.size()) - 1);
        if (mid1 < mid2) {
            return findKth_Problem_1_b24c9d76_74f8_4c05_86be_adab2bbbc045(new ArrayList<Integer>(arr1.subList(Math.min(k/2, arr1.size()), arr1.size())), arr2, k - Math.min(k/2, arr1.size()));
        } else {
            return findKth_Problem_1_b24c9d76_74f8_4c05_86be_adab2bbbc045(arr1, new ArrayList<Integer>(arr2.subList(Math.min(k/2, arr2.size()), arr2.size())), k - Math.min(k/2, arr2.size()));
        }
    }

    
    public static int findKth_Problem_0_2ecf9b90_edbb_432e_9a40_90a6ceeed618(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int low = arr1.get(0); // initialize low to first element of first array
        int high = arr2.get(arr2.size()-1); // initialize high to last element of second array
        int mid = (low+high)/2;
        int count = 0;
        while(low<=high){
            count++;
            if(count==k){
                return mid;
            }
            if(count>k){
                high = arr2.get(arr2.size()-1);
            }
            else if(count<k){
                low = arr1.get(0); // initialize low to first element of first array
            }
            mid = (low+high)/2;
        }
        return -1;
    }

    
    public static int findKth_Problem_2_e70f9632_3596_42b2_90d7_69032ba662bf(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) return arr2.get(k - 1);
        if (arr2.size() == 0) return arr1.get(k - 1);
        if (k == 1) return Math.min(arr1.get(0), arr2.get(0));
        int mid1 = (arr1.size() >= k/2) ? arr1.get(k/2 - 1) : Integer.MAX_VALUE;
        int mid2 = (arr2.size() >= k/2) ? arr2.get(k/2 - 1) : Integer.MAX_VALUE;
        if (mid1 < mid2) {
            return findKth_Problem_2_e70f9632_3596_42b2_90d7_69032ba662bf(new ArrayList<Integer>(arr1.subList(k/2, arr1.size())), arr2, k - k/2);
        } else {
            return findKth_Problem_2_e70f9632_3596_42b2_90d7_69032ba662bf(arr1, new ArrayList<Integer>(arr2.subList(k/2, arr2.size())), k - k/2);
        }
    }

    
    public static int findKth_Problem_0_517179c6_5369_46a5_a178_920546d18446(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 1 && arr2.size() == 1) {
            return Math.max(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_517179c6_5369_46a5_a178_920546d18446(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_0_517179c6_5369_46a5_a178_920546d18446(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_517179c6_5369_46a5_a178_920546d18446(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_0_517179c6_5369_46a5_a178_920546d18446(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_1_59428adf_8c31_4813_874c_6156103d03db(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (k == arr1.size() + arr2.size() - 1) {
            return Math.max(arr1.get(arr1.size() - 1), arr2.get(arr2.size() - 1));
        }
        int mid1 = arr1.get((k / 2));
        int mid2 = arr2.get((k / 2));
        if (mid1 < mid2) {
            return findKth_Problem_1_59428adf_8c31_4813_874c_6156103d03db(new ArrayList<Integer>(arr1.subList((k / 2), arr1.size())), arr2, k - k / 2);
        } else {
            return findKth_Problem_1_59428adf_8c31_4813_874c_6156103d03db(arr1, new ArrayList<Integer>(arr2.subList((k / 2), arr2.size())), k - k / 2);
        }
    }

    
    public static int findKth_Problem_0_5d4758d2_6e0c_4248_8746_1849e0e7766c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        int n = arr1.size();
        int m = arr2.size();
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < n && j < m) {
            if (arr1.get( i) < arr2.get( j)) {
                count++;
                if (count == k) {
                    return arr1.get( i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get( j);
                }
                j++;
            }
        }
        while (i < n) {
            count++;
            if (count == k) {
                return arr1.get( i);
            }
            i++;
        }
        while (j < m) {
            count++;
            if (count == k) {
                return arr2.get( j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_2_7c5196fa_1dcc_4206_bd0f_c594c7cae45d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_7c5196fa_1dcc_4206_bd0f_c594c7cae45d(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_2_7c5196fa_1dcc_4206_bd0f_c594c7cae45d(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_7c5196fa_1dcc_4206_bd0f_c594c7cae45d(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_2_7c5196fa_1dcc_4206_bd0f_c594c7cae45d(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_0_b9e6264a_5e29_4464_b17b_c4daceb4a950(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        return 0;
    }

    
    public static int findKth_Problem_0_4e47c23d_4351_4d6e_975e_c02d28c05784(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (k > (n + m)) {
            return -1;
        }
        if (n == 0) {
            return arr2.get( k - 1);
        }
        if (m == 0) {
            return arr1.get( k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i = Math.min(n, k / 2);
        int j = Math.min(m, k / 2);
        if (arr1.get( i - 1) > arr2.get( j - 1)) {
            return findKth_Problem_0_4e47c23d_4351_4d6e_975e_c02d28c05784(arr1, new ArrayList<Integer>(arr2.subList( j,  m)), k - j);
        } else {
            return findKth_Problem_0_4e47c23d_4351_4d6e_975e_c02d28c05784(new ArrayList<Integer>(arr1.subList( i,  n)), arr2, k - i);
        }
    }

    
    public static int findKth_Problem_1_aaa7417a_dc05_4d2c_bcc0_a77211847bad(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        int i = 0;
        int j = 0;
        int kth = 0;
        while (k > 0) {
            if (i < arr1.size() && j < arr2.size()) {
                if (arr1.get(i) < arr2.get(j)) {
                    kth = arr1.get(i);
                    i++;
                } else {
                    kth = arr2.get(j);
                    j++;
                }
            } else if (i < arr1.size()) {
                kth = arr1.get(i);
                i++;
            } else if (j < arr2.size()) {
                kth = arr2.get(j);
                j++;
            }
            k--;
        }
        return kth;
    }

    
    public static int findKth_Problem_1_65e30825_85c7_408e_8577_b110e16df9ed(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i = Math.min(arr1.size() - 1, k / 2 - 1);
        int j = Math.min(arr2.size() - 1, k / 2 - 1);
        if (arr1.get(i) > arr2.get(j)) {
            return findKth_Problem_1_65e30825_85c7_408e_8577_b110e16df9ed(arr1, new ArrayList<Integer>(arr2.subList(j + 1, arr2.size())), k - j - 1);
        } else {
            return findKth_Problem_1_65e30825_85c7_408e_8577_b110e16df9ed(new ArrayList<Integer>(arr1.subList(i + 1, arr1.size())), arr2, k - i - 1);
        }
    }

    
    public static int findKth_Problem_2_e5fe3832_65b1_4a26_b630_81f4b0e701b4(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (k > arr1.size() + arr2.size()) {
            return -1;
        }
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = Math.min(k / 2, arr1.size());
        int mid2 = Math.min(k / 2, arr2.size());
        if (arr1.get(mid1 - 1) < arr2.get(mid2 - 1)) {
            return findKth_Problem_2_e5fe3832_65b1_4a26_b630_81f4b0e701b4(new ArrayList<Integer>(arr1.subList(mid1, arr1.size())), arr2, k - mid1);
        } else {
            return findKth_Problem_2_e5fe3832_65b1_4a26_b630_81f4b0e701b4(arr1, new ArrayList<Integer>(arr2.subList(mid2, arr2.size())), k - mid2);
        }
    }

    
    public static int findKth_Problem_1_c57565c8_f957_47ff_b566_f2c2e3bfdf0e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get( k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get( k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i =  Math.min(k / 2, arr1.size());
        int j =  Math.min(k / 2, arr2.size());
        if (arr1.get(i - 1) < arr2.get(j - 1)) {
            return findKth_Problem_1_c57565c8_f957_47ff_b566_f2c2e3bfdf0e(new ArrayList<Integer>(arr1.subList(i, arr1.size())), arr2, k - i);
        } else {
            return findKth_Problem_1_c57565c8_f957_47ff_b566_f2c2e3bfdf0e(arr1, new ArrayList<Integer>(arr2.subList(j, arr2.size())), k - j);
        }
    }

    
    public static int findKth_Problem_0_cc7b57f6_7c77_4f42_9858_e5a313d8157d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int kth = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                kth = arr1.get(i);
                i++;
            } else {
                kth = arr2.get(j);
                j++;
            }
            if (i + j == k) {
                break;
            }
        }
        if (i == arr1.size()) {
            while (j < arr2.size()) {
                kth = arr2.get(j);
                j++;
                if (i + j == k) {
                    break;
                }
            }
        } else if (j == arr2.size()) {
            while (i < arr1.size()) {
                kth = arr1.get(i);
                i++;
                if (i + j == k) {
                    break;
                }
            }
        }
        return kth;
    }

    
    public static int findKth_Problem_2_a696f654_0db6_4895_9f82_d29afde5571a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int kth = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                kth = arr1.get(i);
                i++;
            } else {
                kth = arr2.get(j);
                j++;
            }
            k--;
            if (k == 0) {
                break;
            }
        }
        while (i < arr1.size()) {
            kth = arr1.get(i);
            i++;
            k--;
            if (k == 0) {
                break;
            }
        }
        while (j < arr2.size()) {
            kth = arr2.get(j);
            j++;
            k--;
            if (k == 0) {
                break;
            }
        }
        return kth;
    }

    
    public static int findKth_Problem_2_117bb787_34ca_4676_8b5b_d83e2e40a022(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (k > arr1.size() + arr2.size()) return -1;
        if (arr1.size() == 0) return arr2.get(k - 1);
        if (arr2.size() == 0) return arr1.get(k - 1);
        if (k == 1) return Math.min(arr1.get(0), arr2.get(0));
        int mid1 = Math.min(k / 2, arr1.size());
        int mid2 = Math.min(k / 2, arr2.size());
        if (arr1.get(mid1 - 1) < arr2.get(mid2 - 1)) {
            return findKth_Problem_2_117bb787_34ca_4676_8b5b_d83e2e40a022(new ArrayList<Integer>(arr1.subList(mid1, arr1.size())), arr2, k - mid1);
        } else {
            return findKth_Problem_2_117bb787_34ca_4676_8b5b_d83e2e40a022(arr1, new ArrayList<Integer>(arr2.subList(mid2, arr2.size())), k - mid2);
        }
    }

    
    public static int findKth_Problem_0_bc2a39df_ae01_40a3_86e6_b676dde502d2(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() > arr2.size()) {
            return findKth_Problem_0_bc2a39df_ae01_40a3_86e6_b676dde502d2(arr2, arr1, k);
        }
        int i = Math.min(k / 2, arr1.size());
        int j = k - i;
        if (arr1.get(i - 1) < arr2.get(j - 1)) {
            ArrayList<Integer> newArr1 = new ArrayList<Integer>(arr1.subList(i, arr1.size()));
            return findKth_Problem_0_bc2a39df_ae01_40a3_86e6_b676dde502d2(newArr1, arr2, k - i);
        } else if (arr1.get(i - 1) > arr2.get(j - 1)) {
            ArrayList<Integer> newArr2 = new ArrayList<Integer>(arr2.subList(j, arr2.size()));
            return findKth_Problem_0_bc2a39df_ae01_40a3_86e6_b676dde502d2(arr1, newArr2, k - j);
        } else {
            return arr1.get(i - 1);
        }
    }

    
    public static int findKth_Problem_0_ab877506_9953_4142_ab16_6d6c575b49d5(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(Math.min(k/2, arr1.size()-1));
        int mid2 = arr2.get(Math.min(k/2, arr2.size()-1));
        if (mid1 < mid2) {
            return findKth_Problem_0_ab877506_9953_4142_ab16_6d6c575b49d5(new ArrayList<Integer>(arr1.subList(Math.min(k/2, arr1.size()-1), arr1.size())), arr2, k - Math.min(k/2, arr1.size()));
        } else {
            return findKth_Problem_0_ab877506_9953_4142_ab16_6d6c575b49d5(arr1, new ArrayList<Integer>(arr2.subList(Math.min(k/2, arr2.size()-1), arr2.size())), k - Math.min(k/2, arr2.size()));
        }
    }

    
    public static int findKth_Problem_1_8a1b02c0_9027_405b_93e8_005426a61a43(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
                count++;
            } else {
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
                count++;
            }
        }
        while (i < arr1.size()) {
            if (count == k) {
                return arr1.get(i);
            }
            i++;
            count++;
        }
        while (j < arr2.size()) {
            if (count == k) {
                return arr2.get(j);
            }
            j++;
            count++;
        }
        return -1;
    }

    
    public static int findKth_Problem_2_5ccc651d_6fed_4d6e_bfbd_e7de6c56c178(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
                j++;
            }
        }
        return -1;
    }

    
    public static int findKth_Problem_0_83b9b31a_d603_4e77_b639_73acbac60ac1(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 1 && arr2.size() == 1) {
            return Math.max(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(arr1.size() / 2);
        int mid2 = arr2.get(arr2.size() / 2);
        if (mid1 < mid2) {
            if (k <= arr1.size() / 2 + arr2.size() / 2) {
                return findKth_Problem_0_83b9b31a_d603_4e77_b639_73acbac60ac1(new ArrayList<Integer>(arr1.subList(0, arr1.size() / 2)), arr2, k);
            } else {
                return findKth_Problem_0_83b9b31a_d603_4e77_b639_73acbac60ac1(arr1, new ArrayList<Integer>(arr2.subList(arr2.size() / 2 + 1, arr2.size())), k - arr2.size() / 2 - 1);
            }
        } else {
            if (k <= arr1.size() / 2 + arr2.size() / 2) {
                return findKth_Problem_0_83b9b31a_d603_4e77_b639_73acbac60ac1(arr1, new ArrayList<Integer>(arr2.subList(0, arr2.size() / 2)), k);
            } else {
                return findKth_Problem_0_83b9b31a_d603_4e77_b639_73acbac60ac1(new ArrayList<Integer>(arr1.subList(arr1.size() / 2 + 1, arr1.size())), arr2, k - arr1.size() / 2 - 1);
            }
        }
    }

    
    public static int findKth_Problem_2_7ebb8b0c_1628_4ab0_bf29_edc57704e9c8(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        int last = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                last = arr1.get(i);
                i++;
            } else {
                last = arr2.get(j);
                j++;
            }
            count++;
            if (count == k) {
                break;
            }
        }
        if (i == arr1.size()) {
            while (j < arr2.size()) {
                last = arr2.get(j);
                j++;
                count++;
                if (count == k) {
                    break;
                }
            }
        }
        if (j == arr2.size()) {
            while (i < arr1.size()) {
                last = arr1.get(i);
                i++;
                count++;
                if (count == k) {
                    break;
                }
            }
        }
        return last;
    }

    
    public static int findKth_Problem_1_5fff58d2_6c92_422e_9f4f_f6229a561786(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 1 && arr2.size() == 1) {
            return Math.max(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_5fff58d2_6c92_422e_9f4f_f6229a561786(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_1_5fff58d2_6c92_422e_9f4f_f6229a561786(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_5fff58d2_6c92_422e_9f4f_f6229a561786(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_1_5fff58d2_6c92_422e_9f4f_f6229a561786(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_1_0d162a35_b79b_4961_82bf_4c9b7f406381(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (k > (n + m)) {
            return -1;
        }
        if (n > m) {
            return findKth_Problem_1_0d162a35_b79b_4961_82bf_4c9b7f406381(arr2, arr1, k);
        }
        if (n == 0) {
            return arr2.get( k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i = Math.min(n, k / 2);
        int j = Math.min(m, k / 2);
        if (arr1.get( i - 1) > arr2.get( j - 1)) {
            return findKth_Problem_1_0d162a35_b79b_4961_82bf_4c9b7f406381(arr1, new ArrayList<Integer>(arr2.subList( j,  m)), k - j);
        } else {
            return findKth_Problem_1_0d162a35_b79b_4961_82bf_4c9b7f406381(new ArrayList<Integer>(arr1.subList( i,  n)), arr2, k - i);
        }
    }

    
    public static int findKth_Problem_1_19ea1fef_f3b9_4950_9c68_6d2534cdfc55(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        final int len1 = arr1.size();
        final int len2 = arr2.size();
        int ret = 0;
        for (int i = 0; i < Math.min(len1, len2); i++) {
            if (i == len1) {
                if (arr1.get(i) == arr2.get(i)) {
                    ret = arr1.get(i);
                    break;
                }
            } else if (i == len2) {
                if (arr2.get(i) == arr1.get(i)) {
                    ret = arr2.get(i);
                    break;
                }
            } else {
                if (arr1.get(i) == arr2.get(i)) {
                    ret = arr1.get(i);
                    break;
                }
            }
        }
        return ret;
    }

    
    public static int findKth_Problem_1_9afd64b9_7534_4516_b475_bf1b758082f2(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                ArrayList<Integer> newArr = new ArrayList<Integer>();
                for (int i = mid2 + 1; i < arr2.size(); i++) {
                    newArr.add(arr2.get(i));
                }
                return findKth_Problem_1_9afd64b9_7534_4516_b475_bf1b758082f2(arr1, newArr, k - mid2 - 1);
            } else {
                ArrayList<Integer> newArr = new ArrayList<Integer>();
                for (int i = mid1 + 1; i < arr1.size(); i++) {
                    newArr.add(arr1.get(i));
                }
                return findKth_Problem_1_9afd64b9_7534_4516_b475_bf1b758082f2(newArr, arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                ArrayList<Integer> newArr = new ArrayList<Integer>();
                for (int i = 0; i < mid2; i++) {
                    newArr.add(arr2.get(i));
                }
                return findKth_Problem_1_9afd64b9_7534_4516_b475_bf1b758082f2(arr1, newArr, k);
            } else {
                ArrayList<Integer> newArr = new ArrayList<Integer>();
                for (int i = 0; i < mid1; i++) {
                    newArr.add(arr1.get(i));
                }
                return findKth_Problem_1_9afd64b9_7534_4516_b475_bf1b758082f2(newArr, arr2, k);
            }
        }
    }

    
    public static int findKth_Problem_0_3131093a_ad34_46b4_a231_bf290ca43946(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k-1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k-1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() >= k/2 ? arr1.get(k/2-1) : Integer.MAX_VALUE;
        int mid2 = arr2.size() >= k/2 ? arr2.get(k/2-1) : Integer.MAX_VALUE;
        if (mid1 < mid2) {
            return findKth_Problem_0_3131093a_ad34_46b4_a231_bf290ca43946(new ArrayList<Integer>(arr1.subList(k/2, arr1.size())), arr2, k - k/2);
        } else {
            return findKth_Problem_0_3131093a_ad34_46b4_a231_bf290ca43946(arr1, new ArrayList<Integer>(arr2.subList(k/2, arr2.size())), k - k/2);
        }
    }

    
    public static int findKth_Problem_0_5ac789f4_bb1c_4116_8a86_e5a26fb78fc1(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (k > (n + m)) {
            return -1;
        }
        if (n == 0) {
            return arr2.get(k - 1);
        }
        if (m == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i = Math.min(n, k/2);
        int j = Math.min(m, k/2);
        if (arr1.get(i - 1) > arr2.get(j - 1)) {
            ArrayList<Integer> new_arr = new ArrayList<Integer>();
            for (int x = j; x < m; x++) {
                new_arr.add(arr2.get(x));
            }
            return findKth_Problem_0_5ac789f4_bb1c_4116_8a86_e5a26fb78fc1(arr1, new_arr, k - j);
        } else {
            ArrayList<Integer> new_arr = new ArrayList<Integer>();
            for (int x = i; x < n; x++) {
                new_arr.add(arr1.get(x));
            }
            return findKth_Problem_0_5ac789f4_bb1c_4116_8a86_e5a26fb78fc1(new_arr, arr2, k - i);
        }
    }

    
    public static int findKth_Problem_1_b90c75b7_08a8_48b5_870f_f8df981131cd(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(Math.min(k / 2, arr1.size()) - 1);
        int mid2 = arr2.get(Math.min(k / 2, arr2.size()) - 1);
        if (mid1 < mid2) {
            return findKth_Problem_1_b90c75b7_08a8_48b5_870f_f8df981131cd(new ArrayList<Integer>(arr1.subList(Math.min(k / 2, arr1.size()), arr1.size())), arr2, k - Math.min(k / 2, arr1.size()));
        } else {
            return findKth_Problem_1_b90c75b7_08a8_48b5_870f_f8df981131cd(arr1, new ArrayList<Integer>(arr2.subList(Math.min(k / 2, arr2.size()), arr2.size())), k - Math.min(k / 2, arr2.size()));
        }
    }

    
    public static int findKth_Problem_0_94fe36dc_c134_4a40_ae3e_ef9120865668(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_94fe36dc_c134_4a40_ae3e_ef9120865668(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_0_94fe36dc_c134_4a40_ae3e_ef9120865668(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_94fe36dc_c134_4a40_ae3e_ef9120865668(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_0_94fe36dc_c134_4a40_ae3e_ef9120865668(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_1_fce8f59d_3b62_4f96_bf41_ff432114cc04(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() > arr2.size()) {
            return findKth_Problem_1_fce8f59d_3b62_4f96_bf41_ff432114cc04(arr2, arr1, k);
        }
        int mid1 = Math.min(k / 2, arr1.size());
        int mid2 = k - mid1;
        if (arr1.get(mid1 - 1) < arr2.get(mid2 - 1)) {
            return findKth_Problem_1_fce8f59d_3b62_4f96_bf41_ff432114cc04(new ArrayList<Integer>(arr1.subList(mid1, arr1.size())), arr2, k - mid1);
        } else if (arr1.get(mid1 - 1) > arr2.get(mid2 - 1)) {
            return findKth_Problem_1_fce8f59d_3b62_4f96_bf41_ff432114cc04(arr1, new ArrayList<Integer>(arr2.subList(mid2, arr2.size())), k - mid2);
        } else {
            return arr1.get(mid1 - 1);
        }
    }

    
    public static int findKth_Problem_2_fe9621b1_5f0c_4143_9e78_2257a3d7067a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        while (k > 0) {
            if (i >= arr1.size()) {
                return arr2.get( (j + k - 1));
            }
            if (j >= arr2.size()) {
                return arr1.get( (i + k - 1));
            }
            if (arr1.get( i) < arr2.get( j)) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        return Math.min(arr1.get( i), arr2.get( j));
    }

    
    public static int findKth_Problem_1_efdecb5a_3789_401f_adb0_1135f9c8ce83(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int a = arr1.get( Math.min(k / 2, arr1.size()) - 1);
        int b = arr2.get( Math.min(k / 2, arr2.size()) - 1);
        if (a < b) {
            return findKth_Problem_1_efdecb5a_3789_401f_adb0_1135f9c8ce83(new ArrayList<Integer>(arr1.subList( Math.min(k / 2, arr1.size()), arr1.size())), arr2, k - Math.min(k / 2, arr1.size()));
        } else {
            return findKth_Problem_1_efdecb5a_3789_401f_adb0_1135f9c8ce83(arr1, new ArrayList<Integer>(arr2.subList( Math.min(k / 2, arr2.size()), arr2.size())), k - Math.min(k / 2, arr2.size()));
        }
    }

    
    public static int findKth_Problem_0_58fd0016_9ec3_4068_acdf_b7e71652f9b3(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Your code goes here
        int x = arr1.get(0); 
        int y = 0;
        for(int i = 1; i < arr2.size(); i++){
            if(arr2.get(i) == x){
                y = i-1;
            }
        }
        if(arr2.get(y) < k){
            return arr2.get(y);
        }
        else{
            return arr2.get(y+1);
        }
    }

    
    public static int findKth_Problem_1_2ecf9b90_edbb_432e_9a40_90a6ceeed618(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int low = arr1.get(0); // initialize low to first element of first array
        int high = arr2.get(arr2.size()-1); // initialize high to last element of second array
        int mid = (low+high)/2;
        int count = 0;
        while(low<=high){
            count++;
            if(count==k){
                return mid;
            }
            if(count>k){
                high = arr2.get(arr2.size()-1);
            }
            else if(count<k){
                low = arr1.get(0); // initialize low to first element of first array
            }
            mid = (low+high)/2;
        }
        return -1;
    }

    
    public static int findKth_Problem_1_4577ad26_3076_4712_8ba4_153048038039(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() + arr2.size() < k) {
            return -1;
        }
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() >= k / 2 ? arr1.get(k / 2 - 1) : Integer.MAX_VALUE;
        int mid2 = arr2.size() >= k / 2 ? arr2.get(k / 2 - 1) : Integer.MAX_VALUE;
        if (mid1 < mid2) {
            return findKth_Problem_1_4577ad26_3076_4712_8ba4_153048038039(new ArrayList<Integer>(arr1.subList(k / 2, arr1.size())), arr2, k - k / 2);
        } else {
            return findKth_Problem_1_4577ad26_3076_4712_8ba4_153048038039(arr1, new ArrayList<Integer>(arr2.subList(k / 2, arr2.size())), k - k / 2);
        }
    }

    
    public static int findKth_Problem_2_1d2d5a03_75d8_4762_a582_33ce21814c83(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_1d2d5a03_75d8_4762_a582_33ce21814c83(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_2_1d2d5a03_75d8_4762_a582_33ce21814c83(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_1d2d5a03_75d8_4762_a582_33ce21814c83(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_2_1d2d5a03_75d8_4762_a582_33ce21814c83(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_1_004b13cd_8b47_4b56_9e9c_2493eadc5c3e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() > arr2.size()) {
            return findKth_Problem_1_004b13cd_8b47_4b56_9e9c_2493eadc5c3e(arr2, arr1, k);
        }
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i = Math.min(k / 2, arr1.size());
        int j = k - i;
        if (arr1.get(i - 1) > arr2.get(j - 1)) {
            return findKth_Problem_1_004b13cd_8b47_4b56_9e9c_2493eadc5c3e(arr1, new ArrayList<Integer>(arr2.subList(j, arr2.size())), k - j);
        } else {
            return findKth_Problem_1_004b13cd_8b47_4b56_9e9c_2493eadc5c3e(new ArrayList<Integer>(arr1.subList(i, arr1.size())), arr2, k - i);
        }
    }

    
    public static int findKth_Problem_2_2074d18a_794c_435d_a2ec_695918015271(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int count = 0;
        int arr1Size = arr1.size();
        int arr2Size = arr2.size();
        int kthSum = 0;
        int sum = 0;
        int mid = (arr1Size + arr2Size) / 2;
        for (int i = 0; i < arr1Size && count < k; i++) {
            if (arr1.get(i) < mid) {
                sum += arr1.get(i);
                count++;
            }
        }
        for (int j = 0; j < arr2Size && count < k; j++) {
            if (arr2.get(j) < mid) {
                sum += arr2.get(j);
                count++;
            }
        }
        if (sum >= kthSum) {
            return sum;
        }
        while (kthSum < sum) {
            mid = (arr1Size + arr2Size) / 2;
            sum = 0;
            for (int i = 0; i < arr1Size && count < k; i++) {
                if (arr1.get(i) < mid) {
                    sum += arr1.get(i);
                    count++;
                }
            }
            for (int j = 0; j < arr2Size && count < k; j++) {
                if (arr2.get(j) < mid) {
                    sum += arr2.get(j);
                    count++;
                }
            }
            if (sum >= kthSum) {
                return sum;
            }
            kthSum += mid;
        }
        return sum;
    }

    
    public static int findKth_Problem_1_83b9b31a_d603_4e77_b639_73acbac60ac1(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 1 && arr2.size() == 1) {
            return Math.max(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(arr1.size() / 2);
        int mid2 = arr2.get(arr2.size() / 2);
        if (mid1 < mid2) {
            if (k <= arr1.size() / 2 + arr2.size() / 2) {
                return findKth_Problem_1_83b9b31a_d603_4e77_b639_73acbac60ac1(new ArrayList<Integer>(arr1.subList(0, arr1.size() / 2)), arr2, k);
            } else {
                return findKth_Problem_1_83b9b31a_d603_4e77_b639_73acbac60ac1(arr1, new ArrayList<Integer>(arr2.subList(arr2.size() / 2 + 1, arr2.size())), k - arr2.size() / 2 - 1);
            }
        } else {
            if (k <= arr1.size() / 2 + arr2.size() / 2) {
                return findKth_Problem_1_83b9b31a_d603_4e77_b639_73acbac60ac1(arr1, new ArrayList<Integer>(arr2.subList(0, arr2.size() / 2)), k);
            } else {
                return findKth_Problem_1_83b9b31a_d603_4e77_b639_73acbac60ac1(new ArrayList<Integer>(arr1.subList(arr1.size() / 2 + 1, arr1.size())), arr2, k - arr1.size() / 2 - 1);
            }
        }
    }

    
    public static int findKth_Problem_2_e0843e84_2bad_4635_9cd4_16c1d8684802(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (k > n + m) {
            return -1;
        }
        if (k == n + m) {
            return Math.max(arr1.get(n - 1), arr2.get(m - 1));
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i =  Math.min(k / 2, n);
        int j =  (k - i);
        if (arr1.get(i - 1) < arr2.get(j - 1)) {
            return findKth_Problem_2_e0843e84_2bad_4635_9cd4_16c1d8684802(new ArrayList<Integer>(arr1.subList(i, n)), arr2, k - i);
        } else if (arr1.get(i - 1) > arr2.get(j - 1)) {
            return findKth_Problem_2_e0843e84_2bad_4635_9cd4_16c1d8684802(arr1, new ArrayList<Integer>(arr2.subList(j, m)), k - j);
        } else {
            return arr1.get(i - 1);
        }
    }

    
    public static int findKth_Problem_1_3659b97a_ba68_4d3a_9da5_568aac42a2af(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i =  Math.min(k / 2, arr1.size());
        int j =  Math.min(k / 2, arr2.size());
        if (arr1.get(i - 1) < arr2.get(j - 1)) {
            return findKth_Problem_1_3659b97a_ba68_4d3a_9da5_568aac42a2af(new ArrayList<Integer>(arr1.subList(i, arr1.size())), arr2, k - i);
        } else {
            return findKth_Problem_1_3659b97a_ba68_4d3a_9da5_568aac42a2af(arr1, new ArrayList<Integer>(arr2.subList(j, arr2.size())), k - j);
        }
    }

    
    public static int findKth_Problem_1_0a57ce50_632d_45b9_915c_89e2bc1b46d6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1 == null || arr2 == null) {
            System.out.println("Null ArrayLists");
            return 0;
        }
        if (arr1.size() < arr2.size()) {
            System.out.println("ArrayList 1 size is smaller than ArrayList 2");
            return 0;
        }
        int low = 0;
        int high = arr1.size() - 1;
        int mid = 0;
        int mid2 = 0;
        int res = 0;
        int flag = 0;
        if (arr1.size() < 3) {
            if (arr1.size() < arr2.size()) {
                System.out.println("ArrayList 1 size is smaller than ArrayList 2");
                return 0;
            }
        } else if (arr1.size() > arr2.size()) {
            System.out.println("ArrayList 1 size is greater than ArrayList 2");
            return 0;
        }
        while (high >= low) {
            mid = (low + high) / 2;
            mid2 =  (arr1.get(mid) * (arr2.get(mid) / arr1.get(mid)));
            if (mid2 == k)
                return arr1.get(mid);
            if (mid2 > k)
                low = mid + 1;
            else
                high = mid - 1;
        }
        System.out.println("Element not found");
        return 0;
    }

    
    public static int findKth_Problem_0_f1408c60_c610_46e8_b905_5463123ed9fc(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int k1 = arr1.get(0);
        int k2 = arr2.get(0);
        if (k1 > k2) {
            int t = k1;
            k1 = k2;
            k2 = t;
        }
        int max1 = arr1.get(arr1.size() - 1);
        int max2 = arr2.get(arr2.size() - 1);
        if (max1 < max2) {
            return k1;
        } else if (max1 > max2) {
            return k2;
        } else {
            int i = 0;
            int j = 0;
            while (j < k - 1) {
                if (arr1.get(i) < arr2.get(j)) {
                    i++;
                } else if (arr1.get(i) > arr2.get(j)) {
                    j++;
                } else {
                    break;
                }
            }
            if (j == k - 1) {
                return arr1.get(i - 1);
            } else if (i == k - 1) {
                return arr2.get(j - 1);
            } else {
                return arr1.get(i - 1) + findKth_Problem_0_f1408c60_c610_46e8_b905_5463123ed9fc(arr1, arr2, j - 1);
            }
        }
    }

    
    public static int findKth_Problem_1_0f2a5347_bb83_4a02_8f07_d9504bd41cc5(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int res = 0;
        for (int i = 0; i < arr2.size(); i++) {
            if (arr1.size() - k + 1 >= arr2.get(i)) {
                if (arr1.get(i) < arr2.get(i)) {
                    res = arr2.get(i);
                    break;
                } else if (arr1.get(i) > arr2.get(i)) {
                    res = arr1.get(i);
                    break;
                } else if (arr1.get(i) == arr2.get(i)) {
                    res = arr1.get(i);
                    break;
                }
            }
        }
        return res;
    }

    
    public static int findKth_Problem_1_57fe2fe0_6059_4029_b406_041685e70fda(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (n == 0)
            return arr2.get( k - 1);
        if (m == 0)
            return arr1.get( k - 1);
        if (k == 1)
            return Math.min(arr1.get(0), arr2.get(0));
        int i = Math.min(n, k / 2);
        int j = Math.min(m, k / 2);
        if (arr1.get( i - 1) > arr2.get( j - 1)) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for (int x = j; x < m; x++)
                temp.add(arr2.get( x));
            return findKth_Problem_1_57fe2fe0_6059_4029_b406_041685e70fda(arr1, temp, k - j);
        } else {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for (int x = i; x < n; x++)
                temp.add(arr1.get( x));
            return findKth_Problem_1_57fe2fe0_6059_4029_b406_041685e70fda(temp, arr2, k - i);
        }
    }

    
    public static int findKth_Problem_1_b879532d_5ccd_4dc1_be58_3a618378513e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (k == 0) return 0;
        if (arr1.size() == 0) return arr2.get(k - 1);
        if (arr2.size() == 0) return arr1.get(k - 1);
        if (k == 1) return Math.min(arr1.get(0), arr2.get(0));
        int mid1 = arr1.get(Math.min(k / 2, arr1.size()) - 1);
        int mid2 = arr2.get(Math.min(k / 2, arr2.size()) - 1);
        if (mid1 < mid2) {
            ArrayList<Integer> newArr1 = new ArrayList<Integer>(arr1.subList(Math.min(k / 2, arr1.size()), arr1.size()));
            return findKth_Problem_1_b879532d_5ccd_4dc1_be58_3a618378513e(newArr1, arr2, k - Math.min(k / 2, arr1.size()));
        } else {
            ArrayList<Integer> newArr2 = new ArrayList<Integer>(arr2.subList(Math.min(k / 2, arr2.size()), arr2.size()));
            return findKth_Problem_1_b879532d_5ccd_4dc1_be58_3a618378513e(arr1, newArr2, k - Math.min(k / 2, arr2.size()));
        }
    }

    
    public static int findKth_Problem_1_72b1f688_b079_4e88_a576_9a2c7c140be6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(Math.min(k / 2, arr1.size()) - 1);
        int mid2 = arr2.get(Math.min(k / 2, arr2.size()) - 1);
        if (mid1 < mid2) {
            return findKth_Problem_1_72b1f688_b079_4e88_a576_9a2c7c140be6(new ArrayList<Integer>(arr1.subList(Math.min(k / 2, arr1.size()), arr1.size())), arr2, k - Math.min(k / 2, arr1.size()));
        } else {
            return findKth_Problem_1_72b1f688_b079_4e88_a576_9a2c7c140be6(arr1, new ArrayList<Integer>(arr2.subList(Math.min(k / 2, arr2.size()), arr2.size())), k - Math.min(k / 2, arr2.size()));
        }
    }

    
    public static int findKth_Problem_0_2c521b8f_1bf7_4987_b678_75d09ebd8290(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int sum = 0;
        if (arr1.size() > arr2.size()) {
            for (int i = 0; i < arr2.size(); i++) {
                if (arr1.get(i) >= arr2.get(i))
                    sum += arr2.get(i);
                else
                    sum += arr1.get(i);
            }
            return sum % k;
        }
        else {
            for (int i = 0; i < arr1.size(); i++) {
                if (arr1.get(i) > arr2.get(i))
                    sum += arr1.get(i);
                else
                    sum += arr2.get(i);
            }
            return sum % k;
        }
    }

    
    public static int findKth_Problem_2_fce8f59d_3b62_4f96_bf41_ff432114cc04(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() > arr2.size()) {
            return findKth_Problem_2_fce8f59d_3b62_4f96_bf41_ff432114cc04(arr2, arr1, k);
        }
        int mid1 = Math.min(k / 2, arr1.size());
        int mid2 = k - mid1;
        if (arr1.get(mid1 - 1) < arr2.get(mid2 - 1)) {
            return findKth_Problem_2_fce8f59d_3b62_4f96_bf41_ff432114cc04(new ArrayList<Integer>(arr1.subList(mid1, arr1.size())), arr2, k - mid1);
        } else if (arr1.get(mid1 - 1) > arr2.get(mid2 - 1)) {
            return findKth_Problem_2_fce8f59d_3b62_4f96_bf41_ff432114cc04(arr1, new ArrayList<Integer>(arr2.subList(mid2, arr2.size())), k - mid2);
        } else {
            return arr1.get(mid1 - 1);
        }
    }

    
    public static int findKth_Problem_1_30fad773_f5ce_462e_b24e_f5a778552c88(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) return arr2.get(k-1);
        if (arr2.size() == 0) return arr1.get(k-1);
        if (k == 1) return Math.min(arr1.get(0), arr2.get(0));
        if (arr1.size() > arr2.size()) return findKth_Problem_1_30fad773_f5ce_462e_b24e_f5a778552c88(arr2, arr1, k);
        int i = Math.min(k/2, arr1.size());
        int j = k - i;
        if (arr1.get(i-1) < arr2.get(j-1)) {
            ArrayList<Integer> arr = new ArrayList<Integer>(arr1.subList(i, arr1.size()));
            return findKth_Problem_1_30fad773_f5ce_462e_b24e_f5a778552c88(arr, arr2, k-i);
        }
        else if (arr1.get(i-1) > arr2.get(j-1)) {
            ArrayList<Integer> arr = new ArrayList<Integer>(arr2.subList(j, arr2.size()));
            return findKth_Problem_1_30fad773_f5ce_462e_b24e_f5a778552c88(arr1, arr, k-j);
        }
        else return arr1.get(i-1);
    }

    
    public static int findKth_Problem_1_65210f31_d970_436a_8b8e_633e1b6bf63e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_65210f31_d970_436a_8b8e_633e1b6bf63e(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_1_65210f31_d970_436a_8b8e_633e1b6bf63e(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_65210f31_d970_436a_8b8e_633e1b6bf63e(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_1_65210f31_d970_436a_8b8e_633e1b6bf63e(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_1_ce0cd714_dc21_471a_b29d_a47b053abdc3(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (k > n + m) {
            return -1;
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (n == 0) {
            return arr2.get(k - 1);
        }
        if (m == 0) {
            return arr1.get(k - 1);
        }
        int i = Math.min(n, k / 2);
        int j = Math.min(m, k / 2);
        if (arr1.get(i - 1) > arr2.get(j - 1)) {
            return findKth_Problem_1_ce0cd714_dc21_471a_b29d_a47b053abdc3(arr1, new ArrayList<Integer>(arr2.subList(j, m)), k - j);
        } else {
            return findKth_Problem_1_ce0cd714_dc21_471a_b29d_a47b053abdc3(new ArrayList<Integer>(arr1.subList(i, n)), arr2, k - i);
        }
    }

    
    public static int findKth_Problem_2_8896c322_c3a6_4638_ab4b_0d3956f534ff(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(arr1.size()==0 || arr2.size()==0)
            return -1L;

        int l1 = arr1.get(arr1.size()-1);
        int l2 = arr2.get(arr2.size()-1);
        if(k==1)
        {
            if(l1>l2)
                return l1; // if k is 1 then find first element from both array
            else if(l1>l2)
                return l2; // if k is 1 then find first element from both array
            else
                return -1L; // if k is 1 then find first element from both array
        }

        if(k>1 && k%2==0)
        {
            int temp = findKth_Problem_2_8896c322_c3a6_4638_ab4b_0d3956f534ff(arr1, arr2, k/2);
            if(temp==-1L)
                return -1L;
            else if(temp>l1 && temp>l2)
                return temp;
            else if(temp>l1)
                return l1;
            else
                return l2;
        }
        else if(k>1 && k%2!=0)
        {
            int temp = findKth_Problem_2_8896c322_c3a6_4638_ab4b_0d3956f534ff(arr2, arr1, k/2);
            if(temp==-1L)
                return -1L;
            else if(temp>l1 && temp>l2)
                return temp;
            else if(temp>l1)
                return l1;
            else
                return l2;
        }
        else
        {
            if(arr1.size()==1 && arr2.size()==1)
            {
                if(l1==l2)
                    return l1;
                else
                    return l2;
            }
            else
            {
                for(int i=arr1.size()-1;i>=0;i--)
                {
                    int c1 = arr1.get(i);
                    for(int j=arr2.size()-1;j>=0;j--)
                    {
                        int c2 = arr2.get(j);
                        if(c1>c2)
                        {
                            result.add(c1);
                            result.add(c2);
                            if(i==arr1.size()-1 && j==arr2.size()-1)
                            {
                                return result.get(result.size()-1);
                            }
                        }
                        else if(c1<c2)
                        {
                            result.add(c2);
                            result.add(c1);
                            if(i==arr1.size()-1 && j==arr2.size()-1)
                            {
                                return result.get(result.size()-1);
                            }
                        }
                    }
                }
                return -1L;
            }
        }
    }

    
    public static int findKth_Problem_0_80703a9d_a1a3_4645_9949_527b72ced8fa(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int count = 0;
        int i = 0;
        int j = 0;
        while (count < k) {
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
        return arr1.get(i);
    }

    
    public static int findKth_Problem_1_a8f93177_c9d8_499d_997d_366ef7c6c631(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_2_da953bb0_0aac_410d_bd43_cc75f9145461(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        int n = arr1.size(), m = arr2.size();
        while(i < n && j < m) {
            if(arr1.get(i) < arr2.get(j)) {
                if(i + j + 1 == k) {
                    return arr1.get(i);
                }
                i++;
            }
            else {
                if(i + j + 1 == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        if(i == n) {
            return arr2.get((k - n));
        }
        else {
            return arr1.get((k - m));
        }
    }

    
    public static int findKth_Problem_0_fa14d10b_6cec_4ff0_8ba6_575793e8119f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) return arr2.get(k);
        if (arr2.size() == 0) return arr1.get(k);
        if (arr1.size() + arr2.size() == k) return Math.max(arr1.get(arr1.size() - 1), arr2.get(arr2.size() - 1));
        if (arr1.size() + arr2.size() == k + 1) return Math.min(arr1.get(arr1.size() - 1), arr2.get(arr2.size() - 1));
        if (k == 0) return Math.min(arr1.get(0), arr2.get(0));
        if (k == 1) return Math.max(arr1.get(0), arr2.get(0));
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_fa14d10b_6cec_4ff0_8ba6_575793e8119f(arr1, new ArrayList<Integer>(arr2.subList(mid2, arr2.size())), k - mid2);
            } else {
                return findKth_Problem_0_fa14d10b_6cec_4ff0_8ba6_575793e8119f(new ArrayList<Integer>(arr1.subList(mid1, arr1.size())), arr2, k - mid1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_fa14d10b_6cec_4ff0_8ba6_575793e8119f(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_0_fa14d10b_6cec_4ff0_8ba6_575793e8119f(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_2_9156d909_0f94_4fee_9fe8_0e14c93733f2(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int startIndex = 0;
        int endIndex = arr2.size() - 1;

        int mid = arr1.size() / 2;

        while (startIndex < endIndex) {
            while (startIndex < mid) {
                if (arr1.get(startIndex) < arr2.get(endIndex)) {
                    endIndex--;
                } else {
                    startIndex++;
                }
            }

            while (endIndex > mid) {
                if (arr1.get(startIndex) > arr2.get(endIndex)) {
                    startIndex++;
                } else {
                    endIndex--;
                }
            }

            if (endIndex - startIndex == k) {
                return arr1.get(startIndex);
            }
        }
        return -1;
    }

    
    public static int findKth_Problem_2_aaa7417a_dc05_4d2c_bcc0_a77211847bad(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        int i = 0;
        int j = 0;
        int kth = 0;
        while (k > 0) {
            if (i < arr1.size() && j < arr2.size()) {
                if (arr1.get(i) < arr2.get(j)) {
                    kth = arr1.get(i);
                    i++;
                } else {
                    kth = arr2.get(j);
                    j++;
                }
            } else if (i < arr1.size()) {
                kth = arr1.get(i);
                i++;
            } else if (j < arr2.size()) {
                kth = arr2.get(j);
                j++;
            }
            k--;
        }
        return kth;
    }

    
    public static int findKth_Problem_2_efc897f3_c9d7_4b9f_826a_4ce58adb3ad5(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int count = 0;
        int i = 0;
        int j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
                j++;
            }
        }
        return -1;
    }

    
    public static int findKth_Problem_2_c55c845e_d816_421e_bb41_ce3f0d29f458(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() >= k / 2 ? arr1.get(k / 2 - 1) : Integer.MAX_VALUE;
        int mid2 = arr2.size() >= k / 2 ? arr2.get(k / 2 - 1) : Integer.MAX_VALUE;
        if (mid1 < mid2) {
            return findKth_Problem_2_c55c845e_d816_421e_bb41_ce3f0d29f458(new ArrayList<Integer>(arr1.subList(k / 2, arr1.size())), arr2, k - k / 2);
        } else {
            return findKth_Problem_2_c55c845e_d816_421e_bb41_ce3f0d29f458(arr1, new ArrayList<Integer>(arr2.subList(k / 2, arr2.size())), k - k / 2);
        }
    }

    
    public static int findKth_Problem_2_3efb9273_9981_4d1b_8aff_fabc0283cc54(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) return arr2.get(k);
        if (arr2.size() == 0) return arr1.get(k);
        if (k == 0) return Math.min(arr1.get(0), arr2.get(0));
        if (k == arr1.size() + arr2.size() - 1) return Math.max(arr1.get(arr1.size() - 1), arr2.get(arr2.size() - 1));
        int mid1 = arr1.get((k / 2));
        int mid2 = arr2.get((k / 2));
        if (mid1 < mid2) {
            return findKth_Problem_2_3efb9273_9981_4d1b_8aff_fabc0283cc54(new ArrayList<Integer>(arr1.subList((k / 2) + 1, arr1.size())), arr2, k - (k / 2) - 1);
        } else {
            return findKth_Problem_2_3efb9273_9981_4d1b_8aff_fabc0283cc54(arr1, new ArrayList<Integer>(arr2.subList((k / 2) + 1, arr2.size())), k - (k / 2) - 1);
        }
    }

    
    public static int findKth_Problem_1_f2e1951e_f0d4_4beb_8c8d_ab73d8521dd3(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        while (k > 0) {
            if (i >= arr1.size()) {
                j++;
            } else if (j >= arr2.size()) {
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        if (i >= arr1.size()) {
            return arr2.get(j);
        } else if (j >= arr2.size()) {
            return arr1.get(i);
        } else {
            return Math.min(arr1.get(i), arr2.get(j));
        }
    }

    
    public static int findKth_Problem_0_117bb787_34ca_4676_8b5b_d83e2e40a022(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (k > arr1.size() + arr2.size()) return -1;
        if (arr1.size() == 0) return arr2.get(k - 1);
        if (arr2.size() == 0) return arr1.get(k - 1);
        if (k == 1) return Math.min(arr1.get(0), arr2.get(0));
        int mid1 = Math.min(k / 2, arr1.size());
        int mid2 = Math.min(k / 2, arr2.size());
        if (arr1.get(mid1 - 1) < arr2.get(mid2 - 1)) {
            return findKth_Problem_0_117bb787_34ca_4676_8b5b_d83e2e40a022(new ArrayList<Integer>(arr1.subList(mid1, arr1.size())), arr2, k - mid1);
        } else {
            return findKth_Problem_0_117bb787_34ca_4676_8b5b_d83e2e40a022(arr1, new ArrayList<Integer>(arr2.subList(mid2, arr2.size())), k - mid2);
        }
    }

    
    public static int findKth_Problem_0_f3b2cc1f_5b91_455c_b31e_1d156cf68471(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get((k/2));
        int mid2 = arr2.get((k/2));
        if (mid1 < mid2) {
            return findKth_Problem_0_f3b2cc1f_5b91_455c_b31e_1d156cf68471(new ArrayList<Integer>(arr1.subList((k/2), arr1.size())), arr2, k - k/2);
        } else {
            return findKth_Problem_0_f3b2cc1f_5b91_455c_b31e_1d156cf68471(arr1, new ArrayList<Integer>(arr2.subList((k/2), arr2.size())), k - k/2);
        }
    }

    
    public static int findKth_Problem_0_5e35744a_2777_4bff_ad95_e0afd7ed0a6f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int ans = 0;
        int l = 0;
        int r = 0;
        if (arr1.size() > arr2.size()) {
            int i = arr1.size() - 1;
            while (i >= 0 && l < arr2.size()) {
                if (arr1.get(i) <= arr2.get(l)) {
                    ans++;
                    i = i - 1;
                } else {
                    l++;
                }
            }
            i = arr1.size() - 1;
            while (i < arr1.size() && r < arr2.size()) {
                if (arr1.get(i) <= arr2.get(r)) {
                    ans++;
                    i = i + 1;
                } else {
                    r++;
                }
            }
        } else {
            int i = arr2.size() - 1;
            while (i >= 0 && r < arr2.size()) {
                if (arr2.get(i) <= arr1.get(r)) {
                    ans++;
                    i = i - 1;
                } else {
                    r++;
                }
            }
            i = arr2.size() - 1;
            while (i < arr2.size() && l < arr1.size()) {
                if (arr2.get(i) <= arr1.get(l)) {
                    ans++;
                    i = i + 1;
                } else {
                    l++;
                }
            }
        }
        return ans;
    }

    
    public static int findKth_Problem_2_e8fcef0d_b2b0_49ef_b883_b975fa5067f9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int result = 0;
        int i = 0;
        int firstArr1 = arr1.get(0);
        int firstArr2 = arr2.get(0);
        while (i < k) {
            if (firstArr1 < firstArr2)
                result = firstArr1;
            else
                result = firstArr2;
            i++;
            firstArr1 = arr1.get(i);
            firstArr2 = arr2.get(i);
        }
        return result;
    }

    
    public static int findKth_Problem_1_80703a9d_a1a3_4645_9949_527b72ced8fa(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int count = 0;
        int i = 0;
        int j = 0;
        while (count < k) {
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
        return arr1.get(i);
    }

    
    public static int findKth_Problem_0_2074d18a_794c_435d_a2ec_695918015271(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int count = 0;
        int arr1Size = arr1.size();
        int arr2Size = arr2.size();
        int kthSum = 0;
        int sum = 0;
        int mid = (arr1Size + arr2Size) / 2;
        for (int i = 0; i < arr1Size && count < k; i++) {
            if (arr1.get(i) < mid) {
                sum += arr1.get(i);
                count++;
            }
        }
        for (int j = 0; j < arr2Size && count < k; j++) {
            if (arr2.get(j) < mid) {
                sum += arr2.get(j);
                count++;
            }
        }
        if (sum >= kthSum) {
            return sum;
        }
        while (kthSum < sum) {
            mid = (arr1Size + arr2Size) / 2;
            sum = 0;
            for (int i = 0; i < arr1Size && count < k; i++) {
                if (arr1.get(i) < mid) {
                    sum += arr1.get(i);
                    count++;
                }
            }
            for (int j = 0; j < arr2Size && count < k; j++) {
                if (arr2.get(j) < mid) {
                    sum += arr2.get(j);
                    count++;
                }
            }
            if (sum >= kthSum) {
                return sum;
            }
            kthSum += mid;
        }
        return sum;
    }

    
    public static int findKth_Problem_1_9b1f73ab_1904_40ca_9fc5_bf359469c1f0(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_0_f2dd8c40_9cdf_4f2b_9bac_c614e4e4ccb0(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        while (k > 0) {
            if (i == arr1.size()) {
                j++;
            } else if (j == arr2.size()) {
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        if (i == arr1.size()) {
            return arr2.get(j);
        } else if (j == arr2.size()) {
            return arr1.get(i);
        } else {
            return Math.min(arr1.get(i), arr2.get(j));
        }
    }

    
    public static int findKth_Problem_2_3a0bc393_489c_46c0_b58b_963d2c6a2f0f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() > arr2.size()) {
            return findKth_Problem_2_3a0bc393_489c_46c0_b58b_963d2c6a2f0f(arr2, arr1, k);
        }
        int i = Math.min(k / 2, arr1.size());
        int j = Math.min(k / 2, arr2.size());
        if (arr1.get(i - 1) < arr2.get(j - 1)) {
            return findKth_Problem_2_3a0bc393_489c_46c0_b58b_963d2c6a2f0f(new ArrayList<Integer>(arr1.subList(i, arr1.size())), arr2, k - i);
        } else {
            return findKth_Problem_2_3a0bc393_489c_46c0_b58b_963d2c6a2f0f(arr1, new ArrayList<Integer>(arr2.subList(j, arr2.size())), k - j);
        }
    }

    
    public static int findKth_Problem_0_3609a228_ad49_4be6_a036_cc46d9ca0417(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i = Math.min(arr1.size(), k / 2);
        int j = Math.min(arr2.size(), k / 2);
        if (arr1.get(i - 1) > arr2.get(j - 1)) {
            return findKth_Problem_0_3609a228_ad49_4be6_a036_cc46d9ca0417(arr1, new ArrayList<Integer>(arr2.subList(j, arr2.size())), k - j);
        } else {
            return findKth_Problem_0_3609a228_ad49_4be6_a036_cc46d9ca0417(new ArrayList<Integer>(arr1.subList(i, arr1.size())), arr2, k - i);
        }
    }

    
    public static int findKth_Problem_2_17f4fd35_2de8_4242_9092_3a8680f1df36(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Declare variable
        int count = 0;
        // Declare two list
        ArrayList<Integer> list1 = new ArrayList<Integer>(arr1);
        ArrayList<Integer> list2 = new ArrayList<Integer>(arr2);

        // Scan all the elements of list1 from 1st to end
        for(int i=0; i<list1.size(); i++) {
            // Check if k is equal to current element in list1
            if(list1.get(i) == k) {
                count++;
            }
        }
        // Scan all the elements of list2 from 1st to end
        for(int j=0; j<list2.size(); j++) {
            // Check if k is equal to current element in list2
            if(list2.get(j) == k) {
                count++;
            }
        }
        return count;
    }

    
    public static int findKth_Problem_1_d59bb0ed_5644_404e_83db_0fbdd0ef0916(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get( k);
        }
        if (arr2.size() == 0) {
            return arr1.get( k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_d59bb0ed_5644_404e_83db_0fbdd0ef0916(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_1_d59bb0ed_5644_404e_83db_0fbdd0ef0916(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_d59bb0ed_5644_404e_83db_0fbdd0ef0916(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_1_d59bb0ed_5644_404e_83db_0fbdd0ef0916(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_1_a2316985_b8db_42aa_91d9_3cc9d10df719(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get( k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get( k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get( Math.min(k / 2, arr1.size()) - 1);
        int mid2 = arr2.get( Math.min(k / 2, arr2.size()) - 1);
        if (mid1 < mid2) {
            return findKth_Problem_1_a2316985_b8db_42aa_91d9_3cc9d10df719(new ArrayList<Integer>(arr1.subList( Math.min(k / 2, arr1.size()), arr1.size())), arr2, k - Math.min(k / 2, arr1.size()));
        } else {
            return findKth_Problem_1_a2316985_b8db_42aa_91d9_3cc9d10df719(arr1, new ArrayList<Integer>(arr2.subList( Math.min(k / 2, arr2.size()), arr2.size())), k - Math.min(k / 2, arr2.size()));
        }
    }

    
    public static int findKth_Problem_0_834083b3_66c2_4207_927c_f259068f8522(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        int curr = 0;
        while (k > 0) {
            if (i >= arr1.size()) {
                curr = arr2.get(j);
                j++;
            } else if (j >= arr2.size()) {
                curr = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                curr = arr1.get(i);
                i++;
            } else {
                curr = arr2.get(j);
                j++;
            }
            k--;
        }
        return curr;
    }

    
    public static int findKth_Problem_1_2431c364_9afd_4967_bb24_eec16df905b9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write - Your - Code
        int i = 0;
        int j = 0;
        int kth = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                kth = arr1.get(i);
                i++;
            } else {
                kth = arr2.get(j);
                j++;
            }
            if (k == 1) {
                return kth;
            }
            k--;
        }
        while (i < arr1.size()) {
            kth = arr1.get(i);
            i++;
            if (k == 1) {
                return kth;
            }
            k--;
        }
        while (j < arr2.size()) {
            kth = arr2.get(j);
            j++;
            if (k == 1) {
                return kth;
            }
            k--;
        }
        return kth;
    }

    
    public static int findKth_Problem_1_4dd7d11f_8a60_4d2e_9cf3_22d1d52bc8ff(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int result = 0;
        int comp = 0;
        int l1 = arr1.size();
        int l2 = arr2.size();
        if (k < arr1.get(0))
            return arr1.get(0);
        if (k < arr2.get(0))
            return arr2.get(0);
        if (arr1.get(0) == arr2.get(0)) {
            while (comp < l1) {
                if (arr1.get(comp) <= k)
                    result |= (1L << (arr1.get(comp) + 1));
                comp++;
            }
            while (comp < l2) {
                if (arr2.get(comp) <= k)
                    result |= (1L << (arr2.get(comp) + 1));
                comp++;
            }
        }
        if (comp == l1) {
            while (comp < l2) {
                if (arr2.get(comp) <= k)
                    result |= (1L << (arr2.get(comp) + 1));
                comp++;
            }
        }
        if (comp == l2) {
            while (comp < l1) {
                if (arr1.get(comp) <= k)
                    result |= (1L << (arr1.get(comp) + 1));
                comp++;
            }
        }
        return result;
    }

    
    public static int findKth_Problem_1_888e2b57_5c96_47de_b9bb_0c8391c1117a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_2_9afd64b9_7534_4516_b475_bf1b758082f2(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                ArrayList<Integer> newArr = new ArrayList<Integer>();
                for (int i = mid2 + 1; i < arr2.size(); i++) {
                    newArr.add(arr2.get(i));
                }
                return findKth_Problem_2_9afd64b9_7534_4516_b475_bf1b758082f2(arr1, newArr, k - mid2 - 1);
            } else {
                ArrayList<Integer> newArr = new ArrayList<Integer>();
                for (int i = mid1 + 1; i < arr1.size(); i++) {
                    newArr.add(arr1.get(i));
                }
                return findKth_Problem_2_9afd64b9_7534_4516_b475_bf1b758082f2(newArr, arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                ArrayList<Integer> newArr = new ArrayList<Integer>();
                for (int i = 0; i < mid2; i++) {
                    newArr.add(arr2.get(i));
                }
                return findKth_Problem_2_9afd64b9_7534_4516_b475_bf1b758082f2(arr1, newArr, k);
            } else {
                ArrayList<Integer> newArr = new ArrayList<Integer>();
                for (int i = 0; i < mid1; i++) {
                    newArr.add(arr1.get(i));
                }
                return findKth_Problem_2_9afd64b9_7534_4516_b475_bf1b758082f2(newArr, arr2, k);
            }
        }
    }

    
    public static int findKth_Problem_2_ef3fa9f4_5f02_4307_9179_5887c4b3c796(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        int n = arr1.size();
        int m = arr2.size();
        int i = 0;
        int j = 0;
        while (i < n && j < m && k > 0) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        if (i == n) {
            return arr2.get( (k - 1));
        } else if (j == m) {
            return arr1.get( (k - 1));
        } else {
            return Math.min(arr1.get(i), arr2.get(j));
        }
    }

    
    public static int findKth_Problem_2_c2e62127_b750_4196_ad1b_0cd165261ed0(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() >= k / 2 ? arr1.get(k / 2 - 1) : Integer.MAX_VALUE;
        int mid2 = arr2.size() >= k / 2 ? arr2.get(k / 2 - 1) : Integer.MAX_VALUE;
        if (mid1 < mid2) {
            return findKth_Problem_2_c2e62127_b750_4196_ad1b_0cd165261ed0(new ArrayList<Integer>(arr1.subList(k / 2, arr1.size())), arr2, k - k / 2);
        } else {
            return findKth_Problem_2_c2e62127_b750_4196_ad1b_0cd165261ed0(arr1, new ArrayList<Integer>(arr2.subList(k / 2, arr2.size())), k - k / 2);
        }
    }

    
    public static int findKth_Problem_1_fa14d10b_6cec_4ff0_8ba6_575793e8119f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) return arr2.get(k);
        if (arr2.size() == 0) return arr1.get(k);
        if (arr1.size() + arr2.size() == k) return Math.max(arr1.get(arr1.size() - 1), arr2.get(arr2.size() - 1));
        if (arr1.size() + arr2.size() == k + 1) return Math.min(arr1.get(arr1.size() - 1), arr2.get(arr2.size() - 1));
        if (k == 0) return Math.min(arr1.get(0), arr2.get(0));
        if (k == 1) return Math.max(arr1.get(0), arr2.get(0));
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_fa14d10b_6cec_4ff0_8ba6_575793e8119f(arr1, new ArrayList<Integer>(arr2.subList(mid2, arr2.size())), k - mid2);
            } else {
                return findKth_Problem_1_fa14d10b_6cec_4ff0_8ba6_575793e8119f(new ArrayList<Integer>(arr1.subList(mid1, arr1.size())), arr2, k - mid1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_fa14d10b_6cec_4ff0_8ba6_575793e8119f(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_1_fa14d10b_6cec_4ff0_8ba6_575793e8119f(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_1_bc2a39df_ae01_40a3_86e6_b676dde502d2(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() > arr2.size()) {
            return findKth_Problem_1_bc2a39df_ae01_40a3_86e6_b676dde502d2(arr2, arr1, k);
        }
        int i = Math.min(k / 2, arr1.size());
        int j = k - i;
        if (arr1.get(i - 1) < arr2.get(j - 1)) {
            ArrayList<Integer> newArr1 = new ArrayList<Integer>(arr1.subList(i, arr1.size()));
            return findKth_Problem_1_bc2a39df_ae01_40a3_86e6_b676dde502d2(newArr1, arr2, k - i);
        } else if (arr1.get(i - 1) > arr2.get(j - 1)) {
            ArrayList<Integer> newArr2 = new ArrayList<Integer>(arr2.subList(j, arr2.size()));
            return findKth_Problem_1_bc2a39df_ae01_40a3_86e6_b676dde502d2(arr1, newArr2, k - j);
        } else {
            return arr1.get(i - 1);
        }
    }

    
    public static int findKth_Problem_0_e261bde5_860e_482a_898d_749fa592ebc0(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() > arr2.size()) {
            return findKth_Problem_0_e261bde5_860e_482a_898d_749fa592ebc0(arr2, arr1, k);
        }
        int mid = arr1.size() / 2;
        if (arr1.get(mid) > arr2.get(k - mid)) {
            return findKth_Problem_0_e261bde5_860e_482a_898d_749fa592ebc0(new ArrayList<Integer>(arr1.subList(0, mid)), arr2, k);
        } else {
            return findKth_Problem_0_e261bde5_860e_482a_898d_749fa592ebc0(arr1, new ArrayList<Integer>(arr2.subList(0, k - mid)), k - mid);
        }
    }

    
    public static int findKth_Problem_0_7c5196fa_1dcc_4206_bd0f_c594c7cae45d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_7c5196fa_1dcc_4206_bd0f_c594c7cae45d(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_0_7c5196fa_1dcc_4206_bd0f_c594c7cae45d(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_7c5196fa_1dcc_4206_bd0f_c594c7cae45d(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_0_7c5196fa_1dcc_4206_bd0f_c594c7cae45d(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_0_76efe490_576a_421c_b5d4_27576741d7ea(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        int i = 0;
        int j = 0;
        int count = 0;
        int ans = 0;
        while (i < n && j < m) {
            if (arr1.get(i) < arr2.get(j)) {
                ans = arr1.get(i);
                i++;
            } else {
                ans = arr2.get(j);
                j++;
            }
            count++;
            if (count == k) {
                return ans;
            }
        }
        while (i < n) {
            ans = arr1.get(i);
            i++;
            count++;
            if (count == k) {
                return ans;
            }
        }
        while (j < m) {
            ans = arr2.get(j);
            j++;
            count++;
            if (count == k) {
                return ans;
            }
        }
        return ans;
    }

    
    public static int findKth_Problem_1_3b7c4e23_ccd3_4067_8e4b_6ca9fdad9f1e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) return arr2.get(k);
        if (arr2.size() == 0) return arr1.get(k);
        if (k == 0) return Math.min(arr1.get(0), arr2.get(0));
        if (arr1.size() == 1 && arr2.size() == 1) return Math.max(arr1.get(0), arr2.get(0));
        if (arr1.size() == 1) {
            if (arr1.get(0) < arr2.get(k/2)) return arr2.get(k-1);
            else return findKth_Problem_1_3b7c4e23_ccd3_4067_8e4b_6ca9fdad9f1e(new ArrayList<Integer>(), arr2, k-1);
        }
        if (arr2.size() == 1) {
            if (arr2.get(0) < arr1.get(k/2)) return arr1.get(k-1);
            else return findKth_Problem_1_3b7c4e23_ccd3_4067_8e4b_6ca9fdad9f1e(arr1, new ArrayList<Integer>(), k-1);
        }
        if (arr1.get(k/2) < arr2.get(k/2)) {
            return findKth_Problem_1_3b7c4e23_ccd3_4067_8e4b_6ca9fdad9f1e(new ArrayList<Integer>(arr1.subList(k/2, arr1.size())), arr2, k-k/2);
        } else {
            return findKth_Problem_1_3b7c4e23_ccd3_4067_8e4b_6ca9fdad9f1e(arr1, new ArrayList<Integer>(arr2.subList(k/2, arr2.size())), k-k/2);
        }
    }

    
    public static int findKth_Problem_1_a696f654_0db6_4895_9f82_d29afde5571a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int kth = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                kth = arr1.get(i);
                i++;
            } else {
                kth = arr2.get(j);
                j++;
            }
            k--;
            if (k == 0) {
                break;
            }
        }
        while (i < arr1.size()) {
            kth = arr1.get(i);
            i++;
            k--;
            if (k == 0) {
                break;
            }
        }
        while (j < arr2.size()) {
            kth = arr2.get(j);
            j++;
            k--;
            if (k == 0) {
                break;
            }
        }
        return kth;
    }

    
    public static int findKth_Problem_0_7162278d_dc1a_486a_9473_8b38bb4ca021(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (k == 0) return -1;
        if (arr1.size() == 0) return arr2.get(k-1);
        if (arr2.size() == 0) return arr1.get(k-1);
        if (k == 1) return Math.min(arr1.get(0), arr2.get(0));
        int a = arr1.get(0);
        int b = arr2.get(0);
        if (a < b) {
            arr1.remove(0);
            return findKth_Problem_0_7162278d_dc1a_486a_9473_8b38bb4ca021(arr1, arr2, k-1);
        } else {
            arr2.remove(0);
            return findKth_Problem_0_7162278d_dc1a_486a_9473_8b38bb4ca021(arr1, arr2, k-1);
        }
    }

    
    public static int findKth_Problem_1_9c9b3743_b5da_4b8a_b503_768caec9a8c0(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() >= k / 2 ? arr1.get(k / 2 - 1) : Integer.MAX_VALUE;
        int mid2 = arr2.size() >= k / 2 ? arr2.get(k / 2 - 1) : Integer.MAX_VALUE;
        if (mid1 < mid2) {
            return findKth_Problem_1_9c9b3743_b5da_4b8a_b503_768caec9a8c0(new ArrayList<Integer>(arr1.subList(k / 2, arr1.size())), arr2, k - k / 2);
        } else {
            return findKth_Problem_1_9c9b3743_b5da_4b8a_b503_768caec9a8c0(arr1, new ArrayList<Integer>(arr2.subList(k / 2, arr2.size())), k - k / 2);
        }
    }

    
    public static int findKth_Problem_2_6590173f_2d4f_4895_93f6_c5dfb72e655a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = Math.min(k/2, arr1.size() - 1);
        int mid2 = Math.min(k/2, arr2.size() - 1);
        if (arr1.get(mid1) < arr2.get(mid2)) {
            return findKth_Problem_2_6590173f_2d4f_4895_93f6_c5dfb72e655a(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
        }
        else {
            return findKth_Problem_2_6590173f_2d4f_4895_93f6_c5dfb72e655a(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
        }
    }

    
    public static int findKth_Problem_0_57fe2fe0_6059_4029_b406_041685e70fda(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (n == 0)
            return arr2.get( k - 1);
        if (m == 0)
            return arr1.get( k - 1);
        if (k == 1)
            return Math.min(arr1.get(0), arr2.get(0));
        int i = Math.min(n, k / 2);
        int j = Math.min(m, k / 2);
        if (arr1.get( i - 1) > arr2.get( j - 1)) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for (int x = j; x < m; x++)
                temp.add(arr2.get( x));
            return findKth_Problem_0_57fe2fe0_6059_4029_b406_041685e70fda(arr1, temp, k - j);
        } else {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for (int x = i; x < n; x++)
                temp.add(arr1.get( x));
            return findKth_Problem_0_57fe2fe0_6059_4029_b406_041685e70fda(temp, arr2, k - i);
        }
    }

    
    public static int findKth_Problem_1_3be86e4d_1f58_4c1e_a07f_26c5cf7ad399(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int result = 0;
        int l1 = arr1.size();
        int l2 = arr2.size();
        // write your code here
        if(l1>l2){
            for(int i=0;i<l1;i++){
                if((arr1.get(i))<(arr2.get(i))){
                    if(i==0){
                        result = arr1.get(i);
                        break;
                    }
                    else{
                        result = arr2.get(i-1);
                        break;
                    }
                }
                else{
                    if(i==l1-1){
                        result = arr1.get(i);
                        break;
                    }
                    else{
                        result = arr2.get(l1-1);
                        break;
                    }
                }
            }
        }
        else if(l1==l2){
            for(int i=0;i<l1;i++){
                if((arr1.get(i))==(arr2.get(i))){
                    result = arr1.get(i);
                    if(i==0){
                        result = arr2.get(i);
                        break;
                    }
                    else{
                        result = arr1.get(l1-1);
                        break;
                    }
                }
                else{
                    if(i==l1-1){
                        result = arr2.get(i);
                        break;
                    }
                    else{
                        result = arr1.get(l1-1);
                        break;
                    }
                }
            }
        }
        else{
            for(int i=0;i<l1;i++){
                if((arr1.get(i))<(arr2.get(i))){
                    if(i==0){
                        result = arr2.get(i);
                        break;
                    }
                    else{
                        result = arr1.get(i-1);
                        break;
                    }
                }
                else{
                    if(i==l1-1){
                        result = arr1.get(i);
                        break;
                    }
                    else{
                        result = arr2.get(l1-1);
                        break;
                    }
                }
            }
            for(int i=0;i<l2;i++){
                if((arr2.get(i))<(arr1.get(i))){
                    if(i==0){
                        result = arr1.get(i);
                        break;
                    }
                    else{
                        result = arr2.get(l1-1);
                        break;
                    }
                }
                else{
                    if(i==l1-1){
                        result = arr2.get(i);
                        break;
                    }
                    else{
                        result = arr1.get(l1-1);
                        break;
                    }
                }
            }
        }
        return result;
    }

    
    public static int findKth_Problem_0_8a1b02c0_9027_405b_93e8_005426a61a43(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
                count++;
            } else {
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
                count++;
            }
        }
        while (i < arr1.size()) {
            if (count == k) {
                return arr1.get(i);
            }
            i++;
            count++;
        }
        while (j < arr2.size()) {
            if (count == k) {
                return arr2.get(j);
            }
            j++;
            count++;
        }
        return -1;
    }

    
    public static int findKth_Problem_0_05f60838_f05a_4f1b_9307_6c4774b8ca3d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        return 0;
    }

    
    public static int findKth_Problem_2_f985e9b9_1316_40fd_b51b_d245bff8caf8(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_f985e9b9_1316_40fd_b51b_d245bff8caf8(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_2_f985e9b9_1316_40fd_b51b_d245bff8caf8(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_f985e9b9_1316_40fd_b51b_d245bff8caf8(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_2_f985e9b9_1316_40fd_b51b_d245bff8caf8(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_2_f53da2fd_553f_435c_a723_2b12f193853b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int size1 = arr1.size();
        int size2 = arr2.size();
        int result = 0;
        while (i < size1 && j < size2) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
                if (k == 1) {
                    result = arr1.get(i);
                    break;
                } else {
                    k--;
                }
            }
        }
        return result;
    }

    
    public static int findKth_Problem_2_ef482285_1375_4b46_aca3_0c6ee414bb7d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int m = arr1.size();
        int n = arr2.size();
        
        int l = arr1.get(0),r = arr2.get(0);
        
        int mid = l + r + 1;
        
        int lDiff = l - mid;
        int rDiff = r - mid;
        
        if(lDiff <= rDiff) {
            while(k >= 0 && r > mid && lDiff <= rDiff) {
                l++;
                lDiff++;
                k--;
            }
        } else {
            while(k >= 0 && r > mid && rDiff <= lDiff) {
                r--;
                rDiff--;
                k--;
            }
        }
        
        return mid;
    }

    
    public static int findKth_Problem_0_390ef899_8fab_4147_9157_e64110efffe9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_1_b7daedab_c816_4a5b_87e3_a1940d6e45f5(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Your code goes here
        int result = 0;
        int count1 = 0;
        int count2 = 0;
        if (k > arr1.size()) {
            k--;
        }
        for (int i = 0; i < arr1.size() - k; i++) {
            if (arr1.get(i) < arr2.get(i)) {
                count1++;
                if (count1 == k) {
                    result = arr1.get(i);
                }
            } else {
                count2++;
                if (count2 == k) {
                    result = arr2.get(i);
                }
            }
        }
        return result;
    }

    
    public static int findKth_Problem_2_20291938_569d_487a_8f67_34fd8472c308(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int x = Math.min(arr1.size(), k / 2);
        int y = Math.min(arr2.size(), k / 2);
        if (arr1.get(x - 1) < arr2.get(y - 1)) {
            return findKth_Problem_2_20291938_569d_487a_8f67_34fd8472c308(new ArrayList<Integer>(arr1.subList(x, arr1.size())), arr2, k - x);
        } else {
            return findKth_Problem_2_20291938_569d_487a_8f67_34fd8472c308(arr1, new ArrayList<Integer>(arr2.subList(y, arr2.size())), k - y);
        }
    }

    
    public static int findKth_Problem_2_04189ace_0e70_4941_b054_8b6a9f260394(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        int n = arr1.size();
        int m = arr2.size();
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < n && j < m) {
            if (arr1.get( i) < arr2.get( j)) {
                count++;
                if (count == k) {
                    return arr1.get( i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get( j);
                }
                j++;
            }
        }
        while (i < n) {
            count++;
            if (count == k) {
                return arr1.get( i);
            }
            i++;
        }
        while (j < m) {
            count++;
            if (count == k) {
                return arr2.get( j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_1_517179c6_5369_46a5_a178_920546d18446(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 1 && arr2.size() == 1) {
            return Math.max(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_517179c6_5369_46a5_a178_920546d18446(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_1_517179c6_5369_46a5_a178_920546d18446(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_1_517179c6_5369_46a5_a178_920546d18446(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_1_517179c6_5369_46a5_a178_920546d18446(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_2_ad3d5de1_1e45_476f_bc87_bfc5aa822f3e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int firstVal = arr1.get(0), secondVal = arr2.get(0), thirdVal = 0, fourthVal = 0;
        int currentVal = 0;
        while (k >= 1) {
            currentVal = firstVal + secondVal;
            if (currentVal > arr1.get(arr1.size() - 1)) {
                currentVal = arr1.get(arr1.size() - 1);
            }
            firstVal = currentVal;
            currentVal = thirdVal + fourthVal;
            if (currentVal > arr2.get(arr2.size() - 1)) {
                currentVal = arr2.get(arr2.size() - 1);
            }
            secondVal = currentVal;
            thirdVal = currentVal - firstVal;
            if (thirdVal > arr1.get(arr1.size() - 1)) {
                thirdVal = arr1.get(arr1.size() - 1);
            }
            fourthVal = currentVal - secondVal;
            if (fourthVal > arr2.get(arr2.size() - 1)) {
                fourthVal = arr2.get(arr2.size() - 1);
            }
            k--;
        }
        return currentVal;
    }

    
    public static int findKth_Problem_1_e0843e84_2bad_4635_9cd4_16c1d8684802(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (k > n + m) {
            return -1;
        }
        if (k == n + m) {
            return Math.max(arr1.get(n - 1), arr2.get(m - 1));
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i =  Math.min(k / 2, n);
        int j =  (k - i);
        if (arr1.get(i - 1) < arr2.get(j - 1)) {
            return findKth_Problem_1_e0843e84_2bad_4635_9cd4_16c1d8684802(new ArrayList<Integer>(arr1.subList(i, n)), arr2, k - i);
        } else if (arr1.get(i - 1) > arr2.get(j - 1)) {
            return findKth_Problem_1_e0843e84_2bad_4635_9cd4_16c1d8684802(arr1, new ArrayList<Integer>(arr2.subList(j, m)), k - j);
        } else {
            return arr1.get(i - 1);
        }
    }

    
    public static int findKth_Problem_0_fce8f59d_3b62_4f96_bf41_ff432114cc04(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() > arr2.size()) {
            return findKth_Problem_0_fce8f59d_3b62_4f96_bf41_ff432114cc04(arr2, arr1, k);
        }
        int mid1 = Math.min(k / 2, arr1.size());
        int mid2 = k - mid1;
        if (arr1.get(mid1 - 1) < arr2.get(mid2 - 1)) {
            return findKth_Problem_0_fce8f59d_3b62_4f96_bf41_ff432114cc04(new ArrayList<Integer>(arr1.subList(mid1, arr1.size())), arr2, k - mid1);
        } else if (arr1.get(mid1 - 1) > arr2.get(mid2 - 1)) {
            return findKth_Problem_0_fce8f59d_3b62_4f96_bf41_ff432114cc04(arr1, new ArrayList<Integer>(arr2.subList(mid2, arr2.size())), k - mid2);
        } else {
            return arr1.get(mid1 - 1);
        }
    }

    
    public static int findKth_Problem_1_9a4a19c0_4bea_4079_904d_4aac50905264(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        int res = 0;
        while (k > 0) {
            if (i < arr1.size() && j < arr2.size()) {
                if (arr1.get(i) < arr2.get(j)) {
                    res = arr1.get(i);
                    i++;
                } else {
                    res = arr2.get(j);
                    j++;
                }
            } else if (i < arr1.size()) {
                res = arr1.get(i);
                i++;
            } else {
                res = arr2.get(j);
                j++;
            }
            k--;
        }
        return res;
    }

    
    public static int findKth_Problem_2_ac131d76_198d_468c_8557_7dfe2a27f293(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int ans = 0;
        int min = arr1.get(0), max = arr1.get(arr1.size()-1);
        int size1 = arr1.size();
        int size2 = arr2.size();
        while (ans < k) {
            if (min == max) {
                ans += 1;
                min += 1;
            }
            else {
                int mid = (min + max)/2;
                if (k - mid == 0)
                    ans = mid - 1;
                else if (k - mid < 0)
                    ans = mid + 1;
                else
                    ans = findKth_Problem_2_ac131d76_198d_468c_8557_7dfe2a27f293(arr1, arr2, k - mid);
            }
            min = arr1.get(size1 - 1);
            max = arr1.get(0);
        }
        return ans;
    }

    
    public static int findKth_Problem_2_65298a7d_fb35_4bf8_8728_dcc8fa602857(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
            count++;
        }
        while (i < arr1.size()) {
            if (count == k) {
                return arr1.get(i);
            }
            i++;
            count++;
        }
        while (j < arr2.size()) {
            if (count == k) {
                return arr2.get(j);
            }
            j++;
            count++;
        }
        return -1;
    }

    
    public static int findKth_Problem_2_0b90cf25_3e95_41c0_bd09_14f30d38aca7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // write your logic here
        if (arr1.size() == 0 || arr2.size() == 0 || k <= 0) {
            return -1;
        }

        int temp = 0;
        int max = arr1.get(0);
        int temp2 = 0;
        int max2 = arr2.get(0);

        for (int i = 1; i < arr1.size(); i++) {
            max = Math.max(max, arr1.get(i));
        }
        for (int i = 1; i < arr2.size(); i++) {
            max2 = Math.max(max2, arr2.get(i));
        }
        int x = max;
        int y = max2;

        int mid = (x + y) / 2;

        for (int i = 0; i <= k; i++) {
            int count = 0;
            int mid2 = (x + y) / 2;

            while (x != mid2) {
                x = mid2;
                mid2 = ((x + y) / 2);
                count += 1;
            }
            x += count;
        }
        int kth = Math.max((x + y) / 2, max);
        // System.out.println(kth);
        System.out.println("Max Element from Array 1: " + x);
        System.out.println("Max Element from Array 2: " + y);
        System.out.println("Index of kth Element: " + k);

        return kth;
    }

    
    public static int findKth_Problem_0_de46f19a_e569_4307_9c14_c8aa48d10d68(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (k >= arr2.size()) {
            return arr1.get(arr2.size() - 1);
        }
        if (k <= 0) {
            return arr1.get(0);
        }
        int low = 0;
        int high = arr2.size() - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            if (k < arr2.get(mid)) {
                low = mid + 1;
            } else if (k > arr2.get(mid)) {
                high = mid - 1;
            } else {
                return arr1.get(mid);
            }
        }
        return arr1.get(low);
    }

    
    public static int findKth_Problem_2_e97b2b6b_e7f7_494e_82a1_b7f6178f2de9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int result = -1;
        if(arr1==null || arr2==null || k==0)
            return result;
        if(k<arr1.size())
            k = arr1.size();
        else if(k>arr2.size())
            k = arr2.size();

        for(int i=0; i<arr1.size(); i++)
        {
            for(int j=i; j<arr1.size(); j++)
            {
                int temp1 = arr1.get(i);
                int temp2 = arr2.get(j);
                if(temp1<temp2)
                {
                    int temp = temp1;
                    temp1 = temp2;
                    temp2 = temp;
                }
                int difference = arr1.get(i)+arr2.get(j)-k;
                if(difference<0)
                {
                    difference = difference*-1;
                }
                if(result==-1)
                {
                    result = temp1;
                }
                else if(temp1>result)
                {
                    result = temp1;
                }
                else if(temp2>result)
                {
                    result = temp2;
                }
            }
        }
        return result;
    }

    
    public static int findKth_Problem_0_d59bb0ed_5644_404e_83db_0fbdd0ef0916(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get( k);
        }
        if (arr2.size() == 0) {
            return arr1.get( k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_d59bb0ed_5644_404e_83db_0fbdd0ef0916(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_0_d59bb0ed_5644_404e_83db_0fbdd0ef0916(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_d59bb0ed_5644_404e_83db_0fbdd0ef0916(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_0_d59bb0ed_5644_404e_83db_0fbdd0ef0916(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_0_a7ef273f_8f7d_455b_b2f6_11cb9ef4a8f3(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(Math.min(k / 2, arr1.size()) - 1);
        int mid2 = arr2.get(Math.min(k / 2, arr2.size()) - 1);
        if (mid1 < mid2) {
            return findKth_Problem_0_a7ef273f_8f7d_455b_b2f6_11cb9ef4a8f3(new ArrayList<Integer>(arr1.subList(Math.min(k / 2, arr1.size()), arr1.size())), arr2, k - Math.min(k / 2, arr1.size()));
        } else {
            return findKth_Problem_0_a7ef273f_8f7d_455b_b2f6_11cb9ef4a8f3(arr1, new ArrayList<Integer>(arr2.subList(Math.min(k / 2, arr2.size()), arr2.size())), k - Math.min(k / 2, arr2.size()));
        }
    }

    
    public static int findKth_Problem_0_aa7981d8_ef18_4579_aef8_a2e11a60cc38(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (k > n + m) {
            return -1;
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i = Math.min(k / 2, n);
        int j = Math.min(k / 2, m);
        if (arr1.get( i - 1) > arr2.get( j - 1)) {
            return findKth_Problem_0_aa7981d8_ef18_4579_aef8_a2e11a60cc38(arr1, new ArrayList<Integer>(arr2.subList( j,  m)), k - j);
        } else {
            return findKth_Problem_0_aa7981d8_ef18_4579_aef8_a2e11a60cc38(new ArrayList<Integer>(arr1.subList( i,  n)), arr2, k - i);
        }
    }

    
    public static int findKth_Problem_0_7a471dc1_85cc_45d4_8ad7_b552f9c7ffb6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (k == 1) {
            if (arr1.get(0) < arr2.get(0)) {
                return Math.min(arr1.get(1), arr2.get(0));
            }
            else {
                return Math.min(arr1.get(0), arr2.get(1));
            }
        }
        int k1 = Math.min(k/2, arr1.size()-1);
        int k2 = Math.min(k/2, arr2.size()-1);
        if (arr1.get(k1) < arr2.get(k2)) {
            return findKth_Problem_0_7a471dc1_85cc_45d4_8ad7_b552f9c7ffb6(new ArrayList<Integer>(arr1.subList(k1, arr1.size())), arr2, k-k1);
        }
        else {
            return findKth_Problem_0_7a471dc1_85cc_45d4_8ad7_b552f9c7ffb6(arr1, new ArrayList<Integer>(arr2.subList(k2, arr2.size())), k-k2);
        }
    }

    
    public static int findKth_Problem_2_ef43bfc7_db2f_486e_afbc_f2e0333941ad(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() >= k / 2 ? arr1.get(k / 2 - 1) : Integer.MAX_VALUE;
        int mid2 = arr2.size() >= k / 2 ? arr2.get(k / 2 - 1) : Integer.MAX_VALUE;
        if (mid1 < mid2) {
            return findKth_Problem_2_ef43bfc7_db2f_486e_afbc_f2e0333941ad(new ArrayList<Integer>(arr1.subList(k / 2, arr1.size())), arr2, k - k / 2);
        } else {
            return findKth_Problem_2_ef43bfc7_db2f_486e_afbc_f2e0333941ad(arr1, new ArrayList<Integer>(arr2.subList(k / 2, arr2.size())), k - k / 2);
        }
    }

    
    public static int findKth_Problem_2_79f472a4_4423_4680_9149_613f679d454b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                if (count == k - 1) {
                    return arr1.get(i);
                }
                i++;
                count++;
            } else {
                if (count == k - 1) {
                    return arr2.get(j);
                }
                j++;
                count++;
            }
        }
        while (i < arr1.size()) {
            if (count == k - 1) {
                return arr1.get(i);
            }
            i++;
            count++;
        }
        while (j < arr2.size()) {
            if (count == k - 1) {
                return arr2.get(j);
            }
            j++;
            count++;
        }
        return -1;
    }

    
    public static int findKth_Problem_0_2c714dda_fbac_4579_a457_8d1d0f4c9d1e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 1 && arr2.size() == 1) {
            return Math.max(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(arr1.size() / 2);
        int mid2 = arr2.get(arr2.size() / 2);
        if (mid1 < mid2) {
            if (k <= arr1.size() / 2 + arr2.size() / 2) {
                return findKth_Problem_0_2c714dda_fbac_4579_a457_8d1d0f4c9d1e(new ArrayList<Integer>(arr1.subList(0, arr1.size() / 2)), arr2, k);
            } else {
                return findKth_Problem_0_2c714dda_fbac_4579_a457_8d1d0f4c9d1e(arr1, new ArrayList<Integer>(arr2.subList(arr2.size() / 2, arr2.size())), k - arr2.size() / 2);
            }
        } else {
            if (k <= arr1.size() / 2 + arr2.size() / 2) {
                return findKth_Problem_0_2c714dda_fbac_4579_a457_8d1d0f4c9d1e(arr1, new ArrayList<Integer>(arr2.subList(0, arr2.size() / 2)), k);
            } else {
                return findKth_Problem_0_2c714dda_fbac_4579_a457_8d1d0f4c9d1e(new ArrayList<Integer>(arr1.subList(arr1.size() / 2, arr1.size())), arr2, k - arr1.size() / 2);
            }
        }
    }

    
    public static int findKth_Problem_2_05f60838_f05a_4f1b_9307_6c4774b8ca3d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        return 0;
    }

    
    public static int findKth_Problem_0_0b90cf25_3e95_41c0_bd09_14f30d38aca7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // write your logic here
        if (arr1.size() == 0 || arr2.size() == 0 || k <= 0) {
            return -1;
        }

        int temp = 0;
        int max = arr1.get(0);
        int temp2 = 0;
        int max2 = arr2.get(0);

        for (int i = 1; i < arr1.size(); i++) {
            max = Math.max(max, arr1.get(i));
        }
        for (int i = 1; i < arr2.size(); i++) {
            max2 = Math.max(max2, arr2.get(i));
        }
        int x = max;
        int y = max2;

        int mid = (x + y) / 2;

        for (int i = 0; i <= k; i++) {
            int count = 0;
            int mid2 = (x + y) / 2;

            while (x != mid2) {
                x = mid2;
                mid2 = ((x + y) / 2);
                count += 1;
            }
            x += count;
        }
        int kth = Math.max((x + y) / 2, max);
        // System.out.println(kth);
        System.out.println("Max Element from Array 1: " + x);
        System.out.println("Max Element from Array 2: " + y);
        System.out.println("Index of kth Element: " + k);

        return kth;
    }

    
    public static int findKth_Problem_0_6f313497_4df7_4ff0_ad55_bf394a57c16a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int middleElement1 = arr1.get(arr1.size()/2);
        int middleElement2 = arr2.get(arr2.size()/2);
        if (k == 0) return 0;
        if (k == 1) return middleElement1;
        if (k > 1 && k <= arr1.size()) 
            return middleElement1 + (k-1) * findKth_Problem_0_6f313497_4df7_4ff0_ad55_bf394a57c16a(arr1, arr2, k/2);
        else 
            return findKth_Problem_0_6f313497_4df7_4ff0_ad55_bf394a57c16a(arr1, arr2, k/2);
    }

    
    public static int findKth_Problem_0_1c443cd2_9aa6_4564_a069_df2c6d26bc52(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (k > n + m) {
            return -1;
        }
        if (n == 0) {
            return arr2.get( k - 1);
        }
        if (m == 0) {
            return arr1.get( k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i = Math.min(n,  k / 2);
        int j = Math.min(m,  k / 2);
        if (arr1.get(i - 1) > arr2.get(j - 1)) {
            return findKth_Problem_0_1c443cd2_9aa6_4564_a069_df2c6d26bc52(arr1, new ArrayList<Integer>(arr2.subList(j, m)), k - j);
        } else {
            return findKth_Problem_0_1c443cd2_9aa6_4564_a069_df2c6d26bc52(new ArrayList<Integer>(arr1.subList(i, n)), arr2, k - i);
        }
    }

    
    public static int findKth_Problem_0_ff200f58_58b3_4c43_91d6_e543ee42acbc(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 1 && arr2.size() == 1) {
            return Math.max(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_ff200f58_58b3_4c43_91d6_e543ee42acbc(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_0_ff200f58_58b3_4c43_91d6_e543ee42acbc(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_0_ff200f58_58b3_4c43_91d6_e543ee42acbc(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_0_ff200f58_58b3_4c43_91d6_e543ee42acbc(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_0_4577ad26_3076_4712_8ba4_153048038039(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() + arr2.size() < k) {
            return -1;
        }
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() >= k / 2 ? arr1.get(k / 2 - 1) : Integer.MAX_VALUE;
        int mid2 = arr2.size() >= k / 2 ? arr2.get(k / 2 - 1) : Integer.MAX_VALUE;
        if (mid1 < mid2) {
            return findKth_Problem_0_4577ad26_3076_4712_8ba4_153048038039(new ArrayList<Integer>(arr1.subList(k / 2, arr1.size())), arr2, k - k / 2);
        } else {
            return findKth_Problem_0_4577ad26_3076_4712_8ba4_153048038039(arr1, new ArrayList<Integer>(arr2.subList(k / 2, arr2.size())), k - k / 2);
        }
    }

    
    public static int findKth_Problem_0_7c342204_6f1d_4a16_bd08_2b15bb812cb0(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() >= k / 2 ? arr1.get(k / 2 - 1) : Integer.MAX_VALUE;
        int mid2 = arr2.size() >= k / 2 ? arr2.get(k / 2 - 1) : Integer.MAX_VALUE;
        if (mid1 < mid2) {
            return findKth_Problem_0_7c342204_6f1d_4a16_bd08_2b15bb812cb0(new ArrayList<Integer>(arr1.subList(k / 2, arr1.size())), arr2, k - k / 2);
        } else {
            return findKth_Problem_0_7c342204_6f1d_4a16_bd08_2b15bb812cb0(arr1, new ArrayList<Integer>(arr2.subList(k / 2, arr2.size())), k - k / 2);
        }
    }

    
    public static int findKth_Problem_2_4a09308c_8f41_4f3d_a0c2_a9626a8b2e21(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int low = arr1.get(0); // initialize low to first element of first array
        int high = arr2.get(arr2.size()-1); // initialize high to last element of second array
        int mid = (low+high)/2;
        int count = 0;
        while(low<=high) {
            count++;
            if(count==k) {
                return mid;
            }
            if(count>k) {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
            mid = (low+high)/2;
        }
        return -1;
    }

}
